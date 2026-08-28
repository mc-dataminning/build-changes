import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import javax.annotation.Nullable;

public class cni extends cnh implements cll, cod {
   private static final akm<Boolean> bZ = akq.a(cni.class, ako.k);
   private static final akm<Boolean> ca = akq.a(cni.class, ako.k);
   private static final akm<Boolean> cb = akq.a(cni.class, ako.k);
   private static final alj cc = alj.b("baby");
   private static final bwn cd = new bwn(cc, 0.2F, bwn.a.b);
   private static final int ce = 16;
   private static final float cf = 0.35F;
   private static final int cg = 5;
   private static final float ch = 0.1F;
   private static final int ci = 3;
   private static final float cj = 0.2F;
   private static final buo ck = bus.aO.n().a(0.5F).b(0.97F);
   private static final double cl = 0.5;
   private final bsr cm = new bsr(8);
   private boolean cn;
   protected static final ImmutableList<cfs<? extends cfr<? super cni>>> d = ImmutableList.of(cfs.c, cfs.d, cfs.b, cfs.f, cfs.l);
   protected static final ImmutableList<cel<?>> bY = ImmutableList.of(
      cel.n,
      cel.v,
      cel.g,
      cel.h,
      cel.k,
      cel.l,
      cel.ao,
      cel.an,
      cel.L,
      cel.aP,
      cel.x,
      cel.y,
      new cel[]{
         cel.m,
         cel.E,
         cel.o,
         cel.p,
         cel.q,
         cel.t,
         cel.ab,
         cel.ac,
         cel.z,
         cel.ad,
         cel.ae,
         cel.ag,
         cel.af,
         cel.ai,
         cel.aj,
         cel.ah,
         cel.al,
         cel.M,
         cel.ar,
         cel.s,
         cel.as,
         cel.at,
         cel.ak,
         cel.am,
         cel.au,
         cel.av,
         cel.aw
      }
   );

   public cni(bus<? extends cnh> $$0, dfm $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      if (this.e_()) {
         $$0.a("IsBaby", true);
      }

      if (this.cn) {
         $$0.a("CannotHunt", true);
      }

      this.b($$0, this.dX());
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.z($$0.q("CannotHunt"));
      this.a($$0, this.dX());
   }

   @bat
   @Override
   public bsr v() {
      return this.cm;
   }

   @Override
   protected void a(arp $$0, btb $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof clk $$4 && $$4.go()) {
         cwm $$5 = new cwm(cwq.uJ);
         $$4.gp();
         this.a($$0, $$5);
      }

