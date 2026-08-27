import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dxr extends dyn {
   public static final Codec<dxr> a = Codec.FLOAT.fieldOf("mossiness").xmap(dxr::new, $$0 -> $$0.f).codec();
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dey[] e = new dey[]{csl.jD.n(), csl.jK.n()};
   private final float f;

   public dxr(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public dyq.c a(cpn $$0, gv $$1, gv $$2, dyq.c $$3, dyq.c $$4, dym $$5) {
      art $$6 = $$5.b($$4.a());
      dey $$7 = $$4.b();
      gv $$8 = $$4.a();
      dey $$9 = null;
      if ($$7.a(csl.eI) || $$7.a(csl.b) || $$7.a(csl.eL)) {
         $$9 = this.a($$6);
      } else if ($$7.a(apj.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(apj.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(apj.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(csl.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new dyq.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dey a(art $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dey[] $$1 = new dey[]{csl.eK.n(), a($$0, csl.fj)};
         dey[] $$2 = new dey[]{csl.eJ.n(), a($$0, csl.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dey a(art $$0, dey $$1) {
      hb $$2 = $$1.c(dae.a);
      dfx $$3 = $$1.c(dae.b);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dey[] $$4 = new dey[]{csl.ng.n().a(dae.a, $$2).a(dae.b, $$3), csl.nu.n()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dey b(art $$0) {
      return $$0.i() < this.f ? csl.nu.n() : null;
   }

   @Nullable
   private dey c(art $$0) {
      return $$0.i() < this.f ? csl.nI.n() : null;
   }

   @Nullable
   private dey d(art $$0) {
      return $$0.i() < 0.15F ? csl.pk.n() : null;
   }

   private static dey a(art $$0, csk $$1) {
      return $$1.n().a(dae.a, hb.c.a.a($$0)).a(dae.b, ac.a(dfx.values(), $$0));
   }

   private dey a(art $$0, dey[] $$1, dey[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dey a(art $$0, dey[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected dyp<?> a() {
      return dyp.k;
   }
}
