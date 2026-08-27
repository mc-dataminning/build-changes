import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cuz extends cyv {
   public static final MapCodec<cuz> a = b(cuz::new);
   public static final djj b = czu.aE;
   private static final elu c = cvz.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final elu d = cvz.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final elu e = cvz.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final elu f = cvz.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final elu g = cvz.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final elu h = cvz.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final elu i = cvz.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final elu j = elr.a(c, d, e, f);
   private static final elu k = elr.a(c, g, h, i);
   private static final vb l = vb.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<cuz> a() {
      return a;
   }

   public cuz(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ia.c));
   }

   @Override
   public dip a(coq $$0) {
      return this.o().a(b, $$0.g().h());
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if ($$1.B) {
         return bjl.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(arm.aC);
         return bjl.b;
      }
   }

   @Nullable
   @Override
   public bjo b(dip $$0, csy $$1, hv $$2) {
      return new bju(($$2x, $$3, $$4) -> new chm($$2x, $$3, chv.a($$1, $$2)), l);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      ia $$4 = $$0.c(b);
      return $$4.o() == ia.a.a ? j : k;
   }

   @Override
   protected void a(cbd $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, dip $$3, cbd $$4) {
      if (!$$4.aU()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(csy $$0, hv $$1, cbd $$2) {
      if (!$$2.aU()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bkd a(blf $$0) {
      return $$0.dN().b($$0);
   }

   @Nullable
   public static dip e(dip $$0) {
      if ($$0.a(cwb.gS)) {
         return cwb.gT.o().a(b, $$0.c(b));
      } else {
         return $$0.a(cwb.gT) ? cwb.gU.o().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }

   @Override
   public int b(dip $$0, cse $$1, hv $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
