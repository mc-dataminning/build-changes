import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class eii extends eje {
   public static final Codec<eii> a = Codec.FLOAT.fieldOf("mossiness").xmap(eii::new, $$0 -> $$0.f).codec();
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final doz[] e = new doz[]{dca.jD.n(), dca.jK.n()};
   private final float f;

   public eii(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public ejh.c a(cza $$0, ib $$1, ib $$2, ejh.c $$3, ejh.c $$4, ejd $$5) {
      axr $$6 = $$5.b($$4.a());
      doz $$7 = $$4.b();
      ib $$8 = $$4.a();
      doz $$9 = null;
      if ($$7.a(dca.eH) || $$7.a(dca.b) || $$7.a(dca.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(avc.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(avc.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(avc.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dca.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new ejh.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private doz a(axr $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         doz[] $$1 = new doz[]{dca.eJ.n(), a($$0, dca.fj)};
         doz[] $$2 = new doz[]{dca.eI.n(), a($$0, dca.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private doz a(axr $$0, doz $$1) {
      ih $$2 = $$1.c(djr.b);
      dpy $$3 = $$1.c(djr.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         doz[] $$4 = new doz[]{dca.ng.n().a(djr.b, $$2).a(djr.c, $$3), dca.nu.n()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private doz b(axr $$0) {
      return $$0.i() < this.f ? dca.nu.n() : null;
   }

   @Nullable
   private doz c(axr $$0) {
      return $$0.i() < this.f ? dca.nI.n() : null;
   }

   @Nullable
   private doz d(axr $$0) {
      return $$0.i() < 0.15F ? dca.pk.n() : null;
   }

   private static doz a(axr $$0, dby $$1) {
      return $$1.n().a(djr.b, ih.c.a.a($$0)).a(djr.c, ac.a(dpy.values(), $$0));
   }

   private doz a(axr $$0, doz[] $$1, doz[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static doz a(axr $$0, doz[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected ejg<?> a() {
      return ejg.k;
   }
}
