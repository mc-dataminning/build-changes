import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtq extends dtp {
   public static final MapCodec<dtq> f = b(dtq::new);
   public static final ece<jc> g = drf.e;
   public static final ebx h = dtp.b;

   @Override
   public MapCodec<dtq> a() {
      return f;
   }

   protected dtq(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(g, jc.c).b(h, Boolean.valueOf(true)));
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return dwx.o($$0);
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      return dwx.b($$1, $$2, $$0.c(g));
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      return $$4.g() == $$0.c(g) && !$$0.a($$1, $$3) ? dng.a.m() : $$0;
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      ebg $$1 = dng.cA.a($$0);
      return $$1 == null ? null : this.m().b(g, $$1.c(g));
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      if ($$0.c(h)) {
         jc $$4 = $$0.c(g).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(lu.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(djz $$0, iw $$1, ebg $$2) {
      jc $$3 = $$2.c(g).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(ebg $$0, djd $$1, iw $$2, jc $$3) {
      return $$0.c(h) && $$0.c(g) != $$3 ? 15 : 0;
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(g, $$1.a($$0.c(g)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(g, h);
   }

   @Nullable
   @Override
   protected eyy a(djz $$0, ebg $$1) {
      return eyu.a($$0, $$1.c(g).g(), jc.b);
   }
}
