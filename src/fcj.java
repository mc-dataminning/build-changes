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

public class fcj extends fcy {
   private static final Logger w = LogUtils.getLogger();
   private static final int x = -1;
   public long a;
   public String b;
   public String c;
   public String d;
   public fcj.c e;
   public String f;
   public UUID g = ad.e;
   public List<fcf> h;
   public Map<Integer, fcq> i;
   public boolean j;
   public boolean k;
   public int l;
   public fcj.d m;
   public int n;
   @Nullable
   public String o;
   public int p;
   public String q;
   public long r = -1L;
   @Nullable
   public String s;
   public String t = "";
   public fcj.a u = fcj.a.a;
   public fcm v = new fcm();

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

   public void a(fcn $$0) {
      List<String> $$1 = Lists.newArrayList();
      int $$2 = 0;
      MinecraftSessionService $$3 = fgj.Q().am();

      for (UUID $$4 : $$0.b) {
         if (!fgj.Q().b($$4)) {
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

   public static fcj a(JsonObject $$0) {
      fcj $$1 = new fcj();

      try {
         $$1.a = fev.a("id", $$0, -1L);
         $$1.b = fev.b("remoteSubscriptionId", $$0, null);
         $$1.c = fev.b("name", $$0, null);
         $$1.d = fev.b("motd", $$0, null);
         $$1.e = f(fev.b("state", $$0, fcj.c.a.name()));
         $$1.f = fev.b("owner", $$0, null);
         if ($$0.get("players") != null && $$0.get("players").isJsonArray()) {
            $$1.h = a($$0.get("players").getAsJsonArray());
            a($$1);
         } else {
            $$1.h = Lists.newArrayList();
         }

         $$1.l = fev.a("daysLeft", $$0, 0);
         $$1.j = fev.a("expired", $$0, false);
         $$1.k = fev.a("expiredTrial", $$0, false);
         $$1.m = g(fev.b("worldType", $$0, fcj.d.a.name()));
         $$1.g = fev.a("ownerUUID", $$0, ad.e);
         if ($$0.get("slots") != null && $$0.get("slots").isJsonArray()) {
            $$1.i = b($$0.get("slots").getAsJsonArray());
         } else {
            $$1.i = i();
         }

         $$1.o = fev.b("minigameName", $$0, null);
         $$1.n = fev.a("activeSlot", $$0, -1);
         $$1.p = fev.a("minigameId", $$0, -1);
         $$1.q = fev.b("minigameImage", $$0, null);
         $$1.r = fev.a("parentWorldId", $$0, -1L);
         $$1.s = fev.b("parentWorldName", $$0, null);
         $$1.t = fev.b("activeVersion", $$0, "");
         $$1.u = d(fev.b("compatibility", $$0, fcj.a.a.name()));
      } catch (Exception var3) {
         w.error("Could not parse McoServer: {}", var3.getMessage());
      }

      return $$1;
   }

   private static void a(fcj $$0) {
      $$0.h
         .sort(
            ($$0x, $$1) -> ComparisonChain.start()
                  .compareFalseFirst($$1.d(), $$0x.d())
                  .compare($$0x.a().toLowerCase(Locale.ROOT), $$1.a().toLowerCase(Locale.ROOT))
                  .result()
         );
   }

   private static List<fcf> a(JsonArray $$0) {
      List<fcf> $$1 = Lists.newArrayList();

      for (JsonElement $$2 : $$0) {
         try {
            JsonObject $$3 = $$2.getAsJsonObject();
            fcf $$4 = new fcf();
            $$4.a(fev.b("name", $$3, null));
            $$4.a(fev.a("uuid", $$3, ad.e));
            $$4.a(fev.a("operator", $$3, false));
            $$4.b(fev.a("accepted", $$3, false));
            $$4.c(fev.a("online", $$3, false));
            $$1.add($$4);
         } catch (Exception var6) {
         }
      }

      return $$1;
   }

   private static Map<Integer, fcq> b(JsonArray $$0) {
      Map<Integer, fcq> $$1 = Maps.newHashMap();

      for (JsonElement $$2 : $$0) {
         try {
            JsonObject $$3 = $$2.getAsJsonObject();
            JsonParser $$4 = new JsonParser();
            JsonElement $$5 = $$4.parse($$3.get("options").getAsString());
            fcq $$6;
            if ($$5 == null) {
               $$6 = fcq.a();
            } else {
               $$6 = fcq.a($$5.getAsJsonObject());
            }

            int $$8 = fev.a("slotId", $$3, -1);
            $$1.put($$8, $$6);
         } catch (Exception var9) {
         }
      }

      for (int $$9 = 1; $$9 <= 3; $$9++) {
         if (!$$1.containsKey($$9)) {
            $$1.put($$9, fcq.b());
         }
      }

      return $$1;
   }

   private static Map<Integer, fcq> i() {
      Map<Integer, fcq> $$0 = Maps.newHashMap();
      $$0.put(1, fcq.b());
      $$0.put(2, fcq.b());
      $$0.put(3, fcq.b());
      return $$0;
   }

   public static fcj c(String $$0) {
      try {
         return a(new JsonParser().parse($$0).getAsJsonObject());
      } catch (Exception var2) {
         w.error("Could not parse McoServer: {}", var2.getMessage());
         return new fcj();
      }
   }

   private static fcj.c f(String $$0) {
      try {
         return fcj.c.valueOf($$0);
      } catch (Exception var2) {
         return fcj.c.a;
      }
   }

   private static fcj.d g(String $$0) {
      try {
         return fcj.d.valueOf($$0);
      } catch (Exception var2) {
         return fcj.d.a;
      }
   }

   public static fcj.a d(@Nullable String $$0) {
      try {
         return fcj.a.valueOf($$0);
      } catch (Exception var2) {
         return fcj.a.a;
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
         fcj $$1 = (fcj)$$0;
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

   public fcj g() {
      fcj $$0 = new fcj();
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
      $$0.v = new fcm();
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

   public Map<Integer, fcq> a(Map<Integer, fcq> $$0) {
      Map<Integer, fcq> $$1 = Maps.newHashMap();

      for (Entry<Integer, fcq> $$2 : $$0.entrySet()) {
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

   public gab e(String $$0) {
      return new gab(this.c, $$0, gab.c.b);
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

   public static class b implements Comparator<fcj> {
      private final String a;

      public b(String $$0) {
         this.a = $$0;
      }

      public int a(fcj $$0, fcj $$1) {
         return ComparisonChain.start()
            .compareTrueFirst($$0.h(), $$1.h())
            .compareTrueFirst($$0.e == fcj.c.c, $$1.e == fcj.c.c)
            .compareTrueFirst($$0.k, $$1.k)
            .compareTrueFirst($$0.f.equals(this.a), $$1.f.equals(this.a))
            .compareFalseFirst($$0.j, $$1.j)
            .compareTrueFirst($$0.e == fcj.c.b, $$1.e == fcj.c.b)
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
