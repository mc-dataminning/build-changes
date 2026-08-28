import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class eaz extends dpi {
   public static final MapCodec<eaz> b = b(eaz::new);
   public static final ece<eci> c = ebw.bj;
   public static final ebx d = ebw.B;
   public static final int e = 4;
   private static final fgm f = dne.c(16.0, 0.0, 4.0);
   private static final Map<jc, fgm> g = fgj.d(fgj.a(f, dne.c(4.0, 4.0, 16.0)));
   private static final Map<jc, fgm> h = fgj.d(fgj.a(f, dne.c(4.0, 4.0, 20.0)));

   @Override
   protected MapCodec<eaz> a() {
      return b;
   }

   public eaz(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(a, jc.c).b(c, eci.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(ebg $$0) {
      return true;
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return ($$0.c(d) ? g : h).get($$0.c(a));
   }

   private boolean a(ebg $$0, ebg $$1) {
      dne $$2 = $$0.c(c) == eci.a ? dng.bI : dng.by;
      return $$1.a($$2) && $$1.c(eay.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public ebg a(djz $$0, iw $$1, ebg $$2, crz $$3) {
      if (!$$0.C && $$3.gl()) {
         iw $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, boolean $$3) {
      iw $$4 = $$2.a($$0.c(a).g());
      if (this.a($$0, $$1.a_($$4))) {
         $$1.b($$4, true);
      }
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      return $$4.g() == $$0.c(a) && !$$0.a($$1, $$3) ? dng.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      ebg $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dng.ca) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, dne $$3, @Nullable eyy $$4, boolean $$5) {
      if ($$0.a((dkc)$$1, $$2)) {
         $$1.b($$2.a($$0.c(a).g()), $$3, eyu.a($$4, $$0.c(a).g()));
      }
   }

   @Override
   protected daa a(dkc $$0, iw $$1, ebg $$2, boolean $$3) {
      return new daa($$2.c(c) == eci.b ? dng.by : dng.bI);
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }
}
