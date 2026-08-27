import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dyu extends dzq {
   public static final Codec<dyu> a = Codec.FLOAT.fieldOf("mossiness").xmap(dyu::new, $$0 -> $$0.f).codec();
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dgb[] e = new dgb[]{cuc.jD.o(), cuc.jK.o()};
   private final float f;

   public dyu(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public dzt.c a(crc $$0, ht $$1, ht $$2, dzt.c $$3, dzt.c $$4, dzp $$5) {
      ate $$6 = $$5.b($$4.a());
      dgb $$7 = $$4.b();
      ht $$8 = $$4.a();
      dgb $$9 = null;
      if ($$7.a(cuc.eH) || $$7.a(cuc.b) || $$7.a(cuc.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(aqs.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(aqs.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(aqs.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(cuc.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new dzt.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dgb a(ate $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dgb[] $$1 = new dgb[]{cuc.eJ.o(), a($$0, cuc.fj)};
         dgb[] $$2 = new dgb[]{cuc.eI.o(), a($$0, cuc.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dgb a(ate $$0, dgb $$1) {
      hx $$2 = $$1.c(dbs.b);
      dha $$3 = $$1.c(dbs.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dgb[] $$4 = new dgb[]{cuc.ng.o().a(dbs.b, $$2).a(dbs.c, $$3), cuc.nu.o()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dgb b(ate $$0) {
      return $$0.i() < this.f ? cuc.nu.o() : null;
   }

   @Nullable
   private dgb c(ate $$0) {
      return $$0.i() < this.f ? cuc.nI.o() : null;
   }

   @Nullable
   private dgb d(ate $$0) {
      return $$0.i() < 0.15F ? cuc.pk.o() : null;
   }

   private static dgb a(ate $$0, cua $$1) {
      return $$1.o().a(dbs.b, hx.c.a.a($$0)).a(dbs.c, ac.a(dha.values(), $$0));
   }

   private dgb a(ate $$0, dgb[] $$1, dgb[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dgb a(ate $$0, dgb[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected dzs<?> a() {
      return dzs.k;
   }
}
