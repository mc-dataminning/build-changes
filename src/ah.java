import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ah {
   public static final ah a = new ah(0, new aep[0], new aep[0], dn.a.a);
   private final int b;
   private final aep[] c;
   private final aep[] d;
   private final dn.a e;

   public ah(int $$0, aep[] $$1, aep[] $$2, dn.a $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public aep[] a() {
      return this.d;
   }

   public void a(akj $$0) {
      $$0.d(this.b);
      ecn $$1 = new ecn.a($$0.x()).a(eet.a, $$0).a(eet.f, $$0.di()).a(ees.j);
      boolean $$2 = false;

      for (aep $$3 : this.c) {
         ObjectListIterator var8 = $$0.d.aH().getLootTable($$3).a($$1).iterator();

         while (var8.hasNext()) {
            ciw $$4 = (ciw)var8.next();
            if ($$0.i($$4)) {
               $$0.dK().a(null, $$0.dp(), $$0.dr(), $$0.dv(), aou.ma, aov.h, 0.2F, (($$0.ee().i() - $$0.ee().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               bye $$5 = $$0.a($$4, false);
               if ($$5 != null) {
                  $$5.p();
                  $$5.b($$0.cv());
               }
            }
         }
      }

      if ($$2) {
         $$0.bQ.d();
      }

      if (this.d.length > 0) {
         $$0.a(this.d);
      }

      MinecraftServer $$6 = $$0.d;
      this.e.a($$6.aA()).ifPresent($$2x -> $$6.aA().a($$2x, $$0.dc().a().a(2)));
   }

   @Override
   public String toString() {
      return "AdvancementRewards{experience="
         + this.b
         + ", loot="
         + Arrays.toString((Object[])this.c)
         + ", recipes="
         + Arrays.toString((Object[])this.d)
         + ", function="
         + this.e
         + "}";
   }

   public JsonElement b() {
      if (this == a) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject $$0 = new JsonObject();
         if (this.b != 0) {
            $$0.addProperty("experience", this.b);
         }

         if (this.c.length > 0) {
            JsonArray $$1 = new JsonArray();

            for (aep $$2 : this.c) {
               $$1.add($$2.toString());
            }

            $$0.add("loot", $$1);
         }

         if (this.d.length > 0) {
            JsonArray $$3 = new JsonArray();

            for (aep $$4 : this.d) {
               $$3.add($$4.toString());
            }

            $$0.add("recipes", $$3);
         }

         if (this.e.a() != null) {
            $$0.addProperty("function", this.e.a().toString());
         }

         return $$0;
      }
   }

   public static ah a(JsonObject $$0) throws JsonParseException {
      int $$1 = arf.a($$0, "experience", 0);
      JsonArray $$2 = arf.a($$0, "loot", new JsonArray());
      aep[] $$3 = new aep[$$2.size()];

      for (int $$4 = 0; $$4 < $$3.length; $$4++) {
         $$3[$$4] = new aep(arf.a($$2.get($$4), "loot[" + $$4 + "]"));
      }

      JsonArray $$5 = arf.a($$0, "recipes", new JsonArray());
      aep[] $$6 = new aep[$$5.size()];

      for (int $$7 = 0; $$7 < $$6.length; $$7++) {
         $$6[$$7] = new aep(arf.a($$5.get($$7), "recipes[" + $$7 + "]"));
      }

      dn.a $$8;
      if ($$0.has("function")) {
         $$8 = new dn.a(new aep(arf.i($$0, "function")));
      } else {
         $$8 = dn.a.a;
      }

      return new ah($$1, $$3, $$6, $$8);
   }

   public static class a {
      private int a;
      private final List<aep> b = Lists.newArrayList();
      private final List<aep> c = Lists.newArrayList();
      @Nullable
      private aep d;

      public static ah.a a(int $$0) {
         return new ah.a().b($$0);
      }

      public ah.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static ah.a a(aep $$0) {
         return new ah.a().b($$0);
      }

      public ah.a b(aep $$0) {
         this.b.add($$0);
         return this;
      }

      public static ah.a c(aep $$0) {
         return new ah.a().d($$0);
      }

      public ah.a d(aep $$0) {
         this.c.add($$0);
         return this;
      }

      public static ah.a e(aep $$0) {
         return new ah.a().f($$0);
      }

      public ah.a f(aep $$0) {
         this.d = $$0;
         return this;
      }

      public ah a() {
         return new ah(this.a, this.b.toArray(new aep[0]), this.c.toArray(new aep[0]), this.d == null ? dn.a.a : new dn.a(this.d));
      }
   }
}
