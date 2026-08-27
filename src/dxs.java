import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dxs extends dyo {
   public static final Codec<dxs> a = Codec.FLOAT.fieldOf("mossiness").xmap(dxs::new, $$0 -> $$0.f).codec();
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dez[] e = new dez[]{csm.jD.n(), csm.jK.n()};
   private final float f;

   public dxs(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public dyr.c a(cpo $$0, gu $$1, gu $$2, dyr.c $$3, dyr.c $$4, dyn $$5) {
      aru $$6 = $$5.b($$4.a());
      dez $$7 = $$4.b();
      gu $$8 = $$4.a();
      dez $$9 = null;
      if ($$7.a(csm.eI) || $$7.a(csm.b) || $$7.a(csm.eL)) {
         $$9 = this.a($$6);
      } else if ($$7.a(apl.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(apl.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(apl.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(csm.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new dyr.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dez a(aru $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dez[] $$1 = new dez[]{csm.eK.n(), a($$0, csm.fj)};
         dez[] $$2 = new dez[]{csm.eJ.n(), a($$0, csm.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dez a(aru $$0, dez $$1) {
      ha $$2 = $$1.c(daf.a);
      dfy $$3 = $$1.c(daf.b);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dez[] $$4 = new dez[]{csm.ng.n().a(daf.a, $$2).a(daf.b, $$3), csm.nu.n()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dez b(aru $$0) {
      return $$0.i() < this.f ? csm.nu.n() : null;
   }

   @Nullable
   private dez c(aru $$0) {
      return $$0.i() < this.f ? csm.nI.n() : null;
   }

   @Nullable
   private dez d(aru $$0) {
      return $$0.i() < 0.15F ? csm.pk.n() : null;
   }

   private static dez a(aru $$0, csl $$1) {
      return $$1.n().a(daf.a, ha.c.a.a($$0)).a(daf.b, ac.a(dfy.values(), $$0));
   }

   private dez a(aru $$0, dez[] $$1, dez[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dez a(aru $$0, dez[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected dyq<?> a() {
      return dyq.k;
   }
}
