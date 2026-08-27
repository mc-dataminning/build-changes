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
   public static final aj a = new aj(0, new aey[0], new aey[0], dp.a.a);
   private final int b;
   private final aey[] c;
   private final aey[] d;
   private final dp.a e;

   public aj(int $$0, aey[] $$1, aey[] $$2, dp.a $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public aey[] a() {
      return this.d;
   }

   public void a(akt $$0) {
      $$0.d(this.b);
      ecy $$1 = new ecy.a($$0.x()).a(efd.a, $$0).a(efd.f, $$0.dj()).a(efc.k);
      boolean $$2 = false;

      for (aey $$3 : this.c) {
         ObjectListIterator var8 = $$0.d.aH().getLootTable($$3).a($$1).iterator();

         while (var8.hasNext()) {
            cjh $$4 = (cjh)var8.next();
            if ($$0.i($$4)) {
               $$0.dL().a(null, $$0.dq(), $$0.ds(), $$0.dw(), apf.ma, apg.h, 0.2F, (($$0.ef().i() - $$0.ef().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               byp $$5 = $$0.a($$4, false);
               if ($$5 != null) {
                  $$5.w();
                  $$5.b($$0.cv());
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

            for (aey $$2 : this.c) {
               $$1.add($$2.toString());
            }

            $$0.add("loot", $$1);
         }

         if (this.d.length > 0) {
            JsonArray $$3 = new JsonArray();

            for (aey $$4 : this.d) {
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
      int $$1 = arp.a($$0, "experience", 0);
      JsonArray $$2 = arp.a($$0, "loot", new JsonArray());
      aey[] $$3 = new aey[$$2.size()];

      for (int $$4 = 0; $$4 < $$3.length; $$4++) {
         $$3[$$4] = new aey(arp.a($$2.get($$4), "loot[" + $$4 + "]"));
      }

      JsonArray $$5 = arp.a($$0, "recipes", new JsonArray());
      aey[] $$6 = new aey[$$5.size()];

      for (int $$7 = 0; $$7 < $$6.length; $$7++) {
         $$6[$$7] = new aey(arp.a($$5.get($$7), "recipes[" + $$7 + "]"));
      }

      dp.a $$8;
      if ($$0.has("function")) {
         $$8 = new dp.a(new aey(arp.i($$0, "function")));
      } else {
         $$8 = dp.a.a;
      }

      return new aj($$1, $$3, $$6, $$8);
   }

   public static class a {
      private int a;
      private final List<aey> b = Lists.newArrayList();
      private final List<aey> c = Lists.newArrayList();
      @Nullable
      private aey d;

      public static aj.a a(int $$0) {
         return new aj.a().b($$0);
      }

      public aj.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static aj.a a(aey $$0) {
         return new aj.a().b($$0);
      }

      public aj.a b(aey $$0) {
         this.b.add($$0);
         return this;
      }

      public static aj.a c(aey $$0) {
         return new aj.a().d($$0);
      }

      public aj.a d(aey $$0) {
         this.c.add($$0);
         return this;
      }

      public static aj.a e(aey $$0) {
         return new aj.a().f($$0);
      }

      public aj.a f(aey $$0) {
         this.d = $$0;
         return this;
      }

      public aj a() {
         return new aj(this.a, this.b.toArray(new aey[0]), this.c.toArray(new aey[0]), this.d == null ? dp.a.a : new dp.a(this.d));
      }
   }
}
