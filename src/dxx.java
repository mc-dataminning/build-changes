import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dxx extends dyt {
   public static final Codec<dxx> a = Codec.FLOAT.fieldOf("mossiness").xmap(dxx::new, $$0 -> $$0.f).codec();
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dfe[] e = new dfe[]{csr.jD.n(), csr.jK.n()};
   private final float f;

   public dxx(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public dyw.c a(cpt $$0, gw $$1, gw $$2, dyw.c $$3, dyw.c $$4, dys $$5) {
      arx $$6 = $$5.b($$4.a());
      dfe $$7 = $$4.b();
      gw $$8 = $$4.a();
      dfe $$9 = null;
      if ($$7.a(csr.eI) || $$7.a(csr.b) || $$7.a(csr.eL)) {
         $$9 = this.a($$6);
      } else if ($$7.a(apo.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(apo.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(apo.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(csr.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new dyw.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dfe a(arx $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dfe[] $$1 = new dfe[]{csr.eK.n(), a($$0, csr.fj)};
         dfe[] $$2 = new dfe[]{csr.eJ.n(), a($$0, csr.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dfe a(arx $$0, dfe $$1) {
      hc $$2 = $$1.c(dak.a);
      dgd $$3 = $$1.c(dak.b);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dfe[] $$4 = new dfe[]{csr.ng.n().a(dak.a, $$2).a(dak.b, $$3), csr.nu.n()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dfe b(arx $$0) {
      return $$0.i() < this.f ? csr.nu.n() : null;
   }

   @Nullable
   private dfe c(arx $$0) {
      return $$0.i() < this.f ? csr.nI.n() : null;
   }

   @Nullable
   private dfe d(arx $$0) {
      return $$0.i() < 0.15F ? csr.pk.n() : null;
   }

   private static dfe a(arx $$0, csq $$1) {
      return $$1.n().a(dak.a, hc.c.a.a($$0)).a(dak.b, ac.a(dgd.values(), $$0));
   }

   private dfe a(arx $$0, dfe[] $$1, dfe[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dfe a(arx $$0, dfe[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected dyv<?> a() {
      return dyv.k;
   }
}
