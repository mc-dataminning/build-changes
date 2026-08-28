import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class diz extends dgy implements doo {
   public static final MapCodec<diz> a = b(diz::new);
   public static final dvj b = dvi.C;
   private static final int d = 3;
   protected static final ezq c = dhm.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<diz> a() {
      return a;
   }

   public diz(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b);
   }

   @Override
   public drv a(jf $$0, dus $$1) {
      return new dsh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drv> drw<T> a(dej $$0, dus $$1, drx<T> $$2) {
      return a($$2, drx.z, $$0.B ? dsh::a : dsh::b);
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.b;
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(b) ? equ.c.a(false) : super.b_($$0);
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return c;
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      eqt $$1 = $$0.q().b_($$0.a());
      return this.n().b(b, Boolean.valueOf($$1.a(axb.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }
}
