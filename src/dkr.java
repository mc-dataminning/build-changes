import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dkr extends diz {
   public static final MapCodec<dkr> a = b(dkr::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dxp> c = List.of(dxo.bs, dxo.bt, dxo.bu, dxo.bv, dxo.bw, dxo.bx);

   @Override
   public MapCodec<dkr> a() {
      return a;
   }

   public dkr(dwx.d $$0) {
      super($$0);
      dwy $$1 = this.F.b().b(dnl.aF, jn.c);

      for (dxp $$2 : c) {
         $$1 = $$1.b($$2, Boolean.valueOf(false));
      }

      this.l($$1);
   }

   @Override
   protected bsl a(cwq $$0, dwy $$1, dgj $$2, ji $$3, coy $$4, bsk $$5, fax $$6) {
      if ($$2.c_($$3) instanceof duj $$7) {
         if (!$$0.a(awy.aZ)) {
            return bsl.f;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bsl.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bsl.f;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bsl.a;
            }
         }
      } else {
         return bsl.e;
      }
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if ($$1.c_($$2) instanceof duj $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bsl.e;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bsl.c;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bsl.a;
         }
      } else {
         return bsl.e;
      }
   }

   private OptionalInt a(fax $$0, dwy $$1) {
      return a($$0, $$1.c(dnl.aF)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<fba> a(fax $$0, jn $$1) {
      jn $$2 = $$0.c();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         ji $$3 = $$0.b().a($$2);
         fbb $$4 = $$0.g().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new fba((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new fba((float)$$5, (float)$$6));
            case e -> Optional.of(new fba((float)$$7, (float)$$6));
            case f -> Optional.of(new fba((float)(1.0 - $$7), (float)$$6));
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

   private static void a(dgj $$0, ji $$1, coy $$2, duj $$3, cwq $$4, int $$5) {
      if (!$$0.C) {
         $$2.b(awk.c.b($$4.h()));
         avz $$6 = $$4.a(cwu.vv) ? awa.fc : awa.fb;
         $$3.a($$5, $$4.b(1, $$2));
         $$0.a(null, $$1, $$6, awb.e, 1.0F, 1.0F);
      }
   }

   private static void a(dgj $$0, ji $$1, coy $$2, duj $$3, int $$4) {
      if (!$$0.C) {
         cwq $$5 = $$3.a($$4, 1);
         avz $$6 = $$5.a(cwu.vv) ? awa.ff : awa.fe;
         $$0.a(null, $$1, $$6, awb.e, 1.0F, 1.0F);
         if (!$$2.gi().f($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, ebu.c, $$1);
      }
   }

   @Nullable
   @Override
   public dua a(ji $$0, dwy $$1) {
      return new duj($$0, $$1);
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(dnl.aF);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         boolean $$9;
         label32: {
            if ($$1.c_($$2) instanceof duj $$6 && !$$6.c()) {
               for (int $$7 = 0; $$7 < 6; $$7++) {
                  cwq $$8 = $$6.a($$7);
                  if (!$$8.f()) {
                     bsh.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
                  }
               }

               $$6.a();
               $$9 = true;
               break label32;
            }

            $$9 = false;
         }

         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$9) {
            $$1.c($$2, this);
         }
      }
   }

   @Override
   public dwy a(dah $$0) {
      return this.m().b(dnl.aF, $$0.g().g());
   }

   @Override
   public dwy a(dwy $$0, dqf $$1) {
      return $$0.b(dnl.aF, $$1.a($$0.c(dnl.aF)));
   }

   @Override
   public dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(dnl.aF)));
   }

   @Override
   protected boolean c_(dwy $$0) {
      return true;
   }

   @Override
   protected int a(dwy $$0, dgj $$1, ji $$2) {
      if ($$1.B_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof duj $$3 ? $$3.j() + 1 : 0;
      }
   }
}
