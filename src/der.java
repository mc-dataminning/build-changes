import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class der extends dcv implements djw {
   public static final dqp a = dij.b;
   public static final dqp b = dij.c;
   public static final dqp c = dij.d;
   public static final dqp d = dij.e;
   public static final dqp e = dqo.C;
   protected static final Map<ir, dqp> f = dij.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ac.a());
   protected final ety[] g;
   protected final ety[] h;
   private final Object2IntMap<dpy> i = new Object2IntOpenHashMap();

   protected der(float $$0, float $$1, float $$2, float $$3, float $$4, dpx.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.E.a().iterator();

      while (var7.hasNext()) {
         dpy $$6 = (dpy)var7.next();
         this.g($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends der> a();

   protected ety[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      ety $$9 = dcv.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      ety $$10 = dcv.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      ety $$11 = dcv.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      ety $$12 = dcv.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      ety $$13 = dcv.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      ety $$14 = etv.a($$10, $$13);
      ety $$15 = etv.a($$11, $$12);
      ety[] $$16 = new ety[]{
         etv.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         etv.a($$11, $$10),
         etv.a($$12, $$10),
         etv.a($$15, $$10),
         $$13,
         etv.a($$11, $$13),
         etv.a($$12, $$13),
         etv.a($$15, $$13),
         $$14,
         etv.a($$11, $$14),
         etv.a($$12, $$14),
         etv.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = etv.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean a_(dpy $$0, cza $$1, im $$2) {
      return !$$0.c(e);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   protected ety b(dpy $$0, cza $$1, im $$2, etk $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(ir $$0) {
      return 1 << $$0.e();
   }

   protected int g(dpy $$0) {
      return this.i.computeIntIfAbsent($$0, $$0x -> {
         int $$1 = 0;
         if ($$0x.c(a)) {
            $$1 |= a(ir.c);
         }

         if ($$0x.c(b)) {
            $$1 |= a(ir.f);
         }

         if ($$0x.c(c)) {
            $$1 |= a(ir.d);
         }

         if ($$0x.c(d)) {
            $$1 |= a(ir.e);
         }

         return $$1;
      });
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(e) ? els.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
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
   protected dpy a(dpy $$0, dhs $$1) {
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
