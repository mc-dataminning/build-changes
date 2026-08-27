import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class czs extends cya {
   public static final MapCodec<czs> a = b(czs::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dlw> c = List.of(dlv.bp, dlv.bq, dlv.br, dlv.bs, dlv.bt, dlv.bu);

   @Override
   public MapCodec<czs> a() {
      return a;
   }

   public czs(dle.d $$0) {
      super($$0);
      dlf $$1 = this.E.b().a(dcj.aE, ie.c);

      for (dlw $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   protected det b_(dlf $$0) {
      return det.c;
   }

   @Override
   protected blw a(coz $$0, dlf $$1, cvn $$2, hz $$3, chh $$4, blt $$5, eno $$6) {
      if ($$2.c_($$3) instanceof djc $$7) {
         if (!$$0.a(auh.av)) {
            return blw.d;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return blw.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return blw.d;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return blw.a($$2.B);
            }
         }
      } else {
         return blw.e;
      }
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if ($$1.c_($$2) instanceof djc $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return blu.d;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return blu.b;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return blu.a($$1.B);
         }
      } else {
         return blu.d;
      }
   }

   private OptionalInt a(eno $$0, dlf $$1) {
      return a($$0, $$1.c(dcj.aE)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<enr> a(eno $$0, ie $$1) {
      ie $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         hz $$3 = $$0.a().a($$2);
         ens $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new enr((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new enr((float)$$5, (float)$$6));
            case e -> Optional.of(new enr((float)$$7, (float)$$6));
            case f -> Optional.of(new enr((float)(1.0 - $$7), (float)$$6));
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

   private static void a(cvn $$0, hz $$1, chh $$2, djc $$3, coz $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(atu.c.b($$4.d()));
         atj $$6 = $$4.a(cpc.us) ? atk.eR : atk.eQ;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, atl.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.g(1);
         }
      }
   }

   private static void a(cvn $$0, hz $$1, chh $$2, djc $$3, int $$4) {
      if (!$$0.B) {
         coz $$5 = $$3.a($$4, 1);
         atj $$6 = $$5.a(cpc.us) ? atk.eU : atk.eT;
         $$0.a(null, $$1, $$6, atl.e, 1.0F, 1.0F);
         if (!$$2.fT().e($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dpp.c, $$1);
      }
   }

   @Nullable
   @Override
   public dit a(hz $$0, dlf $$1) {
      return new djc($$0, $$1);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(dcj.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof djc $$6 && !$$6.aj_()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               coz $$8 = $$6.a($$7);
               if (!$$8.b()) {
                  blq.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dlf a(crg $$0) {
      return this.o().a(dcj.aE, $$0.g().g());
   }

   @Override
   public dlf a(dlf $$0, dfa $$1) {
      return $$0.a(dcj.aE, $$1.a($$0.c(dcj.aE)));
   }

   @Override
   public dlf a(dlf $$0, ddk $$1) {
      return $$0.a($$1.a($$0.c(dcj.aE)));
   }

   @Override
   protected boolean d_(dlf $$0) {
      return true;
   }

   @Override
   protected int a(dlf $$0, cvn $$1, hz $$2) {
      if ($$1.y_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof djc $$3 ? $$3.g() + 1 : 0;
      }
   }
}
