import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dyc extends dyy {
   public static final Codec<dyc> a = Codec.FLOAT.fieldOf("mossiness").xmap(dyc::new, $$0 -> $$0.f).codec();
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dfj[] e = new dfj[]{csw.jD.n(), csw.jK.n()};
   private final float f;

   public dyc(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public dzb.c a(cpy $$0, gw $$1, gw $$2, dzb.c $$3, dzb.c $$4, dyx $$5) {
      asc $$6 = $$5.b($$4.a());
      dfj $$7 = $$4.b();
      gw $$8 = $$4.a();
      dfj $$9 = null;
      if ($$7.a(csw.eI) || $$7.a(csw.b) || $$7.a(csw.eL)) {
         $$9 = this.a($$6);
      } else if ($$7.a(aps.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(aps.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(aps.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(csw.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new dzb.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dfj a(asc $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dfj[] $$1 = new dfj[]{csw.eK.n(), a($$0, csw.fj)};
         dfj[] $$2 = new dfj[]{csw.eJ.n(), a($$0, csw.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dfj a(asc $$0, dfj $$1) {
      ha $$2 = $$1.c(dap.a);
      dgi $$3 = $$1.c(dap.b);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dfj[] $$4 = new dfj[]{csw.ng.n().a(dap.a, $$2).a(dap.b, $$3), csw.nu.n()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dfj b(asc $$0) {
      return $$0.i() < this.f ? csw.nu.n() : null;
   }

   @Nullable
   private dfj c(asc $$0) {
      return $$0.i() < this.f ? csw.nI.n() : null;
   }

   @Nullable
   private dfj d(asc $$0) {
      return $$0.i() < 0.15F ? csw.pk.n() : null;
   }

   private static dfj a(asc $$0, csv $$1) {
      return $$1.n().a(dap.a, ha.c.a.a($$0)).a(dap.b, ac.a(dgi.values(), $$0));
   }

   private dfj a(asc $$0, dfj[] $$1, dfj[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dfj a(asc $$0, dfj[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected dza<?> a() {
      return dza.k;
   }
}
