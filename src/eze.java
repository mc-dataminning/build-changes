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

public class eze extends ezt {
   private static final Logger w = LogUtils.getLogger();
   private static final int x = -1;
   public long a;
   public String b;
   public String c;
   public String d;
   public eze.c e;
   public String f;
   public UUID g = ac.e;
   public List<eza> h;
   public Map<Integer, ezl> i;
   public boolean j;
   public boolean k;
   public int l;
   public eze.d m;
   public int n;
   @Nullable
   public String o;
   public int p;
   public String q;
   public long r = -1L;
   @Nullable
   public String s;
   public String t = "";
   public eze.a u = eze.a.a;
   public ezh v = new ezh();

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

   public void a(ezi $$0) {
      List<String> $$1 = Lists.newArrayList();
      int $$2 = 0;
      MinecraftSessionService $$3 = fde.Q().am();

      for (UUID $$4 : $$0.b) {
         if (!fde.Q().b($$4)) {
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

   public static eze a(JsonObject $$0) {
      eze $$1 = new eze();

      try {
         $$1.a = fbq.a("id", $$0, -1L);
         $$1.b = fbq.b("remoteSubscriptionId", $$0, null);
         $$1.c = fbq.b("name", $$0, null);
         $$1.d = fbq.b("motd", $$0, null);
         $$1.e = f(fbq.b("state", $$0, eze.c.a.name()));
         $$1.f = fbq.b("owner", $$0, null);
         if ($$0.get("players") != null && $$0.get("players").isJsonArray()) {
            $$1.h = a($$0.get("players").getAsJsonArray());
            a($$1);
         } else {
            $$1.h = Lists.newArrayList();
         }

         $$1.l = fbq.a("daysLeft", $$0, 0);
         $$1.j = fbq.a("expired", $$0, false);
         $$1.k = fbq.a("expiredTrial", $$0, false);
         $$1.m = g(fbq.b("worldType", $$0, eze.d.a.name()));
         $$1.g = fbq.a("ownerUUID", $$0, ac.e);
         if ($$0.get("slots") != null && $$0.get("slots").isJsonArray()) {
            $$1.i = b($$0.get("slots").getAsJsonArray());
         } else {
            $$1.i = i();
         }

         $$1.o = fbq.b("minigameName", $$0, null);
         $$1.n = fbq.a("activeSlot", $$0, -1);
         $$1.p = fbq.a("minigameId", $$0, -1);
         $$1.q = fbq.b("minigameImage", $$0, null);
         $$1.r = fbq.a("parentWorldId", $$0, -1L);
         $$1.s = fbq.b("parentWorldName", $$0, null);
         $$1.t = fbq.b("activeVersion", $$0, "");
         $$1.u = d(fbq.b("compatibility", $$0, eze.a.a.name()));
      } catch (Exception var3) {
         w.error("Could not parse McoServer: {}", var3.getMessage());
      }

      return $$1;
   }

   private static void a(eze $$0) {
      $$0.h
         .sort(
            ($$0x, $$1) -> ComparisonChain.start()
                  .compareFalseFirst($$1.d(), $$0x.d())
                  .compare($$0x.a().toLowerCase(Locale.ROOT), $$1.a().toLowerCase(Locale.ROOT))
                  .result()
         );
   }

   private static List<eza> a(JsonArray $$0) {
      List<eza> $$1 = Lists.newArrayList();

      for (JsonElement $$2 : $$0) {
         try {
            JsonObject $$3 = $$2.getAsJsonObject();
            eza $$4 = new eza();
            $$4.a(fbq.b("name", $$3, null));
            $$4.a(fbq.a("uuid", $$3, ac.e));
            $$4.a(fbq.a("operator", $$3, false));
            $$4.b(fbq.a("accepted", $$3, false));
            $$4.c(fbq.a("online", $$3, false));
            $$1.add($$4);
         } catch (Exception var6) {
         }
      }

      return $$1;
   }

   private static Map<Integer, ezl> b(JsonArray $$0) {
      Map<Integer, ezl> $$1 = Maps.newHashMap();

      for (JsonElement $$2 : $$0) {
         try {
            JsonObject $$3 = $$2.getAsJsonObject();
            JsonParser $$4 = new JsonParser();
            JsonElement $$5 = $$4.parse($$3.get("options").getAsString());
            ezl $$6;
            if ($$5 == null) {
               $$6 = ezl.a();
            } else {
               $$6 = ezl.a($$5.getAsJsonObject());
            }

            int $$8 = fbq.a("slotId", $$3, -1);
            $$1.put($$8, $$6);
         } catch (Exception var9) {
         }
      }

      for (int $$9 = 1; $$9 <= 3; $$9++) {
         if (!$$1.containsKey($$9)) {
            $$1.put($$9, ezl.b());
         }
      }

      return $$1;
   }

   private static Map<Integer, ezl> i() {
      Map<Integer, ezl> $$0 = Maps.newHashMap();
      $$0.put(1, ezl.b());
      $$0.put(2, ezl.b());
      $$0.put(3, ezl.b());
      return $$0;
   }

   public static eze c(String $$0) {
      try {
         return a(new JsonParser().parse($$0).getAsJsonObject());
      } catch (Exception var2) {
         w.error("Could not parse McoServer: {}", var2.getMessage());
         return new eze();
      }
   }

   private static eze.c f(String $$0) {
      try {
         return eze.c.valueOf($$0);
      } catch (Exception var2) {
         return eze.c.a;
      }
   }

   private static eze.d g(String $$0) {
      try {
         return eze.d.valueOf($$0);
      } catch (Exception var2) {
         return eze.d.a;
      }
   }

   public static eze.a d(@Nullable String $$0) {
      try {
         return eze.a.valueOf($$0);
      } catch (Exception var2) {
         return eze.a.a;
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
         eze $$1 = (eze)$$0;
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

   public eze g() {
      eze $$0 = new eze();
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
      $$0.v = new ezh();
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

   public Map<Integer, ezl> a(Map<Integer, ezl> $$0) {
      Map<Integer, ezl> $$1 = Maps.newHashMap();

      for (Entry<Integer, ezl> $$2 : $$0.entrySet()) {
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

   public fwk e(String $$0) {
      return new fwk(this.c, $$0, fwk.c.b);
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

   public static class b implements Comparator<eze> {
      private final String a;

      public b(String $$0) {
         this.a = $$0;
      }

      public int a(eze $$0, eze $$1) {
         return ComparisonChain.start()
            .compareTrueFirst($$0.h(), $$1.h())
            .compareTrueFirst($$0.e == eze.c.c, $$1.e == eze.c.c)
            .compareTrueFirst($$0.k, $$1.k)
            .compareTrueFirst($$0.f.equals(this.a), $$1.f.equals(this.a))
            .compareFalseFirst($$0.j, $$1.j)
            .compareTrueFirst($$0.e == eze.c.b, $$1.e == eze.c.b)
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
