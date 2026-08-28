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

public class arg extends cmx {
   private static final Logger cz = LogUtils.getLogger();
   private static final int cA = 32;
   private static final int cB = 10;
   private static final int cC = 25;
   public static final double b = 1.0;
   private static final buv cD = new buv(UUID.fromString("736565d2-e1a7-403d-a3f8-1aeb3e302542"), "Creative block interaction range modifier", 0.5, buv.a.a);
   private static final buv cE = new buv(UUID.fromString("98491ef6-97b1-4584-ae82-71a8cc85cf73"), "Creative entity interaction range modifier", 2.0, buv.a.a);
   public asf c;
   public final MinecraftServer d;
   public final arh e;
   private final aln cF;
   private final awg cG;
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
   private cmv cS = cmv.a;
   private boolean cT = true;
   private long cU = ac.c();
   @Nullable
   private bsu cV;
   private boolean cW;
   private boolean cX;
   private final awf cY = new awf();
   @Nullable
   private evr cZ;
   private int da;
   private boolean db;
   private int dc = 2;
   private String dd = "en_us";
   @Nullable
   private evr de;
   @Nullable
   private evr df;
   @Nullable
   private evr dg;
   private kb dh = kb.a(0, 0, 0);
   private aqt di = aqt.a;
   private ale<dby> dj = dby.h;
   @Nullable
   private iz dk;
   private boolean dl;
   private float dm;
   private final ask dn;
   private boolean do;
   private boolean dp;
   private boolean dq;
   private cmd dr = new cmd(0, 0, 0);
   @Nullable
   private iz ds;
   private final cqh dt = new cqh() {
      @Override
      public void a(cpu $$0, jr<cup> $$1, cup $$2, int[] $$3) {
         arg.this.c.b(new add($$0.j, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cpu $$0, int $$1, cup $$2) {
         arg.this.c.b(new adf($$0.j, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cpu $$0, cup $$1) {
         arg.this.c.b(new adf(-1, $$0.k(), -1, $$1));
      }

      @Override
      public void a(cpu $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cpu $$0, int $$1, int $$2) {
         arg.this.c.b(new ade($$0.j, $$1, $$2));
      }
   };
   private final cqg du = new cqg() {
      @Override
      public void a(cpu $$0, int $$1, cup $$2) {
         crp $$3 = $$0.b($$1);
         if (!($$3 instanceof crl)) {
            if ($$3.c == arg.this.gc()) {
               am.f.a(arg.this, arg.this.gc(), $$2);
            }
         }
      }

      @Override
      public void a(cpu $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private yg dv;
   @Nullable
   public final Object f;
   private int dw;
   public boolean g;

   public arg(MinecraftServer $$0, arf $$1, GameProfile $$2, aqu $$3) {
      super($$1, $$1.V(), $$1.W(), $$2);
      this.dn = $$0.a(this);
      this.e = $$0.b(this);
      this.d = $$0;
      this.cG = $$0.ah().a((cmx)this);
      this.cF = $$0.ah().f(this);
      this.e($$1);
      this.a($$3);
      this.f = null;
   }

   private void e(arf $$0) {
      iz $$1 = $$0.V();
      if ($$0.D_().g() && $$0.o().bb().k() != dbv.c) {
         int $$2 = Math.max(0, this.d.a($$0));
         int $$3 = ayz.a($$0.C_().b((double)$$1.u(), (double)$$1.w()));
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
         int $$8 = azh.a().a($$6);

         for (int $$9 = 0; $$9 < $$6; $$9++) {
            int $$10 = ($$8 + $$7 * $$9) % $$6;
            int $$11 = $$10 % ($$2 * 2 + 1);
            int $$12 = $$10 / ($$2 * 2 + 1);
            iz $$13 = ara.a($$0, $$1.u() + $$11 - $$2, $$1.w() + $$12 - $$2);
            if ($$13 != null) {
               this.a($$13, 0.0F, 0.0F);
               if ($$0.g(this)) {
                  break;
               }
            }
         }
      } else {
         this.a($$1, 0.0F, 0.0F);

         while (!$$0.g(this) && this.dw() < (double)($$0.am() - 1)) {
            this.a_(this.du(), this.dw() + 1.0, this.dA());
         }
      }
   }

   private int v(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         cmd.a.parse(new Dynamic(vg.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(cz::error).ifPresent($$0x -> this.dr = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         us $$1 = $$0.p("enteredNetherPosition");
         this.df = new evr($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.cX = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cY.a($$0.p("recipeBook"), this.d.aJ());
      }

      if (this.fL()) {
         this.fM();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.dk = new iz($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.dl = $$0.q("SpawnForced");
         this.dm = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.dj = dby.g.parse(vg.a, $$0.c("SpawnDimension")).resultOrPartial(cz::error).orElse(dby.h);
         }
      }

      this.dq = $$0.q("spawn_extra_particles_on_fall");
      vp $$2 = $$0.c("raid_omen_position");
      if ($$2 != null) {
         iz.a.parse(vg.a, $$2).resultOrPartial(cz::error).ifPresent($$0x -> this.ds = $$0x);
      }
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      cmd.a.encodeStart(vg.a, this.dr).resultOrPartial(cz::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.cX);
      if (this.df != null) {
         us $$1 = new us();
         $$1.a("x", this.df.c);
         $$1.a("y", this.df.d);
         $$1.a("z", this.df.e);
         $$0.a("enteredNetherPosition", $$1);
      }

      bsu $$2 = this.cZ();
      bsu $$3 = this.dc();
      if ($$3 != null && $$2 != this && $$2.cY()) {
         us $$4 = new us();
         us $$5 = new us();
         $$2.e($$5);
         $$4.a("Attach", $$3.cz());
         $$4.a("Entity", $$5);
         $$0.a("RootVehicle", $$4);
      }

      $$0.a("recipeBook", this.cY.b());
      $$0.a("Dimension", this.dP().af().a().toString());
      if (this.dk != null) {
         $$0.a("SpawnX", this.dk.u());
         $$0.a("SpawnY", this.dk.v());
         $$0.a("SpawnZ", this.dk.w());
         $$0.a("SpawnForced", this.dl);
         $$0.a("SpawnAngle", this.dm);
         alf.a.encodeStart(vg.a, this.dj.a()).resultOrPartial(cz::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }

      $$0.a("spawn_extra_particles_on_fall", this.dq);
      if (this.ds != null) {
         iz.a.encodeStart(vg.a, this.ds).resultOrPartial(cz::error).ifPresent($$1 -> $$0.a("raid_omen_position", $$1));
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gl();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.cq = ayz.a((float)$$0 / $$1, 0.0F, $$2);
      this.cQ = -1;
   }

   public void b(int $$0) {
      this.co = $$0;
      this.cQ = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cQ = -1;
   }

   @Override
   public void a(cup $$0, int $$1) {
      super.a($$0, $$1);
      this.cQ = -1;
   }

   private void a(cpu $$0) {
      $$0.a(this.du);
      $$0.a(this.dt);
   }

   public void h() {
      this.a(this.ca);
   }

   @Override
   public void f_() {
      super.f_();
      this.c.b(ael.a);
   }

   @Override
   public void g_() {
      super.g_();
      this.c.b(new aek(this.eP()));
   }

   @Override
   protected void a(dsc $$0) {
      am.e.a(this, $$0);
   }

   @Override
   protected cul k() {
      return new cvn(this);
   }

   @Override
   public void l() {
      this.e.a();
      this.dr.a();
      this.cR--;
      if (this.am > 0) {
         this.am--;
      }

      this.cb.d();
      if (!this.dP().B && !this.cb.a(this)) {
         this.r();
         this.cb = this.ca;
      }

      bsu $$0 = this.K();
      if ($$0 != this) {
         if ($$0.bD()) {
            this.a($$0.du(), $$0.dw(), $$0.dA(), $$0.dF(), $$0.dH());
            this.z().l().a(this);
            if (this.fS()) {
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
      this.gF();
      this.cF.b(this);
   }

   private void gF() {
      but $$0 = this.f(bux.g);
      if ($$0 != null) {
         if (this.f()) {
            $$0.b(cD);
         } else {
            $$0.e(cD);
         }
      }

      but $$1 = this.f(bux.h);
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
         if (!this.N_() || !this.dh()) {
            super.l();
         }

         for (int $$0 = 0; $$0 < this.gc().b(); $$0++) {
            cup $$1 = this.gc().a($$0);
            if ($$1.g().aj_()) {
               zw<?> $$2 = ((csz)$$1.g()).a($$1, this.dP(), this);
               if ($$2 != null) {
                  this.c.b($$2);
               }
            }
         }

         if (this.eA() != this.cN || this.cO != this.cc.a() || this.cc.e() == 0.0F != this.cP) {
            this.c.b(new afs(this.eA(), this.cc.a(), this.cc.e()));
            this.cN = this.eA();
            this.cO = this.cc.a();
            this.cP = this.cc.e() == 0.0F;
         }

         if (this.eA() + this.fs() != this.cH) {
            this.cH = this.eA() + this.fs();
            this.a(ewy.g, ayz.f(this.cH));
         }

         if (this.cc.a() != this.cI) {
            this.cI = this.cc.a();
            this.a(ewy.h, ayz.f((float)this.cI));
         }

         if (this.cl() != this.cJ) {
            this.cJ = this.cl();
            this.a(ewy.i, ayz.f((float)this.cJ));
         }

         if (this.eO() != this.cK) {
            this.cK = this.eO();
            this.a(ewy.j, ayz.f((float)this.cK));
         }

         if (this.cp != this.cM) {
            this.cM = this.cp;
            this.a(ewy.k, ayz.f((float)this.cM));
         }

         if (this.co != this.cL) {
            this.cL = this.co;
            this.a(ewy.l, ayz.f((float)this.cL));
         }

         if (this.cp != this.cQ) {
            this.cQ = this.cp;
            this.c.b(new afr(this.cq, this.cp, this.co));
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
      if (this.eA() > 0.0F && this.de != null) {
         am.X.a(this, this.de);
      }

      this.de = null;
      super.n();
   }

   public void o() {
      if (this.ac > 0.0F && this.de == null) {
         this.de = this.dn();
         if (this.cv != null) {
            am.ae.a(this, this.cv, this.cw);
         }
      }
   }

   public void p() {
      if (this.dc() != null && this.dc().bs()) {
         if (this.dg == null) {
            this.dg = this.dn();
         } else {
            am.Y.a(this, this.dg);
         }
      }

      if (this.dg != null && (this.dc() == null || !this.dc().bs())) {
         this.dg = null;
      }
   }

   private void a(ewy $$0, int $$1) {
      this.gr().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(brn $$0) {
      this.a(dwv.p);
      boolean $$1 = this.dP().ab().b(dbu.n);
      if ($$1) {
         xp $$2 = this.eP().a();
         this.c.a(new aem(this.al(), $$2), ww.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            xp $$3x = xp.a("death.attack.message_too_long", xp.b($$2x).a(n.o));
            xp $$4x = xp.a("death.attack.even_more_magic", this.O_()).a($$1xx -> $$1xx.a(new xv(xv.a.a, $$3x)));
            return new aem(this.al(), $$4x);
         }));
         ewx $$3 = this.cj();
         if ($$3 == null || $$3.k() == ewx.b.a) {
            this.d.ah().a($$2, false);
         } else if ($$3.k() == ewx.b.c) {
            this.d.ah().a(this, $$2);
         } else if ($$3.k() == ewx.b.d) {
            this.d.ah().b(this, $$2);
         }
      } else {
         this.c.b(new aem(this.al(), xo.a));
      }

      this.gq();
      if (this.dP().ab().b(dbu.N)) {
         this.gG();
      }

      if (!this.N_()) {
         this.g($$0);
      }

      this.gr().a(ewy.d, this, ewt::b);
      btp $$4 = this.eQ();
      if ($$4 != null) {
         this.b(awk.h.b($$4.ak()));
         $$4.a(this, this.bl, $$0);
         this.f($$4);
      }

      this.dP().a(this, (byte)3);
      this.a(awk.N);
      this.a(awk.i.b(awk.m));
      this.a(awk.i.b(awk.n));
      this.aC();
      this.l(0);
      this.c(false);
      this.eP().c();
      this.a(Optional.of(jh.a(this.dP().af(), this.dp())));
   }

   private void gG() {
      evm $$0 = new evm(this.dp()).c(32.0, 10.0, 32.0);
      this.dP().a(btr.class, $$0, bsz.f).stream().filter($$0x -> $$0x instanceof btv).forEach($$0x -> ((btv)$$0x).a_((cmx)this));
   }

   @Override
   public void a(bsu $$0, int $$1, brn $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.t($$1);
         this.gr().a(ewy.f, this, ewt::b);
         if ($$0 instanceof cmx) {
            this.a(awk.Q);
            this.gr().a(ewy.e, this, ewt::b);
         } else {
            this.a(awk.O);
         }

         this.a(this, $$0, ewy.m);
         this.a($$0, this, ewy.n);
         am.c.a(this, $$0, $$2);
      }
   }

   private void a(ewu $$0, ewu $$1, ewy[] $$2) {
      ewq $$3 = this.gr().e($$1.cB());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gr().a($$2[$$4], $$0, ewt::b);
         }
      }
   }

   @Override
   public boolean a(brn $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.d.n() && this.gH() && $$0.a(awr.n);
         if (!$$2 && this.cR > 0 && !$$0.a(awr.e)) {
            return false;
         } else {
            bsu $$3 = $$0.d();
            if ($$3 instanceof cmx $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof cnd $$5 && $$5.s() instanceof cmx $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(cmx $$0) {
      return !this.gH() ? false : super.a($$0);
   }

   private boolean gH() {
      return this.d.ad();
   }

   @Nullable
   @Override
   protected eou a(arf $$0) {
      eou $$1 = super.a($$0);
      if ($$1 != null && this.dP().af() == dby.h && $$0.af() == dby.j) {
         evr $$2 = $$1.a.b(0.0, -1.0, 0.0);
         return new eou($$2, evr.b, 90.0F, 0.0F);
      } else {
         return $$1;
      }
   }

   @Nullable
   @Override
   public bsu b(arf $$0) {
      this.cW = true;
      arf $$1 = this.z();
      ale<dby> $$2 = $$1.af();
      if ($$2 == dby.j && $$0.af() == dby.h) {
         this.ai();
         this.z().a(this, bsu.c.e);
         if (!this.g) {
            this.g = true;
            this.c.b(new adp(adp.f, this.cX ? 0.0F : 1.0F));
            this.cX = true;
         }

         return this;
      } else {
         eps $$3 = $$0.A_();
         this.c.b(new aew(this.d($$0), (byte)3));
         this.c.b(new acv($$3.q(), $$3.r()));
         avd $$4 = this.d.ah();
         $$4.d(this);
         $$1.a(this, bsu.c.e);
         this.dM();
         eou $$5 = this.a($$0);
         if ($$5 != null) {
            $$1.ag().a("moving");
            if ($$2 == dby.h && $$0.af() == dby.i) {
               this.df = this.dn();
            } else if ($$0.af() == dby.j) {
               this.a($$0, iz.a($$5.a));
            }

            $$1.ag().c();
            $$1.ag().a("placing");
            this.c($$0);
            this.c.a($$5.a.c, $$5.a.d, $$5.a.e, $$5.c, $$5.d);
            this.c.l();
            $$0.b(this);
            $$1.ag().c();
            this.f($$1);
            this.c.b(new aei(this.gd()));
            $$4.a(this, $$0);
            $$4.e(this);

            for (bsc $$6 : this.ex()) {
               this.c.b(new agp(this.al(), $$6, false));
            }

            this.c.b(new adv(1032, iz.c, 0, false));
            this.cQ = -1;
            this.cN = -1.0F;
            this.cO = -1;
         }

         return this;
      }
   }

   private void a(arf $$0, iz $$1) {
      iz.a $$2 = $$1.j();

      for (int $$3 = -2; $$3 <= 2; $$3++) {
         for (int $$4 = -2; $$4 <= 2; $$4++) {
            for (int $$5 = -1; $$5 < 3; $$5++) {
               dsc $$6 = $$5 == -1 ? dfb.co.o() : dfb.a.o();
               $$0.b($$2.g($$1).e($$4, $$5, $$3), $$6);
            }
         }
      }
   }

   @Override
   protected Optional<l.a> a(arf $$0, iz $$1, boolean $$2, dtt $$3) {
      Optional<l.a> $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         je.a $$5 = this.dP().a_(this.ay).d(dkd.b).orElse(je.a.a);
         Optional<l.a> $$6 = $$0.p().a($$1, $$5);
         if ($$6.isEmpty()) {
            cz.error("Unable to create a portal, likely target out of worldborder");
         }

         return $$6;
      }
   }

   private void f(arf $$0) {
      ale<dby> $$1 = $$0.af();
      ale<dby> $$2 = this.dP().af();
      am.w.a(this, $$1, $$2);
      if ($$1 == dby.i && $$2 == dby.h && this.df != null) {
         am.D.a(this, this.df);
      }

      if ($$2 != dby.i) {
         this.df = null;
      }
   }

   @Override
   public boolean a(arg $$0) {
      if ($$0.N_()) {
         return this.K() == this;
      } else {
         return this.N_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bsu $$0, int $$1) {
      super.a($$0, $$1);
      this.cb.d();
   }

   @Override
   public Either<cmx.a, bac> a(iz $$0) {
      je $$1 = this.dP().a_($$0).c(div.aE);
      if (this.fL() || !this.bD()) {
         return Either.left(cmx.a.e);
      } else if (!this.dP().D_().j()) {
         return Either.left(cmx.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cmx.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cmx.a.d);
      } else {
         this.a(this.dP().af(), $$0, this.dF(), false, true);
         if (this.dP().R()) {
            return Either.left(cmx.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               evr $$4 = evr.c($$0);
               List<ckd> $$5 = this.dP()
                  .a(ckd.class, new evm($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.f(this));
               if (!$$5.isEmpty()) {
                  return Either.left(cmx.a.f);
               }
            }

            Either<cmx.a, bac> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(awk.ap);
               am.r.a(this);
            });
            if (!this.z().d()) {
               this.a(xp.c("sleep.not_possible"), true);
            }

            ((arf)this.dP()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(iz $$0) {
      this.a(awk.i.b(awk.n));
      super.b($$0);
   }

   private boolean a(iz $$0, je $$1) {
      return this.j($$0) || this.j($$0.a($$1.g()));
   }

   private boolean j(iz $$0) {
      evr $$1 = evr.c($$0);
      return Math.abs(this.du() - $$1.a()) <= 3.0 && Math.abs(this.dw() - $$1.b()) <= 2.0 && Math.abs(this.dA() - $$1.c()) <= 3.0;
   }

   private boolean b(iz $$0, je $$1) {
      iz $$2 = $$0.c();
      return !this.i($$2) || !this.i($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fL()) {
         this.z().l().a(this, new acl(this, 2));
      }

      super.a($$0, $$1);
      if (this.c != null) {
         this.c.a(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.bI();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public boolean b(brn $$0) {
      return super.b($$0) || this.O();
   }

   @Override
   protected void a(double $$0, boolean $$1, dsc $$2, iz $$3) {
   }

   @Override
   protected void c(iz $$0) {
      if (!this.N_()) {
         super.c($$0);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.dh()) {
         this.b($$3, new evr($$0, $$1, $$2));
         iz $$4 = this.aJ();
         dsc $$5 = this.dP().a_($$4);
         if (this.dq && $$3 && this.ac > 0.0F) {
            evr $$6 = $$4.b().b(0.0, 0.5, 0.0);
            int $$7 = (int)(50.0F * this.ac);
            this.z().a(new la(li.b, $$5), $$6.c, $$6.d, $$6.e, $$7, 0.3F, 0.3F, 0.3F, 0.15F);
            this.dq = false;
         }

         super.a($$1, $$3, $$5, $$4);
      }
   }

   @Override
   public void a(@Nullable bsu $$0) {
      super.a($$0);
      this.cv = this.dn();
      this.cw = $$0;
      this.cx = $$0 != null && $$0.ak() == bta.bn;
   }

   @Override
   protected void q() {
      if (this.dP().s().i()) {
         super.q();
      }
   }

   @Override
   public void a(dqr $$0, boolean $$1) {
      this.c.b(new acr(this.dP(), $$0.ay_()));
      this.c.b(new aeg($$0.ay_(), $$1));
   }

   private void gI() {
      this.dw = this.dw % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bqy $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.cb != this.ca) {
            this.r();
         }

         this.gI();
         cpu $$1 = $$0.createMenu(this.dw, this.gc(), this);
         if ($$1 == null) {
            if (this.N_()) {
               this.a(xp.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.c.b(new aef($$1.j, $$1.a(), $$0.O_()));
            this.a($$1);
            this.cb = $$1;
            return OptionalInt.of(this.dw);
         }
      }
   }

   @Override
   public void a(int $$0, dax $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.c.b(new aeb($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(chj $$0, bqn $$1) {
      if (this.cb != this.ca) {
         this.r();
      }

      this.gI();
      this.c.b(new adq(this.dw, $$1.b(), $$0.al()));
      this.cb = new cqu(this.dw, this.gc(), $$1, $$0);
      this.a(this.cb);
   }

   @Override
   public void a(cup $$0, bqt $$1) {
      if ($$0.a(cus.ua)) {
         if (cwn.a($$0, this.dg(), this)) {
            this.cb.d();
         }

         this.c.b(new aee($$1));
      }
   }

   @Override
   public void a(dpr $$0) {
      this.c.b(acp.a($$0, dph::e));
   }

   @Override
   public void r() {
      this.c.b(new adc(this.cb.j));
      this.s();
   }

   @Override
   public void s() {
      this.cb.b(this);
      this.ca.a(this.cb);
      this.cb = this.ca;
   }

   public void a(float $$0, float $$1, boolean $$2, boolean $$3) {
      if (this.bR()) {
         if ($$0 >= -1.0F && $$0 <= 1.0F) {
            this.bo = $$0;
         }

         if ($$1 >= -1.0F && $$1 <= 1.0F) {
            this.bq = $$1;
         }

         this.bn = $$2;
         this.g($$3);
      }
   }

   @Override
   public void a(evr $$0) {
      double $$1 = this.du();
      double $$2 = this.dw();
      double $$3 = this.dA();
      super.a($$0);
      this.b(this.du() - $$1, this.dw() - $$2, this.dA() - $$3);
   }

   @Override
   public void t() {
      double $$0 = this.du();
      double $$1 = this.dw();
      double $$2 = this.dA();
      super.t();
      this.r(this.du() - $$0, this.dw() - $$1, this.dA() - $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (!this.bR() && !s($$0, $$1, $$2)) {
         if (this.cc()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(awk.C, $$3);
               this.C(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(awv.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(awk.w, $$4);
               this.C(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.be()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(awk.s, $$5);
               this.C(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.q_()) {
            if ($$1 > 0.0) {
               this.a(awk.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aE()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.cb()) {
                  this.a(awk.r, $$6);
                  this.C(0.1F * (float)$$6 * 0.01F);
               } else if (this.ca()) {
                  this.a(awk.q, $$6);
                  this.C(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(awk.p, $$6);
                  this.C(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fE()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(awk.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(awk.v, $$8);
            }
         }
      }
   }

   private void r(double $$0, double $$1, double $$2) {
      if (this.bR() && !s($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         bsu $$4 = this.dc();
         if ($$4 instanceof cot) {
            this.a(awk.x, $$3);
         } else if ($$4 instanceof cov) {
            this.a(awk.y, $$3);
         } else if ($$4 instanceof cfw) {
            this.a(awk.z, $$3);
         } else if ($$4 instanceof chj) {
            this.a(awk.A, $$3);
         } else if ($$4 instanceof ckq) {
            this.a(awk.D, $$3);
         }
      }
   }

   private static boolean s(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(awh<?> $$0, int $$1) {
      this.cG.b(this, $$0, $$1);
      this.gr().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(awh<?> $$0) {
      this.cG.a(this, $$0, 0);
      this.gr().a($$0, this, ewt::c);
   }

   @Override
   public int a(Collection<cyx<?>> $$0) {
      return this.cY.a($$0, this);
   }

   @Override
   public void a(cyx<?> $$0, List<cup> $$1) {
      am.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<alf> $$0) {
      List<cyx<?>> $$1 = $$0.stream().flatMap($$0x -> this.d.aJ().a($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<cyx<?>> $$0) {
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
      this.bH();
      if (this.fL()) {
         this.a(true, false);
      }
   }

   public boolean v() {
      return this.db;
   }

   public void w() {
      this.cN = -1.0E8F;
   }

   @Override
   public void a(xp $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void x() {
      if (!this.bz.e() && this.fv()) {
         this.c.b(new adm(this, (byte)9));
         super.x();
      }
   }

   @Override
   public void a(fb.a $$0, evr $$1) {
      super.a($$0, $$1);
      this.c.b(new aep($$0, $$1.c, $$1.d, $$1.e));
   }

   public void a(fb.a $$0, bsu $$1, fb.a $$2) {
      evr $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.c.b(new aep($$0, $$1, $$2));
   }

   public void a(arg $$0, boolean $$1) {
      this.dr = $$0.dr;
      this.dv = $$0.dv;
      this.e.a($$0.e.b(), $$0.e.c());
      this.y();
      if ($$1) {
         this.gc().a($$0.gc());
         this.t($$0.eA());
         this.cc = $$0.cc;
         this.co = $$0.co;
         this.cp = $$0.cp;
         this.cq = $$0.cq;
         this.s($$0.fW());
         this.ay = $$0.ay;
      } else if (this.dP().ab().b(dbu.d) || $$0.N_()) {
         this.gc().a($$0.gc());
         this.co = $$0.co;
         this.cp = $$0.cp;
         this.cq = $$0.cq;
         this.s($$0.fW());
      }

      this.cr = $$0.cr;
      this.bZ = $$0.bZ;
      this.ap().a(bV, $$0.ap().a(bV));
      this.cQ = -1;
      this.cN = -1.0F;
      this.cO = -1;
      this.cY.a($$0.cY);
      this.cX = $$0.cX;
      this.df = $$0.df;
      this.di = $$0.di;
      this.i($$0.gt());
      this.j($$0.gu());
      this.a($$0.gB());
   }

   @Override
   protected void a(bsc $$0, @Nullable bsu $$1) {
      super.a($$0, $$1);
      this.c.b(new agp(this.al(), $$0, true));
      if ($$0.a(bse.y)) {
         this.da = this.ai;
         this.cZ = this.dn();
      }

      am.B.a(this, $$1);
   }

   @Override
   protected void a(bsc $$0, boolean $$1, @Nullable bsu $$2) {
      super.a($$0, $$1, $$2);
      this.c.b(new agp(this.al(), $$0, false));
      am.B.a(this, $$2);
   }

   @Override
   protected void a(bsc $$0) {
      super.a($$0);
      this.c.b(new aeu(this.al(), $$0.c()));
      if ($$0.a(bse.y)) {
         this.cZ = null;
      }

      am.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.c.a($$0, $$1, $$2, this.dF(), this.dH(), bud.g);
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.c.a(this.du() + $$0, this.dw() + $$1, this.dA() + $$2, this.dF(), this.dH(), bud.f);
   }

   @Override
   public boolean a(arf $$0, double $$1, double $$2, double $$3, Set<bud> $$4, float $$5, float $$6) {
      dbf $$7 = new dbf(iz.a($$1, $$2, $$3));
      $$0.l().a(ark.g, $$7, 1, this.al());
      this.ac();
      if (this.fL()) {
         this.a(true, true);
      }

      if ($$0 == this.dP()) {
         this.c.a($$1, $$2, $$3, $$5, $$6, $$4);
      } else {
         this.a($$0, $$1, $$2, $$3, $$5, $$6);
      }

      this.n($$5);
      return true;
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      super.e($$0, $$1, $$2);
      this.c.l();
   }

   @Override
   public void b(bsu $$0) {
      this.z().l().a(this, new acl($$0, 4));
   }

   @Override
   public void c(bsu $$0) {
      this.z().l().a(this, new acl($$0, 5));
   }

   @Override
   public void y() {
      if (this.c != null) {
         this.c.b(new aei(this.gd()));
         this.J();
      }
   }

   public arf z() {
      return (arf)this.dP();
   }

   public boolean a(dbv $$0) {
      if (!this.e.a($$0)) {
         return false;
      } else {
         this.c.b(new adp(adp.e, (float)$$0.a()));
         if ($$0 == dbv.d) {
            this.gq();
            this.ac();
         } else {
            this.d(this);
         }

         this.y();
         this.ft();
         return true;
      }
   }

   @Override
   public boolean N_() {
      return this.e.b() == dbv.d;
   }

   @Override
   public boolean f() {
      return this.e.b() == dbv.b;
   }

   @Override
   public void a(xp $$0) {
      this.b($$0, false);
   }

   public void b(xp $$0, boolean $$1) {
      if (this.v($$1)) {
         this.c.a(new agg($$0, $$1), ww.a(() -> {
            if (this.v(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               xp $$3 = xp.b($$2).a(n.o);
               return new agg(xp.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(ye $$0, boolean $$1, xl.a $$2) {
      if (this.gJ()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String A() {
      return this.c.m() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(aqu $$0) {
      this.dd = $$0.b();
      this.dc = $$0.c();
      this.cS = $$0.d();
      this.cT = $$0.e();
      this.do = $$0.h();
      this.dp = $$0.i();
      this.ap().a(bV, (byte)$$0.f());
      this.ap().a(bW, (byte)$$0.g().a());
   }

   public aqu B() {
      int $$0 = this.ap().a(bV);
      btj $$1 = btj.d.apply(this.ap().a(bW));
      return new aqu(this.dd, this.dc, this.cS, this.cT, $$0, $$1, this.do, this.dp);
   }

   public boolean C() {
      return this.cT;
   }

   public cmv D() {
      return this.cS;
   }

   private boolean v(boolean $$0) {
      return this.cS == cmv.c ? $$0 : true;
   }

   private boolean gJ() {
      return this.cS == cmv.a;
   }

   public int E() {
      return this.dc;
   }

   public void a(ake $$0) {
      this.c.b(new afa($$0.a(), $$0.d().map(ake.a::a)));
   }

   @Override
   protected int F() {
      return this.d.c(this.gb());
   }

   @Override
   public void G() {
      this.cU = ac.c();
   }

   public awg H() {
      return this.cG;
   }

   public awf I() {
      return this.cY;
   }

   @Override
   protected void J() {
      if (this.N_()) {
         this.ev();
         this.k(true);
      } else {
         super.J();
      }
   }

   public bsu K() {
      return (bsu)(this.cV == null ? this : this.cV);
   }

   @Override
   public void d(@Nullable bsu $$0) {
      bsu $$1 = this.K();
      this.cV = (bsu)($$0 == null ? this : $$0);
      if ($$1 != this.cV) {
         if (this.cV.dP() instanceof arf $$2) {
            this.a($$2, this.cV.du(), this.cV.dw(), this.cV.dA(), Set.of(), this.dF(), this.dH());
         }

         if ($$0 != null) {
            this.z().l().a(this);
         }

         this.c.b(new afh(this.cV));
         this.c.l();
      }
   }

   @Override
   protected void L() {
      if (!this.cW) {
         super.L();
      }
   }

   @Override
   public void e(bsu $$0) {
      if (this.e.b() == dbv.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long M() {
      return this.cU;
   }

   @Nullable
   public xp N() {
      return null;
   }

   @Override
   public void a(bqt $$0) {
      super.a($$0);
      this.gw();
   }

   public boolean O() {
      return this.cW;
   }

   public void P() {
      this.cW = false;
   }

   public aln Q() {
      return this.cF;
   }

   public void a(arf $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      this.d(this);
      this.ac();
      if ($$0 == this.dP()) {
         this.c.a($$1, $$2, $$3, $$4, $$5);
      } else {
         arf $$6 = this.z();
         eps $$7 = $$0.A_();
         this.c.b(new aew(this.d($$0), (byte)3));
         this.c.b(new acv($$7.q(), $$7.r()));
         this.d.ah().d(this);
         $$6.a(this, bsu.c.e);
         this.dM();
         this.b($$1, $$2, $$3, $$4, $$5);
         this.c($$0);
         $$0.a(this);
         this.f($$6);
         this.c.a($$1, $$2, $$3, $$4, $$5);
         this.d.ah().a(this, $$0);
         this.d.ah().e(this);
      }
   }

   @Nullable
   public iz R() {
      return this.dk;
   }

   public float S() {
      return this.dm;
   }

   public ale<dby> T() {
      return this.dj;
   }

   public boolean U() {
      return this.dl;
   }

   public void a(ale<dby> $$0, @Nullable iz $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.dk) && $$0.equals(this.dj);
         if ($$4 && !$$5) {
            this.a(xp.c("block.minecraft.set_spawn"));
         }

         this.dk = $$1;
         this.dj = $$0;
         this.dm = $$2;
         this.dl = $$3;
      } else {
         this.dk = null;
         this.dj = dby.h;
         this.dm = 0.0F;
         this.dl = false;
      }
   }

   public kb V() {
      return this.dh;
   }

   public void a(kb $$0) {
      this.dh = $$0;
   }

   public aqt W() {
      return this.di;
   }

   public void a(aqt $$0) {
      this.di = $$0;
   }

   @Override
   public void a(avz $$0, awb $$1, float $$2, float $$3) {
      this.c.b(new agd(lp.b.e($$0), $$1, this.du(), this.dw(), this.dA(), $$2, $$3, this.ah.g()));
   }

   @Override
   public cjh a(cup $$0, boolean $$1, boolean $$2) {
      cjh $$3 = super.a($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dP().b($$3);
         cup $$4 = $$3.p();
         if ($$2) {
            if (!$$4.e()) {
               this.a(awk.f.b($$4.g()), $$0.I());
            }

            this.a(awk.F);
         }

         return $$3;
      }
   }

   public ask X() {
      return this.dn;
   }

   public void c(arf $$0) {
      this.a((dby)$$0);
      this.e.a($$0);
   }

   @Nullable
   private static dbv a(@Nullable us $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? dbv.a($$0.h($$1)) : null;
   }

   private dbv b(@Nullable dbv $$0) {
      dbv $$1 = this.d.bf();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.d.u_();
      }
   }

   @Override
   public void c(@Nullable us $$0) {
      this.e.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void k(us $$0) {
      $$0.a("playerGameType", this.e.b().a());
      dbv $$1 = this.e.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean Y() {
      return this.do;
   }

   public boolean b(arg $$0) {
      return $$0 == this ? false : this.do || $$0.do;
   }

   @Override
   public boolean a(dby $$0, iz $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cup $$0) {
      am.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cmw $$1 = this.gc();
      cup $$2 = $$1.a($$0);
      this.cb.b($$1, $$1.k).ifPresent($$1x -> this.cb.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean Z() {
      return this.dp;
   }

   @Override
   public Optional<cmd> aa() {
      return Optional.of(this.dr);
   }

   public void b(boolean $$0) {
      this.dq = $$0;
   }

   @Override
   public void a(cjh $$0) {
      super.a($$0);
      bsu $$1 = $$0.s();
      if ($$1 != null) {
         am.S.a(this, $$0.p(), $$1);
      }
   }

   public void a(yg $$0) {
      this.dv = $$0;
   }

   @Nullable
   public yg ab() {
      return this.dv != null && this.dv.b() ? null : this.dv;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cu = (float)(ayz.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dF());
      this.c.b(new adr(this));
   }

   @Override
   public boolean a(bsu $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         $$0.j(this);
         this.c.a(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
         if ($$0 instanceof btp $$2) {
            for (bsc $$3 : $$2.ex()) {
               this.c.b(new agp($$0.al(), $$3, false));
            }
         }

         return true;
      }
   }

   @Override
   public void ac() {
      bsu $$0 = this.dc();
      super.ac();
      if ($$0 instanceof btp $$1) {
         for (bsc $$2 : $$1.ex()) {
            this.c.b(new aeu($$0.al(), $$2.c()));
         }
      }
   }

   public agr d(arf $$0) {
      return new agr($$0.ae(), $$0.af(), dcz.a($$0.C()), this.e.b(), this.e.c(), $$0.ai(), $$0.B(), this.gB(), this.ax());
   }

   @Override
   public void d(iz $$0) {
      this.ds = $$0;
   }

   public void ad() {
      this.ds = null;
   }

   @Nullable
   public iz ae() {
      return this.ds;
   }
}
