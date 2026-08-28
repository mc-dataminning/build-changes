import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class etv extends eus {
   public static final MapCodec<etv> a = Codec.FLOAT.fieldOf("mossiness").xmap(etv::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dzz[] e = new dzz[]{dmc.kd.m(), dmc.kk.m()};
   private final float f;

   public etv(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public euv.d a(diy $$0, iu $$1, iu $$2, euv.d $$3, euv.d $$4, eur $$5) {
      azv $$6 = $$5.b($$4.a());
      dzz $$7 = $$4.b();
      iu $$8 = $$4.a();
      dzz $$9 = null;
      if ($$7.a(dmc.eW) || $$7.a(dmc.b) || $$7.a(dmc.eZ)) {
         $$9 = this.a($$6);
      } else if ($$7.a(axc.L)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(axc.M)) {
         $$9 = this.b($$6);
      } else if ($$7.a(axc.N)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dmc.cw)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new euv.d($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dzz a(azv $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dzz[] $$1 = new dzz[]{dmc.eY.m(), a($$0, dmc.fz)};
         dzz[] $$2 = new dzz[]{dmc.eX.m(), a($$0, dmc.nJ)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dzz a(azv $$0, dzz $$1) {
      ja $$2 = $$1.c(duc.b);
      eay $$3 = $$1.c(duc.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dzz[] $$4 = new dzz[]{dmc.nJ.m().b(duc.b, $$2).b(duc.c, $$3), dmc.nX.m()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dzz b(azv $$0) {
      return $$0.i() < this.f ? dmc.nX.m() : null;
   }

   @Nullable
   private dzz c(azv $$0) {
      return $$0.i() < this.f ? dmc.ol.m() : null;
   }

   @Nullable
   private dzz d(azv $$0) {
      return $$0.i() < 0.15F ? dmc.pP.m() : null;
   }

   private static dzz a(azv $$0, dma $$1) {
      return $$1.m().b(duc.b, ja.c.a.a($$0)).b(duc.c, af.a(eay.values(), $$0));
   }

   private dzz a(azv $$0, dzz[] $$1, dzz[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dzz a(azv $$0, dzz[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected euu<?> a() {
      return euu.k;
   }
}
