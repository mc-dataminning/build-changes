import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doh extends dgy implements doo {
   public static final MapCodec<doh> a = b(doh::new);
   public static final dvj b = dvi.F;
   public static final dvj c = dvi.C;
   public static final dvj d = dvi.G;
   protected static final ezq e = dhm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(jk.a.b);

   @Override
   public MapCodec<doh> a() {
      return a;
   }

   public doh(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dej $$0, jf $$1, dus $$2, btr $$3) {
      if ($$0 instanceof arj $$4) {
         ark $$5 = dtf.a($$3);
         if ($$5 != null) {
            $$4.a($$1, drx.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if ($$1 instanceof arj $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, drx.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, drx.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.c;
   }

   @Override
   protected ezq b(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return e;
   }

   @Override
   protected ezq d_(dus $$0) {
      return e;
   }

   @Override
   protected boolean g_(dus $$0) {
      return true;
   }

   @Nullable
   @Override
   public drv a(jf $$0, dus $$1) {
      return new dtf($$0, $$1);
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      return this.n().b(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == equ.c));
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(c) ? equ.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, cvs $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bqu.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends drv> drw<T> a(dej $$0, dus $$1, drx<T> $$2) {
      return !$$0.B ? dgy.a($$2, drx.L, ($$0x, $$1x, $$2x, $$3) -> dzy.c.a($$0x, $$3.gq(), $$3.gr())) : null;
   }
}
