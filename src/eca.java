import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class eca extends ecw {
   public static final Codec<eca> a = Codec.FLOAT.fieldOf("mossiness").xmap(eca::new, $$0 -> $$0.f).codec();
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dja[] e = new dja[]{cwl.jD.o(), cwl.jK.o()};
   private final float f;

   public eca(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public ecz.c a(ctl $$0, hx $$1, hx $$2, ecz.c $$3, ecz.c $$4, ecv $$5) {
      aup $$6 = $$5.b($$4.a());
      dja $$7 = $$4.b();
      hx $$8 = $$4.a();
      dja $$9 = null;
      if ($$7.a(cwl.eH) || $$7.a(cwl.b) || $$7.a(cwl.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(asb.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(asb.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(asb.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(cwl.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new ecz.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dja a(aup $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dja[] $$1 = new dja[]{cwl.eJ.o(), a($$0, cwl.fj)};
         dja[] $$2 = new dja[]{cwl.eI.o(), a($$0, cwl.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dja a(aup $$0, dja $$1) {
      ic $$2 = $$1.c(dec.b);
      djz $$3 = $$1.c(dec.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dja[] $$4 = new dja[]{cwl.ng.o().a(dec.b, $$2).a(dec.c, $$3), cwl.nu.o()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dja b(aup $$0) {
      return $$0.i() < this.f ? cwl.nu.o() : null;
   }

   @Nullable
   private dja c(aup $$0) {
      return $$0.i() < this.f ? cwl.nI.o() : null;
   }

   @Nullable
   private dja d(aup $$0) {
      return $$0.i() < 0.15F ? cwl.pk.o() : null;
   }

   private static dja a(aup $$0, cwj $$1) {
      return $$1.o().a(dec.b, ic.c.a.a($$0)).a(dec.c, ac.a(djz.values(), $$0));
   }

   private dja a(aup $$0, dja[] $$1, dja[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dja a(aup $$0, dja[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected ecy<?> a() {
      return ecy.k;
   }
}
