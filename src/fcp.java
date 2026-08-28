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
import java.util.UUID;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.slf4j.Logger;

public class fcp extends fdc {
   private static final Logger v = LogUtils.getLogger();
   private static final int w = -1;
   public long a;
   public String b;
   public String c;
   public String d;
   public fcp.c e;
   public String f;
   public UUID g = ad.e;
   public List<fcl> h;
   public Map<Integer, fcu> i;
   public boolean j;
   public boolean k;
   public int l;
   public fcp.d m;
   public int n;
   @Nullable
   public String o;
   public int p;
   public String q;
   public long r = -1L;
   @Nullable
   public String s;
   public String t = "";
   public fcp.a u = fcp.a.a;

   public String a() {
      return this.d;
   }

   public String b() {
      return this.c;
   }

   @Nullable
   public String c() {
      return this.o;
   }

   public void a(String $$0) {
      this.c = $$0;
   }

   public void b(String $$0) {
      this.d = $$0;
   }

   public static fcp a(JsonObject $$0) {
      fcp $$1 = new fcp();

      try {
         $$1.a = fez.a("id", $$0, -1L);
         $$1.b = fez.b("remoteSubscriptionId", $$0, null);
         $$1.c = fez.b("name", $$0, null);
         $$1.d = fez.b("motd", $$0, null);
         $$1.e = f(fez.b("state", $$0, fcp.c.a.name()));
         $$1.f = fez.b("owner", $$0, null);
         if ($$0.get("players") != null && $$0.get("players").isJsonArray()) {
            $$1.h = a($$0.get("players").getAsJsonArray());
            a($$1);
         } else {
            $$1.h = Lists.newArrayList();
         }

         $$1.l = fez.a("daysLeft", $$0, 0);
         $$1.j = fez.a("expired", $$0, false);
         $$1.k = fez.a("expiredTrial", $$0, false);
         $$1.m = g(fez.b("worldType", $$0, fcp.d.a.name()));
         $$1.g = fez.a("ownerUUID", $$0, ad.e);
         if ($$0.get("slots") != null && $$0.get("slots").isJsonArray()) {
            $$1.i = b($$0.get("slots").getAsJsonArray());
         } else {
            $$1.i = j();
         }

         $$1.o = fez.b("minigameName", $$0, null);
         $$1.n = fez.a("activeSlot", $$0, -1);
         $$1.p = fez.a("minigameId", $$0, -1);
         $$1.q = fez.b("minigameImage", $$0, null);
         $$1.r = fez.a("parentWorldId", $$0, -1L);
         $$1.s = fez.b("parentWorldName", $$0, null);
         $$1.t = fez.b("activeVersion", $$0, "");
         $$1.u = d(fez.b("compatibility", $$0, fcp.a.a.name()));
      } catch (Exception var3) {
         v.error("Could not parse McoServer: {}", var3.getMessage());
      }

      return $$1;
   }

   private static void a(fcp $$0) {
      $$0.h
         .sort(
            ($$0x, $$1) -> ComparisonChain.start()
                  .compareFalseFirst($$1.d(), $$0x.d())
                  .compare($$0x.a().toLowerCase(Locale.ROOT), $$1.a().toLowerCase(Locale.ROOT))
                  .result()
         );
   }

   private static List<fcl> a(JsonArray $$0) {
      List<fcl> $$1 = Lists.newArrayList();

      for (JsonElement $$2 : $$0) {
         try {
            JsonObject $$3 = $$2.getAsJsonObject();
            fcl $$4 = new fcl();
            $$4.a(fez.b("name", $$3, null));
            $$4.a(fez.a("uuid", $$3, ad.e));
            $$4.a(fez.a("operator", $$3, false));
            $$4.b(fez.a("accepted", $$3, false));
            $$4.c(fez.a("online", $$3, false));
            $$1.add($$4);
         } catch (Exception var6) {
         }
      }

      return $$1;
   }

