import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eqm extends erj {
   public static final MapCodec<eqm> a = Codec.FLOAT.fieldOf("mossiness").xmap(eqm::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dwv[] e = new dwv[]{djm.kc.m(), djm.kj.m()};
   private final float f;

   public eqm(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public erm.d a(dgj $$0, ji $$1, ji $$2, erm.d $$3, erm.d $$4, eri $$5) {
      azg $$6 = $$5.b($$4.a());
      dwv $$7 = $$4.b();
      ji $$8 = $$4.a();
      dwv $$9 = null;
      if ($$7.a(djm.eV) || $$7.a(djm.b) || $$7.a(djm.eY)) {
         $$9 = this.a($$6);
      } else if ($$7.a(awo.L)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(awo.M)) {
         $$9 = this.b($$6);
      } else if ($$7.a(awo.N)) {
         $$9 = this.c($$6);
      } else if ($$7.a(djm.cv)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new erm.d($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dwv a(azg $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dwv[] $$1 = new dwv[]{djm.eX.m(), a($$0, djm.fy)};
         dwv[] $$2 = new dwv[]{djm.eW.m(), a($$0, djm.nI)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dwv a(azg $$0, dwv $$1) {
      jn $$2 = $$1.c(drj.b);
      dxt $$3 = $$1.c(drj.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dwv[] $$4 = new dwv[]{djm.nI.m().b(drj.b, $$2).b(drj.c, $$3), djm.nW.m()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dwv b(azg $$0) {
      return $$0.i() < this.f ? djm.nW.m() : null;
   }

   @Nullable
   private dwv c(azg $$0) {
      return $$0.i() < this.f ? djm.ok.m() : null;
   }

   @Nullable
   private dwv d(azg $$0) {
      return $$0.i() < 0.15F ? djm.pM.m() : null;
   }

   private static dwv a(azg $$0, djk $$1) {
      return $$1.m().b(drj.b, jn.c.a.a($$0)).b(drj.c, af.a(dxt.values(), $$0));
   }

   private dwv a(azg $$0, dwv[] $$1, dwv[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dwv a(azg $$0, dwv[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected erl<?> a() {
      return erl.k;
   }
}
