import com.google.common.base.Joiner;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.slf4j.Logger;

public class ejq extends ekf {
   private static final Logger s = LogUtils.getLogger();
   public long a;
   public String b;
   public String c;
   public String d;
   public ejq.b e;
   public String f;
   public String g;
   public List<ejm> h;
   public Map<Integer, ejx> i;
   public boolean j;
   public boolean k;
   public int l;
   public ejq.c m;
   public int n;
   public String o;
   public int p;
   public String q;
   public ejt r = new ejt();

   public String a() {
      return this.d;
   }

   public String b() {
      return this.c;
   }

   public String c() {
      return this.o;
   }

   public void a(String $$0) {
      this.c = $$0;
   }

   public void b(String $$0) {
      this.d = $$0;
   }

   public void a(eju $$0) {
      List<String> $$1 = Lists.newArrayList();
      int $$2 = 0;

      for (String $$3 : $$0.b) {
         if (!$$3.equals(enn.N().U().b())) {
            String $$4 = "";

            try {
               $$4 = emf.a($$3);
            } catch (Exception var8) {
               s.error("Could not get name for {}", $$3, var8);
               continue;
            }

            $$1.add($$4);
            $$2++;
         }
      }

      this.r.a = String.valueOf($$2);
      this.r.b = Joiner.on('\n').join($$1);
   }

   public static ejq a(JsonObject $$0) {
      ejq $$1 = new ejq();

      try {
         $$1.a = emb.a("id", $$0, -1L);
         $$1.b = emb.a("remoteSubscriptionId", $$0, null);
         $$1.c = emb.a("name", $$0, null);
         $$1.d = emb.a("motd", $$0, null);
         $$1.e = e(emb.a("state", $$0, ejq.b.a.name()));
         $$1.f = emb.a("owner", $$0, null);
         if ($$0.get("players") != null && $$0.get("players").isJsonArray()) {
            $$1.h = a($$0.get("players").getAsJsonArray());
            a($$1);
         } else {
            $$1.h = Lists.newArrayList();
         }

         $$1.l = emb.a("daysLeft", $$0, 0);
         $$1.j = emb.a("expired", $$0, false);
         $$1.k = emb.a("expiredTrial", $$0, false);
         $$1.m = f(emb.a("worldType", $$0, ejq.c.a.name()));
         $$1.g = emb.a("ownerUUID", $$0, "");
         if ($$0.get("slots") != null && $$0.get("slots").isJsonArray()) {
            $$1.i = b($$0.get("slots").getAsJsonArray());
         } else {
            $$1.i = e();
         }

         $$1.o = emb.a("minigameName", $$0, null);
         $$1.n = emb.a("activeSlot", $$0, -1);
         $$1.p = emb.a("minigameId", $$0, -1);
         $$1.q = emb.a("minigameImage", $$0, null);
      } catch (Exception var3) {
         s.error("Could not parse McoServer: {}", var3.getMessage());
      }

      return $$1;
   }

   private static void a(ejq $$0) {
      $$0.h
         .sort(
            ($$0x, $$1) -> ComparisonChain.start()
                  .compareFalseFirst($$1.d(), $$0x.d())
                  .compare($$0x.a().toLowerCase(Locale.ROOT), $$1.a().toLowerCase(Locale.ROOT))
                  .result()
         );
   }

   private static List<ejm> a(JsonArray $$0) {
      List<ejm> $$1 = Lists.newArrayList();

      for (JsonElement $$2 : $$0) {
         try {
            JsonObject $$3 = $$2.getAsJsonObject();
            ejm $$4 = new ejm();
            $$4.a(emb.a("name", $$3, null));
            $$4.b(emb.a("uuid", $$3, null));
            $$4.a(emb.a("operator", $$3, false));
            $$4.b(emb.a("accepted", $$3, false));
            $$4.c(emb.a("online", $$3, false));
            $$1.add($$4);
         } catch (Exception var6) {
         }
      }

      return $$1;
   }

