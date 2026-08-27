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

public class aig extends byo {
   private static final Logger b = LogUtils.getLogger();
   private static final int cl = 32;
   private static final int cm = 10;
   public aiy c;
   public final MinecraftServer d;
   public final aih e;
   private final acy cn;
   private final amn co;
   private float cp = Float.MIN_VALUE;
   private int cq = Integer.MIN_VALUE;
   private int cr = Integer.MIN_VALUE;
   private int cs = Integer.MIN_VALUE;
   private int ct = Integer.MIN_VALUE;
   private int cu = Integer.MIN_VALUE;
   private float cv = -1.0E8F;
   private int cw = -99999999;
   private boolean cx = true;
   private int cy = -99999999;
   private int cz = 60;
   private bym cA = bym.a;
   private boolean cB = true;
   private long cC = ac.b();
   @Nullable
   private bfj cD;
   private boolean cE;
   private boolean cF;
   private final amm cG = new amm();
   @Nullable
   private eei cH;
   private int cI;
   private boolean cJ;
   @Nullable
   private eei cK;
   @Nullable
   private eei cL;
   @Nullable
   private eei cM;
   private hx cN = hx.a(0, 0, 0);
   private acp<cmm> cO = cmm.h;
   @Nullable
   private gu cP;
   private boolean cQ;
   private float cR;
   private final ajd cS;
   private boolean cT;
   private boolean cU;
   private bxu cV = new bxu(0, 0, 0);
   private final cbs cW = new cbs() {
      @Override
      public void a(cbf $$0, hn<cfz> $$1, cfz $$2, int[] $$3) {
         aig.this.c.a(new vk($$0.j, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cbf $$0, int $$1, cfz $$2) {
         aig.this.c.a(new vm($$0.j, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cbf $$0, cfz $$1) {
         aig.this.c.a(new vm(-1, $$0.k(), -1, $$1));
      }

      @Override
      public void a(cbf $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cbf $$0, int $$1, int $$2) {
         aig.this.c.a(new vl($$0.j, $$1, $$2));
      }
   };
   private final cbr cX = new cbr() {
      @Override
      public void a(cbf $$0, int $$1, cfz $$2) {
         ccx $$3 = $$0.b($$1);
         if (!($$3 instanceof cct)) {
            if ($$3.d == aig.this.fN()) {
               ai.e.a(aig.this, aig.this.fN(), $$2);
            }
         }
      }

      @Override
      public void a(cbf $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private tm cY;
   private int cZ;
   public int f;
   public boolean g;

   public aig(MinecraftServer $$0, aif $$1, GameProfile $$2) {
      super($$1, $$1.R(), $$1.S(), $$2);
      this.cS = $$0.a(this);
      this.e = $$0.b(this);
      this.d = $$0;
      this.co = $$0.ac().a((byo)this);
      this.cn = $$0.ac().f(this);
      this.r(1.0F);
      this.d($$1);
   }

   private void d(aif $$0) {
      gu $$1 = $$0.R();
      if ($$0.x_().g() && $$0.n().aU().m() != cmj.c) {
         int $$2 = Math.max(0, this.d.a($$0));
         int $$3 = apa.a($$0.w_().b((double)$$1.u(), (double)$$1.w()));
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
         int $$8 = apf.a().a($$6);

         for (int $$9 = 0; $$9 < $$6; $$9++) {
            int $$10 = ($$8 + $$7 * $$9) % $$6;
            int $$11 = $$10 % ($$2 * 2 + 1);
            int $$12 = $$10 / ($$2 * 2 + 1);
            gu $$13 = aia.a($$0, $$1.u() + $$11 - $$2, $$1.w() + $$12 - $$2);
            if ($$13 != null) {
               this.a($$13, 0.0F, 0.0F);
               if ($$0.g(this)) {
                  break;
               }
            }
         }
      } else {
         this.a($$1, 0.0F, 0.0F);

         while (!$$0.g(this) && this.dp() < (double)($$0.aj() - 1)) {
            this.e(this.dn(), this.dp() + 1.0, this.dt());
         }
      }
   }

   private int u(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         bxu.a.parse(new Dynamic(rc.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(b::error).ifPresent($$0x -> this.cV = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         qr $$1 = $$0.p("enteredNetherPosition");
         this.cL = new eei($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.cF = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cG.a($$0.p("recipeBook"), this.d.aE());
      }

      if (this.fy()) {
         this.fz();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.cP = new gu($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.cQ = $$0.q("SpawnForced");
         this.cR = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.cO = cmm.g.parse(rc.a, $$0.c("SpawnDimension")).resultOrPartial(b::error).orElse(cmm.h);
         }
      }
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      bxu.a.encodeStart(rc.a, this.cV).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.cF);
      if (this.cL != null) {
         qr $$1 = new qr();
         $$1.a("x", this.cL.c);
         $$1.a("y", this.cL.d);
         $$1.a("z", this.cL.e);
         $$0.a("enteredNetherPosition", $$1);
      }

      bfj $$2 = this.cT();
      bfj $$3 = this.cW();
      if ($$3 != null && $$2 != this && $$2.cS()) {
         qr $$4 = new qr();
         qr $$5 = new qr();
         $$2.e($$5);
         $$4.a("Attach", $$3.ct());
         $$4.a("Entity", $$5);
         $$0.a("RootVehicle", $$4);
      }

      $$0.a("recipeBook", this.cG.b());
      $$0.a("Dimension", this.dI().ac().a().toString());
      if (this.cP != null) {
         $$0.a("SpawnX", this.cP.u());
         $$0.a("SpawnY", this.cP.v());
         $$0.a("SpawnZ", this.cP.w());
         $$0.a("SpawnForced", this.cQ);
         $$0.a("SpawnAngle", this.cR);
         acq.a.encodeStart(rc.a, this.cO.a()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.fW();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.cg = apa.a((float)$$0 / $$1, 0.0F, $$2);
      this.cy = -1;
   }

   public void b(int $$0) {
      this.ce = $$0;
      this.cy = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cy = -1;
   }

   @Override
   public void a(cfz $$0, int $$1) {
      super.a($$0, $$1);
      this.cy = -1;
   }

   private void a(cbf $$0) {
      $$0.a(this.cX);
      $$0.a(this.cW);
   }

   public void h() {
      this.a(this.bQ);
   }

   @Override
   public void Q_() {
      super.Q_();
      this.c.a(new wv());
   }

   @Override
   public void F_() {
      super.F_();
      this.c.a(new wu(this.eG()));
   }

   @Override
   protected void a(dcb $$0) {
      ai.d.a(this, $$0);
   }

   @Override
   protected cfv k() {
      return new cgu(this);
   }

   @Override
   public void l() {
      this.e.a();
      this.cV.a();
      this.cz--;
      if (this.ak > 0) {
         this.ak--;
      }

      this.bR.d();
      if (!this.dI().B && !this.bR.a(this)) {
         this.q();
         this.bR = this.bQ;
      }

      bfj $$0 = this.G();
      if ($$0 != this) {
         if ($$0.bs()) {
            this.a($$0.dn(), $$0.dp(), $$0.dt(), $$0.dy(), $$0.dA());
            this.x().k().a(this);
            if (this.fE()) {
               this.c(this);
            }
         } else {
            this.c(this);
         }
      }

      ai.w.a(this);
      if (this.cH != null) {
         ai.u.a(this, this.cH, this.ag - this.cI);
      }

      this.o();
      this.p();
      this.cn.b(this);
   }

   public void m() {
      try {
         if (!this.G_() || !this.db()) {
            super.l();
         }

         for (int $$0 = 0; $$0 < this.fN().b(); $$0++) {
            cfz $$1 = this.fN().a($$0);
            if ($$1.d().ad_()) {
               uo<?> $$2 = ((cee)$$1.d()).a($$1, this.dI(), this);
               if ($$2 != null) {
                  this.c.a($$2);
               }
            }
         }

         if (this.er() != this.cv || this.cw != this.bS.a() || this.bS.e() == 0.0F != this.cx) {
            this.c.a(new yb(this.er(), this.bS.a(), this.bS.e()));
            this.cv = this.er();
            this.cw = this.bS.a();
            this.cx = this.bS.e() == 0.0F;
         }

         if (this.er() + this.ff() != this.cp) {
            this.cp = this.er() + this.ff();
            this.a(efj.f, apa.f(this.cp));
         }

         if (this.bS.a() != this.cq) {
            this.cq = this.bS.a();
            this.a(efj.g, apa.f((float)this.cq));
         }

         if (this.cf() != this.cr) {
            this.cr = this.cf();
            this.a(efj.h, apa.f((float)this.cr));
         }

         if (this.eF() != this.cs) {
            this.cs = this.eF();
            this.a(efj.i, apa.f((float)this.cs));
         }

         if (this.cf != this.cu) {
            this.cu = this.cf;
            this.a(efj.j, apa.f((float)this.cu));
         }

         if (this.ce != this.ct) {
            this.ct = this.ce;
            this.a(efj.k, apa.f((float)this.ct));
         }

         if (this.cf != this.cy) {
            this.cy = this.cf;
            this.c.a(new ya(this.cg, this.cf, this.ce));
         }

         if (this.ag % 20 == 0) {
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
      if (this.er() > 0.0F && this.cK != null) {
         ai.U.a(this, this.cK);
      }

      this.cK = null;
      super.n();
   }

   public void o() {
      if (this.aa > 0.0F && this.cK == null) {
         this.cK = this.dg();
      }
   }

   public void p() {
      if (this.cW() != null && this.cW().bi()) {
         if (this.cM == null) {
            this.cM = this.dg();
         } else {
            ai.V.a(this, this.cM);
         }
      }

      if (this.cM != null && (this.cW() == null || !this.cW().bi())) {
         this.cM = null;
      }
   }

   private void a(efj $$0, int $$1) {
      this.gc().a($$0, this.cv(), $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(ben $$0) {
      this.a(dgl.p);
      boolean $$1 = this.dI().X().b(cmi.m);
      if ($$1) {
         sw $$2 = this.eG().a();
         this.c.a(new ww(this.af(), $$2), sl.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            sw $$3x = sw.a("death.attack.message_too_long", sw.b($$2x).a(n.o));
            sw $$4x = sw.a("death.attack.even_more_magic", this.H_()).a($$1xx -> $$1xx.a(new tb(tb.a.a, $$3x)));
            return new ww(this.af(), $$4x);
         }));
         efi $$3 = this.cd();
         if ($$3 == null || $$3.k() == efi.b.a) {
            this.d.ac().a($$2, false);
         } else if ($$3.k() == efi.b.c) {
            this.d.ac().a(this, $$2);
         } else if ($$3.k() == efi.b.d) {
            this.d.ac().b(this, $$2);
         }
      } else {
         this.c.a(new ww(this.af(), sv.a));
      }

      this.gb();
      if (this.dI().X().b(cmi.J)) {
         this.gn();
      }

      if (!this.G_()) {
         this.g($$0);
      }

      this.gc().a(efj.c, this.cv(), eff::a);
      bfz $$4 = this.eH();
      if ($$4 != null) {
         this.b(amr.h.b($$4.ae()));
         $$4.a(this, this.bi, $$0);
         this.f($$4);
      }

      this.dI().a(this, (byte)3);
      this.a(amr.N);
      this.a(amr.i.b(amr.m));
      this.a(amr.i.b(amr.n));
      this.aw();
      this.k(0);
      this.a_(false);
      this.eG().c();
      this.a(Optional.of(hd.a(this.dI().ac(), this.di())));
   }

   private void gn() {
      eed $$0 = new eed(this.di()).c(32.0, 10.0, 32.0);
      this.dI().a(bgb.class, $$0, bfm.f).stream().filter($$0x -> $$0x instanceof bgg).forEach($$0x -> ((bgg)$$0x).a_((byo)this));
   }

   @Override
   public void a(bfj $$0, int $$1, ben $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.s($$1);
         String $$3 = this.cv();
         String $$4 = $$0.cv();
         this.gc().a(efj.e, $$3, eff::a);
         if ($$0 instanceof byo) {
            this.a(amr.Q);
            this.gc().a(efj.d, $$3, eff::a);
         } else {
            this.a(amr.O);
         }

         this.a($$3, $$4, efj.l);
         this.a($$4, $$3, efj.m);
         ai.b.a(this, $$0, $$2);
      }
   }

   private void a(String $$0, String $$1, efj[] $$2) {
      efe $$3 = this.gc().i($$1);
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gc().a($$2[$$4], $$0, eff::a);
         }
      }
   }

   @Override
   public boolean a(ben $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.d.l() && this.go() && $$0.a(amy.m);
         if (!$$2 && this.cz > 0 && !$$0.a(amy.d)) {
            return false;
         } else {
            bfj $$3 = $$0.d();
            if ($$3 instanceof byo $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof byu $$5 && $$5.v() instanceof byo $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(byo $$0) {
      return !this.go() ? false : super.a($$0);
   }

   private boolean go() {
      return this.d.Y();
   }

   @Nullable
   @Override
   protected dyb a(aif $$0) {
      dyb $$1 = super.a($$0);
      if ($$1 != null && this.dI().ac() == cmm.h && $$0.ac() == cmm.j) {
         eei $$2 = $$1.a.b(0.0, -1.0, 0.0);
         return new dyb($$2, eei.b, 90.0F, 0.0F);
      } else {
         return $$1;
      }
   }

   @Nullable
   @Override
   public bfj b(aif $$0) {
      this.cE = true;
      aif $$1 = this.x();
      acp<cmm> $$2 = $$1.ac();
      if ($$2 == cmm.j && $$0.ac() == cmm.h) {
         this.ac();
         this.x().a(this, bfj.c.e);
         if (!this.g) {
            this.g = true;
            this.c.a(new vx(vx.e, this.cF ? 0.0F : 1.0F));
            this.cF = true;
         }

         return this;
      } else {
         dyv $$3 = $$0.u_();
         this.c.a(new xf($$0.aa(), $$0.ac(), cnm.a($$0.A()), this.e.b(), this.e.c(), $$0.af(), $$0.z(), (byte)3, this.gm(), this.ar()));
         this.c.a(new ve($$3.s(), $$3.t()));
         alk $$4 = this.d.ac();
         $$4.d(this);
         $$1.a(this, bfj.c.e);
         this.dF();
         dyb $$5 = this.a($$0);
         if ($$5 != null) {
            $$1.ad().a("moving");
            if ($$2 == cmm.h && $$0.ac() == cmm.i) {
               this.cL = this.dg();
            } else if ($$0.ac() == cmm.j) {
               this.a($$0, gu.a($$5.a));
            }

            $$1.ad().c();
            $$1.ad().a("placing");
            this.c($$0);
            this.c.a($$5.a.c, $$5.a.d, $$5.a.e, $$5.c, $$5.d);
            this.c.d();
            $$0.b(this);
            $$1.ad().c();
            this.e($$1);
            this.c.a(new ws(this.fO()));
            $$4.a(this, $$0);
            $$4.e(this);

            for (bfa $$6 : this.eo()) {
               this.c.a(new yw(this.af(), $$6));
            }

            this.c.a(new we(1032, gu.b, 0, false));
            this.cy = -1;
            this.cv = -1.0F;
            this.cw = -1;
         }

         return this;
      }
   }

   private void a(aif $$0, gu $$1) {
      gu.a $$2 = $$1.j();

      for (int $$3 = -2; $$3 <= 2; $$3++) {
         for (int $$4 = -2; $$4 <= 2; $$4++) {
            for (int $$5 = -1; $$5 < 3; $$5++) {
               dcb $$6 = $$5 == -1 ? cpo.co.n() : cpo.a.n();
               $$0.b($$2.g($$1).e($$4, $$5, $$3), $$6);
            }
         }
      }
   }

   @Override
   protected Optional<l.a> a(aif $$0, gu $$1, boolean $$2, dds $$3) {
      Optional<l.a> $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         ha.a $$5 = this.dI().a_(this.aw).d(cup.a).orElse(ha.a.a);
         Optional<l.a> $$6 = $$0.o().a($$1, $$5);
         if (!$$6.isPresent()) {
            b.error("Unable to create a portal, likely target out of worldborder");
         }

         return $$6;
      }
   }

   private void e(aif $$0) {
      acp<cmm> $$1 = $$0.ac();
      acp<cmm> $$2 = this.dI().ac();
      ai.v.a(this, $$1, $$2);
      if ($$1 == cmm.i && $$2 == cmm.h && this.cL != null) {
         ai.C.a(this, this.cL);
      }

      if ($$2 != cmm.i) {
         this.cL = null;
      }
   }

   @Override
   public boolean a(aig $$0) {
      if ($$0.G_()) {
         return this.G() == this;
      } else {
         return this.G_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bfj $$0, int $$1) {
      super.a($$0, $$1);
      this.bR.d();
   }

   @Override
   public Either<byo.a, apz> a(gu $$0) {
      ha $$1 = this.dI().a_($$0).c(ctg.aC);
      if (this.fy() || !this.bs()) {
         return Either.left(byo.a.e);
      } else if (!this.dI().x_().j()) {
         return Either.left(byo.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(byo.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(byo.a.d);
      } else {
         this.a(this.dI().ac(), $$0, this.dy(), false, true);
         if (this.dI().N()) {
            return Either.left(byo.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               eei $$4 = eei.c($$0);
               List<bwc> $$5 = this.dI()
                  .a(bwc.class, new eed($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.f(this));
               if (!$$5.isEmpty()) {
                  return Either.left(byo.a.f);
               }
            }

            Either<byo.a, apz> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(amr.ap);
               ai.q.a(this);
            });
            if (!this.x().d()) {
               this.a(sw.c("sleep.not_possible"), true);
            }

            ((aif)this.dI()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(gu $$0) {
      this.a(amr.i.b(amr.n));
      super.b($$0);
   }

   private boolean a(gu $$0, ha $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(gu $$0) {
      eei $$1 = eei.c($$0);
      return Math.abs(this.dn() - $$1.a()) <= 3.0 && Math.abs(this.dp() - $$1.b()) <= 2.0 && Math.abs(this.dt() - $$1.c()) <= 3.0;
   }

   private boolean b(gu $$0, ha $$1) {
      gu $$2 = $$0.c();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fy()) {
         this.x().k().a(this, new uv(this, 2));
      }

      super.a($$0, $$1);
      if (this.c != null) {
         this.c.a(this.dn(), this.dp(), this.dt(), this.dy(), this.dA());
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.bA();
      this.e($$0, $$1, $$2);
   }

   @Override
   public boolean b(ben $$0) {
      return super.b($$0) || this.K();
   }

   @Override
   protected void a(double $$0, boolean $$1, dcb $$2, gu $$3) {
   }

   @Override
   protected void c(gu $$0) {
      if (!this.G_()) {
         super.c($$0);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.db()) {
         this.b($$3, new eei($$0, $$1, $$2));
         gu $$4 = this.aD();
         super.a($$1, $$3, this.dI().a_($$4), $$4);
      }
   }

   @Override
   public void a(dav $$0, boolean $$1) {
      this.c.a(new vb(this.dI(), $$0.p()));
      this.c.a(new wp($$0.p(), $$1));
   }

   private void gp() {
      this.cZ = this.cZ % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bea $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.bR != this.bQ) {
            this.q();
         }

         this.gp();
         cbf $$1 = $$0.createMenu(this.cZ, this.fN(), this);
         if ($$1 == null) {
            if (this.G_()) {
               this.a(sw.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.c.a(new wo($$1.j, $$1.a(), $$0.H_()));
            this.a($$1);
            this.bR = $$1;
            return OptionalInt.of(this.cZ);
         }
      }
   }

   @Override
   public void a(int $$0, cll $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.c.a(new wk($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(btk $$0, bdq $$1) {
      if (this.bR != this.bQ) {
         this.q();
      }

      this.gp();
      this.c.a(new vy(this.cZ, $$1.b(), $$0.af()));
      this.bR = new ccd(this.cZ, this.fN(), $$1, $$0);
      this.a(this.bR);
   }

   @Override
   public void a(cfz $$0, bdw $$1) {
      if ($$0.a(cgc.th)) {
         if (chv.a($$0, this.da(), this)) {
            this.bR.d();
         }

         this.c.a(new wn($$1));
      }
   }

   @Override
   public void a(czx $$0) {
      this.c.a(uz.a($$0, czn::o));
   }

   @Override
   public void q() {
      this.c.a(new vj(this.bR.j));
      this.r();
   }

   @Override
   public void r() {
      this.bR.b(this);
      this.bQ.a(this.bR);
      this.bR = this.bQ;
   }

   public void a(float $$0, float $$1, boolean $$2, boolean $$3) {
      if (this.bM()) {
         if ($$0 >= -1.0F && $$0 <= 1.0F) {
            this.bl = $$0;
         }

         if ($$1 >= -1.0F && $$1 <= 1.0F) {
            this.bn = $$1;
         }

         this.bk = $$2;
         this.f($$3);
      }
   }

   @Override
   public void a(amo<?> $$0, int $$1) {
      this.co.b(this, $$0, $$1);
      this.gc().a($$0, this.cv(), $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(amo<?> $$0) {
      this.co.a(this, $$0, 0);
      this.gc().a($$0, this.cv(), eff::c);
   }

   @Override
   public int a(Collection<cjc<?>> $$0) {
      return this.cG.a($$0, this);
   }

   @Override
   public void a(cjc<?> $$0, List<cfz> $$1) {
      ai.Z.a(this, $$0.e(), $$1);
   }

   @Override
   public void a(acq[] $$0) {
      List<cjc<?>> $$1 = Lists.newArrayList();

      for (acq $$2 : $$0) {
         this.d.aE().a($$2).ifPresent($$1::add);
      }

      this.a($$1);
   }

   @Override
   public int b(Collection<cjc<?>> $$0) {
      return this.cG.b($$0, this);
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cy = -1;
   }

   @Override
   public void s() {
      this.cJ = true;
      this.bz();
      if (this.fy()) {
         this.a(true, false);
      }
   }

   public boolean t() {
      return this.cJ;
   }

   public void u() {
      this.cv = -1.0E8F;
   }

   @Override
   public void a(sw $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void Z_() {
      if (!this.bw.b() && this.fi()) {
         this.c.a(new vu(this, (byte)9));
         super.Z_();
      }
   }

   @Override
   public void a(eb.a $$0, eei $$1) {
      super.a($$0, $$1);
      this.c.a(new wz($$0, $$1.c, $$1.d, $$1.e));
   }

   public void a(eb.a $$0, bfj $$1, eb.a $$2) {
      eei $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.c.a(new wz($$0, $$1, $$2));
   }

   public void a(aig $$0, boolean $$1) {
      this.cV = $$0.cV;
      this.cT = $$0.cT;
      this.cY = $$0.cY;
      this.e.a($$0.e.b(), $$0.e.c());
      this.w();
      if ($$1) {
         this.fN().a($$0.fN());
         this.t($$0.er());
         this.bS = $$0.bS;
         this.ce = $$0.ce;
         this.cf = $$0.cf;
         this.cg = $$0.cg;
         this.r($$0.fI());
         this.aw = $$0.aw;
      } else if (this.dI().X().b(cmi.d) || $$0.G_()) {
         this.fN().a($$0.fN());
         this.ce = $$0.ce;
         this.cf = $$0.cf;
         this.cg = $$0.cg;
         this.r($$0.fI());
      }

      this.ch = $$0.ch;
      this.bP = $$0.bP;
      this.aj().b(bL, $$0.aj().b(bL));
      this.cy = -1;
      this.cv = -1.0F;
      this.cw = -1;
      this.cG.a($$0.cG);
      this.cF = $$0.cF;
      this.cL = $$0.cL;
      this.i($$0.ge());
      this.j($$0.gf());
      this.a($$0.gm());
   }

   @Override
   protected void a(bfa $$0, @Nullable bfj $$1) {
      super.a($$0, $$1);
      this.c.a(new yw(this.af(), $$0));
      if ($$0.c() == bfc.y) {
         this.cI = this.ag;
         this.cH = this.dg();
      }

      ai.A.a(this, $$1);
   }

   @Override
   protected void a(bfa $$0, boolean $$1, @Nullable bfj $$2) {
      super.a($$0, $$1, $$2);
      this.c.a(new yw(this.af(), $$0));
      ai.A.a(this, $$2);
   }

   @Override
   protected void a(bfa $$0) {
      super.a($$0);
      this.c.a(new xd(this.af(), $$0.c()));
      if ($$0.c() == bfc.y) {
         this.cH = null;
      }

      ai.A.a(this, null);
   }

   @Override
   public void b(double $$0, double $$1, double $$2) {
      this.c.a($$0, $$1, $$2, this.dy(), this.dA(), bgn.g);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.c.a(this.dn() + $$0, this.dp() + $$1, this.dt() + $$2, this.dy(), this.dA(), bgn.f);
   }

   @Override
   public boolean a(aif $$0, double $$1, double $$2, double $$3, Set<bgn> $$4, float $$5, float $$6) {
      clt $$7 = new clt(gu.a($$1, $$2, $$3));
      $$0.k().a(aik.g, $$7, 1, this.af());
      this.Y();
      if (this.fy()) {
         this.a(true, true);
      }

      if ($$0 == this.dI()) {
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
      this.c.d();
   }

   @Override
   public void a(bfj $$0) {
      this.x().k().a(this, new uv($$0, 4));
   }

   @Override
   public void b(bfj $$0) {
      this.x().k().a(this, new uv($$0, 5));
   }

   @Override
   public void w() {
      if (this.c != null) {
         this.c.a(new ws(this.fO()));
         this.F();
      }
   }

   public aif x() {
      return (aif)this.dI();
   }

   public boolean a(cmj $$0) {
      if (!this.e.a($$0)) {
         return false;
      } else {
         this.c.a(new vx(vx.d, (float)$$0.a()));
         if ($$0 == cmj.d) {
            this.gb();
            this.Y();
         } else {
            this.c(this);
         }

         this.w();
         this.fg();
         return true;
      }
   }

   @Override
   public boolean G_() {
      return this.e.b() == cmj.d;
   }

   @Override
   public boolean f() {
      return this.e.b() == cmj.b;
   }

   @Override
   public void a(sw $$0) {
      this.b($$0, false);
   }

   public void b(sw $$0, boolean $$1) {
      if (this.v($$1)) {
         this.c.a(new yo($$0, $$1), sl.a(() -> {
            if (this.v(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               sw $$3 = sw.b($$2).a(n.o);
               return new yo(sw.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(tk $$0, boolean $$1, ss.a $$2) {
      if (this.gq()) {
         $$0.a(this, $$1, $$2);
      }
   }

   @Override
   public String y() {
      return this.c.e() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(zl $$0) {
      this.cA = $$0.d();
      this.cB = $$0.e();
      this.cT = $$0.h();
      this.cU = $$0.i();
      this.aj().b(bL, (byte)$$0.f());
      this.aj().b(bM, (byte)($$0.g() == bft.a ? 0 : 1));
   }

   public boolean z() {
      return this.cB;
   }

   public bym A() {
      return this.cA;
   }

   private boolean v(boolean $$0) {
      return this.cA == bym.c ? $$0 : true;
   }

   private boolean gq() {
      return this.cA == bym.a;
   }

   public void a(String $$0, String $$1, boolean $$2, @Nullable sw $$3) {
      this.c.a(new xe($$0, $$1, $$2, $$3));
   }

   public void a(abt $$0) {
      this.c.a(new xj($$0.a(), $$0.d().map(abt.a::a), $$0.e()));
   }

   @Override
   protected int B() {
      return this.d.c(this.fM());
   }

   @Override
   public void C() {
      this.cC = ac.b();
   }

   public amn D() {
      return this.co;
   }

   public amm E() {
      return this.cG;
   }

   @Override
   protected void F() {
      if (this.G_()) {
         this.em();
         this.j(true);
      } else {
         super.F();
      }
   }

   public bfj G() {
      return (bfj)(this.cD == null ? this : this.cD);
   }

   @Override
   public void c(@Nullable bfj $$0) {
      bfj $$1 = this.G();
      this.cD = (bfj)($$0 == null ? this : $$0);
      if ($$1 != this.cD) {
         if (this.cD.dI() instanceof aif $$2) {
            this.a($$2, this.cD.dn(), this.cD.dp(), this.cD.dt(), Set.of(), this.dy(), this.dA());
         }

         if ($$0 != null) {
            this.x().k().a(this);
         }

         this.c.a(new xq(this.cD));
         this.c.d();
      }
   }

   @Override
   protected void H() {
      if (!this.cE) {
         super.H();
      }
   }

   @Override
   public void d(bfj $$0) {
      if (this.e.b() == cmj.d) {
         this.c($$0);
      } else {
         super.d($$0);
      }
   }

   public long I() {
      return this.cC;
   }

   @Nullable
   public sw J() {
      return null;
   }

   @Override
   public void a(bdw $$0) {
      super.a($$0);
      this.gh();
   }

   public boolean K() {
      return this.cE;
   }

   public void L() {
      this.cE = false;
   }

   public acy M() {
      return this.cn;
   }

   public void a(aif $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      this.c(this);
      this.Y();
      if ($$0 == this.dI()) {
         this.c.a($$1, $$2, $$3, $$4, $$5);
      } else {
         aif $$6 = this.x();
         dyv $$7 = $$0.u_();
         this.c.a(new xf($$0.aa(), $$0.ac(), cnm.a($$0.A()), this.e.b(), this.e.c(), $$0.af(), $$0.z(), (byte)3, this.gm(), this.ar()));
         this.c.a(new ve($$7.s(), $$7.t()));
         this.d.ac().d(this);
         $$6.a(this, bfj.c.e);
         this.dF();
         this.b($$1, $$2, $$3, $$4, $$5);
         this.c($$0);
         $$0.a(this);
         this.e($$6);
         this.c.a($$1, $$2, $$3, $$4, $$5);
         this.d.ac().a(this, $$0);
         this.d.ac().e(this);
      }
   }

   @Nullable
   public gu N() {
      return this.cP;
   }

   public float O() {
      return this.cR;
   }

   public acp<cmm> P() {
      return this.cO;
   }

   public boolean Q() {
      return this.cQ;
   }

   public void a(acp<cmm> $$0, @Nullable gu $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.cP) && $$0.equals(this.cO);
         if ($$4 && !$$5) {
            this.a(sw.c("block.minecraft.set_spawn"));
         }

         this.cP = $$1;
         this.cO = $$0;
         this.cR = $$2;
         this.cQ = $$3;
      } else {
         this.cP = null;
         this.cO = cmm.h;
         this.cR = 0.0F;
         this.cQ = false;
      }
   }

   public void a(clt $$0, uo<?> $$1) {
      this.c.a($$1);
   }

   public void a(clt $$0) {
      if (this.bs()) {
         this.c.a(new vw($$0.e, $$0.f));
      }
   }

   public hx R() {
      return this.cN;
   }

   public void a(hx $$0) {
      this.cN = $$0;
   }

   @Override
   public void a(amg $$0, ami $$1, float $$2, float $$3) {
      this.c.a(new ym(jb.c.d($$0), $$1, this.dn(), this.dp(), this.dt(), $$2, $$3, this.af.g()));
   }

   @Override
   public uo<ur> S() {
      return new uu(this);
   }

   @Override
   public bvh a(cfz $$0, boolean $$1, boolean $$2) {
      bvh $$3 = super.a($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dI().b($$3);
         cfz $$4 = $$3.j();
         if ($$2) {
            if (!$$4.b()) {
               this.a(amr.f.b($$4.d()), $$0.L());
            }

            this.a(amr.F);
         }

         return $$3;
      }
   }

   public ajd T() {
      return this.cS;
   }

   public void c(aif $$0) {
      this.a((cmm)$$0);
      this.e.a($$0);
   }

   @Nullable
   private static cmj a(@Nullable qr $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? cmj.a($$0.h($$1)) : null;
   }

   private cmj b(@Nullable cmj $$0) {
      cmj $$1 = this.d.aX();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.d.o_();
      }
   }

   @Override
   public void c(@Nullable qr $$0) {
      this.e.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void k(qr $$0) {
      $$0.a("playerGameType", this.e.b().a());
      cmj $$1 = this.e.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean U() {
      return this.cT;
   }

   public boolean b(aig $$0) {
      return $$0 == this ? false : this.cT || $$0.cT;
   }

   @Override
   public boolean a(cmm $$0, gu $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cfz $$0) {
      ai.T.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      byn $$1 = this.fN();
      cfz $$2 = $$1.a($$0);
      this.bR.b($$1, $$1.l).ifPresent($$1x -> this.bR.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean V() {
      return this.cU;
   }

   @Override
   public Optional<bxu> W() {
      return Optional.of(this.cV);
   }

   @Override
   public void a(bvh $$0) {
      super.a($$0);
      bfj $$1 = $$0.v();
      if ($$1 != null) {
         ai.P.a(this, $$0.j(), $$1);
      }
   }

   public void a(tm $$0) {
      this.cY = $$0;
   }

   @Nullable
   public tm X() {
      return this.cY != null && this.cY.c() ? null : this.cY;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.ck = (float)(apa.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dy());
      this.c.a(new vz(this));
   }

   @Override
   public boolean a(bfj $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         $$0.i(this);
         this.c.a(this.dn(), this.dp(), this.dt(), this.dy(), this.dA());
         if ($$0 instanceof bfz $$2) {
            for (bfa $$3 : $$2.eo()) {
               this.c.a(new yw($$0.af(), $$3));
            }
         }

         return true;
      }
   }

   @Override
   public void Y() {
      bfj $$0 = this.cW();
      super.Y();
      if ($$0 instanceof bfz $$1) {
         for (bfa $$2 : $$1.eo()) {
            this.c.a(new xd($$0.af(), $$2.c()));
         }
      }
   }
}
