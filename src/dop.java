import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class dop extends dkd implements drj {
   public static final MapCodec<dop> a = b(dop::new);
   public static final int b = 7;
   public static final dyn c = dye.aF;
   public static final dyf d = dye.A;
   public static final dyf e = dye.J;
   private static final int f = 1;

   @Override
   public MapCodec<? extends dop> a() {
      return a;
   }

   public dop(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected fcl b_(dxo $$0, dge $$1, jh $$2) {
      return fci.a();
   }

   @Override
   protected boolean f(dxo $$0) {
      return $$0.c(c) == 7 && !$$0.c(d);
   }

   @Override
   protected void b(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if (this.o($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean o(dxo $$0) {
      return !$$0.c(d) && $$0.c(c) == 7;
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int i_(dxo $$0) {
      return 1;
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, etr.c, etr.c.a($$1));
      }

      int $$8 = r($$6) + 1;
      if ($$8 != 1 || $$0.c(c) != $$8) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   private static dxo a(dxo $$0, dha $$1, jh $$2) {
      int $$3 = 7;
      jh.a $$4 = new jh.a();

      for (jm $$5 : jm.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, r($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.b(c, Integer.valueOf($$3));
   }

   private static int r(dxo $$0) {
      return q($$0).orElse(7);
   }

   public static OptionalInt q(dxo $$0) {
      if ($$0.a(axk.u)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(c) ? OptionalInt.of($$0.c(c)) : OptionalInt.empty();
      }
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(e) ? etr.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
      if ($$1.r($$2.d())) {
         if ($$3.a(15) == 1) {
            jh $$4 = $$2.e();
            dxo $$5 = $$1.a_($$4);
            if (!$$5.t() || !$$5.c($$1, $$4, jm.b)) {
               azy.a($$1, $$2, $$3, ls.l);
            }
         }
      }
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   public dxo a(dax $$0) {
      etq $$1 = $$0.q().b_($$0.a());
      dxo $$2 = this.m().b(d, Boolean.valueOf(true)).b(e, Boolean.valueOf($$1.a() == etr.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
