import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dxw extends dys {
   public static final Codec<dxw> a = Codec.FLOAT.fieldOf("mossiness").xmap(dxw::new, $$0 -> $$0.f).codec();
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dfd[] e = new dfd[]{cte.jD.o(), cte.jK.o()};
   private final float f;

   public dxw(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public dyv.c a(cqe $$0, gw $$1, gw $$2, dyv.c $$3, dyv.c $$4, dyr $$5) {
      ash $$6 = $$5.b($$4.a());
      dfd $$7 = $$4.b();
      gw $$8 = $$4.a();
      dfd $$9 = null;
      if ($$7.a(cte.eH) || $$7.a(cte.b) || $$7.a(cte.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(apv.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(apv.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(apv.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(cte.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new dyv.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dfd a(ash $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dfd[] $$1 = new dfd[]{cte.eJ.o(), a($$0, cte.fj)};
         dfd[] $$2 = new dfd[]{cte.eI.o(), a($$0, cte.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dfd a(ash $$0, dfd $$1) {
      ha $$2 = $$1.c(dau.b);
      dgc $$3 = $$1.c(dau.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dfd[] $$4 = new dfd[]{cte.ng.o().a(dau.b, $$2).a(dau.c, $$3), cte.nu.o()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dfd b(ash $$0) {
      return $$0.i() < this.f ? cte.nu.o() : null;
   }

   @Nullable
   private dfd c(ash $$0) {
      return $$0.i() < this.f ? cte.nI.o() : null;
   }

   @Nullable
   private dfd d(ash $$0) {
      return $$0.i() < 0.15F ? cte.pk.o() : null;
   }

   private static dfd a(ash $$0, ctc $$1) {
      return $$1.o().a(dau.b, ha.c.a.a($$0)).a(dau.c, ac.a(dgc.values(), $$0));
   }

   private dfd a(ash $$0, dfd[] $$1, dfd[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dfd a(ash $$0, dfd[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected dyu<?> a() {
      return dyu.k;
   }
}
