import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class dkm extends diq implements dpr {
   public static final dwm a = dod.b;
   public static final dwm b = dod.c;
   public static final dwm c = dod.d;
   public static final dwm d = dod.e;
   public static final dwm e = dwl.C;
   protected static final Map<jm, dwm> f = dod.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ae.a());
   protected final fas[] g;
   protected final fas[] h;
   private final Object2IntMap<dvv> i = new Object2IntOpenHashMap();

   protected dkm(float $$0, float $$1, float $$2, float $$3, float $$4, dvu.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.F.a().iterator();

      while (var7.hasNext()) {
         dvv $$6 = (dvv)var7.next();
         this.h($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends dkm> a();

   protected fas[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      fas $$9 = diq.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      fas $$10 = diq.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      fas $$11 = diq.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      fas $$12 = diq.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      fas $$13 = diq.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      fas $$14 = fap.a($$10, $$13);
      fas $$15 = fap.a($$11, $$12);
      fas[] $$16 = new fas[]{
         fap.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         fap.a($$11, $$10),
         fap.a($$12, $$10),
         fap.a($$15, $$10),
         $$13,
         fap.a($$11, $$13),
         fap.a($$12, $$13),
         fap.a($$15, $$13),
         $$14,
         fap.a($$11, $$14),
         fap.a($$12, $$14),
         fap.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = fap.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean e_(dvv $$0) {
      return !$$0.c(e);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return this.h[this.h($$0)];
   }

   @Override
   protected fas b(dvv $$0, der $$1, jh $$2, fad $$3) {
      return this.g[this.h($$0)];
   }

   private static int a(jm $$0) {
      return 1 << $$0.e();
   }

   protected int h(dvv $$0) {
      return this.i.computeIntIfAbsent($$0, $$0x -> {
         int $$1 = 0;
         if ($$0x.c(a)) {
            $$1 |= a(jm.c);
         }

         if ($$0x.c(b)) {
            $$1 |= a(jm.f);
         }

         if ($$0x.c(c)) {
            $$1 |= a(jm.d);
         }

         if ($$0x.c(d)) {
            $$1 |= a(jm.e);
         }

         return $$1;
      });
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(e) ? erw.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      switch ($$1) {
         case c:
            return $$0.b(a, $$0.c(c)).b(b, $$0.c(d)).b(c, $$0.c(a)).b(d, $$0.c(b));
         case d:
            return $$0.b(a, $$0.c(b)).b(b, $$0.c(c)).b(c, $$0.c(d)).b(d, $$0.c(a));
         case b:
            return $$0.b(a, $$0.c(d)).b(b, $$0.c(a)).b(c, $$0.c(b)).b(d, $$0.c(c));
         default:
            return $$0;
      }
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      switch ($$1) {
         case b:
            return $$0.b(a, $$0.c(c)).b(c, $$0.c(a));
         case c:
            return $$0.b(b, $$0.c(d)).b(d, $$0.c(b));
         default:
            return super.a($$0, $$1);
      }
   }
}
