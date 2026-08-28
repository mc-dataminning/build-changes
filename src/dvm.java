import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public class dvm extends dma implements dtj {
   public static final MapCodec<dvm> a = b(dvm::new);
   public static final eaq b = eap.L;
   public static final eax<ebm> c = eap.Z;
   public static final eax<ebm> d = eap.aa;
   public static final eax<ebm> e = eap.ab;
   public static final eax<ebm> f = eap.ac;
   public static final Map<ja, eax<ebm>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(ja.c, d, ja.f, c, ja.d, e, ja.e, f)));
   public static final eaq h = eap.I;
   private final Function<dzz, ffc> i;
   private final Function<dzz, ffc> C;
   private static final ffc Q = dma.b(2.0, 0.0, 16.0);
   private static final Map<ja, ffc> R = fez.c(dma.b(2.0, 16.0, 0.0, 9.0));

   @Override
   public MapCodec<dvm> a() {
      return a;
   }

   public dvm(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(true)).b(d, ebm.a).b(c, ebm.a).b(e, ebm.a).b(f, ebm.a).b(h, Boolean.valueOf(false)));
      this.i = this.a(16.0F, 14.0F);
      this.C = this.a(24.0F, 24.0F);
   }

   private Function<dzz, ffc> a(float $$0, float $$1) {
      ffc $$2 = dma.b(8.0, 0.0, (double)$$0);
      int $$3 = 6;
      Map<ja, ffc> $$4 = fez.c(dma.a(6.0, 0.0, (double)$$1, 0.0, 11.0));
      Map<ja, ffc> $$5 = fez.c(dma.a(6.0, 0.0, (double)$$0, 0.0, 11.0));
      return this.a($$3x -> {
         ffc $$4x = $$3x.c(b) ? $$2 : fez.a();

         for (Entry<ja, eax<ebm>> $$5x : g.entrySet()) {
            $$4x = fez.a($$4x, switch ((ebm)$$3x.c($$5x.getValue())) {
               case a -> fez.a();
               case b -> (ffc)$$4.get($$5x.getKey());
               case c -> (ffc)$$5.get($$5x.getKey());
            });
         }

         return $$4x;
      }, new ebc[]{h});
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return this.i.apply($$0);
   }

   @Override
   protected ffc b(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return this.C.apply($$0);
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }

   private boolean a(dzz $$0, boolean $$1, ja $$2) {
      dma $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dpa && dpa.a($$0, $$2);
      return $$0.a(axc.N) || !k($$0) && $$1 || $$3 instanceof dqf || $$4;
   }

   @Override
   public dzz a(dcr $$0) {
      diy $$1 = $$0.q();
      iu $$2 = $$0.a();
      ewg $$3 = $$0.q().b_($$0.a());
      iu $$4 = $$2.f();
      iu $$5 = $$2.i();
      iu $$6 = $$2.g();
      iu $$7 = $$2.h();
      iu $$8 = $$2.d();
      dzz $$9 = $$1.a_($$4);
      dzz $$10 = $$1.a_($$5);
      dzz $$11 = $$1.a_($$6);
      dzz $$12 = $$1.a_($$7);
      dzz $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.c($$1, $$4, ja.d), ja.d);
      boolean $$15 = this.a($$10, $$10.c($$1, $$5, ja.e), ja.e);
      boolean $$16 = this.a($$11, $$11.c($$1, $$6, ja.c), ja.c);
      boolean $$17 = this.a($$12, $$12.c($$1, $$7, ja.f), ja.f);
      dzz $$18 = this.m().b(h, Boolean.valueOf($$3.a() == ewh.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, ewh.c, ewh.c.a($$1));
      }

      if ($$4 == ja.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$4 == ja.b ? this.a($$1, $$0, $$5, $$6) : this.a($$1, $$3, $$0, $$5, $$6, $$4);
      }
   }

   private static boolean a(dzz $$0, ebc<ebm> $$1) {
      return $$0.c($$1) != ebm.a;
   }

   private static boolean a(ffc $$0, ffc $$1) {
      return !fez.c($$1, $$0, fem.e);
   }

   private dzz a(diy $$0, dzz $$1, iu $$2, dzz $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dzz a(diy $$0, iu $$1, dzz $$2, iu $$3, dzz $$4, ja $$5) {
      ja $$6 = $$5.g();
      boolean $$7 = $$5 == ja.c ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == ja.f ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == ja.d ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == ja.e ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, f);
      iu $$11 = $$1.d();
      dzz $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dzz a(diy $$0, dzz $$1, iu $$2, dzz $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      ffc $$8 = $$3.g($$0, $$2).a(ja.a);
      dzz $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.b(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dzz $$0, dzz $$1, ffc $$2) {
      boolean $$3 = $$1.b() instanceof dvm && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         ebm $$4 = $$0.c(d);
         ebm $$5 = $$0.c(e);
         ebm $$6 = $$0.c(c);
         ebm $$7 = $$0.c(f);
         boolean $$8 = $$5 == ebm.a;
         boolean $$9 = $$7 == ebm.a;
         boolean $$10 = $$6 == ebm.a;
         boolean $$11 = $$4 == ebm.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == ebm.c && $$5 == ebm.c || $$6 == ebm.c && $$7 == ebm.c;
            return $$13 ? false : $$1.a(axc.aR) || a($$2, Q);
         }
      }
   }

   private dzz a(dzz $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, ffc $$5) {
      return $$0.b(d, this.a($$1, $$5, R.get(ja.c)))
         .b(c, this.a($$2, $$5, R.get(ja.f)))
         .b(e, this.a($$3, $$5, R.get(ja.d)))
         .b(f, this.a($$4, $$5, R.get(ja.e)));
   }

   private ebm a(boolean $$0, ffc $$1, ffc $$2) {
      if ($$0) {
         return a($$1, $$2) ? ebm.c : ebm.b;
      } else {
         return ebm.a;
      }
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(h) ? ewh.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(dzz $$0) {
      return !$$0.c(h);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, d, c, f, e, h);
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      switch ($$1) {
         case c:
            return $$0.b(d, $$0.c(e)).b(c, $$0.c(f)).b(e, $$0.c(d)).b(f, $$0.c(c));
         case d:
            return $$0.b(d, $$0.c(c)).b(c, $$0.c(e)).b(e, $$0.c(f)).b(f, $$0.c(d));
         case b:
            return $$0.b(d, $$0.c(f)).b(c, $$0.c(d)).b(e, $$0.c(c)).b(f, $$0.c(e));
         default:
            return $$0;
      }
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      switch ($$1) {
         case b:
            return $$0.b(d, $$0.c(e)).b(e, $$0.c(d));
         case c:
            return $$0.b(c, $$0.c(f)).b(f, $$0.c(c));
         default:
            return super.a($$0, $$1);
      }
   }
}
