import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class evf extends ewc {
   public static final MapCodec<evf> a = Codec.FLOAT.fieldOf("mossiness").xmap(evf::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final ebg[] e = new ebg[]{dng.kg.m(), dng.kn.m()};
   private final float f;

   public evf(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public ewf.d a(dkc $$0, iw $$1, iw $$2, ewf.d $$3, ewf.d $$4, ewb $$5) {
      azz $$6 = $$5.b($$4.a());
      ebg $$7 = $$4.b();
      iw $$8 = $$4.a();
      ebg $$9 = null;
      if ($$7.a(dng.eZ) || $$7.a(dng.b) || $$7.a(dng.fc)) {
         $$9 = this.a($$6);
      } else if ($$7.a(axg.L)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(axg.M)) {
         $$9 = this.b($$6);
      } else if ($$7.a(axg.N)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dng.cy)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new ewf.d($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private ebg a(azz $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         ebg[] $$1 = new ebg[]{dng.fb.m(), a($$0, dng.fC)};
         ebg[] $$2 = new ebg[]{dng.fa.m(), a($$0, dng.nM)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private ebg a(azz $$0, ebg $$1) {
      jc $$2 = $$1.c(dvi.b);
      ecf $$3 = $$1.c(dvi.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         ebg[] $$4 = new ebg[]{dng.nM.m().b(dvi.b, $$2).b(dvi.c, $$3), dng.oa.m()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private ebg b(azz $$0) {
      return $$0.i() < this.f ? dng.oa.m() : null;
   }

   @Nullable
   private ebg c(azz $$0) {
      return $$0.i() < this.f ? dng.oo.m() : null;
   }

   @Nullable
   private ebg d(azz $$0) {
      return $$0.i() < 0.15F ? dng.pS.m() : null;
   }

   private static ebg a(azz $$0, dne $$1) {
      return $$1.m().b(dvi.b, jc.c.a.a($$0)).b(dvi.c, ag.a(ecf.values(), $$0));
   }

   private ebg a(azz $$0, ebg[] $$1, ebg[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static ebg a(azz $$0, ebg[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected ewe<?> a() {
      return ewe.k;
   }
}
