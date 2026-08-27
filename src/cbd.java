import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbd extends cbn implements bls {
   private static final UUID c = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final bmp d = new bmp(c, "Attacking speed boost", 0.15F, bmp.a.a);
   private static final int e = 400;
   private static final int bT = 600;
   private static final afs<Optional<dhn>> bU = afv.a(cbd.class, afu.j);
   private static final afs<Boolean> bV = afv.a(cbd.class, afu.k);
   private static final afs<Boolean> bW = afv.a(cbd.class, afu.k);
   private int bX = Integer.MIN_VALUE;
   private int bY;
   private static final bim bZ = aup.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public cbd(bkz<? extends cbd> $$0, csf $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.a(edi.j, -1.0F);
   }

   @Override
   protected void B() {
      this.bO.a(0, new bsa(this));
      this.bO.a(1, new cbd.a(this));
      this.bO.a(2, new bsq(this, 1.0, false));
      this.bO.a(7, new btt(this, 1.0, 0.0F));
      this.bO.a(8, new bso(this, cdz.class, 8.0F));
      this.bO.a(8, new btb(this));
      this.bO.a(10, new cbd.b(this));
      this.bO.a(11, new cbd.d(this));
      this.bP.a(1, new cbd.c(this, this::a_));
      this.bP.a(2, new bty(this));
      this.bP.a(3, new btz<>(this, cbe.class, true, false));
      this.bP.a(4, new buf<>(this, false));
   }

   public static bmq.a u() {
      return cbn.gl().a(bmr.l, 40.0).a(bmr.m, 0.3F).a(bmr.c, 7.0).a(bmr.g, 64.0);
   }

   @Override
   public void h(@Nullable bll $$0) {
      super.h($$0);
      bmn $$1 = this.a(bmr.m);
      if ($$0 == null) {
         this.bY = 0;
         this.an.b(bV, false);
         this.an.b(bW, false);
         $$1.b(d.a());
      } else {
         this.bY = this.ah;
         this.an.b(bV, true);
         if (!$$1.a(d)) {
            $$1.b(d);
         }
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bU, Optional.empty());
      this.an.a(bV, false);
      this.an.a(bW, false);
   }

   @Override
   public void c() {
      this.a(bZ.a(this.ag));
   }

   @Override
   public void a(int $$0) {
      this.ca = $$0;
   }

   @Override
   public int a() {
      return this.ca;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cb = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cb;
   }

   public void w() {
      if (this.ah >= this.bX + 400) {
         this.bX = this.ah;
         if (!this.aU()) {
            this.dN().a(this.ds(), this.dw(), this.dy(), aqv.hA, this.dc(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(afs<?> $$0) {
      if (bV.equals($$0) && this.gh() && this.dN().B) {
         this.w();
      }

      super.a($$0);
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      dhn $$1 = this.gf();
      if ($$1 != null) {
         $$0.a("carriedBlockState", ss.a($$1));
      }

      this.c($$0);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      dhn $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = ss.a(this.dN().a(kd.e), $$0.p("carriedBlockState"));
         if ($$1.i()) {
            $$1 = null;
         }
      }

      this.d($$1);
      this.a(this.dN(), $$0);
   }

   boolean g(cdz $$0) {
      clo $$1 = $$0.fT().j.get(3);
      if ($$1.a(cvh.ee.k())) {
         return false;
      } else {
         ejz $$2 = $$0.f(1.0F).d();
         ejz $$3 = new ejz(this.ds() - $$0.ds(), this.dw() - $$0.dw(), this.dy() - $$0.dy());
         double $$4 = $$3.f();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.E(this) : false;
      }
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return 2.55F;
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.09375F * $$2, 0.0F);
   }

   @Override
   public void d_() {
      if (this.dN().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dN().a(jw.X, this.d(0.5), this.dv() - 0.25, this.g(0.5), (this.ag.j() - 0.5) * 2.0, -this.ag.j(), (this.ag.j() - 0.5) * 2.0);
         }
      }

      this.bj = false;
      if (!this.dN().B) {
         this.a((ami)this.dN(), true);
      }

      super.d_();
   }

   @Override
   public boolean fi() {
      return true;
   }

   @Override
   protected void Z() {
      if (this.dN().O() && this.ah >= this.bY + 600) {
         float $$0 = this.bo();
         if ($$0 > 0.5F && this.dN().g(this.dn()) && this.ag.i() * 30.0F < ($$0 - 0.4F) * 2.0F) {
            this.h(null);
            this.A();
         }
      }

      super.Z();
   }

   protected boolean A() {
      if (!this.dN().y_() && this.bx()) {
         double $$0 = this.ds() + (this.ag.j() - 0.5) * 64.0;
         double $$1 = this.du() + (double)(this.ag.a(64) - 32);
         double $$2 = this.dy() + (this.ag.j() - 0.5) * 64.0;
         return this.r($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean a(bkv $$0) {
      ejz $$1 = new ejz(this.ds() - $$0.ds(), this.e(0.5) - $$0.dw(), this.dy() - $$0.dy());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.ds() + (this.ag.j() - 0.5) * 8.0 - $$1.c * 16.0;
      double $$4 = this.du() + (double)(this.ag.a(16) - 8) - $$1.d * 16.0;
      double $$5 = this.dy() + (this.ag.j() - 0.5) * 8.0 - $$1.e * 16.0;
      return this.r($$3, $$4, $$5);
   }

   private boolean r(double $$0, double $$1, double $$2) {
      hx.a $$3 = new hx.a($$0, $$1, $$2);

      while ($$3.v() > this.dN().J_() && !this.dN().a_($$3).d()) {
         $$3.c(ib.a);
      }

      dhn $$4 = this.dN().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.u().a(arp.a);
      if ($$5 && !$$6) {
         ejz $$7 = this.dl();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dN().a(dlx.R, $$7, dlx.a.a(this));
            if (!this.aU()) {
               this.dN().a(null, this.K, this.L, this.M, aqv.hB, this.dc(), 1.0F, 1.0F);
               this.a(aqv.hB, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected aqu y() {
      return this.gg() ? aqv.hz : aqv.hw;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.hy;
   }

   @Override
   protected aqu n_() {
      return aqv.hx;
   }

   @Override
   protected void a(bjt $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dhn $$3 = this.gf();
      if ($$3 != null) {
         clo $$4 = new clo(clr.pf);
         $$4.a(cqd.v, 1);
         efi.a $$5 = new efi.a((ami)this.dN()).a(ehn.f, this.dl()).a(ehn.i, $$4).b(ehn.a, this);

         for (clo $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void d(@Nullable dhn $$0) {
      this.an.b(bU, Optional.ofNullable($$0));
   }

   @Nullable
   public dhn gf() {
      return this.an.b(bU).orElse(null);
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cfc;
         if (!$$0.a(arm.j) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dN().y_() && !($$0.d() instanceof bll) && this.ag.a(10) != 0) {
               this.A();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (cfc)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.A()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bjt $$0, cfc $$1, float $$2) {
      clo $$3 = $$1.q();
      cnl $$4 = cnn.d($$3);
      List<bki> $$5 = cnn.a($$3);
      boolean $$6 = $$4 == cno.c && $$5.isEmpty();
      return $$6 ? super.a($$0, $$2) : false;
   }

   public boolean gg() {
      return this.an.b(bV);
   }

   public boolean gh() {
      return this.an.b(bW);
   }

   public void gi() {
      this.an.b(bW, true);
   }

   @Override
   public boolean W() {
      return super.W() || this.gf() != null;
   }

   static class a extends bsg {
      private final cbd a;
      @Nullable
      private bll b;

      public a(cbd $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bsg.a.c, bsg.a.a));
      }

      @Override
      public boolean a() {
         this.b = this.a.q();
         if (!(this.b instanceof cdz)) {
            return false;
         } else {
            double $$0 = this.b.f(this.a);
            return $$0 > 256.0 ? false : this.a.g((cdz)this.b);
         }
      }

      @Override
      public void c() {
         this.a.N().n();
      }

      @Override
      public void e() {
         this.a.I().a(this.b.ds(), this.b.dw(), this.b.dy());
      }
   }

   static class b extends bsg {
      private final cbd a;

      public b(cbd $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gf() == null) {
            return false;
         } else {
            return !this.a.dN().Y().b(csb.c) ? false : this.a.eh().a(b(2000)) == 0;
         }
      }

      @Override
      public void e() {
         atw $$0 = this.a.eh();
         csf $$1 = this.a.dN();
         int $$2 = atq.a(this.a.ds() - 1.0 + $$0.j() * 2.0);
         int $$3 = atq.a(this.a.du() + $$0.j() * 2.0);
         int $$4 = atq.a(this.a.dy() - 1.0 + $$0.j() * 2.0);
         hx $$5 = new hx($$2, $$3, $$4);
         dhn $$6 = $$1.a_($$5);
         hx $$7 = $$5.d();
         dhn $$8 = $$1.a_($$7);
         dhn $$9 = this.a.gf();
         if ($$9 != null) {
            $$9 = cvf.b($$9, this.a.dN(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(dlx.i, $$5, dlx.a.a(this.a, $$9));
               this.a.d(null);
            }
         }
      }

      private boolean a(csf $$0, hx $$1, dhn $$2, dhn $$3, dhn $$4, hx $$5) {
         return $$3.i() && !$$4.i() && !$$4.a(cvh.F) && $$4.r($$0, $$5) && $$2.a((csi)$$0, $$1) && $$0.a_(this.a, eju.a(ejz.a($$1))).isEmpty();
      }
   }

   static class c extends btz<cdz> {
      private final cbd i;
      @Nullable
      private cdz j;
      private int k;
      private int l;
      private final bvx m;
      private final bvx n = bvx.a().d();
      private final Predicate<bll> o;

      public c(cbd $$0, @Nullable Predicate<bll> $$1) {
         super($$0, cdz.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.g((cdz)$$1x) || $$0.a_($$1x)) && !$$0.z($$1x);
         this.m = bvx.a().a(this.l()).a(this.o);
      }

      @Override
      public boolean a() {
         this.j = this.i.dN().a(this.m, this.i);
         return this.j != null;
      }

      @Override
      public void c() {
         this.k = this.a(5);
         this.l = 0;
         this.i.gi();
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
         if (this.i.q() == null) {
            super.a(null);
         }

         if (this.j != null) {
            if (--this.k <= 0) {
               this.c = this.j;
               this.j = null;
               super.c();
            }
         } else {
            if (this.c != null && !this.i.bO()) {
               if (this.i.g((cdz)this.c)) {
                  if (this.c.f(this.i) < 16.0) {
                     this.i.A();
                  }

                  this.l = 0;
               } else if (this.c.f(this.i) > 256.0 && this.l++ >= this.a(30) && this.i.a(this.c)) {
                  this.l = 0;
               }
            }

            super.e();
         }
      }
   }

   static class d extends bsg {
      private final cbd a;

      public d(cbd $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gf() != null) {
            return false;
         } else {
            return !this.a.dN().Y().b(csb.c) ? false : this.a.eh().a(b(20)) == 0;
         }
      }

      @Override
      public void e() {
         atw $$0 = this.a.eh();
         csf $$1 = this.a.dN();
         int $$2 = atq.a(this.a.ds() - 2.0 + $$0.j() * 4.0);
         int $$3 = atq.a(this.a.du() + $$0.j() * 3.0);
         int $$4 = atq.a(this.a.dy() - 2.0 + $$0.j() * 4.0);
         hx $$5 = new hx($$2, $$3, $$4);
         dhn $$6 = $$1.a_($$5);
         ejz $$7 = new ejz((double)this.a.dr() + 0.5, (double)$$3 + 0.5, (double)this.a.dx() + 0.5);
         ejz $$8 = new ejz((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         ejv $$9 = $$1.a(new cro($$7, $$8, cro.a.b, cro.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(ark.ak) && $$10) {
            $$1.a($$5, false);
            $$1.a(dlx.f, $$5, dlx.a.a(this.a, $$6));
            this.a.d($$6.b().o());
         }
      }
   }
}
