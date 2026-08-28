import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ere extends esb {
   public static final MapCodec<ere> a = Codec.FLOAT.fieldOf("mossiness").xmap(ere::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dxn[] e = new dxn[]{dkg.jV.m(), dkg.kc.m()};
   private final float f;

   public ere(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public ese.d a(dhd $$0, jh $$1, jh $$2, ese.d $$3, ese.d $$4, esa $$5) {
      bam $$6 = $$5.b($$4.a());
      dxn $$7 = $$4.b();
      jh $$8 = $$4.a();
      dxn $$9 = null;
      if ($$7.a(dkg.eV) || $$7.a(dkg.b) || $$7.a(dkg.eY)) {
         $$9 = this.a($$6);
      } else if ($$7.a(axu.L)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(axu.M)) {
         $$9 = this.b($$6);
      } else if ($$7.a(axu.N)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dkg.cv)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new ese.d($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dxn a(bam $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dxn[] $$1 = new dxn[]{dkg.eX.m(), a($$0, dkg.fx)};
         dxn[] $$2 = new dxn[]{dkg.eW.m(), a($$0, dkg.nB)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dxn a(bam $$0, dxn $$1) {
      jm $$2 = $$1.c(dsb.b);
      dyl $$3 = $$1.c(dsb.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dxn[] $$4 = new dxn[]{dkg.nB.m().b(dsb.b, $$2).b(dsb.c, $$3), dkg.nP.m()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dxn b(bam $$0) {
      return $$0.i() < this.f ? dkg.nP.m() : null;
   }

   @Nullable
   private dxn c(bam $$0) {
      return $$0.i() < this.f ? dkg.od.m() : null;
   }

   @Nullable
   private dxn d(bam $$0) {
      return $$0.i() < 0.15F ? dkg.pF.m() : null;
   }

   private static dxn a(bam $$0, dke $$1) {
      return $$1.m().b(dsb.b, jm.c.a.a($$0)).b(dsb.c, ae.a(dyl.values(), $$0));
   }

   private dxn a(bam $$0, dxn[] $$1, dxn[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dxn a(bam $$0, dxn[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected esd<?> a() {
      return esd.k;
   }
}
