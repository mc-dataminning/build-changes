import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public class dwr extends dnc implements dun {
   public static final MapCodec<dwr> a = b(dwr::new);
   public static final ebv b = ebu.L;
   public static final ecc<ecr> c = ebu.Z;
   public static final ecc<ecr> d = ebu.aa;
   public static final ecc<ecr> e = ebu.ab;
   public static final ecc<ecr> f = ebu.ac;
   public static final Map<jb, ecc<ecr>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(jb.c, d, jb.f, c, jb.d, e, jb.e, f)));
   public static final ebv h = ebu.I;
   private final Function<ebe, fgk> i;
   private final Function<ebe, fgk> D;
   private static final fgk R = dnc.b(2.0, 0.0, 16.0);
   private static final Map<jb, fgk> S = fgh.c(dnc.b(2.0, 16.0, 0.0, 9.0));

   @Override
   public MapCodec<dwr> a() {
      return a;
   }

   public dwr(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)).b(d, ecr.a).b(c, ecr.a).b(e, ecr.a).b(f, ecr.a).b(h, Boolean.valueOf(false)));
      this.i = this.a(16.0F, 14.0F);
      this.D = this.a(24.0F, 24.0F);
   }

   private Function<ebe, fgk> a(float $$0, float $$1) {
      fgk $$2 = dnc.b(8.0, 0.0, (double)$$0);
      int $$3 = 6;
      Map<jb, fgk> $$4 = fgh.c(dnc.a(6.0, 0.0, (double)$$1, 0.0, 11.0));
      Map<jb, fgk> $$5 = fgh.c(dnc.a(6.0, 0.0, (double)$$0, 0.0, 11.0));
      return this.a($$3x -> {
         fgk $$4x = $$3x.c(b) ? $$2 : fgh.a();

         for (Entry<jb, ecc<ecr>> $$5x : g.entrySet()) {
            $$4x = fgh.a($$4x, switch ((ecr)$$3x.c($$5x.getValue())) {
               case a -> fgh.a();
               case b -> (fgk)$$4.get($$5x.getKey());
               case c -> (fgk)$$5.get($$5x.getKey());
            });
         }

         return $$4x;
      }, new ech[]{h});
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return this.i.apply($$0);
   }

   @Override
   protected fgk b(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return this.D.apply($$0);
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }

   private boolean a(ebe $$0, boolean $$1, jb $$2) {
      dnc $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dqd && dqd.a($$0, $$2);
      return $$0.a(axe.N) || !k($$0) && $$1 || $$3 instanceof dri || $$4;
   }

   @Override
   public ebe a(ddr $$0) {
      dka $$1 = $$0.q();
      iv $$2 = $$0.a();
      exo $$3 = $$0.q().b_($$0.a());
      iv $$4 = $$2.f();
      iv $$5 = $$2.i();
      iv $$6 = $$2.g();
      iv $$7 = $$2.h();
      iv $$8 = $$2.d();
      ebe $$9 = $$1.a_($$4);
      ebe $$10 = $$1.a_($$5);
      ebe $$11 = $$1.a_($$6);
      ebe $$12 = $$1.a_($$7);
      ebe $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.c($$1, $$4, jb.d), jb.d);
      boolean $$15 = this.a($$10, $$10.c($$1, $$5, jb.e), jb.e);
      boolean $$16 = this.a($$11, $$11.c($$1, $$6, jb.c), jb.c);
      boolean $$17 = this.a($$12, $$12.c($$1, $$7, jb.f), jb.f);
      ebe $$18 = this.m().b(h, Boolean.valueOf($$3.a() == exp.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      if ($$4 == jb.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$4 == jb.b ? this.a($$1, $$0, $$5, $$6) : this.a($$1, $$3, $$0, $$5, $$6, $$4);
      }
   }

   private static boolean a(ebe $$0, ech<ecr> $$1) {
      return $$0.c($$1) != ecr.a;
   }

   private static boolean a(fgk $$0, fgk $$1) {
      return !fgh.c($$1, $$0, ffu.e);
   }

   private ebe a(dka $$0, ebe $$1, iv $$2, ebe $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private ebe a(dka $$0, iv $$1, ebe $$2, iv $$3, ebe $$4, jb $$5) {
      jb $$6 = $$5.g();
      boolean $$7 = $$5 == jb.c ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == jb.f ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == jb.d ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == jb.e ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, f);
      iv $$11 = $$1.d();
      ebe $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private ebe a(dka $$0, ebe $$1, iv $$2, ebe $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      fgk $$8 = $$3.g($$0, $$2).a(jb.a);
      ebe $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.b(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(ebe $$0, ebe $$1, fgk $$2) {
      boolean $$3 = $$1.b() instanceof dwr && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         ecr $$4 = $$0.c(d);
         ecr $$5 = $$0.c(e);
         ecr $$6 = $$0.c(c);
         ecr $$7 = $$0.c(f);
         boolean $$8 = $$5 == ecr.a;
         boolean $$9 = $$7 == ecr.a;
         boolean $$10 = $$6 == ecr.a;
         boolean $$11 = $$4 == ecr.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == ecr.c && $$5 == ecr.c || $$6 == ecr.c && $$7 == ecr.c;
            return $$13 ? false : $$1.a(axe.aR) || a($$2, R);
         }
      }
   }

   private ebe a(ebe $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, fgk $$5) {
      return $$0.b(d, this.a($$1, $$5, S.get(jb.c)))
         .b(c, this.a($$2, $$5, S.get(jb.f)))
         .b(e, this.a($$3, $$5, S.get(jb.d)))
         .b(f, this.a($$4, $$5, S.get(jb.e)));
   }

   private ecr a(boolean $$0, fgk $$1, fgk $$2) {
      if ($$0) {
         return a($$1, $$2) ? ecr.c : ecr.b;
      } else {
         return ecr.a;
      }
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(h) ? exp.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(ebe $$0) {
      return !$$0.c(h);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, d, c, f, e, h);
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
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
   protected ebe a(ebe $$0, dsf $$1) {
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
