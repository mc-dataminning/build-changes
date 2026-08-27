import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class eef extends efb {
   public static final Codec<eef> a = Codec.FLOAT.fieldOf("mossiness").xmap(eef::new, $$0 -> $$0.f).codec();
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dlf[] e = new dlf[]{cyq.jD.o(), cyq.jK.o()};
   private final float f;

   public eef(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public efe.c a(cvq $$0, hz $$1, hz $$2, efe.c $$3, efe.c $$4, efa $$5) {
      awo $$6 = $$5.b($$4.a());
      dlf $$7 = $$4.b();
      hz $$8 = $$4.a();
      dlf $$9 = null;
      if ($$7.a(cyq.eH) || $$7.a(cyq.b) || $$7.a(cyq.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(atz.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(atz.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(atz.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(cyq.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new efe.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dlf a(awo $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dlf[] $$1 = new dlf[]{cyq.eJ.o(), a($$0, cyq.fj)};
         dlf[] $$2 = new dlf[]{cyq.eI.o(), a($$0, cyq.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dlf a(awo $$0, dlf $$1) {
      ie $$2 = $$1.c(dgh.b);
      dme $$3 = $$1.c(dgh.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dlf[] $$4 = new dlf[]{cyq.ng.o().a(dgh.b, $$2).a(dgh.c, $$3), cyq.nu.o()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dlf b(awo $$0) {
      return $$0.i() < this.f ? cyq.nu.o() : null;
   }

   @Nullable
   private dlf c(awo $$0) {
      return $$0.i() < this.f ? cyq.nI.o() : null;
   }

   @Nullable
   private dlf d(awo $$0) {
      return $$0.i() < 0.15F ? cyq.pk.o() : null;
   }

   private static dlf a(awo $$0, cyo $$1) {
      return $$1.o().a(dgh.b, ie.c.a.a($$0)).a(dgh.c, ac.a(dme.values(), $$0));
   }

   private dlf a(awo $$0, dlf[] $$1, dlf[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dlf a(awo $$0, dlf[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected efd<?> a() {
      return efd.k;
   }
}
