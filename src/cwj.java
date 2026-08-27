import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwj extends cur {
   public static final MapCodec<cwj> a = b(cwj::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<die> c = List.of(did.bp, did.bq, did.br, did.bs, did.bt, did.bu);

   @Override
   public MapCodec<cwj> a() {
      return a;
   }

   public cwj(dhm.d $$0) {
      super($$0);
      dhn $$1 = this.E.b().a(cza.aE, ib.c);

      for (die $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.c;
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if ($$1.c_($$2) instanceof dfr $$6) {
         Optional<ejy> $$8 = a($$5, $$0.c(cza.aE));
         if ($$8.isEmpty()) {
            return bjb.d;
         } else {
            int $$9 = a($$8.get());
            if ($$0.c(c.get($$9))) {
               a($$1, $$2, $$3, $$6, $$9);
               return bjb.a($$1.B);
            } else {
               clo $$10 = $$3.b($$4);
               if ($$10.a(ars.av)) {
                  a($$1, $$2, $$3, $$6, $$10, $$9);
                  return bjb.a($$1.B);
               } else {
                  return bjb.b;
               }
            }
         }
      } else {
         return bjb.d;
      }
   }

   private static Optional<ejy> a(ejv $$0, ib $$1) {
      ib $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         hx $$3 = $$0.a().a($$2);
         ejz $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new ejy((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new ejy((float)$$5, (float)$$6));
            case e -> Optional.of(new ejy((float)$$7, (float)$$6));
            case f -> Optional.of(new ejy((float)(1.0 - $$7), (float)$$6));
            case a, b -> Optional.empty();
         };
      }
   }

   private static int a(ejy $$0) {
      int $$1 = $$0.j >= 0.5F ? 0 : 1;
      int $$2 = a($$0.i);
      return $$2 + $$1 * 3;
   }

   private static int a(float $$0) {
      float $$1 = 0.0625F;
      float $$2 = 0.375F;
      if ($$0 < 0.375F) {
         return 0;
      } else {
         float $$3 = 0.6875F;
         return $$0 < 0.6875F ? 1 : 2;
      }
   }

   private static void a(csf $$0, hx $$1, cdz $$2, dfr $$3, clo $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(arf.c.b($$4.d()));
         aqu $$6 = $$4.a(clr.uo) ? aqv.et : aqv.es;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, aqw.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.g(1);
         }
      }
   }

   private static void a(csf $$0, hx $$1, cdz $$2, dfr $$3, int $$4) {
      if (!$$0.B) {
         clo $$5 = $$3.a($$4, 1);
         aqu $$6 = $$5.a(clr.uo) ? aqv.ew : aqv.ev;
         $$0.a(null, $$1, $$6, aqw.e, 1.0F, 1.0F);
         if (!$$2.fT().e($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dlx.c, $$1);
      }
   }

   @Nullable
   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dfr($$0, $$1);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(cza.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dfr $$6 && !$$6.aj_()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               clo $$8 = $$6.a($$7);
               if (!$$8.b()) {
                  bix.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dhn a(cnw $$0) {
      return this.o().a(cza.aE, $$0.g().g());
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(cza.aE, $$1.a($$0.c(cza.aE)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(cza.aE)));
   }

   @Override
   public boolean d_(dhn $$0) {
      return true;
   }

   @Override
   public int a(dhn $$0, csf $$1, hx $$2) {
      if ($$1.y_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dfr $$3 ? $$3.g() + 1 : 0;
      }
   }
}
