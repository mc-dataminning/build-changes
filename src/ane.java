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

public class ane extends cfi {
   private static final Logger b = LogUtils.getLogger();
   private static final int cm = 32;
   private static final int cn = 10;
   private static final int co = 25;
   public aoc c;
   public final MinecraftServer d;
   public final anf e;
   private final aho cp;
   private final ary cq;
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
   private cfg cD = cfg.a;
   private boolean cE = true;
   private long cF = ac.b();
   @Nullable
   private blv cG;
   private boolean cH;
   private boolean cI;
   private final arx cJ = new arx();
   @Nullable
   private elt cK;
   private int cL;
   private boolean cM;
   private int cN = 2;
   private String cO = "en_us";
   @Nullable
   private elt cP;
   @Nullable
   private elt cQ;
   @Nullable
   private elt cR;
   private iz cS = iz.a(0, 0, 0);
   private amr cT = amr.a;
   private ahf<ctp> cU = ctp.h;
   @Nullable
   private hx cV;
   private boolean cW;
   private float cX;
   private final aoh cY;
   private boolean cZ;
   private boolean da;
   private ceo db = new ceo(0, 0, 0);
   private final cio dc = new cio() {
      @Override
      public void a(cib $$0, iq<cmy> $$1, cmy $$2, int[] $$3) {
         ane.this.c.b(new zu($$0.j, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cib $$0, int $$1, cmy $$2) {
         ane.this.c.b(new zw($$0.j, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cib $$0, cmy $$1) {
         ane.this.c.b(new zw(-1, $$0.k(), -1, $$1));
      }

      @Override
      public void a(cib $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cib $$0, int $$1, int $$2) {
         ane.this.c.b(new zv($$0.j, $$1, $$2));
      }
   };
   private final cin dd = new cin() {
      @Override
      public void a(cib $$0, int $$1, cmy $$2) {
         cjw $$3 = $$0.b($$1);
         if (!($$3 instanceof cjs)) {
            if ($$3.d == ane.this.fS()) {
               am.f.a(ane.this, ane.this.fS(), $$2);
            }
         }
      }

      @Override
      public void a(cib $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private vw de;
   private int df;
   public boolean f;

   public ane(MinecraftServer $$0, and $$1, GameProfile $$2, ams $$3) {
      super($$1, $$1.T(), $$1.U(), $$2);
      this.cY = $$0.a(this);
      this.e = $$0.b(this);
      this.d = $$0;
      this.cq = $$0.ae().a((cfi)this);
      this.cp = $$0.ae().f(this);
      this.t(1.0F);
      this.e($$1);
      this.a($$3);
   }

   private void e(and $$0) {
      hx $$1 = $$0.T();
      if ($$0.E_().g() && $$0.o().aY().m() != ctm.c) {
         int $$2 = Math.max(0, this.d.a($$0));
         int $$3 = auo.a($$0.D_().b((double)$$1.u(), (double)$$1.w()));
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
         int $$8 = auv.a().a($$6);

         for (int $$9 = 0; $$9 < $$6; $$9++) {
            int $$10 = ($$8 + $$7 * $$9) % $$6;
            int $$11 = $$10 % ($$2 * 2 + 1);
            int $$12 = $$10 / ($$2 * 2 + 1);
            hx $$13 = amy.a($$0, $$1.u() + $$11 - $$2, $$1.w() + $$12 - $$2);
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
   public void a(sn $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         ceo.a.parse(new Dynamic(tb.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(b::error).ifPresent($$0x -> this.db = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         sn $$1 = $$0.p("enteredNetherPosition");
         this.cQ = new elt($$1.k("x"), $$1.k("y"), $$1.k("z"));
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
            this.cU = ctp.g.parse(tb.a, $$0.c("SpawnDimension")).resultOrPartial(b::error).orElse(ctp.h);
         }
      }
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      ceo.a.encodeStart(tb.a, this.db).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.cI);
      if (this.cQ != null) {
         sn $$1 = new sn();
         $$1.a("x", this.cQ.c);
         $$1.a("y", this.cQ.d);
         $$1.a("z", this.cQ.e);
         $$0.a("enteredNetherPosition", $$1);
      }

      blv $$2 = this.cW();
      blv $$3 = this.cZ();
      if ($$3 != null && $$2 != this && $$2.cV()) {
         sn $$4 = new sn();
         sn $$5 = new sn();
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
         ahg.a.encodeStart(tb.a, this.cU.a()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gb();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.ch = auo.a((float)$$0 / $$1, 0.0F, $$2);
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
   public void a(cmy $$0, int $$1) {
      super.a($$0, $$1);
      this.cB = -1;
   }

   private void a(cib $$0) {
      $$0.a(this.dd);
      $$0.a(this.dc);
   }

   public void h() {
      this.a(this.bR);
   }

   @Override
   public void g_() {
      super.g_();
      this.c.b(new abb());
   }

   @Override
   public void h_() {
      super.h_();
      this.c.b(new aba(this.eK()));
   }

   @Override
   protected void a(djh $$0) {
      am.e.a(this, $$0);
   }

   @Override
   protected cmu k() {
      return new cnt(this);
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

      blv $$0 = this.K();
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
            cmy $$1 = this.fS().a($$0);
            if ($$1.d().al_()) {
               xf<?> $$2 = ((cld)$$1.d()).a($$1, this.dM(), this);
               if ($$2 != null) {
                  this.c.b($$2);
               }
            }
         }

         if (this.ev() != this.cy || this.cz != this.bT.a() || this.bT.e() == 0.0F != this.cA) {
            this.c.b(new ach(this.ev(), this.bT.a(), this.bT.e()));
            this.cy = this.ev();
            this.cz = this.bT.a();
            this.cA = this.bT.e() == 0.0F;
         }

         if (this.ev() + this.fk() != this.cr) {
            this.cr = this.ev() + this.fk();
            this.a(ena.f, auo.f(this.cr));
         }

         if (this.bT.a() != this.cs) {
            this.cs = this.bT.a();
            this.a(ena.g, auo.f((float)this.cs));
         }

         if (this.ci() != this.ct) {
            this.ct = this.ci();
            this.a(ena.h, auo.f((float)this.ct));
         }

         if (this.eJ() != this.cu) {
            this.cu = this.eJ();
            this.a(ena.i, auo.f((float)this.cu));
         }

         if (this.cg != this.cx) {
            this.cx = this.cg;
            this.a(ena.j, auo.f((float)this.cx));
         }

         if (this.cf != this.cw) {
            this.cw = this.cf;
            this.a(ena.k, auo.f((float)this.cw));
         }

         if (this.cg != this.cB) {
            this.cB = this.cg;
            this.c.b(new acg(this.ch, this.cg, this.cf));
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

   private void a(ena $$0, int $$1) {
      this.gh().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(bkt $$0) {
      this.a(dnr.p);
      boolean $$1 = this.dM().Z().b(ctl.n);
      if ($$1) {
         vf $$2 = this.eK().a();
         this.c.a(new abc(this.aj(), $$2), up.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            vf $$3x = vf.a("death.attack.message_too_long", vf.b($$2x).a(n.o));
            vf $$4x = vf.a("death.attack.even_more_magic", this.Q_()).a($$1xx -> $$1xx.a(new vl(vl.a.a, $$3x)));
            return new abc(this.aj(), $$4x);
         }));
         emz $$3 = this.cg();
         if ($$3 == null || $$3.k() == emz.b.a) {
            this.d.ae().a($$2, false);
         } else if ($$3.k() == emz.b.c) {
            this.d.ae().a(this, $$2);
         } else if ($$3.k() == emz.b.d) {
            this.d.ae().b(this, $$2);
         }
      } else {
         this.c.b(new abc(this.aj(), ve.a));
      }

      this.gg();
      if (this.dM().Z().b(ctl.N)) {
         this.gs();
      }

      if (!this.P_()) {
         this.g($$0);
      }

      this.gh().a(ena.c, this, emv::b);
      bml $$4 = this.eL();
      if ($$4 != null) {
         this.b(asc.h.b($$4.ai()));
         $$4.a(this, this.bh, $$0);
         this.f($$4);
      }

      this.dM().a(this, (byte)3);
      this.a(asc.N);
      this.a(asc.i.b(asc.m));
      this.a(asc.i.b(asc.n));
      this.aA();
      this.k(0);
      this.a_(false);
      this.eK().c();
      this.a(Optional.of(ig.a(this.dM().ae(), this.dm())));
   }

   private void gs() {
      elo $$0 = new elo(this.dm()).c(32.0, 10.0, 32.0);
      this.dM().a(bmn.class, $$0, bly.f).stream().filter($$0x -> $$0x instanceof bms).forEach($$0x -> ((bms)$$0x).a_((cfi)this));
   }

   @Override
   public void a(blv $$0, int $$1, bkt $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.s($$1);
         this.gh().a(ena.e, this, emv::b);
         if ($$0 instanceof cfi) {
            this.a(asc.Q);
            this.gh().a(ena.d, this, emv::b);
         } else {
            this.a(asc.O);
         }

         this.a(this, $$0, ena.l);
         this.a($$0, this, ena.m);
         am.c.a(this, $$0, $$2);
      }
   }

   private void a(emw $$0, emw $$1, ena[] $$2) {
      ems $$3 = this.gh().e($$1.cy());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gh().a($$2[$$4], $$0, emv::b);
         }
      }
   }

   @Override
   public boolean a(bkt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.d.l() && this.gt() && $$0.a(asj.n);
         if (!$$2 && this.cC > 0 && !$$0.a(asj.e)) {
            return false;
         } else {
            blv $$3 = $$0.d();
            if ($$3 instanceof cfi $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof cfo $$5 && $$5.w() instanceof cfi $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(cfi $$0) {
      return !this.gt() ? false : super.a($$0);
   }

   private boolean gt() {
      return this.d.aa();
   }

   @Nullable
   @Override
   protected efo a(and $$0) {
      efo $$1 = super.a($$0);
      if ($$1 != null && this.dM().ae() == ctp.h && $$0.ae() == ctp.j) {
         elt $$2 = $$1.a.b(0.0, -1.0, 0.0);
         return new efo($$2, elt.b, 90.0F, 0.0F);
      } else {
         return $$1;
      }
   }

   @Nullable
   @Override
   public blv b(and $$0) {
      this.cH = true;
      and $$1 = this.z();
      ahf<ctp> $$2 = $$1.ae();
      if ($$2 == ctp.j && $$0.ae() == ctp.h) {
         this.ag();
         this.z().a(this, blv.c.e);
         if (!this.f) {
            this.f = true;
            this.c.b(new aaf(aaf.e, this.cI ? 0.0F : 1.0F));
            this.cI = true;
         }

         return this;
      } else {
         egi $$3 = $$0.B_();
         this.c.b(new abl(this.d($$0), (byte)3));
         this.c.b(new zm($$3.s(), $$3.t()));
         aqv $$4 = this.d.ae();
         $$4.d(this);
         $$1.a(this, blv.c.e);
         this.dJ();
         efo $$5 = this.a($$0);
         if ($$5 != null) {
            $$1.af().a("moving");
            if ($$2 == ctp.h && $$0.ae() == ctp.i) {
               this.cQ = this.dk();
            } else if ($$0.ae() == ctp.j) {
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
            this.c.b(new aay(this.fT()));
            $$4.a(this, $$0);
            $$4.e(this);

            for (bli $$6 : this.es()) {
               this.c.b(new ade(this.aj(), $$6));
            }

            this.c.b(new aal(1032, hx.b, 0, false));
            this.cB = -1;
            this.cy = -1.0F;
            this.cz = -1;
         }

         return this;
      }
   }

   private void a(and $$0, hx $$1) {
      hx.a $$2 = $$1.j();

      for (int $$3 = -2; $$3 <= 2; $$3++) {
         for (int $$4 = -2; $$4 <= 2; $$4++) {
            for (int $$5 = -1; $$5 < 3; $$5++) {
               djh $$6 = $$5 == -1 ? cws.co.o() : cws.a.o();
               $$0.b($$2.g($$1).e($$4, $$5, $$3), $$6);
            }
         }
      }
   }

   @Override
   protected Optional<l.a> a(and $$0, hx $$1, boolean $$2, dky $$3) {
      Optional<l.a> $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         ic.a $$5 = this.dM().a_(this.ax).d(dbt.b).orElse(ic.a.a);
         Optional<l.a> $$6 = $$0.p().a($$1, $$5);
         if ($$6.isEmpty()) {
            b.error("Unable to create a portal, likely target out of worldborder");
         }

         return $$6;
      }
   }

   private void f(and $$0) {
      ahf<ctp> $$1 = $$0.ae();
      ahf<ctp> $$2 = this.dM().ae();
      am.w.a(this, $$1, $$2);
      if ($$1 == ctp.i && $$2 == ctp.h && this.cQ != null) {
         am.D.a(this, this.cQ);
      }

      if ($$2 != ctp.i) {
         this.cQ = null;
      }
   }

   @Override
   public boolean a(ane $$0) {
      if ($$0.P_()) {
         return this.K() == this;
      } else {
         return this.P_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(blv $$0, int $$1) {
      super.a($$0, $$1);
      this.bS.d();
   }

   @Override
   public Either<cfi.a, avs> a(hx $$0) {
      ic $$1 = this.dM().a_($$0).c(dal.aE);
      if (this.fD() || !this.bx()) {
         return Either.left(cfi.a.e);
      } else if (!this.dM().E_().j()) {
         return Either.left(cfi.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cfi.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cfi.a.d);
      } else {
         this.a(this.dM().ae(), $$0, this.dC(), false, true);
         if (this.dM().P()) {
            return Either.left(cfi.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               elt $$4 = elt.c($$0);
               List<ccp> $$5 = this.dM()
                  .a(ccp.class, new elo($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.f(this));
               if (!$$5.isEmpty()) {
                  return Either.left(cfi.a.f);
               }
            }

            Either<cfi.a, avs> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(asc.ap);
               am.r.a(this);
            });
            if (!this.z().d()) {
               this.a(vf.c("sleep.not_possible"), true);
            }

            ((and)this.dM()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(hx $$0) {
      this.a(asc.i.b(asc.n));
      super.b($$0);
   }

   private boolean a(hx $$0, ic $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(hx $$0) {
      elt $$1 = elt.c($$0);
      return Math.abs(this.dr() - $$1.a()) <= 3.0 && Math.abs(this.dt() - $$1.b()) <= 2.0 && Math.abs(this.dx() - $$1.c()) <= 3.0;
   }

   private boolean b(hx $$0, ic $$1) {
      hx $$2 = $$0.c();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fD()) {
         this.z().l().a(this, new zd(this, 2));
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
   public boolean b(bkt $$0) {
      return super.b($$0) || this.O();
   }

   @Override
   protected void a(double $$0, boolean $$1, djh $$2, hx $$3) {
   }

   @Override
   protected void c(hx $$0) {
      if (!this.P_()) {
         super.c($$0);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.de()) {
         this.b($$3, new elt($$0, $$1, $$2));
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
   public void a(die $$0, boolean $$1) {
      this.c.b(new zj(this.dM(), $$0.aB_()));
      this.c.b(new aaw($$0.aB_(), $$1));
   }

   private void gu() {
      this.df = this.df % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bke $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.bS != this.bR) {
            this.r();
         }

         this.gu();
         cib $$1 = $$0.createMenu(this.df, this.fS(), this);
         if ($$1 == null) {
            if (this.P_()) {
               this.a(vf.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.c.b(new aav($$1.j, $$1.a(), $$0.Q_()));
            this.a($$1);
            this.bS = $$1;
            return OptionalInt.of(this.df);
         }
      }
   }

   @Override
   public void a(int $$0, cso $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.c.b(new aar($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(bzx $$0, bju $$1) {
      if (this.bS != this.bR) {
         this.r();
      }

      this.gu();
      this.c.b(new aag(this.df, $$1.b(), $$0.aj()));
      this.bS = new cjb(this.df, this.fS(), $$1, $$0);
      this.a(this.bS);
   }

   @Override
   public void a(cmy $$0, bka $$1) {
      if ($$0.a(cnb.tU)) {
         if (cov.a($$0, this.dd(), this)) {
            this.bS.d();
         }

         this.c.b(new aau($$1));
      }
   }

   @Override
   public void a(dhf $$0) {
      this.c.b(zh.a($$0, dgv::q));
   }

   @Override
   public void r() {
      this.c.b(new zt(this.bS.j));
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
   public void a(elt $$0) {
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
               this.a(asc.C, $$3);
               this.A(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(asm.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(asc.w, $$4);
               this.A(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.aZ()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(asc.s, $$5);
               this.A(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.e_()) {
            if ($$1 > 0.0) {
               this.a(asc.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aC()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.bY()) {
                  this.a(asc.r, $$6);
                  this.A(0.1F * (float)$$6 * 0.01F);
               } else if (this.bX()) {
                  this.a(asc.q, $$6);
                  this.A(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(asc.p, $$6);
                  this.A(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fw()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(asc.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(asc.v, $$8);
            }
         }
      }
   }

   private void r(double $$0, double $$1, double $$2) {
      if (this.bO() && !s($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         blv $$4 = this.cZ();
         if ($$4 instanceof cha) {
            this.a(asc.x, $$3);
         } else if ($$4 instanceof chc) {
            this.a(asc.y, $$3);
         } else if ($$4 instanceof byp) {
            this.a(asc.z, $$3);
         } else if ($$4 instanceof bzx) {
            this.a(asc.A, $$3);
         } else if ($$4 instanceof cdc) {
            this.a(asc.D, $$3);
         }
      }
   }

   private static boolean s(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(arz<?> $$0, int $$1) {
      this.cq.b(this, $$0, $$1);
      this.gh().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(arz<?> $$0) {
      this.cq.a(this, $$0, 0);
      this.gh().a($$0, this, emv::c);
   }

   @Override
   public int a(Collection<cqe<?>> $$0) {
      return this.cJ.a($$0, this);
   }

   @Override
   public void a(cqe<?> $$0, List<cmy> $$1) {
      am.aa.a(this, $$0.a(), $$1);
   }

   @Override
   public void a(List<ahg> $$0) {
      List<cqe<?>> $$1 = $$0.stream().flatMap($$0x -> this.d.aG().a($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<cqe<?>> $$0) {
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
   public void a(vf $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void x() {
      if (!this.bv.b() && this.fn()) {
         this.c.b(new aac(this, (byte)9));
         super.x();
      }
   }

   @Override
   public void a(ee.a $$0, elt $$1) {
      super.a($$0, $$1);
      this.c.b(new abf($$0, $$1.c, $$1.d, $$1.e));
   }

   public void a(ee.a $$0, blv $$1, ee.a $$2) {
      elt $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.c.b(new abf($$0, $$1, $$2));
   }

   public void a(ane $$0, boolean $$1) {
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
      } else if (this.dM().Z().b(ctl.d) || $$0.P_()) {
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
   protected void a(bli $$0, @Nullable blv $$1) {
      super.a($$0, $$1);
      this.c.b(new ade(this.aj(), $$0));
      if ($$0.c() == blk.y) {
         this.cL = this.ah;
         this.cK = this.dk();
      }

      am.B.a(this, $$1);
   }

   @Override
   protected void a(bli $$0, boolean $$1, @Nullable blv $$2) {
      super.a($$0, $$1, $$2);
      this.c.b(new ade(this.aj(), $$0));
      am.B.a(this, $$2);
   }

   @Override
   protected void a(bli $$0) {
      super.a($$0);
      this.c.b(new abj(this.aj(), $$0.c()));
      if ($$0.c() == blk.y) {
         this.cK = null;
      }

      am.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.c.a($$0, $$1, $$2, this.dC(), this.dE(), bmz.g);
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.c.a(this.dr() + $$0, this.dt() + $$1, this.dx() + $$2, this.dC(), this.dE(), bmz.f);
   }

   @Override
   public boolean a(and $$0, double $$1, double $$2, double $$3, Set<bmz> $$4, float $$5, float $$6) {
      csw $$7 = new csw(hx.a($$1, $$2, $$3));
      $$0.l().a(ani.g, $$7, 1, this.aj());
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
   public void a(blv $$0) {
      this.z().l().a(this, new zd($$0, 4));
   }

   @Override
   public void b(blv $$0) {
      this.z().l().a(this, new zd($$0, 5));
   }

   @Override
   public void y() {
      if (this.c != null) {
         this.c.b(new aay(this.fT()));
         this.J();
      }
   }

   public and z() {
      return (and)this.dM();
   }

   public boolean a(ctm $$0) {
      if (!this.e.a($$0)) {
         return false;
      } else {
         this.c.b(new aaf(aaf.d, (float)$$0.a()));
         if ($$0 == ctm.d) {
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
      return this.e.b() == ctm.d;
   }

   @Override
   public boolean f() {
      return this.e.b() == ctm.b;
   }

   @Override
   public void a(vf $$0) {
      this.b($$0, false);
   }

   public void b(vf $$0, boolean $$1) {
      if (this.w($$1)) {
         this.c.a(new acv($$0, $$1), up.a(() -> {
            if (this.w(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               vf $$3 = vf.b($$2).a(n.o);
               return new acv(vf.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(vu $$0, boolean $$1, vb.a $$2) {
      if (this.gv()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String A() {
      return this.c.n() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(ams $$0) {
      this.cO = $$0.b();
      this.cN = $$0.c();
      this.cD = $$0.d();
      this.cE = $$0.e();
      this.cZ = $$0.h();
      this.da = $$0.i();
      this.an().b(bM, (byte)$$0.f());
      this.an().b(bN, (byte)$$0.g().a());
   }

   public ams B() {
      int $$0 = this.an().b(bM);
      bmf $$1 = bmf.d.apply(this.an().b(bN));
      return new ams(this.cO, this.cN, this.cD, this.cE, $$0, $$1, this.cZ, this.da);
   }

   public boolean C() {
      return this.cE;
   }

   public cfg D() {
      return this.cD;
   }

   private boolean w(boolean $$0) {
      return this.cD == cfg.c ? $$0 : true;
   }

   private boolean gv() {
      return this.cD == cfg.a;
   }

   public int E() {
      return this.cN;
   }

   public void a(agh $$0) {
      this.c.b(new abp($$0.a(), $$0.d().map(agh.a::a), $$0.e()));
   }

   @Override
   protected int F() {
      return this.d.c(this.fR());
   }

   public void G() {
      this.cF = ac.b();
   }

   public ary H() {
      return this.cq;
   }

   public arx I() {
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

   public blv K() {
      return (blv)(this.cG == null ? this : this.cG);
   }

   @Override
   public void c(@Nullable blv $$0) {
      blv $$1 = this.K();
      this.cG = (blv)($$0 == null ? this : $$0);
      if ($$1 != this.cG) {
         if (this.cG.dM() instanceof and $$2) {
            this.a($$2, this.cG.dr(), this.cG.dt(), this.cG.dx(), Set.of(), this.dC(), this.dE());
         }

         if ($$0 != null) {
            this.z().l().a(this);
         }

         this.c.b(new abw(this.cG));
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
   public void d(blv $$0) {
      if (this.e.b() == ctm.d) {
         this.c($$0);
      } else {
         super.d($$0);
      }
   }

   public long M() {
      return this.cF;
   }

   @Nullable
   public vf N() {
      return null;
   }

   @Override
   public void a(bka $$0) {
      super.a($$0);
      this.gm();
   }

   public boolean O() {
      return this.cH;
   }

   public void P() {
      this.cH = false;
   }

   public aho Q() {
      return this.cp;
   }

   public void a(and $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      this.c(this);
      this.ac();
      if ($$0 == this.dM()) {
         this.c.a($$1, $$2, $$3, $$4, $$5);
      } else {
         and $$6 = this.z();
         egi $$7 = $$0.B_();
         this.c.b(new abl(this.d($$0), (byte)3));
         this.c.b(new zm($$7.s(), $$7.t()));
         this.d.ae().d(this);
         $$6.a(this, blv.c.e);
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

   public ahf<ctp> T() {
      return this.cU;
   }

   public boolean U() {
      return this.cW;
   }

   public void a(ahf<ctp> $$0, @Nullable hx $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.cV) && $$0.equals(this.cU);
         if ($$4 && !$$5) {
            this.a(vf.c("block.minecraft.set_spawn"));
         }

         this.cV = $$1;
         this.cU = $$0;
         this.cX = $$2;
         this.cW = $$3;
      } else {
         this.cV = null;
         this.cU = ctp.h;
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

   public amr W() {
      return this.cT;
   }

   public void a(amr $$0) {
      this.cT = $$0;
   }

   @Override
   public void a(arr $$0, art $$1, float $$2, float $$3) {
      this.c.b(new acs(kd.b.d($$0), $$1, this.dr(), this.dt(), this.dx(), $$2, $$3, this.ag.g()));
   }

   @Override
   public cbu a(cmy $$0, boolean $$1, boolean $$2) {
      cbu $$3 = super.a($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dM().b($$3);
         cmy $$4 = $$3.q();
         if ($$2) {
            if (!$$4.b()) {
               this.a(asc.f.b($$4.d()), $$0.L());
            }

            this.a(asc.F);
         }

         return $$3;
      }
   }

   public aoh X() {
      return this.cY;
   }

   public void c(and $$0) {
      this.a((ctp)$$0);
      this.e.a($$0);
   }

   @Nullable
   private static ctm a(@Nullable sn $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? ctm.a($$0.h($$1)) : null;
   }

   private ctm b(@Nullable ctm $$0) {
      ctm $$1 = this.d.bb();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.d.v_();
      }
   }

   @Override
   public void c(@Nullable sn $$0) {
      this.e.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void k(sn $$0) {
      $$0.a("playerGameType", this.e.b().a());
      ctm $$1 = this.e.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean Y() {
      return this.cZ;
   }

   public boolean b(ane $$0) {
      return $$0 == this ? false : this.cZ || $$0.cZ;
   }

   @Override
   public boolean a(ctp $$0, hx $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cmy $$0) {
      am.U.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cfh $$1 = this.fS();
      cmy $$2 = $$1.a($$0);
      this.bS.b($$1, $$1.l).ifPresent($$1x -> this.bS.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean Z() {
      return this.da;
   }

   @Override
   public Optional<ceo> aa() {
      return Optional.of(this.db);
   }

   @Override
   public void a(cbu $$0) {
      super.a($$0);
      blv $$1 = $$0.w();
      if ($$1 != null) {
         am.Q.a(this, $$0.q(), $$1);
      }
   }

   public void a(vw $$0) {
      this.de = $$0;
   }

   @Nullable
   public vw ab() {
      return this.de != null && this.de.b() ? null : this.de;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cl = (float)(auo.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dC());
      this.c.b(new aah(this));
   }

   @Override
   public boolean a(blv $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         $$0.i(this);
         this.c.a(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
         if ($$0 instanceof bml $$2) {
            for (bli $$3 : $$2.es()) {
               this.c.b(new ade($$0.aj(), $$3));
            }
         }

         return true;
      }
   }

   @Override
   public void ac() {
      blv $$0 = this.cZ();
      super.ac();
      if ($$0 instanceof bml $$1) {
         for (bli $$2 : $$1.es()) {
            this.c.b(new abj($$0.aj(), $$2.c()));
         }
      }
   }

   public adg d(and $$0) {
      return new adg($$0.ac(), $$0.ae(), cuq.a($$0.C()), this.e.b(), this.e.c(), $$0.ah(), $$0.B(), this.gr(), this.av());
   }
}
