import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class dfw extends dea implements dlb {
   public static final dru a = djo.b;
   public static final dru b = djo.c;
   public static final dru c = djo.d;
   public static final dru d = djo.e;
   public static final dru e = drt.C;
   protected static final Map<it, dru> f = djo.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ac.a());
   protected final evf[] g;
   protected final evf[] h;
   private final Object2IntMap<drd> i = new Object2IntOpenHashMap();

   protected dfw(float $$0, float $$1, float $$2, float $$3, float $$4, drc.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.E.a().iterator();

      while (var7.hasNext()) {
         drd $$6 = (drd)var7.next();
         this.g($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends dfw> a();

   protected evf[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      evf $$9 = dea.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      evf $$10 = dea.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      evf $$11 = dea.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      evf $$12 = dea.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      evf $$13 = dea.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      evf $$14 = evc.a($$10, $$13);
      evf $$15 = evc.a($$11, $$12);
      evf[] $$16 = new evf[]{
         evc.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         evc.a($$11, $$10),
         evc.a($$12, $$10),
         evc.a($$15, $$10),
         $$13,
         evc.a($$11, $$13),
         evc.a($$12, $$13),
         evc.a($$15, $$13),
         $$14,
         evc.a($$11, $$14),
         evc.a($$12, $$14),
         evc.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = evc.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean a_(drd $$0, daf $$1, io $$2) {
      return !$$0.c(e);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   protected evf b(drd $$0, daf $$1, io $$2, eur $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(it $$0) {
      return 1 << $$0.e();
   }

   protected int g(drd $$0) {
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
   protected emw b_(drd $$0) {
      return $$0.c(e) ? emx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
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
   protected drd a(drd $$0, dix $$1) {
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
