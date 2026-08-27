import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxl extends bww {
   private static final afs<Integer> bW = afv.a(bxl.class, afu.b);
   private static final afs<Integer> bX = afv.a(bxl.class, afu.b);
   private static final afs<Integer> bY = afv.a(bxl.class, afu.b);
   private static final afs<Byte> bZ = afv.a(bxl.class, afu.a);
   private static final afs<Byte> ca = afv.a(bxl.class, afu.a);
   private static final afs<Byte> cb = afv.a(bxl.class, afu.a);
   static final bvx cc = bvx.b().a(8.0);
   private static final int cd = 2;
   private static final int ce = 4;
   private static final int cf = 8;
   private static final int cg = 16;
   private static final int ch = 5;
   public static final int bT = 32;
   private static final int ci = 32;
   boolean cj;
   boolean ck;
   public int bU;
   private ejz cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   bxl.g cs;
   static final Predicate<cas> ct = $$0 -> {
      clo $$1 = $$0.q();
      return ($$1.a(cvh.mZ.k()) || $$1.a(cvh.eg.k())) && $$0.bx() && !$$0.z();
   };

   public bxl(bkz<? extends bxl> $$0, csf $$1) {
      super($$0, $$1);
      this.bL = new bxl.h(this);
      if (!this.o_()) {
         this.s(true);
      }
   }

   @Override
   public boolean f(clo $$0) {
      bla $$1 = bln.h($$0);
      return !this.c($$1).b() ? false : $$1 == bla.a && super.f($$0);
   }

   public int u() {
      return this.an.b(bW);
   }

   public void t(int $$0) {
      this.an.b(bW, $$0);
   }

   public boolean w() {
      return this.w(2);
   }

   public boolean A() {
      return this.w(8);
   }

   public void w(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gf() {
      return this.w(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gl() {
      return this.an.b(bY) > 0;
   }

   public void y(boolean $$0) {
      this.an.b(bY, $$0 ? 1 : 0);
   }

   private int gA() {
      return this.an.b(bY);
   }

   private void v(int $$0) {
      this.an.b(bY, $$0);
   }

   public void z(boolean $$0) {
      this.d(2, $$0);
      if (!$$0) {
         this.u(0);
      }
   }

   public int gm() {
      return this.an.b(bX);
   }

   public void u(int $$0) {
      this.an.b(bX, $$0);
   }

   public bxl.a gn() {
      return bxl.a.a(this.an.b(bZ));
   }

   public void a(bxl.a $$0) {
      if ($$0.a() > 6) {
         $$0 = bxl.a.a(this.ag);
      }

      this.an.b(bZ, (byte)$$0.a());
   }

   public bxl.a go() {
      return bxl.a.a(this.an.b(ca));
   }

   public void b(bxl.a $$0) {
      if ($$0.a() > 6) {
         $$0 = bxl.a.a(this.ag);
      }

      this.an.b(ca, (byte)$$0.a());
   }

   public boolean gp() {
      return this.w(4);
   }

   public void A(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bW, 0);
      this.an.a(bX, 0);
      this.an.a(bZ, (byte)0);
      this.an.a(ca, (byte)0);
      this.an.a(cb, (byte)0);
      this.an.a(bY, 0);
   }

   private boolean w(int $$0) {
      return (this.an.b(cb) & $$0) != 0;
   }

   private void d(int $$0, boolean $$1) {
      byte $$2 = this.an.b(cb);
      if ($$1) {
         this.an.b(cb, (byte)($$2 | $$0));
      } else {
         this.an.b(cb, (byte)($$2 & ~$$0));
      }
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gn().c());
      $$0.a("HiddenGene", this.go().c());
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.a(bxl.a.a($$0.l("MainGene")));
      this.b(bxl.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public bkq a(ami $$0, bkq $$1) {
      bxl $$2 = bkz.as.a((csf)$$0);
      if ($$2 != null) {
         if ($$1 instanceof bxl $$3) {
            $$2.a(this, $$3);
         }

         $$2.gy();
      }

      return $$2;
   }

   @Override
   protected void B() {
      this.bO.a(0, new bsa(this));
      this.bO.a(2, new bxl.i(this, 2.0));
      this.bO.a(2, new bxl.d(this, 1.0));
      this.bO.a(3, new bxl.b(this, 1.2F, true));
      this.bO.a(4, new bto(this, 1.0, coq.a(cvh.mZ.k()), false));
      this.bO.a(6, new bxl.c<>(this, cdz.class, 8.0F, 2.0, 2.0));
      this.bO.a(6, new bxl.c<>(this, cbn.class, 4.0F, 2.0, 2.0));
      this.bO.a(7, new bxl.k());
      this.bO.a(8, new bxl.f(this));
      this.bO.a(8, new bxl.l(this));
      this.cs = new bxl.g(this, cdz.class, 6.0F);
      this.bO.a(9, this.cs);
      this.bO.a(10, new btb(this));
      this.bO.a(12, new bxl.j(this));
      this.bO.a(13, new bsf(this, 1.25));
      this.bO.a(14, new btt(this, 1.0));
      this.bP.a(1, new bxl.e(this).a(new Class[0]));
   }

   public static bmq.a gq() {
      return bln.C().a(bmr.m, 0.15F).a(bmr.c, 6.0);
   }

   public bxl.a gr() {
      return bxl.a.a(this.gn(), this.go());
   }

   public boolean gs() {
      return this.gr() == bxl.a.b;
   }

   public boolean gt() {
      return this.gr() == bxl.a.c;
   }

   public boolean gu() {
      return this.gr() == bxl.a.d;
   }

   public boolean gv() {
      return this.gr() == bxl.a.e;
   }

   public boolean gw() {
      return this.gr() == bxl.a.f;
   }

   @Override
   public boolean fX() {
      return this.gr() == bxl.a.g;
   }

   @Override
   public boolean a(cdz $$0) {
      return false;
   }

   @Override
   public boolean C(bkv $$0) {
      this.a(aqv.ro, 1.0F, 1.0F);
      if (!this.fX()) {
         this.ck = true;
      }

      return super.C($$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.gt()) {
         if (this.dN().Z() && !this.aZ()) {
            this.w(true);
            this.y(false);
         } else if (!this.gl()) {
            this.w(false);
         }
      }

      bll $$0 = this.q();
      if ($$0 == null) {
         this.cj = false;
         this.ck = false;
      }

      if (this.u() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.u() == 29 || this.u() == 14) {
            this.a(aqv.rk, 1.0F, 1.0F);
         }

         this.t(this.u() - 1);
      }

      if (this.w()) {
         this.u(this.gm() + 1);
         if (this.gm() > 20) {
            this.z(false);
            this.gH();
         } else if (this.gm() == 1) {
            this.a(aqv.re, 1.0F, 1.0F);
         }
      }

      if (this.gp()) {
         this.gG();
      } else {
         this.bU = 0;
      }

      if (this.A()) {
         this.s(0.0F);
      }

      this.gD();
      this.gB();
      this.gE();
      this.gF();
   }

   public boolean gx() {
      return this.gt() && this.dN().Z();
   }

   private void gB() {
      if (!this.gl() && this.A() && !this.gx() && !this.c(bla.a).b() && this.ag.a(80) == 1) {
         this.y(true);
      } else if (this.c(bla.a).b() || !this.A()) {
         this.y(false);
      }

      if (this.gl()) {
         this.gC();
         if (!this.dN().B && this.gA() > 80 && this.ag.a(20) == 1) {
            if (this.gA() > 100 && this.l(this.c(bla.a))) {
               if (!this.dN().B) {
                  this.a(bla.a, clo.b);
                  this.a(dlx.m);
               }

               this.w(false);
            }

            this.y(false);
            return;
         }

         this.v(this.gA() + 1);
      }
   }

   private void gC() {
      if (this.gA() % 5 == 0) {
         this.a(aqv.ri, 0.5F + 0.5F * (float)this.ag.a(2), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            ejz $$1 = new ejz(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ag.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dF() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dD() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ag.i()) * 0.6 - 0.3;
            ejz $$3 = new ejz(((double)this.ag.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ag.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aU * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.ds(), this.dw() + 1.0, this.dy());
            this.dN().a(new js(jw.O, this.c(bla.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
         }
      }
   }

   private void gD() {
      this.cn = this.cm;
      if (this.A()) {
         this.cm = Math.min(1.0F, this.cm + 0.15F);
      } else {
         this.cm = Math.max(0.0F, this.cm - 0.19F);
      }
   }

   private void gE() {
      this.cp = this.co;
      if (this.gf()) {
         this.co = Math.min(1.0F, this.co + 0.15F);
      } else {
         this.co = Math.max(0.0F, this.co - 0.19F);
      }
   }

   private void gF() {
      this.cr = this.cq;
      if (this.gp()) {
         this.cq = Math.min(1.0F, this.cq + 0.15F);
      } else {
         this.cq = Math.max(0.0F, this.cq - 0.19F);
      }
   }

   public float E(float $$0) {
      return atq.i($$0, this.cn, this.cm);
   }

   public float F(float $$0) {
      return atq.i($$0, this.cp, this.co);
   }

   public float G(float $$0) {
      return atq.i($$0, this.cr, this.cq);
   }

   private void gG() {
      this.bU++;
      if (this.bU > 32) {
         this.A(false);
      } else {
         if (!this.dN().B) {
            ejz $$0 = this.dq();
            if (this.bU == 1) {
               float $$1 = this.dD() * (float) (Math.PI / 180.0);
               float $$2 = this.o_() ? 0.1F : 0.2F;
               this.cl = new ejz($$0.c + (double)(-atq.a($$1) * $$2), 0.0, $$0.e + (double)(atq.b($$1) * $$2));
               this.g(this.cl.b(0.0, 0.27, 0.0));
            } else if ((float)this.bU != 7.0F && (float)this.bU != 15.0F && (float)this.bU != 23.0F) {
               this.o(this.cl.c, $$0.d, this.cl.e);
            } else {
               this.o(0.0, this.aC() ? 0.27 : $$0.d, 0.0);
            }
         }
      }
   }

   private void gH() {
      ejz $$0 = this.dq();
      this.dN()
         .a(
            jw.ab,
            this.ds() - (double)(this.dh() + 1.0F) * 0.5 * (double)atq.a(this.aU * (float) (Math.PI / 180.0)),
            this.dw() - 0.1F,
            this.dy() + (double)(this.dh() + 1.0F) * 0.5 * (double)atq.b(this.aU * (float) (Math.PI / 180.0)),
            $$0.c,
            0.0,
            $$0.e
         );
      this.a(aqv.rf, 1.0F, 1.0F);

      for (bxl $$2 : this.dN().a(bxl.class, this.cH().g(10.0))) {
         if (!$$2.o_() && $$2.aC() && !$$2.aZ() && $$2.gz()) {
            $$2.fc();
         }
      }

      if (!this.dN().y_() && this.ag.a(700) == 0 && this.dN().Y().b(csb.f)) {
         this.a(clr.qN);
      }
   }

   @Override
   protected void b(cas $$0) {
      if (this.c(bla.a).b() && ct.test($$0)) {
         this.a($$0);
         clo $$1 = $$0.q();
         this.a(bla.a, $$1);
         this.e(bla.a);
         this.a($$0, $$1.L());
         $$0.am();
      }
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      if (!this.dN().B) {
         this.w(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      atw $$5 = $$0.F_();
      this.a(bxl.a.a($$5));
      this.b(bxl.a.a($$5));
      this.gy();
      if ($$3 == null) {
         $$3 = new bkq.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(bxl $$0, @Nullable bxl $$1) {
      if ($$1 == null) {
         if (this.ag.h()) {
            this.a($$0.gI());
            this.b(bxl.a.a(this.ag));
         } else {
            this.a(bxl.a.a(this.ag));
            this.b($$0.gI());
         }
      } else if (this.ag.h()) {
         this.a($$0.gI());
         this.b($$1.gI());
      } else {
         this.a($$1.gI());
         this.b($$0.gI());
      }

      if (this.ag.a(32) == 0) {
         this.a(bxl.a.a(this.ag));
      }

      if (this.ag.a(32) == 0) {
         this.b(bxl.a.a(this.ag));
      }
   }

   private bxl.a gI() {
      return this.ag.h() ? this.gn() : this.go();
   }

   public void gy() {
      if (this.gw()) {
         this.a(bmr.l).a(10.0);
      }

      if (this.gs()) {
         this.a(bmr.m).a(0.07F);
      }
   }

   void gJ() {
      if (!this.aZ()) {
         this.A(0.0F);
         this.N().n();
         this.w(true);
      }
   }

   @Override
   public bjb b(cdz $$0, bja $$1) {
      clo $$2 = $$0.b($$1);
      if (this.gx()) {
         return bjb.d;
      } else if (this.gf()) {
         this.x(false);
         return bjb.a(this.dN().B);
      } else if (this.m($$2)) {
         if (this.q() != null) {
            this.cj = true;
         }

         if (this.o_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.h() / 20) * 0.1F), true);
         } else if (!this.dN().B && this.h() == 0 && this.gg()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
         } else {
            if (this.dN().B || this.A() || this.aZ()) {
               return bjb.d;
            }

            this.gJ();
            this.y(true);
            clo $$3 = this.c(bla.a);
            if (!$$3.b() && !$$0.fU().d) {
               this.b($$3);
            }

            this.a(bla.a, new clo($$2.d(), 1));
            this.a($$0, $$1, $$2);
         }

         return bjb.a;
      } else {
         return bjb.d;
      }
   }

   @Nullable
   @Override
   protected aqu y() {
      if (this.fX()) {
         return aqv.rl;
      } else {
         return this.gt() ? aqv.rm : aqv.rg;
      }
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
      this.a(aqv.rj, 0.15F, 1.0F);
   }

   @Override
   public boolean m(clo $$0) {
      return $$0.a(cvh.mZ.k());
   }

   private boolean l(clo $$0) {
      return this.m($$0) || $$0.a(cvh.eg.k());
   }

   @Nullable
   @Override
   protected aqu n_() {
      return aqv.rh;
   }

   @Nullable
   @Override
   protected aqu d(bjt $$0) {
      return aqv.rn;
   }

   public boolean gz() {
      return !this.gf() && !this.gx() && !this.gl() && !this.gp() && !this.A();
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - (this.o_() ? 0.4375F : 0.0F) * $$2, 0.0F);
   }

   public static enum a implements auk {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final auk.a<bxl.a> h = auk.a(bxl.a::values);
      private static final IntFunction<bxl.a> i = asj.a(bxl.a::a, values(), asj.a.a);
      private static final int j = 6;
      private final int k;
      private final String l;
      private final boolean m;

      private a(int $$0, String $$1, boolean $$2) {
         this.k = $$0;
         this.l = $$1;
         this.m = $$2;
      }

      public int a() {
         return this.k;
      }

      @Override
      public String c() {
         return this.l;
      }

      public boolean b() {
         return this.m;
      }

      static bxl.a a(bxl.a $$0, bxl.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static bxl.a a(int $$0) {
         return i.apply($$0);
      }

      public static bxl.a a(String $$0) {
         return h.a($$0, a);
      }

      public static bxl.a a(atw $$0) {
         int $$1 = $$0.a(16);
         if ($$1 == 0) {
            return b;
         } else if ($$1 == 1) {
            return c;
         } else if ($$1 == 2) {
            return d;
         } else if ($$1 == 4) {
            return g;
         } else if ($$1 < 9) {
            return f;
         } else {
            return $$1 < 11 ? e : a;
         }
      }
   }

   static class b extends bsq {
      private final bxl b;

      public b(bxl $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.gz() && super.a();
      }
   }

   static class c<T extends bll> extends brn<T> {
      private final bxl i;

      public c(bxl $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bky.f::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gt() && this.i.gz() && super.a();
      }
   }

   static class d extends brs {
      private final bxl d;
      private int e;

      public d(bxl $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         if (!super.a() || this.d.u() != 0) {
            return false;
         } else if (!this.h()) {
            if (this.e <= this.d.ah) {
               this.d.t(32);
               this.e = this.d.ah + 600;
               if (this.d.cZ()) {
                  cdz $$0 = this.b.a(bxl.cc, this.d);
                  this.d.cs.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         hx $$0 = this.d.dn();
         hx.a $$1 = new hx.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(cvh.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends bty {
      private final bxl a;

      public e(bxl $$0, Class<?>... $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.cj && !this.a.ck) {
            return super.b();
         } else {
            this.a.h(null);
            return false;
         }
      }

      @Override
      protected void a(bln $$0, bll $$1) {
         if ($$0 instanceof bxl && $$0.fX()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends bsg {
      private final bxl a;
      private int b;

      public f(bxl $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         return this.b < this.a.ah && this.a.gs() && this.a.gz() && this.a.ag.a(b(400)) == 1;
      }

      @Override
      public boolean b() {
         return !this.a.aZ() && (this.a.gs() || this.a.ag.a(b(600)) != 1) ? this.a.ag.a(b(2000)) != 1 : false;
      }

      @Override
      public void c() {
         this.a.x(true);
         this.b = 0;
      }

      @Override
      public void d() {
         this.a.x(false);
         this.b = this.a.ah + 200;
      }
   }

   static class g extends bso {
      private final bxl h;

      public g(bxl $$0, Class<? extends bll> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bll $$0) {
         this.c = $$0;
      }

      @Override
      public boolean b() {
         return this.c != null && super.b();
      }

      @Override
      public boolean a() {
         if (this.b.eh().i() >= this.e) {
            return false;
         } else {
            if (this.c == null) {
               if (this.f == cdz.class) {
                  this.c = this.b.dN().a(this.g, this.b, this.b.ds(), this.b.dw(), this.b.dy());
               } else {
                  this.c = this.b
                     .dN()
                     .a(
                        this.b.dN().a(this.f, this.b.cH().c((double)this.d, 3.0, (double)this.d), $$0 -> true),
                        this.g,
                        this.b,
                        this.b.ds(),
                        this.b.dw(),
                        this.b.dy()
                     );
               }
            }

            return this.h.gz() && this.c != null;
         }
      }

      @Override
      public void e() {
         if (this.c != null) {
            super.e();
         }
      }
   }

   static class h extends brj {
      private final bxl l;

      public h(bxl $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.gz()) {
            super.a();
         }
      }
   }

   static class i extends bsz {
      private final bxl h;

      public i(bxl $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      protected boolean h() {
         return this.b.dC() || this.b.bN();
      }

      @Override
      public boolean b() {
         if (this.h.A()) {
            this.h.N().n();
            return false;
         } else {
            return super.b();
         }
      }
   }

   static class j extends bsg {
      private final bxl a;

      public j(bxl $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bsg.a.a, bsg.a.b, bsg.a.c));
      }

      @Override
      public boolean a() {
         if ((this.a.o_() || this.a.gu()) && this.a.aC()) {
            if (!this.a.gz()) {
               return false;
            } else {
               float $$0 = this.a.dD() * (float) (Math.PI / 180.0);
               float $$1 = -atq.a($$0);
               float $$2 = atq.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? atq.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? atq.j((double)$$2) : 0;
               if (this.a.dN().a_(this.a.dn().b($$3, -1, $$4)).i()) {
                  return true;
               } else {
                  return this.a.gu() && this.a.ag.a(b(60)) == 1 ? true : this.a.ag.a(b(500)) == 1;
               }
            }
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void c() {
         this.a.A(true);
      }

      @Override
      public boolean S_() {
         return false;
      }
   }

   class k extends bsg {
      private int b;

      public k() {
         this.a(EnumSet.of(bsg.a.a));
      }

      @Override
      public boolean a() {
         if (this.b <= bxl.this.ah && !bxl.this.o_() && !bxl.this.aZ() && bxl.this.gz() && bxl.this.u() <= 0) {
            List<cas> $$0 = bxl.this.dN().a(cas.class, bxl.this.cH().c(6.0, 6.0, 6.0), bxl.ct);
            return !$$0.isEmpty() || !bxl.this.c(bla.a).b();
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return !bxl.this.aZ() && (bxl.this.gs() || bxl.this.ag.a(b(600)) != 1) ? bxl.this.ag.a(b(2000)) != 1 : false;
      }

      @Override
      public void e() {
         if (!bxl.this.A() && !bxl.this.c(bla.a).b()) {
            bxl.this.gJ();
         }
      }

      @Override
      public void c() {
         List<cas> $$0 = bxl.this.dN().a(cas.class, bxl.this.cH().c(8.0, 8.0, 8.0), bxl.ct);
         if (!$$0.isEmpty() && bxl.this.c(bla.a).b()) {
            bxl.this.N().a($$0.get(0), 1.2F);
         } else if (!bxl.this.c(bla.a).b()) {
            bxl.this.gJ();
         }

         this.b = 0;
      }

      @Override
      public void d() {
         clo $$0 = bxl.this.c(bla.a);
         if (!$$0.b()) {
            bxl.this.b($$0);
            bxl.this.a(bla.a, clo.b);
            int $$1 = bxl.this.gs() ? bxl.this.ag.a(50) + 10 : bxl.this.ag.a(150) + 10;
            this.b = bxl.this.ah + $$1 * 20;
         }

         bxl.this.w(false);
      }
   }

   static class l extends bsg {
      private final bxl a;

      public l(bxl $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.o_() && this.a.gz()) {
            return this.a.gw() && this.a.ag.a(b(500)) == 1 ? true : this.a.ag.a(b(6000)) == 1;
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void c() {
         this.a.z(true);
      }
   }
}
