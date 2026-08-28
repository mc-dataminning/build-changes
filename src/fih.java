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

public class fih extends fiv {
   private static final Logger x = LogUtils.getLogger();
   private static final int y = -1;
   public long a;
   public String b;
   public String c;
   public String d;
   public fih.c e;
   public String f;
   public UUID g = ae.e;
   public List<fid> h;
   public Map<Integer, fin> i;
   public boolean j;
   public boolean k;
   public int l;
   public fih.d m;
   public boolean n;
   public int o;
   public int p;
   @Nullable
   public String q;
   public int r;
   public String s;
   public long t = -1L;
   @Nullable
   public String u;
   public String v = "";
   public fih.a w = fih.a.a;

   public String a() {
      return this.d;
   }

   public String b() {
      return this.c;
   }

   @Nullable
   public String c() {
      return this.q;
   }

   public void a(String $$0) {
      this.c = $$0;
   }

   public void b(String $$0) {
      this.d = $$0;
   }

   public static fih a(JsonObject $$0) {
      fih $$1 = new fih();

      try {
         $$1.a = fkr.a("id", $$0, -1L);
         $$1.b = fkr.b("remoteSubscriptionId", $$0, null);
         $$1.c = fkr.b("name", $$0, null);
         $$1.d = fkr.b("motd", $$0, null);
         $$1.e = f(fkr.b("state", $$0, fih.c.a.name()));
         $$1.f = fkr.b("owner", $$0, null);
         if ($$0.get("players") != null && $$0.get("players").isJsonArray()) {
            $$1.h = a($$0.get("players").getAsJsonArray());
            a($$1);
         } else {
            $$1.h = Lists.newArrayList();
         }

         $$1.l = fkr.a("daysLeft", $$0, 0);
         $$1.j = fkr.a("expired", $$0, false);
         $$1.k = fkr.a("expiredTrial", $$0, false);
         $$1.m = g(fkr.b("worldType", $$0, fih.d.a.name()));
         $$1.n = fkr.a("isHardcore", $$0, false);
         $$1.o = fkr.a("gameMode", $$0, -1);
         $$1.g = fkr.a("ownerUUID", $$0, ae.e);
         if ($$0.get("slots") != null && $$0.get("slots").isJsonArray()) {
            $$1.i = b($$0.get("slots").getAsJsonArray());
         } else {
            $$1.i = j();
         }

         $$1.q = fkr.b("minigameName", $$0, null);
         $$1.p = fkr.a("activeSlot", $$0, -1);
         $$1.r = fkr.a("minigameId", $$0, -1);
         $$1.s = fkr.b("minigameImage", $$0, null);
         $$1.t = fkr.a("parentWorldId", $$0, -1L);
         $$1.u = fkr.b("parentWorldName", $$0, null);
         $$1.v = fkr.b("activeVersion", $$0, "");
         $$1.w = d(fkr.b("compatibility", $$0, fih.a.a.name()));
      } catch (Exception var3) {
         x.error("Could not parse McoServer: {}", var3.getMessage());
      }

      return $$1;
   }

   private static void a(fih $$0) {
      $$0.h
         .sort(
            ($$0x, $$1) -> ComparisonChain.start()
                  .compareFalseFirst($$1.d(), $$0x.d())
                  .compare($$0x.a().toLowerCase(Locale.ROOT), $$1.a().toLowerCase(Locale.ROOT))
                  .result()
         );
   }

   private static List<fid> a(JsonArray $$0) {
      List<fid> $$1 = Lists.newArrayList();

      for (JsonElement $$2 : $$0) {
         try {
            JsonObject $$3 = $$2.getAsJsonObject();
            fid $$4 = new fid();
            $$4.a(fkr.b("name", $$3, null));
            $$4.a(fkr.a("uuid", $$3, ae.e));
            $$4.a(fkr.a("operator", $$3, false));
            $$4.b(fkr.a("accepted", $$3, false));
            $$4.c(fkr.a("online", $$3, false));
            $$1.add($$4);
         } catch (Exception var6) {
         }
      }

      return $$1;
   }

