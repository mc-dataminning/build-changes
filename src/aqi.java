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

public class aqi extends clh {
   private static final Logger b = LogUtils.getLogger();
   private static final int cA = 32;
   private static final int cB = 10;
   private static final int cC = 25;
   public static final double c = 1.0;
   private static final btf cD = new btf(UUID.fromString("736565d2-e1a7-403d-a3f8-1aeb3e302542"), "Creative block interaction range modifier", 0.5, btf.a.a);
   private static final btf cE = new btf(UUID.fromString("98491ef6-97b1-4584-ae82-71a8cc85cf73"), "Creative entity interaction range modifier", 2.0, btf.a.a);
   public arh d;
   public final MinecraftServer e;
   public final aqj f;
   private final akp cF;
   private final avi cG;
   private float cH = Float.MIN_VALUE;
   private int cI = Integer.MIN_VALUE;
   private int cJ = Integer.MIN_VALUE;
   private int cK = Integer.MIN_VALUE;
   private int cL = Integer.MIN_VALUE;
   private int cM = Integer.MIN_VALUE;
   private float cN = -1.0E8F;
   private int cO = -99999999;
   private boolean cP = true;
   private int cQ = -99999999;
   private int cR = 60;
   private clf cS = clf.a;
   private boolean cT = true;
   private long cU = ac.b();
   @Nullable
   private brh cV;
   private boolean cW;
   private boolean cX;
   private final avh cY = new avh();
   @Nullable
   private etp cZ;
   private int da;
   private boolean db;
   private int dc = 2;
   private String dd = "en_us";
   @Nullable
   private etp de;
   @Nullable
   private etp df;
   @Nullable
   private etp dg;
   private jp dh = jp.a(0, 0, 0);
   private apv di = apv.a;
   private akg<dad> dj = dad.h;
   @Nullable
   private in dk;
   private boolean dl;
   private float dm;
   private final arm dn;
   private boolean do;
   private boolean dp;
   private boolean dq;
   private ckn dr = new ckn(0, 0, 0);
   private final cor ds = new cor() {
      @Override
      public void a(cod $$0, jf<csz> $$1, csz $$2, int[] $$3) {
         aqi.this.d.b(new ach($$0.j, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cod $$0, int $$1, csz $$2) {
         aqi.this.d.b(new acj($$0.j, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cod $$0, csz $$1) {
         aqi.this.d.b(new acj(-1, $$0.k(), -1, $$1));
      }

      @Override
      public void a(cod $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cod $$0, int $$1, int $$2) {
         aqi.this.d.b(new aci($$0.j, $$1, $$2));
      }
   };
   private final coq dt = new coq() {
      @Override
      public void a(cod $$0, int $$1, csz $$2) {
         cpz $$3 = $$0.b($$1);
         if (!($$3 instanceof cpv)) {
            if ($$3.d == aqi.this.ga()) {
               am.f.a(aqi.this, aqi.this.ga(), $$2);
            }
         }
      }

      @Override
      public void a(cod $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private xl du;
   @Nullable
   public final Object g;
   private int dv;
   public boolean h;

   public aqi(MinecraftServer $$0, aqh $$1, GameProfile $$2, apw $$3) {
      super($$1, $$1.U(), $$1.V(), $$2);
      this.dn = $$0.a(this);
      this.f = $$0.b(this);
      this.e = $$0;
      this.cG = $$0.ah().a((clh)this);
      this.cF = $$0.ah().f(this);
      this.e($$1);
      this.a($$3);
      this.g = null;
   }

   private void e(aqh $$0) {
      in $$1 = $$0.U();
      if ($$0.D_().g() && $$0.o().bb().k() != daa.c) {
         int $$2 = Math.max(0, this.e.a($$0));
         int $$3 = axz.a($$0.C_().b((double)$$1.u(), (double)$$1.w()));
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
         int $$8 = ayg.a().a($$6);

         for (int $$9 = 0; $$9 < $$6; $$9++) {
            int $$10 = ($$8 + $$7 * $$9) % $$6;
            int $$11 = $$10 % ($$2 * 2 + 1);
            int $$12 = $$10 / ($$2 * 2 + 1);
            in $$13 = aqc.a($$0, $$1.u() + $$11 - $$2, $$1.w() + $$12 - $$2);
            if ($$13 != null) {
               this.a($$13, 0.0F, 0.0F);
               if ($$0.g(this)) {
                  break;
               }
            }
         }
      } else {
         this.a($$1, 0.0F, 0.0F);

         while (!$$0.g(this) && this.du() < (double)($$0.al() - 1)) {
            this.a_(this.ds(), this.du() + 1.0, this.dy());
         }
      }
   }

   private int v(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         ckn.a.parse(new Dynamic(uo.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(b::error).ifPresent($$0x -> this.dr = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         ua $$1 = $$0.p("enteredNetherPosition");
         this.df = new etp($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.cX = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cY.a($$0.p("recipeBook"), this.e.aJ());
      }

      if (this.fJ()) {
         this.fK();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.dk = new in($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.dl = $$0.q("SpawnForced");
         this.dm = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.dj = dad.g.parse(uo.a, $$0.c("SpawnDimension")).resultOrPartial(b::error).orElse(dad.h);
         }
      }

      this.dq = $$0.q("spawn_extra_particles_on_fall");
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      ckn.a.encodeStart(uo.a, this.dr).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.cX);
      if (this.df != null) {
         ua $$1 = new ua();
         $$1.a("x", this.df.c);
         $$1.a("y", this.df.d);
         $$1.a("z", this.df.e);
         $$0.a("enteredNetherPosition", $$1);
      }

      brh $$2 = this.cX();
      brh $$3 = this.da();
      if ($$3 != null && $$2 != this && $$2.cW()) {
         ua $$4 = new ua();
         ua $$5 = new ua();
         $$2.e($$5);
         $$4.a("Attach", $$3.cx());
         $$4.a("Entity", $$5);
         $$0.a("RootVehicle", $$4);
      }

      $$0.a("recipeBook", this.cY.b());
      $$0.a("Dimension", this.dN().ae().a().toString());
      if (this.dk != null) {
         $$0.a("SpawnX", this.dk.u());
         $$0.a("SpawnY", this.dk.v());
         $$0.a("SpawnZ", this.dk.w());
         $$0.a("SpawnForced", this.dl);
         $$0.a("SpawnAngle", this.dm);
         akh.a.encodeStart(uo.a, this.dj.a()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }

      $$0.a("spawn_extra_particles_on_fall", this.dq);
   }

   public void a(int $$0) {
      float $$1 = (float)this.gj();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.cr = axz.a((float)$$0 / $$1, 0.0F, $$2);
      this.cQ = -1;
   }

   public void b(int $$0) {
      this.cp = $$0;
      this.cQ = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cQ = -1;
   }

   @Override
   public void a(csz $$0, int $$1) {
      super.a($$0, $$1);
      this.cQ = -1;
   }

   private void a(cod $$0) {
      $$0.a(this.dt);
      $$0.a(this.ds);
   }

   public void h() {
      this.a(this.cb);
   }

   @Override
   public void f_() {
      super.f_();
      this.d.b(adp.a);
   }

   @Override
   public void g_() {
      super.g_();
      this.d.b(new ado(this.eN()));
   }

   @Override
   protected void a(dqh $$0) {
      am.e.a(this, $$0);
   }

   @Override
   protected csv k() {
      return new ctv(this);
   }

   @Override
   public void l() {
      this.f.a();
      this.dr.a();
      this.cR--;
      if (this.am > 0) {
         this.am--;
      }

      this.cc.d();
      if (!this.dN().B && !this.cc.a(this)) {
         this.r();
         this.cc = this.cb;
      }

      brh $$0 = this.K();
      if ($$0 != this) {
         if ($$0.bB()) {
            this.a($$0.ds(), $$0.du(), $$0.dy(), $$0.dD(), $$0.dF());
            this.z().l().a(this);
            if (this.fQ()) {
               this.d(this);
            }
         } else {
            this.d(this);
         }
      }

      am.x.a(this);
      if (this.cZ != null) {
         am.v.a(this, this.cZ, this.ai - this.da);
      }

      this.o();
      this.p();
      this.gD();
      this.cF.b(this);
   }

   private void gD() {
      btd $$0 = this.f(bth.g);
      if ($$0 != null) {
         if (this.f()) {
            $$0.b(cD);
         } else {
            $$0.e(cD);
         }
      }

      btd $$1 = this.f(bth.h);
      if ($$1 != null) {
         if (this.f()) {
            $$1.b(cE);
         } else {
            $$1.e(cE);
         }
      }
   }

   public void m() {
      try {
         if (!this.N_() || !this.df()) {
            super.l();
         }

         for (int $$0 = 0; $$0 < this.ga().b(); $$0++) {
            csz $$1 = this.ga().a($$0);
            if ($$1.f().aj_()) {
               zb<?> $$2 = ((crj)$$1.f()).a($$1, this.dN(), this);
               if ($$2 != null) {
                  this.d.b($$2);
               }
            }
         }

         if (this.ey() != this.cN || this.cO != this.cd.a() || this.cd.e() == 0.0F != this.cP) {
            this.d.b(new aev(this.ey(), this.cd.a(), this.cd.e()));
            this.cN = this.ey();
            this.cO = this.cd.a();
            this.cP = this.cd.e() == 0.0F;
         }

         if (this.ey() + this.fq() != this.cH) {
            this.cH = this.ey() + this.fq();
            this.a(euw.g, axz.f(this.cH));
         }

         if (this.cd.a() != this.cI) {
            this.cI = this.cd.a();
            this.a(euw.h, axz.f((float)this.cI));
         }

         if (this.cj() != this.cJ) {
            this.cJ = this.cj();
            this.a(euw.i, axz.f((float)this.cJ));
         }

         if (this.eM() != this.cK) {
            this.cK = this.eM();
            this.a(euw.j, axz.f((float)this.cK));
         }

         if (this.cq != this.cM) {
            this.cM = this.cq;
            this.a(euw.k, axz.f((float)this.cM));
         }

         if (this.cp != this.cL) {
            this.cL = this.cp;
            this.a(euw.l, axz.f((float)this.cL));
         }

         if (this.cq != this.cQ) {
            this.cQ = this.cq;
            this.d.b(new aeu(this.cr, this.cq, this.cp));
         }

         if (this.ai % 20 == 0) {
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
      if (this.ey() > 0.0F && this.de != null) {
         am.X.a(this, this.de);
      }

      this.de = null;
      super.n();
   }

   public void o() {
      if (this.ac > 0.0F && this.de == null) {
         this.de = this.dl();
         if (this.cw != null) {
            am.ae.a(this, this.cw, this.cx);
         }
      }
   }

   public void p() {
      if (this.da() != null && this.da().bq()) {
         if (this.dg == null) {
            this.dg = this.dl();
         } else {
            am.Y.a(this, this.dg);
         }
      }

      if (this.dg != null && (this.da() == null || !this.da().bq())) {
         this.dg = null;
      }
   }

   private void a(euw $$0, int $$1) {
      this.gp().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(bqf $$0) {
      this.a(dva.p);
      boolean $$1 = this.dN().aa().b(czz.n);
      if ($$1) {
         wu $$2 = this.eN().a();
         this.d.a(new adq(this.aj(), $$2), wb.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            wu $$3x = wu.a("death.attack.message_too_long", wu.b($$2x).a(n.o));
            wu $$4x = wu.a("death.attack.even_more_magic", this.O_()).a($$1xx -> $$1xx.a(new xa(xa.a.a, $$3x)));
            return new adq(this.aj(), $$4x);
         }));
         euv $$3 = this.ch();
         if ($$3 == null || $$3.k() == euv.b.a) {
            this.e.ah().a($$2, false);
         } else if ($$3.k() == euv.b.c) {
            this.e.ah().a(this, $$2);
         } else if ($$3.k() == euv.b.d) {
            this.e.ah().b(this, $$2);
         }
      } else {
         this.d.b(new adq(this.aj(), wt.a));
      }

      this.go();
      if (this.dN().aa().b(czz.N)) {
         this.gE();
      }

      if (!this.N_()) {
         this.g($$0);
      }

      this.gp().a(euw.d, this, eur::b);
      bsa $$4 = this.eO();
      if ($$4 != null) {
         this.b(avm.h.b($$4.ai()));
         $$4.a(this, this.bm, $$0);
         this.f($$4);
      }

      this.dN().a(this, (byte)3);
      this.a(avm.N);
      this.a(avm.i.b(avm.m));
      this.a(avm.i.b(avm.n));
      this.aA();
      this.l(0);
      this.c(false);
      this.eN().c();
      this.a(Optional.of(iv.a(this.dN().ae(), this.dn())));
   }

   private void gE() {
      etk $$0 = new etk(this.dn()).c(32.0, 10.0, 32.0);
      this.dN().a(bsc.class, $$0, brm.f).stream().filter($$0x -> $$0x instanceof bsg).forEach($$0x -> ((bsg)$$0x).a_((clh)this));
   }

   @Override
   public void a(brh $$0, int $$1, bqf $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.t($$1);
         this.gp().a(euw.f, this, eur::b);
         if ($$0 instanceof clh) {
            this.a(avm.Q);
            this.gp().a(euw.e, this, eur::b);
         } else {
            this.a(avm.O);
         }

         this.a(this, $$0, euw.m);
         this.a($$0, this, euw.n);
         am.c.a(this, $$0, $$2);
      }
   }

   private void a(eus $$0, eus $$1, euw[] $$2) {
      euo $$3 = this.gp().e($$1.cz());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gp().a($$2[$$4], $$0, eur::b);
         }
      }
   }

   @Override
   public boolean a(bqf $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.e.n() && this.gF() && $$0.a(avt.n);
         if (!$$2 && this.cR > 0 && !$$0.a(avt.e)) {
            return false;
         } else {
            brh $$3 = $$0.d();
            if ($$3 instanceof clh $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof cln $$5 && $$5.u() instanceof clh $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(clh $$0) {
      return !this.gF() ? false : super.a($$0);
   }

   private boolean gF() {
      return this.e.ad();
   }

   @Nullable
   @Override
   protected emz a(aqh $$0) {
      emz $$1 = super.a($$0);
      if ($$1 != null && this.dN().ae() == dad.h && $$0.ae() == dad.j) {
         etp $$2 = $$1.a.b(0.0, -1.0, 0.0);
         return new emz($$2, etp.b, 90.0F, 0.0F);
      } else {
         return $$1;
      }
   }

   @Nullable
   @Override
   public brh b(aqh $$0) {
      this.cW = true;
      aqh $$1 = this.z();
      akg<dad> $$2 = $$1.ae();
      if ($$2 == dad.j && $$0.ae() == dad.h) {
         this.ag();
         this.z().a(this, brh.c.e);
         if (!this.h) {
            this.h = true;
            this.d.b(new act(act.f, this.cX ? 0.0F : 1.0F));
            this.cX = true;
         }

         return this;
      } else {
         enx $$3 = $$0.A_();
         this.d.b(new adz(this.d($$0), (byte)3));
         this.d.b(new abz($$3.q(), $$3.r()));
         aue $$4 = this.e.ah();
         $$4.d(this);
         $$1.a(this, brh.c.e);
         this.dK();
         emz $$5 = this.a($$0);
         if ($$5 != null) {
            $$1.af().a("moving");
            if ($$2 == dad.h && $$0.ae() == dad.i) {
               this.df = this.dl();
            } else if ($$0.ae() == dad.j) {
               this.a($$0, in.a($$5.a));
            }

            $$1.af().c();
            $$1.af().a("placing");
            this.c($$0);
            this.d.a($$5.a.c, $$5.a.d, $$5.a.e, $$5.c, $$5.d);
            this.d.m();
            $$0.b(this);
            $$1.af().c();
            this.f($$1);
            this.d.b(new adm(this.gb()));
            $$4.a(this, $$0);
            $$4.e(this);

            for (bqt $$6 : this.ev()) {
               this.d.b(new afs(this.aj(), $$6, false));
            }

            this.d.b(new acz(1032, in.c, 0, false));
            this.cQ = -1;
            this.cN = -1.0F;
            this.cO = -1;
         }

         return this;
      }
   }

   private void a(aqh $$0, in $$1) {
      in.a $$2 = $$1.j();

      for (int $$3 = -2; $$3 <= 2; $$3++) {
         for (int $$4 = -2; $$4 <= 2; $$4++) {
            for (int $$5 = -1; $$5 < 3; $$5++) {
               dqh $$6 = $$5 == -1 ? ddg.co.n() : ddg.a.n();
               $$0.b($$2.g($$1).e($$4, $$5, $$3), $$6);
            }
         }
      }
   }

   @Override
   protected Optional<l.a> a(aqh $$0, in $$1, boolean $$2, dry $$3) {
      Optional<l.a> $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         is.a $$5 = this.dN().a_(this.ay).d(dii.b).orElse(is.a.a);
         Optional<l.a> $$6 = $$0.p().a($$1, $$5);
         if ($$6.isEmpty()) {
            b.error("Unable to create a portal, likely target out of worldborder");
         }

         return $$6;
      }
   }

   private void f(aqh $$0) {
      akg<dad> $$1 = $$0.ae();
      akg<dad> $$2 = this.dN().ae();
      am.w.a(this, $$1, $$2);
      if ($$1 == dad.i && $$2 == dad.h && this.df != null) {
         am.D.a(this, this.df);
      }

      if ($$2 != dad.i) {
         this.df = null;
      }
   }

   @Override
   public boolean a(aqi $$0) {
      if ($$0.N_()) {
         return this.K() == this;
      } else {
         return this.N_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(brh $$0, int $$1) {
      super.a($$0, $$1);
      this.cc.d();
   }

   @Override
   public Either<clh.a, azb> a(in $$0) {
      is $$1 = this.dN().a_($$0).c(dha.aE);
      if (this.fJ() || !this.bB()) {
         return Either.left(clh.a.e);
      } else if (!this.dN().D_().j()) {
         return Either.left(clh.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(clh.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(clh.a.d);
      } else {
         this.a(this.dN().ae(), $$0, this.dD(), false, true);
         if (this.dN().Q()) {
            return Either.left(clh.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               etp $$4 = etp.c($$0);
               List<cin> $$5 = this.dN()
                  .a(cin.class, new etk($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.f(this));
               if (!$$5.isEmpty()) {
                  return Either.left(clh.a.f);
               }
            }

            Either<clh.a, azb> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(avm.ap);
               am.r.a(this);
            });
            if (!this.z().d()) {
               this.a(wu.c("sleep.not_possible"), true);
            }

            ((aqh)this.dN()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(in $$0) {
      this.a(avm.i.b(avm.n));
      super.b($$0);
   }

   private boolean a(in $$0, is $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(in $$0) {
      etp $$1 = etp.c($$0);
      return Math.abs(this.ds() - $$1.a()) <= 3.0 && Math.abs(this.du() - $$1.b()) <= 2.0 && Math.abs(this.dy() - $$1.c()) <= 3.0;
   }

   private boolean b(in $$0, is $$1) {
      in $$2 = $$0.c();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fJ()) {
         this.z().l().a(this, new abp(this, 2));
      }

      super.a($$0, $$1);
      if (this.d != null) {
         this.d.a(this.ds(), this.du(), this.dy(), this.dD(), this.dF());
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.bG();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public boolean b(bqf $$0) {
      return super.b($$0) || this.O();
   }

   @Override
   protected void a(double $$0, boolean $$1, dqh $$2, in $$3) {
   }

   @Override
   protected void c(in $$0) {
      if (!this.N_()) {
         super.c($$0);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.df()) {
         this.b($$3, new etp($$0, $$1, $$2));
         in $$4 = this.aH();
         dqh $$5 = this.dN().a_($$4);
         if (this.dq && $$3 && this.ac > 0.0F) {
            etp $$6 = $$4.b().b(0.0, 0.5, 0.0);
            int $$7 = (int)(50.0F * this.ac);
            this.z().a(new ko(kx.b, $$5), $$6.c, $$6.d, $$6.e, $$7, 0.3F, 0.3F, 0.3F, 0.15F);
            this.dq = false;
         }

         super.a($$1, $$3, $$5, $$4);
      }
   }

   @Override
   public void a(@Nullable brh $$0) {
      super.a($$0);
      this.cw = this.dl();
      this.cx = $$0;
      this.cy = $$0 != null && $$0.ai() == brn.bm;
   }

   @Override
   protected void q() {
      if (this.dN().s().i()) {
         super.q();
      }
   }

   @Override
   public void a(dow $$0, boolean $$1) {
      this.d.b(new abv(this.dN(), $$0.az_()));
      this.d.b(new adk($$0.az_(), $$1));
   }

   private void gG() {
      this.dv = this.dv % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bpq $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.cc != this.cb) {
            this.r();
         }

         this.gG();
         cod $$1 = $$0.createMenu(this.dv, this.ga(), this);
         if ($$1 == null) {
            if (this.N_()) {
               this.a(wu.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.d.b(new adj($$1.j, $$1.a(), $$0.O_()));
            this.a($$1);
            this.cc = $$1;
            return OptionalInt.of(this.dv);
         }
      }
   }

   @Override
   public void a(int $$0, czc $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.d.b(new adf($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(cft $$0, bpf $$1) {
      if (this.cc != this.cb) {
         this.r();
      }

      this.gG();
      this.d.b(new acu(this.dv, $$1.b(), $$0.aj()));
      this.cc = new cpe(this.dv, this.ga(), $$1, $$0);
      this.a(this.cc);
   }

   @Override
   public void a(csz $$0, bpl $$1) {
      if ($$0.a(ctc.ua)) {
         if (cuv.a($$0, this.de(), this)) {
            this.cc.d();
         }

         this.d.b(new adi($$1));
      }
   }

   @Override
   public void a(dnw $$0) {
      this.d.b(abt.a($$0, dnm::d));
   }

   @Override
   public void r() {
      this.d.b(new acg(this.cc.j));
      this.s();
   }

   @Override
   public void s() {
      this.cc.b(this);
      this.cb.a(this.cc);
      this.cc = this.cb;
   }

   public void a(float $$0, float $$1, boolean $$2, boolean $$3) {
      if (this.bP()) {
         if ($$0 >= -1.0F && $$0 <= 1.0F) {
            this.bp = $$0;
         }

         if ($$1 >= -1.0F && $$1 <= 1.0F) {
            this.br = $$1;
         }

         this.bo = $$2;
         this.g($$3);
      }
   }

   @Override
   public void a(etp $$0) {
      double $$1 = this.ds();
      double $$2 = this.du();
      double $$3 = this.dy();
      super.a($$0);
      this.b(this.ds() - $$1, this.du() - $$2, this.dy() - $$3);
   }

   @Override
   public void t() {
      double $$0 = this.ds();
      double $$1 = this.du();
      double $$2 = this.dy();
      super.t();
      this.r(this.ds() - $$0, this.du() - $$1, this.dy() - $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (!this.bP() && !s($$0, $$1, $$2)) {
         if (this.ca()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(avm.C, $$3);
               this.C(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(avw.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(avm.w, $$4);
               this.C(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.bc()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(avm.s, $$5);
               this.C(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.q_()) {
            if ($$1 > 0.0) {
               this.a(avm.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aC()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.bZ()) {
                  this.a(avm.r, $$6);
                  this.C(0.1F * (float)$$6 * 0.01F);
               } else if (this.bY()) {
                  this.a(avm.q, $$6);
                  this.C(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(avm.p, $$6);
                  this.C(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fC()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(avm.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(avm.v, $$8);
            }
         }
      }
   }

   private void r(double $$0, double $$1, double $$2) {
      if (this.bP() && !s($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         brh $$4 = this.da();
         if ($$4 instanceof cnc) {
            this.a(avm.x, $$3);
         } else if ($$4 instanceof cne) {
            this.a(avm.y, $$3);
         } else if ($$4 instanceof ceg) {
            this.a(avm.z, $$3);
         } else if ($$4 instanceof cft) {
            this.a(avm.A, $$3);
         } else if ($$4 instanceof cja) {
            this.a(avm.D, $$3);
         }
      }
   }

   private static boolean s(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(avj<?> $$0, int $$1) {
      this.cG.b(this, $$0, $$1);
      this.gp().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(avj<?> $$0) {
      this.cG.a(this, $$0, 0);
      this.gp().a($$0, this, eur::c);
   }

   @Override
   public int a(Collection<cxf<?>> $$0) {
      return this.cY.a($$0, this);
   }

   @Override
   public void a(cxf<?> $$0, List<csz> $$1) {
      am.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<akh> $$0) {
      List<cxf<?>> $$1 = $$0.stream().flatMap($$0x -> this.e.aJ().a($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<cxf<?>> $$0) {
      return this.cY.b($$0, this);
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cQ = -1;
   }

   @Override
   public void u() {
      this.db = true;
      this.bF();
      if (this.fJ()) {
         this.a(true, false);
      }
   }

   @Override
   public boolean v() {
      return this.db;
   }

   public void w() {
      this.cN = -1.0E8F;
   }

   @Override
   public void a(wu $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void x() {
      if (!this.bA.d() && this.ft()) {
         this.d.b(new acq(this, (byte)9));
         super.x();
      }
   }

   @Override
   public void a(ep.a $$0, etp $$1) {
      super.a($$0, $$1);
      this.d.b(new adt($$0, $$1.c, $$1.d, $$1.e));
   }

   public void a(ep.a $$0, brh $$1, ep.a $$2) {
      etp $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.d.b(new adt($$0, $$1, $$2));
   }

   public void a(aqi $$0, boolean $$1) {
      this.dr = $$0.dr;
      this.du = $$0.du;
      this.f.a($$0.f.b(), $$0.f.c());
      this.y();
      if ($$1) {
         this.ga().a($$0.ga());
         this.t($$0.ey());
         this.cd = $$0.cd;
         this.cp = $$0.cp;
         this.cq = $$0.cq;
         this.cr = $$0.cr;
         this.s($$0.fU());
         this.ay = $$0.ay;
      } else if (this.dN().aa().b(czz.d) || $$0.N_()) {
         this.ga().a($$0.ga());
         this.cp = $$0.cp;
         this.cq = $$0.cq;
         this.cr = $$0.cr;
         this.s($$0.fU());
      }

      this.cs = $$0.cs;
      this.ca = $$0.ca;
      this.an().a(bW, $$0.an().a(bW));
      this.cQ = -1;
      this.cN = -1.0F;
      this.cO = -1;
      this.cY.a($$0.cY);
      this.cX = $$0.cX;
      this.df = $$0.df;
      this.di = $$0.di;
      this.i($$0.gr());
      this.j($$0.gs());
      this.a($$0.gz());
   }

   @Override
   protected void a(bqt $$0, @Nullable brh $$1) {
      super.a($$0, $$1);
      this.d.b(new afs(this.aj(), $$0, true));
      if ($$0.a(bqv.y)) {
         this.da = this.ai;
         this.cZ = this.dl();
      }

      am.B.a(this, $$1);
   }

   @Override
   protected void a(bqt $$0, boolean $$1, @Nullable brh $$2) {
      super.a($$0, $$1, $$2);
      this.d.b(new afs(this.aj(), $$0, false));
      am.B.a(this, $$2);
   }

   @Override
   protected void a(bqt $$0) {
      super.a($$0);
      this.d.b(new adx(this.aj(), $$0.c()));
      if ($$0.a(bqv.y)) {
         this.cZ = null;
      }

      am.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.d.a($$0, $$1, $$2, this.dD(), this.dF(), bsn.g);
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.d.a(this.ds() + $$0, this.du() + $$1, this.dy() + $$2, this.dD(), this.dF(), bsn.f);
   }

   @Override
   public boolean a(aqh $$0, double $$1, double $$2, double $$3, Set<bsn> $$4, float $$5, float $$6) {
      czk $$7 = new czk(in.a($$1, $$2, $$3));
      $$0.l().a(aqm.g, $$7, 1, this.aj());
      this.ac();
      if (this.fJ()) {
         this.a(true, true);
      }

      if ($$0 == this.dN()) {
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
   public void b(brh $$0) {
      this.z().l().a(this, new abp($$0, 4));
   }

   @Override
   public void c(brh $$0) {
      this.z().l().a(this, new abp($$0, 5));
   }

   @Override
   public void y() {
      if (this.d != null) {
         this.d.b(new adm(this.gb()));
         this.J();
      }
   }

   public aqh z() {
      return (aqh)this.dN();
   }

   public boolean a(daa $$0) {
      if (!this.f.a($$0)) {
         return false;
      } else {
         this.d.b(new act(act.e, (float)$$0.a()));
         if ($$0 == daa.d) {
            this.go();
            this.ac();
         } else {
            this.d(this);
         }

         this.y();
         this.fr();
         return true;
      }
   }

   @Override
   public boolean N_() {
      return this.f.b() == daa.d;
   }

   @Override
   public boolean f() {
      return this.f.b() == daa.b;
   }

   @Override
   public void a(wu $$0) {
      this.b($$0, false);
   }

   public void b(wu $$0, boolean $$1) {
      if (this.v($$1)) {
         this.d.a(new afj($$0, $$1), wb.a(() -> {
            if (this.v(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               wu $$3 = wu.b($$2).a(n.o);
               return new afj(wu.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(xj $$0, boolean $$1, wq.a $$2) {
      if (this.gH()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String A() {
      return this.d.n() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(apw $$0) {
      this.dd = $$0.b();
      this.dc = $$0.c();
      this.cS = $$0.d();
      this.cT = $$0.e();
      this.do = $$0.h();
      this.dp = $$0.i();
      this.an().a(bW, (byte)$$0.f());
      this.an().a(bX, (byte)$$0.g().a());
   }

   public apw B() {
      int $$0 = this.an().a(bW);
      bru $$1 = bru.d.apply(this.an().a(bX));
      return new apw(this.dd, this.dc, this.cS, this.cT, $$0, $$1, this.do, this.dp);
   }

   public boolean C() {
      return this.cT;
   }

   public clf D() {
      return this.cS;
   }

   private boolean v(boolean $$0) {
      return this.cS == clf.c ? $$0 : true;
   }

   private boolean gH() {
      return this.cS == clf.a;
   }

   public int E() {
      return this.dc;
   }

   public void a(ajg $$0) {
      this.d.b(new aed($$0.a(), $$0.d().map(ajg.a::a)));
   }

   @Override
   protected int F() {
      return this.e.c(this.fZ());
   }

   @Override
   public void G() {
      this.cU = ac.b();
   }

   public avi H() {
      return this.cG;
   }

   public avh I() {
      return this.cY;
   }

   @Override
   protected void J() {
      if (this.N_()) {
         this.et();
         this.k(true);
      } else {
         super.J();
      }
   }

   public brh K() {
      return (brh)(this.cV == null ? this : this.cV);
   }

   @Override
   public void d(@Nullable brh $$0) {
      brh $$1 = this.K();
      this.cV = (brh)($$0 == null ? this : $$0);
      if ($$1 != this.cV) {
         if (this.cV.dN() instanceof aqh $$2) {
            this.a($$2, this.cV.ds(), this.cV.du(), this.cV.dy(), Set.of(), this.dD(), this.dF());
         }

         if ($$0 != null) {
            this.z().l().a(this);
         }

         this.d.b(new aek(this.cV));
         this.d.m();
      }
   }

   @Override
   protected void L() {
      if (!this.cW) {
         super.L();
      }
   }

   @Override
   public void e(brh $$0) {
      if (this.f.b() == daa.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long M() {
      return this.cU;
   }

   @Nullable
   public wu N() {
      return null;
   }

   @Override
   public void a(bpl $$0) {
      super.a($$0);
      this.gu();
   }

   public boolean O() {
      return this.cW;
   }

   public void P() {
      this.cW = false;
   }

   public akp Q() {
      return this.cF;
   }

   public void a(aqh $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      this.d(this);
      this.ac();
      if ($$0 == this.dN()) {
         this.d.a($$1, $$2, $$3, $$4, $$5);
      } else {
         aqh $$6 = this.z();
         enx $$7 = $$0.A_();
         this.d.b(new adz(this.d($$0), (byte)3));
         this.d.b(new abz($$7.q(), $$7.r()));
         this.e.ah().d(this);
         $$6.a(this, brh.c.e);
         this.dK();
         this.b($$1, $$2, $$3, $$4, $$5);
         this.c($$0);
         $$0.a(this);
         this.f($$6);
         this.d.a($$1, $$2, $$3, $$4, $$5);
         this.e.ah().a(this, $$0);
         this.e.ah().e(this);
      }
   }

   @Nullable
   public in R() {
      return this.dk;
   }

   public float S() {
      return this.dm;
   }

   public akg<dad> T() {
      return this.dj;
   }

   public boolean U() {
      return this.dl;
   }

   public void a(akg<dad> $$0, @Nullable in $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.dk) && $$0.equals(this.dj);
         if ($$4 && !$$5) {
            this.a(wu.c("block.minecraft.set_spawn"));
         }

         this.dk = $$1;
         this.dj = $$0;
         this.dm = $$2;
         this.dl = $$3;
      } else {
         this.dk = null;
         this.dj = dad.h;
         this.dm = 0.0F;
         this.dl = false;
      }
   }

   public jp V() {
      return this.dh;
   }

   public void a(jp $$0) {
      this.dh = $$0;
   }

   public apv W() {
      return this.di;
   }

   public void a(apv $$0) {
      this.di = $$0;
   }

   @Override
   public void a(avb $$0, avd $$1, float $$2, float $$3) {
      this.d.b(new afg(ld.b.e($$0), $$1, this.ds(), this.du(), this.dy(), $$2, $$3, this.ah.g()));
   }

   @Override
   public chr a(csz $$0, boolean $$1, boolean $$2) {
      chr $$3 = super.a($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dN().b($$3);
         csz $$4 = $$3.p();
         if ($$2) {
            if (!$$4.d()) {
               this.a(avm.f.b($$4.f()), $$0.G());
            }

            this.a(avm.F);
         }

         return $$3;
      }
   }

   public arm X() {
      return this.dn;
   }

   public void c(aqh $$0) {
      this.a((dad)$$0);
      this.f.a($$0);
   }

   @Nullable
   private static daa a(@Nullable ua $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? daa.a($$0.h($$1)) : null;
   }

   private daa b(@Nullable daa $$0) {
      daa $$1 = this.e.bf();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.e.u_();
      }
   }

   @Override
   public void c(@Nullable ua $$0) {
      this.f.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void k(ua $$0) {
      $$0.a("playerGameType", this.f.b().a());
      daa $$1 = this.f.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean Y() {
      return this.do;
   }

   public boolean b(aqi $$0) {
      return $$0 == this ? false : this.do || $$0.do;
   }

   @Override
   public boolean a(dad $$0, in $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(csz $$0) {
      am.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      clg $$1 = this.ga();
      csz $$2 = $$1.a($$0);
      this.cc.b($$1, $$1.k).ifPresent($$1x -> this.cc.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean Z() {
      return this.dp;
   }

   @Override
   public Optional<ckn> aa() {
      return Optional.of(this.dr);
   }

   public void b(boolean $$0) {
      this.dq = $$0;
   }

   @Override
   public void a(chr $$0) {
      super.a($$0);
      brh $$1 = $$0.u();
      if ($$1 != null) {
         am.S.a(this, $$0.p(), $$1);
      }
   }

   public void a(xl $$0) {
      this.du = $$0;
   }

   @Nullable
   public xl ab() {
      return this.du != null && this.du.b() ? null : this.du;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cv = (float)(axz.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dD());
      this.d.b(new acv(this));
   }

   @Override
   public boolean a(brh $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         $$0.j(this);
         this.d.a(this.ds(), this.du(), this.dy(), this.dD(), this.dF());
         if ($$0 instanceof bsa $$2) {
            for (bqt $$3 : $$2.ev()) {
               this.d.b(new afs($$0.aj(), $$3, false));
            }
         }

         return true;
      }
   }

   @Override
   public void ac() {
      brh $$0 = this.da();
      super.ac();
      if ($$0 instanceof bsa $$1) {
         for (bqt $$2 : $$1.ev()) {
            this.d.b(new adx($$0.aj(), $$2.c()));
         }
      }
   }

   public afu d(aqh $$0) {
      return new afu($$0.ad(), $$0.ae(), dbe.a($$0.C()), this.f.b(), this.f.c(), $$0.ah(), $$0.B(), this.gz(), this.av());
   }
}
