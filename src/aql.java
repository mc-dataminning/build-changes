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

public class aql extends cmh {
   private static final Logger cB = LogUtils.getLogger();
   private static final int cC = 32;
   private static final int cD = 10;
   private static final int cE = 25;
   public static final double b = 1.0;
   private static final bue cF = new bue(UUID.fromString("736565d2-e1a7-403d-a3f8-1aeb3e302542"), "Creative block interaction range modifier", 0.5, bue.a.a);
   private static final bue cG = new bue(UUID.fromString("98491ef6-97b1-4584-ae82-71a8cc85cf73"), "Creative entity interaction range modifier", 2.0, bue.a.a);
   public ark c;
   public final MinecraftServer d;
   public final aqm e;
   private final aks cH;
   private final avl cI;
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
   private cmf cU = cmf.a;
   private boolean cV = true;
   private long cW = ac.c();
   @Nullable
   private bsd cX;
   private boolean cY;
   private boolean cZ;
   private final avk da = new avk();
   @Nullable
   private evz db;
   private int dc;
   private boolean dd;
   private int de = 2;
   private String df = "en_us";
   @Nullable
   private evz dg;
   @Nullable
   private evz dh;
   @Nullable
   private evz di;
   private kc dj = kc.a(0, 0, 0);
   private apy dk = apy.a;
   private akj<dcd> dl = dcd.h;
   @Nullable
   private ja dm;
   private boolean dn;
   private float do;
   private final arp dp;
   private boolean dq;
   private boolean dr;
   private boolean ds;
   private cln dt = new cln(0, 0, 0);
   @Nullable
   private ja du;
   private final cps dv = new cps() {
      @Override
      public void a(cpe $$0, js<cua> $$1, cua $$2, int[] $$3) {
         aql.this.c.b(new aci($$0.j, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cpe $$0, int $$1, cua $$2) {
         aql.this.c.b(new ack($$0.j, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cpe $$0, cua $$1) {
         aql.this.c.b(new ack(-1, $$0.k(), -1, $$1));
      }

      @Override
      public void a(cpe $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cpe $$0, int $$1, int $$2) {
         aql.this.c.b(new acj($$0.j, $$1, $$2));
      }
   };
   private final cpr dw = new cpr() {
      @Override
      public void a(cpe $$0, int $$1, cua $$2) {
         cra $$3 = $$0.b($$1);
         if (!($$3 instanceof cqw)) {
            if ($$3.c == aql.this.fY()) {
               am.f.a(aql.this, aql.this.fY(), $$2);
            }
         }
      }

      @Override
      public void a(cpe $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private xl dx;
   @Nullable
   public final Object f;
   private int dy;
   public boolean g;

   public aql(MinecraftServer $$0, aqk $$1, GameProfile $$2, apz $$3) {
      super($$1, $$1.V(), $$1.W(), $$2);
      this.dp = $$0.a(this);
      this.e = $$0.b(this);
      this.d = $$0;
      this.cI = $$0.ah().a((cmh)this);
      this.cH = $$0.ah().f(this);
      this.e($$1);
      this.a($$3);
      this.f = null;
   }

   private void e(aqk $$0) {
      ja $$1 = $$0.V();
      if ($$0.D_().g() && $$0.o().bb().k() != dca.c) {
         int $$2 = Math.max(0, this.d.a($$0));
         int $$3 = aye.a($$0.C_().b((double)$$1.u(), (double)$$1.w()));
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
         int $$8 = aym.a().a($$6);

         for (int $$9 = 0; $$9 < $$6; $$9++) {
            int $$10 = ($$8 + $$7 * $$9) % $$6;
            int $$11 = $$10 % ($$2 * 2 + 1);
            int $$12 = $$10 / ($$2 * 2 + 1);
            ja $$13 = aqf.a($$0, $$1.u() + $$11 - $$2, $$1.w() + $$12 - $$2);
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

   private int t(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         cln.a.parse(new Dynamic(ul.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(cB::error).ifPresent($$0x -> this.dt = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         tx $$1 = $$0.p("enteredNetherPosition");
         this.dh = new evz($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.cZ = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.da.a($$0.p("recipeBook"), this.d.aJ());
      }

      if (this.fH()) {
         this.fI();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.dm = new ja($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.dn = $$0.q("SpawnForced");
         this.do = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.dl = dcd.g.parse(ul.a, $$0.c("SpawnDimension")).resultOrPartial(cB::error).orElse(dcd.h);
         }
      }

      this.ds = $$0.q("spawn_extra_particles_on_fall");
      uu $$2 = $$0.c("raid_omen_position");
      if ($$2 != null) {
         ja.a.parse(ul.a, $$2).resultOrPartial(cB::error).ifPresent($$0x -> this.du = $$0x);
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      cln.a.encodeStart(ul.a, this.dt).resultOrPartial(cB::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.cZ);
      if (this.dh != null) {
         tx $$1 = new tx();
         $$1.a("x", this.dh.c);
         $$1.a("y", this.dh.d);
         $$1.a("z", this.dh.e);
         $$0.a("enteredNetherPosition", $$1);
      }

      bsd $$2 = this.cZ();
      bsd $$3 = this.dc();
      if ($$3 != null && $$2 != this && $$2.cY()) {
         tx $$4 = new tx();
         tx $$5 = new tx();
         $$2.e($$5);
         $$4.a("Attach", $$3.cz());
         $$4.a("Entity", $$5);
         $$0.a("RootVehicle", $$4);
      }

      $$0.a("recipeBook", this.da.b());
      $$0.a("Dimension", this.dP().af().a().toString());
      if (this.dm != null) {
         $$0.a("SpawnX", this.dm.u());
         $$0.a("SpawnY", this.dm.v());
         $$0.a("SpawnZ", this.dm.w());
         $$0.a("SpawnForced", this.dn);
         $$0.a("SpawnAngle", this.do);
         akk.a.encodeStart(ul.a, this.dl.a()).resultOrPartial(cB::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }

      $$0.a("spawn_extra_particles_on_fall", this.ds);
      if (this.du != null) {
         ja.a.encodeStart(ul.a, this.du).resultOrPartial(cB::error).ifPresent($$1 -> $$0.a("raid_omen_position", $$1));
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gh();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.cs = aye.a((float)$$0 / $$1, 0.0F, $$2);
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
   public void a(cua $$0, int $$1) {
      super.a($$0, $$1);
      this.cS = -1;
   }

   private void a(cpe $$0) {
      $$0.a(this.dw);
      $$0.a(this.dv);
   }

   public void h() {
      this.a(this.cc);
   }

   @Override
   public void f_() {
      super.f_();
      this.c.b(adq.a);
   }

   @Override
   public void g_() {
      super.g_();
      this.c.b(new adp(this.eL()));
   }

   @Override
   protected void a(dsh $$0) {
      am.e.a(this, $$0);
   }

   @Override
   protected ctw k() {
      return new cuy(this);
   }

   @Override
   public void l() {
      this.e.a();
      this.dt.a();
      this.cT--;
      if (this.am > 0) {
         this.am--;
      }

      this.cd.d();
      if (!this.dP().B && !this.cd.b(this)) {
         this.r();
         this.cd = this.cc;
      }

      bsd $$0 = this.K();
      if ($$0 != this) {
         if ($$0.bD()) {
            this.a($$0.du(), $$0.dw(), $$0.dA(), $$0.dF(), $$0.dH());
            this.z().l().a(this);
            if (this.fO()) {
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
      this.gB();
      this.cH.b(this);
   }

   private void gB() {
      buc $$0 = this.f(bug.g);
      if ($$0 != null) {
         if (this.f()) {
            $$0.b(cF);
         } else {
            $$0.e(cF);
         }
      }

      buc $$1 = this.f(bug.j);
      if ($$1 != null) {
         if (this.f()) {
            $$1.b(cG);
         } else {
            $$1.e(cG);
         }
      }
   }

   public void m() {
      try {
         if (!this.N_() || !this.dh()) {
            super.l();
         }

         for (int $$0 = 0; $$0 < this.fY().b(); $$0++) {
            cua $$1 = this.fY().a($$0);
            if ($$1.g().ak_()) {
               zb<?> $$2 = ((csk)$$1.g()).a($$1, this.dP(), this);
               if ($$2 != null) {
                  this.c.b($$2);
               }
            }
         }

         if (this.ew() != this.cP || this.cQ != this.ce.a() || this.ce.e() == 0.0F != this.cR) {
            this.c.b(new aex(this.ew(), this.ce.a(), this.ce.e()));
            this.cP = this.ew();
            this.cQ = this.ce.a();
            this.cR = this.ce.e() == 0.0F;
         }

         if (this.ew() + this.fo() != this.cJ) {
            this.cJ = this.ew() + this.fo();
            this.a(exg.g, aye.f(this.cJ));
         }

         if (this.ce.a() != this.cK) {
            this.cK = this.ce.a();
            this.a(exg.h, aye.f((float)this.cK));
         }

         if (this.cl() != this.cL) {
            this.cL = this.cl();
            this.a(exg.i, aye.f((float)this.cL));
         }

         if (this.eK() != this.cM) {
            this.cM = this.eK();
            this.a(exg.j, aye.f((float)this.cM));
         }

         if (this.cr != this.cO) {
            this.cO = this.cr;
            this.a(exg.k, aye.f((float)this.cO));
         }

         if (this.cq != this.cN) {
            this.cN = this.cq;
            this.a(exg.l, aye.f((float)this.cN));
         }

         if (this.cr != this.cS) {
            this.cS = this.cr;
            this.c.b(new aew(this.cs, this.cr, this.cq));
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
      if (this.ew() > 0.0F && this.dg != null) {
         am.X.a(this, this.dg);
      }

      this.dg = null;
      super.n();
   }

   public void o() {
      if (this.ac > 0.0F && this.dg == null) {
         this.dg = this.dn();
         if (this.cx != null && this.cx.d <= this.dg.d) {
            am.ae.a(this, this.cx, this.cy);
         }
      }
   }

   public void p() {
      if (this.dc() != null && this.dc().bs()) {
         if (this.di == null) {
            this.di = this.dn();
         } else {
            am.Y.a(this, this.di);
         }
      }

      if (this.di != null && (this.dc() == null || !this.dc().bs())) {
         this.di = null;
      }
   }

   private void a(exg $$0, int $$1) {
      this.gn().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(bqw $$0) {
      this.a(dxa.p);
      boolean $$1 = this.dP().ab().b(dbz.n);
      if ($$1) {
         wu $$2 = this.eL().a();
         this.c.a(new adr(this.al(), $$2), wb.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            wu $$3x = wu.a("death.attack.message_too_long", wu.b($$2x).a(n.o));
            wu $$4x = wu.a("death.attack.even_more_magic", this.O_()).a($$1xx -> $$1xx.a(new xa(xa.a.a, $$3x)));
            return new adr(this.al(), $$4x);
         }));
         exf $$3 = this.cj();
         if ($$3 == null || $$3.k() == exf.b.a) {
            this.d.ah().a($$2, false);
         } else if ($$3.k() == exf.b.c) {
            this.d.ah().a(this, $$2);
         } else if ($$3.k() == exf.b.d) {
            this.d.ah().b(this, $$2);
         }
      } else {
         this.c.b(new adr(this.al(), wt.a));
      }

      this.gm();
      if (this.dP().ab().b(dbz.N)) {
         this.gC();
      }

      if (!this.N_()) {
         this.g($$0);
      }

      this.gn().a(exg.d, this, exb::b);
      bsy $$4 = this.eM();
      if ($$4 != null) {
         this.b(avp.h.b($$4.ak()));
         $$4.a(this, this.bl, $$0);
         this.f($$4);
      }

      this.dP().a(this, (byte)3);
      this.a(avp.N);
      this.a(avp.i.b(avp.m));
      this.a(avp.i.b(avp.n));
      this.aC();
      this.k(0);
      this.c(false);
      this.eL().c();
      this.a(Optional.of(ji.a(this.dP().af(), this.dp())));
   }

   private void gC() {
      evu $$0 = new evu(this.dp()).c(32.0, 10.0, 32.0);
      this.dP().a(bta.class, $$0, bsi.f).stream().filter($$0x -> $$0x instanceof bte).forEach($$0x -> ((bte)$$0x).a_((cmh)this));
   }

   @Override
   public void a(bsd $$0, int $$1, bqw $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.s($$1);
         this.gn().a(exg.f, this, exb::b);
         if ($$0 instanceof cmh) {
            this.a(avp.Q);
            this.gn().a(exg.e, this, exb::b);
         } else {
            this.a(avp.O);
         }

         this.a(this, $$0, exg.m);
         this.a($$0, this, exg.n);
         am.c.a(this, $$0, $$2);
      }
   }

   private void a(exc $$0, exc $$1, exg[] $$2) {
      ewy $$3 = this.gn().e($$1.cB());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gn().a($$2[$$4], $$0, exb::b);
         }
      }
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.d.n() && this.gD() && $$0.a(avw.n);
         if (!$$2 && this.cT > 0 && !$$0.a(avw.e)) {
            return false;
         } else {
            bsd $$3 = $$0.d();
            if ($$3 instanceof cmh $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof cmn $$5 && $$5.s() instanceof cmh $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(cmh $$0) {
      return !this.gD() ? false : super.a($$0);
   }

   private boolean gD() {
      return this.d.ad();
   }

   @Nullable
   @Override
   protected epa a(aqk $$0) {
      epa $$1 = super.a($$0);
      if ($$1 != null && this.dP().af() == dcd.h && $$0.af() == dcd.j) {
         evz $$2 = $$1.a.b(0.0, -1.0, 0.0);
         return new epa($$2, evz.b, 90.0F, 0.0F);
      } else {
         return $$1;
      }
   }

   @Nullable
   @Override
   public bsd b(aqk $$0) {
      this.cY = true;
      aqk $$1 = this.z();
      akj<dcd> $$2 = $$1.af();
      if ($$2 == dcd.j && $$0.af() == dcd.h) {
         this.ai();
         this.z().a(this, bsd.c.e);
         if (!this.g) {
            this.g = true;
            this.c.b(new acu(acu.f, this.cZ ? 0.0F : 1.0F));
            this.cZ = true;
         }

         return this;
      } else {
         epy $$3 = $$0.A_();
         this.c.b(new aeb(this.d($$0), (byte)3));
         this.c.b(new aca($$3.q(), $$3.r()));
         auh $$4 = this.d.ah();
         $$4.d(this);
         $$1.a(this, bsd.c.e);
         this.dM();
         epa $$5 = this.a($$0);
         if ($$5 != null) {
            $$1.ag().a("moving");
            if ($$2 == dcd.h && $$0.af() == dcd.i) {
               this.dh = this.dn();
            } else if ($$0.af() == dcd.j) {
               this.b($$0, ja.a($$5.a));
            }

            $$1.ag().c();
            $$1.ag().a("placing");
            this.c($$0);
            this.c.a($$5.a.c, $$5.a.d, $$5.a.e, $$5.c, $$5.d);
            this.c.l();
            $$0.b(this);
            $$1.ag().c();
            this.f($$1);
            this.c.b(new adn(this.fZ()));
            $$4.a(this, $$0);
            $$4.e(this);

            for (brl $$6 : this.et()) {
               this.c.b(new afu(this.al(), $$6, false));
            }

            this.c.b(new ada(1032, ja.c, 0, false));
            this.cS = -1;
            this.cP = -1.0F;
            this.cQ = -1;
         }

         return this;
      }
   }

   private void b(aqk $$0, ja $$1) {
      ja.a $$2 = $$1.j();

      for (int $$3 = -2; $$3 <= 2; $$3++) {
         for (int $$4 = -2; $$4 <= 2; $$4++) {
            for (int $$5 = -1; $$5 < 3; $$5++) {
               dsh $$6 = $$5 == -1 ? dfh.co.o() : dfh.a.o();
               $$0.b($$2.g($$1).e($$4, $$5, $$3), $$6);
            }
         }
      }
   }

   @Override
   protected Optional<l.a> a(aqk $$0, ja $$1, boolean $$2, dty $$3) {
      Optional<l.a> $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         jf.a $$5 = this.dP().a_(this.ay).d(dkj.b).orElse(jf.a.a);
         Optional<l.a> $$6 = $$0.p().a($$1, $$5);
         if ($$6.isEmpty()) {
            cB.error("Unable to create a portal, likely target out of worldborder");
         }

         return $$6;
      }
   }

   private void f(aqk $$0) {
      akj<dcd> $$1 = $$0.af();
      akj<dcd> $$2 = this.dP().af();
      am.w.a(this, $$1, $$2);
      if ($$1 == dcd.i && $$2 == dcd.h && this.dh != null) {
         am.D.a(this, this.dh);
      }

      if ($$2 != dcd.i) {
         this.dh = null;
      }
   }

   @Override
   public boolean a(aql $$0) {
      if ($$0.N_()) {
         return this.K() == this;
      } else {
         return this.N_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bsd $$0, int $$1) {
      super.a($$0, $$1);
      this.cd.d();
   }

   @Override
   public Either<cmh.a, azh> a(ja $$0) {
      jf $$1 = this.dP().a_($$0).c(djb.aE);
      if (this.fH() || !this.bD()) {
         return Either.left(cmh.a.e);
      } else if (!this.dP().D_().j()) {
         return Either.left(cmh.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cmh.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cmh.a.d);
      } else {
         this.a(this.dP().af(), $$0, this.dF(), false, true);
         if (this.dP().R()) {
            return Either.left(cmh.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               evz $$4 = evz.c($$0);
               List<cjn> $$5 = this.dP()
                  .a(cjn.class, new evu($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.f(this));
               if (!$$5.isEmpty()) {
                  return Either.left(cmh.a.f);
               }
            }

            Either<cmh.a, azh> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(avp.ap);
               am.r.a(this);
            });
            if (!this.z().d()) {
               this.a(wu.c("sleep.not_possible"), true);
            }

            ((aqk)this.dP()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(ja $$0) {
      this.a(avp.i.b(avp.n));
      super.b($$0);
   }

   private boolean a(ja $$0, jf $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(ja $$0) {
      evz $$1 = evz.c($$0);
      return Math.abs(this.du() - $$1.a()) <= 3.0 && Math.abs(this.dw() - $$1.b()) <= 2.0 && Math.abs(this.dA() - $$1.c()) <= 3.0;
   }

   private boolean b(ja $$0, jf $$1) {
      ja $$2 = $$0.c();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fH()) {
         this.z().l().a(this, new abq(this, 2));
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
   public boolean b(bqw $$0) {
      return super.b($$0) || this.O();
   }

   @Override
   protected void a(double $$0, boolean $$1, dsh $$2, ja $$3) {
   }

   @Override
   protected void a(aqk $$0, ja $$1) {
      if (!this.N_()) {
         super.a($$0, $$1);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.dh()) {
         this.b($$3, new evz($$0, $$1, $$2));
         ja $$4 = this.aJ();
         dsh $$5 = this.dP().a_($$4);
         if (this.ds && $$3 && this.ac > 0.0F) {
            evz $$6 = $$4.b().b(0.0, 0.5, 0.0);
            int $$7 = (int)(50.0F * this.ac);
            this.z().a(new lb(lj.b, $$5), $$6.c, $$6.d, $$6.e, $$7, 0.3F, 0.3F, 0.3F, 0.15F);
            this.ds = false;
         }

         super.a($$1, $$3, $$5, $$4);
      }
   }

   @Override
   public void a(@Nullable bsd $$0) {
      super.a($$0);
      this.cx = this.dn();
      this.cy = $$0;
      this.cz = $$0 != null && $$0.ak() == bsj.bn;
   }

   @Override
   protected void q() {
      if (this.dP().s().i()) {
         super.q();
      }
   }

   @Override
   public void a(dqx $$0, boolean $$1) {
      this.c.b(new abw(this.dP(), $$0.az_()));
      this.c.b(new adl($$0.az_(), $$1));
   }

   private void gE() {
      this.dy = this.dy % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bqh $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.cd != this.cc) {
            this.r();
         }

         this.gE();
         cpe $$1 = $$0.createMenu(this.dy, this.fY(), this);
         if ($$1 == null) {
            if (this.N_()) {
               this.a(wu.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.c.b(new adk($$1.j, $$1.a(), $$0.O_()));
            this.a($$1);
            this.cd = $$1;
            return OptionalInt.of(this.dy);
         }
      }
   }

   @Override
   public void a(int $$0, dbc $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.c.b(new adg($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(cgs $$0, bpw $$1) {
      if (this.cd != this.cc) {
         this.r();
      }

      this.gE();
      this.c.b(new acv(this.dy, $$1.b(), $$0.al()));
      this.cd = new cqf(this.dy, this.fY(), $$1, $$0);
      this.a(this.cd);
   }

   @Override
   public void a(cua $$0, bqc $$1) {
      if ($$0.a(cud.ua)) {
         if (cvy.a($$0, this.dg(), this)) {
            this.cd.d();
         }

         this.c.b(new adj($$1));
      }
   }

   @Override
   public void a(dpx $$0) {
      this.c.b(abu.a($$0, dpn::e));
   }

   @Override
   public void r() {
      this.c.b(new ach(this.cd.j));
      this.s();
   }

   @Override
   public void s() {
      this.cd.a(this);
      this.cc.a(this.cd);
      this.cd = this.cc;
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
   public void a(evz $$0) {
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
               this.a(avp.C, $$3);
               this.D(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(awa.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(avp.w, $$4);
               this.D(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.be()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(avp.s, $$5);
               this.D(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.q_()) {
            if ($$1 > 0.0) {
               this.a(avp.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aE()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.cb()) {
                  this.a(avp.r, $$6);
                  this.D(0.1F * (float)$$6 * 0.01F);
               } else if (this.ca()) {
                  this.a(avp.q, $$6);
                  this.D(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(avp.p, $$6);
                  this.D(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fA()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(avp.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(avp.v, $$8);
            }
         }
      }
   }

   private void r(double $$0, double $$1, double $$2) {
      if (this.bR() && !s($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         bsd $$4 = this.dc();
         if ($$4 instanceof coc) {
            this.a(avp.x, $$3);
         } else if ($$4 instanceof coe) {
            this.a(avp.y, $$3);
         } else if ($$4 instanceof cff) {
            this.a(avp.z, $$3);
         } else if ($$4 instanceof cgs) {
            this.a(avp.A, $$3);
         } else if ($$4 instanceof cka) {
            this.a(avp.D, $$3);
         }
      }
   }

   private static boolean s(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(avm<?> $$0, int $$1) {
      this.cI.b(this, $$0, $$1);
      this.gn().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(avm<?> $$0) {
      this.cI.a(this, $$0, 0);
      this.gn().a($$0, this, exb::c);
   }

   @Override
   public int a(Collection<cyi<?>> $$0) {
      return this.da.a($$0, this);
   }

   @Override
   public void a(cyi<?> $$0, List<cua> $$1) {
      am.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<akk> $$0) {
      List<cyi<?>> $$1 = $$0.stream().flatMap($$0x -> this.d.aJ().a($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<cyi<?>> $$0) {
      return this.da.b($$0, this);
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cS = -1;
   }

   @Override
   public void u() {
      this.dd = true;
      this.bH();
      if (this.fH()) {
         this.a(true, false);
      }
   }

   public boolean v() {
      return this.dd;
   }

   public void w() {
      this.cP = -1.0E8F;
   }

   @Override
   public void a(wu $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void x() {
      if (!this.bz.e() && this.fr()) {
         this.c.b(new acr(this, (byte)9));
         super.x();
      }
   }

   @Override
   public void a(fc.a $$0, evz $$1) {
      super.a($$0, $$1);
      this.c.b(new adu($$0, $$1.c, $$1.d, $$1.e));
   }

   public void a(fc.a $$0, bsd $$1, fc.a $$2) {
      evz $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.c.b(new adu($$0, $$1, $$2));
   }

   public void a(aql $$0, boolean $$1) {
      this.dt = $$0.dt;
      this.dx = $$0.dx;
      this.e.a($$0.e.b(), $$0.e.c());
      this.y();
      if ($$1) {
         this.fY().a($$0.fY());
         this.u($$0.ew());
         this.ce = $$0.ce;
         this.cq = $$0.cq;
         this.cr = $$0.cr;
         this.cs = $$0.cs;
         this.r($$0.fS());
         this.ay = $$0.ay;
      } else if (this.dP().ab().b(dbz.d) || $$0.N_()) {
         this.fY().a($$0.fY());
         this.cq = $$0.cq;
         this.cr = $$0.cr;
         this.cs = $$0.cs;
         this.r($$0.fS());
      }

      this.ct = $$0.ct;
      this.cb = $$0.cb;
      this.ap().a(bX, $$0.ap().a(bX));
      this.cS = -1;
      this.cP = -1.0F;
      this.cQ = -1;
      this.da.a($$0.da);
      this.cZ = $$0.cZ;
      this.dh = $$0.dh;
      this.dk = $$0.dk;
      this.i($$0.gp());
      this.j($$0.gq());
      this.a($$0.gx());
   }

   @Override
   protected void a(brl $$0, @Nullable bsd $$1) {
      super.a($$0, $$1);
      this.c.b(new afu(this.al(), $$0, true));
      if ($$0.a(brn.y)) {
         this.dc = this.ai;
         this.db = this.dn();
      }

      am.B.a(this, $$1);
   }

   @Override
   protected void a(brl $$0, boolean $$1, @Nullable bsd $$2) {
      super.a($$0, $$1, $$2);
      this.c.b(new afu(this.al(), $$0, false));
      am.B.a(this, $$2);
   }

   @Override
   protected void a(brl $$0) {
      super.a($$0);
      this.c.b(new adz(this.al(), $$0.c()));
      if ($$0.a(brn.y)) {
         this.db = null;
      }

      am.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.c.a($$0, $$1, $$2, this.dF(), this.dH(), btm.g);
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.c.a(this.du() + $$0, this.dw() + $$1, this.dA() + $$2, this.dF(), this.dH(), btm.f);
   }

   @Override
   public boolean a(aqk $$0, double $$1, double $$2, double $$3, Set<btm> $$4, float $$5, float $$6) {
      dbk $$7 = new dbk(ja.a($$1, $$2, $$3));
      $$0.l().a(aqp.g, $$7, 1, this.al());
      this.ac();
      if (this.fH()) {
         this.a(true, true);
      }

      if ($$0 == this.dP()) {
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
   public void b(bsd $$0) {
      this.z().l().a(this, new abq($$0, 4));
   }

   @Override
   public void c(bsd $$0) {
      this.z().l().a(this, new abq($$0, 5));
   }

   @Override
   public void y() {
      if (this.c != null) {
         this.c.b(new adn(this.fZ()));
         this.J();
      }
   }

   public aqk z() {
      return (aqk)this.dP();
   }

   public boolean a(dca $$0) {
      boolean $$1 = this.N_();
      if (!this.e.a($$0)) {
         return false;
      } else {
         this.c.b(new acu(acu.e, (float)$$0.a()));
         if ($$0 == dca.d) {
            this.gm();
            this.ac();
            czl.a(this);
         } else {
            this.d(this);
            if ($$1) {
               czl.a(this.z(), this);
            }
         }

         this.y();
         this.fp();
         return true;
      }
   }

   @Override
   public boolean N_() {
      return this.e.b() == dca.d;
   }

   @Override
   public boolean f() {
      return this.e.b() == dca.b;
   }

   @Override
   public void a(wu $$0) {
      this.b($$0, false);
   }

   public void b(wu $$0, boolean $$1) {
      if (this.v($$1)) {
         this.c.a(new afl($$0, $$1), wb.a(() -> {
            if (this.v(false)) {
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
      if (this.gF()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String A() {
      return this.c.m() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(apz $$0) {
      this.df = $$0.b();
      this.de = $$0.c();
      this.cU = $$0.d();
      this.cV = $$0.e();
      this.dq = $$0.h();
      this.dr = $$0.i();
      this.ap().a(bX, (byte)$$0.f());
      this.ap().a(bY, (byte)$$0.g().a());
   }

   public apz B() {
      int $$0 = this.ap().a(bX);
      bss $$1 = bss.d.apply(this.ap().a(bY));
      return new apz(this.df, this.de, this.cU, this.cV, $$0, $$1, this.dq, this.dr);
   }

   public boolean C() {
      return this.cV;
   }

   public cmf D() {
      return this.cU;
   }

   private boolean v(boolean $$0) {
      return this.cU == cmf.c ? $$0 : true;
   }

   private boolean gF() {
      return this.cU == cmf.a;
   }

   public int E() {
      return this.de;
   }

   public void a(ajj $$0) {
      this.c.b(new aef($$0.a(), $$0.d().map(ajj.a::a)));
   }

   @Override
   protected int F() {
      return this.d.c(this.fX());
   }

   @Override
   public void G() {
      this.cW = ac.c();
   }

   public avl H() {
      return this.cI;
   }

   public avk I() {
      return this.da;
   }

   @Override
   protected void J() {
      if (this.N_()) {
         this.er();
         this.k(true);
      } else {
         super.J();
      }
   }

   public bsd K() {
      return (bsd)(this.cX == null ? this : this.cX);
   }

   @Override
   public void d(@Nullable bsd $$0) {
      bsd $$1 = this.K();
      this.cX = (bsd)($$0 == null ? this : $$0);
      if ($$1 != this.cX) {
         if (this.cX.dP() instanceof aqk $$2) {
            this.a($$2, this.cX.du(), this.cX.dw(), this.cX.dA(), Set.of(), this.dF(), this.dH());
         }

         if ($$0 != null) {
            this.z().l().a(this);
         }

         this.c.b(new aem(this.cX));
         this.c.l();
      }
   }

   @Override
   protected void L() {
      if (!this.cY) {
         super.L();
      }
   }

   @Override
   public void e(bsd $$0) {
      if (this.e.b() == dca.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long M() {
      return this.cW;
   }

   @Nullable
   public wu N() {
      return null;
   }

   @Override
   public void a(bqc $$0) {
      super.a($$0);
      this.gs();
   }

   public boolean O() {
      return this.cY;
   }

   public void P() {
      this.cY = false;
   }

   public aks Q() {
      return this.cH;
   }

   public void a(aqk $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      this.d(this);
      this.ac();
      if ($$0 == this.dP()) {
         this.c.a($$1, $$2, $$3, $$4, $$5);
      } else {
         aqk $$6 = this.z();
         epy $$7 = $$0.A_();
         this.c.b(new aeb(this.d($$0), (byte)3));
         this.c.b(new aca($$7.q(), $$7.r()));
         this.d.ah().d(this);
         $$6.a(this, bsd.c.e);
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
   public ja R() {
      return this.dm;
   }

   public float S() {
      return this.do;
   }

   public akj<dcd> T() {
      return this.dl;
   }

   public boolean U() {
      return this.dn;
   }

   public void a(akj<dcd> $$0, @Nullable ja $$1, float $$2, boolean $$3, boolean $$4) {
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
         this.dl = dcd.h;
         this.do = 0.0F;
         this.dn = false;
      }
   }

   public kc V() {
      return this.dj;
   }

   public void a(kc $$0) {
      this.dj = $$0;
   }

   public apy W() {
      return this.dk;
   }

   public void a(apy $$0) {
      this.dk = $$0;
   }

   @Override
   public void a(ave $$0, avg $$1, float $$2, float $$3) {
      this.c.b(new afi(lq.b.e($$0), $$1, this.du(), this.dw(), this.dA(), $$2, $$3, this.ah.g()));
   }

   @Override
   public cir a(cua $$0, boolean $$1, boolean $$2) {
      cir $$3 = super.a($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dP().b($$3);
         cua $$4 = $$3.p();
         if ($$2) {
            if (!$$4.e()) {
               this.a(avp.f.b($$4.g()), $$0.H());
            }

            this.a(avp.F);
         }

         return $$3;
      }
   }

   public arp X() {
      return this.dp;
   }

   public void c(aqk $$0) {
      this.a((dcd)$$0);
      this.e.a($$0);
   }

   @Nullable
   private static dca a(@Nullable tx $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? dca.a($$0.h($$1)) : null;
   }

   private dca b(@Nullable dca $$0) {
      dca $$1 = this.d.bf();
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
      dca $$1 = this.e.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean Y() {
      return this.dq;
   }

   public boolean b(aql $$0) {
      return $$0 == this ? false : this.dq || $$0.dq;
   }

   @Override
   public boolean a(dcd $$0, ja $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cua $$0) {
      am.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cmg $$1 = this.fY();
      cua $$2 = $$1.a($$0);
      this.cd.b($$1, $$1.k).ifPresent($$1x -> this.cd.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean Z() {
      return this.dr;
   }

   @Override
   public Optional<cln> aa() {
      return Optional.of(this.dt);
   }

   public void b(boolean $$0) {
      this.ds = $$0;
   }

   @Override
   public void a(cir $$0) {
      super.a($$0);
      bsd $$1 = $$0.s();
      if ($$1 != null) {
         am.S.a(this, $$0.p(), $$1);
      }
   }

   public void a(xl $$0) {
      this.dx = $$0;
   }

   @Nullable
   public xl ab() {
      return this.dx != null && this.dx.b() ? null : this.dx;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cw = (float)(aye.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dF());
      this.c.b(new acw(this));
   }

   @Override
   public boolean a(bsd $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         $$0.j(this);
         this.c.a(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
         if ($$0 instanceof bsy $$2) {
            for (brl $$3 : $$2.et()) {
               this.c.b(new afu($$0.al(), $$3, false));
            }
         }

         return true;
      }
   }

   @Override
   public void ac() {
      bsd $$0 = this.dc();
      super.ac();
      if ($$0 instanceof bsy $$1) {
         for (brl $$2 : $$1.et()) {
            this.c.b(new adz($$0.al(), $$2.c()));
         }
      }
   }

   public afw d(aqk $$0) {
      return new afw($$0.ae(), $$0.af(), ddf.a($$0.C()), this.e.b(), this.e.c(), $$0.ai(), $$0.B(), this.gx(), this.ax());
   }

   @Override
   public void c(ja $$0) {
      this.du = $$0;
   }

   public void ad() {
      this.du = null;
   }

   @Nullable
   public ja ae() {
      return this.du;
   }

   @Override
   public void a(boolean $$0, evz $$1) {
      super.a($$0, $$1);
      this.h($$1);
   }

   @Override
   protected float a(bsd $$0, float $$1, bqw $$2) {
      return czl.a(this.z(), this.eT(), $$0, $$2, $$1);
   }
}
