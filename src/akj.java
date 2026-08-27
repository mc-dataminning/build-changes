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

public class akj extends cbl {
   private static final Logger b = LogUtils.getLogger();
   private static final int ck = 32;
   private static final int cl = 10;
   public alg c;
   public final MinecraftServer d;
   public final akk e;
   private final aex cm;
   private final apa cn;
   private float co = Float.MIN_VALUE;
   private int cp = Integer.MIN_VALUE;
   private int cq = Integer.MIN_VALUE;
   private int cr = Integer.MIN_VALUE;
   private int cs = Integer.MIN_VALUE;
   private int ct = Integer.MIN_VALUE;
   private float cu = -1.0E8F;
   private int cv = -99999999;
   private boolean cw = true;
   private int cx = -99999999;
   private int cy = 60;
   private cbj cz = cbj.a;
   private boolean cA = true;
   private long cB = ac.b();
   @Nullable
   private big cC;
   private boolean cD;
   private boolean cE;
   private final aoz cF = new aoz();
   @Nullable
   private ehf cG;
   private int cH;
   private boolean cI;
   private OptionalInt cJ = OptionalInt.empty();
   @Nullable
   private ehf cK;
   @Nullable
   private ehf cL;
   @Nullable
   private ehf cM;
   private hy cN = hy.a(0, 0, 0);
   private ajx cO = ajx.a;
   private aeo<cpk> cP = cpk.h;
   @Nullable
   private gv cQ;
   private boolean cR;
   private float cS;
   private final all cT;
   private boolean cU;
   private boolean cV;
   private car cW = new car(0, 0, 0);
   private final cep cX = new cep() {
      @Override
      public void a(cec $$0, ho<ciw> $$1, ciw $$2, int[] $$3) {
         akj.this.c.b(new xj($$0.j, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cec $$0, int $$1, ciw $$2) {
         akj.this.c.b(new xl($$0.j, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cec $$0, ciw $$1) {
         akj.this.c.b(new xl(-1, $$0.k(), -1, $$1));
      }

      @Override
      public void a(cec $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cec $$0, int $$1, int $$2) {
         akj.this.c.b(new xk($$0.j, $$1, $$2));
      }
   };
   private final ceo cY = new ceo() {
      @Override
      public void a(cec $$0, int $$1, ciw $$2) {
         cfu $$3 = $$0.b($$1);
         if (!($$3 instanceof cfq)) {
            if ($$3.d == akj.this.fQ()) {
               ai.e.a(akj.this, akj.this.fQ(), $$2);
            }
         }
      }

      @Override
      public void a(cec $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private tu cZ;
   private int da;
   public boolean f;

   public akj(MinecraftServer $$0, aki $$1, GameProfile $$2) {
      super($$1, $$1.R(), $$1.S(), $$2);
      this.cT = $$0.a(this);
      this.e = $$0.b(this);
      this.d = $$0;
      this.cn = $$0.ac().a((cbl)this);
      this.cm = $$0.ac().f(this);
      this.t(1.0F);
      this.e($$1);
   }

   private void e(aki $$0) {
      gv $$1 = $$0.R();
      if ($$0.x_().g() && $$0.n().aU().m() != cph.c) {
         int $$2 = Math.max(0, this.d.a($$0));
         int $$3 = aro.a($$0.w_().b((double)$$1.u(), (double)$$1.w()));
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
         int $$8 = art.a().a($$6);

         for (int $$9 = 0; $$9 < $$6; $$9++) {
            int $$10 = ($$8 + $$7 * $$9) % $$6;
            int $$11 = $$10 % ($$2 * 2 + 1);
            int $$12 = $$10 / ($$2 * 2 + 1);
            gv $$13 = akd.a($$0, $$1.u() + $$11 - $$2, $$1.w() + $$12 - $$2);
            if ($$13 != null) {
               this.a($$13, 0.0F, 0.0F);
               if ($$0.g(this)) {
                  break;
               }
            }
         }
      } else {
         this.a($$1, 0.0F, 0.0F);

         while (!$$0.g(this) && this.dr() < (double)($$0.aj() - 1)) {
            this.e(this.dp(), this.dr() + 1.0, this.dv());
         }
      }
   }

   private int u(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         car.a.parse(new Dynamic(rd.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(b::error).ifPresent($$0x -> this.cW = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         qs $$1 = $$0.p("enteredNetherPosition");
         this.cL = new ehf($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.cE = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cF.a($$0.p("recipeBook"), this.d.aE());
      }

      if (this.fB()) {
         this.fC();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.cQ = new gv($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.cR = $$0.q("SpawnForced");
         this.cS = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.cP = cpk.g.parse(rd.a, $$0.c("SpawnDimension")).resultOrPartial(b::error).orElse(cpk.h);
         }
      }
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      car.a.encodeStart(rd.a, this.cW).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.cE);
      if (this.cL != null) {
         qs $$1 = new qs();
         $$1.a("x", this.cL.c);
         $$1.a("y", this.cL.d);
         $$1.a("z", this.cL.e);
         $$0.a("enteredNetherPosition", $$1);
      }

      big $$2 = this.cV();
      big $$3 = this.cY();
      if ($$3 != null && $$2 != this && $$2.cU()) {
         qs $$4 = new qs();
         qs $$5 = new qs();
         $$2.e($$5);
         $$4.a("Attach", $$3.cv());
         $$4.a("Entity", $$5);
         $$0.a("RootVehicle", $$4);
      }

      $$0.a("recipeBook", this.cF.b());
      $$0.a("Dimension", this.dK().ac().a().toString());
      if (this.cQ != null) {
         $$0.a("SpawnX", this.cQ.u());
         $$0.a("SpawnY", this.cQ.v());
         $$0.a("SpawnZ", this.cQ.w());
         $$0.a("SpawnForced", this.cR);
         $$0.a("SpawnAngle", this.cS);
         aep.a.encodeStart(rd.a, this.cP.a()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.fZ();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.cf = aro.a((float)$$0 / $$1, 0.0F, $$2);
      this.cx = -1;
   }

   public void b(int $$0) {
      this.cd = $$0;
      this.cx = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cx = -1;
   }

   @Override
   public void a(ciw $$0, int $$1) {
      super.a($$0, $$1);
      this.cx = -1;
   }

   private void a(cec $$0) {
      $$0.a(this.cY);
      $$0.a(this.cX);
   }

   public void h() {
      this.a(this.bP);
   }

   @Override
   public void Q_() {
      super.Q_();
      this.c.b(new yq());
   }

   @Override
   public void F_() {
      super.F_();
      this.c.b(new yp(this.eI()));
   }

   @Override
   protected void a(dey $$0) {
      ai.d.a(this, $$0);
   }

   @Override
   protected cis k() {
      return new cjr(this);
   }

   @Override
   public void l() {
      this.e.a();
      this.cW.a();
      this.cy--;
      if (this.al > 0) {
         this.al--;
      }

      this.bQ.d();
      if (!this.dK().B && !this.bQ.a(this)) {
         this.q();
         this.bQ = this.bP;
      }

      big $$0 = this.H();
      if ($$0 != this) {
         if ($$0.bv()) {
            this.a($$0.dp(), $$0.dr(), $$0.dv(), $$0.dA(), $$0.dC());
            this.x().k().a(this);
            if (this.fH()) {
               this.c(this);
            }
         } else {
            this.c(this);
         }
      }

      ai.w.a(this);
      if (this.cG != null) {
         ai.u.a(this, this.cG, this.ah - this.cH);
      }

      this.o();
      this.p();
      this.cm.b(this);
   }

   @Override
   public void m() {
      try {
         if (!this.G_() || !this.dd()) {
            super.l();
         }

         for (int $$0 = 0; $$0 < this.fQ().b(); $$0++) {
            ciw $$1 = this.fQ().a($$0);
            if ($$1.d().ad_()) {
               uw<?> $$2 = ((chb)$$1.d()).a($$1, this.dK(), this);
               if ($$2 != null) {
                  this.c.b($$2);
               }
            }
         }

         if (this.et() != this.cu || this.cv != this.bR.a() || this.bR.e() == 0.0F != this.cw) {
            this.c.b(new zv(this.et(), this.bR.a(), this.bR.e()));
            this.cu = this.et();
            this.cv = this.bR.a();
            this.cw = this.bR.e() == 0.0F;
         }

         if (this.et() + this.fi() != this.co) {
            this.co = this.et() + this.fi();
            this.a(eih.f, aro.f(this.co));
         }

         if (this.bR.a() != this.cp) {
            this.cp = this.bR.a();
            this.a(eih.g, aro.f((float)this.cp));
         }

         if (this.ch() != this.cq) {
            this.cq = this.ch();
            this.a(eih.h, aro.f((float)this.cq));
         }

         if (this.eH() != this.cr) {
            this.cr = this.eH();
            this.a(eih.i, aro.f((float)this.cr));
         }

         if (this.ce != this.ct) {
            this.ct = this.ce;
            this.a(eih.j, aro.f((float)this.ct));
         }

         if (this.cd != this.cs) {
            this.cs = this.cd;
            this.a(eih.k, aro.f((float)this.cs));
         }

         if (this.ce != this.cx) {
            this.cx = this.ce;
            this.c.b(new zu(this.cf, this.ce, this.cd));
         }

         if (this.ah % 20 == 0) {
            ai.p.a(this);
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
      if (this.et() > 0.0F && this.cK != null) {
         ai.U.a(this, this.cK);
      }

      this.cK = null;
      super.n();
   }

   public void o() {
      if (this.ab > 0.0F && this.cK == null) {
         this.cK = this.di();
      }
   }

   @Override
   public void p() {
      if (this.cY() != null && this.cY().bl()) {
         if (this.cM == null) {
            this.cM = this.di();
         } else {
            ai.V.a(this, this.cM);
         }
      }

      if (this.cM != null && (this.cY() == null || !this.cY().bl())) {
         this.cM = null;
      }
   }

   private void a(eih $$0, int $$1) {
      this.gf().a($$0, this.cx(), $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(bhe $$0) {
      this.a(dji.p);
      boolean $$1 = this.dK().X().b(cpg.m);
      if ($$1) {
         te $$2 = this.eI().a();
         this.c.a(new yr(this.ah(), $$2), so.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            te $$3x = te.a("death.attack.message_too_long", te.b($$2x).a(n.o));
            te $$4x = te.a("death.attack.even_more_magic", this.H_()).a($$1xx -> $$1xx.a(new tj(tj.a.a, $$3x)));
            return new yr(this.ah(), $$4x);
         }), true);
         eig $$3 = this.cf();
         if ($$3 == null || $$3.k() == eig.b.a) {
            this.d.ac().a($$2, false);
         } else if ($$3.k() == eig.b.c) {
            this.d.ac().a(this, $$2);
         } else if ($$3.k() == eig.b.d) {
            this.d.ac().b(this, $$2);
         }
      } else {
         this.c.b(new yr(this.ah(), td.a));
      }

      this.ge();
      if (this.dK().X().b(cpg.J)) {
         this.gq();
      }

      if (!this.G_()) {
         this.g($$0);
      }

      this.gf().a(eih.c, this.cx(), eid::a);
      biw $$4 = this.eJ();
      if ($$4 != null) {
         this.b(ape.h.b($$4.ag()));
         $$4.a(this, this.bh, $$0);
         this.f($$4);
      }

      this.dK().a(this, (byte)3);
      this.a(ape.N);
      this.a(ape.i.b(ape.m));
      this.a(ape.i.b(ape.n));
      this.ay();
      this.k(0);
      this.a_(false);
      this.eI().c();
      this.a(Optional.of(he.a(this.dK().ac(), this.dk())));
   }

   private void gq() {
      eha $$0 = new eha(this.dk()).c(32.0, 10.0, 32.0);
      this.dK().a(biy.class, $$0, bij.f).stream().filter($$0x -> $$0x instanceof bjd).forEach($$0x -> ((bjd)$$0x).a_((cbl)this));
   }

   @Override
   public void a(big $$0, int $$1, bhe $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.s($$1);
         String $$3 = this.cx();
         String $$4 = $$0.cx();
         this.gf().a(eih.e, $$3, eid::a);
         if ($$0 instanceof cbl) {
            this.a(ape.Q);
            this.gf().a(eih.d, $$3, eid::a);
         } else {
            this.a(ape.O);
         }

         this.a($$3, $$4, eih.l);
         this.a($$4, $$3, eih.m);
         ai.b.a(this, $$0, $$2);
      }
   }

   private void a(String $$0, String $$1, eih[] $$2) {
      eic $$3 = this.gf().g($$1);
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gf().a($$2[$$4], $$0, eid::a);
         }
      }
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.d.l() && this.gr() && $$0.a(apl.m);
         if (!$$2 && this.cy > 0 && !$$0.a(apl.d)) {
            return false;
         } else {
            big $$3 = $$0.d();
            if ($$3 instanceof cbl $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof cbr $$5 && $$5.v() instanceof cbl $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(cbl $$0) {
      return !this.gr() ? false : super.a($$0);
   }

   private boolean gr() {
      return this.d.Y();
   }

   @Nullable
   @Override
   protected eay a(aki $$0) {
      eay $$1 = super.a($$0);
      if ($$1 != null && this.dK().ac() == cpk.h && $$0.ac() == cpk.j) {
         ehf $$2 = $$1.a.b(0.0, -1.0, 0.0);
         return new eay($$2, ehf.b, 90.0F, 0.0F);
      } else {
         return $$1;
      }
   }

   @Nullable
   @Override
   public big b(aki $$0) {
      this.cD = true;
      aki $$1 = this.x();
      aeo<cpk> $$2 = $$1.ac();
      if ($$2 == cpk.j && $$0.ac() == cpk.h) {
         this.ae();
         this.x().a(this, big.c.e);
         if (!this.f) {
            this.f = true;
            this.c.b(new xu(xu.e, this.cE ? 0.0F : 1.0F));
            this.cE = true;
         }

         return this;
      } else {
         ebs $$3 = $$0.u_();
         this.c.b(new yz(this.d($$0), (byte)3));
         this.c.b(new xb($$3.s(), $$3.t()));
         anx $$4 = this.d.ac();
         $$4.d(this);
         $$1.a(this, big.c.e);
         this.dH();
         eay $$5 = this.a($$0);
         if ($$5 != null) {
            $$1.ad().a("moving");
            if ($$2 == cpk.h && $$0.ac() == cpk.i) {
               this.cL = this.di();
            } else if ($$0.ac() == cpk.j) {
               this.a($$0, gv.a($$5.a));
            }

            $$1.ad().c();
            $$1.ad().a("placing");
            this.c($$0);
            this.c.a($$5.a.c, $$5.a.d, $$5.a.e, $$5.c, $$5.d);
            this.c.l();
            $$0.b(this);
            $$1.ad().c();
            this.f($$1);
            this.c.b(new yn(this.fR()));
            $$4.a(this, $$0);
            $$4.e(this);

            for (bht $$6 : this.eq()) {
               this.c.b(new aaq(this.ah(), $$6));
            }

            this.c.b(new ya(1032, gv.b, 0, false));
            this.cx = -1;
            this.cu = -1.0F;
            this.cv = -1;
         }

         return this;
      }
   }

   private void a(aki $$0, gv $$1) {
      gv.a $$2 = $$1.j();

      for (int $$3 = -2; $$3 <= 2; $$3++) {
         for (int $$4 = -2; $$4 <= 2; $$4++) {
            for (int $$5 = -1; $$5 < 3; $$5++) {
               dey $$6 = $$5 == -1 ? csl.co.n() : csl.a.n();
               $$0.b($$2.g($$1).e($$4, $$5, $$3), $$6);
            }
         }
      }
   }

   @Override
   protected Optional<l.a> a(aki $$0, gv $$1, boolean $$2, dgp $$3) {
      Optional<l.a> $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         hb.a $$5 = this.dK().a_(this.ax).d(cxm.a).orElse(hb.a.a);
         Optional<l.a> $$6 = $$0.o().a($$1, $$5);
         if (!$$6.isPresent()) {
            b.error("Unable to create a portal, likely target out of worldborder");
         }

         return $$6;
      }
   }

   private void f(aki $$0) {
      aeo<cpk> $$1 = $$0.ac();
      aeo<cpk> $$2 = this.dK().ac();
      ai.v.a(this, $$1, $$2);
      if ($$1 == cpk.i && $$2 == cpk.h && this.cL != null) {
         ai.C.a(this, this.cL);
      }

      if ($$2 != cpk.i) {
         this.cL = null;
      }
   }

   @Override
   public boolean a(akj $$0) {
      if ($$0.G_()) {
         return this.H() == this;
      } else {
         return this.G_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(big $$0, int $$1) {
      super.a($$0, $$1);
      this.bQ.d();
   }

   @Override
   public Either<cbl.a, asn> a(gv $$0) {
      hb $$1 = this.dK().a_($$0).c(cwd.aC);
      if (this.fB() || !this.bv()) {
         return Either.left(cbl.a.e);
      } else if (!this.dK().x_().j()) {
         return Either.left(cbl.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cbl.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cbl.a.d);
      } else {
         this.a(this.dK().ac(), $$0, this.dA(), false, true);
         if (this.dK().N()) {
            return Either.left(cbl.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               ehf $$4 = ehf.c($$0);
               List<byz> $$5 = this.dK()
                  .a(byz.class, new eha($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.f(this));
               if (!$$5.isEmpty()) {
                  return Either.left(cbl.a.f);
               }
            }

            Either<cbl.a, asn> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(ape.ap);
               ai.q.a(this);
            });
            if (!this.x().d()) {
               this.a(te.c("sleep.not_possible"), true);
            }

            ((aki)this.dK()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(gv $$0) {
      this.a(ape.i.b(ape.n));
      super.b($$0);
   }

   private boolean a(gv $$0, hb $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(gv $$0) {
      ehf $$1 = ehf.c($$0);
      return Math.abs(this.dp() - $$1.a()) <= 3.0 && Math.abs(this.dr() - $$1.b()) <= 2.0 && Math.abs(this.dv() - $$1.c()) <= 3.0;
   }

   private boolean b(gv $$0, hb $$1) {
      gv $$2 = $$0.c();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fB()) {
         this.x().k().a(this, new ws(this, 2));
      }

      super.a($$0, $$1);
      if (this.c != null) {
         this.c.a(this.dp(), this.dr(), this.dv(), this.dA(), this.dC());
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.bB();
      this.e($$0, $$1, $$2);
   }

   @Override
   public boolean b(bhe $$0) {
      return super.b($$0) || this.L();
   }

   @Override
   protected void a(double $$0, boolean $$1, dey $$2, gv $$3) {
   }

   @Override
   protected void c(gv $$0) {
      if (!this.G_()) {
         super.c($$0);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.dd()) {
         this.b($$3, new ehf($$0, $$1, $$2));
         gv $$4 = this.aF();
         super.a($$1, $$3, this.dK().a_($$4), $$4);
      }
   }

   @Override
   public void a(dds $$0, boolean $$1) {
      this.c.b(new wy(this.dK(), $$0.p()));
      this.c.b(new yl($$0.p(), $$1));
   }

   private void gs() {
      this.da = this.da % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bgr $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.bQ != this.bP) {
            this.q();
         }

         this.gs();
         cec $$1 = $$0.createMenu(this.da, this.fQ(), this);
         if ($$1 == null) {
            if (this.G_()) {
               this.a(te.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.c.b(new yk($$1.j, $$1.a(), $$0.H_()));
            this.a($$1);
            this.bQ = $$1;
            return OptionalInt.of(this.da);
         }
      }
   }

   @Override
   public void a(int $$0, coi $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.c.b(new yg($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(bwh $$0, bgh $$1) {
      if (this.bQ != this.bP) {
         this.q();
      }

      this.gs();
      this.c.b(new xv(this.da, $$1.b(), $$0.ah()));
      this.bQ = new cfa(this.da, this.fQ(), $$1, $$0);
      this.a(this.bQ);
   }

   @Override
   public void a(ciw $$0, bgn $$1) {
      if ($$0.a(ciz.th)) {
         if (cks.a($$0, this.dc(), this)) {
            this.bQ.d();
         }

         this.c.b(new yj($$1));
      }
   }

   @Override
   public void a(dcu $$0) {
      this.c.b(ww.a($$0, dck::o));
   }

   @Override
   public void q() {
      this.c.b(new xi(this.bQ.j));
      this.r();
   }

   @Override
   public void r() {
      this.bQ.b(this);
      this.bP.a(this.bQ);
      this.bQ = this.bP;
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
   public void a(apb<?> $$0, int $$1) {
      this.cn.b(this, $$0, $$1);
      this.gf().a($$0, this.cx(), $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(apb<?> $$0) {
      this.cn.a(this, $$0, 0);
      this.gf().a($$0, this.cx(), eid::c);
   }

   @Override
   public int a(Collection<clz<?>> $$0) {
      return this.cF.a($$0, this);
   }

   @Override
   public void a(clz<?> $$0, List<ciw> $$1) {
      ai.Z.a(this, $$0.e(), $$1);
   }

   @Override
   public void a(aep[] $$0) {
      List<clz<?>> $$1 = Lists.newArrayList();

      for (aep $$2 : $$0) {
         this.d.aE().a($$2).ifPresent($$1::add);
      }

      this.a($$1);
   }

   @Override
   public int b(Collection<clz<?>> $$0) {
      return this.cF.b($$0, this);
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cx = -1;
   }

   @Override
   public void s() {
      this.cI = true;
      this.bA();
      if (this.fB()) {
         this.a(true, false);
      }
   }

   public boolean t() {
      return this.cI;
   }

   public void u() {
      this.cu = -1.0E8F;
   }

   @Override
   public void a(te $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void Z_() {
      if (!this.bv.b() && this.fl()) {
         this.c.b(new xr(this, (byte)9));
         super.Z_();
      }
   }

   @Override
   public void a(ec.a $$0, ehf $$1) {
      super.a($$0, $$1);
      this.c.b(new yu($$0, $$1.c, $$1.d, $$1.e));
   }

   public void a(ec.a $$0, big $$1, ec.a $$2) {
      ehf $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.c.b(new yu($$0, $$1, $$2));
   }

   public void a(akj $$0, boolean $$1) {
      this.cW = $$0.cW;
      this.cU = $$0.cU;
      this.cZ = $$0.cZ;
      this.e.a($$0.e.b(), $$0.e.c());
      this.w();
      if ($$1) {
         this.fQ().a($$0.fQ());
         this.c($$0.et());
         this.bR = $$0.bR;
         this.cd = $$0.cd;
         this.ce = $$0.ce;
         this.cf = $$0.cf;
         this.r($$0.fL());
         this.ax = $$0.ax;
      } else if (this.dK().X().b(cpg.d) || $$0.G_()) {
         this.fQ().a($$0.fQ());
         this.cd = $$0.cd;
         this.ce = $$0.ce;
         this.cf = $$0.cf;
         this.r($$0.fL());
      }

      this.cg = $$0.cg;
      this.bO = $$0.bO;
      this.al().b(bK, $$0.al().b(bK));
      this.cx = -1;
      this.cu = -1.0F;
      this.cv = -1;
      this.cF.a($$0.cF);
      this.cE = $$0.cE;
      this.cL = $$0.cL;
      this.cO = $$0.cO;
      this.cJ = $$0.cJ;
      this.i($$0.gh());
      this.j($$0.gi());
      this.a($$0.gp());
   }

   @Override
   protected void a(bht $$0, @Nullable big $$1) {
      super.a($$0, $$1);
      this.c.b(new aaq(this.ah(), $$0));
      if ($$0.c() == bhv.y) {
         this.cH = this.ah;
         this.cG = this.di();
      }

      ai.A.a(this, $$1);
   }

   @Override
   protected void a(bht $$0, boolean $$1, @Nullable big $$2) {
      super.a($$0, $$1, $$2);
      this.c.b(new aaq(this.ah(), $$0));
      ai.A.a(this, $$2);
   }

   @Override
   protected void a(bht $$0) {
      super.a($$0);
      this.c.b(new yy(this.ah(), $$0.c()));
      if ($$0.c() == bhv.y) {
         this.cG = null;
      }

      ai.A.a(this, null);
   }

   @Override
   public void b(double $$0, double $$1, double $$2) {
      this.c.a($$0, $$1, $$2, this.dA(), this.dC(), bjk.g);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.c.a(this.dp() + $$0, this.dr() + $$1, this.dv() + $$2, this.dA(), this.dC(), bjk.f);
   }

   @Override
   public boolean a(aki $$0, double $$1, double $$2, double $$3, Set<bjk> $$4, float $$5, float $$6) {
      cor $$7 = new cor(gv.a($$1, $$2, $$3));
      $$0.k().a(akn.g, $$7, 1, this.ah());
      this.aa();
      if (this.fB()) {
         this.a(true, true);
      }

      if ($$0 == this.dK()) {
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
      this.c.l();
   }

   @Override
   public void a(big $$0) {
      this.x().k().a(this, new ws($$0, 4));
   }

   @Override
   public void b(big $$0) {
      this.x().k().a(this, new ws($$0, 5));
   }

   @Override
   public void w() {
      if (this.c != null) {
         this.c.b(new yn(this.fR()));
         this.G();
      }
   }

   public aki x() {
      return (aki)this.dK();
   }

   public boolean a(cph $$0) {
      if (!this.e.a($$0)) {
         return false;
      } else {
         this.c.b(new xu(xu.d, (float)$$0.a()));
         if ($$0 == cph.d) {
            this.ge();
            this.aa();
         } else {
            this.c(this);
         }

         this.w();
         this.fj();
         return true;
      }
   }

   @Override
   public boolean G_() {
      return this.e.b() == cph.d;
   }

   @Override
   public boolean f() {
      return this.e.b() == cph.b;
   }

   @Override
   public void a(te $$0) {
      this.b($$0, false);
   }

   public void b(te $$0, boolean $$1) {
      if (this.v($$1)) {
         this.c.a(new aaj($$0, $$1), so.a(() -> {
            if (this.v(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               te $$3 = te.b($$2).a(n.o);
               return new aaj(te.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }), true);
      }
   }

   public void a(ts $$0, boolean $$1, ta.a $$2) {
      if (this.gt()) {
         $$0.a(this, $$1, $$2);
      }
   }

   @Override
   public String y() {
      return this.c.m() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(abg $$0) {
      this.cJ = OptionalInt.of($$0.d());
      this.cz = $$0.e();
      this.cA = $$0.f();
      this.cU = $$0.i();
      this.cV = $$0.j();
      this.al().b(bK, (byte)$$0.g());
      this.al().b(bL, (byte)($$0.h() == biq.a ? 0 : 1));
   }

   public boolean z() {
      return this.cA;
   }

   public cbj A() {
      return this.cz;
   }

   private boolean v(boolean $$0) {
      return this.cz == cbj.c ? $$0 : true;
   }

   private boolean gt() {
      return this.cz == cbj.a;
   }

   public OptionalInt B() {
      return this.cJ;
   }

   public void a(ads $$0) {
      this.c.b(new zd($$0.a(), $$0.d().map(ads.a::a), $$0.e()));
   }

   @Override
   protected int C() {
      return this.d.c(this.fP());
   }

   @Override
   public void D() {
      this.cB = ac.b();
   }

   public apa E() {
      return this.cn;
   }

   public aoz F() {
      return this.cF;
   }

   @Override
   protected void G() {
      if (this.G_()) {
         this.eo();
         this.j(true);
      } else {
         super.G();
      }
   }

   public big H() {
      return (big)(this.cC == null ? this : this.cC);
   }

   @Override
   public void c(@Nullable big $$0) {
      big $$1 = this.H();
      this.cC = (big)($$0 == null ? this : $$0);
      if ($$1 != this.cC) {
         if (this.cC.dK() instanceof aki $$2) {
            this.a($$2, this.cC.dp(), this.cC.dr(), this.cC.dv(), Set.of(), this.dA(), this.dC());
         }

         if ($$0 != null) {
            this.x().k().a(this);
         }

         this.c.b(new zk(this.cC));
         this.c.l();
      }
   }

   @Override
   protected void I() {
      if (!this.cD) {
         super.I();
      }
   }

   @Override
   public void d(big $$0) {
      if (this.e.b() == cph.d) {
         this.c($$0);
      } else {
         super.d($$0);
      }
   }

   public long J() {
      return this.cB;
   }

   @Nullable
   public te K() {
      return null;
   }

   @Override
   public void a(bgn $$0) {
      super.a($$0);
      this.gk();
   }

   public boolean L() {
      return this.cD;
   }

   public void M() {
      this.cD = false;
   }

   public aex N() {
      return this.cm;
   }

   public void a(aki $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      this.c(this);
      this.aa();
      if ($$0 == this.dK()) {
         this.c.a($$1, $$2, $$3, $$4, $$5);
      } else {
         aki $$6 = this.x();
         ebs $$7 = $$0.u_();
         this.c.b(new yz(this.d($$0), (byte)3));
         this.c.b(new xb($$7.s(), $$7.t()));
         this.d.ac().d(this);
         $$6.a(this, big.c.e);
         this.dH();
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
   public gv O() {
      return this.cQ;
   }

   public float P() {
      return this.cS;
   }

   public aeo<cpk> Q() {
      return this.cP;
   }

   public boolean R() {
      return this.cR;
   }

   public void a(aeo<cpk> $$0, @Nullable gv $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.cQ) && $$0.equals(this.cP);
         if ($$4 && !$$5) {
            this.a(te.c("block.minecraft.set_spawn"));
         }

         this.cQ = $$1;
         this.cP = $$0;
         this.cS = $$2;
         this.cR = $$3;
      } else {
         this.cQ = null;
         this.cP = cpk.h;
         this.cS = 0.0F;
         this.cR = false;
      }
   }

   public hy S() {
      return this.cN;
   }

   public void a(hy $$0) {
      this.cN = $$0;
   }

   public ajx T() {
      return this.cO;
   }

   public void a(ajx $$0) {
      this.cO = $$0;
   }

   @Override
   public void a(aot $$0, aov $$1, float $$2, float $$3) {
      this.c.b(new aag(jc.c.d($$0), $$1, this.dp(), this.dr(), this.dv(), $$2, $$3, this.ag.g()));
   }

   @Override
   public uw<wo> U() {
      return new wr(this);
   }

   @Override
   public bye a(ciw $$0, boolean $$1, boolean $$2) {
      bye $$3 = super.a($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dK().b($$3);
         ciw $$4 = $$3.j();
         if ($$2) {
            if (!$$4.b()) {
               this.a(ape.f.b($$4.d()), $$0.L());
            }

            this.a(ape.F);
         }

         return $$3;
      }
   }

   public all V() {
      return this.cT;
   }

   public void c(aki $$0) {
      this.a((cpk)$$0);
      this.e.a($$0);
   }

   @Nullable
   private static cph a(@Nullable qs $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? cph.a($$0.h($$1)) : null;
   }

   private cph b(@Nullable cph $$0) {
      cph $$1 = this.d.aX();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.d.o_();
      }
   }

   @Override
   public void c(@Nullable qs $$0) {
      this.e.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void k(qs $$0) {
      $$0.a("playerGameType", this.e.b().a());
      cph $$1 = this.e.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean W() {
      return this.cU;
   }

   public boolean b(akj $$0) {
      return $$0 == this ? false : this.cU || $$0.cU;
   }

   @Override
   public boolean a(cpk $$0, gv $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(ciw $$0) {
      ai.T.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cbk $$1 = this.fQ();
      ciw $$2 = $$1.a($$0);
      this.bQ.b($$1, $$1.l).ifPresent($$1x -> this.bQ.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean X() {
      return this.cV;
   }

   @Override
   public Optional<car> Y() {
      return Optional.of(this.cW);
   }

   @Override
   public void a(bye $$0) {
      super.a($$0);
      big $$1 = $$0.v();
      if ($$1 != null) {
         ai.P.a(this, $$0.j(), $$1);
      }
   }

   public void a(tu $$0) {
      this.cZ = $$0;
   }

   @Nullable
   public tu Z() {
      return this.cZ != null && this.cZ.c() ? null : this.cZ;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cj = (float)(aro.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dA());
      this.c.b(new xw(this));
   }

   @Override
   public boolean a(big $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         $$0.i(this);
         this.c.a(this.dp(), this.dr(), this.dv(), this.dA(), this.dC());
         if ($$0 instanceof biw $$2) {
            for (bht $$3 : $$2.eq()) {
               this.c.b(new aaq($$0.ah(), $$3));
            }
         }

         return true;
      }
   }

   @Override
   public void aa() {
      big $$0 = this.cY();
      super.aa();
      if ($$0 instanceof biw $$1) {
         for (bht $$2 : $$1.eq()) {
            this.c.b(new yy($$0.ah(), $$2.c()));
         }
      }
   }

   public aas d(aki $$0) {
      return new aas($$0.aa(), $$0.ac(), cqk.a($$0.A()), this.e.b(), this.e.c(), $$0.af(), $$0.z(), this.gp(), this.at());
   }
}
