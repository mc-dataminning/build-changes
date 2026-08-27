import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class dls extends dfc {
   public static final MapCodec<dls> a = b(dls::new);
   public static final dua<duh> b = dts.ab;
   public static final dua<duh> c = dts.aa;
   public static final dua<duh> d = dts.ac;
   public static final dua<duh> e = dts.ad;
   public static final duc f = dts.aT;
   public static final Map<iw, dua<duh>> g = Maps.newEnumMap(ImmutableMap.of(iw.c, b, iw.f, c, iw.d, d, iw.e, e));
   protected static final int h = 1;
   protected static final int i = 3;
   protected static final int j = 13;
   protected static final int k = 3;
   protected static final int l = 13;
   private static final exn m = dfc.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<iw, exn> n = Maps.newEnumMap(
      ImmutableMap.of(
         iw.c,
         dfc.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         iw.d,
         dfc.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         iw.f,
         dfc.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         iw.e,
         dfc.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<iw, exn> o = Maps.newEnumMap(
      ImmutableMap.of(
         iw.c,
         exk.a(n.get(iw.c), dfc.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         iw.d,
         exk.a(n.get(iw.d), dfc.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         iw.f,
         exk.a(n.get(iw.f), dfc.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         iw.e,
         exk.a(n.get(iw.e), dfc.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<dtc, exn> F = Maps.newHashMap();
   private static final ewu[] G = ad.a(new ewu[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = aym.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = aym.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = new ewu((double)$$3, (double)$$4, (double)$$5);
      }
   });
   private static final float H = 0.2F;
   private final dtc I;
   private boolean J = true;

   @Override
   public MapCodec<dls> a() {
      return a;
   }

   public dls(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, duh.c).a(c, duh.c).a(d, duh.c).a(e, duh.c).a(f, Integer.valueOf(0)));
      this.I = this.n().a(b, duh.b).a(c, duh.b).a(d, duh.b).a(e, duh.b);
      UnmodifiableIterator var2 = this.l().a().iterator();

      while (var2.hasNext()) {
         dtc $$1 = (dtc)var2.next();
         if ($$1.c(f) == 0) {
            F.put($$1, this.n($$1));
         }
      }
   }

   private exn n(dtc $$0) {
      exn $$1 = m;

      for (iw $$2 : iw.c.a) {
         duh $$3 = $$0.c(g.get($$2));
         if ($$3 == duh.b) {
            $$1 = exk.a($$1, n.get($$2));
         } else if ($$3 == duh.a) {
            $$1 = exk.a($$1, o.get($$2));
         }
      }

      return $$1;
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return F.get($$0.a(f, Integer.valueOf(0)));
   }

   @Override
   public dtc a(cyd $$0) {
      return this.a($$0.q(), this.I, $$0.a());
   }

   private dtc a(dbg $$0, dtc $$1, ir $$2) {
      boolean $$3 = p($$1);
      $$1 = this.b($$0, this.n().a(f, $$1.c(f)), $$2);
      if ($$3 && p($$1)) {
         return $$1;
      } else {
         boolean $$4 = $$1.c(b).a();
         boolean $$5 = $$1.c(d).a();
         boolean $$6 = $$1.c(c).a();
         boolean $$7 = $$1.c(e).a();
         boolean $$8 = !$$4 && !$$5;
         boolean $$9 = !$$6 && !$$7;
         if (!$$7 && $$8) {
            $$1 = $$1.a(e, duh.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.a(c, duh.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.a(b, duh.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.a(d, duh.b);
         }

         return $$1;
      }
   }

   private dtc b(dbg $$0, dtc $$1, ir $$2) {
      boolean $$3 = !$$0.a_($$2.c()).g($$0, $$2);

      for (iw $$4 : iw.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            duh $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.a(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$1 == iw.a) {
         return !this.a($$3, $$5, $$2) ? dfe.a.n() : $$0;
      } else if ($$1 == iw.b) {
         return this.a($$3, $$0, $$4);
      } else {
         duh $$6 = this.a($$3, $$4, $$1);
         return $$6.a() == $$0.c(g.get($$1)).a() && !o($$0) ? $$0.a(g.get($$1), $$6) : this.a($$3, this.I.a(f, $$0.c(f)).a(g.get($$1), $$6), $$4);
      }
   }

   private static boolean o(dtc $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean p(dtc $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   protected void a(dtc $$0, dcb $$1, ir $$2, int $$3, int $$4) {
      ir.a $$5 = new ir.a();

      for (iw $$6 : iw.c.a) {
         duh $$7 = $$0.c(g.get($$6));
         if ($$7 != duh.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.d(iw.a);
            dtc $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               ir $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$9), $$5, $$9, $$3, $$4);
            }

            $$5.a($$2, $$6).d(iw.b);
            dtc $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               ir $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$11), $$5, $$11, $$3, $$4);
            }
         }
      }
   }

   private duh a(dbg $$0, ir $$1, iw $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.c()).g($$0, $$1));
   }

   private duh a(dbg $$0, ir $$1, iw $$2, boolean $$3) {
      ir $$4 = $$1.a($$2);
      dtc $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof doe || this.a($$0, $$4, $$5);
         if ($$6 && m($$0.a_($$4.c()))) {
            if ($$5.d($$0, $$4, $$2.g())) {
               return duh.a;
            }

            return duh.b;
         }
      }

      return !a($$5, $$2) && ($$5.g($$0, $$4) || !m($$0.a_($$4.d()))) ? duh.c : duh.b;
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      ir $$3 = $$2.d();
      dtc $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(dbg $$0, ir $$1, dtc $$2) {
      return $$2.d($$0, $$1, iw.b) || $$2.a(dfe.hW);
   }

   private void a(dca $$0, ir $$1, dtc $$2) {
      int $$3 = this.a($$0, $$1);
      if ($$2.c(f) != $$3) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.a(f, Integer.valueOf($$3)), 2);
         }

         Set<ir> $$4 = Sets.newHashSet();
         $$4.add($$1);

         for (iw $$5 : iw.values()) {
            $$4.add($$1.a($$5));
         }

         for (ir $$6 : $$4) {
            $$0.a($$6, this);
         }
      }
   }

   private int a(dca $$0, ir $$1) {
      this.J = false;
      int $$2 = $$0.D($$1);
      this.J = true;
      int $$3 = 0;
      if ($$2 < 15) {
         for (iw $$4 : iw.c.a) {
            ir $$5 = $$1.a($$4);
            dtc $$6 = $$0.a_($$5);
            $$3 = Math.max($$3, this.q($$6));
            ir $$7 = $$1.c();
            if ($$6.g($$0, $$5) && !$$0.a_($$7).g($$0, $$7)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.c())));
            } else if (!$$6.g($$0, $$5)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.d())));
            }
         }
      }

      return Math.max($$2, $$3 - 1);
   }

   private int q(dtc $$0) {
      return $$0.a(this) ? $$0.c(f) : 0;
   }

   private void b(dca $$0, ir $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (iw $$2 : iw.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   protected void b(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.C) {
         this.a($$1, $$2, $$0);

         for (iw $$5 : iw.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (!$$1.C) {
            for (iw $$5 : iw.values()) {
               $$1.a($$2.a($$5), this);
            }

            this.a($$1, $$2, $$0);
            this.c($$1, $$2);
         }
      }
   }

   private void c(dca $$0, ir $$1) {
      for (iw $$2 : iw.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (iw $$3 : iw.c.a) {
         ir $$4 = $$1.a($$3);
         if ($$0.a_($$4).g($$0, $$4)) {
            this.b($$0, $$4.c());
         } else {
            this.b($$0, $$4.d());
         }
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dfc $$3, ir $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$0.a((dcd)$$1, $$2)) {
            this.a($$1, $$2, $$0);
         } else {
            c($$0, $$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected int b(dtc $$0, dbg $$1, ir $$2, iw $$3) {
      return !this.J ? 0 : $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dtc $$0, dbg $$1, ir $$2, iw $$3) {
      if (this.J && $$3 != iw.a) {
         int $$4 = $$0.c(f);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != iw.b && !this.a($$1, $$0, $$2).c(g.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean m(dtc $$0) {
      return a($$0, null);
   }

   protected static boolean a(dtc $$0, @Nullable iw $$1) {
      if ($$0.a(dfe.dh)) {
         return true;
      } else if ($$0.a(dfe.eZ)) {
         iw $$2 = $$0.c(dlx.aE);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(dfe.lM) ? $$1 == $$0.c(dks.a) : $$0.m() && $$1 != null;
      }
   }

   @Override
   protected boolean e_(dtc $$0) {
      return this.J;
   }

   public static int b(int $$0) {
      ewu $$1 = G[$$0];
      return aym.f((float)$$1.a(), (float)$$1.b(), (float)$$1.c());
   }

   private void a(dca $$0, ayt $$1, ir $$2, ewu $$3, iw $$4, iw $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new kv($$3.j(), 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (iw $$5 : iw.c.a) {
            duh $$6 = $$0.c(g.get($$5));
            switch ($$6) {
               case a:
                  this.a($$1, $$3, $$2, G[$$4], $$5, iw.b, -0.5F, 0.5F);
               case b:
                  this.a($$1, $$3, $$2, G[$$4], iw.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  this.a($$1, $$3, $$2, G[$$4], iw.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      switch ($$1) {
         case c:
            return $$0.a(b, $$0.c(d)).a(c, $$0.c(e)).a(d, $$0.c(b)).a(e, $$0.c(c));
         case d:
            return $$0.a(b, $$0.c(c)).a(c, $$0.c(d)).a(d, $$0.c(e)).a(e, $$0.c(b));
         case b:
            return $$0.a(b, $$0.c(e)).a(c, $$0.c(b)).a(d, $$0.c(c)).a(e, $$0.c(d));
         default:
            return $$0;
      }
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      switch ($$1) {
         case b:
            return $$0.a(b, $$0.c(d)).a(d, $$0.c(b));
         case c:
            return $$0.a(c, $$0.c(e)).a(e, $$0.c(c));
         default:
            return super.a($$0, $$1);
      }
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if (!$$3.gm().e) {
         return bqa.d;
      } else {
         if (o($$0) || p($$0)) {
            dtc $$5 = o($$0) ? this.n() : this.I;
            $$5 = $$5.a(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return bqa.a;
            }
         }

         return bqa.d;
      }
   }

   private void a(dca $$0, ir $$1, dtc $$2, dtc $$3) {
      for (iw $$4 : iw.c.a) {
         ir $$5 = $$1.a($$4);
         if ($$2.c(g.get($$4)).a() != $$3.c(g.get($$4)).a() && $$0.a_($$5).g($$0, $$5)) {
            $$0.a($$5, $$3.b(), $$4.g());
         }
      }
   }
}
