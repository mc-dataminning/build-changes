import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eqp extends erm {
   public static final MapCodec<eqp> a = Codec.FLOAT.fieldOf("mossiness").xmap(eqp::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dwy[] e = new dwy[]{djp.kc.m(), djp.kj.m()};
   private final float f;

   public eqp(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public erp.d a(dgm $$0, ji $$1, ji $$2, erp.d $$3, erp.d $$4, erl $$5) {
      azh $$6 = $$5.b($$4.a());
      dwy $$7 = $$4.b();
      ji $$8 = $$4.a();
      dwy $$9 = null;
      if ($$7.a(djp.eV) || $$7.a(djp.b) || $$7.a(djp.eY)) {
         $$9 = this.a($$6);
      } else if ($$7.a(awp.L)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(awp.M)) {
         $$9 = this.b($$6);
      } else if ($$7.a(awp.N)) {
         $$9 = this.c($$6);
      } else if ($$7.a(djp.cv)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new erp.d($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dwy a(azh $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dwy[] $$1 = new dwy[]{djp.eX.m(), a($$0, djp.fy)};
         dwy[] $$2 = new dwy[]{djp.eW.m(), a($$0, djp.nI)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dwy a(azh $$0, dwy $$1) {
      jn $$2 = $$1.c(drm.b);
      dxw $$3 = $$1.c(drm.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dwy[] $$4 = new dwy[]{djp.nI.m().b(drm.b, $$2).b(drm.c, $$3), djp.nW.m()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dwy b(azh $$0) {
      return $$0.i() < this.f ? djp.nW.m() : null;
   }

   @Nullable
   private dwy c(azh $$0) {
      return $$0.i() < this.f ? djp.ok.m() : null;
   }

   @Nullable
   private dwy d(azh $$0) {
      return $$0.i() < 0.15F ? djp.pM.m() : null;
   }

   private static dwy a(azh $$0, djn $$1) {
      return $$1.m().b(drm.b, jn.c.a.a($$0)).b(drm.c, af.a(dxw.values(), $$0));
   }

   private dwy a(azh $$0, dwy[] $$1, dwy[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dwy a(azh $$0, dwy[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected ero<?> a() {
      return ero.k;
   }
}
