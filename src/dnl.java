import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dnl extends dhy {
   private static final jl[] a = jl.values();
   public static final dvu b = dvt.L;
   public static final dvu c = dvt.M;
   public static final dvu d = dvt.N;
   public static final dvu e = dvt.O;
   public static final dvu f = dvt.J;
   public static final dvu g = dvt.K;
   public static final Map<jl, dvu> h = ImmutableMap.copyOf(ad.a(Maps.newEnumMap(jl.class), $$0 -> {
      $$0.put(jl.c, b);
      $$0.put(jl.f, c);
      $$0.put(jl.d, d);
      $$0.put(jl.e, e);
      $$0.put(jl.b, f);
      $$0.put(jl.a, g);
   }));
   protected final fab[] i;

   protected dnl(float $$0, dvc.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dnl> a();

   private fab[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      fab $$3 = dhy.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      fab[] $$4 = new fab[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         jl $$6 = a[$$5];
         $$4[$$5] = ezy.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      fab[] $$7 = new fab[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         fab $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = ezy.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean e_(dvd $$0) {
      return false;
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return this.i[this.o($$0)];
   }

   protected int o(dvd $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
