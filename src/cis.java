import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cis extends cjd implements bsu {
   private static final UUID c = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final btt d = new btt(c, "Attacking speed boost", 0.15F, btt.a.a);
   private static final int e = 400;
   private static final int ch = 600;
   private static final ajy<Optional<dtc>> ci = akc.a(cis.class, aka.j);
   private static final ajy<Boolean> cj = akc.a(cis.class, aka.k);
   private static final ajy<Boolean> ck = akc.a(cis.class, aka.k);
   private int cl = Integer.MIN_VALUE;
   private int cm;
   private static final bpl cn = azl.a(20, 39);
   private int co;
   @Nullable
   private UUID cp;

   public cis(bsb<? extends cis> $$0, dca $$1) {
      super($$0, $$1);
      this.a(epv.j, -1.0F);
   }

   @Override
   public boolean dW() {
      return true;
   }

   @Override
   protected void y() {
      this.cb.a(0, new bzf(this));
      this.cb.a(1, new cis.a(this));
      this.cb.a(2, new bzv(this, 1.0, false));
      this.cb.a(7, new cay(this, 1.0, 0.0F));
      this.cb.a(8, new bzt(this, cly.class, 8.0F));
      this.cb.a(8, new cag(this));
      this.cb.a(10, new cis.b(this));
      this.cb.a(11, new cis.d(this));
      this.cc.a(1, new cis.c(this, this::a_));
      this.cc.a(2, new cbd(this));
      this.cc.a(3, new cbe<>(this, cit.class, true, false));
      this.cc.a(4, new cbk<>(this, false));
   }

   public static btu.a r() {
      return cjd.gG().a(btv.q, 40.0).a(btv.r, 0.3F).a(btv.c, 7.0).a(btv.k, 64.0).a(btv.v, 1.0);
   }

   @Override
   public void h(@Nullable bso $$0) {
      super.h($$0);
      btr $$1 = this.f(btv.r);
      if ($$0 == null) {
         this.cm = 0;
         this.as.a(cj, false);
         this.as.a(ck, false);
         $$1.b(d.b());
      } else {
         this.cm = this.am;
         this.as.a(cj, true);
         if (!$$1.a(d)) {
            $$1.c(d);
         }
      }
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(ci, Optional.empty());
      $$0.a(cj, false);
      $$0.a(ck, false);
   }

   @Override
   public void c() {
      this.a(cn.a(this.al));
   }

   @Override
   public void a(int $$0) {
      this.co = $$0;
   }

   @Override
   public int a() {
      return this.co;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cp = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cp;
   }

   public void t() {
      if (this.am >= this.cl + 400) {
         this.cl = this.am;
         if (!this.ba()) {
            this.dU().a(this.dz(), this.dD(), this.dF(), avo.iA, this.dj(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(ajy<?> $$0) {
      if (cj.equals($$0) && this.gA() && this.dU().C) {
         this.t();
      }

      super.a($$0);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      dtc $$1 = this.gy();
      if ($$1 != null) {
         $$0.a("carriedBlockState", uz.a($$1));
      }

      this.c($$0);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      dtc $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = uz.a(this.dU().a(li.f), $$0.p("carriedBlockState"));
         if ($$1.i()) {
            $$1 = null;
         }
      }

      this.d($$1);
      this.a(this.dU(), $$0);
   }

   boolean g(cly $$0) {
      cuh $$1 = $$0.gl().i.get(3);
      if ($$1.a(dfe.eU.q())) {
         return false;
      } else {
         ewu $$2 = $$0.f(1.0F).d();
         ewu $$3 = new ewu(this.dz() - $$0.dz(), this.dD() - $$0.dD(), this.dF() - $$0.dF());
         double $$4 = $$3.f();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.E(this) : false;
      }
   }

   @Override
   public void m_() {
      if (this.dU().C) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dU().a(lb.aa, this.d(0.5), this.dC() - 0.25, this.g(0.5), (this.al.j() - 0.5) * 2.0, -this.al.j(), (this.al.j() - 0.5) * 2.0);
         }
      }

      this.by = false;
      if (!this.dU().C) {
         this.a_((aqt)this.dU(), true);
      }

      super.m_();
   }

   @Override
   public boolean fy() {
      return true;
   }

   @Override
   protected void Y() {
      if (this.dU().R() && this.am >= this.cm + 600) {
         float $$0 = this.by();
         if ($$0 > 0.5F && this.dU().h(this.du()) && this.al.i() * 30.0F < ($$0 - 0.4F) * 2.0F) {
            this.h(null);
            this.x();
         }
      }

      super.Y();
   }

   protected boolean x() {
      if (!this.dU().x_() && this.bI()) {
         double $$0 = this.dz() + (this.al.j() - 0.5) * 64.0;
         double $$1 = this.dB() + (double)(this.al.a(64) - 32);
         double $$2 = this.dF() + (this.al.j() - 0.5) * 64.0;
         return this.r($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean b(brv $$0) {
      ewu $$1 = new ewu(this.dz() - $$0.dz(), this.e(0.5) - $$0.dD(), this.dF() - $$0.dF());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dz() + (this.al.j() - 0.5) * 8.0 - $$1.c * 16.0;
      double $$4 = this.dB() + (double)(this.al.a(16) - 8) - $$1.d * 16.0;
      double $$5 = this.dF() + (this.al.j() - 0.5) * 8.0 - $$1.e * 16.0;
      return this.r($$3, $$4, $$5);
   }

   private boolean r(double $$0, double $$1, double $$2) {
      ir.a $$3 = new ir.a($$0, $$1, $$2);

      while ($$3.v() > this.dU().J_() && !this.dU().a_($$3).d()) {
         $$3.d(iw.a);
      }

      dtc $$4 = this.dU().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.u().a(awj.a);
      if ($$5 && !$$6) {
         ewu $$7 = this.ds();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dU().a(dxv.R, $$7, dxv.a.a(this));
            if (!this.ba()) {
               this.dU().a(null, this.M, this.N, this.O, avo.iB, this.dj(), 1.0F, 1.0F);
               this.a(avo.iB, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected avn u() {
      return this.gz() ? avo.iz : avo.iw;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.iy;
   }

   @Override
   protected avn n_() {
      return avo.ix;
   }

   @Override
   protected void a(bqt $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dtc $$3 = this.gy();
      if ($$3 != null) {
         cuh $$4 = new cuh(cuk.qB);
         $$4.a(dag.v, 1);
         ers.a $$5 = new ers.a((aqt)this.dU()).a(eug.f, this.ds()).a(eug.i, $$4).b(eug.a, this);

         for (cuh $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void d(@Nullable dtc $$0) {
      this.as.a(ci, Optional.ofNullable($$0));
   }

   @Nullable
   public dtc gy() {
      return this.as.a(ci).orElse(null);
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cne;
         if (!$$0.a(awg.k) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dU().x_() && !($$0.d() instanceof bso) && this.al.a(10) != 0) {
               this.x();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (cne)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.x()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bqt $$0, cne $$1, float $$2) {
      cuh $$3 = $$1.p();
      cwr $$4 = $$3.a(ke.E, cwr.a);
      return $$4.a(cws.a) ? super.a($$0, $$2) : false;
   }

   public boolean gz() {
      return this.as.a(cj);
   }

   public boolean gA() {
      return this.as.a(ck);
   }

   public void gB() {
      this.as.a(ck, true);
   }

   @Override
   public boolean V() {
      return super.V() || this.gy() != null;
   }

   static class a extends bzl {
      private final cis a;
      @Nullable
      private bso b;

      public a(cis $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzl.a.c, bzl.a.a));
      }

      @Override
      public boolean a() {
         this.b = this.a.p();
         if (!(this.b instanceof cly)) {
            return false;
         } else {
            double $$0 = this.b.g(this.a);
            return $$0 > 256.0 ? false : this.a.g((cly)this.b);
         }
      }

      @Override
      public void c() {
         this.a.J().n();
      }

      @Override
      public void e() {
         this.a.F().a(this.b.dz(), this.b.dD(), this.b.dF());
      }
   }

   static class b extends bzl {
      private final cis a;

      public b(cis $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gy() == null) {
            return false;
         } else {
            return !this.a.dU().ab().b(dbw.c) ? false : this.a.et().a(b(2000)) == 0;
         }
      }

      @Override
      public void e() {
         ayt $$0 = this.a.et();
         dca $$1 = this.a.dU();
         int $$2 = aym.a(this.a.dz() - 1.0 + $$0.j() * 2.0);
         int $$3 = aym.a(this.a.dB() + $$0.j() * 2.0);
         int $$4 = aym.a(this.a.dF() - 1.0 + $$0.j() * 2.0);
         ir $$5 = new ir($$2, $$3, $$4);
         dtc $$6 = $$1.a_($$5);
         ir $$7 = $$5.d();
         dtc $$8 = $$1.a_($$7);
         dtc $$9 = this.a.gy();
         if ($$9 != null) {
            $$9 = dfc.b($$9, this.a.dU(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(dxv.i, $$5, dxv.a.a(this.a, $$9));
               this.a.d(null);
            }
         }
      }

      private boolean a(dca $$0, ir $$1, dtc $$2, dtc $$3, dtc $$4, ir $$5) {
         return $$3.i() && !$$4.i() && !$$4.a(dfe.ak) && $$4.r($$0, $$5) && $$2.a((dcd)$$0, $$1) && $$0.a_(this.a, ewp.a(ewu.a($$1))).isEmpty();
      }
   }

   static class c extends cbe<cly> {
      private final cis i;
      @Nullable
      private cly j;
      private int k;
      private int l;
      private final cde m;
      private final cde n = cde.a().d();
      private final Predicate<bso> o;

      public c(cis $$0, @Nullable Predicate<bso> $$1) {
         super($$0, cly.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.g((cly)$$1x) || $$0.a_($$1x)) && !$$0.z($$1x);
         this.m = cde.a().a(this.l()).a(this.o);
      }

      @Override
      public boolean a() {
         this.j = this.i.dU().a(this.m, this.i);
         return this.j != null;
      }

      @Override
      public void c() {
         this.k = this.a(5);
         this.l = 0;
         this.i.gB();
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
            if (this.c != null && !this.i.bW()) {
               if (this.i.g((cly)this.c)) {
                  if (this.c.g(this.i) < 16.0) {
                     this.i.x();
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

   static class d extends bzl {
      private final cis a;

      public d(cis $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gy() != null) {
            return false;
         } else {
            return !this.a.dU().ab().b(dbw.c) ? false : this.a.et().a(b(20)) == 0;
         }
      }

      @Override
      public void e() {
         ayt $$0 = this.a.et();
         dca $$1 = this.a.dU();
         int $$2 = aym.a(this.a.dz() - 2.0 + $$0.j() * 4.0);
         int $$3 = aym.a(this.a.dB() + $$0.j() * 3.0);
         int $$4 = aym.a(this.a.dF() - 2.0 + $$0.j() * 4.0);
         ir $$5 = new ir($$2, $$3, $$4);
         dtc $$6 = $$1.a_($$5);
         ewu $$7 = new ewu((double)this.a.dy() + 0.5, (double)$$3 + 0.5, (double)this.a.dE() + 0.5);
         ewu $$8 = new ewu((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         ewq $$9 = $$1.a(new dbj($$7, $$8, dbj.a.b, dbj.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(awe.am) && $$10) {
            $$1.a($$5, false);
            $$1.a(dxv.f, $$5, dxv.a.a(this.a, $$6));
            this.a.d($$6.b().n());
         }
      }
   }
}
