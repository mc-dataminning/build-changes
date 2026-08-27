import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class frx {
   private final Long2ObjectMap<frx.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public frw a(cqz $$0, ht $$1, ht $$2, int $$3) {
      int $$4 = iu.a($$1.u() - $$3);
      int $$5 = iu.a($$1.w() - $$3);
      int $$6 = iu.a($$2.u() + $$3);
      int $$7 = iu.a($$2.w() + $$3);
      frx.a[][] $$8 = new frx.a[$$6 - $$4 + 1][$$7 - $$5 + 1];

      for (int $$9 = $$4; $$9 <= $$6; $$9++) {
         for (int $$10 = $$5; $$10 <= $$7; $$10++) {
            $$8[$$9 - $$4][$$10 - $$5] = (frx.a)this.a.computeIfAbsent(cqg.c($$9, $$10), $$1x -> new frx.a($$0.d(cqg.a($$1x), cqg.b($$1x))));
         }
      }

      if (a($$1, $$2, $$4, $$5, $$8)) {
         return null;
      } else {
         frv[][] $$11 = new frv[$$6 - $$4 + 1][$$7 - $$5 + 1];

         for (int $$12 = $$4; $$12 <= $$6; $$12++) {
            for (int $$13 = $$5; $$13 <= $$7; $$13++) {
               $$11[$$12 - $$4][$$13 - $$5] = $$8[$$12 - $$4][$$13 - $$5].b();
            }
         }

         return new frw($$0, $$4, $$5, $$11);
      }
   }

   private static boolean a(ht $$0, ht $$1, int $$2, int $$3, frx.a[][] $$4) {
      int $$5 = iu.a($$0.u());
      int $$6 = iu.a($$0.w());
      int $$7 = iu.a($$1.u());
      int $$8 = iu.a($$1.w());

      for (int $$9 = $$5; $$9 <= $$7; $$9++) {
         for (int $$10 = $$6; $$10 <= $$8; $$10++) {
            dii $$11 = $$4[$$9 - $$2][$$10 - $$3].a();
            if (!$$11.a($$0.v(), $$1.v())) {
               return false;
            }
         }
      }

      return true;
   }

   static final class a {
      private final dii a;
      @Nullable
      private frv b;

      a(dii $$0) {
         this.a = $$0;
      }

      public dii a() {
         return this.a;
      }

      public frv b() {
         if (this.b == null) {
            this.b = new frv(this.a);
         }

         return this.b;
      }
   }
}
