import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbj extends cxm<djs> implements dfs {
   public static final MapCodec<dbj> b = b(dbj::new);
   public static final dmd c = dcn.aE;
   public static final dma d = dlz.C;
   protected static final eos e = cys.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final vq f = vq.c("container.enderchest");

   @Override
   public MapCodec<dbj> a() {
      return b;
   }

   protected dbj(dli.d $$0) {
      super($$0, () -> diz.d);
      this.k(this.E.b().a(c, ie.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public daz.c<? extends dje> a(dlj $$0, cvr $$1, hz $$2, boolean $$3) {
      return daz.b::b;
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return e;
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.b;
   }

   @Override
   public dlj a(crk $$0) {
      egw $$1 = $$0.q().b_($$0.a());
      return this.o().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == egx.c));
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      clr $$5 = $$3.gg();
      dix $$6 = $$1.c_($$2);
      if ($$5 != null && $$6 instanceof djs) {
         hz $$7 = $$2.c();
         if ($$1.a_($$7).g($$1, $$7)) {
            return blw.a($$1.B);
         } else if ($$1.B) {
            return blw.a;
         } else {
            djs $$8 = (djs)$$6;
            $$5.a($$8);
            $$3.a(new bmg(($$1x, $$2x, $$3x) -> ckm.a($$1x, $$2x, $$5), f));
            $$3.a(atv.aj);
            cgc.a($$3, true);
            return blw.b;
         }
      } else {
         return blw.a($$1.B);
      }
   }

   @Override
   public dix a(hz $$0, dlj $$1) {
      return new djs($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dix> diy<T> a(cvr $$0, dlj $$1, diz<T> $$2) {
      return $$0.B ? a($$2, diz.d, djs::a) : null;
   }

   @Override
   public void a(dlj $$0, cvr $$1, hz $$2, awp $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(jz.Z, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(d) ? egx.c.a(false) : super.c_($$0);
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, egx.c, egx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      dix $$4 = $$1.c_($$2);
      if ($$4 instanceof djs) {
         ((djs)$$4).c();
      }
   }
}
