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

public class ako extends cbp {
   private static final Logger b = LogUtils.getLogger();
   private static final int ck = 32;
   private static final int cl = 10;
   public all c;
   public final MinecraftServer d;
   public final akp e;
   private final afc cm;
   private final apf cn;
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
   private cbn cz = cbn.a;
   private boolean cA = true;
   private long cB = ac.b();
   @Nullable
   private bil cC;
   private boolean cD;
   private boolean cE;
   private final ape cF = new ape();
   @Nullable
   private ehi cG;
   private int cH;
   private boolean cI;
   private OptionalInt cJ = OptionalInt.empty();
   @Nullable
   private ehi cK;
   @Nullable
   private ehi cL;
   @Nullable
   private ehi cM;
   private hz cN = hz.a(0, 0, 0);
   private akc cO = akc.a;
   private aet<cpq> cP = cpq.h;
   @Nullable
   private gw cQ;
   private boolean cR;
   private float cS;
   private final alq cT;
   private boolean cU;
   private boolean cV;
   private cav cW = new cav(0, 0, 0);
   private final cet cX = new cet() {
      @Override
      public void a(ceg $$0, hp<cja> $$1, cja $$2, int[] $$3) {
         ako.this.c.b(new xn($$0.j, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(ceg $$0, int $$1, cja $$2) {
         ako.this.c.b(new xp($$0.j, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(ceg $$0, cja $$1) {
         ako.this.c.b(new xp(-1, $$0.k(), -1, $$1));
      }

      @Override
      public void a(ceg $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(ceg $$0, int $$1, int $$2) {
         ako.this.c.b(new xo($$0.j, $$1, $$2));
      }
   };
   private final ces cY = new ces() {
      @Override
      public void a(ceg $$0, int $$1, cja $$2) {
         cfy $$3 = $$0.b($$1);
         if (!($$3 instanceof cfu)) {
            if ($$3.d == ako.this.fQ()) {
               al.e.a(ako.this, ako.this.fQ(), $$2);
            }
         }
      }

      @Override
      public void a(ceg $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private ty cZ;
   private int da;
   public boolean f;

   public ako(MinecraftServer $$0, akn $$1, GameProfile $$2) {
      super($$1, $$1.R(), $$1.S(), $$2);
      this.cT = $$0.a(this);
      this.e = $$0.b(this);
      this.d = $$0;
      this.cn = $$0.ac().a((cbp)this);
      this.cm = $$0.ac().f(this);
      this.t(1.0F);
      this.e($$1);
   }

   private void e(akn $$0) {
      gw $$1 = $$0.R();
      if ($$0.x_().g() && $$0.n().aT().m() != cpn.c) {
         int $$2 = Math.max(0, this.d.a($$0));
         int $$3 = ars.a($$0.w_().b((double)$$1.u(), (double)$$1.w()));
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
         int $$8 = arx.a().a($$6);

         for (int $$9 = 0; $$9 < $$6; $$9++) {
            int $$10 = ($$8 + $$7 * $$9) % $$6;
            int $$11 = $$10 % ($$2 * 2 + 1);
            int $$12 = $$10 / ($$2 * 2 + 1);
            gw $$13 = aki.a($$0, $$1.u() + $$11 - $$2, $$1.w() + $$12 - $$2);
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
   public void a(qu $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         cav.a.parse(new Dynamic(rf.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(b::error).ifPresent($$0x -> this.cW = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         qu $$1 = $$0.p("enteredNetherPosition");
         this.cL = new ehi($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.cE = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cF.a($$0.p("recipeBook"), this.d.aE());
      }

      if (this.fB()) {
         this.fC();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.cQ = new gw($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.cR = $$0.q("SpawnForced");
         this.cS = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.cP = cpq.g.parse(rf.a, $$0.c("SpawnDimension")).resultOrPartial(b::error).orElse(cpq.h);
         }
      }
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      cav.a.encodeStart(rf.a, this.cW).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.cE);
      if (this.cL != null) {
         qu $$1 = new qu();
         $$1.a("x", this.cL.c);
         $$1.a("y", this.cL.d);
         $$1.a("z", this.cL.e);
         $$0.a("enteredNetherPosition", $$1);
      }

      bil $$2 = this.cV();
      bil $$3 = this.cY();
      if ($$3 != null && $$2 != this && $$2.cU()) {
         qu $$4 = new qu();
         qu $$5 = new qu();
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
         aeu.a.encodeStart(rf.a, this.cP.a()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.fZ();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.cf = ars.a((float)$$0 / $$1, 0.0F, $$2);
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
   public void a(cja $$0, int $$1) {
      super.a($$0, $$1);
      this.cx = -1;
   }

   private void a(ceg $$0) {
      $$0.a(this.cY);
      $$0.a(this.cX);
   }

   public void h() {
      this.a(this.bP);
   }

   @Override
   public void Q_() {
      super.Q_();
      this.c.b(new yu());
   }

   @Override
   public void F_() {
      super.F_();
      this.c.b(new yt(this.eI()));
   }

   @Override
   protected void a(dfe $$0) {
      al.d.a(this, $$0);
   }

   @Override
   protected ciw k() {
      return new cjv(this);
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

      bil $$0 = this.H();
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

      al.w.a(this);
      if (this.cG != null) {
         al.u.a(this, this.cG, this.ah - this.cH);
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
            cja $$1 = this.fQ().a($$0);
            if ($$1.d().ac_()) {
               va<?> $$2 = ((chf)$$1.d()).a($$1, this.dK(), this);
               if ($$2 != null) {
                  this.c.b($$2);
               }
            }
         }

         if (this.et() != this.cu || this.cv != this.bR.a() || this.bR.e() == 0.0F != this.cw) {
            this.c.b(new zz(this.et(), this.bR.a(), this.bR.e()));
            this.cu = this.et();
            this.cv = this.bR.a();
            this.cw = this.bR.e() == 0.0F;
         }

         if (this.et() + this.fi() != this.co) {
            this.co = this.et() + this.fi();
            this.a(eik.f, ars.f(this.co));
         }

         if (this.bR.a() != this.cp) {
            this.cp = this.bR.a();
            this.a(eik.g, ars.f((float)this.cp));
         }

         if (this.ch() != this.cq) {
            this.cq = this.ch();
            this.a(eik.h, ars.f((float)this.cq));
         }

         if (this.eH() != this.cr) {
            this.cr = this.eH();
            this.a(eik.i, ars.f((float)this.cr));
         }

         if (this.ce != this.ct) {
            this.ct = this.ce;
            this.a(eik.j, ars.f((float)this.ct));
         }

         if (this.cd != this.cs) {
            this.cs = this.cd;
            this.a(eik.k, ars.f((float)this.cs));
         }

         if (this.ce != this.cx) {
            this.cx = this.ce;
            this.c.b(new zy(this.cf, this.ce, this.cd));
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
      if (this.et() > 0.0F && this.cK != null) {
         al.U.a(this, this.cK);
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
            al.V.a(this, this.cM);
         }
      }

      if (this.cM != null && (this.cY() == null || !this.cY().bl())) {
         this.cM = null;
      }
   }

   private void a(eik $$0, int $$1) {
      this.gf().a($$0, this.cx(), $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(bhj $$0) {
      this.a(djo.p);
      boolean $$1 = this.dK().X().b(cpm.m);
      if ($$1) {
         ti $$2 = this.eI().a();
         this.c.a(new yv(this.ah(), $$2), ss.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            ti $$3x = ti.a("death.attack.message_too_long", ti.b($$2x).a(n.o));
            ti $$4x = ti.a("death.attack.even_more_magic", this.H_()).a($$1xx -> $$1xx.a(new tn(tn.a.a, $$3x)));
            return new yv(this.ah(), $$4x);
         }));
         eij $$3 = this.cf();
         if ($$3 == null || $$3.k() == eij.b.a) {
            this.d.ac().a($$2, false);
         } else if ($$3.k() == eij.b.c) {
            this.d.ac().a(this, $$2);
         } else if ($$3.k() == eij.b.d) {
            this.d.ac().b(this, $$2);
         }
      } else {
         this.c.b(new yv(this.ah(), th.a));
      }

      this.ge();
      if (this.dK().X().b(cpm.J)) {
         this.gq();
      }

      if (!this.G_()) {
         this.g($$0);
      }

      this.gf().a(eik.c, this.cx(), eig::a);
      bjb $$4 = this.eJ();
      if ($$4 != null) {
         this.b(apj.h.b($$4.ag()));
         $$4.a(this, this.bh, $$0);
         this.f($$4);
      }

      this.dK().a(this, (byte)3);
      this.a(apj.N);
      this.a(apj.i.b(apj.m));
      this.a(apj.i.b(apj.n));
      this.ay();
      this.k(0);
      this.a_(false);
      this.eI().c();
      this.a(Optional.of(hf.a(this.dK().ac(), this.dk())));
   }

   private void gq() {
      ehd $$0 = new ehd(this.dk()).c(32.0, 10.0, 32.0);
      this.dK().a(bjd.class, $$0, bio.f).stream().filter($$0x -> $$0x instanceof bji).forEach($$0x -> ((bji)$$0x).a_((cbp)this));
   }

   @Override
   public void a(bil $$0, int $$1, bhj $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.s($$1);
         String $$3 = this.cx();
         String $$4 = $$0.cx();
         this.gf().a(eik.e, $$3, eig::a);
         if ($$0 instanceof cbp) {
            this.a(apj.Q);
            this.gf().a(eik.d, $$3, eig::a);
         } else {
            this.a(apj.O);
         }

         this.a($$3, $$4, eik.l);
         this.a($$4, $$3, eik.m);
         al.b.a(this, $$0, $$2);
      }
   }

   private void a(String $$0, String $$1, eik[] $$2) {
      eif $$3 = this.gf().g($$1);
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gf().a($$2[$$4], $$0, eig::a);
         }
      }
   }

   @Override
   public boolean a(bhj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.d.l() && this.gr() && $$0.a(apq.m);
         if (!$$2 && this.cy > 0 && !$$0.a(apq.d)) {
            return false;
         } else {
            bil $$3 = $$0.d();
            if ($$3 instanceof cbp $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof cbv $$5 && $$5.v() instanceof cbp $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(cbp $$0) {
      return !this.gr() ? false : super.a($$0);
   }

   private boolean gr() {
      return this.d.Y();
   }

   @Nullable
   @Override
   protected ebe a(akn $$0) {
      ebe $$1 = super.a($$0);
      if ($$1 != null && this.dK().ac() == cpq.h && $$0.ac() == cpq.j) {
         ehi $$2 = $$1.a.b(0.0, -1.0, 0.0);
         return new ebe($$2, ehi.b, 90.0F, 0.0F);
      } else {
         return $$1;
      }
   }

   @Nullable
   @Override
   public bil b(akn $$0) {
      this.cD = true;
      akn $$1 = this.x();
      aet<cpq> $$2 = $$1.ac();
      if ($$2 == cpq.j && $$0.ac() == cpq.h) {
         this.ae();
         this.x().a(this, bil.c.e);
         if (!this.f) {
            this.f = true;
            this.c.b(new xy(xy.e, this.cE ? 0.0F : 1.0F));
            this.cE = true;
         }

         return this;
      } else {
         eby $$3 = $$0.u_();
         this.c.b(new zd(this.d($$0), (byte)3));
         this.c.b(new xf($$3.s(), $$3.t()));
         aoc $$4 = this.d.ac();
         $$4.d(this);
         $$1.a(this, bil.c.e);
         this.dH();
         ebe $$5 = this.a($$0);
         if ($$5 != null) {
            $$1.ad().a("moving");
            if ($$2 == cpq.h && $$0.ac() == cpq.i) {
               this.cL = this.di();
            } else if ($$0.ac() == cpq.j) {
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
            this.c.b(new yr(this.fR()));
            $$4.a(this, $$0);
            $$4.e(this);

            for (bhy $$6 : this.eq()) {
               this.c.b(new aau(this.ah(), $$6));
            }

            this.c.b(new ye(1032, gw.b, 0, false));
            this.cx = -1;
            this.cu = -1.0F;
            this.cv = -1;
         }

         return this;
      }
   }

   private void a(akn $$0, gw $$1) {
      gw.a $$2 = $$1.j();

      for (int $$3 = -2; $$3 <= 2; $$3++) {
         for (int $$4 = -2; $$4 <= 2; $$4++) {
            for (int $$5 = -1; $$5 < 3; $$5++) {
               dfe $$6 = $$5 == -1 ? csr.co.n() : csr.a.n();
               $$0.b($$2.g($$1).e($$4, $$5, $$3), $$6);
            }
         }
      }
   }

   @Override
   protected Optional<l.a> a(akn $$0, gw $$1, boolean $$2, dgv $$3) {
      Optional<l.a> $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         hc.a $$5 = this.dK().a_(this.ax).d(cxs.a).orElse(hc.a.a);
         Optional<l.a> $$6 = $$0.o().a($$1, $$5);
         if ($$6.isEmpty()) {
            b.error("Unable to create a portal, likely target out of worldborder");
         }

         return $$6;
      }
   }

   private void f(akn $$0) {
      aet<cpq> $$1 = $$0.ac();
      aet<cpq> $$2 = this.dK().ac();
      al.v.a(this, $$1, $$2);
      if ($$1 == cpq.i && $$2 == cpq.h && this.cL != null) {
         al.C.a(this, this.cL);
      }

      if ($$2 != cpq.i) {
         this.cL = null;
      }
   }

   @Override
   public boolean a(ako $$0) {
      if ($$0.G_()) {
         return this.H() == this;
      } else {
         return this.G_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bil $$0, int $$1) {
      super.a($$0, $$1);
      this.bQ.d();
   }

   @Override
   public Either<cbp.a, ass> a(gw $$0) {
      hc $$1 = this.dK().a_($$0).c(cwj.aC);
      if (this.fB() || !this.bv()) {
         return Either.left(cbp.a.e);
      } else if (!this.dK().x_().j()) {
         return Either.left(cbp.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cbp.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cbp.a.d);
      } else {
         this.a(this.dK().ac(), $$0, this.dA(), false, true);
         if (this.dK().N()) {
            return Either.left(cbp.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               ehi $$4 = ehi.c($$0);
               List<bzd> $$5 = this.dK()
                  .a(bzd.class, new ehd($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.f(this));
               if (!$$5.isEmpty()) {
                  return Either.left(cbp.a.f);
               }
            }

            Either<cbp.a, ass> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(apj.ap);
               al.q.a(this);
            });
            if (!this.x().d()) {
               this.a(ti.c("sleep.not_possible"), true);
            }

            ((akn)this.dK()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(gw $$0) {
      this.a(apj.i.b(apj.n));
      super.b($$0);
   }

   private boolean a(gw $$0, hc $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(gw $$0) {
      ehi $$1 = ehi.c($$0);
      return Math.abs(this.dp() - $$1.a()) <= 3.0 && Math.abs(this.dr() - $$1.b()) <= 2.0 && Math.abs(this.dv() - $$1.c()) <= 3.0;
   }

   private boolean b(gw $$0, hc $$1) {
      gw $$2 = $$0.c();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fB()) {
         this.x().k().a(this, new ww(this, 2));
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
   public boolean b(bhj $$0) {
      return super.b($$0) || this.L();
   }

   @Override
   protected void a(double $$0, boolean $$1, dfe $$2, gw $$3) {
   }

   @Override
   protected void c(gw $$0) {
      if (!this.G_()) {
         super.c($$0);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.dd()) {
         this.b($$3, new ehi($$0, $$1, $$2));
         gw $$4 = this.aF();
         super.a($$1, $$3, this.dK().a_($$4), $$4);
      }
   }

   @Override
   public void a(ddy $$0, boolean $$1) {
      this.c.b(new xc(this.dK(), $$0.p()));
      this.c.b(new yp($$0.p(), $$1));
   }

   private void gs() {
      this.da = this.da % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bgw $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.bQ != this.bP) {
            this.q();
         }

         this.gs();
         ceg $$1 = $$0.createMenu(this.da, this.fQ(), this);
         if ($$1 == null) {
            if (this.G_()) {
               this.a(ti.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.c.b(new yo($$1.j, $$1.a(), $$0.H_()));
            this.a($$1);
            this.bQ = $$1;
            return OptionalInt.of(this.da);
         }
      }
   }

   @Override
   public void a(int $$0, cop $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.c.b(new yk($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(bwl $$0, bgm $$1) {
      if (this.bQ != this.bP) {
         this.q();
      }

      this.gs();
      this.c.b(new xz(this.da, $$1.b(), $$0.ah()));
      this.bQ = new cfe(this.da, this.fQ(), $$1, $$0);
      this.a(this.bQ);
   }

   @Override
   public void a(cja $$0, bgs $$1) {
      if ($$0.a(cjd.th)) {
         if (ckw.a($$0, this.dc(), this)) {
            this.bQ.d();
         }

         this.c.b(new yn($$1));
      }
   }

   @Override
   public void a(dda $$0) {
      this.c.b(xa.a($$0, dcq::o));
   }

   @Override
   public void q() {
      this.c.b(new xm(this.bQ.j));
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
   public void a(apg<?> $$0, int $$1) {
      this.cn.b(this, $$0, $$1);
      this.gf().a($$0, this.cx(), $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(apg<?> $$0) {
      this.cn.a(this, $$0, 0);
      this.gf().a($$0, this.cx(), eig::c);
   }

   @Override
   public int a(Collection<cmf<?>> $$0) {
      return this.cF.a($$0, this);
   }

   @Override
   public void a(cmf<?> $$0, List<cja> $$1) {
      al.Z.a(this, $$0.a(), $$1);
   }

   @Override
   public void a(aeu[] $$0) {
      List<cmf<?>> $$1 = Lists.newArrayList();

      for (aeu $$2 : $$0) {
         this.d.aE().a($$2).ifPresent($$1::add);
      }

      this.a($$1);
   }

   @Override
   public int b(Collection<cmf<?>> $$0) {
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
   public void a(ti $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void Y_() {
      if (!this.bv.b() && this.fl()) {
         this.c.b(new xv(this, (byte)9));
         super.Y_();
      }
   }

   @Override
   public void a(ed.a $$0, ehi $$1) {
      super.a($$0, $$1);
      this.c.b(new yy($$0, $$1.c, $$1.d, $$1.e));
   }

   public void a(ed.a $$0, bil $$1, ed.a $$2) {
      ehi $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.c.b(new yy($$0, $$1, $$2));
   }

   public void a(ako $$0, boolean $$1) {
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
      } else if (this.dK().X().b(cpm.d) || $$0.G_()) {
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
   protected void a(bhy $$0, @Nullable bil $$1) {
      super.a($$0, $$1);
      this.c.b(new aau(this.ah(), $$0));
      if ($$0.c() == bia.y) {
         this.cH = this.ah;
         this.cG = this.di();
      }

      al.A.a(this, $$1);
   }

   @Override
   protected void a(bhy $$0, boolean $$1, @Nullable bil $$2) {
      super.a($$0, $$1, $$2);
      this.c.b(new aau(this.ah(), $$0));
      al.A.a(this, $$2);
   }

   @Override
   protected void a(bhy $$0) {
      super.a($$0);
      this.c.b(new zc(this.ah(), $$0.c()));
      if ($$0.c() == bia.y) {
         this.cG = null;
      }

      al.A.a(this, null);
   }

   @Override
   public void b(double $$0, double $$1, double $$2) {
      this.c.a($$0, $$1, $$2, this.dA(), this.dC(), bjp.g);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.c.a(this.dp() + $$0, this.dr() + $$1, this.dv() + $$2, this.dA(), this.dC(), bjp.f);
   }

   @Override
   public boolean a(akn $$0, double $$1, double $$2, double $$3, Set<bjp> $$4, float $$5, float $$6) {
      cox $$7 = new cox(gw.a($$1, $$2, $$3));
      $$0.k().a(aks.g, $$7, 1, this.ah());
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
      this.c.m();
   }

   @Override
   public void a(bil $$0) {
      this.x().k().a(this, new ww($$0, 4));
   }

   @Override
   public void b(bil $$0) {
      this.x().k().a(this, new ww($$0, 5));
   }

   @Override
   public void w() {
      if (this.c != null) {
         this.c.b(new yr(this.fR()));
         this.G();
      }
   }

   public akn x() {
      return (akn)this.dK();
   }

   public boolean a(cpn $$0) {
      if (!this.e.a($$0)) {
         return false;
      } else {
         this.c.b(new xy(xy.d, (float)$$0.a()));
         if ($$0 == cpn.d) {
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
      return this.e.b() == cpn.d;
   }

   @Override
   public boolean f() {
      return this.e.b() == cpn.b;
   }

   @Override
   public void a(ti $$0) {
      this.b($$0, false);
   }

   public void b(ti $$0, boolean $$1) {
      if (this.v($$1)) {
         this.c.a(new aan($$0, $$1), ss.a(() -> {
            if (this.v(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               ti $$3 = ti.b($$2).a(n.o);
               return new aan(ti.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(tw $$0, boolean $$1, te.a $$2) {
      if (this.gt()) {
         $$0.a(this, $$1, $$2);
      }
   }

   @Override
   public String y() {
      return this.c.n() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(abl $$0) {
      this.cJ = OptionalInt.of($$0.d());
      this.cz = $$0.e();
      this.cA = $$0.f();
      this.cU = $$0.i();
      this.cV = $$0.j();
      this.al().b(bK, (byte)$$0.g());
      this.al().b(bL, (byte)($$0.h() == biv.a ? 0 : 1));
   }

   public boolean z() {
      return this.cA;
   }

   public cbn A() {
      return this.cz;
   }

   private boolean v(boolean $$0) {
      return this.cz == cbn.c ? $$0 : true;
   }

   private boolean gt() {
      return this.cz == cbn.a;
   }

   public OptionalInt B() {
      return this.cJ;
   }

   public void a(adx $$0) {
      this.c.b(new zh($$0.a(), $$0.d().map(adx.a::a), $$0.e()));
   }

   @Override
   protected int C() {
      return this.d.c(this.fP());
   }

   @Override
   public void D() {
      this.cB = ac.b();
   }

   public apf E() {
      return this.cn;
   }

   public ape F() {
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

   public bil H() {
      return (bil)(this.cC == null ? this : this.cC);
   }

   @Override
   public void c(@Nullable bil $$0) {
      bil $$1 = this.H();
      this.cC = (bil)($$0 == null ? this : $$0);
      if ($$1 != this.cC) {
         if (this.cC.dK() instanceof akn $$2) {
            this.a($$2, this.cC.dp(), this.cC.dr(), this.cC.dv(), Set.of(), this.dA(), this.dC());
         }

         if ($$0 != null) {
            this.x().k().a(this);
         }

         this.c.b(new zo(this.cC));
         this.c.m();
      }
   }

   @Override
   protected void I() {
      if (!this.cD) {
         super.I();
      }
   }

   @Override
   public void d(bil $$0) {
      if (this.e.b() == cpn.d) {
         this.c($$0);
      } else {
         super.d($$0);
      }
   }

   public long J() {
      return this.cB;
   }

   @Nullable
   public ti K() {
      return null;
   }

   @Override
   public void a(bgs $$0) {
      super.a($$0);
      this.gk();
   }

   public boolean L() {
      return this.cD;
   }

   public void M() {
      this.cD = false;
   }

   public afc N() {
      return this.cm;
   }

   public void a(akn $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      this.c(this);
      this.aa();
      if ($$0 == this.dK()) {
         this.c.a($$1, $$2, $$3, $$4, $$5);
      } else {
         akn $$6 = this.x();
         eby $$7 = $$0.u_();
         this.c.b(new zd(this.d($$0), (byte)3));
         this.c.b(new xf($$7.s(), $$7.t()));
         this.d.ac().d(this);
         $$6.a(this, bil.c.e);
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
   public gw O() {
      return this.cQ;
   }

   public float P() {
      return this.cS;
   }

   public aet<cpq> Q() {
      return this.cP;
   }

   public boolean R() {
      return this.cR;
   }

   public void a(aet<cpq> $$0, @Nullable gw $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.cQ) && $$0.equals(this.cP);
         if ($$4 && !$$5) {
            this.a(ti.c("block.minecraft.set_spawn"));
         }

         this.cQ = $$1;
         this.cP = $$0;
         this.cS = $$2;
         this.cR = $$3;
      } else {
         this.cQ = null;
         this.cP = cpq.h;
         this.cS = 0.0F;
         this.cR = false;
      }
   }

   public hz S() {
      return this.cN;
   }

   public void a(hz $$0) {
      this.cN = $$0;
   }

   public akc T() {
      return this.cO;
   }

   public void a(akc $$0) {
      this.cO = $$0;
   }

   @Override
   public void a(aoy $$0, apa $$1, float $$2, float $$3) {
      this.c.b(new aak(jd.c.d($$0), $$1, this.dp(), this.dr(), this.dv(), $$2, $$3, this.ag.g()));
   }

   @Override
   public va<ws> U() {
      return new wv(this);
   }

   @Override
   public byi a(cja $$0, boolean $$1, boolean $$2) {
      byi $$3 = super.a($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dK().b($$3);
         cja $$4 = $$3.j();
         if ($$2) {
            if (!$$4.b()) {
               this.a(apj.f.b($$4.d()), $$0.L());
            }

            this.a(apj.F);
         }

         return $$3;
      }
   }

   public alq V() {
      return this.cT;
   }

   public void c(akn $$0) {
      this.a((cpq)$$0);
      this.e.a($$0);
   }

   @Nullable
   private static cpn a(@Nullable qu $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? cpn.a($$0.h($$1)) : null;
   }

   private cpn b(@Nullable cpn $$0) {
      cpn $$1 = this.d.aW();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.d.o_();
      }
   }

   @Override
   public void c(@Nullable qu $$0) {
      this.e.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void k(qu $$0) {
      $$0.a("playerGameType", this.e.b().a());
      cpn $$1 = this.e.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean W() {
      return this.cU;
   }

   public boolean b(ako $$0) {
      return $$0 == this ? false : this.cU || $$0.cU;
   }

   @Override
   public boolean a(cpq $$0, gw $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cja $$0) {
      al.T.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cbo $$1 = this.fQ();
      cja $$2 = $$1.a($$0);
      this.bQ.b($$1, $$1.l).ifPresent($$1x -> this.bQ.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean X() {
      return this.cV;
   }

   @Override
   public Optional<cav> Y() {
      return Optional.of(this.cW);
   }

   @Override
   public void a(byi $$0) {
      super.a($$0);
      bil $$1 = $$0.v();
      if ($$1 != null) {
         al.P.a(this, $$0.j(), $$1);
      }
   }

   public void a(ty $$0) {
      this.cZ = $$0;
   }

   @Nullable
   public ty Z() {
      return this.cZ != null && this.cZ.b() ? null : this.cZ;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cj = (float)(ars.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dA());
      this.c.b(new ya(this));
   }

   @Override
   public boolean a(bil $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         $$0.i(this);
         this.c.a(this.dp(), this.dr(), this.dv(), this.dA(), this.dC());
         if ($$0 instanceof bjb $$2) {
            for (bhy $$3 : $$2.eq()) {
               this.c.b(new aau($$0.ah(), $$3));
            }
         }

         return true;
      }
   }

   @Override
   public void aa() {
      bil $$0 = this.cY();
      super.aa();
      if ($$0 instanceof bjb $$1) {
         for (bhy $$2 : $$1.eq()) {
            this.c.b(new zc($$0.ah(), $$2.c()));
         }
      }
   }

   public aaw d(akn $$0) {
      return new aaw($$0.aa(), $$0.ac(), cqq.a($$0.A()), this.e.b(), this.e.c(), $$0.af(), $$0.z(), this.gp(), this.at());
   }
}
