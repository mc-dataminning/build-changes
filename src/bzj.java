import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class bzj extends byc {
   public static final float bU = 0.6F;
   private static final int bZ = 5;
   private static final int ca = 8;
   public static final int bV = 60;
   private static final double cb = 7.0;
   private static final agn<bzj.a> cc = agq.a(bzj.class, agp.A);
   private long cd = 0L;
   public final bls bX = new bls();
   public final bls bY = new bls();
   private int ce;

   public bzj(bmc<? extends byc> $$0, ctx $$1) {
      super($$0, $$1);
      this.N().a(true);
      this.ce = this.gp();
   }

   @Nullable
   @Override
   public blr a(ane $$0, blr $$1) {
      return bmc.d.a((ctx)$$0);
   }

   public static bnt.a u() {
      return bmq.C().a(bnu.n, 12.0).a(bnu.o, 0.14);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(cc, bzj.a.a);
   }

   public boolean w() {
      return this.an.b(cc) != bzj.a.a;
   }

   public boolean A() {
      bzj.a $$0 = this.go();
      return $$0 == bzj.a.c || $$0 == bzj.a.b && this.cd > 5L;
   }

   public boolean gf() {
      return this.go() == bzj.a.b && this.cd > 8L;
   }

   private bzj.a go() {
      return this.an.b(cc);
   }

   @Override
   protected void Z() {
      super.Z();
      adj.a(this);
   }

   public void a(bzj.a $$0) {
      this.an.b(cc, $$0);
   }

   private void x(boolean $$0) {
      this.a($$0 ? bzj.a.b : bzj.a.a);
   }

   @Override
   public void a(agn<?> $$0) {
      if (cc.equals($$0)) {
         this.cd = 0L;
      }

      super.a($$0);
   }

   @Override
   protected bno.b<bzj> dO() {
      return bzk.a();
   }

   @Override
   protected bno<?> a(Dynamic<?> $$0) {
      return bzk.a(this.dO().a($$0));
   }

   @Override
   protected void aa() {
      this.dL().af().a("armadilloBrain");
      ((bno<bzj>)this.bz).a((ane)this.dL(), this);
      this.dL().af().c();
      this.dL().af().a("armadilloActivityUpdate");
      bzk.a(this);
      this.dL().af().c();
      if (this.bx() && !this.o_() && --this.ce <= 0) {
         this.a(art.aj, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         this.a(cnj.op);
         this.b(dnz.t);
         this.ce = this.gp();
      }

      super.aa();
   }

   private int gp() {
      return this.ag.a(20 * avq.e * 5) + 20 * avq.e * 5;
   }

   @Override
   public void l() {
      super.l();
      if (this.dL().y_()) {
         this.gq();
      }

      this.cd++;
   }

   @Override
   public float dY() {
      return this.o_() ? 0.6F : 1.0F;
   }

   private void gq() {
      switch (this.go()) {
         case a:
            this.bX.a();
            this.bY.a();
            break;
         case c:
            this.bX.b(this.ah);
            this.bY.a();
            break;
         case b:
            this.bX.a();
            this.bY.b(this.ah);
      }
   }

   @Override
   public boolean m(cng $$0) {
      return bzk.a.a($$0);
   }

   public boolean j(bmo $$0) {
      if (!new elx(this.dj(), this.dj()).g(7.0).d($$0.dj())) {
         return false;
      } else if ($$0.ai().a(asl.d)) {
         return true;
      } else {
         if ($$0 instanceof cfq $$1 && ($$1.bY() || $$1.bO())) {
            return true;
         }

         return false;
      }
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("state", this.go().c());
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.a(bzj.a.a($$0.l("state")));
   }

   public void gl() {
      if (!this.w()) {
         this.V();
         this.gk();
         this.b(dnz.u);
         this.dL().a(null, this.dl(), art.ah, this.db(), 1.0F, 1.0F);
         this.x(true);
      }
   }

   public void w(boolean $$0) {
      if (this.w()) {
         this.b(dnz.u);
         if (!$$0) {
            this.dL().a(null, this.dl(), art.ak, this.db(), 1.0F, 1.0F);
         }

         this.x(false);
      }
   }

   @Override
   protected void f(bkv $$0, float $$1) {
      this.w(true);
      super.f($$0, $$1);
   }

   @Override
   public bkc b(cfq $$0, bkb $$1) {
      cng $$2 = $$0.b($$1);
      if (this.dL().B) {
         boolean $$3 = $$2.a(cnj.xl);
         return $$3 ? bkc.b : bkc.d;
      } else if ($$2.a(cnj.xl)) {
         if (!$$0.fT().d) {
            $$2.a(16, $$0, $$1x -> $$1x.d($$1));
         }

         this.gm();
         return bkc.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void gm() {
      this.b(new cng(cnj.op));
      this.b(dnz.r);
      this.dL().a(null, this.dl(), art.al, this.db(), 1.0F, 1.0F);
   }

   public boolean gn() {
      return !this.gc() && !this.bd() && !this.fT();
   }

   @Override
   public void g(@Nullable cfq $$0) {
      super.g($$0);
      this.dL().a(null, this.dl(), art.ac, this.db(), 1.0F, 1.0F);
   }

   @Override
   public boolean gg() {
      return super.gg() && !this.w();
   }

   @Override
   public ars d(cng $$0) {
      return art.ac;
   }

   @Override
   protected ars y() {
      return this.w() ? null : art.ae;
   }

   @Override
   protected ars n_() {
      return art.ag;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.ad;
   }

   @Override
   protected void b(hx $$0, djp $$1) {
      this.a(art.af, 0.15F, 1.0F);
   }

   @Override
   protected bsi H() {
      return new bsi(this) {
         @Override
         public void a() {
            if (!bzj.this.w()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements avl {
      a("idle"),
      b("rolling"),
      c("scared");

      private static avl.a<bzj.a> e = avl.a(bzj.a::values);
      final String d;

      private a(String $$0) {
         this.d = $$0;
      }

      public static bzj.a a(String $$0) {
         return e.a($$0, a);
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
