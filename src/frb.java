import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class frb {
   private final Long2ObjectMap<frb.a> a = new Long2ObjectOpenHashMap();

   @Nullable
   public fra a(cpv $$0, gw $$1, gw $$2, int $$3) {
      int $$4 = hw.a($$1.u() - $$3);
      int $$5 = hw.a($$1.w() - $$3);
      int $$6 = hw.a($$2.u() + $$3);
      int $$7 = hw.a($$2.w() + $$3);
      frb.a[][] $$8 = new frb.a[$$6 - $$4 + 1][$$7 - $$5 + 1];

      for (int $$9 = $$4; $$9 <= $$6; $$9++) {
         for (int $$10 = $$5; $$10 <= $$7; $$10++) {
            $$8[$$9 - $$4][$$10 - $$5] = (frb.a)this.a.computeIfAbsent(cpc.c($$9, $$10), $$1x -> new frb.a($$0.d(cpc.a($$1x), cpc.b($$1x))));
         }
      }

      if (a($$1, $$2, $$4, $$5, $$8)) {
         return null;
      } else {
         fqz[][] $$11 = new fqz[$$6 - $$4 + 1][$$7 - $$5 + 1];

         for (int $$12 = $$4; $$12 <= $$6; $$12++) {
            for (int $$13 = $$5; $$13 <= $$7; $$13++) {
               $$11[$$12 - $$4][$$13 - $$5] = $$8[$$12 - $$4][$$13 - $$5].b();
            }
         }

         return new fra($$0, $$4, $$5, $$11);
      }
   }

   private static boolean a(gw $$0, gw $$1, int $$2, int $$3, frb.a[][] $$4) {
      int $$5 = hw.a($$0.u());
      int $$6 = hw.a($$0.w());
      int $$7 = hw.a($$1.u());
      int $$8 = hw.a($$1.w());

      for (int $$9 = $$5; $$9 <= $$7; $$9++) {
         for (int $$10 = $$6; $$10 <= $$8; $$10++) {
            dhq $$11 = $$4[$$9 - $$2][$$10 - $$3].a();
            if (!$$11.a($$0.v(), $$1.v())) {
               return false;
            }
         }
      }

      return true;
   }

   static final class a {
      private final dhq a;
      @Nullable
      private fqz b;

      a(dhq $$0) {
         this.a = $$0;
      }

      public dhq a() {
         return this.a;
      }

      public fqz b() {
         if (this.b == null) {
            this.b = new fqz(this.a);
         }

         return this.b;
      }
   }
}
