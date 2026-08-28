import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ciu extends bwf implements coy, ect {
   private static final Logger bZ = LogUtils.getLogger();
   private static final kl ca = new kl(1, 1, 1);
   private static final int cb = 5;
   private static final float cc = 55.0F;
   private static final float cd = 15.0F;
   private static final int ce = 6000;
   private static final int cf = 3;
   public static final int a = 1024;
   private static final aks<Boolean> cg = akw.a(ciu.class, aku.k);
   private static final aks<Boolean> ch = akw.a(ciu.class, aku.k);
   protected static final ImmutableList<cgi<? extends cgh<? super ciu>>> b = ImmutableList.of(cgi.c, cgi.d, cgi.f, cgi.b);
   protected static final ImmutableList<cfb<?>> c = ImmutableList.of(
      cfb.t, cfb.n, cfb.h, cfb.m, cfb.E, cfb.x, cfb.L, cfb.aM, cfb.aN, cfb.aO, cfb.aP, cfb.Z, new cfb[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final ech<ect.b> ci;
   private ect.a cj;
   private final ect.d ck;
   private final ech<ciu.a> cl;
   private final bth cm = new bth(1);
   @Nullable
   private jh cn;
   private long co;
   private float cp;
   private float cq;
   private float cr;
   private float cs;
   private float ct;

   public ciu(bvi<? extends ciu> $$0, dgz $$1) {
      super($$0, $$1);
      this.bQ = new cbv(this, 20, true);
      this.a_(this.fN());
      this.ck = new ciu.b();
      this.cj = new ect.a();
      this.ci = new ech<>(new ect.b(this));
      this.cl = new ech<>(new ciu.a(this.ck.b(), eck.E.a().a()));
   }

   @Override
   protected bwz.b<ciu> ed() {
      return bwz.a(c, b);
   }

   @Override
   protected bwz<?> a(Dynamic<?> $$0) {
      return civ.a(this.ed().a($$0));
   }

   @Override
   public bwz<ciu> ec() {
      return (bwz<ciu>)super.ec();
   }

   public static bxe.a m() {
      return bvz.C().a(bxf.s, 20.0).a(bxf.l, 0.1F).a(bxf.v, 0.1F).a(bxf.c, 2.0);
   }

   @Override
   protected cfj b(dgz $$0) {
      cfh $$1 = new cfh(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      $$1.a(48.0F);
      return $$1;
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(cg, false);
      $$0.a(ch, true);
   }

   @Override
   public void a_(fbr $$0) {
      if (this.di()) {
         if (this.bj()) {
            this.a(0.02F, $$0);
            this.a(bwb.a, this.dz());
            this.h(this.dz().c(0.8F));
         } else if (this.bx()) {
            this.a(0.02F, $$0);
            this.a(bwb.a, this.dz());
            this.h(this.dz().c(0.5));
         } else {
            this.a(this.fp(), $$0);
            this.a(bwb.a, this.dz());
            this.h(this.dz().c(0.91F));
         }
      }
   }

   @Override
   public boolean a(arx $$0, btr $$1, float $$2) {
      if ($$1.d() instanceof cpo $$3) {
         Optional<UUID> $$4 = this.ec().c(cfb.aM);
         if ($$4.isPresent() && $$3.cG().equals($$4.get())) {
            return false;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected void b(jh $$0, dxo $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dxo $$2, jh $$3) {
   }

   @Override
   protected awu u() {
      return this.d(bvj.a) ? awv.a : awv.b;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.d;
   }

   @Override
   protected awu o_() {
      return awv.c;
   }

   @Override
   protected float fg() {
      return 0.4F;
   }

   @Override
   protected void a(arx $$0) {
      bpj $$1 = bpi.a();
      $$1.a("allayBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("allayActivityUpdate");
      civ.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dW().C && this.bL() && this.af % 10 == 0) {
         this.c(1.0F);
      }

      if (this.x() && this.gs() && this.af % 20 == 0) {
         this.x(false);
         this.cn = null;
      }

      this.gt();
   }

   @Override
   public void h() {
      super.h();
      if (this.dW().C) {
         this.cq = this.cp;
         if (this.p()) {
            this.cp = azu.a(this.cp + 1.0F, 0.0F, 5.0F);
         } else {
            this.cp = azu.a(this.cp - 1.0F, 0.0F, 5.0F);
         }

         if (this.x()) {
            this.cr++;
            this.ct = this.cs;
            if (this.go()) {
               this.cs++;
            } else {
               this.cs--;
            }

            this.cs = azu.a(this.cs, 0.0F, 15.0F);
         } else {
            this.cr = 0.0F;
            this.cs = 0.0F;
            this.ct = 0.0F;
         }
      } else {
         ect.c.a(this.dW(), this.cj, this.ck);
         if (this.gl()) {
            this.x(false);
         }
      }
   }

   @Override
   public boolean fN() {
      return !this.gr() && this.p();
   }

   public boolean p() {
      return !this.b(bsz.a).f();
   }

   @Override
   protected boolean f(bvj $$0) {
      return false;
   }

   private boolean gr() {
      return this.ec().a(cfb.aP, cfc.a);
   }

   @Override
   protected bta b(cpo $$0, bsz $$1) {
      cxg $$2 = $$0.b($$1);
      cxg $$3 = this.b(bsz.a);
      if (this.x() && $$2.a(axt.Y) && this.gw()) {
         this.gu();
         this.dW().a(this, (byte)18);
         this.dW().a($$0, this, awv.E, aww.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bta.a;
      } else if ($$3.f() && !$$2.f()) {
         cxg $$4 = $$2.c(1);
         this.a(bsz.a, $$4);
         this.a($$0, $$2);
         this.dW().a($$0, this, awv.e, aww.g, 2.0F, 1.0F);
         this.ec().a(cfb.aM, $$0.cG());
         return bta.a;
      } else if (!$$3.f() && $$1 == bsz.a && $$2.f()) {
         this.a(bvj.a, cxg.j);
         this.dW().a($$0, this, awv.f, aww.g, 2.0F, 1.0F);
         this.a(bsz.a);

         for (cxg $$5 : this.t().f()) {
            bxs.a(this, $$5, this.du());
         }

         this.ec().b(cfb.aM);
         $$0.i($$3);
         return bta.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(jh $$0, boolean $$1) {
      if ($$1) {
         if (!this.x()) {
            this.cn = $$0;
            this.x(true);
         }
      } else if ($$0.equals(this.cn) || this.cn == null) {
         this.cn = null;
         this.x(false);
      }
   }

   @Override
   public bth t() {
      return this.cm;
   }

   @Override
   protected kl V() {
      return ca;
   }

   @Override
   public boolean c(arx $$0, cxg $$1) {
      cxg $$2 = this.b(bsz.a);
      return !$$2.f() && $$0.O().b(dgv.c) && this.cm.c($$1) && this.c($$2, $$1);
   }

   private boolean c(cxg $$0, cxg $$1) {
      return cxg.b($$0, $$1) && !this.d($$0, $$1);
   }

   private boolean d(cxg $$0, cxg $$1) {
      czf $$2 = $$0.a(ku.Q);
      czf $$3 = $$1.a(ku.Q);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void a(arx $$0, cls $$1) {
      coy.a($$0, this, this, $$1);
   }

   @Override
   protected void Y() {
      super.Y();
      agy.a(this);
   }

   @Override
   public boolean ba() {
      return !this.aJ();
   }

   @Override
   public void a(BiConsumer<ech<?>, arx> $$0) {
      if (this.dW() instanceof arx $$1) {
         $$0.accept(this.ci, $$1);
         $$0.accept(this.cl, $$1);
      }
   }

   public boolean x() {
      return this.al.a(cg);
   }

   public void x(boolean $$0) {
      if (!this.dW().C && this.dk() && (!$$0 || !this.gl())) {
         this.al.a(cg, $$0);
      }
   }

   private boolean gs() {
      return this.cn == null || !this.cn.a(this.du(), (double)eck.E.a().a()) || !this.dW().a_(this.cn).a(dkf.eg);
   }

   public float J(float $$0) {
      return azu.h($$0, this.cq, this.cp) / 5.0F;
   }

   public boolean go() {
      float $$0 = this.cr % 55.0F;
      return $$0 < 15.0F;
   }

   public float K(float $$0) {
      return azu.h($$0, this.ct, this.cs) / 15.0F;
   }

   @Override
   public boolean a(cxg $$0, cxg $$1) {
      return !this.c($$0, $$1);
   }

   @Override
   protected void f(arx $$0) {
      super.f($$0);
      this.cm.f().forEach($$1x -> this.a($$0, $$1x));
      cxg $$1 = this.a(bvj.a);
      if (!$$1.f() && !dds.a($$1, ddr.D)) {
         this.a($$0, $$1);
         this.a(bvj.a, cxg.j);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      this.b($$0, this.dY());
      aln<vj> $$1 = this.dY().a(va.a);
      ect.a.a
         .encodeStart($$1, this.cj)
         .resultOrPartial($$0x -> bZ.error("Failed to encode vibration listener for Allay: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
      $$0.a("DuplicationCooldown", this.co);
      $$0.a("CanDuplicate", this.gw());
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.a($$0, this.dY());
      aln<vj> $$1 = this.dY().a(va.a);
      if ($$0.b("listener", 10)) {
         ect.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> bZ.error("Failed to parse vibration listener for Allay: '{}'", $$0x))
            .ifPresent($$0x -> this.cj = $$0x);
      }

      this.co = (long)$$0.h("DuplicationCooldown");
      this.al.a(ch, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean gm() {
      return false;
   }

   private void gt() {
      if (this.co > 0L) {
         this.co--;
      }

      if (!this.dW().B_() && this.co == 0L && !this.gw()) {
         this.al.a(ch, true);
      }
   }

   private void gu() {
      ciu $$0 = bvi.c.a(this.dW(), bvh.e);
      if ($$0 != null) {
         $$0.e(this.du());
         $$0.ai();
         $$0.gv();
         this.gv();
         this.dW().b($$0);
      }
   }

   private void gv() {
      this.co = 6000L;
      this.al.a(ch, false);
   }

   private boolean gw() {
      return this.al.a(ch);
   }

   private void a(cpo $$0, cxg $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public fbr cT() {
      return new fbr(0.0, (double)this.cS() * 0.6, (double)this.dr() * 0.1);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gx();
         }
      } else {
         super.b($$0);
      }
   }

   private void gx() {
      double $$0 = this.ae.k() * 0.02;
      double $$1 = this.ae.k() * 0.02;
      double $$2 = this.ae.k() * 0.02;
      this.dW().a(ls.R, this.d(1.0), this.dE() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public ect.a gp() {
      return this.cj;
   }

   @Override
   public ect.d gq() {
      return this.ck;
   }

   class a implements ecm {
      private final eco b;
      private final int c;

      public a(final eco $$0, final int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public eco a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(arx $$0, jq<eck> $$1, eck.a $$2, fbr $$3) {
         if ($$1.a(eck.E)) {
            ciu.this.b(jh.a((ka)$$3), true);
            return true;
         } else if ($$1.a(eck.F)) {
            ciu.this.b(jh.a((ka)$$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements ect.d {
      private static final int b = 16;
      private final eco c = new eci(ciu.this, ciu.this.cS());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public eco b() {
         return this.c;
      }

      @Override
      public boolean a(arx $$0, jh $$1, jq<eck> $$2, eck.a $$3) {
         if (ciu.this.gb()) {
            return false;
         } else {
            Optional<jp> $$4 = ciu.this.ec().c(cfb.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               jp $$5 = $$4.get();
               return $$5.a($$0.ai(), ciu.this.dw(), 1024) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(arx $$0, jh $$1, jq<eck> $$2, @Nullable bvb $$3, @Nullable bvb $$4, float $$5) {
         if ($$2.a(eck.H)) {
            civ.a(ciu.this, new jh($$1));
         }
      }

      @Override
      public aya<eck> c() {
         return axr.e;
      }
   }
}
