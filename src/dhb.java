import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class dhb extends dff implements dmg {
   public static final dsy a = dkt.b;
   public static final dsy b = dkt.c;
   public static final dsy c = dkt.d;
   public static final dsy d = dkt.e;
   public static final dsy e = dsx.C;
   protected static final Map<jf, dsy> f = dkt.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ac.a());
   protected final ews[] g;
   protected final ews[] h;
   private final Object2IntMap<dsh> i = new Object2IntOpenHashMap();

   protected dhb(float $$0, float $$1, float $$2, float $$3, float $$4, dsg.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.E.a().iterator();

      while (var7.hasNext()) {
         dsh $$6 = (dsh)var7.next();
         this.g($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends dhb> a();

   protected ews[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      ews $$9 = dff.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      ews $$10 = dff.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      ews $$11 = dff.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      ews $$12 = dff.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      ews $$13 = dff.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      ews $$14 = ewp.a($$10, $$13);
      ews $$15 = ewp.a($$11, $$12);
      ews[] $$16 = new ews[]{
         ewp.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         ewp.a($$11, $$10),
         ewp.a($$12, $$10),
         ewp.a($$15, $$10),
         $$13,
         ewp.a($$11, $$13),
         ewp.a($$12, $$13),
         ewp.a($$15, $$13),
         $$14,
         ewp.a($$11, $$14),
         ewp.a($$12, $$14),
         ewp.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = ewp.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean a_(dsh $$0, dbj $$1, ja $$2) {
      return !$$0.c(e);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   protected ews b(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(jf $$0) {
      return 1 << $$0.e();
   }

   protected int g(dsh $$0) {
      return this.i.computeIntIfAbsent($$0, $$0x -> {
         int $$1 = 0;
         if ($$0x.c(a)) {
            $$1 |= a(jf.c);
         }

         if ($$0x.c(b)) {
            $$1 |= a(jf.f);
         }

         if ($$0x.c(c)) {
            $$1 |= a(jf.d);
         }

         if ($$0x.c(d)) {
            $$1 |= a(jf.e);
         }

         return $$1;
      });
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(e) ? eoc.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
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
   protected dsh a(dsh $$0, dkc $$1) {
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
