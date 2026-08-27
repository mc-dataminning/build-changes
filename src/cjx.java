import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cjx extends cjw implements cia, cks {
   private static final ajm<Boolean> bZ = ajq.a(cjx.class, ajo.k);
   private static final ajm<Boolean> ca = ajq.a(cjx.class, ajo.k);
   private static final ajm<Boolean> cb = ajq.a(cjx.class, ajo.k);
   private static final UUID cc = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final btf cd = new btf(cc, "Baby speed boost", 0.2F, btf.a.b);
   private static final int ce = 16;
   private static final float cf = 0.35F;
   private static final int cg = 5;
   private static final float ch = 0.1F;
   private static final int ci = 3;
   private static final float cj = 0.2F;
   private static final brk ck = brn.az.n().a(0.5F).b(0.97F);
   private static final double cl = 0.5;
   private final bpv cm = new bpv(8);
   private boolean cn;
   protected static final ImmutableList<cck<? extends ccj<? super cjx>>> e = ImmutableList.of(cck.c, cck.d, cck.b, cck.f, cck.l);
   protected static final ImmutableList<cbd<?>> bY = ImmutableList.of(
      cbd.n,
      cbd.v,
      cbd.g,
      cbd.h,
      cbd.k,
      cbd.l,
      cbd.ao,
      cbd.an,
      cbd.L,
      cbd.aP,
      cbd.x,
      cbd.y,
      new cbd[]{
         cbd.m,
         cbd.E,
         cbd.o,
         cbd.p,
         cbd.q,
         cbd.t,
         cbd.ab,
         cbd.ac,
         cbd.z,
         cbd.ad,
         cbd.ae,
         cbd.ag,
         cbd.af,
         cbd.ai,
         cbd.aj,
         cbd.ah,
         cbd.al,
         cbd.M,
         cbd.ar,
         cbd.s,
         cbd.as,
         cbd.at,
         cbd.ak,
         cbd.am,
         cbd.au,
         cbd.av,
         cbd.aw
      }
   );

   public cjx(brn<? extends cjw> $$0, dad $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public void b(ua $$0) {
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
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.a($$0, this.dP());
   }

   @azc
   @Override
   public bpv y() {
      return this.cm;
   }

   @Override
   protected void a(bqf $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof chz $$4 && $$4.gq()) {
         csz $$5 = new csz(ctc.ur);
         $$4.gr();
         this.b($$5);
      }

      this.cm.f().forEach(this::b);
   }

   protected csz n(csz $$0) {
      return this.cm.b($$0);
   }

   protected boolean o(csz $$0) {
      return this.cm.c($$0);
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
      $$0.a(ca, false);
      $$0.a(cb, false);
   }

   @Override
   public void a(ajm<?> $$0) {
      super.a($$0);
      if (bZ.equals($$0)) {
         this.j_();
      }
   }

   public static btg.a gw() {
      return cin.gv().a(bth.q, 16.0).a(bth.r, 0.35F).a(bth.c, 5.0);
   }

   public static boolean b(brn<cjx> $$0, dae $$1, bse $$2, in $$3, ayg $$4) {
      return !$$1.a_($$3.d()).a(ddg.kK);
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      ayg $$4 = $$0.E_();
      if ($$2 != bse.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.gq()) {
            this.a(bro.a, this.gy());
         }
      }

      cjy.a(this, $$0.E_());
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
   protected void a(ayg $$0, bpk $$1) {
      if (this.gq()) {
         this.a(bro.f, new csz(ctc.pO), $$0);
         this.a(bro.e, new csz(ctc.pP), $$0);
         this.a(bro.d, new csz(ctc.pQ), $$0);
         this.a(bro.c, new csz(ctc.pR), $$0);
      }
   }

   private void a(bro $$0, csz $$1, ayg $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected btb.b<cjx> dR() {
      return btb.a(bY, e);
   }

   @Override
   protected btb<?> a(Dynamic<?> $$0) {
      return cjy.a(this, this.dR().a($$0));
   }

   @Override
   public btb<cjx> dQ() {
      return (btb<cjx>)super.dQ();
   }

   @Override
   public bpm b(clh $$0, bpl $$1) {
      bpm $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dN().B) {
         return cjy.a(this, $$0, $$1);
      } else {
         boolean $$3 = cjy.b(this, $$0.b($$1)) && this.gr() != cjz.d;
         return $$3 ? bpm.a : bpm.d;
      }
   }

   @Override
   public brk e(bsl $$0) {
      return this.p_() ? ck : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.an().a(bZ, $$0);
      if (!this.dN().B) {
         btd $$1 = this.f(bth.r);
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
      this.dQ().a((aqh)this.dN(), this);
      this.dN().af().c();
      cjy.a(this);
      super.Y();
   }

   @Override
   public int eh() {
      return this.bN;
   }

   @Override
   protected void c(aqh $$0) {
      cjy.b(this);
      this.cm.f().forEach(this::b);
      super.c($$0);
   }

   private csz gy() {
      return (double)this.ah.i() < 0.5 ? new csz(ctc.vT) : new csz(ctc.oV);
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
   public cjz gr() {
      if (this.gx()) {
         return cjz.e;
      } else if (cjy.a(this.eW())) {
         return cjz.d;
      } else if (this.gh() && this.gs()) {
         return cjz.a;
      } else if (this.gz()) {
         return cjz.c;
      } else {
         return this.gh() && this.b(ctc.vT) ? cjz.b : cjz.f;
      }
   }

   public boolean gx() {
      return this.ao.a(cb);
   }

   public void x(boolean $$0) {
      this.ao.a(cb, $$0);
   }

   @Override
   public boolean a(bqf $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dN().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bsa) {
            cjy.a(this, (bsa)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(bsa $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(ctq $$0) {
      return $$0 == ctc.vT;
   }

   protected void p(csz $$0) {
      this.b(bro.a, $$0);
   }

   protected void q(csz $$0) {
      if ($$0.a(cjy.c)) {
         this.a(bro.b, $$0);
         this.f(bro.b);
      } else {
         this.b(bro.b, $$0);
      }
   }

   @Override
   public boolean k(csz $$0) {
      return this.dN().aa().b(czz.c) && this.fU() && cjy.a(this, $$0);
   }

   protected boolean r(csz $$0) {
      bro $$1 = bsc.h($$0);
      csz $$2 = this.d($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(csz $$0, csz $$1) {
      if (cyh.f($$1)) {
         return false;
      } else {
         boolean $$2 = cjy.a($$0) || $$0.a(ctc.vT);
         boolean $$3 = cjy.a($$1) || $$1.a(ctc.vT);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gq() && !$$0.a(ctc.vT) && $$1.a(ctc.vT) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(chr $$0) {
      this.a($$0);
      cjy.a(this, $$0);
   }

   @Override
   public boolean a(brh $$0, boolean $$1) {
      if (this.p_() && $$0.ai() == brn.Z) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private brh b(brh $$0, int $$1) {
      List<brh> $$2 = $$0.cQ();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected avb v() {
      return this.dN().B ? null : cjy.c(this).orElse(null);
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.tx;
   }

   @Override
   protected avb o_() {
      return avc.tv;
   }

   @Override
   protected void b(in $$0, dqh $$1) {
      this.a(avc.tz, 0.15F, 1.0F);
   }

   @Override
   protected void gt() {
      this.b(avc.tA);
   }
}
