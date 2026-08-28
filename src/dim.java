import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dim extends dnz implements doo {
   public static final MapCodec<dim> a = b(dim::new);
   public static final dvj b = dvi.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final ezq e = dhm.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final ezq f = dhm.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final ezq g = dhm.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<dim> a() {
      return a;
   }

   public dim(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(i, jk.a.b));
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      switch ((jk.a)$$0.c(i)) {
         case a:
         default:
            return g;
         case c:
            return f;
         case b:
            return e;
      }
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      eqt $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == equ.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(b) ? equ.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }
}
