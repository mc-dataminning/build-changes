import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doq extends dhm implements doo {
   public static final MapCodec<doq> a = b(doq::new);
   public static final dvq<dwa> b = dvi.bh;
   public static final dvj c = dvi.C;
   protected static final ezq d = dhm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final ezq e = dhm.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends doq> a() {
      return a;
   }

   public doq(dur.d $$0) {
      super($$0);
      this.l(this.n().b(b, dwa.b).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dus $$0) {
      return $$0.c(b) != dwa.c;
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      dwa $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return ezn.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      jf $$1 = $$0.a();
      dus $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.b(b, dwa.c).b(c, Boolean.valueOf(false));
      } else {
         eqt $$3 = $$0.q().b_($$1);
         dus $$4 = this.n().b(b, dwa.b).b(c, Boolean.valueOf($$3.a() == equ.c));
         jk $$5 = $$0.k();
         return $$5 != jk.a && ($$5 == jk.b || !($$0.l().e - (double)$$1.v() > 0.5)) ? $$4 : $$4.b(b, dwa.a);
      }
   }

   @Override
   protected boolean a(dus $$0, czn $$1) {
      cvs $$2 = $$1.n();
      dwa $$3 = $$0.c(b);
      if ($$3 == dwa.c || !$$2.a(this.q())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().e - (double)$$1.a().v() > 0.5;
         jk $$5 = $$1.k();
         return $$3 == dwa.b ? $$5 == jk.b || $$4 && $$5.o().d() : $$5 == jk.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(c) ? equ.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dek $$0, jf $$1, dus $$2, eqt $$3) {
      return $$2.c(b) != dwa.c ? doo.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cnx $$0, ddo $$1, jf $$2, dus $$3, eqs $$4) {
      return $$3.c(b) != dwa.c ? doo.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.y().a(axb.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
