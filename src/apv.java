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

public class apv extends cka {
   private static final Logger b = LogUtils.getLogger();
   private static final int cv = 32;
   private static final int cw = 10;
   private static final int cx = 25;
   public static final double c = 1.0;
   private static final bry cz = new bry(UUID.fromString("736565d2-e1a7-403d-a3f8-1aeb3e302542"), "Creative block interaction range modifier", 0.5, bry.a.a);
   private static final bry cA = new bry(UUID.fromString("98491ef6-97b1-4584-ae82-71a8cc85cf73"), "Creative entity interaction range modifier", 2.0, bry.a.a);
   public aqu d;
   public final MinecraftServer e;
   public final apw f;
   private final akd cB;
   private final auu cC;
   private float cD = Float.MIN_VALUE;
   private int cE = Integer.MIN_VALUE;
   private int cF = Integer.MIN_VALUE;
   private int cG = Integer.MIN_VALUE;
   private int cH = Integer.MIN_VALUE;
   private int cI = Integer.MIN_VALUE;
   private float cJ = -1.0E8F;
   private int cK = -99999999;
   private boolean cL = true;
   private int cM = -99999999;
   private int cN = 60;
   private cjy cO = cjy.a;
   private boolean cP = true;
   private long cQ = ac.b();
   @Nullable
   private bqa cR;
   private boolean cS;
   private boolean cT;
   private final aut cU = new aut();
   @Nullable
   private esj cV;
   private int cW;
   private boolean cX;
   private int cY = 2;
   private String cZ = "en_us";
   @Nullable
   private esj da;
   @Nullable
   private esj db;
   @Nullable
   private esj dc;
   private jg dd = jg.a(0, 0, 0);
   private api de = api.a;
   private aju<czg> df = czg.h;
   @Nullable
   private id dg;
   private boolean dh;
   private float di;
   private final aqz dj;
   private boolean dk;
   private boolean dl;
   private cjg dm = new cjg(0, 0, 0);
   private final cnj dn = new cnj() {
      @Override
      public void a(cmw $$0, iw<crs> $$1, crs $$2, int[] $$3) {
         apv.this.d.b(new abv($$0.j, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cmw $$0, int $$1, crs $$2) {
         apv.this.d.b(new abx($$0.j, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cmw $$0, crs $$1) {
         apv.this.d.b(new abx(-1, $$0.k(), -1, $$1));
      }

      @Override
      public void a(cmw $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cmw $$0, int $$1, int $$2) {
         apv.this.d.b(new abw($$0.j, $$1, $$2));
      }
   };
   private final cni do = new cni() {
      @Override
      public void a(cmw $$0, int $$1, crs $$2) {
         cos $$3 = $$0.b($$1);
         if (!($$3 instanceof coo)) {
            if ($$3.d == apv.this.fZ()) {
               am.f.a(apv.this, apv.this.fZ(), $$2);
            }
         }
      }

      @Override
      public void a(cmw $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private wz dp;
   private int dq;
   public boolean g;

   public apv(MinecraftServer $$0, apu $$1, GameProfile $$2, apj $$3) {
      super($$1, $$1.U(), $$1.V(), $$2);
      this.dj = $$0.a(this);
      this.f = $$0.b(this);
      this.e = $$0;
      this.cC = $$0.ah().a((cka)this);
      this.cB = $$0.ah().f(this);
      this.e($$1);
      this.a($$3);
   }

   private void e(apu $$0) {
      id $$1 = $$0.U();
      if ($$0.D_().g() && $$0.o().bc().k() != czd.c) {
         int $$2 = Math.max(0, this.e.a($$0));
         int $$3 = axm.a($$0.C_().b((double)$$1.u(), (double)$$1.w()));
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
         int $$8 = axt.a().a($$6);

         for (int $$9 = 0; $$9 < $$6; $$9++) {
            int $$10 = ($$8 + $$7 * $$9) % $$6;
            int $$11 = $$10 % ($$2 * 2 + 1);
            int $$12 = $$10 / ($$2 * 2 + 1);
            id $$13 = app.a($$0, $$1.u() + $$11 - $$2, $$1.w() + $$12 - $$2);
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

   private int v(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         cjg.a.parse(new Dynamic(uc.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(b::error).ifPresent($$0x -> this.dm = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         to $$1 = $$0.p("enteredNetherPosition");
         this.db = new esj($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.cT = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cU.a($$0.p("recipeBook"), this.e.aJ());
      }

      if (this.fI()) {
         this.fJ();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.dg = new id($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.dh = $$0.q("SpawnForced");
         this.di = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.df = czg.g.parse(uc.a, $$0.c("SpawnDimension")).resultOrPartial(b::error).orElse(czg.h);
         }
      }
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      cjg.a.encodeStart(uc.a, this.dm).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.cT);
      if (this.db != null) {
         to $$1 = new to();
         $$1.a("x", this.db.c);
         $$1.a("y", this.db.d);
         $$1.a("z", this.db.e);
         $$0.a("enteredNetherPosition", $$1);
      }

      bqa $$2 = this.cW();
      bqa $$3 = this.cZ();
      if ($$3 != null && $$2 != this && $$2.cV()) {
         to $$4 = new to();
         to $$5 = new to();
         $$2.e($$5);
         $$4.a("Attach", $$3.cw());
         $$4.a("Entity", $$5);
         $$0.a("RootVehicle", $$4);
      }

      $$0.a("recipeBook", this.cU.b());
      $$0.a("Dimension", this.dM().ae().a().toString());
      if (this.dg != null) {
         $$0.a("SpawnX", this.dg.u());
         $$0.a("SpawnY", this.dg.v());
         $$0.a("SpawnZ", this.dg.w());
         $$0.a("SpawnForced", this.dh);
         $$0.a("SpawnAngle", this.di);
         ajv.a.encodeStart(uc.a, this.df.a()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gi();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.cp = axm.a((float)$$0 / $$1, 0.0F, $$2);
      this.cM = -1;
   }

   public void b(int $$0) {
      this.cn = $$0;
      this.cM = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cM = -1;
   }

   @Override
   public void a(crs $$0, int $$1) {
      super.a($$0, $$1);
      this.cM = -1;
   }

   private void a(cmw $$0) {
      $$0.a(this.do);
      $$0.a(this.dn);
   }

   public void h() {
      this.a(this.bZ);
   }

   @Override
   public void f_() {
      super.f_();
      this.d.b(add.a);
   }

   @Override
   public void g_() {
      super.g_();
      this.d.b(new adc(this.eM()));
   }

   @Override
   protected void a(dpi $$0) {
      am.e.a(this, $$0);
   }

   @Override
   protected cro k() {
      return new csn(this);
   }

   @Override
   public void l() {
      this.f.a();
      this.dm.a();
      this.cN--;
      if (this.al > 0) {
         this.al--;
      }

      this.ca.d();
      if (!this.dM().B && !this.ca.a(this)) {
         this.r();
         this.ca = this.bZ;
      }

      bqa $$0 = this.K();
      if ($$0 != this) {
         if ($$0.bA()) {
            this.a($$0.dr(), $$0.dt(), $$0.dx(), $$0.dC(), $$0.dE());
            this.z().l().a(this);
            if (this.fP()) {
               this.d(this);
            }
         } else {
            this.d(this);
         }
      }

      am.x.a(this);
      if (this.cV != null) {
         am.v.a(this, this.cV, this.ah - this.cW);
      }

      this.o();
      this.p();
      this.gB();
      this.cB.b(this);
   }

   private void gB() {
      brw $$0 = this.f(bsa.g);
      if ($$0 != null) {
         if (this.f()) {
            $$0.b(cz);
         } else {
            $$0.e(cz);
         }
      }

      brw $$1 = this.f(bsa.h);
      if ($$1 != null) {
         if (this.f()) {
            $$1.b(cA);
         } else {
            $$1.e(cA);
         }
      }
   }

   public void m() {
      try {
         if (!this.N_() || !this.de()) {
            super.l();
         }

         for (int $$0 = 0; $$0 < this.fZ().b(); $$0++) {
            crs $$1 = this.fZ().a($$0);
            if ($$1.f().aj_()) {
               yp<?> $$2 = ((cqc)$$1.f()).a($$1, this.dM(), this);
               if ($$2 != null) {
                  this.d.b($$2);
               }
            }
         }

         if (this.ex() != this.cJ || this.cK != this.cb.a() || this.cb.e() == 0.0F != this.cL) {
            this.d.b(new aej(this.ex(), this.cb.a(), this.cb.e()));
            this.cJ = this.ex();
            this.cK = this.cb.a();
            this.cL = this.cb.e() == 0.0F;
         }

         if (this.ex() + this.fp() != this.cD) {
            this.cD = this.ex() + this.fp();
            this.a(etq.g, axm.f(this.cD));
         }

         if (this.cb.a() != this.cE) {
            this.cE = this.cb.a();
            this.a(etq.h, axm.f((float)this.cE));
         }

         if (this.ci() != this.cF) {
            this.cF = this.ci();
            this.a(etq.i, axm.f((float)this.cF));
         }

         if (this.eL() != this.cG) {
            this.cG = this.eL();
            this.a(etq.j, axm.f((float)this.cG));
         }

         if (this.co != this.cI) {
            this.cI = this.co;
            this.a(etq.k, axm.f((float)this.cI));
         }

         if (this.cn != this.cH) {
            this.cH = this.cn;
            this.a(etq.l, axm.f((float)this.cH));
         }

         if (this.co != this.cM) {
            this.cM = this.co;
            this.d.b(new aei(this.cp, this.co, this.cn));
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
      if (this.ex() > 0.0F && this.da != null) {
         am.X.a(this, this.da);
      }

      this.da = null;
      super.n();
   }

   public void o() {
      if (this.ab > 0.0F && this.da == null) {
         this.da = this.dk();
      }
   }

   public void p() {
      if (this.cZ() != null && this.cZ().bq()) {
         if (this.dc == null) {
            this.dc = this.dk();
         } else {
            am.Y.a(this, this.dc);
         }
      }

      if (this.dc != null && (this.cZ() == null || !this.cZ().bq())) {
         this.dc = null;
      }
   }

   private void a(etq $$0, int $$1) {
      this.go().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(boy $$0) {
      this.a(dub.p);
      boolean $$1 = this.dM().aa().b(czc.n);
      if ($$1) {
         wi $$2 = this.eM().a();
         this.d.a(new ade(this.aj(), $$2), vp.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            wi $$3x = wi.a("death.attack.message_too_long", wi.b($$2x).a(n.o));
            wi $$4x = wi.a("death.attack.even_more_magic", this.O_()).a($$1xx -> $$1xx.a(new wo(wo.a.a, $$3x)));
            return new ade(this.aj(), $$4x);
         }));
         etp $$3 = this.cg();
         if ($$3 == null || $$3.k() == etp.b.a) {
            this.e.ah().a($$2, false);
         } else if ($$3.k() == etp.b.c) {
            this.e.ah().a(this, $$2);
         } else if ($$3.k() == etp.b.d) {
            this.e.ah().b(this, $$2);
         }
      } else {
         this.d.b(new ade(this.aj(), wh.a));
      }

      this.gn();
      if (this.dM().aa().b(czc.N)) {
         this.gC();
      }

      if (!this.N_()) {
         this.g($$0);
      }

      this.go().a(etq.d, this, etl::b);
      bqt $$4 = this.eN();
      if ($$4 != null) {
         this.b(auz.h.b($$4.ai()));
         $$4.a(this, this.bk, $$0);
         this.f($$4);
      }

      this.dM().a(this, (byte)3);
      this.a(auz.N);
      this.a(auz.i.b(auz.m));
      this.a(auz.i.b(auz.n));
      this.aA();
      this.l(0);
      this.a_(false);
      this.eM().c();
      this.a(Optional.of(im.a(this.dM().ae(), this.dm())));
   }

   private void gC() {
      ese $$0 = new ese(this.dm()).c(32.0, 10.0, 32.0);
      this.dM().a(bqv.class, $$0, bqf.f).stream().filter($$0x -> $$0x instanceof bqz).forEach($$0x -> ((bqz)$$0x).a_((cka)this));
   }

   @Override
   public void a(bqa $$0, int $$1, boy $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.t($$1);
         this.go().a(etq.f, this, etl::b);
         if ($$0 instanceof cka) {
            this.a(auz.Q);
            this.go().a(etq.e, this, etl::b);
         } else {
            this.a(auz.O);
         }

         this.a(this, $$0, etq.m);
         this.a($$0, this, etq.n);
         am.c.a(this, $$0, $$2);
      }
   }

   private void a(etm $$0, etm $$1, etq[] $$2) {
      eti $$3 = this.go().e($$1.cy());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.go().a($$2[$$4], $$0, etl::b);
         }
      }
   }

   @Override
   public boolean a(boy $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.e.n() && this.gD() && $$0.a(avg.n);
         if (!$$2 && this.cN > 0 && !$$0.a(avg.e)) {
            return false;
         } else {
            bqa $$3 = $$0.d();
            if ($$3 instanceof cka $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof ckg $$5 && $$5.u() instanceof cka $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(cka $$0) {
      return !this.gD() ? false : super.a($$0);
   }

   private boolean gD() {
      return this.e.ad();
   }

   @Nullable
   @Override
   protected ema a(apu $$0) {
      ema $$1 = super.a($$0);
      if ($$1 != null && this.dM().ae() == czg.h && $$0.ae() == czg.j) {
         esj $$2 = $$1.a.b(0.0, -1.0, 0.0);
         return new ema($$2, esj.b, 90.0F, 0.0F);
      } else {
         return $$1;
      }
   }

   @Nullable
   @Override
   public bqa b(apu $$0) {
      this.cS = true;
      apu $$1 = this.z();
      aju<czg> $$2 = $$1.ae();
      if ($$2 == czg.j && $$0.ae() == czg.h) {
         this.ag();
         this.z().a(this, bqa.c.e);
         if (!this.g) {
            this.g = true;
            this.d.b(new ach(ach.f, this.cT ? 0.0F : 1.0F));
            this.cT = true;
         }

         return this;
      } else {
         emw $$3 = $$0.A_();
         this.d.b(new adn(this.d($$0), (byte)3));
         this.d.b(new abn($$3.q(), $$3.r()));
         atr $$4 = this.e.ah();
         $$4.d(this);
         $$1.a(this, bqa.c.e);
         this.dJ();
         ema $$5 = this.a($$0);
         if ($$5 != null) {
            $$1.af().a("moving");
            if ($$2 == czg.h && $$0.ae() == czg.i) {
               this.db = this.dk();
            } else if ($$0.ae() == czg.j) {
               this.a($$0, id.a($$5.a));
            }

            $$1.af().c();
            $$1.af().a("placing");
            this.c($$0);
            this.d.a($$5.a.c, $$5.a.d, $$5.a.e, $$5.c, $$5.d);
            this.d.m();
            $$0.b(this);
            $$1.af().c();
            this.f($$1);
            this.d.b(new ada(this.ga()));
            $$4.a(this, $$0);
            $$4.e(this);

            for (bpm $$6 : this.eu()) {
               this.d.b(new afg(this.aj(), $$6, false));
            }

            this.d.b(new acn(1032, id.c, 0, false));
            this.cM = -1;
            this.cJ = -1.0F;
            this.cK = -1;
         }

         return this;
      }
   }

   private void a(apu $$0, id $$1) {
      id.a $$2 = $$1.j();

      for (int $$3 = -2; $$3 <= 2; $$3++) {
         for (int $$4 = -2; $$4 <= 2; $$4++) {
            for (int $$5 = -1; $$5 < 3; $$5++) {
               dpi $$6 = $$5 == -1 ? dcj.co.n() : dcj.a.n();
               $$0.b($$2.g($$1).e($$4, $$5, $$3), $$6);
            }
         }
      }
   }

   @Override
   protected Optional<l.a> a(apu $$0, id $$1, boolean $$2, dqz $$3) {
      Optional<l.a> $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         ij.a $$5 = this.dM().a_(this.ax).d(dhk.b).orElse(ij.a.a);
         Optional<l.a> $$6 = $$0.p().a($$1, $$5);
         if ($$6.isEmpty()) {
            b.error("Unable to create a portal, likely target out of worldborder");
         }

         return $$6;
      }
   }

   private void f(apu $$0) {
      aju<czg> $$1 = $$0.ae();
      aju<czg> $$2 = this.dM().ae();
      am.w.a(this, $$1, $$2);
      if ($$1 == czg.i && $$2 == czg.h && this.db != null) {
         am.D.a(this, this.db);
      }

      if ($$2 != czg.i) {
         this.db = null;
      }
   }

   @Override
   public boolean a(apv $$0) {
      if ($$0.N_()) {
         return this.K() == this;
      } else {
         return this.N_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bqa $$0, int $$1) {
      super.a($$0, $$1);
      this.ca.d();
   }

   @Override
   public Either<cka.a, ayo> a(id $$0) {
      ij $$1 = this.dM().a_($$0).c(dgc.aE);
      if (this.fI() || !this.bA()) {
         return Either.left(cka.a.e);
      } else if (!this.dM().D_().j()) {
         return Either.left(cka.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cka.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cka.a.d);
      } else {
         this.a(this.dM().ae(), $$0, this.dC(), false, true);
         if (this.dM().Q()) {
            return Either.left(cka.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               esj $$4 = esj.c($$0);
               List<chg> $$5 = this.dM()
                  .a(chg.class, new ese($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.f(this));
               if (!$$5.isEmpty()) {
                  return Either.left(cka.a.f);
               }
            }

            Either<cka.a, ayo> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(auz.ap);
               am.r.a(this);
            });
            if (!this.z().d()) {
               this.a(wi.c("sleep.not_possible"), true);
            }

            ((apu)this.dM()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(id $$0) {
      this.a(auz.i.b(auz.n));
      super.b($$0);
   }

   private boolean a(id $$0, ij $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(id $$0) {
      esj $$1 = esj.c($$0);
      return Math.abs(this.dr() - $$1.a()) <= 3.0 && Math.abs(this.dt() - $$1.b()) <= 2.0 && Math.abs(this.dx() - $$1.c()) <= 3.0;
   }

   private boolean b(id $$0, ij $$1) {
      id $$2 = $$0.c();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fI()) {
         this.z().l().a(this, new abd(this, 2));
      }

      super.a($$0, $$1);
      if (this.d != null) {
         this.d.a(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.bF();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public boolean b(boy $$0) {
      return super.b($$0) || this.O();
   }

   @Override
   protected void a(double $$0, boolean $$1, dpi $$2, id $$3) {
   }

   @Override
   protected void c(id $$0) {
      if (!this.N_()) {
         super.c($$0);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.de()) {
         this.b($$3, new esj($$0, $$1, $$2));
         id $$4 = this.aH();
         super.a($$1, $$3, this.dM().a_($$4), $$4);
      }
   }

   @Override
   public void a(@Nullable bqa $$0) {
      super.a($$0);
      if ($$0 != null && $$0.ai() == bqg.bm) {
         this.cu = this.dt();
      }
   }

   @Override
   protected void q() {
      if (this.dM().s().i()) {
         super.q();
      }
   }

   @Override
   public void a(dny $$0, boolean $$1) {
      this.d.b(new abj(this.dM(), $$0.az_()));
      this.d.b(new acy($$0.az_(), $$1));
   }

   private void gE() {
      this.dq = this.dq % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable boj $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.ca != this.bZ) {
            this.r();
         }

         this.gE();
         cmw $$1 = $$0.createMenu(this.dq, this.fZ(), this);
         if ($$1 == null) {
            if (this.N_()) {
               this.a(wi.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.d.b(new acx($$1.j, $$1.a(), $$0.O_()));
            this.a($$1);
            this.ca = $$1;
            return OptionalInt.of(this.dq);
         }
      }
   }

   @Override
   public void a(int $$0, cyf $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.d.b(new act($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(cem $$0, bny $$1) {
      if (this.ca != this.bZ) {
         this.r();
      }

      this.gE();
      this.d.b(new aci(this.dq, $$1.b(), $$0.aj()));
      this.ca = new cnw(this.dq, this.fZ(), $$1, $$0);
      this.a(this.ca);
   }

   @Override
   public void a(crs $$0, boe $$1) {
      if ($$0.a(crv.tZ)) {
         if (ctn.a($$0, this.dd(), this)) {
            this.ca.d();
         }

         this.d.b(new acw($$1));
      }
   }

   @Override
   public void a(dmy $$0) {
      this.d.b(abh.a($$0, dmo::d));
   }

   @Override
   public void r() {
      this.d.b(new abu(this.ca.j));
      this.s();
   }

   @Override
   public void s() {
      this.ca.b(this);
      this.bZ.a(this.ca);
      this.ca = this.bZ;
   }

   public void a(float $$0, float $$1, boolean $$2, boolean $$3) {
      if (this.bO()) {
         if ($$0 >= -1.0F && $$0 <= 1.0F) {
            this.bn = $$0;
         }

         if ($$1 >= -1.0F && $$1 <= 1.0F) {
            this.bp = $$1;
         }

         this.bm = $$2;
         this.f($$3);
      }
   }

   @Override
   public void a(esj $$0) {
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
               this.a(auz.C, $$3);
               this.C(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(avj.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(auz.w, $$4);
               this.C(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.bc()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(auz.s, $$5);
               this.C(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.q_()) {
            if ($$1 > 0.0) {
               this.a(auz.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aC()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.bY()) {
                  this.a(auz.r, $$6);
                  this.C(0.1F * (float)$$6 * 0.01F);
               } else if (this.bX()) {
                  this.a(auz.q, $$6);
                  this.C(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(auz.p, $$6);
                  this.C(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fB()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(auz.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(auz.v, $$8);
            }
         }
      }
   }

   private void r(double $$0, double $$1, double $$2) {
      if (this.bO() && !s($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         bqa $$4 = this.cZ();
         if ($$4 instanceof clv) {
            this.a(auz.x, $$3);
         } else if ($$4 instanceof clx) {
            this.a(auz.y, $$3);
         } else if ($$4 instanceof ccz) {
            this.a(auz.z, $$3);
         } else if ($$4 instanceof cem) {
            this.a(auz.A, $$3);
         } else if ($$4 instanceof cht) {
            this.a(auz.D, $$3);
         }
      }
   }

   private static boolean s(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(auv<?> $$0, int $$1) {
      this.cC.b(this, $$0, $$1);
      this.go().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(auv<?> $$0) {
      this.cC.a(this, $$0, 0);
      this.go().a($$0, this, etl::c);
   }

   @Override
   public int a(Collection<cvu<?>> $$0) {
      return this.cU.a($$0, this);
   }

   @Override
   public void a(cvu<?> $$0, List<crs> $$1) {
      am.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<ajv> $$0) {
      List<cvu<?>> $$1 = $$0.stream().flatMap($$0x -> this.e.aJ().a($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<cvu<?>> $$0) {
      return this.cU.b($$0, this);
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cM = -1;
   }

   @Override
   public void u() {
      this.cX = true;
      this.bE();
      if (this.fI()) {
         this.a(true, false);
      }
   }

   @Override
   public boolean v() {
      return this.cX;
   }

   public void w() {
      this.cJ = -1.0E8F;
   }

   @Override
   public void a(wi $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void x() {
      if (!this.by.d() && this.fs()) {
         this.d.b(new ace(this, (byte)9));
         super.x();
      }
   }

   @Override
   public void a(eh.a $$0, esj $$1) {
      super.a($$0, $$1);
      this.d.b(new adh($$0, $$1.c, $$1.d, $$1.e));
   }

   public void a(eh.a $$0, bqa $$1, eh.a $$2) {
      esj $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.d.b(new adh($$0, $$1, $$2));
   }

   public void a(apv $$0, boolean $$1) {
      this.dm = $$0.dm;
      this.dp = $$0.dp;
      this.f.a($$0.f.b(), $$0.f.c());
      this.y();
      if ($$1) {
         this.fZ().a($$0.fZ());
         this.t($$0.ex());
         this.cb = $$0.cb;
         this.cn = $$0.cn;
         this.co = $$0.co;
         this.cp = $$0.cp;
         this.s($$0.fT());
         this.ax = $$0.ax;
      } else if (this.dM().aa().b(czc.d) || $$0.N_()) {
         this.fZ().a($$0.fZ());
         this.cn = $$0.cn;
         this.co = $$0.co;
         this.cp = $$0.cp;
         this.s($$0.fT());
      }

      this.cq = $$0.cq;
      this.bY = $$0.bY;
      this.an().a(bU, $$0.an().a(bU));
      this.cM = -1;
      this.cJ = -1.0F;
      this.cK = -1;
      this.cU.a($$0.cU);
      this.cT = $$0.cT;
      this.db = $$0.db;
      this.de = $$0.de;
      this.i($$0.gq());
      this.j($$0.gr());
      this.a($$0.gy());
   }

   @Override
   protected void a(bpm $$0, @Nullable bqa $$1) {
      super.a($$0, $$1);
      this.d.b(new afg(this.aj(), $$0, true));
      if ($$0.a(bpo.y)) {
         this.cW = this.ah;
         this.cV = this.dk();
      }

      am.B.a(this, $$1);
   }

   @Override
   protected void a(bpm $$0, boolean $$1, @Nullable bqa $$2) {
      super.a($$0, $$1, $$2);
      this.d.b(new afg(this.aj(), $$0, false));
      am.B.a(this, $$2);
   }

   @Override
   protected void a(bpm $$0) {
      super.a($$0);
      this.d.b(new adl(this.aj(), $$0.b()));
      if ($$0.a(bpo.y)) {
         this.cV = null;
      }

      am.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.d.a($$0, $$1, $$2, this.dC(), this.dE(), brg.g);
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.d.a(this.dr() + $$0, this.dt() + $$1, this.dx() + $$2, this.dC(), this.dE(), brg.f);
   }

   @Override
   public boolean a(apu $$0, double $$1, double $$2, double $$3, Set<brg> $$4, float $$5, float $$6) {
      cyn $$7 = new cyn(id.a($$1, $$2, $$3));
      $$0.l().a(apz.g, $$7, 1, this.aj());
      this.ac();
      if (this.fI()) {
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
   public void b(bqa $$0) {
      this.z().l().a(this, new abd($$0, 4));
   }

   @Override
   public void c(bqa $$0) {
      this.z().l().a(this, new abd($$0, 5));
   }

   @Override
   public void y() {
      if (this.d != null) {
         this.d.b(new ada(this.ga()));
         this.J();
      }
   }

   public apu z() {
      return (apu)this.dM();
   }

   public boolean a(czd $$0) {
      if (!this.f.a($$0)) {
         return false;
      } else {
         this.d.b(new ach(ach.e, (float)$$0.a()));
         if ($$0 == czd.d) {
            this.gn();
            this.ac();
         } else {
            this.d(this);
         }

         this.y();
         this.fq();
         return true;
      }
   }

   @Override
   public boolean N_() {
      return this.f.b() == czd.d;
   }

   @Override
   public boolean f() {
      return this.f.b() == czd.b;
   }

   @Override
   public void a(wi $$0) {
      this.b($$0, false);
   }

   public void b(wi $$0, boolean $$1) {
      if (this.u($$1)) {
         this.d.a(new aex($$0, $$1), vp.a(() -> {
            if (this.u(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               wi $$3 = wi.b($$2).a(n.o);
               return new aex(wi.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(wx $$0, boolean $$1, we.a $$2) {
      if (this.gF()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String A() {
      return this.d.n() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(apj $$0) {
      this.cZ = $$0.b();
      this.cY = $$0.c();
      this.cO = $$0.d();
      this.cP = $$0.e();
      this.dk = $$0.h();
      this.dl = $$0.i();
      this.an().a(bU, (byte)$$0.f());
      this.an().a(bV, (byte)$$0.g().a());
   }

   public apj B() {
      int $$0 = this.an().a(bU);
      bqn $$1 = bqn.d.apply(this.an().a(bV));
      return new apj(this.cZ, this.cY, this.cO, this.cP, $$0, $$1, this.dk, this.dl);
   }

   public boolean C() {
      return this.cP;
   }

   public cjy D() {
      return this.cO;
   }

   private boolean u(boolean $$0) {
      return this.cO == cjy.c ? $$0 : true;
   }

   private boolean gF() {
      return this.cO == cjy.a;
   }

   public int E() {
      return this.cY;
   }

   public void a(aiu $$0) {
      this.d.b(new adr($$0.a(), $$0.d().map(aiu.a::a)));
   }

   @Override
   protected int F() {
      return this.e.c(this.fY());
   }

   @Override
   public void G() {
      this.cQ = ac.b();
   }

   public auu H() {
      return this.cC;
   }

   public aut I() {
      return this.cU;
   }

   @Override
   protected void J() {
      if (this.N_()) {
         this.es();
         this.j(true);
      } else {
         super.J();
      }
   }

   public bqa K() {
      return (bqa)(this.cR == null ? this : this.cR);
   }

   @Override
   public void d(@Nullable bqa $$0) {
      bqa $$1 = this.K();
      this.cR = (bqa)($$0 == null ? this : $$0);
      if ($$1 != this.cR) {
         if (this.cR.dM() instanceof apu $$2) {
            this.a($$2, this.cR.dr(), this.cR.dt(), this.cR.dx(), Set.of(), this.dC(), this.dE());
         }

         if ($$0 != null) {
            this.z().l().a(this);
         }

         this.d.b(new ady(this.cR));
         this.d.m();
      }
   }

   @Override
   protected void L() {
      if (!this.cS) {
         super.L();
      }
   }

   @Override
   public void e(bqa $$0) {
      if (this.f.b() == czd.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long M() {
      return this.cQ;
   }

   @Nullable
   public wi N() {
      return null;
   }

   @Override
   public void a(boe $$0) {
      super.a($$0);
      this.gt();
   }

   public boolean O() {
      return this.cS;
   }

   public void P() {
      this.cS = false;
   }

   public akd Q() {
      return this.cB;
   }

   public void a(apu $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      this.d(this);
      this.ac();
      if ($$0 == this.dM()) {
         this.d.a($$1, $$2, $$3, $$4, $$5);
      } else {
         apu $$6 = this.z();
         emw $$7 = $$0.A_();
         this.d.b(new adn(this.d($$0), (byte)3));
         this.d.b(new abn($$7.q(), $$7.r()));
         this.e.ah().d(this);
         $$6.a(this, bqa.c.e);
         this.dJ();
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
   public id R() {
      return this.dg;
   }

   public float S() {
      return this.di;
   }

   public aju<czg> T() {
      return this.df;
   }

   public boolean U() {
      return this.dh;
   }

   public void a(aju<czg> $$0, @Nullable id $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.dg) && $$0.equals(this.df);
         if ($$4 && !$$5) {
            this.a(wi.c("block.minecraft.set_spawn"));
         }

         this.dg = $$1;
         this.df = $$0;
         this.di = $$2;
         this.dh = $$3;
      } else {
         this.dg = null;
         this.df = czg.h;
         this.di = 0.0F;
         this.dh = false;
      }
   }

   public jg V() {
      return this.dd;
   }

   public void a(jg $$0) {
      this.dd = $$0;
   }

   public api W() {
      return this.de;
   }

   public void a(api $$0) {
      this.de = $$0;
   }

   @Override
   public void a(aun $$0, aup $$1, float $$2, float $$3) {
      this.d.b(new aeu(kt.b.e($$0), $$1, this.dr(), this.dt(), this.dx(), $$2, $$3, this.ag.g()));
   }

   @Override
   public cgk a(crs $$0, boolean $$1, boolean $$2) {
      cgk $$3 = super.a($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dM().b($$3);
         crs $$4 = $$3.p();
         if ($$2) {
            if (!$$4.d()) {
               this.a(auz.f.b($$4.f()), $$0.G());
            }

            this.a(auz.F);
         }

         return $$3;
      }
   }

   public aqz X() {
      return this.dj;
   }

   public void c(apu $$0) {
      this.a((czg)$$0);
      this.f.a($$0);
   }

   @Nullable
   private static czd a(@Nullable to $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? czd.a($$0.h($$1)) : null;
   }

   private czd b(@Nullable czd $$0) {
      czd $$1 = this.e.bf();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.e.u_();
      }
   }

   @Override
   public void c(@Nullable to $$0) {
      this.f.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void k(to $$0) {
      $$0.a("playerGameType", this.f.b().a());
      czd $$1 = this.f.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean Y() {
      return this.dk;
   }

   public boolean b(apv $$0) {
      return $$0 == this ? false : this.dk || $$0.dk;
   }

   @Override
   public boolean a(czg $$0, id $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(crs $$0) {
      am.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cjz $$1 = this.fZ();
      crs $$2 = $$1.a($$0);
      this.ca.b($$1, $$1.l).ifPresent($$1x -> this.ca.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean Z() {
      return this.dl;
   }

   @Override
   public Optional<cjg> aa() {
      return Optional.of(this.dm);
   }

   @Override
   public void a(cgk $$0) {
      super.a($$0);
      bqa $$1 = $$0.u();
      if ($$1 != null) {
         am.S.a(this, $$0.p(), $$1);
      }
   }

   public void a(wz $$0) {
      this.dp = $$0;
   }

   @Nullable
   public wz ab() {
      return this.dp != null && this.dp.b() ? null : this.dp;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.ct = (float)(axm.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dC());
      this.d.b(new acj(this));
   }

   @Override
   public boolean a(bqa $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         $$0.j(this);
         this.d.a(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
         if ($$0 instanceof bqt $$2) {
            for (bpm $$3 : $$2.eu()) {
               this.d.b(new afg($$0.aj(), $$3, false));
            }
         }

         return true;
      }
   }

   @Override
   public void ac() {
      bqa $$0 = this.cZ();
      super.ac();
      if ($$0 instanceof bqt $$1) {
         for (bpm $$2 : $$1.eu()) {
            this.d.b(new adl($$0.aj(), $$2.b()));
         }
      }
   }

   public afi d(apu $$0) {
      return new afi($$0.ad(), $$0.ae(), dah.a($$0.C()), this.f.b(), this.f.c(), $$0.ah(), $$0.B(), this.gy(), this.av());
   }
}
