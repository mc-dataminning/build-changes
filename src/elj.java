import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class elj extends emf {
   public static final MapCodec<elj> a = Codec.FLOAT.fieldOf("mossiness").xmap(elj::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dsa[] e = new dsa[]{dez.jD.o(), dez.jK.o()};
   private final float f;

   public elj(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public emi.c a(dbz $$0, iz $$1, iz $$2, emi.c $$3, emi.c $$4, eme $$5) {
      azf $$6 = $$5.b($$4.a());
      dsa $$7 = $$4.b();
      iz $$8 = $$4.a();
      dsa $$9 = null;
      if ($$7.a(dez.eH) || $$7.a(dez.b) || $$7.a(dez.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(awo.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(awo.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(awo.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dez.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new emi.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dsa a(azf $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dsa[] $$1 = new dsa[]{dez.eJ.o(), a($$0, dez.fj)};
         dsa[] $$2 = new dsa[]{dez.eI.o(), a($$0, dez.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dsa a(azf $$0, dsa $$1) {
      je $$2 = $$1.c(dmr.b);
      dsz $$3 = $$1.c(dmr.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dsa[] $$4 = new dsa[]{dez.ng.o().a(dmr.b, $$2).a(dmr.c, $$3), dez.nu.o()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dsa b(azf $$0) {
      return $$0.i() < this.f ? dez.nu.o() : null;
   }

   @Nullable
   private dsa c(azf $$0) {
      return $$0.i() < this.f ? dez.nI.o() : null;
   }

   @Nullable
   private dsa d(azf $$0) {
      return $$0.i() < 0.15F ? dez.pk.o() : null;
   }

   private static dsa a(azf $$0, dex $$1) {
      return $$1.o().a(dmr.b, je.c.a.a($$0)).a(dmr.c, ac.a(dsz.values(), $$0));
   }

   private dsa a(azf $$0, dsa[] $$1, dsa[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dsa a(azf $$0, dsa[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected emh<?> a() {
      return emh.k;
   }
}
