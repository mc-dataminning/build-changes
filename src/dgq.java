import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class dgq extends deu implements dlv {
   public static final dso a = dki.b;
   public static final dso b = dki.c;
   public static final dso c = dki.d;
   public static final dso d = dki.e;
   public static final dso e = dsn.C;
   protected static final Map<je, dso> f = dki.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ac.a());
   protected final ewf[] g;
   protected final ewf[] h;
   private final Object2IntMap<drx> i = new Object2IntOpenHashMap();

   protected dgq(float $$0, float $$1, float $$2, float $$3, float $$4, drw.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.E.a().iterator();

      while (var7.hasNext()) {
         drx $$6 = (drx)var7.next();
         this.g($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends dgq> a();

   protected ewf[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      ewf $$9 = deu.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      ewf $$10 = deu.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      ewf $$11 = deu.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      ewf $$12 = deu.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      ewf $$13 = deu.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      ewf $$14 = ewc.a($$10, $$13);
      ewf $$15 = ewc.a($$11, $$12);
      ewf[] $$16 = new ewf[]{
         ewc.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         ewc.a($$11, $$10),
         ewc.a($$12, $$10),
         ewc.a($$15, $$10),
         $$13,
         ewc.a($$11, $$13),
         ewc.a($$12, $$13),
         ewc.a($$15, $$13),
         $$14,
         ewc.a($$11, $$14),
         ewc.a($$12, $$14),
         ewc.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = ewc.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean a_(drx $$0, daz $$1, iz $$2) {
      return !$$0.c(e);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   protected ewf b(drx $$0, daz $$1, iz $$2, evr $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(je $$0) {
      return 1 << $$0.e();
   }

   protected int g(drx $$0) {
      return this.i.computeIntIfAbsent($$0, $$0x -> {
         int $$1 = 0;
         if ($$0x.c(a)) {
            $$1 |= a(je.c);
         }

         if ($$0x.c(b)) {
            $$1 |= a(je.f);
         }

         if ($$0x.c(c)) {
            $$1 |= a(je.d);
         }

         if ($$0x.c(d)) {
            $$1 |= a(je.e);
         }

         return $$1;
      });
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(e) ? enr.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
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
   protected drx a(drx $$0, djr $$1) {
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
