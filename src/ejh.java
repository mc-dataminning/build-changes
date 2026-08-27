import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ejh extends ekd {
   public static final Codec<ejh> a = Codec.FLOAT.fieldOf("mossiness").xmap(ejh::new, $$0 -> $$0.f).codec();
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dpy[] e = new dpy[]{dcx.jD.n(), dcx.jK.n()};
   private final float f;

   public ejh(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public ekg.c a(czx $$0, im $$1, im $$2, ekg.c $$3, ekg.c $$4, ekc $$5) {
      ayd $$6 = $$5.b($$4.a());
      dpy $$7 = $$4.b();
      im $$8 = $$4.a();
      dpy $$9 = null;
      if ($$7.a(dcx.eH) || $$7.a(dcx.b) || $$7.a(dcx.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(avo.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(avo.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(avo.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dcx.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new ekg.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dpy a(ayd $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dpy[] $$1 = new dpy[]{dcx.eJ.n(), a($$0, dcx.fj)};
         dpy[] $$2 = new dpy[]{dcx.eI.n(), a($$0, dcx.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dpy a(ayd $$0, dpy $$1) {
      ir $$2 = $$1.c(dkp.b);
      dqx $$3 = $$1.c(dkp.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dpy[] $$4 = new dpy[]{dcx.ng.n().a(dkp.b, $$2).a(dkp.c, $$3), dcx.nu.n()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dpy b(ayd $$0) {
      return $$0.i() < this.f ? dcx.nu.n() : null;
   }

   @Nullable
   private dpy c(ayd $$0) {
      return $$0.i() < this.f ? dcx.nI.n() : null;
   }

   @Nullable
   private dpy d(ayd $$0) {
      return $$0.i() < 0.15F ? dcx.pk.n() : null;
   }

   private static dpy a(ayd $$0, dcv $$1) {
      return $$1.n().a(dkp.b, ir.c.a.a($$0)).a(dkp.c, ac.a(dqx.values(), $$0));
   }

   private dpy a(ayd $$0, dpy[] $$1, dpy[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dpy a(ayd $$0, dpy[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected ekf<?> a() {
      return ekf.k;
   }
}
