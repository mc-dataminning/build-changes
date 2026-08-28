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

public class ari extends cnu {
   private static final Logger cv = LogUtils.getLogger();
   private static final int cw = 32;
   private static final int cx = 10;
   private static final int cy = 25;
   public static final double b = 1.0;
   private static final bvp cA = new bvp(alc.b("creative_mode_block_range"), 0.5, bvp.a.a);
   private static final bvp cB = new bvp(alc.b("creative_mode_entity_range"), 2.0, bvp.a.a);
   public asj c;
   public final MinecraftServer d;
   public final arj e;
   private final alk cC;
   private final awk cD;
   private float cE = Float.MIN_VALUE;
   private int cF = Integer.MIN_VALUE;
   private int cG = Integer.MIN_VALUE;
   private int cH = Integer.MIN_VALUE;
   private int cI = Integer.MIN_VALUE;
   private int cJ = Integer.MIN_VALUE;
   private float cK = -1.0E8F;
   private int cL = -99999999;
   private boolean cM = true;
   private int cN = -99999999;
   private int cO = 60;
   private cns cP = cns.a;
   private ara cQ = ara.a;
   private boolean cR = true;
   private long cS = ad.c();
   @Nullable
   private bto cT;
   private boolean cU;
   public boolean f;
   private final awj cV = new awj();
   @Nullable
   private eys cW;
   private int cX;
   private boolean cY;
   private int cZ = 2;
   private String da = "en_us";
   @Nullable
   private eys db;
   @Nullable
   private eys dc;
   @Nullable
   private eys dd;
   private kg de = kg.a(0, 0, 0);
   private aqs df = aqs.a;
   private alb<deg> dg = deg.h;
   @Nullable
   private je dh;
   private boolean di;
   private float dj;
   private final asp dk;
   private boolean dl;
   private boolean dm;
   private boolean dn;
   private cna do = new cna(0, 0, 0);
   @Nullable
   private je dp;
   private eys dq = eys.c;
   private final crl dr = new crl() {
      @Override
      public void a(cqw $$0, jw<cvp> $$1, cvp $$2, int[] $$3) {
         ari.this.c.b(new acu($$0.l, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cqw $$0, int $$1, cvp $$2) {
         ari.this.c.b(new acw($$0.l, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cqw $$0, cvp $$1) {
         ari.this.c.b(new afc($$1.u()));
      }

      @Override
      public void a(cqw $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cqw $$0, int $$1, int $$2) {
         ari.this.c.b(new acv($$0.l, $$1, $$2));
      }
   };
   private final crk ds = new crk() {
      @Override
      public void a(cqw $$0, int $$1, cvp $$2) {
         cst $$3 = $$0.b($$1);
         if (!($$3 instanceof csp)) {
            if ($$3.c == ari.this.gc()) {
               an.f.a(ari.this, ari.this.gc(), $$2);
            }
         }
      }

      @Override
      public void a(cqw $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private xu dt;
   @Nullable
   public final Object g;
   private int du;
   public boolean h;

   public ari(MinecraftServer $$0, arh $$1, GameProfile $$2, aqt $$3) {
      super($$1, $$1.W(), $$1.X(), $$2);
      this.dk = $$0.a(this);
      this.e = $$0.b(this);
      this.d = $$0;
      this.cD = $$0.ag().a((cnu)this);
      this.cC = $$0.ag().g(this);
      this.b(this.a($$1, $$1.W()).c(), 0.0F, 0.0F);
      this.a($$3);
      this.g = null;
   }

   @Override
   public je a(arh $$0, je $$1) {
      eyn $$2 = this.a(buw.a).a(eys.c);
      je $$3 = $$1;
      if ($$0.B_().g() && $$0.o().ba().k() != ded.c) {
         int $$4 = Math.max(0, this.d.a($$0));
         int $$5 = azd.a($$0.A_().b((double)$$1.u(), (double)$$1.w()));
         if ($$5 < $$4) {
            $$4 = $$5;
         }

         if ($$5 <= 1) {
            $$4 = 1;
         }

         long $$6 = (long)($$4 * 2 + 1);
         long $$7 = $$6 * $$6;
         int $$8 = $$7 > 2147483647L ? Integer.MAX_VALUE : (int)$$7;
         int $$9 = this.t($$8);
         int $$10 = azl.a().a($$8);

         for (int $$11 = 0; $$11 < $$8; $$11++) {
            int $$12 = ($$10 + $$9 * $$11) % $$8;
            int $$13 = $$12 % ($$4 * 2 + 1);
            int $$14 = $$12 / ($$4 * 2 + 1);
            int $$15 = $$1.u() + $$13 - $$4;
            int $$16 = $$1.w() + $$14 - $$4;

            try {
               $$3 = arc.a($$0, $$15, $$16);
               if ($$3 != null && this.a($$0, $$2.c($$3.c()))) {
                  return $$3;
               }
            } catch (Exception var25) {
               int $$18 = $$11;
               int $$19 = $$4;
               o $$20 = o.a(var25, "Searching for spawn");
               p $$21 = $$20.a("Spawn Lookup");
               $$21.a("Origin", $$1::toString);
               $$21.a("Radius", () -> Integer.toString($$19));
               $$21.a("Candidate", () -> "[" + $$15 + "," + $$16 + "]");
               $$21.a("Progress", () -> $$18 + " out of " + $$8);
               throw new z($$20);
            }
         }

         $$3 = $$1;
      }

      while (!this.a($$0, $$2.c($$3.c())) && $$3.v() < $$0.an()) {
         $$3 = $$3.d();
      }

      while (this.a($$0, $$2.c($$3.e().c())) && $$3.v() > $$0.G_() + 1) {
         $$3 = $$3.e();
      }

      return $$3;
   }

   private boolean a(arh $$0, eyn $$1) {
      return $$0.a(this, $$1, true);
   }

   private int t(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         cna.a.parse(new Dynamic(ut.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(cv::error).ifPresent($$0x -> this.do = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         uf $$1 = $$0.p("enteredNetherPosition");
         this.dc = new eys($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.f = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cV.a($$0.p("recipeBook"), this.d.aI());
      }

      if (this.fM()) {
         this.fN();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.dh = new je($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.di = $$0.q("SpawnForced");
         this.dj = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.dg = deg.g.parse(ut.a, $$0.c("SpawnDimension")).resultOrPartial(cv::error).orElse(deg.h);
         }
      }

      this.dn = $$0.q("spawn_extra_particles_on_fall");
      vc $$2 = $$0.c("raid_omen_position");
      if ($$2 != null) {
         je.a.parse(ut.a, $$2).resultOrPartial(cv::error).ifPresent($$0x -> this.dp = $$0x);
      }
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      cna.a.encodeStart(ut.a, this.do).resultOrPartial(cv::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.f);
      if (this.dc != null) {
         uf $$1 = new uf();
         $$1.a("x", this.dc.d);
         $$1.a("y", this.dc.e);
         $$1.a("z", this.dc.f);
         $$0.a("enteredNetherPosition", $$1);
      }

      bto $$2 = this.dd();
      bto $$3 = this.dg();
      if ($$3 != null && $$2 != this && $$2.dc()) {
         uf $$4 = new uf();
         uf $$5 = new uf();
         $$2.e($$5);
         $$4.a("Attach", $$3.cD());
         $$4.a("Entity", $$5);
         $$0.a("RootVehicle", $$4);
      }

      $$0.a("recipeBook", this.cV.b());
      $$0.a("Dimension", this.dS().ag().a().toString());
      if (this.dh != null) {
         $$0.a("SpawnX", this.dh.u());
         $$0.a("SpawnY", this.dh.v());
         $$0.a("SpawnZ", this.dh.w());
         $$0.a("SpawnForced", this.di);
         $$0.a("SpawnAngle", this.dj);
         alc.a.encodeStart(ut.a, this.dg.a()).resultOrPartial(cv::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }

      $$0.a("spawn_extra_particles_on_fall", this.dn);
      if (this.dp != null) {
         je.a.encodeStart(ut.a, this.dp).resultOrPartial(cv::error).ifPresent($$1 -> $$0.a("raid_omen_position", $$1));
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gl();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.co = azd.a((float)$$0 / $$1, 0.0F, $$2);
      this.cN = -1;
   }

   public void b(int $$0) {
      this.cm = $$0;
      this.cN = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cN = -1;
   }

   @Override
   public void a(cvp $$0, int $$1) {
      super.a($$0, $$1);
      this.cN = -1;
   }

   private void a(cqw $$0) {
      $$0.a(this.ds);
      $$0.a(this.dr);
   }

   public void h() {
      this.a(this.bY);
   }

   @Override
   public void f_() {
      super.f_();
      this.c.b(aed.a);
   }

   @Override
   public void g_() {
      super.g_();
      this.c.b(new aec(this.eO()));
   }

   @Override
   public void a(duo $$0) {
      an.e.a(this, $$0);
   }

   @Override
   protected cvl k() {
      return new cwp(this);
   }

   @Override
   public void l() {
      this.e.a();
      this.do.a();
      this.cO--;
      if (this.ak > 0) {
         this.ak--;
      }

      this.bZ.d();
      if (!this.dS().B && !this.bZ.b(this)) {
         this.s();
         this.bZ = this.bY;
      }

      bto $$0 = this.M();
      if ($$0 != this) {
         if ($$0.bI()) {
            this.a($$0.dx(), $$0.dz(), $$0.dD(), $$0.dI(), $$0.dK());
            this.B().l().a(this);
            if (this.fT()) {
               this.d(this);
            }
         } else {
            this.d(this);
         }
      }

      an.x.a(this);
      if (this.cW != null) {
         an.v.a(this, this.cW, this.ag - this.cX);
      }

      this.o();
      this.p();
      this.gI();
      this.cC.b(this);
   }

   private void gI() {
      bvn $$0 = this.g(bvr.g);
      if ($$0 != null) {
         if (this.f()) {
            $$0.a(cA);
         } else {
            $$0.e(cA);
         }
      }

      bvn $$1 = this.g(bvr.j);
      if ($$1 != null) {
         if (this.f()) {
            $$1.a(cB);
         } else {
            $$1.e(cB);
         }
      }
   }

   public void m() {
      try {
         if (!this.P_() || !this.dl()) {
            super.l();
         }

         for (int $$0 = 0; $$0 < this.gc().b(); $$0++) {
            cvp $$1 = this.gc().a($$0);
            if ($$1.h().an_()) {
               zk<?> $$2 = ((cua)$$1.h()).a($$1, this.dS(), this);
               if ($$2 != null) {
                  this.c.b($$2);
               }
            }
         }

         if (this.eA() != this.cK || this.cL != this.ca.a() || this.ca.e() == 0.0F != this.cM) {
            this.c.b(new afk(this.eA(), this.ca.a(), this.ca.e()));
            this.cK = this.eA();
            this.cL = this.ca.a();
            this.cM = this.ca.e() == 0.0F;
         }

         if (this.eA() + this.fs() != this.cE) {
            this.cE = this.eA() + this.fs();
            this.a(faa.g, azd.f(this.cE));
         }

         if (this.ca.a() != this.cF) {
            this.cF = this.ca.a();
            this.a(faa.h, azd.f((float)this.cF));
         }

         if (this.cq() != this.cG) {
            this.cG = this.cq();
            this.a(faa.i, azd.f((float)this.cG));
         }

         if (this.eN() != this.cH) {
            this.cH = this.eN();
            this.a(faa.j, azd.f((float)this.cH));
         }

         if (this.cn != this.cJ) {
            this.cJ = this.cn;
            this.a(faa.k, azd.f((float)this.cJ));
         }

         if (this.cm != this.cI) {
            this.cI = this.cm;
            this.a(faa.l, azd.f((float)this.cI));
         }

         if (this.cn != this.cN) {
            this.cN = this.cn;
            this.c.b(new afj(this.co, this.cn, this.cm));
         }

         if (this.ag % 20 == 0) {
            an.q.a(this);
         }
      } catch (Throwable var4) {
         o $$4 = o.a(var4, "Ticking player");
         p $$5 = $$4.a("Player being ticked");
         this.a($$5);
         throw new z($$4);
      }
   }

   @Override
   public void n() {
      if (this.eA() > 0.0F && this.db != null) {
         an.X.a(this, this.db);
      }

      this.db = null;
      super.n();
   }

   @Override
   public void o() {
      if (this.aa > 0.0F && this.db == null) {
         this.db = this.dq();
         if (this.ct != null && this.ct.e <= this.db.e) {
            an.ae.a(this, this.ct, this.cu);
         }
      }
   }

   public void p() {
      if (this.dg() != null && this.dg().bw()) {
         if (this.dd == null) {
            this.dd = this.dq();
         } else {
            an.Y.a(this, this.dd);
         }
      }

      if (this.dd != null && (this.dg() == null || !this.dg().bw())) {
         this.dd = null;
      }
   }

   private void a(faa $$0, int $$1) {
      this.gr().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(bsg $$0) {
      this.a(dzl.p);
      boolean $$1 = this.dS().ac().b(dec.n);
      if ($$1) {
         xd $$2 = this.eO().a();
         this.c.a(new aee(this.ap(), $$2), wk.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            xd $$3x = xd.a("death.attack.message_too_long", xd.b($$2x).a(n.o));
            xd $$4x = xd.a("death.attack.even_more_magic", this.Q_()).a($$1xx -> $$1xx.a(new xj(xj.a.a, $$3x)));
            return new aee(this.ap(), $$4x);
         }));
         ezz $$3 = this.co();
         if ($$3 == null || $$3.k() == ezz.b.a) {
            this.d.ag().a($$2, false);
         } else if ($$3.k() == ezz.b.c) {
            this.d.ag().a(this, $$2);
         } else if ($$3.k() == ezz.b.d) {
            this.d.ag().b(this, $$2);
         }
      } else {
         this.c.b(new aee(this.ap(), xc.a));
      }

      this.gq();
      if (this.dS().ac().b(dec.N)) {
         this.gJ();
      }

      if (!this.P_()) {
         this.a(this.B(), $$0);
      }

      this.gr().a(faa.d, this, ezv::b);
      buk $$4 = this.eP();
      if ($$4 != null) {
         this.b(awo.h.b($$4.ao()));
         $$4.a(this, this.bh, $$0);
         this.f($$4);
      }

      this.dS().a(this, (byte)3);
      this.a(awo.N);
      this.a(awo.i.b(awo.m));
      this.a(awo.i.b(awo.n));
      this.aF();
      this.k(0);
      this.c(false);
      this.eO().c();
      this.a(Optional.of(jm.a(this.dS().ag(), this.ds())));
   }

   private void gJ() {
      eyn $$0 = new eyn(this.ds()).c(32.0, 10.0, 32.0);
      this.dS().a(bum.class, $$0, btt.f).stream().filter($$0x -> $$0x instanceof bup).forEach($$0x -> ((bup)$$0x).a_((cnu)this));
   }

   @Override
   public void a(bto $$0, int $$1, bsg $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.s($$1);
         this.gr().a(faa.f, this, ezv::b);
         if ($$0 instanceof cnu) {
            this.a(awo.Q);
            this.gr().a(faa.e, this, ezv::b);
         } else {
            this.a(awo.O);
         }

         this.a(this, $$0, faa.m);
         this.a($$0, this, faa.n);
         an.c.a(this, $$0, $$2);
      }
   }

   private void a(ezw $$0, ezw $$1, faa[] $$2) {
      ezs $$3 = this.gr().e($$1.cF());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gr().a($$2[$$4], $$0, ezv::b);
         }
      }
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.d.n() && this.gK() && $$0.a(awv.m);
         if (!$$2 && this.cO > 0 && !$$0.a(awv.d)) {
            return false;
         } else {
            bto $$3 = $$0.d();
            if ($$3 instanceof cnu $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof cob $$5 && $$5.s() instanceof cnu $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(cnu $$0) {
      return !this.gK() ? false : super.a($$0);
   }

   private boolean gK() {
      return this.d.ac();
   }

   public ern a(boolean $$0, ern.a $$1) {
      je $$2 = this.U();
      float $$3 = this.V();
      boolean $$4 = this.X();
      arh $$5 = this.d.a(this.W());
      if ($$5 != null && $$2 != null) {
         Optional<ari.a> $$6 = a($$5, $$2, $$3, $$4, $$0);
         if ($$6.isPresent()) {
            ari.a $$7 = $$6.get();
            return new ern($$5, $$7.a(), eys.c, $$7.b(), 0.0F, $$1);
         } else {
            return ern.a(this.d.J(), this, $$1);
         }
      } else {
         return new ern(this.d.J(), this, $$1);
      }
   }

   private static Optional<ari.a> a(arh $$0, je $$1, float $$2, boolean $$3, boolean $$4) {
      duo $$5 = $$0.a_($$1);
      dhj $$6 = $$5.b();
      if ($$6 instanceof dns && ($$3 || $$5.c(dns.d) > 0) && dns.a($$0)) {
         Optional<eys> $$7 = dns.a(btv.by, $$0, $$1);
         if (!$$3 && $$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.b(dns.d, Integer.valueOf($$5.c(dns.d) - 1)), 3);
         }

         return $$7.map($$1x -> ari.a.a($$1x, $$1));
      } else if ($$6 instanceof dhc && dhc.a($$0)) {
         return dhc.a(btv.by, $$0, $$1, $$5.c(dhc.aF), $$2).map($$1x -> ari.a.a($$1x, $$1));
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         duo $$9 = $$0.a_($$1.d());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new ari.a(new eys((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5), $$2)) : Optional.empty();
      }
   }

   @Override
   public void q() {
      this.am();
      this.B().a(this, bto.c.e);
      if (!this.h) {
         this.h = true;
         this.c.b(new adg(adg.f, 0.0F));
         this.f = true;
      }
   }

   @Nullable
   public cnu a(ern $$0) {
      if (this.dN()) {
         return null;
      } else {
         if ($$0.f()) {
            this.c.b(new adg(adg.b, 0.0F));
         }

         arh $$1 = $$0.a();
         arh $$2 = this.B();
         alb<deg> $$3 = $$2.ag();
         this.c($$0);
         if ($$1.ag() == $$3) {
            this.c.a($$0.b().d, $$0.b().e, $$0.b().f, $$0.d(), $$0.e());
            this.c.l();
            $$0.g().onTransition(this);
            return this;
         } else {
            this.cU = true;
            esr $$4 = $$1.y_();
            this.c.b(new aeo(this.b($$1), (byte)3));
            this.c.b(new acm($$4.q(), $$4.r()));
            avh $$5 = this.d.ag();
            $$5.e(this);
            $$2.a(this, bto.c.e);
            this.dP();
            $$2.ah().a("moving");
            if ($$3 == deg.h && $$1.ag() == deg.i) {
               this.dc = this.dq();
            }

            $$2.ah().c();
            $$2.ah().a("placing");
            this.a($$1);
            this.c.a($$0.b().d, $$0.b().e, $$0.b().f, $$0.d(), $$0.e());
            this.c.l();
            $$1.d(this);
            $$2.ah().c();
            this.c($$2);
            this.fB();
            this.c.b(new aea(this.gd()));
            $$5.a(this, $$1);
            $$5.f(this);
            $$5.d(this);
            $$0.g().onTransition(this);
            this.cN = -1;
            this.cK = -1.0F;
            this.cL = -1;
            return this;
         }
      }
   }

   private void c(arh $$0) {
      alb<deg> $$1 = $$0.ag();
      alb<deg> $$2 = this.dS().ag();
      an.w.a(this, $$1, $$2);
      if ($$1 == deg.i && $$2 == deg.h && this.dc != null) {
         an.D.a(this, this.dc);
      }

      if ($$2 != deg.i) {
         this.dc = null;
      }
   }

   @Override
   public boolean a(ari $$0) {
      if ($$0.P_()) {
         return this.M() == this;
      } else {
         return this.P_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bto $$0, int $$1) {
      super.a($$0, $$1);
      this.bZ.d();
   }

   @Override
   public Either<cnu.a, bai> a(je $$0) {
      jj $$1 = this.dS().a_($$0).c(dlf.aF);
      if (this.fM() || !this.bI()) {
         return Either.left(cnu.a.e);
      } else if (!this.dS().B_().j()) {
         return Either.left(cnu.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cnu.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cnu.a.d);
      } else {
         this.a(this.dS().ag(), $$0, this.dI(), false, true);
         if (this.dS().S()) {
            return Either.left(cnu.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               eys $$4 = eys.c($$0);
               List<cla> $$5 = this.dS()
                  .a(cla.class, new eyn($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.a(this));
               if (!$$5.isEmpty()) {
                  return Either.left(cnu.a.f);
               }
            }

            Either<cnu.a, bai> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(awo.ap);
               an.r.a(this);
            });
            if (!this.B().d()) {
               this.a(xd.c("sleep.not_possible"), true);
            }

            ((arh)this.dS()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(je $$0) {
      this.a(awo.i.b(awo.n));
      super.b($$0);
   }

   private boolean a(je $$0, jj $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(je $$0) {
      eys $$1 = eys.c($$0);
      return Math.abs(this.dx() - $$1.a()) <= 3.0 && Math.abs(this.dz() - $$1.b()) <= 2.0 && Math.abs(this.dD() - $$1.c()) <= 3.0;
   }

   private boolean b(je $$0, jj $$1) {
      je $$2 = $$0.d();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fM()) {
         this.B().l().a(this, new acc(this, 2));
      }

      super.a($$0, $$1);
      if (this.c != null) {
         this.c.a(this.dx(), this.dz(), this.dD(), this.dI(), this.dK());
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.bN();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public boolean b(bsg $$0) {
      return super.b($$0) || this.R() && !$$0.a(bsj.m);
   }

   @Override
   protected void a(double $$0, boolean $$1, duo $$2, je $$3) {
   }

   @Override
   protected void b(arh $$0, je $$1) {
      if (!this.P_()) {
         super.b($$0, $$1);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.dl()) {
         this.a($$3, new eys($$0, $$1, $$2));
         je $$4 = this.aN();
         duo $$5 = this.dS().a_($$4);
         if (this.dn && $$3 && this.aa > 0.0F) {
            eys $$6 = $$4.b().b(0.0, 0.5, 0.0);
            int $$7 = (int)azd.a(50.0F * this.aa, 0.0F, 200.0F);
            this.B().a(new lf(ln.b, $$5), $$6.d, $$6.e, $$6.f, $$7, 0.3F, 0.3F, 0.3F, 0.15F);
            this.dn = false;
         }

         super.a($$1, $$3, $$5, $$4);
      }
   }

   @Override
   public void a(@Nullable bto $$0) {
      super.a($$0);
      this.ct = this.dq();
      this.cu = $$0;
      this.w($$0 != null && $$0.ao() == btv.bn);
   }

   @Override
   protected void r() {
      if (this.dS().s().i()) {
         super.r();
      }
   }

   @Override
   public void a(dte $$0, boolean $$1) {
      this.c.b(new aci(this.dS(), $$0.aB_()));
      this.c.b(new ady($$0.aB_(), $$1));
   }

   private void gL() {
      this.du = this.du % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable brr $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.bZ != this.bY) {
            this.s();
         }

         this.gL();
         cqw $$1 = $$0.createMenu(this.du, this.gc(), this);
         if ($$1 == null) {
            if (this.P_()) {
               this.a(xd.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.c.b(new adx($$1.l, $$1.a(), $$0.Q_()));
            this.a($$1);
            this.bZ = $$1;
            return OptionalInt.of(this.du);
         }
      }
   }

   @Override
   public void a(int $$0, dde $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.c.b(new ads($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(cie $$0, bri $$1) {
      if (this.bZ != this.bY) {
         this.s();
      }

      this.gL();
      int $$2 = $$0.ae_();
      this.c.b(new adh(this.du, $$2, $$0.ap()));
      this.bZ = new cry(this.du, this.gc(), $$1, $$0, $$2);
      this.a(this.bZ);
   }

   @Override
   public void a(cvp $$0, bro $$1) {
      if ($$0.a(cvt.ub)) {
         if (cxl.a($$0, this.dk(), this)) {
            this.bZ.d();
         }

         this.c.b(new adw($$1));
      }
   }

   @Override
   public void a(dsc $$0) {
      this.c.b(acg.a($$0, drs::e));
   }

   @Override
   public void s() {
      this.c.b(new act(this.bZ.l));
      this.t();
   }

   @Override
   public void t() {
      this.bZ.a(this);
      this.bY.a(this.bZ);
      this.bZ = this.bY;
   }

   @Override
   public void u() {
      double $$0 = this.dx();
      double $$1 = this.dz();
      double $$2 = this.dD();
      super.u();
      this.q(this.dx() - $$0, this.dz() - $$1, this.dD() - $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (!this.bW() && !r($$0, $$1, $$2)) {
         if (this.ch()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(awo.C, $$3);
               this.G(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(awz.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(awo.w, $$4);
               this.G(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.bi()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(awo.s, $$5);
               this.G(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.p_()) {
            if ($$1 > 0.0) {
               this.a(awo.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aH()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.cg()) {
                  this.a(awo.r, $$6);
                  this.G(0.1F * (float)$$6 * 0.01F);
               } else if (this.cf()) {
                  this.a(awo.q, $$6);
                  this.G(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(awo.p, $$6);
                  this.G(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fF()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(awo.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(awo.v, $$8);
            }
         }
      }
   }

   private void q(double $$0, double $$1, double $$2) {
      if (this.bW() && !r($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         bto $$4 = this.dg();
         if ($$4 instanceof cps) {
            this.a(awo.x, $$3);
         } else if ($$4 instanceof cpu) {
            this.a(awo.y, $$3);
         } else if ($$4 instanceof cgr) {
            this.a(awo.z, $$3);
         } else if ($$4 instanceof cie) {
            this.a(awo.A, $$3);
         } else if ($$4 instanceof cln) {
            this.a(awo.D, $$3);
         }
      }
   }

   private static boolean r(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(awl<?> $$0, int $$1) {
      this.cD.b(this, $$0, $$1);
      this.gr().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(awl<?> $$0) {
      this.cD.a(this, $$0, 0);
      this.gr().a($$0, this, ezv::c);
   }

   @Override
   public int a(Collection<daj<?>> $$0) {
      return this.cV.a($$0, this);
   }

   @Override
   public void a(daj<?> $$0, List<cvp> $$1) {
      an.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<alc> $$0) {
      List<daj<?>> $$1 = $$0.stream().flatMap($$0x -> this.d.aI().a($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<daj<?>> $$0) {
      return this.cV.b($$0, this);
   }

   @Override
   public void v() {
      super.v();
      this.a(awo.E);
      if (this.cg()) {
         this.G(0.2F);
      } else {
         this.G(0.05F);
      }
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cN = -1;
   }

   @Override
   public void w() {
      this.cY = true;
      this.bM();
      if (this.fM()) {
         this.a(true, false);
      }
   }

   public boolean x() {
      return this.cY;
   }

   public void y() {
      this.cK = -1.0E8F;
   }

   @Override
   public void a(xd $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void z() {
      if (!this.bv.f() && this.fv()) {
         this.c.b(new add(this, (byte)9));
         super.z();
      }
   }

   @Override
   public void a(ff.a $$0, eys $$1) {
      super.a($$0, $$1);
      this.c.b(new aeh($$0, $$1.d, $$1.e, $$1.f));
   }

   public void a(ff.a $$0, bto $$1, ff.a $$2) {
      eys $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.c.b(new aeh($$0, $$1, $$2));
   }

   public void a(ari $$0, boolean $$1) {
      this.do = $$0.do;
      this.dt = $$0.dt;
      this.e.a($$0.e.b(), $$0.e.c());
      this.A();
      if ($$1) {
         this.eV().b($$0.eV());
         this.eV().c($$0.eV());
         this.x($$0.eA());
         this.ca = $$0.ca;

         for (bsv $$2 : $$0.ex()) {
            this.a(new bsv($$2));
         }

         this.gc().a($$0.gc());
         this.cm = $$0.cm;
         this.cn = $$0.cn;
         this.co = $$0.co;
         this.r($$0.fX());
         this.at = $$0.at;
      } else {
         this.eV().b($$0.eV());
         this.x(this.eQ());
         if (this.dS().ac().b(dec.d) || $$0.P_()) {
            this.gc().a($$0.gc());
            this.cm = $$0.cm;
            this.cn = $$0.cn;
            this.co = $$0.co;
            this.r($$0.fX());
         }
      }

      this.cp = $$0.cp;
      this.bX = $$0.bX;
      this.at().a(bT, $$0.at().a(bT));
      this.cN = -1;
      this.cK = -1.0F;
      this.cL = -1;
      this.cV.a($$0.cV);
      this.f = $$0.f;
      this.dc = $$0.dc;
      this.df = $$0.df;
      this.i($$0.gt());
      this.j($$0.gu());
      this.a($$0.gB());
   }

   @Override
   protected void a(bsv $$0, @Nullable bto $$1) {
      super.a($$0, $$1);
      this.c.b(new agj(this.ap(), $$0, true));
      if ($$0.a(bsx.y)) {
         this.cX = this.ag;
         this.cW = this.dq();
      }

      an.B.a(this, $$1);
   }

   @Override
   protected void a(bsv $$0, boolean $$1, @Nullable bto $$2) {
      super.a($$0, $$1, $$2);
      this.c.b(new agj(this.ap(), $$0, false));
      an.B.a(this, $$2);
   }

   @Override
   protected void c(Collection<bsv> $$0) {
      super.c($$0);

      for (bsv $$1 : $$0) {
         this.c.b(new aem(this.ap(), $$1.c()));
         if ($$1.a(bsx.y)) {
            this.cW = null;
         }
      }

      an.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.c.a($$0, $$1, $$2, this.dI(), this.dK(), bux.g);
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.c.a(this.dx() + $$0, this.dz() + $$1, this.dD() + $$2, this.dI(), this.dK(), bux.f);
   }

   @Override
   public boolean a(arh $$0, double $$1, double $$2, double $$3, Set<bux> $$4, float $$5, float $$6, boolean $$7) {
      ddm $$8 = new ddm(je.a($$1, $$2, $$3));
      $$0.l().a(arm.f, $$8, 1, this.ap());
      if (this.fM()) {
         this.a(true, true);
      }

      this.a($$0, $$1, $$2, $$3, $$5, $$6, $$7);
      this.q($$5);
      return true;
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      super.e($$0, $$1, $$2);
      this.c.l();
   }

   @Override
   public void b(bto $$0) {
      this.B().l().a(this, new acc($$0, 4));
   }

   @Override
   public void c(bto $$0) {
      this.B().l().a(this, new acc($$0, 5));
   }

   @Override
   public void A() {
      if (this.c != null) {
         this.c.b(new aea(this.gd()));
         this.L();
      }
   }

   public arh B() {
      return (arh)this.dS();
   }

   public boolean a(ded $$0) {
      boolean $$1 = this.P_();
      if (!this.e.a($$0)) {
         return false;
      } else {
         this.c.b(new adg(adg.e, (float)$$0.a()));
         if ($$0 == ded.d) {
            this.gq();
            this.af();
            dbm.a(this);
         } else {
            this.d(this);
            if ($$1) {
               dbm.a(this.B(), this);
            }
         }

         this.A();
         this.ft();
         return true;
      }
   }

   @Override
   public boolean P_() {
      return this.e.b() == ded.d;
   }

   @Override
   public boolean f() {
      return this.e.b() == ded.b;
   }

   @Override
   public void a(xd $$0) {
      this.b($$0, false);
   }

   public void b(xd $$0, boolean $$1) {
      if (this.x($$1)) {
         this.c.a(new aga($$0, $$1), wk.a(() -> {
            if (this.x(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               xd $$3 = xd.b($$2).a(n.o);
               return new aga(xd.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(xs $$0, boolean $$1, wz.a $$2) {
      if (this.gM()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String C() {
      return this.c.m() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(aqt $$0) {
      this.da = $$0.b();
      this.cZ = $$0.c();
      this.cP = $$0.d();
      this.cR = $$0.e();
      this.dl = $$0.h();
      this.dm = $$0.i();
      this.cQ = $$0.j();
      this.at().a(bT, (byte)$$0.f());
      this.at().a(bU, (byte)$$0.g().b());
   }

   public aqt D() {
      int $$0 = this.at().a(bT);
      bue $$1 = bue.d.apply(this.at().a(bU));
      return new aqt(this.da, this.cZ, this.cP, this.cR, $$0, $$1, this.dl, this.dm, this.cQ);
   }

   public boolean E() {
      return this.cR;
   }

   public cns F() {
      return this.cP;
   }

   private boolean x(boolean $$0) {
      return this.cP == cns.c ? $$0 : true;
   }

   private boolean gM() {
      return this.cP == cns.a;
   }

   public int G() {
      return this.cZ;
   }

   public void a(aka $$0) {
      this.c.b(new aes($$0.a(), $$0.d().map(aka.a::a)));
   }

   @Override
   protected int H() {
      return this.d.c(this.gb());
   }

   @Override
   public void I() {
      this.cS = ad.c();
   }

   public awk J() {
      return this.cD;
   }

   public awj K() {
      return this.cV;
   }

   @Override
   protected void L() {
      if (this.P_()) {
         this.ev();
         this.k(true);
      } else {
         super.L();
      }
   }

   public bto M() {
      return (bto)(this.cT == null ? this : this.cT);
   }

   @Override
   public void d(@Nullable bto $$0) {
      bto $$1 = this.M();
      this.cT = (bto)($$0 == null ? this : $$0);
      if ($$1 != this.cT) {
         if (this.cT.dS() instanceof arh $$2) {
            this.a($$2, this.cT.dx(), this.cT.dz(), this.cT.dD(), Set.of(), this.dI(), this.dK(), false);
         }

         if ($$0 != null) {
            this.B().l().a(this);
         }

         this.c.b(new aez(this.cT));
         this.c.l();
      }
   }

   @Override
   protected void N() {
      if (!this.cU) {
         super.N();
      }
   }

   @Override
   public void e(bto $$0) {
      if (this.e.b() == ded.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long O() {
      return this.cS;
   }

   @Nullable
   public xd P() {
      return null;
   }

   public int Q() {
      return 0;
   }

   @Override
   public void a(bro $$0) {
      super.a($$0);
      this.gw();
   }

   public boolean R() {
      return this.cU;
   }

   public void S() {
      this.cU = false;
   }

   public alk T() {
      return this.cC;
   }

   public void a(arh $$0, double $$1, double $$2, double $$3, float $$4, float $$5, boolean $$6) {
      if ($$6) {
         this.d(this);
      }

      this.af();
      this.a(new ern($$0, new eys($$1, $$2, $$3), eys.c, $$4, $$5, ern.a));
   }

   @Nullable
   public je U() {
      return this.dh;
   }

   public float V() {
      return this.dj;
   }

   public alb<deg> W() {
      return this.dg;
   }

   public boolean X() {
      return this.di;
   }

   public void b(ari $$0) {
      this.a($$0.W(), $$0.U(), $$0.V(), $$0.X(), false);
   }

   public void a(alb<deg> $$0, @Nullable je $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.dh) && $$0.equals(this.dg);
         if ($$4 && !$$5) {
            this.a(xd.c("block.minecraft.set_spawn"));
         }

         this.dh = $$1;
         this.dg = $$0;
         this.dj = $$2;
         this.di = $$3;
      } else {
         this.dh = null;
         this.dg = deg.h;
         this.dj = 0.0F;
         this.di = false;
      }
   }

   public kg Y() {
      return this.de;
   }

   public void a(kg $$0) {
      this.de = $$0;
   }

   public aqs Z() {
      return this.df;
   }

   public void a(aqs $$0) {
      this.df = $$0;
   }

   @Override
   public void a(awd $$0, awf $$1, float $$2, float $$3) {
      this.c.b(new afx(lu.b.e($$0), $$1, this.dx(), this.dz(), this.dD(), $$2, $$3, this.af.g()));
   }

   @Override
   public cke a(cvp $$0, boolean $$1, boolean $$2) {
      cke $$3 = this.b($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dS().b($$3);
         cvp $$4 = $$3.m();
         if ($$2) {
            if (!$$4.f()) {
               this.a(awo.f.b($$4.h()), $$0.J());
            }

            this.a(awo.F);
         }

         return $$3;
      }
   }

   @Nullable
   private cke b(cvp $$0, boolean $$1, boolean $$2) {
      if ($$0.f()) {
         return null;
      } else {
         double $$3 = this.dB() - 0.3F;
         cke $$4 = new cke(this.dS(), this.dx(), $$3, this.dD(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.af.i() * 0.5F;
            float $$6 = this.af.i() * (float) (Math.PI * 2);
            $$4.n((double)(-azd.a($$6) * $$5), 0.2F, (double)(azd.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = azd.a(this.dK() * (float) (Math.PI / 180.0));
            float $$9 = azd.b(this.dK() * (float) (Math.PI / 180.0));
            float $$10 = azd.a(this.dI() * (float) (Math.PI / 180.0));
            float $$11 = azd.b(this.dI() * (float) (Math.PI / 180.0));
            float $$12 = this.af.i() * (float) (Math.PI * 2);
            float $$13 = 0.02F * this.af.i();
            $$4.n(
               (double)(-$$10 * $$9 * 0.3F) + Math.cos((double)$$12) * (double)$$13,
               (double)(-$$8 * 0.3F + 0.1F + (this.af.i() - this.af.i()) * 0.1F),
               (double)($$11 * $$9 * 0.3F) + Math.sin((double)$$12) * (double)$$13
            );
         }

         return $$4;
      }
   }

   public asp aa() {
      return this.dk;
   }

   public void a(arh $$0) {
      this.a((deg)$$0);
      this.e.a($$0);
   }

   @Nullable
   private static ded a(@Nullable uf $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? ded.a($$0.h($$1)) : null;
   }

   private ded b(@Nullable ded $$0) {
      ded $$1 = this.d.be();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.d.t_();
      }
   }

   @Override
   public void c(@Nullable uf $$0) {
      this.e.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void k(uf $$0) {
      $$0.a("playerGameType", this.e.b().a());
      ded $$1 = this.e.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean ab() {
      return this.dl;
   }

   public boolean c(ari $$0) {
      return $$0 == this ? false : this.dl || $$0.dl;
   }

   @Override
   public boolean a(deg $$0, je $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cvp $$0) {
      an.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cnt $$1 = this.gc();
      cvp $$2 = $$1.a($$0);
      this.bZ.b($$1, $$1.j).ifPresent($$1x -> this.bZ.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean ac() {
      return this.dm;
   }

   @Override
   public Optional<cna> ad() {
      return Optional.of(this.do);
   }

   public void b(boolean $$0) {
      this.dn = $$0;
   }

   @Override
   public void a(cke $$0) {
      super.a($$0);
      bto $$1 = $$0.s();
      if ($$1 != null) {
         an.S.a(this, $$0.m(), $$1);
      }
   }

   public void a(xu $$0) {
      this.dt = $$0;
   }

   @Nullable
   public xu ae() {
      return this.dt != null && this.dt.b() ? null : this.dt;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cs = (float)(azd.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dI());
      this.c.b(new adi(this));
   }

   @Override
   public boolean a(bto $$0, boolean $$1) {
      if (super.a($$0, $$1)) {
         $$0.j(this);
         this.c.a(this.dx(), this.dz(), this.dD(), this.dI(), this.dK());
         if ($$0 instanceof buk $$2) {
            this.d.ag().a($$2, this.c);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void af() {
      bto $$0 = this.dg();
      super.af();
      if ($$0 instanceof buk $$1) {
         for (bsv $$2 : $$1.ex()) {
            this.c.b(new aem($$0.ap(), $$2.c()));
         }
      }
   }

   public agl b(arh $$0) {
      return new agl($$0.af(), $$0.ag(), dfj.a($$0.C()), this.e.b(), this.e.c(), $$0.aj(), $$0.B(), this.gB(), this.aB(), $$0.N());
   }

   @Override
   public void c(je $$0) {
      this.dp = $$0;
   }

   public void ag() {
      this.dp = null;
   }

   @Nullable
   public je ah() {
      return this.dp;
   }

   @Override
   public eys ai() {
      bto $$0 = this.dg();
      return $$0 != null && $$0.cU() != this ? $$0.ai() : this.dq;
   }

   public void a(eys $$0) {
      this.dq = $$0;
   }

   @Override
   protected float a(bto $$0, float $$1, bsg $$2) {
      return dbm.a(this.B(), this.dW(), $$0, $$2, $$1);
   }

   @Override
   public void a(cvk $$0, btw $$1) {
      super.a($$0, $$1);
      this.b(awo.d.b($$0));
   }

   static record a(eys a, float b) {
      public static ari.a a(eys $$0, je $$1) {
         return new ari.a($$0, b($$0, $$1));
      }

      private static float b(eys $$0, je $$1) {
         eys $$2 = eys.c($$1).d($$0).d();
         return (float)azd.d(azd.d($$2.f, $$2.d) * 180.0F / (float)Math.PI - 90.0);
      }
   }
}
