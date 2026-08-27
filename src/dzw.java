import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dzw extends eas {
   public static final Codec<dzw> a = Codec.FLOAT.fieldOf("mossiness").xmap(dzw::new, $$0 -> $$0.f).codec();
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dgw[] e = new dgw[]{cuv.jD.o(), cuv.jK.o()};
   private final float f;

   public dzw(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public eav.c a(crv $$0, ht $$1, ht $$2, eav.c $$3, eav.c $$4, ear $$5) {
      ato $$6 = $$5.b($$4.a());
      dgw $$7 = $$4.b();
      ht $$8 = $$4.a();
      dgw $$9 = null;
      if ($$7.a(cuv.eH) || $$7.a(cuv.b) || $$7.a(cuv.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(arc.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(arc.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(arc.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(cuv.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new eav.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dgw a(ato $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dgw[] $$1 = new dgw[]{cuv.eJ.o(), a($$0, cuv.fj)};
         dgw[] $$2 = new dgw[]{cuv.eI.o(), a($$0, cuv.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dgw a(ato $$0, dgw $$1) {
      hx $$2 = $$1.c(dcm.b);
      dhv $$3 = $$1.c(dcm.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dgw[] $$4 = new dgw[]{cuv.ng.o().a(dcm.b, $$2).a(dcm.c, $$3), cuv.nu.o()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dgw b(ato $$0) {
      return $$0.i() < this.f ? cuv.nu.o() : null;
   }

   @Nullable
   private dgw c(ato $$0) {
      return $$0.i() < this.f ? cuv.nI.o() : null;
   }

   @Nullable
   private dgw d(ato $$0) {
      return $$0.i() < 0.15F ? cuv.pk.o() : null;
   }

   private static dgw a(ato $$0, cut $$1) {
      return $$1.o().a(dcm.b, hx.c.a.a($$0)).a(dcm.c, ac.a(dhv.values(), $$0));
   }

   private dgw a(ato $$0, dgw[] $$1, dgw[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dgw a(ato $$0, dgw[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected eau<?> a() {
      return eau.k;
   }
}
