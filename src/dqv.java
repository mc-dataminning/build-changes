import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqv extends djn implements dqt {
   public static final MapCodec<dqv> a = b(dqv::new);
   public static final dxv<dyf> b = dxo.bk;
   public static final dxp c = dxo.J;
   protected static final fbv d = djn.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final fbv e = djn.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dqv> a() {
      return a;
   }

   public dqv(dwx.d $$0) {
      super($$0);
      this.l(this.m().b(b, dyf.b).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dwy $$0) {
      return $$0.c(b) != dyf.c;
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      dyf $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return fbs.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      ji $$1 = $$0.a();
      dwy $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.b(b, dyf.c).b(c, Boolean.valueOf(false));
      } else {
         eta $$3 = $$0.q().b_($$1);
         dwy $$4 = this.m().b(b, dyf.b).b(c, Boolean.valueOf($$3.a() == etb.c));
         jn $$5 = $$0.k();
         return $$5 != jn.a && ($$5 == jn.b || !($$0.l().e - (double)$$1.v() > 0.5)) ? $$4 : $$4.b(b, dyf.a);
      }
   }

   @Override
   protected boolean a(dwy $$0, dah $$1) {
      cwq $$2 = $$1.n();
      dyf $$3 = $$0.c(b);
      if ($$3 == dyf.c || !$$2.a(this.j())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().e - (double)$$1.a().v() > 0.5;
         jn $$5 = $$1.k();
         return $$3 == dyf.b ? $$5 == jn.b || $$4 && $$5.o().d() : $$5 == jn.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(c) ? etb.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dwy $$2, eta $$3) {
      return $$2.c(b) != dyf.c ? dqt.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable coy $$0, dfo $$1, ji $$2, dwy $$3, esz $$4) {
      return $$3.c(b) != dyf.c ? dqt.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, etb.c, etb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.y().a(awv.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
