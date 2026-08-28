import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dut extends dpn implements dnh, dup {
   public static final MapCodec<dut> c = b(dut::new);
   private static final ebx e = ebw.I;
   public static final ece<jc> d = ebw.T;
   private static final fgm f = dne.b(12.0, 0.0, 13.0);

   @Override
   public MapCodec<dut> a() {
      return c;
   }

   public dut(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ecc.b).b(e, Boolean.valueOf(false)).b(d, jc.c));
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return f;
   }

   @Override
   protected boolean b(ebg $$0, djd $$1, iw $$2) {
      return $$0.a(axg.bA) || $$1.b_($$2.d()).a(exr.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      ebg $$1 = super.a($$0);
      return $$1 != null ? b($$0.q(), $$0.a(), $$1.b(d, $$0.g().g())) : null;
   }

   @Override
   public void a(djz $$0, iw $$1, ebg $$2, bxw $$3, daa $$4) {
      if (!$$0.A_()) {
         iw $$5 = $$1.d();
         ebg $$6 = dpn.b($$0, $$5, this.m().b(b, ecc.a).b(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(e) ? exr.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      if ($$0.c(b) == ecc.a) {
         return super.a($$0, $$1, $$2);
      } else {
         iw $$3 = $$2.e();
         ebg $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, e, d);
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      return true;
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return true;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      if ($$3.c(dpn.b) == ecc.b) {
         iw $$4 = $$2.d();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dnb.a($$0, $$1, $$2, $$3.c(d));
      } else {
         iw $$5 = $$2.e();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
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
   protected float au_() {
      return 0.1F;
   }
}
