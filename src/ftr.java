import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class ftr {
   private final Long2ObjectMap<ftr.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public ftq a(csa $$0, ht $$1, ht $$2, int $$3) {
      int $$4 = iu.a($$1.u() - $$3);
      int $$5 = iu.a($$1.w() - $$3);
      int $$6 = iu.a($$2.u() + $$3);
      int $$7 = iu.a($$2.w() + $$3);
      ftr.a[][] $$8 = new ftr.a[$$6 - $$4 + 1][$$7 - $$5 + 1];

      for (int $$9 = $$4; $$9 <= $$6; $$9++) {
         for (int $$10 = $$5; $$10 <= $$7; $$10++) {
            $$8[$$9 - $$4][$$10 - $$5] = (ftr.a)this.a.computeIfAbsent(crh.c($$9, $$10), $$1x -> new ftr.a($$0.d(crh.a($$1x), crh.b($$1x))));
         }
      }

      if (a($$1, $$2, $$4, $$5, $$8)) {
         return null;
      } else {
         ftp[][] $$11 = new ftp[$$6 - $$4 + 1][$$7 - $$5 + 1];

         for (int $$12 = $$4; $$12 <= $$6; $$12++) {
            for (int $$13 = $$5; $$13 <= $$7; $$13++) {
               $$11[$$12 - $$4][$$13 - $$5] = $$8[$$12 - $$4][$$13 - $$5].b();
            }
         }

         return new ftq($$0, $$4, $$5, $$11);
      }
   }

   private static boolean a(ht $$0, ht $$1, int $$2, int $$3, ftr.a[][] $$4) {
      int $$5 = iu.a($$0.u());
      int $$6 = iu.a($$0.w());
      int $$7 = iu.a($$1.u());
      int $$8 = iu.a($$1.w());

      for (int $$9 = $$5; $$9 <= $$7; $$9++) {
         for (int $$10 = $$6; $$10 <= $$8; $$10++) {
            djp $$11 = $$4[$$9 - $$2][$$10 - $$3].a();
            if (!$$11.a($$0.v(), $$1.v())) {
               return false;
            }
         }
      }

      return true;
   }

   static final class a {
      private final djp a;
      @Nullable
      private ftp b;

      a(djp $$0) {
         this.a = $$0;
      }

      public djp a() {
         return this.a;
      }

      public ftp b() {
         if (this.b == null) {
            this.b = new ftp(this.a);
         }

         return this.b;
      }
   }
}
