import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class eir extends ejn {
   public static final Codec<eir> a = Codec.FLOAT.fieldOf("mossiness").xmap(eir::new, $$0 -> $$0.f).codec();
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dpi[] e = new dpi[]{dcj.jD.n(), dcj.jK.n()};
   private final float f;

   public eir(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public ejq.c a(czj $$0, id $$1, id $$2, ejq.c $$3, ejq.c $$4, ejm $$5) {
      axt $$6 = $$5.b($$4.a());
      dpi $$7 = $$4.b();
      id $$8 = $$4.a();
      dpi $$9 = null;
      if ($$7.a(dcj.eH) || $$7.a(dcj.b) || $$7.a(dcj.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(ave.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(ave.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(ave.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dcj.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new ejq.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dpi a(axt $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dpi[] $$1 = new dpi[]{dcj.eJ.n(), a($$0, dcj.fj)};
         dpi[] $$2 = new dpi[]{dcj.eI.n(), a($$0, dcj.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dpi a(axt $$0, dpi $$1) {
      ij $$2 = $$1.c(dka.b);
      dqh $$3 = $$1.c(dka.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dpi[] $$4 = new dpi[]{dcj.ng.n().a(dka.b, $$2).a(dka.c, $$3), dcj.nu.n()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dpi b(axt $$0) {
      return $$0.i() < this.f ? dcj.nu.n() : null;
   }

   @Nullable
   private dpi c(axt $$0) {
      return $$0.i() < this.f ? dcj.nI.n() : null;
   }

   @Nullable
   private dpi d(axt $$0) {
      return $$0.i() < 0.15F ? dcj.pk.n() : null;
   }

   private static dpi a(axt $$0, dch $$1) {
      return $$1.n().a(dka.b, ij.c.a.a($$0)).a(dka.c, ac.a(dqh.values(), $$0));
   }

   private dpi a(axt $$0, dpi[] $$1, dpi[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dpi a(axt $$0, dpi[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected ejp<?> a() {
      return ejp.k;
   }
}
