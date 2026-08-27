import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ejq extends ekm {
   public static final Codec<ejq> a = Codec.FLOAT.fieldOf("mossiness").xmap(ejq::new, $$0 -> $$0.f).codec();
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dqh[] e = new dqh[]{ddg.jD.n(), ddg.jK.n()};
   private final float f;

   public ejq(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public ekp.c a(dag $$0, in $$1, in $$2, ekp.c $$3, ekp.c $$4, ekl $$5) {
      ayg $$6 = $$5.b($$4.a());
      dqh $$7 = $$4.b();
      in $$8 = $$4.a();
      dqh $$9 = null;
      if ($$7.a(ddg.eH) || $$7.a(ddg.b) || $$7.a(ddg.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(avr.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(avr.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(avr.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(ddg.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new ekp.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dqh a(ayg $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dqh[] $$1 = new dqh[]{ddg.eJ.n(), a($$0, ddg.fj)};
         dqh[] $$2 = new dqh[]{ddg.eI.n(), a($$0, ddg.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dqh a(ayg $$0, dqh $$1) {
      is $$2 = $$1.c(dky.b);
      drg $$3 = $$1.c(dky.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dqh[] $$4 = new dqh[]{ddg.ng.n().a(dky.b, $$2).a(dky.c, $$3), ddg.nu.n()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dqh b(ayg $$0) {
      return $$0.i() < this.f ? ddg.nu.n() : null;
   }

   @Nullable
   private dqh c(ayg $$0) {
      return $$0.i() < this.f ? ddg.nI.n() : null;
   }

   @Nullable
   private dqh d(ayg $$0) {
      return $$0.i() < 0.15F ? ddg.pk.n() : null;
   }

   private static dqh a(ayg $$0, dde $$1) {
      return $$1.n().a(dky.b, is.c.a.a($$0)).a(dky.c, ac.a(drg.values(), $$0));
   }

   private dqh a(ayg $$0, dqh[] $$1, dqh[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dqh a(ayg $$0, dqh[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected eko<?> a() {
      return eko.k;
   }
}
