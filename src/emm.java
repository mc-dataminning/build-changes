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

public class emm extends enb {
   private static final Logger s = LogUtils.getLogger();
   public long a;
   public String b;
   public String c;
   public String d;
   public emm.b e;
   public String f;
   public UUID g = ac.d;
   public List<emi> h;
   public Map<Integer, emt> i;
   public boolean j;
   public boolean k;
   public int l;
   public emm.c m;
   public int n;
   public String o;
   public int p;
   public String q;
   public emp r = new emp();

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

   public void a(emq $$0) {
      List<String> $$1 = Lists.newArrayList();
      int $$2 = 0;
      MinecraftSessionService $$3 = eql.O().ak();

      for (UUID $$4 : $$0.b) {
         if (!eql.O().b($$4)) {
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

   public static emm a(JsonObject $$0) {
      emm $$1 = new emm();

      try {
         $$1.a = eoy.a("id", $$0, -1L);
         $$1.b = eoy.a("remoteSubscriptionId", $$0, null);
         $$1.c = eoy.a("name", $$0, null);
         $$1.d = eoy.a("motd", $$0, null);
         $$1.e = e(eoy.a("state", $$0, emm.b.a.name()));
         $$1.f = eoy.a("owner", $$0, null);
         if ($$0.get("players") != null && $$0.get("players").isJsonArray()) {
            $$1.h = a($$0.get("players").getAsJsonArray());
            a($$1);
         } else {
            $$1.h = Lists.newArrayList();
         }

         $$1.l = eoy.a("daysLeft", $$0, 0);
         $$1.j = eoy.a("expired", $$0, false);
         $$1.k = eoy.a("expiredTrial", $$0, false);
         $$1.m = f(eoy.a("worldType", $$0, emm.c.a.name()));
         $$1.g = eoy.a("ownerUUID", $$0, ac.d);
         if ($$0.get("slots") != null && $$0.get("slots").isJsonArray()) {
            $$1.i = b($$0.get("slots").getAsJsonArray());
         } else {
            $$1.i = e();
         }

         $$1.o = eoy.a("minigameName", $$0, null);
         $$1.n = eoy.a("activeSlot", $$0, -1);
         $$1.p = eoy.a("minigameId", $$0, -1);
         $$1.q = eoy.a("minigameImage", $$0, null);
      } catch (Exception var3) {
         s.error("Could not parse McoServer: {}", var3.getMessage());
      }

      return $$1;
   }

   private static void a(emm $$0) {
      $$0.h
         .sort(
            ($$0x, $$1) -> ComparisonChain.start()
                  .compareFalseFirst($$1.d(), $$0x.d())
                  .compare($$0x.a().toLowerCase(Locale.ROOT), $$1.a().toLowerCase(Locale.ROOT))
                  .result()
         );
   }

   private static List<emi> a(JsonArray $$0) {
      List<emi> $$1 = Lists.newArrayList();

      for (JsonElement $$2 : $$0) {
         try {
            JsonObject $$3 = $$2.getAsJsonObject();
            emi $$4 = new emi();
            $$4.a(eoy.a("name", $$3, null));
            $$4.a(eoy.a("uuid", $$3, ac.d));
            $$4.a(eoy.a("operator", $$3, false));
            $$4.b(eoy.a("accepted", $$3, false));
            $$4.c(eoy.a("online", $$3, false));
            $$1.add($$4);
         } catch (Exception var6) {
         }
      }

      return $$1;
   }

   private static Map<Integer, emt> b(JsonArray $$0) {
      Map<Integer, emt> $$1 = Maps.newHashMap();

      for (JsonElement $$2 : $$0) {
         try {
            JsonObject $$3 = $$2.getAsJsonObject();
            JsonParser $$4 = new JsonParser();
            JsonElement $$5 = $$4.parse($$3.get("options").getAsString());
            emt $$6;
            if ($$5 == null) {
               $$6 = emt.a();
            } else {
               $$6 = emt.a($$5.getAsJsonObject());
            }

            int $$8 = eoy.a("slotId", $$3, -1);
            $$1.put($$8, $$6);
         } catch (Exception var9) {
         }
      }

      for (int $$9 = 1; $$9 <= 3; $$9++) {
         if (!$$1.containsKey($$9)) {
            $$1.put($$9, emt.b());
         }
      }

      return $$1;
   }

   private static Map<Integer, emt> e() {
      Map<Integer, emt> $$0 = Maps.newHashMap();
      $$0.put(1, emt.b());
      $$0.put(2, emt.b());
      $$0.put(3, emt.b());
      return $$0;
   }

   public static emm c(String $$0) {
      try {
         return a(new JsonParser().parse($$0).getAsJsonObject());
      } catch (Exception var2) {
         s.error("Could not parse McoServer: {}", var2.getMessage());
         return new emm();
      }
   }

   private static emm.b e(String $$0) {
      try {
         return emm.b.valueOf($$0);
      } catch (Exception var2) {
         return emm.b.a;
      }
   }

   private static emm.c f(String $$0) {
      try {
         return emm.c.valueOf($$0);
      } catch (Exception var2) {
         return emm.c.a;
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
         emm $$1 = (emm)$$0;
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

   public emm d() {
      emm $$0 = new emm();
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
      $$0.r = new emp();
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

   public Map<Integer, emt> a(Map<Integer, emt> $$0) {
      Map<Integer, emt> $$1 = Maps.newHashMap();

      for (Entry<Integer, emt> $$2 : $$0.entrySet()) {
         $$1.put($$2.getKey(), $$2.getValue().d());
      }

      return $$1;
   }

   public String a(int $$0) {
      return this.c + " (" + this.i.get($$0).a($$0) + ")";
   }

   public fix d(String $$0) {
      return new fix(this.c, $$0, fix.b.b);
   }

   public static class a implements Comparator<emm> {
      private final String a;

      public a(String $$0) {
         this.a = $$0;
      }

      public int a(emm $$0, emm $$1) {
         return ComparisonChain.start()
            .compareTrueFirst($$0.e == emm.b.c, $$1.e == emm.b.c)
            .compareTrueFirst($$0.k, $$1.k)
            .compareTrueFirst($$0.f.equals(this.a), $$1.f.equals(this.a))
            .compareFalseFirst($$0.j, $$1.j)
            .compareTrueFirst($$0.e == emm.b.b, $$1.e == emm.b.b)
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
