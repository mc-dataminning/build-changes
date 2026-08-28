import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eln extends emj {
   public static final MapCodec<eln> a = Codec.FLOAT.fieldOf("mossiness").xmap(eln::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dse[] e = new dse[]{dfd.jD.o(), dfd.jK.o()};
   private final float f;

   public eln(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public emm.c a(dcd $$0, iz $$1, iz $$2, emm.c $$3, emm.c $$4, emi $$5) {
      azh $$6 = $$5.b($$4.a());
      dse $$7 = $$4.b();
      iz $$8 = $$4.a();
      dse $$9 = null;
      if ($$7.a(dfd.eH) || $$7.a(dfd.b) || $$7.a(dfd.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(awp.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(awp.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(awp.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dfd.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new emm.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dse a(azh $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dse[] $$1 = new dse[]{dfd.eJ.o(), a($$0, dfd.fj)};
         dse[] $$2 = new dse[]{dfd.eI.o(), a($$0, dfd.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dse a(azh $$0, dse $$1) {
      je $$2 = $$1.c(dmv.b);
      dtd $$3 = $$1.c(dmv.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dse[] $$4 = new dse[]{dfd.ng.o().a(dmv.b, $$2).a(dmv.c, $$3), dfd.nu.o()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dse b(azh $$0) {
      return $$0.i() < this.f ? dfd.nu.o() : null;
   }

   @Nullable
   private dse c(azh $$0) {
      return $$0.i() < this.f ? dfd.nI.o() : null;
   }

   @Nullable
   private dse d(azh $$0) {
      return $$0.i() < 0.15F ? dfd.pk.o() : null;
   }

   private static dse a(azh $$0, dfb $$1) {
      return $$1.o().a(dmv.b, je.c.a.a($$0)).a(dmv.c, ac.a(dtd.values(), $$0));
   }

   private dse a(azh $$0, dse[] $$1, dse[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dse a(azh $$0, dse[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected eml<?> a() {
      return eml.k;
   }
}
