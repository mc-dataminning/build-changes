import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class egf extends ehb {
   public static final Codec<egf> a = Codec.FLOAT.fieldOf("mossiness").xmap(egf::new, $$0 -> $$0.f).codec();
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dnb[] e = new dnb[]{dae.jD.o(), dae.jK.o()};
   private final float f;

   public egf(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public ehe.c a(cxe $$0, ib $$1, ib $$2, ehe.c $$3, ehe.c $$4, eha $$5) {
      axd $$6 = $$5.b($$4.a());
      dnb $$7 = $$4.b();
      ib $$8 = $$4.a();
      dnb $$9 = null;
      if ($$7.a(dae.eH) || $$7.a(dae.b) || $$7.a(dae.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(aun.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(aun.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(aun.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dae.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new ehe.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dnb a(axd $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dnb[] $$1 = new dnb[]{dae.eJ.o(), a($$0, dae.fj)};
         dnb[] $$2 = new dnb[]{dae.eI.o(), a($$0, dae.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dnb a(axd $$0, dnb $$1) {
      ih $$2 = $$1.c(dhv.b);
      doa $$3 = $$1.c(dhv.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dnb[] $$4 = new dnb[]{dae.ng.o().a(dhv.b, $$2).a(dhv.c, $$3), dae.nu.o()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dnb b(axd $$0) {
      return $$0.i() < this.f ? dae.nu.o() : null;
   }

   @Nullable
   private dnb c(axd $$0) {
      return $$0.i() < this.f ? dae.nI.o() : null;
   }

   @Nullable
   private dnb d(axd $$0) {
      return $$0.i() < 0.15F ? dae.pk.o() : null;
   }

   private static dnb a(axd $$0, dac $$1) {
      return $$1.o().a(dhv.b, ih.c.a.a($$0)).a(dhv.c, ac.a(doa.values(), $$0));
   }

   private dnb a(axd $$0, dnb[] $$1, dnb[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dnb a(axd $$0, dnb[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected ehd<?> a() {
      return ehd.k;
   }
}
