import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cjb extends cja implements che, cjw {
   private static final ajk<Boolean> bZ = ajo.a(cjb.class, ajm.k);
   private static final ajk<Boolean> ca = ajo.a(cjb.class, ajm.k);
   private static final ajk<Boolean> cb = ajo.a(cjb.class, ajm.k);
   private static final UUID cc = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final bsj cd = new bsj(cc, "Baby speed boost", 0.2F, bsj.a.b);
   private static final int ce = 16;
   private static final float cf = 0.35F;
   private static final int cg = 5;
   private static final float ch = 0.1F;
   private static final int ci = 3;
   private static final float cj = 0.2F;
   private static final bqo ck = bqr.az.n().a(0.5F).b(0.97F);
   private static final double cl = 0.5;
   private final boz cm = new boz(8);
   private boolean cn;
   protected static final ImmutableList<cbo<? extends cbn<? super cjb>>> e = ImmutableList.of(cbo.c, cbo.d, cbo.b, cbo.f, cbo.l);
   protected static final ImmutableList<cah<?>> bY = ImmutableList.of(
      cah.n,
      cah.v,
      cah.g,
      cah.h,
      cah.k,
      cah.l,
      cah.ao,
      cah.an,
      cah.L,
      cah.aP,
      cah.x,
      cah.y,
      new cah[]{
         cah.m,
         cah.E,
         cah.o,
         cah.p,
         cah.q,
         cah.t,
         cah.ab,
         cah.ac,
         cah.z,
         cah.ad,
         cah.ae,
         cah.ag,
         cah.af,
         cah.ai,
         cah.aj,
         cah.ah,
         cah.al,
         cah.M,
         cah.ar,
         cah.s,
         cah.as,
         cah.at,
         cah.ak,
         cah.am,
         cah.au,
         cah.av,
         cah.aw
      }
   );

   public cjb(bqr<? extends cja> $$0, czu $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      if (this.p_()) {
         $$0.a("IsBaby", true);
      }

      if (this.cn) {
         $$0.a("CannotHunt", true);
      }

      this.b($$0, this.dP());
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.a($$0, this.dP());
   }

   @ayz
   @Override
   public boz y() {
      return this.cm;
   }

   @Override
   protected void a(bpj $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof chd $$4 && $$4.gq()) {
         csd $$5 = new csd(csg.ur);
         $$4.gr();
         this.b($$5);
      }

      this.cm.f().forEach(this::b);
   }

   protected csd n(csd $$0) {
      return this.cm.a($$0);
   }

   protected boolean o(csd $$0) {
      return this.cm.b($$0);
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
      $$0.a(ca, false);
      $$0.a(cb, false);
   }

   @Override
   public void a(ajk<?> $$0) {
      super.a($$0);
      if (bZ.equals($$0)) {
         this.j_();
      }
   }

   public static bsk.a gw() {
      return chr.gv().a(bsl.q, 16.0).a(bsl.r, 0.35F).a(bsl.c, 5.0);
   }

   public static boolean b(bqr<cjb> $$0, czv $$1, bri $$2, im $$3, ayd $$4) {
      return !$$1.a_($$3.d()).a(dcx.kK);
   }

   @Nullable
   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      ayd $$4 = $$0.E_();
      if ($$2 != bri.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.gq()) {
            this.a(bqs.a, this.gy());
         }
      }

      cjc.a(this, $$0.E_());
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean W() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.fV();
   }

   @Override
   protected void a(ayd $$0, boo $$1) {
      if (this.gq()) {
         this.a(bqs.f, new csd(csg.pO), $$0);
         this.a(bqs.e, new csd(csg.pP), $$0);
         this.a(bqs.d, new csd(csg.pQ), $$0);
         this.a(bqs.c, new csd(csg.pR), $$0);
      }
   }

   private void a(bqs $$0, csd $$1, ayd $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bsf.b<cjb> dR() {
      return bsf.a(bY, e);
   }

   @Override
   protected bsf<?> a(Dynamic<?> $$0) {
      return cjc.a(this, this.dR().a($$0));
   }

   @Override
   public bsf<cjb> dQ() {
      return (bsf<cjb>)super.dQ();
   }

   @Override
   public boq b(ckl $$0, bop $$1) {
      boq $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dN().B) {
         return cjc.a(this, $$0, $$1);
      } else {
         boolean $$3 = cjc.b(this, $$0.b($$1)) && this.gr() != cjd.d;
         return $$3 ? boq.a : boq.d;
      }
   }

   @Override
   public bqo e(brp $$0) {
      return this.p_() ? ck : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.an().a(bZ, $$0);
      if (!this.dN().B) {
         bsh $$1 = this.f(bsl.r);
         $$1.b(cd.b());
         if ($$0) {
            $$1.c(cd);
         }
      }
   }

   @Override
   public boolean p_() {
      return this.an().a(bZ);
   }

   private void y(boolean $$0) {
      this.cn = $$0;
   }

   @Override
   protected boolean r() {
      return !this.cn;
   }

   @Override
   protected void Y() {
      this.dN().af().a("piglinBrain");
      this.dQ().a((aqe)this.dN(), this);
      this.dN().af().c();
      cjc.a(this);
      super.Y();
   }

   @Override
   public int eh() {
      return this.bN;
   }

   @Override
   protected void c(aqe $$0) {
      cjc.b(this);
      this.cm.f().forEach(this::b);
      super.c($$0);
   }

   private csd gy() {
      return (double)this.ah.i() < 0.5 ? new csd(csg.vT) : new csd(csg.oV);
   }

   private boolean gz() {
      return this.ao.a(ca);
   }

   @Override
   public void b(boolean $$0) {
      this.ao.a(ca, $$0);
   }

   @Override
   public void a() {
      this.bg = 0;
   }

   @Override
   public cjd gr() {
      if (this.gx()) {
         return cjd.e;
      } else if (cjc.a(this.eW())) {
         return cjd.d;
      } else if (this.gh() && this.gs()) {
         return cjd.a;
      } else if (this.gz()) {
         return cjd.c;
      } else {
         return this.gh() && this.b(csg.vT) ? cjd.b : cjd.f;
      }
   }

   public boolean gx() {
      return this.ao.a(cb);
   }

   public void x(boolean $$0) {
      this.ao.a(cb, $$0);
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dN().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bre) {
            cjc.a(this, (bre)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(bre $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(csu $$0) {
      return $$0 == csg.vT;
   }

   protected void p(csd $$0) {
      this.b(bqs.a, $$0);
   }

   protected void q(csd $$0) {
      if ($$0.a(cjc.c)) {
         this.a(bqs.b, $$0);
         this.f(bqs.b);
      } else {
         this.b(bqs.b, $$0);
      }
   }

   @Override
   public boolean k(csd $$0) {
      return this.dN().aa().b(czq.c) && this.fU() && cjc.a(this, $$0);
   }

   protected boolean r(csd $$0) {
      bqs $$1 = brg.h($$0);
      csd $$2 = this.d($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(csd $$0, csd $$1) {
      if (cxo.f($$1)) {
         return false;
      } else {
         boolean $$2 = cjc.a($$0) || $$0.a(csg.vT);
         boolean $$3 = cjc.a($$1) || $$1.a(csg.vT);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gq() && !$$0.a(csg.vT) && $$1.a(csg.vT) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(cgv $$0) {
      this.a($$0);
      cjc.a(this, $$0);
   }

   @Override
   public boolean a(bql $$0, boolean $$1) {
      if (this.p_() && $$0.ai() == bqr.Z) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bql b(bql $$0, int $$1) {
      List<bql> $$2 = $$0.cQ();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected auy v() {
      return this.dN().B ? null : cjc.c(this).orElse(null);
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.tw;
   }

   @Override
   protected auy o_() {
      return auz.tu;
   }

   @Override
   protected void b(im $$0, dpy $$1) {
      this.a(auz.ty, 0.15F, 1.0F);
   }

   @Override
   protected void gt() {
      this.b(auz.tz);
   }
}
