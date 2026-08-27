import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dmw extends ddy implements dkz {
   public static final MapCodec<dmw> a = b(dmw::new);
   public static final drs b = drr.J;
   public static final drz<dsn> c = drr.W;
   public static final drz<dsn> d = drr.X;
   public static final drz<dsn> e = drr.Y;
   public static final drz<dsn> f = drr.Z;
   public static final drs g = drr.C;
   private final Map<drb, evd> h;
   private final Map<drb, evd> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final evd F = ddy.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final evd G = ddy.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final evd H = ddy.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final evd I = ddy.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final evd J = ddy.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dmw> a() {
      return a;
   }

   public dmw(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)).a(d, dsn.a).a(c, dsn.a).a(e, dsn.a).a(f, dsn.a).a(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static evd a(evd $$0, dsn $$1, evd $$2, evd $$3) {
      if ($$1 == dsn.c) {
         return eva.a($$0, $$3);
      } else {
         return $$1 == dsn.b ? eva.a($$0, $$2) : $$0;
      }
   }

   private Map<drb, evd> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      evd $$10 = ddy.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      evd $$11 = ddy.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      evd $$12 = ddy.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      evd $$13 = ddy.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      evd $$14 = ddy.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      evd $$15 = ddy.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      evd $$16 = ddy.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      evd $$17 = ddy.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      evd $$18 = ddy.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<drb, evd> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dsn $$21 : c.a()) {
            for (dsn $$22 : d.a()) {
               for (dsn $$23 : f.a()) {
                  for (dsn $$24 : e.a()) {
                     evd $$25 = eva.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = eva.a($$25, $$10);
                     }

                     drb $$26 = this.n().a(b, $$20).a(c, $$21).a(f, $$23).a(d, $$22).a(e, $$24);
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
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return this.h.get($$0);
   }

   @Override
   protected evd b(drb $$0, dad $$1, io $$2, eup $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }

   private boolean a(drb $$0, boolean $$1, it $$2) {
      ddy $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dgx && dgx.a($$0, $$2);
      return $$0.a(avw.L) || !j($$0) && $$1 || $$3 instanceof dhz || $$4;
   }

   @Override
   public drb a(cwz $$0) {
      dba $$1 = $$0.q();
      io $$2 = $$0.a();
      emu $$3 = $$0.q().b_($$0.a());
      io $$4 = $$2.e();
      io $$5 = $$2.h();
      io $$6 = $$2.f();
      io $$7 = $$2.g();
      io $$8 = $$2.c();
      drb $$9 = $$1.a_($$4);
      drb $$10 = $$1.a_($$5);
      drb $$11 = $$1.a_($$6);
      drb $$12 = $$1.a_($$7);
      drb $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, it.d), it.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, it.e), it.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, it.c), it.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, it.f), it.f);
      drb $$18 = this.n().a(g, Boolean.valueOf($$3.a() == emv.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      if ($$1 == it.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == it.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(drb $$0, dse<dsn> $$1) {
      return $$0.c($$1) != dsn.a;
   }

   private static boolean a(evd $$0, evd $$1) {
      return !eva.c($$1, $$0, euo.e);
   }

   private drb a(dba $$0, drb $$1, io $$2, drb $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private drb a(dba $$0, io $$1, drb $$2, io $$3, drb $$4, it $$5) {
      it $$6 = $$5.g();
      boolean $$7 = $$5 == it.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == it.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == it.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == it.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, f);
      io $$11 = $$1.c();
      drb $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private drb a(dba $$0, drb $$1, io $$2, drb $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      evd $$8 = $$3.k($$0, $$2).a(it.a);
      drb $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(drb $$0, drb $$1, evd $$2) {
      boolean $$3 = $$1.b() instanceof dmw && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dsn $$4 = $$0.c(d);
         dsn $$5 = $$0.c(e);
         dsn $$6 = $$0.c(c);
         dsn $$7 = $$0.c(f);
         boolean $$8 = $$5 == dsn.a;
         boolean $$9 = $$7 == dsn.a;
         boolean $$10 = $$6 == dsn.a;
         boolean $$11 = $$4 == dsn.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dsn.c && $$5 == dsn.c || $$6 == dsn.c && $$7 == dsn.c;
            return $$13 ? false : $$1.a(avw.aO) || a($$2, F);
         }
      }
   }

   private drb a(drb $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, evd $$5) {
      return $$0.a(d, this.a($$1, $$5, G)).a(c, this.a($$2, $$5, J)).a(e, this.a($$3, $$5, H)).a(f, this.a($$4, $$5, I));
   }

   private dsn a(boolean $$0, evd $$1, evd $$2) {
      if ($$0) {
         return a($$1, $$2) ? dsn.c : dsn.b;
      } else {
         return dsn.a;
      }
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(g) ? emv.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a_(drb $$0, dad $$1, io $$2) {
      return !$$0.c(g);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
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
   protected drb a(drb $$0, div $$1) {
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
