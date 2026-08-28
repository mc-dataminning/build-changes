import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drq extends dne implements dup {
   public static final MapCodec<drq> a = b(drq::new);
   public static final ebx b = ebw.m;
   public static final ebx c = ebw.I;
   private static final fgm d = fgj.a(dne.b(4.0, 7.0, 9.0), dne.b(6.0, 0.0, 7.0));
   private static final fgm e = d.a(0.0, 0.0625, 0.0).d();

   @Override
   public MapCodec<drq> a() {
      return a;
   }

   public drq(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      exq $$1 = $$0.q().b_($$0.a());

      for (jc $$2 : $$0.f()) {
         if ($$2.o() == jc.a.b) {
            ebg $$3 = this.m().b(b, Boolean.valueOf($$2 == jc.b));
            if ($$3.a((dkc)$$0.q(), $$0.a())) {
               return $$3.b(c, Boolean.valueOf($$1.a() == exr.c));
            }
         }
      }

      return null;
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      jc $$3 = o($$0).g();
      return dne.a($$1, $$2.a($$3), $$3.g());
   }

   protected static jc o(ebg $$0) {
      return $$0.c(b) ? jc.a : jc.b;
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      return o($$0).g() == $$4 && !$$0.a($$1, $$3) ? dng.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(c) ? exr.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }
}
