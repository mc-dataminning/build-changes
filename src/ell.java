import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ell extends emh {
   public static final MapCodec<ell> a = Codec.FLOAT.fieldOf("mossiness").xmap(ell::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dsc[] e = new dsc[]{dfb.jD.o(), dfb.jK.o()};
   private final float f;

   public ell(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public emk.c a(dcb $$0, iz $$1, iz $$2, emk.c $$3, emk.c $$4, emg $$5) {
      azh $$6 = $$5.b($$4.a());
      dsc $$7 = $$4.b();
      iz $$8 = $$4.a();
      dsc $$9 = null;
      if ($$7.a(dfb.eH) || $$7.a(dfb.b) || $$7.a(dfb.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(awp.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(awp.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(awp.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dfb.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new emk.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dsc a(azh $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dsc[] $$1 = new dsc[]{dfb.eJ.o(), a($$0, dfb.fj)};
         dsc[] $$2 = new dsc[]{dfb.eI.o(), a($$0, dfb.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dsc a(azh $$0, dsc $$1) {
      je $$2 = $$1.c(dmt.b);
      dtb $$3 = $$1.c(dmt.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dsc[] $$4 = new dsc[]{dfb.ng.o().a(dmt.b, $$2).a(dmt.c, $$3), dfb.nu.o()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dsc b(azh $$0) {
      return $$0.i() < this.f ? dfb.nu.o() : null;
   }

   @Nullable
   private dsc c(azh $$0) {
      return $$0.i() < this.f ? dfb.nI.o() : null;
   }

   @Nullable
   private dsc d(azh $$0) {
      return $$0.i() < 0.15F ? dfb.pk.o() : null;
   }

   private static dsc a(azh $$0, dez $$1) {
      return $$1.o().a(dmt.b, je.c.a.a($$0)).a(dmt.c, ac.a(dtb.values(), $$0));
   }

   private dsc a(azh $$0, dsc[] $$1, dsc[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dsc a(azh $$0, dsc[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected emj<?> a() {
      return emj.k;
   }
}
