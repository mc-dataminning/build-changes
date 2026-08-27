import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cag extends but implements bzc, cai {
   private static final aeg<Boolean> bW = aej.a(cag.class, aei.k);
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
   protected static final ImmutableList<? extends bto<? extends btn<? super cag>>> bT = ImmutableList.of(bto.c, bto.d, bto.n, bto.m);
   protected static final ImmutableList<? extends bsj<?>> bU = ImmutableList.of(
      bsj.r,
      bsj.g,
      bsj.h,
      bsj.k,
      bsj.l,
      bsj.n,
      bsj.m,
      bsj.E,
      bsj.t,
      bsj.o,
      bsj.p,
      bsj.ap,
      new bsj[]{bsj.z, bsj.ar, bsj.as, bsj.ao, bsj.J, bsj.av, bsj.aw, bsj.Y}
   );

   public cag(biw<? extends cag> $$0, cpx $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public boolean a(cbw $$0) {
      return !this.fR();
   }

   public static bkn.a s() {
      return bzk.gj().a(bko.a, 40.0).a(bko.d, 0.3F).a(bko.c, 0.6F).a(bko.g, 1.0).a(bko.f, 6.0);
   }

   @Override
   public boolean C(bis $$0) {
      if (!($$0 instanceof bji)) {
         return false;
      } else {
         this.cf = 10;
         this.dL().a(this, (byte)4);
         this.a(apf.kO, 1.0F, this.eW());
         cah.a(this, (bji)$$0);
         return cai.a(this, (bji)$$0);
      }
   }

   @Override
   protected void e(bji $$0) {
      if (this.t()) {
         cai.b(this, $$0);
      }
   }

   @Override
   public boolean a(bhq $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dL().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bji) {
            cah.b(this, (bji)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bki.b<cag> dO() {
      return bki.a(bU, bT);
   }

   @Override
   protected bki<?> a(Dynamic<?> $$0) {
      return cah.a(this.dO().a($$0));
   }

   @Override
   public bki<cag> dN() {
      return (bki<cag>)super.dN();
   }

   @Override
   protected void X() {
      this.dL().ad().a("hoglinBrain");
      this.dN().a((aks)this.dL(), this);
      this.dL().ad().c();
      cah.a(this);
      if (this.y()) {
         this.cg++;
         if (this.cg > 300) {
            this.b(apf.kP);
            this.c((aks)this.dL());
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
      if (this.m_()) {
         this.bJ = 3;
         this.a(bko.f).a(0.5);
      } else {
         this.bJ = 5;
         this.a(bko.f).a(6.0);
      }
   }

   public static boolean c(biw<cag> $$0, cpy $$1, bjm $$2, gw $$3, ase $$4) {
      return !$$1.a_($$3.d()).a(csy.kK);
   }

   @Nullable
   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      if ($$0.D_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fK();
   }

   @Override
   public float a(gw $$0, cqa $$1) {
      if (cah.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(csy.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.09375F * $$2, 0.0F);
   }

   @Override
   public bha b(cbw $$0, bgz $$1) {
      bha $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fI();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cf = 10;
         this.a(apf.kO, 1.0F, this.eW());
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gd() {
      return this.cf;
   }

   @Override
   public boolean eb() {
      return true;
   }

   @Override
   public int ed() {
      return this.bJ;
   }

   private void c(aks $$0) {
      cac $$1 = this.a(biw.bo, true);
      if ($$1 != null) {
         $$1.b(new bif(bih.i, 200, 0));
      }
   }

   @Override
   public boolean m(cjh $$0) {
      return $$0.a(cjk.dg);
   }

   public boolean t() {
      return !this.m_();
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bW, false);
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      if (this.gk()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.cg);
      if (this.ch) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.cg = $$0.h("TimeInOverworld");
      this.x($$0.q("CannotBeHunted"));
   }

   public void w(boolean $$0) {
      this.al().b(bW, $$0);
   }

   private boolean gk() {
      return this.al().b(bW);
   }

   public boolean y() {
      return !this.dL().C_().b() && !this.gk() && !this.fT();
   }

   private void x(boolean $$0) {
      this.ch = $$0;
   }

   public boolean gj() {
      return this.t() && !this.ch;
   }

   @Nullable
   @Override
   public bin a(aks $$0, bin $$1) {
      cag $$2 = biw.W.a((cpx)$$0);
      if ($$2 != null) {
         $$2.fI();
      }

      return $$2;
   }

   @Override
   public boolean ge() {
      return !cah.c(this) && super.ge();
   }

   @Override
   public apg da() {
      return apg.f;
   }

   @Override
   protected ape w() {
      return this.dL().B ? null : cah.b(this).orElse(null);
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.kR;
   }

   @Override
   protected ape l_() {
      return apf.kQ;
   }

   @Override
   protected ape aL() {
      return apf.lw;
   }

   @Override
   protected ape aM() {
      return apf.lv;
   }

   @Override
   protected void b(gw $$0, dfl $$1) {
      this.a(apf.kT, 0.15F, 1.0F);
   }

   protected void b(ape $$0) {
      this.a($$0, this.eV(), this.eW());
   }

   @Override
   protected void W() {
      super.W();
      abd.a(this);
   }
}
