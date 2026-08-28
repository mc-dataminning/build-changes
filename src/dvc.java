import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public class dvc extends dlu implements dtb {
   public static final MapCodec<dvc> a = b(dvc::new);
   public static final eaf b = eae.L;
   public static final eam<ebb> c = eae.Z;
   public static final eam<ebb> d = eae.aa;
   public static final eam<ebb> e = eae.ab;
   public static final eam<ebb> f = eae.ac;
   public static final Map<ja, eam<ebb>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(ja.c, d, ja.f, c, ja.d, e, ja.e, f)));
   public static final eaf h = eae.I;
   private final Function<dzo, feq> i;
   private final Function<dzo, feq> C;
   private static final feq Q = dlu.b(2.0, 0.0, 16.0);
   private static final Map<ja, feq> R = fen.c(dlu.b(2.0, 16.0, 0.0, 9.0));

   @Override
   public MapCodec<dvc> a() {
      return a;
   }

   public dvc(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(true)).b(d, ebb.a).b(c, ebb.a).b(e, ebb.a).b(f, ebb.a).b(h, Boolean.valueOf(false)));
      this.i = this.a(16.0F, 14.0F);
      this.C = this.a(24.0F, 24.0F);
   }

   private Function<dzo, feq> a(float $$0, float $$1) {
      feq $$2 = dlu.b(8.0, 0.0, (double)$$0);
      int $$3 = 6;
      Map<ja, feq> $$4 = fen.c(dlu.a(6.0, 0.0, (double)$$1, 0.0, 11.0));
      Map<ja, feq> $$5 = fen.c(dlu.a(6.0, 0.0, (double)$$0, 0.0, 11.0));
      return this.a($$3x -> {
         feq $$4x = $$3x.c(b) ? $$2 : fen.a();

         for (Entry<ja, eam<ebb>> $$5x : g.entrySet()) {
            $$4x = fen.a($$4x, switch ((ebb)$$3x.c($$5x.getValue())) {
               case a -> fen.a();
               case b -> (feq)$$4.get($$5x.getKey());
               case c -> (feq)$$5.get($$5x.getKey());
            });
         }

         return $$4x;
      }, new ear[]{h});
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return this.i.apply($$0);
   }

   @Override
   protected feq b(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return this.C.apply($$0);
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }

   private boolean a(dzo $$0, boolean $$1, ja $$2) {
      dlu $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dou && dou.a($$0, $$2);
      return $$0.a(axa.N) || !k($$0) && $$1 || $$3 instanceof dpy || $$4;
   }

   @Override
   public dzo a(dcl $$0) {
      dis $$1 = $$0.q();
      iu $$2 = $$0.a();
      evv $$3 = $$0.q().b_($$0.a());
      iu $$4 = $$2.f();
      iu $$5 = $$2.i();
      iu $$6 = $$2.g();
      iu $$7 = $$2.h();
      iu $$8 = $$2.d();
      dzo $$9 = $$1.a_($$4);
      dzo $$10 = $$1.a_($$5);
      dzo $$11 = $$1.a_($$6);
      dzo $$12 = $$1.a_($$7);
      dzo $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.c($$1, $$4, ja.d), ja.d);
      boolean $$15 = this.a($$10, $$10.c($$1, $$5, ja.e), ja.e);
      boolean $$16 = this.a($$11, $$11.c($$1, $$6, ja.c), ja.c);
      boolean $$17 = this.a($$12, $$12.c($$1, $$7, ja.f), ja.f);
      dzo $$18 = this.m().b(h, Boolean.valueOf($$3.a() == evw.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      if ($$4 == ja.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$4 == ja.b ? this.a($$1, $$0, $$5, $$6) : this.a($$1, $$3, $$0, $$5, $$6, $$4);
      }
   }

   private static boolean a(dzo $$0, ear<ebb> $$1) {
      return $$0.c($$1) != ebb.a;
   }

   private static boolean a(feq $$0, feq $$1) {
      return !fen.c($$1, $$0, fea.e);
   }

   private dzo a(dis $$0, dzo $$1, iu $$2, dzo $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dzo a(dis $$0, iu $$1, dzo $$2, iu $$3, dzo $$4, ja $$5) {
      ja $$6 = $$5.g();
      boolean $$7 = $$5 == ja.c ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == ja.f ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == ja.d ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == ja.e ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, f);
      iu $$11 = $$1.d();
      dzo $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dzo a(dis $$0, dzo $$1, iu $$2, dzo $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      feq $$8 = $$3.g($$0, $$2).a(ja.a);
      dzo $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.b(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dzo $$0, dzo $$1, feq $$2) {
      boolean $$3 = $$1.b() instanceof dvc && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         ebb $$4 = $$0.c(d);
         ebb $$5 = $$0.c(e);
         ebb $$6 = $$0.c(c);
         ebb $$7 = $$0.c(f);
         boolean $$8 = $$5 == ebb.a;
         boolean $$9 = $$7 == ebb.a;
         boolean $$10 = $$6 == ebb.a;
         boolean $$11 = $$4 == ebb.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == ebb.c && $$5 == ebb.c || $$6 == ebb.c && $$7 == ebb.c;
            return $$13 ? false : $$1.a(axa.aR) || a($$2, Q);
         }
      }
   }

   private dzo a(dzo $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, feq $$5) {
      return $$0.b(d, this.a($$1, $$5, R.get(ja.c)))
         .b(c, this.a($$2, $$5, R.get(ja.f)))
         .b(e, this.a($$3, $$5, R.get(ja.d)))
         .b(f, this.a($$4, $$5, R.get(ja.e)));
   }

   private ebb a(boolean $$0, feq $$1, feq $$2) {
      if ($$0) {
         return a($$1, $$2) ? ebb.c : ebb.b;
      } else {
         return ebb.a;
      }
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(h) ? evw.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(dzo $$0) {
      return !$$0.c(h);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, d, c, f, e, h);
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
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
   protected dzo a(dzo $$0, dqv $$1) {
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
