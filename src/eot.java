import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eot extends epq {
   public static final MapCodec<eot> a = Codec.FLOAT.fieldOf("mossiness").xmap(eot::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dvd[] e = new dvd[]{dia.jD.m(), dia.jK.m()};
   private final float f;

   public eot(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public ept.c a(dey $$0, jg $$1, jg $$2, ept.c $$3, ept.c $$4, epp $$5) {
      azr $$6 = $$5.b($$4.a());
      dvd $$7 = $$4.b();
      jg $$8 = $$4.a();
      dvd $$9 = null;
      if ($$7.a(dia.eH) || $$7.a(dia.b) || $$7.a(dia.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(awz.K)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(awz.L)) {
         $$9 = this.b($$6);
      } else if ($$7.a(awz.M)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dia.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new ept.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dvd a(azr $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dvd[] $$1 = new dvd[]{dia.eJ.m(), a($$0, dia.fj)};
         dvd[] $$2 = new dvd[]{dia.eI.m(), a($$0, dia.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dvd a(azr $$0, dvd $$1) {
      jl $$2 = $$1.c(dps.b);
      dwc $$3 = $$1.c(dps.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dvd[] $$4 = new dvd[]{dia.ng.m().b(dps.b, $$2).b(dps.c, $$3), dia.nu.m()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dvd b(azr $$0) {
      return $$0.i() < this.f ? dia.nu.m() : null;
   }

   @Nullable
   private dvd c(azr $$0) {
      return $$0.i() < this.f ? dia.nI.m() : null;
   }

   @Nullable
   private dvd d(azr $$0) {
      return $$0.i() < 0.15F ? dia.pk.m() : null;
   }

   private static dvd a(azr $$0, dhy $$1) {
      return $$1.m().b(dps.b, jl.c.a.a($$0)).b(dps.c, ad.a(dwc.values(), $$0));
   }

   private dvd a(azr $$0, dvd[] $$1, dvd[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dvd a(azr $$0, dvd[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected eps<?> a() {
      return eps.k;
   }
}
