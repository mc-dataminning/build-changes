import com.google.common.net.InetAddresses;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class anf extends cfq {
   private static final Logger b = LogUtils.getLogger();
   private static final int cq = 32;
   private static final int cr = 10;
   private static final int cs = 25;
   private static final double ct = 1.0;
   private static final bns cu = new bns(UUID.fromString("736565d2-e1a7-403d-a3f8-1aeb3e302542"), "Creative block interaction range modifier", 0.5, bns.a.a);
   private static final bns cv = new bns(UUID.fromString("98491ef6-97b1-4584-ae82-71a8cc85cf73"), "Creative entity interaction range modifier", 2.0, bns.a.a);
   public aod c;
   public final MinecraftServer d;
   public final ang e;
   private final ahp cx;
   private final arz cy;
   private float cz = Float.MIN_VALUE;
   private int cA = Integer.MIN_VALUE;
   private int cB = Integer.MIN_VALUE;
   private int cC = Integer.MIN_VALUE;
   private int cD = Integer.MIN_VALUE;
   private int cE = Integer.MIN_VALUE;
   private float cF = -1.0E8F;
   private int cG = -99999999;
   private boolean cH = true;
   private int cI = -99999999;
   private int cJ = 60;
   private cfo cK = cfo.a;
   private boolean cL = true;
   private long cM = ac.b();
   @Nullable
   private blw cN;
   private boolean cO;
   private boolean cP;
   private final ary cQ = new ary();
   @Nullable
   private emc cR;
   private int cS;
   private boolean cT;
   private int cU = 2;
   private String cV = "en_us";
   @Nullable
   private emc cW;
   @Nullable
   private emc cX;
   @Nullable
   private emc cY;
   private iz cZ = iz.a(0, 0, 0);
   private ams da = ams.a;
   private ahg<ctx> db = ctx.h;
   @Nullable
   private hx dc;
   private boolean dd;
   private float de;
   private final aoi df;
   private boolean dg;
   private boolean dh;
   private cew di = new cew(0, 0, 0);
   private final ciw dj = new ciw() {
      @Override
      public void a(cij $$0, iq<cng> $$1, cng $$2, int[] $$3) {
         anf.this.c.b(new zv($$0.j, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cij $$0, int $$1, cng $$2) {
         anf.this.c.b(new zx($$0.j, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cij $$0, cng $$1) {
         anf.this.c.b(new zx(-1, $$0.k(), -1, $$1));
      }

      @Override
      public void a(cij $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cij $$0, int $$1, int $$2) {
         anf.this.c.b(new zw($$0.j, $$1, $$2));
      }
   };
   private final civ dk = new civ() {
      @Override
      public void a(cij $$0, int $$1, cng $$2) {
         cke $$3 = $$0.b($$1);
         if (!($$3 instanceof cka)) {
            if ($$3.d == anf.this.fS()) {
               am.f.a(anf.this, anf.this.fS(), $$2);
            }
         }
      }

      @Override
      public void a(cij $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private vx dl;
   private int dm;
   public boolean f;

   public anf(MinecraftServer $$0, ane $$1, GameProfile $$2, amt $$3) {
      super($$1, $$1.T(), $$1.U(), $$2);
      this.df = $$0.a(this);
      this.e = $$0.b(this);
      this.d = $$0;
      this.cy = $$0.ae().a((cfq)this);
      this.cx = $$0.ae().f(this);
      this.e($$1);
      this.a($$3);
   }

   private void e(ane $$0) {
      hx $$1 = $$0.T();
      if ($$0.E_().g() && $$0.o().aY().m() != ctu.c) {
         int $$2 = Math.max(0, this.d.a($$0));
         int $$3 = aup.a($$0.D_().b((double)$$1.u(), (double)$$1.w()));
         if ($$3 < $$2) {
            $$2 = $$3;
         }

         if ($$3 <= 1) {
            $$2 = 1;
         }

         long $$4 = (long)($$2 * 2 + 1);
         long $$5 = $$4 * $$4;
         int $$6 = $$5 > 2147483647L ? Integer.MAX_VALUE : (int)$$5;
         int $$7 = this.u($$6);
         int $$8 = auw.a().a($$6);

         for (int $$9 = 0; $$9 < $$6; $$9++) {
            int $$10 = ($$8 + $$7 * $$9) % $$6;
            int $$11 = $$10 % ($$2 * 2 + 1);
            int $$12 = $$10 / ($$2 * 2 + 1);
            hx $$13 = amz.a($$0, $$1.u() + $$11 - $$2, $$1.w() + $$12 - $$2);
            if ($$13 != null) {
               this.a($$13, 0.0F, 0.0F);
               if ($$0.g(this)) {
                  break;
               }
            }
         }
      } else {
         this.a($$1, 0.0F, 0.0F);

         while (!$$0.g(this) && this.ds() < (double)($$0.al() - 1)) {
            this.a_(this.dq(), this.ds() + 1.0, this.dw());
         }
      }
   }

   private int u(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         cew.a.parse(new Dynamic(tc.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(b::error).ifPresent($$0x -> this.di = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         so $$1 = $$0.p("enteredNetherPosition");
         this.cX = new emc($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.cP = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cQ.a($$0.p("recipeBook"), this.d.aG());
      }

      if (this.fD()) {
         this.fE();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.dc = new hx($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.dd = $$0.q("SpawnForced");
         this.de = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.db = ctx.g.parse(tc.a, $$0.c("SpawnDimension")).resultOrPartial(b::error).orElse(ctx.h);
         }
      }
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      cew.a.encodeStart(tc.a, this.di).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.cP);
      if (this.cX != null) {
         so $$1 = new so();
         $$1.a("x", this.cX.c);
         $$1.a("y", this.cX.d);
         $$1.a("z", this.cX.e);
         $$0.a("enteredNetherPosition", $$1);
      }

      blw $$2 = this.cW();
      blw $$3 = this.cZ();
      if ($$3 != null && $$2 != this && $$2.cV()) {
         so $$4 = new so();
         so $$5 = new so();
         $$2.e($$5);
         $$4.a("Attach", $$3.cw());
         $$4.a("Entity", $$5);
         $$0.a("RootVehicle", $$4);
      }

      $$0.a("recipeBook", this.cQ.b());
      $$0.a("Dimension", this.dL().ae().a().toString());
      if (this.dc != null) {
         $$0.a("SpawnX", this.dc.u());
         $$0.a("SpawnY", this.dc.v());
         $$0.a("SpawnZ", this.dc.w());
         $$0.a("SpawnForced", this.dd);
         $$0.a("SpawnAngle", this.de);
         ahh.a.encodeStart(tc.a, this.db.a()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gb();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.cl = aup.a((float)$$0 / $$1, 0.0F, $$2);
      this.cI = -1;
   }

   public void b(int $$0) {
      this.cj = $$0;
      this.cI = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cI = -1;
   }

   @Override
   public void a(cng $$0, int $$1) {
      super.a($$0, $$1);
      this.cI = -1;
   }

   private void a(cij $$0) {
      $$0.a(this.dk);
      $$0.a(this.dj);
   }

   public void h() {
      this.a(this.bV);
   }

   @Override
   public void g_() {
      super.g_();
      this.c.b(new abc());
   }

   @Override
   public void h_() {
      super.h_();
      this.c.b(new abb(this.eK()));
   }

   @Override
   protected void a(djp $$0) {
      am.e.a(this, $$0);
   }

   @Override
   protected cnc k() {
      return new cob(this);
   }

   @Override
   public void l() {
      this.e.a();
      this.di.a();
      this.cJ--;
      if (this.al > 0) {
         this.al--;
      }

      this.bW.d();
      if (!this.dL().B && !this.bW.a(this)) {
         this.r();
         this.bW = this.bV;
      }

      blw $$0 = this.K();
      if ($$0 != this) {
         if ($$0.bx()) {
            this.a($$0.dq(), $$0.ds(), $$0.dw(), $$0.dB(), $$0.dD());
            this.z().l().a(this);
            if (this.fJ()) {
               this.c(this);
            }
         } else {
            this.c(this);
         }
      }

      am.x.a(this);
      if (this.cR != null) {
         am.v.a(this, this.cR, this.ah - this.cS);
      }

      this.o();
      this.p();
      this.gu();
      this.cx.b(this);
   }

   private void gu() {
      bnq $$0 = this.f(bnu.f);
      if ($$0 != null) {
         if (this.f()) {
            $$0.b(cu);
         } else {
            $$0.e(cu);
         }
      }

      bnq $$1 = this.f(bnu.g);
      if ($$1 != null) {
         if (this.f()) {
            $$1.b(cv);
         } else {
            $$1.e(cv);
         }
      }
   }

   public void m() {
      try {
         if (!this.P_() || !this.de()) {
            super.l();
         }

         for (int $$0 = 0; $$0 < this.fS().b(); $$0++) {
            cng $$1 = this.fS().a($$0);
            if ($$1.d().am_()) {
               xg<?> $$2 = ((clm)$$1.d()).a($$1, this.dL(), this);
               if ($$2 != null) {
                  this.c.b($$2);
               }
            }
         }

         if (this.ev() != this.cF || this.cG != this.bX.a() || this.bX.e() == 0.0F != this.cH) {
            this.c.b(new aci(this.ev(), this.bX.a(), this.bX.e()));
            this.cF = this.ev();
            this.cG = this.bX.a();
            this.cH = this.bX.e() == 0.0F;
         }

         if (this.ev() + this.fk() != this.cz) {
            this.cz = this.ev() + this.fk();
            this.a(enj.f, aup.f(this.cz));
         }

         if (this.bX.a() != this.cA) {
            this.cA = this.bX.a();
            this.a(enj.g, aup.f((float)this.cA));
         }

         if (this.ci() != this.cB) {
            this.cB = this.ci();
            this.a(enj.h, aup.f((float)this.cB));
         }

         if (this.eJ() != this.cC) {
            this.cC = this.eJ();
            this.a(enj.i, aup.f((float)this.cC));
         }

         if (this.ck != this.cE) {
            this.cE = this.ck;
            this.a(enj.j, aup.f((float)this.cE));
         }

         if (this.cj != this.cD) {
            this.cD = this.cj;
            this.a(enj.k, aup.f((float)this.cD));
         }

         if (this.ck != this.cI) {
            this.cI = this.ck;
            this.c.b(new ach(this.cl, this.ck, this.cj));
         }

         if (this.ah % 20 == 0) {
            am.q.a(this);
         }
      } catch (Throwable var4) {
         o $$4 = o.a(var4, "Ticking player");
         p $$5 = $$4.a("Player being ticked");
         this.a($$5);
         throw new y($$4);
      }
   }

   @Override
   public void n() {
      if (this.ev() > 0.0F && this.cW != null) {
         am.V.a(this, this.cW);
      }

      this.cW = null;
      super.n();
   }

   public void o() {
      if (this.ab > 0.0F && this.cW == null) {
         this.cW = this.dj();
      }
   }

   public void p() {
      if (this.cZ() != null && this.cZ().bn()) {
         if (this.cY == null) {
            this.cY = this.dj();
         } else {
            am.W.a(this, this.cY);
         }
      }

      if (this.cY != null && (this.cZ() == null || !this.cZ().bn())) {
         this.cY = null;
      }
   }

   private void a(enj $$0, int $$1) {
      this.gh().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(bkv $$0) {
      this.b(dnz.p);
      boolean $$1 = this.dL().Z().b(ctt.n);
      if ($$1) {
         vg $$2 = this.eK().a();
         this.c.a(new abd(this.aj(), $$2), uq.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            vg $$3x = vg.a("death.attack.message_too_long", vg.b($$2x).a(n.o));
            vg $$4x = vg.a("death.attack.even_more_magic", this.Q_()).a($$1xx -> $$1xx.a(new vm(vm.a.a, $$3x)));
            return new abd(this.aj(), $$4x);
         }));
         eni $$3 = this.cg();
         if ($$3 == null || $$3.k() == eni.b.a) {
            this.d.ae().a($$2, false);
         } else if ($$3.k() == eni.b.c) {
            this.d.ae().a(this, $$2);
         } else if ($$3.k() == eni.b.d) {
            this.d.ae().b(this, $$2);
         }
      } else {
         this.c.b(new abd(this.aj(), vf.a));
      }

      this.gg();
      if (this.dL().Z().b(ctt.N)) {
         this.gv();
      }

      if (!this.P_()) {
         this.g($$0);
      }

      this.gh().a(enj.c, this, ene::b);
      bmo $$4 = this.eL();
      if ($$4 != null) {
         this.b(asd.h.b($$4.ai()));
         $$4.a(this, this.bh, $$0);
         this.f($$4);
      }

      this.dL().a(this, (byte)3);
      this.a(asd.N);
      this.a(asd.i.b(asd.m));
      this.a(asd.i.b(asd.n));
      this.aA();
      this.k(0);
      this.a_(false);
      this.eK().c();
      this.a(Optional.of(ig.a(this.dL().ae(), this.dl())));
   }

   private void gv() {
      elx $$0 = new elx(this.dl()).c(32.0, 10.0, 32.0);
      this.dL().a(bmq.class, $$0, bmb.f).stream().filter($$0x -> $$0x instanceof bmv).forEach($$0x -> ((bmv)$$0x).a_((cfq)this));
   }

   @Override
   public void a(blw $$0, int $$1, bkv $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.s($$1);
         this.gh().a(enj.e, this, ene::b);
         if ($$0 instanceof cfq) {
            this.a(asd.Q);
            this.gh().a(enj.d, this, ene::b);
         } else {
            this.a(asd.O);
         }

         this.a(this, $$0, enj.l);
         this.a($$0, this, enj.m);
         am.c.a(this, $$0, $$2);
      }
   }

   private void a(enf $$0, enf $$1, enj[] $$2) {
      enb $$3 = this.gh().e($$1.cy());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gh().a($$2[$$4], $$0, ene::b);
         }
      }
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.d.l() && this.gw() && $$0.a(ask.n);
         if (!$$2 && this.cJ > 0 && !$$0.a(ask.e)) {
            return false;
         } else {
            blw $$3 = $$0.d();
            if ($$3 instanceof cfq $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof cfw $$5 && $$5.w() instanceof cfq $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(cfq $$0) {
      return !this.gw() ? false : super.a($$0);
   }

   private boolean gw() {
      return this.d.aa();
   }

   @Nullable
   @Override
   protected efw a(ane $$0) {
      efw $$1 = super.a($$0);
      if ($$1 != null && this.dL().ae() == ctx.h && $$0.ae() == ctx.j) {
         emc $$2 = $$1.a.b(0.0, -1.0, 0.0);
         return new efw($$2, emc.b, 90.0F, 0.0F);
      } else {
         return $$1;
      }
   }

   @Nullable
   @Override
   public blw b(ane $$0) {
      this.cO = true;
      ane $$1 = this.z();
      ahg<ctx> $$2 = $$1.ae();
      if ($$2 == ctx.j && $$0.ae() == ctx.h) {
         this.ag();
         this.z().a(this, blw.c.e);
         if (!this.f) {
            this.f = true;
            this.c.b(new aag(aag.e, this.cP ? 0.0F : 1.0F));
            this.cP = true;
         }

         return this;
      } else {
         egr $$3 = $$0.B_();
         this.c.b(new abm(this.d($$0), (byte)3));
         this.c.b(new zn($$3.s(), $$3.t()));
         aqw $$4 = this.d.ae();
         $$4.d(this);
         $$1.a(this, blw.c.e);
         this.dI();
         efw $$5 = this.a($$0);
         if ($$5 != null) {
            $$1.af().a("moving");
            if ($$2 == ctx.h && $$0.ae() == ctx.i) {
               this.cX = this.dj();
            } else if ($$0.ae() == ctx.j) {
               this.a($$0, hx.a($$5.a));
            }

            $$1.af().c();
            $$1.af().a("placing");
            this.c($$0);
            this.c.a($$5.a.c, $$5.a.d, $$5.a.e, $$5.c, $$5.d);
            this.c.m();
            $$0.b(this);
            $$1.af().c();
            this.f($$1);
            this.c.b(new aaz(this.fT()));
            $$4.a(this, $$0);
            $$4.e(this);

            for (blj $$6 : this.es()) {
               this.c.b(new adf(this.aj(), $$6, false));
            }

            this.c.b(new aam(1032, hx.b, 0, false));
            this.cI = -1;
            this.cF = -1.0F;
            this.cG = -1;
         }

         return this;
      }
   }

   private void a(ane $$0, hx $$1) {
      hx.a $$2 = $$1.j();

      for (int $$3 = -2; $$3 <= 2; $$3++) {
         for (int $$4 = -2; $$4 <= 2; $$4++) {
            for (int $$5 = -1; $$5 < 3; $$5++) {
               djp $$6 = $$5 == -1 ? cxa.co.o() : cxa.a.o();
               $$0.b($$2.g($$1).e($$4, $$5, $$3), $$6);
            }
         }
      }
   }

   @Override
   protected Optional<l.a> a(ane $$0, hx $$1, boolean $$2, dlg $$3) {
      Optional<l.a> $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         ic.a $$5 = this.dL().a_(this.ax).d(dcb.b).orElse(ic.a.a);
         Optional<l.a> $$6 = $$0.p().a($$1, $$5);
         if ($$6.isEmpty()) {
            b.error("Unable to create a portal, likely target out of worldborder");
         }

         return $$6;
      }
   }

   private void f(ane $$0) {
      ahg<ctx> $$1 = $$0.ae();
      ahg<ctx> $$2 = this.dL().ae();
      am.w.a(this, $$1, $$2);
      if ($$1 == ctx.i && $$2 == ctx.h && this.cX != null) {
         am.D.a(this, this.cX);
      }

      if ($$2 != ctx.i) {
         this.cX = null;
      }
   }

   @Override
   public boolean a(anf $$0) {
      if ($$0.P_()) {
         return this.K() == this;
      } else {
         return this.P_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(blw $$0, int $$1) {
      super.a($$0, $$1);
      this.bW.d();
   }

   @Override
   public Either<cfq.a, avt> a(hx $$0) {
      ic $$1 = this.dL().a_($$0).c(dat.aE);
      if (this.fD() || !this.bx()) {
         return Either.left(cfq.a.e);
      } else if (!this.dL().E_().j()) {
         return Either.left(cfq.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cfq.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cfq.a.d);
      } else {
         this.a(this.dL().ae(), $$0, this.dB(), false, true);
         if (this.dL().P()) {
            return Either.left(cfq.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               emc $$4 = emc.c($$0);
               List<ccw> $$5 = this.dL()
                  .a(ccw.class, new elx($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.f(this));
               if (!$$5.isEmpty()) {
                  return Either.left(cfq.a.f);
               }
            }

            Either<cfq.a, avt> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(asd.ap);
               am.r.a(this);
            });
            if (!this.z().d()) {
               this.a(vg.c("sleep.not_possible"), true);
            }

            ((ane)this.dL()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(hx $$0) {
      this.a(asd.i.b(asd.n));
      super.b($$0);
   }

   private boolean a(hx $$0, ic $$1) {
      return this.j($$0) || this.j($$0.a($$1.g()));
   }

   private boolean j(hx $$0) {
      emc $$1 = emc.c($$0);
      return Math.abs(this.dq() - $$1.a()) <= 3.0 && Math.abs(this.ds() - $$1.b()) <= 2.0 && Math.abs(this.dw() - $$1.c()) <= 3.0;
   }

   private boolean b(hx $$0, ic $$1) {
      hx $$2 = $$0.c();
      return !this.i($$2) || !this.i($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fD()) {
         this.z().l().a(this, new ze(this, 2));
      }

      super.a($$0, $$1);
      if (this.c != null) {
         this.c.a(this.dq(), this.ds(), this.dw(), this.dB(), this.dD());
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.bC();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public boolean b(bkv $$0) {
      return super.b($$0) || this.O();
   }

   @Override
   protected void a(double $$0, boolean $$1, djp $$2, hx $$3) {
   }

   @Override
   protected void c(hx $$0) {
      if (!this.P_()) {
         super.c($$0);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.de()) {
         this.b($$3, new emc($$0, $$1, $$2));
         hx $$4 = this.aH();
         super.a($$1, $$3, this.dL().a_($$4), $$4);
      }
   }

   @Override
   protected void M_() {
      if (this.dL().s().i()) {
         super.M_();
      }
   }

   @Override
   public void a(dim $$0, boolean $$1) {
      this.c.b(new zk(this.dL(), $$0.aE_()));
      this.c.b(new aax($$0.aE_(), $$1));
   }

   private void gx() {
      this.dm = this.dm % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bkg $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.bW != this.bV) {
            this.r();
         }

         this.gx();
         cij $$1 = $$0.createMenu(this.dm, this.fS(), this);
         if ($$1 == null) {
            if (this.P_()) {
               this.a(vg.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.c.b(new aaw($$1.j, $$1.a(), $$0.Q_()));
            this.a($$1);
            this.bW = $$1;
            return OptionalInt.of(this.dm);
         }
      }
   }

   @Override
   public void a(int $$0, csw $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.c.b(new aas($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(cae $$0, bjv $$1) {
      if (this.bW != this.bV) {
         this.r();
      }

      this.gx();
      this.c.b(new aah(this.dm, $$1.b(), $$0.aj()));
      this.bW = new cjj(this.dm, this.fS(), $$1, $$0);
      this.a(this.bW);
   }

   @Override
   public void a(cng $$0, bkb $$1) {
      if ($$0.a(cnj.tX)) {
         if (cpd.a($$0, this.dd(), this)) {
            this.bW.d();
         }

         this.c.b(new aav($$1));
      }
   }

   @Override
   public void a(dhn $$0) {
      this.c.b(zi.a($$0, dhd::q));
   }

   @Override
   public void r() {
      this.c.b(new zu(this.bW.j));
      this.s();
   }

   @Override
   public void s() {
      this.bW.b(this);
      this.bV.a(this.bW);
      this.bW = this.bV;
   }

   public void a(float $$0, float $$1, boolean $$2, boolean $$3) {
      if (this.bO()) {
         if ($$0 >= -1.0F && $$0 <= 1.0F) {
            this.bk = $$0;
         }

         if ($$1 >= -1.0F && $$1 <= 1.0F) {
            this.bm = $$1;
         }

         this.bj = $$2;
         this.f($$3);
      }
   }

   @Override
   public void a(emc $$0) {
      double $$1 = this.dq();
      double $$2 = this.ds();
      double $$3 = this.dw();
      super.a($$0);
      this.b(this.dq() - $$1, this.ds() - $$2, this.dw() - $$3);
   }

   @Override
   public void t() {
      double $$0 = this.dq();
      double $$1 = this.ds();
      double $$2 = this.dw();
      super.t();
      this.r(this.dq() - $$0, this.ds() - $$1, this.dw() - $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (!this.bO() && !s($$0, $$1, $$2)) {
         if (this.bZ()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(asd.C, $$3);
               this.z(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(asn.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(asd.w, $$4);
               this.z(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.aZ()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(asd.s, $$5);
               this.z(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.e_()) {
            if ($$1 > 0.0) {
               this.a(asd.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aC()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.bY()) {
                  this.a(asd.r, $$6);
                  this.z(0.1F * (float)$$6 * 0.01F);
               } else if (this.bX()) {
                  this.a(asd.q, $$6);
                  this.z(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(asd.p, $$6);
                  this.z(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fw()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(asd.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(asd.v, $$8);
            }
         }
      }
   }

   private void r(double $$0, double $$1, double $$2) {
      if (this.bO() && !s($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         blw $$4 = this.cZ();
         if ($$4 instanceof chi) {
            this.a(asd.x, $$3);
         } else if ($$4 instanceof chk) {
            this.a(asd.y, $$3);
         } else if ($$4 instanceof byt) {
            this.a(asd.z, $$3);
         } else if ($$4 instanceof cae) {
            this.a(asd.A, $$3);
         } else if ($$4 instanceof cdj) {
            this.a(asd.D, $$3);
         }
      }
   }

   private static boolean s(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(asa<?> $$0, int $$1) {
      this.cy.b(this, $$0, $$1);
      this.gh().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(asa<?> $$0) {
      this.cy.a(this, $$0, 0);
      this.gh().a($$0, this, ene::c);
   }

   @Override
   public int a(Collection<cqm<?>> $$0) {
      return this.cQ.a($$0, this);
   }

   @Override
   public void a(cqm<?> $$0, List<cng> $$1) {
      am.aa.a(this, $$0.a(), $$1);
   }

   @Override
   public void a(List<ahh> $$0) {
      List<cqm<?>> $$1 = $$0.stream().flatMap($$0x -> this.d.aG().a($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<cqm<?>> $$0) {
      return this.cQ.b($$0, this);
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cI = -1;
   }

   @Override
   public void u() {
      this.cT = true;
      this.bB();
      if (this.fD()) {
         this.a(true, false);
      }
   }

   public boolean v() {
      return this.cT;
   }

   @Override
   public void w() {
      this.cF = -1.0E8F;
   }

   @Override
   public void a(vg $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void x() {
      if (!this.bv.b() && this.fn()) {
         this.c.b(new aad(this, (byte)9));
         super.x();
      }
   }

   @Override
   public void a(ee.a $$0, emc $$1) {
      super.a($$0, $$1);
      this.c.b(new abg($$0, $$1.c, $$1.d, $$1.e));
   }

   public void a(ee.a $$0, blw $$1, ee.a $$2) {
      emc $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.c.b(new abg($$0, $$1, $$2));
   }

   public void a(anf $$0, boolean $$1) {
      this.di = $$0.di;
      this.dl = $$0.dl;
      this.e.a($$0.e.b(), $$0.e.c());
      this.y();
      if ($$1) {
         this.fS().a($$0.fS());
         this.c($$0.ev());
         this.bX = $$0.bX;
         this.cj = $$0.cj;
         this.ck = $$0.ck;
         this.cl = $$0.cl;
         this.r($$0.fN());
         this.ax = $$0.ax;
      } else if (this.dL().Z().b(ctt.d) || $$0.P_()) {
         this.fS().a($$0.fS());
         this.cj = $$0.cj;
         this.ck = $$0.ck;
         this.cl = $$0.cl;
         this.r($$0.fN());
      }

      this.cm = $$0.cm;
      this.bU = $$0.bU;
      this.an().b(bQ, $$0.an().b(bQ));
      this.cI = -1;
      this.cF = -1.0F;
      this.cG = -1;
      this.cQ.a($$0.cQ);
      this.cP = $$0.cP;
      this.cX = $$0.cX;
      this.da = $$0.da;
      this.i($$0.gj());
      this.j($$0.gk());
      this.a($$0.gr());
   }

   @Override
   protected void a(blj $$0, @Nullable blw $$1) {
      super.a($$0, $$1);
      this.c.b(new adf(this.aj(), $$0, true));
      if ($$0.a(bll.y)) {
         this.cS = this.ah;
         this.cR = this.dj();
      }

      am.B.a(this, $$1);
   }

   @Override
   protected void a(blj $$0, boolean $$1, @Nullable blw $$2) {
      super.a($$0, $$1, $$2);
      this.c.b(new adf(this.aj(), $$0, false));
      am.B.a(this, $$2);
   }

   @Override
   protected void a(blj $$0) {
      super.a($$0);
      this.c.b(new abk(this.aj(), $$0.b()));
      if ($$0.a(bll.y)) {
         this.cR = null;
      }

      am.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.c.a($$0, $$1, $$2, this.dB(), this.dD(), bnc.g);
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.c.a(this.dq() + $$0, this.ds() + $$1, this.dw() + $$2, this.dB(), this.dD(), bnc.f);
   }

   @Override
   public boolean a(ane $$0, double $$1, double $$2, double $$3, Set<bnc> $$4, float $$5, float $$6) {
      cte $$7 = new cte(hx.a($$1, $$2, $$3));
      $$0.l().a(anj.g, $$7, 1, this.aj());
      this.ac();
      if (this.fD()) {
         this.a(true, true);
      }

      if ($$0 == this.dL()) {
         this.c.a($$1, $$2, $$3, $$5, $$6, $$4);
      } else {
         this.a($$0, $$1, $$2, $$3, $$5, $$6);
      }

      this.n($$5);
      return true;
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      super.e($$0, $$1, $$2);
      this.c.m();
   }

   @Override
   public void a(blw $$0) {
      this.z().l().a(this, new ze($$0, 4));
   }

   @Override
   public void b(blw $$0) {
      this.z().l().a(this, new ze($$0, 5));
   }

   @Override
   public void y() {
      if (this.c != null) {
         this.c.b(new aaz(this.fT()));
         this.J();
      }
   }

   public ane z() {
      return (ane)this.dL();
   }

   public boolean a(ctu $$0) {
      if (!this.e.a($$0)) {
         return false;
      } else {
         this.c.b(new aag(aag.d, (float)$$0.a()));
         if ($$0 == ctu.d) {
            this.gg();
            this.ac();
         } else {
            this.c(this);
         }

         this.y();
         this.fl();
         return true;
      }
   }

   @Override
   public boolean P_() {
      return this.e.b() == ctu.d;
   }

   @Override
   public boolean f() {
      return this.e.b() == ctu.b;
   }

   @Override
   public void a(vg $$0) {
      this.b($$0, false);
   }

   public void b(vg $$0, boolean $$1) {
      if (this.v($$1)) {
         this.c.a(new acw($$0, $$1), uq.a(() -> {
            if (this.v(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               vg $$3 = vg.b($$2).a(n.o);
               return new acw(vg.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(vv $$0, boolean $$1, vc.a $$2) {
      if (this.gy()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String A() {
      return this.c.n() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(amt $$0) {
      this.cV = $$0.b();
      this.cU = $$0.c();
      this.cK = $$0.d();
      this.cL = $$0.e();
      this.dg = $$0.h();
      this.dh = $$0.i();
      this.an().b(bQ, (byte)$$0.f());
      this.an().b(bR, (byte)$$0.g().a());
   }

   public amt B() {
      int $$0 = this.an().b(bQ);
      bmi $$1 = bmi.d.apply(this.an().b(bR));
      return new amt(this.cV, this.cU, this.cK, this.cL, $$0, $$1, this.dg, this.dh);
   }

   public boolean C() {
      return this.cL;
   }

   public cfo D() {
      return this.cK;
   }

   private boolean v(boolean $$0) {
      return this.cK == cfo.c ? $$0 : true;
   }

   private boolean gy() {
      return this.cK == cfo.a;
   }

   public int E() {
      return this.cU;
   }

   public void a(agi $$0) {
      this.c.b(new abq($$0.a(), $$0.d().map(agi.a::a), $$0.e()));
   }

   @Override
   protected int F() {
      return this.d.c(this.fR());
   }

   public void G() {
      this.cM = ac.b();
   }

   public arz H() {
      return this.cy;
   }

   public ary I() {
      return this.cQ;
   }

   @Override
   protected void J() {
      if (this.P_()) {
         this.eq();
         this.j(true);
      } else {
         super.J();
      }
   }

   public blw K() {
      return (blw)(this.cN == null ? this : this.cN);
   }

   @Override
   public void c(@Nullable blw $$0) {
      blw $$1 = this.K();
      this.cN = (blw)($$0 == null ? this : $$0);
      if ($$1 != this.cN) {
         if (this.cN.dL() instanceof ane $$2) {
            this.a($$2, this.cN.dq(), this.cN.ds(), this.cN.dw(), Set.of(), this.dB(), this.dD());
         }

         if ($$0 != null) {
            this.z().l().a(this);
         }

         this.c.b(new abx(this.cN));
         this.c.m();
      }
   }

   @Override
   protected void L() {
      if (!this.cO) {
         super.L();
      }
   }

   @Override
   public void d(blw $$0) {
      if (this.e.b() == ctu.d) {
         this.c($$0);
      } else {
         super.d($$0);
      }
   }

   public long M() {
      return this.cM;
   }

   @Nullable
   public vg N() {
      return null;
   }

   @Override
   public void a(bkb $$0) {
      super.a($$0);
      this.gm();
   }

   public boolean O() {
      return this.cO;
   }

   public void P() {
      this.cO = false;
   }

   public ahp Q() {
      return this.cx;
   }

   public void a(ane $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      this.c(this);
      this.ac();
      if ($$0 == this.dL()) {
         this.c.a($$1, $$2, $$3, $$4, $$5);
      } else {
         ane $$6 = this.z();
         egr $$7 = $$0.B_();
         this.c.b(new abm(this.d($$0), (byte)3));
         this.c.b(new zn($$7.s(), $$7.t()));
         this.d.ae().d(this);
         $$6.a(this, blw.c.e);
         this.dI();
         this.b($$1, $$2, $$3, $$4, $$5);
         this.c($$0);
         $$0.a(this);
         this.f($$6);
         this.c.a($$1, $$2, $$3, $$4, $$5);
         this.d.ae().a(this, $$0);
         this.d.ae().e(this);
      }
   }

   @Nullable
   public hx R() {
      return this.dc;
   }

   public float S() {
      return this.de;
   }

   public ahg<ctx> T() {
      return this.db;
   }

   public boolean U() {
      return this.dd;
   }

   public void a(ahg<ctx> $$0, @Nullable hx $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.dc) && $$0.equals(this.db);
         if ($$4 && !$$5) {
            this.a(vg.c("block.minecraft.set_spawn"));
         }

         this.dc = $$1;
         this.db = $$0;
         this.de = $$2;
         this.dd = $$3;
      } else {
         this.dc = null;
         this.db = ctx.h;
         this.de = 0.0F;
         this.dd = false;
      }
   }

   public iz V() {
      return this.cZ;
   }

   public void a(iz $$0) {
      this.cZ = $$0;
   }

   public ams W() {
      return this.da;
   }

   public void a(ams $$0) {
      this.da = $$0;
   }

   @Override
   public void a(ars $$0, aru $$1, float $$2, float $$3) {
      this.c.b(new act(kd.b.d($$0), $$1, this.dq(), this.ds(), this.dw(), $$2, $$3, this.ag.g()));
   }

   @Override
   public ccb a(cng $$0, boolean $$1, boolean $$2) {
      ccb $$3 = super.a($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dL().b($$3);
         cng $$4 = $$3.q();
         if ($$2) {
            if (!$$4.b()) {
               this.a(asd.f.b($$4.d()), $$0.L());
            }

            this.a(asd.F);
         }

         return $$3;
      }
   }

   public aoi X() {
      return this.df;
   }

   public void c(ane $$0) {
      this.a((ctx)$$0);
      this.e.a($$0);
   }

   @Nullable
   private static ctu a(@Nullable so $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? ctu.a($$0.h($$1)) : null;
   }

   private ctu b(@Nullable ctu $$0) {
      ctu $$1 = this.d.bb();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.d.v_();
      }
   }

   @Override
   public void c(@Nullable so $$0) {
      this.e.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void k(so $$0) {
      $$0.a("playerGameType", this.e.b().a());
      ctu $$1 = this.e.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean Y() {
      return this.dg;
   }

   public boolean b(anf $$0) {
      return $$0 == this ? false : this.dg || $$0.dg;
   }

   @Override
   public boolean a(ctx $$0, hx $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cng $$0) {
      am.U.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cfp $$1 = this.fS();
      cng $$2 = $$1.a($$0);
      this.bW.b($$1, $$1.l).ifPresent($$1x -> this.bW.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean Z() {
      return this.dh;
   }

   @Override
   public Optional<cew> aa() {
      return Optional.of(this.di);
   }

   @Override
   public void a(ccb $$0) {
      super.a($$0);
      blw $$1 = $$0.w();
      if ($$1 != null) {
         am.Q.a(this, $$0.q(), $$1);
      }
   }

   public void a(vx $$0) {
      this.dl = $$0;
   }

   @Nullable
   public vx ab() {
      return this.dl != null && this.dl.b() ? null : this.dl;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cp = (float)(aup.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dB());
      this.c.b(new aai(this));
   }

   @Override
   public boolean a(blw $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         $$0.i(this);
         this.c.a(this.dq(), this.ds(), this.dw(), this.dB(), this.dD());
         if ($$0 instanceof bmo $$2) {
            for (blj $$3 : $$2.es()) {
               this.c.b(new adf($$0.aj(), $$3, false));
            }
         }

         return true;
      }
   }

   @Override
   public void ac() {
      blw $$0 = this.cZ();
      super.ac();
      if ($$0 instanceof bmo $$1) {
         for (blj $$2 : $$1.es()) {
            this.c.b(new abk($$0.aj(), $$2.b()));
         }
      }
   }

   public adh d(ane $$0) {
      return new adh($$0.ac(), $$0.ae(), cuy.a($$0.C()), this.e.b(), this.e.c(), $$0.ah(), $$0.B(), this.gr(), this.av());
   }

   @Override
   public boolean a(elx $$0) {
      double $$1 = this.gt() + 1.0;
      return $$0.e(this.br()) < $$1 * $$1;
   }

   public boolean d(hx $$0) {
      double $$1 = this.gs() + 1.0;
      return this.br().a((ir)emc.b($$0), $$1);
   }
}
