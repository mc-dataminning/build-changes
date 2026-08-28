import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhj extends dle {
   public static final MapCodec<dhj> a = b(dhj::new);
   public static final dwl<jm> b = dme.aF;
   private static final fal c = dij.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final fal d = dij.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final fal e = dij.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final fal f = dij.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final fal g = dij.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final fal h = dij.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final fal i = dij.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final fal j = fai.a(c, d, e, f);
   private static final fal k = fai.a(c, g, h, i);
   private static final xl l = xl.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<dhj> a() {
      return a;
   }

   public dhj(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c));
   }

   @Override
   public dvo a(czw $$0) {
      return this.m().b(b, $$0.g().h());
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awy.aC);
      }

      return bsh.a;
   }

   @Nullable
   @Override
   protected bsj b(dvo $$0, dff $$1, jh $$2) {
      return new bsp(($$2x, $$3, $$4) -> new crv($$2x, $$3, csf.a($$1, $$2)), l);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      jm $$4 = $$0.c(b);
      return $$4.o() == jm.a.a ? j : k;
   }

   @Override
   protected void a(cky $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dff $$0, jh $$1, dvo $$2, dvo $$3, cky $$4) {
      if (!$$4.bd()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dff $$0, jh $$1, cky $$2) {
      if (!$$2.bd()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bsy a(bui $$0) {
      return $$0.dZ().b($$0);
   }

   @Nullable
   public static dvo e(dvo $$0) {
      if ($$0.a(dil.gS)) {
         return dil.gT.m().b(b, $$0.c(b));
      } else {
         return $$0.a(dil.gT) ? dil.gU.m().b(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }

   @Override
   public int b(dvo $$0, dek $$1, jh $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
