import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyw extends cye {
   public static final MapCodec<cyw> a = b(cyw::new);
   public static final dma[] b = new dma[]{dlz.k, dlz.l, dlz.m};
   protected static final eos c = eop.a(cys.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), cys.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<cyw> a() {
      return a;
   }

   public cyw(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(b[0], Boolean.valueOf(false)).a(b[1], Boolean.valueOf(false)).a(b[2], Boolean.valueOf(false)));
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.c;
   }

   @Override
   public dix a(hz $$0, dlj $$1) {
      return new dja($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dix> diy<T> a(cvr $$0, dlj $$1, diz<T> $$2) {
      return $$0.B ? null : a($$2, diz.l, dja::a);
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return c;
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if ($$1.B) {
         return blw.a;
      } else {
         dix $$5 = $$1.c_($$2);
         if ($$5 instanceof dja) {
            $$3.a((dja)$$5);
            $$3.a(atv.aa);
         }

         return blw.b;
      }
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, boi $$3, cpd $$4) {
      if ($$4.B()) {
         dix $$5 = $$0.c_($$1);
         if ($$5 instanceof dja) {
            ((dja)$$5).a($$4.z());
         }
      }
   }

   @Override
   public void a(dlj $$0, cvr $$1, hz $$2, awp $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(jz.ab, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      bls.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean d_(dlj $$0) {
      return true;
   }

   @Override
   protected int a(dlj $$0, cvr $$1, hz $$2) {
      return ckf.a($$1.c_($$2));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }
}
