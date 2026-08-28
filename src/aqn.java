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

public class aqn extends cml {
   private static final Logger cC = LogUtils.getLogger();
   private static final int cD = 32;
   private static final int cE = 10;
   private static final int cF = 25;
   public static final double b = 1.0;
   private static final bui cG = new bui(UUID.fromString("736565d2-e1a7-403d-a3f8-1aeb3e302542"), "Creative block interaction range modifier", 0.5, bui.a.a);
   private static final bui cH = new bui(UUID.fromString("98491ef6-97b1-4584-ae82-71a8cc85cf73"), "Creative entity interaction range modifier", 2.0, bui.a.a);
   public arm c;
   public final MinecraftServer d;
   public final aqo e;
   private final aks cI;
   private final avn cJ;
   private float cK = Float.MIN_VALUE;
   private int cL = Integer.MIN_VALUE;
   private int cM = Integer.MIN_VALUE;
   private int cN = Integer.MIN_VALUE;
   private int cO = Integer.MIN_VALUE;
   private int cP = Integer.MIN_VALUE;
   private float cQ = -1.0E8F;
   private int cR = -99999999;
   private boolean cS = true;
   private int cT = -99999999;
   private int cU = 60;
   private cmj cV = cmj.a;
   private boolean cW = true;
   private long cX = ac.c();
   @Nullable
   private bsh cY;
   private boolean cZ;
   public boolean f;
   private final avm da = new avm();
   @Nullable
   private ewh db;
   private int dc;
   private boolean dd;
   private int de = 2;
   private String df = "en_us";
   @Nullable
   private ewh dg;
   @Nullable
   private ewh dh;
   @Nullable
   private ewh di;
   private kc dj = kc.a(0, 0, 0);
   private apy dk = apy.a;
   private akj<dcg> dl = dcg.h;
   @Nullable
   private ja dm;
   private boolean dn;
   private float do;
   private final arr dp;
   private boolean dq;
   private boolean dr;
   private boolean ds;
   private clr dt = new clr(0, 0, 0);
   @Nullable
   private ja du;
   private ewh dv = ewh.b;
   private final cpw dw = new cpw() {
      @Override
      public void a(cpi $$0, js<cud> $$1, cud $$2, int[] $$3) {
         aqn.this.c.b(new aci($$0.j, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cpi $$0, int $$1, cud $$2) {
         aqn.this.c.b(new ack($$0.j, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cpi $$0, cud $$1) {
         aqn.this.c.b(new ack(-1, $$0.k(), -1, $$1));
      }

      @Override
      public void a(cpi $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cpi $$0, int $$1, int $$2) {
         aqn.this.c.b(new acj($$0.j, $$1, $$2));
      }
   };
   private final cpv dx = new cpv() {
      @Override
      public void a(cpi $$0, int $$1, cud $$2) {
         cre $$3 = $$0.b($$1);
         if (!($$3 instanceof cra)) {
            if ($$3.c == aqn.this.ga()) {
               am.f.a(aqn.this, aqn.this.ga(), $$2);
            }
         }
      }

      @Override
      public void a(cpi $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private xl dy;
   @Nullable
   public final Object g;
   private int dz;
   public boolean h;

   public aqn(MinecraftServer $$0, aqm $$1, GameProfile $$2, apz $$3) {
      super($$1, $$1.V(), $$1.W(), $$2);
      this.dp = $$0.a(this);
      this.e = $$0.b(this);
      this.d = $$0;
      this.cJ = $$0.ai().a((cml)this);
      this.cI = $$0.ai().g(this);
      this.d($$1);
      this.a($$3);
      this.g = null;
   }

   private void d(aqm $$0) {
      ja $$1 = $$0.V();
      if ($$0.D_().g() && $$0.o().bc().k() != dcd.c) {
         int $$2 = Math.max(0, this.d.a($$0));
         int $$3 = ayg.a($$0.C_().b((double)$$1.u(), (double)$$1.w()));
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
         int $$8 = ayo.a().a($$6);

         for (int $$9 = 0; $$9 < $$6; $$9++) {
            int $$10 = ($$8 + $$7 * $$9) % $$6;
            int $$11 = $$10 % ($$2 * 2 + 1);
            int $$12 = $$10 / ($$2 * 2 + 1);
            ja $$13 = aqh.a($$0, $$1.u() + $$11 - $$2, $$1.w() + $$12 - $$2);
            if ($$13 != null) {
               this.a($$13, 0.0F, 0.0F);
               if ($$0.g(this)) {
                  break;
               }
            }
         }
      } else {
         this.a($$1, 0.0F, 0.0F);

         while (!$$0.g(this) && this.dy() < (double)($$0.am() - 1)) {
            this.a_(this.dw(), this.dy() + 1.0, this.dC());
         }
      }
   }

   private int t(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         clr.a.parse(new Dynamic(ul.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(cC::error).ifPresent($$0x -> this.dt = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         tx $$1 = $$0.p("enteredNetherPosition");
         this.dh = new ewh($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.f = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.da.a($$0.p("recipeBook"), this.d.aK());
      }

      if (this.fJ()) {
         this.fK();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.dm = new ja($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.dn = $$0.q("SpawnForced");
         this.do = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.dl = dcg.g.parse(ul.a, $$0.c("SpawnDimension")).resultOrPartial(cC::error).orElse(dcg.h);
         }
      }

      this.ds = $$0.q("spawn_extra_particles_on_fall");
      uu $$2 = $$0.c("raid_omen_position");
      if ($$2 != null) {
         ja.a.parse(ul.a, $$2).resultOrPartial(cC::error).ifPresent($$0x -> this.du = $$0x);
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      clr.a.encodeStart(ul.a, this.dt).resultOrPartial(cC::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.f);
      if (this.dh != null) {
         tx $$1 = new tx();
         $$1.a("x", this.dh.c);
         $$1.a("y", this.dh.d);
         $$1.a("z", this.dh.e);
         $$0.a("enteredNetherPosition", $$1);
      }

      bsh $$2 = this.db();
      bsh $$3 = this.de();
      if ($$3 != null && $$2 != this && $$2.da()) {
         tx $$4 = new tx();
         tx $$5 = new tx();
         $$2.e($$5);
         $$4.a("Attach", $$3.cB());
         $$4.a("Entity", $$5);
         $$0.a("RootVehicle", $$4);
      }

      $$0.a("recipeBook", this.da.b());
      $$0.a("Dimension", this.dR().af().a().toString());
      if (this.dm != null) {
         $$0.a("SpawnX", this.dm.u());
         $$0.a("SpawnY", this.dm.v());
         $$0.a("SpawnZ", this.dm.w());
         $$0.a("SpawnForced", this.dn);
         $$0.a("SpawnAngle", this.do);
         akk.a.encodeStart(ul.a, this.dl.a()).resultOrPartial(cC::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }

      $$0.a("spawn_extra_particles_on_fall", this.ds);
      if (this.du != null) {
         ja.a.encodeStart(ul.a, this.du).resultOrPartial(cC::error).ifPresent($$1 -> $$0.a("raid_omen_position", $$1));
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gj();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.ct = ayg.a((float)$$0 / $$1, 0.0F, $$2);
      this.cT = -1;
   }

   public void b(int $$0) {
      this.cr = $$0;
      this.cT = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cT = -1;
   }

   @Override
   public void a(cud $$0, int $$1) {
      super.a($$0, $$1);
      this.cT = -1;
   }

   private void a(cpi $$0) {
      $$0.a(this.dx);
      $$0.a(this.dw);
   }

   public void h() {
      this.a(this.cd);
   }

   @Override
   public void f_() {
      super.f_();
      this.c.b(adq.a);
   }

   @Override
   public void g_() {
      super.g_();
      this.c.b(new adp(this.eN()));
   }

   @Override
   protected void a(dsl $$0) {
      am.e.a(this, $$0);
   }

   @Override
   protected ctz k() {
      return new cvb(this);
   }

   @Override
   public void l() {
      this.e.a();
      this.dt.a();
      this.cU--;
      if (this.am > 0) {
         this.am--;
      }

      this.ce.d();
      if (!this.dR().B && !this.ce.b(this)) {
         this.s();
         this.ce = this.cd;
      }

      bsh $$0 = this.L();
      if ($$0 != this) {
         if ($$0.bF()) {
            this.a($$0.dw(), $$0.dy(), $$0.dC(), $$0.dH(), $$0.dJ());
            this.A().l().a(this);
            if (this.fQ()) {
               this.d(this);
            }
         } else {
            this.d(this);
         }
      }

      am.x.a(this);
      if (this.db != null) {
         am.v.a(this, this.db, this.ai - this.dc);
      }

      this.o();
      this.p();
      this.gD();
      this.cI.b(this);
   }

   private void gD() {
      bug $$0 = this.f(buk.g);
      if ($$0 != null) {
         if (this.f()) {
            $$0.b(cG);
         } else {
            $$0.e(cG);
         }
      }

      bug $$1 = this.f(buk.j);
      if ($$1 != null) {
         if (this.f()) {
            $$1.b(cH);
         } else {
            $$1.e(cH);
         }
      }
   }

   public void m() {
      try {
         if (!this.N_() || !this.dj()) {
            super.l();
         }

         for (int $$0 = 0; $$0 < this.ga().b(); $$0++) {
            cud $$1 = this.ga().a($$0);
            if ($$1.g().ak_()) {
               zb<?> $$2 = ((csn)$$1.g()).a($$1, this.dR(), this);
               if ($$2 != null) {
                  this.c.b($$2);
               }
            }
         }

         if (this.ey() != this.cQ || this.cR != this.cf.a() || this.cf.e() == 0.0F != this.cS) {
            this.c.b(new aex(this.ey(), this.cf.a(), this.cf.e()));
            this.cQ = this.ey();
            this.cR = this.cf.a();
            this.cS = this.cf.e() == 0.0F;
         }

         if (this.ey() + this.fq() != this.cK) {
            this.cK = this.ey() + this.fq();
            this.a(exo.g, ayg.f(this.cK));
         }

         if (this.cf.a() != this.cL) {
            this.cL = this.cf.a();
            this.a(exo.h, ayg.f((float)this.cL));
         }

         if (this.cn() != this.cM) {
            this.cM = this.cn();
            this.a(exo.i, ayg.f((float)this.cM));
         }

         if (this.eM() != this.cN) {
            this.cN = this.eM();
            this.a(exo.j, ayg.f((float)this.cN));
         }

         if (this.cs != this.cP) {
            this.cP = this.cs;
            this.a(exo.k, ayg.f((float)this.cP));
         }

         if (this.cr != this.cO) {
            this.cO = this.cr;
            this.a(exo.l, ayg.f((float)this.cO));
         }

         if (this.cs != this.cT) {
            this.cT = this.cs;
            this.c.b(new aew(this.ct, this.cs, this.cr));
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
      if (this.ey() > 0.0F && this.dg != null) {
         am.X.a(this, this.dg);
      }

      this.dg = null;
      super.n();
   }

   public void o() {
      if (this.ac > 0.0F && this.dg == null) {
         this.dg = this.dp();
         if (this.cy != null && this.cy.d <= this.dg.d) {
            am.ae.a(this, this.cy, this.cz);
         }
      }
   }

   public void p() {
      if (this.de() != null && this.de().bu()) {
         if (this.di == null) {
            this.di = this.dp();
         } else {
            am.Y.a(this, this.di);
         }
      }

      if (this.di != null && (this.de() == null || !this.de().bu())) {
         this.di = null;
      }
   }

   private void a(exo $$0, int $$1) {
      this.gp().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(bra $$0) {
      this.a(dxh.p);
      boolean $$1 = this.dR().ab().b(dcc.n);
      if ($$1) {
         wu $$2 = this.eN().a();
         this.c.a(new adr(this.an(), $$2), wb.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            wu $$3x = wu.a("death.attack.message_too_long", wu.b($$2x).a(n.o));
            wu $$4x = wu.a("death.attack.even_more_magic", this.O_()).a($$1xx -> $$1xx.a(new xa(xa.a.a, $$3x)));
            return new adr(this.an(), $$4x);
         }));
         exn $$3 = this.cl();
         if ($$3 == null || $$3.k() == exn.b.a) {
            this.d.ai().a($$2, false);
         } else if ($$3.k() == exn.b.c) {
            this.d.ai().a(this, $$2);
         } else if ($$3.k() == exn.b.d) {
            this.d.ai().b(this, $$2);
         }
      } else {
         this.c.b(new adr(this.an(), wt.a));
      }

      this.go();
      if (this.dR().ab().b(dcc.N)) {
         this.gE();
      }

      if (!this.N_()) {
         this.a(this.A(), $$0);
      }

      this.gp().a(exo.d, this, exj::b);
      btc $$4 = this.eO();
      if ($$4 != null) {
         this.b(avr.h.b($$4.am()));
         $$4.a(this, this.bm, $$0);
         this.f($$4);
      }

      this.dR().a(this, (byte)3);
      this.a(avr.N);
      this.a(avr.i.b(avr.m));
      this.a(avr.i.b(avr.n));
      this.aE();
      this.k(0);
      this.d(false);
      this.eN().c();
      this.a(Optional.of(ji.a(this.dR().af(), this.dr())));
   }

   private void gE() {
      ewc $$0 = new ewc(this.dr()).c(32.0, 10.0, 32.0);
      this.dR().a(bte.class, $$0, bsm.f).stream().filter($$0x -> $$0x instanceof bti).forEach($$0x -> ((bti)$$0x).a_((cml)this));
   }

   @Override
   public void a(bsh $$0, int $$1, bra $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.s($$1);
         this.gp().a(exo.f, this, exj::b);
         if ($$0 instanceof cml) {
            this.a(avr.Q);
            this.gp().a(exo.e, this, exj::b);
         } else {
            this.a(avr.O);
         }

         this.a(this, $$0, exo.m);
         this.a($$0, this, exo.n);
         am.c.a(this, $$0, $$2);
      }
   }

   private void a(exk $$0, exk $$1, exo[] $$2) {
      exg $$3 = this.gp().e($$1.cD());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gp().a($$2[$$4], $$0, exj::b);
         }
      }
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.d.n() && this.gF() && $$0.a(avy.n);
         if (!$$2 && this.cU > 0 && !$$0.a(avy.e)) {
            return false;
         } else {
            bsh $$3 = $$0.d();
            if ($$3 instanceof cml $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof cmr $$5 && $$5.s() instanceof cml $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(cml $$0) {
      return !this.gF() ? false : super.a($$0);
   }

   private boolean gF() {
      return this.d.ae();
   }

   public eph a(boolean $$0) {
      ja $$1 = this.S();
      float $$2 = this.T();
      boolean $$3 = this.V();
      aqm $$4 = this.d.a(this.U());
      if ($$4 != null && $$1 != null) {
         Optional<aqn.a> $$5 = a($$4, $$1, $$2, $$3, $$0);
         if ($$5.isPresent()) {
            aqn.a $$6 = $$5.get();
            return new eph($$4, $$6.a(), ewh.b, $$6.b(), 0.0F);
         } else {
            return eph.a(this.d.J());
         }
      } else {
         return new eph(this.d.J());
      }
   }

   private static Optional<aqn.a> a(aqm $$0, ja $$1, float $$2, boolean $$3, boolean $$4) {
      dsl $$5 = $$0.a_($$1);
      dfi $$6 = $$5.b();
      if ($$6 instanceof dlq && ($$3 || $$5.c(dlq.d) > 0) && dlq.a($$0)) {
         Optional<ewh> $$7 = dlq.a(bsn.by, $$0, $$1);
         if (!$$3 && !$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(dlq.d, Integer.valueOf($$5.c(dlq.d) - 1)), 3);
         }

         return $$7.map($$1x -> aqn.a.a($$1x, $$1));
      } else if ($$6 instanceof dfb && dfb.a($$0)) {
         return dfb.a(bsn.by, $$0, $$1, $$5.c(dfb.aE), $$2).map($$1x -> aqn.a.a($$1x, $$1));
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dsl $$9 = $$0.a_($$1.c());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new aqn.a(new ewh((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5), $$2)) : Optional.empty();
      }
   }

   @Nullable
   @Override
   public eph a(aqm $$0) {
      eph $$1 = super.a($$0);
      if ($$1 != null && this.dR().af() == dcg.h && $$1.a().af() == dcg.j) {
         ewh $$2 = $$1.b().b(0.0, -1.0, 0.0);
         this.b($$1.a(), ja.a($$2));
         return new eph($$1.a(), $$2, ewh.b, 90.0F, 0.0F);
      } else {
         return this.dR().af() == dcg.j && $$1.a().af() == dcg.h ? this.a(false) : $$1;
      }
   }

   public void q() {
      this.ak();
      this.A().a(this, bsh.d.e);
      if (!this.h) {
         this.h = true;
         this.c.b(new acu(acu.f, 0.0F));
         this.f = true;
      }
   }

   @Nullable
   @Override
   public bsh a(bsh.a $$0) {
      eph $$1 = $$0.get();
      if ($$1 == null) {
         return this;
      } else {
         if ($$1.f()) {
            this.c.b(new acu(acu.b, 0.0F));
         }

         aqm $$2 = $$1.a();
         this.cZ = true;
         aqm $$3 = this.A();
         akj<dcg> $$4 = $$3.af();
         eqg $$5 = $$2.A_();
         this.c.b(new aeb(this.c($$2), (byte)3));
         this.c.b(new aca($$5.q(), $$5.r()));
         auj $$6 = this.d.ai();
         $$6.e(this);
         $$3.a(this, bsh.d.e);
         this.dO();
         $$3.ag().a("moving");
         if ($$4 == dcg.h && $$2.af() == dcg.i) {
            this.dh = this.dp();
         }

         $$3.ag().c();
         $$3.ag().a("placing");
         this.b($$2);
         this.c.a($$1.b().c, $$1.b().d, $$1.b().e, $$1.d(), $$1.e());
         this.c.l();
         $$2.d(this);
         $$3.ag().c();
         this.e($$3);
         this.c.b(new adn(this.gb()));
         $$6.a(this, $$2);
         $$6.f(this);
         $$6.d(this);
         this.c.b(new ada(1032, ja.c, 0, false));
         this.cT = -1;
         this.cQ = -1.0F;
         this.cR = -1;
         return this;
      }
   }

   private void b(aqm $$0, ja $$1) {
      ja.a $$2 = $$1.j();

      for (int $$3 = -2; $$3 <= 2; $$3++) {
         for (int $$4 = -2; $$4 <= 2; $$4++) {
            for (int $$5 = -1; $$5 < 3; $$5++) {
               dsl $$6 = $$5 == -1 ? dfk.co.o() : dfk.a.o();
               $$0.b($$2.g($$1).e($$4, $$5, $$3), $$6);
            }
         }
      }
   }

   @Override
   protected Optional<l.a> a(aqm $$0, ja $$1, boolean $$2, duc $$3) {
      Optional<l.a> $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         jf.a $$5 = this.dR().a_(this.ay).d(dkm.b).orElse(jf.a.a);
         Optional<l.a> $$6 = $$0.p().a($$1, $$5);
         if ($$6.isEmpty()) {
            cC.error("Unable to create a portal, likely target out of worldborder");
         }

         return $$6;
      }
   }

   private void e(aqm $$0) {
      akj<dcg> $$1 = $$0.af();
      akj<dcg> $$2 = this.dR().af();
      am.w.a(this, $$1, $$2);
      if ($$1 == dcg.i && $$2 == dcg.h && this.dh != null) {
         am.D.a(this, this.dh);
      }

      if ($$2 != dcg.i) {
         this.dh = null;
      }
   }

   @Override
   public boolean a(aqn $$0) {
      if ($$0.N_()) {
         return this.L() == this;
      } else {
         return this.N_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bsh $$0, int $$1) {
      super.a($$0, $$1);
      this.ce.d();
   }

   @Override
   public Either<cml.a, azk> a(ja $$0) {
      jf $$1 = this.dR().a_($$0).c(dje.aE);
      if (this.fJ() || !this.bF()) {
         return Either.left(cml.a.e);
      } else if (!this.dR().D_().j()) {
         return Either.left(cml.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cml.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cml.a.d);
      } else {
         this.a(this.dR().af(), $$0, this.dH(), false, true);
         if (this.dR().R()) {
            return Either.left(cml.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               ewh $$4 = ewh.c($$0);
               List<cjr> $$5 = this.dR()
                  .a(cjr.class, new ewc($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.f(this));
               if (!$$5.isEmpty()) {
                  return Either.left(cml.a.f);
               }
            }

            Either<cml.a, azk> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(avr.ap);
               am.r.a(this);
            });
            if (!this.A().d()) {
               this.a(wu.c("sleep.not_possible"), true);
            }

            ((aqm)this.dR()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(ja $$0) {
      this.a(avr.i.b(avr.n));
      super.b($$0);
   }

   private boolean a(ja $$0, jf $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(ja $$0) {
      ewh $$1 = ewh.c($$0);
      return Math.abs(this.dw() - $$1.a()) <= 3.0 && Math.abs(this.dy() - $$1.b()) <= 2.0 && Math.abs(this.dC() - $$1.c()) <= 3.0;
   }

   private boolean b(ja $$0, jf $$1) {
      ja $$2 = $$0.c();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fJ()) {
         this.A().l().a(this, new abq(this, 2));
      }

      super.a($$0, $$1);
      if (this.c != null) {
         this.c.a(this.dw(), this.dy(), this.dC(), this.dH(), this.dJ());
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.bK();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public boolean b(bra $$0) {
      return super.b($$0) || this.P();
   }

   @Override
   protected void a(double $$0, boolean $$1, dsl $$2, ja $$3) {
   }

   @Override
   protected void a(aqm $$0, ja $$1) {
      if (!this.N_()) {
         super.a($$0, $$1);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.dj()) {
         this.b($$3, new ewh($$0, $$1, $$2));
         ja $$4 = this.aL();
         dsl $$5 = this.dR().a_($$4);
         if (this.ds && $$3 && this.ac > 0.0F) {
            ewh $$6 = $$4.b().b(0.0, 0.5, 0.0);
            int $$7 = (int)(50.0F * this.ac);
            this.A().a(new lb(lj.b, $$5), $$6.c, $$6.d, $$6.e, $$7, 0.3F, 0.3F, 0.3F, 0.15F);
            this.ds = false;
         }

         super.a($$1, $$3, $$5, $$4);
      }
   }

   @Override
   public void a(@Nullable bsh $$0) {
      super.a($$0);
      this.cy = this.dp();
      this.cz = $$0;
      this.cA = this.cA || $$0 != null && $$0.am() == bsn.bn;
   }

   @Override
   protected void r() {
      if (this.dR().s().i()) {
         super.r();
      }
   }

   @Override
   public void a(drb $$0, boolean $$1) {
      this.c.b(new abw(this.dR(), $$0.az_()));
      this.c.b(new adl($$0.az_(), $$1));
   }

   private void gG() {
      this.dz = this.dz % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bql $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.ce != this.cd) {
            this.s();
         }

         this.gG();
         cpi $$1 = $$0.createMenu(this.dz, this.ga(), this);
         if ($$1 == null) {
            if (this.N_()) {
               this.a(wu.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.c.b(new adk($$1.j, $$1.a(), $$0.O_()));
            this.a($$1);
            this.ce = $$1;
            return OptionalInt.of(this.dz);
         }
      }
   }

   @Override
   public void a(int $$0, dbf $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.c.b(new adg($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(cgw $$0, bqa $$1) {
      if (this.ce != this.cd) {
         this.s();
      }

      this.gG();
      this.c.b(new acv(this.dz, $$1.b(), $$0.an()));
      this.ce = new cqj(this.dz, this.ga(), $$1, $$0);
      this.a(this.ce);
   }

   @Override
   public void a(cud $$0, bqg $$1) {
      if ($$0.a(cug.ua)) {
         if (cwb.a($$0, this.di(), this)) {
            this.ce.d();
         }

         this.c.b(new adj($$1));
      }
   }

   @Override
   public void a(dqa $$0) {
      this.c.b(abu.a($$0, dpq::e));
   }

   @Override
   public void s() {
      this.c.b(new ach(this.ce.j));
      this.t();
   }

   @Override
   public void t() {
      this.ce.a(this);
      this.cd.a(this.ce);
      this.ce = this.cd;
   }

   public void a(float $$0, float $$1, boolean $$2, boolean $$3) {
      if (this.bT()) {
         if ($$0 >= -1.0F && $$0 <= 1.0F) {
            this.bp = $$0;
         }

         if ($$1 >= -1.0F && $$1 <= 1.0F) {
            this.br = $$1;
         }

         this.bo = $$2;
         this.h($$3);
      }
   }

   @Override
   public void a(ewh $$0) {
      double $$1 = this.dw();
      double $$2 = this.dy();
      double $$3 = this.dC();
      super.a($$0);
      this.b(this.dw() - $$1, this.dy() - $$2, this.dC() - $$3);
   }

   @Override
   public void u() {
      double $$0 = this.dw();
      double $$1 = this.dy();
      double $$2 = this.dC();
      super.u();
      this.r(this.dw() - $$0, this.dy() - $$1, this.dC() - $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (!this.bT() && !s($$0, $$1, $$2)) {
         if (this.ce()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(avr.C, $$3);
               this.D(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(awc.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(avr.w, $$4);
               this.D(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.bg()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(avr.s, $$5);
               this.D(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.p_()) {
            if ($$1 > 0.0) {
               this.a(avr.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aG()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.cd()) {
                  this.a(avr.r, $$6);
                  this.D(0.1F * (float)$$6 * 0.01F);
               } else if (this.cc()) {
                  this.a(avr.q, $$6);
                  this.D(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(avr.p, $$6);
                  this.D(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fC()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(avr.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(avr.v, $$8);
            }
         }
      }
   }

   private void r(double $$0, double $$1, double $$2) {
      if (this.bT() && !s($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         bsh $$4 = this.de();
         if ($$4 instanceof cog) {
            this.a(avr.x, $$3);
         } else if ($$4 instanceof coi) {
            this.a(avr.y, $$3);
         } else if ($$4 instanceof cfj) {
            this.a(avr.z, $$3);
         } else if ($$4 instanceof cgw) {
            this.a(avr.A, $$3);
         } else if ($$4 instanceof cke) {
            this.a(avr.D, $$3);
         }
      }
   }

   private static boolean s(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(avo<?> $$0, int $$1) {
      this.cJ.b(this, $$0, $$1);
      this.gp().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(avo<?> $$0) {
      this.cJ.a(this, $$0, 0);
      this.gp().a($$0, this, exj::c);
   }

   @Override
   public int a(Collection<cyl<?>> $$0) {
      return this.da.a($$0, this);
   }

   @Override
   public void a(cyl<?> $$0, List<cud> $$1) {
      am.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<akk> $$0) {
      List<cyl<?>> $$1 = $$0.stream().flatMap($$0x -> this.d.aK().a($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<cyl<?>> $$0) {
      return this.da.b($$0, this);
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cT = -1;
   }

   @Override
   public void v() {
      this.dd = true;
      this.bJ();
      if (this.fJ()) {
         this.a(true, false);
      }
   }

   @Override
   public boolean w() {
      return this.dd;
   }

   @Override
   public void x() {
      this.cQ = -1.0E8F;
   }

   @Override
   public void a(wu $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void y() {
      if (!this.bA.e() && this.ft()) {
         this.c.b(new acr(this, (byte)9));
         super.y();
      }
   }

   @Override
   public void a(fc.a $$0, ewh $$1) {
      super.a($$0, $$1);
      this.c.b(new adu($$0, $$1.c, $$1.d, $$1.e));
   }

   public void a(fc.a $$0, bsh $$1, fc.a $$2) {
      ewh $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.c.b(new adu($$0, $$1, $$2));
   }

   public void a(aqn $$0, boolean $$1) {
      this.dt = $$0.dt;
      this.dy = $$0.dy;
      this.e.a($$0.e.b(), $$0.e.c());
      this.z();
      this.eU().b($$0.eU());
      if ($$1) {
         this.ga().a($$0.ga());
         this.u($$0.ey());
         this.cf = $$0.cf;

         for (brp $$2 : $$0.ev()) {
            this.b(new brp($$2));
         }

         this.cr = $$0.cr;
         this.cs = $$0.cs;
         this.ct = $$0.ct;
         this.r($$0.fU());
         this.ay = $$0.ay;
      } else if (this.dR().ab().b(dcc.d) || $$0.N_()) {
         this.ga().a($$0.ga());
         this.cr = $$0.cr;
         this.cs = $$0.cs;
         this.ct = $$0.ct;
         this.r($$0.fU());
      }

      this.cu = $$0.cu;
      this.cc = $$0.cc;
      this.ar().a(bY, $$0.ar().a(bY));
      this.cT = -1;
      this.cQ = -1.0F;
      this.cR = -1;
      this.da.a($$0.da);
      this.f = $$0.f;
      this.dh = $$0.dh;
      this.dk = $$0.dk;
      this.i($$0.gr());
      this.j($$0.gs());
      this.a($$0.gz());
   }

   @Override
   protected void a(brp $$0, @Nullable bsh $$1) {
      super.a($$0, $$1);
      this.c.b(new afu(this.an(), $$0, true));
      if ($$0.a(brr.y)) {
         this.dc = this.ai;
         this.db = this.dp();
      }

      am.B.a(this, $$1);
   }

   @Override
   protected void a(brp $$0, boolean $$1, @Nullable bsh $$2) {
      super.a($$0, $$1, $$2);
      this.c.b(new afu(this.an(), $$0, false));
      am.B.a(this, $$2);
   }

   @Override
   protected void a(brp $$0) {
      super.a($$0);
      this.c.b(new adz(this.an(), $$0.c()));
      if ($$0.a(brr.y)) {
         this.db = null;
      }

      am.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.c.a($$0, $$1, $$2, this.dH(), this.dJ(), btq.g);
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.c.a(this.dw() + $$0, this.dy() + $$1, this.dC() + $$2, this.dH(), this.dJ(), btq.f);
   }

   @Override
   public boolean a(aqm $$0, double $$1, double $$2, double $$3, Set<btq> $$4, float $$5, float $$6) {
      dbn $$7 = new dbn(ja.a($$1, $$2, $$3));
      $$0.l().a(aqr.f, $$7, 1, this.an());
      this.ad();
      if (this.fJ()) {
         this.a(true, true);
      }

      if ($$0 == this.dR()) {
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
   public void b(bsh $$0) {
      this.A().l().a(this, new abq($$0, 4));
   }

   @Override
   public void c(bsh $$0) {
      this.A().l().a(this, new abq($$0, 5));
   }

   @Override
   public void z() {
      if (this.c != null) {
         this.c.b(new adn(this.gb()));
         this.K();
      }
   }

   public aqm A() {
      return (aqm)this.dR();
   }

   public boolean a(dcd $$0) {
      boolean $$1 = this.N_();
      if (!this.e.a($$0)) {
         return false;
      } else {
         this.c.b(new acu(acu.e, (float)$$0.a()));
         if ($$0 == dcd.d) {
            this.go();
            this.ad();
            czo.a(this);
         } else {
            this.d(this);
            if ($$1) {
               czo.a(this.A(), this);
            }
         }

         this.z();
         this.fr();
         return true;
      }
   }

   @Override
   public boolean N_() {
      return this.e.b() == dcd.d;
   }

   @Override
   public boolean f() {
      return this.e.b() == dcd.b;
   }

   @Override
   public void a(wu $$0) {
      this.b($$0, false);
   }

   public void b(wu $$0, boolean $$1) {
      if (this.w($$1)) {
         this.c.a(new afl($$0, $$1), wb.a(() -> {
            if (this.w(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               wu $$3 = wu.b($$2).a(n.o);
               return new afl(wu.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(xj $$0, boolean $$1, wq.a $$2) {
      if (this.gH()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String B() {
      return this.c.m() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(apz $$0) {
      this.df = $$0.b();
      this.de = $$0.c();
      this.cV = $$0.d();
      this.cW = $$0.e();
      this.dq = $$0.h();
      this.dr = $$0.i();
      this.ar().a(bY, (byte)$$0.f());
      this.ar().a(bZ, (byte)$$0.g().a());
   }

   public apz C() {
      int $$0 = this.ar().a(bY);
      bsw $$1 = bsw.d.apply(this.ar().a(bZ));
      return new apz(this.df, this.de, this.cV, this.cW, $$0, $$1, this.dq, this.dr);
   }

   public boolean D() {
      return this.cW;
   }

   public cmj E() {
      return this.cV;
   }

   private boolean w(boolean $$0) {
      return this.cV == cmj.c ? $$0 : true;
   }

   private boolean gH() {
      return this.cV == cmj.a;
   }

   public int F() {
      return this.de;
   }

   public void a(ajj $$0) {
      this.c.b(new aef($$0.a(), $$0.d().map(ajj.a::a)));
   }

   @Override
   protected int G() {
      return this.d.c(this.fZ());
   }

   @Override
   public void H() {
      this.cX = ac.c();
   }

   public avn I() {
      return this.cJ;
   }

   public avm J() {
      return this.da;
   }

   @Override
   protected void K() {
      if (this.N_()) {
         this.et();
         this.l(true);
      } else {
         super.K();
      }
   }

   public bsh L() {
      return (bsh)(this.cY == null ? this : this.cY);
   }

   @Override
   public void d(@Nullable bsh $$0) {
      bsh $$1 = this.L();
      this.cY = (bsh)($$0 == null ? this : $$0);
      if ($$1 != this.cY) {
         if (this.cY.dR() instanceof aqm $$2) {
            this.a($$2, this.cY.dw(), this.cY.dy(), this.cY.dC(), Set.of(), this.dH(), this.dJ());
         }

         if ($$0 != null) {
            this.A().l().a(this);
         }

         this.c.b(new aem(this.cY));
         this.c.l();
      }
   }

   @Override
   protected void M() {
      if (!this.cZ) {
         super.M();
      }
   }

   @Override
   public void e(bsh $$0) {
      if (this.e.b() == dcd.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long N() {
      return this.cX;
   }

   @Nullable
   public wu O() {
      return null;
   }

   @Override
   public void a(bqg $$0) {
      super.a($$0);
      this.gu();
   }

   public boolean P() {
      return this.cZ;
   }

   public void Q() {
      this.cZ = false;
   }

   public aks R() {
      return this.cI;
   }

   public void a(aqm $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      this.d(this);
      this.ad();
      if ($$0 == this.dR()) {
         this.c.a($$1, $$2, $$3, $$4, $$5);
      } else {
         this.a(() -> new eph($$0, new ewh($$1, $$2, $$3), ewh.b, $$4, $$5));
      }
   }

   @Nullable
   public ja S() {
      return this.dm;
   }

   public float T() {
      return this.do;
   }

   public akj<dcg> U() {
      return this.dl;
   }

   public boolean V() {
      return this.dn;
   }

   public void b(aqn $$0) {
      this.a($$0.U(), $$0.S(), $$0.T(), $$0.V(), false);
   }

   public void a(akj<dcg> $$0, @Nullable ja $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.dm) && $$0.equals(this.dl);
         if ($$4 && !$$5) {
            this.a(wu.c("block.minecraft.set_spawn"));
         }

         this.dm = $$1;
         this.dl = $$0;
         this.do = $$2;
         this.dn = $$3;
      } else {
         this.dm = null;
         this.dl = dcg.h;
         this.do = 0.0F;
         this.dn = false;
      }
   }

   public kc W() {
      return this.dj;
   }

   public void a(kc $$0) {
      this.dj = $$0;
   }

   public apy X() {
      return this.dk;
   }

   public void a(apy $$0) {
      this.dk = $$0;
   }

   @Override
   public void a(avg $$0, avi $$1, float $$2, float $$3) {
      this.c.b(new afi(lq.b.e($$0), $$1, this.dw(), this.dy(), this.dC(), $$2, $$3, this.ah.g()));
   }

   @Override
   public civ a(cud $$0, boolean $$1, boolean $$2) {
      civ $$3 = super.a($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dR().b($$3);
         cud $$4 = $$3.p();
         if ($$2) {
            if (!$$4.e()) {
               this.a(avr.f.b($$4.g()), $$0.H());
            }

            this.a(avr.F);
         }

         return $$3;
      }
   }

   public arr Y() {
      return this.dp;
   }

   public void b(aqm $$0) {
      this.a((dcg)$$0);
      this.e.a($$0);
   }

   @Nullable
   private static dcd a(@Nullable tx $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? dcd.a($$0.h($$1)) : null;
   }

   private dcd b(@Nullable dcd $$0) {
      dcd $$1 = this.d.bg();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.d.u_();
      }
   }

   @Override
   public void c(@Nullable tx $$0) {
      this.e.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void k(tx $$0) {
      $$0.a("playerGameType", this.e.b().a());
      dcd $$1 = this.e.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean Z() {
      return this.dq;
   }

   public boolean c(aqn $$0) {
      return $$0 == this ? false : this.dq || $$0.dq;
   }

   @Override
   public boolean a(dcg $$0, ja $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cud $$0) {
      am.W.a(this, $$0);
      super.a($$0);
   }

   public boolean b(boolean $$0) {
      cmk $$1 = this.ga();
      cud $$2 = $$1.a($$0);
      this.ce.b($$1, $$1.k).ifPresent($$1x -> this.ce.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean aa() {
      return this.dr;
   }

   @Override
   public Optional<clr> ab() {
      return Optional.of(this.dt);
   }

   public void c(boolean $$0) {
      this.ds = $$0;
   }

   @Override
   public void a(civ $$0) {
      super.a($$0);
      bsh $$1 = $$0.s();
      if ($$1 != null) {
         am.S.a(this, $$0.p(), $$1);
      }
   }

   public void a(xl $$0) {
      this.dy = $$0;
   }

   @Nullable
   public xl ac() {
      return this.dy != null && this.dy.b() ? null : this.dy;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cx = (float)(ayg.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dH());
      this.c.b(new acw(this));
   }

   @Override
   public boolean a(bsh $$0, boolean $$1) {
      if (super.a($$0, $$1)) {
         $$0.j(this);
         this.c.a(this.dw(), this.dy(), this.dC(), this.dH(), this.dJ());
         if ($$0 instanceof btc $$2) {
            this.d.ai().a($$2, this.c);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void ad() {
      bsh $$0 = this.de();
      super.ad();
      if ($$0 instanceof btc $$1) {
         for (brp $$2 : $$1.ev()) {
            this.c.b(new adz($$0.an(), $$2.c()));
         }
      }
   }

   public afw c(aqm $$0) {
      return new afw($$0.ae(), $$0.af(), ddi.a($$0.C()), this.e.b(), this.e.c(), $$0.ai(), $$0.B(), this.gz(), this.az());
   }

   @Override
   public void c(ja $$0) {
      this.du = $$0;
   }

   public void ae() {
      this.du = null;
   }

   @Nullable
   public ja af() {
      return this.du;
   }

   @Override
   public ewh ag() {
      return this.dv;
   }

   @Override
   public void b(ewh $$0) {
      this.dv = $$0;
   }

   @Override
   protected float a(bsh $$0, float $$1, bra $$2) {
      return czo.a(this.A(), this.eV(), $$0, $$2, $$1);
   }

   @Override
   public void a(cty $$0, bso $$1) {
      super.a($$0, $$1);
      this.b(avr.d.b($$0));
   }

   static record a(ewh a, float b) {
      public static aqn.a a(ewh $$0, ja $$1) {
         return new aqn.a($$0, b($$0, $$1));
      }

      private static float b(ewh $$0, ja $$1) {
         ewh $$2 = ewh.c($$1).d($$0).d();
         return (float)ayg.d(ayg.d($$2.e, $$2.c) * 180.0F / (float)Math.PI - 90.0);
      }
   }
}
