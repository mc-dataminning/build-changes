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

public class apg extends cis {
   private static final Logger b = LogUtils.getLogger();
   private static final int cu = 32;
   private static final int cv = 10;
   private static final int cw = 25;
   public static final double c = 1.0;
   private static final bqt cx = new bqt(UUID.fromString("736565d2-e1a7-403d-a3f8-1aeb3e302542"), "Creative block interaction range modifier", 0.5, bqt.a.a);
   private static final bqt cz = new bqt(UUID.fromString("98491ef6-97b1-4584-ae82-71a8cc85cf73"), "Creative entity interaction range modifier", 2.0, bqt.a.a);
   public aqe d;
   public final MinecraftServer e;
   public final aph f;
   private final ajp cA;
   private final aue cB;
   private float cC = Float.MIN_VALUE;
   private int cD = Integer.MIN_VALUE;
   private int cE = Integer.MIN_VALUE;
   private int cF = Integer.MIN_VALUE;
   private int cG = Integer.MIN_VALUE;
   private int cH = Integer.MIN_VALUE;
   private float cI = -1.0E8F;
   private int cJ = -99999999;
   private boolean cK = true;
   private int cL = -99999999;
   private int cM = 60;
   private ciq cN = ciq.a;
   private boolean cO = true;
   private long cP = ac.b();
   @Nullable
   private bow cQ;
   private boolean cR;
   private boolean cS;
   private final aud cT = new aud();
   @Nullable
   private epr cU;
   private int cV;
   private boolean cW;
   private int cX = 2;
   private String cY = "en_us";
   @Nullable
   private epr cZ;
   @Nullable
   private epr da;
   @Nullable
   private epr db;
   private je dc = je.a(0, 0, 0);
   private aot dd = aot.a;
   private ajg<cwz> de = cwz.h;
   @Nullable
   private ib df;
   private boolean dg;
   private float dh;
   private final aqj di;
   private boolean dj;
   private boolean dk;
   private chy dl = new chy(0, 0, 0);
   private final cmb dm = new cmb() {
      @Override
      public void a(clo $$0, iu<cqk> $$1, cqk $$2, int[] $$3) {
         apg.this.d.b(new abh($$0.j, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(clo $$0, int $$1, cqk $$2) {
         apg.this.d.b(new abj($$0.j, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(clo $$0, cqk $$1) {
         apg.this.d.b(new abj(-1, $$0.k(), -1, $$1));
      }

      @Override
      public void a(clo $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(clo $$0, int $$1, int $$2) {
         apg.this.d.b(new abi($$0.j, $$1, $$2));
      }
   };
   private final cma dn = new cma() {
      @Override
      public void a(clo $$0, int $$1, cqk $$2) {
         cnj $$3 = $$0.b($$1);
         if (!($$3 instanceof cnf)) {
            if ($$3.d == apg.this.fZ()) {
               am.f.a(apg.this, apg.this.fZ(), $$2);
            }
         }
      }

      @Override
      public void a(clo $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private wl do;
   private int dp;
   public boolean g;

   public apg(MinecraftServer $$0, apf $$1, GameProfile $$2, aou $$3) {
      super($$1, $$1.T(), $$1.U(), $$2);
      this.di = $$0.a(this);
      this.f = $$0.b(this);
      this.e = $$0;
      this.cB = $$0.ah().a((cis)this);
      this.cA = $$0.ah().f(this);
      this.e($$1);
      this.a($$3);
   }

   private void e(apf $$0) {
      ib $$1 = $$0.T();
      if ($$0.D_().g() && $$0.o().bc().k() != cww.c) {
         int $$2 = Math.max(0, this.e.a($$0));
         int $$3 = aww.a($$0.C_().b((double)$$1.u(), (double)$$1.w()));
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
         int $$8 = axd.a().a($$6);

         for (int $$9 = 0; $$9 < $$6; $$9++) {
            int $$10 = ($$8 + $$7 * $$9) % $$6;
            int $$11 = $$10 % ($$2 * 2 + 1);
            int $$12 = $$10 / ($$2 * 2 + 1);
            ib $$13 = apa.a($$0, $$1.u() + $$11 - $$2, $$1.w() + $$12 - $$2);
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
   public void a(ta $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         chy.a.parse(new Dynamic(to.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(b::error).ifPresent($$0x -> this.dl = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         ta $$1 = $$0.p("enteredNetherPosition");
         this.da = new epr($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.cS = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cT.a($$0.p("recipeBook"), this.e.aJ());
      }

      if (this.fI()) {
         this.fJ();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.df = new ib($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.dg = $$0.q("SpawnForced");
         this.dh = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.de = cwz.g.parse(to.a, $$0.c("SpawnDimension")).resultOrPartial(b::error).orElse(cwz.h);
         }
      }
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      chy.a.encodeStart(to.a, this.dl).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.cS);
      if (this.da != null) {
         ta $$1 = new ta();
         $$1.a("x", this.da.c);
         $$1.a("y", this.da.d);
         $$1.a("z", this.da.e);
         $$0.a("enteredNetherPosition", $$1);
      }

      bow $$2 = this.cW();
      bow $$3 = this.cZ();
      if ($$3 != null && $$2 != this && $$2.cV()) {
         ta $$4 = new ta();
         ta $$5 = new ta();
         $$2.e($$5);
         $$4.a("Attach", $$3.cw());
         $$4.a("Entity", $$5);
         $$0.a("RootVehicle", $$4);
      }

      $$0.a("recipeBook", this.cT.b());
      $$0.a("Dimension", this.dM().ad().a().toString());
      if (this.df != null) {
         $$0.a("SpawnX", this.df.u());
         $$0.a("SpawnY", this.df.v());
         $$0.a("SpawnZ", this.df.w());
         $$0.a("SpawnForced", this.dg);
         $$0.a("SpawnAngle", this.dh);
         ajh.a.encodeStart(to.a, this.de.a()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gi();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.co = aww.a((float)$$0 / $$1, 0.0F, $$2);
      this.cL = -1;
   }

   public void b(int $$0) {
      this.cm = $$0;
      this.cL = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cL = -1;
   }

   @Override
   public void a(cqk $$0, int $$1) {
      super.a($$0, $$1);
      this.cL = -1;
   }

   private void a(clo $$0) {
      $$0.a(this.dn);
      $$0.a(this.dm);
   }

   public void h() {
      this.a(this.bY);
   }

   @Override
   public void f_() {
      super.f_();
      this.d.b(acp.a);
   }

   @Override
   public void g_() {
      super.g_();
      this.d.b(new aco(this.eM()));
   }

   @Override
   protected void a(dmz $$0) {
      am.e.a(this, $$0);
   }

   @Override
   protected cqg k() {
      return new crf(this);
   }

   @Override
   public void l() {
      this.f.a();
      this.dl.a();
      this.cM--;
      if (this.al > 0) {
         this.al--;
      }

      this.bZ.d();
      if (!this.dM().B && !this.bZ.a(this)) {
         this.r();
         this.bZ = this.bY;
      }

      bow $$0 = this.K();
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
      if (this.cU != null) {
         am.v.a(this, this.cU, this.ah - this.cV);
      }

      this.o();
      this.p();
      this.gB();
      this.cA.b(this);
   }

   private void gB() {
      bqr $$0 = this.f(bqv.g);
      if ($$0 != null) {
         if (this.f()) {
            $$0.b(cx);
         } else {
            $$0.e(cx);
         }
      }

      bqr $$1 = this.f(bqv.h);
      if ($$1 != null) {
         if (this.f()) {
            $$1.b(cz);
         } else {
            $$1.e(cz);
         }
      }
   }

   public void m() {
      try {
         if (!this.N_() || !this.de()) {
            super.l();
         }

         for (int $$0 = 0; $$0 < this.fZ().b(); $$0++) {
            cqk $$1 = this.fZ().a($$0);
            if ($$1.d().al_()) {
               yb<?> $$2 = ((cos)$$1.d()).a($$1, this.dM(), this);
               if ($$2 != null) {
                  this.d.b($$2);
               }
            }
         }

         if (this.ex() != this.cI || this.cJ != this.ca.a() || this.ca.e() == 0.0F != this.cK) {
            this.d.b(new adv(this.ex(), this.ca.a(), this.ca.e()));
            this.cI = this.ex();
            this.cJ = this.ca.a();
            this.cK = this.ca.e() == 0.0F;
         }

         if (this.ex() + this.fp() != this.cC) {
            this.cC = this.ex() + this.fp();
            this.a(eqy.g, aww.f(this.cC));
         }

         if (this.ca.a() != this.cD) {
            this.cD = this.ca.a();
            this.a(eqy.h, aww.f((float)this.cD));
         }

         if (this.ci() != this.cE) {
            this.cE = this.ci();
            this.a(eqy.i, aww.f((float)this.cE));
         }

         if (this.eL() != this.cF) {
            this.cF = this.eL();
            this.a(eqy.j, aww.f((float)this.cF));
         }

         if (this.cn != this.cH) {
            this.cH = this.cn;
            this.a(eqy.k, aww.f((float)this.cH));
         }

         if (this.cm != this.cG) {
            this.cG = this.cm;
            this.a(eqy.l, aww.f((float)this.cG));
         }

         if (this.cn != this.cL) {
            this.cL = this.cn;
            this.d.b(new adu(this.co, this.cn, this.cm));
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
      if (this.ex() > 0.0F && this.cZ != null) {
         am.X.a(this, this.cZ);
      }

      this.cZ = null;
      super.n();
   }

   public void o() {
      if (this.ab > 0.0F && this.cZ == null) {
         this.cZ = this.dk();
      }
   }

   public void p() {
      if (this.cZ() != null && this.cZ().bq()) {
         if (this.db == null) {
            this.db = this.dk();
         } else {
            am.Y.a(this, this.db);
         }
      }

      if (this.db != null && (this.cZ() == null || !this.cZ().bq())) {
         this.db = null;
      }
   }

   private void a(eqy $$0, int $$1) {
      this.go().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(bnv $$0) {
      this.b(drn.p);
      boolean $$1 = this.dM().Z().b(cwv.n);
      if ($$1) {
         vu $$2 = this.eM().a();
         this.d.a(new acq(this.aj(), $$2), vb.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            vu $$3x = vu.a("death.attack.message_too_long", vu.b($$2x).a(n.o));
            vu $$4x = vu.a("death.attack.even_more_magic", this.O_()).a($$1xx -> $$1xx.a(new wa(wa.a.a, $$3x)));
            return new acq(this.aj(), $$4x);
         }));
         eqx $$3 = this.cg();
         if ($$3 == null || $$3.k() == eqx.b.a) {
            this.e.ah().a($$2, false);
         } else if ($$3.k() == eqx.b.c) {
            this.e.ah().a(this, $$2);
         } else if ($$3.k() == eqx.b.d) {
            this.e.ah().b(this, $$2);
         }
      } else {
         this.d.b(new acq(this.aj(), vt.a));
      }

      this.gn();
      if (this.dM().Z().b(cwv.N)) {
         this.gC();
      }

      if (!this.N_()) {
         this.g($$0);
      }

      this.go().a(eqy.d, this, eqt::b);
      bpo $$4 = this.eN();
      if ($$4 != null) {
         this.b(aui.h.b($$4.ai()));
         $$4.a(this, this.bk, $$0);
         this.f($$4);
      }

      this.dM().a(this, (byte)3);
      this.a(aui.N);
      this.a(aui.i.b(aui.m));
      this.a(aui.i.b(aui.n));
      this.aA();
      this.l(0);
      this.a_(false);
      this.eM().c();
      this.a(Optional.of(ik.a(this.dM().ad(), this.dm())));
   }

   private void gC() {
      epm $$0 = new epm(this.dm()).c(32.0, 10.0, 32.0);
      this.dM().a(bpq.class, $$0, bpb.f).stream().filter($$0x -> $$0x instanceof bpu).forEach($$0x -> ((bpu)$$0x).a_((cis)this));
   }

   @Override
   public void a(bow $$0, int $$1, bnv $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.t($$1);
         this.go().a(eqy.f, this, eqt::b);
         if ($$0 instanceof cis) {
            this.a(aui.Q);
            this.go().a(eqy.e, this, eqt::b);
         } else {
            this.a(aui.O);
         }

         this.a(this, $$0, eqy.m);
         this.a($$0, this, eqy.n);
         am.c.a(this, $$0, $$2);
      }
   }

   private void a(equ $$0, equ $$1, eqy[] $$2) {
      eqq $$3 = this.go().e($$1.cy());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.go().a($$2[$$4], $$0, eqt::b);
         }
      }
   }

   @Override
   public boolean a(bnv $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.e.n() && this.gD() && $$0.a(aup.n);
         if (!$$2 && this.cM > 0 && !$$0.a(aup.e)) {
            return false;
         } else {
            bow $$3 = $$0.d();
            if ($$3 instanceof cis $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof ciy $$5 && $$5.af_() instanceof cis $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(cis $$0) {
      return !this.gD() ? false : super.a($$0);
   }

   private boolean gD() {
      return this.e.ad();
   }

   @Nullable
   @Override
   protected ejk a(apf $$0) {
      ejk $$1 = super.a($$0);
      if ($$1 != null && this.dM().ad() == cwz.h && $$0.ad() == cwz.j) {
         epr $$2 = $$1.a.b(0.0, -1.0, 0.0);
         return new ejk($$2, epr.b, 90.0F, 0.0F);
      } else {
         return $$1;
      }
   }

   @Nullable
   @Override
   public bow b(apf $$0) {
      this.cR = true;
      apf $$1 = this.z();
      ajg<cwz> $$2 = $$1.ad();
      if ($$2 == cwz.j && $$0.ad() == cwz.h) {
         this.ag();
         this.z().a(this, bow.c.e);
         if (!this.g) {
            this.g = true;
            this.d.b(new abt(abt.f, this.cS ? 0.0F : 1.0F));
            this.cS = true;
         }

         return this;
      } else {
         ekg $$3 = $$0.A_();
         this.d.b(new acz(this.d($$0), (byte)3));
         this.d.b(new aaz($$3.q(), $$3.r()));
         atb $$4 = this.e.ah();
         $$4.d(this);
         $$1.a(this, bow.c.e);
         this.dJ();
         ejk $$5 = this.a($$0);
         if ($$5 != null) {
            $$1.ae().a("moving");
            if ($$2 == cwz.h && $$0.ad() == cwz.i) {
               this.da = this.dk();
            } else if ($$0.ad() == cwz.j) {
               this.a($$0, ib.a($$5.a));
            }

            $$1.ae().c();
            $$1.ae().a("placing");
            this.c($$0);
            this.d.a($$5.a.c, $$5.a.d, $$5.a.e, $$5.c, $$5.d);
            this.d.m();
            $$0.b(this);
            $$1.ae().c();
            this.f($$1);
            this.d.b(new acm(this.ga()));
            $$4.a(this, $$0);
            $$4.e(this);

            for (boj $$6 : this.eu()) {
               this.d.b(new aes(this.aj(), $$6, false));
            }

            this.d.b(new abz(1032, ib.c, 0, false));
            this.cL = -1;
            this.cI = -1.0F;
            this.cJ = -1;
         }

         return this;
      }
   }

   private void a(apf $$0, ib $$1) {
      ib.a $$2 = $$1.j();

      for (int $$3 = -2; $$3 <= 2; $$3++) {
         for (int $$4 = -2; $$4 <= 2; $$4++) {
            for (int $$5 = -1; $$5 < 3; $$5++) {
               dmz $$6 = $$5 == -1 ? dac.co.o() : dac.a.o();
               $$0.b($$2.g($$1).e($$4, $$5, $$3), $$6);
            }
         }
      }
   }

   @Override
   protected Optional<l.a> a(apf $$0, ib $$1, boolean $$2, doq $$3) {
      Optional<l.a> $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         ih.a $$5 = this.dM().a_(this.ax).d(dfd.b).orElse(ih.a.a);
         Optional<l.a> $$6 = $$0.p().a($$1, $$5);
         if ($$6.isEmpty()) {
            b.error("Unable to create a portal, likely target out of worldborder");
         }

         return $$6;
      }
   }

   private void f(apf $$0) {
      ajg<cwz> $$1 = $$0.ad();
      ajg<cwz> $$2 = this.dM().ad();
      am.w.a(this, $$1, $$2);
      if ($$1 == cwz.i && $$2 == cwz.h && this.da != null) {
         am.D.a(this, this.da);
      }

      if ($$2 != cwz.i) {
         this.da = null;
      }
   }

   @Override
   public boolean a(apg $$0) {
      if ($$0.N_()) {
         return this.K() == this;
      } else {
         return this.N_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bow $$0, int $$1) {
      super.a($$0, $$1);
      this.bZ.d();
   }

   @Override
   public Either<cis.a, axy> a(ib $$0) {
      ih $$1 = this.dM().a_($$0).c(ddv.aE);
      if (this.fI() || !this.bA()) {
         return Either.left(cis.a.e);
      } else if (!this.dM().D_().j()) {
         return Either.left(cis.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cis.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cis.a.d);
      } else {
         this.a(this.dM().ad(), $$0, this.dC(), false, true);
         if (this.dM().P()) {
            return Either.left(cis.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               epr $$4 = epr.c($$0);
               List<cfy> $$5 = this.dM()
                  .a(cfy.class, new epm($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.f(this));
               if (!$$5.isEmpty()) {
                  return Either.left(cis.a.f);
               }
            }

            Either<cis.a, axy> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(aui.ap);
               am.r.a(this);
            });
            if (!this.z().d()) {
               this.a(vu.c("sleep.not_possible"), true);
            }

            ((apf)this.dM()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(ib $$0) {
      this.a(aui.i.b(aui.n));
      super.b($$0);
   }

   private boolean a(ib $$0, ih $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(ib $$0) {
      epr $$1 = epr.c($$0);
      return Math.abs(this.dr() - $$1.a()) <= 3.0 && Math.abs(this.dt() - $$1.b()) <= 2.0 && Math.abs(this.dx() - $$1.c()) <= 3.0;
   }

   private boolean b(ib $$0, ih $$1) {
      ib $$2 = $$0.c();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fI()) {
         this.z().l().a(this, new aap(this, 2));
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
   public boolean b(bnv $$0) {
      return super.b($$0) || this.O();
   }

   @Override
   protected void a(double $$0, boolean $$1, dmz $$2, ib $$3) {
   }

   @Override
   protected void c(ib $$0) {
      if (!this.N_()) {
         super.c($$0);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.de()) {
         this.b($$3, new epr($$0, $$1, $$2));
         ib $$4 = this.aH();
         super.a($$1, $$3, this.dM().a_($$4), $$4);
      }
   }

   @Override
   public void a(@Nullable bow $$0) {
      super.a($$0);
      if ($$0 != null && $$0.ai() == bpc.bm) {
         this.ct = this.dt();
      }
   }

   @Override
   protected void q() {
      if (this.dM().s().i()) {
         super.q();
      }
   }

   @Override
   public void a(dlp $$0, boolean $$1) {
      this.d.b(new aav(this.dM(), $$0.aC_()));
      this.d.b(new ack($$0.aC_(), $$1));
   }

   private void gE() {
      this.dp = this.dp % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bng $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.bZ != this.bY) {
            this.r();
         }

         this.gE();
         clo $$1 = $$0.createMenu(this.dp, this.fZ(), this);
         if ($$1 == null) {
            if (this.N_()) {
               this.a(vu.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.d.b(new acj($$1.j, $$1.a(), $$0.O_()));
            this.a($$1);
            this.bZ = $$1;
            return OptionalInt.of(this.dp);
         }
      }
   }

   @Override
   public void a(int $$0, cvy $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.d.b(new acf($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(cdf $$0, bmv $$1) {
      if (this.bZ != this.bY) {
         this.r();
      }

      this.gE();
      this.d.b(new abu(this.dp, $$1.b(), $$0.aj()));
      this.bZ = new cmo(this.dp, this.fZ(), $$1, $$0);
      this.a(this.bZ);
   }

   @Override
   public void a(cqk $$0, bnb $$1) {
      if ($$0.a(cqn.tY)) {
         if (csg.a($$0, this.dd(), this)) {
            this.bZ.d();
         }

         this.d.b(new aci($$1));
      }
   }

   @Override
   public void a(dkq $$0) {
      this.d.b(aat.a($$0, dkg::d));
   }

   @Override
   public void r() {
      this.d.b(new abg(this.bZ.j));
      this.s();
   }

   @Override
   public void s() {
      this.bZ.b(this);
      this.bY.a(this.bZ);
      this.bZ = this.bY;
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
   public void a(epr $$0) {
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
               this.a(aui.C, $$3);
               this.C(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(aus.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(aui.w, $$4);
               this.C(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.bc()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(aui.s, $$5);
               this.C(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.p_()) {
            if ($$1 > 0.0) {
               this.a(aui.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aC()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.bY()) {
                  this.a(aui.r, $$6);
                  this.C(0.1F * (float)$$6 * 0.01F);
               } else if (this.bX()) {
                  this.a(aui.q, $$6);
                  this.C(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(aui.p, $$6);
                  this.C(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fB()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(aui.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(aui.v, $$8);
            }
         }
      }
   }

   private void r(double $$0, double $$1, double $$2) {
      if (this.bO() && !s($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         bow $$4 = this.cZ();
         if ($$4 instanceof ckn) {
            this.a(aui.x, $$3);
         } else if ($$4 instanceof ckp) {
            this.a(aui.y, $$3);
         } else if ($$4 instanceof cbu) {
            this.a(aui.z, $$3);
         } else if ($$4 instanceof cdf) {
            this.a(aui.A, $$3);
         } else if ($$4 instanceof cgl) {
            this.a(aui.D, $$3);
         }
      }
   }

   private static boolean s(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(auf<?> $$0, int $$1) {
      this.cB.b(this, $$0, $$1);
      this.go().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(auf<?> $$0) {
      this.cB.a(this, $$0, 0);
      this.go().a($$0, this, eqt::c);
   }

   @Override
   public int a(Collection<ctp<?>> $$0) {
      return this.cT.a($$0, this);
   }

   @Override
   public void a(ctp<?> $$0, List<cqk> $$1) {
      am.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<ajh> $$0) {
      List<ctp<?>> $$1 = $$0.stream().flatMap($$0x -> this.e.aJ().a($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<ctp<?>> $$0) {
      return this.cT.b($$0, this);
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cL = -1;
   }

   public void u() {
      this.cW = true;
      this.bE();
      if (this.fI()) {
         this.a(true, false);
      }
   }

   public boolean v() {
      return this.cW;
   }

   public void w() {
      this.cI = -1.0E8F;
   }

   @Override
   public void a(vu $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void x() {
      if (!this.by.b() && this.fs()) {
         this.d.b(new abq(this, (byte)9));
         super.x();
      }
   }

   @Override
   public void a(eg.a $$0, epr $$1) {
      super.a($$0, $$1);
      this.d.b(new act($$0, $$1.c, $$1.d, $$1.e));
   }

   public void a(eg.a $$0, bow $$1, eg.a $$2) {
      epr $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.d.b(new act($$0, $$1, $$2));
   }

   public void a(apg $$0, boolean $$1) {
      this.dl = $$0.dl;
      this.do = $$0.do;
      this.f.a($$0.f.b(), $$0.f.c());
      this.y();
      if ($$1) {
         this.fZ().a($$0.fZ());
         this.t($$0.ex());
         this.ca = $$0.ca;
         this.cm = $$0.cm;
         this.cn = $$0.cn;
         this.co = $$0.co;
         this.s($$0.fT());
         this.ax = $$0.ax;
      } else if (this.dM().Z().b(cwv.d) || $$0.N_()) {
         this.fZ().a($$0.fZ());
         this.cm = $$0.cm;
         this.cn = $$0.cn;
         this.co = $$0.co;
         this.s($$0.fT());
      }

      this.cp = $$0.cp;
      this.bX = $$0.bX;
      this.an().a(bT, $$0.an().a(bT));
      this.cL = -1;
      this.cI = -1.0F;
      this.cJ = -1;
      this.cT.a($$0.cT);
      this.cS = $$0.cS;
      this.da = $$0.da;
      this.dd = $$0.dd;
      this.i($$0.gq());
      this.j($$0.gr());
      this.a($$0.gy());
   }

   @Override
   protected void a(boj $$0, @Nullable bow $$1) {
      super.a($$0, $$1);
      this.d.b(new aes(this.aj(), $$0, true));
      if ($$0.a(bol.y)) {
         this.cV = this.ah;
         this.cU = this.dk();
      }

      am.B.a(this, $$1);
   }

   @Override
   protected void a(boj $$0, boolean $$1, @Nullable bow $$2) {
      super.a($$0, $$1, $$2);
      this.d.b(new aes(this.aj(), $$0, false));
      am.B.a(this, $$2);
   }

   @Override
   protected void a(boj $$0) {
      super.a($$0);
      this.d.b(new acx(this.aj(), $$0.b()));
      if ($$0.a(bol.y)) {
         this.cU = null;
      }

      am.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.d.a($$0, $$1, $$2, this.dC(), this.dE(), bqb.g);
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.d.a(this.dr() + $$0, this.dt() + $$1, this.dx() + $$2, this.dC(), this.dE(), bqb.f);
   }

   @Override
   public boolean a(apf $$0, double $$1, double $$2, double $$3, Set<bqb> $$4, float $$5, float $$6) {
      cwg $$7 = new cwg(ib.a($$1, $$2, $$3));
      $$0.l().a(apk.g, $$7, 1, this.aj());
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
   public void b(bow $$0) {
      this.z().l().a(this, new aap($$0, 4));
   }

   @Override
   public void c(bow $$0) {
      this.z().l().a(this, new aap($$0, 5));
   }

   @Override
   public void y() {
      if (this.d != null) {
         this.d.b(new acm(this.ga()));
         this.J();
      }
   }

   public apf z() {
      return (apf)this.dM();
   }

   public boolean a(cww $$0) {
      if (!this.f.a($$0)) {
         return false;
      } else {
         this.d.b(new abt(abt.e, (float)$$0.a()));
         if ($$0 == cww.d) {
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
      return this.f.b() == cww.d;
   }

   @Override
   public boolean f() {
      return this.f.b() == cww.b;
   }

   @Override
   public void a(vu $$0) {
      this.b($$0, false);
   }

   public void b(vu $$0, boolean $$1) {
      if (this.u($$1)) {
         this.d.a(new aej($$0, $$1), vb.a(() -> {
            if (this.u(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               vu $$3 = vu.b($$2).a(n.o);
               return new aej(vu.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(wj $$0, boolean $$1, vq.a $$2) {
      if (this.gF()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String A() {
      return this.d.n() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(aou $$0) {
      this.cY = $$0.b();
      this.cX = $$0.c();
      this.cN = $$0.d();
      this.cO = $$0.e();
      this.dj = $$0.h();
      this.dk = $$0.i();
      this.an().a(bT, (byte)$$0.f());
      this.an().a(bU, (byte)$$0.g().a());
   }

   public aou B() {
      int $$0 = this.an().a(bT);
      bpi $$1 = bpi.d.apply(this.an().a(bU));
      return new aou(this.cY, this.cX, this.cN, this.cO, $$0, $$1, this.dj, this.dk);
   }

   public boolean C() {
      return this.cO;
   }

   public ciq D() {
      return this.cN;
   }

   private boolean u(boolean $$0) {
      return this.cN == ciq.c ? $$0 : true;
   }

   private boolean gF() {
      return this.cN == ciq.a;
   }

   public int E() {
      return this.cX;
   }

   public void a(aig $$0) {
      this.d.b(new add($$0.a(), $$0.d().map(aig.a::a)));
   }

   @Override
   protected int F() {
      return this.e.c(this.fY());
   }

   @Override
   public void G() {
      this.cP = ac.b();
   }

   public aue H() {
      return this.cB;
   }

   public aud I() {
      return this.cT;
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

   public bow K() {
      return (bow)(this.cQ == null ? this : this.cQ);
   }

   @Override
   public void d(@Nullable bow $$0) {
      bow $$1 = this.K();
      this.cQ = (bow)($$0 == null ? this : $$0);
      if ($$1 != this.cQ) {
         if (this.cQ.dM() instanceof apf $$2) {
            this.a($$2, this.cQ.dr(), this.cQ.dt(), this.cQ.dx(), Set.of(), this.dC(), this.dE());
         }

         if ($$0 != null) {
            this.z().l().a(this);
         }

         this.d.b(new adk(this.cQ));
         this.d.m();
      }
   }

   @Override
   protected void L() {
      if (!this.cR) {
         super.L();
      }
   }

   @Override
   public void e(bow $$0) {
      if (this.f.b() == cww.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long M() {
      return this.cP;
   }

   @Nullable
   public vu N() {
      return null;
   }

   @Override
   public void a(bnb $$0) {
      super.a($$0);
      this.gt();
   }

   public boolean O() {
      return this.cR;
   }

   public void P() {
      this.cR = false;
   }

   public ajp Q() {
      return this.cA;
   }

   public void a(apf $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      this.d(this);
      this.ac();
      if ($$0 == this.dM()) {
         this.d.a($$1, $$2, $$3, $$4, $$5);
      } else {
         apf $$6 = this.z();
         ekg $$7 = $$0.A_();
         this.d.b(new acz(this.d($$0), (byte)3));
         this.d.b(new aaz($$7.q(), $$7.r()));
         this.e.ah().d(this);
         $$6.a(this, bow.c.e);
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
      return this.df;
   }

   public float S() {
      return this.dh;
   }

   public ajg<cwz> T() {
      return this.de;
   }

   public boolean U() {
      return this.dg;
   }

   public void a(ajg<cwz> $$0, @Nullable ib $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.df) && $$0.equals(this.de);
         if ($$4 && !$$5) {
            this.a(vu.c("block.minecraft.set_spawn"));
         }

         this.df = $$1;
         this.de = $$0;
         this.dh = $$2;
         this.dg = $$3;
      } else {
         this.df = null;
         this.de = cwz.h;
         this.dh = 0.0F;
         this.dg = false;
      }
   }

   public je V() {
      return this.dc;
   }

   public void a(je $$0) {
      this.dc = $$0;
   }

   public aot W() {
      return this.dd;
   }

   public void a(aot $$0) {
      this.dd = $$0;
   }

   @Override
   public void a(atx $$0, atz $$1, float $$2, float $$3) {
      this.d.b(new aeg(ki.b.e($$0), $$1, this.dr(), this.dt(), this.dx(), $$2, $$3, this.ag.g()));
   }

   @Override
   public cfd a(cqk $$0, boolean $$1, boolean $$2) {
      cfd $$3 = super.a($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dM().b($$3);
         cqk $$4 = $$3.p();
         if ($$2) {
            if (!$$4.b()) {
               this.a(aui.f.b($$4.d()), $$0.M());
            }

            this.a(aui.F);
         }

         return $$3;
      }
   }

   public aqj X() {
      return this.di;
   }

   public void c(apf $$0) {
      this.a((cwz)$$0);
      this.f.a($$0);
   }

   @Nullable
   private static cww a(@Nullable ta $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? cww.a($$0.h($$1)) : null;
   }

   private cww b(@Nullable cww $$0) {
      cww $$1 = this.e.bf();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.e.u_();
      }
   }

   @Override
   public void c(@Nullable ta $$0) {
      this.f.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void k(ta $$0) {
      $$0.a("playerGameType", this.f.b().a());
      cww $$1 = this.f.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean Y() {
      return this.dj;
   }

   public boolean b(apg $$0) {
      return $$0 == this ? false : this.dj || $$0.dj;
   }

   @Override
   public boolean a(cwz $$0, ib $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cqk $$0) {
      am.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cir $$1 = this.fZ();
      cqk $$2 = $$1.a($$0);
      this.bZ.b($$1, $$1.l).ifPresent($$1x -> this.bZ.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean Z() {
      return this.dk;
   }

   @Override
   public Optional<chy> aa() {
      return Optional.of(this.dl);
   }

   @Override
   public void a(cfd $$0) {
      super.a($$0);
      bow $$1 = $$0.af_();
      if ($$1 != null) {
         am.S.a(this, $$0.p(), $$1);
      }
   }

   public void a(wl $$0) {
      this.do = $$0;
   }

   @Nullable
   public wl ab() {
      return this.do != null && this.do.b() ? null : this.do;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cs = (float)(aww.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dC());
      this.d.b(new abv(this));
   }

   @Override
   public boolean a(bow $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         $$0.j(this);
         this.d.a(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
         if ($$0 instanceof bpo $$2) {
            for (boj $$3 : $$2.eu()) {
               this.d.b(new aes($$0.aj(), $$3, false));
            }
         }

         return true;
      }
   }

   @Override
   public void ac() {
      bow $$0 = this.cZ();
      super.ac();
      if ($$0 instanceof bpo $$1) {
         for (boj $$2 : $$1.eu()) {
            this.d.b(new acx($$0.aj(), $$2.b()));
         }
      }
   }

   public aeu d(apf $$0) {
      return new aeu($$0.ac(), $$0.ad(), cya.a($$0.C()), this.f.b(), this.f.c(), $$0.ag(), $$0.B(), this.gy(), this.av());
   }
}
