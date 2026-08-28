import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djd extends dna {
   public static final MapCodec<djd> a = b(djd::new);
   public static final dyl<jm> b = dob.aF;
   private static final fcl c = dkd.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final fcl d = dkd.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final fcl e = dkd.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final fcl f = dkd.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final fcl g = dkd.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final fcl h = dkd.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final fcl i = dkd.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final fcl j = fci.a(c, d, e, f);
   private static final fcl k = fci.a(c, g, h, i);
   private static final xk l = xk.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<djd> a() {
      return a;
   }

   public djd(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c));
   }

   @Override
   public dxo a(dax $$0) {
      return this.m().b(b, $$0.g().h());
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(axf.aC);
      }

      return bta.a;
   }

   @Nullable
   @Override
   protected btc b(dxo $$0, dgz $$1, jh $$2) {
      return new bti(($$2x, $$3, $$4) -> new csw($$2x, $$3, ctg.a($$1, $$2)), l);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      jm $$4 = $$0.c(b);
      return $$4.o() == jm.a.a ? j : k;
   }

   @Override
   protected void a(clr $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dgz $$0, jh $$1, dxo $$2, dxo $$3, clr $$4) {
      if (!$$4.bb()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dgz $$0, jh $$1, clr $$2) {
      if (!$$2.bb()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public btr a(bvb $$0) {
      return $$0.dX().b($$0);
   }

   @Nullable
   public static dxo e(dxo $$0) {
      if ($$0.a(dkf.hp)) {
         return dkf.hq.m().b(b, $$0.c(b));
      } else {
         return $$0.a(dkf.hq) ? dkf.hr.m().b(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }

   @Override
   public int b(dxo $$0, dge $$1, jh $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
