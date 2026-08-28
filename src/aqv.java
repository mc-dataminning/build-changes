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

public class aqv extends cmx {
   private static final Logger cz = LogUtils.getLogger();
   private static final int cA = 32;
   private static final int cB = 10;
   private static final int cD = 25;
   public static final double b = 1.0;
   private static final buu cE = new buu(akr.b("creative_mode_block_range"), 0.5, buu.a.a);
   private static final buu cF = new buu(akr.b("creative_mode_entity_range"), 2.0, buu.a.a);
   public aru c;
   public final MinecraftServer d;
   public final aqw e;
   private final akz cG;
   private final avv cH;
   private float cI = Float.MIN_VALUE;
   private int cJ = Integer.MIN_VALUE;
   private int cK = Integer.MIN_VALUE;
   private int cL = Integer.MIN_VALUE;
   private int cM = Integer.MIN_VALUE;
   private int cN = Integer.MIN_VALUE;
   private float cO = -1.0E8F;
   private int cP = -99999999;
   private boolean cQ = true;
   private int cR = -99999999;
   private int cS = 60;
   private cmv cT = cmv.a;
   private boolean cU = true;
   private long cV = ad.c();
   @Nullable
   private bsr cW;
   private boolean cX;
   public boolean f;
   private final avu cY = new avu();
   @Nullable
   private exc cZ;
   private int da;
   private boolean db;
   private int dc = 2;
   private String dd = "en_us";
   @Nullable
   private exc de;
   @Nullable
   private exc df;
   @Nullable
   private exc dg;
   private kf dh = kf.a(0, 0, 0);
   private aqg di = aqg.a;
   private akq<dcw> dj = dcw.h;
   @Nullable
   private jd dk;
   private boolean dl;
   private float dm;
   private final arz dn;
   private boolean do;
   private boolean dp;
   private boolean dq;
   private cmd dr = new cmd(0, 0, 0);
   @Nullable
   private jd ds;
   private exc dt = exc.b;
   private final cqi du = new cqi() {
      @Override
      public void a(cpu $$0, jv<cuq> $$1, cuq $$2, int[] $$3) {
         aqv.this.c.b(new acp($$0.j, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cpu $$0, int $$1, cuq $$2) {
         aqv.this.c.b(new acr($$0.j, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cpu $$0, cuq $$1) {
         aqv.this.c.b(new acr(-1, $$0.k(), -1, $$1));
      }

      @Override
      public void a(cpu $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cpu $$0, int $$1, int $$2) {
         aqv.this.c.b(new acq($$0.j, $$1, $$2));
      }
   };
   private final cqh dv = new cqh() {
      @Override
      public void a(cpu $$0, int $$1, cuq $$2) {
         crq $$3 = $$0.b($$1);
         if (!($$3 instanceof crm)) {
            if ($$3.c == aqv.this.fY()) {
               an.f.a(aqv.this, aqv.this.fY(), $$2);
            }
         }
      }

      @Override
      public void a(cpu $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private xq dw;
   @Nullable
   public final Object g;
   private int dx;
   public boolean h;

   public aqv(MinecraftServer $$0, aqu $$1, GameProfile $$2, aqh $$3) {
      super($$1, $$1.V(), $$1.W(), $$2);
      this.dn = $$0.a(this);
      this.e = $$0.b(this);
      this.d = $$0;
      this.cH = $$0.ah().a((cmx)this);
      this.cG = $$0.ah().g(this);
      this.a(this.a($$1, $$1.V()).c(), 0.0F, 0.0F);
      this.a($$3);
      this.g = null;
   }

   @Override
   public jd a(aqu $$0, jd $$1) {
      ewx $$2 = this.a(bua.a).a(exc.b);
      jd $$3 = $$1;
      if ($$0.D_().g() && $$0.o().bb().k() != dct.c) {
         int $$4 = Math.max(0, this.d.a($$0));
         int $$5 = ayo.a($$0.C_().b((double)$$1.u(), (double)$$1.w()));
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
         int $$10 = ayw.a().a($$8);

         for (int $$11 = 0; $$11 < $$8; $$11++) {
            int $$12 = ($$10 + $$9 * $$11) % $$8;
            int $$13 = $$12 % ($$4 * 2 + 1);
            int $$14 = $$12 / ($$4 * 2 + 1);
            $$3 = aqp.a($$0, $$1.u() + $$13 - $$4, $$1.w() + $$14 - $$4);
            if ($$3 != null && $$0.a(this, $$2.c($$3.c()))) {
               return $$3;
            }
         }

         $$3 = $$1;
      }

      while (!$$0.a(this, $$2.c($$3.c())) && $$3.v() < $$0.am() - 1) {
         $$3 = $$3.d();
      }

      while ($$0.a(this, $$2.c($$3.e().c())) && $$3.v() > $$0.I_() + 1) {
         $$3 = $$3.e();
      }

      return $$3;
   }

   private int t(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         cmd.a.parse(new Dynamic(up.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(cz::error).ifPresent($$0x -> this.dr = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         ub $$1 = $$0.p("enteredNetherPosition");
         this.df = new exc($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.f = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cY.a($$0.p("recipeBook"), this.d.aJ());
      }

      if (this.fH()) {
         this.fI();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.dk = new jd($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.dl = $$0.q("SpawnForced");
         this.dm = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.dj = dcw.g.parse(up.a, $$0.c("SpawnDimension")).resultOrPartial(cz::error).orElse(dcw.h);
         }
      }

      this.dq = $$0.q("spawn_extra_particles_on_fall");
      uy $$2 = $$0.c("raid_omen_position");
      if ($$2 != null) {
         jd.a.parse(up.a, $$2).resultOrPartial(cz::error).ifPresent($$0x -> this.ds = $$0x);
      }
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      cmd.a.encodeStart(up.a, this.dr).resultOrPartial(cz::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.f);
      if (this.df != null) {
         ub $$1 = new ub();
         $$1.a("x", this.df.c);
         $$1.a("y", this.df.d);
         $$1.a("z", this.df.e);
         $$0.a("enteredNetherPosition", $$1);
      }

      bsr $$2 = this.cZ();
      bsr $$3 = this.dc();
      if ($$3 != null && $$2 != this && $$2.cY()) {
         ub $$4 = new ub();
         ub $$5 = new ub();
         $$2.e($$5);
         $$4.a("Attach", $$3.cz());
         $$4.a("Entity", $$5);
         $$0.a("RootVehicle", $$4);
      }

      $$0.a("recipeBook", this.cY.b());
      $$0.a("Dimension", this.dO().af().a().toString());
      if (this.dk != null) {
         $$0.a("SpawnX", this.dk.u());
         $$0.a("SpawnY", this.dk.v());
         $$0.a("SpawnZ", this.dk.w());
         $$0.a("SpawnForced", this.dl);
         $$0.a("SpawnAngle", this.dm);
         akr.a.encodeStart(up.a, this.dj.a()).resultOrPartial(cz::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }

      $$0.a("spawn_extra_particles_on_fall", this.dq);
      if (this.ds != null) {
         jd.a.encodeStart(up.a, this.ds).resultOrPartial(cz::error).ifPresent($$1 -> $$0.a("raid_omen_position", $$1));
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gh();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.cs = ayo.a((float)$$0 / $$1, 0.0F, $$2);
      this.cR = -1;
   }

   public void b(int $$0) {
      this.cq = $$0;
      this.cR = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cR = -1;
   }

   @Override
   public void a(cuq $$0, int $$1) {
      super.a($$0, $$1);
      this.cR = -1;
   }

   private void a(cpu $$0) {
      $$0.a(this.dv);
      $$0.a(this.du);
   }

   public void h() {
      this.a(this.cc);
   }

   @Override
   public void f_() {
      super.f_();
      this.c.b(adx.a);
   }

   @Override
   public void g_() {
      super.g_();
      this.c.b(new adw(this.eL()));
   }

   @Override
   public void a(dtc $$0) {
      an.e.a(this, $$0);
   }

   @Override
   protected cum k() {
      return new cvr(this);
   }

   @Override
   public void l() {
      this.e.a();
      this.dr.a();
      this.cS--;
      if (this.am > 0) {
         this.am--;
      }

      this.cd.d();
      if (!this.dO().B && !this.cd.b(this)) {
         this.s();
         this.cd = this.cc;
      }

      bsr $$0 = this.L();
      if ($$0 != this) {
         if ($$0.bE()) {
            this.a($$0.dt(), $$0.dv(), $$0.dz(), $$0.dE(), $$0.dG());
            this.A().l().a(this);
            if (this.fO()) {
               this.d(this);
            }
         } else {
            this.d(this);
         }
      }

      an.x.a(this);
      if (this.cZ != null) {
         an.v.a(this, this.cZ, this.ai - this.da);
      }

      this.o();
      this.p();
      this.gD();
      this.cG.b(this);
   }

   private void gD() {
      bus $$0 = this.f(buw.g);
      if ($$0 != null) {
         if (this.f()) {
            $$0.a(cE);
         } else {
            $$0.e(cE);
         }
      }

      bus $$1 = this.f(buw.j);
      if ($$1 != null) {
         if (this.f()) {
            $$1.a(cF);
         } else {
            $$1.e(cF);
         }
      }
   }

   public void m() {
      try {
         if (!this.R_() || !this.dh()) {
            super.l();
         }

         for (int $$0 = 0; $$0 < this.fY().b(); $$0++) {
            cuq $$1 = this.fY().a($$0);
            if ($$1.g().ao_()) {
               zg<?> $$2 = ((csz)$$1.g()).a($$1, this.dO(), this);
               if ($$2 != null) {
                  this.c.b($$2);
               }
            }
         }

         if (this.ew() != this.cO || this.cP != this.ce.a() || this.ce.e() == 0.0F != this.cQ) {
            this.c.b(new afe(this.ew(), this.ce.a(), this.ce.e()));
            this.cO = this.ew();
            this.cP = this.ce.a();
            this.cQ = this.ce.e() == 0.0F;
         }

         if (this.ew() + this.fo() != this.cI) {
            this.cI = this.ew() + this.fo();
            this.a(eyj.g, ayo.f(this.cI));
         }

         if (this.ce.a() != this.cJ) {
            this.cJ = this.ce.a();
            this.a(eyj.h, ayo.f((float)this.cJ));
         }

         if (this.cm() != this.cK) {
            this.cK = this.cm();
            this.a(eyj.i, ayo.f((float)this.cK));
         }

         if (this.eK() != this.cL) {
            this.cL = this.eK();
            this.a(eyj.j, ayo.f((float)this.cL));
         }

         if (this.cr != this.cN) {
            this.cN = this.cr;
            this.a(eyj.k, ayo.f((float)this.cN));
         }

         if (this.cq != this.cM) {
            this.cM = this.cq;
            this.a(eyj.l, ayo.f((float)this.cM));
         }

         if (this.cr != this.cR) {
            this.cR = this.cr;
            this.c.b(new afd(this.cs, this.cr, this.cq));
         }

         if (this.ai % 20 == 0) {
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
      if (this.ew() > 0.0F && this.de != null) {
         an.X.a(this, this.de);
      }

      this.de = null;
      super.n();
   }

   public void o() {
      if (this.ac > 0.0F && this.de == null) {
         this.de = this.dm();
         if (this.cx != null && this.cx.d <= this.de.d) {
            an.ae.a(this, this.cx, this.cy);
         }
      }
   }

   public void p() {
      if (this.dc() != null && this.dc().bt()) {
         if (this.dg == null) {
            this.dg = this.dm();
         } else {
            an.Y.a(this, this.dg);
         }
      }

      if (this.dg != null && (this.dc() == null || !this.dc().bt())) {
         this.dg = null;
      }
   }

   private void a(eyj $$0, int $$1) {
      this.gn().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(brk $$0) {
      this.a(dxz.p);
      boolean $$1 = this.dO().ab().b(dcs.n);
      if ($$1) {
         wz $$2 = this.eL().a();
         this.c.a(new ady(this.an(), $$2), wg.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            wz $$3x = wz.a("death.attack.message_too_long", wz.b($$2x).a(n.o));
            wz $$4x = wz.a("death.attack.even_more_magic", this.S_()).a($$1xx -> $$1xx.a(new xf(xf.a.a, $$3x)));
            return new ady(this.an(), $$4x);
         }));
         eyi $$3 = this.ck();
         if ($$3 == null || $$3.k() == eyi.b.a) {
            this.d.ah().a($$2, false);
         } else if ($$3.k() == eyi.b.c) {
            this.d.ah().a(this, $$2);
         } else if ($$3.k() == eyi.b.d) {
            this.d.ah().b(this, $$2);
         }
      } else {
         this.c.b(new ady(this.an(), wy.a));
      }

      this.gm();
      if (this.dO().ab().b(dcs.N)) {
         this.gE();
      }

      if (!this.R_()) {
         this.a(this.A(), $$0);
      }

      this.gn().a(eyj.d, this, eye::b);
      btn $$4 = this.eM();
      if ($$4 != null) {
         this.b(avz.h.b($$4.am()));
         $$4.a(this, this.bl, $$0);
         this.f($$4);
      }

      this.dO().a(this, (byte)3);
      this.a(avz.N);
      this.a(avz.i.b(avz.m));
      this.a(avz.i.b(avz.n));
      this.aD();
      this.k(0);
      this.c(false);
      this.eL().c();
      this.a(Optional.of(jl.a(this.dO().af(), this.do())));
   }

   private void gE() {
      ewx $$0 = new ewx(this.do()).c(32.0, 10.0, 32.0);
      this.dO().a(btp.class, $$0, bsw.f).stream().filter($$0x -> $$0x instanceof btt).forEach($$0x -> ((btt)$$0x).a_((cmx)this));
   }

   @Override
   public void a(bsr $$0, int $$1, brk $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.s($$1);
         this.gn().a(eyj.f, this, eye::b);
         if ($$0 instanceof cmx) {
            this.a(avz.Q);
            this.gn().a(eyj.e, this, eye::b);
         } else {
            this.a(avz.O);
         }

         this.a(this, $$0, eyj.m);
         this.a($$0, this, eyj.n);
         an.c.a(this, $$0, $$2);
      }
   }

   private void a(eyf $$0, eyf $$1, eyj[] $$2) {
      eyb $$3 = this.gn().e($$1.cB());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gn().a($$2[$$4], $$0, eye::b);
         }
      }
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.d.n() && this.gF() && $$0.a(awg.m);
         if (!$$2 && this.cS > 0 && !$$0.a(awg.d)) {
            return false;
         } else {
            bsr $$3 = $$0.d();
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
      return !this.gF() ? false : super.a($$0);
   }

   private boolean gF() {
      return this.d.ad();
   }

   public eqc a(boolean $$0, eqc.a $$1) {
      jd $$2 = this.S();
      float $$3 = this.T();
      boolean $$4 = this.V();
      aqu $$5 = this.d.a(this.U());
      if ($$5 != null && $$2 != null) {
         Optional<aqv.a> $$6 = a($$5, $$2, $$3, $$4, $$0);
         if ($$6.isPresent()) {
            aqv.a $$7 = $$6.get();
            return new eqc($$5, $$7.a(), exc.b, $$7.b(), 0.0F, $$1);
         } else {
            return eqc.a(this.d.I(), this, $$1);
         }
      } else {
         return new eqc(this.d.I(), this, $$1);
      }
   }

   private static Optional<aqv.a> a(aqu $$0, jd $$1, float $$2, boolean $$3, boolean $$4) {
      dtc $$5 = $$0.a_($$1);
      dfy $$6 = $$5.b();
      if ($$6 instanceof dmh && ($$3 || $$5.c(dmh.d) > 0) && dmh.a($$0)) {
         Optional<exc> $$7 = dmh.a(bsx.by, $$0, $$1);
         if (!$$3 && !$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(dmh.d, Integer.valueOf($$5.c(dmh.d) - 1)), 3);
         }

         return $$7.map($$1x -> aqv.a.a($$1x, $$1));
      } else if ($$6 instanceof dfr && dfr.a($$0)) {
         return dfr.a(bsx.by, $$0, $$1, $$5.c(dfr.aE), $$2).map($$1x -> aqv.a.a($$1x, $$1));
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dtc $$9 = $$0.a_($$1.d());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new aqv.a(new exc((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5), $$2)) : Optional.empty();
      }
   }

   public void q() {
      this.ak();
      this.A().a(this, bsr.c.e);
      if (!this.h) {
         this.h = true;
         this.c.b(new adb(adb.f, 0.0F));
         this.f = true;
      }
   }

   @Nullable
   @Override
   public bsr a(eqc $$0) {
      if (this.dJ()) {
         return null;
      } else {
         if ($$0.f()) {
            this.c.b(new adb(adb.b, 0.0F));
         }

         aqu $$1 = $$0.a();
         aqu $$2 = this.A();
         akq<dcw> $$3 = $$2.af();
         if ($$1.af() == $$3) {
            this.c.a($$0.b().c, $$0.b().d, $$0.b().e, $$0.d(), $$0.e());
            this.c.l();
            $$0.g().onTransition(this);
            return this;
         } else {
            this.cX = true;
            erb $$4 = $$1.A_();
            this.c.b(new aei(this.b($$1), (byte)3));
            this.c.b(new ach($$4.q(), $$4.r()));
            aur $$5 = this.d.ah();
            $$5.e(this);
            $$2.a(this, bsr.c.e);
            this.dL();
            $$2.ag().a("moving");
            if ($$3 == dcw.h && $$1.af() == dcw.i) {
               this.df = this.dm();
            }

            $$2.ag().c();
            $$2.ag().a("placing");
            this.a($$1);
            this.c.a($$0.b().c, $$0.b().d, $$0.b().e, $$0.d(), $$0.e());
            this.c.l();
            $$1.d(this);
            $$2.ag().c();
            this.c($$2);
            this.c.b(new adu(this.fZ()));
            $$5.a(this, $$1);
            $$5.f(this);
            $$5.d(this);
            $$0.g().onTransition(this);
            this.cR = -1;
            this.cO = -1.0F;
            this.cP = -1;
            return this;
         }
      }
   }

   private void c(aqu $$0) {
      akq<dcw> $$1 = $$0.af();
      akq<dcw> $$2 = this.dO().af();
      an.w.a(this, $$1, $$2);
      if ($$1 == dcw.i && $$2 == dcw.h && this.df != null) {
         an.D.a(this, this.df);
      }

      if ($$2 != dcw.i) {
         this.df = null;
      }
   }

   @Override
   public boolean a(aqv $$0) {
      if ($$0.R_()) {
         return this.L() == this;
      } else {
         return this.R_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bsr $$0, int $$1) {
      super.a($$0, $$1);
      this.cd.d();
   }

   @Override
   public Either<cmx.a, azs> a(jd $$0) {
      ji $$1 = this.dO().a_($$0).c(dju.aE);
      if (this.fH() || !this.bE()) {
         return Either.left(cmx.a.e);
      } else if (!this.dO().D_().j()) {
         return Either.left(cmx.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cmx.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cmx.a.d);
      } else {
         this.a(this.dO().af(), $$0, this.dE(), false, true);
         if (this.dO().R()) {
            return Either.left(cmx.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               exc $$4 = exc.c($$0);
               List<ckd> $$5 = this.dO()
                  .a(ckd.class, new ewx($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.a(this));
               if (!$$5.isEmpty()) {
                  return Either.left(cmx.a.f);
               }
            }

            Either<cmx.a, azs> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(avz.ap);
               an.r.a(this);
            });
            if (!this.A().d()) {
               this.a(wz.c("sleep.not_possible"), true);
            }

            ((aqu)this.dO()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(jd $$0) {
      this.a(avz.i.b(avz.n));
      super.b($$0);
   }

   private boolean a(jd $$0, ji $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(jd $$0) {
      exc $$1 = exc.c($$0);
      return Math.abs(this.dt() - $$1.a()) <= 3.0 && Math.abs(this.dv() - $$1.b()) <= 2.0 && Math.abs(this.dz() - $$1.c()) <= 3.0;
   }

   private boolean b(jd $$0, ji $$1) {
      jd $$2 = $$0.d();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fH()) {
         this.A().l().a(this, new abx(this, 2));
      }

      super.a($$0, $$1);
      if (this.c != null) {
         this.c.a(this.dt(), this.dv(), this.dz(), this.dE(), this.dG());
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.bJ();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public boolean b(brk $$0) {
      return super.b($$0) || this.P();
   }

   @Override
   protected void a(double $$0, boolean $$1, dtc $$2, jd $$3) {
   }

   @Override
   protected void b(aqu $$0, jd $$1) {
      if (!this.R_()) {
         super.b($$0, $$1);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.dh()) {
         this.b($$3, new exc($$0, $$1, $$2));
         jd $$4 = this.aK();
         dtc $$5 = this.dO().a_($$4);
         if (this.dq && $$3 && this.ac > 0.0F) {
            exc $$6 = $$4.b().b(0.0, 0.5, 0.0);
            int $$7 = (int)ayo.a(50.0F * this.ac, 0.0F, 200.0F);
            this.A().a(new le(lm.b, $$5), $$6.c, $$6.d, $$6.e, $$7, 0.3F, 0.3F, 0.3F, 0.15F);
            this.dq = false;
         }

         super.a($$1, $$3, $$5, $$4);
      }
   }

   @Override
   public void a(@Nullable bsr $$0) {
      super.a($$0);
      this.cx = this.dm();
      this.cy = $$0;
      this.w($$0 != null && $$0.am() == bsx.bn);
   }

   @Override
   protected void r() {
      if (this.dO().s().i()) {
         super.r();
      }
   }

   @Override
   public void a(drs $$0, boolean $$1) {
      this.c.b(new acd(this.dO(), $$0.aD_()));
      this.c.b(new ads($$0.aD_(), $$1));
   }

   private void gG() {
      this.dx = this.dx % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bqv $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.cd != this.cc) {
            this.s();
         }

         this.gG();
         cpu $$1 = $$0.createMenu(this.dx, this.fY(), this);
         if ($$1 == null) {
            if (this.R_()) {
               this.a(wz.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.c.b(new adr($$1.j, $$1.a(), $$0.S_()));
            this.a($$1);
            this.cd = $$1;
            return OptionalInt.of(this.dx);
         }
      }
   }

   @Override
   public void a(int $$0, dbv $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.c.b(new adn($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(chi $$0, bqk $$1) {
      if (this.cd != this.cc) {
         this.s();
      }

      this.gG();
      int $$2 = $$0.af_();
      this.c.b(new adc(this.dx, $$2, $$0.an()));
      this.cd = new cqv(this.dx, this.fY(), $$1, $$0, $$2);
      this.a(this.cd);
   }

   @Override
   public void a(cuq $$0, bqq $$1) {
      if ($$0.a(cut.ua)) {
         if (cwr.a($$0, this.dg(), this)) {
            this.cd.d();
         }

         this.c.b(new adq($$1));
      }
   }

   @Override
   public void a(dqr $$0) {
      this.c.b(acb.a($$0, dqh::e));
   }

   @Override
   public void s() {
      this.c.b(new aco(this.cd.j));
      this.t();
   }

   @Override
   public void t() {
      this.cd.a(this);
      this.cc.a(this.cd);
      this.cd = this.cc;
   }

   public void a(float $$0, float $$1, boolean $$2, boolean $$3) {
      if (this.bS()) {
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
   public void a(exc $$0) {
      double $$1 = this.dt();
      double $$2 = this.dv();
      double $$3 = this.dz();
      super.a($$0);
      this.b(this.dt() - $$1, this.dv() - $$2, this.dz() - $$3);
   }

   @Override
   public void u() {
      double $$0 = this.dt();
      double $$1 = this.dv();
      double $$2 = this.dz();
      super.u();
      this.q(this.dt() - $$0, this.dv() - $$1, this.dz() - $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (!this.bS() && !r($$0, $$1, $$2)) {
         if (this.cd()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(avz.C, $$3);
               this.E(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(awk.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(avz.w, $$4);
               this.E(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.bf()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(avz.s, $$5);
               this.E(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.p_()) {
            if ($$1 > 0.0) {
               this.a(avz.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aF()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.cc()) {
                  this.a(avz.r, $$6);
                  this.E(0.1F * (float)$$6 * 0.01F);
               } else if (this.cb()) {
                  this.a(avz.q, $$6);
                  this.E(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(avz.p, $$6);
                  this.E(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fA()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(avz.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(avz.v, $$8);
            }
         }
      }
   }

   private void q(double $$0, double $$1, double $$2) {
      if (this.bS() && !r($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         bsr $$4 = this.dc();
         if ($$4 instanceof cot) {
            this.a(avz.x, $$3);
         } else if ($$4 instanceof cov) {
            this.a(avz.y, $$3);
         } else if ($$4 instanceof cfv) {
            this.a(avz.z, $$3);
         } else if ($$4 instanceof chi) {
            this.a(avz.A, $$3);
         } else if ($$4 instanceof ckq) {
            this.a(avz.D, $$3);
         }
      }
   }

   private static boolean r(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(avw<?> $$0, int $$1) {
      this.cH.b(this, $$0, $$1);
      this.gn().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(avw<?> $$0) {
      this.cH.a(this, $$0, 0);
      this.gn().a($$0, this, eye::c);
   }

   @Override
   public int a(Collection<czb<?>> $$0) {
      return this.cY.a($$0, this);
   }

   @Override
   public void a(czb<?> $$0, List<cuq> $$1) {
      an.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<akr> $$0) {
      List<czb<?>> $$1 = $$0.stream().flatMap($$0x -> this.d.aJ().a($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<czb<?>> $$0) {
      return this.cY.b($$0, this);
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cR = -1;
   }

   @Override
   public void v() {
      this.db = true;
      this.bI();
      if (this.fH()) {
         this.a(true, false);
      }
   }

   @Override
   public boolean w() {
      return this.db;
   }

   @Override
   public void x() {
      this.cO = -1.0E8F;
   }

   @Override
   public void a(wz $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void L_() {
      if (!this.bz.e() && this.fr()) {
         this.c.b(new acy(this, (byte)9));
         super.L_();
      }
   }

   @Override
   public void a(ff.a $$0, exc $$1) {
      super.a($$0, $$1);
      this.c.b(new aeb($$0, $$1.c, $$1.d, $$1.e));
   }

   public void a(ff.a $$0, bsr $$1, ff.a $$2) {
      exc $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.c.b(new aeb($$0, $$1, $$2));
   }

   public void a(aqv $$0, boolean $$1) {
      this.dr = $$0.dr;
      this.dw = $$0.dw;
      this.e.a($$0.e.b(), $$0.e.c());
      this.z();
      this.eS().b($$0.eS());
      this.v(this.eN());
      if ($$1) {
         this.fY().a($$0.fY());
         this.v($$0.ew());
         this.ce = $$0.ce;

         for (brz $$2 : $$0.et()) {
            this.b(new brz($$2));
         }

         this.cq = $$0.cq;
         this.cr = $$0.cr;
         this.cs = $$0.cs;
         this.r($$0.fS());
         this.aw = $$0.aw;
      } else if (this.dO().ab().b(dcs.d) || $$0.R_()) {
         this.fY().a($$0.fY());
         this.cq = $$0.cq;
         this.cr = $$0.cr;
         this.cs = $$0.cs;
         this.r($$0.fS());
      }

      this.ct = $$0.ct;
      this.cb = $$0.cb;
      this.ar().a(bX, $$0.ar().a(bX));
      this.cR = -1;
      this.cO = -1.0F;
      this.cP = -1;
      this.cY.a($$0.cY);
      this.f = $$0.f;
      this.df = $$0.df;
      this.di = $$0.di;
      this.i($$0.gp());
      this.j($$0.gq());
      this.a($$0.gx());
   }

   @Override
   protected void a(brz $$0, @Nullable bsr $$1) {
      super.a($$0, $$1);
      this.c.b(new agb(this.an(), $$0, true));
      if ($$0.a(bsb.y)) {
         this.da = this.ai;
         this.cZ = this.dm();
      }

      an.B.a(this, $$1);
   }

   @Override
   protected void a(brz $$0, boolean $$1, @Nullable bsr $$2) {
      super.a($$0, $$1, $$2);
      this.c.b(new agb(this.an(), $$0, false));
      an.B.a(this, $$2);
   }

   @Override
   protected void a(brz $$0) {
      super.a($$0);
      this.c.b(new aeg(this.an(), $$0.c()));
      if ($$0.a(bsb.y)) {
         this.cZ = null;
      }

      an.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.c.a($$0, $$1, $$2, this.dE(), this.dG(), buc.g);
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.c.a(this.dt() + $$0, this.dv() + $$1, this.dz() + $$2, this.dE(), this.dG(), buc.f);
   }

   @Override
   public boolean a(aqu $$0, double $$1, double $$2, double $$3, Set<buc> $$4, float $$5, float $$6) {
      dcd $$7 = new dcd(jd.a($$1, $$2, $$3));
      $$0.l().a(aqz.f, $$7, 1, this.an());
      this.ad();
      if (this.fH()) {
         this.a(true, true);
      }

      if ($$0 == this.dO()) {
         this.c.a($$1, $$2, $$3, $$5, $$6, $$4);
      } else {
         this.a($$0, $$1, $$2, $$3, $$5, $$6);
      }

      this.o($$5);
      return true;
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      super.e($$0, $$1, $$2);
      this.c.l();
   }

   @Override
   public void b(bsr $$0) {
      this.A().l().a(this, new abx($$0, 4));
   }

   @Override
   public void c(bsr $$0) {
      this.A().l().a(this, new abx($$0, 5));
   }

   @Override
   public void z() {
      if (this.c != null) {
         this.c.b(new adu(this.fZ()));
         this.K();
      }
   }

   public aqu A() {
      return (aqu)this.dO();
   }

   public boolean a(dct $$0) {
      boolean $$1 = this.R_();
      if (!this.e.a($$0)) {
         return false;
      } else {
         this.c.b(new adb(adb.e, (float)$$0.a()));
         if ($$0 == dct.d) {
            this.gm();
            this.ad();
            dae.a(this);
         } else {
            this.d(this);
            if ($$1) {
               dae.a(this.A(), this);
            }
         }

         this.z();
         this.fp();
         return true;
      }
   }

   @Override
   public boolean R_() {
      return this.e.b() == dct.d;
   }

   @Override
   public boolean f() {
      return this.e.b() == dct.b;
   }

   @Override
   public void a(wz $$0) {
      this.b($$0, false);
   }

   public void b(wz $$0, boolean $$1) {
      if (this.x($$1)) {
         this.c.a(new afs($$0, $$1), wg.a(() -> {
            if (this.x(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               wz $$3 = wz.b($$2).a(n.o);
               return new afs(wz.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(xo $$0, boolean $$1, wv.a $$2) {
      if (this.gH()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String B() {
      return this.c.m() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(aqh $$0) {
      this.dd = $$0.b();
      this.dc = $$0.c();
      this.cT = $$0.d();
      this.cU = $$0.e();
      this.do = $$0.h();
      this.dp = $$0.i();
      this.ar().a(bX, (byte)$$0.f());
      this.ar().a(bY, (byte)$$0.g().a());
   }

   public aqh C() {
      int $$0 = this.ar().a(bX);
      btg $$1 = btg.d.apply(this.ar().a(bY));
      return new aqh(this.dd, this.dc, this.cT, this.cU, $$0, $$1, this.do, this.dp);
   }

   public boolean D() {
      return this.cU;
   }

   public cmv E() {
      return this.cT;
   }

   private boolean x(boolean $$0) {
      return this.cT == cmv.c ? $$0 : true;
   }

   private boolean gH() {
      return this.cT == cmv.a;
   }

   public int F() {
      return this.dc;
   }

   public void a(ajq $$0) {
      this.c.b(new aem($$0.a(), $$0.d().map(ajq.a::a)));
   }

   @Override
   protected int G() {
      return this.d.c(this.fX());
   }

   @Override
   public void H() {
      this.cV = ad.c();
   }

   public avv I() {
      return this.cH;
   }

   public avu J() {
      return this.cY;
   }

   @Override
   protected void K() {
      if (this.R_()) {
         this.er();
         this.k(true);
      } else {
         super.K();
      }
   }

   public bsr L() {
      return (bsr)(this.cW == null ? this : this.cW);
   }

   @Override
   public void d(@Nullable bsr $$0) {
      bsr $$1 = this.L();
      this.cW = (bsr)($$0 == null ? this : $$0);
      if ($$1 != this.cW) {
         if (this.cW.dO() instanceof aqu $$2) {
            this.a($$2, this.cW.dt(), this.cW.dv(), this.cW.dz(), Set.of(), this.dE(), this.dG());
         }

         if ($$0 != null) {
            this.A().l().a(this);
         }

         this.c.b(new aet(this.cW));
         this.c.l();
      }
   }

   @Override
   protected void M() {
      if (!this.cX) {
         super.M();
      }
   }

   @Override
   public void e(bsr $$0) {
      if (this.e.b() == dct.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long N() {
      return this.cV;
   }

   @Nullable
   public wz O() {
      return null;
   }

   @Override
   public void a(bqq $$0) {
      super.a($$0);
      this.gs();
   }

   public boolean P() {
      return this.cX;
   }

   public void Q() {
      this.cX = false;
   }

   public akz R() {
      return this.cG;
   }

   public void a(aqu $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      this.d(this);
      this.ad();
      if ($$0 == this.dO()) {
         this.c.a($$1, $$2, $$3, $$4, $$5);
      } else {
         this.a(new eqc($$0, new exc($$1, $$2, $$3), exc.b, $$4, $$5, eqc.a));
      }
   }

   @Nullable
   public jd S() {
      return this.dk;
   }

   public float T() {
      return this.dm;
   }

   public akq<dcw> U() {
      return this.dj;
   }

   public boolean V() {
      return this.dl;
   }

   public void b(aqv $$0) {
      this.a($$0.U(), $$0.S(), $$0.T(), $$0.V(), false);
   }

   public void a(akq<dcw> $$0, @Nullable jd $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.dk) && $$0.equals(this.dj);
         if ($$4 && !$$5) {
            this.a(wz.c("block.minecraft.set_spawn"));
         }

         this.dk = $$1;
         this.dj = $$0;
         this.dm = $$2;
         this.dl = $$3;
      } else {
         this.dk = null;
         this.dj = dcw.h;
         this.dm = 0.0F;
         this.dl = false;
      }
   }

   public kf W() {
      return this.dh;
   }

   public void a(kf $$0) {
      this.dh = $$0;
   }

   public aqg X() {
      return this.di;
   }

   public void a(aqg $$0) {
      this.di = $$0;
   }

   @Override
   public void a(avo $$0, avq $$1, float $$2, float $$3) {
      this.c.b(new afp(lt.b.e($$0), $$1, this.dt(), this.dv(), this.dz(), $$2, $$3, this.ah.g()));
   }

   @Override
   public cjh a(cuq $$0, boolean $$1, boolean $$2) {
      cjh $$3 = super.a($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dO().b($$3);
         cuq $$4 = $$3.p();
         if ($$2) {
            if (!$$4.e()) {
               this.a(avz.f.b($$4.g()), $$0.H());
            }

            this.a(avz.F);
         }

         return $$3;
      }
   }

   public arz Y() {
      return this.dn;
   }

   public void a(aqu $$0) {
      this.a((dcw)$$0);
      this.e.a($$0);
   }

   @Nullable
   private static dct a(@Nullable ub $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? dct.a($$0.h($$1)) : null;
   }

   private dct b(@Nullable dct $$0) {
      dct $$1 = this.d.bf();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.d.u_();
      }
   }

   @Override
   public void c(@Nullable ub $$0) {
      this.e.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void k(ub $$0) {
      $$0.a("playerGameType", this.e.b().a());
      dct $$1 = this.e.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean Z() {
      return this.do;
   }

   public boolean c(aqv $$0) {
      return $$0 == this ? false : this.do || $$0.do;
   }

   @Override
   public boolean a(dcw $$0, jd $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cuq $$0) {
      an.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cmw $$1 = this.fY();
      cuq $$2 = $$1.a($$0);
      this.cd.b($$1, $$1.k).ifPresent($$1x -> this.cd.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean aa() {
      return this.dp;
   }

   @Override
   public Optional<cmd> ab() {
      return Optional.of(this.dr);
   }

   public void b(boolean $$0) {
      this.dq = $$0;
   }

   @Override
   public void a(cjh $$0) {
      super.a($$0);
      bsr $$1 = $$0.s();
      if ($$1 != null) {
         an.S.a(this, $$0.p(), $$1);
      }
   }

   public void a(xq $$0) {
      this.dw = $$0;
   }

   @Nullable
   public xq ac() {
      return this.dw != null && this.dw.b() ? null : this.dw;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cw = (float)(ayo.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dE());
      this.c.b(new add(this));
   }

   @Override
   public boolean a(bsr $$0, boolean $$1) {
      if (super.a($$0, $$1)) {
         this.b(exc.b);
         $$0.j(this);
         this.c.a(this.dt(), this.dv(), this.dz(), this.dE(), this.dG());
         if ($$0 instanceof btn $$2) {
            this.d.ah().a($$2, this.c);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void ad() {
      bsr $$0 = this.dc();
      super.ad();
      if ($$0 instanceof btn $$1) {
         for (brz $$2 : $$1.et()) {
            this.c.b(new aeg($$0.an(), $$2.c()));
         }
      }
   }

   public agd b(aqu $$0) {
      return new agd($$0.ae(), $$0.af(), ddy.a($$0.C()), this.e.b(), this.e.c(), $$0.ai(), $$0.B(), this.gx(), this.az());
   }

   @Override
   public void c(jd $$0) {
      this.ds = $$0;
   }

   public void ae() {
      this.ds = null;
   }

   @Nullable
   public jd af() {
      return this.ds;
   }

   @Override
   public exc ag() {
      bsr $$0 = this.dc();
      return $$0 != null && $$0.cQ() != this ? $$0.ag() : this.dt;
   }

   @Override
   public void b(exc $$0) {
      this.dt = $$0;
   }

   @Override
   protected float a(bsr $$0, float $$1, brk $$2) {
      return dae.a(this.A(), this.dS(), $$0, $$2, $$1);
   }

   @Override
   public void a(cul $$0, bsy $$1) {
      super.a($$0, $$1);
      this.b(avz.d.b($$0));
   }

   static record a(exc a, float b) {
      public static aqv.a a(exc $$0, jd $$1) {
         return new aqv.a($$0, b($$0, $$1));
      }

      private static float b(exc $$0, jd $$1) {
         exc $$2 = exc.c($$1).d($$0).d();
         return (float)ayo.d(ayo.d($$2.e, $$2.c) * 180.0F / (float)Math.PI - 90.0);
      }
   }
}
