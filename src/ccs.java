import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ccs extends ccd {
   private static final aiy<Integer> ca = ajc.a(ccs.class, aja.b);
   private static final aiy<Integer> cb = ajc.a(ccs.class, aja.b);
   private static final aiy<Integer> cc = ajc.a(ccs.class, aja.b);
   private static final aiy<Byte> cd = ajc.a(ccs.class, aja.a);
   private static final aiy<Byte> ce = ajc.a(ccs.class, aja.a);
   private static final aiy<Byte> cf = ajc.a(ccs.class, aja.a);
   static final cbe cg = cbe.b().a(8.0);
   private static final bpy ch = bqb.av.n().a(0.5F).a(bpx.a().a(bpw.a, 0.0F, 0.40625F, 0.0F));
   private static final int ci = 2;
   private static final int cj = 4;
   private static final int ck = 8;
   private static final int cl = 16;
   private static final int cm = 5;
   public static final int bX = 32;
   private static final int cn = 32;
   boolean co;
   boolean cp;
   public int bY;
   private esa cq;
   private float cr;
   private float cs;
   private float ct;
   private float cu;
   private float cv;
   private float cw;
   ccs.g cx;
   static final Predicate<cgd> cz = $$0 -> {
      crj $$1 = $$0.p();
      return ($$1.a(dca.mZ.p()) || $$1.a(dca.eg.p())) && $$0.bA() && !$$0.y();
   };

   public ccs(bqb<? extends ccs> $$0, cyx $$1) {
      super($$0, $$1);
      this.bO = new ccs.h(this);
      if (!this.p_()) {
         this.s(true);
      }
   }

   @Override
   public boolean f(crj $$0) {
      bqc $$1 = bqq.h($$0);
      return !this.d($$1).d() ? false : $$1 == bqc.a && super.f($$0);
   }

   public int r() {
      return this.an.a(ca);
   }

   public void u(int $$0) {
      this.an.a(ca, $$0);
   }

   public boolean u() {
      return this.x(2);
   }

   public boolean y() {
      return this.x(8);
   }

   public void w(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gn() {
      return this.x(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gt() {
      return this.an.a(cc) > 0;
   }

   public void y(boolean $$0) {
      this.an.a(cc, $$0 ? 1 : 0);
   }

   private int gI() {
      return this.an.a(cc);
   }

   private void w(int $$0) {
      this.an.a(cc, $$0);
   }

   public void z(boolean $$0) {
      this.d(2, $$0);
      if (!$$0) {
         this.v(0);
      }
   }

   public int gu() {
      return this.an.a(cb);
   }

   public void v(int $$0) {
      this.an.a(cb, $$0);
   }

   public ccs.a gv() {
      return ccs.a.a(this.an.a(cd));
   }

   public void a(ccs.a $$0) {
      if ($$0.a() > 6) {
         $$0 = ccs.a.a(this.ag);
      }

      this.an.a(cd, (byte)$$0.a());
   }

   public ccs.a gw() {
      return ccs.a.a(this.an.a(ce));
   }

   public void b(ccs.a $$0) {
      if ($$0.a() > 6) {
         $$0 = ccs.a.a(this.ag);
      }

      this.an.a(ce, (byte)$$0.a());
   }

   public boolean gx() {
      return this.x(4);
   }

   public void A(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(ca, 0);
      $$0.a(cb, 0);
      $$0.a(cd, (byte)0);
      $$0.a(ce, (byte)0);
      $$0.a(cf, (byte)0);
      $$0.a(cc, 0);
   }

   private boolean x(int $$0) {
      return (this.an.a(cf) & $$0) != 0;
   }

   private void d(int $$0, boolean $$1) {
      byte $$2 = this.an.a(cf);
      if ($$1) {
         this.an.a(cf, (byte)($$2 | $$0));
      } else {
         this.an.a(cf, (byte)($$2 & ~$$0));
      }
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gv().c());
      $$0.a("HiddenGene", this.gw().c());
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.a(ccs.a.a($$0.l("MainGene")));
      this.b(ccs.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public bpp a(aps $$0, bpp $$1) {
      ccs $$2 = bqb.av.a((cyx)$$0);
      if ($$2 != null) {
         if ($$1 instanceof ccs $$3) {
            $$2.a(this, $$3);
         }

         $$2.gG();
      }

      return $$2;
   }

   @Override
   protected void z() {
      this.bR.a(0, new bxf(this));
      this.bR.a(2, new ccs.i(this, 2.0));
      this.bR.a(2, new ccs.d(this, 1.0));
      this.bR.a(3, new ccs.b(this, 1.2F, true));
      this.bR.a(4, new byt(this, 1.0, cvg.a(dca.mZ.p()), false));
      this.bR.a(6, new ccs.c<>(this, cjt.class, 8.0F, 2.0, 2.0));
      this.bR.a(6, new ccs.c<>(this, cgz.class, 4.0F, 2.0, 2.0));
      this.bR.a(7, new ccs.k());
      this.bR.a(8, new ccs.f(this));
      this.bR.a(8, new ccs.l(this));
      this.cx = new ccs.g(this, cjt.class, 6.0F);
      this.bR.a(9, this.cx);
      this.bR.a(10, new byg(this));
      this.bR.a(12, new ccs.j(this));
      this.bR.a(13, new bxk(this, 1.25));
      this.bR.a(14, new byy(this, 1.0));
      this.bS.a(1, new ccs.e(this).a(new Class[0]));
   }

   public static bru.a gy() {
      return bqq.A().a(brv.r, 0.15F).a(brv.c, 6.0);
   }

   public ccs.a gz() {
      return ccs.a.a(this.gv(), this.gw());
   }

   public boolean gA() {
      return this.gz() == ccs.a.b;
   }

   public boolean gB() {
      return this.gz() == ccs.a.c;
   }

   public boolean gC() {
      return this.gz() == ccs.a.d;
   }

   public boolean gD() {
      return this.gz() == ccs.a.e;
   }

   public boolean gE() {
      return this.gz() == ccs.a.f;
   }

   @Override
   public boolean gf() {
      return this.gz() == ccs.a.g;
   }

   @Override
   public boolean a(cjt $$0) {
      return false;
   }

   @Override
   public boolean C(bpv $$0) {
      this.a(aum.si, 1.0F, 1.0F);
      if (!this.gf()) {
         this.cp = true;
      }

      return super.C($$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.gB()) {
         if (this.dM().ab() && !this.bc()) {
            this.w(true);
            this.y(false);
         } else if (!this.gt()) {
            this.w(false);
         }
      }

      bqo $$0 = this.p();
      if ($$0 == null) {
         this.co = false;
         this.cp = false;
      }

      if (this.r() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.r() == 29 || this.r() == 14) {
            this.a(aum.se, 1.0F, 1.0F);
         }

         this.u(this.r() - 1);
      }

      if (this.u()) {
         this.v(this.gu() + 1);
         if (this.gu() > 20) {
            this.z(false);
            this.gP();
         } else if (this.gu() == 1) {
            this.a(aum.rY, 1.0F, 1.0F);
         }
      }

      if (this.gx()) {
         this.gO();
      } else {
         this.bY = 0;
      }

      if (this.y()) {
         this.s(0.0F);
      }

      this.gL();
      this.gJ();
      this.gM();
      this.gN();
   }

   public boolean gF() {
      return this.gB() && this.dM().ab();
   }

   private void gJ() {
      if (!this.gt() && this.y() && !this.gF() && !this.d(bqc.a).d() && this.ag.a(80) == 1) {
         this.y(true);
      } else if (this.d(bqc.a).d() || !this.y()) {
         this.y(false);
      }

      if (this.gt()) {
         this.gK();
         if (!this.dM().B && this.gI() > 80 && this.ag.a(20) == 1) {
            if (this.gI() > 100 && this.n(this.d(bqc.a))) {
               if (!this.dM().B) {
                  this.a(bqc.a, crj.i);
                  this.a(dts.m);
               }

               this.w(false);
            }

            this.y(false);
            return;
         }

         this.w(this.gI() + 1);
      }
   }

   private void gK() {
      if (this.gI() % 5 == 0) {
         this.a(aum.sc, 0.5F + 0.5F * (float)this.ag.a(2), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            esa $$1 = new esa(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ag.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dE() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dC() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ag.i()) * 0.6 - 0.3;
            esa $$3 = new esa(((double)this.ag.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ag.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aX * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dr(), this.dv() + 1.0, this.dx());
            this.dM().a(new kh(kl.R, this.d(bqc.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
         }
      }
   }

   private void gL() {
      this.cs = this.cr;
      if (this.y()) {
         this.cr = Math.min(1.0F, this.cr + 0.15F);
      } else {
         this.cr = Math.max(0.0F, this.cr - 0.19F);
      }
   }

   private void gM() {
      this.cu = this.ct;
      if (this.gn()) {
         this.ct = Math.min(1.0F, this.ct + 0.15F);
      } else {
         this.ct = Math.max(0.0F, this.ct - 0.19F);
      }
   }

   private void gN() {
      this.cw = this.cv;
      if (this.gx()) {
         this.cv = Math.min(1.0F, this.cv + 0.15F);
      } else {
         this.cv = Math.max(0.0F, this.cv - 0.19F);
      }
   }

   public float G(float $$0) {
      return axk.i($$0, this.cs, this.cr);
   }

   public float H(float $$0) {
      return axk.i($$0, this.cu, this.ct);
   }

   public float I(float $$0) {
      return axk.i($$0, this.cw, this.cv);
   }

   private void gO() {
      this.bY++;
      if (this.bY > 32) {
         this.A(false);
      } else {
         if (!this.dM().B) {
            esa $$0 = this.dp();
            if (this.bY == 1) {
               float $$1 = this.dC() * (float) (Math.PI / 180.0);
               float $$2 = this.p_() ? 0.1F : 0.2F;
               this.cq = new esa($$0.c + (double)(-axk.a($$1) * $$2), 0.0, $$0.e + (double)(axk.b($$1) * $$2));
               this.g(this.cq.b(0.0, 0.27, 0.0));
            } else if ((float)this.bY != 7.0F && (float)this.bY != 15.0F && (float)this.bY != 23.0F) {
               this.o(this.cq.c, $$0.d, this.cq.e);
            } else {
               this.o(0.0, this.aC() ? 0.27 : $$0.d, 0.0);
            }
         }
      }
   }

   private void gP() {
      esa $$0 = this.dp();
      cyx $$1 = this.dM();
      $$1.a(
         kl.ae,
         this.dr() - (double)(this.dg() + 1.0F) * 0.5 * (double)axk.a(this.aX * (float) (Math.PI / 180.0)),
         this.dv() - 0.1F,
         this.dx() + (double)(this.dg() + 1.0F) * 0.5 * (double)axk.b(this.aX * (float) (Math.PI / 180.0)),
         $$0.c,
         0.0,
         $$0.e
      );
      this.a(aum.rZ, 1.0F, 1.0F);

      for (ccs $$3 : $$1.a(ccs.class, this.cH().g(10.0))) {
         if (!$$3.p_() && $$3.aC() && !$$3.bc() && $$3.gH()) {
            $$3.fg();
         }
      }

      if (!$$1.x_() && $$1.aa().b(cyt.f)) {
         aps $$4 = (aps)$$1;
         enj $$5 = $$4.o().aM().getLootTable(emz.aL);
         enh $$6 = new enh.a($$4).a(epo.f, this.dk()).a(epo.a, this).a(epn.i);

         for (crj $$8 : $$5.a($$6)) {
            this.b($$8);
         }
      }
   }

   @Override
   protected void b(cgd $$0) {
      if (this.d(bqc.a).d() && cz.test($$0)) {
         this.a($$0);
         crj $$1 = $$0.p();
         this.a(bqc.a, $$1);
         this.f(bqc.a);
         this.a($$0, $$1.G());
         $$0.am();
      }
   }

   @Override
   public boolean a(bot $$0, float $$1) {
      if (!this.dM().B) {
         this.w(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      axr $$4 = $$0.E_();
      this.a(ccs.a.a($$4));
      this.b(ccs.a.a($$4));
      this.gG();
      if ($$3 == null) {
         $$3 = new bpp.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(ccs $$0, @Nullable ccs $$1) {
      if ($$1 == null) {
         if (this.ag.h()) {
            this.a($$0.gQ());
            this.b(ccs.a.a(this.ag));
         } else {
            this.a(ccs.a.a(this.ag));
            this.b($$0.gQ());
         }
      } else if (this.ag.h()) {
         this.a($$0.gQ());
         this.b($$1.gQ());
      } else {
         this.a($$1.gQ());
         this.b($$0.gQ());
      }

      if (this.ag.a(32) == 0) {
         this.a(ccs.a.a(this.ag));
      }

      if (this.ag.a(32) == 0) {
         this.b(ccs.a.a(this.ag));
      }
   }

   private ccs.a gQ() {
      return this.ag.h() ? this.gv() : this.gw();
   }

   public void gG() {
      if (this.gE()) {
         this.f(brv.q).a(10.0);
      }

      if (this.gA()) {
         this.f(brv.r).a(0.07F);
      }
   }

   void gR() {
      if (!this.bc()) {
         this.C(0.0F);
         this.K().n();
         this.w(true);
      }
   }

   @Override
   public boa b(cjt $$0, bnz $$1) {
      crj $$2 = $$0.b($$1);
      if (this.gF()) {
         return boa.d;
      } else if (this.gn()) {
         this.x(false);
         return boa.a(this.dM().B);
      } else if (this.o($$2)) {
         if (this.p() != null) {
            this.co = true;
         }

         if (this.p_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.g() / 20) * 0.1F), true);
         } else if (!this.dM().B && this.g() == 0 && this.go()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
         } else {
            if (this.dM().B || this.y() || this.bc()) {
               return boa.d;
            }

            this.gR();
            this.y(true);
            crj $$3 = this.d(bqc.a);
            if (!$$3.d() && !$$0.fM()) {
               this.b($$3);
            }

            this.a(bqc.a, new crj($$2.f(), 1));
            this.a($$0, $$1, $$2);
         }

         return boa.a;
      } else {
         return boa.d;
      }
   }

   @Nullable
   @Override
   protected aul v() {
      if (this.gf()) {
         return aum.sf;
      } else {
         return this.gB() ? aum.sg : aum.sa;
      }
   }

   @Override
   protected void b(ib $$0, doz $$1) {
      this.a(aum.sd, 0.15F, 1.0F);
   }

   @Override
   public boolean o(crj $$0) {
      return $$0.a(dca.mZ.p());
   }

   private boolean n(crj $$0) {
      return this.o($$0) || $$0.a(dca.eg.p());
   }

   @Nullable
   @Override
   protected aul o_() {
      return aum.sb;
   }

   @Nullable
   @Override
   protected aul d(bot $$0) {
      return aum.sh;
   }

   public boolean gH() {
      return !this.gn() && !this.gF() && !this.gt() && !this.gx() && !this.y();
   }

   @Override
   public bpy e(bqz $$0) {
      return this.p_() ? ch : super.e($$0);
   }

   public static enum a implements aye {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final aye.a<ccs.a> h = aye.a(ccs.a::values);
      private static final IntFunction<ccs.a> i = awb.a(ccs.a::a, values(), awb.a.a);
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

      static ccs.a a(ccs.a $$0, ccs.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static ccs.a a(int $$0) {
         return i.apply($$0);
      }

      public static ccs.a a(String $$0) {
         return h.a($$0, a);
      }

      public static ccs.a a(axr $$0) {
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

   static class b extends bxv {
      private final ccs b;

      public b(ccs $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.gH() && super.a();
      }
   }

   static class c<T extends bqo> extends bws<T> {
      private final ccs i;

      public c(ccs $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bqa.f::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gB() && this.i.gH() && super.a();
      }
   }

   static class d extends bwx {
      private final ccs d;
      private int e;

      public d(ccs $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         if (!super.a() || this.d.r() != 0) {
            return false;
         } else if (!this.h()) {
            if (this.e <= this.d.ah) {
               this.d.u(32);
               this.e = this.d.ah + 600;
               if (this.d.cY()) {
                  cjt $$0 = this.b.a(ccs.cg, this.d);
                  this.d.cx.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         ib $$0 = this.d.dm();
         ib.a $$1 = new ib.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(dca.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends bzd {
      private final ccs a;

      public e(ccs $$0, Class<?>... $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.co && !this.a.cp) {
            return super.b();
         } else {
            this.a.h(null);
            return false;
         }
      }

      @Override
      protected void a(bqq $$0, bqo $$1) {
         if ($$0 instanceof ccs && $$0.gf()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends bxl {
      private final ccs a;
      private int b;

      public f(ccs $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         return this.b < this.a.ah && this.a.gA() && this.a.gH() && this.a.ag.a(b(400)) == 1;
      }

      @Override
      public boolean b() {
         return !this.a.bc() && (this.a.gA() || this.a.ag.a(b(600)) != 1) ? this.a.ag.a(b(2000)) != 1 : false;
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

   static class g extends bxt {
      private final ccs h;

      public g(ccs $$0, Class<? extends bqo> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bqo $$0) {
         this.c = $$0;
      }

      @Override
      public boolean b() {
         return this.c != null && super.b();
      }

      @Override
      public boolean a() {
         if (this.b.ei().i() >= this.e) {
            return false;
         } else {
            if (this.c == null) {
               if (this.f == cjt.class) {
                  this.c = this.b.dM().a(this.g, this.b, this.b.dr(), this.b.dv(), this.b.dx());
               } else {
                  this.c = this.b
                     .dM()
                     .a(
                        this.b.dM().a(this.f, this.b.cH().c((double)this.d, 3.0, (double)this.d), $$0 -> true),
                        this.g,
                        this.b,
                        this.b.dr(),
                        this.b.dv(),
                        this.b.dx()
                     );
               }
            }

            return this.h.gH() && this.c != null;
         }
      }

      @Override
      public void e() {
         if (this.c != null) {
            super.e();
         }
      }
   }

   static class h extends bwo {
      private final ccs l;

      public h(ccs $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.gH()) {
            super.a();
         }
      }
   }

   static class i extends bye {
      private final ccs h;

      public i(ccs $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      protected boolean h() {
         return this.b.dB() || this.b.bN();
      }

      @Override
      public boolean b() {
         if (this.h.y()) {
            this.h.K().n();
            return false;
         } else {
            return super.b();
         }
      }
   }

   static class j extends bxl {
      private final ccs a;

      public j(ccs $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bxl.a.a, bxl.a.b, bxl.a.c));
      }

      @Override
      public boolean a() {
         if ((this.a.p_() || this.a.gC()) && this.a.aC()) {
            if (!this.a.gH()) {
               return false;
            } else {
               float $$0 = this.a.dC() * (float) (Math.PI / 180.0);
               float $$1 = -axk.a($$0);
               float $$2 = axk.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? axk.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? axk.j((double)$$2) : 0;
               if (this.a.dM().a_(this.a.dm().b($$3, -1, $$4)).i()) {
                  return true;
               } else {
                  return this.a.gC() && this.a.ag.a(b(60)) == 1 ? true : this.a.ag.a(b(500)) == 1;
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
      public boolean Q_() {
         return false;
      }
   }

   class k extends bxl {
      private int b;

      public k() {
         this.a(EnumSet.of(bxl.a.a));
      }

      @Override
      public boolean a() {
         if (this.b <= ccs.this.ah && !ccs.this.p_() && !ccs.this.bc() && ccs.this.gH() && ccs.this.r() <= 0) {
            List<cgd> $$0 = ccs.this.dM().a(cgd.class, ccs.this.cH().c(6.0, 6.0, 6.0), ccs.cz);
            return !$$0.isEmpty() || !ccs.this.d(bqc.a).d();
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return !ccs.this.bc() && (ccs.this.gA() || ccs.this.ag.a(b(600)) != 1) ? ccs.this.ag.a(b(2000)) != 1 : false;
      }

      @Override
      public void e() {
         if (!ccs.this.y() && !ccs.this.d(bqc.a).d()) {
            ccs.this.gR();
         }
      }

      @Override
      public void c() {
         List<cgd> $$0 = ccs.this.dM().a(cgd.class, ccs.this.cH().c(8.0, 8.0, 8.0), ccs.cz);
         if (!$$0.isEmpty() && ccs.this.d(bqc.a).d()) {
            ccs.this.K().a($$0.get(0), 1.2F);
         } else if (!ccs.this.d(bqc.a).d()) {
            ccs.this.gR();
         }

         this.b = 0;
      }

      @Override
      public void d() {
         crj $$0 = ccs.this.d(bqc.a);
         if (!$$0.d()) {
            ccs.this.b($$0);
            ccs.this.a(bqc.a, crj.i);
            int $$1 = ccs.this.gA() ? ccs.this.ag.a(50) + 10 : ccs.this.ag.a(150) + 10;
            this.b = ccs.this.ah + $$1 * 20;
         }

         ccs.this.w(false);
      }
   }

   static class l extends bxl {
      private final ccs a;

      public l(ccs $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.p_() && this.a.gH()) {
            return this.a.gE() && this.a.ag.a(b(500)) == 1 ? true : this.a.ag.a(b(6000)) == 1;
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