   private static Map<Integer, ejx> b(JsonArray $$0) {
      Map<Integer, ejx> $$1 = Maps.newHashMap();

      for (JsonElement $$2 : $$0) {
         try {
            JsonObject $$3 = $$2.getAsJsonObject();
            JsonParser $$4 = new JsonParser();
            JsonElement $$5 = $$4.parse($$3.get("options").getAsString());
            ejx $$6;
            if ($$5 == null) {
               $$6 = ejx.a();
            } else {
               $$6 = ejx.a($$5.getAsJsonObject());
            }

            int $$8 = emb.a("slotId", $$3, -1);
            $$1.put($$8, $$6);
         } catch (Exception var9) {
         }
      }

      for (int $$9 = 1; $$9 <= 3; $$9++) {
         if (!$$1.containsKey($$9)) {
            $$1.put($$9, ejx.b());
         }
      }

      return $$1;
   }

   private static Map<Integer, ejx> e() {
      Map<Integer, ejx> $$0 = Maps.newHashMap();
      $$0.put(1, ejx.b());
      $$0.put(2, ejx.b());
      $$0.put(3, ejx.b());
      return $$0;
   }

   public static ejq c(String $$0) {
      try {
         return a(new JsonParser().parse($$0).getAsJsonObject());
      } catch (Exception var2) {
         s.error("Could not parse McoServer: {}", var2.getMessage());
         return new ejq();
      }
   }

   private static ejq.b e(String $$0) {
      try {
         return ejq.b.valueOf($$0);
      } catch (Exception var2) {
         return ejq.b.a;
      }
   }

   private static ejq.c f(String $$0) {
      try {
         return ejq.c.valueOf($$0);
      } catch (Exception var2) {
         return ejq.c.a;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.c, this.d, this.e, this.f, this.j);
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if ($$0.getClass() != this.getClass()) {
         return false;
      } else {
         ejq $$1 = (ejq)$$0;
         return new EqualsBuilder()
            .append(this.a, $$1.a)
            .append(this.c, $$1.c)
            .append(this.d, $$1.d)
            .append(this.e, $$1.e)
            .append(this.f, $$1.f)
            .append(this.j, $$1.j)
            .append(this.m, this.m)
            .isEquals();
      }
   }

   public ejq d() {
      ejq $$0 = new ejq();
      $$0.a = this.a;
      $$0.b = this.b;
      $$0.c = this.c;
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.h = this.h;
      $$0.i = this.a(this.i);
      $$0.j = this.j;
      $$0.k = this.k;
      $$0.l = this.l;
      $$0.r = new ejt();
      $$0.r.a = this.r.a;
      $$0.r.b = this.r.b;
      $$0.m = this.m;
      $$0.g = this.g;
      $$0.o = this.o;
      $$0.n = this.n;
      $$0.p = this.p;
      $$0.q = this.q;
      return $$0;
   }

   public Map<Integer, ejx> a(Map<Integer, ejx> $$0) {
      Map<Integer, ejx> $$1 = Maps.newHashMap();

      for (Entry<Integer, ejx> $$2 : $$0.entrySet()) {
         $$1.put($$2.getKey(), $$2.getValue().d());
      }

      return $$1;
   }

   public String a(int $$0) {
      return this.c + " (" + this.i.get($$0).a($$0) + ")";
   }

   public ffd d(String $$0) {
      return new ffd(this.c, $$0, false);
   }

   public static class a implements Comparator<ejq> {
      private final String a;

      public a(String $$0) {
         this.a = $$0;
      }

      public int a(ejq $$0, ejq $$1) {
         return ComparisonChain.start()
            .compareTrueFirst($$0.e == ejq.b.c, $$1.e == ejq.b.c)
            .compareTrueFirst($$0.k, $$1.k)
            .compareTrueFirst($$0.f.equals(this.a), $$1.f.equals(this.a))
            .compareFalseFirst($$0.j, $$1.j)
            .compareTrueFirst($$0.e == ejq.b.b, $$1.e == ejq.b.b)
            .compare($$0.a, $$1.a)
            .result();
      }
   }

   public static enum b {
      a,
      b,
      c;
   }

   public static enum c {
      a,
      b,
      c,
      d,
      e;
   }
}
