import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class dnx extends djl implements dqr {
   public static final MapCodec<dnx> a = b(dnx::new);
   public static final int b = 7;
   public static final dxv c = dxm.aF;
   public static final dxn d = dxm.A;
   public static final dxn e = dxm.J;
   private static final int f = 1;

   @Override
   public MapCodec<? extends dnx> a() {
      return a;
   }

   public dnx(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected fbt b_(dww $$0, dfm $$1, ji $$2) {
      return fbq.a();
   }

   @Override
   protected boolean f(dww $$0) {
      return $$0.c(c) == 7 && !$$0.c(d);
   }

   @Override
   protected void b(dww $$0, ard $$1, ji $$2, azh $$3) {
      if (this.o($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean o(dww $$0) {
      return !$$0.c(d) && $$0.c(c) == 7;
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int i_(dww $$0) {
      return 1;
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, esz.c, esz.c.a($$1));
      }

      int $$8 = r($$6) + 1;
      if ($$8 != 1 || $$0.c(c) != $$8) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   private static dww a(dww $$0, dgi $$1, ji $$2) {
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

   private static int r(dww $$0) {
      return q($$0).orElse(7);
   }

   public static OptionalInt q(dww $$0) {
      if ($$0.a(awp.u)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(c) ? OptionalInt.of($$0.c(c)) : OptionalInt.empty();
      }
   }

   @Override
   protected esy b_(dww $$0) {
      return $$0.c(e) ? esz.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(dww $$0, dgh $$1, ji $$2, azh $$3) {
      if ($$1.r($$2.d())) {
         if ($$3.a(15) == 1) {
            ji $$4 = $$2.e();
            dww $$5 = $$1.a_($$4);
            if (!$$5.t() || !$$5.c($$1, $$4, jn.b)) {
               azd.a($$1, $$2, $$3, lt.l);
            }
         }
      }
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   public dww a(daf $$0) {
      esy $$1 = $$0.q().b_($$0.a());
      dww $$2 = this.m().b(d, Boolean.valueOf(true)).b(e, Boolean.valueOf($$1.a() == esz.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
