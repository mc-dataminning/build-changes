import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public class dvu extends dmf implements dtq {
   public static final MapCodec<dvu> a = b(dvu::new);
   public static final eay b = eax.L;
   public static final ebf<ebu> c = eax.Z;
   public static final ebf<ebu> d = eax.aa;
   public static final ebf<ebu> e = eax.ab;
   public static final ebf<ebu> f = eax.ac;
   public static final Map<ja, ebf<ebu>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(ja.c, d, ja.f, c, ja.d, e, ja.e, f)));
   public static final eay h = eax.I;
   private final Function<eah, ffk> i;
   private final Function<eah, ffk> D;
   private static final ffk R = dmf.b(2.0, 0.0, 16.0);
   private static final Map<ja, ffk> S = ffh.c(dmf.b(2.0, 16.0, 0.0, 9.0));

   @Override
   public MapCodec<dvu> a() {
      return a;
   }

   public dvu(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)).b(d, ebu.a).b(c, ebu.a).b(e, ebu.a).b(f, ebu.a).b(h, Boolean.valueOf(false)));
      this.i = this.a(16.0F, 14.0F);
      this.D = this.a(24.0F, 24.0F);
   }

   private Function<eah, ffk> a(float $$0, float $$1) {
      ffk $$2 = dmf.b(8.0, 0.0, (double)$$0);
      int $$3 = 6;
      Map<ja, ffk> $$4 = ffh.c(dmf.a(6.0, 0.0, (double)$$1, 0.0, 11.0));
      Map<ja, ffk> $$5 = ffh.c(dmf.a(6.0, 0.0, (double)$$0, 0.0, 11.0));
      return this.a($$3x -> {
         ffk $$4x = $$3x.c(b) ? $$2 : ffh.a();

         for (Entry<ja, ebf<ebu>> $$5x : g.entrySet()) {
            $$4x = ffh.a($$4x, switch ((ebu)$$3x.c($$5x.getValue())) {
               case a -> ffh.a();
               case b -> (ffk)$$4.get($$5x.getKey());
               case c -> (ffk)$$5.get($$5x.getKey());
            });
         }

         return $$4x;
      }, new ebk[]{h});
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return this.i.apply($$0);
   }

   @Override
   protected ffk b(eah $$0, dig $$1, iu $$2, fev $$3) {
      return this.D.apply($$0);
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }

   private boolean a(eah $$0, boolean $$1, ja $$2) {
      dmf $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dpg && dpg.a($$0, $$2);
      return $$0.a(axc.N) || !k($$0) && $$1 || $$3 instanceof dql || $$4;
   }

   @Override
   public eah a(dcw $$0) {
      djd $$1 = $$0.q();
      iu $$2 = $$0.a();
      ewo $$3 = $$0.q().b_($$0.a());
      iu $$4 = $$2.f();
      iu $$5 = $$2.i();
      iu $$6 = $$2.g();
      iu $$7 = $$2.h();
      iu $$8 = $$2.d();
      eah $$9 = $$1.a_($$4);
      eah $$10 = $$1.a_($$5);
      eah $$11 = $$1.a_($$6);
      eah $$12 = $$1.a_($$7);
      eah $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.c($$1, $$4, ja.d), ja.d);
      boolean $$15 = this.a($$10, $$10.c($$1, $$5, ja.e), ja.e);
      boolean $$16 = this.a($$11, $$11.c($$1, $$6, ja.c), ja.c);
      boolean $$17 = this.a($$12, $$12.c($$1, $$7, ja.f), ja.f);
      eah $$18 = this.m().b(h, Boolean.valueOf($$3.a() == ewp.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, ewp.c, ewp.c.a($$1));
      }

      if ($$4 == ja.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$4 == ja.b ? this.a($$1, $$0, $$5, $$6) : this.a($$1, $$3, $$0, $$5, $$6, $$4);
      }
   }

   private static boolean a(eah $$0, ebk<ebu> $$1) {
      return $$0.c($$1) != ebu.a;
   }

   private static boolean a(ffk $$0, ffk $$1) {
      return !ffh.c($$1, $$0, feu.e);
   }

   private eah a(djd $$0, eah $$1, iu $$2, eah $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private eah a(djd $$0, iu $$1, eah $$2, iu $$3, eah $$4, ja $$5) {
      ja $$6 = $$5.g();
      boolean $$7 = $$5 == ja.c ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == ja.f ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == ja.d ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == ja.e ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, f);
      iu $$11 = $$1.d();
      eah $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private eah a(djd $$0, eah $$1, iu $$2, eah $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      ffk $$8 = $$3.g($$0, $$2).a(ja.a);
      eah $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.b(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(eah $$0, eah $$1, ffk $$2) {
      boolean $$3 = $$1.b() instanceof dvu && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         ebu $$4 = $$0.c(d);
         ebu $$5 = $$0.c(e);
         ebu $$6 = $$0.c(c);
         ebu $$7 = $$0.c(f);
         boolean $$8 = $$5 == ebu.a;
         boolean $$9 = $$7 == ebu.a;
         boolean $$10 = $$6 == ebu.a;
         boolean $$11 = $$4 == ebu.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == ebu.c && $$5 == ebu.c || $$6 == ebu.c && $$7 == ebu.c;
            return $$13 ? false : $$1.a(axc.aR) || a($$2, R);
         }
      }
   }

   private eah a(eah $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, ffk $$5) {
      return $$0.b(d, this.a($$1, $$5, S.get(ja.c)))
         .b(c, this.a($$2, $$5, S.get(ja.f)))
         .b(e, this.a($$3, $$5, S.get(ja.d)))
         .b(f, this.a($$4, $$5, S.get(ja.e)));
   }

   private ebu a(boolean $$0, ffk $$1, ffk $$2) {
      if ($$0) {
         return a($$1, $$2) ? ebu.c : ebu.b;
      } else {
         return ebu.a;
      }
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(h) ? ewp.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(eah $$0) {
      return !$$0.c(h);
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, d, c, f, e, h);
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
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
   protected eah a(eah $$0, dri $$1) {
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
