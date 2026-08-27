import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class dfu extends ddy implements dkz {
   public static final drs a = djm.b;
   public static final drs b = djm.c;
   public static final drs c = djm.d;
   public static final drs d = djm.e;
   public static final drs e = drr.C;
   protected static final Map<it, drs> f = djm.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ac.a());
   protected final evd[] g;
   protected final evd[] h;
   private final Object2IntMap<drb> i = new Object2IntOpenHashMap();

   protected dfu(float $$0, float $$1, float $$2, float $$3, float $$4, dra.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.E.a().iterator();

      while (var7.hasNext()) {
         drb $$6 = (drb)var7.next();
         this.g($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends dfu> a();

   protected evd[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      evd $$9 = ddy.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      evd $$10 = ddy.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      evd $$11 = ddy.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      evd $$12 = ddy.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      evd $$13 = ddy.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      evd $$14 = eva.a($$10, $$13);
      evd $$15 = eva.a($$11, $$12);
      evd[] $$16 = new evd[]{
         eva.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         eva.a($$11, $$10),
         eva.a($$12, $$10),
         eva.a($$15, $$10),
         $$13,
         eva.a($$11, $$13),
         eva.a($$12, $$13),
         eva.a($$15, $$13),
         $$14,
         eva.a($$11, $$14),
         eva.a($$12, $$14),
         eva.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = eva.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean a_(drb $$0, dad $$1, io $$2) {
      return !$$0.c(e);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   protected evd b(drb $$0, dad $$1, io $$2, eup $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(it $$0) {
      return 1 << $$0.e();
   }

   protected int g(drb $$0) {
      return this.i.computeIntIfAbsent($$0, $$0x -> {
         int $$1 = 0;
         if ($$0x.c(a)) {
            $$1 |= a(it.c);
         }

         if ($$0x.c(b)) {
            $$1 |= a(it.f);
         }

         if ($$0x.c(c)) {
            $$1 |= a(it.d);
         }

         if ($$0x.c(d)) {
            $$1 |= a(it.e);
         }

         return $$1;
      });
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(e) ? emv.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
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
   protected drb a(drb $$0, div $$1) {
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
