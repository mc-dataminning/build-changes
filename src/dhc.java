import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dhc extends dfk {
   public static final MapCodec<dhc> a = b(dhc::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dtt> c = List.of(dts.bp, dts.bq, dts.br, dts.bs, dts.bt, dts.bu);

   @Override
   public MapCodec<dhc> a() {
      return a;
   }

   public dhc(dtb.d $$0) {
      super($$0);
      dtc $$1 = this.E.b().a(dju.aE, ji.c);

      for (dtt $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   protected dmf a_(dtc $$0) {
      return dmf.c;
   }

   @Override
   protected bqt a(cuq $$0, dtc $$1, dcw $$2, jd $$3, cmx $$4, bqq $$5, ewy $$6) {
      if ($$2.c_($$3) instanceof dqq $$7) {
         if (!$$0.a(awn.aV)) {
            return bqt.d;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bqt.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bqt.d;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bqt.a($$2.B);
            }
         }
      } else {
         return bqt.e;
      }
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, ewy $$4) {
      if ($$1.c_($$2) instanceof dqq $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bqr.e;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bqr.c;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bqr.a($$1.B);
         }
      } else {
         return bqr.e;
      }
   }

   private OptionalInt a(ewy $$0, dtc $$1) {
      return a($$0, $$1.c(dju.aE)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<exb> a(ewy $$0, ji $$1) {
      ji $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         jd $$3 = $$0.a().a($$2);
         exc $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new exb((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new exb((float)$$5, (float)$$6));
            case e -> Optional.of(new exb((float)$$7, (float)$$6));
            case f -> Optional.of(new exb((float)(1.0 - $$7), (float)$$6));
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

   private static void a(dcw $$0, jd $$1, cmx $$2, dqq $$3, cuq $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(avz.c.b($$4.g()));
         avo $$6 = $$4.a(cut.uw) ? avp.fa : avp.eZ;
         $$3.a($$5, $$4.b(1, $$2));
         $$0.a(null, $$1, $$6, avq.e, 1.0F, 1.0F);
      }
   }

   private static void a(dcw $$0, jd $$1, cmx $$2, dqq $$3, int $$4) {
      if (!$$0.B) {
         cuq $$5 = $$3.a($$4, 1);
         avo $$6 = $$5.a(cut.uw) ? avp.fd : avp.fc;
         $$0.a(null, $$1, $$6, avq.e, 1.0F, 1.0F);
         if (!$$2.fY().f($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dxz.c, $$1);
      }
   }

   @Nullable
   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new dqq($$0, $$1);
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(dju.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dqq $$6 && !$$6.c()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               cuq $$8 = $$6.a($$7);
               if (!$$8.e()) {
                  bqn.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dtc a(cyd $$0) {
      return this.o().a(dju.aE, $$0.g().g());
   }

   @Override
   public dtc a(dtc $$0, dmm $$1) {
      return $$0.a(dju.aE, $$1.a($$0.c(dju.aE)));
   }

   @Override
   public dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(dju.aE)));
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dcw $$1, jd $$2) {
      if ($$1.x_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dqq $$3 ? $$3.j() + 1 : 0;
      }
   }
}
