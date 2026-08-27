import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ean extends ebj {
   public static final Codec<ean> a = Codec.FLOAT.fieldOf("mossiness").xmap(ean::new, $$0 -> $$0.f).codec();
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dhn[] e = new dhn[]{cvh.jD.o(), cvh.jK.o()};
   private final float f;

   public ean(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public ebm.c a(csi $$0, hx $$1, hx $$2, ebm.c $$3, ebm.c $$4, ebi $$5) {
      atw $$6 = $$5.b($$4.a());
      dhn $$7 = $$4.b();
      hx $$8 = $$4.a();
      dhn $$9 = null;
      if ($$7.a(cvh.eH) || $$7.a(cvh.b) || $$7.a(cvh.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(ark.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(ark.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(ark.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(cvh.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new ebm.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dhn a(atw $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dhn[] $$1 = new dhn[]{cvh.eJ.o(), a($$0, cvh.fj)};
         dhn[] $$2 = new dhn[]{cvh.eI.o(), a($$0, cvh.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dhn a(atw $$0, dhn $$1) {
      ib $$2 = $$1.c(dcy.b);
      dim $$3 = $$1.c(dcy.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dhn[] $$4 = new dhn[]{cvh.ng.o().a(dcy.b, $$2).a(dcy.c, $$3), cvh.nu.o()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dhn b(atw $$0) {
      return $$0.i() < this.f ? cvh.nu.o() : null;
   }

   @Nullable
   private dhn c(atw $$0) {
      return $$0.i() < this.f ? cvh.nI.o() : null;
   }

   @Nullable
   private dhn d(atw $$0) {
      return $$0.i() < 0.15F ? cvh.pk.o() : null;
   }

   private static dhn a(atw $$0, cvf $$1) {
      return $$1.o().a(dcy.b, ib.c.a.a($$0)).a(dcy.c, ac.a(dim.values(), $$0));
   }

   private dhn a(atw $$0, dhn[] $$1, dhn[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dhn a(atw $$0, dhn[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected ebl<?> a() {
      return ebl.k;
   }
}
