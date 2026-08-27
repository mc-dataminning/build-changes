import com.google.common.base.Joiner;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
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

public class emo extends end {
   private static final Logger s = LogUtils.getLogger();
   public long a;
   public String b;
   public String c;
   public String d;
   public emo.b e;
   public String f;
   public UUID g = ac.c;
   public List<emk> h;
   public Map<Integer, emv> i;
   public boolean j;
   public boolean k;
   public int l;
   public emo.c m;
   public int n;
   public String o;
   public int p;
   public String q;
   public emr r = new emr();

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

   public void a(ems $$0) {
      List<String> $$1 = Lists.newArrayList();
      int $$2 = 0;
      MinecraftSessionService $$3 = eqn.N().aj();

      for (UUID $$4 : $$0.b) {
         if (!eqn.N().b($$4)) {
            try {
               GameProfile $$5 = $$3.fetchProfile($$4, false);
               if ($$5 != null) {
                  $$1.add($$5.getName());
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

   public static emo a(JsonObject $$0) {
      emo $$1 = new emo();

      try {
         $$1.a = epa.a("id", $$0, -1L);
         $$1.b = epa.a("remoteSubscriptionId", $$0, null);
         $$1.c = epa.a("name", $$0, null);
         $$1.d = epa.a("motd", $$0, null);
         $$1.e = e(epa.a("state", $$0, emo.b.a.name()));
         $$1.f = epa.a("owner", $$0, null);
         if ($$0.get("players") != null && $$0.get("players").isJsonArray()) {
            $$1.h = a($$0.get("players").getAsJsonArray());
            a($$1);
         } else {
            $$1.h = Lists.newArrayList();
         }

         $$1.l = epa.a("daysLeft", $$0, 0);
         $$1.j = epa.a("expired", $$0, false);
         $$1.k = epa.a("expiredTrial", $$0, false);
         $$1.m = f(epa.a("worldType", $$0, emo.c.a.name()));
         $$1.g = epa.a("ownerUUID", $$0, ac.c);
         if ($$0.get("slots") != null && $$0.get("slots").isJsonArray()) {
            $$1.i = b($$0.get("slots").getAsJsonArray());
         } else {
            $$1.i = e();
         }

         $$1.o = epa.a("minigameName", $$0, null);
         $$1.n = epa.a("activeSlot", $$0, -1);
         $$1.p = epa.a("minigameId", $$0, -1);
         $$1.q = epa.a("minigameImage", $$0, null);
      } catch (Exception var3) {
         s.error("Could not parse McoServer: {}", var3.getMessage());
      }

      return $$1;
   }

   private static void a(emo $$0) {
      $$0.h
         .sort(
            ($$0x, $$1) -> ComparisonChain.start()
                  .compareFalseFirst($$1.d(), $$0x.d())
                  .compare($$0x.a().toLowerCase(Locale.ROOT), $$1.a().toLowerCase(Locale.ROOT))
                  .result()
         );
   }

   private static List<emk> a(JsonArray $$0) {
      List<emk> $$1 = Lists.newArrayList();

      for (JsonElement $$2 : $$0) {
         try {
            JsonObject $$3 = $$2.getAsJsonObject();
            emk $$4 = new emk();
            $$4.a(epa.a("name", $$3, null));
            $$4.a(epa.a("uuid", $$3, ac.c));
            $$4.a(epa.a("operator", $$3, false));
            $$4.b(epa.a("accepted", $$3, false));
            $$4.c(epa.a("online", $$3, false));
            $$1.add($$4);
         } catch (Exception var6) {
         }
      }

      return $$1;
   }

   private static Map<Integer, emv> b(JsonArray $$0) {
      Map<Integer, emv> $$1 = Maps.newHashMap();

      for (JsonElement $$2 : $$0) {
         try {
            JsonObject $$3 = $$2.getAsJsonObject();
            JsonParser $$4 = new JsonParser();
            JsonElement $$5 = $$4.parse($$3.get("options").getAsString());
            emv $$6;
            if ($$5 == null) {
               $$6 = emv.a();
            } else {
               $$6 = emv.a($$5.getAsJsonObject());
            }

            int $$8 = epa.a("slotId", $$3, -1);
            $$1.put($$8, $$6);
         } catch (Exception var9) {
         }
      }

      for (int $$9 = 1; $$9 <= 3; $$9++) {
         if (!$$1.containsKey($$9)) {
            $$1.put($$9, emv.b());
         }
      }

      return $$1;
   }

   private static Map<Integer, emv> e() {
      Map<Integer, emv> $$0 = Maps.newHashMap();
      $$0.put(1, emv.b());
      $$0.put(2, emv.b());
      $$0.put(3, emv.b());
      return $$0;
   }

   public static emo c(String $$0) {
      try {
         return a(new JsonParser().parse($$0).getAsJsonObject());
      } catch (Exception var2) {
         s.error("Could not parse McoServer: {}", var2.getMessage());
         return new emo();
      }
   }

   private static emo.b e(String $$0) {
      try {
         return emo.b.valueOf($$0);
      } catch (Exception var2) {
         return emo.b.a;
      }
   }

   private static emo.c f(String $$0) {
      try {
         return emo.c.valueOf($$0);
      } catch (Exception var2) {
         return emo.c.a;
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
         emo $$1 = (emo)$$0;
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

   public emo d() {
      emo $$0 = new emo();
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
      $$0.r = new emr();
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

   public Map<Integer, emv> a(Map<Integer, emv> $$0) {
      Map<Integer, emv> $$1 = Maps.newHashMap();

      for (Entry<Integer, emv> $$2 : $$0.entrySet()) {
         $$1.put($$2.getKey(), $$2.getValue().d());
      }

      return $$1;
   }

   public String a(int $$0) {
      return this.c + " (" + this.i.get($$0).a($$0) + ")";
   }

   public fin d(String $$0) {
      return new fin(this.c, $$0, fin.b.b);
   }

   public static class a implements Comparator<emo> {
      private final String a;

      public a(String $$0) {
         this.a = $$0;
      }

      public int a(emo $$0, emo $$1) {
         return ComparisonChain.start()
            .compareTrueFirst($$0.e == emo.b.c, $$1.e == emo.b.c)
            .compareTrueFirst($$0.k, $$1.k)
            .compareTrueFirst($$0.f.equals(this.a), $$1.f.equals(this.a))
            .compareFalseFirst($$0.j, $$1.j)
            .compareTrueFirst($$0.e == emo.b.b, $$1.e == emo.b.b)
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
