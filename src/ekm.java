import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ekm extends eli {
   public static final MapCodec<ekm> a = Codec.FLOAT.fieldOf("mossiness").xmap(ekm::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final drd[] e = new drd[]{dec.jD.n(), dec.jK.n()};
   private final float f;

   public ekm(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public ell.c a(dbc $$0, io $$1, io $$2, ell.c $$3, ell.c $$4, elh $$5) {
      aym $$6 = $$5.b($$4.a());
      drd $$7 = $$4.b();
      io $$8 = $$4.a();
      drd $$9 = null;
      if ($$7.a(dec.eH) || $$7.a(dec.b) || $$7.a(dec.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(avx.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(avx.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(avx.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dec.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new ell.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private drd a(aym $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         drd[] $$1 = new drd[]{dec.eJ.n(), a($$0, dec.fj)};
         drd[] $$2 = new drd[]{dec.eI.n(), a($$0, dec.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private drd a(aym $$0, drd $$1) {
      it $$2 = $$1.c(dlu.b);
      dsc $$3 = $$1.c(dlu.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         drd[] $$4 = new drd[]{dec.ng.n().a(dlu.b, $$2).a(dlu.c, $$3), dec.nu.n()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private drd b(aym $$0) {
      return $$0.i() < this.f ? dec.nu.n() : null;
   }

   @Nullable
   private drd c(aym $$0) {
      return $$0.i() < this.f ? dec.nI.n() : null;
   }

   @Nullable
   private drd d(aym $$0) {
      return $$0.i() < 0.15F ? dec.pk.n() : null;
   }

   private static drd a(aym $$0, dea $$1) {
      return $$1.n().a(dlu.b, it.c.a.a($$0)).a(dlu.c, ac.a(dsc.values(), $$0));
   }

   private drd a(aym $$0, drd[] $$1, drd[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static drd a(aym $$0, drd[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected elk<?> a() {
      return elk.k;
   }
}
