import com.google.common.base.Joiner;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.ProfileResult;
import com.mojang.logging.LogUtils;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.Map.Entry;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.slf4j.Logger;

public class emq extends enf {
   private static final Logger s = LogUtils.getLogger();
   public long a;
   public String b;
   public String c;
   public String d;
   public emq.b e;
   public String f;
   public UUID g = ac.d;
   public List<emm> h;
   public Map<Integer, emx> i;
   public boolean j;
   public boolean k;
   public int l;
   public emq.c m;
   public int n;
   public String o;
   public int p;
   public String q;
   public emt r = new emt();

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

   public void a(emu $$0) {
      List<String> $$1 = Lists.newArrayList();
      int $$2 = 0;
      MinecraftSessionService $$3 = eqp.O().ak();

      for (UUID $$4 : $$0.b) {
         if (!eqp.O().b($$4)) {
            try {
               ProfileResult $$5 = $$3.fetchProfile($$4, false);
               if ($$5 != null) {
                  $$1.add($$5.profile().getName());
               }

               $$2++;
            } catch (Exception var8) {
               s.error("Could not get name for {}", $$4, var8);
            }
         }
      }

      this.r.a = String.valueOf($$2);
      this.r.b = Joiner.on('\n').join($$1);
   }

   public static emq a(JsonObject $$0) {
      emq $$1 = new emq();

      try {
         $$1.a = epc.a("id", $$0, -1L);
         $$1.b = epc.a("remoteSubscriptionId", $$0, null);
         $$1.c = epc.a("name", $$0, null);
         $$1.d = epc.a("motd", $$0, null);
         $$1.e = e(epc.a("state", $$0, emq.b.a.name()));
         $$1.f = epc.a("owner", $$0, null);
         if ($$0.get("players") != null && $$0.get("players").isJsonArray()) {
            $$1.h = a($$0.get("players").getAsJsonArray());
            a($$1);
         } else {
            $$1.h = Lists.newArrayList();
         }

         $$1.l = epc.a("daysLeft", $$0, 0);
         $$1.j = epc.a("expired", $$0, false);
         $$1.k = epc.a("expiredTrial", $$0, false);
         $$1.m = f(epc.a("worldType", $$0, emq.c.a.name()));
         $$1.g = epc.a("ownerUUID", $$0, ac.d);
         if ($$0.get("slots") != null && $$0.get("slots").isJsonArray()) {
            $$1.i = b($$0.get("slots").getAsJsonArray());
         } else {
            $$1.i = e();
         }

         $$1.o = epc.a("minigameName", $$0, null);
         $$1.n = epc.a("activeSlot", $$0, -1);
         $$1.p = epc.a("minigameId", $$0, -1);
         $$1.q = epc.a("minigameImage", $$0, null);
      } catch (Exception var3) {
         s.error("Could not parse McoServer: {}", var3.getMessage());
      }

      return $$1;
   }

   private static void a(emq $$0) {
      $$0.h
         .sort(
            ($$0x, $$1) -> ComparisonChain.start()
                  .compareFalseFirst($$1.d(), $$0x.d())
                  .compare($$0x.a().toLowerCase(Locale.ROOT), $$1.a().toLowerCase(Locale.ROOT))
                  .result()
         );
   }

   private static List<emm> a(JsonArray $$0) {
      List<emm> $$1 = Lists.newArrayList();

      for (JsonElement $$2 : $$0) {
         try {
            JsonObject $$3 = $$2.getAsJsonObject();
            emm $$4 = new emm();
            $$4.a(epc.a("name", $$3, null));
            $$4.a(epc.a("uuid", $$3, ac.d));
            $$4.a(epc.a("operator", $$3, false));
            $$4.b(epc.a("accepted", $$3, false));
            $$4.c(epc.a("online", $$3, false));
            $$1.add($$4);
         } catch (Exception var6) {
         }
      }

      return $$1;
   }

   private static Map<Integer, emx> b(JsonArray $$0) {
      Map<Integer, emx> $$1 = Maps.newHashMap();

      for (JsonElement $$2 : $$0) {
         try {
            JsonObject $$3 = $$2.getAsJsonObject();
            JsonParser $$4 = new JsonParser();
            JsonElement $$5 = $$4.parse($$3.get("options").getAsString());
            emx $$6;
            if ($$5 == null) {
               $$6 = emx.a();
            } else {
               $$6 = emx.a($$5.getAsJsonObject());
            }

            int $$8 = epc.a("slotId", $$3, -1);
            $$1.put($$8, $$6);
         } catch (Exception var9) {
         }
      }

      for (int $$9 = 1; $$9 <= 3; $$9++) {
         if (!$$1.containsKey($$9)) {
            $$1.put($$9, emx.b());
         }
      }

      return $$1;
   }

   private static Map<Integer, emx> e() {
      Map<Integer, emx> $$0 = Maps.newHashMap();
      $$0.put(1, emx.b());
      $$0.put(2, emx.b());
      $$0.put(3, emx.b());
      return $$0;
   }

   public static emq c(String $$0) {
      try {
         return a(new JsonParser().parse($$0).getAsJsonObject());
      } catch (Exception var2) {
         s.error("Could not parse McoServer: {}", var2.getMessage());
         return new emq();
      }
   }

   private static emq.b e(String $$0) {
      try {
         return emq.b.valueOf($$0);
      } catch (Exception var2) {
         return emq.b.a;
      }
   }

   private static emq.c f(String $$0) {
      try {
         return emq.c.valueOf($$0);
      } catch (Exception var2) {
         return emq.c.a;
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
         emq $$1 = (emq)$$0;
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

   public emq d() {
      emq $$0 = new emq();
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
      $$0.r = new emt();
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

   public Map<Integer, emx> a(Map<Integer, emx> $$0) {
      Map<Integer, emx> $$1 = Maps.newHashMap();

      for (Entry<Integer, emx> $$2 : $$0.entrySet()) {
         $$1.put($$2.getKey(), $$2.getValue().d());
      }

      return $$1;
   }

   public String a(int $$0) {
      return this.c + " (" + this.i.get($$0).a($$0) + ")";
   }

   public fjd d(String $$0) {
      return new fjd(this.c, $$0, fjd.b.b);
   }

   public static class a implements Comparator<emq> {
      private final String a;

      public a(String $$0) {
         this.a = $$0;
      }

      public int a(emq $$0, emq $$1) {
         return ComparisonChain.start()
            .compareTrueFirst($$0.e == emq.b.c, $$1.e == emq.b.c)
            .compareTrueFirst($$0.k, $$1.k)
            .compareTrueFirst($$0.f.equals(this.a), $$1.f.equals(this.a))
            .compareFalseFirst($$0.j, $$1.j)
            .compareTrueFirst($$0.e == emq.b.b, $$1.e == emq.b.b)
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
