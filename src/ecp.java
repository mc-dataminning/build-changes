import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ecp extends edl {
   public static final Codec<ecp> a = Codec.FLOAT.fieldOf("mossiness").xmap(ecp::new, $$0 -> $$0.f).codec();
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final djp[] e = new djp[]{cxa.jD.o(), cxa.jK.o()};
   private final float f;

   public ecp(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public edo.c a(cua $$0, hx $$1, hx $$2, edo.c $$3, edo.c $$4, edk $$5) {
      auw $$6 = $$5.b($$4.a());
      djp $$7 = $$4.b();
      hx $$8 = $$4.a();
      djp $$9 = null;
      if ($$7.a(cxa.eH) || $$7.a(cxa.b) || $$7.a(cxa.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(asi.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(asi.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(asi.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(cxa.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new edo.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private djp a(auw $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         djp[] $$1 = new djp[]{cxa.eJ.o(), a($$0, cxa.fj)};
         djp[] $$2 = new djp[]{cxa.eI.o(), a($$0, cxa.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private djp a(auw $$0, djp $$1) {
      ic $$2 = $$1.c(der.b);
      dko $$3 = $$1.c(der.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         djp[] $$4 = new djp[]{cxa.ng.o().a(der.b, $$2).a(der.c, $$3), cxa.nu.o()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private djp b(auw $$0) {
      return $$0.i() < this.f ? cxa.nu.o() : null;
   }

   @Nullable
   private djp c(auw $$0) {
      return $$0.i() < this.f ? cxa.nI.o() : null;
   }

   @Nullable
   private djp d(auw $$0) {
      return $$0.i() < 0.15F ? cxa.pk.o() : null;
   }

   private static djp a(auw $$0, cwy $$1) {
      return $$1.o().a(der.b, ic.c.a.a($$0)).a(der.c, ac.a(dko.values(), $$0));
   }

   private djp a(auw $$0, djp[] $$1, djp[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static djp a(auw $$0, djp[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected edn<?> a() {
      return edn.k;
   }
}
