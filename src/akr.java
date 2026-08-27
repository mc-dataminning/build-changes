import com.google.common.collect.Lists;
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
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class akr extends cbu {
   private static final Logger b = LogUtils.getLogger();
   private static final int cm = 32;
   private static final int cn = 10;
   public alp c;
   public final MinecraftServer d;
   public final aks e;
   private final afe co;
   private final apj cp;
   private float cq = Float.MIN_VALUE;
   private int cr = Integer.MIN_VALUE;
   private int cs = Integer.MIN_VALUE;
   private int ct = Integer.MIN_VALUE;
   private int cu = Integer.MIN_VALUE;
   private int cv = Integer.MIN_VALUE;
   private float cw = -1.0E8F;
   private int cx = -99999999;
   private boolean cy = true;
   private int cz = -99999999;
   private int cA = 60;
   private cbs cB = cbs.a;
   private boolean cC = true;
   private long cD = ac.b();
   @Nullable
   private biq cE;
   private boolean cF;
   private boolean cG;
   private final api cH = new api();
   @Nullable
   private ehn cI;
   private int cJ;
   private boolean cK;
   private int cL = 2;
   private String cM = "en_us";
   @Nullable
   private ehn cN;
   @Nullable
   private ehn cO;
   @Nullable
   private ehn cP;
   private hw cQ = hw.a(0, 0, 0);
   private ake cR = ake.a;
   private aev<cpv> cS = cpv.h;
   @Nullable
   private gw cT;
   private boolean cU;
   private float cV;
   private final alu cW;
   private boolean cX;
   private boolean cY;
   private cba cZ = new cba(0, 0, 0);
   private final cey da = new cey() {
      @Override
      public void a(cel $$0, hn<cjf> $$1, cjf $$2, int[] $$3) {
         akr.this.c.b(new xq($$0.j, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cel $$0, int $$1, cjf $$2) {
         akr.this.c.b(new xs($$0.j, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cel $$0, cjf $$1) {
         akr.this.c.b(new xs(-1, $$0.k(), -1, $$1));
      }

      @Override
      public void a(cel $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cel $$0, int $$1, int $$2) {
         akr.this.c.b(new xr($$0.j, $$1, $$2));
      }
   };
   private final cex db = new cex() {
      @Override
      public void a(cel $$0, int $$1, cjf $$2) {
         cgd $$3 = $$0.b($$1);
         if (!($$3 instanceof cfz)) {
            if ($$3.d == akr.this.fR()) {
               al.e.a(akr.this, akr.this.fR(), $$2);
            }
         }
      }

      @Override
      public void a(cel $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private ub dc;
   private int dd;
   public boolean f;

   public akr(MinecraftServer $$0, akq $$1, GameProfile $$2, akf $$3) {
      super($$1, $$1.R(), $$1.S(), $$2);
      this.cW = $$0.a(this);
      this.e = $$0.b(this);
      this.d = $$0;
      this.cp = $$0.ac().a((cbu)this);
      this.co = $$0.ac().f(this);
      this.t(1.0F);
      this.e($$1);
      this.a($$3);
   }

   private void e(akq $$0) {
      gw $$1 = $$0.R();
      if ($$0.C_().g() && $$0.n().aT().m() != cps.c) {
         int $$2 = Math.max(0, this.d.a($$0));
         int $$3 = arw.a($$0.B_().b((double)$$1.u(), (double)$$1.w()));
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
         int $$8 = asc.a().a($$6);

         for (int $$9 = 0; $$9 < $$6; $$9++) {
            int $$10 = ($$8 + $$7 * $$9) % $$6;
            int $$11 = $$10 % ($$2 * 2 + 1);
            int $$12 = $$10 / ($$2 * 2 + 1);
            gw $$13 = akl.a($$0, $$1.u() + $$11 - $$2, $$1.w() + $$12 - $$2);
            if ($$13 != null) {
               this.a($$13, 0.0F, 0.0F);
               if ($$0.g(this)) {
                  break;
               }
            }
         }
      } else {
         this.a($$1, 0.0F, 0.0F);

         while (!$$0.g(this) && this.ds() < (double)($$0.aj() - 1)) {
            this.e(this.dq(), this.ds() + 1.0, this.dw());
         }
      }
   }

   private int u(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         cba.a.parse(new Dynamic(ri.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(b::error).ifPresent($$0x -> this.cZ = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         qw $$1 = $$0.p("enteredNetherPosition");
         this.cO = new ehn($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.cG = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cH.a($$0.p("recipeBook"), this.d.aE());
      }

      if (this.fC()) {
         this.fD();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.cT = new gw($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.cU = $$0.q("SpawnForced");
         this.cV = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.cS = cpv.g.parse(ri.a, $$0.c("SpawnDimension")).resultOrPartial(b::error).orElse(cpv.h);
         }
      }
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      cba.a.encodeStart(ri.a, this.cZ).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.cG);
      if (this.cO != null) {
         qw $$1 = new qw();
         $$1.a("x", this.cO.c);
         $$1.a("y", this.cO.d);
         $$1.a("z", this.cO.e);
         $$0.a("enteredNetherPosition", $$1);
      }

      biq $$2 = this.cV();
      biq $$3 = this.cY();
      if ($$3 != null && $$2 != this && $$2.cU()) {
         qw $$4 = new qw();
         qw $$5 = new qw();
         $$2.e($$5);
         $$4.a("Attach", $$3.cv());
         $$4.a("Entity", $$5);
         $$0.a("RootVehicle", $$4);
      }

      $$0.a("recipeBook", this.cH.b());
      $$0.a("Dimension", this.dL().ac().a().toString());
      if (this.cT != null) {
         $$0.a("SpawnX", this.cT.u());
         $$0.a("SpawnY", this.cT.v());
         $$0.a("SpawnZ", this.cT.w());
         $$0.a("SpawnForced", this.cU);
         $$0.a("SpawnAngle", this.cV);
         aew.a.encodeStart(ri.a, this.cS.a()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.ga();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.ch = arw.a((float)$$0 / $$1, 0.0F, $$2);
      this.cz = -1;
   }

   public void b(int $$0) {
      this.cf = $$0;
      this.cz = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cz = -1;
   }

   @Override
   public void a(cjf $$0, int $$1) {
      super.a($$0, $$1);
      this.cz = -1;
   }

   private void a(cel $$0) {
      $$0.a(this.db);
      $$0.a(this.da);
   }

   public void h() {
      this.a(this.bR);
   }

   @Override
   public void e_() {
      super.e_();
      this.c.b(new yx());
   }

   @Override
   public void f_() {
      super.f_();
      this.c.b(new yw(this.eJ()));
   }

   @Override
   protected void a(dfj $$0) {
      al.d.a(this, $$0);
   }

   @Override
   protected cjb k() {
      return new cka(this);
   }

   @Override
   public void l() {
      this.e.a();
      this.cZ.a();
      this.cA--;
      if (this.al > 0) {
         this.al--;
      }

      this.bS.d();
      if (!this.dL().B && !this.bS.a(this)) {
         this.q();
         this.bS = this.bR;
      }

      biq $$0 = this.I();
      if ($$0 != this) {
         if ($$0.bv()) {
            this.a($$0.dq(), $$0.ds(), $$0.dw(), $$0.dB(), $$0.dD());
            this.x().k().a(this);
            if (this.fI()) {
               this.c(this);
            }
         } else {
            this.c(this);
         }
      }

      al.w.a(this);
      if (this.cI != null) {
         al.u.a(this, this.cI, this.ah - this.cJ);
      }

      this.o();
      this.p();
      this.co.b(this);
   }

   public void m() {
      try {
         if (!this.M_() || !this.dd()) {
            super.l();
         }

         for (int $$0 = 0; $$0 < this.fR().b(); $$0++) {
            cjf $$1 = this.fR().a($$0);
            if ($$1.d().ah_()) {
               vd<?> $$2 = ((chk)$$1.d()).a($$1, this.dL(), this);
               if ($$2 != null) {
                  this.c.b($$2);
               }
            }
         }

         if (this.eu() != this.cw || this.cx != this.bT.a() || this.bT.e() == 0.0F != this.cy) {
            this.c.b(new aac(this.eu(), this.bT.a(), this.bT.e()));
            this.cw = this.eu();
            this.cx = this.bT.a();
            this.cy = this.bT.e() == 0.0F;
         }

         if (this.eu() + this.fj() != this.cq) {
            this.cq = this.eu() + this.fj();
            this.a(eip.f, arw.f(this.cq));
         }

         if (this.bT.a() != this.cr) {
            this.cr = this.bT.a();
            this.a(eip.g, arw.f((float)this.cr));
         }

         if (this.ch() != this.cs) {
            this.cs = this.ch();
            this.a(eip.h, arw.f((float)this.cs));
         }

         if (this.eI() != this.ct) {
            this.ct = this.eI();
            this.a(eip.i, arw.f((float)this.ct));
         }

         if (this.cg != this.cv) {
            this.cv = this.cg;
            this.a(eip.j, arw.f((float)this.cv));
         }

         if (this.cf != this.cu) {
            this.cu = this.cf;
            this.a(eip.k, arw.f((float)this.cu));
         }

         if (this.cg != this.cz) {
            this.cz = this.cg;
            this.c.b(new aab(this.ch, this.cg, this.cf));
         }

         if (this.ah % 20 == 0) {
            al.p.a(this);
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
      if (this.eu() > 0.0F && this.cN != null) {
         al.U.a(this, this.cN);
      }

      this.cN = null;
      super.n();
   }

   public void o() {
      if (this.ab > 0.0F && this.cN == null) {
         this.cN = this.dj();
      }
   }

   public void p() {
      if (this.cY() != null && this.cY().bl()) {
         if (this.cP == null) {
            this.cP = this.dj();
         } else {
            al.V.a(this, this.cP);
         }
      }

      if (this.cP != null && (this.cY() == null || !this.cY().bl())) {
         this.cP = null;
      }
   }

   private void a(eip $$0, int $$1) {
      this.gg().a($$0, this.cx(), $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(bho $$0) {
      this.a(djt.p);
      boolean $$1 = this.dL().X().b(cpr.m);
      if ($$1) {
         tl $$2 = this.eJ().a();
         this.c.a(new yy(this.ah(), $$2), sv.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            tl $$3x = tl.a("death.attack.message_too_long", tl.b($$2x).a(n.o));
            tl $$4x = tl.a("death.attack.even_more_magic", this.N_()).a($$1xx -> $$1xx.a(new tq(tq.a.a, $$3x)));
            return new yy(this.ah(), $$4x);
         }));
         eio $$3 = this.cf();
         if ($$3 == null || $$3.k() == eio.b.a) {
            this.d.ac().a($$2, false);
         } else if ($$3.k() == eio.b.c) {
            this.d.ac().a(this, $$2);
         } else if ($$3.k() == eio.b.d) {
            this.d.ac().b(this, $$2);
         }
      } else {
         this.c.b(new yy(this.ah(), tk.a));
      }

      this.gf();
      if (this.dL().X().b(cpr.J)) {
         this.gr();
      }

      if (!this.M_()) {
         this.g($$0);
      }

      this.gg().a(eip.c, this.cx(), eil::a);
      bjg $$4 = this.eK();
      if ($$4 != null) {
         this.b(apn.h.b($$4.ag()));
         $$4.a(this, this.bh, $$0);
         this.f($$4);
      }

      this.dL().a(this, (byte)3);
      this.a(apn.N);
      this.a(apn.i.b(apn.m));
      this.a(apn.i.b(apn.n));
      this.ay();
      this.k(0);
      this.a_(false);
      this.eJ().c();
      this.a(Optional.of(hd.a(this.dL().ac(), this.dl())));
   }

   private void gr() {
      ehi $$0 = new ehi(this.dl()).c(32.0, 10.0, 32.0);
      this.dL().a(bji.class, $$0, bit.f).stream().filter($$0x -> $$0x instanceof bjn).forEach($$0x -> ((bjn)$$0x).a_((cbu)this));
   }

   @Override
   public void a(biq $$0, int $$1, bho $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.s($$1);
         String $$3 = this.cx();
         String $$4 = $$0.cx();
         this.gg().a(eip.e, $$3, eil::a);
         if ($$0 instanceof cbu) {
            this.a(apn.Q);
            this.gg().a(eip.d, $$3, eil::a);
         } else {
            this.a(apn.O);
         }

         this.a($$3, $$4, eip.l);
         this.a($$4, $$3, eip.m);
         al.b.a(this, $$0, $$2);
      }
   }

   private void a(String $$0, String $$1, eip[] $$2) {
      eik $$3 = this.gg().g($$1);
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gg().a($$2[$$4], $$0, eil::a);
         }
      }
   }

   @Override
   public boolean a(bho $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.d.l() && this.gs() && $$0.a(apu.m);
         if (!$$2 && this.cA > 0 && !$$0.a(apu.d)) {
            return false;
         } else {
            biq $$3 = $$0.d();
            if ($$3 instanceof cbu $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof cca $$5 && $$5.v() instanceof cbu $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(cbu $$0) {
      return !this.gs() ? false : super.a($$0);
   }

   private boolean gs() {
      return this.d.Y();
   }

   @Nullable
   @Override
   protected ebj a(akq $$0) {
      ebj $$1 = super.a($$0);
      if ($$1 != null && this.dL().ac() == cpv.h && $$0.ac() == cpv.j) {
         ehn $$2 = $$1.a.b(0.0, -1.0, 0.0);
         return new ebj($$2, ehn.b, 90.0F, 0.0F);
      } else {
         return $$1;
      }
   }

   @Nullable
   @Override
   public biq b(akq $$0) {
      this.cF = true;
      akq $$1 = this.x();
      aev<cpv> $$2 = $$1.ac();
      if ($$2 == cpv.j && $$0.ac() == cpv.h) {
         this.ae();
         this.x().a(this, biq.c.e);
         if (!this.f) {
            this.f = true;
            this.c.b(new yb(yb.e, this.cG ? 0.0F : 1.0F));
            this.cG = true;
         }

         return this;
      } else {
         ecd $$3 = $$0.z_();
         this.c.b(new zg(this.d($$0), (byte)3));
         this.c.b(new xi($$3.s(), $$3.t()));
         aog $$4 = this.d.ac();
         $$4.d(this);
         $$1.a(this, biq.c.e);
         this.dI();
         ebj $$5 = this.a($$0);
         if ($$5 != null) {
            $$1.ad().a("moving");
            if ($$2 == cpv.h && $$0.ac() == cpv.i) {
               this.cO = this.dj();
            } else if ($$0.ac() == cpv.j) {
               this.a($$0, gw.a($$5.a));
            }

            $$1.ad().c();
            $$1.ad().a("placing");
            this.c($$0);
            this.c.a($$5.a.c, $$5.a.d, $$5.a.e, $$5.c, $$5.d);
            this.c.m();
            $$0.b(this);
            $$1.ad().c();
            this.f($$1);
            this.c.b(new yu(this.fS()));
            $$4.a(this, $$0);
            $$4.e(this);

            for (bid $$6 : this.er()) {
               this.c.b(new aax(this.ah(), $$6));
            }

            this.c.b(new yh(1032, gw.b, 0, false));
            this.cz = -1;
            this.cw = -1.0F;
            this.cx = -1;
         }

         return this;
      }
   }

   private void a(akq $$0, gw $$1) {
      gw.a $$2 = $$1.j();

      for (int $$3 = -2; $$3 <= 2; $$3++) {
         for (int $$4 = -2; $$4 <= 2; $$4++) {
            for (int $$5 = -1; $$5 < 3; $$5++) {
               dfj $$6 = $$5 == -1 ? csw.co.n() : csw.a.n();
               $$0.b($$2.g($$1).e($$4, $$5, $$3), $$6);
            }
         }
      }
   }

   @Override
   protected Optional<l.a> a(akq $$0, gw $$1, boolean $$2, dha $$3) {
      Optional<l.a> $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         ha.a $$5 = this.dL().a_(this.ax).d(cxx.a).orElse(ha.a.a);
         Optional<l.a> $$6 = $$0.o().a($$1, $$5);
         if ($$6.isEmpty()) {
            b.error("Unable to create a portal, likely target out of worldborder");
         }

         return $$6;
      }
   }

   private void f(akq $$0) {
      aev<cpv> $$1 = $$0.ac();
      aev<cpv> $$2 = this.dL().ac();
      al.v.a(this, $$1, $$2);
      if ($$1 == cpv.i && $$2 == cpv.h && this.cO != null) {
         al.C.a(this, this.cO);
      }

      if ($$2 != cpv.i) {
         this.cO = null;
      }
   }

   @Override
   public boolean a(akr $$0) {
      if ($$0.M_()) {
         return this.I() == this;
      } else {
         return this.M_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(biq $$0, int $$1) {
      super.a($$0, $$1);
      this.bS.d();
   }

   @Override
   public Either<cbu.a, asx> a(gw $$0) {
      ha $$1 = this.dL().a_($$0).c(cwo.aC);
      if (this.fC() || !this.bv()) {
         return Either.left(cbu.a.e);
      } else if (!this.dL().C_().j()) {
         return Either.left(cbu.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cbu.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cbu.a.d);
      } else {
         this.a(this.dL().ac(), $$0, this.dB(), false, true);
         if (this.dL().N()) {
            return Either.left(cbu.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               ehn $$4 = ehn.c($$0);
               List<bzi> $$5 = this.dL()
                  .a(bzi.class, new ehi($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.f(this));
               if (!$$5.isEmpty()) {
                  return Either.left(cbu.a.f);
               }
            }

            Either<cbu.a, asx> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(apn.ap);
               al.q.a(this);
            });
            if (!this.x().d()) {
               this.a(tl.c("sleep.not_possible"), true);
            }

            ((akq)this.dL()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(gw $$0) {
      this.a(apn.i.b(apn.n));
      super.b($$0);
   }

   private boolean a(gw $$0, ha $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(gw $$0) {
      ehn $$1 = ehn.c($$0);
      return Math.abs(this.dq() - $$1.a()) <= 3.0 && Math.abs(this.ds() - $$1.b()) <= 2.0 && Math.abs(this.dw() - $$1.c()) <= 3.0;
   }

   private boolean b(gw $$0, ha $$1) {
      gw $$2 = $$0.c();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fC()) {
         this.x().k().a(this, new wz(this, 2));
      }

      super.a($$0, $$1);
      if (this.c != null) {
         this.c.a(this.dq(), this.ds(), this.dw(), this.dB(), this.dD());
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.bB();
      this.e($$0, $$1, $$2);
   }

   @Override
   public boolean b(bho $$0) {
      return super.b($$0) || this.M();
   }

   @Override
   protected void a(double $$0, boolean $$1, dfj $$2, gw $$3) {
   }

   @Override
   protected void c(gw $$0) {
      if (!this.M_()) {
         super.c($$0);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.dd()) {
         this.b($$3, new ehn($$0, $$1, $$2));
         gw $$4 = this.aF();
         super.a($$1, $$3, this.dL().a_($$4), $$4);
      }
   }

   @Override
   public void a(ded $$0, boolean $$1) {
      this.c.b(new xf(this.dL(), $$0.p()));
      this.c.b(new ys($$0.p(), $$1));
   }

   private void gt() {
      this.dd = this.dd % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bhb $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.bS != this.bR) {
            this.q();
         }

         this.gt();
         cel $$1 = $$0.createMenu(this.dd, this.fR(), this);
         if ($$1 == null) {
            if (this.M_()) {
               this.a(tl.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.c.b(new yr($$1.j, $$1.a(), $$0.N_()));
            this.a($$1);
            this.bS = $$1;
            return OptionalInt.of(this.dd);
         }
      }
   }

   @Override
   public void a(int $$0, cou $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.c.b(new yn($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(bwq $$0, bgr $$1) {
      if (this.bS != this.bR) {
         this.q();
      }

      this.gt();
      this.c.b(new yc(this.dd, $$1.b(), $$0.ah()));
      this.bS = new cfj(this.dd, this.fR(), $$1, $$0);
      this.a(this.bS);
   }

   @Override
   public void a(cjf $$0, bgx $$1) {
      if ($$0.a(cji.th)) {
         if (clb.a($$0, this.dc(), this)) {
            this.bS.d();
         }

         this.c.b(new yq($$1));
      }
   }

   @Override
   public void a(ddf $$0) {
      this.c.b(xd.a($$0, dcv::o));
   }

   @Override
   public void q() {
      this.c.b(new xp(this.bS.j));
      this.r();
   }

   @Override
   public void r() {
      this.bS.b(this);
      this.bR.a(this.bS);
      this.bS = this.bR;
   }

   public void a(float $$0, float $$1, boolean $$2, boolean $$3) {
      if (this.bN()) {
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
   public void a(apk<?> $$0, int $$1) {
      this.cp.b(this, $$0, $$1);
      this.gg().a($$0, this.cx(), $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(apk<?> $$0) {
      this.cp.a(this, $$0, 0);
      this.gg().a($$0, this.cx(), eil::c);
   }

   @Override
   public int a(Collection<cmk<?>> $$0) {
      return this.cH.a($$0, this);
   }

   @Override
   public void a(cmk<?> $$0, List<cjf> $$1) {
      al.Z.a(this, $$0.a(), $$1);
   }

   @Override
   public void a(aew[] $$0) {
      List<cmk<?>> $$1 = Lists.newArrayList();

      for (aew $$2 : $$0) {
         this.d.aE().a($$2).ifPresent($$1::add);
      }

      this.a($$1);
   }

   @Override
   public int b(Collection<cmk<?>> $$0) {
      return this.cH.b($$0, this);
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cz = -1;
   }

   @Override
   public void s() {
      this.cK = true;
      this.bA();
      if (this.fC()) {
         this.a(true, false);
      }
   }

   public boolean t() {
      return this.cK;
   }

   public void u() {
      this.cw = -1.0E8F;
   }

   @Override
   public void a(tl $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void ad_() {
      if (!this.bv.b() && this.fm()) {
         this.c.b(new xy(this, (byte)9));
         super.ad_();
      }
   }

   @Override
   public void a(ed.a $$0, ehn $$1) {
      super.a($$0, $$1);
      this.c.b(new zb($$0, $$1.c, $$1.d, $$1.e));
   }

   public void a(ed.a $$0, biq $$1, ed.a $$2) {
      ehn $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.c.b(new zb($$0, $$1, $$2));
   }

   public void a(akr $$0, boolean $$1) {
      this.cZ = $$0.cZ;
      this.dc = $$0.dc;
      this.e.a($$0.e.b(), $$0.e.c());
      this.w();
      if ($$1) {
         this.fR().a($$0.fR());
         this.c($$0.eu());
         this.bT = $$0.bT;
         this.cf = $$0.cf;
         this.cg = $$0.cg;
         this.ch = $$0.ch;
         this.r($$0.fM());
         this.ax = $$0.ax;
      } else if (this.dL().X().b(cpr.d) || $$0.M_()) {
         this.fR().a($$0.fR());
         this.cf = $$0.cf;
         this.cg = $$0.cg;
         this.ch = $$0.ch;
         this.r($$0.fM());
      }

      this.ci = $$0.ci;
      this.bQ = $$0.bQ;
      this.al().b(bM, $$0.al().b(bM));
      this.cz = -1;
      this.cw = -1.0F;
      this.cx = -1;
      this.cH.a($$0.cH);
      this.cG = $$0.cG;
      this.cO = $$0.cO;
      this.cR = $$0.cR;
      this.i($$0.gi());
      this.j($$0.gj());
      this.a($$0.gq());
   }

   @Override
   protected void a(bid $$0, @Nullable biq $$1) {
      super.a($$0, $$1);
      this.c.b(new aax(this.ah(), $$0));
      if ($$0.c() == bif.y) {
         this.cJ = this.ah;
         this.cI = this.dj();
      }

      al.A.a(this, $$1);
   }

   @Override
   protected void a(bid $$0, boolean $$1, @Nullable biq $$2) {
      super.a($$0, $$1, $$2);
      this.c.b(new aax(this.ah(), $$0));
      al.A.a(this, $$2);
   }

   @Override
   protected void a(bid $$0) {
      super.a($$0);
      this.c.b(new zf(this.ah(), $$0.c()));
      if ($$0.c() == bif.y) {
         this.cI = null;
      }

      al.A.a(this, null);
   }

   @Override
   public void b(double $$0, double $$1, double $$2) {
      this.c.a($$0, $$1, $$2, this.dB(), this.dD(), bju.g);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.c.a(this.dq() + $$0, this.ds() + $$1, this.dw() + $$2, this.dB(), this.dD(), bju.f);
   }

   @Override
   public boolean a(akq $$0, double $$1, double $$2, double $$3, Set<bju> $$4, float $$5, float $$6) {
      cpc $$7 = new cpc(gw.a($$1, $$2, $$3));
      $$0.k().a(akv.g, $$7, 1, this.ah());
      this.aa();
      if (this.fC()) {
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
   public void d(double $$0, double $$1, double $$2) {
      super.d($$0, $$1, $$2);
      this.c.m();
   }

   @Override
   public void a(biq $$0) {
      this.x().k().a(this, new wz($$0, 4));
   }

   @Override
   public void b(biq $$0) {
      this.x().k().a(this, new wz($$0, 5));
   }

   @Override
   public void w() {
      if (this.c != null) {
         this.c.b(new yu(this.fS()));
         this.H();
      }
   }

   public akq x() {
      return (akq)this.dL();
   }

   public boolean a(cps $$0) {
      if (!this.e.a($$0)) {
         return false;
      } else {
         this.c.b(new yb(yb.d, (float)$$0.a()));
         if ($$0 == cps.d) {
            this.gf();
            this.aa();
         } else {
            this.c(this);
         }

         this.w();
         this.fk();
         return true;
      }
   }

   @Override
   public boolean M_() {
      return this.e.b() == cps.d;
   }

   @Override
   public boolean f() {
      return this.e.b() == cps.b;
   }

   @Override
   public void a(tl $$0) {
      this.b($$0, false);
   }

   public void b(tl $$0, boolean $$1) {
      if (this.v($$1)) {
         this.c.a(new aaq($$0, $$1), sv.a(() -> {
            if (this.v(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               tl $$3 = tl.b($$2).a(n.o);
               return new aaq(tl.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(tz $$0, boolean $$1, th.a $$2) {
      if (this.gu()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String y() {
      return this.c.n() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(akf $$0) {
      this.cM = $$0.b();
      this.cL = $$0.c();
      this.cB = $$0.d();
      this.cC = $$0.e();
      this.cX = $$0.h();
      this.cY = $$0.i();
      this.al().b(bM, (byte)$$0.f());
      this.al().b(bN, (byte)$$0.g().a());
   }

   public akf z() {
      int $$0 = this.al().b(bM);
      bja $$1 = bja.d.apply(this.al().b(bN));
      return new akf(this.cM, this.cL, this.cB, this.cC, $$0, $$1, this.cX, this.cY);
   }

   public boolean A() {
      return this.cC;
   }

   public cbs B() {
      return this.cB;
   }

   private boolean v(boolean $$0) {
      return this.cB == cbs.c ? $$0 : true;
   }

   private boolean gu() {
      return this.cB == cbs.a;
   }

   public int C() {
      return this.cL;
   }

   public void a(adz $$0) {
      this.c.b(new zk($$0.a(), $$0.d().map(adz.a::a), $$0.e()));
   }

   @Override
   protected int D() {
      return this.d.c(this.fQ());
   }

   public void E() {
      this.cD = ac.b();
   }

   public apj F() {
      return this.cp;
   }

   public api G() {
      return this.cH;
   }

   @Override
   protected void H() {
      if (this.M_()) {
         this.ep();
         this.j(true);
      } else {
         super.H();
      }
   }

   public biq I() {
      return (biq)(this.cE == null ? this : this.cE);
   }

   @Override
   public void c(@Nullable biq $$0) {
      biq $$1 = this.I();
      this.cE = (biq)($$0 == null ? this : $$0);
      if ($$1 != this.cE) {
         if (this.cE.dL() instanceof akq $$2) {
            this.a($$2, this.cE.dq(), this.cE.ds(), this.cE.dw(), Set.of(), this.dB(), this.dD());
         }

         if ($$0 != null) {
            this.x().k().a(this);
         }

         this.c.b(new zr(this.cE));
         this.c.m();
      }
   }

   @Override
   protected void J() {
      if (!this.cF) {
         super.J();
      }
   }

   @Override
   public void d(biq $$0) {
      if (this.e.b() == cps.d) {
         this.c($$0);
      } else {
         super.d($$0);
      }
   }

   public long K() {
      return this.cD;
   }

   @Nullable
   public tl L() {
      return null;
   }

   @Override
   public void a(bgx $$0) {
      super.a($$0);
      this.gl();
   }

   public boolean M() {
      return this.cF;
   }

   public void N() {
      this.cF = false;
   }

   public afe O() {
      return this.co;
   }

   public void a(akq $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      this.c(this);
      this.aa();
      if ($$0 == this.dL()) {
         this.c.a($$1, $$2, $$3, $$4, $$5);
      } else {
         akq $$6 = this.x();
         ecd $$7 = $$0.z_();
         this.c.b(new zg(this.d($$0), (byte)3));
         this.c.b(new xi($$7.s(), $$7.t()));
         this.d.ac().d(this);
         $$6.a(this, biq.c.e);
         this.dI();
         this.b($$1, $$2, $$3, $$4, $$5);
         this.c($$0);
         $$0.a(this);
         this.f($$6);
         this.c.a($$1, $$2, $$3, $$4, $$5);
         this.d.ac().a(this, $$0);
         this.d.ac().e(this);
      }
   }

   @Nullable
   public gw P() {
      return this.cT;
   }

   public float Q() {
      return this.cV;
   }

   public aev<cpv> R() {
      return this.cS;
   }

   public boolean S() {
      return this.cU;
   }

   public void a(aev<cpv> $$0, @Nullable gw $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.cT) && $$0.equals(this.cS);
         if ($$4 && !$$5) {
            this.a(tl.c("block.minecraft.set_spawn"));
         }

         this.cT = $$1;
         this.cS = $$0;
         this.cV = $$2;
         this.cU = $$3;
      } else {
         this.cT = null;
         this.cS = cpv.h;
         this.cV = 0.0F;
         this.cU = false;
      }
   }

   public hw T() {
      return this.cQ;
   }

   public void a(hw $$0) {
      this.cQ = $$0;
   }

   public ake U() {
      return this.cR;
   }

   public void a(ake $$0) {
      this.cR = $$0;
   }

   @Override
   public void a(apc $$0, ape $$1, float $$2, float $$3) {
      this.c.b(new aan(jb.c.d($$0), $$1, this.dq(), this.ds(), this.dw(), $$2, $$3, this.ag.g()));
   }

   @Override
   public byn a(cjf $$0, boolean $$1, boolean $$2) {
      byn $$3 = super.a($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dL().b($$3);
         cjf $$4 = $$3.q();
         if ($$2) {
            if (!$$4.b()) {
               this.a(apn.f.b($$4.d()), $$0.L());
            }

            this.a(apn.F);
         }

         return $$3;
      }
   }

   public alu V() {
      return this.cW;
   }

   public void c(akq $$0) {
      this.a((cpv)$$0);
      this.e.a($$0);
   }

   @Nullable
   private static cps a(@Nullable qw $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? cps.a($$0.h($$1)) : null;
   }

   private cps b(@Nullable cps $$0) {
      cps $$1 = this.d.aW();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.d.t_();
      }
   }

   @Override
   public void c(@Nullable qw $$0) {
      this.e.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void k(qw $$0) {
      $$0.a("playerGameType", this.e.b().a());
      cps $$1 = this.e.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean W() {
      return this.cX;
   }

   public boolean b(akr $$0) {
      return $$0 == this ? false : this.cX || $$0.cX;
   }

   @Override
   public boolean a(cpv $$0, gw $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cjf $$0) {
      al.T.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cbt $$1 = this.fR();
      cjf $$2 = $$1.a($$0);
      this.bS.b($$1, $$1.l).ifPresent($$1x -> this.bS.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean X() {
      return this.cY;
   }

   @Override
   public Optional<cba> Y() {
      return Optional.of(this.cZ);
   }

   @Override
   public void a(byn $$0) {
      super.a($$0);
      biq $$1 = $$0.v();
      if ($$1 != null) {
         al.P.a(this, $$0.q(), $$1);
      }
   }

   public void a(ub $$0) {
      this.dc = $$0;
   }

   @Nullable
   public ub Z() {
      return this.dc != null && this.dc.b() ? null : this.dc;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cl = (float)(arw.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dB());
      this.c.b(new yd(this));
   }

   @Override
   public boolean a(biq $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         $$0.i(this);
         this.c.a(this.dq(), this.ds(), this.dw(), this.dB(), this.dD());
         if ($$0 instanceof bjg $$2) {
            for (bid $$3 : $$2.er()) {
               this.c.b(new aax($$0.ah(), $$3));
            }
         }

         return true;
      }
   }

   @Override
   public void aa() {
      biq $$0 = this.cY();
      super.aa();
      if ($$0 instanceof bjg $$1) {
         for (bid $$2 : $$1.er()) {
            this.c.b(new zf($$0.ah(), $$2.c()));
         }
      }
   }

   public aaz d(akq $$0) {
      return new aaz($$0.aa(), $$0.ac(), cqv.a($$0.A()), this.e.b(), this.e.c(), $$0.af(), $$0.z(), this.gq(), this.at());
   }
}
