import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public class dti extends dke implements drl {
   public static final MapCodec<dti> a = b(dti::new);
   public static final dyh b = dyg.L;
   public static final dyo<dzc> c = dyg.Z;
   public static final dyo<dzc> d = dyg.aa;
   public static final dyo<dzc> e = dyg.ab;
   public static final dyo<dzc> f = dyg.ac;
   public static final Map<jn, dyo<dzc>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(jn.c, d, jn.f, c, jn.d, e, jn.e, f)));
   public static final dyh h = dyg.I;
   private final Function<dxq, fcr> i;
   private final Function<dxq, fcr> C;
   private static final fcr Q = dke.b(2.0, 0.0, 16.0);
   private static final Map<jn, fcr> R = fco.c(dke.b(2.0, 16.0, 0.0, 9.0));

   @Override
   public MapCodec<dti> a() {
      return a;
   }

   public dti(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(true)).b(d, dzc.a).b(c, dzc.a).b(e, dzc.a).b(f, dzc.a).b(h, Boolean.valueOf(false)));
      this.i = this.a(16.0F, 14.0F);
      this.C = this.a(24.0F, 24.0F);
   }

   private Function<dxq, fcr> a(float $$0, float $$1) {
      fcr $$2 = dke.b(8.0, 0.0, (double)$$0);
      int $$3 = 6;
      Map<jn, fcr> $$4 = fco.c(dke.a(6.0, 0.0, (double)$$1, 0.0, 11.0));
      Map<jn, fcr> $$5 = fco.c(dke.a(6.0, 0.0, (double)$$0, 0.0, 11.0));
      return this.a($$3x -> {
         fcr $$4x = $$3x.c(b) ? $$2 : fco.a();

         for (Entry<jn, dyo<dzc>> $$5x : g.entrySet()) {
            $$4x = fco.a($$4x, switch ((dzc)$$3x.c($$5x.getValue())) {
               case a -> fco.a();
               case b -> (fcr)$$4.get($$5x.getKey());
               case c -> (fcr)$$5.get($$5x.getKey());
            });
         }

         return $$4x;
      }, new dyt[]{h});
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return this.i.apply($$0);
   }

   @Override
   protected fcr b(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return this.C.apply($$0);
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }

   private boolean a(dxq $$0, boolean $$1, jn $$2) {
      dke $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dne && dne.a($$0, $$2);
      return $$0.a(awp.N) || !k($$0) && $$1 || $$3 instanceof doi || $$4;
   }

   @Override
   public dxq a(dax $$0) {
      dhc $$1 = $$0.q();
      ji $$2 = $$0.a();
      etw $$3 = $$0.q().b_($$0.a());
      ji $$4 = $$2.f();
      ji $$5 = $$2.i();
      ji $$6 = $$2.g();
      ji $$7 = $$2.h();
      ji $$8 = $$2.d();
      dxq $$9 = $$1.a_($$4);
      dxq $$10 = $$1.a_($$5);
      dxq $$11 = $$1.a_($$6);
      dxq $$12 = $$1.a_($$7);
      dxq $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.c($$1, $$4, jn.d), jn.d);
      boolean $$15 = this.a($$10, $$10.c($$1, $$5, jn.e), jn.e);
      boolean $$16 = this.a($$11, $$11.c($$1, $$6, jn.c), jn.c);
      boolean $$17 = this.a($$12, $$12.c($$1, $$7, jn.f), jn.f);
      dxq $$18 = this.m().b(h, Boolean.valueOf($$3.a() == etx.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      if ($$4 == jn.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$4 == jn.b ? this.a($$1, $$0, $$5, $$6) : this.a($$1, $$3, $$0, $$5, $$6, $$4);
      }
   }

   private static boolean a(dxq $$0, dyt<dzc> $$1) {
      return $$0.c($$1) != dzc.a;
   }

   private static boolean a(fcr $$0, fcr $$1) {
      return !fco.c($$1, $$0, fcb.e);
   }

   private dxq a(dhc $$0, dxq $$1, ji $$2, dxq $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dxq a(dhc $$0, ji $$1, dxq $$2, ji $$3, dxq $$4, jn $$5) {
      jn $$6 = $$5.g();
      boolean $$7 = $$5 == jn.c ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == jn.f ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == jn.d ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == jn.e ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, f);
      ji $$11 = $$1.d();
      dxq $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dxq a(dhc $$0, dxq $$1, ji $$2, dxq $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      fcr $$8 = $$3.g($$0, $$2).a(jn.a);
      dxq $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.b(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dxq $$0, dxq $$1, fcr $$2) {
      boolean $$3 = $$1.b() instanceof dti && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dzc $$4 = $$0.c(d);
         dzc $$5 = $$0.c(e);
         dzc $$6 = $$0.c(c);
         dzc $$7 = $$0.c(f);
         boolean $$8 = $$5 == dzc.a;
         boolean $$9 = $$7 == dzc.a;
         boolean $$10 = $$6 == dzc.a;
         boolean $$11 = $$4 == dzc.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dzc.c && $$5 == dzc.c || $$6 == dzc.c && $$7 == dzc.c;
            return $$13 ? false : $$1.a(awp.aR) || a($$2, Q);
         }
      }
   }

   private dxq a(dxq $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, fcr $$5) {
      return $$0.b(d, this.a($$1, $$5, R.get(jn.c)))
         .b(c, this.a($$2, $$5, R.get(jn.f)))
         .b(e, this.a($$3, $$5, R.get(jn.d)))
         .b(f, this.a($$4, $$5, R.get(jn.e)));
   }

   private dzc a(boolean $$0, fcr $$1, fcr $$2) {
      if ($$0) {
         return a($$1, $$2) ? dzc.c : dzc.b;
      } else {
         return dzc.a;
      }
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(h) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(dxq $$0) {
      return !$$0.c(h);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, d, c, f, e, h);
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
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
   protected dxq a(dxq $$0, dpf $$1) {
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
