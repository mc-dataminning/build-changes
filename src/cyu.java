import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class cyu extends cwy implements ddy {
   public static final dkg a = dcl.b;
   public static final dkg b = dcl.c;
   public static final dkg c = dcl.d;
   public static final dkg d = dcl.e;
   public static final dkg e = dkf.C;
   protected static final Map<ic, dkg> f = dcl.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ac.a());
   protected final emv[] g;
   protected final emv[] h;
   private final Object2IntMap<djp> i = new Object2IntOpenHashMap();

   protected cyu(float $$0, float $$1, float $$2, float $$3, float $$4, djo.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.E.a().iterator();

      while (var7.hasNext()) {
         djp $$6 = (djp)var7.next();
         this.g($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends cyu> a();

   protected emv[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      emv $$9 = cwy.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      emv $$10 = cwy.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      emv $$11 = cwy.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      emv $$12 = cwy.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      emv $$13 = cwy.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      emv $$14 = ems.a($$10, $$13);
      emv $$15 = ems.a($$11, $$12);
      emv[] $$16 = new emv[]{
         ems.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         ems.a($$11, $$10),
         ems.a($$12, $$10),
         ems.a($$15, $$10),
         $$13,
         ems.a($$11, $$13),
         ems.a($$12, $$13),
         ems.a($$15, $$13),
         $$14,
         ems.a($$11, $$14),
         ems.a($$12, $$14),
         ems.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = ems.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   public boolean a_(djp $$0, ctd $$1, hx $$2) {
      return !$$0.c(e);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   public emv b(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(ic $$0) {
      return 1 << $$0.e();
   }

   protected int g(djp $$0) {
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
   public eez c_(djp $$0) {
      return $$0.c(e) ? efa.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
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
   public djp a(djp $$0, dbu $$1) {
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
