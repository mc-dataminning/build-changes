import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjg extends cjq implements bth {
   private static final UUID c = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final buh d = new buh(c, "Attacking speed boost", 0.15F, buh.a.a);
   private static final int e = 400;
   private static final int ca = 600;
   private static final ajp<Optional<dsk>> cb = ajt.a(cjg.class, ajr.j);
   private static final ajp<Boolean> cc = ajt.a(cjg.class, ajr.k);
   private static final ajp<Boolean> cd = ajt.a(cjg.class, ajr.k);
   private int ce = Integer.MIN_VALUE;
   private int cf;
   private static final bpr cg = azh.a(20, 39);
   private int ch;
   @Nullable
   private UUID ci;

   public cjg(bsm<? extends cjg> $$0, dcf $$1) {
      super($$0, $$1);
      this.a(eoy.j, -1.0F);
   }

   @Override
   protected void z() {
      this.bU.a(0, new bzt(this));
      this.bU.a(1, new cjg.a(this));
      this.bU.a(2, new caj(this, 1.0, false));
      this.bU.a(7, new cbm(this, 1.0, 0.0F));
      this.bU.a(8, new cah(this, cmk.class, 8.0F));
      this.bU.a(8, new cau(this));
      this.bU.a(10, new cjg.b(this));
      this.bU.a(11, new cjg.d(this));
      this.bV.a(1, new cjg.c(this, this::a_));
      this.bV.a(2, new cbr(this));
      this.bV.a(3, new cbs<>(this, cjh.class, true, false));
      this.bV.a(4, new cby<>(this, false));
   }

   public static bui.a s() {
      return cjq.gu().a(buj.s, 40.0).a(buj.v, 0.3F).a(buj.c, 7.0).a(buj.m, 64.0).a(buj.B, 1.0);
   }

   @Override
   public void h(@Nullable btb $$0) {
      super.h($$0);
      buf $$1 = this.f(buj.v);
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
         if (!this.aX()) {
            this.dQ().a(this.dv(), this.dz(), this.dB(), avh.in, this.df(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(ajp<?> $$0) {
      if (cc.equals($$0) && this.gq() && this.dQ().B) {
         this.u();
      }

      super.a($$0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      dsk $$1 = this.go();
      if ($$1 != null) {
         $$0.a("carriedBlockState", um.a($$1));
      }

      this.c($$0);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      dsk $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = um.a(this.dQ().a(lr.f), $$0.p("carriedBlockState"));
         if ($$1.i()) {
            $$1 = null;
         }
      }

      this.c($$1);
      this.a(this.dQ(), $$0);
   }

   boolean g(cmk $$0) {
      cuc $$1 = $$0.fZ().i.get(3);
      if ($$1.a(dfj.ee.r())) {
         return false;
      } else {
         ewf $$2 = $$0.g(1.0F).d();
         ewf $$3 = new ewf(this.dv() - $$0.dv(), this.dz() - $$0.dz(), this.dB() - $$0.dB());
         double $$4 = $$3.f();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.F(this) : false;
      }
   }

   @Override
   public void n_() {
      if (this.dQ().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dQ().a(lj.ac, this.d(0.5), this.dy() - 0.25, this.g(0.5), (this.ah.j() - 0.5) * 2.0, -this.ah.j(), (this.ah.j() - 0.5) * 2.0);
         }
      }

      this.bn = false;
      if (!this.dQ().B) {
         this.a((aqm)this.dQ(), true);
      }

      super.n_();
   }

   @Override
   public boolean fm() {
      return true;
   }

   @Override
   protected void Z() {
      if (this.dQ().R() && this.ai >= this.cf + 600) {
         float $$0 = this.bu();
         if ($$0 > 0.5F && this.dQ().h(this.dq()) && this.ah.i() * 30.0F < ($$0 - 0.4F) * 2.0F) {
            this.h(null);
            this.y();
         }
      }

      super.Z();
   }

   protected boolean y() {
      if (!this.dQ().x_() && this.bE()) {
         double $$0 = this.dv() + (this.ah.j() - 0.5) * 64.0;
         double $$1 = this.dx() + (double)(this.ah.a(64) - 32);
         double $$2 = this.dB() + (this.ah.j() - 0.5) * 64.0;
         return this.r($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean b(bsg $$0) {
      ewf $$1 = new ewf(this.dv() - $$0.dv(), this.e(0.5) - $$0.dz(), this.dB() - $$0.dB());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dv() + (this.ah.j() - 0.5) * 8.0 - $$1.c * 16.0;
      double $$4 = this.dx() + (double)(this.ah.a(16) - 8) - $$1.d * 16.0;
      double $$5 = this.dB() + (this.ah.j() - 0.5) * 8.0 - $$1.e * 16.0;
      return this.r($$3, $$4, $$5);
   }

   private boolean r(double $$0, double $$1, double $$2) {
      ja.a $$3 = new ja.a($$0, $$1, $$2);

      while ($$3.v() > this.dQ().I_() && !this.dQ().a_($$3).d()) {
         $$3.c(jf.a);
      }

      dsk $$4 = this.dQ().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.u().a(awc.a);
      if ($$5 && !$$6) {
         ewf $$7 = this.do();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dQ().a(dxg.R, $$7, dxg.a.a(this));
            if (!this.aX()) {
               this.dQ().a(null, this.L, this.M, this.N, avh.io, this.df(), 1.0F, 1.0F);
               this.a(avh.io, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected avg v() {
      return this.gp() ? avh.im : avh.ij;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.il;
   }

   @Override
   protected avg o_() {
      return avh.ik;
   }

   @Override
   protected void a(bqz $$0, boolean $$1) {
      super.a($$0, $$1);
      dsk $$2 = this.go();
      if ($$2 != null) {
         cuc $$3 = new cuc(cuf.pj);
         czn.a($$3, day.g, this.dQ(), this.dq(), this.dT());
         eqx.a $$4 = new eqx.a((aqm)this.dQ()).a(etq.f, this.do()).a(etq.i, $$3).b(etq.a, this);

         for (cuc $$6 : $$2.a($$4)) {
            this.b($$6);
         }
      }
   }

   public void c(@Nullable dsk $$0) {
      this.ao.a(cb, Optional.ofNullable($$0));
   }

   @Nullable
   public dsk go() {
      return this.ao.a(cb).orElse(null);
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cno;
         if (!$$0.a(avy.k) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dQ().x_() && !($$0.d() instanceof btb) && this.ah.a(10) != 0) {
               this.y();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (cno)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.y()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bqz $$0, cno $$1, float $$2) {
      cuc $$3 = $$1.p();
      cwd $$4 = $$3.a(kn.G, cwd.a);
      return $$4.a(cwe.a) ? super.a($$0, $$2) : false;
   }

   public boolean gp() {
      return this.ao.a(cc);
   }

   public boolean gq() {
      return this.ao.a(cd);
   }

   public void gr() {
      this.ao.a(cd, true);
   }

   @Override
   public boolean W() {
      return super.W() || this.go() != null;
   }

   static class a extends bzz {
      private final cjg a;
      @Nullable
      private btb b;

      public a(cjg $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzz.a.c, bzz.a.a));
      }

      @Override
      public boolean a() {
         this.b = this.a.p();
         if (!(this.b instanceof cmk)) {
            return false;
         } else {
            double $$0 = this.b.g(this.a);
            return $$0 > 256.0 ? false : this.a.g((cmk)this.b);
         }
      }

      @Override
      public void c() {
         this.a.K().n();
      }

      @Override
      public void e() {
         this.a.G().a(this.b.dv(), this.b.dz(), this.b.dB());
      }
   }

   static class b extends bzz {
      private final cjg a;

      public b(cjg $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.go() == null) {
            return false;
         } else {
            return !this.a.dQ().ab().b(dcb.c) ? false : this.a.dT().a(b(2000)) == 0;
         }
      }

      @Override
      public void e() {
         ayo $$0 = this.a.dT();
         dcf $$1 = this.a.dQ();
         int $$2 = ayg.a(this.a.dv() - 1.0 + $$0.j() * 2.0);
         int $$3 = ayg.a(this.a.dx() + $$0.j() * 2.0);
         int $$4 = ayg.a(this.a.dB() - 1.0 + $$0.j() * 2.0);
         ja $$5 = new ja($$2, $$3, $$4);
         dsk $$6 = $$1.a_($$5);
         ja $$7 = $$5.d();
         dsk $$8 = $$1.a_($$7);
         dsk $$9 = this.a.go();
         if ($$9 != null) {
            $$9 = dfh.b($$9, this.a.dQ(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(dxg.i, $$5, dxg.a.a(this.a, $$9));
               this.a.c(null);
            }
         }
      }

      private boolean a(dcf $$0, ja $$1, dsk $$2, dsk $$3, dsk $$4, ja $$5) {
         return $$3.i() && !$$4.i() && !$$4.a(dfj.F) && $$4.r($$0, $$5) && $$2.a((dci)$$0, $$1) && $$0.a_(this.a, ewa.a(ewf.a($$1))).isEmpty();
      }
   }

   static class c extends cbs<cmk> {
      private final cjg i;
      @Nullable
      private cmk j;
      private int k;
      private int l;
      private final cds m;
      private final cds n = cds.a().d();
      private final Predicate<btb> o;

      public c(cjg $$0, @Nullable Predicate<btb> $$1) {
         super($$0, cmk.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.g((cmk)$$1x) || $$0.a_($$1x)) && !$$0.z($$1x);
         this.m = cds.a().a(this.l()).a(this.o);
      }

      @Override
      public boolean a() {
         this.j = this.i.dQ().a(this.m, this.i);
         return this.j != null;
      }

      @Override
      public void c() {
         this.k = this.a(5);
         this.l = 0;
         this.i.gr();
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
            if (this.c != null && !this.i.bS()) {
               if (this.i.g((cmk)this.c)) {
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

   static class d extends bzz {
      private final cjg a;

      public d(cjg $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.go() != null) {
            return false;
         } else {
            return !this.a.dQ().ab().b(dcb.c) ? false : this.a.dT().a(b(20)) == 0;
         }
      }

      @Override
      public void e() {
         ayo $$0 = this.a.dT();
         dcf $$1 = this.a.dQ();
         int $$2 = ayg.a(this.a.dv() - 2.0 + $$0.j() * 4.0);
         int $$3 = ayg.a(this.a.dx() + $$0.j() * 3.0);
         int $$4 = ayg.a(this.a.dB() - 2.0 + $$0.j() * 4.0);
         ja $$5 = new ja($$2, $$3, $$4);
         dsk $$6 = $$1.a_($$5);
         ewf $$7 = new ewf((double)this.a.du() + 0.5, (double)$$3 + 0.5, (double)this.a.dA() + 0.5);
         ewf $$8 = new ewf((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         ewb $$9 = $$1.a(new dbo($$7, $$8, dbo.a.b, dbo.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(avw.al) && $$10) {
            $$1.a($$5, false);
            $$1.a(dxg.f, $$5, dxg.a.a(this.a, $$6));
            this.a.c($$6.b().o());
         }
      }
   }
}
