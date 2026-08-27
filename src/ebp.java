import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ebp extends ecl {
   public static final Codec<ebp> a = Codec.FLOAT.fieldOf("mossiness").xmap(ebp::new, $$0 -> $$0.f).codec();
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dip[] e = new dip[]{cwb.jD.o(), cwb.jK.o()};
   private final float f;

   public ebp(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public eco.c a(ctb $$0, hv $$1, hv $$2, eco.c $$3, eco.c $$4, eck $$5) {
      auf $$6 = $$5.b($$4.a());
      dip $$7 = $$4.b();
      hv $$8 = $$4.a();
      dip $$9 = null;
      if ($$7.a(cwb.eH) || $$7.a(cwb.b) || $$7.a(cwb.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(arr.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(arr.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(arr.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(cwb.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new eco.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dip a(auf $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dip[] $$1 = new dip[]{cwb.eJ.o(), a($$0, cwb.fj)};
         dip[] $$2 = new dip[]{cwb.eI.o(), a($$0, cwb.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dip a(auf $$0, dip $$1) {
      ia $$2 = $$1.c(dds.b);
      djo $$3 = $$1.c(dds.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dip[] $$4 = new dip[]{cwb.ng.o().a(dds.b, $$2).a(dds.c, $$3), cwb.nu.o()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dip b(auf $$0) {
      return $$0.i() < this.f ? cwb.nu.o() : null;
   }

   @Nullable
   private dip c(auf $$0) {
      return $$0.i() < this.f ? cwb.nI.o() : null;
   }

   @Nullable
   private dip d(auf $$0) {
      return $$0.i() < 0.15F ? cwb.pk.o() : null;
   }

   private static dip a(auf $$0, cvz $$1) {
      return $$1.o().a(dds.b, ia.c.a.a($$0)).a(dds.c, ac.a(djo.values(), $$0));
   }

   private dip a(auf $$0, dip[] $$1, dip[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dip a(auf $$0, dip[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected ecn<?> a() {
      return ecn.k;
   }
}
