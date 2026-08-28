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

public class fhj extends fhx {
   private static final Logger x = LogUtils.getLogger();
   private static final int y = -1;
   public long a;
   @Nullable
   public String b;
   @Nullable
   public String c;
   public String d;
   public fhj.c e;
   @Nullable
   public String f;
   public UUID g = af.e;
   public List<fhf> h;
   public Map<Integer, fhp> i;
   public boolean j;
   public boolean k;
   public int l;
   public fhj.d m;
   public boolean n;
   public int o;
   public int p;
   @Nullable
   public String q;
   public int r;
   @Nullable
   public String s;
   public long t = -1L;
   @Nullable
   public String u;
   public String v = "";
   public fhj.a w = fhj.a.a;

   public String a() {
      return this.d;
   }

   @Nullable
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

   public static fhj a(JsonObject $$0) {
      fhj $$1 = new fhj();

      try {
         $$1.a = fjt.a("id", $$0, -1L);
         $$1.b = fjt.b("remoteSubscriptionId", $$0, null);
         $$1.c = fjt.b("name", $$0, null);
         $$1.d = fjt.b("motd", $$0, "");
         $$1.e = f(fjt.b("state", $$0, fhj.c.a.name()));
         $$1.f = fjt.b("owner", $$0, null);
         if ($$0.get("players") != null && $$0.get("players").isJsonArray()) {
            $$1.h = a($$0.get("players").getAsJsonArray());
            a($$1);
         } else {
            $$1.h = Lists.newArrayList();
         }

         $$1.l = fjt.a("daysLeft", $$0, 0);
         $$1.j = fjt.a("expired", $$0, false);
         $$1.k = fjt.a("expiredTrial", $$0, false);
         $$1.m = g(fjt.b("worldType", $$0, fhj.d.a.name()));
         $$1.n = fjt.a("isHardcore", $$0, false);
         $$1.o = fjt.a("gameMode", $$0, -1);
         $$1.g = fjt.a("ownerUUID", $$0, af.e);
         if ($$0.get("slots") != null && $$0.get("slots").isJsonArray()) {
            $$1.i = b($$0.get("slots").getAsJsonArray());
         } else {
            $$1.i = j();
         }

         $$1.q = fjt.b("minigameName", $$0, null);
         $$1.p = fjt.a("activeSlot", $$0, -1);
         $$1.r = fjt.a("minigameId", $$0, -1);
         $$1.s = fjt.b("minigameImage", $$0, null);
         $$1.t = fjt.a("parentWorldId", $$0, -1L);
         $$1.u = fjt.b("parentWorldName", $$0, null);
         $$1.v = fjt.b("activeVersion", $$0, "");
         $$1.w = d(fjt.b("compatibility", $$0, fhj.a.a.name()));
      } catch (Exception var3) {
         x.error("Could not parse McoServer: {}", var3.getMessage());
      }

      return $$1;
   }

   private static void a(fhj $$0) {
      $$0.h
         .sort(
            ($$0x, $$1) -> ComparisonChain.start()
                  .compareFalseFirst($$1.d(), $$0x.d())
                  .compare($$0x.a().toLowerCase(Locale.ROOT), $$1.a().toLowerCase(Locale.ROOT))
                  .result()
         );
   }

   private static List<fhf> a(JsonArray $$0) {
      List<fhf> $$1 = Lists.newArrayList();

      for (JsonElement $$2 : $$0) {
         try {
            JsonObject $$3 = $$2.getAsJsonObject();
            fhf $$4 = new fhf();
            $$4.a(fjt.b("name", $$3, null));
            $$4.a(fjt.a("uuid", $$3, af.e));
            $$4.a(fjt.a("operator", $$3, false));
            $$4.b(fjt.a("accepted", $$3, false));
            $$4.c(fjt.a("online", $$3, false));
            $$1.add($$4);
         } catch (Exception var6) {
         }
      }

      return $$1;
   }

