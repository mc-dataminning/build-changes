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
   public static final ah a = new ah(0, new aer[0], new aer[0], dm.a.a);
   private final int b;
   private final aer[] c;
   private final aer[] d;
   private final dm.a e;

   public ah(int $$0, aer[] $$1, aer[] $$2, dm.a $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public aer[] a() {
      return this.d;
   }

   public void a(akl $$0) {
      $$0.d(this.b);
      ecn $$1 = new ecn.a($$0.x()).a(ees.a, $$0).a(ees.f, $$0.di()).a(eer.k);
      boolean $$2 = false;

      for (aer $$3 : this.c) {
         ObjectListIterator var8 = $$0.d.aH().getLootTable($$3).a($$1).iterator();

         while (var8.hasNext()) {
            ciy $$4 = (ciy)var8.next();
            if ($$0.i($$4)) {
               $$0.dK().a(null, $$0.dp(), $$0.dr(), $$0.dv(), aow.ma, aox.h, 0.2F, (($$0.ee().i() - $$0.ee().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               byg $$5 = $$0.a($$4, false);
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

            for (aer $$2 : this.c) {
               $$1.add($$2.toString());
            }

            $$0.add("loot", $$1);
         }

         if (this.d.length > 0) {
            JsonArray $$3 = new JsonArray();

            for (aer $$4 : this.d) {
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
      int $$1 = arg.a($$0, "experience", 0);
      JsonArray $$2 = arg.a($$0, "loot", new JsonArray());
      aer[] $$3 = new aer[$$2.size()];

      for (int $$4 = 0; $$4 < $$3.length; $$4++) {
         $$3[$$4] = new aer(arg.a($$2.get($$4), "loot[" + $$4 + "]"));
      }

      JsonArray $$5 = arg.a($$0, "recipes", new JsonArray());
      aer[] $$6 = new aer[$$5.size()];

      for (int $$7 = 0; $$7 < $$6.length; $$7++) {
         $$6[$$7] = new aer(arg.a($$5.get($$7), "recipes[" + $$7 + "]"));
      }

      dm.a $$8;
      if ($$0.has("function")) {
         $$8 = new dm.a(new aer(arg.i($$0, "function")));
      } else {
         $$8 = dm.a.a;
      }

      return new ah($$1, $$3, $$6, $$8);
   }

   public static class a {
      private int a;
      private final List<aer> b = Lists.newArrayList();
      private final List<aer> c = Lists.newArrayList();
      @Nullable
      private aer d;

      public static ah.a a(int $$0) {
         return new ah.a().b($$0);
      }

      public ah.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static ah.a a(aer $$0) {
         return new ah.a().b($$0);
      }

      public ah.a b(aer $$0) {
         this.b.add($$0);
         return this;
      }

      public static ah.a c(aer $$0) {
         return new ah.a().d($$0);
      }

      public ah.a d(aer $$0) {
         this.c.add($$0);
         return this;
      }

      public static ah.a e(aer $$0) {
         return new ah.a().f($$0);
      }

      public ah.a f(aer $$0) {
         this.d = $$0;
         return this;
      }

      public ah a() {
         return new ah(this.a, this.b.toArray(new aer[0]), this.c.toArray(new aer[0]), this.d == null ? dm.a.a : new dm.a(this.d));
      }
   }
}
