import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cko extends ckn implements cir, clj {
   private static final ajs<Boolean> bZ = ajw.a(cko.class, aju.k);
   private static final ajs<Boolean> ca = ajw.a(cko.class, aju.k);
   private static final ajs<Boolean> cb = ajw.a(cko.class, aju.k);
   private static final UUID cc = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final btw cd = new btw(cc, "Baby speed boost", 0.2F, btw.a.b);
   private static final int ce = 16;
   private static final float cf = 0.35F;
   private static final int cg = 5;
   private static final float ch = 0.1F;
   private static final int ci = 3;
   private static final float cj = 0.2F;
   private static final brz ck = bsc.aA.n().a(0.5F).b(0.97F);
   private static final double cl = 0.5;
   private final bqf cm = new bqf(8);
   private boolean cn;
   protected static final ImmutableList<cdb<? extends cda<? super cko>>> e = ImmutableList.of(cdb.c, cdb.d, cdb.b, cdb.f, cdb.l);
   protected static final ImmutableList<cbu<?>> bY = ImmutableList.of(
      cbu.n,
      cbu.v,
      cbu.g,
      cbu.h,
      cbu.k,
      cbu.l,
      cbu.ao,
      cbu.an,
      cbu.L,
      cbu.aP,
      cbu.x,
      cbu.y,
      new cbu[]{
         cbu.m,
         cbu.E,
         cbu.o,
         cbu.p,
         cbu.q,
         cbu.t,
         cbu.ab,
         cbu.ac,
         cbu.z,
         cbu.ad,
         cbu.ae,
         cbu.ag,
         cbu.af,
         cbu.ai,
         cbu.aj,
         cbu.ah,
         cbu.al,
         cbu.M,
         cbu.ar,
         cbu.s,
         cbu.as,
         cbu.at,
         cbu.ak,
         cbu.am,
         cbu.au,
         cbu.av,
         cbu.aw
      }
   );

   public cko(bsc<? extends ckn> $$0, daz $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      if (this.p_()) {
         $$0.a("IsBaby", true);
      }

      if (this.cn) {
         $$0.a("CannotHunt", true);
      }

      this.b($$0, this.dR());
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.a($$0, this.dR());
   }

   @azi
   @Override
   public bqf y() {
      return this.cm;
   }

   @Override
   protected void a(bqp $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof ciq $$4 && $$4.gq()) {
         ctq $$5 = new ctq(ctt.ur);
         $$4.gr();
         this.b($$5);
      }

      this.cm.f().forEach(this::b);
   }

   protected ctq n(ctq $$0) {
      return this.cm.b($$0);
   }

   protected boolean o(ctq $$0) {
      return this.cm.c($$0);
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
      $$0.a(ca, false);
      $$0.a(cb, false);
   }

   @Override
   public void a(ajs<?> $$0) {
      super.a($$0);
      if (bZ.equals($$0)) {
         this.j_();
      }
   }

   public static btx.a gw() {
      return cje.gv().a(bty.q, 16.0).a(bty.r, 0.35F).a(bty.c, 5.0);
   }

   public static boolean b(bsc<cko> $$0, dba $$1, bsu $$2, io $$3, aym $$4) {
      return !$$1.a_($$3.d()).a(dec.kK);
   }

   @Nullable
   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      aym $$4 = $$0.E_();
      if ($$2 != bsu.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.gq()) {
            this.a(bsd.a, this.gy());
         }
      }

      ckp.a(this, $$0.E_());
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
   protected void a(aym $$0, bpu $$1) {
      if (this.gq()) {
         this.a(bsd.f, new ctq(ctt.pO), $$0);
         this.a(bsd.e, new ctq(ctt.pP), $$0);
         this.a(bsd.d, new ctq(ctt.pQ), $$0);
         this.a(bsd.c, new ctq(ctt.pR), $$0);
      }
   }

   private void a(bsd $$0, ctq $$1, aym $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bts.b<cko> dT() {
      return bts.a(bY, e);
   }

   @Override
   protected bts<?> a(Dynamic<?> $$0) {
      return ckp.a(this, this.dT().a($$0));
   }

   @Override
   public bts<cko> dS() {
      return (bts<cko>)super.dS();
   }

   @Override
   public bpw b(cly $$0, bpv $$1) {
      bpw $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dP().B) {
         return ckp.a(this, $$0, $$1);
      } else {
         boolean $$3 = ckp.b(this, $$0.b($$1)) && this.gr() != ckq.d;
         return $$3 ? bpw.a : bpw.d;
      }
   }

   @Override
   public brz e(btc $$0) {
      return this.p_() ? ck : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.ap().a(bZ, $$0);
      if (!this.dP().B) {
         btu $$1 = this.f(bty.r);
         $$1.b(cd.b());
         if ($$0) {
            $$1.c(cd);
         }
      }
   }

   @Override
   public boolean p_() {
      return this.ap().a(bZ);
   }

   private void y(boolean $$0) {
      this.cn = $$0;
   }

   @Override
   protected boolean s() {
      return !this.cn;
   }

   @Override
   protected void Y() {
      this.dP().af().a("piglinBrain");
      this.dS().a((aqn)this.dP(), this);
      this.dP().af().c();
      ckp.a(this);
      super.Y();
   }

   @Override
   public int ej() {
      return this.bN;
   }

   @Override
   protected void c(aqn $$0) {
      ckp.b(this);
      this.cm.f().forEach(this::b);
      super.c($$0);
   }

   private ctq gy() {
      return (double)this.ah.i() < 0.5 ? new ctq(ctt.vT) : new ctq(ctt.oV);
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
      this.bf = 0;
   }

   @Override
   public ckq gr() {
      if (this.gx()) {
         return ckq.e;
      } else if (ckp.a(this.eY())) {
         return ckq.d;
      } else if (this.gh() && this.gs()) {
         return ckq.a;
      } else if (this.gz()) {
         return ckq.c;
      } else {
         return this.gh() && this.b(ctt.vT) ? ckq.b : ckq.f;
      }
   }

   public boolean gx() {
      return this.ao.a(cb);
   }

   public void x(boolean $$0) {
      this.ao.a(cb, $$0);
   }

   @Override
   public boolean a(bqp $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bsq) {
            ckp.a(this, (bsq)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(bsq $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cuj $$0) {
      return $$0 == ctt.vT;
   }

   protected void p(ctq $$0) {
      this.b(bsd.a, $$0);
   }

   protected void q(ctq $$0) {
      if ($$0.a(ckp.c)) {
         this.a(bsd.b, $$0);
         this.f(bsd.b);
      } else {
         this.b(bsd.b, $$0);
      }
   }

   @Override
   public boolean k(ctq $$0) {
      return this.dP().aa().b(dav.c) && this.fU() && ckp.a(this, $$0);
   }

   protected boolean r(ctq $$0) {
      bsd $$1 = bss.h($$0);
      ctq $$2 = this.a($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(ctq $$0, ctq $$1) {
      if (czc.f($$1)) {
         return false;
      } else {
         boolean $$2 = ckp.a($$0) || $$0.a(ctt.vT);
         boolean $$3 = ckp.a($$1) || $$1.a(ctt.vT);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gq() && !$$0.a(ctt.vT) && $$1.a(ctt.vT) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(cii $$0) {
      this.a($$0);
      ckp.a(this, $$0);
   }

   @Override
   public boolean a(brw $$0, boolean $$1) {
      if (this.p_() && $$0.ak() == bsc.Z) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private brw b(brw $$0, int $$1) {
      List<brw> $$2 = $$0.cS();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected avh v() {
      return this.dP().B ? null : ckp.c(this).orElse(null);
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.tI;
   }

   @Override
   protected avh o_() {
      return avi.tG;
   }

   @Override
   protected void b(io $$0, drd $$1) {
      this.a(avi.tK, 0.15F, 1.0F);
   }

   @Override
   protected void gt() {
      this.b(avi.tL);
   }
}
