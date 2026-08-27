import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class eai extends ebe {
   public static final Codec<eai> a = Codec.FLOAT.fieldOf("mossiness").xmap(eai::new, $$0 -> $$0.f).codec();
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dhi[] e = new dhi[]{cvc.jD.o(), cvc.jK.o()};
   private final float f;

   public eai(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public ebh.c a(csd $$0, ht $$1, ht $$2, ebh.c $$3, ebh.c $$4, ebd $$5) {
      ats $$6 = $$5.b($$4.a());
      dhi $$7 = $$4.b();
      ht $$8 = $$4.a();
      dhi $$9 = null;
      if ($$7.a(cvc.eH) || $$7.a(cvc.b) || $$7.a(cvc.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(arg.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(arg.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(arg.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(cvc.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new ebh.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dhi a(ats $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dhi[] $$1 = new dhi[]{cvc.eJ.o(), a($$0, cvc.fj)};
         dhi[] $$2 = new dhi[]{cvc.eI.o(), a($$0, cvc.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dhi a(ats $$0, dhi $$1) {
      hx $$2 = $$1.c(dct.b);
      dih $$3 = $$1.c(dct.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dhi[] $$4 = new dhi[]{cvc.ng.o().a(dct.b, $$2).a(dct.c, $$3), cvc.nu.o()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dhi b(ats $$0) {
      return $$0.i() < this.f ? cvc.nu.o() : null;
   }

   @Nullable
   private dhi c(ats $$0) {
      return $$0.i() < this.f ? cvc.nI.o() : null;
   }

   @Nullable
   private dhi d(ats $$0) {
      return $$0.i() < 0.15F ? cvc.pk.o() : null;
   }

   private static dhi a(ats $$0, cva $$1) {
      return $$1.o().a(dct.b, hx.c.a.a($$0)).a(dct.c, ac.a(dih.values(), $$0));
   }

   private dhi a(ats $$0, dhi[] $$1, dhi[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dhi a(ats $$0, dhi[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected ebg<?> a() {
      return ebg.k;
   }
}
