import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsg extends dne implements dup {
   public static final MapCodec<dsg> a = b(dsg::new);
   public static final ebx b = ebw.I;

   @Override
   public MapCodec<dsg> a() {
      return a;
   }

   protected dsg(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean b(ebg $$0, ebg $$1, jc $$2) {
      return $$1.a(dng.ag) && $$2.o() == jc.a.b;
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      exq $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == exr.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(b) ? exr.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b);
   }
}
