import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dnv extends dex implements dly {
   public static final MapCodec<dnv> a = b(dnv::new);
   public static final dsr b = dsq.J;
   public static final dsy<dtm> c = dsq.W;
   public static final dsy<dtm> d = dsq.X;
   public static final dsy<dtm> e = dsq.Y;
   public static final dsy<dtm> f = dsq.Z;
   public static final dsr g = dsq.C;
   private final Map<dsa, ewi> h;
   private final Map<dsa, ewi> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final ewi F = dex.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ewi G = dex.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final ewi H = dex.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final ewi I = dex.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ewi J = dex.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dnv> a() {
      return a;
   }

   public dnv(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)).a(d, dtm.a).a(c, dtm.a).a(e, dtm.a).a(f, dtm.a).a(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static ewi a(ewi $$0, dtm $$1, ewi $$2, ewi $$3) {
      if ($$1 == dtm.c) {
         return ewf.a($$0, $$3);
      } else {
         return $$1 == dtm.b ? ewf.a($$0, $$2) : $$0;
      }
   }

   private Map<dsa, ewi> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      ewi $$10 = dex.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      ewi $$11 = dex.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      ewi $$12 = dex.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      ewi $$13 = dex.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      ewi $$14 = dex.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      ewi $$15 = dex.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      ewi $$16 = dex.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      ewi $$17 = dex.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      ewi $$18 = dex.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dsa, ewi> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dtm $$21 : c.a()) {
            for (dtm $$22 : d.a()) {
               for (dtm $$23 : f.a()) {
                  for (dtm $$24 : e.a()) {
                     ewi $$25 = ewf.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = ewf.a($$25, $$10);
                     }

                     dsa $$26 = this.o().a(b, $$20).a(c, $$21).a(f, $$23).a(d, $$22).a(e, $$24);
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
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return this.h.get($$0);
   }

   @Override
   protected ewi b(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }

   private boolean a(dsa $$0, boolean $$1, je $$2) {
      dex $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dhw && dhw.a($$0, $$2);
      return $$0.a(awo.L) || !j($$0) && $$1 || $$3 instanceof diy || $$4;
   }

   @Override
   public dsa a(cxy $$0) {
      dbz $$1 = $$0.q();
      iz $$2 = $$0.a();
      ent $$3 = $$0.q().b_($$0.a());
      iz $$4 = $$2.e();
      iz $$5 = $$2.h();
      iz $$6 = $$2.f();
      iz $$7 = $$2.g();
      iz $$8 = $$2.c();
      dsa $$9 = $$1.a_($$4);
      dsa $$10 = $$1.a_($$5);
      dsa $$11 = $$1.a_($$6);
      dsa $$12 = $$1.a_($$7);
      dsa $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, je.d), je.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, je.e), je.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, je.c), je.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, je.f), je.f);
      dsa $$18 = this.o().a(g, Boolean.valueOf($$3.a() == enu.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      if ($$1 == je.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == je.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dsa $$0, dtd<dtm> $$1) {
      return $$0.c($$1) != dtm.a;
   }

   private static boolean a(ewi $$0, ewi $$1) {
      return !ewf.c($$1, $$0, evt.e);
   }

   private dsa a(dbz $$0, dsa $$1, iz $$2, dsa $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dsa a(dbz $$0, iz $$1, dsa $$2, iz $$3, dsa $$4, je $$5) {
      je $$6 = $$5.g();
      boolean $$7 = $$5 == je.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == je.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == je.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == je.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, f);
      iz $$11 = $$1.c();
      dsa $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dsa a(dbz $$0, dsa $$1, iz $$2, dsa $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      ewi $$8 = $$3.k($$0, $$2).a(je.a);
      dsa $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dsa $$0, dsa $$1, ewi $$2) {
      boolean $$3 = $$1.b() instanceof dnv && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dtm $$4 = $$0.c(d);
         dtm $$5 = $$0.c(e);
         dtm $$6 = $$0.c(c);
         dtm $$7 = $$0.c(f);
         boolean $$8 = $$5 == dtm.a;
         boolean $$9 = $$7 == dtm.a;
         boolean $$10 = $$6 == dtm.a;
         boolean $$11 = $$4 == dtm.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dtm.c && $$5 == dtm.c || $$6 == dtm.c && $$7 == dtm.c;
            return $$13 ? false : $$1.a(awo.aO) || a($$2, F);
         }
      }
   }

   private dsa a(dsa $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, ewi $$5) {
      return $$0.a(d, this.a($$1, $$5, G)).a(c, this.a($$2, $$5, J)).a(e, this.a($$3, $$5, H)).a(f, this.a($$4, $$5, I));
   }

   private dtm a(boolean $$0, ewi $$1, ewi $$2) {
      if ($$0) {
         return a($$1, $$2) ? dtm.c : dtm.b;
      } else {
         return dtm.a;
      }
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(g) ? enu.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a_(dsa $$0, dbc $$1, iz $$2) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
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
   protected dsa a(dsa $$0, dju $$1) {
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