      this.cm.f().forEach($$1x -> this.a($$0, $$1x));
   }

   protected cwm i(cwm $$0) {
      return this.cm.b($$0);
   }

   protected boolean j(cwm $$0) {
      return this.cm.c($$0);
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
      $$0.a(ca, false);
      $$0.a(cb, false);
   }

   @Override
   public void a(akm<?> $$0) {
      super.a($$0);
      if (bZ.equals($$0)) {
         this.l_();
      }
   }

   public static bwo.a gt() {
      return cly.gs().a(bwp.s, 16.0).a(bwp.v, 0.35F).a(bwp.c, 5.0);
   }

   public static boolean b(bus<cni> $$0, dfn $$1, bur $$2, jh $$3, azu $$4) {
      return !$$1.a_($$3.e()).a(dis.kK);
   }

   @Nullable
   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      azu $$4 = $$0.G_();
      if ($$2 != bur.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.gn()) {
            this.a(but.a, this.gv());
         }
      }

      cnj.a(this, $$0.G_());
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean X() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.aj();
   }

   @Override
   protected void a(azu $$0, bsi $$1) {
      if (this.gn()) {
         this.a(but.f, new cwm(cwq.pP), $$0);
         this.a(but.e, new cwm(cwq.pQ), $$0);
         this.a(but.d, new cwm(cwq.pR), $$0);
         this.a(but.c, new cwm(cwq.pS), $$0);
      }
   }

   private void a(but $$0, cwm $$1, azu $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bwj.b<cni> ec() {
      return bwj.a(bY, d);
   }

   @Override
   protected bwj<?> a(Dynamic<?> $$0) {
      return cnj.a(this, this.ec().a($$0));
   }

   @Override
   public bwj<cni> eb() {
      return (bwj<cni>)super.eb();
   }

   @Override
   public bsk b(cou $$0, bsj $$1) {
      bsk $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (this.dV() instanceof arp $$3) {
         return cnj.a($$3, this, $$0, $$1);
      } else {
         boolean $$4 = cnj.b(this, $$0.b($$1)) && this.go() != cnk.d;
         return (bsk)($$4 ? bsk.a : bsk.e);
      }
   }

   @Override
   public buo e(bvt $$0) {
      return this.e_() ? ck : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(bZ, $$0);
      if (!this.dV().C) {
         bwl $$1 = this.g(bwp.v);
         $$1.c(cd.b());
         if ($$0) {
            $$1.b(cd);
         }
      }
   }

   @Override
   public boolean e_() {
      return this.au().a(bZ);
   }

   private void z(boolean $$0) {
      this.cn = $$0;
   }

   @Override
   protected boolean n() {
      return !this.cn;
   }

   @Override
   protected void a(arp $$0) {
      bou $$1 = bot.a();
      $$1.a("piglinBrain");
      this.eb().a($$0, this);
      $$1.c();
      cnj.a(this);
      super.a($$0);
   }

   @Override
   protected int e(arp $$0) {
      return this.bN;
   }

   @Override
   protected void g(arp $$0) {
      cnj.a($$0, this);
      this.cm.f().forEach($$1 -> this.a($$0, $$1));
      super.g($$0);
   }

   private cwm gv() {
      return (double)this.ae.i() < 0.5 ? new cwm(cwq.wn) : new cwm(cwq.oX);
   }

   private boolean gw() {
      return this.al.a(ca);
   }

   @Override
   public void b(boolean $$0) {
      this.al.a(ca, $$0);
   }

   @Override
   public void a() {
      this.be = 0;
   }

   @Override
   public cnk go() {
      if (this.gu()) {
         return cnk.e;
      } else if (cnj.a(this.eY())) {
         return cnk.d;
      } else if (this.gb() && this.gp()) {
         return cnk.a;
      } else if (this.gw()) {
         return cnk.c;
      } else {
         return this.b(cwq.wn) && cvd.g(this.dZ()) ? cnk.b : cnk.f;
      }
   }

   public boolean gu() {
      return this.al.a(cb);
   }

   public void y(boolean $$0) {
      this.al.a(cb, $$0);
   }

   @Override
   public boolean a(arp $$0, btb $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bvh $$4) {
         cnj.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   public void a(bvh $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cxi $$0) {
      return $$0 == cwq.wn;
   }

   protected void k(cwm $$0) {
      this.b(but.a, $$0);
   }

   protected void l(cwm $$0) {
      if ($$0.a(cnj.c)) {
         this.a(but.b, $$0);
         this.g(but.b);
      } else {
         this.b(but.b, $$0);
      }
   }

   @Override
   public boolean c(arp $$0, cwm $$1) {
      return $$0.N().b(dfi.c) && this.fL() && cnj.a(this, $$1);
   }

   protected boolean m(cwm $$0) {
      but $$1 = this.f($$0);
      cwm $$2 = this.a($$1);
      return this.a($$0, $$2, $$1);
   }

   @Override
   protected boolean a(cwm $$0, cwm $$1, but $$2) {
      if (dcf.a($$1, dce.E)) {
         return false;
      } else {
         boolean $$3 = cnj.a($$0) || $$0.a(cwq.wn);
         boolean $$4 = cnj.a($$1) || $$1.a(cwq.wn);
         if ($$3 && !$$4) {
            return true;
         } else if (!$$3 && $$4) {
            return false;
         } else {
            return this.gn() && !$$0.a(cwq.wn) && $$1.a(cwq.wn) ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(arp $$0, clc $$1) {
      this.a($$1);
      cnj.a($$0, this, $$1);
   }

   @Override
   public boolean a(bul $$0, boolean $$1) {
      if (this.e_() && $$0.aq() == bus.ai) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bul b(bul $$0, int $$1) {
      List<bul> $$2 = $$0.cZ();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected awm t() {
      return this.dV().C ? null : cnj.b(this).orElse(null);
   }

   @Override
   protected awm e(btb $$0) {
      return awn.tK;
   }

   @Override
   protected awm n_() {
      return awn.tI;
   }

   @Override
   protected void b(jh $$0, dvv $$1) {
      this.a(awn.tM, 0.15F, 1.0F);
   }

   @Override
   protected void gq() {
      this.b(awn.tN);
   }
}
