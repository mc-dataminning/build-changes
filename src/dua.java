import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public class dua extends dku implements dsb {
   public static final MapCodec<dua> a = b(dua::new);
   public static final dzd b = dzc.L;
   public static final dzk<dzz> c = dzc.Z;
   public static final dzk<dzz> d = dzc.aa;
   public static final dzk<dzz> e = dzc.ab;
   public static final dzk<dzz> f = dzc.ac;
   public static final Map<jo, dzk<dzz>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(jo.c, d, jo.f, c, jo.d, e, jo.e, f)));
   public static final dzd h = dzc.I;
   private final Function<dym, fdo> i;
   private final Function<dym, fdo> C;
   private static final fdo Q = dku.b(2.0, 0.0, 16.0);
   private static final Map<jo, fdo> R = fdl.c(dku.b(2.0, 16.0, 0.0, 9.0));

   @Override
   public MapCodec<dua> a() {
      return a;
   }

   public dua(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(true)).b(d, dzz.a).b(c, dzz.a).b(e, dzz.a).b(f, dzz.a).b(h, Boolean.valueOf(false)));
      this.i = this.a(16.0F, 14.0F);
      this.C = this.a(24.0F, 24.0F);
   }

   private Function<dym, fdo> a(float $$0, float $$1) {
      fdo $$2 = dku.b(8.0, 0.0, (double)$$0);
      int $$3 = 6;
      Map<jo, fdo> $$4 = fdl.c(dku.a(6.0, 0.0, (double)$$1, 0.0, 11.0));
      Map<jo, fdo> $$5 = fdl.c(dku.a(6.0, 0.0, (double)$$0, 0.0, 11.0));
      return this.a($$3x -> {
         fdo $$4x = $$3x.c(b) ? $$2 : fdl.a();

         for (Entry<jo, dzk<dzz>> $$5x : g.entrySet()) {
            $$4x = fdl.a($$4x, switch ((dzz)$$3x.c($$5x.getValue())) {
               case a -> fdl.a();
               case b -> (fdo)$$4.get($$5x.getKey());
               case c -> (fdo)$$5.get($$5x.getKey());
            });
         }

         return $$4x;
      }, new dzp[]{h});
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return this.i.apply($$0);
   }

   @Override
   protected fdo b(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return this.C.apply($$0);
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }

   private boolean a(dym $$0, boolean $$1, jo $$2) {
      dku $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dnu && dnu.a($$0, $$2);
      return $$0.a(awz.N) || !k($$0) && $$1 || $$3 instanceof doy || $$4;
   }

   @Override
   public dym a(dbn $$0) {
      dhs $$1 = $$0.q();
      jj $$2 = $$0.a();
      eut $$3 = $$0.q().b_($$0.a());
      jj $$4 = $$2.f();
      jj $$5 = $$2.i();
      jj $$6 = $$2.g();
      jj $$7 = $$2.h();
      jj $$8 = $$2.d();
      dym $$9 = $$1.a_($$4);
      dym $$10 = $$1.a_($$5);
      dym $$11 = $$1.a_($$6);
      dym $$12 = $$1.a_($$7);
      dym $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.c($$1, $$4, jo.d), jo.d);
      boolean $$15 = this.a($$10, $$10.c($$1, $$5, jo.e), jo.e);
      boolean $$16 = this.a($$11, $$11.c($$1, $$6, jo.c), jo.c);
      boolean $$17 = this.a($$12, $$12.c($$1, $$7, jo.f), jo.f);
      dym $$18 = this.m().b(h, Boolean.valueOf($$3.a() == euu.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      if ($$4 == jo.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$4 == jo.b ? this.a($$1, $$0, $$5, $$6) : this.a($$1, $$3, $$0, $$5, $$6, $$4);
      }
   }

   private static boolean a(dym $$0, dzp<dzz> $$1) {
      return $$0.c($$1) != dzz.a;
   }

   private static boolean a(fdo $$0, fdo $$1) {
      return !fdl.c($$1, $$0, fcy.e);
   }

   private dym a(dhs $$0, dym $$1, jj $$2, dym $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dym a(dhs $$0, jj $$1, dym $$2, jj $$3, dym $$4, jo $$5) {
      jo $$6 = $$5.g();
      boolean $$7 = $$5 == jo.c ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == jo.f ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == jo.d ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == jo.e ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, f);
      jj $$11 = $$1.d();
      dym $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dym a(dhs $$0, dym $$1, jj $$2, dym $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      fdo $$8 = $$3.g($$0, $$2).a(jo.a);
      dym $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.b(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dym $$0, dym $$1, fdo $$2) {
      boolean $$3 = $$1.b() instanceof dua && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dzz $$4 = $$0.c(d);
         dzz $$5 = $$0.c(e);
         dzz $$6 = $$0.c(c);
         dzz $$7 = $$0.c(f);
         boolean $$8 = $$5 == dzz.a;
         boolean $$9 = $$7 == dzz.a;
         boolean $$10 = $$6 == dzz.a;
         boolean $$11 = $$4 == dzz.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dzz.c && $$5 == dzz.c || $$6 == dzz.c && $$7 == dzz.c;
            return $$13 ? false : $$1.a(awz.aR) || a($$2, Q);
         }
      }
   }

   private dym a(dym $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, fdo $$5) {
      return $$0.b(d, this.a($$1, $$5, R.get(jo.c)))
         .b(c, this.a($$2, $$5, R.get(jo.f)))
         .b(e, this.a($$3, $$5, R.get(jo.d)))
         .b(f, this.a($$4, $$5, R.get(jo.e)));
   }

   private dzz a(boolean $$0, fdo $$1, fdo $$2) {
      if ($$0) {
         return a($$1, $$2) ? dzz.c : dzz.b;
      } else {
         return dzz.a;
      }
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(h) ? euu.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(dym $$0) {
      return !$$0.c(h);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, d, c, f, e, h);
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
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
   protected dym a(dym $$0, dpv $$1) {
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
