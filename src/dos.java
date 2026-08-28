import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dos extends dju implements dhp, doo {
   public static final MapCodec<dos> c = b(dos::new);
   private static final dvj g = dvi.C;
   public static final dvm d = dvi.R;
   protected static final float e = 6.0F;
   protected static final ezq f = dhm.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dos> a() {
      return c;
   }

   public dos(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dvo.b).b(g, Boolean.valueOf(false)).b(d, jk.c));
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return f;
   }

   @Override
   protected boolean b(dus $$0, ddo $$1, jf $$2) {
      return $$0.a(awv.by) || $$1.b_($$2.d()).a(equ.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      dus $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.b(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dej $$0, jf $$1, dus $$2, bun $$3, cvs $$4) {
      if (!$$0.x_()) {
         jf $$5 = $$1.d();
         dus $$6 = dju.c($$0, $$5, this.n().b(b, dvo.a).b(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(g) ? equ.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      if ($$0.c(b) == dvo.a) {
         return super.a($$0, $$1, $$2);
      } else {
         jf $$3 = $$2.e();
         dus $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(dem $$0, jf $$1, dus $$2) {
      return true;
   }

   @Override
   public boolean a(dej $$0, azn $$1, jf $$2, dus $$3) {
      return true;
   }

   @Override
   public void a(arj $$0, azn $$1, jf $$2, dus $$3) {
      if ($$3.c(dju.b) == dvo.b) {
         jf $$4 = $$2.d();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dhj.a($$0, $$1, $$2, $$3.c(d));
      } else {
         jf $$5 = $$2.e();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float av_() {
      return 0.1F;
   }
}
