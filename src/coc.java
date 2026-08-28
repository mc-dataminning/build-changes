import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import javax.annotation.Nullable;

public class coc extends cob implements cmb, coy {
   private static final aks<Boolean> ca = akw.a(coc.class, aku.k);
   private static final aks<Boolean> cb = akw.a(coc.class, aku.k);
   private static final aks<Boolean> cc = akw.a(coc.class, aku.k);
   private static final alp cd = alp.b("baby");
   private static final bxd ce = new bxd(cd, 0.2F, bxd.a.b);
   private static final int cf = 16;
   private static final float cg = 0.35F;
   private static final int ch = 5;
   private static final float ci = 0.1F;
   private static final int cj = 3;
   private static final float ck = 0.2F;
   private static final bve cl = bvi.aS.n().a(0.5F).b(0.97F);
   private static final double cm = 0.5;
   private final bth cn = new bth(8);
   private boolean co;
   protected static final ImmutableList<cgi<? extends cgh<? super coc>>> d = ImmutableList.of(cgi.c, cgi.d, cgi.b, cgi.f, cgi.l);
   protected static final ImmutableList<cfb<?>> bZ = ImmutableList.of(
      cfb.n,
      cfb.v,
      cfb.g,
      cfb.h,
      cfb.k,
      cfb.l,
      cfb.ao,
      cfb.an,
      cfb.L,
      cfb.aP,
      cfb.x,
      cfb.y,
      new cfb[]{
         cfb.m,
         cfb.E,
         cfb.o,
         cfb.p,
         cfb.q,
         cfb.t,
         cfb.ab,
         cfb.ac,
         cfb.z,
         cfb.ad,
         cfb.ae,
         cfb.ag,
         cfb.af,
         cfb.ai,
         cfb.aj,
         cfb.ah,
         cfb.al,
         cfb.M,
         cfb.ar,
         cfb.s,
         cfb.as,
         cfb.at,
         cfb.ak,
         cfb.am,
         cfb.au,
         cfb.av,
         cfb.aw
      }
   );

   public coc(bvi<? extends cob> $$0, dgz $$1) {
      super($$0, $$1);
      this.bO = 5;
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      if (this.e_()) {
         $$0.a("IsBaby", true);
      }

      if (this.co) {
         $$0.a("CannotHunt", true);
      }

      this.b($$0, this.dY());
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.z($$0.q("CannotHunt"));
      this.a($$0, this.dY());
   }

   @bbb
   @Override
   public bth t() {
      return this.cn;
   }

   @Override
   protected void a(arx $$0, btr $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cma $$4 && $$4.gp()) {
         cxg $$5 = new cxg(cxk.vq);
         $$4.gq();
         this.a($$0, $$5);
      }

