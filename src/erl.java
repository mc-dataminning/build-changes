import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class erl extends esi {
   public static final MapCodec<erl> a = Codec.FLOAT.fieldOf("mossiness").xmap(erl::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dxq[] e = new dxq[]{dkg.kc.m(), dkg.kj.m()};
   private final float f;

   public erl(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public esl.d a(dhc $$0, ji $$1, ji $$2, esl.d $$3, esl.d $$4, esh $$5) {
      azh $$6 = $$5.b($$4.a());
      dxq $$7 = $$4.b();
      ji $$8 = $$4.a();
      dxq $$9 = null;
      if ($$7.a(dkg.eV) || $$7.a(dkg.b) || $$7.a(dkg.eY)) {
         $$9 = this.a($$6);
      } else if ($$7.a(awp.L)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(awp.M)) {
         $$9 = this.b($$6);
      } else if ($$7.a(awp.N)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dkg.cv)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new esl.d($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dxq a(azh $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dxq[] $$1 = new dxq[]{dkg.eX.m(), a($$0, dkg.fy)};
         dxq[] $$2 = new dxq[]{dkg.eW.m(), a($$0, dkg.nI)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dxq a(azh $$0, dxq $$1) {
      jn $$2 = $$1.c(dse.b);
      dyp $$3 = $$1.c(dse.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dxq[] $$4 = new dxq[]{dkg.nI.m().b(dse.b, $$2).b(dse.c, $$3), dkg.nW.m()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dxq b(azh $$0) {
      return $$0.i() < this.f ? dkg.nW.m() : null;
   }

   @Nullable
   private dxq c(azh $$0) {
      return $$0.i() < this.f ? dkg.ok.m() : null;
   }

   @Nullable
   private dxq d(azh $$0) {
      return $$0.i() < 0.15F ? dkg.pM.m() : null;
   }

   private static dxq a(azh $$0, dke $$1) {
      return $$1.m().b(dse.b, jn.c.a.a($$0)).b(dse.c, af.a(dyp.values(), $$0));
   }

   private dxq a(azh $$0, dxq[] $$1, dxq[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dxq a(azh $$0, dxq[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected esk<?> a() {
      return esk.k;
   }
}
