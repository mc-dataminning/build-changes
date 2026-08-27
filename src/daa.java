import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class daa extends cua {
   public static final MapCodec<daa> a = b(daa::new);
   public static final dgz<dhg> b = dgr.ab;
   public static final dgz<dhg> c = dgr.aa;
   public static final dgz<dhg> d = dgr.ac;
   public static final dgz<dhg> e = dgr.ad;
   public static final dhb f = dgr.aT;
   public static final Map<hx, dgz<dhg>> g = Maps.newEnumMap(ImmutableMap.of(hx.c, b, hx.f, c, hx.d, d, hx.e, e));
   protected static final int h = 1;
   protected static final int i = 3;
   protected static final int j = 13;
   protected static final int k = 3;
   protected static final int l = 13;
   private static final eiy m = cua.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<hx, eiy> n = Maps.newEnumMap(
      ImmutableMap.of(
         hx.c,
         cua.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         hx.d,
         cua.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         hx.f,
         cua.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         hx.e,
         cua.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<hx, eiy> o = Maps.newEnumMap(
      ImmutableMap.of(
         hx.c,
         eiv.a(n.get(hx.c), cua.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         hx.d,
         eiv.a(n.get(hx.d), cua.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         hx.f,
         eiv.a(n.get(hx.f), cua.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         hx.e,
         eiv.a(n.get(hx.e), cua.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<dgb, eiy> F = Maps.newHashMap();
   private static final eif[] G = ac.a(new eif[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = asy.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = asy.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = new eif((double)$$3, (double)$$4, (double)$$5);
      }
   });
   private static final float H = 0.2F;
   private final dgb I;
   private boolean J = true;

   @Override
   public MapCodec<daa> a() {
      return a;
   }

   public daa(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dhg.c).a(c, dhg.c).a(d, dhg.c).a(e, dhg.c).a(f, Integer.valueOf(0)));
      this.I = this.o().a(b, dhg.b).a(c, dhg.b).a(d, dhg.b).a(e, dhg.b);
      UnmodifiableIterator var2 = this.n().a().iterator();

      while (var2.hasNext()) {
         dgb $$1 = (dgb)var2.next();
         if ($$1.c(f) == 0) {
            F.put($$1, this.n($$1));
         }
      }
   }

   private eiy n(dgb $$0) {
      eiy $$1 = m;

      for (hx $$2 : hx.c.a) {
         dhg $$3 = $$0.c(g.get($$2));
         if ($$3 == dhg.b) {
            $$1 = eiv.a($$1, n.get($$2));
         } else if ($$3 == dhg.a) {
            $$1 = eiv.a($$1, o.get($$2));
         }
      }

      return $$1;
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return F.get($$0.a(f, Integer.valueOf(0)));
   }

   @Override
   public dgb a(cmr $$0) {
      return this.a($$0.q(), this.I, $$0.a());
   }

   private dgb a(cqf $$0, dgb $$1, ht $$2) {
      boolean $$3 = p($$1);
      $$1 = this.b($$0, this.o().a(f, $$1.c(f)), $$2);
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
            $$1 = $$1.a(e, dhg.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.a(c, dhg.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.a(b, dhg.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.a(d, dhg.b);
         }

         return $$1;
      }
   }

   private dgb b(cqf $$0, dgb $$1, ht $$2) {
      boolean $$3 = !$$0.a_($$2.c()).g($$0, $$2);

      for (hx $$4 : hx.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            dhg $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.a(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$1 == hx.a) {
         return !this.a($$3, $$5, $$2) ? cuc.a.o() : $$0;
      } else if ($$1 == hx.b) {
         return this.a($$3, $$0, $$4);
      } else {
         dhg $$6 = this.a($$3, $$4, $$1);
         return $$6.a() == $$0.c(g.get($$1)).a() && !o($$0) ? $$0.a(g.get($$1), $$6) : this.a($$3, this.I.a(f, $$0.c(f)).a(g.get($$1), $$6), $$4);
      }
   }

   private static boolean o(dgb $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean p(dgb $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   public void a(dgb $$0, cra $$1, ht $$2, int $$3, int $$4) {
      ht.a $$5 = new ht.a();

      for (hx $$6 : hx.c.a) {
         dhg $$7 = $$0.c(g.get($$6));
         if ($$7 != dhg.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(hx.a);
            dgb $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               ht $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$9), $$5, $$9, $$3, $$4);
            }

            $$5.a($$2, $$6).c(hx.b);
            dgb $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               ht $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$11), $$5, $$11, $$3, $$4);
            }
         }
      }
   }

   private dhg a(cqf $$0, ht $$1, hx $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.c()).g($$0, $$1));
   }

   private dhg a(cqf $$0, ht $$1, hx $$2, boolean $$3) {
      ht $$4 = $$1.a($$2);
      dgb $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dck || this.a($$0, $$4, $$5);
         if ($$6 && h($$0.a_($$4.c()))) {
            if ($$5.d($$0, $$4, $$2.g())) {
               return dhg.a;
            }

            return dhg.b;
         }
      }

      return !a($$5, $$2) && ($$5.g($$0, $$4) || !h($$0.a_($$4.d()))) ? dhg.c : dhg.b;
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      ht $$3 = $$2.d();
      dgb $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(cqf $$0, ht $$1, dgb $$2) {
      return $$2.d($$0, $$1, hx.b) || $$2.a(cuc.hc);
   }

   private void a(cqz $$0, ht $$1, dgb $$2) {
      int $$3 = this.a($$0, $$1);
      if ($$2.c(f) != $$3) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.a(f, Integer.valueOf($$3)), 2);
         }

         Set<ht> $$4 = Sets.newHashSet();
         $$4.add($$1);

         for (hx $$5 : hx.values()) {
            $$4.add($$1.a($$5));
         }

         for (ht $$6 : $$4) {
            $$0.a($$6, this);
         }
      }
   }

   private int a(cqz $$0, ht $$1) {
      this.J = false;
      int $$2 = $$0.C($$1);
      this.J = true;
      int $$3 = 0;
      if ($$2 < 15) {
         for (hx $$4 : hx.c.a) {
            ht $$5 = $$1.a($$4);
            dgb $$6 = $$0.a_($$5);
            $$3 = Math.max($$3, this.q($$6));
            ht $$7 = $$1.c();
            if ($$6.g($$0, $$5) && !$$0.a_($$7).g($$0, $$7)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.c())));
            } else if (!$$6.g($$0, $$5)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.d())));
            }
         }
      }

      return Math.max($$2, $$3 - 1);
   }

   private int q(dgb $$0) {
      return $$0.a(this) ? $$0.c(f) : 0;
   }

   private void b(cqz $$0, ht $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (hx $$2 : hx.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   public void b(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.B) {
         this.a($$1, $$2, $$0);

         for (hx $$5 : hx.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (!$$1.B) {
            for (hx $$5 : hx.values()) {
               $$1.a($$2.a($$5), this);
            }

            this.a($$1, $$2, $$0);
            this.c($$1, $$2);
         }
      }
   }

   private void c(cqz $$0, ht $$1) {
      for (hx $$2 : hx.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (hx $$3 : hx.c.a) {
         ht $$4 = $$1.a($$3);
         if ($$0.a_($$4).g($$0, $$4)) {
            this.b($$0, $$4.c());
         } else {
            this.b($$0, $$4.d());
         }
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, cua $$3, ht $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$0.a((crc)$$1, $$2)) {
            this.a($$1, $$2, $$0);
         } else {
            c($$0, $$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   public int b(dgb $$0, cqf $$1, ht $$2, hx $$3) {
      return !this.J ? 0 : $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(dgb $$0, cqf $$1, ht $$2, hx $$3) {
      if (this.J && $$3 != hx.a) {
         int $$4 = $$0.c(f);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != hx.b && !this.a($$1, $$0, $$2).c(g.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean h(dgb $$0) {
      return a($$0, null);
   }

   protected static boolean a(dgb $$0, @Nullable hx $$1) {
      if ($$0.a(cuc.cw)) {
         return true;
      } else if ($$0.a(cuc.eh)) {
         hx $$2 = $$0.c(daf.aE);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(cuc.kO) ? $$1 == $$0.c(czj.a) : $$0.m() && $$1 != null;
      }
   }

   @Override
   public boolean f_(dgb $$0) {
      return this.J;
   }

   public static int b(int $$0) {
      eif $$1 = G[$$0];
      return asy.f((float)$$1.a(), (float)$$1.b(), (float)$$1.c());
   }

   private void a(cqz $$0, ate $$1, ht $$2, eif $$3, hx $$4, hx $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new jm($$3.j(), 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, ate $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (hx $$5 : hx.c.a) {
            dhg $$6 = $$0.c(g.get($$5));
            switch ($$6) {
               case a:
                  this.a($$1, $$3, $$2, G[$$4], $$5, hx.b, -0.5F, 0.5F);
               case b:
                  this.a($$1, $$3, $$2, G[$$4], hx.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  this.a($$1, $$3, $$2, G[$$4], hx.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
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
   public dgb a(dgb $$0, cyv $$1) {
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
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if (!$$3.fT().e) {
         return bib.d;
      } else {
         if (o($$0) || p($$0)) {
            dgb $$6 = o($$0) ? this.o() : this.I;
            $$6 = $$6.a(f, $$0.c(f));
            $$6 = this.a($$1, $$6, $$2);
            if ($$6 != $$0) {
               $$1.a($$2, $$6, 3);
               this.a($$1, $$2, $$0, $$6);
               return bib.a;
            }
         }

         return bib.d;
      }
   }

   private void a(cqz $$0, ht $$1, dgb $$2, dgb $$3) {
      for (hx $$4 : hx.c.a) {
         ht $$5 = $$1.a($$4);
         if ($$2.c(g.get($$4)).a() != $$3.c(g.get($$4)).a() && $$0.a_($$5).g($$0, $$5)) {
            $$0.a($$5, $$3.b(), $$4.g());
         }
      }
   }
}
