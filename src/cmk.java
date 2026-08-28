import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import javax.annotation.Nullable;

public class cmk extends cmj implements ckn, cnf {
   private static final akg<Boolean> bZ = akk.a(cmk.class, aki.k);
   private static final akg<Boolean> ca = akk.a(cmk.class, aki.k);
   private static final akg<Boolean> cb = akk.a(cmk.class, aki.k);
   private static final alc cc = alc.b("baby");
   private static final bvp cd = new bvp(cc, 0.2F, bvp.a.b);
   private static final int ce = 16;
   private static final float cf = 0.35F;
   private static final int cg = 5;
   private static final float ch = 0.1F;
   private static final int ci = 3;
   private static final float cj = 0.2F;
   private static final btr ck = btv.aA.n().a(0.5F).b(0.97F);
   private static final double cl = 0.5;
   private final brw cm = new brw(8);
   private boolean cn;
   protected static final ImmutableList<ceu<? extends cet<? super cmk>>> e = ImmutableList.of(ceu.c, ceu.d, ceu.b, ceu.f, ceu.l);
   protected static final ImmutableList<cdn<?>> bY = ImmutableList.of(
      cdn.n,
      cdn.v,
      cdn.g,
      cdn.h,
      cdn.k,
      cdn.l,
      cdn.ao,
      cdn.an,
      cdn.L,
      cdn.aP,
      cdn.x,
      cdn.y,
      new cdn[]{
         cdn.m,
         cdn.E,
         cdn.o,
         cdn.p,
         cdn.q,
         cdn.t,
         cdn.ab,
         cdn.ac,
         cdn.z,
         cdn.ad,
         cdn.ae,
         cdn.ag,
         cdn.af,
         cdn.ai,
         cdn.aj,
         cdn.ah,
         cdn.al,
         cdn.M,
         cdn.ar,
         cdn.s,
         cdn.as,
         cdn.at,
         cdn.ak,
         cdn.am,
         cdn.au,
         cdn.av,
         cdn.aw
      }
   );

   public cmk(btv<? extends cmj> $$0, deg $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      if (this.o_()) {
         $$0.a("IsBaby", true);
      }

      if (this.cn) {
         $$0.a("CannotHunt", true);
      }

      this.b($$0, this.dU());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.z($$0.q("CannotHunt"));
      this.a($$0, this.dU());
   }

   @baj
   @Override
   public brw y() {
      return this.cm;
   }

   @Override
   protected void a(arh $$0, bsg $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof ckm $$4 && $$4.gr()) {
         cvp $$5 = new cvp(cvt.ut);
         $$4.gs();
         this.b($$5);
      }

