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
import javax.annotation.Nullable;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.slf4j.Logger;

public class eri extends erx {
   private static final Logger w = LogUtils.getLogger();
   private static final int x = -1;
   public long a;
   public String b;
   public String c;
   public String d;
   public eri.c e;
   public String f;
   public UUID g = ac.d;
   public List<ere> h;
   public Map<Integer, erp> i;
   public boolean j;
   public boolean k;
   public int l;
   public eri.d m;
   public int n;
   public String o;
   public int p;
   public String q;
   public long r = -1L;
   @Nullable
   public String s;
   public String t = "";
   public eri.a u = eri.a.a;
   public erl v = new erl();

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

   public void a(erm $$0) {
      List<String> $$1 = Lists.newArrayList();
      int $$2 = 0;
      MinecraftSessionService $$3 = evi.O().ak();

      for (UUID $$4 : $$0.b) {
         if (!evi.O().b($$4)) {
            try {
               ProfileResult $$5 = $$3.fetchProfile($$4, false);
               if ($$5 != null) {
                  $$1.add($$5.profile().getName());
               }

               $$2++;
            } catch (Exception var8) {
               w.error("Could not get name for {}", $$4, var8);
            }
         }
      }

      this.v.a = String.valueOf($$2);
      this.v.b = Joiner.on('\n').join($$1);
   }

   public static eri a(JsonObject $$0) {
      eri $$1 = new eri();

      try {
         $$1.a = etu.a("id", $$0, -1L);
         $$1.b = etu.b("remoteSubscriptionId", $$0, null);
         $$1.c = etu.b("name", $$0, null);
         $$1.d = etu.b("motd", $$0, null);
         $$1.e = f(etu.b("state", $$0, eri.c.a.name()));
         $$1.f = etu.b("owner", $$0, null);
         if ($$0.get("players") != null && $$0.get("players").isJsonArray()) {
            $$1.h = a($$0.get("players").getAsJsonArray());
            a($$1);
         } else {
            $$1.h = Lists.newArrayList();
         }

         $$1.l = etu.a("daysLeft", $$0, 0);
         $$1.j = etu.a("expired", $$0, false);
         $$1.k = etu.a("expiredTrial", $$0, false);
         $$1.m = g(etu.b("worldType", $$0, eri.d.a.name()));
         $$1.g = etu.a("ownerUUID", $$0, ac.d);
         if ($$0.get("slots") != null && $$0.get("slots").isJsonArray()) {
            $$1.i = b($$0.get("slots").getAsJsonArray());
         } else {
            $$1.i = i();
         }

         $$1.o = etu.b("minigameName", $$0, null);
         $$1.n = etu.a("activeSlot", $$0, -1);
         $$1.p = etu.a("minigameId", $$0, -1);
         $$1.q = etu.b("minigameImage", $$0, null);
         $$1.r = etu.a("parentWorldId", $$0, -1L);
         $$1.s = etu.b("parentWorldName", $$0, null);
         $$1.t = etu.b("activeVersion", $$0, "");
         $$1.u = d(etu.b("compatibility", $$0, eri.a.a.name()));
      } catch (Exception var3) {
         w.error("Could not parse McoServer: {}", var3.getMessage());
      }

      return $$1;
   }

   private static void a(eri $$0) {
      $$0.h
         .sort(
            ($$0x, $$1) -> ComparisonChain.start()
                  .compareFalseFirst($$1.d(), $$0x.d())
                  .compare($$0x.a().toLowerCase(Locale.ROOT), $$1.a().toLowerCase(Locale.ROOT))
                  .result()
         );
   }

   private static List<ere> a(JsonArray $$0) {
      List<ere> $$1 = Lists.newArrayList();

      for (JsonElement $$2 : $$0) {
         try {
            JsonObject $$3 = $$2.getAsJsonObject();
            ere $$4 = new ere();
            $$4.a(etu.b("name", $$3, null));
            $$4.a(etu.a("uuid", $$3, ac.d));
            $$4.a(etu.a("operator", $$3, false));
            $$4.b(etu.a("accepted", $$3, false));
            $$4.c(etu.a("online", $$3, false));
            $$1.add($$4);
         } catch (Exception var6) {
         }
      }

      return $$1;
   }

   private static Map<Integer, erp> b(JsonArray $$0) {
      Map<Integer, erp> $$1 = Maps.newHashMap();

      for (JsonElement $$2 : $$0) {
         try {
            JsonObject $$3 = $$2.getAsJsonObject();
            JsonParser $$4 = new JsonParser();
            JsonElement $$5 = $$4.parse($$3.get("options").getAsString());
            erp $$6;
            if ($$5 == null) {
               $$6 = erp.a();
            } else {
               $$6 = erp.a($$5.getAsJsonObject());
            }

            int $$8 = etu.a("slotId", $$3, -1);
            $$1.put($$8, $$6);
         } catch (Exception var9) {
         }
      }

      for (int $$9 = 1; $$9 <= 3; $$9++) {
         if (!$$1.containsKey($$9)) {
            $$1.put($$9, erp.b());
         }
      }

      return $$1;
   }

   private static Map<Integer, erp> i() {
      Map<Integer, erp> $$0 = Maps.newHashMap();
      $$0.put(1, erp.b());
      $$0.put(2, erp.b());
      $$0.put(3, erp.b());
      return $$0;
   }

   public static eri c(String $$0) {
      try {
         return a(new JsonParser().parse($$0).getAsJsonObject());
      } catch (Exception var2) {
         w.error("Could not parse McoServer: {}", var2.getMessage());
         return new eri();
      }
   }

   private static eri.c f(String $$0) {
      try {
         return eri.c.valueOf($$0);
      } catch (Exception var2) {
         return eri.c.a;
      }
   }

   private static eri.d g(String $$0) {
      try {
         return eri.d.valueOf($$0);
      } catch (Exception var2) {
         return eri.d.a;
      }
   }

   public static eri.a d(@Nullable String $$0) {
      try {
         return eri.a.valueOf($$0);
      } catch (Exception var2) {
         return eri.a.a;
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
         eri $$1 = (eri)$$0;
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

   public eri g() {
      eri $$0 = new eri();
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
      $$0.v = new erl();
      $$0.v.a = this.v.a;
      $$0.v.b = this.v.b;
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

   public Map<Integer, erp> a(Map<Integer, erp> $$0) {
      Map<Integer, erp> $$1 = Maps.newHashMap();

      for (Entry<Integer, erp> $$2 : $$0.entrySet()) {
         $$1.put($$2.getKey(), $$2.getValue().d());
      }

      return $$1;
   }

   public boolean h() {
      return this.r != -1L;
   }

   public String a(int $$0) {
      return this.c + " (" + this.i.get($$0).a($$0) + ")";
   }

   public fod e(String $$0) {
      return new fod(this.c, $$0, fod.b.b);
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;

      public boolean a() {
         return this == e;
      }

      public boolean b() {
         return this == d;
      }

      public boolean c() {
         return this == c;
      }
   }

   public static class b implements Comparator<eri> {
      private final String a;

      public b(String $$0) {
         this.a = $$0;
      }

      public int a(eri $$0, eri $$1) {
         return ComparisonChain.start()
            .compareTrueFirst($$0.h(), $$1.h())
            .compareTrueFirst($$0.e == eri.c.c, $$1.e == eri.c.c)
            .compareTrueFirst($$0.k, $$1.k)
            .compareTrueFirst($$0.f.equals(this.a), $$1.f.equals(this.a))
            .compareFalseFirst($$0.j, $$1.j)
            .compareTrueFirst($$0.e == eri.c.b, $$1.e == eri.c.b)
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
