import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dko extends dfa {
   private static final je[] a = je.values();
   public static final dsu b = dst.L;
   public static final dsu c = dst.M;
   public static final dsu d = dst.N;
   public static final dsu e = dst.O;
   public static final dsu f = dst.J;
   public static final dsu g = dst.K;
   public static final Map<je, dsu> h = ImmutableMap.copyOf(ac.a(Maps.newEnumMap(je.class), $$0 -> {
      $$0.put(je.c, b);
      $$0.put(je.f, c);
      $$0.put(je.d, d);
      $$0.put(je.e, e);
      $$0.put(je.b, f);
      $$0.put(je.a, g);
   }));
   protected final ewl[] i;

   protected dko(float $$0, dsc.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dko> a();

   private ewl[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      ewl $$3 = dfa.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      ewl[] $$4 = new ewl[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         je $$6 = a[$$5];
         $$4[$$5] = ewi.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      ewl[] $$7 = new ewl[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         ewl $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = ewi.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean a_(dsd $$0, dbf $$1, iz $$2) {
      return false;
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return this.i[this.m($$0)];
   }

   protected int m(dsd $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
