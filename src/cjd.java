import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjd extends cjn implements bte {
   private static final UUID c = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final bue d = new bue(c, "Attacking speed boost", 0.15F, bue.a.a);
   private static final int e = 400;
   private static final int ca = 600;
   private static final ajp<Optional<dsh>> cb = ajt.a(cjd.class, ajr.j);
   private static final ajp<Boolean> cc = ajt.a(cjd.class, ajr.k);
   private static final ajp<Boolean> cd = ajt.a(cjd.class, ajr.k);
   private int ce = Integer.MIN_VALUE;
   private int cf;
   private static final bpo cg = aze.a(20, 39);
   private int ch;
   @Nullable
   private UUID ci;

   public cjd(bsj<? extends cjd> $$0, dcd $$1) {
      super($$0, $$1);
      this.a(eos.j, -1.0F);
   }

   @Override
   protected void z() {
      this.bU.a(0, new bzq(this));
      this.bU.a(1, new cjd.a(this));
      this.bU.a(2, new cag(this, 1.0, false));
      this.bU.a(7, new cbj(this, 1.0, 0.0F));
      this.bU.a(8, new cae(this, cmh.class, 8.0F));
      this.bU.a(8, new car(this));
      this.bU.a(10, new cjd.b(this));
      this.bU.a(11, new cjd.d(this));
      this.bV.a(1, new cjd.c(this, this::a_));
      this.bV.a(2, new cbo(this));
      this.bV.a(3, new cbp<>(this, cje.class, true, false));
      this.bV.a(4, new cbv<>(this, false));
   }

   public static buf.a s() {
      return cjn.gt().a(bug.s, 40.0).a(bug.v, 0.3F).a(bug.c, 7.0).a(bug.m, 64.0).a(bug.B, 1.0);
   }

   @Override
   public void h(@Nullable bsy $$0) {
      super.h($$0);
      buc $$1 = this.f(bug.v);
      if ($$0 == null) {
         this.cf = 0;
         this.ao.a(cc, false);
         this.ao.a(cd, false);
         $$1.b(d.b());
      } else {
         this.cf = this.ai;
         this.ao.a(cc, true);
         if (!$$1.a(d)) {
            $$1.c(d);
         }
      }
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cb, Optional.empty());
      $$0.a(cc, false);
      $$0.a(cd, false);
   }

   @Override
   public void c() {
      this.a(cg.a(this.ah));
   }

   @Override
   public void a(int $$0) {
      this.ch = $$0;
   }

   @Override
   public int a() {
      return this.ch;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ci = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ci;
   }

   public void u() {
      if (this.ai >= this.ce + 400) {
         this.ce = this.ai;
         if (!this.aW()) {
            this.dP().a(this.du(), this.dy(), this.dA(), avf.in, this.de(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(ajp<?> $$0) {
      if (cc.equals($$0) && this.gp() && this.dP().B) {
         this.u();
      }

      super.a($$0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      dsh $$1 = this.gn();
      if ($$1 != null) {
         $$0.a("carriedBlockState", um.a($$1));
      }

      this.c($$0);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      dsh $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = um.a(this.dP().a(lr.f), $$0.p("carriedBlockState"));
         if ($$1.i()) {
            $$1 = null;
         }
      }

      this.c($$1);
      this.a(this.dP(), $$0);
   }

   boolean g(cmh $$0) {
      cua $$1 = $$0.fY().i.get(3);
      if ($$1.a(dfh.ee.r())) {
         return false;
      } else {
         evz $$2 = $$0.g(1.0F).d();
         evz $$3 = new evz(this.du() - $$0.du(), this.dy() - $$0.dy(), this.dA() - $$0.dA());
         double $$4 = $$3.f();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.F(this) : false;
      }
   }

   @Override
   public void n_() {
      if (this.dP().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dP().a(lj.ac, this.d(0.5), this.dx() - 0.25, this.g(0.5), (this.ah.j() - 0.5) * 2.0, -this.ah.j(), (this.ah.j() - 0.5) * 2.0);
         }
      }

      this.bn = false;
      if (!this.dP().B) {
         this.a((aqk)this.dP(), true);
      }

      super.n_();
   }

   @Override
   public boolean fl() {
      return true;
   }

   @Override
   protected void Z() {
      if (this.dP().R() && this.ai >= this.cf + 600) {
         float $$0 = this.bt();
         if ($$0 > 0.5F && this.dP().h(this.dp()) && this.ah.i() * 30.0F < ($$0 - 0.4F) * 2.0F) {
            this.h(null);
            this.y();
         }
      }

      super.Z();
   }

   protected boolean y() {
      if (!this.dP().x_() && this.bD()) {
         double $$0 = this.du() + (this.ah.j() - 0.5) * 64.0;
         double $$1 = this.dw() + (double)(this.ah.a(64) - 32);
         double $$2 = this.dA() + (this.ah.j() - 0.5) * 64.0;
         return this.r($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean b(bsd $$0) {
      evz $$1 = new evz(this.du() - $$0.du(), this.e(0.5) - $$0.dy(), this.dA() - $$0.dA());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.du() + (this.ah.j() - 0.5) * 8.0 - $$1.c * 16.0;
      double $$4 = this.dw() + (double)(this.ah.a(16) - 8) - $$1.d * 16.0;
      double $$5 = this.dA() + (this.ah.j() - 0.5) * 8.0 - $$1.e * 16.0;
      return this.r($$3, $$4, $$5);
   }

   private boolean r(double $$0, double $$1, double $$2) {
      ja.a $$3 = new ja.a($$0, $$1, $$2);

      while ($$3.v() > this.dP().I_() && !this.dP().a_($$3).d()) {
         $$3.c(jf.a);
      }

      dsh $$4 = this.dP().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.u().a(awa.a);
      if ($$5 && !$$6) {
         evz $$7 = this.dn();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dP().a(dxa.R, $$7, dxa.a.a(this));
            if (!this.aW()) {
               this.dP().a(null, this.L, this.M, this.N, avf.io, this.de(), 1.0F, 1.0F);
               this.a(avf.io, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected ave v() {
      return this.go() ? avf.im : avf.ij;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.il;
   }

   @Override
   protected ave o_() {
      return avf.ik;
   }

   @Override
   protected void a(bqw $$0, boolean $$1) {
      super.a($$0, $$1);
      dsh $$2 = this.gn();
      if ($$2 != null) {
         cua $$3 = new cua(cud.pi);
         czl.a($$3, daw.g, this.dP(), this.dp(), this.dS());
         eqr.a $$4 = new eqr.a((aqk)this.dP()).a(etk.f, this.dn()).a(etk.i, $$3).b(etk.a, this);

         for (cua $$6 : $$2.a($$4)) {
            this.b($$6);
         }
      }
   }

   public void c(@Nullable dsh $$0) {
      this.ao.a(cb, Optional.ofNullable($$0));
   }

   @Nullable
   public dsh gn() {
      return this.ao.a(cb).orElse(null);
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cnl;
         if (!$$0.a(avw.k) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dP().x_() && !($$0.d() instanceof bsy) && this.ah.a(10) != 0) {
               this.y();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (cnl)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.y()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bqw $$0, cnl $$1, float $$2) {
      cua $$3 = $$1.p();
      cwb $$4 = $$3.a(kn.G, cwb.a);
      return $$4.a(cwc.a) ? super.a($$0, $$2) : false;
   }

   public boolean go() {
      return this.ao.a(cc);
   }

   public boolean gp() {
      return this.ao.a(cd);
   }

   public void gq() {
      this.ao.a(cd, true);
   }

   @Override
   public boolean W() {
      return super.W() || this.gn() != null;
   }

   static class a extends bzw {
      private final cjd a;
      @Nullable
      private bsy b;

      public a(cjd $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzw.a.c, bzw.a.a));
      }

      @Override
      public boolean a() {
         this.b = this.a.p();
         if (!(this.b instanceof cmh)) {
            return false;
         } else {
            double $$0 = this.b.g(this.a);
            return $$0 > 256.0 ? false : this.a.g((cmh)this.b);
         }
      }

      @Override
      public void c() {
         this.a.K().n();
      }

      @Override
      public void e() {
         this.a.G().a(this.b.du(), this.b.dy(), this.b.dA());
      }
   }

   static class b extends bzw {
      private final cjd a;

      public b(cjd $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gn() == null) {
            return false;
         } else {
            return !this.a.dP().ab().b(dbz.c) ? false : this.a.dS().a(b(2000)) == 0;
         }
      }

      @Override
      public void e() {
         aym $$0 = this.a.dS();
         dcd $$1 = this.a.dP();
         int $$2 = aye.a(this.a.du() - 1.0 + $$0.j() * 2.0);
         int $$3 = aye.a(this.a.dw() + $$0.j() * 2.0);
         int $$4 = aye.a(this.a.dA() - 1.0 + $$0.j() * 2.0);
         ja $$5 = new ja($$2, $$3, $$4);
         dsh $$6 = $$1.a_($$5);
         ja $$7 = $$5.d();
         dsh $$8 = $$1.a_($$7);
         dsh $$9 = this.a.gn();
         if ($$9 != null) {
            $$9 = dff.b($$9, this.a.dP(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(dxa.i, $$5, dxa.a.a(this.a, $$9));
               this.a.c(null);
            }
         }
      }

      private boolean a(dcd $$0, ja $$1, dsh $$2, dsh $$3, dsh $$4, ja $$5) {
         return $$3.i() && !$$4.i() && !$$4.a(dfh.F) && $$4.r($$0, $$5) && $$2.a((dcg)$$0, $$1) && $$0.a_(this.a, evu.a(evz.a($$1))).isEmpty();
      }
   }

   static class c extends cbp<cmh> {
      private final cjd i;
      @Nullable
      private cmh j;
      private int k;
      private int l;
      private final cdp m;
      private final cdp n = cdp.a().d();
      private final Predicate<bsy> o;

      public c(cjd $$0, @Nullable Predicate<bsy> $$1) {
         super($$0, cmh.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.g((cmh)$$1x) || $$0.a_($$1x)) && !$$0.z($$1x);
         this.m = cdp.a().a(this.l()).a(this.o);
      }

      @Override
      public boolean a() {
         this.j = this.i.dP().a(this.m, this.i);
         return this.j != null;
      }

      @Override
      public void c() {
         this.k = this.a(5);
         this.l = 0;
         this.i.gq();
      }

      @Override
      public void d() {
         this.j = null;
         super.d();
      }

      @Override
      public boolean b() {
         if (this.j != null) {
            if (!this.o.test(this.j)) {
               return false;
            } else {
               this.i.a(this.j, 10.0F, 10.0F);
               return true;
            }
         } else {
            if (this.c != null) {
               if (this.i.z(this.c)) {
                  return false;
               }

               if (this.n.a(this.i, this.c)) {
                  return true;
               }
            }

            return super.b();
         }
      }

      @Override
      public void e() {
         if (this.i.p() == null) {
            super.a(null);
         }

         if (this.j != null) {
            if (--this.k <= 0) {
               this.c = this.j;
               this.j = null;
               super.c();
            }
         } else {
            if (this.c != null && !this.i.bR()) {
               if (this.i.g((cmh)this.c)) {
                  if (this.c.g(this.i) < 16.0) {
                     this.i.y();
                  }

                  this.l = 0;
               } else if (this.c.g(this.i) > 256.0 && this.l++ >= this.a(30) && this.i.b(this.c)) {
                  this.l = 0;
               }
            }

            super.e();
         }
      }
   }

   static class d extends bzw {
      private final cjd a;

      public d(cjd $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gn() != null) {
            return false;
         } else {
            return !this.a.dP().ab().b(dbz.c) ? false : this.a.dS().a(b(20)) == 0;
         }
      }

      @Override
      public void e() {
         aym $$0 = this.a.dS();
         dcd $$1 = this.a.dP();
         int $$2 = aye.a(this.a.du() - 2.0 + $$0.j() * 4.0);
         int $$3 = aye.a(this.a.dw() + $$0.j() * 3.0);
         int $$4 = aye.a(this.a.dA() - 2.0 + $$0.j() * 4.0);
         ja $$5 = new ja($$2, $$3, $$4);
         dsh $$6 = $$1.a_($$5);
         evz $$7 = new evz((double)this.a.dt() + 0.5, (double)$$3 + 0.5, (double)this.a.dz() + 0.5);
         evz $$8 = new evz((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         evv $$9 = $$1.a(new dbm($$7, $$8, dbm.a.b, dbm.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(avu.al) && $$10) {
            $$1.a($$5, false);
            $$1.a(dxa.f, $$5, dxa.a.a(this.a, $$6));
            this.a.c($$6.b().o());
         }
      }
   }
}
