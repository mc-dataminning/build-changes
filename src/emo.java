import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class emo extends enk {
   public static final MapCodec<emo> a = Codec.FLOAT.fieldOf("mossiness").xmap(emo::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dta[] e = new dta[]{dfy.jD.o(), dfy.jK.o()};
   private final float f;

   public emo(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public enn.c a(dcx $$0, jd $$1, jd $$2, enn.c $$3, enn.c $$4, enj $$5) {
      ayv $$6 = $$5.b($$4.a());
      dta $$7 = $$4.b();
      jd $$8 = $$4.a();
      dta $$9 = null;
      if ($$7.a(dfy.eH) || $$7.a(dfy.b) || $$7.a(dfy.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(awd.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(awd.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(awd.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dfy.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new enn.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dta a(ayv $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dta[] $$1 = new dta[]{dfy.eJ.o(), a($$0, dfy.fj)};
         dta[] $$2 = new dta[]{dfy.eI.o(), a($$0, dfy.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dta a(ayv $$0, dta $$1) {
      ji $$2 = $$1.c(dnr.b);
      dtz $$3 = $$1.c(dnr.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dta[] $$4 = new dta[]{dfy.ng.o().a(dnr.b, $$2).a(dnr.c, $$3), dfy.nu.o()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dta b(ayv $$0) {
      return $$0.i() < this.f ? dfy.nu.o() : null;
   }

   @Nullable
   private dta c(ayv $$0) {
      return $$0.i() < this.f ? dfy.nI.o() : null;
   }

   @Nullable
   private dta d(ayv $$0) {
      return $$0.i() < 0.15F ? dfy.pk.o() : null;
   }

   private static dta a(ayv $$0, dfw $$1) {
      return $$1.o().a(dnr.b, ji.c.a.a($$0)).a(dnr.c, ad.a(dtz.values(), $$0));
   }

   private dta a(ayv $$0, dta[] $$1, dta[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dta a(ayv $$0, dta[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected enm<?> a() {
      return enm.k;
   }
}
