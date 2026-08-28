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

public class aqu extends cmv {
   private static final Logger cB = LogUtils.getLogger();
   private static final int cC = 32;
   private static final int cD = 10;
   private static final int cE = 25;
   public static final double b = 1.0;
   private static final bus cF = new bus(akq.b("creative_mode_block_range"), 0.5, bus.a.a);
   private static final bus cG = new bus(akq.b("creative_mode_entity_range"), 2.0, bus.a.a);
   public art c;
   public final MinecraftServer d;
   public final aqv e;
   private final aky cH;
   private final avu cI;
   private float cJ = Float.MIN_VALUE;
   private int cK = Integer.MIN_VALUE;
   private int cL = Integer.MIN_VALUE;
   private int cM = Integer.MIN_VALUE;
   private int cN = Integer.MIN_VALUE;
   private int cO = Integer.MIN_VALUE;
   private float cP = -1.0E8F;
   private int cQ = -99999999;
   private boolean cR = true;
   private int cS = -99999999;
   private int cT = 60;
   private cmt cU = cmt.a;
   private boolean cV = true;
   private long cW = ad.c();
   @Nullable
   private bsq cX;
   private boolean cY;
   public boolean f;
   private final avt cZ = new avt();
   @Nullable
   private eww da;
   private int db;
   private boolean dc;
   private int dd = 2;
   private String de = "en_us";
   @Nullable
   private eww df;
   @Nullable
   private eww dg;
   @Nullable
   private eww dh;
   private kf di = kf.a(0, 0, 0);
   private aqf dj = aqf.a;
   private akp<dcu> dk = dcu.h;
   @Nullable
   private jd dl;
   private boolean dm;
   private float dn;
   private final ary do;
   private boolean dp;
   private boolean dq;
   private boolean dr;
   private cmb ds = new cmb(0, 0, 0);
   @Nullable
   private jd dt;
   private eww du = eww.b;
   private final cqg dv = new cqg() {
      @Override
      public void a(cps $$0, jv<cuo> $$1, cuo $$2, int[] $$3) {
         aqu.this.c.b(new aco($$0.j, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cps $$0, int $$1, cuo $$2) {
         aqu.this.c.b(new acq($$0.j, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cps $$0, cuo $$1) {
         aqu.this.c.b(new acq(-1, $$0.k(), -1, $$1));
      }

      @Override
      public void a(cps $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cps $$0, int $$1, int $$2) {
         aqu.this.c.b(new acp($$0.j, $$1, $$2));
      }
   };
   private final cqf dw = new cqf() {
      @Override
      public void a(cps $$0, int $$1, cuo $$2) {
         cro $$3 = $$0.b($$1);
         if (!($$3 instanceof crk)) {
            if ($$3.c == aqu.this.fZ()) {
               an.f.a(aqu.this, aqu.this.fZ(), $$2);
            }
         }
      }

      @Override
      public void a(cps $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private xp dx;
   @Nullable
   public final Object g;
   private int dy;
   public boolean h;

   public aqu(MinecraftServer $$0, aqt $$1, GameProfile $$2, aqg $$3) {
      super($$1, $$1.V(), $$1.W(), $$2);
      this.do = $$0.a(this);
      this.e = $$0.b(this);
      this.d = $$0;
      this.cI = $$0.ah().a((cmv)this);
      this.cH = $$0.ah().g(this);
      this.c($$1);
      this.a($$3);
      this.g = null;
   }

   private void c(aqt $$0) {
      jd $$1 = $$0.V();
      if ($$0.D_().g() && $$0.o().bb().k() != dcr.c) {
         int $$2 = Math.max(0, this.d.a($$0));
         int $$3 = ayn.a($$0.C_().b((double)$$1.u(), (double)$$1.w()));
         if ($$3 < $$2) {
            $$2 = $$3;
         }

         if ($$3 <= 1) {
            $$2 = 1;
         }

         long $$4 = (long)($$2 * 2 + 1);
         long $$5 = $$4 * $$4;
         int $$6 = $$5 > 2147483647L ? Integer.MAX_VALUE : (int)$$5;
         int $$7 = this.t($$6);
         int $$8 = ayv.a().a($$6);

         for (int $$9 = 0; $$9 < $$6; $$9++) {
            int $$10 = ($$8 + $$7 * $$9) % $$6;
            int $$11 = $$10 % ($$2 * 2 + 1);
            int $$12 = $$10 / ($$2 * 2 + 1);
            jd $$13 = aqo.a($$0, $$1.u() + $$11 - $$2, $$1.w() + $$12 - $$2);
            if ($$13 != null) {
               this.a($$13, 0.0F, 0.0F);
               if ($$0.g(this)) {
                  break;
               }
            }
         }
      } else {
         this.a($$1, 0.0F, 0.0F);

         while (!$$0.g(this) && this.dx() < (double)($$0.am() - 1)) {
            this.a_(this.dv(), this.dx() + 1.0, this.dB());
         }
      }
   }

   private int t(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         cmb.a.parse(new Dynamic(uo.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(cB::error).ifPresent($$0x -> this.ds = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         ua $$1 = $$0.p("enteredNetherPosition");
         this.dg = new eww($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.f = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cZ.a($$0.p("recipeBook"), this.d.aJ());
      }

      if (this.fI()) {
         this.fJ();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.dl = new jd($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.dm = $$0.q("SpawnForced");
         this.dn = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.dk = dcu.g.parse(uo.a, $$0.c("SpawnDimension")).resultOrPartial(cB::error).orElse(dcu.h);
         }
      }

      this.dr = $$0.q("spawn_extra_particles_on_fall");
      ux $$2 = $$0.c("raid_omen_position");
      if ($$2 != null) {
         jd.a.parse(uo.a, $$2).resultOrPartial(cB::error).ifPresent($$0x -> this.dt = $$0x);
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      cmb.a.encodeStart(uo.a, this.ds).resultOrPartial(cB::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.f);
      if (this.dg != null) {
         ua $$1 = new ua();
         $$1.a("x", this.dg.c);
         $$1.a("y", this.dg.d);
         $$1.a("z", this.dg.e);
         $$0.a("enteredNetherPosition", $$1);
      }

      bsq $$2 = this.da();
      bsq $$3 = this.dd();
      if ($$3 != null && $$2 != this && $$2.cZ()) {
         ua $$4 = new ua();
         ua $$5 = new ua();
         $$2.e($$5);
         $$4.a("Attach", $$3.cA());
         $$4.a("Entity", $$5);
         $$0.a("RootVehicle", $$4);
      }

      $$0.a("recipeBook", this.cZ.b());
      $$0.a("Dimension", this.dQ().af().a().toString());
      if (this.dl != null) {
         $$0.a("SpawnX", this.dl.u());
         $$0.a("SpawnY", this.dl.v());
         $$0.a("SpawnZ", this.dl.w());
         $$0.a("SpawnForced", this.dm);
         $$0.a("SpawnAngle", this.dn);
         akq.a.encodeStart(uo.a, this.dk.a()).resultOrPartial(cB::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }

      $$0.a("spawn_extra_particles_on_fall", this.dr);
      if (this.dt != null) {
         jd.a.encodeStart(uo.a, this.dt).resultOrPartial(cB::error).ifPresent($$1 -> $$0.a("raid_omen_position", $$1));
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gi();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.cs = ayn.a((float)$$0 / $$1, 0.0F, $$2);
      this.cS = -1;
   }

   public void b(int $$0) {
      this.cq = $$0;
      this.cS = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cS = -1;
   }

   @Override
   public void a(cuo $$0, int $$1) {
      super.a($$0, $$1);
      this.cS = -1;
   }

   private void a(cps $$0) {
      $$0.a(this.dw);
      $$0.a(this.dv);
   }

   public void h() {
      this.a(this.cc);
   }

   @Override
   public void f_() {
      super.f_();
      this.c.b(adw.a);
   }

   @Override
   public void g_() {
      super.g_();
      this.c.b(new adv(this.eM()));
   }

   @Override
   protected void a(dta $$0) {
      an.e.a(this, $$0);
   }

   @Override
   protected cuk k() {
      return new cvp(this);
   }

   @Override
   public void l() {
      this.e.a();
      this.ds.a();
      this.cT--;
      if (this.am > 0) {
         this.am--;
      }

      this.cd.d();
      if (!this.dQ().B && !this.cd.b(this)) {
         this.s();
         this.cd = this.cc;
      }

      bsq $$0 = this.L();
      if ($$0 != this) {
         if ($$0.bE()) {
            this.a($$0.dv(), $$0.dx(), $$0.dB(), $$0.dG(), $$0.dI());
            this.A().l().a(this);
            if (this.fP()) {
               this.d(this);
            }
         } else {
            this.d(this);
         }
      }

      an.x.a(this);
      if (this.da != null) {
         an.v.a(this, this.da, this.ai - this.db);
      }

      this.o();
      this.p();
      this.gC();
      this.cH.b(this);
   }

   private void gC() {
      buq $$0 = this.f(buu.g);
      if ($$0 != null) {
         if (this.f()) {
            $$0.a(cF);
         } else {
            $$0.d(cF);
         }
      }

      buq $$1 = this.f(buu.j);
      if ($$1 != null) {
         if (this.f()) {
            $$1.a(cG);
         } else {
            $$1.d(cG);
         }
      }
   }

   public void m() {
      try {
         if (!this.N_() || !this.di()) {
            super.l();
         }

         for (int $$0 = 0; $$0 < this.fZ().b(); $$0++) {
            cuo $$1 = this.fZ().a($$0);
            if ($$1.g().ak_()) {
               zf<?> $$2 = ((csx)$$1.g()).a($$1, this.dQ(), this);
               if ($$2 != null) {
                  this.c.b($$2);
               }
            }
         }

         if (this.ex() != this.cP || this.cQ != this.ce.a() || this.ce.e() == 0.0F != this.cR) {
            this.c.b(new afd(this.ex(), this.ce.a(), this.ce.e()));
            this.cP = this.ex();
            this.cQ = this.ce.a();
            this.cR = this.ce.e() == 0.0F;
         }

         if (this.ex() + this.fp() != this.cJ) {
            this.cJ = this.ex() + this.fp();
            this.a(eyd.g, ayn.f(this.cJ));
         }

         if (this.ce.a() != this.cK) {
            this.cK = this.ce.a();
            this.a(eyd.h, ayn.f((float)this.cK));
         }

         if (this.cm() != this.cL) {
            this.cL = this.cm();
            this.a(eyd.i, ayn.f((float)this.cL));
         }

         if (this.eL() != this.cM) {
            this.cM = this.eL();
            this.a(eyd.j, ayn.f((float)this.cM));
         }

         if (this.cr != this.cO) {
            this.cO = this.cr;
            this.a(eyd.k, ayn.f((float)this.cO));
         }

         if (this.cq != this.cN) {
            this.cN = this.cq;
            this.a(eyd.l, ayn.f((float)this.cN));
         }

         if (this.cr != this.cS) {
            this.cS = this.cr;
            this.c.b(new afc(this.cs, this.cr, this.cq));
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
      if (this.ex() > 0.0F && this.df != null) {
         an.X.a(this, this.df);
      }

      this.df = null;
      super.n();
   }

   public void o() {
      if (this.ac > 0.0F && this.df == null) {
         this.df = this.do();
         if (this.cx != null && this.cx.d <= this.df.d) {
            an.ae.a(this, this.cx, this.cy);
         }
      }
   }

   public void p() {
      if (this.dd() != null && this.dd().bt()) {
         if (this.dh == null) {
            this.dh = this.do();
         } else {
            an.Y.a(this, this.dh);
         }
      }

      if (this.dh != null && (this.dd() == null || !this.dd().bt())) {
         this.dh = null;
      }
   }

   private void a(eyd $$0, int $$1) {
      this.go().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(brj $$0) {
      this.a(dxw.p);
      boolean $$1 = this.dQ().ab().b(dcq.n);
      if ($$1) {
         wy $$2 = this.eM().a();
         this.c.a(new adx(this.an(), $$2), wf.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            wy $$3x = wy.a("death.attack.message_too_long", wy.b($$2x).a(n.o));
            wy $$4x = wy.a("death.attack.even_more_magic", this.O_()).a($$1xx -> $$1xx.a(new xe(xe.a.a, $$3x)));
            return new adx(this.an(), $$4x);
         }));
         eyc $$3 = this.ck();
         if ($$3 == null || $$3.k() == eyc.b.a) {
            this.d.ah().a($$2, false);
         } else if ($$3.k() == eyc.b.c) {
            this.d.ah().a(this, $$2);
         } else if ($$3.k() == eyc.b.d) {
            this.d.ah().b(this, $$2);
         }
      } else {
         this.c.b(new adx(this.an(), wx.a));
      }

      this.gn();
      if (this.dQ().ab().b(dcq.N)) {
         this.gD();
      }

      if (!this.N_()) {
         this.a(this.A(), $$0);
      }

      this.go().a(eyd.d, this, exy::b);
      btl $$4 = this.eN();
      if ($$4 != null) {
         this.b(avy.h.b($$4.am()));
         $$4.a(this, this.bl, $$0);
         this.f($$4);
      }

      this.dQ().a(this, (byte)3);
      this.a(avy.N);
      this.a(avy.i.b(avy.m));
      this.a(avy.i.b(avy.n));
      this.aD();
      this.k(0);
      this.d(false);
      this.eM().c();
      this.a(Optional.of(jl.a(this.dQ().af(), this.dq())));
   }

   private void gD() {
      ewr $$0 = new ewr(this.dq()).c(32.0, 10.0, 32.0);
      this.dQ().a(btn.class, $$0, bsv.f).stream().filter($$0x -> $$0x instanceof btr).forEach($$0x -> ((btr)$$0x).a_((cmv)this));
   }

   @Override
   public void a(bsq $$0, int $$1, brj $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.s($$1);
         this.go().a(eyd.f, this, exy::b);
         if ($$0 instanceof cmv) {
            this.a(avy.Q);
            this.go().a(eyd.e, this, exy::b);
         } else {
            this.a(avy.O);
         }

         this.a(this, $$0, eyd.m);
         this.a($$0, this, eyd.n);
         an.c.a(this, $$0, $$2);
      }
   }

   private void a(exz $$0, exz $$1, eyd[] $$2) {
      exv $$3 = this.go().e($$1.cC());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.go().a($$2[$$4], $$0, exy::b);
         }
      }
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.d.n() && this.gE() && $$0.a(awf.m);
         if (!$$2 && this.cT > 0 && !$$0.a(awf.d)) {
            return false;
         } else {
            bsq $$3 = $$0.d();
            if ($$3 instanceof cmv $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof cnb $$5 && $$5.s() instanceof cmv $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(cmv $$0) {
      return !this.gE() ? false : super.a($$0);
   }

   private boolean gE() {
      return this.d.ad();
   }

   public epw a(boolean $$0) {
      jd $$1 = this.S();
      float $$2 = this.T();
      boolean $$3 = this.V();
      aqt $$4 = this.d.a(this.U());
      if ($$4 != null && $$1 != null) {
         Optional<aqu.a> $$5 = a($$4, $$1, $$2, $$3, $$0);
         if ($$5.isPresent()) {
            aqu.a $$6 = $$5.get();
            return new epw($$4, $$6.a(), eww.b, $$6.b(), 0.0F);
         } else {
            return epw.a(this.d.I());
         }
      } else {
         return new epw(this.d.I());
      }
   }

   private static Optional<aqu.a> a(aqt $$0, jd $$1, float $$2, boolean $$3, boolean $$4) {
      dta $$5 = $$0.a_($$1);
      dfw $$6 = $$5.b();
      if ($$6 instanceof dmf && ($$3 || $$5.c(dmf.d) > 0) && dmf.a($$0)) {
         Optional<eww> $$7 = dmf.a(bsw.by, $$0, $$1);
         if (!$$3 && !$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(dmf.d, Integer.valueOf($$5.c(dmf.d) - 1)), 3);
         }

         return $$7.map($$1x -> aqu.a.a($$1x, $$1));
      } else if ($$6 instanceof dfp && dfp.a($$0)) {
         return dfp.a(bsw.by, $$0, $$1, $$5.c(dfp.aE), $$2).map($$1x -> aqu.a.a($$1x, $$1));
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dta $$9 = $$0.a_($$1.c());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new aqu.a(new eww((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5), $$2)) : Optional.empty();
      }
   }

   public void q() {
      this.ak();
      this.A().a(this, bsq.c.e);
      if (!this.h) {
         this.h = true;
         this.c.b(new ada(ada.f, 0.0F));
         this.f = true;
      }
   }

   @Nullable
   @Override
   public bsq a(epw $$0) {
      if (this.dL()) {
         return null;
      } else {
         if ($$0.f()) {
            this.c.b(new ada(ada.b, 0.0F));
         }

         aqt $$1 = $$0.a();
         aqt $$2 = this.A();
         akp<dcu> $$3 = $$2.af();
         if ($$1.af() == $$3) {
            this.c.a($$0.b().c, $$0.b().d, $$0.b().e, $$0.d(), $$0.e());
            this.c.l();
            this.c.b(new adg(1032, jd.c, 0, false));
            return this;
         } else {
            this.cY = true;
            eqv $$4 = $$1.A_();
            this.c.b(new aeh(this.b($$1), (byte)3));
            this.c.b(new acg($$4.q(), $$4.r()));
            auq $$5 = this.d.ah();
            $$5.e(this);
            $$2.a(this, bsq.c.e);
            this.dN();
            $$2.ag().a("moving");
            if ($$3 == dcu.h && $$1.af() == dcu.i) {
               this.dg = this.do();
            }

            $$2.ag().c();
            $$2.ag().a("placing");
            this.a($$1);
            this.c.a($$0.b().c, $$0.b().d, $$0.b().e, $$0.d(), $$0.e());
            this.c.l();
            $$1.d(this);
            $$2.ag().c();
            this.d($$2);
            this.c.b(new adt(this.ga()));
            $$5.a(this, $$1);
            $$5.f(this);
            $$5.d(this);
            this.c.b(new adg(1032, jd.c, 0, false));
            this.cS = -1;
            this.cP = -1.0F;
            this.cQ = -1;
            return this;
         }
      }
   }

   private void d(aqt $$0) {
      akp<dcu> $$1 = $$0.af();
      akp<dcu> $$2 = this.dQ().af();
      an.w.a(this, $$1, $$2);
      if ($$1 == dcu.i && $$2 == dcu.h && this.dg != null) {
         an.D.a(this, this.dg);
      }

      if ($$2 != dcu.i) {
         this.dg = null;
      }
   }

   @Override
   public boolean a(aqu $$0) {
      if ($$0.N_()) {
         return this.L() == this;
      } else {
         return this.N_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bsq $$0, int $$1) {
      super.a($$0, $$1);
      this.cd.d();
   }

   @Override
   public Either<cmv.a, azr> a(jd $$0) {
      ji $$1 = this.dQ().a_($$0).c(djs.aE);
      if (this.fI() || !this.bE()) {
         return Either.left(cmv.a.e);
      } else if (!this.dQ().D_().j()) {
         return Either.left(cmv.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cmv.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cmv.a.d);
      } else {
         this.a(this.dQ().af(), $$0, this.dG(), false, true);
         if (this.dQ().R()) {
            return Either.left(cmv.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               eww $$4 = eww.c($$0);
               List<ckb> $$5 = this.dQ()
                  .a(ckb.class, new ewr($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.f(this));
               if (!$$5.isEmpty()) {
                  return Either.left(cmv.a.f);
               }
            }

            Either<cmv.a, azr> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(avy.ap);
               an.r.a(this);
            });
            if (!this.A().d()) {
               this.a(wy.c("sleep.not_possible"), true);
            }

            ((aqt)this.dQ()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(jd $$0) {
      this.a(avy.i.b(avy.n));
      super.b($$0);
   }

   private boolean a(jd $$0, ji $$1) {
      return this.h($$0) || this.h($$0.a($$1.g()));
   }

   private boolean h(jd $$0) {
      eww $$1 = eww.c($$0);
      return Math.abs(this.dv() - $$1.a()) <= 3.0 && Math.abs(this.dx() - $$1.b()) <= 2.0 && Math.abs(this.dB() - $$1.c()) <= 3.0;
   }

   private boolean b(jd $$0, ji $$1) {
      jd $$2 = $$0.c();
      return !this.g($$2) || !this.g($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fI()) {
         this.A().l().a(this, new abw(this, 2));
      }

      super.a($$0, $$1);
      if (this.c != null) {
         this.c.a(this.dv(), this.dx(), this.dB(), this.dG(), this.dI());
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.bJ();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public boolean b(brj $$0) {
      return super.b($$0) || this.P();
   }

   @Override
   protected void a(double $$0, boolean $$1, dta $$2, jd $$3) {
   }

   @Override
   protected void a(aqt $$0, jd $$1) {
      if (!this.N_()) {
         super.a($$0, $$1);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.di()) {
         this.b($$3, new eww($$0, $$1, $$2));
         jd $$4 = this.aK();
         dta $$5 = this.dQ().a_($$4);
         if (this.dr && $$3 && this.ac > 0.0F) {
            eww $$6 = $$4.b().b(0.0, 0.5, 0.0);
            int $$7 = (int)ayn.a(50.0F * this.ac, 0.0F, 200.0F);
            this.A().a(new le(lm.b, $$5), $$6.c, $$6.d, $$6.e, $$7, 0.3F, 0.3F, 0.3F, 0.15F);
            this.dr = false;
         }

         super.a($$1, $$3, $$5, $$4);
      }
   }

   @Override
   public void a(@Nullable bsq $$0) {
      super.a($$0);
      this.cx = this.do();
      this.cy = $$0;
      this.cz = $$0 != null && $$0.am() == bsw.bn;
   }

   @Override
   protected void r() {
      if (this.dQ().s().i()) {
         super.r();
      }
   }

   @Override
   public void a(drq $$0, boolean $$1) {
      this.c.b(new acc(this.dQ(), $$0.az_()));
      this.c.b(new adr($$0.az_(), $$1));
   }

   private void gF() {
      this.dy = this.dy % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bqu $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.cd != this.cc) {
            this.s();
         }

         this.gF();
         cps $$1 = $$0.createMenu(this.dy, this.fZ(), this);
         if ($$1 == null) {
            if (this.N_()) {
               this.a(wy.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.c.b(new adq($$1.j, $$1.a(), $$0.O_()));
            this.a($$1);
            this.cd = $$1;
            return OptionalInt.of(this.dy);
         }
      }
   }

   @Override
   public void a(int $$0, dbt $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.c.b(new adm($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(chg $$0, bqj $$1) {
      if (this.cd != this.cc) {
         this.s();
      }

      this.gF();
      this.c.b(new adb(this.dy, $$1.b(), $$0.an()));
      this.cd = new cqt(this.dy, this.fZ(), $$1, $$0);
      this.a(this.cd);
   }

   @Override
   public void a(cuo $$0, bqp $$1) {
      if ($$0.a(cur.ua)) {
         if (cwp.a($$0, this.dh(), this)) {
            this.cd.d();
         }

         this.c.b(new adp($$1));
      }
   }

   @Override
   public void a(dqp $$0) {
      this.c.b(aca.a($$0, dqf::e));
   }

   @Override
   public void s() {
      this.c.b(new acn(this.cd.j));
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
         this.h($$3);
      }
   }

   @Override
   public void a(eww $$0) {
      double $$1 = this.dv();
      double $$2 = this.dx();
      double $$3 = this.dB();
      super.a($$0);
      this.b(this.dv() - $$1, this.dx() - $$2, this.dB() - $$3);
   }

   @Override
   public void u() {
      double $$0 = this.dv();
      double $$1 = this.dx();
      double $$2 = this.dB();
      super.u();
      this.q(this.dv() - $$0, this.dx() - $$1, this.dB() - $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (!this.bS() && !r($$0, $$1, $$2)) {
         if (this.cd()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(avy.C, $$3);
               this.D(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(awj.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(avy.w, $$4);
               this.D(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.bf()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(avy.s, $$5);
               this.D(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.p_()) {
            if ($$1 > 0.0) {
               this.a(avy.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aF()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.cc()) {
                  this.a(avy.r, $$6);
                  this.D(0.1F * (float)$$6 * 0.01F);
               } else if (this.cb()) {
                  this.a(avy.q, $$6);
                  this.D(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(avy.p, $$6);
                  this.D(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fB()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(avy.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(avy.v, $$8);
            }
         }
      }
   }

   private void q(double $$0, double $$1, double $$2) {
      if (this.bS() && !r($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         bsq $$4 = this.dd();
         if ($$4 instanceof cor) {
            this.a(avy.x, $$3);
         } else if ($$4 instanceof cot) {
            this.a(avy.y, $$3);
         } else if ($$4 instanceof cft) {
            this.a(avy.z, $$3);
         } else if ($$4 instanceof chg) {
            this.a(avy.A, $$3);
         } else if ($$4 instanceof cko) {
            this.a(avy.D, $$3);
         }
      }
   }

   private static boolean r(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(avv<?> $$0, int $$1) {
      this.cI.b(this, $$0, $$1);
      this.go().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(avv<?> $$0) {
      this.cI.a(this, $$0, 0);
      this.go().a($$0, this, exy::c);
   }

   @Override
   public int a(Collection<cyz<?>> $$0) {
      return this.cZ.a($$0, this);
   }

   @Override
   public void a(cyz<?> $$0, List<cuo> $$1) {
      an.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<akq> $$0) {
      List<cyz<?>> $$1 = $$0.stream().flatMap($$0x -> this.d.aJ().a($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<cyz<?>> $$0) {
      return this.cZ.b($$0, this);
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cS = -1;
   }

   @Override
   public void v() {
      this.dc = true;
      this.bI();
      if (this.fI()) {
         this.a(true, false);
      }
   }

   @Override
   public boolean w() {
      return this.dc;
   }

   @Override
   public void x() {
      this.cP = -1.0E8F;
   }

   @Override
   public void a(wy $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void y() {
      if (!this.bz.e() && this.fs()) {
         this.c.b(new acx(this, (byte)9));
         super.y();
      }
   }

   @Override
   public void a(ff.a $$0, eww $$1) {
      super.a($$0, $$1);
      this.c.b(new aea($$0, $$1.c, $$1.d, $$1.e));
   }

   public void a(ff.a $$0, bsq $$1, ff.a $$2) {
      eww $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.c.b(new aea($$0, $$1, $$2));
   }

   public void a(aqu $$0, boolean $$1) {
      this.ds = $$0.ds;
      this.dx = $$0.dx;
      this.e.a($$0.e.b(), $$0.e.c());
      this.z();
      this.eT().b($$0.eT());
      this.u(this.eO());
      if ($$1) {
         this.fZ().a($$0.fZ());
         this.u($$0.ex());
         this.ce = $$0.ce;

         for (bry $$2 : $$0.eu()) {
            this.b(new bry($$2));
         }

         this.cq = $$0.cq;
         this.cr = $$0.cr;
         this.cs = $$0.cs;
         this.r($$0.fT());
         this.aw = $$0.aw;
      } else if (this.dQ().ab().b(dcq.d) || $$0.N_()) {
         this.fZ().a($$0.fZ());
         this.cq = $$0.cq;
         this.cr = $$0.cr;
         this.cs = $$0.cs;
         this.r($$0.fT());
      }

      this.ct = $$0.ct;
      this.cb = $$0.cb;
      this.ar().a(bX, $$0.ar().a(bX));
      this.cS = -1;
      this.cP = -1.0F;
      this.cQ = -1;
      this.cZ.a($$0.cZ);
      this.f = $$0.f;
      this.dg = $$0.dg;
      this.dj = $$0.dj;
      this.i($$0.gq());
      this.j($$0.gr());
      this.a($$0.gy());
   }

   @Override
   protected void a(bry $$0, @Nullable bsq $$1) {
      super.a($$0, $$1);
      this.c.b(new aga(this.an(), $$0, true));
      if ($$0.a(bsa.y)) {
         this.db = this.ai;
         this.da = this.do();
      }

      an.B.a(this, $$1);
   }

   @Override
   protected void a(bry $$0, boolean $$1, @Nullable bsq $$2) {
      super.a($$0, $$1, $$2);
      this.c.b(new aga(this.an(), $$0, false));
      an.B.a(this, $$2);
   }

   @Override
   protected void a(bry $$0) {
      super.a($$0);
      this.c.b(new aef(this.an(), $$0.c()));
      if ($$0.a(bsa.y)) {
         this.da = null;
      }

      an.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.c.a($$0, $$1, $$2, this.dG(), this.dI(), bua.g);
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.c.a(this.dv() + $$0, this.dx() + $$1, this.dB() + $$2, this.dG(), this.dI(), bua.f);
   }

   @Override
   public boolean a(aqt $$0, double $$1, double $$2, double $$3, Set<bua> $$4, float $$5, float $$6) {
      dcb $$7 = new dcb(jd.a($$1, $$2, $$3));
      $$0.l().a(aqy.f, $$7, 1, this.an());
      this.ad();
      if (this.fI()) {
         this.a(true, true);
      }

      if ($$0 == this.dQ()) {
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
   public void b(bsq $$0) {
      this.A().l().a(this, new abw($$0, 4));
   }

   @Override
   public void c(bsq $$0) {
      this.A().l().a(this, new abw($$0, 5));
   }

   @Override
   public void z() {
      if (this.c != null) {
         this.c.b(new adt(this.ga()));
         this.K();
      }
   }

   public aqt A() {
      return (aqt)this.dQ();
   }

   public boolean a(dcr $$0) {
      boolean $$1 = this.N_();
      if (!this.e.a($$0)) {
         return false;
      } else {
         this.c.b(new ada(ada.e, (float)$$0.a()));
         if ($$0 == dcr.d) {
            this.gn();
            this.ad();
            dac.a(this);
         } else {
            this.d(this);
            if ($$1) {
               dac.a(this.A(), this);
            }
         }

         this.z();
         this.fq();
         return true;
      }
   }

   @Override
   public boolean N_() {
      return this.e.b() == dcr.d;
   }

   @Override
   public boolean f() {
      return this.e.b() == dcr.b;
   }

   @Override
   public void a(wy $$0) {
      this.b($$0, false);
   }

   public void b(wy $$0, boolean $$1) {
      if (this.w($$1)) {
         this.c.a(new afr($$0, $$1), wf.a(() -> {
            if (this.w(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               wy $$3 = wy.b($$2).a(n.o);
               return new afr(wy.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(xn $$0, boolean $$1, wu.a $$2) {
      if (this.gG()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String B() {
      return this.c.m() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(aqg $$0) {
      this.de = $$0.b();
      this.dd = $$0.c();
      this.cU = $$0.d();
      this.cV = $$0.e();
      this.dp = $$0.h();
      this.dq = $$0.i();
      this.ar().a(bX, (byte)$$0.f());
      this.ar().a(bY, (byte)$$0.g().a());
   }

   public aqg C() {
      int $$0 = this.ar().a(bX);
      btf $$1 = btf.d.apply(this.ar().a(bY));
      return new aqg(this.de, this.dd, this.cU, this.cV, $$0, $$1, this.dp, this.dq);
   }

   public boolean D() {
      return this.cV;
   }

   public cmt E() {
      return this.cU;
   }

   private boolean w(boolean $$0) {
      return this.cU == cmt.c ? $$0 : true;
   }

   private boolean gG() {
      return this.cU == cmt.a;
   }

   public int F() {
      return this.dd;
   }

   public void a(ajp $$0) {
      this.c.b(new ael($$0.a(), $$0.d().map(ajp.a::a)));
   }

   @Override
   protected int G() {
      return this.d.c(this.fY());
   }

   @Override
   public void H() {
      this.cW = ad.c();
   }

   public avu I() {
      return this.cI;
   }

   public avt J() {
      return this.cZ;
   }

   @Override
   protected void K() {
      if (this.N_()) {
         this.es();
         this.l(true);
      } else {
         super.K();
      }
   }

   public bsq L() {
      return (bsq)(this.cX == null ? this : this.cX);
   }

   @Override
   public void d(@Nullable bsq $$0) {
      bsq $$1 = this.L();
      this.cX = (bsq)($$0 == null ? this : $$0);
      if ($$1 != this.cX) {
         if (this.cX.dQ() instanceof aqt $$2) {
            this.a($$2, this.cX.dv(), this.cX.dx(), this.cX.dB(), Set.of(), this.dG(), this.dI());
         }

         if ($$0 != null) {
            this.A().l().a(this);
         }

         this.c.b(new aes(this.cX));
         this.c.l();
      }
   }

   @Override
   protected void M() {
      if (!this.cY) {
         super.M();
      }
   }

   @Override
   public void e(bsq $$0) {
      if (this.e.b() == dcr.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long N() {
      return this.cW;
   }

   @Nullable
   public wy O() {
      return null;
   }

   @Override
   public void a(bqp $$0) {
      super.a($$0);
      this.gt();
   }

   public boolean P() {
      return this.cY;
   }

   public void Q() {
      this.cY = false;
   }

   public aky R() {
      return this.cH;
   }

   public void a(aqt $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      this.d(this);
      this.ad();
      if ($$0 == this.dQ()) {
         this.c.a($$1, $$2, $$3, $$4, $$5);
      } else {
         this.a(new epw($$0, new eww($$1, $$2, $$3), eww.b, $$4, $$5));
      }
   }

   @Nullable
   public jd S() {
      return this.dl;
   }

   public float T() {
      return this.dn;
   }

   public akp<dcu> U() {
      return this.dk;
   }

   public boolean V() {
      return this.dm;
   }

   public void b(aqu $$0) {
      this.a($$0.U(), $$0.S(), $$0.T(), $$0.V(), false);
   }

   public void a(akp<dcu> $$0, @Nullable jd $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.dl) && $$0.equals(this.dk);
         if ($$4 && !$$5) {
            this.a(wy.c("block.minecraft.set_spawn"));
         }

         this.dl = $$1;
         this.dk = $$0;
         this.dn = $$2;
         this.dm = $$3;
      } else {
         this.dl = null;
         this.dk = dcu.h;
         this.dn = 0.0F;
         this.dm = false;
      }
   }

   public kf W() {
      return this.di;
   }

   public void a(kf $$0) {
      this.di = $$0;
   }

   public aqf X() {
      return this.dj;
   }

   public void a(aqf $$0) {
      this.dj = $$0;
   }

   @Override
   public void a(avn $$0, avp $$1, float $$2, float $$3) {
      this.c.b(new afo(lt.b.e($$0), $$1, this.dv(), this.dx(), this.dB(), $$2, $$3, this.ah.g()));
   }

   @Override
   public cjf a(cuo $$0, boolean $$1, boolean $$2) {
      cjf $$3 = super.a($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dQ().b($$3);
         cuo $$4 = $$3.p();
         if ($$2) {
            if (!$$4.e()) {
               this.a(avy.f.b($$4.g()), $$0.H());
            }

            this.a(avy.F);
         }

         return $$3;
      }
   }

   public ary Y() {
      return this.do;
   }

   public void a(aqt $$0) {
      this.a((dcu)$$0);
      this.e.a($$0);
   }

   @Nullable
   private static dcr a(@Nullable ua $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? dcr.a($$0.h($$1)) : null;
   }

   private dcr b(@Nullable dcr $$0) {
      dcr $$1 = this.d.bf();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.d.u_();
      }
   }

   @Override
   public void c(@Nullable ua $$0) {
      this.e.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void k(ua $$0) {
      $$0.a("playerGameType", this.e.b().a());
      dcr $$1 = this.e.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean Z() {
      return this.dp;
   }

   public boolean c(aqu $$0) {
      return $$0 == this ? false : this.dp || $$0.dp;
   }

   @Override
   public boolean a(dcu $$0, jd $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cuo $$0) {
      an.W.a(this, $$0);
      super.a($$0);
   }

   public boolean b(boolean $$0) {
      cmu $$1 = this.fZ();
      cuo $$2 = $$1.a($$0);
      this.cd.b($$1, $$1.k).ifPresent($$1x -> this.cd.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean aa() {
      return this.dq;
   }

   @Override
   public Optional<cmb> ab() {
      return Optional.of(this.ds);
   }

   public void c(boolean $$0) {
      this.dr = $$0;
   }

   @Override
   public void a(cjf $$0) {
      super.a($$0);
      bsq $$1 = $$0.s();
      if ($$1 != null) {
         an.S.a(this, $$0.p(), $$1);
      }
   }

   public void a(xp $$0) {
      this.dx = $$0;
   }

   @Nullable
   public xp ac() {
      return this.dx != null && this.dx.b() ? null : this.dx;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cw = (float)(ayn.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dG());
      this.c.b(new adc(this));
   }

   @Override
   public boolean a(bsq $$0, boolean $$1) {
      if (super.a($$0, $$1)) {
         $$0.j(this);
         this.c.a(this.dv(), this.dx(), this.dB(), this.dG(), this.dI());
         if ($$0 instanceof btl $$2) {
            this.d.ah().a($$2, this.c);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void ad() {
      bsq $$0 = this.dd();
      super.ad();
      if ($$0 instanceof btl $$1) {
         for (bry $$2 : $$1.eu()) {
            this.c.b(new aef($$0.an(), $$2.c()));
         }
      }
   }

   public agc b(aqt $$0) {
      return new agc($$0.ae(), $$0.af(), ddw.a($$0.C()), this.e.b(), this.e.c(), $$0.ai(), $$0.B(), this.gy(), this.az());
   }

   @Override
   public void c(jd $$0) {
      this.dt = $$0;
   }

   public void ae() {
      this.dt = null;
   }

   @Nullable
   public jd af() {
      return this.dt;
   }

   @Override
   public eww ag() {
      return this.du;
   }

   @Override
   public void b(eww $$0) {
      this.du = $$0;
   }

   @Override
   protected float a(bsq $$0, float $$1, brj $$2) {
      return dac.a(this.A(), this.eU(), $$0, $$2, $$1);
   }

   @Override
   public void a(cuj $$0, bsx $$1) {
      super.a($$0, $$1);
      this.b(avy.d.b($$0));
   }

   static record a(eww a, float b) {
      public static aqu.a a(eww $$0, jd $$1) {
         return new aqu.a($$0, b($$0, $$1));
      }

      private static float b(eww $$0, jd $$1) {
         eww $$2 = eww.c($$1).d($$0).d();
         return (float)ayn.d(ayn.d($$2.e, $$2.c) * 180.0F / (float)Math.PI - 90.0);
      }
   }
}
