import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cgl extends cgh implements btn<cgl.d>, cji {
   private static final int ci = 5;
   private static final ajy<Integer> ck = akc.a(cgl.class, aka.b);
   private static final ajy<Integer> cl = akc.a(cgl.class, aka.b);
   private static final bry cm = bsb.ao.n().a(brx.a().a(brw.a, 0.0F, bsb.ao.l() - 0.8125F, -0.3F)).a(0.5F);
   boolean cn;
   @Nullable
   private cgl co;
   @Nullable
   private cgl cp;

   public cgl(bsb<? extends cgl> $$0, dca $$1) {
      super($$0, $$1);
   }

   public boolean gH() {
      return false;
   }

   private void y(int $$0) {
      this.as.a(ck, Math.max(1, Math.min(5, $$0)));
   }

   private void b(ayt $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.y(1 + $$0.a($$1));
   }

   public int gI() {
      return this.as.a(ck);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Variant", this.gK().g);
      $$0.a("Strength", this.gI());
   }

   @Override
   public void a(uk $$0) {
      this.y($$0.h("Strength"));
      super.a($$0);
      this.a(cgl.d.a($$0.h("Variant")));
   }

   @Override
   protected void y() {
      this.cb.a(0, new bzf(this));
      this.cb.a(1, new cap(this, 1.2));
      this.cb.a(2, new bzs(this, 2.1F));
      this.cb.a(3, new cak(this, 1.25, 40, 20.0F));
      this.cb.a(3, new cae(this, 1.2));
      this.cb.a(4, new byx(this, 1.0));
      this.cb.a(5, new cat(this, 1.25, $$0 -> $$0.a(awm.ao), false));
      this.cb.a(6, new bzk(this, 1.0));
      this.cb.a(7, new cay(this, 0.7));
      this.cb.a(8, new bzt(this, cly.class, 6.0F));
      this.cb.a(9, new cag(this));
      this.cc.a(1, new cgl.c(this));
      this.cc.a(2, new cgl.a(this));
   }

   public static btu.a gJ() {
      return r().a(btv.k, 40.0);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(ck, 0);
      $$0.a(cl, 0);
   }

   public cgl.d gK() {
      return cgl.d.a(this.as.a(cl));
   }

   public void a(cgl.d $$0) {
      this.as.a(cl, $$0.g);
   }

   @Override
   protected int ac_() {
      return this.t() ? 1 + 3 * this.gG() : super.ac_();
   }

   @Override
   public boolean o(cuh $$0) {
      return $$0.a(awm.an);
   }

   @Override
   protected boolean a(cly $$0, cuh $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cuk.qP)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dfe.jd.q())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gN() && this.g() == 0 && this.gz()) {
            $$5 = true;
            this.g($$0);
         }
      }

      if (this.eI() < this.eZ() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.o_() && $$2 > 0) {
         this.dU().a(lb.M, this.d(1.0), this.dC() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dU().C) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gN()) && this.gT() < this.gY()) {
         $$5 = true;
         if (!this.dU().C) {
            this.x($$3);
         }
      }

      if ($$5 && !this.ba()) {
         avn $$6 = this.gF();
         if ($$6 != null) {
            this.dU().a(null, this.dz(), this.dB(), this.dF(), this.gF(), this.dj(), 1.0F, 1.0F + (this.al.i() - this.al.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean fp() {
      return this.eJ() || this.gQ();
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      ayt $$4 = $$0.F_();
      this.b($$4);
      cgl.d $$5;
      if ($$3 instanceof cgl.b) {
         $$5 = ((cgl.b)$$3).a;
      } else {
         $$5 = ad.a(cgl.d.values(), $$4);
         $$3 = new cgl.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gE() {
      return false;
   }

   @Override
   protected avn gW() {
      return avo.op;
   }

   @Override
   protected avn u() {
      return avo.oo;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.ot;
   }

   @Override
   protected avn n_() {
      return avo.or;
   }

   @Nullable
   @Override
   protected avn gF() {
      return avo.os;
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
      this.a(avo.ov, 0.15F, 1.0F);
   }

   @Override
   protected void gy() {
      this.a(avo.oq, 1.0F, (this.al.i() - this.al.i()) * 0.2F + 1.0F);
   }

   @Override
   public int gG() {
      return this.gI();
   }

   @Override
   public boolean ga() {
      return true;
   }

   @Override
   public boolean l(cuh $$0) {
      return $$0.a(awm.g);
   }

   @Override
   public boolean f() {
      return false;
   }

   @Override
   public void a(bpt $$0) {
      csy $$1 = this.gL();
      super.a($$0);
      csy $$2 = this.gL();
      if (this.am > 20 && $$2 != null && $$2 != $$1) {
         this.a(avo.ow, 0.5F, 1.0F);
      }
   }

   @Nullable
   private static csy n(cuh $$0) {
      dfc $$1 = dfc.a($$0.f());
      return $$1 instanceof dpo ? ((dpo)$$1).b() : null;
   }

   @Nullable
   public csy gL() {
      return n(this.d(bsc.g));
   }

   @Override
   public int gY() {
      return 30;
   }

   @Override
   public boolean a(cee $$0) {
      return $$0 != this && $$0 instanceof cgl && this.hf() && ((cgl)$$0).hf();
   }

   @Nullable
   public cgl b(aqt $$0, brp $$1) {
      cgl $$2 = this.gM();
      if ($$2 != null) {
         this.a($$1, $$2);
         cgl $$3 = (cgl)$$1;
         int $$4 = this.al.a(Math.max(this.gI(), $$3.gI())) + 1;
         if (this.al.i() < 0.03F) {
            $$4++;
         }

         $$2.y($$4);
         $$2.a(this.al.h() ? this.gK() : $$3.gK());
      }

      return $$2;
   }

   @Nullable
   protected cgl gM() {
      return bsb.ao.a(this.dU());
   }

   private void k(bso $$0) {
      cmr $$1 = new cmr(this.dU(), this);
      double $$2 = $$0.dz() - this.dz();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dB();
      double $$4 = $$0.dF() - this.dF();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.ba()) {
         this.dU().a(null, this.dz(), this.dB(), this.dF(), avo.ou, this.dj(), 1.0F, 1.0F + (this.al.i() - this.al.i()) * 0.2F);
      }

      this.dU().b($$1);
      this.cn = true;
   }

   void D(boolean $$0) {
      this.cn = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bqt $$2) {
      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bX()) {
               for (brv $$4 : this.db()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eV();
         return true;
      }
   }

   public void hi() {
      if (this.co != null) {
         this.co.cp = null;
      }

      this.co = null;
   }

   public void a(cgl $$0) {
      this.co = $$0;
      this.co.cp = this;
   }

   public boolean hj() {
      return this.cp != null;
   }

   public boolean hk() {
      return this.co != null;
   }

   @Nullable
   public cgl hl() {
      return this.co;
   }

   @Override
   protected double gx() {
      return 2.0;
   }

   @Override
   protected void gZ() {
      if (!this.hk() && this.o_()) {
         super.gZ();
      }
   }

   @Override
   public boolean ha() {
      return false;
   }

   @Override
   public void a(bso $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public ewu cR() {
      return new ewu(0.0, 0.75 * (double)this.cQ(), (double)this.do() * 0.5);
   }

   @Override
   public bry e(bsz $$0) {
      return this.o_() ? cm : super.e($$0);
   }

   @Override
   protected ewu a(brv $$0, bry $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends cbe<cfh> {
      public a(cgl $$0) {
         super($$0, cfh.class, 16, false, true, $$0x -> !((cfh)$$0x).r());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends brp.a {
      public final cgl.d a;

      b(cgl.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends cbd {
      public c(cgl $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof cgl $$0 && $$0.cn) {
            $$0.D(false);
            return false;
         }

         return super.b();
      }
   }

   public static enum d implements azg {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<cgl.d> e = azg.a(cgl.d::values);
      private static final IntFunction<cgl.d> f = axd.a(cgl.d::a, values(), axd.a.c);
      final int g;
      private final String h;

      private d(int $$0, String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static cgl.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
