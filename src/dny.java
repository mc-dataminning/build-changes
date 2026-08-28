import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class dny extends djm implements dqs {
   public static final MapCodec<dny> a = b(dny::new);
   public static final int b = 7;
   public static final dxw c = dxn.aF;
   public static final dxo d = dxn.A;
   public static final dxo e = dxn.J;
   private static final int f = 1;

   @Override
   public MapCodec<? extends dny> a() {
      return a;
   }

   public dny(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected fbu b_(dwx $$0, dfn $$1, ji $$2) {
      return fbr.a();
   }

   @Override
   protected boolean f(dwx $$0) {
      return $$0.c(c) == 7 && !$$0.c(d);
   }

   @Override
   protected void b(dwx $$0, ard $$1, ji $$2, azh $$3) {
      if (this.o($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean o(dwx $$0) {
      return !$$0.c(d) && $$0.c(c) == 7;
   }

   @Override
   protected void a(dwx $$0, ard $$1, ji $$2, azh $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int i_(dwx $$0) {
      return 1;
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, eta.c, eta.c.a($$1));
      }

      int $$8 = r($$6) + 1;
      if ($$8 != 1 || $$0.c(c) != $$8) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   private static dwx a(dwx $$0, dgj $$1, ji $$2) {
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

   private static int r(dwx $$0) {
      return q($$0).orElse(7);
   }

   public static OptionalInt q(dwx $$0) {
      if ($$0.a(awp.u)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(c) ? OptionalInt.of($$0.c(c)) : OptionalInt.empty();
      }
   }

   @Override
   protected esz b_(dwx $$0) {
      return $$0.c(e) ? eta.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(dwx $$0, dgi $$1, ji $$2, azh $$3) {
      if ($$1.r($$2.d())) {
         if ($$3.a(15) == 1) {
            ji $$4 = $$2.e();
            dwx $$5 = $$1.a_($$4);
            if (!$$5.t() || !$$5.c($$1, $$4, jn.b)) {
               azd.a($$1, $$2, $$3, lt.l);
            }
         }
      }
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   public dwx a(dag $$0) {
      esz $$1 = $$0.q().b_($$0.a());
      dwx $$2 = this.m().b(d, Boolean.valueOf(true)).b(e, Boolean.valueOf($$1.a() == eta.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
