import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dko extends diw {
   public static final MapCodec<dko> a = b(dko::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dxm> c = List.of(dxl.bs, dxl.bt, dxl.bu, dxl.bv, dxl.bw, dxl.bx);

   @Override
   public MapCodec<dko> a() {
      return a;
   }

   public dko(dwu.d $$0) {
      super($$0);
      dwv $$1 = this.F.b().b(dni.aF, jn.c);

      for (dxm $$2 : c) {
         $$1 = $$1.b($$2, Boolean.valueOf(false));
      }

      this.l($$1);
   }

   @Override
   protected bsi a(cwn $$0, dwv $$1, dgg $$2, ji $$3, cov $$4, bsh $$5, fau $$6) {
      if ($$2.c_($$3) instanceof dug $$7) {
         if (!$$0.a(awx.aZ)) {
            return bsi.f;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bsi.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bsi.f;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bsi.a;
            }
         }
      } else {
         return bsi.e;
      }
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if ($$1.c_($$2) instanceof dug $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bsi.e;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bsi.c;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bsi.a;
         }
      } else {
         return bsi.e;
      }
   }

   private OptionalInt a(fau $$0, dwv $$1) {
      return a($$0, $$1.c(dni.aF)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<fax> a(fau $$0, jn $$1) {
      jn $$2 = $$0.c();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         ji $$3 = $$0.b().a($$2);
         fay $$4 = $$0.g().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new fax((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new fax((float)$$5, (float)$$6));
            case e -> Optional.of(new fax((float)$$7, (float)$$6));
            case f -> Optional.of(new fax((float)(1.0 - $$7), (float)$$6));
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

   private static void a(dgg $$0, ji $$1, cov $$2, dug $$3, cwn $$4, int $$5) {
      if (!$$0.C) {
         $$2.b(awj.c.b($$4.h()));
         avy $$6 = $$4.a(cwr.vv) ? avz.fc : avz.fb;
         $$3.a($$5, $$4.b(1, $$2));
         $$0.a(null, $$1, $$6, awa.e, 1.0F, 1.0F);
      }
   }

   private static void a(dgg $$0, ji $$1, cov $$2, dug $$3, int $$4) {
      if (!$$0.C) {
         cwn $$5 = $$3.a($$4, 1);
         avy $$6 = $$5.a(cwr.vv) ? avz.ff : avz.fe;
         $$0.a(null, $$1, $$6, awa.e, 1.0F, 1.0F);
         if (!$$2.gi().f($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, ebr.c, $$1);
      }
   }

   @Nullable
   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dug($$0, $$1);
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(dni.aF);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         boolean $$9;
         label32: {
            if ($$1.c_($$2) instanceof dug $$6 && !$$6.c()) {
               for (int $$7 = 0; $$7 < 6; $$7++) {
                  cwn $$8 = $$6.a($$7);
                  if (!$$8.f()) {
                     bse.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
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
   public dwv a(dae $$0) {
      return this.m().b(dni.aF, $$0.g().g());
   }

   @Override
   public dwv a(dwv $$0, dqc $$1) {
      return $$0.b(dni.aF, $$1.a($$0.c(dni.aF)));
   }

   @Override
   public dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(dni.aF)));
   }

   @Override
   protected boolean c_(dwv $$0) {
      return true;
   }

   @Override
   protected int a(dwv $$0, dgg $$1, ji $$2) {
      if ($$1.B_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dug $$3 ? $$3.j() + 1 : 0;
      }
   }
}
