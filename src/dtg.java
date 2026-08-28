import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dtg extends dkd implements drj {
   public static final MapCodec<dtg> a = b(dtg::new);
   public static final dyf b = dye.M;
   public static final dyl<dyz> c = dye.Z;
   public static final dyl<dyz> d = dye.aa;
   public static final dyl<dyz> e = dye.ab;
   public static final dyl<dyz> f = dye.ac;
   public static final dyf g = dye.J;
   private final Map<dxo, fcl> h;
   private final Map<dxo, fcl> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final fcl G = dkd.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final fcl H = dkd.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final fcl I = dkd.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final fcl J = dkd.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final fcl K = dkd.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dtg> a() {
      return a;
   }

   public dtg(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)).b(d, dyz.a).b(c, dyz.a).b(e, dyz.a).b(f, dyz.a).b(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static fcl a(fcl $$0, dyz $$1, fcl $$2, fcl $$3) {
      if ($$1 == dyz.c) {
         return fci.a($$0, $$3);
      } else {
         return $$1 == dyz.b ? fci.a($$0, $$2) : $$0;
      }
   }

   private Map<dxo, fcl> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      fcl $$10 = dkd.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      fcl $$11 = dkd.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      fcl $$12 = dkd.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      fcl $$13 = dkd.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      fcl $$14 = dkd.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      fcl $$15 = dkd.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      fcl $$16 = dkd.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      fcl $$17 = dkd.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      fcl $$18 = dkd.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dxo, fcl> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dyz $$21 : c.a()) {
            for (dyz $$22 : d.a()) {
               for (dyz $$23 : f.a()) {
                  for (dyz $$24 : e.a()) {
                     fcl $$25 = fci.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = fci.a($$25, $$10);
                     }

                     dxo $$26 = this.m().b(b, $$20).b(c, $$21).b(f, $$23).b(d, $$22).b(e, $$24);
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
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return this.h.get($$0);
   }

   @Override
   protected fcl b(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }

   private boolean a(dxo $$0, boolean $$1, jm $$2) {
      dkd $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dnd && dnd.a($$0, $$2);
      return $$0.a(axk.N) || !k($$0) && $$1 || $$3 instanceof dog || $$4;
   }

   @Override
   public dxo a(dax $$0) {
      dhc $$1 = $$0.q();
      jh $$2 = $$0.a();
      etq $$3 = $$0.q().b_($$0.a());
      jh $$4 = $$2.f();
      jh $$5 = $$2.i();
      jh $$6 = $$2.g();
      jh $$7 = $$2.h();
      jh $$8 = $$2.d();
      dxo $$9 = $$1.a_($$4);
      dxo $$10 = $$1.a_($$5);
      dxo $$11 = $$1.a_($$6);
      dxo $$12 = $$1.a_($$7);
      dxo $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.c($$1, $$4, jm.d), jm.d);
      boolean $$15 = this.a($$10, $$10.c($$1, $$5, jm.e), jm.e);
      boolean $$16 = this.a($$11, $$11.c($$1, $$6, jm.c), jm.c);
      boolean $$17 = this.a($$12, $$12.c($$1, $$7, jm.f), jm.f);
      dxo $$18 = this.m().b(g, Boolean.valueOf($$3.a() == etr.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$0.c(g)) {
         $$2.a($$3, etr.c, etr.c.a($$1));
      }

      if ($$4 == jm.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$4 == jm.b ? this.a($$1, $$0, $$5, $$6) : this.a($$1, $$3, $$0, $$5, $$6, $$4);
      }
   }

   private static boolean a(dxo $$0, dyq<dyz> $$1) {
      return $$0.c($$1) != dyz.a;
   }

   private static boolean a(fcl $$0, fcl $$1) {
      return !fci.c($$1, $$0, fbv.e);
   }

   private dxo a(dhc $$0, dxo $$1, jh $$2, dxo $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dxo a(dhc $$0, jh $$1, dxo $$2, jh $$3, dxo $$4, jm $$5) {
      jm $$6 = $$5.g();
      boolean $$7 = $$5 == jm.c ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == jm.f ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == jm.d ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == jm.e ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, f);
      jh $$11 = $$1.d();
      dxo $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dxo a(dhc $$0, dxo $$1, jh $$2, dxo $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      fcl $$8 = $$3.g($$0, $$2).a(jm.a);
      dxo $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.b(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dxo $$0, dxo $$1, fcl $$2) {
      boolean $$3 = $$1.b() instanceof dtg && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dyz $$4 = $$0.c(d);
         dyz $$5 = $$0.c(e);
         dyz $$6 = $$0.c(c);
         dyz $$7 = $$0.c(f);
         boolean $$8 = $$5 == dyz.a;
         boolean $$9 = $$7 == dyz.a;
         boolean $$10 = $$6 == dyz.a;
         boolean $$11 = $$4 == dyz.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dyz.c && $$5 == dyz.c || $$6 == dyz.c && $$7 == dyz.c;
            return $$13 ? false : $$1.a(axk.aR) || a($$2, G);
         }
      }
   }

   private dxo a(dxo $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, fcl $$5) {
      return $$0.b(d, this.a($$1, $$5, H)).b(c, this.a($$2, $$5, K)).b(e, this.a($$3, $$5, I)).b(f, this.a($$4, $$5, J));
   }

   private dyz a(boolean $$0, fcl $$1, fcl $$2) {
      if ($$0) {
         return a($$1, $$2) ? dyz.c : dyz.b;
      } else {
         return dyz.a;
      }
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(g) ? etr.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(dxo $$0) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
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
   protected dxo a(dxo $$0, dpc $$1) {
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
