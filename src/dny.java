import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dny extends dfa implements dmb {
   public static final MapCodec<dny> a = b(dny::new);
   public static final dsu b = dst.J;
   public static final dtb<dtp> c = dst.W;
   public static final dtb<dtp> d = dst.X;
   public static final dtb<dtp> e = dst.Y;
   public static final dtb<dtp> f = dst.Z;
   public static final dsu g = dst.C;
   private final Map<dsd, ewl> h;
   private final Map<dsd, ewl> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final ewl F = dfa.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ewl G = dfa.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final ewl H = dfa.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final ewl I = dfa.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ewl J = dfa.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dny> a() {
      return a;
   }

   public dny(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)).a(d, dtp.a).a(c, dtp.a).a(e, dtp.a).a(f, dtp.a).a(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static ewl a(ewl $$0, dtp $$1, ewl $$2, ewl $$3) {
      if ($$1 == dtp.c) {
         return ewi.a($$0, $$3);
      } else {
         return $$1 == dtp.b ? ewi.a($$0, $$2) : $$0;
      }
   }

   private Map<dsd, ewl> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      ewl $$10 = dfa.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      ewl $$11 = dfa.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      ewl $$12 = dfa.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      ewl $$13 = dfa.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      ewl $$14 = dfa.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      ewl $$15 = dfa.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      ewl $$16 = dfa.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      ewl $$17 = dfa.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      ewl $$18 = dfa.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dsd, ewl> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dtp $$21 : c.a()) {
            for (dtp $$22 : d.a()) {
               for (dtp $$23 : f.a()) {
                  for (dtp $$24 : e.a()) {
                     ewl $$25 = ewi.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = ewi.a($$25, $$10);
                     }

                     dsd $$26 = this.o().a(b, $$20).a(c, $$21).a(f, $$23).a(d, $$22).a(e, $$24);
                     $$19.put($$26.a(g, Boolean.valueOf(false)), $$25);
                     $$19.put($$26.a(g, Boolean.valueOf(true)), $$25);
                  }
               }
            }
         }
      }

      return $$19.build();
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return this.h.get($$0);
   }

   @Override
   protected ewl b(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }

   private boolean a(dsd $$0, boolean $$1, je $$2) {
      dfa $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dhz && dhz.a($$0, $$2);
      return $$0.a(awp.L) || !j($$0) && $$1 || $$3 instanceof djb || $$4;
   }

   @Override
   public dsd a(cyb $$0) {
      dcc $$1 = $$0.q();
      iz $$2 = $$0.a();
      enw $$3 = $$0.q().b_($$0.a());
      iz $$4 = $$2.e();
      iz $$5 = $$2.h();
      iz $$6 = $$2.f();
      iz $$7 = $$2.g();
      iz $$8 = $$2.c();
      dsd $$9 = $$1.a_($$4);
      dsd $$10 = $$1.a_($$5);
      dsd $$11 = $$1.a_($$6);
      dsd $$12 = $$1.a_($$7);
      dsd $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, je.d), je.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, je.e), je.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, je.c), je.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, je.f), je.f);
      dsd $$18 = this.o().a(g, Boolean.valueOf($$3.a() == enx.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      if ($$1 == je.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == je.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dsd $$0, dtg<dtp> $$1) {
      return $$0.c($$1) != dtp.a;
   }

   private static boolean a(ewl $$0, ewl $$1) {
      return !ewi.c($$1, $$0, evw.e);
   }

   private dsd a(dcc $$0, dsd $$1, iz $$2, dsd $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dsd a(dcc $$0, iz $$1, dsd $$2, iz $$3, dsd $$4, je $$5) {
      je $$6 = $$5.g();
      boolean $$7 = $$5 == je.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == je.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == je.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == je.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, f);
      iz $$11 = $$1.c();
      dsd $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dsd a(dcc $$0, dsd $$1, iz $$2, dsd $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      ewl $$8 = $$3.k($$0, $$2).a(je.a);
      dsd $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dsd $$0, dsd $$1, ewl $$2) {
      boolean $$3 = $$1.b() instanceof dny && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dtp $$4 = $$0.c(d);
         dtp $$5 = $$0.c(e);
         dtp $$6 = $$0.c(c);
         dtp $$7 = $$0.c(f);
         boolean $$8 = $$5 == dtp.a;
         boolean $$9 = $$7 == dtp.a;
         boolean $$10 = $$6 == dtp.a;
         boolean $$11 = $$4 == dtp.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dtp.c && $$5 == dtp.c || $$6 == dtp.c && $$7 == dtp.c;
            return $$13 ? false : $$1.a(awp.aO) || a($$2, F);
         }
      }
   }

   private dsd a(dsd $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, ewl $$5) {
      return $$0.a(d, this.a($$1, $$5, G)).a(c, this.a($$2, $$5, J)).a(e, this.a($$3, $$5, H)).a(f, this.a($$4, $$5, I));
   }

   private dtp a(boolean $$0, ewl $$1, ewl $$2) {
      if ($$0) {
         return a($$1, $$2) ? dtp.c : dtp.b;
      } else {
         return dtp.a;
      }
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(g) ? enx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a_(dsd $$0, dbf $$1, iz $$2) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      switch ($$1) {
         case c:
            return $$0.a(d, $$0.c(e)).a(c, $$0.c(f)).a(e, $$0.c(d)).a(f, $$0.c(c));
         case d:
            return $$0.a(d, $$0.c(c)).a(c, $$0.c(e)).a(e, $$0.c(f)).a(f, $$0.c(d));
         case b:
            return $$0.a(d, $$0.c(f)).a(c, $$0.c(d)).a(e, $$0.c(c)).a(f, $$0.c(e));
         default:
            return $$0;
      }
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      switch ($$1) {
         case b:
            return $$0.a(d, $$0.c(e)).a(e, $$0.c(d));
         case c:
            return $$0.a(c, $$0.c(f)).a(f, $$0.c(c));
         default:
            return super.a($$0, $$1);
      }
   }
}
