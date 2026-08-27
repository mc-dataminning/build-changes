import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class bwy extends brl implements bvu, bxa {
   private static final aby<Boolean> bW = acb.a(bwy.class, aca.k);
   private static final float bX = 0.2F;
   private static final int bY = 40;
   private static final float bZ = 0.3F;
   private static final int ca = 1;
   private static final float cb = 0.6F;
   private static final int cc = 6;
   private static final float cd = 0.5F;
   private static final int ce = 300;
   private int cf;
   private int cg;
   private boolean ch;
   protected static final ImmutableList<? extends bqg<? extends bqf<? super bwy>>> bT = ImmutableList.of(bqg.c, bqg.d, bqg.n, bqg.m);
   protected static final ImmutableList<? extends bpb<?>> bU = ImmutableList.of(
      bpb.r, bpb.g, bpb.h, bpb.k, bpb.l, bpb.n, bpb.m, bpb.E, bpb.t, bpb.o, bpb.p, bpb.ap, new bpb[]{bpb.z, bpb.ar, bpb.as, bpb.ao, bpb.J, bpb.av, bpb.aw}
   );

   public bwy(bfn<? extends bwy> $$0, cmm $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public boolean a(byo $$0) {
      return !this.fO();
   }

   public static bhf.a q() {
      return bwc.ge().a(bhg.a, 40.0).a(bhg.d, 0.3F).a(bhg.c, 0.6F).a(bhg.g, 1.0).a(bhg.f, 6.0);
   }

   @Override
   public boolean z(bfj $$0) {
      if (!($$0 instanceof bfz)) {
         return false;
      } else {
         this.cf = 10;
         this.dI().a(this, (byte)4);
         this.a(amh.kO, 1.0F, this.eS());
         bwz.a(this, (bfz)$$0);
         return bxa.a(this, (bfz)$$0);
      }
   }

   @Override
   protected void e(bfz $$0) {
      if (this.r()) {
         bxa.b(this, $$0);
      }
   }

   @Override
   public boolean a(ben $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dI().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bfz) {
            bwz.b(this, (bfz)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bha.b<bwy> dL() {
      return bha.a(bU, bT);
   }

   @Override
   protected bha<?> a(Dynamic<?> $$0) {
      return bwz.a(this.dL().a($$0));
   }

   @Override
   public bha<bwy> dK() {
      return (bha<bwy>)super.dK();
   }

   @Override
   protected void W() {
      this.dI().ad().a("hoglinBrain");
      this.dK().a((aif)this.dI(), this);
      this.dI().ad().c();
      bwz.a(this);
      if (this.w()) {
         this.cg++;
         if (this.cg > 300) {
            this.b(amh.kP);
            this.c((aif)this.dI());
         }
      } else {
         this.cg = 0;
      }
   }

   @Override
   public void b_() {
      if (this.cf > 0) {
         this.cf--;
      }

      super.b_();
   }

   @Override
   protected void m() {
      if (this.h_()) {
         this.bJ = 3;
         this.a(bhg.f).a(0.5);
      } else {
         this.bJ = 5;
         this.a(bhg.f).a(6.0);
      }
   }

   public static boolean c(bfn<bwy> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
      return !$$1.a_($$3.d()).a(cpo.kK);
   }

   @Nullable
   @Override
   public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
      if ($$0.y_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fH();
   }

   @Override
   public float a(gu $$0, cmp $$1) {
      if (bwz.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(cpo.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   public double bx() {
      return (double)this.de() - (this.h_() ? 0.2 : 0.15);
   }

   @Override
   public bdx b(byo $$0, bdw $$1) {
      bdx $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fF();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cf = 10;
         this.a(amh.kO, 1.0F, this.eS());
      } else {
         super.b($$0);
      }
   }

   @Override
   public int fY() {
      return this.cf;
   }

   @Override
   public boolean dY() {
      return true;
   }

   @Override
   public int ea() {
      return this.bJ;
   }

   private void c(aif $$0) {
      bwu $$1 = this.a(bfn.bo, true);
      if ($$1 != null) {
         $$1.b(new bfa(bfc.i, 200, 0));
      }
   }

   @Override
   public boolean m(cfz $$0) {
      return $$0.a(cgc.dg);
   }

   public boolean r() {
      return !this.h_();
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(bW, false);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      if (this.gf()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.cg);
      if (this.ch) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.cg = $$0.h("TimeInOverworld");
      this.x($$0.q("CannotBeHunted"));
   }

   public void w(boolean $$0) {
      this.aj().b(bW, $$0);
   }

   private boolean gf() {
      return this.aj().b(bW);
   }

   public boolean w() {
      return !this.dI().x_().b() && !this.gf() && !this.fQ();
   }

   private void x(boolean $$0) {
      this.ch = $$0;
   }

   public boolean ge() {
      return this.r() && !this.ch;
   }

   @Nullable
   @Override
   public bfe a(aif $$0, bfe $$1) {
      bwy $$2 = bfn.W.a((cmm)$$0);
      if ($$2 != null) {
         $$2.fF();
      }

      return $$2;
   }

   @Override
   public boolean fZ() {
      return !bwz.c(this) && super.fZ();
   }

   @Override
   public ami cY() {
      return ami.f;
   }

   @Override
   protected amg s() {
      return this.dI().B ? null : bwz.b(this).orElse(null);
   }

   @Override
   protected amg d(ben $$0) {
      return amh.kR;
   }

   @Override
   protected amg g_() {
      return amh.kQ;
   }

   @Override
   protected amg aJ() {
      return amh.lw;
   }

   @Override
   protected amg aK() {
      return amh.lv;
   }

   @Override
   protected void b(gu $$0, dcb $$1) {
      this.a(amh.kT, 0.15F, 1.0F);
   }

   protected void b(amg $$0) {
      this.a($$0, this.eR(), this.eS());
   }

   @Override
   protected void V() {
      super.V();
      za.a(this);
   }
}
