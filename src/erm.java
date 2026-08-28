import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class erm extends esj {
   public static final MapCodec<erm> a = Codec.FLOAT.fieldOf("mossiness").xmap(erm::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dxv[] e = new dxv[]{dko.jV.m(), dko.kc.m()};
   private final float f;

   public erm(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public esm.d a(dhl $$0, jh $$1, jh $$2, esm.d $$3, esm.d $$4, esi $$5) {
      bam $$6 = $$5.b($$4.a());
      dxv $$7 = $$4.b();
      jh $$8 = $$4.a();
      dxv $$9 = null;
      if ($$7.a(dko.eV) || $$7.a(dko.b) || $$7.a(dko.eY)) {
         $$9 = this.a($$6);
      } else if ($$7.a(axu.L)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(axu.M)) {
         $$9 = this.b($$6);
      } else if ($$7.a(axu.N)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dko.cv)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new esm.d($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dxv a(bam $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dxv[] $$1 = new dxv[]{dko.eX.m(), a($$0, dko.fx)};
         dxv[] $$2 = new dxv[]{dko.eW.m(), a($$0, dko.nB)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dxv a(bam $$0, dxv $$1) {
      jm $$2 = $$1.c(dsj.b);
      dyt $$3 = $$1.c(dsj.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dxv[] $$4 = new dxv[]{dko.nB.m().b(dsj.b, $$2).b(dsj.c, $$3), dko.nP.m()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dxv b(bam $$0) {
      return $$0.i() < this.f ? dko.nP.m() : null;
   }

   @Nullable
   private dxv c(bam $$0) {
      return $$0.i() < this.f ? dko.od.m() : null;
   }

   @Nullable
   private dxv d(bam $$0) {
      return $$0.i() < 0.15F ? dko.pF.m() : null;
   }

   private static dxv a(bam $$0, dkm $$1) {
      return $$1.m().b(dsj.b, jm.c.a.a($$0)).b(dsj.c, ae.a(dyt.values(), $$0));
   }

   private dxv a(bam $$0, dxv[] $$1, dxv[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dxv a(bam $$0, dxv[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected esl<?> a() {
      return esl.k;
   }
}