   private static Map<Integer, fin> b(JsonArray $$0) {
      Map<Integer, fin> $$1 = Maps.newHashMap();

      for (JsonElement $$2 : $$0) {
         try {
            JsonObject $$3 = $$2.getAsJsonObject();
            JsonElement $$4 = JsonParser.parseString($$3.get("options").getAsString());
            fil $$5 = a($$3.get("settings"));
            fin $$6;
            if ($$4 == null) {
               $$6 = fin.a();
            } else {
               $$6 = fin.a($$4.getAsJsonObject(), $$5);
            }

            int $$8 = fkr.a("slotId", $$3, -1);
            $$1.put($$8, $$6);
         } catch (Exception var9) {
         }
      }

      for (int $$9 = 1; $$9 <= 3; $$9++) {
         if (!$$1.containsKey($$9)) {
            $$1.put($$9, fin.b());
         }
      }

      return $$1;
   }

   private static fil a(JsonElement $$0) {
      boolean $$1 = false;
      if ($$0.isJsonArray()) {
         for (JsonElement $$2 : $$0.getAsJsonArray()) {
            JsonObject $$3 = $$2.getAsJsonObject();
            $$1 = a($$3, "hardcore", $$1);
         }
      }

      return new fil($$1);
   }

   private static boolean a(JsonObject $$0, String $$1, boolean $$2) {
      String $$3 = fkr.b("name", $$0, null);
      return $$3 != null && $$3.equals($$1) ? fkr.a("value", $$0, $$2) : $$2;
   }

   private static Map<Integer, fin> j() {
      Map<Integer, fin> $$0 = Maps.newHashMap();
      $$0.put(1, fin.b());
      $$0.put(2, fin.b());
      $$0.put(3, fin.b());
      return $$0;
   }

   public static fih c(String $$0) {
      try {
         return a(new JsonParser().parse($$0).getAsJsonObject());
      } catch (Exception var2) {
         x.error("Could not parse McoServer: {}", var2.getMessage());
         return new fih();
      }
   }

   private static fih.c f(String $$0) {
      try {
         return fih.c.valueOf($$0);
      } catch (Exception var2) {
         return fih.c.a;
      }
   }

   private static fih.d g(String $$0) {
      try {
         return fih.d.valueOf($$0);
      } catch (Exception var2) {
         return fih.d.a;
      }
   }

   public static fih.a d(@Nullable String $$0) {
      try {
         return fih.a.valueOf($$0);
      } catch (Exception var2) {
         return fih.a.a;
      }
   }

   public boolean d() {
      return this.w.a();
   }

   public boolean e() {
      return this.w.b();
   }

   public boolean f() {
      return this.w.c();
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
         fih $$1 = (fih)$$0;
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

   public fih g() {
      fih $$0 = new fih();
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
      $$0.n = this.n;
      $$0.o = this.o;
      $$0.g = this.g;
      $$0.q = this.q;
      $$0.p = this.p;
      $$0.r = this.r;
      $$0.s = this.s;
      $$0.u = this.u;
      $$0.t = this.t;
      $$0.v = this.v;
      $$0.w = this.w;
      return $$0;
   }

   public Map<Integer, fin> a(Map<Integer, fin> $$0) {
      Map<Integer, fin> $$1 = Maps.newHashMap();

      for (Entry<Integer, fin> $$2 : $$0.entrySet()) {
         $$1.put($$2.getKey(), $$2.getValue().d());
      }

      return $$1;
   }

   public boolean h() {
      return this.t != -1L;
   }

   public boolean i() {
      return this.m == fih.d.b;
   }

   public String a(int $$0) {
      return this.c + " (" + this.i.get($$0).a($$0) + ")";
   }

   public gfx e(String $$0) {
      return new gfx(this.c, $$0, gfx.c.b);
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

   public static class b implements Comparator<fih> {
      private final String a;

      public b(String $$0) {
         this.a = $$0;
      }

      public int a(fih $$0, fih $$1) {
         return ComparisonChain.start()
            .compareTrueFirst($$0.h(), $$1.h())
            .compareTrueFirst($$0.e == fih.c.c, $$1.e == fih.c.c)
            .compareTrueFirst($$0.k, $$1.k)
            .compareTrueFirst($$0.f.equals(this.a), $$1.f.equals(this.a))
            .compareFalseFirst($$0.j, $$1.j)
            .compareTrueFirst($$0.e == fih.c.b, $$1.e == fih.c.b)
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
