import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class esi extends etf {
   public static final MapCodec<esi> a = Codec.FLOAT.fieldOf("mossiness").xmap(esi::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dym[] e = new dym[]{dkw.kc.m(), dkw.kj.m()};
   private final float f;

   public esi(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public eti.d a(dhs $$0, jj $$1, jj $$2, eti.d $$3, eti.d $$4, ete $$5) {
      azs $$6 = $$5.b($$4.a());
      dym $$7 = $$4.b();
      jj $$8 = $$4.a();
      dym $$9 = null;
      if ($$7.a(dkw.eV) || $$7.a(dkw.b) || $$7.a(dkw.eY)) {
         $$9 = this.a($$6);
      } else if ($$7.a(awz.L)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(awz.M)) {
         $$9 = this.b($$6);
      } else if ($$7.a(awz.N)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dkw.cv)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new eti.d($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dym a(azs $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dym[] $$1 = new dym[]{dkw.eX.m(), a($$0, dkw.fy)};
         dym[] $$2 = new dym[]{dkw.eW.m(), a($$0, dkw.nI)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dym a(azs $$0, dym $$1) {
      jo $$2 = $$1.c(dsu.b);
      dzl $$3 = $$1.c(dsu.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dym[] $$4 = new dym[]{dkw.nI.m().b(dsu.b, $$2).b(dsu.c, $$3), dkw.nW.m()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dym b(azs $$0) {
      return $$0.i() < this.f ? dkw.nW.m() : null;
   }

   @Nullable
   private dym c(azs $$0) {
      return $$0.i() < this.f ? dkw.ok.m() : null;
   }

   @Nullable
   private dym d(azs $$0) {
      return $$0.i() < 0.15F ? dkw.pO.m() : null;
   }

   private static dym a(azs $$0, dku $$1) {
      return $$1.m().b(dsu.b, jo.c.a.a($$0)).b(dsu.c, af.a(dzl.values(), $$0));
   }

   private dym a(azs $$0, dym[] $$1, dym[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dym a(azs $$0, dym[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected eth<?> a() {
      return eth.k;
   }
}
