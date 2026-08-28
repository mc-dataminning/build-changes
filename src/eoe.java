import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eoe extends epb {
   public static final MapCodec<eoe> a = Codec.FLOAT.fieldOf("mossiness").xmap(eoe::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final duo[] e = new duo[]{dhl.jD.o(), dhl.jK.o()};
   private final float f;

   public eoe(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public epe.c a(dej $$0, je $$1, je $$2, epe.c $$3, epe.c $$4, epa $$5) {
      azl $$6 = $$5.b($$4.a());
      duo $$7 = $$4.b();
      je $$8 = $$4.a();
      duo $$9 = null;
      if ($$7.a(dhl.eH) || $$7.a(dhl.b) || $$7.a(dhl.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(awt.K)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(awt.L)) {
         $$9 = this.b($$6);
      } else if ($$7.a(awt.M)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dhl.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new epe.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private duo a(azl $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         duo[] $$1 = new duo[]{dhl.eJ.o(), a($$0, dhl.fj)};
         duo[] $$2 = new duo[]{dhl.eI.o(), a($$0, dhl.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private duo a(azl $$0, duo $$1) {
      jj $$2 = $$1.c(dpe.b);
      dvn $$3 = $$1.c(dpe.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         duo[] $$4 = new duo[]{dhl.ng.o().b(dpe.b, $$2).b(dpe.c, $$3), dhl.nu.o()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private duo b(azl $$0) {
      return $$0.i() < this.f ? dhl.nu.o() : null;
   }

   @Nullable
   private duo c(azl $$0) {
      return $$0.i() < this.f ? dhl.nI.o() : null;
   }

   @Nullable
   private duo d(azl $$0) {
      return $$0.i() < 0.15F ? dhl.pk.o() : null;
   }

   private static duo a(azl $$0, dhj $$1) {
      return $$1.o().b(dpe.b, jj.c.a.a($$0)).b(dpe.c, ad.a(dvn.values(), $$0));
   }

   private duo a(azl $$0, duo[] $$1, duo[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static duo a(azl $$0, duo[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected epd<?> a() {
      return epd.k;
   }
}
