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
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ana extends cfb {
   private static final Logger b = LogUtils.getLogger();
   private static final int cm = 32;
   private static final int cn = 10;
   private static final int co = 25;
   public any c;
   public final MinecraftServer d;
   public final anb e;
   private final ahl cp;
   private final ars cq;
   private float cr = Float.MIN_VALUE;
   private int cs = Integer.MIN_VALUE;
   private int ct = Integer.MIN_VALUE;
   private int cu = Integer.MIN_VALUE;
   private int cw = Integer.MIN_VALUE;
   private int cx = Integer.MIN_VALUE;
   private float cy = -1.0E8F;
   private int cz = -99999999;
   private boolean cA = true;
   private int cB = -99999999;
   private int cC = 60;
   private cez cD = cez.a;
   private boolean cE = true;
   private long cF = ac.b();
   @Nullable
   private blp cG;
   private boolean cH;
   private boolean cI;
   private final arr cJ = new arr();
   @Nullable
   private elm cK;
   private int cL;
   private boolean cM;
   private int cN = 2;
   private String cO = "en_us";
   @Nullable
   private elm cP;
   @Nullable
   private elm cQ;
   @Nullable
   private elm cR;
   private iz cS = iz.a(0, 0, 0);
   private amn cT = amn.a;
   private ahc<cti> cU = cti.h;
   @Nullable
   private hx cV;
   private boolean cW;
   private float cX;
   private final aod cY;
   private boolean cZ;
   private boolean da;
   private ceh db = new ceh(0, 0, 0);
   private final cih dc = new cih() {
      @Override
      public void a(chu $$0, iq<cmr> $$1, cmr $$2, int[] $$3) {
         ana.this.c.b(new zr($$0.j, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(chu $$0, int $$1, cmr $$2) {
         ana.this.c.b(new zt($$0.j, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(chu $$0, cmr $$1) {
         ana.this.c.b(new zt(-1, $$0.k(), -1, $$1));
      }

      @Override
      public void a(chu $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(chu $$0, int $$1, int $$2) {
         ana.this.c.b(new zs($$0.j, $$1, $$2));
      }
   };
   private final cig dd = new cig() {
      @Override
      public void a(chu $$0, int $$1, cmr $$2) {
         cjp $$3 = $$0.b($$1);
         if (!($$3 instanceof cjl)) {
            if ($$3.d == ana.this.fS()) {
               am.f.a(ana.this, ana.this.fS(), $$2);
            }
         }
      }

      @Override
      public void a(chu $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private vu de;
   private int df;
   public boolean f;

   public ana(MinecraftServer $$0, amz $$1, GameProfile $$2, amo $$3) {
      super($$1, $$1.T(), $$1.U(), $$2);
      this.cY = $$0.a(this);
      this.e = $$0.b(this);
      this.d = $$0;
      this.cq = $$0.ae().a((cfb)this);
      this.cp = $$0.ae().f(this);
      this.t(1.0F);
      this.e($$1);
      this.a($$3);
   }

   private void e(amz $$0) {
      hx $$1 = $$0.T();
      if ($$0.E_().g() && $$0.o().aY().m() != ctf.c) {
         int $$2 = Math.max(0, this.d.a($$0));
         int $$3 = aui.a($$0.D_().b((double)$$1.u(), (double)$$1.w()));
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
         int $$8 = aup.a().a($$6);

         for (int $$9 = 0; $$9 < $$6; $$9++) {
            int $$10 = ($$8 + $$7 * $$9) % $$6;
            int $$11 = $$10 % ($$2 * 2 + 1);
            int $$12 = $$10 / ($$2 * 2 + 1);
            hx $$13 = amu.a($$0, $$1.u() + $$11 - $$2, $$1.w() + $$12 - $$2);
            if ($$13 != null) {
               this.a($$13, 0.0F, 0.0F);
               if ($$0.g(this)) {
                  break;
               }
            }
         }
      } else {
         this.a($$1, 0.0F, 0.0F);

         while (!$$0.g(this) && this.dt() < (double)($$0.al() - 1)) {
            this.a_(this.dr(), this.dt() + 1.0, this.dx());
         }
      }
   }

   private int u(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         ceh.a.parse(new Dynamic(sz.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(b::error).ifPresent($$0x -> this.db = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         sl $$1 = $$0.p("enteredNetherPosition");
         this.cQ = new elm($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.cI = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cJ.a($$0.p("recipeBook"), this.d.aG());
      }

      if (this.fD()) {
         this.fE();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.cV = new hx($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.cW = $$0.q("SpawnForced");
         this.cX = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.cU = cti.g.parse(sz.a, $$0.c("SpawnDimension")).resultOrPartial(b::error).orElse(cti.h);
         }
      }
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      ceh.a.encodeStart(sz.a, this.db).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.cI);
      if (this.cQ != null) {
         sl $$1 = new sl();
         $$1.a("x", this.cQ.c);
         $$1.a("y", this.cQ.d);
         $$1.a("z", this.cQ.e);
         $$0.a("enteredNetherPosition", $$1);
      }

      blp $$2 = this.cW();
      blp $$3 = this.cZ();
      if ($$3 != null && $$2 != this && $$2.cV()) {
         sl $$4 = new sl();
         sl $$5 = new sl();
         $$2.e($$5);
         $$4.a("Attach", $$3.cw());
         $$4.a("Entity", $$5);
         $$0.a("RootVehicle", $$4);
      }

      $$0.a("recipeBook", this.cJ.b());
      $$0.a("Dimension", this.dM().ae().a().toString());
      if (this.cV != null) {
         $$0.a("SpawnX", this.cV.u());
         $$0.a("SpawnY", this.cV.v());
         $$0.a("SpawnZ", this.cV.w());
         $$0.a("SpawnForced", this.cW);
         $$0.a("SpawnAngle", this.cX);
         ahd.a.encodeStart(sz.a, this.cU.a()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gb();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.ch = aui.a((float)$$0 / $$1, 0.0F, $$2);
      this.cB = -1;
   }

   public void b(int $$0) {
      this.cf = $$0;
      this.cB = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cB = -1;
   }

   @Override
   public void a(cmr $$0, int $$1) {
      super.a($$0, $$1);
      this.cB = -1;
   }

   private void a(chu $$0) {
      $$0.a(this.dd);
      $$0.a(this.dc);
   }

   public void h() {
      this.a(this.bR);
   }

   @Override
   public void g_() {
      super.g_();
      this.c.b(new aay());
   }

   @Override
   public void h_() {
      super.h_();
      this.c.b(new aax(this.eK()));
   }

   @Override
   protected void a(dja $$0) {
      am.e.a(this, $$0);
   }

   @Override
   protected cmn k() {
      return new cnm(this);
   }

   @Override
   public void l() {
      this.e.a();
      this.db.a();
      this.cC--;
      if (this.al > 0) {
         this.al--;
      }

      this.bS.d();
      if (!this.dM().B && !this.bS.a(this)) {
         this.r();
         this.bS = this.bR;
      }

      blp $$0 = this.K();
      if ($$0 != this) {
         if ($$0.bx()) {
            this.a($$0.dr(), $$0.dt(), $$0.dx(), $$0.dC(), $$0.dE());
            this.z().l().a(this);
            if (this.fJ()) {
               this.c(this);
            }
         } else {
            this.c(this);
         }
      }

      am.x.a(this);
      if (this.cK != null) {
         am.v.a(this, this.cK, this.ah - this.cL);
      }

      this.o();
      this.p();
      this.cp.b(this);
   }

   public void m() {
      try {
         if (!this.P_() || !this.de()) {
            super.l();
         }

         for (int $$0 = 0; $$0 < this.fS().b(); $$0++) {
            cmr $$1 = this.fS().a($$0);
            if ($$1.d().al_()) {
               xd<?> $$2 = ((ckw)$$1.d()).a($$1, this.dM(), this);
               if ($$2 != null) {
                  this.c.b($$2);
               }
            }
         }

         if (this.ev() != this.cy || this.cz != this.bT.a() || this.bT.e() == 0.0F != this.cA) {
            this.c.b(new ace(this.ev(), this.bT.a(), this.bT.e()));
            this.cy = this.ev();
            this.cz = this.bT.a();
            this.cA = this.bT.e() == 0.0F;
         }

         if (this.ev() + this.fk() != this.cr) {
            this.cr = this.ev() + this.fk();
            this.a(emt.f, aui.f(this.cr));
         }

         if (this.bT.a() != this.cs) {
            this.cs = this.bT.a();
            this.a(emt.g, aui.f((float)this.cs));
         }

         if (this.ci() != this.ct) {
            this.ct = this.ci();
            this.a(emt.h, aui.f((float)this.ct));
         }

         if (this.eJ() != this.cu) {
            this.cu = this.eJ();
            this.a(emt.i, aui.f((float)this.cu));
         }

         if (this.cg != this.cx) {
            this.cx = this.cg;
            this.a(emt.j, aui.f((float)this.cx));
         }

         if (this.cf != this.cw) {
            this.cw = this.cf;
            this.a(emt.k, aui.f((float)this.cw));
         }

         if (this.cg != this.cB) {
            this.cB = this.cg;
            this.c.b(new acd(this.ch, this.cg, this.cf));
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
      if (this.ev() > 0.0F && this.cP != null) {
         am.V.a(this, this.cP);
      }

      this.cP = null;
      super.n();
   }

   public void o() {
      if (this.ab > 0.0F && this.cP == null) {
         this.cP = this.dk();
      }
   }

   public void p() {
      if (this.cZ() != null && this.cZ().bn()) {
         if (this.cR == null) {
            this.cR = this.dk();
         } else {
            am.W.a(this, this.cR);
         }
      }

      if (this.cR != null && (this.cZ() == null || !this.cZ().bn())) {
         this.cR = null;
      }
   }

   private void a(emt $$0, int $$1) {
      this.gh().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(bkn $$0) {
      this.a(dnk.p);
      boolean $$1 = this.dM().Z().b(cte.n);
      if ($$1) {
         vd $$2 = this.eK().a();
         this.c.a(new aaz(this.aj(), $$2), un.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            vd $$3x = vd.a("death.attack.message_too_long", vd.b($$2x).a(n.o));
            vd $$4x = vd.a("death.attack.even_more_magic", this.Q_()).a($$1xx -> $$1xx.a(new vj(vj.a.a, $$3x)));
            return new aaz(this.aj(), $$4x);
         }));
         ems $$3 = this.cg();
         if ($$3 == null || $$3.k() == ems.b.a) {
            this.d.ae().a($$2, false);
         } else if ($$3.k() == ems.b.c) {
            this.d.ae().a(this, $$2);
         } else if ($$3.k() == ems.b.d) {
            this.d.ae().b(this, $$2);
         }
      } else {
         this.c.b(new aaz(this.aj(), vc.a));
      }

      this.gg();
      if (this.dM().Z().b(cte.N)) {
         this.gs();
      }

      if (!this.P_()) {
         this.g($$0);
      }

      this.gh().a(emt.c, this, emo::b);
      bmf $$4 = this.eL();
      if ($$4 != null) {
         this.b(arw.h.b($$4.ai()));
         $$4.a(this, this.bh, $$0);
         this.f($$4);
      }

      this.dM().a(this, (byte)3);
      this.a(arw.N);
      this.a(arw.i.b(arw.m));
      this.a(arw.i.b(arw.n));
      this.aA();
      this.k(0);
      this.a_(false);
      this.eK().c();
      this.a(Optional.of(ig.a(this.dM().ae(), this.dm())));
   }

   private void gs() {
      elh $$0 = new elh(this.dm()).c(32.0, 10.0, 32.0);
      this.dM().a(bmh.class, $$0, bls.f).stream().filter($$0x -> $$0x instanceof bmm).forEach($$0x -> ((bmm)$$0x).a_((cfb)this));
   }

   @Override
   public void a(blp $$0, int $$1, bkn $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.s($$1);
         this.gh().a(emt.e, this, emo::b);
         if ($$0 instanceof cfb) {
            this.a(arw.Q);
            this.gh().a(emt.d, this, emo::b);
         } else {
            this.a(arw.O);
         }

         this.a(this, $$0, emt.l);
         this.a($$0, this, emt.m);
         am.c.a(this, $$0, $$2);
      }
   }

   private void a(emp $$0, emp $$1, emt[] $$2) {
      eml $$3 = this.gh().e($$1.cy());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gh().a($$2[$$4], $$0, emo::b);
         }
      }
   }

   @Override
   public boolean a(bkn $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.d.l() && this.gt() && $$0.a(asd.n);
         if (!$$2 && this.cC > 0 && !$$0.a(asd.e)) {
            return false;
         } else {
            blp $$3 = $$0.d();
            if ($$3 instanceof cfb $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof cfh $$5 && $$5.w() instanceof cfb $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(cfb $$0) {
      return !this.gt() ? false : super.a($$0);
   }

   private boolean gt() {
      return this.d.aa();
   }

   @Nullable
   @Override
   protected efh a(amz $$0) {
      efh $$1 = super.a($$0);
      if ($$1 != null && this.dM().ae() == cti.h && $$0.ae() == cti.j) {
         elm $$2 = $$1.a.b(0.0, -1.0, 0.0);
         return new efh($$2, elm.b, 90.0F, 0.0F);
      } else {
         return $$1;
      }
   }

   @Nullable
   @Override
   public blp b(amz $$0) {
      this.cH = true;
      amz $$1 = this.z();
      ahc<cti> $$2 = $$1.ae();
      if ($$2 == cti.j && $$0.ae() == cti.h) {
         this.ag();
         this.z().a(this, blp.c.e);
         if (!this.f) {
            this.f = true;
            this.c.b(new aac(aac.e, this.cI ? 0.0F : 1.0F));
            this.cI = true;
         }

         return this;
      } else {
         egb $$3 = $$0.B_();
         this.c.b(new abi(this.d($$0), (byte)3));
         this.c.b(new zj($$3.s(), $$3.t()));
         aqp $$4 = this.d.ae();
         $$4.d(this);
         $$1.a(this, blp.c.e);
         this.dJ();
         efh $$5 = this.a($$0);
         if ($$5 != null) {
            $$1.af().a("moving");
            if ($$2 == cti.h && $$0.ae() == cti.i) {
               this.cQ = this.dk();
            } else if ($$0.ae() == cti.j) {
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
            this.c.b(new aav(this.fT()));
            $$4.a(this, $$0);
            $$4.e(this);

            for (blc $$6 : this.es()) {
               this.c.b(new adb(this.aj(), $$6));
            }

            this.c.b(new aai(1032, hx.b, 0, false));
            this.cB = -1;
            this.cy = -1.0F;
            this.cz = -1;
         }

         return this;
      }
   }

   private void a(amz $$0, hx $$1) {
      hx.a $$2 = $$1.j();

      for (int $$3 = -2; $$3 <= 2; $$3++) {
         for (int $$4 = -2; $$4 <= 2; $$4++) {
            for (int $$5 = -1; $$5 < 3; $$5++) {
               dja $$6 = $$5 == -1 ? cwl.co.o() : cwl.a.o();
               $$0.b($$2.g($$1).e($$4, $$5, $$3), $$6);
            }
         }
      }
   }

   @Override
   protected Optional<l.a> a(amz $$0, hx $$1, boolean $$2, dkr $$3) {
      Optional<l.a> $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         ic.a $$5 = this.dM().a_(this.ax).d(dbm.b).orElse(ic.a.a);
         Optional<l.a> $$6 = $$0.p().a($$1, $$5);
         if ($$6.isEmpty()) {
            b.error("Unable to create a portal, likely target out of worldborder");
         }

         return $$6;
      }
   }

   private void f(amz $$0) {
      ahc<cti> $$1 = $$0.ae();
      ahc<cti> $$2 = this.dM().ae();
      am.w.a(this, $$1, $$2);
      if ($$1 == cti.i && $$2 == cti.h && this.cQ != null) {
         am.D.a(this, this.cQ);
      }

      if ($$2 != cti.i) {
         this.cQ = null;
      }
   }

   @Override
   public boolean a(ana $$0) {
      if ($$0.P_()) {
         return this.K() == this;
      } else {
         return this.P_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(blp $$0, int $$1) {
      super.a($$0, $$1);
      this.bS.d();
   }

   @Override
   public Either<cfb.a, avm> a(hx $$0) {
      ic $$1 = this.dM().a_($$0).c(dae.aE);
      if (this.fD() || !this.bx()) {
         return Either.left(cfb.a.e);
      } else if (!this.dM().E_().j()) {
         return Either.left(cfb.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cfb.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cfb.a.d);
      } else {
         this.a(this.dM().ae(), $$0, this.dC(), false, true);
         if (this.dM().P()) {
            return Either.left(cfb.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               elm $$4 = elm.c($$0);
               List<ccj> $$5 = this.dM()
                  .a(ccj.class, new elh($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.f(this));
               if (!$$5.isEmpty()) {
                  return Either.left(cfb.a.f);
               }
            }

            Either<cfb.a, avm> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(arw.ap);
               am.r.a(this);
            });
            if (!this.z().d()) {
               this.a(vd.c("sleep.not_possible"), true);
            }

            ((amz)this.dM()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(hx $$0) {
      this.a(arw.i.b(arw.n));
      super.b($$0);
   }

   private boolean a(hx $$0, ic $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(hx $$0) {
      elm $$1 = elm.c($$0);
      return Math.abs(this.dr() - $$1.a()) <= 3.0 && Math.abs(this.dt() - $$1.b()) <= 2.0 && Math.abs(this.dx() - $$1.c()) <= 3.0;
   }

   private boolean b(hx $$0, ic $$1) {
      hx $$2 = $$0.c();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fD()) {
         this.z().l().a(this, new za(this, 2));
      }

      super.a($$0, $$1);
      if (this.c != null) {
         this.c.a(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.bC();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public boolean b(bkn $$0) {
      return super.b($$0) || this.O();
   }

   @Override
   protected void a(double $$0, boolean $$1, dja $$2, hx $$3) {
   }

   @Override
   protected void c(hx $$0) {
      if (!this.P_()) {
         super.c($$0);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.de()) {
         this.b($$3, new elm($$0, $$1, $$2));
         hx $$4 = this.aH();
         super.a($$1, $$3, this.dM().a_($$4), $$4);
      }
   }

   @Override
   protected void M_() {
      if (this.dM().s().i()) {
         super.M_();
      }
   }

   @Override
   public void a(dhx $$0, boolean $$1) {
      this.c.b(new zg(this.dM(), $$0.aB_()));
      this.c.b(new aat($$0.aB_(), $$1));
   }

   private void gu() {
      this.df = this.df % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bjy $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.bS != this.bR) {
            this.r();
         }

         this.gu();
         chu $$1 = $$0.createMenu(this.df, this.fS(), this);
         if ($$1 == null) {
            if (this.P_()) {
               this.a(vd.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.c.b(new aas($$1.j, $$1.a(), $$0.Q_()));
            this.a($$1);
            this.bS = $$1;
            return OptionalInt.of(this.df);
         }
      }
   }

   @Override
   public void a(int $$0, csh $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.c.b(new aao($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(bzr $$0, bjo $$1) {
      if (this.bS != this.bR) {
         this.r();
      }

      this.gu();
      this.c.b(new aad(this.df, $$1.b(), $$0.aj()));
      this.bS = new ciu(this.df, this.fS(), $$1, $$0);
      this.a(this.bS);
   }

   @Override
   public void a(cmr $$0, bju $$1) {
      if ($$0.a(cmu.tU)) {
         if (coo.a($$0, this.dd(), this)) {
            this.bS.d();
         }

         this.c.b(new aar($$1));
      }
   }

   @Override
   public void a(dgy $$0) {
      this.c.b(ze.a($$0, dgo::q));
   }

   @Override
   public void r() {
      this.c.b(new zq(this.bS.j));
      this.s();
   }

   @Override
   public void s() {
      this.bS.b(this);
      this.bR.a(this.bS);
      this.bS = this.bR;
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
   public void a(elm $$0) {
      double $$1 = this.dr();
      double $$2 = this.dt();
      double $$3 = this.dx();
      super.a($$0);
      this.b(this.dr() - $$1, this.dt() - $$2, this.dx() - $$3);
   }

   @Override
   public void t() {
      double $$0 = this.dr();
      double $$1 = this.dt();
      double $$2 = this.dx();
      super.t();
      this.r(this.dr() - $$0, this.dt() - $$1, this.dx() - $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (!this.bO() && !s($$0, $$1, $$2)) {
         if (this.bZ()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(arw.C, $$3);
               this.A(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(asg.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(arw.w, $$4);
               this.A(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.aZ()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(arw.s, $$5);
               this.A(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.e_()) {
            if ($$1 > 0.0) {
               this.a(arw.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aC()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.bY()) {
                  this.a(arw.r, $$6);
                  this.A(0.1F * (float)$$6 * 0.01F);
               } else if (this.bX()) {
                  this.a(arw.q, $$6);
                  this.A(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(arw.p, $$6);
                  this.A(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fw()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(arw.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(arw.v, $$8);
            }
         }
      }
   }

   private void r(double $$0, double $$1, double $$2) {
      if (this.bO() && !s($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         blp $$4 = this.cZ();
         if ($$4 instanceof cgt) {
            this.a(arw.x, $$3);
         } else if ($$4 instanceof cgv) {
            this.a(arw.y, $$3);
         } else if ($$4 instanceof byj) {
            this.a(arw.z, $$3);
         } else if ($$4 instanceof bzr) {
            this.a(arw.A, $$3);
         } else if ($$4 instanceof ccw) {
            this.a(arw.D, $$3);
         }
      }
   }

   private static boolean s(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(art<?> $$0, int $$1) {
      this.cq.b(this, $$0, $$1);
      this.gh().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(art<?> $$0) {
      this.cq.a(this, $$0, 0);
      this.gh().a($$0, this, emo::c);
   }

   @Override
   public int a(Collection<cpx<?>> $$0) {
      return this.cJ.a($$0, this);
   }

   @Override
   public void a(cpx<?> $$0, List<cmr> $$1) {
      am.aa.a(this, $$0.a(), $$1);
   }

   @Override
   public void a(List<ahd> $$0) {
      List<cpx<?>> $$1 = $$0.stream().flatMap($$0x -> this.d.aG().a($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<cpx<?>> $$0) {
      return this.cJ.b($$0, this);
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cB = -1;
   }

   @Override
   public void u() {
      this.cM = true;
      this.bB();
      if (this.fD()) {
         this.a(true, false);
      }
   }

   public boolean v() {
      return this.cM;
   }

   @Override
   public void w() {
      this.cy = -1.0E8F;
   }

   @Override
   public void a(vd $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void x() {
      if (!this.bv.b() && this.fn()) {
         this.c.b(new zz(this, (byte)9));
         super.x();
      }
   }

   @Override
   public void a(ee.a $$0, elm $$1) {
      super.a($$0, $$1);
      this.c.b(new abc($$0, $$1.c, $$1.d, $$1.e));
   }

   public void a(ee.a $$0, blp $$1, ee.a $$2) {
      elm $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.c.b(new abc($$0, $$1, $$2));
   }

   public void a(ana $$0, boolean $$1) {
      this.db = $$0.db;
      this.de = $$0.de;
      this.e.a($$0.e.b(), $$0.e.c());
      this.y();
      if ($$1) {
         this.fS().a($$0.fS());
         this.c($$0.ev());
         this.bT = $$0.bT;
         this.cf = $$0.cf;
         this.cg = $$0.cg;
         this.ch = $$0.ch;
         this.r($$0.fN());
         this.ax = $$0.ax;
      } else if (this.dM().Z().b(cte.d) || $$0.P_()) {
         this.fS().a($$0.fS());
         this.cf = $$0.cf;
         this.cg = $$0.cg;
         this.ch = $$0.ch;
         this.r($$0.fN());
      }

      this.ci = $$0.ci;
      this.bQ = $$0.bQ;
      this.an().b(bM, $$0.an().b(bM));
      this.cB = -1;
      this.cy = -1.0F;
      this.cz = -1;
      this.cJ.a($$0.cJ);
      this.cI = $$0.cI;
      this.cQ = $$0.cQ;
      this.cT = $$0.cT;
      this.i($$0.gj());
      this.j($$0.gk());
      this.a($$0.gr());
   }

   @Override
   protected void a(blc $$0, @Nullable blp $$1) {
      super.a($$0, $$1);
      this.c.b(new adb(this.aj(), $$0));
      if ($$0.c() == ble.y) {
         this.cL = this.ah;
         this.cK = this.dk();
      }

      am.B.a(this, $$1);
   }

   @Override
   protected void a(blc $$0, boolean $$1, @Nullable blp $$2) {
      super.a($$0, $$1, $$2);
      this.c.b(new adb(this.aj(), $$0));
      am.B.a(this, $$2);
   }

   @Override
   protected void a(blc $$0) {
      super.a($$0);
      this.c.b(new abg(this.aj(), $$0.c()));
      if ($$0.c() == ble.y) {
         this.cK = null;
      }

      am.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.c.a($$0, $$1, $$2, this.dC(), this.dE(), bmt.g);
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.c.a(this.dr() + $$0, this.dt() + $$1, this.dx() + $$2, this.dC(), this.dE(), bmt.f);
   }

   @Override
   public boolean a(amz $$0, double $$1, double $$2, double $$3, Set<bmt> $$4, float $$5, float $$6) {
      csp $$7 = new csp(hx.a($$1, $$2, $$3));
      $$0.l().a(ane.g, $$7, 1, this.aj());
      this.ac();
      if (this.fD()) {
         this.a(true, true);
      }

      if ($$0 == this.dM()) {
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
   public void a(blp $$0) {
      this.z().l().a(this, new za($$0, 4));
   }

   @Override
   public void b(blp $$0) {
      this.z().l().a(this, new za($$0, 5));
   }

   @Override
   public void y() {
      if (this.c != null) {
         this.c.b(new aav(this.fT()));
         this.J();
      }
   }

   public amz z() {
      return (amz)this.dM();
   }

   public boolean a(ctf $$0) {
      if (!this.e.a($$0)) {
         return false;
      } else {
         this.c.b(new aac(aac.d, (float)$$0.a()));
         if ($$0 == ctf.d) {
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
      return this.e.b() == ctf.d;
   }

   @Override
   public boolean f() {
      return this.e.b() == ctf.b;
   }

   @Override
   public void a(vd $$0) {
      this.b($$0, false);
   }

   public void b(vd $$0, boolean $$1) {
      if (this.w($$1)) {
         this.c.a(new acs($$0, $$1), un.a(() -> {
            if (this.w(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               vd $$3 = vd.b($$2).a(n.o);
               return new acs(vd.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(vs $$0, boolean $$1, uz.a $$2) {
      if (this.gv()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String A() {
      return this.c.n() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(amo $$0) {
      this.cO = $$0.b();
      this.cN = $$0.c();
      this.cD = $$0.d();
      this.cE = $$0.e();
      this.cZ = $$0.h();
      this.da = $$0.i();
      this.an().b(bM, (byte)$$0.f());
      this.an().b(bN, (byte)$$0.g().a());
   }

   public amo B() {
      int $$0 = this.an().b(bM);
      blz $$1 = blz.d.apply(this.an().b(bN));
      return new amo(this.cO, this.cN, this.cD, this.cE, $$0, $$1, this.cZ, this.da);
   }

   public boolean C() {
      return this.cE;
   }

   public cez D() {
      return this.cD;
   }

   private boolean w(boolean $$0) {
      return this.cD == cez.c ? $$0 : true;
   }

   private boolean gv() {
      return this.cD == cez.a;
   }

   public int E() {
      return this.cN;
   }

   public void a(age $$0) {
      this.c.b(new abm($$0.a(), $$0.d().map(age.a::a), $$0.e()));
   }

   @Override
   protected int F() {
      return this.d.c(this.fR());
   }

   public void G() {
      this.cF = ac.b();
   }

   public ars H() {
      return this.cq;
   }

   public arr I() {
      return this.cJ;
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

   public blp K() {
      return (blp)(this.cG == null ? this : this.cG);
   }

   @Override
   public void c(@Nullable blp $$0) {
      blp $$1 = this.K();
      this.cG = (blp)($$0 == null ? this : $$0);
      if ($$1 != this.cG) {
         if (this.cG.dM() instanceof amz $$2) {
            this.a($$2, this.cG.dr(), this.cG.dt(), this.cG.dx(), Set.of(), this.dC(), this.dE());
         }

         if ($$0 != null) {
            this.z().l().a(this);
         }

         this.c.b(new abt(this.cG));
         this.c.m();
      }
   }

   @Override
   protected void L() {
      if (!this.cH) {
         super.L();
      }
   }

   @Override
   public void d(blp $$0) {
      if (this.e.b() == ctf.d) {
         this.c($$0);
      } else {
         super.d($$0);
      }
   }

   public long M() {
      return this.cF;
   }

   @Nullable
   public vd N() {
      return null;
   }

   @Override
   public void a(bju $$0) {
      super.a($$0);
      this.gm();
   }

   public boolean O() {
      return this.cH;
   }

   public void P() {
      this.cH = false;
   }

   public ahl Q() {
      return this.cp;
   }

   public void a(amz $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      this.c(this);
      this.ac();
      if ($$0 == this.dM()) {
         this.c.a($$1, $$2, $$3, $$4, $$5);
      } else {
         amz $$6 = this.z();
         egb $$7 = $$0.B_();
         this.c.b(new abi(this.d($$0), (byte)3));
         this.c.b(new zj($$7.s(), $$7.t()));
         this.d.ae().d(this);
         $$6.a(this, blp.c.e);
         this.dJ();
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
      return this.cV;
   }

   public float S() {
      return this.cX;
   }

   public ahc<cti> T() {
      return this.cU;
   }

   public boolean U() {
      return this.cW;
   }

   public void a(ahc<cti> $$0, @Nullable hx $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.cV) && $$0.equals(this.cU);
         if ($$4 && !$$5) {
            this.a(vd.c("block.minecraft.set_spawn"));
         }

         this.cV = $$1;
         this.cU = $$0;
         this.cX = $$2;
         this.cW = $$3;
      } else {
         this.cV = null;
         this.cU = cti.h;
         this.cX = 0.0F;
         this.cW = false;
      }
   }

   public iz V() {
      return this.cS;
   }

   public void a(iz $$0) {
      this.cS = $$0;
   }

   public amn W() {
      return this.cT;
   }

   public void a(amn $$0) {
      this.cT = $$0;
   }

   @Override
   public void a(arl $$0, arn $$1, float $$2, float $$3) {
      this.c.b(new acp(kd.b.d($$0), $$1, this.dr(), this.dt(), this.dx(), $$2, $$3, this.ag.g()));
   }

   @Override
   public cbo a(cmr $$0, boolean $$1, boolean $$2) {
      cbo $$3 = super.a($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dM().b($$3);
         cmr $$4 = $$3.q();
         if ($$2) {
            if (!$$4.b()) {
               this.a(arw.f.b($$4.d()), $$0.L());
            }

            this.a(arw.F);
         }

         return $$3;
      }
   }

   public aod X() {
      return this.cY;
   }

   public void c(amz $$0) {
      this.a((cti)$$0);
      this.e.a($$0);
   }

   @Nullable
   private static ctf a(@Nullable sl $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? ctf.a($$0.h($$1)) : null;
   }

   private ctf b(@Nullable ctf $$0) {
      ctf $$1 = this.d.bb();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.d.v_();
      }
   }

   @Override
   public void c(@Nullable sl $$0) {
      this.e.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void k(sl $$0) {
      $$0.a("playerGameType", this.e.b().a());
      ctf $$1 = this.e.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean Y() {
      return this.cZ;
   }

   public boolean b(ana $$0) {
      return $$0 == this ? false : this.cZ || $$0.cZ;
   }

   @Override
   public boolean a(cti $$0, hx $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cmr $$0) {
      am.U.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cfa $$1 = this.fS();
      cmr $$2 = $$1.a($$0);
      this.bS.b($$1, $$1.l).ifPresent($$1x -> this.bS.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean Z() {
      return this.da;
   }

   @Override
   public Optional<ceh> aa() {
      return Optional.of(this.db);
   }

   @Override
   public void a(cbo $$0) {
      super.a($$0);
      blp $$1 = $$0.w();
      if ($$1 != null) {
         am.Q.a(this, $$0.q(), $$1);
      }
   }

   public void a(vu $$0) {
      this.de = $$0;
   }

   @Nullable
   public vu ab() {
      return this.de != null && this.de.b() ? null : this.de;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cl = (float)(aui.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dC());
      this.c.b(new aae(this));
   }

   @Override
   public boolean a(blp $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         $$0.i(this);
         this.c.a(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
         if ($$0 instanceof bmf $$2) {
            for (blc $$3 : $$2.es()) {
               this.c.b(new adb($$0.aj(), $$3));
            }
         }

         return true;
      }
   }

   @Override
   public void ac() {
      blp $$0 = this.cZ();
      super.ac();
      if ($$0 instanceof bmf $$1) {
         for (blc $$2 : $$1.es()) {
            this.c.b(new abg($$0.aj(), $$2.c()));
         }
      }
   }

   public add d(amz $$0) {
      return new add($$0.ac(), $$0.ae(), cuj.a($$0.C()), this.e.b(), this.e.c(), $$0.ah(), $$0.B(), this.gr(), this.av());
   }
}