      this.cm.f().forEach(this::b);
   }

   protected cvp m(cvp $$0) {
      return this.cm.b($$0);
   }

   protected boolean n(cvp $$0) {
      return this.cm.c($$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
      $$0.a(ca, false);
      $$0.a(cb, false);
   }

   @Override
   public void a(akg<?> $$0) {
      super.a($$0);
      if (bZ.equals($$0)) {
         this.i_();
      }
   }

   public static bvq.a gw() {
      return cla.gv().a(bvr.s, 16.0).a(bvr.v, 0.35F).a(bvr.c, 5.0);
   }

   public static boolean b(btv<cmk> $$0, deh $$1, btu $$2, je $$3, azl $$4) {
      return !$$1.a_($$3.e()).a(dhl.kK);
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      azl $$4 = $$0.C_();
      if ($$2 != btu.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.gq()) {
            this.a(btw.a, this.gy());
         }
      }

      cml.a(this, $$0.C_());
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean ab() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.fY();
   }

   @Override
   protected void a(azl $$0, brn $$1) {
      if (this.gq()) {
         this.a(btw.f, new cvp(cvt.pP), $$0);
         this.a(btw.e, new cvp(cvt.pQ), $$0);
         this.a(btw.d, new cvp(cvt.pR), $$0);
         this.a(btw.c, new cvp(cvt.pS), $$0);
      }
   }

   private void a(btw $$0, cvp $$1, azl $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bvl.b<cmk> dY() {
      return bvl.a(bY, e);
   }

   @Override
   protected bvl<?> a(Dynamic<?> $$0) {
      return cml.a(this, this.dY().a($$0));
   }

   @Override
   public bvl<cmk> dX() {
      return (bvl<cmk>)super.dX();
   }

   @Override
   public brp b(cnu $$0, bro $$1) {
      brp $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dS().B) {
         return cml.a(this, $$0, $$1);
      } else {
         boolean $$3 = cml.b(this, $$0.b($$1)) && this.gr() != cmm.d;
         return (brp)($$3 ? brp.a : brp.e);
      }
   }

   @Override
   public btr e(buw $$0) {
      return this.o_() ? ck : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.at().a(bZ, $$0);
      if (!this.dS().B) {
         bvn $$1 = this.g(bvr.v);
         $$1.c(cd.b());
         if ($$0) {
            $$1.b(cd);
         }
      }
   }

   @Override
   public boolean o_() {
      return this.at().a(bZ);
   }

   private void z(boolean $$0) {
      this.cn = $$0;
   }

   @Override
   protected boolean q() {
      return !this.cn;
   }

   @Override
   protected void ad() {
      this.dS().ah().a("piglinBrain");
      this.dX().a((arh)this.dS(), this);
      this.dS().ah().c();
      cml.a(this);
      super.ad();
   }

   @Override
   protected int ek() {
      return this.bN;
   }

   @Override
   protected void a(arh $$0) {
      cml.b(this);
      this.cm.f().forEach(this::b);
      super.a($$0);
   }

   private cvp gy() {
      return (double)this.af.i() < 0.5 ? new cvp(cvt.vX) : new cvp(cvt.oX);
   }

   private boolean gz() {
      return this.am.a(ca);
   }

   @Override
   public void b(boolean $$0) {
      this.am.a(ca, $$0);
   }

   @Override
   public void a() {
      this.bb = 0;
   }

   @Override
   public cmm gr() {
      if (this.gx()) {
         return cmm.e;
      } else if (cml.a(this.eX())) {
         return cmm.d;
      } else if (this.gg() && this.gs()) {
         return cmm.a;
      } else if (this.gz()) {
         return cmm.c;
      } else {
         return this.b(cvt.vX) && cud.g(this.dW()) ? cmm.b : cmm.f;
      }
   }

   public boolean gx() {
      return this.am.a(cb);
   }

   public void y(boolean $$0) {
      this.am.a(cb, $$0);
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dS().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof buk) {
            cml.a(this, (buk)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(buk $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cwl $$0) {
      return $$0 == cvt.vX;
   }

   protected void o(cvp $$0) {
      this.b(btw.a, $$0);
   }

   protected void p(cvp $$0) {
      if ($$0.a(cml.c)) {
         this.a(btw.b, $$0);
         this.f(btw.b);
      } else {
         this.b(btw.b, $$0);
      }
   }

   @Override
   public boolean j(cvp $$0) {
      return this.dS().ac().b(dec.c) && this.fX() && cml.a(this, $$0);
   }

   protected boolean q(cvp $$0) {
      btw $$1 = this.g($$0);
      cvp $$2 = this.a($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(cvp $$0, cvp $$1) {
      if (dbm.a($$1, dbl.E)) {
         return false;
      } else {
         boolean $$2 = cml.a($$0) || $$0.a(cvt.vX);
         boolean $$3 = cml.a($$1) || $$1.a(cvt.vX);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gq() && !$$0.a(cvt.vX) && $$1.a(cvt.vX) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(cke $$0) {
      this.a($$0);
      cml.a(this, $$0);
   }

   @Override
   public boolean a(bto $$0, boolean $$1) {
      if (this.o_() && $$0.ao() == btv.Z) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bto b(bto $$0, int $$1) {
      List<bto> $$2 = $$0.cW();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected awd w() {
      return this.dS().B ? null : cml.c(this).orElse(null);
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.tM;
   }

   @Override
   protected awd n_() {
      return awe.tK;
   }

   @Override
   protected void b(je $$0, duo $$1) {
      this.a(awe.tO, 0.15F, 1.0F);
   }

   @Override
   protected void gt() {
      this.b(awe.tP);
   }
}
