import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class ftw {
   private final Long2ObjectMap<ftw.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public ftv a(csf $$0, hx $$1, hx $$2, int $$3) {
      int $$4 = iy.a($$1.u() - $$3);
      int $$5 = iy.a($$1.w() - $$3);
      int $$6 = iy.a($$2.u() + $$3);
      int $$7 = iy.a($$2.w() + $$3);
      ftw.a[][] $$8 = new ftw.a[$$6 - $$4 + 1][$$7 - $$5 + 1];

      for (int $$9 = $$4; $$9 <= $$6; $$9++) {
         for (int $$10 = $$5; $$10 <= $$7; $$10++) {
            $$8[$$9 - $$4][$$10 - $$5] = (ftw.a)this.a.computeIfAbsent(crm.c($$9, $$10), $$1x -> new ftw.a($$0.d(crm.a($$1x), crm.b($$1x))));
         }
      }

      if (a($$1, $$2, $$4, $$5, $$8)) {
         return null;
      } else {
         ftu[][] $$11 = new ftu[$$6 - $$4 + 1][$$7 - $$5 + 1];

         for (int $$12 = $$4; $$12 <= $$6; $$12++) {
            for (int $$13 = $$5; $$13 <= $$7; $$13++) {
               $$11[$$12 - $$4][$$13 - $$5] = $$8[$$12 - $$4][$$13 - $$5].b();
            }
         }

         return new ftv($$0, $$4, $$5, $$11);
      }
   }

   private static boolean a(hx $$0, hx $$1, int $$2, int $$3, ftw.a[][] $$4) {
      int $$5 = iy.a($$0.u());
      int $$6 = iy.a($$0.w());
      int $$7 = iy.a($$1.u());
      int $$8 = iy.a($$1.w());

      for (int $$9 = $$5; $$9 <= $$7; $$9++) {
         for (int $$10 = $$6; $$10 <= $$8; $$10++) {
            dju $$11 = $$4[$$9 - $$2][$$10 - $$3].a();
            if (!$$11.a($$0.v(), $$1.v())) {
               return false;
            }
         }
      }

      return true;
   }

   static final class a {
      private final dju a;
      @Nullable
      private ftu b;

      a(dju $$0) {
         this.a = $$0;
      }

      public dju a() {
         return this.a;
      }

      public ftu b() {
         if (this.b == null) {
            this.b = new ftu(this.a);
         }

         return this.b;
      }
   }
}
