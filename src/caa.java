import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class caa extends bzw implements bnj<caa.d>, cct {
   private static final int bU = 5;
   private static final cpz bW = cpz.a(cnb.pt, cws.ij.k());
   private static final agm<Integer> bX = agp.a(caa.class, ago.b);
   private static final agm<Integer> bY = agp.a(caa.class, ago.b);
   private static final agm<Integer> bZ = agp.a(caa.class, ago.b);
   boolean ca;
   @Nullable
   private caa cb;
   @Nullable
   private caa cc;

   public caa(blz<? extends caa> $$0, ctp $$1) {
      super($$0, $$1);
   }

   public boolean gn() {
      return false;
   }

   private void w(int $$0) {
      this.an.b(bX, Math.max(1, Math.min(5, $$0)));
   }

   private void b(auv $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int go() {
      return this.an.b(bX);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("Variant", this.gq().g);
      $$0.a("Strength", this.go());
      if (!this.cp.a(1).b()) {
         $$0.a("DecorItem", this.cp.a(1).b(new sn()));
      }
   }

   @Override
   public void a(sn $$0) {
      this.w($$0.h("Strength"));
      super.a($$0);
      this.a(caa.d.a($$0.h("Variant")));
      if ($$0.b("DecorItem", 10)) {
         this.cp.a(1, cmy.a($$0.p("DecorItem")));
      }

      this.gB();
   }

   @Override
   protected void B() {
      this.bO.a(0, new btb(this));
      this.bO.a(1, new bul(this, 1.2));
      this.bO.a(2, new bto(this, 2.1F));
      this.bO.a(3, new bug(this, 1.25, 40, 20.0F));
      this.bO.a(3, new bua(this, 1.2));
      this.bO.a(4, new bst(this, 1.0));
      this.bO.a(5, new bup(this, 1.25, cpz.a(cnb.hC), false));
      this.bO.a(6, new btg(this, 1.0));
      this.bO.a(7, new buu(this, 0.7));
      this.bO.a(8, new btp(this, cfi.class, 6.0F));
      this.bO.a(9, new buc(this));
      this.bP.a(1, new caa.c(this));
      this.bP.a(2, new caa.a(this));
   }

   public static bnq.a gp() {
      return u().a(bnr.g, 40.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bX, 0);
      this.an.a(bY, -1);
      this.an.a(bZ, 0);
   }

   public caa.d gq() {
      return caa.d.a(this.an.b(bZ));
   }

   public void a(caa.d $$0) {
      this.an.b(bZ, $$0.g);
   }

   @Override
   protected int ac_() {
      return this.w() ? 2 + 3 * this.gm() : super.ac_();
   }

   @Override
   public boolean m(cmy $$0) {
      return bW.a($$0);
   }

   @Override
   protected boolean a(cfi $$0, cmy $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cnb.pt)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(cws.ij.k())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gt() && this.h() == 0 && this.gf()) {
            $$5 = true;
            this.g($$0);
         }
      }

      if (this.ev() < this.eM() && $$4 > 0.0F) {
         this.b($$4);
         $$5 = true;
      }

      if (this.o_() && $$2 > 0) {
         this.dM().a(jx.M, this.d(1.0), this.du() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dM().B) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gt()) && this.gz() < this.gF()) {
         $$5 = true;
         if (!this.dM().B) {
            this.v($$3);
         }
      }

      if ($$5 && !this.aU()) {
         arr $$6 = this.gl();
         if ($$6 != null) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), this.gl(), this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean eY() {
      return this.ew() || this.gw();
   }

   @Nullable
   @Override
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
      auv $$5 = $$0.F_();
      this.b($$5);
      caa.d $$6;
      if ($$3 instanceof caa.b) {
         $$6 = ((caa.b)$$3).a;
      } else {
         $$6 = ac.a(caa.d.values(), $$5);
         $$3 = new caa.b($$6);
      }

      this.a($$6);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean gk() {
      return false;
   }

   @Override
   protected arr gD() {
      return ars.nl;
   }

   @Override
   protected arr y() {
      return ars.nk;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.np;
   }

   @Override
   protected arr n_() {
      return ars.nn;
   }

   @Nullable
   @Override
   protected arr gl() {
      return ars.no;
   }

   @Override
   protected void b(hx $$0, djh $$1) {
      this.a(ars.nr, 0.15F, 1.0F);
   }

   @Override
   protected void ge() {
      this.a(ars.nm, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
   }

   @Override
   public int gm() {
      return this.go();
   }

   @Override
   public boolean gN() {
      return true;
   }

   @Override
   public boolean gO() {
      return !this.cp.a(1).b();
   }

   @Override
   public boolean l(cmy $$0) {
      return $$0.a(asp.g);
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public void a(bju $$0) {
      clm $$1 = this.gr();
      super.a($$0);
      clm $$2 = this.gr();
      if (this.ah > 20 && $$2 != null && $$2 != $$1) {
         this.a(ars.ns, 0.5F, 1.0F);
      }
   }

   @Override
   protected void gB() {
      if (!this.dM().B) {
         super.gB();
         this.a(n(this.cp.a(1)));
      }
   }

   private void a(@Nullable clm $$0) {
      this.an.b(bY, $$0 == null ? -1 : $$0.a());
   }

   @Nullable
   private static clm n(cmy $$0) {
      cwq $$1 = cwq.a($$0.d());
      return $$1 instanceof dgj ? ((dgj)$$1).b() : null;
   }

   @Nullable
   public clm gr() {
      int $$0 = this.an.b(bY);
      return $$0 == -1 ? null : clm.a($$0);
   }

   @Override
   public int gF() {
      return 30;
   }

   @Override
   public boolean a(bxy $$0) {
      return $$0 != this && $$0 instanceof caa && this.gM() && ((caa)$$0).gM();
   }

   @Nullable
   public caa b(and $$0, blq $$1) {
      caa $$2 = this.gs();
      if ($$2 != null) {
         this.a($$1, $$2);
         caa $$3 = (caa)$$1;
         int $$4 = this.ag.a(Math.max(this.go(), $$3.go())) + 1;
         if (this.ag.i() < 0.03F) {
            $$4++;
         }

         $$2.w($$4);
         $$2.a(this.ag.h() ? this.gq() : $$3.gq());
      }

      return $$2;
   }

   @Nullable
   protected caa gs() {
      return blz.ak.a(this.dM());
   }

   private void k(bml $$0) {
      cfz $$1 = new cfz(this.dM(), this);
      double $$2 = $$0.dr() - this.dr();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dt();
      double $$4 = $$0.dx() - this.dx();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aU()) {
         this.dM().a(null, this.dr(), this.dt(), this.dx(), ars.nq, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
      }

      this.dM().b($$1);
      this.ca = true;
   }

   void D(boolean $$0) {
      this.ca = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bkt $$2) {
      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bP()) {
               for (blv $$4 : this.cT()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eI();
         return true;
      }
   }

   public void gQ() {
      if (this.cb != null) {
         this.cb.cc = null;
      }

      this.cb = null;
   }

   public void a(caa $$0) {
      this.cb = $$0;
      this.cb.cc = this;
   }

   public boolean gR() {
      return this.cc != null;
   }

   public boolean gS() {
      return this.cb != null;
   }

   @Nullable
   public caa gT() {
      return this.cb;
   }

   @Override
   protected double gd() {
      return 2.0;
   }

   @Override
   protected void gG() {
      if (!this.gS() && this.o_()) {
         super.gG();
      }
   }

   @Override
   public boolean gH() {
      return false;
   }

   @Override
   public void a(bml $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public elt cJ() {
      return new elt(0.0, 0.75 * (double)this.cI(), (double)this.dg() * 0.5);
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - (this.o_() ? 0.8125F : 0.5F) * $$2, -0.3F * $$2);
   }

   static class a extends bva<bzb> {
      public a(caa $$0) {
         super($$0, bzb.class, 16, false, true, $$0x -> !((bzb)$$0x).u());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends blq.a {
      public final caa.d a;

      b(caa.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends buz {
      public c(caa $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof caa $$0 && $$0.ca) {
            $$0.D(false);
            return false;
         }

         return super.b();
      }
   }

   public static enum d implements avk {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<caa.d> e = avk.a(caa.d::values);
      private static final IntFunction<caa.d> f = atg.a(caa.d::a, values(), atg.a.c);
      final int g;
      private final String h;

      private d(int $$0, String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static caa.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
