import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dmm extends dnc implements dun {
   public static final ebv b = ebu.I;
   private static final fgk a = dnc.b(12.0, 0.0, 4.0);

   protected dmm(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends dmm> a();

   protected void a(ebe $$0, djb $$1, dkm $$2, azx $$3, iv $$4) {
      if (!d($$0, $$1, $$4)) {
         $$2.a($$4, this, 60 + $$3.a(40));
      }
   }

   protected static boolean d(ebe $$0, djb $$1, iv $$2) {
      if ($$0.c(b)) {
         return true;
      } else {
         for (jb $$3 : jb.values()) {
            if ($$1.b_($$2.a($$3)).a(axj.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      exo $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.a(axj.a) && $$1.e() == 8));
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return a;
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      return $$4 == jb.a && !this.a($$0, $$1, $$3) ? dne.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      iv $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jb.b);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b);
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(b) ? exp.c.a(false) : super.b_($$0);
   }
}
