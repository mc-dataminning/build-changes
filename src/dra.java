import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dra extends dne implements dup {
   public static final MapCodec<dra> a = b(dra::new);
   private static final ebx b = ebw.I;
   private static final fgm c = dne.b(12.0, 10.0, 16.0);

   @Override
   public MapCodec<dra> a() {
      return a;
   }

   protected dra(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b);
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(b) ? exr.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      ebg $$1 = super.a($$0);
      if ($$1 != null) {
         exq $$2 = $$0.q().b_($$0.a());
         return $$1.b(b, Boolean.valueOf($$2.a() == exr.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      iw $$3 = $$2.d();
      ebg $$4 = $$1.a_($$3);
      return $$4.c($$1, $$3, jc.a);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return c;
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$4 == jc.b && !this.a($$0, $$1, $$3)) {
         return dng.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, exr.c, exr.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
