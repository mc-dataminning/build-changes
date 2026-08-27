import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxs extends dbo {
   public static final MapCodec<cxs> a = b(cxs::new);
   public static final dmd b = dcn.aE;
   private static final eos c = cys.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final eos d = cys.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final eos e = cys.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final eos f = cys.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final eos g = cys.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final eos h = cys.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final eos i = cys.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final eos j = eop.a(c, d, e, f);
   private static final eos k = eop.a(c, g, h, i);
   private static final vq l = vq.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<cxs> a() {
      return a;
   }

   public cxs(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ie.c));
   }

   @Override
   public dlj a(crk $$0) {
      return this.o().a(b, $$0.g().h());
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if ($$1.B) {
         return blw.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(atv.aC);
         return blw.b;
      }
   }

   @Nullable
   @Override
   protected bma b(dlj $$0, cvr $$1, hz $$2) {
      return new bmg(($$2x, $$3, $$4) -> new ckh($$2x, $$3, ckq.a($$1, $$2)), l);
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      ie $$4 = $$0.c(b);
      return $$4.o() == ie.a.a ? j : k;
   }

   @Override
   protected void a(cdv $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, dlj $$3, cdv $$4) {
      if (!$$4.aU()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(cvr $$0, hz $$1, cdv $$2) {
      if (!$$2.aU()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bmp a(bnq $$0) {
      return $$0.dN().b($$0);
   }

   @Nullable
   public static dlj e(dlj $$0) {
      if ($$0.a(cyu.gS)) {
         return cyu.gT.o().a(b, $$0.c(b));
      } else {
         return $$0.a(cyu.gT) ? cyu.gU.o().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }

   @Override
   public int b(dlj $$0, cux $$1, hz $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
