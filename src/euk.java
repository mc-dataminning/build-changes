import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class euk extends evh {
   public static final MapCodec<euk> a = Codec.FLOAT.fieldOf("mossiness").xmap(euk::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final eao[] e = new eao[]{dmo.kg.m(), dmo.kn.m()};
   private final float f;

   public euk(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public evk.d a(djk $$0, iv $$1, iv $$2, evk.d $$3, evk.d $$4, evg $$5) {
      azv $$6 = $$5.b($$4.a());
      eao $$7 = $$4.b();
      iv $$8 = $$4.a();
      eao $$9 = null;
      if ($$7.a(dmo.eZ) || $$7.a(dmo.b) || $$7.a(dmo.fc)) {
         $$9 = this.a($$6);
      } else if ($$7.a(axc.L)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(axc.M)) {
         $$9 = this.b($$6);
      } else if ($$7.a(axc.N)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dmo.cy)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new evk.d($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private eao a(azv $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         eao[] $$1 = new eao[]{dmo.fb.m(), a($$0, dmo.fC)};
         eao[] $$2 = new eao[]{dmo.fa.m(), a($$0, dmo.nM)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private eao a(azv $$0, eao $$1) {
      jb $$2 = $$1.c(duq.b);
      ebn $$3 = $$1.c(duq.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         eao[] $$4 = new eao[]{dmo.nM.m().b(duq.b, $$2).b(duq.c, $$3), dmo.oa.m()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private eao b(azv $$0) {
      return $$0.i() < this.f ? dmo.oa.m() : null;
   }

   @Nullable
   private eao c(azv $$0) {
      return $$0.i() < this.f ? dmo.oo.m() : null;
   }

   @Nullable
   private eao d(azv $$0) {
      return $$0.i() < 0.15F ? dmo.pS.m() : null;
   }

   private static eao a(azv $$0, dmm $$1) {
      return $$1.m().b(duq.b, jb.c.a.a($$0)).b(duq.c, ag.a(ebn.values(), $$0));
   }

   private eao a(azv $$0, eao[] $$1, eao[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static eao a(azv $$0, eao[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected evj<?> a() {
      return evj.k;
   }
}
