import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dmp extends dmm {
   public static final MapCodec<dmp> c = b(dmp::new);
   public static final ece<jc> d = drf.e;
   private static final Map<jc, fgm> e = fgj.c(dne.b(16.0, 8.0, 5.0, 16.0));

   @Override
   public MapCodec<? extends dmp> a() {
      return c;
   }

   protected dmp(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(d, jc.c).b(b, Boolean.valueOf(true)));
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return e.get($$0.c(d));
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(d, b);
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      return $$4.g() == $$0.c(d) && !$$0.a($$1, $$3) ? dng.a.m() : $$0;
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      jc $$3 = $$0.c(d);
      iw $$4 = $$2.a($$3.g());
      ebg $$5 = $$1.a_($$4);
      return $$5.c($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      ebg $$1 = super.a($$0);
      dkc $$2 = $$0.q();
      iw $$3 = $$0.a();
      jc[] $$4 = $$0.f();

      for (jc $$5 : $$4) {
         if ($$5.o().d()) {
            $$1 = $$1.b(d, $$5.g());
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }
}
