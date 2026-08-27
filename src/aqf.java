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

public class aqf extends ckl {
   private static final Logger b = LogUtils.getLogger();
   private static final int cx = 32;
   private static final int cy = 10;
   private static final int cA = 25;
   public static final double c = 1.0;
   private static final bsj cB = new bsj(UUID.fromString("736565d2-e1a7-403d-a3f8-1aeb3e302542"), "Creative block interaction range modifier", 0.5, bsj.a.a);
   private static final bsj cC = new bsj(UUID.fromString("98491ef6-97b1-4584-ae82-71a8cc85cf73"), "Creative entity interaction range modifier", 2.0, bsj.a.a);
   public are d;
   public final MinecraftServer e;
   public final aqg f;
   private final akn cD;
   private final avf cE;
   private float cF = Float.MIN_VALUE;
   private int cG = Integer.MIN_VALUE;
   private int cH = Integer.MIN_VALUE;
   private int cI = Integer.MIN_VALUE;
   private int cJ = Integer.MIN_VALUE;
   private int cK = Integer.MIN_VALUE;
   private float cL = -1.0E8F;
   private int cM = -99999999;
   private boolean cN = true;
   private int cO = -99999999;
   private int cP = 60;
   private ckj cQ = ckj.a;
   private boolean cR = true;
   private long cS = ac.b();
   @Nullable
   private bql cT;
   private boolean cU;
   private boolean cV;
   private final ave cW = new ave();
   @Nullable
   private etf cX;
   private int cY;
   private boolean cZ;
   private int da = 2;
   private String db = "en_us";
   @Nullable
   private etf dc;
   @Nullable
   private etf dd;
   @Nullable
   private etf de;
   private jo df = jo.a(0, 0, 0);
   private aps dg = aps.a;
   private ake<czu> dh = czu.h;
   @Nullable
   private im di;
   private boolean dj;
   private float dk;
   private final arj dl;
   private boolean dm;
   private boolean dn;
   private boolean do;
   private cjr dp = new cjr(0, 0, 0);
   private final cnu dq = new cnu() {
      @Override
      public void a(cnh $$0, je<csd> $$1, csd $$2, int[] $$3) {
         aqf.this.d.b(new acf($$0.j, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cnh $$0, int $$1, csd $$2) {
         aqf.this.d.b(new ach($$0.j, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cnh $$0, csd $$1) {
         aqf.this.d.b(new ach(-1, $$0.k(), -1, $$1));
      }

      @Override
      public void a(cnh $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cnh $$0, int $$1, int $$2) {
         aqf.this.d.b(new acg($$0.j, $$1, $$2));
      }
   };
   private final cnt dr = new cnt() {
      @Override
      public void a(cnh $$0, int $$1, csd $$2) {
         cpd $$3 = $$0.b($$1);
         if (!($$3 instanceof coz)) {
            if ($$3.d == aqf.this.ga()) {
               am.f.a(aqf.this, aqf.this.ga(), $$2);
            }
         }
      }

      @Override
      public void a(cnh $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private xj ds;
   @Nullable
   public final Object g;
   private int dt;
   public boolean h;

   public aqf(MinecraftServer $$0, aqe $$1, GameProfile $$2, apt $$3) {
      super($$1, $$1.U(), $$1.V(), $$2);
      this.dl = $$0.a(this);
      this.f = $$0.b(this);
      this.e = $$0;
      this.cE = $$0.ah().a((ckl)this);
      this.cD = $$0.ah().f(this);
      this.e($$1);
      this.a($$3);
      this.g = null;
   }

   private void e(aqe $$0) {
      im $$1 = $$0.U();
      if ($$0.D_().g() && $$0.o().bc().k() != czr.c) {
         int $$2 = Math.max(0, this.e.a($$0));
         int $$3 = axw.a($$0.C_().b((double)$$1.u(), (double)$$1.w()));
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
         int $$8 = ayd.a().a($$6);

         for (int $$9 = 0; $$9 < $$6; $$9++) {
            int $$10 = ($$8 + $$7 * $$9) % $$6;
            int $$11 = $$10 % ($$2 * 2 + 1);
            int $$12 = $$10 / ($$2 * 2 + 1);
            im $$13 = apz.a($$0, $$1.u() + $$11 - $$2, $$1.w() + $$12 - $$2);
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
   public void a(ty $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         cjr.a.parse(new Dynamic(um.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(b::error).ifPresent($$0x -> this.dp = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         ty $$1 = $$0.p("enteredNetherPosition");
         this.dd = new etf($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.cV = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cW.a($$0.p("recipeBook"), this.e.aJ());
      }

      if (this.fJ()) {
         this.fK();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.di = new im($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.dj = $$0.q("SpawnForced");
         this.dk = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.dh = czu.g.parse(um.a, $$0.c("SpawnDimension")).resultOrPartial(b::error).orElse(czu.h);
         }
      }

      this.do = $$0.q("spawn_extra_particles_on_fall");
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      cjr.a.encodeStart(um.a, this.dp).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.cV);
      if (this.dd != null) {
         ty $$1 = new ty();
         $$1.a("x", this.dd.c);
         $$1.a("y", this.dd.d);
         $$1.a("z", this.dd.e);
         $$0.a("enteredNetherPosition", $$1);
      }

      bql $$2 = this.cX();
      bql $$3 = this.da();
      if ($$3 != null && $$2 != this && $$2.cW()) {
         ty $$4 = new ty();
         ty $$5 = new ty();
         $$2.e($$5);
         $$4.a("Attach", $$3.cx());
         $$4.a("Entity", $$5);
         $$0.a("RootVehicle", $$4);
      }

      $$0.a("recipeBook", this.cW.b());
      $$0.a("Dimension", this.dN().ae().a().toString());
      if (this.di != null) {
         $$0.a("SpawnX", this.di.u());
         $$0.a("SpawnY", this.di.v());
         $$0.a("SpawnZ", this.di.w());
         $$0.a("SpawnForced", this.dj);
         $$0.a("SpawnAngle", this.dk);
         akf.a.encodeStart(um.a, this.dh.a()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }

      $$0.a("spawn_extra_particles_on_fall", this.do);
   }

   public void a(int $$0) {
      float $$1 = (float)this.gj();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.cr = axw.a((float)$$0 / $$1, 0.0F, $$2);
      this.cO = -1;
   }

   public void b(int $$0) {
      this.cp = $$0;
      this.cO = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cO = -1;
   }

   @Override
   public void a(csd $$0, int $$1) {
      super.a($$0, $$1);
      this.cO = -1;
   }

   private void a(cnh $$0) {
      $$0.a(this.dr);
      $$0.a(this.dq);
   }

   public void h() {
      this.a(this.cb);
   }

   @Override
   public void f_() {
      super.f_();
      this.d.b(adn.a);
   }

   @Override
   public void g_() {
      super.g_();
      this.d.b(new adm(this.eN()));
   }

   @Override
   protected void a(dpy $$0) {
      am.e.a(this, $$0);
   }

   @Override
   protected crz k() {
      return new csz(this);
   }

   @Override
   public void l() {
      this.f.a();
      this.dp.a();
      this.cP--;
      if (this.am > 0) {
         this.am--;
      }

      this.cc.d();
      if (!this.dN().B && !this.cc.a(this)) {
         this.r();
         this.cc = this.cb;
      }

      bql $$0 = this.K();
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
      if (this.cX != null) {
         am.v.a(this, this.cX, this.ai - this.cY);
      }

      this.o();
      this.p();
      this.gC();
      this.cD.b(this);
   }

   private void gC() {
      bsh $$0 = this.f(bsl.g);
      if ($$0 != null) {
         if (this.f()) {
            $$0.b(cB);
         } else {
            $$0.e(cB);
         }
      }

      bsh $$1 = this.f(bsl.h);
      if ($$1 != null) {
         if (this.f()) {
            $$1.b(cC);
         } else {
            $$1.e(cC);
         }
      }
   }

   public void m() {
      try {
         if (!this.N_() || !this.df()) {
            super.l();
         }

         for (int $$0 = 0; $$0 < this.ga().b(); $$0++) {
            csd $$1 = this.ga().a($$0);
            if ($$1.f().aj_()) {
               yz<?> $$2 = ((cqn)$$1.f()).a($$1, this.dN(), this);
               if ($$2 != null) {
                  this.d.b($$2);
               }
            }
         }

         if (this.ey() != this.cL || this.cM != this.cd.a() || this.cd.e() == 0.0F != this.cN) {
            this.d.b(new aet(this.ey(), this.cd.a(), this.cd.e()));
            this.cL = this.ey();
            this.cM = this.cd.a();
            this.cN = this.cd.e() == 0.0F;
         }

         if (this.ey() + this.fq() != this.cF) {
            this.cF = this.ey() + this.fq();
            this.a(eum.g, axw.f(this.cF));
         }

         if (this.cd.a() != this.cG) {
            this.cG = this.cd.a();
            this.a(eum.h, axw.f((float)this.cG));
         }

         if (this.cj() != this.cH) {
            this.cH = this.cj();
            this.a(eum.i, axw.f((float)this.cH));
         }

         if (this.eM() != this.cI) {
            this.cI = this.eM();
            this.a(eum.j, axw.f((float)this.cI));
         }

         if (this.cq != this.cK) {
            this.cK = this.cq;
            this.a(eum.k, axw.f((float)this.cK));
         }

         if (this.cp != this.cJ) {
            this.cJ = this.cp;
            this.a(eum.l, axw.f((float)this.cJ));
         }

         if (this.cq != this.cO) {
            this.cO = this.cq;
            this.d.b(new aes(this.cr, this.cq, this.cp));
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
      if (this.ey() > 0.0F && this.dc != null) {
         am.X.a(this, this.dc);
      }

      this.dc = null;
      super.n();
   }

   public void o() {
      if (this.ac > 0.0F && this.dc == null) {
         this.dc = this.dl();
      }
   }

   public void p() {
      if (this.da() != null && this.da().bq()) {
         if (this.de == null) {
            this.de = this.dl();
         } else {
            am.Y.a(this, this.de);
         }
      }

      if (this.de != null && (this.da() == null || !this.da().bq())) {
         this.de = null;
      }
   }

   private void a(eum $$0, int $$1) {
      this.gp().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(bpj $$0) {
      this.a(dur.p);
      boolean $$1 = this.dN().aa().b(czq.n);
      if ($$1) {
         ws $$2 = this.eN().a();
         this.d.a(new ado(this.aj(), $$2), vz.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            ws $$3x = ws.a("death.attack.message_too_long", ws.b($$2x).a(n.o));
            ws $$4x = ws.a("death.attack.even_more_magic", this.O_()).a($$1xx -> $$1xx.a(new wy(wy.a.a, $$3x)));
            return new ado(this.aj(), $$4x);
         }));
         eul $$3 = this.ch();
         if ($$3 == null || $$3.k() == eul.b.a) {
            this.e.ah().a($$2, false);
         } else if ($$3.k() == eul.b.c) {
            this.e.ah().a(this, $$2);
         } else if ($$3.k() == eul.b.d) {
            this.e.ah().b(this, $$2);
         }
      } else {
         this.d.b(new ado(this.aj(), wr.a));
      }

      this.go();
      if (this.dN().aa().b(czq.N)) {
         this.gD();
      }

      if (!this.N_()) {
         this.g($$0);
      }

      this.gp().a(eum.d, this, euh::b);
      bre $$4 = this.eO();
      if ($$4 != null) {
         this.b(avj.h.b($$4.ai()));
         $$4.a(this, this.bm, $$0);
         this.f($$4);
      }

      this.dN().a(this, (byte)3);
      this.a(avj.N);
      this.a(avj.i.b(avj.m));
      this.a(avj.i.b(avj.n));
      this.aA();
      this.l(0);
      this.c(false);
      this.eN().c();
      this.a(Optional.of(iu.a(this.dN().ae(), this.dn())));
   }

   private void gD() {
      eta $$0 = new eta(this.dn()).c(32.0, 10.0, 32.0);
      this.dN().a(brg.class, $$0, bqq.f).stream().filter($$0x -> $$0x instanceof brk).forEach($$0x -> ((brk)$$0x).a_((ckl)this));
   }

   @Override
   public void a(bql $$0, int $$1, bpj $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.t($$1);
         this.gp().a(eum.f, this, euh::b);
         if ($$0 instanceof ckl) {
            this.a(avj.Q);
            this.gp().a(eum.e, this, euh::b);
         } else {
            this.a(avj.O);
         }

         this.a(this, $$0, eum.m);
         this.a($$0, this, eum.n);
         am.c.a(this, $$0, $$2);
      }
   }

   private void a(eui $$0, eui $$1, eum[] $$2) {
      eue $$3 = this.gp().e($$1.cz());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gp().a($$2[$$4], $$0, euh::b);
         }
      }
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.e.n() && this.gE() && $$0.a(avq.n);
         if (!$$2 && this.cP > 0 && !$$0.a(avq.e)) {
            return false;
         } else {
            bql $$3 = $$0.d();
            if ($$3 instanceof ckl $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof ckr $$5 && $$5.u() instanceof ckl $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(ckl $$0) {
      return !this.gE() ? false : super.a($$0);
   }

   private boolean gE() {
      return this.e.ad();
   }

   @Nullable
   @Override
   protected emq a(aqe $$0) {
      emq $$1 = super.a($$0);
      if ($$1 != null && this.dN().ae() == czu.h && $$0.ae() == czu.j) {
         etf $$2 = $$1.a.b(0.0, -1.0, 0.0);
         return new emq($$2, etf.b, 90.0F, 0.0F);
      } else {
         return $$1;
      }
   }

   @Nullable
   @Override
   public bql b(aqe $$0) {
      this.cU = true;
      aqe $$1 = this.z();
      ake<czu> $$2 = $$1.ae();
      if ($$2 == czu.j && $$0.ae() == czu.h) {
         this.ag();
         this.z().a(this, bql.c.e);
         if (!this.h) {
            this.h = true;
            this.d.b(new acr(acr.f, this.cV ? 0.0F : 1.0F));
            this.cV = true;
         }

         return this;
      } else {
         enm $$3 = $$0.A_();
         this.d.b(new adx(this.d($$0), (byte)3));
         this.d.b(new abx($$3.q(), $$3.r()));
         aub $$4 = this.e.ah();
         $$4.d(this);
         $$1.a(this, bql.c.e);
         this.dK();
         emq $$5 = this.a($$0);
         if ($$5 != null) {
            $$1.af().a("moving");
            if ($$2 == czu.h && $$0.ae() == czu.i) {
               this.dd = this.dl();
            } else if ($$0.ae() == czu.j) {
               this.a($$0, im.a($$5.a));
            }

            $$1.af().c();
            $$1.af().a("placing");
            this.c($$0);
            this.d.a($$5.a.c, $$5.a.d, $$5.a.e, $$5.c, $$5.d);
            this.d.m();
            $$0.b(this);
            $$1.af().c();
            this.f($$1);
            this.d.b(new adk(this.gb()));
            $$4.a(this, $$0);
            $$4.e(this);

            for (bpx $$6 : this.ev()) {
               this.d.b(new afq(this.aj(), $$6, false));
            }

            this.d.b(new acx(1032, im.c, 0, false));
            this.cO = -1;
            this.cL = -1.0F;
            this.cM = -1;
         }

         return this;
      }
   }

   private void a(aqe $$0, im $$1) {
      im.a $$2 = $$1.j();

      for (int $$3 = -2; $$3 <= 2; $$3++) {
         for (int $$4 = -2; $$4 <= 2; $$4++) {
            for (int $$5 = -1; $$5 < 3; $$5++) {
               dpy $$6 = $$5 == -1 ? dcx.co.n() : dcx.a.n();
               $$0.b($$2.g($$1).e($$4, $$5, $$3), $$6);
            }
         }
      }
   }

   @Override
   protected Optional<l.a> a(aqe $$0, im $$1, boolean $$2, drp $$3) {
      Optional<l.a> $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         ir.a $$5 = this.dN().a_(this.ay).d(dhz.b).orElse(ir.a.a);
         Optional<l.a> $$6 = $$0.p().a($$1, $$5);
         if ($$6.isEmpty()) {
            b.error("Unable to create a portal, likely target out of worldborder");
         }

         return $$6;
      }
   }

   private void f(aqe $$0) {
      ake<czu> $$1 = $$0.ae();
      ake<czu> $$2 = this.dN().ae();
      am.w.a(this, $$1, $$2);
      if ($$1 == czu.i && $$2 == czu.h && this.dd != null) {
         am.D.a(this, this.dd);
      }

      if ($$2 != czu.i) {
         this.dd = null;
      }
   }

   @Override
   public boolean a(aqf $$0) {
      if ($$0.N_()) {
         return this.K() == this;
      } else {
         return this.N_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bql $$0, int $$1) {
      super.a($$0, $$1);
      this.cc.d();
   }

   @Override
   public Either<ckl.a, ayy> a(im $$0) {
      ir $$1 = this.dN().a_($$0).c(dgr.aE);
      if (this.fJ() || !this.bB()) {
         return Either.left(ckl.a.e);
      } else if (!this.dN().D_().j()) {
         return Either.left(ckl.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(ckl.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(ckl.a.d);
      } else {
         this.a(this.dN().ae(), $$0, this.dD(), false, true);
         if (this.dN().Q()) {
            return Either.left(ckl.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               etf $$4 = etf.c($$0);
               List<chr> $$5 = this.dN()
                  .a(chr.class, new eta($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.f(this));
               if (!$$5.isEmpty()) {
                  return Either.left(ckl.a.f);
               }
            }

            Either<ckl.a, ayy> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(avj.ap);
               am.r.a(this);
            });
            if (!this.z().d()) {
               this.a(ws.c("sleep.not_possible"), true);
            }

            ((aqe)this.dN()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(im $$0) {
      this.a(avj.i.b(avj.n));
      super.b($$0);
   }

   private boolean a(im $$0, ir $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(im $$0) {
      etf $$1 = etf.c($$0);
      return Math.abs(this.ds() - $$1.a()) <= 3.0 && Math.abs(this.du() - $$1.b()) <= 2.0 && Math.abs(this.dy() - $$1.c()) <= 3.0;
   }

   private boolean b(im $$0, ir $$1) {
      im $$2 = $$0.c();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fJ()) {
         this.z().l().a(this, new abn(this, 2));
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
   public boolean b(bpj $$0) {
      return super.b($$0) || this.O();
   }

   @Override
   protected void a(double $$0, boolean $$1, dpy $$2, im $$3) {
   }

   @Override
   protected void c(im $$0) {
      if (!this.N_()) {
         super.c($$0);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.df()) {
         this.b($$3, new etf($$0, $$1, $$2));
         im $$4 = this.aJ();
         dpy $$5 = this.dN().a_($$4);
         if (this.do && $$3 && this.ac > 0.0F) {
            etf $$6 = $$4.b().b(0.0, 0.5, 0.0);
            int $$7 = (int)(50.0F * this.ac);
            ((aqe)this.dN()).a(new kn(kw.b, $$5), $$6.c, $$6.d, $$6.e, $$7, 0.3F, 0.3F, 0.3F, 0.15F);
            this.do = false;
         }

         super.a($$1, $$3, $$5, $$4);
      }
   }

   @Override
   public void a(@Nullable bql $$0) {
      super.a($$0);
      if ($$0 != null && $$0.ai() == bqr.bm) {
         this.cw = this.du();
      }
   }

   @Override
   protected void q() {
      if (this.dN().s().i()) {
         super.q();
      }
   }

   @Override
   public void a(don $$0, boolean $$1) {
      this.d.b(new abt(this.dN(), $$0.az_()));
      this.d.b(new adi($$0.az_(), $$1));
   }

   private void gF() {
      this.dt = this.dt % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bou $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.cc != this.cb) {
            this.r();
         }

         this.gF();
         cnh $$1 = $$0.createMenu(this.dt, this.ga(), this);
         if ($$1 == null) {
            if (this.N_()) {
               this.a(ws.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.d.b(new adh($$1.j, $$1.a(), $$0.O_()));
            this.a($$1);
            this.cc = $$1;
            return OptionalInt.of(this.dt);
         }
      }
   }

   @Override
   public void a(int $$0, cyt $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.d.b(new add($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(cex $$0, boj $$1) {
      if (this.cc != this.cb) {
         this.r();
      }

      this.gF();
      this.d.b(new acs(this.dt, $$1.b(), $$0.aj()));
      this.cc = new coh(this.dt, this.ga(), $$1, $$0);
      this.a(this.cc);
   }

   @Override
   public void a(csd $$0, bop $$1) {
      if ($$0.a(csg.ua)) {
         if (ctz.a($$0, this.de(), this)) {
            this.cc.d();
         }

         this.d.b(new adg($$1));
      }
   }

   @Override
   public void a(dnn $$0) {
      this.d.b(abr.a($$0, dnd::d));
   }

   @Override
   public void r() {
      this.d.b(new ace(this.cc.j));
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
   public void a(etf $$0) {
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
               this.a(avj.C, $$3);
               this.C(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(avt.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(avj.w, $$4);
               this.C(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.bc()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(avj.s, $$5);
               this.C(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.q_()) {
            if ($$1 > 0.0) {
               this.a(avj.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aC()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.bZ()) {
                  this.a(avj.r, $$6);
                  this.C(0.1F * (float)$$6 * 0.01F);
               } else if (this.bY()) {
                  this.a(avj.q, $$6);
                  this.C(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(avj.p, $$6);
                  this.C(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fC()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(avj.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(avj.v, $$8);
            }
         }
      }
   }

   private void r(double $$0, double $$1, double $$2) {
      if (this.bP() && !s($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         bql $$4 = this.da();
         if ($$4 instanceof cmg) {
            this.a(avj.x, $$3);
         } else if ($$4 instanceof cmi) {
            this.a(avj.y, $$3);
         } else if ($$4 instanceof cdk) {
            this.a(avj.z, $$3);
         } else if ($$4 instanceof cex) {
            this.a(avj.A, $$3);
         } else if ($$4 instanceof cie) {
            this.a(avj.D, $$3);
         }
      }
   }

   private static boolean s(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(avg<?> $$0, int $$1) {
      this.cE.b(this, $$0, $$1);
      this.gp().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(avg<?> $$0) {
      this.cE.a(this, $$0, 0);
      this.gp().a($$0, this, euh::c);
   }

   @Override
   public int a(Collection<cwi<?>> $$0) {
      return this.cW.a($$0, this);
   }

   @Override
   public void a(cwi<?> $$0, List<csd> $$1) {
      am.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<akf> $$0) {
      List<cwi<?>> $$1 = $$0.stream().flatMap($$0x -> this.e.aJ().a($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<cwi<?>> $$0) {
      return this.cW.b($$0, this);
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cO = -1;
   }

   @Override
   public void u() {
      this.cZ = true;
      this.bF();
      if (this.fJ()) {
         this.a(true, false);
      }
   }

   @Override
   public boolean v() {
      return this.cZ;
   }

   public void w() {
      this.cL = -1.0E8F;
   }

   @Override
   public void a(ws $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void x() {
      if (!this.bA.d() && this.ft()) {
         this.d.b(new aco(this, (byte)9));
         super.x();
      }
   }

   @Override
   public void a(eo.a $$0, etf $$1) {
      super.a($$0, $$1);
      this.d.b(new adr($$0, $$1.c, $$1.d, $$1.e));
   }

   public void a(eo.a $$0, bql $$1, eo.a $$2) {
      etf $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.d.b(new adr($$0, $$1, $$2));
   }

   public void a(aqf $$0, boolean $$1) {
      this.dp = $$0.dp;
      this.ds = $$0.ds;
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
      } else if (this.dN().aa().b(czq.d) || $$0.N_()) {
         this.ga().a($$0.ga());
         this.cp = $$0.cp;
         this.cq = $$0.cq;
         this.cr = $$0.cr;
         this.s($$0.fU());
      }

      this.cs = $$0.cs;
      this.ca = $$0.ca;
      this.an().a(bW, $$0.an().a(bW));
      this.cO = -1;
      this.cL = -1.0F;
      this.cM = -1;
      this.cW.a($$0.cW);
      this.cV = $$0.cV;
      this.dd = $$0.dd;
      this.dg = $$0.dg;
      this.i($$0.gr());
      this.j($$0.gs());
      this.a($$0.gz());
   }

   @Override
   protected void a(bpx $$0, @Nullable bql $$1) {
      super.a($$0, $$1);
      this.d.b(new afq(this.aj(), $$0, true));
      if ($$0.a(bpz.y)) {
         this.cY = this.ai;
         this.cX = this.dl();
      }

      am.B.a(this, $$1);
   }

   @Override
   protected void a(bpx $$0, boolean $$1, @Nullable bql $$2) {
      super.a($$0, $$1, $$2);
      this.d.b(new afq(this.aj(), $$0, false));
      am.B.a(this, $$2);
   }

   @Override
   protected void a(bpx $$0) {
      super.a($$0);
      this.d.b(new adv(this.aj(), $$0.c()));
      if ($$0.a(bpz.y)) {
         this.cX = null;
      }

      am.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.d.a($$0, $$1, $$2, this.dD(), this.dF(), brr.g);
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.d.a(this.ds() + $$0, this.du() + $$1, this.dy() + $$2, this.dD(), this.dF(), brr.f);
   }

   @Override
   public boolean a(aqe $$0, double $$1, double $$2, double $$3, Set<brr> $$4, float $$5, float $$6) {
      czb $$7 = new czb(im.a($$1, $$2, $$3));
      $$0.l().a(aqj.g, $$7, 1, this.aj());
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
   public void b(bql $$0) {
      this.z().l().a(this, new abn($$0, 4));
   }

   @Override
   public void c(bql $$0) {
      this.z().l().a(this, new abn($$0, 5));
   }

   @Override
   public void y() {
      if (this.d != null) {
         this.d.b(new adk(this.gb()));
         this.J();
      }
   }

   public aqe z() {
      return (aqe)this.dN();
   }

   public boolean a(czr $$0) {
      if (!this.f.a($$0)) {
         return false;
      } else {
         this.d.b(new acr(acr.e, (float)$$0.a()));
         if ($$0 == czr.d) {
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
      return this.f.b() == czr.d;
   }

   @Override
   public boolean f() {
      return this.f.b() == czr.b;
   }

   @Override
   public void a(ws $$0) {
      this.b($$0, false);
   }

   public void b(ws $$0, boolean $$1) {
      if (this.v($$1)) {
         this.d.a(new afh($$0, $$1), vz.a(() -> {
            if (this.v(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               ws $$3 = ws.b($$2).a(n.o);
               return new afh(ws.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(xh $$0, boolean $$1, wo.a $$2) {
      if (this.gG()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String A() {
      return this.d.n() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(apt $$0) {
      this.db = $$0.b();
      this.da = $$0.c();
      this.cQ = $$0.d();
      this.cR = $$0.e();
      this.dm = $$0.h();
      this.dn = $$0.i();
      this.an().a(bW, (byte)$$0.f());
      this.an().a(bX, (byte)$$0.g().a());
   }

   public apt B() {
      int $$0 = this.an().a(bW);
      bqy $$1 = bqy.d.apply(this.an().a(bX));
      return new apt(this.db, this.da, this.cQ, this.cR, $$0, $$1, this.dm, this.dn);
   }

   public boolean C() {
      return this.cR;
   }

   public ckj D() {
      return this.cQ;
   }

   private boolean v(boolean $$0) {
      return this.cQ == ckj.c ? $$0 : true;
   }

   private boolean gG() {
      return this.cQ == ckj.a;
   }

   public int E() {
      return this.da;
   }

   public void a(aje $$0) {
      this.d.b(new aeb($$0.a(), $$0.d().map(aje.a::a)));
   }

   @Override
   protected int F() {
      return this.e.c(this.fZ());
   }

   @Override
   public void G() {
      this.cS = ac.b();
   }

   public avf H() {
      return this.cE;
   }

   public ave I() {
      return this.cW;
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

   public bql K() {
      return (bql)(this.cT == null ? this : this.cT);
   }

   @Override
   public void d(@Nullable bql $$0) {
      bql $$1 = this.K();
      this.cT = (bql)($$0 == null ? this : $$0);
      if ($$1 != this.cT) {
         if (this.cT.dN() instanceof aqe $$2) {
            this.a($$2, this.cT.ds(), this.cT.du(), this.cT.dy(), Set.of(), this.dD(), this.dF());
         }

         if ($$0 != null) {
            this.z().l().a(this);
         }

         this.d.b(new aei(this.cT));
         this.d.m();
      }
   }

   @Override
   protected void L() {
      if (!this.cU) {
         super.L();
      }
   }

   @Override
   public void e(bql $$0) {
      if (this.f.b() == czr.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long M() {
      return this.cS;
   }

   @Nullable
   public ws N() {
      return null;
   }

   @Override
   public void a(bop $$0) {
      super.a($$0);
      this.gu();
   }

   public boolean O() {
      return this.cU;
   }

   public void P() {
      this.cU = false;
   }

   public akn Q() {
      return this.cD;
   }

   public void a(aqe $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      this.d(this);
      this.ac();
      if ($$0 == this.dN()) {
         this.d.a($$1, $$2, $$3, $$4, $$5);
      } else {
         aqe $$6 = this.z();
         enm $$7 = $$0.A_();
         this.d.b(new adx(this.d($$0), (byte)3));
         this.d.b(new abx($$7.q(), $$7.r()));
         this.e.ah().d(this);
         $$6.a(this, bql.c.e);
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
   public im R() {
      return this.di;
   }

   public float S() {
      return this.dk;
   }

   public ake<czu> T() {
      return this.dh;
   }

   public boolean U() {
      return this.dj;
   }

   public void a(ake<czu> $$0, @Nullable im $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.di) && $$0.equals(this.dh);
         if ($$4 && !$$5) {
            this.a(ws.c("block.minecraft.set_spawn"));
         }

         this.di = $$1;
         this.dh = $$0;
         this.dk = $$2;
         this.dj = $$3;
      } else {
         this.di = null;
         this.dh = czu.h;
         this.dk = 0.0F;
         this.dj = false;
      }
   }

   public jo V() {
      return this.df;
   }

   public void a(jo $$0) {
      this.df = $$0;
   }

   public aps W() {
      return this.dg;
   }

   public void a(aps $$0) {
      this.dg = $$0;
   }

   @Override
   public void a(auy $$0, ava $$1, float $$2, float $$3) {
      this.d.b(new afe(lc.b.e($$0), $$1, this.ds(), this.du(), this.dy(), $$2, $$3, this.ah.g()));
   }

   @Override
   public cgv a(csd $$0, boolean $$1, boolean $$2) {
      cgv $$3 = super.a($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dN().b($$3);
         csd $$4 = $$3.p();
         if ($$2) {
            if (!$$4.d()) {
               this.a(avj.f.b($$4.f()), $$0.G());
            }

            this.a(avj.F);
         }

         return $$3;
      }
   }

   public arj X() {
      return this.dl;
   }

   public void c(aqe $$0) {
      this.a((czu)$$0);
      this.f.a($$0);
   }

   @Nullable
   private static czr a(@Nullable ty $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? czr.a($$0.h($$1)) : null;
   }

   private czr b(@Nullable czr $$0) {
      czr $$1 = this.e.bf();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.e.u_();
      }
   }

   @Override
   public void c(@Nullable ty $$0) {
      this.f.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void k(ty $$0) {
      $$0.a("playerGameType", this.f.b().a());
      czr $$1 = this.f.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean Y() {
      return this.dm;
   }

   public boolean b(aqf $$0) {
      return $$0 == this ? false : this.dm || $$0.dm;
   }

   @Override
   public boolean a(czu $$0, im $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(csd $$0) {
      am.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      ckk $$1 = this.ga();
      csd $$2 = $$1.a($$0);
      this.cc.b($$1, $$1.l).ifPresent($$1x -> this.cc.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean Z() {
      return this.dn;
   }

   @Override
   public Optional<cjr> aa() {
      return Optional.of(this.dp);
   }

   public void b(boolean $$0) {
      this.do = $$0;
   }

   @Override
   public void a(cgv $$0) {
      super.a($$0);
      bql $$1 = $$0.u();
      if ($$1 != null) {
         am.S.a(this, $$0.p(), $$1);
      }
   }

   public void a(xj $$0) {
      this.ds = $$0;
   }

   @Nullable
   public xj ab() {
      return this.ds != null && this.ds.b() ? null : this.ds;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cv = (float)(axw.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dD());
      this.d.b(new act(this));
   }

   @Override
   public boolean a(bql $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         $$0.j(this);
         this.d.a(this.ds(), this.du(), this.dy(), this.dD(), this.dF());
         if ($$0 instanceof bre $$2) {
            for (bpx $$3 : $$2.ev()) {
               this.d.b(new afq($$0.aj(), $$3, false));
            }
         }

         return true;
      }
   }

   @Override
   public void ac() {
      bql $$0 = this.da();
      super.ac();
      if ($$0 instanceof bre $$1) {
         for (bpx $$2 : $$1.ev()) {
            this.d.b(new adv($$0.aj(), $$2.c()));
         }
      }
   }

   public afs d(aqe $$0) {
      return new afs($$0.ad(), $$0.ae(), dav.a($$0.C()), this.f.b(), this.f.c(), $$0.ah(), $$0.B(), this.gz(), this.av());
   }
}
