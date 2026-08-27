import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwo extends but {
   public static final bit bT = bit.b(0.9F, 1.3F).a(0.7F);
   private static final int ca = 2;
   private static final int cb = 1;
   protected static final ImmutableList<bto<? extends btn<? super bwo>>> bU = ImmutableList.of(bto.c, bto.d, bto.b, bto.n, bto.f, bto.q);
   protected static final ImmutableList<bsj<?>> bW = ImmutableList.of(
      bsj.n, bsj.h, bsj.m, bsj.E, bsj.t, bsj.au, bsj.r, bsj.R, bsj.S, bsj.N, bsj.J, bsj.O, new bsj[]{bsj.Q, bsj.U, bsj.V, bsj.Y}
   );
   public static final int bX = 10;
   public static final double bY = 0.02;
   public static final double bZ = 0.1F;
   private static final aeg<Boolean> cc = aej.a(bwo.class, aei.k);
   private static final aeg<Boolean> cd = aej.a(bwo.class, aei.k);
   private static final aeg<Boolean> ce = aej.a(bwo.class, aei.k);
   private boolean cf;
   private int cg;

   public bwo(biw<? extends bwo> $$0, cpx $$1) {
      super($$0, $$1);
      this.L().a(true);
      this.a(eaz.f, -1.0F);
      this.a(eaz.g, -1.0F);
   }

   public cjh s() {
      ase $$0 = ase.a((long)this.cv().hashCode());
      aqj<ciz> $$1 = this.gn() ? aqb.b : aqb.a;
      hk<ciz> $$2 = jd.am.a($$1);
      return cja.a(cjk.vi, $$2.a($$0).get());
   }

   @Override
   protected bki.b<bwo> dO() {
      return bki.a(bW, bU);
   }

   @Override
   protected bki<?> a(Dynamic<?> $$0) {
      return bwp.a(this.dO().a($$0));
   }

   public static bkn.a t() {
      return bjk.A().a(bko.a, 10.0).a(bko.d, 0.2F).a(bko.f, 2.0);
   }

   @Override
   protected void m() {
      if (this.m_()) {
         this.a(bko.f).a(1.0);
         this.gm();
      } else {
         this.a(bko.f).a(2.0);
         this.gl();
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected ape w() {
      return this.gn() ? apf.jN : apf.jD;
   }

   @Override
   protected ape d(bhq $$0) {
      return this.gn() ? apf.jQ : apf.jG;
   }

   @Override
   protected ape l_() {
      return this.gn() ? apf.jO : apf.jE;
   }

   @Override
   protected void b(gw $$0, dfl $$1) {
      this.a(apf.jW, 0.15F, 1.0F);
   }

   protected ape y() {
      return this.gn() ? apf.jS : apf.jI;
   }

   @Nullable
   public bwo b(aks $$0, bin $$1) {
      bwo $$2 = biw.U.a((cpx)$$0);
      if ($$2 != null) {
         bwp.a($$2, $$0.D_());
         bin $$3 = (bin)($$0.D_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof bwo $$4 && $$4.gn() || $$0.D_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bki<bwo> dN() {
      return (bki<bwo>)super.dN();
   }

   @Override
   protected void X() {
      this.dL().ad().a("goatBrain");
      this.dN().a((aks)this.dL(), this);
      this.dL().ad().c();
      this.dL().ad().a("goatActivityUpdate");
      bwp.a(this);
      this.dL().ad().c();
      super.X();
   }

   @Override
   public int Z() {
      return 15;
   }

   @Override
   public void n(float $$0) {
      int $$1 = this.Z();
      float $$2 = ary.c(this.aU, $$0);
      float $$3 = ary.a($$2, (float)(-$$1), (float)$$1);
      super.n(this.aU + $$3);
   }

   @Override
   public ape d(cjh $$0) {
      return this.gn() ? apf.jP : apf.jF;
   }

   @Override
   public bha b(cbw $$0, bgz $$1) {
      cjh $$2 = $$0.b($$1);
      if ($$2.a(cjk.pK) && !this.m_()) {
         $$0.a(this.y(), 1.0F, 1.0F);
         cjh $$3 = cjj.a($$2, $$0, cjk.pQ.ai_());
         $$0.a($$1, $$3);
         return bha.a(this.dL().B);
      } else {
         bha $$4 = super.b($$0, $$1);
         if ($$4.a() && this.m($$2)) {
            this.dL().a(null, this, this.d($$2), apg.g, 1.0F, ary.b(this.dL().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      ase $$5 = $$0.D_();
      bwp.a(this, $$5);
      this.w($$5.j() < 0.02);
      this.m();
      if (!this.m_() && (double)$$5.i() < 0.1F) {
         aeg<Boolean> $$6 = $$5.h() ? cd : ce;
         this.an.b($$6, false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void W() {
      super.W();
      abd.a(this);
   }

   @Override
   public bit a(bju $$0) {
      return $$0 == bju.g ? bT.a(this.dY()) : super.a($$0);
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gn());
      $$0.a("HasLeftHorn", this.gd());
      $$0.a("HasRightHorn", this.gj());
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.w($$0.q("IsScreamingGoat"));
      this.an.b(cd, $$0.q("HasLeftHorn"));
      this.an.b(ce, $$0.q("HasRightHorn"));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 58) {
         this.cf = true;
      } else if ($$0 == 59) {
         this.cf = false;
      } else {
         super.b($$0);
      }
   }

   @Override
   public void b_() {
      if (this.cf) {
         this.cg++;
      } else {
         this.cg -= 2;
      }

      this.cg = ary.a(this.cg, 0, 20);
      super.b_();
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(cc, false);
      this.an.a(cd, true);
      this.an.a(ce, true);
   }

   public boolean gd() {
      return this.an.b(cd);
   }

   public boolean gj() {
      return this.an.b(ce);
   }

   public boolean gk() {
      boolean $$0 = this.gd();
      boolean $$1 = this.gj();
      if (!$$0 && !$$1) {
         return false;
      } else {
         aeg<Boolean> $$2;
         if (!$$0) {
            $$2 = ce;
         } else if (!$$1) {
            $$2 = cd;
         } else {
            $$2 = this.ag.h() ? cd : ce;
         }

         this.an.b($$2, false);
         ehp $$5 = this.dj();
         cjh $$6 = this.s();
         double $$7 = (double)ary.b(this.ag, -0.2F, 0.2F);
         double $$8 = (double)ary.b(this.ag, 0.3F, 0.7F);
         double $$9 = (double)ary.b(this.ag, -0.2F, 0.2F);
         byp $$10 = new byp(this.dL(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dL().b($$10);
         return true;
      }
   }

   public void gl() {
      this.an.b(cd, true);
      this.an.b(ce, true);
   }

   public void gm() {
      this.an.b(cd, false);
      this.an.b(ce, false);
   }

   public boolean gn() {
      return this.an.b(cc);
   }

   public void w(boolean $$0) {
      this.an.b(cc, $$0);
   }

   public float go() {
      return (float)this.cg / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(biw<? extends but> $$0, cpy $$1, bjm $$2, gw $$3, ase $$4) {
      return $$1.a_($$3.d()).a(apu.bR) && a($$1, $$3);
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.1875F * $$2, 0.0F);
   }
}
