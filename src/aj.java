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

public class aj {
   public static final aj a = new aj(0, new aex[0], new aex[0], dp.a.a);
   private final int b;
   private final aex[] c;
   private final aex[] d;
   private final dp.a e;

   public aj(int $$0, aex[] $$1, aex[] $$2, dp.a $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public aex[] a() {
      return this.d;
   }

   public void a(aks $$0) {
      $$0.d(this.b);
      ecw $$1 = new ecw.a($$0.x()).a(efb.a, $$0).a(efb.f, $$0.dj()).a(efa.k);
      boolean $$2 = false;

      for (aex $$3 : this.c) {
         ObjectListIterator var8 = $$0.d.aH().getLootTable($$3).a($$1).iterator();

         while (var8.hasNext()) {
            cjf $$4 = (cjf)var8.next();
            if ($$0.i($$4)) {
               $$0.dL().a(null, $$0.dq(), $$0.ds(), $$0.dw(), ape.ma, apf.h, 0.2F, (($$0.ef().i() - $$0.ef().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               byn $$5 = $$0.a($$4, false);
               if ($$5 != null) {
                  $$5.w();
                  $$5.b($$0.cw());
               }
            }
         }
      }

      if ($$2) {
         $$0.bS.d();
      }

      if (this.d.length > 0) {
         $$0.a(this.d);
      }

      MinecraftServer $$6 = $$0.d;
      this.e.a($$6.aA()).ifPresent($$2x -> $$6.aA().a($$2x, $$0.dd().a().a(2)));
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

            for (aex $$2 : this.c) {
               $$1.add($$2.toString());
            }

            $$0.add("loot", $$1);
         }

         if (this.d.length > 0) {
            JsonArray $$3 = new JsonArray();

            for (aex $$4 : this.d) {
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

   public static aj a(JsonObject $$0) throws JsonParseException {
      int $$1 = aro.a($$0, "experience", 0);
      JsonArray $$2 = aro.a($$0, "loot", new JsonArray());
      aex[] $$3 = new aex[$$2.size()];

      for (int $$4 = 0; $$4 < $$3.length; $$4++) {
         $$3[$$4] = new aex(aro.a($$2.get($$4), "loot[" + $$4 + "]"));
      }

      JsonArray $$5 = aro.a($$0, "recipes", new JsonArray());
      aex[] $$6 = new aex[$$5.size()];

      for (int $$7 = 0; $$7 < $$6.length; $$7++) {
         $$6[$$7] = new aex(aro.a($$5.get($$7), "recipes[" + $$7 + "]"));
      }

      dp.a $$8;
      if ($$0.has("function")) {
         $$8 = new dp.a(new aex(aro.i($$0, "function")));
      } else {
         $$8 = dp.a.a;
      }

      return new aj($$1, $$3, $$6, $$8);
   }

   public static class a {
      private int a;
      private final List<aex> b = Lists.newArrayList();
      private final List<aex> c = Lists.newArrayList();
      @Nullable
      private aex d;

      public static aj.a a(int $$0) {
         return new aj.a().b($$0);
      }

      public aj.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static aj.a a(aex $$0) {
         return new aj.a().b($$0);
      }

      public aj.a b(aex $$0) {
         this.b.add($$0);
         return this;
      }

      public static aj.a c(aex $$0) {
         return new aj.a().d($$0);
      }

      public aj.a d(aex $$0) {
         this.c.add($$0);
         return this;
      }

      public static aj.a e(aex $$0) {
         return new aj.a().f($$0);
      }

      public aj.a f(aex $$0) {
         this.d = $$0;
         return this;
      }

      public aj a() {
         return new aj(this.a, this.b.toArray(new aex[0]), this.c.toArray(new aex[0]), this.d == null ? dp.a.a : new dp.a(this.d));
      }
   }
}
