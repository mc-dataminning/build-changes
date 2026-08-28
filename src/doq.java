import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class doq extends dke implements dri {
   public static final MapCodec<doq> b = b(doq::new);
   public static final int c = 7;
   public static final dym d = dyd.aD;
   public static final dye e = dyd.w;
   public static final dye f = dyd.D;
   private static final int a = 1;

   @Override
   public MapCodec<? extends doq> a() {
      return b;
   }

   public doq(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Integer.valueOf(7)).b(e, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected fcm b_(dxn $$0, dgf $$1, jh $$2) {
      return fcj.a();
   }

   @Override
   protected boolean f(dxn $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   protected void b(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if (this.o($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean o(dxn $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int i_(dxn $$0) {
      return 1;
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      int $$8 = r($$6) + 1;
      if ($$8 != 1 || $$0.c(d) != $$8) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   private static dxn a(dxn $$0, dhb $$1, jh $$2) {
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

   private static int r(dxn $$0) {
      return q($$0).orElse(7);
   }

   public static OptionalInt q(dxn $$0) {
      if ($$0.a(axu.u)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(f) ? etq.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(dxn $$0, dha $$1, jh $$2, bam $$3) {
      if ($$1.r($$2.d())) {
         if ($$3.a(15) == 1) {
            jh $$4 = $$2.e();
            dxn $$5 = $$1.a_($$4);
            if (!$$5.t() || !$$5.c($$1, $$4, jm.b)) {
               bai.a($$1, $$2, $$3, ls.l);
            }
         }
      }
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dxn a(dbb $$0) {
      etp $$1 = $$0.q().b_($$0.a());
      dxn $$2 = this.m().b(e, Boolean.valueOf(true)).b(f, Boolean.valueOf($$1.a() == etq.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
