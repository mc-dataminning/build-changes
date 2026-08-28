import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class dnz extends djn implements dqt {
   public static final MapCodec<dnz> a = b(dnz::new);
   public static final int b = 7;
   public static final dxx c = dxo.aF;
   public static final dxp d = dxo.A;
   public static final dxp e = dxo.J;
   private static final int f = 1;

   @Override
   public MapCodec<? extends dnz> a() {
      return a;
   }

   public dnz(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected fbv b_(dwy $$0, dfo $$1, ji $$2) {
      return fbs.a();
   }

   @Override
   protected boolean f(dwy $$0) {
      return $$0.c(c) == 7 && !$$0.c(d);
   }

   @Override
   protected void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if (this.o($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean o(dwy $$0) {
      return !$$0.c(d) && $$0.c(c) == 7;
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int i_(dwy $$0) {
      return 1;
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, etb.c, etb.c.a($$1));
      }

      int $$8 = r($$6) + 1;
      if ($$8 != 1 || $$0.c(c) != $$8) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   private static dwy a(dwy $$0, dgk $$1, ji $$2) {
      int $$3 = 7;
      ji.a $$4 = new ji.a();

      for (jn $$5 : jn.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, r($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.b(c, Integer.valueOf($$3));
   }

   private static int r(dwy $$0) {
      return q($$0).orElse(7);
   }

   public static OptionalInt q(dwy $$0) {
      if ($$0.a(awp.u)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(c) ? OptionalInt.of($$0.c(c)) : OptionalInt.empty();
      }
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(e) ? etb.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, azh $$3) {
      if ($$1.r($$2.d())) {
         if ($$3.a(15) == 1) {
            ji $$4 = $$2.e();
            dwy $$5 = $$1.a_($$4);
            if (!$$5.t() || !$$5.c($$1, $$4, jn.b)) {
               azd.a($$1, $$2, $$3, lt.l);
            }
         }
      }
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   public dwy a(dah $$0) {
      eta $$1 = $$0.q().b_($$0.a());
      dwy $$2 = this.m().b(d, Boolean.valueOf(true)).b(e, Boolean.valueOf($$1.a() == etb.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
