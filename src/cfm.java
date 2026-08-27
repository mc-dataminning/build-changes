import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cfm extends bsz implements clj, dwf {
   private static final Logger e = LogUtils.getLogger();
   private static final js bY = new js(1, 1, 1);
   private static final int bZ = 5;
   private static final float ca = 55.0F;
   private static final float cb = 15.0F;
   private static final cxt cc = cxt.a(ctt.oC);
   private static final int cd = 6000;
   private static final int ce = 3;
   private static final ajs<Boolean> cf = ajw.a(cfm.class, aju.k);
   private static final ajs<Boolean> cg = ajw.a(cfm.class, aju.k);
   protected static final ImmutableList<cdb<? extends cda<? super cfm>>> b = ImmutableList.of(cdb.c, cdb.d, cdb.f, cdb.b);
   protected static final ImmutableList<cbu<?>> c = ImmutableList.of(
      cbu.t, cbu.n, cbu.h, cbu.m, cbu.E, cbu.x, cbu.L, cbu.aM, cbu.aN, cbu.aO, cbu.aP, cbu.Z, new cbu[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dvt<dwf.b> ch;
   private dwf.a ci;
   private final dwf.d cj;
   private final dvt<cfm.a> ck;
   private final bqf cl = new bqf(1);
   @Nullable
   private io cm;
   private long cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   private float cs;

   public cfm(bsc<? extends cfm> $$0, daz $$1) {
      super($$0, $$1);
      this.bP = new byo(this, 20, true);
      this.a_(this.fU());
      this.cj = new cfm.b();
      this.ci = new dwf.a();
      this.ch = new dvt<>(new dwf.b(this));
      this.ck = new dvt<>(new cfm.a(this.cj.b(), dvw.E.a().a()));
   }

   @Override
   protected bts.b<cfm> dT() {
      return bts.a(c, b);
   }

   @Override
   protected bts<?> a(Dynamic<?> $$0) {
      return cfn.a(this.dT().a($$0));
   }

   @Override
   public bts<cfm> dS() {
      return (bts<cfm>)super.dS();
   }

   public static btx.a s() {
      return bss.A().a(bty.q, 20.0).a(bty.j, 0.1F).a(bty.r, 0.1F).a(bty.c, 2.0).a(bty.k, 48.0);
   }

   @Override
   protected ccc b(daz $$0) {
      cca $$1 = new cca(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(cf, false);
      $$0.a(cg, true);
   }

   @Override
   public void a(eum $$0) {
      if (this.da()) {
         if (this.be()) {
            this.a(0.02F, $$0);
            this.a(bsv.a, this.ds());
            this.g(this.ds().a(0.8F));
         } else if (this.bs()) {
            this.a(0.02F, $$0);
            this.a(bsv.a, this.ds());
            this.g(this.ds().a(0.5));
         } else {
            this.a(this.fn(), $$0);
            this.a(bsv.a, this.ds());
            this.g(this.ds().a(0.91F));
         }
      }

      this.r(false);
   }

   @Override
   public boolean a(bqp $$0, float $$1) {
      if ($$0.d() instanceof cly $$2) {
         Optional<UUID> $$3 = this.dS().c(cbu.aM);
         if ($$3.isPresent() && $$2.cz().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(io $$0, drd $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, drd $$2, io $$3) {
   }

   @Override
   protected avh v() {
      return this.c(bsd.a) ? avi.a : avi.b;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.d;
   }

   @Override
   protected avh o_() {
      return avi.c;
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   protected void Y() {
      this.dP().af().a("allayBrain");
      this.dS().a((aqn)this.dP(), this);
      this.dP().af().c();
      this.dP().af().a("allayActivityUpdate");
      cfn.a(this);
      this.dP().af().c();
      super.Y();
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dP().B && this.bD() && this.ai % 10 == 0) {
         this.c(1.0F);
      }

      if (this.gp() && this.gu() && this.ai % 20 == 0) {
         this.w(false);
         this.cm = null;
      }

      this.gv();
   }

   @Override
   public void l() {
      super.l();
      if (this.dP().B) {
         this.cp = this.co;
         if (this.u()) {
            this.co = ayf.a(this.co + 1.0F, 0.0F, 5.0F);
         } else {
            this.co = ayf.a(this.co - 1.0F, 0.0F, 5.0F);
         }

         if (this.gp()) {
            this.cq++;
            this.cs = this.cr;
            if (this.gq()) {
               this.cr++;
            } else {
               this.cr--;
            }

            this.cr = ayf.a(this.cr, 0.0F, 15.0F);
         } else {
            this.cq = 0.0F;
            this.cr = 0.0F;
            this.cs = 0.0F;
         }
      } else {
         dwf.c.a(this.dP(), this.ci, this.cj);
         if (this.gm()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean fU() {
      return !this.gt() && this.u();
   }

   public boolean u() {
      return !this.b(bpv.a).e();
   }

   @Override
   public boolean f(ctq $$0) {
      return false;
   }

   private boolean gt() {
      return this.dS().a(cbu.aP, cbv.a);
   }

   @Override
   protected bpw b(cly $$0, bpv $$1) {
      ctq $$2 = $$0.b($$1);
      ctq $$3 = this.b(bpv.a);
      if (this.gp() && this.n($$2) && this.gy()) {
         this.gw();
         this.dP().a(this, (byte)18);
         this.dP().a($$0, this, avi.E, avj.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bpw.a;
      } else if ($$3.e() && !$$2.e()) {
         ctq $$4 = $$2.c(1);
         this.a(bpv.a, $$4);
         this.a($$0, $$2);
         this.dP().a($$0, this, avi.e, avj.g, 2.0F, 1.0F);
         this.dS().a(cbu.aM, $$0.cz());
         return bpw.a;
      } else if (!$$3.e() && $$1 == bpv.a && $$2.e()) {
         this.a(bsd.a, ctq.i);
         this.dP().a($$0, this, avi.f, avj.g, 2.0F, 1.0F);
         this.a(bpv.a);

         for (ctq $$5 : this.y().f()) {
            bul.a(this, $$5, this.dn());
         }

         this.dS().b(cbu.aM);
         $$0.i($$3);
         return bpw.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(io $$0, boolean $$1) {
      if ($$1) {
         if (!this.gp()) {
            this.cm = $$0;
            this.w(true);
         }
      } else if ($$0.equals(this.cm) || this.cm == null) {
         this.cm = null;
         this.w(false);
      }
   }

   @Override
   public bqf y() {
      return this.cl;
   }

   @Override
   protected js U() {
      return bY;
   }

   @Override
   public boolean k(ctq $$0) {
      ctq $$1 = this.b(bpv.a);
      return !$$1.e() && this.dP().aa().b(dav.c) && this.cl.c($$0) && this.d($$1, $$0);
   }

   private boolean d(ctq $$0, ctq $$1) {
      return ctq.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(ctq $$0, ctq $$1) {
      cvr $$2 = $$0.a(kb.F);
      cvr $$3 = $$1.a(kb.F);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void b(cii $$0) {
      clj.a(this, this, $$0);
   }

   @Override
   protected void X() {
      super.X();
      agb.a(this);
   }

   @Override
   public boolean aV() {
      return !this.aE();
   }

   @Override
   public void a(BiConsumer<dvt<?>, aqn> $$0) {
      if (this.dP() instanceof aqn $$1) {
         $$0.accept(this.ch, $$1);
         $$0.accept(this.ck, $$1);
      }
   }

   public boolean gp() {
      return this.ao.a(cf);
   }

   public void w(boolean $$0) {
      if (!this.dP().B && this.db() && (!$$0 || !this.gm())) {
         this.ao.a(cf, $$0);
      }
   }

   private boolean gu() {
      return this.cm == null || !this.cm.a(this.dn(), (double)dvw.E.a().a()) || !this.dP().a_(this.cm).a(dec.dT);
   }

   public float G(float $$0) {
      return ayf.i($$0, this.cp, this.co) / 5.0F;
   }

   public boolean gq() {
      float $$0 = this.cq % 55.0F;
      return $$0 < 15.0F;
   }

   public float H(float $$0) {
      return ayf.i($$0, this.cs, this.cr) / 15.0F;
   }

   @Override
   public boolean a(ctq $$0, ctq $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void eD() {
      super.eD();
      this.cl.f().forEach(this::b);
      ctq $$0 = this.a(bsd.a);
      if (!$$0.e() && !czc.g($$0)) {
         this.b($$0);
         this.a(bsd.a, ctq.i);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      this.b($$0, this.dR());
      dwf.a.a.encodeStart(ur.a, this.ci).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.cn);
      $$0.a("CanDuplicate", this.gy());
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.a($$0, this.dR());
      if ($$0.b("listener", 10)) {
         dwf.a.a.parse(new Dynamic(ur.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.ci = $$0x);
      }

      this.cn = (long)$$0.h("DuplicationCooldown");
      this.ao.a(cg, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean gn() {
      return false;
   }

   private void gv() {
      if (this.cn > 0L) {
         this.cn--;
      }

      if (!this.dP().x_() && this.cn == 0L && !this.gy()) {
         this.ao.a(cg, true);
      }
   }

   private boolean n(ctq $$0) {
      return cc.a($$0);
   }

   private void gw() {
      cfm $$0 = bsc.a.a(this.dP());
      if ($$0 != null) {
         $$0.e(this.dn());
         $$0.fT();
         $$0.gx();
         this.gx();
         this.dP().b($$0);
      }
   }

   private void gx() {
      this.cn = 6000L;
      this.ao.a(cg, false);
   }

   private boolean gy() {
      return this.ao.a(cg);
   }

   private void a(cly $$0, ctq $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public eum cM() {
      return new eum(0.0, (double)this.cL() * 0.6, (double)this.dj() * 0.1);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gz();
         }
      } else {
         super.b($$0);
      }
   }

   private void gz() {
      double $$0 = this.ah.k() * 0.02;
      double $$1 = this.ah.k() * 0.02;
      double $$2 = this.ah.k() * 0.02;
      this.dP().a(ky.Q, this.d(1.0), this.dx() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public dwf.a gr() {
      return this.ci;
   }

   @Override
   public dwf.d gs() {
      return this.cj;
   }

   class a implements dvy {
      private final dwa b;
      private final int c;

      public a(dwa $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public dwa a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(aqn $$0, ix<dvw> $$1, dvw.a $$2, eum $$3) {
         if ($$1.a(dvw.E)) {
            cfm.this.b(io.a($$3), true);
            return true;
         } else if ($$1.a(dvw.F)) {
            cfm.this.b(io.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements dwf.d {
      private static final int b = 16;
      private final dwa c = new dvu(cfm.this, cfm.this.cL());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dwa b() {
         return this.c;
      }

      @Override
      public boolean a(aqn $$0, io $$1, ix<dvw> $$2, dvw.a $$3) {
         if (cfm.this.gf()) {
            return false;
         } else {
            Optional<iw> $$4 = cfm.this.dS().c(cbu.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               iw $$5 = $$4.get();
               return $$5.a().equals($$0.ae()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(aqn $$0, io $$1, ix<dvw> $$2, @Nullable brw $$3, @Nullable brw $$4, float $$5) {
         if ($$2.a(dvw.H)) {
            cfn.a(cfm.this, new io($$1));
         }
      }

      @Override
      public awm<dvw> c() {
         return awd.e;
      }
   }
}
