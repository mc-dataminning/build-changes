import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class elg extends emc {
   public static final MapCodec<elg> a = Codec.FLOAT.fieldOf("mossiness").xmap(elg::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final drx[] e = new drx[]{dew.jD.n(), dew.jK.n()};
   private final float f;

   public elg(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public emf.c a(dbw $$0, iz $$1, iz $$2, emf.c $$3, emf.c $$4, emb $$5) {
      azc $$6 = $$5.b($$4.a());
      drx $$7 = $$4.b();
      iz $$8 = $$4.a();
      drx $$9 = null;
      if ($$7.a(dew.eH) || $$7.a(dew.b) || $$7.a(dew.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(awl.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(awl.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(awl.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dew.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new emf.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private drx a(azc $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         drx[] $$1 = new drx[]{dew.eJ.n(), a($$0, dew.fj)};
         drx[] $$2 = new drx[]{dew.eI.n(), a($$0, dew.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private drx a(azc $$0, drx $$1) {
      je $$2 = $$1.c(dmo.b);
      dsw $$3 = $$1.c(dmo.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         drx[] $$4 = new drx[]{dew.ng.n().a(dmo.b, $$2).a(dmo.c, $$3), dew.nu.n()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private drx b(azc $$0) {
      return $$0.i() < this.f ? dew.nu.n() : null;
   }

   @Nullable
   private drx c(azc $$0) {
      return $$0.i() < this.f ? dew.nI.n() : null;
   }

   @Nullable
   private drx d(azc $$0) {
      return $$0.i() < 0.15F ? dew.pk.n() : null;
   }

   private static drx a(azc $$0, deu $$1) {
      return $$1.n().a(dmo.b, je.c.a.a($$0)).a(dmo.c, ac.a(dsw.values(), $$0));
   }

   private drx a(azc $$0, drx[] $$1, drx[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static drx a(azc $$0, drx[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected eme<?> a() {
      return eme.k;
   }
}
