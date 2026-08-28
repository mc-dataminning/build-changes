import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dos extends dku<dxv> implements dtj {
   public static final MapCodec<dos> b = b(dos::new);
   public static final eax<ja> c = dqa.e;
   public static final eaq d = eap.I;
   private static final ffc e = dma.b(14.0, 0.0, 14.0);
   private static final wy f = wy.c("container.enderchest");

   @Override
   public MapCodec<dos> a() {
      return b;
   }

   protected dos(dzy.d $$0) {
      super($$0, () -> dwz.d);
      this.l(this.B.b().b(c, ja.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   public doi.c<? extends dxf> a(dzz $$0, div $$1, iu $$2, boolean $$3) {
      return doi.b::b;
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return e;
   }

   @Override
   public dzz a(dcr $$0) {
      ewg $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g().g()).b(d, Boolean.valueOf($$1.a() == ewh.c));
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      cwe $$5 = $$3.gw();
      if ($$5 != null && $$1.c_($$2) instanceof dxv $$7) {
         iu $$9 = $$2.d();
         if ($$1.a_($$9).d($$1, $$9)) {
            return bub.a;
         } else {
            if ($$1 instanceof arq $$10) {
               $$5.a($$7);
               $$3.a(new buj(($$1x, $$2x, $$3x) -> cuz.a($$1x, $$2x, $$5), f));
               $$3.a(awx.aj);
               cpo.a($$10, $$3, true);
            }

            return bub.a;
         }
      } else {
         return bub.a;
      }
   }

   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dxv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwx> dwy<T> a(div $$0, dzz $$1, dwz<T> $$2) {
      return $$0.C ? a($$2, dwz.d, dxv::a) : null;
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(lx.af, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(d) ? ewh.c.a(false) : super.b_($$0);
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, ewh.c, ewh.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      dwx $$4 = $$1.c_($$2);
      if ($$4 instanceof dxv) {
         ((dxv)$$4).a();
      }
   }
}
