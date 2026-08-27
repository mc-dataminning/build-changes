import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cdn extends cct implements bsd<cdn.g> {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double cb = 1.0;
   public static final double cc = 2.2;
   public static final double cd = 1.4;
   private static final ajk<Integer> cg = ajo.a(cdn.class, ajm.b);
   private static final akf ch = new akf("killer_bunny");
   public static final int ce = 8;
   public static final int cf = 8;
   private static final int ci = 40;
   private int cj;
   private int ck;
   private boolean cl;
   private int cm;
   int cn;

   public cdn(bqr<? extends cdn> $$0, czu $$1) {
      super($$0, $$1);
      this.bQ = new cdn.c(this);
      this.bP = new cdn.d(this);
      this.i(0.0);
   }

   @Override
   protected void z() {
      this.bS.a(1, new bxv(this));
      this.bS.a(1, new bxq(this, this.dN()));
      this.bS.a(1, new cdn.e(this, 2.2));
      this.bS.a(2, new bxn(this, 0.8));
      this.bS.a(3, new bzj(this, 1.0, cwd.a(csg.uf, csg.uk, dcx.bR), false));
      this.bS.a(4, new cdn.a<>(this, ckl.class, 8.0F, 2.2, 2.2));
      this.bS.a(4, new cdn.a<>(this, cdw.class, 10.0F, 2.2, 2.2));
      this.bS.a(4, new cdn.a<>(this, chr.class, 4.0F, 2.2, 2.2));
      this.bS.a(5, new cdn.f(this));
      this.bS.a(6, new bzo(this, 0.6));
      this.bS.a(11, new byj(this, ckl.class, 10.0F));
   }

   @Override
   protected float ff() {
      float $$0 = 0.3F;
      if (this.Q || this.bP.b() && this.bP.e() > this.du() + 0.5) {
         $$0 = 0.5F;
      }

      emf $$1 = this.bR.j();
      if ($$1 != null && !$$1.c()) {
         etf $$2 = $$1.a(this);
         if ($$2.d > this.du() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.bP.c() <= 0.6) {
         $$0 = 0.2F;
      }

      return super.w($$0 / 0.42F);
   }

   @Override
   protected void fh() {
      super.fh();
      double $$0 = this.bP.c();
      if ($$0 > 0.0) {
         double $$1 = this.dq().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new etf(0.0, 0.0, 1.0));
         }
      }

      if (!this.dN().B) {
         this.dN().a(this, (byte)1);
      }
   }

   public float G(float $$0) {
      return this.ck == 0 ? 0.0F : ((float)this.cj + $$0) / (float)this.ck;
   }

   public void i(double $$0) {
      this.K().a($$0);
      this.bP.a(this.bP.d(), this.bP.e(), this.bP.f(), $$0);
   }

   @Override
   public void s(boolean $$0) {
      super.s($$0);
      if ($$0) {
         this.a(this.y(), this.fc(), ((this.ah.i() - this.ah.i()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   @Override
   public void r() {
      this.s(true);
      this.ck = 10;
      this.cj = 0;
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(cg, cdn.g.a.j);
   }

   @Override
   public void Y() {
      if (this.cm > 0) {
         this.cm--;
      }

      if (this.cn > 0) {
         this.cn = this.cn - this.ah.a(3);
         if (this.cn < 0) {
            this.cn = 0;
         }
      }

      if (this.aC()) {
         if (!this.cl) {
            this.s(false);
            this.gy();
         }

         if (this.gp() == cdn.g.g && this.cm == 0) {
            bre $$0 = this.p();
            if ($$0 != null && this.g((bql)$$0) < 16.0) {
               this.c($$0.ds(), $$0.dy());
               this.bP.a($$0.ds(), $$0.du(), $$0.dy(), this.bP.c());
               this.r();
               this.cl = true;
            }
         }

         cdn.c $$1 = (cdn.c)this.bQ;
         if (!$$1.c()) {
            if (this.bP.b() && this.cm == 0) {
               emf $$2 = this.bR.j();
               etf $$3 = new etf(this.bP.d(), this.bP.e(), this.bP.f());
               if ($$2 != null && !$$2.c()) {
                  $$3 = $$2.a(this);
               }

               this.c($$3.c, $$3.e);
               this.r();
            }
         } else if (!$$1.d()) {
            this.gv();
         }
      }

      this.cl = this.aC();
   }

   @Override
   public boolean bo() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.r((float)(axw.d($$1 - this.dy(), $$0 - this.ds()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gv() {
      ((cdn.c)this.bQ).a(true);
   }

   private void gw() {
      ((cdn.c)this.bQ).a(false);
   }

   private void gx() {
      if (this.bP.c() < 2.2) {
         this.cm = 10;
      } else {
         this.cm = 1;
      }
   }

   private void gy() {
      this.gx();
      this.gw();
   }

   @Override
   public void n_() {
      super.n_();
      if (this.cj != this.ck) {
         this.cj++;
      } else if (this.ck != 0) {
         this.cj = 0;
         this.ck = 0;
         this.s(false);
      }
   }

   public static bsk.a u() {
      return brg.A().a(bsl.q, 3.0).a(bsl.r, 0.3F);
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gp().j);
      $$0.a("MoreCarrotTicks", this.cn);
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.a(cdn.g.a($$0.h("RabbitType")));
      this.cn = $$0.h("MoreCarrotTicks");
   }

   protected auy y() {
      return auz.uM;
   }

   @Override
   protected auy v() {
      return auz.uI;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.uL;
   }

   @Override
   protected auy o_() {
      return auz.uK;
   }

   @Override
   public boolean C(bql $$0) {
      if (this.gp() == cdn.g.g) {
         this.a(auz.uJ, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         return $$0.a(this.dO().b((bre)this), 8.0F);
      } else {
         return $$0.a(this.dO().b((bre)this), 3.0F);
      }
   }

   @Override
   public ava dc() {
      return this.gp() == cdn.g.g ? ava.f : ava.g;
   }

   private static boolean n(csd $$0) {
      return $$0.a(csg.uf) || $$0.a(csg.uk) || $$0.a(dcx.bR.p());
   }

   @Nullable
   public cdn b(aqe $$0, bqf $$1) {
      cdn $$2 = bqr.aF.a((czu)$$0);
      if ($$2 != null) {
         cdn.g $$3;
         $$3 = a($$0, this.dn());
         label16:
         if (this.ah.a(20) != 0) {
            if ($$1 instanceof cdn $$4 && this.ah.h()) {
               $$3 = $$4.gp();
               break label16;
            }

            $$3 = this.gp();
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean o(csd $$0) {
      return n($$0);
   }

   public cdn.g gp() {
      return cdn.g.a(this.ao.a(cg));
   }

   public void a(cdn.g $$0) {
      if ($$0 == cdn.g.g) {
         this.f(bsl.a).a(8.0);
         this.bS.a(4, new byl(this, 1.4, true));
         this.bT.a(1, new bzt(this).a());
         this.bT.a(2, new bzu<>(this, ckl.class, true));
         this.bT.a(2, new bzu<>(this, cdw.class, true));
         if (!this.ae()) {
            this.b(ws.c(ac.a("entity", ch)));
         }
      }

      this.ao.a(cg, $$0.j);
   }

   @Nullable
   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      cdn.g $$4 = a($$0, this.dn());
      if ($$3 instanceof cdn.b) {
         $$4 = ((cdn.b)$$3).a;
      } else {
         $$3 = new cdn.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static cdn.g a(czv $$0, im $$1) {
      iv<dat> $$2 = $$0.t($$1);
      int $$3 = $$0.E_().a(100);
      if ($$2.a(avn.al)) {
         return $$3 < 80 ? cdn.g.b : cdn.g.d;
      } else if ($$2.a(avn.ak)) {
         return cdn.g.e;
      } else {
         return $$3 < 50 ? cdn.g.a : ($$3 < 90 ? cdn.g.f : cdn.g.c);
      }
   }

   public static boolean c(bqr<cdn> $$0, czv $$1, bri $$2, im $$3, ayd $$4) {
      return $$1.a_($$3.d()).a(avo.bX) && a((cyx)$$1, $$3);
   }

   boolean gz() {
      return this.cn <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.bp();
         this.ck = 10;
         this.cj = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public etf cK() {
      return new etf(0.0, (double)(0.6F * this.cJ()), (double)(this.dh() * 0.4F));
   }

   static class a<T extends bre> extends bxi<T> {
      private final cdn i;

      public a(cdn $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gp() != cdn.g.g && super.a();
      }
   }

   public static class b extends bqf.a {
      public final cdn.g a;

      public b(cdn.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends bxc {
      private final cdn b;
      private boolean c;

      public c(cdn $$0) {
         super($$0);
         this.b = $$0;
      }

      public boolean c() {
         return this.a;
      }

      public boolean d() {
         return this.c;
      }

      public void a(boolean $$0) {
         this.c = $$0;
      }

      @Override
      public void b() {
         if (this.a) {
            this.b.r();
            this.a = false;
         }
      }
   }

   static class d extends bxe {
      private final cdn l;
      private double m;

      public d(cdn $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aC() && !this.l.bo && !((cdn.c)this.l.bQ).c()) {
            this.l.i(0.0);
         } else if (this.b()) {
            this.l.i(this.m);
         }

         super.a();
      }

      @Override
      public void a(double $$0, double $$1, double $$2, double $$3) {
         if (this.l.bc()) {
            $$3 = 1.5;
         }

         super.a($$0, $$1, $$2, $$3);
         if ($$3 > 0.0) {
            this.m = $$3;
         }
      }
   }

   static class e extends byu {
      private final cdn h;

      public e(cdn $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends byo {
      private final cdn g;
      private boolean h;
      private boolean i;

      public f(cdn $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dN().aa().b(czq.c)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gz();
         }

         return super.a();
      }

      @Override
      public boolean b() {
         return this.i && super.b();
      }

      @Override
      public void e() {
         super.e();
         this.g.G().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, 10.0F, (float)this.g.Z());
         if (this.m()) {
            czu $$0 = this.g.dN();
            im $$1 = this.e.c();
            dpy $$2 = $$0.a_($$1);
            dcv $$3 = $$2.b();
            if (this.i && $$3 instanceof ddn) {
               int $$4 = $$2.c(ddn.f);
               if ($$4 == 0) {
                  $$0.a($$1, dcx.a.n(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(ddn.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(dur.c, $$1, dur.a.a(this.g));
                  $$0.c(2001, $$1, dcv.i($$2));
               }

               this.g.cn = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(czx $$0, im $$1) {
         dpy $$2 = $$0.a_($$1);
         if ($$2.a(dcx.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof ddn && ((ddn)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements ayq {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<cdn.g> i = awn.a(cdn.g::a, values(), a);
      public static final Codec<cdn.g> h = ayq.a(cdn.g::values);
      final int j;
      private final String k;

      private g(int $$0, String $$1) {
         this.j = $$0;
         this.k = $$1;
      }

      @Override
      public String c() {
         return this.k;
      }

      public int a() {
         return this.j;
      }

      public static cdn.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
