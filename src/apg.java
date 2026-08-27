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

public class apg extends ciu {
   private static final Logger b = LogUtils.getLogger();
   private static final int cu = 32;
   private static final int cv = 10;
   private static final int cw = 25;
   public static final double c = 1.0;
   private static final bqu cx = new bqu(UUID.fromString("736565d2-e1a7-403d-a3f8-1aeb3e302542"), "Creative block interaction range modifier", 0.5, bqu.a.a);
   private static final bqu cz = new bqu(UUID.fromString("98491ef6-97b1-4584-ae82-71a8cc85cf73"), "Creative entity interaction range modifier", 2.0, bqu.a.a);
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
   private cis cN = cis.a;
   private boolean cO = true;
   private long cP = ac.b();
   @Nullable
   private box cQ;
   private boolean cR;
   private boolean cS;
   private final aud cT = new aud();
   @Nullable
   private ept cU;
   private int cV;
   private boolean cW;
   private int cX = 2;
   private String cY = "en_us";
   @Nullable
   private ept cZ;
   @Nullable
   private ept da;
   @Nullable
   private ept db;
   private je dc = je.a(0, 0, 0);
   private aot dd = aot.a;
   private ajg<cxb> de = cxb.h;
   @Nullable
   private ib df;
   private boolean dg;
   private float dh;
   private final aqj di;
   private boolean dj;
   private boolean dk;
   private cia dl = new cia(0, 0, 0);
   private final cmd dm = new cmd() {
      @Override
      public void a(clq $$0, iu<cqm> $$1, cqm $$2, int[] $$3) {
         apg.this.d.b(new abh($$0.j, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(clq $$0, int $$1, cqm $$2) {
         apg.this.d.b(new abj($$0.j, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(clq $$0, cqm $$1) {
         apg.this.d.b(new abj(-1, $$0.k(), -1, $$1));
      }

      @Override
      public void a(clq $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(clq $$0, int $$1, int $$2) {
         apg.this.d.b(new abi($$0.j, $$1, $$2));
      }
   };
   private final cmc dn = new cmc() {
      @Override
      public void a(clq $$0, int $$1, cqm $$2) {
         cnl $$3 = $$0.b($$1);
         if (!($$3 instanceof cnh)) {
            if ($$3.d == apg.this.fZ()) {
               am.f.a(apg.this, apg.this.fZ(), $$2);
            }
         }
      }

      @Override
      public void a(clq $$0, int $$1, int $$2) {
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
      this.cB = $$0.ah().a((ciu)this);
      this.cA = $$0.ah().f(this);
      this.e($$1);
      this.a($$3);
   }

   private void e(apf $$0) {
      ib $$1 = $$0.T();
      if ($$0.D_().g() && $$0.o().bc().k() != cwy.c) {
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
         cia.a.parse(new Dynamic(to.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(b::error).ifPresent($$0x -> this.dl = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         ta $$1 = $$0.p("enteredNetherPosition");
         this.da = new ept($$1.k("x"), $$1.k("y"), $$1.k("z"));
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
            this.de = cxb.g.parse(to.a, $$0.c("SpawnDimension")).resultOrPartial(b::error).orElse(cxb.h);
         }
      }
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      cia.a.encodeStart(to.a, this.dl).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.cS);
      if (this.da != null) {
         ta $$1 = new ta();
         $$1.a("x", this.da.c);
         $$1.a("y", this.da.d);
         $$1.a("z", this.da.e);
         $$0.a("enteredNetherPosition", $$1);
      }

      box $$2 = this.cW();
      box $$3 = this.cZ();
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
   public void a(cqm $$0, int $$1) {
      super.a($$0, $$1);
      this.cL = -1;
   }

   private void a(clq $$0) {
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
   protected void a(dnb $$0) {
      am.e.a(this, $$0);
   }

   @Override
   protected cqi k() {
      return new crh(this);
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

      box $$0 = this.K();
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
      bqs $$0 = this.f(bqw.g);
      if ($$0 != null) {
         if (this.f()) {
            $$0.b(cx);
         } else {
            $$0.e(cx);
         }
      }

      bqs $$1 = this.f(bqw.h);
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
            cqm $$1 = this.fZ().a($$0);
            if ($$1.d().al_()) {
               yb<?> $$2 = ((cou)$$1.d()).a($$1, this.dM(), this);
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
            this.a(era.g, aww.f(this.cC));
         }

         if (this.ca.a() != this.cD) {
            this.cD = this.ca.a();
            this.a(era.h, aww.f((float)this.cD));
         }

         if (this.ci() != this.cE) {
            this.cE = this.ci();
            this.a(era.i, aww.f((float)this.cE));
         }

         if (this.eL() != this.cF) {
            this.cF = this.eL();
            this.a(era.j, aww.f((float)this.cF));
         }

         if (this.cn != this.cH) {
            this.cH = this.cn;
            this.a(era.k, aww.f((float)this.cH));
         }

         if (this.cm != this.cG) {
            this.cG = this.cm;
            this.a(era.l, aww.f((float)this.cG));
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

   private void a(era $$0, int $$1) {
      this.go().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(bnw $$0) {
      this.b(drp.p);
      boolean $$1 = this.dM().Z().b(cwx.n);
      if ($$1) {
         vu $$2 = this.eM().a();
         this.d.a(new acq(this.aj(), $$2), vb.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            vu $$3x = vu.a("death.attack.message_too_long", vu.b($$2x).a(n.o));
            vu $$4x = vu.a("death.attack.even_more_magic", this.O_()).a($$1xx -> $$1xx.a(new wa(wa.a.a, $$3x)));
            return new acq(this.aj(), $$4x);
         }));
         eqz $$3 = this.cg();
         if ($$3 == null || $$3.k() == eqz.b.a) {
            this.e.ah().a($$2, false);
         } else if ($$3.k() == eqz.b.c) {
            this.e.ah().a(this, $$2);
         } else if ($$3.k() == eqz.b.d) {
            this.e.ah().b(this, $$2);
         }
      } else {
         this.d.b(new acq(this.aj(), vt.a));
      }

      this.gn();
      if (this.dM().Z().b(cwx.N)) {
         this.gC();
      }

      if (!this.N_()) {
         this.g($$0);
      }

      this.go().a(era.d, this, eqv::b);
      bpp $$4 = this.eN();
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
      epo $$0 = new epo(this.dm()).c(32.0, 10.0, 32.0);
      this.dM().a(bpr.class, $$0, bpc.f).stream().filter($$0x -> $$0x instanceof bpv).forEach($$0x -> ((bpv)$$0x).a_((ciu)this));
   }

   @Override
   public void a(box $$0, int $$1, bnw $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.t($$1);
         this.go().a(era.f, this, eqv::b);
         if ($$0 instanceof ciu) {
            this.a(aui.Q);
            this.go().a(era.e, this, eqv::b);
         } else {
            this.a(aui.O);
         }

         this.a(this, $$0, era.m);
         this.a($$0, this, era.n);
         am.c.a(this, $$0, $$2);
      }
   }

   private void a(eqw $$0, eqw $$1, era[] $$2) {
      eqs $$3 = this.go().e($$1.cy());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.go().a($$2[$$4], $$0, eqv::b);
         }
      }
   }

   @Override
   public boolean a(bnw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.e.n() && this.gD() && $$0.a(aup.n);
         if (!$$2 && this.cM > 0 && !$$0.a(aup.e)) {
            return false;
         } else {
            box $$3 = $$0.d();
            if ($$3 instanceof ciu $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof cja $$5 && $$5.af_() instanceof ciu $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(ciu $$0) {
      return !this.gD() ? false : super.a($$0);
   }

   private boolean gD() {
      return this.e.ad();
   }

   @Nullable
   @Override
   protected ejm a(apf $$0) {
      ejm $$1 = super.a($$0);
      if ($$1 != null && this.dM().ad() == cxb.h && $$0.ad() == cxb.j) {
         ept $$2 = $$1.a.b(0.0, -1.0, 0.0);
         return new ejm($$2, ept.b, 90.0F, 0.0F);
      } else {
         return $$1;
      }
   }

   @Nullable
   @Override
   public box b(apf $$0) {
      this.cR = true;
      apf $$1 = this.z();
      ajg<cxb> $$2 = $$1.ad();
      if ($$2 == cxb.j && $$0.ad() == cxb.h) {
         this.ag();
         this.z().a(this, box.c.e);
         if (!this.g) {
            this.g = true;
            this.d.b(new abt(abt.f, this.cS ? 0.0F : 1.0F));
            this.cS = true;
         }

         return this;
      } else {
         eki $$3 = $$0.A_();
         this.d.b(new acz(this.d($$0), (byte)3));
         this.d.b(new aaz($$3.q(), $$3.r()));
         atb $$4 = this.e.ah();
         $$4.d(this);
         $$1.a(this, box.c.e);
         this.dJ();
         ejm $$5 = this.a($$0);
         if ($$5 != null) {
            $$1.ae().a("moving");
            if ($$2 == cxb.h && $$0.ad() == cxb.i) {
               this.da = this.dk();
            } else if ($$0.ad() == cxb.j) {
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

            for (bok $$6 : this.eu()) {
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
               dnb $$6 = $$5 == -1 ? dae.co.o() : dae.a.o();
               $$0.b($$2.g($$1).e($$4, $$5, $$3), $$6);
            }
         }
      }
   }

   @Override
   protected Optional<l.a> a(apf $$0, ib $$1, boolean $$2, dos $$3) {
      Optional<l.a> $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         ih.a $$5 = this.dM().a_(this.ax).d(dff.b).orElse(ih.a.a);
         Optional<l.a> $$6 = $$0.p().a($$1, $$5);
         if ($$6.isEmpty()) {
            b.error("Unable to create a portal, likely target out of worldborder");
         }

         return $$6;
      }
   }

   private void f(apf $$0) {
      ajg<cxb> $$1 = $$0.ad();
      ajg<cxb> $$2 = this.dM().ad();
      am.w.a(this, $$1, $$2);
      if ($$1 == cxb.i && $$2 == cxb.h && this.da != null) {
         am.D.a(this, this.da);
      }

      if ($$2 != cxb.i) {
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
   public void a(box $$0, int $$1) {
      super.a($$0, $$1);
      this.bZ.d();
   }

   @Override
   public Either<ciu.a, axy> a(ib $$0) {
      ih $$1 = this.dM().a_($$0).c(ddx.aE);
      if (this.fI() || !this.bA()) {
         return Either.left(ciu.a.e);
      } else if (!this.dM().D_().j()) {
         return Either.left(ciu.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(ciu.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(ciu.a.d);
      } else {
         this.a(this.dM().ad(), $$0, this.dC(), false, true);
         if (this.dM().P()) {
            return Either.left(ciu.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               ept $$4 = ept.c($$0);
               List<cga> $$5 = this.dM()
                  .a(cga.class, new epo($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.f(this));
               if (!$$5.isEmpty()) {
                  return Either.left(ciu.a.f);
               }
            }

            Either<ciu.a, axy> $$6 = super.a($$0).ifRight($$0x -> {
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
      ept $$1 = ept.c($$0);
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
   public boolean b(bnw $$0) {
      return super.b($$0) || this.O();
   }

   @Override
   protected void a(double $$0, boolean $$1, dnb $$2, ib $$3) {
   }

   @Override
   protected void c(ib $$0) {
      if (!this.N_()) {
         super.c($$0);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.de()) {
         this.b($$3, new ept($$0, $$1, $$2));
         ib $$4 = this.aH();
         super.a($$1, $$3, this.dM().a_($$4), $$4);
      }
   }

   @Override
   public void a(@Nullable box $$0) {
      super.a($$0);
      if ($$0 != null && $$0.ai() == bpd.bn) {
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
   public void a(dlr $$0, boolean $$1) {
      this.d.b(new aav(this.dM(), $$0.aC_()));
      this.d.b(new ack($$0.aC_(), $$1));
   }

   private void gE() {
      this.dp = this.dp % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bnh $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.bZ != this.bY) {
            this.r();
         }

         this.gE();
         clq $$1 = $$0.createMenu(this.dp, this.fZ(), this);
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
   public void a(int $$0, cwa $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.d.b(new acf($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(cdg $$0, bmw $$1) {
      if (this.bZ != this.bY) {
         this.r();
      }

      this.gE();
      this.d.b(new abu(this.dp, $$1.b(), $$0.aj()));
      this.bZ = new cmq(this.dp, this.fZ(), $$1, $$0);
      this.a(this.bZ);
   }

   @Override
   public void a(cqm $$0, bnc $$1) {
      if ($$0.a(cqp.tZ)) {
         if (csi.a($$0, this.dd(), this)) {
            this.bZ.d();
         }

         this.d.b(new aci($$1));
      }
   }

   @Override
   public void a(dks $$0) {
      this.d.b(aat.a($$0, dki::d));
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
   public void a(ept $$0) {
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
         box $$4 = this.cZ();
         if ($$4 instanceof ckp) {
            this.a(aui.x, $$3);
         } else if ($$4 instanceof ckr) {
            this.a(aui.y, $$3);
         } else if ($$4 instanceof cbv) {
            this.a(aui.z, $$3);
         } else if ($$4 instanceof cdg) {
            this.a(aui.A, $$3);
         } else if ($$4 instanceof cgn) {
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
      this.go().a($$0, this, eqv::c);
   }

   @Override
   public int a(Collection<ctr<?>> $$0) {
      return this.cT.a($$0, this);
   }

   @Override
   public void a(ctr<?> $$0, List<cqm> $$1) {
      am.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<ajh> $$0) {
      List<ctr<?>> $$1 = $$0.stream().flatMap($$0x -> this.e.aJ().a($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<ctr<?>> $$0) {
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
   public void a(eg.a $$0, ept $$1) {
      super.a($$0, $$1);
      this.d.b(new act($$0, $$1.c, $$1.d, $$1.e));
   }

   public void a(eg.a $$0, box $$1, eg.a $$2) {
      ept $$3 = $$2.a($$1);
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
      } else if (this.dM().Z().b(cwx.d) || $$0.N_()) {
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
   protected void a(bok $$0, @Nullable box $$1) {
      super.a($$0, $$1);
      this.d.b(new aes(this.aj(), $$0, true));
      if ($$0.a(bom.y)) {
         this.cV = this.ah;
         this.cU = this.dk();
      }

      am.B.a(this, $$1);
   }

   @Override
   protected void a(bok $$0, boolean $$1, @Nullable box $$2) {
      super.a($$0, $$1, $$2);
      this.d.b(new aes(this.aj(), $$0, false));
      am.B.a(this, $$2);
   }

   @Override
   protected void a(bok $$0) {
      super.a($$0);
      this.d.b(new acx(this.aj(), $$0.b()));
      if ($$0.a(bom.y)) {
         this.cU = null;
      }

      am.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.d.a($$0, $$1, $$2, this.dC(), this.dE(), bqc.g);
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.d.a(this.dr() + $$0, this.dt() + $$1, this.dx() + $$2, this.dC(), this.dE(), bqc.f);
   }

   @Override
   public boolean a(apf $$0, double $$1, double $$2, double $$3, Set<bqc> $$4, float $$5, float $$6) {
      cwi $$7 = new cwi(ib.a($$1, $$2, $$3));
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
   public void b(box $$0) {
      this.z().l().a(this, new aap($$0, 4));
   }

   @Override
   public void c(box $$0) {
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

   public boolean a(cwy $$0) {
      if (!this.f.a($$0)) {
         return false;
      } else {
         this.d.b(new abt(abt.e, (float)$$0.a()));
         if ($$0 == cwy.d) {
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
      return this.f.b() == cwy.d;
   }

   @Override
   public boolean f() {
      return this.f.b() == cwy.b;
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
      bpj $$1 = bpj.d.apply(this.an().a(bU));
      return new aou(this.cY, this.cX, this.cN, this.cO, $$0, $$1, this.dj, this.dk);
   }

   public boolean C() {
      return this.cO;
   }

   public cis D() {
      return this.cN;
   }

   private boolean u(boolean $$0) {
      return this.cN == cis.c ? $$0 : true;
   }

   private boolean gF() {
      return this.cN == cis.a;
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

   public box K() {
      return (box)(this.cQ == null ? this : this.cQ);
   }

   @Override
   public void d(@Nullable box $$0) {
      box $$1 = this.K();
      this.cQ = (box)($$0 == null ? this : $$0);
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
   public void e(box $$0) {
      if (this.f.b() == cwy.d) {
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
   public void a(bnc $$0) {
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
         eki $$7 = $$0.A_();
         this.d.b(new acz(this.d($$0), (byte)3));
         this.d.b(new aaz($$7.q(), $$7.r()));
         this.e.ah().d(this);
         $$6.a(this, box.c.e);
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

   public ajg<cxb> T() {
      return this.de;
   }

   public boolean U() {
      return this.dg;
   }

   public void a(ajg<cxb> $$0, @Nullable ib $$1, float $$2, boolean $$3, boolean $$4) {
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
         this.de = cxb.h;
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
   public cfe a(cqm $$0, boolean $$1, boolean $$2) {
      cfe $$3 = super.a($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dM().b($$3);
         cqm $$4 = $$3.p();
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
      this.a((cxb)$$0);
      this.f.a($$0);
   }

   @Nullable
   private static cwy a(@Nullable ta $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? cwy.a($$0.h($$1)) : null;
   }

   private cwy b(@Nullable cwy $$0) {
      cwy $$1 = this.e.bf();
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
      cwy $$1 = this.f.c();
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
   public boolean a(cxb $$0, ib $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cqm $$0) {
      am.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cit $$1 = this.fZ();
      cqm $$2 = $$1.a($$0);
      this.bZ.b($$1, $$1.l).ifPresent($$1x -> this.bZ.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean Z() {
      return this.dk;
   }

   @Override
   public Optional<cia> aa() {
      return Optional.of(this.dl);
   }

   @Override
   public void a(cfe $$0) {
      super.a($$0);
      box $$1 = $$0.af_();
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
   public boolean a(box $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         $$0.j(this);
         this.d.a(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
         if ($$0 instanceof bpp $$2) {
            for (bok $$3 : $$2.eu()) {
               this.d.b(new aes($$0.aj(), $$3, false));
            }
         }

         return true;
      }
   }

   @Override
   public void ac() {
      box $$0 = this.cZ();
      super.ac();
      if ($$0 instanceof bpp $$1) {
         for (bok $$2 : $$1.eu()) {
            this.d.b(new acx($$0.aj(), $$2.b()));
         }
      }
   }

   public aeu d(apf $$0) {
      return new aeu($$0.ac(), $$0.ad(), cyc.a($$0.C()), this.f.b(), this.f.c(), $$0.ag(), $$0.B(), this.gy(), this.av());
   }
}
