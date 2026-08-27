import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzu extends bzq implements bnd<bzu.d>, ccn {
   private static final int bU = 5;
   private static final cps bW = cps.a(cmu.pt, cwl.ij.k());
   private static final agj<Integer> bX = agm.a(bzu.class, agl.b);
   private static final agj<Integer> bY = agm.a(bzu.class, agl.b);
   private static final agj<Integer> bZ = agm.a(bzu.class, agl.b);
   boolean ca;
   @Nullable
   private bzu cb;
   @Nullable
   private bzu cc;

   public bzu(blt<? extends bzu> $$0, cti $$1) {
      super($$0, $$1);
   }

   public boolean gn() {
      return false;
   }

   private void w(int $$0) {
      this.an.b(bX, Math.max(1, Math.min(5, $$0)));
   }

   private void b(aup $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int go() {
      return this.an.b(bX);
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      $$0.a("Variant", this.gq().g);
      $$0.a("Strength", this.go());
      if (!this.cp.a(1).b()) {
         $$0.a("DecorItem", this.cp.a(1).b(new sl()));
      }
   }

   @Override
   public void a(sl $$0) {
      this.w($$0.h("Strength"));
      super.a($$0);
      this.a(bzu.d.a($$0.h("Variant")));
      if ($$0.b("DecorItem", 10)) {
         this.cp.a(1, cmr.a($$0.p("DecorItem")));
      }

      this.gB();
   }

   @Override
   protected void B() {
      this.bO.a(0, new bsv(this));
      this.bO.a(1, new buf(this, 1.2));
      this.bO.a(2, new bti(this, 2.1F));
      this.bO.a(3, new bua(this, 1.25, 40, 20.0F));
      this.bO.a(3, new btu(this, 1.2));
      this.bO.a(4, new bsn(this, 1.0));
      this.bO.a(5, new buj(this, 1.25, cps.a(cmu.hC), false));
      this.bO.a(6, new bta(this, 1.0));
      this.bO.a(7, new buo(this, 0.7));
      this.bO.a(8, new btj(this, cfb.class, 6.0F));
      this.bO.a(9, new btw(this));
      this.bP.a(1, new bzu.c(this));
      this.bP.a(2, new bzu.a(this));
   }

   public static bnk.a gp() {
      return u().a(bnl.g, 40.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bX, 0);
      this.an.a(bY, -1);
      this.an.a(bZ, 0);
   }

   public bzu.d gq() {
      return bzu.d.a(this.an.b(bZ));
   }

   public void a(bzu.d $$0) {
      this.an.b(bZ, $$0.g);
   }

   @Override
   protected int ac_() {
      return this.w() ? 2 + 3 * this.gm() : super.ac_();
   }

   @Override
   public boolean m(cmr $$0) {
      return bW.a($$0);
   }

   @Override
   protected boolean a(cfb $$0, cmr $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cmu.pt)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(cwl.ij.k())) {
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
         arl $$6 = this.gl();
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
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      aup $$5 = $$0.F_();
      this.b($$5);
      bzu.d $$6;
      if ($$3 instanceof bzu.b) {
         $$6 = ((bzu.b)$$3).a;
      } else {
         $$6 = ac.a(bzu.d.values(), $$5);
         $$3 = new bzu.b($$6);
      }

      this.a($$6);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean gk() {
      return false;
   }

   @Override
   protected arl gD() {
      return arm.nl;
   }

   @Override
   protected arl y() {
      return arm.nk;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.np;
   }

   @Override
   protected arl n_() {
      return arm.nn;
   }

   @Nullable
   @Override
   protected arl gl() {
      return arm.no;
   }

   @Override
   protected void b(hx $$0, dja $$1) {
      this.a(arm.nr, 0.15F, 1.0F);
   }

   @Override
   protected void ge() {
      this.a(arm.nm, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
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
   public boolean l(cmr $$0) {
      return $$0.a(asj.g);
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public void a(bjo $$0) {
      clf $$1 = this.gr();
      super.a($$0);
      clf $$2 = this.gr();
      if (this.ah > 20 && $$2 != null && $$2 != $$1) {
         this.a(arm.ns, 0.5F, 1.0F);
      }
   }

   @Override
   protected void gB() {
      if (!this.dM().B) {
         super.gB();
         this.a(n(this.cp.a(1)));
      }
   }

   private void a(@Nullable clf $$0) {
      this.an.b(bY, $$0 == null ? -1 : $$0.a());
   }

   @Nullable
   private static clf n(cmr $$0) {
      cwj $$1 = cwj.a($$0.d());
      return $$1 instanceof dgc ? ((dgc)$$1).b() : null;
   }

   @Nullable
   public clf gr() {
      int $$0 = this.an.b(bY);
      return $$0 == -1 ? null : clf.a($$0);
   }

   @Override
   public int gF() {
      return 30;
   }

   @Override
   public boolean a(bxs $$0) {
      return $$0 != this && $$0 instanceof bzu && this.gM() && ((bzu)$$0).gM();
   }

   @Nullable
   public bzu b(amz $$0, blk $$1) {
      bzu $$2 = this.gs();
      if ($$2 != null) {
         this.a($$1, $$2);
         bzu $$3 = (bzu)$$1;
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
   protected bzu gs() {
      return blt.ak.a(this.dM());
   }

   private void k(bmf $$0) {
      cfs $$1 = new cfs(this.dM(), this);
      double $$2 = $$0.dr() - this.dr();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dt();
      double $$4 = $$0.dx() - this.dx();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aU()) {
         this.dM().a(null, this.dr(), this.dt(), this.dx(), arm.nq, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
      }

      this.dM().b($$1);
      this.ca = true;
   }

   void D(boolean $$0) {
      this.ca = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bkn $$2) {
      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bP()) {
               for (blp $$4 : this.cT()) {
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

   public void a(bzu $$0) {
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
   public bzu gT() {
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
   public void a(bmf $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public elm cJ() {
      return new elm(0.0, 0.75 * (double)this.cI(), (double)this.dg() * 0.5);
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - (this.o_() ? 0.8125F : 0.5F) * $$2, -0.3F * $$2);
   }

   static class a extends buu<byv> {
      public a(bzu $$0) {
         super($$0, byv.class, 16, false, true, $$0x -> !((byv)$$0x).u());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends blk.a {
      public final bzu.d a;

      b(bzu.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends but {
      public c(bzu $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof bzu $$0 && $$0.ca) {
            $$0.D(false);
            return false;
         }

         return super.b();
      }
   }

   public static enum d implements ave {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<bzu.d> e = ave.a(bzu.d::values);
      private static final IntFunction<bzu.d> f = ata.a(bzu.d::a, values(), ata.a.c);
      final int g;
      private final String h;

      private d(int $$0, String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static bzu.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
