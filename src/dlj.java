import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dlj extends djq {
   public static final MapCodec<dlj> a = b(dlj::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dye> c = List.of(dyd.bq, dyd.br, dyd.bs, dyd.bt, dyd.bu, dyd.bv);

   @Override
   public MapCodec<dlj> a() {
      return a;
   }

   public dlj(dxm.d $$0) {
      super($$0);
      dxn $$1 = this.F.b().b(doc.aF, jm.c);

      for (dye $$2 : c) {
         $$1 = $$1.b($$2, Boolean.valueOf(false));
      }

      this.l($$1);
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.c;
   }

   @Override
   protected bte a(cxk $$0, dxn $$1, dha $$2, jh $$3, cps $$4, btd $$5, fbo $$6) {
      if ($$2.c_($$3) instanceof duy $$7) {
         if (!$$0.a(ayd.bb)) {
            return bte.f;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bte.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bte.f;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bte.a;
            }
         }
      } else {
         return bte.e;
      }
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if ($$1.c_($$2) instanceof duy $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bte.e;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bte.c;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bte.a;
         }
      } else {
         return bte.e;
      }
   }

   private OptionalInt a(fbo $$0, dxn $$1) {
      return a($$0, $$1.c(doc.aF)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<fbr> a(fbo $$0, jm $$1) {
      jm $$2 = $$0.c();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         jh $$3 = $$0.b().a($$2);
         fbs $$4 = $$0.g().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new fbr((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new fbr((float)$$5, (float)$$6));
            case e -> Optional.of(new fbr((float)$$7, (float)$$6));
            case f -> Optional.of(new fbr((float)(1.0 - $$7), (float)$$6));
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

   private static void a(dha $$0, jh $$1, cps $$2, duy $$3, cxk $$4, int $$5) {
      if (!$$0.C) {
         $$2.b(axp.c.b($$4.h()));
         axe $$6 = $$4.a(cxo.vm) ? axf.fb : axf.fa;
         $$3.a($$5, $$4.b(1, $$2));
         $$0.a(null, $$1, $$6, axg.e, 1.0F, 1.0F);
      }
   }

   private static void a(dha $$0, jh $$1, cps $$2, duy $$3, int $$4) {
      if (!$$0.C) {
         cxk $$5 = $$3.a($$4, 1);
         axe $$6 = $$5.a(cxo.vm) ? axf.fe : axf.fd;
         $$0.a(null, $$1, $$6, axg.e, 1.0F, 1.0F);
         if (!$$2.gg().f($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, ecj.c, $$1);
      }
   }

   @Nullable
   @Override
   public dup a(jh $$0, dxn $$1) {
      return new duy($$0, $$1);
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(doc.aF);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         boolean $$9;
         label32: {
            if ($$1.c_($$2) instanceof duy $$6 && !$$6.c()) {
               for (int $$7 = 0; $$7 < 6; $$7++) {
                  cxk $$8 = $$6.a($$7);
                  if (!$$8.f()) {
                     bta.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
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
   public dxn a(dbb $$0) {
      return this.m().b(doc.aF, $$0.g().g());
   }

   @Override
   public dxn a(dxn $$0, dqu $$1) {
      return $$0.b(doc.aF, $$1.a($$0.c(doc.aF)));
   }

   @Override
   public dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(doc.aF)));
   }

   @Override
   protected boolean c_(dxn $$0) {
      return true;
   }

   @Override
   protected int a(dxn $$0, dha $$1, jh $$2) {
      if ($$1.B_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof duy $$3 ? $$3.j() + 1 : 0;
      }
   }
}