   private static Map<Integer, fhp> b(JsonArray $$0) {
      Map<Integer, fhp> $$1 = Maps.newHashMap();

      for (JsonElement $$2 : $$0) {
         try {
            JsonObject $$3 = $$2.getAsJsonObject();
            JsonElement $$4 = JsonParser.parseString($$3.get("options").getAsString());
            fhn $$5 = a($$3.get("settings"));
            fhp $$6;
            if ($$4 == null) {
               $$6 = fhp.a();
            } else {
               $$6 = fhp.a($$4.getAsJsonObject(), $$5);
            }

            int $$8 = fjt.a("slotId", $$3, -1);
            $$1.put($$8, $$6);
         } catch (Exception var9) {
         }
      }

      for (int $$9 = 1; $$9 <= 3; $$9++) {
         if (!$$1.containsKey($$9)) {
            $$1.put($$9, fhp.b());
         }
      }

      return $$1;
   }

   private static fhn a(JsonElement $$0) {
      boolean $$1 = false;
      if ($$0.isJsonArray()) {
         for (JsonElement $$2 : $$0.getAsJsonArray()) {
            JsonObject $$3 = $$2.getAsJsonObject();
            $$1 = a($$3, "hardcore", $$1);
         }
      }

      return new fhn($$1);
   }

   private static boolean a(JsonObject $$0, String $$1, boolean $$2) {
      String $$3 = fjt.b("name", $$0, null);
      return $$3 != null && $$3.equals($$1) ? fjt.a("value", $$0, $$2) : $$2;
   }

   private static Map<Integer, fhp> j() {
      Map<Integer, fhp> $$0 = Maps.newHashMap();
      $$0.put(1, fhp.b());
      $$0.put(2, fhp.b());
      $$0.put(3, fhp.b());
      return $$0;
   }

   public static fhj c(String $$0) {
      try {
         return a(new JsonParser().parse($$0).getAsJsonObject());
      } catch (Exception var2) {
         x.error("Could not parse McoServer: {}", var2.getMessage());
         return new fhj();
      }
   }

   private static fhj.c f(String $$0) {
      try {
         return fhj.c.valueOf($$0);
      } catch (Exception var2) {
         return fhj.c.a;
      }
   }

   private static fhj.d g(String $$0) {
      try {
         return fhj.d.valueOf($$0);
      } catch (Exception var2) {
         return fhj.d.a;
      }
   }

   public static fhj.a d(@Nullable String $$0) {
      try {
         return fhj.a.valueOf($$0);
      } catch (Exception var2) {
         return fhj.a.a;
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
         fhj $$1 = (fhj)$$0;
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

   public fhj g() {
      fhj $$0 = new fhj();
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

   public Map<Integer, fhp> a(Map<Integer, fhp> $$0) {
      Map<Integer, fhp> $$1 = Maps.newHashMap();

      for (Entry<Integer, fhp> $$2 : $$0.entrySet()) {
         $$1.put($$2.getKey(), $$2.getValue().d());
      }

      return $$1;
   }

   public boolean h() {
      return this.t != -1L;
   }

   public boolean i() {
      return this.m == fhj.d.b;
   }

   public String a(int $$0) {
      return this.c == null ? this.i.get($$0).a($$0) : this.c + " (" + this.i.get($$0).a($$0) + ")";
   }

   public ggl e(String $$0) {
      return new ggl(Objects.requireNonNullElse(this.c, "unknown server"), $$0, ggl.c.b);
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

   public static class b implements Comparator<fhj> {
      private final String a;

      public b(String $$0) {
         this.a = $$0;
      }

      public int a(fhj $$0, fhj $$1) {
         return ComparisonChain.start()
            .compareTrueFirst($$0.h(), $$1.h())
            .compareTrueFirst($$0.e == fhj.c.c, $$1.e == fhj.c.c)
            .compareTrueFirst($$0.k, $$1.k)
            .compareTrueFirst(Objects.equals($$0.f, this.a), Objects.equals($$1.f, this.a))
            .compareFalseFirst($$0.j, $$1.j)
            .compareTrueFirst($$0.e == fhj.c.b, $$1.e == fhj.c.b)
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
