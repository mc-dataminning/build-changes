import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqd extends dne {
   public static final MapCodec<dqd> a = b(dqd::new);
   public static final ecg b = ebw.aT;
   private static final fgm d = dne.b(16.0, 0.0, 15.0);
   public static final int c = 7;

   @Override
   public MapCodec<dqd> a() {
      return a;
   }

   protected dqd(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$4 == jc.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      ebg $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dqf || $$3.b() instanceof eax;
   }

   @Override
   public ebg a(ddt $$0) {
      return !this.m().a((dkc)$$0.q(), $$0.a()) ? dng.j.m() : super.a($$0);
   }

   @Override
   protected boolean g_(ebg $$0) {
      return true;
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return d;
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
      int $$4 = $$0.c(b);
      if (!a((dkc)$$1, $$2) && !$$1.r($$2.d())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((djd)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(djz $$0, ebg $$1, iw $$2, bwv $$3, double $$4) {
      if ($$0 instanceof aru $$5
         && (double)$$0.A.i() < $$4 - 0.5
         && $$3 instanceof bxw
         && ($$3 instanceof crz || $$5.O().c(djv.d))
         && $$3.dq() * $$3.dq() * $$3.dr() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bwv $$0, ebg $$1, djz $$2, iw $$3) {
      ebg $$4 = a($$1, dng.j.m(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(egg.c, $$3, egg.a.a($$0, $$4));
   }

   private static boolean a(djd $$0, iw $$1) {
      return $$0.a_($$1.d()).a(axg.cE);
   }

   private static boolean a(dkc $$0, iw $$1) {
      for (iw $$2 : iw.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(axl.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }
}
