import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class fqw {
   private final Long2ObjectMap<fqw.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public fqv a(cpq $$0, gw $$1, gw $$2, int $$3) {
      int $$4 = hz.a($$1.u() - $$3);
      int $$5 = hz.a($$1.w() - $$3);
      int $$6 = hz.a($$2.u() + $$3);
      int $$7 = hz.a($$2.w() + $$3);
      fqw.a[][] $$8 = new fqw.a[$$6 - $$4 + 1][$$7 - $$5 + 1];

      for (int $$9 = $$4; $$9 <= $$6; $$9++) {
         for (int $$10 = $$5; $$10 <= $$7; $$10++) {
            $$8[$$9 - $$4][$$10 - $$5] = (fqw.a)this.a.computeIfAbsent(cox.c($$9, $$10), $$1x -> new fqw.a($$0.d(cox.a($$1x), cox.b($$1x))));
         }
      }

      if (a($$1, $$2, $$4, $$5, $$8)) {
         return null;
      } else {
         fqu[][] $$11 = new fqu[$$6 - $$4 + 1][$$7 - $$5 + 1];

         for (int $$12 = $$4; $$12 <= $$6; $$12++) {
            for (int $$13 = $$5; $$13 <= $$7; $$13++) {
               $$11[$$12 - $$4][$$13 - $$5] = $$8[$$12 - $$4][$$13 - $$5].b();
            }
         }

         return new fqv($$0, $$4, $$5, $$11);
      }
   }

   private static boolean a(gw $$0, gw $$1, int $$2, int $$3, fqw.a[][] $$4) {
      int $$5 = hz.a($$0.u());
      int $$6 = hz.a($$0.w());
      int $$7 = hz.a($$1.u());
      int $$8 = hz.a($$1.w());

      for (int $$9 = $$5; $$9 <= $$7; $$9++) {
         for (int $$10 = $$6; $$10 <= $$8; $$10++) {
            dhl $$11 = $$4[$$9 - $$2][$$10 - $$3].a();
            if (!$$11.a($$0.v(), $$1.v())) {
               return false;
            }
         }
      }

      return true;
   }

   static final class a {
      private final dhl a;
      @Nullable
      private fqu b;

      a(dhl $$0) {
         this.a = $$0;
      }

      public dhl a() {
         return this.a;
      }

      public fqu b() {
         if (this.b == null) {
            this.b = new fqu(this.a);
         }

         return this.b;
      }
   }
}
