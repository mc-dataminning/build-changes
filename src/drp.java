import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class drp extends dne implements dup {
   public static final MapCodec<drp> a = b(drp::new);
   public static final ece<jc> b = drf.e;
   public static final ebx c = ebw.I;
   public static final Map<jc, fgm> d = fgj.c(dne.c(16.0, 13.0, 16.0));

   @Override
   public MapCodec<drp> a() {
      return a;
   }

   protected drp(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return d.get($$0.c(b));
   }

   private boolean a(djd $$0, iw $$1, jc $$2) {
      ebg $$3 = $$0.a_($$1);
      return $$3.c($$0, $$1, $$2);
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      jc $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$4.g() == $$0.c(b) && !$$0.a($$1, $$3)) {
         return dng.a.m();
      } else {
         if ($$0.c(c)) {
            $$2.a($$3, exr.c, exr.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      if (!$$0.c()) {
         ebg $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      ebg $$2 = this.m();
      dkc $$3 = $$0.q();
      iw $$4 = $$0.a();
      exq $$5 = $$0.q().b_($$0.a());

      for (jc $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.b(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.b(c, Boolean.valueOf($$5.a() == exr.c));
            }
         }
      }

      return null;
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(c) ? exr.c.a(false) : super.b_($$0);
   }
}
