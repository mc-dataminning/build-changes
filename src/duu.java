import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class duu extends dvq {
   public static final Codec<duu> a = Codec.FLOAT.fieldOf("mossiness").xmap(duu::new, $$0 -> $$0.f).codec();
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dcb[] e = new dcb[]{cpo.jD.n(), cpo.jK.n()};
   private final float f;

   public duu(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public dvt.c a(cmp $$0, gu $$1, gu $$2, dvt.c $$3, dvt.c $$4, dvp $$5) {
      apf $$6 = $$5.b($$4.a());
      dcb $$7 = $$4.b();
      gu $$8 = $$4.a();
      dcb $$9 = null;
      if ($$7.a(cpo.eI) || $$7.a(cpo.b) || $$7.a(cpo.eL)) {
         $$9 = this.a($$6);
      } else if ($$7.a(amw.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(amw.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(amw.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(cpo.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new dvt.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dcb a(apf $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dcb[] $$1 = new dcb[]{cpo.eK.n(), a($$0, cpo.fj)};
         dcb[] $$2 = new dcb[]{cpo.eJ.n(), a($$0, cpo.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dcb a(apf $$0, dcb $$1) {
      ha $$2 = $$1.c(cxh.a);
      dda $$3 = $$1.c(cxh.b);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dcb[] $$4 = new dcb[]{cpo.ng.n().a(cxh.a, $$2).a(cxh.b, $$3), cpo.nu.n()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dcb b(apf $$0) {
      return $$0.i() < this.f ? cpo.nu.n() : null;
   }

   @Nullable
   private dcb c(apf $$0) {
      return $$0.i() < this.f ? cpo.nI.n() : null;
   }

   @Nullable
   private dcb d(apf $$0) {
      return $$0.i() < 0.15F ? cpo.pk.n() : null;
   }

   private static dcb a(apf $$0, cpn $$1) {
      return $$1.n().a(cxh.a, ha.c.a.a($$0)).a(cxh.b, ac.a(dda.values(), $$0));
   }

   private dcb a(apf $$0, dcb[] $$1, dcb[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dcb a(apf $$0, dcb[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected dvs<?> a() {
      return dvs.k;
   }
}
