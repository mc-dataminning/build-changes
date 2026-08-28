import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dmo extends dne implements dup {
   public static final ebx b = ebw.I;
   private static final fgm a = dne.b(12.0, 0.0, 4.0);

   protected dmo(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends dmo> a();

   protected void a(ebg $$0, djd $$1, dko $$2, azz $$3, iw $$4) {
      if (!d($$0, $$1, $$4)) {
         $$2.a($$4, this, 60 + $$3.a(40));
      }
   }

   protected static boolean d(ebg $$0, djd $$1, iw $$2) {
      if ($$0.c(b)) {
         return true;
      } else {
         for (jc $$3 : jc.values()) {
            if ($$1.b_($$2.a($$3)).a(axl.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      exq $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.a(axl.a) && $$1.e() == 8));
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return a;
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      return $$4 == jc.a && !this.a($$0, $$1, $$3) ? dng.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      iw $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jc.b);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b);
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(b) ? exr.c.a(false) : super.b_($$0);
   }
}
