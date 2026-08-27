import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dye extends dza {
   public static final Codec<dye> a = Codec.FLOAT.fieldOf("mossiness").xmap(dye::new, $$0 -> $$0.f).codec();
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dfl[] e = new dfl[]{csy.jD.n(), csy.jK.n()};
   private final float f;

   public dye(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public dzd.c a(cqa $$0, gw $$1, gw $$2, dzd.c $$3, dzd.c $$4, dyz $$5) {
      ase $$6 = $$5.b($$4.a());
      dfl $$7 = $$4.b();
      gw $$8 = $$4.a();
      dfl $$9 = null;
      if ($$7.a(csy.eI) || $$7.a(csy.b) || $$7.a(csy.eL)) {
         $$9 = this.a($$6);
      } else if ($$7.a(apu.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(apu.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(apu.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(csy.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new dzd.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dfl a(ase $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dfl[] $$1 = new dfl[]{csy.eK.n(), a($$0, csy.fj)};
         dfl[] $$2 = new dfl[]{csy.eJ.n(), a($$0, csy.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dfl a(ase $$0, dfl $$1) {
      hc $$2 = $$1.c(dar.a);
      dgk $$3 = $$1.c(dar.b);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dfl[] $$4 = new dfl[]{csy.ng.n().a(dar.a, $$2).a(dar.b, $$3), csy.nu.n()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dfl b(ase $$0) {
      return $$0.i() < this.f ? csy.nu.n() : null;
   }

   @Nullable
   private dfl c(ase $$0) {
      return $$0.i() < this.f ? csy.nI.n() : null;
   }

   @Nullable
   private dfl d(ase $$0) {
      return $$0.i() < 0.15F ? csy.pk.n() : null;
   }

   private static dfl a(ase $$0, csx $$1) {
      return $$1.n().a(dar.a, hc.c.a.a($$0)).a(dar.b, ac.a(dgk.values(), $$0));
   }

   private dfl a(ase $$0, dfl[] $$1, dfl[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dfl a(ase $$0, dfl[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected dzc<?> a() {
      return dzc.k;
   }
}
