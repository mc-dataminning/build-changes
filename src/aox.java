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

public class aox extends chl {
   private static final Logger b = LogUtils.getLogger();
   private static final int cq = 32;
   private static final int cr = 10;
   private static final int cs = 25;
   public static final double c = 1.0;
   private static final bpn ct = new bpn(UUID.fromString("736565d2-e1a7-403d-a3f8-1aeb3e302542"), "Creative block interaction range modifier", 0.5, bpn.a.a);
   private static final bpn cu = new bpn(UUID.fromString("98491ef6-97b1-4584-ae82-71a8cc85cf73"), "Creative entity interaction range modifier", 2.0, bpn.a.a);
   public apv d;
   public final MinecraftServer e;
   public final aoy f;
   private final ajg cw;
   private final atr cx;
   private float cy = Float.MIN_VALUE;
   private int cz = Integer.MIN_VALUE;
   private int cA = Integer.MIN_VALUE;
   private int cB = Integer.MIN_VALUE;
   private int cC = Integer.MIN_VALUE;
   private int cD = Integer.MIN_VALUE;
   private float cE = -1.0E8F;
   private int cF = -99999999;
   private boolean cG = true;
   private int cH = -99999999;
   private int cI = 60;
   private chj cJ = chj.a;
   private boolean cK = true;
   private long cL = ac.b();
   @Nullable
   private bnq cM;
   private boolean cN;
   private boolean cO;
   private final atq cP = new atq();
   @Nullable
   private enz cQ;
   private int cR;
   private boolean cS;
   private int cT = 2;
   private String cU = "en_us";
   @Nullable
   private enz cV;
   @Nullable
   private enz cW;
   @Nullable
   private enz cX;
   private jb cY = jb.a(0, 0, 0);
   private aok cZ = aok.a;
   private aix<cvr> da = cvr.h;
   @Nullable
   private hz db;
   private boolean dc;
   private float dd;
   private final aqa de;
   private boolean df;
   private boolean dg;
   private cgr dh = new cgr(0, 0, 0);
   private final cks di = new cks() {
      @Override
      public void a(ckf $$0, is<cpd> $$1, cpd $$2, int[] $$3) {
         aox.this.d.b(new abb($$0.j, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(ckf $$0, int $$1, cpd $$2) {
         aox.this.d.b(new abd($$0.j, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(ckf $$0, cpd $$1) {
         aox.this.d.b(new abd(-1, $$0.k(), -1, $$1));
      }

      @Override
      public void a(ckf $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(ckf $$0, int $$1, int $$2) {
         aox.this.d.b(new abc($$0.j, $$1, $$2));
      }
   };
   private final ckr dj = new ckr() {
      @Override
      public void a(ckf $$0, int $$1, cpd $$2) {
         cma $$3 = $$0.b($$1);
         if (!($$3 instanceof clw)) {
            if ($$3.d == aox.this.fT()) {
               am.f.a(aox.this, aox.this.fT(), $$2);
            }
         }
      }

      @Override
      public void a(ckf $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private wh dk;
   private int dl;
   public boolean g;

   public aox(MinecraftServer $$0, aow $$1, GameProfile $$2, aol $$3) {
      super($$1, $$1.T(), $$1.U(), $$2);
      this.de = $$0.a(this);
      this.f = $$0.b(this);
      this.e = $$0;
      this.cx = $$0.ag().a((chl)this);
      this.cw = $$0.ag().f(this);
      this.e($$1);
      this.a($$3);
   }

   private void e(aow $$0) {
      hz $$1 = $$0.T();
      if ($$0.E_().g() && $$0.o().ba().k() != cvo.c) {
         int $$2 = Math.max(0, this.e.a($$0));
         int $$3 = awi.a($$0.D_().b((double)$$1.u(), (double)$$1.w()));
         if ($$3 < $$2) {
            $$2 = $$3;
         }

         if ($$3 <= 1) {
            $$2 = 1;
         }

         long $$4 = (long)($$2 * 2 + 1);
         long $$5 = $$4 * $$4;
         int $$6 = $$5 > 2147483647L ? Integer.MAX_VALUE : (int)$$5;
         int $$7 = this.v($$6);
         int $$8 = awp.a().a($$6);

         for (int $$9 = 0; $$9 < $$6; $$9++) {
            int $$10 = ($$8 + $$7 * $$9) % $$6;
            int $$11 = $$10 % ($$2 * 2 + 1);
            int $$12 = $$10 / ($$2 * 2 + 1);
            hz $$13 = aor.a($$0, $$1.u() + $$11 - $$2, $$1.w() + $$12 - $$2);
            if ($$13 != null) {
               this.a($$13, 0.0F, 0.0F);
               if ($$0.g(this)) {
                  break;
               }
            }
         }
      } else {
         this.a($$1, 0.0F, 0.0F);

         while (!$$0.g(this) && this.dt() < (double)($$0.ak() - 1)) {
            this.a_(this.dr(), this.dt() + 1.0, this.dx());
         }
      }
   }

   private int v(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         cgr.a.parse(new Dynamic(tk.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(b::error).ifPresent($$0x -> this.dh = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         sw $$1 = $$0.p("enteredNetherPosition");
         this.cW = new enz($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.cO = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cP.a($$0.p("recipeBook"), this.e.aI());
      }

      if (this.fD()) {
         this.fE();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.db = new hz($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.dc = $$0.q("SpawnForced");
         this.dd = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.da = cvr.g.parse(tk.a, $$0.c("SpawnDimension")).resultOrPartial(b::error).orElse(cvr.h);
         }
      }
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      cgr.a.encodeStart(tk.a, this.dh).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.cO);
      if (this.cW != null) {
         sw $$1 = new sw();
         $$1.a("x", this.cW.c);
         $$1.a("y", this.cW.d);
         $$1.a("z", this.cW.e);
         $$0.a("enteredNetherPosition", $$1);
      }

      bnq $$2 = this.cW();
      bnq $$3 = this.cZ();
      if ($$3 != null && $$2 != this && $$2.cV()) {
         sw $$4 = new sw();
         sw $$5 = new sw();
         $$2.e($$5);
         $$4.a("Attach", $$3.cw());
         $$4.a("Entity", $$5);
         $$0.a("RootVehicle", $$4);
      }

      $$0.a("recipeBook", this.cP.b());
      $$0.a("Dimension", this.dM().ad().a().toString());
      if (this.db != null) {
         $$0.a("SpawnX", this.db.u());
         $$0.a("SpawnY", this.db.v());
         $$0.a("SpawnZ", this.db.w());
         $$0.a("SpawnForced", this.dc);
         $$0.a("SpawnAngle", this.dd);
         aiy.a.encodeStart(tk.a, this.da.a()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gc();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.cl = awi.a((float)$$0 / $$1, 0.0F, $$2);
      this.cH = -1;
   }

   public void b(int $$0) {
      this.cj = $$0;
      this.cH = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cH = -1;
   }

   @Override
   public void a(cpd $$0, int $$1) {
      super.a($$0, $$1);
      this.cH = -1;
   }

   private void a(ckf $$0) {
      $$0.a(this.dj);
      $$0.a(this.di);
   }

   public void h() {
      this.a(this.bV);
   }

   @Override
   public void g_() {
      super.g_();
      this.d.b(aci.a);
   }

   @Override
   public void h_() {
      super.h_();
      this.d.b(new ach(this.eL()));
   }

   @Override
   protected void a(dlj $$0) {
      am.e.a(this, $$0);
   }

   @Override
   protected coz k() {
      return new cpy(this);
   }

   @Override
   public void l() {
      this.f.a();
      this.dh.a();
      this.cI--;
      if (this.ak > 0) {
         this.ak--;
      }

      this.bW.d();
      if (!this.dM().B && !this.bW.a(this)) {
         this.r();
         this.bW = this.bV;
      }

      bnq $$0 = this.K();
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
      if (this.cQ != null) {
         am.v.a(this, this.cQ, this.ag - this.cR);
      }

      this.o();
      this.p();
      this.gv();
      this.cw.b(this);
   }

   private void gv() {
      bpl $$0 = this.f(bpp.f);
      if ($$0 != null) {
         if (this.f()) {
            $$0.b(ct);
         } else {
            $$0.e(ct);
         }
      }

      bpl $$1 = this.f(bpp.g);
      if ($$1 != null) {
         if (this.f()) {
            $$1.b(cu);
         } else {
            $$1.e(cu);
         }
      }
   }

   public void m() {
      try {
         if (!this.P_() || !this.de()) {
            super.l();
         }

         for (int $$0 = 0; $$0 < this.fT().b(); $$0++) {
            cpd $$1 = this.fT().a($$0);
            if ($$1.d().am_()) {
               xx<?> $$2 = ((cni)$$1.d()).a($$1, this.dM(), this);
               if ($$2 != null) {
                  this.d.b($$2);
               }
            }
         }

         if (this.ew() != this.cE || this.cF != this.bX.a() || this.bX.e() == 0.0F != this.cG) {
            this.d.b(new ado(this.ew(), this.bX.a(), this.bX.e()));
            this.cE = this.ew();
            this.cF = this.bX.a();
            this.cG = this.bX.e() == 0.0F;
         }

         if (this.ew() + this.fk() != this.cy) {
            this.cy = this.ew() + this.fk();
            this.a(epg.g, awi.f(this.cy));
         }

         if (this.bX.a() != this.cz) {
            this.cz = this.bX.a();
            this.a(epg.h, awi.f((float)this.cz));
         }

         if (this.ci() != this.cA) {
            this.cA = this.ci();
            this.a(epg.i, awi.f((float)this.cA));
         }

         if (this.eK() != this.cB) {
            this.cB = this.eK();
            this.a(epg.j, awi.f((float)this.cB));
         }

         if (this.ck != this.cD) {
            this.cD = this.ck;
            this.a(epg.k, awi.f((float)this.cD));
         }

         if (this.cj != this.cC) {
            this.cC = this.cj;
            this.a(epg.l, awi.f((float)this.cC));
         }

         if (this.ck != this.cH) {
            this.cH = this.ck;
            this.d.b(new adn(this.cl, this.ck, this.cj));
         }

         if (this.ag % 20 == 0) {
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
      if (this.ew() > 0.0F && this.cV != null) {
         am.X.a(this, this.cV);
      }

      this.cV = null;
      super.n();
   }

   public void o() {
      if (this.aa > 0.0F && this.cV == null) {
         this.cV = this.dk();
      }
   }

   public void p() {
      if (this.cZ() != null && this.cZ().bn()) {
         if (this.cX == null) {
            this.cX = this.dk();
         } else {
            am.Y.a(this, this.cX);
         }
      }

      if (this.cX != null && (this.cZ() == null || !this.cZ().bn())) {
         this.cX = null;
      }
   }

   private void a(epg $$0, int $$1) {
      this.gi().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(bmp $$0) {
      this.b(dpw.p);
      boolean $$1 = this.dM().Z().b(cvn.n);
      if ($$1) {
         vq $$2 = this.eL().a();
         this.d.a(new acj(this.aj(), $$2), ux.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            vq $$3x = vq.a("death.attack.message_too_long", vq.b($$2x).a(n.o));
            vq $$4x = vq.a("death.attack.even_more_magic", this.Q_()).a($$1xx -> $$1xx.a(new vw(vw.a.a, $$3x)));
            return new acj(this.aj(), $$4x);
         }));
         epf $$3 = this.cg();
         if ($$3 == null || $$3.k() == epf.b.a) {
            this.e.ag().a($$2, false);
         } else if ($$3.k() == epf.b.c) {
            this.e.ag().a(this, $$2);
         } else if ($$3.k() == epf.b.d) {
            this.e.ag().b(this, $$2);
         }
      } else {
         this.d.b(new acj(this.aj(), vp.a));
      }

      this.gh();
      if (this.dM().Z().b(cvn.N)) {
         this.gw();
      }

      if (!this.P_()) {
         this.g($$0);
      }

      this.gi().a(epg.d, this, epb::b);
      boi $$4 = this.eM();
      if ($$4 != null) {
         this.b(atv.h.b($$4.ai()));
         $$4.a(this, this.bh, $$0);
         this.f($$4);
      }

      this.dM().a(this, (byte)3);
      this.a(atv.N);
      this.a(atv.i.b(atv.m));
      this.a(atv.i.b(atv.n));
      this.aA();
      this.l(0);
      this.a_(false);
      this.eL().c();
      this.a(Optional.of(ii.a(this.dM().ad(), this.dm())));
   }

   private void gw() {
      enu $$0 = new enu(this.dm()).c(32.0, 10.0, 32.0);
      this.dM().a(bok.class, $$0, bnv.f).stream().filter($$0x -> $$0x instanceof boo).forEach($$0x -> ((boo)$$0x).a_((chl)this));
   }

   @Override
   public void a(bnq $$0, int $$1, bmp $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.t($$1);
         this.gi().a(epg.f, this, epb::b);
         if ($$0 instanceof chl) {
            this.a(atv.Q);
            this.gi().a(epg.e, this, epb::b);
         } else {
            this.a(atv.O);
         }

         this.a(this, $$0, epg.m);
         this.a($$0, this, epg.n);
         am.c.a(this, $$0, $$2);
      }
   }

   private void a(epc $$0, epc $$1, epg[] $$2) {
      eoy $$3 = this.gi().e($$1.cy());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gi().a($$2[$$4], $$0, epb::b);
         }
      }
   }

   @Override
   public boolean a(bmp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.e.l() && this.gx() && $$0.a(auc.n);
         if (!$$2 && this.cI > 0 && !$$0.a(auc.e)) {
            return false;
         } else {
            bnq $$3 = $$0.d();
            if ($$3 instanceof chl $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof chr $$5 && $$5.w() instanceof chl $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(chl $$0) {
      return !this.gx() ? false : super.a($$0);
   }

   private boolean gx() {
      return this.e.ac();
   }

   @Nullable
   @Override
   protected eht a(aow $$0) {
      eht $$1 = super.a($$0);
      if ($$1 != null && this.dM().ad() == cvr.h && $$0.ad() == cvr.j) {
         enz $$2 = $$1.a.b(0.0, -1.0, 0.0);
         return new eht($$2, enz.b, 90.0F, 0.0F);
      } else {
         return $$1;
      }
   }

   @Nullable
   @Override
   public bnq b(aow $$0) {
      this.cN = true;
      aow $$1 = this.z();
      aix<cvr> $$2 = $$1.ad();
      if ($$2 == cvr.j && $$0.ad() == cvr.h) {
         this.ag();
         this.z().a(this, bnq.c.e);
         if (!this.g) {
            this.g = true;
            this.d.b(new abm(abm.f, this.cO ? 0.0F : 1.0F));
            this.cO = true;
         }

         return this;
      } else {
         eio $$3 = $$0.B_();
         this.d.b(new acs(this.d($$0), (byte)3));
         this.d.b(new aat($$3.q(), $$3.r()));
         aso $$4 = this.e.ag();
         $$4.d(this);
         $$1.a(this, bnq.c.e);
         this.dJ();
         eht $$5 = this.a($$0);
         if ($$5 != null) {
            $$1.ae().a("moving");
            if ($$2 == cvr.h && $$0.ad() == cvr.i) {
               this.cW = this.dk();
            } else if ($$0.ad() == cvr.j) {
               this.a($$0, hz.a($$5.a));
            }

            $$1.ae().c();
            $$1.ae().a("placing");
            this.c($$0);
            this.d.a($$5.a.c, $$5.a.d, $$5.a.e, $$5.c, $$5.d);
            this.d.m();
            $$0.b(this);
            $$1.ae().c();
            this.f($$1);
            this.d.b(new acf(this.fU()));
            $$4.a(this, $$0);
            $$4.e(this);

            for (bnd $$6 : this.et()) {
               this.d.b(new ael(this.aj(), $$6, false));
            }

            this.d.b(new abs(1032, hz.c, 0, false));
            this.cH = -1;
            this.cE = -1.0F;
            this.cF = -1;
         }

         return this;
      }
   }

   private void a(aow $$0, hz $$1) {
      hz.a $$2 = $$1.j();

      for (int $$3 = -2; $$3 <= 2; $$3++) {
         for (int $$4 = -2; $$4 <= 2; $$4++) {
            for (int $$5 = -1; $$5 < 3; $$5++) {
               dlj $$6 = $$5 == -1 ? cyu.co.o() : cyu.a.o();
               $$0.b($$2.g($$1).e($$4, $$5, $$3), $$6);
            }
         }
      }
   }

   @Override
   protected Optional<l.a> a(aow $$0, hz $$1, boolean $$2, dna $$3) {
      Optional<l.a> $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         ie.a $$5 = this.dM().a_(this.aw).d(ddv.b).orElse(ie.a.a);
         Optional<l.a> $$6 = $$0.p().a($$1, $$5);
         if ($$6.isEmpty()) {
            b.error("Unable to create a portal, likely target out of worldborder");
         }

         return $$6;
      }
   }

   private void f(aow $$0) {
      aix<cvr> $$1 = $$0.ad();
      aix<cvr> $$2 = this.dM().ad();
      am.w.a(this, $$1, $$2);
      if ($$1 == cvr.i && $$2 == cvr.h && this.cW != null) {
         am.D.a(this, this.cW);
      }

      if ($$2 != cvr.i) {
         this.cW = null;
      }
   }

   @Override
   public boolean a(aox $$0) {
      if ($$0.P_()) {
         return this.K() == this;
      } else {
         return this.P_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bnq $$0, int $$1) {
      super.a($$0, $$1);
      this.bW.d();
   }

   @Override
   public Either<chl.a, axk> a(hz $$0) {
      ie $$1 = this.dM().a_($$0).c(dcn.aE);
      if (this.fD() || !this.bx()) {
         return Either.left(chl.a.e);
      } else if (!this.dM().E_().j()) {
         return Either.left(chl.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(chl.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(chl.a.d);
      } else {
         this.a(this.dM().ad(), $$0, this.dC(), false, true);
         if (this.dM().P()) {
            return Either.left(chl.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               enz $$4 = enz.c($$0);
               List<cer> $$5 = this.dM()
                  .a(cer.class, new enu($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.f(this));
               if (!$$5.isEmpty()) {
                  return Either.left(chl.a.f);
               }
            }

            Either<chl.a, axk> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(atv.ap);
               am.r.a(this);
            });
            if (!this.z().d()) {
               this.a(vq.c("sleep.not_possible"), true);
            }

            ((aow)this.dM()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(hz $$0) {
      this.a(atv.i.b(atv.n));
      super.b($$0);
   }

   private boolean a(hz $$0, ie $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(hz $$0) {
      enz $$1 = enz.c($$0);
      return Math.abs(this.dr() - $$1.a()) <= 3.0 && Math.abs(this.dt() - $$1.b()) <= 2.0 && Math.abs(this.dx() - $$1.c()) <= 3.0;
   }

   private boolean b(hz $$0, ie $$1) {
      hz $$2 = $$0.c();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fD()) {
         this.z().l().a(this, new aaj(this, 2));
      }

      super.a($$0, $$1);
      if (this.d != null) {
         this.d.a(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.bC();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public boolean b(bmp $$0) {
      return super.b($$0) || this.O();
   }

   @Override
   protected void a(double $$0, boolean $$1, dlj $$2, hz $$3) {
   }

   @Override
   protected void c(hz $$0) {
      if (!this.P_()) {
         super.c($$0);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.de()) {
         this.b($$3, new enz($$0, $$1, $$2));
         hz $$4 = this.aH();
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
   public void a(dkg $$0, boolean $$1) {
      this.d.b(new aap(this.dM(), $$0.aE_()));
      this.d.b(new acd($$0.aE_(), $$1));
   }

   private void gy() {
      this.dl = this.dl % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bma $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.bW != this.bV) {
            this.r();
         }

         this.gy();
         ckf $$1 = $$0.createMenu(this.dl, this.fT(), this);
         if ($$1 == null) {
            if (this.P_()) {
               this.a(vq.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.d.b(new acc($$1.j, $$1.a(), $$0.Q_()));
            this.a($$1);
            this.bW = $$1;
            return OptionalInt.of(this.dl);
         }
      }
   }

   @Override
   public void a(int $$0, cuq $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.d.b(new aby($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(cbz $$0, blp $$1) {
      if (this.bW != this.bV) {
         this.r();
      }

      this.gy();
      this.d.b(new abn(this.dl, $$1.b(), $$0.aj()));
      this.bW = new clf(this.dl, this.fT(), $$1, $$0);
      this.a(this.bW);
   }

   @Override
   public void a(cpd $$0, blv $$1) {
      if ($$0.a(cpg.tX)) {
         if (cqy.a($$0, this.dd(), this)) {
            this.bW.d();
         }

         this.d.b(new acb($$1));
      }
   }

   @Override
   public void a(djh $$0) {
      this.d.b(aan.a($$0, dix::q));
   }

   @Override
   public void r() {
      this.d.b(new aba(this.bW.j));
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
   public void a(enz $$0) {
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
               this.a(atv.C, $$3);
               this.A(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(auf.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(atv.w, $$4);
               this.A(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.aZ()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(atv.s, $$5);
               this.A(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.e_()) {
            if ($$1 > 0.0) {
               this.a(atv.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aC()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.bY()) {
                  this.a(atv.r, $$6);
                  this.A(0.1F * (float)$$6 * 0.01F);
               } else if (this.bX()) {
                  this.a(atv.q, $$6);
                  this.A(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(atv.p, $$6);
                  this.A(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fw()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(atv.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(atv.v, $$8);
            }
         }
      }
   }

   private void r(double $$0, double $$1, double $$2) {
      if (this.bO() && !s($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         bnq $$4 = this.cZ();
         if ($$4 instanceof cje) {
            this.a(atv.x, $$3);
         } else if ($$4 instanceof cjg) {
            this.a(atv.y, $$3);
         } else if ($$4 instanceof cao) {
            this.a(atv.z, $$3);
         } else if ($$4 instanceof cbz) {
            this.a(atv.A, $$3);
         } else if ($$4 instanceof cfe) {
            this.a(atv.D, $$3);
         }
      }
   }

   private static boolean s(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(ats<?> $$0, int $$1) {
      this.cx.b(this, $$0, $$1);
      this.gi().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(ats<?> $$0) {
      this.cx.a(this, $$0, 0);
      this.gi().a($$0, this, epb::c);
   }

   @Override
   public int a(Collection<csh<?>> $$0) {
      return this.cP.a($$0, this);
   }

   @Override
   public void a(csh<?> $$0, List<cpd> $$1) {
      am.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void a(List<aiy> $$0) {
      List<csh<?>> $$1 = $$0.stream().flatMap($$0x -> this.e.aI().a($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<csh<?>> $$0) {
      return this.cP.b($$0, this);
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cH = -1;
   }

   @Override
   public void u() {
      this.cS = true;
      this.bB();
      if (this.fD()) {
         this.a(true, false);
      }
   }

   public boolean v() {
      return this.cS;
   }

   @Override
   public void w() {
      this.cE = -1.0E8F;
   }

   @Override
   public void a(vq $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void x() {
      if (!this.bv.b() && this.fn()) {
         this.d.b(new abj(this, (byte)9));
         super.x();
      }
   }

   @Override
   public void a(eg.a $$0, enz $$1) {
      super.a($$0, $$1);
      this.d.b(new acm($$0, $$1.c, $$1.d, $$1.e));
   }

   public void a(eg.a $$0, bnq $$1, eg.a $$2) {
      enz $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.d.b(new acm($$0, $$1, $$2));
   }

   public void a(aox $$0, boolean $$1) {
      this.dh = $$0.dh;
      this.dk = $$0.dk;
      this.f.a($$0.f.b(), $$0.f.c());
      this.y();
      if ($$1) {
         this.fT().a($$0.fT());
         this.t($$0.ew());
         this.bX = $$0.bX;
         this.cj = $$0.cj;
         this.ck = $$0.ck;
         this.cl = $$0.cl;
         this.s($$0.fN());
         this.aw = $$0.aw;
      } else if (this.dM().Z().b(cvn.d) || $$0.P_()) {
         this.fT().a($$0.fT());
         this.cj = $$0.cj;
         this.ck = $$0.ck;
         this.cl = $$0.cl;
         this.s($$0.fN());
      }

      this.cm = $$0.cm;
      this.bU = $$0.bU;
      this.an().b(bQ, $$0.an().b(bQ));
      this.cH = -1;
      this.cE = -1.0F;
      this.cF = -1;
      this.cP.a($$0.cP);
      this.cO = $$0.cO;
      this.cW = $$0.cW;
      this.cZ = $$0.cZ;
      this.i($$0.gk());
      this.j($$0.gl());
      this.a($$0.gs());
   }

   @Override
   protected void a(bnd $$0, @Nullable bnq $$1) {
      super.a($$0, $$1);
      this.d.b(new ael(this.aj(), $$0, true));
      if ($$0.a(bnf.y)) {
         this.cR = this.ag;
         this.cQ = this.dk();
      }

      am.B.a(this, $$1);
   }

   @Override
   protected void a(bnd $$0, boolean $$1, @Nullable bnq $$2) {
      super.a($$0, $$1, $$2);
      this.d.b(new ael(this.aj(), $$0, false));
      am.B.a(this, $$2);
   }

   @Override
   protected void a(bnd $$0) {
      super.a($$0);
      this.d.b(new acq(this.aj(), $$0.b()));
      if ($$0.a(bnf.y)) {
         this.cQ = null;
      }

      am.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.d.a($$0, $$1, $$2, this.dC(), this.dE(), bov.g);
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.d.a(this.dr() + $$0, this.dt() + $$1, this.dx() + $$2, this.dC(), this.dE(), bov.f);
   }

   @Override
   public boolean a(aow $$0, double $$1, double $$2, double $$3, Set<bov> $$4, float $$5, float $$6) {
      cuy $$7 = new cuy(hz.a($$1, $$2, $$3));
      $$0.l().a(apb.g, $$7, 1, this.aj());
      this.ac();
      if (this.fD()) {
         this.a(true, true);
      }

      if ($$0 == this.dM()) {
         this.d.a($$1, $$2, $$3, $$5, $$6, $$4);
      } else {
         this.a($$0, $$1, $$2, $$3, $$5, $$6);
      }

      this.n($$5);
      return true;
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      super.e($$0, $$1, $$2);
      this.d.m();
   }

   @Override
   public void a(bnq $$0) {
      this.z().l().a(this, new aaj($$0, 4));
   }

   @Override
   public void b(bnq $$0) {
      this.z().l().a(this, new aaj($$0, 5));
   }

   @Override
   public void y() {
      if (this.d != null) {
         this.d.b(new acf(this.fU()));
         this.J();
      }
   }

   public aow z() {
      return (aow)this.dM();
   }

   public boolean a(cvo $$0) {
      if (!this.f.a($$0)) {
         return false;
      } else {
         this.d.b(new abm(abm.e, (float)$$0.a()));
         if ($$0 == cvo.d) {
            this.gh();
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
      return this.f.b() == cvo.d;
   }

   @Override
   public boolean f() {
      return this.f.b() == cvo.b;
   }

   @Override
   public void a(vq $$0) {
      this.b($$0, false);
   }

   public void b(vq $$0, boolean $$1) {
      if (this.u($$1)) {
         this.d.a(new aec($$0, $$1), ux.a(() -> {
            if (this.u(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               vq $$3 = vq.b($$2).a(n.o);
               return new aec(vq.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(wf $$0, boolean $$1, vm.a $$2) {
      if (this.gz()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String A() {
      return this.d.n() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(aol $$0) {
      this.cU = $$0.b();
      this.cT = $$0.c();
      this.cJ = $$0.d();
      this.cK = $$0.e();
      this.df = $$0.h();
      this.dg = $$0.i();
      this.an().b(bQ, (byte)$$0.f());
      this.an().b(bR, (byte)$$0.g().a());
   }

   public aol B() {
      int $$0 = this.an().b(bQ);
      boc $$1 = boc.d.apply(this.an().b(bR));
      return new aol(this.cU, this.cT, this.cJ, this.cK, $$0, $$1, this.df, this.dg);
   }

   public boolean C() {
      return this.cK;
   }

   public chj D() {
      return this.cJ;
   }

   private boolean u(boolean $$0) {
      return this.cJ == chj.c ? $$0 : true;
   }

   private boolean gz() {
      return this.cJ == chj.a;
   }

   public int E() {
      return this.cT;
   }

   public void a(ahy $$0) {
      this.d.b(new acw($$0.a(), $$0.d().map(ahy.a::a)));
   }

   @Override
   protected int F() {
      return this.e.c(this.fS());
   }

   public void G() {
      this.cL = ac.b();
   }

   public atr H() {
      return this.cx;
   }

   public atq I() {
      return this.cP;
   }

   @Override
   protected void J() {
      if (this.P_()) {
         this.er();
         this.j(true);
      } else {
         super.J();
      }
   }

   public bnq K() {
      return (bnq)(this.cM == null ? this : this.cM);
   }

   @Override
   public void c(@Nullable bnq $$0) {
      bnq $$1 = this.K();
      this.cM = (bnq)($$0 == null ? this : $$0);
      if ($$1 != this.cM) {
         if (this.cM.dM() instanceof aow $$2) {
            this.a($$2, this.cM.dr(), this.cM.dt(), this.cM.dx(), Set.of(), this.dC(), this.dE());
         }

         if ($$0 != null) {
            this.z().l().a(this);
         }

         this.d.b(new add(this.cM));
         this.d.m();
      }
   }

   @Override
   protected void L() {
      if (!this.cN) {
         super.L();
      }
   }

   @Override
   public void d(bnq $$0) {
      if (this.f.b() == cvo.d) {
         this.c($$0);
      } else {
         super.d($$0);
      }
   }

   public long M() {
      return this.cL;
   }

   @Nullable
   public vq N() {
      return null;
   }

   @Override
   public void a(blv $$0) {
      super.a($$0);
      this.gn();
   }

   public boolean O() {
      return this.cN;
   }

   public void P() {
      this.cN = false;
   }

   public ajg Q() {
      return this.cw;
   }

   public void a(aow $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      this.c(this);
      this.ac();
      if ($$0 == this.dM()) {
         this.d.a($$1, $$2, $$3, $$4, $$5);
      } else {
         aow $$6 = this.z();
         eio $$7 = $$0.B_();
         this.d.b(new acs(this.d($$0), (byte)3));
         this.d.b(new aat($$7.q(), $$7.r()));
         this.e.ag().d(this);
         $$6.a(this, bnq.c.e);
         this.dJ();
         this.b($$1, $$2, $$3, $$4, $$5);
         this.c($$0);
         $$0.a(this);
         this.f($$6);
         this.d.a($$1, $$2, $$3, $$4, $$5);
         this.e.ag().a(this, $$0);
         this.e.ag().e(this);
      }
   }

   @Nullable
   public hz R() {
      return this.db;
   }

   public float S() {
      return this.dd;
   }

   public aix<cvr> T() {
      return this.da;
   }

   public boolean U() {
      return this.dc;
   }

   public void a(aix<cvr> $$0, @Nullable hz $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.db) && $$0.equals(this.da);
         if ($$4 && !$$5) {
            this.a(vq.c("block.minecraft.set_spawn"));
         }

         this.db = $$1;
         this.da = $$0;
         this.dd = $$2;
         this.dc = $$3;
      } else {
         this.db = null;
         this.da = cvr.h;
         this.dd = 0.0F;
         this.dc = false;
      }
   }

   public jb V() {
      return this.cY;
   }

   public void a(jb $$0) {
      this.cY = $$0;
   }

   public aok W() {
      return this.cZ;
   }

   public void a(aok $$0) {
      this.cZ = $$0;
   }

   @Override
   public void a(atk $$0, atm $$1, float $$2, float $$3) {
      this.d.b(new adz(kf.b.e($$0), $$1, this.dr(), this.dt(), this.dx(), $$2, $$3, this.af.g()));
   }

   @Override
   public cdw a(cpd $$0, boolean $$1, boolean $$2) {
      cdw $$3 = super.a($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dM().b($$3);
         cpd $$4 = $$3.q();
         if ($$2) {
            if (!$$4.b()) {
               this.a(atv.f.b($$4.d()), $$0.M());
            }

            this.a(atv.F);
         }

         return $$3;
      }
   }

   public aqa X() {
      return this.de;
   }

   public void c(aow $$0) {
      this.a((cvr)$$0);
      this.f.a($$0);
   }

   @Nullable
   private static cvo a(@Nullable sw $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? cvo.a($$0.h($$1)) : null;
   }

   private cvo b(@Nullable cvo $$0) {
      cvo $$1 = this.e.bd();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.e.v_();
      }
   }

   @Override
   public void c(@Nullable sw $$0) {
      this.f.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void k(sw $$0) {
      $$0.a("playerGameType", this.f.b().a());
      cvo $$1 = this.f.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean Y() {
      return this.df;
   }

   public boolean b(aox $$0) {
      return $$0 == this ? false : this.df || $$0.df;
   }

   @Override
   public boolean a(cvr $$0, hz $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cpd $$0) {
      am.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      chk $$1 = this.fT();
      cpd $$2 = $$1.a($$0);
      this.bW.b($$1, $$1.l).ifPresent($$1x -> this.bW.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean Z() {
      return this.dg;
   }

   @Override
   public Optional<cgr> aa() {
      return Optional.of(this.dh);
   }

   @Override
   public void a(cdw $$0) {
      super.a($$0);
      bnq $$1 = $$0.w();
      if ($$1 != null) {
         am.S.a(this, $$0.q(), $$1);
      }
   }

   public void a(wh $$0) {
      this.dk = $$0;
   }

   @Nullable
   public wh ab() {
      return this.dk != null && this.dk.b() ? null : this.dk;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cp = (float)(awi.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dC());
      this.d.b(new abo(this));
   }

   @Override
   public boolean a(bnq $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         $$0.i(this);
         this.d.a(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
         if ($$0 instanceof boi $$2) {
            for (bnd $$3 : $$2.et()) {
               this.d.b(new ael($$0.aj(), $$3, false));
            }
         }

         return true;
      }
   }

   @Override
   public void ac() {
      bnq $$0 = this.cZ();
      super.ac();
      if ($$0 instanceof boi $$1) {
         for (bnd $$2 : $$1.et()) {
            this.d.b(new acq($$0.aj(), $$2.b()));
         }
      }
   }

   public aen d(aow $$0) {
      return new aen($$0.ac(), $$0.ad(), cws.a($$0.C()), this.f.b(), this.f.c(), $$0.ag(), $$0.B(), this.gs(), this.av());
   }
}
