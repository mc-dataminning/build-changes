import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class elm extends emi {
   public static final MapCodec<elm> a = Codec.FLOAT.fieldOf("mossiness").xmap(elm::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dsd[] e = new dsd[]{dfc.jD.o(), dfc.jK.o()};
   private final float f;

   public elm(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public eml.c a(dcc $$0, iz $$1, iz $$2, eml.c $$3, eml.c $$4, emh $$5) {
      azh $$6 = $$5.b($$4.a());
      dsd $$7 = $$4.b();
      iz $$8 = $$4.a();
      dsd $$9 = null;
      if ($$7.a(dfc.eH) || $$7.a(dfc.b) || $$7.a(dfc.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(awp.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(awp.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(awp.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dfc.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new eml.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dsd a(azh $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dsd[] $$1 = new dsd[]{dfc.eJ.o(), a($$0, dfc.fj)};
         dsd[] $$2 = new dsd[]{dfc.eI.o(), a($$0, dfc.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dsd a(azh $$0, dsd $$1) {
      je $$2 = $$1.c(dmu.b);
      dtc $$3 = $$1.c(dmu.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dsd[] $$4 = new dsd[]{dfc.ng.o().a(dmu.b, $$2).a(dmu.c, $$3), dfc.nu.o()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dsd b(azh $$0) {
      return $$0.i() < this.f ? dfc.nu.o() : null;
   }

   @Nullable
   private dsd c(azh $$0) {
      return $$0.i() < this.f ? dfc.nI.o() : null;
   }

   @Nullable
   private dsd d(azh $$0) {
      return $$0.i() < 0.15F ? dfc.pk.o() : null;
   }

   private static dsd a(azh $$0, dfa $$1) {
      return $$1.o().a(dmu.b, je.c.a.a($$0)).a(dmu.c, ac.a(dtc.values(), $$0));
   }

   private dsd a(azh $$0, dsd[] $$1, dsd[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dsd a(azh $$0, dsd[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected emk<?> a() {
      return emk.k;
   }
}
