import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cgk extends cam implements cey, cgm {
   private static final aii<Boolean> bY = ail.a(cgk.class, aik.k);
   private static final float bZ = 0.2F;
   private static final int ca = 40;
   private static final float cb = 0.3F;
   private static final int cc = 1;
   private static final float cd = 0.6F;
   private static final int ce = 6;
   private static final float cf = 0.5F;
   private static final int cg = 300;
   private int ch;
   private int ci;
   private boolean cj;
   protected static final ImmutableList<? extends bzh<? extends bzg<? super cgk>>> bV = ImmutableList.of(bzh.c, bzh.d, bzh.o, bzh.n);
   protected static final ImmutableList<? extends bya<?>> bW = ImmutableList.of(
      bya.r,
      bya.g,
      bya.h,
      bya.k,
      bya.l,
      bya.n,
      bya.m,
      bya.E,
      bya.t,
      bya.o,
      bya.p,
      bya.aq,
      new bya[]{bya.z, bya.as, bya.at, bya.ap, bya.K, bya.aw, bya.ax, bya.Z}
   );

   public cgk(bol<? extends cgk> $$0, cwe $$1) {
      super($$0, $$1);
      this.bK = 5;
   }

   @Override
   public boolean a(cia $$0) {
      return !this.fZ();
   }

   public static bqd.a u() {
      return cfg.gr().a(bqe.n, 40.0).a(bqe.o, 0.3F).a(bqe.k, 0.6F).a(bqe.d, 1.0).a(bqe.c, 6.0);
   }

   @Override
   public boolean B(bof $$0) {
      if (!($$0 instanceof box)) {
         return false;
      } else {
         this.ch = 10;
         this.dJ().a(this, (byte)4);
         this.b(atp.lS);
         cgl.a(this, (box)$$0);
         return cgm.a(this, (box)$$0);
      }
   }

   @Override
   protected void e(box $$0) {
      if (this.w()) {
         cgm.b(this, $$0);
      }
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dJ().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof box) {
            cgl.b(this, (box)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bpy.b<cgk> dN() {
      return bpy.a(bW, bV);
   }

   @Override
   protected bpy<?> a(Dynamic<?> $$0) {
      return cgl.a(this.dN().a($$0));
   }

   @Override
   public bpy<cgk> dM() {
      return (bpy<cgk>)super.dM();
   }

   @Override
   protected void aa() {
      this.dJ().ae().a("hoglinBrain");
      this.dM().a((apa)this.dJ(), this);
      this.dJ().ae().c();
      cgl.a(this);
      if (this.A()) {
         this.ci++;
         if (this.ci > 300) {
            this.b(atp.lT);
            this.c((apa)this.dJ());
         }
      } else {
         this.ci = 0;
      }
   }

   @Override
   public void d_() {
      if (this.ch > 0) {
         this.ch--;
      }

      super.d_();
   }

   @Override
   protected void m() {
      if (this.o_()) {
         this.bK = 3;
         this.f(bqe.c).a(0.5);
      } else {
         this.bK = 5;
         this.f(bqe.c).a(6.0);
      }
   }

   public static boolean c(bol<cgk> $$0, cwf $$1, bpb $$2, ib $$3, awt $$4) {
      return !$$1.a_($$3.d()).a(czh.kK);
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      if ($$0.F_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fS();
   }

   @Override
   public float a(ib $$0, cwh $$1) {
      if (cgl.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(czh.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bml b(cia $$0, bmk $$1) {
      bml $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fQ();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ch = 10;
         this.b(atp.lS);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gl() {
      return this.ch;
   }

   @Override
   public boolean eb() {
      return true;
   }

   @Override
   public int ed() {
      return this.bK;
   }

   private void c(apa $$0) {
      cfy $$1 = this.a(bol.br, true);
      if ($$1 != null) {
         $$1.b(new bns(bnu.i, 200, 0));
      }
   }

   @Override
   public boolean o(cpq $$0) {
      return $$0.a(cpt.dB);
   }

   public boolean w() {
      return !this.o_();
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bY, false);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      if (this.gs()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.ci);
      if (this.cj) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.ci = $$0.h("TimeInOverworld");
      this.x($$0.q("CannotBeHunted"));
   }

   public void w(boolean $$0) {
      this.an().b(bY, $$0);
   }

   private boolean gs() {
      return this.an().b(bY);
   }

   public boolean A() {
      return !this.dJ().E_().b() && !this.gs() && !this.gb();
   }

   private void x(boolean $$0) {
      this.cj = $$0;
   }

   public boolean gr() {
      return this.w() && !this.cj;
   }

   @Nullable
   @Override
   public boa a(apa $$0, boa $$1) {
      cgk $$2 = bol.Y.a((cwe)$$0);
      if ($$2 != null) {
         $$2.fQ();
      }

      return $$2;
   }

   @Override
   public boolean gm() {
      return !cgl.c(this) && super.gm();
   }

   @Override
   public atq cY() {
      return atq.f;
   }

   @Override
   protected ato y() {
      return this.dJ().B ? null : cgl.b(this).orElse(null);
   }

   @Override
   protected ato d(bne $$0) {
      return atp.lV;
   }

   @Override
   protected ato n_() {
      return atp.lU;
   }

   @Override
   protected ato aN() {
      return atp.mA;
   }

   @Override
   protected ato aO() {
      return atp.mz;
   }

   @Override
   protected void b(ib $$0, dme $$1) {
      this.a(atp.lX, 0.15F, 1.0F);
   }

   @Override
   protected void Z() {
      super.Z();
      aes.a(this);
   }
}
