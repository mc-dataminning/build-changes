import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class dox extends dkl implements drp {
   public static final MapCodec<dox> b = b(dox::new);
   public static final int c = 7;
   public static final dyt d = dyk.aD;
   public static final dyl e = dyk.w;
   public static final dyl f = dyk.D;
   private static final int a = 1;

   @Override
   public MapCodec<? extends dox> a() {
      return b;
   }

   public dox(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Integer.valueOf(7)).b(e, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected fcr b_(dxu $$0, dgm $$1, jh $$2) {
      return fco.a();
   }

   @Override
   protected boolean f(dxu $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   protected void b(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if (this.o($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean o(dxu $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int i_(dxu $$0) {
      return 1;
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      int $$8 = r($$6) + 1;
      if ($$8 != 1 || $$0.c(d) != $$8) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   private static dxu a(dxu $$0, dhi $$1, jh $$2) {
      int $$3 = 7;
      jh.a $$4 = new jh.a();

      for (jm $$5 : jm.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, r($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.b(d, Integer.valueOf($$3));
   }

   private static int r(dxu $$0) {
      return q($$0).orElse(7);
   }

   public static OptionalInt q(dxu $$0) {
      if ($$0.a(axu.u)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   protected etw b_(dxu $$0) {
      return $$0.c(f) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(dxu $$0, dhh $$1, jh $$2, bam $$3) {
      if ($$1.r($$2.d())) {
         if ($$3.a(15) == 1) {
            jh $$4 = $$2.e();
            dxu $$5 = $$1.a_($$4);
            if (!$$5.t() || !$$5.c($$1, $$4, jm.b)) {
               bai.a($$1, $$2, $$3, ls.l);
            }
         }
      }
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dxu a(dbf $$0) {
      etw $$1 = $$0.q().b_($$0.a());
      dxu $$2 = this.m().b(e, Boolean.valueOf(true)).b(f, Boolean.valueOf($$1.a() == etx.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
