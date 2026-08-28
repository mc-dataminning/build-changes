import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dve extends dma {
   public static final MapCodec<dve> a = b(dve::new);
   public static final eaz b = eap.aH;
   public static final eaz c = eap.aG;
   public static final int d = 2;
   public static final int e = 1;
   public static final int f = 4;
   private static final ffc g = dma.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final ffc h = dma.b(14.0, 0.0, 7.0);

   @Override
   public MapCodec<dve> a() {
      return a;
   }

   public dve(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Integer.valueOf(0)).b(c, Integer.valueOf(1)));
   }

   @Override
   public void a(div $$0, iu $$1, dzz $$2, bwd $$3) {
      if (!$$3.ce()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(div $$0, dzz $$1, iu $$2, bwd $$3, double $$4) {
      if (!($$3 instanceof cot)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(div $$0, dzz $$1, iu $$2, bwd $$3, int $$4) {
      if ($$1.a(dmc.mI) && $$0 instanceof arq $$5 && this.a($$5, $$3) && $$0.A.a($$4) == 0) {
         this.a($$5, $$2, $$1);
      }
   }

   private void a(div $$0, iu $$1, dzz $$2) {
      $$0.a(null, $$1, awn.Bj, awo.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      int $$3 = $$2.c(c);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.b(c, Integer.valueOf($$3 - 1)), 2);
         $$0.a(eez.f, $$1, eez.a.a($$2));
         $$0.c(2001, $$1, dma.j($$2));
      }
   }

   @Override
   protected void b(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(b);
         if ($$4 < 2) {
            $$1.a(null, $$2, awn.Bk, awo.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 + 1)), 2);
            $$1.a(eez.c, $$2, eez.a.a($$0));
         } else {
            $$1.a(null, $$2, awn.Bl, awo.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(eez.f, $$2, eez.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(c); $$5++) {
               $$1.c(2001, $$2, dma.j($$0));
               cjy $$6 = bwm.bB.a($$1, bwl.e);
               if ($$6 != null) {
                  $$6.c_(-24000);
                  $$6.h($$2);
                  $$6.b((double)$$2.u() + 0.3 + (double)$$5 * 0.2, (double)$$2.v(), (double)$$2.w() + 0.3, 0.0F, 0.0F);
                  $$1.b($$6);
               }
            }
         }
      }
   }

   public static boolean a(dib $$0, iu $$1) {
      return b($$0, $$1.e());
   }

   public static boolean b(dib $$0, iu $$1) {
      return $$0.a_($$1).a(axc.J);
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dzz $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.C) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(div $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.A.a(500) == 0;
   }

   @Override
   public void a(div $$0, cqy $$1, iu $$2, dzz $$3, @Nullable dwx $$4, cyy $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(dzz $$0, dcr $$1) {
      return !$$1.h() && $$1.n().a(this.h()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      dzz $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1))) : super.a($$0);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return $$0.c(c) == 1 ? g : h;
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, c);
   }

   private boolean a(arq $$0, bwd $$1) {
      if ($$1 instanceof cjy || $$1 instanceof cil) {
         return false;
      } else {
         return !($$1 instanceof bxc) ? false : $$1 instanceof cqy || $$0.O().c(dir.c);
      }
   }
}
