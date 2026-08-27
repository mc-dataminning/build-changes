import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class fqi {
   private final Long2ObjectMap<fqi.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public fqh a(cpm $$0, gu $$1, gu $$2, int $$3) {
      int $$4 = hx.a($$1.u() - $$3);
      int $$5 = hx.a($$1.w() - $$3);
      int $$6 = hx.a($$2.u() + $$3);
      int $$7 = hx.a($$2.w() + $$3);
      fqi.a[][] $$8 = new fqi.a[$$6 - $$4 + 1][$$7 - $$5 + 1];

      for (int $$9 = $$4; $$9 <= $$6; $$9++) {
         for (int $$10 = $$5; $$10 <= $$7; $$10++) {
            $$8[$$9 - $$4][$$10 - $$5] = (fqi.a)this.a.computeIfAbsent(cot.c($$9, $$10), $$1x -> new fqi.a($$0.d(cot.a($$1x), cot.b($$1x))));
         }
      }

      if (a($$1, $$2, $$4, $$5, $$8)) {
         return null;
      } else {
         fqg[][] $$11 = new fqg[$$6 - $$4 + 1][$$7 - $$5 + 1];

         for (int $$12 = $$4; $$12 <= $$6; $$12++) {
            for (int $$13 = $$5; $$13 <= $$7; $$13++) {
               $$11[$$12 - $$4][$$13 - $$5] = $$8[$$12 - $$4][$$13 - $$5].b();
            }
         }

         return new fqh($$0, $$4, $$5, $$11);
      }
   }

   private static boolean a(gu $$0, gu $$1, int $$2, int $$3, fqi.a[][] $$4) {
      int $$5 = hx.a($$0.u());
      int $$6 = hx.a($$0.w());
      int $$7 = hx.a($$1.u());
      int $$8 = hx.a($$1.w());

      for (int $$9 = $$5; $$9 <= $$7; $$9++) {
         for (int $$10 = $$6; $$10 <= $$8; $$10++) {
            dhh $$11 = $$4[$$9 - $$2][$$10 - $$3].a();
            if (!$$11.a($$0.v(), $$1.v())) {
               return false;
            }
         }
      }

      return true;
   }

   static final class a {
      private final dhh a;
      @Nullable
      private fqg b;

      a(dhh $$0) {
         this.a = $$0;
      }

      public dhh a() {
         return this.a;
      }

      public fqg b() {
         if (this.b == null) {
            this.b = new fqg(this.a);
         }

         return this.b;
      }
   }
}