      this.cn.f().forEach($$1x -> this.a($$0, $$1x));
   }

   protected cxg i(cxg $$0) {
      return this.cn.b($$0);
   }

   protected boolean j(cxg $$0) {
      return this.cn.c($$0);
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(ca, false);
      $$0.a(cb, false);
      $$0.a(cc, false);
   }

   @Override
   public void a(aks<?> $$0) {
      super.a($$0);
      if (ca.equals($$0)) {
         this.m_();
      }
   }

   public static bxe.a gu() {
      return cmo.gt().a(bxf.s, 16.0).a(bxf.v, 0.35F).a(bxf.c, 5.0);
   }

   public static boolean b(bvi<coc> $$0, dha $$1, bvh $$2, jh $$3, bac $$4) {
      return !$$1.a_($$3.e()).a(dkf.lm);
   }

   @Nullable
   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      bac $$4 = $$0.H_();
      if ($$2 != bvh.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.go()) {
            this.a(bvj.a, this.gw());
         }
      }

      cod.a(this, $$0.H_());
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
   protected void a(bac $$0, bsy $$1) {
      if (this.go()) {
         this.a(bvj.f, new cxg(cxk.qt), $$0);
         this.a(bvj.e, new cxg(cxk.qu), $$0);
         this.a(bvj.d, new cxg(cxk.qv), $$0);
         this.a(bvj.c, new cxg(cxk.qw), $$0);
      }
   }

   private void a(bvj $$0, cxg $$1, bac $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bwz.b<coc> ed() {
      return bwz.a(bZ, d);
   }

   @Override
   protected bwz<?> a(Dynamic<?> $$0) {
      return cod.a(this, this.ed().a($$0));
   }

   @Override
   public bwz<coc> ec() {
      return (bwz<coc>)super.ec();
   }

   @Override
   public bta b(cpo $$0, bsz $$1) {
      bta $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (this.dW() instanceof arx $$3) {
         return cod.a($$3, this, $$0, $$1);
      } else {
         boolean $$4 = cod.b(this, $$0.b($$1)) && this.gp() != coe.d;
         return (bta)($$4 ? bta.a : bta.e);
      }
   }

   @Override
   public bve e(bwj $$0) {
      return this.e_() ? cl : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(ca, $$0);
      if (!this.dW().C) {
         bxb $$1 = this.g(bxf.v);
         $$1.c(ce.b());
         if ($$0) {
            $$1.b(ce);
         }
      }
   }

   @Override
   public boolean e_() {
      return this.au().a(ca);
   }

   private void z(boolean $$0) {
      this.co = $$0;
   }

   @Override
   protected boolean m() {
      return !this.co;
   }

   @Override
   protected void a(arx $$0) {
      bpj $$1 = bpi.a();
      $$1.a("piglinBrain");
      this.ec().a($$0, this);
      $$1.c();
      cod.a(this);
      super.a($$0);
   }

   @Override
   protected int e(arx $$0) {
      return this.bO;
   }

   @Override
   protected void g(arx $$0) {
      cod.a($$0, this);
      this.cn.f().forEach($$1 -> this.a($$0, $$1));
      super.g($$0);
   }

   private cxg gw() {
      return (double)this.ae.i() < 0.5 ? new cxg(cxk.wV) : new cxg(cxk.pB);
   }

   private boolean gx() {
      return this.al.a(cb);
   }

   @Override
   public void b(boolean $$0) {
      this.al.a(cb, $$0);
   }

   @Override
   public void a() {
      this.bf = 0;
   }

   @Override
   public coe gp() {
      if (this.gv()) {
         return coe.e;
      } else if (cod.a(this.fa())) {
         return coe.d;
      } else if (this.gd() && this.gq()) {
         return coe.a;
      } else if (this.gx()) {
         return coe.c;
      } else {
         return this.b(cxk.wV) && cvx.g(this.ea()) ? coe.b : coe.f;
      }
   }

   public boolean gv() {
      return this.al.a(cc);
   }

   public void y(boolean $$0) {
      this.al.a(cc, $$0);
   }

   @Override
   public boolean a(arx $$0, btr $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bvx $$4) {
         cod.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   public void a(bvx $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cyc $$0) {
      return $$0 == cxk.wV;
   }

   protected void k(cxg $$0) {
      this.b(bvj.a, $$0);
   }

   protected void l(cxg $$0) {
      if ($$0.a(cod.c)) {
         this.a(bvj.b, $$0);
         this.g(bvj.b);
      } else {
         this.b(bvj.b, $$0);
      }
   }

   @Override
   public boolean c(arx $$0, cxg $$1) {
      return $$0.O().b(dgv.c) && this.fN() && cod.a(this, $$1);
   }

   protected boolean m(cxg $$0) {
      bvj $$1 = this.f($$0);
      cxg $$2 = this.a($$1);
      return this.a($$0, $$2, $$1);
   }

   @Override
   protected boolean a(cxg $$0, cxg $$1, bvj $$2) {
      if (dds.a($$1, ddr.E)) {
         return false;
      } else {
         boolean $$3 = cod.a($$0) || $$0.a(cxk.wV);
         boolean $$4 = cod.a($$1) || $$1.a(cxk.wV);
         if ($$3 && !$$4) {
            return true;
         } else if (!$$3 && $$4) {
            return false;
         } else {
            return this.go() && !$$0.a(cxk.wV) && $$1.a(cxk.wV) ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(arx $$0, cls $$1) {
      this.a($$1);
      cod.a($$0, this, $$1);
   }

   @Override
   public boolean a(bvb $$0, boolean $$1) {
      if (this.e_() && $$0.aq() == bvi.ak) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bvb b(bvb $$0, int $$1) {
      List<bvb> $$2 = $$0.cZ();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected awu u() {
      return this.dW().C ? null : cod.b(this).orElse(null);
   }

   @Override
   protected awu e(btr $$0) {
      return awv.ul;
   }

   @Override
   protected awu o_() {
      return awv.uj;
   }

   @Override
   protected void b(jh $$0, dxo $$1) {
      this.a(awv.un, 0.15F, 1.0F);
   }

   @Override
   protected void gr() {
      this.b(awv.uo);
   }
}
