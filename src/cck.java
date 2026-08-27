import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cck extends cam {
   public static final boi bV = boi.b(0.9F, 1.3F).a(0.7F);
   private static final int cc = 2;
   private static final int cd = 1;
   protected static final ImmutableList<bzh<? extends bzg<? super cck>>> bW = ImmutableList.of(bzh.c, bzh.d, bzh.b, bzh.o, bzh.f, bzh.r);
   protected static final ImmutableList<bya<?>> bY = ImmutableList.of(
      bya.n, bya.h, bya.m, bya.E, bya.t, bya.av, bya.r, bya.S, bya.T, bya.O, bya.K, bya.P, new bya[]{bya.R, bya.V, bya.W, bya.Z}
   );
   public static final int bZ = 10;
   public static final double ca = 0.02;
   public static final double cb = 0.1F;
   private static final aii<Boolean> ce = ail.a(cck.class, aik.k);
   private static final aii<Boolean> cf = ail.a(cck.class, aik.k);
   private static final aii<Boolean> cg = ail.a(cck.class, aik.k);
   private boolean ch;
   private int ci;

   public cck(bol<? extends cck> $$0, cwe $$1) {
      super($$0, $$1);
      this.N().a(true);
      this.a(eic.f, -1.0F);
      this.a(eic.g, -1.0F);
   }

   public cpq u() {
      awt $$0 = awt.a((long)this.ct().hashCode());
      aut<cpi> $$1 = this.gv() ? aul.b : aul.a;
      ip<cpi> $$2 = kh.an.a($$1);
      return cpj.a(cpt.vY, $$2.a($$0).get());
   }

   @Override
   protected bpy.b<cck> dN() {
      return bpy.a(bY, bW);
   }

   @Override
   protected bpy<?> a(Dynamic<?> $$0) {
      return ccl.a(this.dN().a($$0));
   }

   public static bqd.a w() {
      return boz.C().a(bqe.n, 10.0).a(bqe.o, 0.2F).a(bqe.c, 2.0);
   }

   @Override
   protected void m() {
      if (this.o_()) {
         this.f(bqe.c).a(1.0);
         this.gu();
      } else {
         this.f(bqe.c).a(2.0);
         this.gt();
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected ato y() {
      return this.gv() ? atp.kG : atp.kw;
   }

   @Override
   protected ato d(bne $$0) {
      return this.gv() ? atp.kJ : atp.kz;
   }

   @Override
   protected ato n_() {
      return this.gv() ? atp.kH : atp.kx;
   }

   @Override
   protected void b(ib $$0, dme $$1) {
      this.a(atp.kP, 0.15F, 1.0F);
   }

   protected ato A() {
      return this.gv() ? atp.kL : atp.kB;
   }

   @Nullable
   public cck b(apa $$0, boa $$1) {
      cck $$2 = bol.W.a((cwe)$$0);
      if ($$2 != null) {
         ccl.a($$2, $$0.F_());
         boa $$3 = (boa)($$0.F_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof cck $$4 && $$4.gv() || $$0.F_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bpy<cck> dM() {
      return (bpy<cck>)super.dM();
   }

   @Override
   protected void aa() {
      this.dJ().ae().a("goatBrain");
      this.dM().a((apa)this.dJ(), this);
      this.dJ().ae().c();
      this.dJ().ae().a("goatActivityUpdate");
      ccl.a(this);
      this.dJ().ae().c();
      super.aa();
   }

   @Override
   public int fJ() {
      return 15;
   }

   @Override
   public void n(float $$0) {
      int $$1 = this.fJ();
      float $$2 = awm.c(this.aV, $$0);
      float $$3 = awm.a($$2, (float)(-$$1), (float)$$1);
      super.n(this.aV + $$3);
   }

   @Override
   public ato d(cpq $$0) {
      return this.gv() ? atp.kI : atp.ky;
   }

   @Override
   public bml b(cia $$0, bmk $$1) {
      cpq $$2 = $$0.b($$1);
      if ($$2.a(cpt.qx) && !this.o_()) {
         $$0.a(this.A(), 1.0F, 1.0F);
         cpq $$3 = cps.a($$2, $$0, cpt.qD.an_());
         $$0.a($$1, $$3);
         return bml.a(this.dJ().B);
      } else {
         bml $$4 = super.b($$0, $$1);
         if ($$4.a() && this.o($$2)) {
            this.dJ().a(null, this, this.d($$2), atq.g, 1.0F, awm.b(this.dJ().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      awt $$4 = $$0.F_();
      ccl.a(this, $$4);
      this.w($$4.j() < 0.02);
      this.m();
      if (!this.o_() && (double)$$4.i() < 0.1F) {
         aii<Boolean> $$5 = $$4.h() ? cf : cg;
         this.am.b($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void Z() {
      super.Z();
      aes.a(this);
   }

   @Override
   public boi e(bpi $$0) {
      return $$0 == bpi.g ? bV.a(this.dX()) : super.e($$0);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gv());
      $$0.a("HasLeftHorn", this.gl());
      $$0.a("HasRightHorn", this.gr());
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.w($$0.q("IsScreamingGoat"));
      this.am.b(cf, $$0.q("HasLeftHorn"));
      this.am.b(cg, $$0.q("HasRightHorn"));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 58) {
         this.ch = true;
      } else if ($$0 == 59) {
         this.ch = false;
      } else {
         super.b($$0);
      }
   }

   @Override
   public void d_() {
      if (this.ch) {
         this.ci++;
      } else {
         this.ci -= 2;
      }

      this.ci = awm.a(this.ci, 0, 20);
      super.d_();
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(ce, false);
      this.am.a(cf, true);
      this.am.a(cg, true);
   }

   public boolean gl() {
      return this.am.b(cf);
   }

   public boolean gr() {
      return this.am.b(cg);
   }

   public boolean gs() {
      boolean $$0 = this.gl();
      boolean $$1 = this.gr();
      if (!$$0 && !$$1) {
         return false;
      } else {
         aii<Boolean> $$2;
         if (!$$0) {
            $$2 = cg;
         } else if (!$$1) {
            $$2 = cf;
         } else {
            $$2 = this.af.h() ? cf : cg;
         }

         this.am.b($$2, false);
         eov $$5 = this.dh();
         cpq $$6 = this.u();
         double $$7 = (double)awm.b(this.af, -0.2F, 0.2F);
         double $$8 = (double)awm.b(this.af, 0.3F, 0.7F);
         double $$9 = (double)awm.b(this.af, -0.2F, 0.2F);
         cel $$10 = new cel(this.dJ(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dJ().b($$10);
         return true;
      }
   }

   public void gt() {
      this.am.b(cf, true);
      this.am.b(cg, true);
   }

   public void gu() {
      this.am.b(cf, false);
      this.am.b(cg, false);
   }

   public boolean gv() {
      return this.am.b(ce);
   }

   public void w(boolean $$0) {
      this.am.b(ce, $$0);
   }

   public float gw() {
      return (float)this.ci / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bol<? extends cam> $$0, cwf $$1, bpb $$2, ib $$3, awt $$4) {
      return $$1.a_($$3.d()).a(aue.bS) && a($$1, $$3);
   }
}
