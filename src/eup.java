import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eup extends evm {
   public static final MapCodec<eup> a = Codec.FLOAT.fieldOf("mossiness").xmap(eup::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final eat[] e = new eat[]{dmt.kg.m(), dmt.kn.m()};
   private final float f;

   public eup(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public evp.d a(djp $$0, iv $$1, iv $$2, evp.d $$3, evp.d $$4, evl $$5) {
      azv $$6 = $$5.b($$4.a());
      eat $$7 = $$4.b();
      iv $$8 = $$4.a();
      eat $$9 = null;
      if ($$7.a(dmt.eZ) || $$7.a(dmt.b) || $$7.a(dmt.fc)) {
         $$9 = this.a($$6);
      } else if ($$7.a(axc.L)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(axc.M)) {
         $$9 = this.b($$6);
      } else if ($$7.a(axc.N)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dmt.cy)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new evp.d($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private eat a(azv $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         eat[] $$1 = new eat[]{dmt.fb.m(), a($$0, dmt.fC)};
         eat[] $$2 = new eat[]{dmt.fa.m(), a($$0, dmt.nM)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private eat a(azv $$0, eat $$1) {
      jb $$2 = $$1.c(duv.b);
      ebs $$3 = $$1.c(duv.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         eat[] $$4 = new eat[]{dmt.nM.m().b(duv.b, $$2).b(duv.c, $$3), dmt.oa.m()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private eat b(azv $$0) {
      return $$0.i() < this.f ? dmt.oa.m() : null;
   }

   @Nullable
   private eat c(azv $$0) {
      return $$0.i() < this.f ? dmt.oo.m() : null;
   }

   @Nullable
   private eat d(azv $$0) {
      return $$0.i() < 0.15F ? dmt.pS.m() : null;
   }

   private static eat a(azv $$0, dmr $$1) {
      return $$1.m().b(duv.b, jb.c.a.a($$0)).b(duv.c, ag.a(ebs.values(), $$0));
   }

   private eat a(azv $$0, eat[] $$1, eat[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static eat a(azv $$0, eat[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected evo<?> a() {
      return evo.k;
   }
}
