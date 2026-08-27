import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class czw extends cye {
   public static final MapCodec<czw> a = b(czw::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dma> c = List.of(dlz.bp, dlz.bq, dlz.br, dlz.bs, dlz.bt, dlz.bu);

   @Override
   public MapCodec<czw> a() {
      return a;
   }

   public czw(dli.d $$0) {
      super($$0);
      dlj $$1 = this.E.b().a(dcn.aE, ie.c);

      for (dma $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.c;
   }

   @Override
   protected bly a(cpd $$0, dlj $$1, cvr $$2, hz $$3, chl $$4, blv $$5, env $$6) {
      if ($$2.c_($$3) instanceof djg $$7) {
         if (!$$0.a(aui.av)) {
            return bly.d;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bly.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bly.d;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bly.a($$2.B);
            }
         }
      } else {
         return bly.e;
      }
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if ($$1.c_($$2) instanceof djg $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return blw.d;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return blw.b;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return blw.a($$1.B);
         }
      } else {
         return blw.d;
      }
   }

   private OptionalInt a(env $$0, dlj $$1) {
      return a($$0, $$1.c(dcn.aE)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<eny> a(env $$0, ie $$1) {
      ie $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         hz $$3 = $$0.a().a($$2);
         enz $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new eny((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new eny((float)$$5, (float)$$6));
            case e -> Optional.of(new eny((float)$$7, (float)$$6));
            case f -> Optional.of(new eny((float)(1.0 - $$7), (float)$$6));
            case a, b -> Optional.empty();
         };
      }
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

   private static void a(cvr $$0, hz $$1, chl $$2, djg $$3, cpd $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(atv.c.b($$4.d()));
         atk $$6 = $$4.a(cpg.us) ? atl.eS : atl.eR;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, atm.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.g(1);
         }
      }
   }

   private static void a(cvr $$0, hz $$1, chl $$2, djg $$3, int $$4) {
      if (!$$0.B) {
         cpd $$5 = $$3.a($$4, 1);
         atk $$6 = $$5.a(cpg.us) ? atl.eV : atl.eU;
         $$0.a(null, $$1, $$6, atm.e, 1.0F, 1.0F);
         if (!$$2.fT().e($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dpw.c, $$1);
      }
   }

   @Nullable
   @Override
   public dix a(hz $$0, dlj $$1) {
      return new djg($$0, $$1);
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(dcn.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof djg $$6 && !$$6.aj_()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               cpd $$8 = $$6.a($$7);
               if (!$$8.b()) {
                  bls.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dlj a(crk $$0) {
      return this.o().a(dcn.aE, $$0.g().g());
   }

   @Override
   public dlj a(dlj $$0, dfe $$1) {
      return $$0.a(dcn.aE, $$1.a($$0.c(dcn.aE)));
   }

   @Override
   public dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(dcn.aE)));
   }

   @Override
   protected boolean d_(dlj $$0) {
      return true;
   }

   @Override
   protected int a(dlj $$0, cvr $$1, hz $$2) {
      if ($$1.y_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof djg $$3 ? $$3.g() + 1 : 0;
      }
   }
}
