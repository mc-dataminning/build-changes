import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eqn extends erk {
   public static final MapCodec<eqn> a = Codec.FLOAT.fieldOf("mossiness").xmap(eqn::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dww[] e = new dww[]{djn.kc.m(), djn.kj.m()};
   private final float f;

   public eqn(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public ern.d a(dgk $$0, ji $$1, ji $$2, ern.d $$3, ern.d $$4, erj $$5) {
      azh $$6 = $$5.b($$4.a());
      dww $$7 = $$4.b();
      ji $$8 = $$4.a();
      dww $$9 = null;
      if ($$7.a(djn.eV) || $$7.a(djn.b) || $$7.a(djn.eY)) {
         $$9 = this.a($$6);
      } else if ($$7.a(awp.L)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(awp.M)) {
         $$9 = this.b($$6);
      } else if ($$7.a(awp.N)) {
         $$9 = this.c($$6);
      } else if ($$7.a(djn.cv)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new ern.d($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dww a(azh $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dww[] $$1 = new dww[]{djn.eX.m(), a($$0, djn.fy)};
         dww[] $$2 = new dww[]{djn.eW.m(), a($$0, djn.nI)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dww a(azh $$0, dww $$1) {
      jn $$2 = $$1.c(drk.b);
      dxu $$3 = $$1.c(drk.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dww[] $$4 = new dww[]{djn.nI.m().b(drk.b, $$2).b(drk.c, $$3), djn.nW.m()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dww b(azh $$0) {
      return $$0.i() < this.f ? djn.nW.m() : null;
   }

   @Nullable
   private dww c(azh $$0) {
      return $$0.i() < this.f ? djn.ok.m() : null;
   }

   @Nullable
   private dww d(azh $$0) {
      return $$0.i() < 0.15F ? djn.pM.m() : null;
   }

   private static dww a(azh $$0, djl $$1) {
      return $$1.m().b(drk.b, jn.c.a.a($$0)).b(drk.c, af.a(dxu.values(), $$0));
   }

   private dww a(azh $$0, dww[] $$1, dww[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dww a(azh $$0, dww[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected erm<?> a() {
      return erm.k;
   }
}
