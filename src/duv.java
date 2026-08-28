import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class duv extends dnc {
   public static final MapCodec<duv> a = b(duv::new);
   public static final int b = 8;
   public static final ece c = ebu.aI;
   private static final fgk[] e = dnc.a(8, $$0 -> dnc.b(16.0, 0.0, (double)($$0 * 2)));
   public static final int d = 5;

   @Override
   public MapCodec<duv> a() {
      return a;
   }

   protected duv(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return $$1 == eyd.a ? $$0.c(c) < 5 : false;
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected fgk b(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return e[$$0.c(c) - 1];
   }

   @Override
   protected fgk b_(ebe $$0, djb $$1, iv $$2) {
      return e[$$0.c(c)];
   }

   @Override
   protected fgk c(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean g_(ebe $$0) {
      return true;
   }

   @Override
   protected float c(ebe $$0, djb $$1, iv $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      ebe $$3 = $$1.a_($$2.e());
      if ($$3.a(axe.cv)) {
         return false;
      } else {
         return $$3.a(axe.cw) ? true : dnc.a($$3.g($$1, $$2.e()), jb.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      return !$$0.a($$1, $$3) ? dne.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if ($$1.a(dkg.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(ebe $$0, ddr $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.h()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == jb.b : true;
      }
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      ebe $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.b(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(c);
   }
}
