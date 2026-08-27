import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class fte {
   private final Long2ObjectMap<fte.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public ftd a(crs $$0, ht $$1, ht $$2, int $$3) {
      int $$4 = iu.a($$1.u() - $$3);
      int $$5 = iu.a($$1.w() - $$3);
      int $$6 = iu.a($$2.u() + $$3);
      int $$7 = iu.a($$2.w() + $$3);
      fte.a[][] $$8 = new fte.a[$$6 - $$4 + 1][$$7 - $$5 + 1];

      for (int $$9 = $$4; $$9 <= $$6; $$9++) {
         for (int $$10 = $$5; $$10 <= $$7; $$10++) {
            $$8[$$9 - $$4][$$10 - $$5] = (fte.a)this.a.computeIfAbsent(cqz.c($$9, $$10), $$1x -> new fte.a($$0.d(cqz.a($$1x), cqz.b($$1x))));
         }
      }

      if (a($$1, $$2, $$4, $$5, $$8)) {
         return null;
      } else {
         ftc[][] $$11 = new ftc[$$6 - $$4 + 1][$$7 - $$5 + 1];

         for (int $$12 = $$4; $$12 <= $$6; $$12++) {
            for (int $$13 = $$5; $$13 <= $$7; $$13++) {
               $$11[$$12 - $$4][$$13 - $$5] = $$8[$$12 - $$4][$$13 - $$5].b();
            }
         }

         return new ftd($$0, $$4, $$5, $$11);
      }
   }

   private static boolean a(ht $$0, ht $$1, int $$2, int $$3, fte.a[][] $$4) {
      int $$5 = iu.a($$0.u());
      int $$6 = iu.a($$0.w());
      int $$7 = iu.a($$1.u());
      int $$8 = iu.a($$1.w());

      for (int $$9 = $$5; $$9 <= $$7; $$9++) {
         for (int $$10 = $$6; $$10 <= $$8; $$10++) {
            djd $$11 = $$4[$$9 - $$2][$$10 - $$3].a();
            if (!$$11.a($$0.v(), $$1.v())) {
               return false;
            }
         }
      }

      return true;
   }

   static final class a {
      private final djd a;
      @Nullable
      private ftc b;

      a(djd $$0) {
         this.a = $$0;
      }

      public djd a() {
         return this.a;
      }

      public ftc b() {
         if (this.b == null) {
            this.b = new ftc(this.a);
         }

         return this.b;
      }
   }
}
