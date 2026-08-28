import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cgo extends ceo {
   public static final bsg ca = bsg.b(0.9F, 1.3F).a(0.7F);
   private static final int ch = 2;
   private static final int ci = 1;
   protected static final ImmutableList<cdj<? extends cdi<? super cgo>>> cb = ImmutableList.of(cdj.c, cdj.d, cdj.b, cdj.o, cdj.f, cdj.r);
   protected static final ImmutableList<ccc<?>> cd = ImmutableList.of(
      ccc.n, ccc.h, ccc.m, ccc.E, ccc.t, ccc.av, ccc.r, ccc.S, ccc.T, ccc.O, ccc.K, ccc.P, new ccc[]{ccc.R, ccc.V, ccc.W, ccc.Z}
   );
   public static final int ce = 10;
   public static final double cf = 0.02;
   public static final double cg = 0.1F;
   private static final ajp<Boolean> cj = ajt.a(cgo.class, ajr.k);
   private static final ajp<Boolean> ck = ajt.a(cgo.class, ajr.k);
   private static final ajp<Boolean> cl = ajt.a(cgo.class, ajr.k);
   private boolean cm;
   private int cn;

   public cgo(bsj<? extends cgo> $$0, dcd $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.a(eos.f, -1.0F);
      this.a(eos.g, -1.0F);
   }

   public cua s() {
      aym $$0 = aym.a((long)this.cz().hashCode());
      awk<cts> $$1 = this.gx() ? awc.b : awc.a;
      jn<cts> $$2 = lq.ak.a($$1);
      return ctt.a(cud.wh, $$2.a($$0).get());
   }

   @Override
   protected bua.b<cgo> dU() {
      return bua.a(cd, cb);
   }

   @Override
   protected bua<?> a(Dynamic<?> $$0) {
      return cgp.a(this.dU().a($$0));
   }

   public static buf.a u() {
      return bta.A().a(bug.s, 10.0).a(bug.v, 0.2F).a(bug.c, 2.0);
   }

   @Override
   protected void k() {
      if (this.p_()) {
         this.f(bug.c).a(1.0);
         this.gw();
      } else {
         this.f(bug.c).a(2.0);
         this.gv();
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected ave v() {
      return this.gx() ? avf.kU : avf.kK;
   }

   @Override
   protected ave d(bqw $$0) {
      return this.gx() ? avf.kX : avf.kN;
   }

   @Override
   protected ave o_() {
      return this.gx() ? avf.kV : avf.kL;
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
      this.a(avf.ld, 0.15F, 1.0F);
   }

   protected ave y() {
      return this.gx() ? avf.kZ : avf.kP;
   }

   @Nullable
   public cgo b(aqk $$0, brx $$1) {
      cgo $$2 = bsj.X.a((dcd)$$0);
      if ($$2 != null) {
         cgp.a($$2, $$0.E_());
         brx $$3 = (brx)($$0.E_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof cgo $$4 && $$4.gx() || $$0.E_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bua<cgo> dT() {
      return (bua<cgo>)super.dT();
   }

   @Override
   protected void Z() {
      this.dP().ag().a("goatBrain");
      this.dT().a((aqk)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("goatActivityUpdate");
      cgp.a(this);
      this.dP().ag().c();
      super.Z();
   }

   @Override
   public int ab() {
      return 15;
   }

   @Override
   public void o(float $$0) {
      int $$1 = this.ab();
      float $$2 = aye.c(this.aY, $$0);
      float $$3 = aye.a($$2, (float)(-$$1), (float)$$1);
      super.o(this.aY + $$3);
   }

   @Override
   public ave d(cua $$0) {
      return this.gx() ? avf.kW : avf.kM;
   }

   @Override
   public boolean o(cua $$0) {
      return $$0.a(awd.ab);
   }

   @Override
   public bqd b(cmh $$0, bqc $$1) {
      cua $$2 = $$0.b($$1);
      if ($$2.a(cud.qy) && !this.p_()) {
         $$0.a(this.y(), 1.0F, 1.0F);
         cua $$3 = cuc.a($$2, $$0, cud.qE.w());
         $$0.a($$1, $$3);
         return bqd.a(this.dP().B);
      } else {
         bqd $$4 = super.b($$0, $$1);
         if ($$4.a() && this.o($$2)) {
            this.dP().a(null, this, this.d($$2), avg.g, 1.0F, aye.b(this.dP().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      aym $$4 = $$0.E_();
      cgp.a(this, $$4);
      this.w($$4.j() < 0.02);
      this.k();
      if (!this.p_() && (double)$$4.i() < 0.1F) {
         ajp<Boolean> $$5 = $$4.h() ? ck : cl;
         this.ao.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   @Override
   public bsg e(btk $$0) {
      return $$0 == btk.g ? ca.a(this.ea()) : super.e($$0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gx());
      $$0.a("HasLeftHorn", this.gn());
      $$0.a("HasRightHorn", this.gt());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.w($$0.q("IsScreamingGoat"));
      this.ao.a(ck, $$0.q("HasLeftHorn"));
      this.ao.a(cl, $$0.q("HasRightHorn"));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 58) {
         this.cm = true;
      } else if ($$0 == 59) {
         this.cm = false;
      } else {
         super.b($$0);
      }
   }

   @Override
   public void n_() {
      if (this.cm) {
         this.cn++;
      } else {
         this.cn -= 2;
      }

      this.cn = aye.a(this.cn, 0, 20);
      super.n_();
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cj, false);
      $$0.a(ck, true);
      $$0.a(cl, true);
   }

   public boolean gn() {
      return this.ao.a(ck);
   }

   public boolean gt() {
      return this.ao.a(cl);
   }

   public boolean gu() {
      boolean $$0 = this.gn();
      boolean $$1 = this.gt();
      if (!$$0 && !$$1) {
         return false;
      } else {
         ajp<Boolean> $$2;
         if (!$$0) {
            $$2 = cl;
         } else if (!$$1) {
            $$2 = ck;
         } else {
            $$2 = this.ah.h() ? ck : cl;
         }

         this.ao.a($$2, false);
         evz $$5 = this.dn();
         cua $$6 = this.s();
         double $$7 = (double)aye.b(this.ah, -0.2F, 0.2F);
         double $$8 = (double)aye.b(this.ah, 0.3F, 0.7F);
         double $$9 = (double)aye.b(this.ah, -0.2F, 0.2F);
         cir $$10 = new cir(this.dP(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dP().b($$10);
         return true;
      }
   }

   public void gv() {
      this.ao.a(ck, true);
      this.ao.a(cl, true);
   }

   public void gw() {
      this.ao.a(ck, false);
      this.ao.a(cl, false);
   }

   public boolean gx() {
      return this.ao.a(cj);
   }

   public void w(boolean $$0) {
      this.ao.a(cj, $$0);
   }

   public float gy() {
      return (float)this.cn / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bsj<? extends ceo> $$0, dce $$1, btc $$2, ja $$3, aym $$4) {
      return $$1.a_($$3.d()).a(avu.bZ) && a($$1, $$3);
   }
}
