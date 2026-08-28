import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqn extends dno {
   public static final MapCodec<dqn> a = b(dqn::new);
   public static final ecq b = ecg.aT;
   private static final fgw d = dno.b(16.0, 0.0, 15.0);
   public static final int c = 7;

   @Override
   public MapCodec<dqn> a() {
      return a;
   }

   protected dqn(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$4 == jc.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      ebq $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dqp || $$3.b() instanceof ebh;
   }

   @Override
   public ebq a(ded $$0) {
      return !this.m().a((dkm)$$0.q(), $$0.a()) ? dnq.j.m() : super.a($$0);
   }

   @Override
   protected boolean g_(ebq $$0) {
      return true;
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return d;
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      int $$4 = $$0.c(b);
      if (!a((dkm)$$1, $$2) && !$$1.r($$2.d())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((djn)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dkj $$0, ebq $$1, iw $$2, bxe $$3, double $$4) {
      if ($$0 instanceof asb $$5
         && (double)$$0.A.i() < $$4 - 0.5
         && $$3 instanceof byf
         && ($$3 instanceof csi || $$5.O().c(dkf.d))
         && $$3.dq() * $$3.dq() * $$3.dr() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bxe $$0, ebq $$1, dkj $$2, iw $$3) {
      ebq $$4 = a($$1, dnq.j.m(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(egq.c, $$3, egq.a.a($$0, $$4));
   }

   private static boolean a(djn $$0, iw $$1) {
      return $$0.a_($$1.d()).a(axn.cE);
   }

   private static boolean a(dkm $$0, iw $$1) {
      for (iw $$2 : iw.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(axs.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }
}
