import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ctn extends crx {
   private static final int c = 6;
   public static final int a = 3;
   public static final List<dfp> b = List.of(dfo.bp, dfo.bq, dfo.br, dfo.bs, dfo.bt, dfo.bu);

   public ctn(dex.d $$0) {
      super($$0);
      dey $$1 = this.C.b().a(cwd.aC, hb.c);

      for (dfp $$2 : b) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   public cyp b_(dey $$0) {
      return cyp.c;
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if ($$1.c_($$2) instanceof dct $$6) {
         Optional<ehe> $$8 = a($$5, $$0.c(cwd.aC));
         if ($$8.isEmpty()) {
            return bgo.d;
         } else {
            int $$9 = a($$8.get());
            if ($$0.c(b.get($$9))) {
               a($$1, $$2, $$3, $$6, $$9);
               return bgo.a($$1.B);
            } else {
               ciw $$10 = $$3.b($$4);
               if ($$10.a(apr.av)) {
                  a($$1, $$2, $$3, $$6, $$10, $$9);
                  return bgo.a($$1.B);
               } else {
                  return bgo.b;
               }
            }
         }
      } else {
         return bgo.d;
      }
   }

   private static Optional<ehe> a(ehb $$0, hb $$1) {
      hb $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         gv $$3 = $$0.a().a($$2);
         ehf $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new ehe((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new ehe((float)$$5, (float)$$6));
            case e -> Optional.of(new ehe((float)$$7, (float)$$6));
            case f -> Optional.of(new ehe((float)(1.0 - $$7), (float)$$6));
            case a, b -> Optional.empty();
         };
      }
   }

   private static int a(ehe $$0) {
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

   private static void a(cpk $$0, gv $$1, cbl $$2, dct $$3, ciw $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(ape.c.b($$4.d()));
         aot $$6 = $$4.a(ciz.tC) ? aou.et : aou.es;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, aov.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.g(1);
         }

         $$0.a($$2, dji.c, $$1);
      }
   }

   private static void a(cpk $$0, gv $$1, cbl $$2, dct $$3, int $$4) {
      if (!$$0.B) {
         ciw $$5 = $$3.a($$4, 1);
         aot $$6 = $$5.a(ciz.tC) ? aou.ew : aou.ev;
         $$0.a(null, $$1, $$6, aov.e, 1.0F, 1.0F);
         if (!$$2.fQ().e($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dji.c, $$1);
      }
   }

   @Nullable
   @Override
   public dck a(gv $$0, dey $$1) {
      return new dct($$0, $$1);
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(cwd.aC);
      b.forEach($$1 -> $$0.a($$1));
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dct $$6 && !$$6.ab_()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               ciw $$8 = $$6.a($$7);
               if (!$$8.b()) {
                  bgk.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dey a(cle $$0) {
      return this.n().a(cwd.aC, $$0.g().g());
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      return $$0.a(cwd.aC, $$1.a($$0.c(cwd.aC)));
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      return $$0.a($$1.a($$0.c(cwd.aC)));
   }

   @Override
   public boolean d_(dey $$0) {
      return true;
   }

   @Override
   public int a(dey $$0, cpk $$1, gv $$2) {
      if ($$1.r_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dct $$3 ? $$3.g() + 1 : 0;
      }
   }
}
