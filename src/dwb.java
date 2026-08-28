import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public class dwb extends dmm implements dtx {
   public static final MapCodec<dwb> a = b(dwb::new);
   public static final ebf b = ebe.L;
   public static final ebm<ecb> c = ebe.Z;
   public static final ebm<ecb> d = ebe.aa;
   public static final ebm<ecb> e = ebe.ab;
   public static final ebm<ecb> f = ebe.ac;
   public static final Map<jb, ebm<ecb>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(jb.c, d, jb.f, c, jb.d, e, jb.e, f)));
   public static final ebf h = ebe.I;
   private final Function<eao, ffr> i;
   private final Function<eao, ffr> D;
   private static final ffr R = dmm.b(2.0, 0.0, 16.0);
   private static final Map<jb, ffr> S = ffo.c(dmm.b(2.0, 16.0, 0.0, 9.0));

   @Override
   public MapCodec<dwb> a() {
      return a;
   }

   public dwb(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)).b(d, ecb.a).b(c, ecb.a).b(e, ecb.a).b(f, ecb.a).b(h, Boolean.valueOf(false)));
      this.i = this.a(16.0F, 14.0F);
      this.D = this.a(24.0F, 24.0F);
   }

   private Function<eao, ffr> a(float $$0, float $$1) {
      ffr $$2 = dmm.b(8.0, 0.0, (double)$$0);
      int $$3 = 6;
      Map<jb, ffr> $$4 = ffo.c(dmm.a(6.0, 0.0, (double)$$1, 0.0, 11.0));
      Map<jb, ffr> $$5 = ffo.c(dmm.a(6.0, 0.0, (double)$$0, 0.0, 11.0));
      return this.a($$3x -> {
         ffr $$4x = $$3x.c(b) ? $$2 : ffo.a();

         for (Entry<jb, ebm<ecb>> $$5x : g.entrySet()) {
            $$4x = ffo.a($$4x, switch ((ecb)$$3x.c($$5x.getValue())) {
               case a -> ffo.a();
               case b -> (ffr)$$4.get($$5x.getKey());
               case c -> (ffr)$$5.get($$5x.getKey());
            });
         }

         return $$4x;
      }, new ebr[]{h});
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return this.i.apply($$0);
   }

   @Override
   protected ffr b(eao $$0, din $$1, iv $$2, ffc $$3) {
      return this.D.apply($$0);
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }

   private boolean a(eao $$0, boolean $$1, jb $$2) {
      dmm $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dpn && dpn.a($$0, $$2);
      return $$0.a(axc.N) || !k($$0) && $$1 || $$3 instanceof dqs || $$4;
   }

   @Override
   public eao a(ddd $$0) {
      djk $$1 = $$0.q();
      iv $$2 = $$0.a();
      ewv $$3 = $$0.q().b_($$0.a());
      iv $$4 = $$2.f();
      iv $$5 = $$2.i();
      iv $$6 = $$2.g();
      iv $$7 = $$2.h();
      iv $$8 = $$2.d();
      eao $$9 = $$1.a_($$4);
      eao $$10 = $$1.a_($$5);
      eao $$11 = $$1.a_($$6);
      eao $$12 = $$1.a_($$7);
      eao $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.c($$1, $$4, jb.d), jb.d);
      boolean $$15 = this.a($$10, $$10.c($$1, $$5, jb.e), jb.e);
      boolean $$16 = this.a($$11, $$11.c($$1, $$6, jb.c), jb.c);
      boolean $$17 = this.a($$12, $$12.c($$1, $$7, jb.f), jb.f);
      eao $$18 = this.m().b(h, Boolean.valueOf($$3.a() == eww.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      if ($$4 == jb.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$4 == jb.b ? this.a($$1, $$0, $$5, $$6) : this.a($$1, $$3, $$0, $$5, $$6, $$4);
      }
   }

   private static boolean a(eao $$0, ebr<ecb> $$1) {
      return $$0.c($$1) != ecb.a;
   }

   private static boolean a(ffr $$0, ffr $$1) {
      return !ffo.c($$1, $$0, ffb.e);
   }

   private eao a(djk $$0, eao $$1, iv $$2, eao $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private eao a(djk $$0, iv $$1, eao $$2, iv $$3, eao $$4, jb $$5) {
      jb $$6 = $$5.g();
      boolean $$7 = $$5 == jb.c ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == jb.f ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == jb.d ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == jb.e ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, f);
      iv $$11 = $$1.d();
      eao $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private eao a(djk $$0, eao $$1, iv $$2, eao $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      ffr $$8 = $$3.g($$0, $$2).a(jb.a);
      eao $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.b(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(eao $$0, eao $$1, ffr $$2) {
      boolean $$3 = $$1.b() instanceof dwb && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         ecb $$4 = $$0.c(d);
         ecb $$5 = $$0.c(e);
         ecb $$6 = $$0.c(c);
         ecb $$7 = $$0.c(f);
         boolean $$8 = $$5 == ecb.a;
         boolean $$9 = $$7 == ecb.a;
         boolean $$10 = $$6 == ecb.a;
         boolean $$11 = $$4 == ecb.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == ecb.c && $$5 == ecb.c || $$6 == ecb.c && $$7 == ecb.c;
            return $$13 ? false : $$1.a(axc.aR) || a($$2, R);
         }
      }
   }

   private eao a(eao $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, ffr $$5) {
      return $$0.b(d, this.a($$1, $$5, S.get(jb.c)))
         .b(c, this.a($$2, $$5, S.get(jb.f)))
         .b(e, this.a($$3, $$5, S.get(jb.d)))
         .b(f, this.a($$4, $$5, S.get(jb.e)));
   }

   private ecb a(boolean $$0, ffr $$1, ffr $$2) {
      if ($$0) {
         return a($$1, $$2) ? ecb.c : ecb.b;
      } else {
         return ecb.a;
      }
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(h) ? eww.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(eao $$0) {
      return !$$0.c(h);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, d, c, f, e, h);
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
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
   protected eao a(eao $$0, drp $$1) {
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
