import com.google.common.collect.UnmodifiableIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public class cuc extends csk implements czl {
   public static final dfp a = cxw.a;
   public static final dfp b = cxw.b;
   public static final dfp c = cxw.c;
   public static final dfp d = cxw.d;
   public static final dfp e = dfo.C;
   protected static final Map<hb, dfp> f = cxw.g.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ac.a());
   protected final ehy[] g;
   protected final ehy[] h;
   private final Object2IntMap<dey> i = new Object2IntOpenHashMap();

   protected cuc(float $$0, float $$1, float $$2, float $$3, float $$4, dex.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.C.a().iterator();

      while (var7.hasNext()) {
         dey $$6 = (dey)var7.next();
         this.g($$6);
      }
   }

   protected ehy[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      ehy $$9 = csk.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      ehy $$10 = csk.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      ehy $$11 = csk.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      ehy $$12 = csk.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      ehy $$13 = csk.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      ehy $$14 = ehv.a($$10, $$13);
      ehy $$15 = ehv.a($$11, $$12);
      ehy[] $$16 = new ehy[]{
         ehv.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         ehv.a($$11, $$10),
         ehv.a($$12, $$10),
         ehv.a($$15, $$10),
         $$13,
         ehv.a($$11, $$13),
         ehv.a($$12, $$13),
         ehv.a($$15, $$13),
         $$14,
         ehv.a($$11, $$14),
         ehv.a($$12, $$14),
         ehv.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = ehv.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   public boolean c(dey $$0, coq $$1, gv $$2) {
      return !$$0.c(e);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   public ehy c(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(hb $$0) {
      return 1 << $$0.e();
   }

   protected int g(dey $$0) {
      return this.i.computeIntIfAbsent($$0, $$0x -> {
         int $$1 = 0;
         if ($$0x.c(a)) {
            $$1 |= a(hb.c);
         }

         if ($$0x.c(b)) {
            $$1 |= a(hb.f);
         }

         if ($$0x.c(c)) {
            $$1 |= a(hb.d);
         }

         if ($$0x.c(d)) {
            $$1 |= a(hb.e);
         }

         return $$1;
      });
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(e) ? eac.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      switch ($$1) {
         case c:
            return $$0.a(a, $$0.c(c)).a(b, $$0.c(d)).a(c, $$0.c(a)).a(d, $$0.c(b));
         case d:
            return $$0.a(a, $$0.c(b)).a(b, $$0.c(c)).a(c, $$0.c(d)).a(d, $$0.c(a));
         case b:
            return $$0.a(a, $$0.c(d)).a(b, $$0.c(a)).a(c, $$0.c(b)).a(d, $$0.c(c));
         default:
            return $$0;
      }
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      switch ($$1) {
         case b:
            return $$0.a(a, $$0.c(c)).a(c, $$0.c(a));
         case c:
            return $$0.a(b, $$0.c(d)).a(d, $$0.c(b));
         default:
            return super.a($$0, $$1);
      }
   }
}
