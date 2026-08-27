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

public class erg extends erv {
   private static final Logger w = LogUtils.getLogger();
   private static final int x = -1;
   public long a;
   public String b;
   public String c;
   public String d;
   public erg.c e;
   public String f;
   public UUID g = ac.d;
   public List<erc> h;
   public Map<Integer, ern> i;
   public boolean j;
   public boolean k;
   public int l;
   public erg.d m;
   public int n;
   public String o;
   public int p;
   public String q;
   public long r = -1L;
   @Nullable
   public String s;
   public String t = "";
   public erg.a u = erg.a.a;
   public erj v = new erj();

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

   public void a(erk $$0) {
      List<String> $$1 = Lists.newArrayList();
      int $$2 = 0;
      MinecraftSessionService $$3 = evg.O().ak();

      for (UUID $$4 : $$0.b) {
         if (!evg.O().b($$4)) {
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

   public static erg a(JsonObject $$0) {
      erg $$1 = new erg();

      try {
         $$1.a = ets.a("id", $$0, -1L);
         $$1.b = ets.b("remoteSubscriptionId", $$0, null);
         $$1.c = ets.b("name", $$0, null);
         $$1.d = ets.b("motd", $$0, null);
         $$1.e = f(ets.b("state", $$0, erg.c.a.name()));
         $$1.f = ets.b("owner", $$0, null);
         if ($$0.get("players") != null && $$0.get("players").isJsonArray()) {
            $$1.h = a($$0.get("players").getAsJsonArray());
            a($$1);
         } else {
            $$1.h = Lists.newArrayList();
         }

         $$1.l = ets.a("daysLeft", $$0, 0);
         $$1.j = ets.a("expired", $$0, false);
         $$1.k = ets.a("expiredTrial", $$0, false);
         $$1.m = g(ets.b("worldType", $$0, erg.d.a.name()));
         $$1.g = ets.a("ownerUUID", $$0, ac.d);
         if ($$0.get("slots") != null && $$0.get("slots").isJsonArray()) {
            $$1.i = b($$0.get("slots").getAsJsonArray());
         } else {
            $$1.i = i();
         }

         $$1.o = ets.b("minigameName", $$0, null);
         $$1.n = ets.a("activeSlot", $$0, -1);
         $$1.p = ets.a("minigameId", $$0, -1);
         $$1.q = ets.b("minigameImage", $$0, null);
         $$1.r = ets.a("parentWorldId", $$0, -1L);
         $$1.s = ets.b("parentWorldName", $$0, null);
         $$1.t = ets.b("activeVersion", $$0, "");
         $$1.u = d(ets.b("compatibility", $$0, erg.a.a.name()));
      } catch (Exception var3) {
         w.error("Could not parse McoServer: {}", var3.getMessage());
      }

      return $$1;
   }

   private static void a(erg $$0) {
      $$0.h
         .sort(
            ($$0x, $$1) -> ComparisonChain.start()
                  .compareFalseFirst($$1.d(), $$0x.d())
                  .compare($$0x.a().toLowerCase(Locale.ROOT), $$1.a().toLowerCase(Locale.ROOT))
                  .result()
         );
   }

   private static List<erc> a(JsonArray $$0) {
      List<erc> $$1 = Lists.newArrayList();

      for (JsonElement $$2 : $$0) {
         try {
            JsonObject $$3 = $$2.getAsJsonObject();
            erc $$4 = new erc();
            $$4.a(ets.b("name", $$3, null));
            $$4.a(ets.a("uuid", $$3, ac.d));
            $$4.a(ets.a("operator", $$3, false));
            $$4.b(ets.a("accepted", $$3, false));
            $$4.c(ets.a("online", $$3, false));
            $$1.add($$4);
         } catch (Exception var6) {
         }
      }

      return $$1;
   }

   private static Map<Integer, ern> b(JsonArray $$0) {
      Map<Integer, ern> $$1 = Maps.newHashMap();

      for (JsonElement $$2 : $$0) {
         try {
            JsonObject $$3 = $$2.getAsJsonObject();
            JsonParser $$4 = new JsonParser();
            JsonElement $$5 = $$4.parse($$3.get("options").getAsString());
            ern $$6;
            if ($$5 == null) {
               $$6 = ern.a();
            } else {
               $$6 = ern.a($$5.getAsJsonObject());
            }

            int $$8 = ets.a("slotId", $$3, -1);
            $$1.put($$8, $$6);
         } catch (Exception var9) {
         }
      }

      for (int $$9 = 1; $$9 <= 3; $$9++) {
         if (!$$1.containsKey($$9)) {
            $$1.put($$9, ern.b());
         }
      }

      return $$1;
   }

   private static Map<Integer, ern> i() {
      Map<Integer, ern> $$0 = Maps.newHashMap();
      $$0.put(1, ern.b());
      $$0.put(2, ern.b());
      $$0.put(3, ern.b());
      return $$0;
   }

   public static erg c(String $$0) {
      try {
         return a(new JsonParser().parse($$0).getAsJsonObject());
      } catch (Exception var2) {
         w.error("Could not parse McoServer: {}", var2.getMessage());
         return new erg();
      }
   }

   private static erg.c f(String $$0) {
      try {
         return erg.c.valueOf($$0);
      } catch (Exception var2) {
         return erg.c.a;
      }
   }

   private static erg.d g(String $$0) {
      try {
         return erg.d.valueOf($$0);
      } catch (Exception var2) {
         return erg.d.a;
      }
   }

   public static erg.a d(@Nullable String $$0) {
      try {
         return erg.a.valueOf($$0);
      } catch (Exception var2) {
         return erg.a.a;
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
         erg $$1 = (erg)$$0;
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

   public erg g() {
      erg $$0 = new erg();
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
      $$0.v = new erj();
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

   public Map<Integer, ern> a(Map<Integer, ern> $$0) {
      Map<Integer, ern> $$1 = Maps.newHashMap();

      for (Entry<Integer, ern> $$2 : $$0.entrySet()) {
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

   public fob e(String $$0) {
      return new fob(this.c, $$0, fob.b.b);
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

   public static class b implements Comparator<erg> {
      private final String a;

      public b(String $$0) {
         this.a = $$0;
      }

      public int a(erg $$0, erg $$1) {
         return ComparisonChain.start()
            .compareTrueFirst($$0.h(), $$1.h())
            .compareTrueFirst($$0.e == erg.c.c, $$1.e == erg.c.c)
            .compareTrueFirst($$0.k, $$1.k)
            .compareTrueFirst($$0.f.equals(this.a), $$1.f.equals(this.a))
            .compareFalseFirst($$0.j, $$1.j)
            .compareTrueFirst($$0.e == erg.c.b, $$1.e == erg.c.b)
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
