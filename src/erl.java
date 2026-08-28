import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class erl extends esi {
   public static final MapCodec<erl> a = Codec.FLOAT.fieldOf("mossiness").xmap(erl::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dxu[] e = new dxu[]{dkn.jV.m(), dkn.kc.m()};
   private final float f;

   public erl(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public esl.d a(dhk $$0, jh $$1, jh $$2, esl.d $$3, esl.d $$4, esh $$5) {
      bam $$6 = $$5.b($$4.a());
      dxu $$7 = $$4.b();
      jh $$8 = $$4.a();
      dxu $$9 = null;
      if ($$7.a(dkn.eV) || $$7.a(dkn.b) || $$7.a(dkn.eY)) {
         $$9 = this.a($$6);
      } else if ($$7.a(axu.L)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(axu.M)) {
         $$9 = this.b($$6);
      } else if ($$7.a(axu.N)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dkn.cv)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new esl.d($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dxu a(bam $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dxu[] $$1 = new dxu[]{dkn.eX.m(), a($$0, dkn.fx)};
         dxu[] $$2 = new dxu[]{dkn.eW.m(), a($$0, dkn.nB)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dxu a(bam $$0, dxu $$1) {
      jm $$2 = $$1.c(dsi.b);
      dys $$3 = $$1.c(dsi.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dxu[] $$4 = new dxu[]{dkn.nB.m().b(dsi.b, $$2).b(dsi.c, $$3), dkn.nP.m()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dxu b(bam $$0) {
      return $$0.i() < this.f ? dkn.nP.m() : null;
   }

   @Nullable
   private dxu c(bam $$0) {
      return $$0.i() < this.f ? dkn.od.m() : null;
   }

   @Nullable
   private dxu d(bam $$0) {
      return $$0.i() < 0.15F ? dkn.pF.m() : null;
   }

   private static dxu a(bam $$0, dkl $$1) {
      return $$1.m().b(dsi.b, jm.c.a.a($$0)).b(dsi.c, ae.a(dys.values(), $$0));
   }

   private dxu a(bam $$0, dxu[] $$1, dxu[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dxu a(bam $$0, dxu[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected esk<?> a() {
      return esk.k;
   }
}
