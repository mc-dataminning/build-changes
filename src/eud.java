import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eud extends eva {
   public static final MapCodec<eud> a = Codec.FLOAT.fieldOf("mossiness").xmap(eud::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final eah[] e = new eah[]{dmh.kg.m(), dmh.kn.m()};
   private final float f;

   public eud(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public evd.d a(djd $$0, iu $$1, iu $$2, evd.d $$3, evd.d $$4, euz $$5) {
      azv $$6 = $$5.b($$4.a());
      eah $$7 = $$4.b();
      iu $$8 = $$4.a();
      eah $$9 = null;
      if ($$7.a(dmh.eZ) || $$7.a(dmh.b) || $$7.a(dmh.fc)) {
         $$9 = this.a($$6);
      } else if ($$7.a(axc.L)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(axc.M)) {
         $$9 = this.b($$6);
      } else if ($$7.a(axc.N)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dmh.cy)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new evd.d($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private eah a(azv $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         eah[] $$1 = new eah[]{dmh.fb.m(), a($$0, dmh.fC)};
         eah[] $$2 = new eah[]{dmh.fa.m(), a($$0, dmh.nM)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private eah a(azv $$0, eah $$1) {
      ja $$2 = $$1.c(duj.b);
      ebg $$3 = $$1.c(duj.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         eah[] $$4 = new eah[]{dmh.nM.m().b(duj.b, $$2).b(duj.c, $$3), dmh.oa.m()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private eah b(azv $$0) {
      return $$0.i() < this.f ? dmh.oa.m() : null;
   }

   @Nullable
   private eah c(azv $$0) {
      return $$0.i() < this.f ? dmh.oo.m() : null;
   }

   @Nullable
   private eah d(azv $$0) {
      return $$0.i() < 0.15F ? dmh.pS.m() : null;
   }

   private static eah a(azv $$0, dmf $$1) {
      return $$1.m().b(duj.b, ja.c.a.a($$0)).b(duj.c, af.a(ebg.values(), $$0));
   }

   private eah a(azv $$0, eah[] $$1, eah[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static eah a(azv $$0, eah[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected evc<?> a() {
      return evc.k;
   }
}
