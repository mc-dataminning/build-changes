import com.google.common.net.InetAddresses;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class are extends cox {
   private static final Logger cC = LogUtils.getLogger();
   private static final int cD = 32;
   private static final int cE = 10;
   private static final int cF = 25;
   public static final double a = 1.0;
   public static final double b = 3.0;
   public static final int c = 2;
   public static final String d = "ender_pearls";
   public static final String e = "ender_pearl_dimension";
   private static final bwn cG = new bwn(akv.b("creative_mode_block_range"), 0.5, bwn.a.a);
   private static final bwn cH = new bwn(akv.b("creative_mode_entity_range"), 2.0, bwn.a.a);
   public asg f;
   public final MinecraftServer g;
   public final arf h;
   private final ald cI;
   private final awg cJ;
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
   private cou cU = cou.a;
   private aqv cV = aqv.a;
   private boolean cW = true;
   private long cX = af.c();
   @Nullable
   private bul cY;
   private boolean cZ;
   public boolean i;
   private final awf da;
   @Nullable
   private fba db;
   private int dc;
   private boolean dd;
   private int de = 2;
   private String df = "en_us";
   @Nullable
   private fba dg;
   @Nullable
   private fba dh;
   @Nullable
   private fba di;
   private kk dj = kk.a(0, 0, 0);
   private aqn dk = aqn.a;
   private aku<dgi> dl = dgi.i;
   @Nullable
   private ji dm;
   private boolean dn;
   private float do;
   private final asm dp;
   private boolean dq;
   private boolean dr;
   private boolean ds;
   private cob dt = new cob(0, 0, 0);
   @Nullable
   private ji du;
   private fba dv = fba.c;
   private cov dw = cov.b;
   private final Set<cqa> dx = new HashSet<>();
   private final csr dy = new csr() {
      @Override
      public void a(csc $$0, ka<cwp> $$1, cwp $$2, int[] $$3) {
         are.this.f.b(new acg($$0.l, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(csc $$0, int $$1, cwp $$2) {
         are.this.f.b(new aci($$0.l, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(csc $$0, cwp $$1) {
         are.this.f.b(new aes($$1.v()));
      }

      @Override
      public void a(csc $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(csc $$0, int $$1, int $$2) {
         are.this.f.b(new ach($$0.l, $$1, $$2));
      }
   };
   private final csq dz = new csq() {
      @Override
      public void a(csc $$0, int $$1, cwp $$2) {
         ctz $$3 = $$0.b($$1);
         if (!($$3 instanceof ctv)) {
            if ($$3.c == are.this.gi()) {
               ap.f.a(are.this, are.this.gi(), $$2);
            }
         }
      }

      @Override
      public void a(csc $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private xg dA;
   @Nullable
   public final Object j;
   private final ew dB = new ew() {
      @Override
      public boolean y_() {
         return are.this.y().O().b(dge.p);
      }

      @Override
      public boolean z_() {
         return true;
      }

      @Override
      public boolean c() {
         return true;
      }

      @Override
      public void a(wp $$0) {
         are.this.a($$0);
      }
   };
   private int dC;
   public boolean k;

   public are(MinecraftServer $$0, ard $$1, GameProfile $$2, aqo $$3) {
      super($$1, $$1.Z(), $$1.aa(), $$2);
      this.dp = $$0.a(this);
      this.h = $$0.b(this);
      this.da = new awf(($$1x, $$2x) -> $$0.aI().a($$1x, $$2x));
      this.g = $$0;
      this.cJ = $$0.ag().a((cox)this);
      this.cI = $$0.ag().g(this);
      this.b(this.a($$1, $$1.Z()).c(), 0.0F, 0.0F);
      this.a($$3);
      this.j = null;
   }

   @Override
   public ji a(ard $$0, ji $$1) {
      fav $$2 = this.a(bvt.a).a(fba.c);
      ji $$3 = $$1;
      if ($$0.G_().g() && $$0.p().aZ().k() != dgf.c) {
         int $$4 = Math.max(0, this.g.a($$0));
         int $$5 = ayz.a($$0.F_().b((double)$$1.u(), (double)$$1.w()));
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
         int $$10 = azh.a().a($$8);

         for (int $$11 = 0; $$11 < $$8; $$11++) {
            int $$12 = ($$10 + $$9 * $$11) % $$8;
            int $$13 = $$12 % ($$4 * 2 + 1);
            int $$14 = $$12 / ($$4 * 2 + 1);
            int $$15 = $$1.u() + $$13 - $$4;
            int $$16 = $$1.w() + $$14 - $$4;

            try {
               $$3 = aqx.a($$0, $$15, $$16);
               if ($$3 != null && this.a($$0, $$2.c($$3.c()))) {
                  return $$3;
               }
            } catch (Exception var25) {
               int $$18 = $$11;
               int $$19 = $$4;
               o $$20 = o.a(var25, "Searching for spawn");
               p $$21 = $$20.a("Spawn Lookup");
               $$21.a("Origin", $$1::toString);
               $$21.a("Radius", () -> Integer.toString($$19));
               $$21.a("Candidate", () -> "[" + $$15 + "," + $$16 + "]");
               $$21.a("Progress", () -> $$18 + " out of " + $$8);
               throw new z($$20);
            }
         }

         $$3 = $$1;
      }

      while (!this.a($$0, $$2.c($$3.c())) && $$3.v() < $$0.an()) {
         $$3 = $$3.d();
      }

      while (this.a($$0, $$2.c($$3.e().c())) && $$3.v() > $$0.L_() + 1) {
         $$3 = $$3.e();
      }

      return $$3;
   }

   private boolean a(ard $$0, fav $$1) {
      return $$0.a(this, $$1, true);
   }

   private int t(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         cob.a.parse(new Dynamic(ue.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(cC::error).ifPresent($$0x -> this.dt = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         tq $$1 = $$0.p("enteredNetherPosition");
         this.dh = new fba($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.i = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.da.a($$0.p("recipeBook"), $$0x -> this.g.aI().b($$0x).isPresent());
      }

      if (this.fR()) {
         this.fS();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.dm = new ji($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.dn = $$0.q("SpawnForced");
         this.do = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.dl = dgi.h.parse(ue.a, $$0.c("SpawnDimension")).resultOrPartial(cC::error).orElse(dgi.i);
         }
      }

      this.ds = $$0.q("spawn_extra_particles_on_fall");
      un $$2 = $$0.c("raid_omen_position");
      if ($$2 != null) {
         ji.a.parse(ue.a, $$2).resultOrPartial(cC::error).ifPresent($$0x -> this.du = $$0x);
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      cob.a.encodeStart(ue.a, this.dt).resultOrPartial(cC::error).ifPresent($$1x -> $$0.a("warden_spawn_tracker", $$1x));
      this.m($$0);
      $$0.a("seenCredits", this.i);
      if (this.dh != null) {
         tq $$1 = new tq();
         $$1.a("x", this.dh.d);
         $$1.a("y", this.dh.e);
         $$1.a("z", this.dh.f);
         $$0.a("enteredNetherPosition", $$1);
      }

      this.k($$0);
      $$0.a("recipeBook", this.da.b());
      $$0.a("Dimension", this.dV().ai().a().toString());
      if (this.dm != null) {
         $$0.a("SpawnX", this.dm.u());
         $$0.a("SpawnY", this.dm.v());
         $$0.a("SpawnZ", this.dm.w());
         $$0.a("SpawnForced", this.dn);
         $$0.a("SpawnAngle", this.do);
         akv.a.encodeStart(ue.a, this.dl.a()).resultOrPartial(cC::error).ifPresent($$1x -> $$0.a("SpawnDimension", $$1x));
      }

      $$0.a("spawn_extra_particles_on_fall", this.ds);
      if (this.du != null) {
         ji.a.encodeStart(ue.a, this.du).resultOrPartial(cC::error).ifPresent($$1x -> $$0.a("raid_omen_position", $$1x));
      }

      this.l($$0);
   }

   private void k(tq $$0) {
      bul $$1 = this.df();
      bul $$2 = this.dk();
      if ($$2 != null && $$1 != this && $$1.de()) {
         tq $$3 = new tq();
         tq $$4 = new tq();
         $$1.e($$4);
         $$3.a("Attach", $$2.cG());
         $$3.a("Entity", $$4);
         $$0.a("RootVehicle", $$3);
      }
   }

   public void a(Optional<tq> $$0) {
      if ($$0.isPresent() && $$0.get().b("RootVehicle", 10) && this.dV() instanceof ard $$1) {
         tq $$2 = $$0.get().p("RootVehicle");
         bul $$3 = bus.a($$2.p("Entity"), $$1, bur.r, $$1x -> !$$1.c($$1x) ? null : $$1x);
         if ($$3 == null) {
            return;
         }

         UUID $$4;
         if ($$2.b("Attach")) {
            $$4 = $$2.a("Attach");
         } else {
            $$4 = null;
         }

         if ($$3.cG().equals($$4)) {
            this.a($$3, true);
         } else {
            for (bul $$6 : $$3.dc()) {
               if ($$6.cG().equals($$4)) {
                  this.a($$6, true);
                  break;
               }
            }
         }

         if (!this.bZ()) {
            cC.warn("Couldn't reattach entity to player");
            $$3.at();

            for (bul $$7 : $$3.dc()) {
               $$7.at();
            }
         }
      }
   }

   private void l(tq $$0) {
      if (!this.dx.isEmpty()) {
         tw $$1 = new tw();

         for (cqa $$2 : this.dx) {
            if ($$2.dQ()) {
               cC.warn("Trying to save removed ender pearl, skipping");
            } else {
               tq $$3 = new tq();
               $$2.e($$3);
               akv.a.encodeStart(ue.a, $$2.dV().ai().a()).resultOrPartial(cC::error).ifPresent($$1x -> $$3.a("ender_pearl_dimension", $$1x));
               $$1.add($$3);
            }
         }

         $$0.a("ender_pearls", $$1);
      }
   }

   public void b(Optional<tq> $$0) {
      if ($$0.isPresent() && $$0.get().b("ender_pearls", 9) && $$0.get().c("ender_pearls") instanceof tw $$2) {
         $$2.forEach($$0x -> {
            if ($$0x instanceof tq $$1 && $$1.e("ender_pearl_dimension")) {
               Optional<aku<dgi>> $$2x = dgi.h.parse(ue.a, $$1.c("ender_pearl_dimension")).resultOrPartial(cC::error);
               if ($$2x.isEmpty()) {
                  cC.warn("No dimension defined for ender pearl, skipping");
                  return;
               }

               ard $$3 = this.dV().p().a($$2x.get());
               if ($$3 != null) {
                  bul $$4 = bus.a($$1, $$3, bur.r, $$1x -> !$$3.c($$1x) ? null : $$1x);
                  if ($$4 != null) {
                     a($$3, $$4.dx());
                  } else {
                     cC.warn("Failed to spawn player ender pearl in level ({}), skipping", $$2x.get());
                  }
               } else {
                  cC.warn("Trying to load ender pearl without level ({}) being loaded, skipping", $$2x.get());
               }
            }
         });
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gs();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.ct = ayz.a((float)$$0 / $$1, 0.0F, $$2);
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
   public void a(cwp $$0, int $$1) {
      super.a($$0, $$1);
      this.cT = -1;
   }

   private void a(csc $$0) {
      $$0.a(this.dz);
      $$0.a(this.dy);
   }

   public void d() {
      this.a(this.cc);
   }

   @Override
   public void i_() {
      super.i_();
      this.f.b(adq.a);
   }

   @Override
   public void j_() {
      super.j_();
      this.f.b(new adp(this.eQ()));
   }

   @Override
   public void a(dwx $$0) {
      ap.e.a(this, $$0);
   }

   @Override
   protected cwm g() {
      return new cxp(this);
   }

   @Override
   public void h() {
      this.gK();
      this.h.a();
      this.dt.a();
      if (this.aj > 0) {
         this.aj--;
      }

      this.cd.d();
      if (!this.cd.b(this)) {
         this.p();
         this.cd = this.cc;
      }

      bul $$0 = this.L();
      if ($$0 != this) {
         if ($$0.bL()) {
            this.a($$0.dA(), $$0.dC(), $$0.dG(), $$0.dL(), $$0.dN());
            this.y().m().a(this);
            if (this.fZ()) {
               this.d(this);
            }
         } else {
            this.d(this);
         }
      }

      ap.x.a(this);
      if (this.db != null) {
         ap.v.a(this, this.db, this.af - this.dc);
      }

      this.l();
      this.m();
      this.gR();
      this.cI.b(this);
   }

   private void gR() {
      bwl $$0 = this.g(bwp.g);
      if ($$0 != null) {
         if (this.b()) {
            $$0.a(cG);
         } else {
            $$0.e(cG);
         }
      }

      bwl $$1 = this.g(bwp.j);
      if ($$1 != null) {
         if (this.b()) {
            $$1.a(cH);
         } else {
            $$1.e(cH);
         }
      }
   }

   public void i() {
      try {
         if (!this.Z_() || !this.do()) {
            super.h();
         }

         for (int $$0 = 0; $$0 < this.gi().b(); $$0++) {
            cwp $$1 = this.gi().a($$0);
            if (!$$1.f()) {
               this.j($$1);
            }
         }

         if (this.eD() != this.cQ || this.cR != this.ce.a() || this.ce.c() == 0.0F != this.cS) {
            this.f.b(new afa(this.eD(), this.ce.a(), this.ce.c()));
            this.cQ = this.eD();
            this.cR = this.ce.a();
            this.cS = this.ce.c() == 0.0F;
         }

         if (this.eD() + this.fw() != this.cK) {
            this.cK = this.eD() + this.fw();
            this.a(fci.g, ayz.f(this.cK));
         }

         if (this.ce.a() != this.cL) {
            this.cL = this.ce.a();
            this.a(fci.h, ayz.f((float)this.cL));
         }

         if (this.ct() != this.cM) {
            this.cM = this.ct();
            this.a(fci.i, ayz.f((float)this.cM));
         }

         if (this.eP() != this.cN) {
            this.cN = this.eP();
            this.a(fci.j, ayz.f((float)this.cN));
         }

         if (this.cs != this.cP) {
            this.cP = this.cs;
            this.a(fci.k, ayz.f((float)this.cP));
         }

         if (this.cr != this.cO) {
            this.cO = this.cr;
            this.a(fci.l, ayz.f((float)this.cO));
         }

         if (this.cs != this.cT) {
            this.cT = this.cs;
            this.f.b(new aez(this.ct, this.cs, this.cr));
         }

         if (this.af % 20 == 0) {
            ap.q.a(this);
         }
      } catch (Throwable var4) {
         o $$3 = o.a(var4, "Ticking player");
         p $$4 = $$3.a("Player being ticked");
         this.a($$4);
         throw new z($$3);
      }
   }

   private void j(cwp $$0) {
      eur $$1 = $$0.a(kv.L);
      eut $$2 = cxc.a($$1, this.dV());
      if ($$2 != null) {
         yw<?> $$3 = $$2.a($$1, this);
         if ($$3 != null) {
            this.f.b($$3);
         }
      }
   }

   @Override
   protected void j() {
      if (this.dV().am() == bsh.a && this.y().O().b(dge.k)) {
         if (this.af % 20 == 0) {
            if (this.eD() < this.eS()) {
               this.c(1.0F);
            }

            float $$0 = this.ce.c();
            if ($$0 < 20.0F) {
               this.ce.b($$0 + 1.0F);
            }
         }

         if (this.af % 10 == 0 && this.ce.b()) {
            this.ce.a(this.ce.a() + 1);
         }
      }
   }

   @Override
   public void k() {
      if (this.eD() > 0.0F && this.dg != null) {
         ap.X.a(this, this.dg);
      }

      this.dg = null;
      super.k();
   }

   public void l() {
      if (this.Z > 0.0F && this.dg == null) {
         this.dg = this.dt();
         if (this.cy != null && this.cy.e <= this.dg.e) {
            ap.ae.a(this, this.cy, this.cz);
         }
      }
   }

   @Override
   public void m() {
      if (this.dk() != null && this.dk().bx()) {
         if (this.di == null) {
            this.di = this.dt();
         } else {
            ap.Y.a(this, this.di);
         }
      }

      if (this.di != null && (this.dk() == null || !this.dk().bx())) {
         this.di = null;
      }
   }

   private void a(fci $$0, int $$1) {
      this.gy().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(btb $$0) {
      this.a(ebt.p);
      boolean $$1 = this.y().O().b(dge.n);
      if ($$1) {
         wp $$2 = this.eQ().a();
         this.f.a(new adr(this.ar(), $$2), vw.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            wp $$3x = wp.a("death.attack.message_too_long", wp.b($$2x).a(n.o));
            wp $$4x = wp.a("death.attack.even_more_magic", this.p_()).a($$1xx -> $$1xx.a(new wv(wv.a.a, $$3x)));
            return new adr(this.ar(), $$4x);
         }));
         fch $$3 = this.cr();
         if ($$3 == null || $$3.k() == fch.b.a) {
            this.g.ag().a($$2, false);
         } else if ($$3.k() == fch.b.c) {
            this.g.ag().a(this, $$2);
         } else if ($$3.k() == fch.b.d) {
            this.g.ag().b(this, $$2);
         }
      } else {
         this.f.b(new adr(this.ar(), wo.a));
      }

      this.gx();
      if (this.y().O().b(dge.O)) {
         this.gS();
      }

      if (!this.Z_()) {
         this.b(this.y(), $$0);
      }

      this.gy().a(fci.d, this, fcd::b);
      bvh $$4 = this.eR();
      if ($$4 != null) {
         this.b(awk.h.b($$4.aq()));
         $$4.a(this, $$0);
         this.f($$4);
      }

      this.dV().a(this, (byte)3);
      this.a(awk.N);
      this.a(awk.i.b(awk.m));
      this.a(awk.i.b(awk.n));
      this.aH();
      this.k(0);
      this.c(false);
      this.eQ().c();
      this.c(Optional.of(jq.a(this.dV().ai(), this.dv())));
      this.w(false);
   }

   private void gS() {
      fav $$0 = new fav(this.dv()).c(32.0, 10.0, 32.0);
      this.dV().a(bvj.class, $$0, buq.f).stream().filter($$0x -> $$0x instanceof bvm).forEach($$0x -> ((bvm)$$0x).a_(this.y(), this));
   }

   @Override
   public void a(bul $$0, btb $$1) {
      if ($$0 != this) {
         super.a($$0, $$1);
         this.gy().a(fci.f, this, fcd::b);
         if ($$0 instanceof cox) {
            this.a(awk.Q);
            this.gy().a(fci.e, this, fcd::b);
         } else {
            this.a(awk.O);
         }

         this.a(this, $$0, fci.m);
         this.a($$0, this, fci.n);
         ap.c.a(this, $$0, $$1);
      }
   }

   private void a(fce $$0, fce $$1, fci[] $$2) {
      fca $$3 = this.gy().e($$1.cI());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gy().a($$2[$$4], $$0, fcd::b);
         }
      }
   }

   @Override
   public boolean a(ard $$0, btb $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         bul $$3 = $$1.d();
         if ($$3 instanceof cox $$4 && !this.a($$4)) {
            return false;
         }

         if ($$3 instanceof cpe $$5 && $$5.p() instanceof cox $$7 && !this.a($$7)) {
            return false;
         }

         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(cox $$0) {
      return !this.gT() ? false : super.a($$0);
   }

   private boolean gT() {
      return this.g.ac();
   }

   public etz a(boolean $$0, etz.a $$1) {
      ji $$2 = this.T();
      float $$3 = this.U();
      boolean $$4 = this.W();
      ard $$5 = this.g.a(this.V());
      if ($$5 != null && $$2 != null) {
         Optional<are.a> $$6 = a($$5, $$2, $$3, $$4, $$0);
         if ($$6.isPresent()) {
            are.a $$7 = $$6.get();
            return new etz($$5, $$7.a(), fba.c, $$7.b(), 0.0F, $$1);
         } else {
            return etz.a(this.g.J(), this, $$1);
         }
      } else {
         return new etz(this.g.J(), this, $$1);
      }
   }

   private static Optional<are.a> a(ard $$0, ji $$1, float $$2, boolean $$3, boolean $$4) {
      dwx $$5 = $$0.a_($$1);
      djm $$6 = $$5.b();
      if ($$6 instanceof dpz && ($$3 || $$5.c(dpz.d) > 0) && dpz.a($$0)) {
         Optional<fba> $$7 = dpz.a(bus.bR, $$0, $$1);
         if (!$$3 && $$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.b(dpz.d, Integer.valueOf($$5.c(dpz.d) - 1)), 3);
         }

         return $$7.map($$1x -> are.a.a($$1x, $$1));
      } else if ($$6 instanceof djf && djf.a($$0)) {
         return djf.a(bus.bR, $$0, $$1, $$5.c(djf.aF), $$2).map($$1x -> are.a.a($$1x, $$1));
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dwx $$9 = $$0.a_($$1.d());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new are.a(new fba((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5), $$2)) : Optional.empty();
      }
   }

   public void n() {
      this.ao();
      this.y().a(this, bul.d.e);
      if (!this.k) {
         this.k = true;
         this.f.b(new act(act.f, 0.0F));
         this.i = true;
      }
   }

   @Nullable
   public are a(etz $$0) {
      if (this.dQ()) {
         return null;
      } else {
         if ($$0.g()) {
            this.f.b(new act(act.b, 0.0F));
         }

         ard $$1 = $$0.b();
         ard $$2 = this.y();
         aku<dgi> $$3 = $$2.ai();
         if (!$$0.h()) {
            this.ae();
         }

         if ($$1.ai() == $$3) {
            this.f.a(bvu.a($$0), $$0.i());
            this.f.l();
            $$0.j().onTransition(this);
            return this;
         } else {
            this.cZ = true;
            evb $$4 = $$1.D_();
            this.f.b(new aee(this.b($$1), (byte)3));
            this.f.b(new aby($$4.q(), $$4.r()));
            avd $$5 = this.g.ag();
            $$5.e(this);
            $$2.a(this, bul.d.e);
            this.dS();
            bot $$6 = bos.a();
            $$6.a("moving");
            if ($$3 == dgi.i && $$1.ai() == dgi.j) {
               this.dh = this.dt();
            }

            $$6.c();
            $$6.a("placing");
            this.a($$1);
            this.f.a(bvu.a($$0), $$0.i());
            this.f.l();
            $$1.d(this);
            $$6.c();
            this.g($$2);
            this.fF();
            this.f.b(new adn(this.gj()));
            $$5.a(this, $$1);
            $$5.f(this);
            $$5.d(this);
            $$0.j().onTransition(this);
            this.cT = -1;
            this.cQ = -1.0F;
            this.cR = -1;
            return this;
         }
      }
   }

   @Override
   public void a(float $$0, float $$1) {
      this.f.b(new adw($$0, $$1));
   }

   private void g(ard $$0) {
      aku<dgi> $$1 = $$0.ai();
      aku<dgi> $$2 = this.dV().ai();
      ap.w.a(this, $$1, $$2);
      if ($$1 == dgi.j && $$2 == dgi.i && this.dh != null) {
         ap.D.a(this, this.dh);
      }

      if ($$2 != dgi.j) {
         this.dh = null;
      }
   }

   @Override
   public boolean a(are $$0) {
      if ($$0.Z_()) {
         return this.L() == this;
      } else {
         return this.Z_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bul $$0, int $$1) {
      super.a($$0, $$1);
      this.cd.d();
   }

   @Override
   public Either<cox.a, baf> a(ji $$0) {
      jn $$1 = this.dV().a_($$0).c(dnk.aF);
      if (this.fR() || !this.bL()) {
         return Either.left(cox.a.e);
      } else if (!this.dV().G_().j()) {
         return Either.left(cox.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cox.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cox.a.d);
      } else {
         this.a(this.dV().ai(), $$0, this.dL(), false, true);
         if (this.dV().V()) {
            return Either.left(cox.a.b);
         } else {
            if (!this.b()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               fba $$4 = fba.c($$0);
               List<cly> $$5 = this.dV()
                  .a(
                     cly.class,
                     new fav($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0),
                     $$0x -> $$0x.a(this.y(), this)
                  );
               if (!$$5.isEmpty()) {
                  return Either.left(cox.a.f);
               }
            }

            Either<cox.a, baf> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(awk.ap);
               ap.r.a(this);
            });
            if (!this.y().e()) {
               this.a(wp.c("sleep.not_possible"), true);
            }

            ((ard)this.dV()).f();
            return $$6;
         }
      }
   }

   @Override
   public void b(ji $$0) {
      this.a(awk.i.b(awk.n));
      super.b($$0);
   }

   private boolean a(ji $$0, jn $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(ji $$0) {
      fba $$1 = fba.c($$0);
      return Math.abs(this.dA() - $$1.a()) <= 3.0 && Math.abs(this.dC() - $$1.b()) <= 2.0 && Math.abs(this.dG() - $$1.c()) <= 3.0;
   }

   private boolean b(ji $$0, jn $$1) {
      ji $$2 = $$0.d();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fR()) {
         this.y().m().a(this, new abo(this, 2));
      }

      super.a($$0, $$1);
      if (this.f != null) {
         this.f.a(this.dA(), this.dC(), this.dG(), this.dL(), this.dN());
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.bQ();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public boolean a(ard $$0, btb $$1) {
      return super.a($$0, $$1) || this.Q() && !$$1.a(bte.m) || !this.gJ();
   }

   @Override
   protected void a(double $$0, boolean $$1, dwx $$2, ji $$3) {
      if (this.ds && $$1 && this.Z > 0.0F) {
         fba $$4 = $$3.b().b(0.0, 0.5, 0.0);
         int $$5 = (int)ayz.a(50.0F * this.Z, 0.0F, 200.0F);
         this.y().a(new ll(lt.b, $$2), $$4.d, $$4.e, $$4.f, $$5, 0.3F, 0.3F, 0.3F, 0.15F);
         this.ds = false;
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(ard $$0, ji $$1) {
      if (!this.Z_()) {
         super.b($$0, $$1);
      }
   }

   @Override
   public void b_(@Nullable bul $$0) {
      super.b_($$0);
      this.cy = this.dt();
      this.cz = $$0;
      this.x($$0 != null && $$0.aq() == bus.bG);
   }

   @Override
   protected void o() {
      if (this.dV().u().i()) {
         super.o();
      }
   }

   @Override
   public void a(dvm $$0, boolean $$1) {
      this.f.b(new abu(this.dV(), $$0.aA_()));
      this.f.b(new adl($$0.aA_(), $$1));
   }

   private void gU() {
      this.dC = this.dC % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bsm $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.cd != this.cc) {
            this.p();
         }

         this.gU();
         csc $$1 = $$0.createMenu(this.dC, this.gi(), this);
         if ($$1 == null) {
            if (this.Z_()) {
               this.a(wp.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.f.b(new adk($$1.l, $$1.a(), $$0.p_()));
            this.a($$1);
            this.cd = $$1;
            return OptionalInt.of(this.dC);
         }
      }
   }

   @Override
   public void a(int $$0, dfg $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.f.b(new adf($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(cjc $$0, bsd $$1) {
      if (this.cd != this.cc) {
         this.p();
      }

      this.gU();
      int $$2 = $$0.af_();
      this.f.b(new acu(this.dC, $$2, $$0.ar()));
      this.cd = new cte(this.dC, this.gi(), $$1, $$0, $$2);
      this.a(this.cd);
   }

   @Override
   public void a(cwp $$0, bsj $$1) {
      if ($$0.b(kv.T)) {
         if (cyl.a($$0, this.A(), this)) {
            this.cd.d();
         }

         this.f.b(new adj($$1));
      }
   }

   @Override
   public void a(duj $$0) {
      this.f.b(abs.a($$0, dtz::e));
   }

   @Override
   public void p() {
      this.f.b(new acf(this.cd.l));
      this.q();
   }

   @Override
   public void q() {
      this.cd.a(this);
      this.cc.a(this.cd);
      this.cd = this.cc;
   }

   @Override
   public void r() {
      double $$0 = this.dA();
      double $$1 = this.dC();
      double $$2 = this.dG();
      super.r();
      this.q(this.dA() - $$0, this.dC() - $$1, this.dG() - $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (!this.bZ() && !r($$0, $$1, $$2)) {
         if (this.ck()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(awk.C, $$3);
               this.G(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(awv.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(awk.w, $$4);
               this.G(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.bj()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(awk.s, $$5);
               this.G(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.q_()) {
            if ($$1 > 0.0) {
               this.a(awk.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aJ()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.cj()) {
                  this.a(awk.r, $$6);
                  this.G(0.1F * (float)$$6 * 0.01F);
               } else if (this.ci()) {
                  this.a(awk.q, $$6);
                  this.G(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(awk.p, $$6);
                  this.G(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fJ()) {
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

   private void q(double $$0, double $$1, double $$2) {
      if (this.bZ() && !r($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         bul $$4 = this.dk();
         if ($$4 instanceof cqw) {
            this.a(awk.x, $$3);
         } else if ($$4 instanceof cqu) {
            this.a(awk.y, $$3);
         } else if ($$4 instanceof chp) {
            this.a(awk.z, $$3);
         } else if ($$4 instanceof cjc) {
            this.a(awk.A, $$3);
         } else if ($$4 instanceof cml) {
            this.a(awk.D, $$3);
         }
      }
   }

   private static boolean r(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(awh<?> $$0, int $$1) {
      this.cJ.b(this, $$0, $$1);
      this.gy().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(awh<?> $$0) {
      this.cJ.a(this, $$0, 0);
      this.gy().a($$0, this, fcd::c);
   }

   @Override
   public int a(Collection<dbj<?>> $$0) {
      return this.da.a($$0, this);
   }

   @Override
   public void a(dbj<?> $$0, List<cwp> $$1) {
      ap.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<aku<dbe<?>>> $$0) {
      List<dbj<?>> $$1 = $$0.stream().flatMap($$0x -> this.g.aI().b($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<dbj<?>> $$0) {
      return this.da.b($$0, this);
   }

   @Override
   public void s() {
      super.s();
      this.a(awk.E);
      if (this.cj()) {
         this.G(0.2F);
      } else {
         this.G(0.05F);
      }
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cT = -1;
   }

   @Override
   public void t() {
      this.dd = true;
      this.bP();
      if (this.fR()) {
         this.a(true, false);
      }
   }

   @Override
   public boolean u() {
      return this.dd;
   }

   public void v() {
      this.cQ = -1.0E8F;
   }

   @Override
   public void a(wp $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void w() {
      if (!this.by.f() && this.fz()) {
         this.f.b(new acp(this, (byte)9));
         super.w();
      }
   }

   @Override
   public void a(fj.a $$0, fba $$1) {
      super.a($$0, $$1);
      this.f.b(new adu($$0, $$1.d, $$1.e, $$1.f));
   }

   public void a(fj.a $$0, bul $$1, fj.a $$2) {
      fba $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.f.b(new adu($$0, $$1, $$2));
   }

   public void a(are $$0, boolean $$1) {
      this.dt = $$0.dt;
      this.dA = $$0.dA;
      this.h.a($$0.h.b(), $$0.h.c());
      this.x();
      if ($$1) {
         this.eY().b($$0.eY());
         this.eY().c($$0.eY());
         this.x($$0.eD());
         this.ce = $$0.ce;

         for (btq $$2 : $$0.eA()) {
            this.a(new btq($$2));
         }

         this.gi().a($$0.gi());
         this.cr = $$0.cr;
         this.cs = $$0.cs;
         this.ct = $$0.ct;
         this.q($$0.gd());
         this.as = $$0.as;
      } else {
         this.eY().b($$0.eY());
         this.x(this.eS());
         if (this.y().O().b(dge.d) || $$0.Z_()) {
            this.gi().a($$0.gi());
            this.cr = $$0.cr;
            this.cs = $$0.cs;
            this.ct = $$0.ct;
            this.q($$0.gd());
         }
      }

      this.cu = $$0.cu;
      this.cb = $$0.cb;
      this.au().a(bW, $$0.au().a(bW));
      this.cT = -1;
      this.cQ = -1.0F;
      this.cR = -1;
      this.da.a($$0.da);
      this.i = $$0.i;
      this.dh = $$0.dh;
      this.dk = $$0.dk;
      this.i($$0.gA());
      this.j($$0.gB());
      this.c($$0.gI());
   }

   @Override
   protected void a(btq $$0, @Nullable bul $$1) {
      super.a($$0, $$1);
      this.f.b(new afz(this.ar(), $$0, true));
      if ($$0.a(bts.y)) {
         this.dc = this.af;
         this.db = this.dt();
      }

      ap.B.a(this, $$1);
   }

   @Override
   protected void a(btq $$0, boolean $$1, @Nullable bul $$2) {
      super.a($$0, $$1, $$2);
      this.f.b(new afz(this.ar(), $$0, false));
      ap.B.a(this, $$2);
   }

   @Override
   protected void c(Collection<btq> $$0) {
      super.c($$0);

      for (btq $$1 : $$0) {
         this.f.b(new aec(this.ar(), $$1.c()));
         if ($$1.a(bts.y)) {
            this.db = null;
         }
      }

      ap.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.f.a(new bvu(new fba($$0, $$1, $$2), fba.c, 0.0F, 0.0F), bvv.a(bvv.l, bvv.k));
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.f.a(new bvu(new fba($$0, $$1, $$2), fba.c, 0.0F, 0.0F), bvv.j);
   }

   @Override
   public boolean a(ard $$0, double $$1, double $$2, double $$3, Set<bvv> $$4, float $$5, float $$6, boolean $$7) {
      if (this.fR()) {
         this.a(true, true);
      }

      if ($$7) {
         this.d(this);
      }

      boolean $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$8) {
         this.q($$4.contains(bvv.d) ? this.cA() + $$5 : $$5);
      }

      return $$8;
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      super.e($$0, $$1, $$2);
      this.f.l();
   }

   @Override
   public void b(bul $$0) {
      this.y().m().a(this, new abo($$0, 4));
   }

   @Override
   public void c(bul $$0) {
      this.y().m().a(this, new abo($$0, 5));
   }

   @Override
   public void x() {
      if (this.f != null) {
         this.f.b(new adn(this.gj()));
         this.K();
      }
   }

   public ard y() {
      return (ard)this.dV();
   }

   public boolean a(dgf $$0) {
      boolean $$1 = this.Z_();
      if (!this.h.a($$0)) {
         return false;
      } else {
         this.f.b(new act(act.e, (float)$$0.a()));
         if ($$0 == dgf.d) {
            this.gx();
            this.ae();
            ddb.a(this);
         } else {
            this.d(this);
            if ($$1) {
               ddb.a(this.y(), this);
            }
         }

         this.x();
         this.fx();
         return true;
      }
   }

   @Override
   public boolean Z_() {
      return this.h.b() == dgf.d;
   }

   @Override
   public boolean b() {
      return this.h.b() == dgf.b;
   }

   public ew z() {
      return this.dB;
   }

   public ex A() {
      return new ex(this.z(), this.dt(), this.bU(), this.y(), this.G(), this.al().getString(), this.p_(), this.g, this);
   }

   public void a(wp $$0) {
      this.b($$0, false);
   }

   public void b(wp $$0, boolean $$1) {
      if (this.y($$1)) {
         this.f.a(new afq($$0, $$1), vw.a(() -> {
            if (this.y(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               wp $$3 = wp.b($$2).a(n.o);
               return new afq(wp.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(xe $$0, boolean $$1, wl.a $$2) {
      if (this.gV()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String B() {
      return this.f.m() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(aqo $$0) {
      this.df = $$0.b();
      this.de = $$0.c();
      this.cU = $$0.d();
      this.cW = $$0.e();
      this.dq = $$0.h();
      this.dr = $$0.i();
      this.cV = $$0.j();
      this.au().a(bW, (byte)$$0.f());
      this.au().a(bX, (byte)$$0.g().b());
   }

   public aqo C() {
      int $$0 = this.au().a(bW);
      bvb $$1 = bvb.d.apply(this.au().a(bX));
      return new aqo(this.df, this.de, this.cU, this.cW, $$0, $$1, this.dq, this.dr, this.cV);
   }

   public boolean D() {
      return this.cW;
   }

   public cou E() {
      return this.cU;
   }

   private boolean y(boolean $$0) {
      return this.cU == cou.c ? $$0 : true;
   }

   private boolean gV() {
      return this.cU == cou.a;
   }

   @Override
   public int F() {
      return this.de;
   }

   public void a(ajs $$0) {
      this.f.b(new aei($$0.a(), $$0.d().map(ajs.a::a)));
   }

   @Override
   public int G() {
      return this.g.c(this.gh());
   }

   @Override
   public void H() {
      this.cX = af.c();
   }

   public awg I() {
      return this.cJ;
   }

   public awf J() {
      return this.da;
   }

   @Override
   protected void K() {
      if (this.Z_()) {
         this.ey();
         this.k(true);
      } else {
         super.K();
      }
   }

   public bul L() {
      return (bul)(this.cY == null ? this : this.cY);
   }

   @Override
   public void d(@Nullable bul $$0) {
      bul $$1 = this.L();
      this.cY = (bul)($$0 == null ? this : $$0);
      if ($$1 != this.cY) {
         if (this.cY.dV() instanceof ard $$2) {
            this.a($$2, this.cY.dA(), this.cY.dC(), this.cY.dG(), Set.of(), this.dL(), this.dN(), false);
         }

         if ($$0 != null) {
            this.y().m().a(this);
         }

         this.f.b(new aep(this.cY));
         this.f.l();
      }
   }

   @Override
   protected void M() {
      if (!this.cZ) {
         super.M();
      }
   }

   @Override
   public void e(bul $$0) {
      if (this.h.b() == dgf.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long N() {
      return this.cX;
   }

   @Nullable
   public wp O() {
      return null;
   }

   public int P() {
      return 0;
   }

   @Override
   public void a(bsj $$0) {
      super.a($$0);
      this.gD();
   }

   public boolean Q() {
      return this.cZ;
   }

   public void R() {
      this.cZ = false;
   }

   public ald S() {
      return this.cI;
   }

   @Nullable
   public ji T() {
      return this.dm;
   }

   public float U() {
      return this.do;
   }

   public aku<dgi> V() {
      return this.dl;
   }

   public boolean W() {
      return this.dn;
   }

   public void b(are $$0) {
      this.a($$0.V(), $$0.T(), $$0.U(), $$0.W(), false);
   }

   public void a(aku<dgi> $$0, @Nullable ji $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.dm) && $$0.equals(this.dl);
         if ($$4 && !$$5) {
            this.a(wp.c("block.minecraft.set_spawn"));
         }

         this.dm = $$1;
         this.dl = $$0;
         this.do = $$2;
         this.dn = $$3;
      } else {
         this.dm = null;
         this.dl = dgi.i;
         this.do = 0.0F;
         this.dn = false;
      }
   }

   public kk X() {
      return this.dj;
   }

   public void a(kk $$0) {
      this.dj = $$0;
   }

   public aqn Y() {
      return this.dk;
   }

   public void a(aqn $$0) {
      this.dk = $$0;
   }

   @Override
   public void a(avz $$0, awb $$1, float $$2, float $$3) {
      this.f.b(new afn(mb.b.e($$0), $$1, this.dA(), this.dC(), this.dG(), $$2, $$3, this.ae.g()));
   }

   @Override
   public clc a(cwp $$0, boolean $$1, boolean $$2) {
      clc $$3 = this.b($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dV().b($$3);
         cwp $$4 = $$3.l();
         if ($$2) {
            if (!$$4.f()) {
               this.a(awk.f.b($$4.h()), $$0.M());
            }

            this.a(awk.F);
         }

         return $$3;
      }
   }

   @Nullable
   private clc b(cwp $$0, boolean $$1, boolean $$2) {
      if ($$0.f()) {
         return null;
      } else {
         double $$3 = this.dE() - 0.3F;
         clc $$4 = new clc(this.dV(), this.dA(), $$3, this.dG(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.ae.i() * 0.5F;
            float $$6 = this.ae.i() * (float) (Math.PI * 2);
            $$4.n((double)(-ayz.a($$6) * $$5), 0.2F, (double)(ayz.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = ayz.a(this.dN() * (float) (Math.PI / 180.0));
            float $$9 = ayz.b(this.dN() * (float) (Math.PI / 180.0));
            float $$10 = ayz.a(this.dL() * (float) (Math.PI / 180.0));
            float $$11 = ayz.b(this.dL() * (float) (Math.PI / 180.0));
            float $$12 = this.ae.i() * (float) (Math.PI * 2);
            float $$13 = 0.02F * this.ae.i();
            $$4.n(
               (double)(-$$10 * $$9 * 0.3F) + Math.cos((double)$$12) * (double)$$13,
               (double)(-$$8 * 0.3F + 0.1F + (this.ae.i() - this.ae.i()) * 0.1F),
               (double)($$11 * $$9 * 0.3F) + Math.sin((double)$$12) * (double)$$13
            );
         }

         return $$4;
      }
   }

   public asm Z() {
      return this.dp;
   }

   public void a(ard $$0) {
      this.a((dgi)$$0);
      this.h.a($$0);
   }

   @Nullable
   private static dgf a(@Nullable tq $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? dgf.a($$0.h($$1)) : null;
   }

   private dgf b(@Nullable dgf $$0) {
      dgf $$1 = this.g.bd();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.g.u();
      }
   }

   @Override
   public void c(@Nullable tq $$0) {
      this.h.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void m(tq $$0) {
      $$0.a("playerGameType", this.h.b().a());
      dgf $$1 = this.h.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean aa() {
      return this.dq;
   }

   public boolean c(are $$0) {
      return $$0 == this ? false : this.dq || $$0.dq;
   }

   @Override
   public boolean c(ard $$0, ji $$1) {
      return super.c($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cwp $$0) {
      ap.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cow $$1 = this.gi();
      cwp $$2 = $$1.a($$0);
      this.cd.b($$1, $$1.j).ifPresent($$1x -> this.cd.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   @Override
   public void b(cwp $$0) {
      if (!this.gi().f($$0)) {
         this.a($$0, false);
      }
   }

   public boolean ab() {
      return this.dr;
   }

   @Override
   public Optional<cob> ac() {
      return Optional.of(this.dt);
   }

   public void b(boolean $$0) {
      this.ds = $$0;
   }

   @Override
   public void a(clc $$0) {
      super.a($$0);
      bul $$1 = $$0.p();
      if ($$1 != null) {
         ap.S.a(this, $$0.l(), $$1);
      }
   }

   public void a(xg $$0) {
      this.dA = $$0;
   }

   @Nullable
   public xg ad() {
      return this.dA != null && this.dA.b() ? null : this.dA;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cx = (float)(ayz.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dL());
      this.f.b(new acv(this));
   }

   @Override
   public boolean a(bul $$0, boolean $$1) {
      if (super.a($$0, $$1)) {
         $$0.j(this);
         this.f.a(new bvu(this.dt(), fba.c, 0.0F, 0.0F), bvv.k);
         if ($$0 instanceof bvh $$2) {
            this.g.ag().a($$2, this.f);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void ae() {
      bul $$0 = this.dk();
      super.ae();
      if ($$0 instanceof bvh $$1) {
         for (btq $$2 : $$1.eA()) {
            this.f.b(new aec($$0.ar(), $$2.c()));
         }
      }
   }

   public agb b(ard $$0) {
      return new agb($$0.ah(), $$0.ai(), dhm.a($$0.E()), this.h.b(), this.h.c(), $$0.aj(), $$0.D(), this.gI(), this.aC(), $$0.P());
   }

   @Override
   public void c(ji $$0) {
      this.du = $$0;
   }

   public void af() {
      this.du = null;
   }

   @Nullable
   public ji ag() {
      return this.du;
   }

   @Override
   public fba ah() {
      bul $$0 = this.dk();
      return $$0 != null && $$0.cW() != this ? $$0.ah() : this.dv;
   }

   public void a(fba $$0) {
      this.dv = $$0;
   }

   @Override
   protected float a(bul $$0, float $$1, btb $$2) {
      return ddb.a(this.y(), this.dZ(), $$0, $$2, $$1);
   }

   @Override
   public void a(cwl $$0, but $$1) {
      super.a($$0, $$1);
      this.b(awk.d.b($$0));
   }

   public cov ai() {
      return this.dw;
   }

   public void a(cov $$0) {
      this.dw = $$0;
   }

   public fba aj() {
      float $$0 = this.dw.c() == this.dw.d() ? 0.0F : (this.dw.c() ? 1.0F : -1.0F);
      float $$1 = this.dw.a() == this.dw.b() ? 0.0F : (this.dw.a() ? 1.0F : -1.0F);
      return a(new fba((double)$$0, 0.0, (double)$$1), 1.0F, this.dL());
   }

   public void a(cqa $$0) {
      this.dx.add($$0);
   }

   public void b(cqa $$0) {
      this.dx.remove($$0);
   }

   public Set<cqa> ak() {
      return this.dx;
   }

   public long c(cqa $$0) {
      if ($$0.dV() instanceof ard $$1) {
         dfo $$2 = $$0.dx();
         this.a($$0);
         $$1.i();
         return a($$1, $$2) - 1L;
      } else {
         return 0L;
      }
   }

   public static long a(ard $$0, dfo $$1) {
      $$0.m().a(arj.f, $$1, 2, $$1);
      return arj.f.b();
   }

   static record a(fba a, float b) {
      public static are.a a(fba $$0, ji $$1) {
         return new are.a($$0, b($$0, $$1));
      }

      private static float b(fba $$0, ji $$1) {
         fba $$2 = fba.c($$1).d($$0).d();
         return (float)ayz.d(ayz.d($$2.f, $$2.d) * 180.0F / (float)Math.PI - 90.0);
      }
   }
}
