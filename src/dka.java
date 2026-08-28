import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class dka extends die implements dpf {
   public static final dwa a = dnr.b;
   public static final dwa b = dnr.c;
   public static final dwa c = dnr.d;
   public static final dwa d = dnr.e;
   public static final dwa e = dvz.C;
   protected static final Map<jm, dwa> f = dnr.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ae.a());
   protected final fah[] g;
   protected final fah[] h;
   private final Object2IntMap<dvj> i = new Object2IntOpenHashMap();

   protected dka(float $$0, float $$1, float $$2, float $$3, float $$4, dvi.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.F.a().iterator();

      while (var7.hasNext()) {
         dvj $$6 = (dvj)var7.next();
         this.h($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends dka> a();

   protected fah[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      fah $$9 = die.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      fah $$10 = die.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      fah $$11 = die.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      fah $$12 = die.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      fah $$13 = die.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      fah $$14 = fae.a($$10, $$13);
      fah $$15 = fae.a($$11, $$12);
      fah[] $$16 = new fah[]{
         fae.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         fae.a($$11, $$10),
         fae.a($$12, $$10),
         fae.a($$15, $$10),
         $$13,
         fae.a($$11, $$13),
         fae.a($$12, $$13),
         fae.a($$15, $$13),
         $$14,
         fae.a($$11, $$14),
         fae.a($$12, $$14),
         fae.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = fae.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean e_(dvj $$0) {
      return !$$0.c(e);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return this.h[this.h($$0)];
   }

   @Override
   protected fah b(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return this.g[this.h($$0)];
   }

   private static int a(jm $$0) {
      return 1 << $$0.e();
   }

   protected int h(dvj $$0) {
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
   protected erk b_(dvj $$0) {
      return $$0.c(e) ? erl.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
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
   protected dvj a(dvj $$0, dna $$1) {
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
