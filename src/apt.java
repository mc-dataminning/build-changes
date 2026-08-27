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

public class apt extends cjt {
   private static final Logger b = LogUtils.getLogger();
   private static final int ct = 32;
   private static final int cu = 10;
   private static final int cv = 25;
   public static final double c = 1.0;
   private static final brt cw = new brt(UUID.fromString("736565d2-e1a7-403d-a3f8-1aeb3e302542"), "Creative block interaction range modifier", 0.5, brt.a.a);
   private static final brt cx = new brt(UUID.fromString("98491ef6-97b1-4584-ae82-71a8cc85cf73"), "Creative entity interaction range modifier", 2.0, brt.a.a);
   public aqs d;
   public final MinecraftServer e;
   public final apu f;
   private final akb cz;
   private final aus cA;
   private float cB = Float.MIN_VALUE;
   private int cC = Integer.MIN_VALUE;
   private int cD = Integer.MIN_VALUE;
   private int cE = Integer.MIN_VALUE;
   private int cF = Integer.MIN_VALUE;
   private int cG = Integer.MIN_VALUE;
   private float cH = -1.0E8F;
   private int cI = -99999999;
   private boolean cJ = true;
   private int cK = -99999999;
   private int cL = 60;
   private cjr cM = cjr.a;
   private boolean cN = true;
   private long cO = ac.b();
   @Nullable
   private bpv cP;
   private boolean cQ;
   private boolean cR;
   private final aur cS = new aur();
   @Nullable
   private esa cT;
   private int cU;
   private boolean cV;
   private int cW = 2;
   private String cX = "en_us";
   @Nullable
   private esa cY;
   @Nullable
   private esa cZ;
   @Nullable
   private esa da;
   private je db = je.a(0, 0, 0);
   private apg dc = apg.a;
   private ajs<cyx> dd = cyx.h;
   @Nullable
   private ib de;
   private boolean df;
   private float dg;
   private final aqx dh;
   private boolean di;
   private boolean dj;
   private ciz dk = new ciz(0, 0, 0);
   private final cnc dl = new cnc() {
      @Override
      public void a(cmp $$0, iu<crj> $$1, crj $$2, int[] $$3) {
         apt.this.d.b(new abt($$0.j, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cmp $$0, int $$1, crj $$2) {
         apt.this.d.b(new abv($$0.j, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cmp $$0, crj $$1) {
         apt.this.d.b(new abv(-1, $$0.k(), -1, $$1));
      }

      @Override
      public void a(cmp $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cmp $$0, int $$1, int $$2) {
         apt.this.d.b(new abu($$0.j, $$1, $$2));
      }
   };
   private final cnb dm = new cnb() {
      @Override
      public void a(cmp $$0, int $$1, crj $$2) {
         cok $$3 = $$0.b($$1);
         if (!($$3 instanceof cog)) {
            if ($$3.d == apt.this.fZ()) {
               am.f.a(apt.this, apt.this.fZ(), $$2);
            }
         }
      }

      @Override
      public void a(cmp $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private wx dn;
   private int do;
   public boolean g;

   public apt(MinecraftServer $$0, aps $$1, GameProfile $$2, aph $$3) {
      super($$1, $$1.U(), $$1.V(), $$2);
      this.dh = $$0.a(this);
      this.f = $$0.b(this);
      this.e = $$0;
      this.cA = $$0.ah().a((cjt)this);
      this.cz = $$0.ah().f(this);
      this.e($$1);
      this.a($$3);
   }

   private void e(aps $$0) {
      ib $$1 = $$0.U();
      if ($$0.D_().g() && $$0.o().bc().k() != cyu.c) {
         int $$2 = Math.max(0, this.e.a($$0));
         int $$3 = axk.a($$0.C_().b((double)$$1.u(), (double)$$1.w()));
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
         int $$8 = axr.a().a($$6);

         for (int $$9 = 0; $$9 < $$6; $$9++) {
            int $$10 = ($$8 + $$7 * $$9) % $$6;
            int $$11 = $$10 % ($$2 * 2 + 1);
            int $$12 = $$10 / ($$2 * 2 + 1);
            ib $$13 = apn.a($$0, $$1.u() + $$11 - $$2, $$1.w() + $$12 - $$2);
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
   public void a(tm $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         ciz.a.parse(new Dynamic(ua.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(b::error).ifPresent($$0x -> this.dk = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         tm $$1 = $$0.p("enteredNetherPosition");
         this.cZ = new esa($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.cR = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cS.a($$0.p("recipeBook"), this.e.aJ());
      }

      if (this.fI()) {
         this.fJ();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.de = new ib($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.df = $$0.q("SpawnForced");
         this.dg = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.dd = cyx.g.parse(ua.a, $$0.c("SpawnDimension")).resultOrPartial(b::error).orElse(cyx.h);
         }
      }
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      ciz.a.encodeStart(ua.a, this.dk).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.cR);
      if (this.cZ != null) {
         tm $$1 = new tm();
         $$1.a("x", this.cZ.c);
         $$1.a("y", this.cZ.d);
         $$1.a("z", this.cZ.e);
         $$0.a("enteredNetherPosition", $$1);
      }

      bpv $$2 = this.cW();
      bpv $$3 = this.cZ();
      if ($$3 != null && $$2 != this && $$2.cV()) {
         tm $$4 = new tm();
         tm $$5 = new tm();
         $$2.e($$5);
         $$4.a("Attach", $$3.cw());
         $$4.a("Entity", $$5);
         $$0.a("RootVehicle", $$4);
      }

      $$0.a("recipeBook", this.cS.b());
      $$0.a("Dimension", this.dM().ae().a().toString());
      if (this.de != null) {
         $$0.a("SpawnX", this.de.u());
         $$0.a("SpawnY", this.de.v());
         $$0.a("SpawnZ", this.de.w());
         $$0.a("SpawnForced", this.df);
         $$0.a("SpawnAngle", this.dg);
         ajt.a.encodeStart(ua.a, this.dd.a()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gi();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.cn = axk.a((float)$$0 / $$1, 0.0F, $$2);
      this.cK = -1;
   }

   public void b(int $$0) {
      this.cl = $$0;
      this.cK = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cK = -1;
   }

   @Override
   public void a(crj $$0, int $$1) {
      super.a($$0, $$1);
      this.cK = -1;
   }

   private void a(cmp $$0) {
      $$0.a(this.dm);
      $$0.a(this.dl);
   }

   public void h() {
      this.a(this.bX);
   }

   @Override
   public void f_() {
      super.f_();
      this.d.b(adb.a);
   }

   @Override
   public void g_() {
      super.g_();
      this.d.b(new ada(this.eM()));
   }

   @Override
   protected void a(doz $$0) {
      am.e.a(this, $$0);
   }

   @Override
   protected crf k() {
      return new cse(this);
   }

   @Override
   public void l() {
      this.f.a();
      this.dk.a();
      this.cL--;
      if (this.al > 0) {
         this.al--;
      }

      this.bY.d();
      if (!this.dM().B && !this.bY.a(this)) {
         this.r();
         this.bY = this.bX;
      }

      bpv $$0 = this.K();
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
      if (this.cT != null) {
         am.v.a(this, this.cT, this.ah - this.cU);
      }

      this.o();
      this.p();
      this.gB();
      this.cz.b(this);
   }

   private void gB() {
      brr $$0 = this.f(brv.g);
      if ($$0 != null) {
         if (this.f()) {
            $$0.b(cw);
         } else {
            $$0.e(cw);
         }
      }

      brr $$1 = this.f(brv.h);
      if ($$1 != null) {
         if (this.f()) {
            $$1.b(cx);
         } else {
            $$1.e(cx);
         }
      }
   }

   public void m() {
      try {
         if (!this.N_() || !this.de()) {
            super.l();
         }

         for (int $$0 = 0; $$0 < this.fZ().b(); $$0++) {
            crj $$1 = this.fZ().a($$0);
            if ($$1.f().ak_()) {
               yn<?> $$2 = ((cpt)$$1.f()).a($$1, this.dM(), this);
               if ($$2 != null) {
                  this.d.b($$2);
               }
            }
         }

         if (this.ex() != this.cH || this.cI != this.bZ.a() || this.bZ.e() == 0.0F != this.cJ) {
            this.d.b(new aeh(this.ex(), this.bZ.a(), this.bZ.e()));
            this.cH = this.ex();
            this.cI = this.bZ.a();
            this.cJ = this.bZ.e() == 0.0F;
         }

         if (this.ex() + this.fp() != this.cB) {
            this.cB = this.ex() + this.fp();
            this.a(eth.g, axk.f(this.cB));
         }

         if (this.bZ.a() != this.cC) {
            this.cC = this.bZ.a();
            this.a(eth.h, axk.f((float)this.cC));
         }

         if (this.ci() != this.cD) {
            this.cD = this.ci();
            this.a(eth.i, axk.f((float)this.cD));
         }

         if (this.eL() != this.cE) {
            this.cE = this.eL();
            this.a(eth.j, axk.f((float)this.cE));
         }

         if (this.cm != this.cG) {
            this.cG = this.cm;
            this.a(eth.k, axk.f((float)this.cG));
         }

         if (this.cl != this.cF) {
            this.cF = this.cl;
            this.a(eth.l, axk.f((float)this.cF));
         }

         if (this.cm != this.cK) {
            this.cK = this.cm;
            this.d.b(new aeg(this.cn, this.cm, this.cl));
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
      if (this.ex() > 0.0F && this.cY != null) {
         am.X.a(this, this.cY);
      }

      this.cY = null;
      super.n();
   }

   public void o() {
      if (this.ab > 0.0F && this.cY == null) {
         this.cY = this.dk();
      }
   }

   public void p() {
      if (this.cZ() != null && this.cZ().bq()) {
         if (this.da == null) {
            this.da = this.dk();
         } else {
            am.Y.a(this, this.da);
         }
      }

      if (this.da != null && (this.cZ() == null || !this.cZ().bq())) {
         this.da = null;
      }
   }

   private void a(eth $$0, int $$1) {
      this.go().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(bot $$0) {
      this.a(dts.p);
      boolean $$1 = this.dM().aa().b(cyt.n);
      if ($$1) {
         wg $$2 = this.eM().a();
         this.d.a(new adc(this.aj(), $$2), vn.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            wg $$3x = wg.a("death.attack.message_too_long", wg.b($$2x).a(n.o));
            wg $$4x = wg.a("death.attack.even_more_magic", this.O_()).a($$1xx -> $$1xx.a(new wm(wm.a.a, $$3x)));
            return new adc(this.aj(), $$4x);
         }));
         etg $$3 = this.cg();
         if ($$3 == null || $$3.k() == etg.b.a) {
            this.e.ah().a($$2, false);
         } else if ($$3.k() == etg.b.c) {
            this.e.ah().a(this, $$2);
         } else if ($$3.k() == etg.b.d) {
            this.e.ah().b(this, $$2);
         }
      } else {
         this.d.b(new adc(this.aj(), wf.a));
      }

      this.gn();
      if (this.dM().aa().b(cyt.N)) {
         this.gC();
      }

      if (!this.N_()) {
         this.g($$0);
      }

      this.go().a(eth.d, this, etc::b);
      bqo $$4 = this.eN();
      if ($$4 != null) {
         this.b(auw.h.b($$4.ai()));
         $$4.a(this, this.bk, $$0);
         this.f($$4);
      }

      this.dM().a(this, (byte)3);
      this.a(auw.N);
      this.a(auw.i.b(auw.m));
      this.a(auw.i.b(auw.n));
      this.aA();
      this.l(0);
      this.a_(false);
      this.eM().c();
      this.a(Optional.of(ik.a(this.dM().ae(), this.dm())));
   }

   private void gC() {
      erv $$0 = new erv(this.dm()).c(32.0, 10.0, 32.0);
      this.dM().a(bqq.class, $$0, bqa.f).stream().filter($$0x -> $$0x instanceof bqu).forEach($$0x -> ((bqu)$$0x).a_((cjt)this));
   }

   @Override
   public void a(bpv $$0, int $$1, bot $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.t($$1);
         this.go().a(eth.f, this, etc::b);
         if ($$0 instanceof cjt) {
            this.a(auw.Q);
            this.go().a(eth.e, this, etc::b);
         } else {
            this.a(auw.O);
         }

         this.a(this, $$0, eth.m);
         this.a($$0, this, eth.n);
         am.c.a(this, $$0, $$2);
      }
   }

   private void a(etd $$0, etd $$1, eth[] $$2) {
      esz $$3 = this.go().e($$1.cy());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.go().a($$2[$$4], $$0, etc::b);
         }
      }
   }

   @Override
   public boolean a(bot $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.e.n() && this.gD() && $$0.a(ave.n);
         if (!$$2 && this.cL > 0 && !$$0.a(ave.e)) {
            return false;
         } else {
            bpv $$3 = $$0.d();
            if ($$3 instanceof cjt $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof cjz $$5 && $$5.u() instanceof cjt $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(cjt $$0) {
      return !this.gD() ? false : super.a($$0);
   }

   private boolean gD() {
      return this.e.ad();
   }

   @Nullable
   @Override
   protected elr a(aps $$0) {
      elr $$1 = super.a($$0);
      if ($$1 != null && this.dM().ae() == cyx.h && $$0.ae() == cyx.j) {
         esa $$2 = $$1.a.b(0.0, -1.0, 0.0);
         return new elr($$2, esa.b, 90.0F, 0.0F);
      } else {
         return $$1;
      }
   }

   @Nullable
   @Override
   public bpv b(aps $$0) {
      this.cQ = true;
      aps $$1 = this.z();
      ajs<cyx> $$2 = $$1.ae();
      if ($$2 == cyx.j && $$0.ae() == cyx.h) {
         this.ag();
         this.z().a(this, bpv.c.e);
         if (!this.g) {
            this.g = true;
            this.d.b(new acf(acf.f, this.cR ? 0.0F : 1.0F));
            this.cR = true;
         }

         return this;
      } else {
         emn $$3 = $$0.A_();
         this.d.b(new adl(this.d($$0), (byte)3));
         this.d.b(new abl($$3.q(), $$3.r()));
         atp $$4 = this.e.ah();
         $$4.d(this);
         $$1.a(this, bpv.c.e);
         this.dJ();
         elr $$5 = this.a($$0);
         if ($$5 != null) {
            $$1.af().a("moving");
            if ($$2 == cyx.h && $$0.ae() == cyx.i) {
               this.cZ = this.dk();
            } else if ($$0.ae() == cyx.j) {
               this.a($$0, ib.a($$5.a));
            }

            $$1.af().c();
            $$1.af().a("placing");
            this.c($$0);
            this.d.a($$5.a.c, $$5.a.d, $$5.a.e, $$5.c, $$5.d);
            this.d.m();
            $$0.b(this);
            $$1.af().c();
            this.f($$1);
            this.d.b(new acy(this.ga()));
            $$4.a(this, $$0);
            $$4.e(this);

            for (bph $$6 : this.eu()) {
               this.d.b(new afe(this.aj(), $$6, false));
            }

            this.d.b(new acl(1032, ib.c, 0, false));
            this.cK = -1;
            this.cH = -1.0F;
            this.cI = -1;
         }

         return this;
      }
   }

   private void a(aps $$0, ib $$1) {
      ib.a $$2 = $$1.j();

      for (int $$3 = -2; $$3 <= 2; $$3++) {
         for (int $$4 = -2; $$4 <= 2; $$4++) {
            for (int $$5 = -1; $$5 < 3; $$5++) {
               doz $$6 = $$5 == -1 ? dca.co.n() : dca.a.n();
               $$0.b($$2.g($$1).e($$4, $$5, $$3), $$6);
            }
         }
      }
   }

   @Override
   protected Optional<l.a> a(aps $$0, ib $$1, boolean $$2, dqq $$3) {
      Optional<l.a> $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         ih.a $$5 = this.dM().a_(this.ax).d(dhb.b).orElse(ih.a.a);
         Optional<l.a> $$6 = $$0.p().a($$1, $$5);
         if ($$6.isEmpty()) {
            b.error("Unable to create a portal, likely target out of worldborder");
         }

         return $$6;
      }
   }

   private void f(aps $$0) {
      ajs<cyx> $$1 = $$0.ae();
      ajs<cyx> $$2 = this.dM().ae();
      am.w.a(this, $$1, $$2);
      if ($$1 == cyx.i && $$2 == cyx.h && this.cZ != null) {
         am.D.a(this, this.cZ);
      }

      if ($$2 != cyx.i) {
         this.cZ = null;
      }
   }

   @Override
   public boolean a(apt $$0) {
      if ($$0.N_()) {
         return this.K() == this;
      } else {
         return this.N_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bpv $$0, int $$1) {
      super.a($$0, $$1);
      this.bY.d();
   }

   @Override
   public Either<cjt.a, aym> a(ib $$0) {
      ih $$1 = this.dM().a_($$0).c(dft.aE);
      if (this.fI() || !this.bA()) {
         return Either.left(cjt.a.e);
      } else if (!this.dM().D_().j()) {
         return Either.left(cjt.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cjt.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cjt.a.d);
      } else {
         this.a(this.dM().ae(), $$0, this.dC(), false, true);
         if (this.dM().Q()) {
            return Either.left(cjt.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               esa $$4 = esa.c($$0);
               List<cgz> $$5 = this.dM()
                  .a(cgz.class, new erv($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.f(this));
               if (!$$5.isEmpty()) {
                  return Either.left(cjt.a.f);
               }
            }

            Either<cjt.a, aym> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(auw.ap);
               am.r.a(this);
            });
            if (!this.z().d()) {
               this.a(wg.c("sleep.not_possible"), true);
            }

            ((aps)this.dM()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(ib $$0) {
      this.a(auw.i.b(auw.n));
      super.b($$0);
   }

   private boolean a(ib $$0, ih $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(ib $$0) {
      esa $$1 = esa.c($$0);
      return Math.abs(this.dr() - $$1.a()) <= 3.0 && Math.abs(this.dt() - $$1.b()) <= 2.0 && Math.abs(this.dx() - $$1.c()) <= 3.0;
   }

   private boolean b(ib $$0, ih $$1) {
      ib $$2 = $$0.c();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fI()) {
         this.z().l().a(this, new abb(this, 2));
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
   public boolean b(bot $$0) {
      return super.b($$0) || this.O();
   }

   @Override
   protected void a(double $$0, boolean $$1, doz $$2, ib $$3) {
   }

   @Override
   protected void c(ib $$0) {
      if (!this.N_()) {
         super.c($$0);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.de()) {
         this.b($$3, new esa($$0, $$1, $$2));
         ib $$4 = this.aH();
         super.a($$1, $$3, this.dM().a_($$4), $$4);
      }
   }

   @Override
   public void a(@Nullable bpv $$0) {
      super.a($$0);
      if ($$0 != null && $$0.ai() == bqb.bm) {
         this.cs = this.dt();
      }
   }

   @Override
   protected void q() {
      if (this.dM().s().i()) {
         super.q();
      }
   }

   @Override
   public void a(dnp $$0, boolean $$1) {
      this.d.b(new abh(this.dM(), $$0.aA_()));
      this.d.b(new acw($$0.aA_(), $$1));
   }

   private void gE() {
      this.do = this.do % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable boe $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.bY != this.bX) {
            this.r();
         }

         this.gE();
         cmp $$1 = $$0.createMenu(this.do, this.fZ(), this);
         if ($$1 == null) {
            if (this.N_()) {
               this.a(wg.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.d.b(new acv($$1.j, $$1.a(), $$0.O_()));
            this.a($$1);
            this.bY = $$1;
            return OptionalInt.of(this.do);
         }
      }
   }

   @Override
   public void a(int $$0, cxw $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.d.b(new acr($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(cef $$0, bnt $$1) {
      if (this.bY != this.bX) {
         this.r();
      }

      this.gE();
      this.d.b(new acg(this.do, $$1.b(), $$0.aj()));
      this.bY = new cnp(this.do, this.fZ(), $$1, $$0);
      this.a(this.bY);
   }

   @Override
   public void a(crj $$0, bnz $$1) {
      if ($$0.a(crm.tZ)) {
         if (cte.a($$0, this.dd(), this)) {
            this.bY.d();
         }

         this.d.b(new acu($$1));
      }
   }

   @Override
   public void a(dmp $$0) {
      this.d.b(abf.a($$0, dmf::d));
   }

   @Override
   public void r() {
      this.d.b(new abs(this.bY.j));
      this.s();
   }

   @Override
   public void s() {
      this.bY.b(this);
      this.bX.a(this.bY);
      this.bY = this.bX;
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
   public void a(esa $$0) {
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
               this.a(auw.C, $$3);
               this.C(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(avh.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(auw.w, $$4);
               this.C(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.bc()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(auw.s, $$5);
               this.C(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.q_()) {
            if ($$1 > 0.0) {
               this.a(auw.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aC()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.bY()) {
                  this.a(auw.r, $$6);
                  this.C(0.1F * (float)$$6 * 0.01F);
               } else if (this.bX()) {
                  this.a(auw.q, $$6);
                  this.C(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(auw.p, $$6);
                  this.C(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fB()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(auw.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(auw.v, $$8);
            }
         }
      }
   }

   private void r(double $$0, double $$1, double $$2) {
      if (this.bO() && !s($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         bpv $$4 = this.cZ();
         if ($$4 instanceof clo) {
            this.a(auw.x, $$3);
         } else if ($$4 instanceof clq) {
            this.a(auw.y, $$3);
         } else if ($$4 instanceof ccu) {
            this.a(auw.z, $$3);
         } else if ($$4 instanceof cef) {
            this.a(auw.A, $$3);
         } else if ($$4 instanceof chm) {
            this.a(auw.D, $$3);
         }
      }
   }

   private static boolean s(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(aut<?> $$0, int $$1) {
      this.cA.b(this, $$0, $$1);
      this.go().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(aut<?> $$0) {
      this.cA.a(this, $$0, 0);
      this.go().a($$0, this, etc::c);
   }

   @Override
   public int a(Collection<cvl<?>> $$0) {
      return this.cS.a($$0, this);
   }

   @Override
   public void a(cvl<?> $$0, List<crj> $$1) {
      am.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<ajt> $$0) {
      List<cvl<?>> $$1 = $$0.stream().flatMap($$0x -> this.e.aJ().a($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<cvl<?>> $$0) {
      return this.cS.b($$0, this);
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cK = -1;
   }

   @Override
   public void u() {
      this.cV = true;
      this.bE();
      if (this.fI()) {
         this.a(true, false);
      }
   }

   @Override
   public boolean v() {
      return this.cV;
   }

   public void w() {
      this.cH = -1.0E8F;
   }

   @Override
   public void a(wg $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void x() {
      if (!this.by.d() && this.fs()) {
         this.d.b(new acc(this, (byte)9));
         super.x();
      }
   }

   @Override
   public void a(eg.a $$0, esa $$1) {
      super.a($$0, $$1);
      this.d.b(new adf($$0, $$1.c, $$1.d, $$1.e));
   }

   public void a(eg.a $$0, bpv $$1, eg.a $$2) {
      esa $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.d.b(new adf($$0, $$1, $$2));
   }

   public void a(apt $$0, boolean $$1) {
      this.dk = $$0.dk;
      this.dn = $$0.dn;
      this.f.a($$0.f.b(), $$0.f.c());
      this.y();
      if ($$1) {
         this.fZ().a($$0.fZ());
         this.t($$0.ex());
         this.bZ = $$0.bZ;
         this.cl = $$0.cl;
         this.cm = $$0.cm;
         this.cn = $$0.cn;
         this.s($$0.fT());
         this.ax = $$0.ax;
      } else if (this.dM().aa().b(cyt.d) || $$0.N_()) {
         this.fZ().a($$0.fZ());
         this.cl = $$0.cl;
         this.cm = $$0.cm;
         this.cn = $$0.cn;
         this.s($$0.fT());
      }

      this.co = $$0.co;
      this.bW = $$0.bW;
      this.an().a(bS, $$0.an().a(bS));
      this.cK = -1;
      this.cH = -1.0F;
      this.cI = -1;
      this.cS.a($$0.cS);
      this.cR = $$0.cR;
      this.cZ = $$0.cZ;
      this.dc = $$0.dc;
      this.i($$0.gq());
      this.j($$0.gr());
      this.a($$0.gy());
   }

   @Override
   protected void a(bph $$0, @Nullable bpv $$1) {
      super.a($$0, $$1);
      this.d.b(new afe(this.aj(), $$0, true));
      if ($$0.a(bpj.y)) {
         this.cU = this.ah;
         this.cT = this.dk();
      }

      am.B.a(this, $$1);
   }

   @Override
   protected void a(bph $$0, boolean $$1, @Nullable bpv $$2) {
      super.a($$0, $$1, $$2);
      this.d.b(new afe(this.aj(), $$0, false));
      am.B.a(this, $$2);
   }

   @Override
   protected void a(bph $$0) {
      super.a($$0);
      this.d.b(new adj(this.aj(), $$0.b()));
      if ($$0.a(bpj.y)) {
         this.cT = null;
      }

      am.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.d.a($$0, $$1, $$2, this.dC(), this.dE(), brb.g);
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.d.a(this.dr() + $$0, this.dt() + $$1, this.dx() + $$2, this.dC(), this.dE(), brb.f);
   }

   @Override
   public boolean a(aps $$0, double $$1, double $$2, double $$3, Set<brb> $$4, float $$5, float $$6) {
      cye $$7 = new cye(ib.a($$1, $$2, $$3));
      $$0.l().a(apx.g, $$7, 1, this.aj());
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
   public void b(bpv $$0) {
      this.z().l().a(this, new abb($$0, 4));
   }

   @Override
   public void c(bpv $$0) {
      this.z().l().a(this, new abb($$0, 5));
   }

   @Override
   public void y() {
      if (this.d != null) {
         this.d.b(new acy(this.ga()));
         this.J();
      }
   }

   public aps z() {
      return (aps)this.dM();
   }

   public boolean a(cyu $$0) {
      if (!this.f.a($$0)) {
         return false;
      } else {
         this.d.b(new acf(acf.e, (float)$$0.a()));
         if ($$0 == cyu.d) {
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
      return this.f.b() == cyu.d;
   }

   @Override
   public boolean f() {
      return this.f.b() == cyu.b;
   }

   @Override
   public void a(wg $$0) {
      this.b($$0, false);
   }

   public void b(wg $$0, boolean $$1) {
      if (this.u($$1)) {
         this.d.a(new aev($$0, $$1), vn.a(() -> {
            if (this.u(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               wg $$3 = wg.b($$2).a(n.o);
               return new aev(wg.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(wv $$0, boolean $$1, wc.a $$2) {
      if (this.gF()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String A() {
      return this.d.n() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(aph $$0) {
      this.cX = $$0.b();
      this.cW = $$0.c();
      this.cM = $$0.d();
      this.cN = $$0.e();
      this.di = $$0.h();
      this.dj = $$0.i();
      this.an().a(bS, (byte)$$0.f());
      this.an().a(bT, (byte)$$0.g().a());
   }

   public aph B() {
      int $$0 = this.an().a(bS);
      bqi $$1 = bqi.d.apply(this.an().a(bT));
      return new aph(this.cX, this.cW, this.cM, this.cN, $$0, $$1, this.di, this.dj);
   }

   public boolean C() {
      return this.cN;
   }

   public cjr D() {
      return this.cM;
   }

   private boolean u(boolean $$0) {
      return this.cM == cjr.c ? $$0 : true;
   }

   private boolean gF() {
      return this.cM == cjr.a;
   }

   public int E() {
      return this.cW;
   }

   public void a(ais $$0) {
      this.d.b(new adp($$0.a(), $$0.d().map(ais.a::a)));
   }

   @Override
   protected int F() {
      return this.e.c(this.fY());
   }

   @Override
   public void G() {
      this.cO = ac.b();
   }

   public aus H() {
      return this.cA;
   }

   public aur I() {
      return this.cS;
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

   public bpv K() {
      return (bpv)(this.cP == null ? this : this.cP);
   }

   @Override
   public void d(@Nullable bpv $$0) {
      bpv $$1 = this.K();
      this.cP = (bpv)($$0 == null ? this : $$0);
      if ($$1 != this.cP) {
         if (this.cP.dM() instanceof aps $$2) {
            this.a($$2, this.cP.dr(), this.cP.dt(), this.cP.dx(), Set.of(), this.dC(), this.dE());
         }

         if ($$0 != null) {
            this.z().l().a(this);
         }

         this.d.b(new adw(this.cP));
         this.d.m();
      }
   }

   @Override
   protected void L() {
      if (!this.cQ) {
         super.L();
      }
   }

   @Override
   public void e(bpv $$0) {
      if (this.f.b() == cyu.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long M() {
      return this.cO;
   }

   @Nullable
   public wg N() {
      return null;
   }

   @Override
   public void a(bnz $$0) {
      super.a($$0);
      this.gt();
   }

   public boolean O() {
      return this.cQ;
   }

   public void P() {
      this.cQ = false;
   }

   public akb Q() {
      return this.cz;
   }

   public void a(aps $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      this.d(this);
      this.ac();
      if ($$0 == this.dM()) {
         this.d.a($$1, $$2, $$3, $$4, $$5);
      } else {
         aps $$6 = this.z();
         emn $$7 = $$0.A_();
         this.d.b(new adl(this.d($$0), (byte)3));
         this.d.b(new abl($$7.q(), $$7.r()));
         this.e.ah().d(this);
         $$6.a(this, bpv.c.e);
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
   public ib R() {
      return this.de;
   }

   public float S() {
      return this.dg;
   }

   public ajs<cyx> T() {
      return this.dd;
   }

   public boolean U() {
      return this.df;
   }

   public void a(ajs<cyx> $$0, @Nullable ib $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.de) && $$0.equals(this.dd);
         if ($$4 && !$$5) {
            this.a(wg.c("block.minecraft.set_spawn"));
         }

         this.de = $$1;
         this.dd = $$0;
         this.dg = $$2;
         this.df = $$3;
      } else {
         this.de = null;
         this.dd = cyx.h;
         this.dg = 0.0F;
         this.df = false;
      }
   }

   public je V() {
      return this.db;
   }

   public void a(je $$0) {
      this.db = $$0;
   }

   public apg W() {
      return this.dc;
   }

   public void a(apg $$0) {
      this.dc = $$0;
   }

   @Override
   public void a(aul $$0, aun $$1, float $$2, float $$3) {
      this.d.b(new aes(kr.b.e($$0), $$1, this.dr(), this.dt(), this.dx(), $$2, $$3, this.ag.g()));
   }

   @Override
   public cgd a(crj $$0, boolean $$1, boolean $$2) {
      cgd $$3 = super.a($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dM().b($$3);
         crj $$4 = $$3.p();
         if ($$2) {
            if (!$$4.d()) {
               this.a(auw.f.b($$4.f()), $$0.G());
            }

            this.a(auw.F);
         }

         return $$3;
      }
   }

   public aqx X() {
      return this.dh;
   }

   public void c(aps $$0) {
      this.a((cyx)$$0);
      this.f.a($$0);
   }

   @Nullable
   private static cyu a(@Nullable tm $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? cyu.a($$0.h($$1)) : null;
   }

   private cyu b(@Nullable cyu $$0) {
      cyu $$1 = this.e.bf();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.e.u_();
      }
   }

   @Override
   public void c(@Nullable tm $$0) {
      this.f.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void k(tm $$0) {
      $$0.a("playerGameType", this.f.b().a());
      cyu $$1 = this.f.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean Y() {
      return this.di;
   }

   public boolean b(apt $$0) {
      return $$0 == this ? false : this.di || $$0.di;
   }

   @Override
   public boolean a(cyx $$0, ib $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(crj $$0) {
      am.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cjs $$1 = this.fZ();
      crj $$2 = $$1.a($$0);
      this.bY.b($$1, $$1.l).ifPresent($$1x -> this.bY.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean Z() {
      return this.dj;
   }

   @Override
   public Optional<ciz> aa() {
      return Optional.of(this.dk);
   }

   @Override
   public void a(cgd $$0) {
      super.a($$0);
      bpv $$1 = $$0.u();
      if ($$1 != null) {
         am.S.a(this, $$0.p(), $$1);
      }
   }

   public void a(wx $$0) {
      this.dn = $$0;
   }

   @Nullable
   public wx ab() {
      return this.dn != null && this.dn.b() ? null : this.dn;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cr = (float)(axk.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dC());
      this.d.b(new ach(this));
   }

   @Override
   public boolean a(bpv $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         $$0.j(this);
         this.d.a(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
         if ($$0 instanceof bqo $$2) {
            for (bph $$3 : $$2.eu()) {
               this.d.b(new afe($$0.aj(), $$3, false));
            }
         }

         return true;
      }
   }

   @Override
   public void ac() {
      bpv $$0 = this.cZ();
      super.ac();
      if ($$0 instanceof bqo $$1) {
         for (bph $$2 : $$1.eu()) {
            this.d.b(new adj($$0.aj(), $$2.b()));
         }
      }
   }

   public afg d(aps $$0) {
      return new afg($$0.ad(), $$0.ae(), czy.a($$0.C()), this.f.b(), this.f.c(), $$0.ah(), $$0.B(), this.gy(), this.av());
   }
}
