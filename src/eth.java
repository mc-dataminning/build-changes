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

public class eth extends etw {
   private static final Logger w = LogUtils.getLogger();
   private static final int x = -1;
   public long a;
   public String b;
   public String c;
   public String d;
   public eth.c e;
   public String f;
   public UUID g = ac.d;
   public List<etd> h;
   public Map<Integer, eto> i;
   public boolean j;
   public boolean k;
   public int l;
   public eth.d m;
   public int n;
   @Nullable
   public String o;
   public int p;
   public String q;
   public long r = -1L;
   @Nullable
   public String s;
   public String t = "";
   public eth.a u = eth.a.a;
   public etk v = new etk();

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

   public void a(etl $$0) {
      List<String> $$1 = Lists.newArrayList();
      int $$2 = 0;
      MinecraftSessionService $$3 = exh.O().ak();

      for (UUID $$4 : $$0.b) {
         if (!exh.O().b($$4)) {
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

   public static eth a(JsonObject $$0) {
      eth $$1 = new eth();

      try {
         $$1.a = evt.a("id", $$0, -1L);
         $$1.b = evt.b("remoteSubscriptionId", $$0, null);
         $$1.c = evt.b("name", $$0, null);
         $$1.d = evt.b("motd", $$0, null);
         $$1.e = f(evt.b("state", $$0, eth.c.a.name()));
         $$1.f = evt.b("owner", $$0, null);
         if ($$0.get("players") != null && $$0.get("players").isJsonArray()) {
            $$1.h = a($$0.get("players").getAsJsonArray());
            a($$1);
         } else {
            $$1.h = Lists.newArrayList();
         }

         $$1.l = evt.a("daysLeft", $$0, 0);
         $$1.j = evt.a("expired", $$0, false);
         $$1.k = evt.a("expiredTrial", $$0, false);
         $$1.m = g(evt.b("worldType", $$0, eth.d.a.name()));
         $$1.g = evt.a("ownerUUID", $$0, ac.d);
         if ($$0.get("slots") != null && $$0.get("slots").isJsonArray()) {
            $$1.i = b($$0.get("slots").getAsJsonArray());
         } else {
            $$1.i = i();
         }

         $$1.o = evt.b("minigameName", $$0, null);
         $$1.n = evt.a("activeSlot", $$0, -1);
         $$1.p = evt.a("minigameId", $$0, -1);
         $$1.q = evt.b("minigameImage", $$0, null);
         $$1.r = evt.a("parentWorldId", $$0, -1L);
         $$1.s = evt.b("parentWorldName", $$0, null);
         $$1.t = evt.b("activeVersion", $$0, "");
         $$1.u = d(evt.b("compatibility", $$0, eth.a.a.name()));
      } catch (Exception var3) {
         w.error("Could not parse McoServer: {}", var3.getMessage());
      }

      return $$1;
   }

   private static void a(eth $$0) {
      $$0.h
         .sort(
            ($$0x, $$1) -> ComparisonChain.start()
                  .compareFalseFirst($$1.d(), $$0x.d())
                  .compare($$0x.a().toLowerCase(Locale.ROOT), $$1.a().toLowerCase(Locale.ROOT))
                  .result()
         );
   }

   private static List<etd> a(JsonArray $$0) {
      List<etd> $$1 = Lists.newArrayList();

      for (JsonElement $$2 : $$0) {
         try {
            JsonObject $$3 = $$2.getAsJsonObject();
            etd $$4 = new etd();
            $$4.a(evt.b("name", $$3, null));
            $$4.a(evt.a("uuid", $$3, ac.d));
            $$4.a(evt.a("operator", $$3, false));
            $$4.b(evt.a("accepted", $$3, false));
            $$4.c(evt.a("online", $$3, false));
            $$1.add($$4);
         } catch (Exception var6) {
         }
      }

      return $$1;
   }

   private static Map<Integer, eto> b(JsonArray $$0) {
      Map<Integer, eto> $$1 = Maps.newHashMap();

      for (JsonElement $$2 : $$0) {
         try {
            JsonObject $$3 = $$2.getAsJsonObject();
            JsonParser $$4 = new JsonParser();
            JsonElement $$5 = $$4.parse($$3.get("options").getAsString());
            eto $$6;
            if ($$5 == null) {
               $$6 = eto.a();
            } else {
               $$6 = eto.a($$5.getAsJsonObject());
            }

            int $$8 = evt.a("slotId", $$3, -1);
            $$1.put($$8, $$6);
         } catch (Exception var9) {
         }
      }

      for (int $$9 = 1; $$9 <= 3; $$9++) {
         if (!$$1.containsKey($$9)) {
            $$1.put($$9, eto.b());
         }
      }

      return $$1;
   }

   private static Map<Integer, eto> i() {
      Map<Integer, eto> $$0 = Maps.newHashMap();
      $$0.put(1, eto.b());
      $$0.put(2, eto.b());
      $$0.put(3, eto.b());
      return $$0;
   }

   public static eth c(String $$0) {
      try {
         return a(new JsonParser().parse($$0).getAsJsonObject());
      } catch (Exception var2) {
         w.error("Could not parse McoServer: {}", var2.getMessage());
         return new eth();
      }
   }

   private static eth.c f(String $$0) {
      try {
         return eth.c.valueOf($$0);
      } catch (Exception var2) {
         return eth.c.a;
      }
   }

   private static eth.d g(String $$0) {
      try {
         return eth.d.valueOf($$0);
      } catch (Exception var2) {
         return eth.d.a;
      }
   }

   public static eth.a d(@Nullable String $$0) {
      try {
         return eth.a.valueOf($$0);
      } catch (Exception var2) {
         return eth.a.a;
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
         eth $$1 = (eth)$$0;
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

   public eth g() {
      eth $$0 = new eth();
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
      $$0.v = new etk();
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

   public Map<Integer, eto> a(Map<Integer, eto> $$0) {
      Map<Integer, eto> $$1 = Maps.newHashMap();

      for (Entry<Integer, eto> $$2 : $$0.entrySet()) {
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

   public fqi e(String $$0) {
      return new fqi(this.c, $$0, fqi.c.b);
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

   public static class b implements Comparator<eth> {
      private final String a;

      public b(String $$0) {
         this.a = $$0;
      }

      public int a(eth $$0, eth $$1) {
         return ComparisonChain.start()
            .compareTrueFirst($$0.h(), $$1.h())
            .compareTrueFirst($$0.e == eth.c.c, $$1.e == eth.c.c)
            .compareTrueFirst($$0.k, $$1.k)
            .compareTrueFirst($$0.f.equals(this.a), $$1.f.equals(this.a))
            .compareFalseFirst($$0.j, $$1.j)
            .compareTrueFirst($$0.e == eth.c.b, $$1.e == eth.c.b)
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
