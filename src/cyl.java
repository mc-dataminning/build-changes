import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class cyl extends cwp implements ddp {
   public static final djx a = dcc.b;
   public static final djx b = dcc.c;
   public static final djx c = dcc.d;
   public static final djx d = dcc.e;
   public static final djx e = djw.C;
   protected static final Map<ic, djx> f = dcc.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ac.a());
   protected final eml[] g;
   protected final eml[] h;
   private final Object2IntMap<djg> i = new Object2IntOpenHashMap();

   protected cyl(float $$0, float $$1, float $$2, float $$3, float $$4, djf.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.E.a().iterator();

      while (var7.hasNext()) {
         djg $$6 = (djg)var7.next();
         this.g($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends cyl> a();

   protected eml[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      eml $$9 = cwp.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      eml $$10 = cwp.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      eml $$11 = cwp.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      eml $$12 = cwp.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      eml $$13 = cwp.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      eml $$14 = emi.a($$10, $$13);
      eml $$15 = emi.a($$11, $$12);
      eml[] $$16 = new eml[]{
         emi.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         emi.a($$11, $$10),
         emi.a($$12, $$10),
         emi.a($$15, $$10),
         $$13,
         emi.a($$11, $$13),
         emi.a($$12, $$13),
         emi.a($$15, $$13),
         $$14,
         emi.a($$11, $$14),
         emi.a($$12, $$14),
         emi.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = emi.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   public boolean a_(djg $$0, csu $$1, hx $$2) {
      return !$$0.c(e);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   public eml b(djg $$0, csu $$1, hx $$2, elx $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(ic $$0) {
      return 1 << $$0.e();
   }

   protected int g(djg $$0) {
      return this.i.computeIntIfAbsent($$0, $$0x -> {
         int $$1 = 0;
         if ($$0x.c(a)) {
            $$1 |= a(ic.c);
         }

         if ($$0x.c(b)) {
            $$1 |= a(ic.f);
         }

         if ($$0x.c(c)) {
            $$1 |= a(ic.d);
         }

         if ($$0x.c(d)) {
            $$1 |= a(ic.e);
         }

         return $$1;
      });
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(e) ? eer.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
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
   public djg a(djg $$0, dbl $$1) {
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
