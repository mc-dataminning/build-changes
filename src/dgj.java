import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgj extends dkf {
   public static final MapCodec<dgj> a = b(dgj::new);
   public static final dvi b = dlf.aF;
   private static final ezm c = dhj.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final ezm d = dhj.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final ezm e = dhj.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final ezm f = dhj.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final ezm g = dhj.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final ezm h = dhj.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final ezm i = dhj.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final ezm j = ezj.a(c, d, e, f);
   private static final ezm k = ezj.a(c, g, h, i);
   private static final xd l = xd.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<dgj> a() {
      return a;
   }

   public dgj(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jj.c));
   }

   @Override
   public duo a(czk $$0) {
      return this.o().b(b, $$0.g().h());
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if (!$$1.B) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awo.aC);
      }

      return brp.a;
   }

   @Nullable
   @Override
   protected brr b(duo $$0, deg $$1, je $$2) {
      return new brx(($$2x, $$3, $$4) -> new cqz($$2x, $$3, crj.a($$1, $$2)), l);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      jj $$4 = $$0.c(b);
      return $$4.o() == jj.a.a ? j : k;
   }

   @Override
   protected void a(ckd $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(deg $$0, je $$1, duo $$2, duo $$3, ckd $$4) {
      if (!$$4.ba()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(deg $$0, je $$1, ckd $$2) {
      if (!$$2.ba()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bsg a(bto $$0) {
      return $$0.dT().b($$0);
   }

   @Nullable
   public static duo e(duo $$0) {
      if ($$0.a(dhl.gS)) {
         return dhl.gT.o().b(b, $$0.c(b));
      } else {
         return $$0.a(dhl.gT) ? dhl.gU.o().b(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }

   @Override
   public int b(duo $$0, ddl $$1, je $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
