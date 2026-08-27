import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class cym extends cwq implements ddq {
   public static final djy a = dcd.b;
   public static final djy b = dcd.c;
   public static final djy c = dcd.d;
   public static final djy d = dcd.e;
   public static final djy e = djx.C;
   protected static final Map<ic, djy> f = dcd.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ac.a());
   protected final emm[] g;
   protected final emm[] h;
   private final Object2IntMap<djh> i = new Object2IntOpenHashMap();

   protected cym(float $$0, float $$1, float $$2, float $$3, float $$4, djg.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.E.a().iterator();

      while (var7.hasNext()) {
         djh $$6 = (djh)var7.next();
         this.g($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends cym> a();

   protected emm[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      emm $$9 = cwq.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      emm $$10 = cwq.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      emm $$11 = cwq.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      emm $$12 = cwq.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      emm $$13 = cwq.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      emm $$14 = emj.a($$10, $$13);
      emm $$15 = emj.a($$11, $$12);
      emm[] $$16 = new emm[]{
         emj.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         emj.a($$11, $$10),
         emj.a($$12, $$10),
         emj.a($$15, $$10),
         $$13,
         emj.a($$11, $$13),
         emj.a($$12, $$13),
         emj.a($$15, $$13),
         $$14,
         emj.a($$11, $$14),
         emj.a($$12, $$14),
         emj.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = emj.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   public boolean a_(djh $$0, csv $$1, hx $$2) {
      return !$$0.c(e);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   public emm b(djh $$0, csv $$1, hx $$2, ely $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(ic $$0) {
      return 1 << $$0.e();
   }

   protected int g(djh $$0) {
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
   public eer c_(djh $$0) {
      return $$0.c(e) ? ees.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
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
   public djh a(djh $$0, dbm $$1) {
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
