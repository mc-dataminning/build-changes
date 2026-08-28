import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhq extends dgy {
   public static final MapCodec<dhq> a = b(dhq::new);
   public static final dvj[] b = new dvj[]{dvi.k, dvi.l, dvi.m};
   protected static final ezq c = ezn.a(dhm.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), dhm.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<dhq> a() {
      return a;
   }

   public dhq(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b[0], Boolean.valueOf(false)).b(b[1], Boolean.valueOf(false)).b(b[2], Boolean.valueOf(false)));
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.c;
   }

   @Override
   public drv a(jf $$0, dus $$1) {
      return new dry($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drv> drw<T> a(dej $$0, dus $$1, drx<T> $$2) {
      return $$0.B ? null : a($$2, drx.l, dry::a);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return c;
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if (!$$1.B && $$1.c_($$2) instanceof dry $$5) {
         $$3.a($$5);
         $$3.a(awq.aa);
      }

      return brs.a;
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(lo.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      bro.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean c_(dus $$0) {
      return true;
   }

   @Override
   protected int a(dus $$0, dej $$1, jf $$2) {
      return cqz.a($$1.c_($$2));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }
}
