import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class erf extends esc {
   public static final MapCodec<erf> a = Codec.FLOAT.fieldOf("mossiness").xmap(erf::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dxo[] e = new dxo[]{dkf.kc.m(), dkf.kj.m()};
   private final float f;

   public erf(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public esf.d a(dhc $$0, jh $$1, jh $$2, esf.d $$3, esf.d $$4, esb $$5) {
      bac $$6 = $$5.b($$4.a());
      dxo $$7 = $$4.b();
      jh $$8 = $$4.a();
      dxo $$9 = null;
      if ($$7.a(dkf.eV) || $$7.a(dkf.b) || $$7.a(dkf.eY)) {
         $$9 = this.a($$6);
      } else if ($$7.a(axk.L)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(axk.M)) {
         $$9 = this.b($$6);
      } else if ($$7.a(axk.N)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dkf.cv)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new esf.d($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dxo a(bac $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dxo[] $$1 = new dxo[]{dkf.eX.m(), a($$0, dkf.fy)};
         dxo[] $$2 = new dxo[]{dkf.eW.m(), a($$0, dkf.nI)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dxo a(bac $$0, dxo $$1) {
      jm $$2 = $$1.c(dsc.b);
      dym $$3 = $$1.c(dsc.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dxo[] $$4 = new dxo[]{dkf.nI.m().b(dsc.b, $$2).b(dsc.c, $$3), dkf.nW.m()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dxo b(bac $$0) {
      return $$0.i() < this.f ? dkf.nW.m() : null;
   }

   @Nullable
   private dxo c(bac $$0) {
      return $$0.i() < this.f ? dkf.ok.m() : null;
   }

   @Nullable
   private dxo d(bac $$0) {
      return $$0.i() < 0.15F ? dkf.pM.m() : null;
   }

   private static dxo a(bac $$0, dkd $$1) {
      return $$1.m().b(dsc.b, jm.c.a.a($$0)).b(dsc.c, ae.a(dym.values(), $$0));
   }

   private dxo a(bac $$0, dxo[] $$1, dxo[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dxo a(bac $$0, dxo[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected ese<?> a() {
      return ese.k;
   }
}
