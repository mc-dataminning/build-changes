import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class doy extends dkm implements drq {
   public static final MapCodec<doy> b = b(doy::new);
   public static final int c = 7;
   public static final dyu d = dyl.aD;
   public static final dym e = dyl.w;
   public static final dym f = dyl.D;
   private static final int a = 1;

   @Override
   public MapCodec<? extends doy> a() {
      return b;
   }

   public doy(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Integer.valueOf(7)).b(e, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected fcs b_(dxv $$0, dgn $$1, jh $$2) {
      return fcp.a();
   }

   @Override
   protected boolean f(dxv $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   protected void b(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if (this.o($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean o(dxv $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int i_(dxv $$0) {
      return 1;
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      int $$8 = r($$6) + 1;
      if ($$8 != 1 || $$0.c(d) != $$8) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   private static dxv a(dxv $$0, dhj $$1, jh $$2) {
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

   private static int r(dxv $$0) {
      return q($$0).orElse(7);
   }

   public static OptionalInt q(dxv $$0) {
      if ($$0.a(axu.u)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(f) ? ety.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(dxv $$0, dhi $$1, jh $$2, bam $$3) {
      if ($$1.r($$2.d())) {
         if ($$3.a(15) == 1) {
            jh $$4 = $$2.e();
            dxv $$5 = $$1.a_($$4);
            if (!$$5.t() || !$$5.c($$1, $$4, jm.b)) {
               bai.a($$1, $$2, $$3, ls.l);
            }
         }
      }
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dxv a(dbg $$0) {
      etx $$1 = $$0.q().b_($$0.a());
      dxv $$2 = this.m().b(e, Boolean.valueOf(true)).b(f, Boolean.valueOf($$1.a() == ety.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