   private static Map<Integer, fcu> b(JsonArray $$0) {
      Map<Integer, fcu> $$1 = Maps.newHashMap();

      for (JsonElement $$2 : $$0) {
         try {
            JsonObject $$3 = $$2.getAsJsonObject();
            JsonParser $$4 = new JsonParser();
            JsonElement $$5 = $$4.parse($$3.get("options").getAsString());
            fcu $$6;
            if ($$5 == null) {
               $$6 = fcu.a();
            } else {
               $$6 = fcu.a($$5.getAsJsonObject());
            }

            int $$8 = fez.a("slotId", $$3, -1);
            $$1.put($$8, $$6);
         } catch (Exception var9) {
         }
      }

      for (int $$9 = 1; $$9 <= 3; $$9++) {
         if (!$$1.containsKey($$9)) {
            $$1.put($$9, fcu.b());
         }
      }

      return $$1;
   }

   private static Map<Integer, fcu> j() {
      Map<Integer, fcu> $$0 = Maps.newHashMap();
      $$0.put(1, fcu.b());
      $$0.put(2, fcu.b());
      $$0.put(3, fcu.b());
      return $$0;
   }

   public static fcp c(String $$0) {
      try {
         return a(new JsonParser().parse($$0).getAsJsonObject());
      } catch (Exception var2) {
         v.error("Could not parse McoServer: {}", var2.getMessage());
         return new fcp();
      }
   }

   private static fcp.c f(String $$0) {
      try {
         return fcp.c.valueOf($$0);
      } catch (Exception var2) {
         return fcp.c.a;
      }
   }

   private static fcp.d g(String $$0) {
      try {
         return fcp.d.valueOf($$0);
      } catch (Exception var2) {
         return fcp.d.a;
      }
   }

   public static fcp.a d(@Nullable String $$0) {
      try {
         return fcp.a.valueOf($$0);
      } catch (Exception var2) {
         return fcp.a.a;
      }
   }

   public boolean d() {
      return this.u.a();
   }

   public boolean e() {
      return this.u.b();
   }

   public boolean f() {
      return this.u.c();
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
         fcp $$1 = (fcp)$$0;
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

   public fcp g() {
      fcp $$0 = new fcp();
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
      $$0.m = this.m;
      $$0.g = this.g;
      $$0.o = this.o;
      $$0.n = this.n;
      $$0.p = this.p;
      $$0.q = this.q;
      $$0.s = this.s;
      $$0.r = this.r;
      $$0.t = this.t;
      $$0.u = this.u;
      return $$0;
   }

   public Map<Integer, fcu> a(Map<Integer, fcu> $$0) {
      Map<Integer, fcu> $$1 = Maps.newHashMap();

      for (Entry<Integer, fcu> $$2 : $$0.entrySet()) {
         $$1.put($$2.getKey(), $$2.getValue().d());
      }

      return $$1;
   }

   public boolean h() {
      return this.r != -1L;
   }

   public boolean i() {
      return this.m == fcp.d.b;
   }

   public String a(int $$0) {
      return this.c + " (" + this.i.get($$0).a($$0) + ")";
   }

   public fzt e(String $$0) {
      return new fzt(this.c, $$0, fzt.c.b);
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e,
      f;

      public boolean a() {
         return this == f;
      }

      public boolean b() {
         return this == e;
      }

      public boolean c() {
         return this == d;
      }
   }

   public static class b implements Comparator<fcp> {
      private final String a;

      public b(String $$0) {
         this.a = $$0;
      }

      public int a(fcp $$0, fcp $$1) {
         return ComparisonChain.start()
            .compareTrueFirst($$0.h(), $$1.h())
            .compareTrueFirst($$0.e == fcp.c.c, $$1.e == fcp.c.c)
            .compareTrueFirst($$0.k, $$1.k)
            .compareTrueFirst($$0.f.equals(this.a), $$1.f.equals(this.a))
            .compareFalseFirst($$0.j, $$1.j)
            .compareTrueFirst($$0.e == fcp.c.b, $$1.e == fcp.c.b)
            .compare($$0.a, $$1.a)
            .result();
      }
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static enum d {
      a,
      b,
      c,
      d,
      e;
   }
}
