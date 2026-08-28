import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dqi extends dhj implements dol {
   public static final MapCodec<dqi> a = b(dqi::new);
   public static final dvf b = dve.J;
   public static final dvm<dwa> c = dve.W;
   public static final dvm<dwa> d = dve.X;
   public static final dvm<dwa> e = dve.Y;
   public static final dvm<dwa> f = dve.Z;
   public static final dvf g = dve.C;
   private final Map<duo, ezm> h;
   private final Map<duo, ezm> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final ezm G = dhj.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ezm H = dhj.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final ezm I = dhj.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final ezm J = dhj.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ezm K = dhj.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dqi> a() {
      return a;
   }

   public dqi(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)).b(d, dwa.a).b(c, dwa.a).b(e, dwa.a).b(f, dwa.a).b(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static ezm a(ezm $$0, dwa $$1, ezm $$2, ezm $$3) {
      if ($$1 == dwa.c) {
         return ezj.a($$0, $$3);
      } else {
         return $$1 == dwa.b ? ezj.a($$0, $$2) : $$0;
      }
   }

   private Map<duo, ezm> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      ezm $$10 = dhj.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      ezm $$11 = dhj.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      ezm $$12 = dhj.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      ezm $$13 = dhj.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      ezm $$14 = dhj.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      ezm $$15 = dhj.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      ezm $$16 = dhj.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      ezm $$17 = dhj.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      ezm $$18 = dhj.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<duo, ezm> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dwa $$21 : c.a()) {
            for (dwa $$22 : d.a()) {
               for (dwa $$23 : f.a()) {
                  for (dwa $$24 : e.a()) {
                     ezm $$25 = ezj.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = ezj.a($$25, $$10);
                     }

                     duo $$26 = this.o().b(b, $$20).b(c, $$21).b(f, $$23).b(d, $$22).b(e, $$24);
                     $$19.put($$26.b(g, Boolean.valueOf(false)), $$25);
                     $$19.put($$26.b(g, Boolean.valueOf(true)), $$25);
                  }
               }
            }
         }
      }

      return $$19.build();
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return this.h.get($$0);
   }

   @Override
   protected ezm b(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }

   private boolean a(duo $$0, boolean $$1, jj $$2) {
      dhj $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dki && dki.a($$0, $$2);
      return $$0.a(awt.M) || !k($$0) && $$1 || $$3 instanceof dlk || $$4;
   }

   @Override
   public duo a(czk $$0) {
      dej $$1 = $$0.q();
      je $$2 = $$0.a();
      eqp $$3 = $$0.q().b_($$0.a());
      je $$4 = $$2.f();
      je $$5 = $$2.i();
      je $$6 = $$2.g();
      je $$7 = $$2.h();
      je $$8 = $$2.d();
      duo $$9 = $$1.a_($$4);
      duo $$10 = $$1.a_($$5);
      duo $$11 = $$1.a_($$6);
      duo $$12 = $$1.a_($$7);
      duo $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.c($$1, $$4, jj.d), jj.d);
      boolean $$15 = this.a($$10, $$10.c($$1, $$5, jj.e), jj.e);
      boolean $$16 = this.a($$11, $$11.c($$1, $$6, jj.c), jj.c);
      boolean $$17 = this.a($$12, $$12.c($$1, $$7, jj.f), jj.f);
      duo $$18 = this.o().b(g, Boolean.valueOf($$3.a() == eqq.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      if ($$1 == jj.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == jj.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(duo $$0, dvr<dwa> $$1) {
      return $$0.c($$1) != dwa.a;
   }

   private static boolean a(ezm $$0, ezm $$1) {
      return !ezj.c($$1, $$0, eyw.e);
   }

   private duo a(dej $$0, duo $$1, je $$2, duo $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private duo a(dej $$0, je $$1, duo $$2, je $$3, duo $$4, jj $$5) {
      jj $$6 = $$5.g();
      boolean $$7 = $$5 == jj.c ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == jj.f ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == jj.d ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == jj.e ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, f);
      je $$11 = $$1.d();
      duo $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private duo a(dej $$0, duo $$1, je $$2, duo $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      ezm $$8 = $$3.g($$0, $$2).a(jj.a);
      duo $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.b(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(duo $$0, duo $$1, ezm $$2) {
      boolean $$3 = $$1.b() instanceof dqi && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dwa $$4 = $$0.c(d);
         dwa $$5 = $$0.c(e);
         dwa $$6 = $$0.c(c);
         dwa $$7 = $$0.c(f);
         boolean $$8 = $$5 == dwa.a;
         boolean $$9 = $$7 == dwa.a;
         boolean $$10 = $$6 == dwa.a;
         boolean $$11 = $$4 == dwa.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dwa.c && $$5 == dwa.c || $$6 == dwa.c && $$7 == dwa.c;
            return $$13 ? false : $$1.a(awt.aP) || a($$2, G);
         }
      }
   }

   private duo a(duo $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, ezm $$5) {
      return $$0.b(d, this.a($$1, $$5, H)).b(c, this.a($$2, $$5, K)).b(e, this.a($$3, $$5, I)).b(f, this.a($$4, $$5, J));
   }

   private dwa a(boolean $$0, ezm $$1, ezm $$2) {
      if ($$0) {
         return a($$1, $$2) ? dwa.c : dwa.b;
      } else {
         return dwa.a;
      }
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(g) ? eqq.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(duo $$0) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
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
   protected duo a(duo $$0, dmg $$1) {
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
