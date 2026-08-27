import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class fqd {
   private final Long2ObjectMap<fqd.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public fqc a(cpk $$0, gv $$1, gv $$2, int $$3) {
      int $$4 = hy.a($$1.u() - $$3);
      int $$5 = hy.a($$1.w() - $$3);
      int $$6 = hy.a($$2.u() + $$3);
      int $$7 = hy.a($$2.w() + $$3);
      fqd.a[][] $$8 = new fqd.a[$$6 - $$4 + 1][$$7 - $$5 + 1];

      for (int $$9 = $$4; $$9 <= $$6; $$9++) {
         for (int $$10 = $$5; $$10 <= $$7; $$10++) {
            $$8[$$9 - $$4][$$10 - $$5] = (fqd.a)this.a.computeIfAbsent(cor.c($$9, $$10), $$1x -> new fqd.a($$0.d(cor.a($$1x), cor.b($$1x))));
         }
      }

      if (a($$1, $$2, $$4, $$5, $$8)) {
         return null;
      } else {
         fqb[][] $$11 = new fqb[$$6 - $$4 + 1][$$7 - $$5 + 1];

         for (int $$12 = $$4; $$12 <= $$6; $$12++) {
            for (int $$13 = $$5; $$13 <= $$7; $$13++) {
               $$11[$$12 - $$4][$$13 - $$5] = $$8[$$12 - $$4][$$13 - $$5].b();
            }
         }

         return new fqc($$0, $$4, $$5, $$11);
      }
   }

   private static boolean a(gv $$0, gv $$1, int $$2, int $$3, fqd.a[][] $$4) {
      int $$5 = hy.a($$0.u());
      int $$6 = hy.a($$0.w());
      int $$7 = hy.a($$1.u());
      int $$8 = hy.a($$1.w());

      for (int $$9 = $$5; $$9 <= $$7; $$9++) {
         for (int $$10 = $$6; $$10 <= $$8; $$10++) {
            dhf $$11 = $$4[$$9 - $$2][$$10 - $$3].a();
            if (!$$11.a($$0.v(), $$1.v())) {
               return false;
            }
         }
      }

      return true;
   }

   static final class a {
      private final dhf a;
      @Nullable
      private fqb b;

      a(dhf $$0) {
         this.a = $$0;
      }

      public dhf a() {
         return this.a;
      }

      public fqb b() {
         if (this.b == null) {
            this.b = new fqb(this.a);
         }

         return this.b;
      }
   }
}
