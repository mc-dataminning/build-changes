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

public class arq extends cou {
   private static final Logger cy = LogUtils.getLogger();
   private static final int cB = 32;
   private static final int cC = 10;
   private static final int cD = 25;
   public static final double a = 1.0;
   public static final double b = 3.0;
   public static final int c = 2;
   public static final String d = "ender_pearls";
   public static final String e = "ender_pearl_dimension";
   private static final bwn cE = new bwn(alj.b("creative_mode_block_range"), 0.5, bwn.a.a);
   private static final bwn cF = new bwn(alj.b("creative_mode_entity_range"), 2.0, bwn.a.a);
   public ass f;
   public final MinecraftServer g;
   public final arr h;
   private final alr cG;
   private final awt cH;
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
   private cor cT = cor.a;
   private arh cU = arh.a;
   private boolean cV = true;
   private long cW = ae.c();
   @Nullable
   private bul cX;
   private boolean cY;
   public boolean i;
   private final aws cZ = new aws();
   @Nullable
   private ezy da;
   private int db;
   private boolean dc;
   private int dd = 2;
   private String de = "en_us";
   @Nullable
   private ezy df;
   @Nullable
   private ezy dg;
   @Nullable
   private ezy dh;
   private kj di = kj.a(0, 0, 0);
   private aqz dj = aqz.a;
   private ali<dfm> dk = dfm.i;
   @Nullable
   private jh dl;
   private boolean dm;
   private float dn;
   private final asy do;
   private boolean dp;
   private boolean dq;
   private boolean dr;
   private cny ds = new cny(0, 0, 0);
   @Nullable
   private jh dt;
   private ezy du = ezy.c;
   private cos dv = cos.b;
   private final Set<cpx> dw = new HashSet<>();
   private final cso dx = new cso() {
      @Override
      public void a(crz $$0, jz<cwm> $$1, cwm $$2, int[] $$3) {
         arq.this.f.b(new ada($$0.l, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(crz $$0, int $$1, cwm $$2) {
         arq.this.f.b(new adc($$0.l, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(crz $$0, cwm $$1) {
         arq.this.f.b(new afi($$1.v()));
      }

      @Override
      public void a(crz $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(crz $$0, int $$1, int $$2) {
         arq.this.f.b(new adb($$0.l, $$1, $$2));
      }
   };
   private final csn dy = new csn() {
      @Override
      public void a(crz $$0, int $$1, cwm $$2) {
         ctw $$3 = $$0.b($$1);
         if (!($$3 instanceof cts)) {
            if ($$3.c == arq.this.gg()) {
               ao.f.a(arq.this, arq.this.gg(), $$2);
            }
         }
      }

      @Override
      public void a(crz $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private ya dz;
   @Nullable
   public final Object j;
   private final ev dA = new ev() {
      @Override
      public boolean x_() {
         return arq.this.y().N().b(dfi.p);
      }

      @Override
      public boolean y_() {
         return true;
      }

      @Override
      public boolean c() {
         return true;
      }

      @Override
      public void a(xj $$0) {
         arq.this.a($$0);
      }
   };
   private int dB;
   public boolean k;

   public arq(MinecraftServer $$0, arp $$1, GameProfile $$2, ara $$3) {
      super($$1, $$1.X(), $$1.Y(), $$2);
      this.do = $$0.a(this);
      this.h = $$0.b(this);
      this.g = $$0;
      this.cH = $$0.ag().a((cou)this);
      this.cG = $$0.ag().g(this);
      this.b(this.a($$1, $$1.X()).c(), 0.0F, 0.0F);
      this.a($$3);
      this.j = null;
   }

   @Override
   public jh a(arp $$0, jh $$1) {
      ezt $$2 = this.a(bvt.a).a(ezy.c);
      jh $$3 = $$1;
      if ($$0.F_().g() && $$0.p().aZ().k() != dfj.c) {
         int $$4 = Math.max(0, this.g.a($$0));
         int $$5 = azm.a($$0.E_().b((double)$$1.u(), (double)$$1.w()));
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
         int $$10 = azu.a().a($$8);

         for (int $$11 = 0; $$11 < $$8; $$11++) {
            int $$12 = ($$10 + $$9 * $$11) % $$8;
            int $$13 = $$12 % ($$4 * 2 + 1);
            int $$14 = $$12 / ($$4 * 2 + 1);
            int $$15 = $$1.u() + $$13 - $$4;
            int $$16 = $$1.w() + $$14 - $$4;

            try {
               $$3 = arj.a($$0, $$15, $$16);
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

      while (!this.a($$0, $$2.c($$3.c())) && $$3.v() < $$0.al()) {
         $$3 = $$3.d();
      }

      while (this.a($$0, $$2.c($$3.e().c())) && $$3.v() > $$0.K_() + 1) {
         $$3 = $$3.e();
      }

      return $$3;
   }

   private boolean a(arp $$0, ezt $$1) {
      return $$0.a(this, $$1, true);
   }

   private int t(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         cny.a.parse(new Dynamic(uz.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(cy::error).ifPresent($$0x -> this.ds = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         ul $$1 = $$0.p("enteredNetherPosition");
         this.dg = new ezy($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.i = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cZ.a($$0.p("recipeBook"), this.g.aI());
      }

      if (this.fP()) {
         this.fQ();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.dl = new jh($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.dm = $$0.q("SpawnForced");
         this.dn = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.dk = dfm.h.parse(uz.a, $$0.c("SpawnDimension")).resultOrPartial(cy::error).orElse(dfm.i);
         }
      }

      this.dr = $$0.q("spawn_extra_particles_on_fall");
      vi $$2 = $$0.c("raid_omen_position");
      if ($$2 != null) {
         jh.a.parse(uz.a, $$2).resultOrPartial(cy::error).ifPresent($$0x -> this.dt = $$0x);
      }
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      cny.a.encodeStart(uz.a, this.ds).resultOrPartial(cy::error).ifPresent($$1x -> $$0.a("warden_spawn_tracker", $$1x));
      this.m($$0);
      $$0.a("seenCredits", this.i);
      if (this.dg != null) {
         ul $$1 = new ul();
         $$1.a("x", this.dg.d);
         $$1.a("y", this.dg.e);
         $$1.a("z", this.dg.f);
         $$0.a("enteredNetherPosition", $$1);
      }

      this.k($$0);
      $$0.a("recipeBook", this.cZ.b());
      $$0.a("Dimension", this.dV().ag().a().toString());
      if (this.dl != null) {
         $$0.a("SpawnX", this.dl.u());
         $$0.a("SpawnY", this.dl.v());
         $$0.a("SpawnZ", this.dl.w());
         $$0.a("SpawnForced", this.dm);
         $$0.a("SpawnAngle", this.dn);
         alj.a.encodeStart(uz.a, this.dk.a()).resultOrPartial(cy::error).ifPresent($$1x -> $$0.a("SpawnDimension", $$1x));
      }

      $$0.a("spawn_extra_particles_on_fall", this.dr);
      if (this.dt != null) {
         jh.a.encodeStart(uz.a, this.dt).resultOrPartial(cy::error).ifPresent($$1x -> $$0.a("raid_omen_position", $$1x));
      }

      this.l($$0);
   }

   private void k(ul $$0) {
      bul $$1 = this.dg();
      bul $$2 = this.dk();
      if ($$2 != null && $$1 != this && $$1.df()) {
         ul $$3 = new ul();
         ul $$4 = new ul();
         $$1.e($$4);
         $$3.a("Attach", $$2.cG());
         $$3.a("Entity", $$4);
         $$0.a("RootVehicle", $$3);
      }
   }

   public void a(Optional<ul> $$0) {
      if ($$0.isPresent() && $$0.get().b("RootVehicle", 10) && this.dV() instanceof arp $$1) {
         ul $$2 = $$0.get().p("RootVehicle");
         bul $$3 = bus.a($$2.p("Entity"), $$1, bur.r, $$1x -> !$$1.c($$1x) ? null : $$1x);
         if ($$3 != null) {
            UUID $$4;
            if ($$2.b("Attach")) {
               $$4 = $$2.a("Attach");
            } else {
               $$4 = null;
            }

            if ($$3.cG().equals($$4)) {
               this.a($$3, true);
            } else {
               for (bul $$6 : $$3.dd()) {
                  if ($$6.cG().equals($$4)) {
                     this.a($$6, true);
                     break;
                  }
               }
            }

            if (!this.bZ()) {
               cy.warn("Couldn't reattach entity to player");
               $$3.at();

               for (bul $$7 : $$3.dd()) {
                  $$7.at();
               }
            }
         }
      }
   }

   private void l(ul $$0) {
      if (!this.dw.isEmpty()) {
         ur $$1 = new ur();

         for (cpx $$2 : this.dw) {
            if ($$2.dQ()) {
               cy.warn("Trying to save removed ender pearl, skipping");
            } else {
               ul $$3 = new ul();
               $$2.e($$3);
               alj.a.encodeStart(uz.a, $$2.dV().ag().a()).resultOrPartial(cy::error).ifPresent($$1x -> $$3.a("ender_pearl_dimension", $$1x));
               $$1.add($$3);
            }
         }

         $$0.a("ender_pearls", $$1);
      }
   }

   public void b(Optional<ul> $$0) {
      if ($$0.isPresent() && $$0.get().b("ender_pearls", 9) && $$0.get().c("ender_pearls") instanceof ur $$2) {
         $$2.forEach($$0x -> {
            if ($$0x instanceof ul $$1 && $$1.e("ender_pearl_dimension")) {
               Optional<ali<dfm>> $$2x = dfm.h.parse(uz.a, $$1.c("ender_pearl_dimension")).resultOrPartial(cy::error);
               if ($$2x.isEmpty()) {
                  cy.warn("No dimension defined for ender pearl, skipping");
                  return;
               }

               arp $$3 = this.dV().p().a($$2x.get());
               if ($$3 != null) {
                  bul $$4 = bus.a($$1, $$3, bur.r, $$1x -> !$$3.c($$1x) ? null : $$1x);
                  if ($$4 != null) {
                     a($$3, $$4.dx());
                  } else {
                     cy.warn("Failed to spawn player ender pearl in level ({}), skipping", $$2x.get());
                  }
               } else {
                  cy.warn("Trying to load ender pearl without level ({}) being loaded, skipping", $$2x.get());
               }
            }
         });
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gq();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.cr = azm.a((float)$$0 / $$1, 0.0F, $$2);
      this.cR = -1;
   }

   public void b(int $$0) {
      this.cp = $$0;
      this.cR = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cR = -1;
   }

   @Override
   public void a(cwm $$0, int $$1) {
      super.a($$0, $$1);
      this.cR = -1;
   }

   private void a(crz $$0) {
      $$0.a(this.dy);
      $$0.a(this.dx);
   }

   public void d() {
      this.a(this.cb);
   }

   @Override
   public void h_() {
      super.h_();
      this.f.b(aej.a);
   }

   @Override
   public void i_() {
      super.i_();
      this.f.b(new aei(this.eP()));
   }

   @Override
   public void a(dvv $$0) {
      ao.e.a(this, $$0);
   }

   @Override
   protected cwj g() {
      return new cxm(this);
   }

   @Override
   public void h() {
      this.h.a();
      this.ds.a();
      this.cS--;
      if (this.aj > 0) {
         this.aj--;
      }

      this.cc.d();
      if (!this.dV().C && !this.cc.b(this)) {
         this.p();
         this.cc = this.cb;
      }

      bul $$0 = this.L();
      if ($$0 != this) {
         if ($$0.bL()) {
            this.a($$0.dA(), $$0.dC(), $$0.dG(), $$0.dL(), $$0.dN());
            this.y().m().a(this);
            if (this.fX()) {
               this.d(this);
            }
         } else {
            this.d(this);
         }
      }

      ao.x.a(this);
      if (this.da != null) {
         ao.v.a(this, this.da, this.af - this.db);
      }

      this.l();
      this.m();
      this.gN();
      this.cG.b(this);
   }

   private void gN() {
      bwl $$0 = this.g(bwp.g);
      if ($$0 != null) {
         if (this.b()) {
            $$0.a(cE);
         } else {
            $$0.e(cE);
         }
      }

      bwl $$1 = this.g(bwp.j);
      if ($$1 != null) {
         if (this.b()) {
            $$1.a(cF);
         } else {
            $$1.e(cF);
         }
      }
   }

   public void i() {
      try {
         if (!this.Y_() || !this.do()) {
            super.h();
         }

         for (int $$0 = 0; $$0 < this.gg().b(); $$0++) {
            cwm $$1 = this.gg().a($$0);
            if (!$$1.f()) {
               this.j($$1);
            }
         }

         if (this.eD() != this.cO || this.cP != this.cd.a() || this.cd.c() == 0.0F != this.cQ) {
            this.f.b(new afq(this.eD(), this.cd.a(), this.cd.c()));
            this.cO = this.eD();
            this.cP = this.cd.a();
            this.cQ = this.cd.c() == 0.0F;
         }

         if (this.eD() + this.fu() != this.cI) {
            this.cI = this.eD() + this.fu();
            this.a(fbg.g, azm.f(this.cI));
         }

         if (this.cd.a() != this.cJ) {
            this.cJ = this.cd.a();
            this.a(fbg.h, azm.f((float)this.cJ));
         }

         if (this.ct() != this.cK) {
            this.cK = this.ct();
            this.a(fbg.i, azm.f((float)this.cK));
         }

         if (this.eO() != this.cL) {
            this.cL = this.eO();
            this.a(fbg.j, azm.f((float)this.cL));
         }

         if (this.cq != this.cN) {
            this.cN = this.cq;
            this.a(fbg.k, azm.f((float)this.cN));
         }

         if (this.cp != this.cM) {
            this.cM = this.cp;
            this.a(fbg.l, azm.f((float)this.cM));
         }

         if (this.cq != this.cR) {
            this.cR = this.cq;
            this.f.b(new afp(this.cr, this.cq, this.cp));
         }

         if (this.af % 20 == 0) {
            ao.q.a(this);
         }
      } catch (Throwable var4) {
         o $$3 = o.a(var4, "Ticking player");
         p $$4 = $$3.a("Player being ticked");
         this.a($$4);
         throw new z($$3);
      }
   }

   private void j(cwm $$0) {
      etn $$1 = $$0.a(ku.L);
      etp $$2 = cwz.a($$1, this.dV());
      if ($$2 != null) {
         zq<?> $$3 = $$2.a($$1, this);
         if ($$3 != null) {
            this.f.b($$3);
         }
      }
   }

   @Override
   protected void j() {
      if (this.dV().ak() == bsh.a && this.y().N().b(dfi.k)) {
         if (this.af % 20 == 0) {
            if (this.eD() < this.eR()) {
               this.c(1.0F);
            }

            float $$0 = this.cd.c();
            if ($$0 < 20.0F) {
               this.cd.b($$0 + 1.0F);
            }
         }

         if (this.af % 10 == 0 && this.cd.b()) {
            this.cd.a(this.cd.a() + 1);
         }
      }
   }

   @Override
   public void k() {
      if (this.eD() > 0.0F && this.df != null) {
         ao.X.a(this, this.df);
      }

      this.df = null;
      super.k();
   }

   @Override
   public void l() {
      if (this.Z > 0.0F && this.df == null) {
         this.df = this.dt();
         if (this.cw != null && this.cw.e <= this.df.e) {
            ao.ae.a(this, this.cw, this.cx);
         }
      }
   }

   public void m() {
      if (this.dk() != null && this.dk().bx()) {
         if (this.dh == null) {
            this.dh = this.dt();
         } else {
            ao.Y.a(this, this.dh);
         }
      }

      if (this.dh != null && (this.dk() == null || !this.dk().bx())) {
         this.dh = null;
      }
   }

   private void a(fbg $$0, int $$1) {
      this.gw().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(btb $$0) {
      this.a(ear.p);
      boolean $$1 = this.y().N().b(dfi.n);
      if ($$1) {
         xj $$2 = this.eP().a();
         this.f.a(new aek(this.ar(), $$2), wq.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            xj $$3x = xj.a("death.attack.message_too_long", xj.b($$2x).a(n.o));
            xj $$4x = xj.a("death.attack.even_more_magic", this.o_()).a($$1xx -> $$1xx.a(new xp(xp.a.a, $$3x)));
            return new aek(this.ar(), $$4x);
         }));
         fbf $$3 = this.cr();
         if ($$3 == null || $$3.k() == fbf.b.a) {
            this.g.ag().a($$2, false);
         } else if ($$3.k() == fbf.b.c) {
            this.g.ag().a(this, $$2);
         } else if ($$3.k() == fbf.b.d) {
            this.g.ag().b(this, $$2);
         }
      } else {
         this.f.b(new aek(this.ar(), xi.a));
      }

      this.gv();
      if (this.y().N().b(dfi.N)) {
         this.gO();
      }

      if (!this.Y_()) {
         this.b(this.y(), $$0);
      }

      this.gw().a(fbg.d, this, fbb::b);
      bvh $$4 = this.eQ();
      if ($$4 != null) {
         this.b(awx.h.b($$4.aq()));
         $$4.a(this, this.bk, $$0);
         this.f($$4);
      }

      this.dV().a(this, (byte)3);
      this.a(awx.N);
      this.a(awx.i.b(awx.m));
      this.a(awx.i.b(awx.n));
      this.aH();
      this.k(0);
      this.c(false);
      this.eP().c();
      this.c(Optional.of(jp.a(this.dV().ag(), this.dv())));
   }

   private void gO() {
      ezt $$0 = new ezt(this.dv()).c(32.0, 10.0, 32.0);
      this.dV().a(bvj.class, $$0, buq.f).stream().filter($$0x -> $$0x instanceof bvm).forEach($$0x -> ((bvm)$$0x).a_(this.y(), this));
   }

   @Override
   public void a(bul $$0, int $$1, btb $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.r($$1);
         this.gw().a(fbg.f, this, fbb::b);
         if ($$0 instanceof cou) {
            this.a(awx.Q);
            this.gw().a(fbg.e, this, fbb::b);
         } else {
            this.a(awx.O);
         }

         this.a(this, $$0, fbg.m);
         this.a($$0, this, fbg.n);
         ao.c.a(this, $$0, $$2);
      }
   }

   private void a(fbc $$0, fbc $$1, fbg[] $$2) {
      fay $$3 = this.gw().e($$1.cI());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gw().a($$2[$$4], $$0, fbb::b);
         }
      }
   }

   @Override
   public boolean a(arp $$0, btb $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         boolean $$3 = this.g.n() && this.gP() && $$1.a(axe.m);
         if (!$$3 && this.cS > 0 && !$$1.a(axe.d)) {
            return false;
         } else {
            bul $$4 = $$1.d();
            if ($$4 instanceof cou $$5 && !this.a($$5)) {
               return false;
            }

            if ($$4 instanceof cpb $$6 && $$6.p() instanceof cou $$8 && !this.a($$8)) {
               return false;
            }

            return super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   public boolean a(cou $$0) {
      return !this.gP() ? false : super.a($$0);
   }

   private boolean gP() {
      return this.g.ac();
   }

   public est a(boolean $$0, est.a $$1) {
      jh $$2 = this.T();
      float $$3 = this.U();
      boolean $$4 = this.W();
      arp $$5 = this.g.a(this.V());
      if ($$5 != null && $$2 != null) {
         Optional<arq.a> $$6 = a($$5, $$2, $$3, $$4, $$0);
         if ($$6.isPresent()) {
            arq.a $$7 = $$6.get();
            return new est($$5, $$7.a(), ezy.c, $$7.b(), 0.0F, $$1);
         } else {
            return est.a(this.g.J(), this, $$1);
         }
      } else {
         return new est(this.g.J(), this, $$1);
      }
   }

   private static Optional<arq.a> a(arp $$0, jh $$1, float $$2, boolean $$3, boolean $$4) {
      dvv $$5 = $$0.a_($$1);
      diq $$6 = $$5.b();
      if ($$6 instanceof doy && ($$3 || $$5.c(doy.d) > 0) && doy.a($$0)) {
         Optional<ezy> $$7 = doy.a(bus.bO, $$0, $$1);
         if (!$$3 && $$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.b(doy.d, Integer.valueOf($$5.c(doy.d) - 1)), 3);
         }

         return $$7.map($$1x -> arq.a.a($$1x, $$1));
      } else if ($$6 instanceof dij && dij.a($$0)) {
         return dij.a(bus.bO, $$0, $$1, $$5.c(dij.aF), $$2).map($$1x -> arq.a.a($$1x, $$1));
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dvv $$9 = $$0.a_($$1.d());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new arq.a(new ezy((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5), $$2)) : Optional.empty();
      }
   }

   @Override
   public void n() {
      this.ao();
      this.y().a(this, bul.c.e);
      if (!this.k) {
         this.k = true;
         this.f.b(new adm(adm.f, 0.0F));
         this.i = true;
      }
   }

   @Nullable
   public cou a(est $$0) {
      if (this.dQ()) {
         return null;
      } else {
         if ($$0.f()) {
            this.f.b(new adm(adm.b, 0.0F));
         }

         arp $$1 = $$0.a();
         arp $$2 = this.y();
         ali<dfm> $$3 = $$2.ag();
         this.ae();
         if ($$1.ag() == $$3) {
            this.f.a(bvu.a($$0), $$0.g());
            this.f.l();
            $$0.h().onTransition(this);
            return this;
         } else {
            this.cY = true;
            etx $$4 = $$1.C_();
            this.f.b(new aeu(this.b($$1), (byte)3));
            this.f.b(new acs($$4.q(), $$4.r()));
            avq $$5 = this.g.ag();
            $$5.e(this);
            $$2.a(this, bul.c.e);
            this.dS();
            bou $$6 = bot.a();
            $$6.a("moving");
            if ($$3 == dfm.i && $$1.ag() == dfm.j) {
               this.dg = this.dt();
            }

            $$6.c();
            $$6.a("placing");
            this.a($$1);
            this.f.a(bvu.a($$0), $$0.g());
            this.f.l();
            $$1.d(this);
            $$6.c();
            this.g($$2);
            this.fD();
            this.f.b(new aeg(this.gh()));
            $$5.a(this, $$1);
            $$5.f(this);
            $$5.d(this);
            $$0.h().onTransition(this);
            this.cR = -1;
            this.cO = -1.0F;
            this.cP = -1;
            return this;
         }
      }
   }

   private void g(arp $$0) {
      ali<dfm> $$1 = $$0.ag();
      ali<dfm> $$2 = this.dV().ag();
      ao.w.a(this, $$1, $$2);
      if ($$1 == dfm.j && $$2 == dfm.i && this.dg != null) {
         ao.D.a(this, this.dg);
      }

      if ($$2 != dfm.j) {
         this.dg = null;
      }
   }

   @Override
   public boolean a(arq $$0) {
      if ($$0.Y_()) {
         return this.L() == this;
      } else {
         return this.Y_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bul $$0, int $$1) {
      super.a($$0, $$1);
      this.cc.d();
   }

   @Override
   public Either<cou.a, bas> a(jh $$0) {
      jm $$1 = this.dV().a_($$0).c(dml.aF);
      if (this.fP() || !this.bL()) {
         return Either.left(cou.a.e);
      } else if (!this.dV().F_().j()) {
         return Either.left(cou.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cou.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cou.a.d);
      } else {
         this.a(this.dV().ag(), $$0, this.dL(), false, true);
         if (this.dV().T()) {
            return Either.left(cou.a.b);
         } else {
            if (!this.b()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               ezy $$4 = ezy.c($$0);
               List<cly> $$5 = this.dV()
                  .a(
                     cly.class,
                     new ezt($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0),
                     $$0x -> $$0x.a(this.y(), this)
                  );
               if (!$$5.isEmpty()) {
                  return Either.left(cou.a.f);
               }
            }

            Either<cou.a, bas> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(awx.ap);
               ao.r.a(this);
            });
            if (!this.y().e()) {
               this.a(xj.c("sleep.not_possible"), true);
            }

            ((arp)this.dV()).f();
            return $$6;
         }
      }
   }

   @Override
   public void b(jh $$0) {
      this.a(awx.i.b(awx.n));
      super.b($$0);
   }

   private boolean a(jh $$0, jm $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(jh $$0) {
      ezy $$1 = ezy.c($$0);
      return Math.abs(this.dA() - $$1.a()) <= 3.0 && Math.abs(this.dC() - $$1.b()) <= 2.0 && Math.abs(this.dG() - $$1.c()) <= 3.0;
   }

   private boolean b(jh $$0, jm $$1) {
      jh $$2 = $$0.d();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fP()) {
         this.y().m().a(this, new aci(this, 2));
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
   public boolean a(arp $$0, btb $$1) {
      return super.a($$0, $$1) || this.Q() && !$$1.a(bte.m);
   }

   @Override
   protected void a(double $$0, boolean $$1, dvv $$2, jh $$3) {
   }

   @Override
   protected void b(arp $$0, jh $$1) {
      if (!this.Y_()) {
         super.b($$0, $$1);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.do()) {
         this.a($$3, new ezy($$0, $$1, $$2));
         jh $$4 = this.aP();
         dvv $$5 = this.dV().a_($$4);
         if (this.dr && $$3 && this.Z > 0.0F) {
            ezy $$6 = $$4.b().b(0.0, 0.5, 0.0);
            int $$7 = (int)azm.a(50.0F * this.Z, 0.0F, 200.0F);
            this.y().a(new lk(ls.b, $$5), $$6.d, $$6.e, $$6.f, $$7, 0.3F, 0.3F, 0.3F, 0.15F);
            this.dr = false;
         }

         super.a($$1, $$3, $$5, $$4);
      }
   }

   @Override
   public void b_(@Nullable bul $$0) {
      super.b_($$0);
      this.cw = this.dt();
      this.cx = $$0;
      this.w($$0 != null && $$0.aq() == bus.bD);
   }

   @Override
   protected void o() {
      if (this.dV().t().i()) {
         super.o();
      }
   }

   @Override
   public void a(duk $$0, boolean $$1) {
      this.f.b(new aco(this.dV(), $$0.aA_()));
      this.f.b(new aee($$0.aA_(), $$1));
   }

   private void gQ() {
      this.dB = this.dB % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bsm $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.cc != this.cb) {
            this.p();
         }

         this.gQ();
         crz $$1 = $$0.createMenu(this.dB, this.gg(), this);
         if ($$1 == null) {
            if (this.Y_()) {
               this.a(xj.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.f.b(new aed($$1.l, $$1.a(), $$0.o_()));
            this.a($$1);
            this.cc = $$1;
            return OptionalInt.of(this.dB);
         }
      }
   }

   @Override
   public void a(int $$0, dek $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.f.b(new ady($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(cjc $$0, bsd $$1) {
      if (this.cc != this.cb) {
         this.p();
      }

      this.gQ();
      int $$2 = $$0.af_();
      this.f.b(new adn(this.dB, $$2, $$0.ar()));
      this.cc = new ctb(this.dB, this.gg(), $$1, $$0, $$2);
      this.a(this.cc);
   }

   @Override
   public void a(cwm $$0, bsj $$1) {
      if ($$0.b(ku.T)) {
         if (cyi.a($$0, this.A(), this)) {
            this.cc.d();
         }

         this.f.b(new aec($$1));
      }
   }

   @Override
   public void a(dti $$0) {
      this.f.b(acm.a($$0, dsy::e));
   }

   @Override
   public void p() {
      this.f.b(new acz(this.cc.l));
      this.q();
   }

   @Override
   public void q() {
      this.cc.a(this);
      this.cb.a(this.cc);
      this.cc = this.cb;
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
               this.a(awx.C, $$3);
               this.G(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(axi.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(awx.w, $$4);
               this.G(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.bj()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(awx.s, $$5);
               this.G(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.p_()) {
            if ($$1 > 0.0) {
               this.a(awx.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aJ()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.cj()) {
                  this.a(awx.r, $$6);
                  this.G(0.1F * (float)$$6 * 0.01F);
               } else if (this.ci()) {
                  this.a(awx.q, $$6);
                  this.G(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(awx.p, $$6);
                  this.G(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fH()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(awx.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(awx.v, $$8);
            }
         }
      }
   }

   private void q(double $$0, double $$1, double $$2) {
      if (this.bZ() && !r($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         bul $$4 = this.dk();
         if ($$4 instanceof cqt) {
            this.a(awx.x, $$3);
         } else if ($$4 instanceof cqr) {
            this.a(awx.y, $$3);
         } else if ($$4 instanceof chp) {
            this.a(awx.z, $$3);
         } else if ($$4 instanceof cjc) {
            this.a(awx.A, $$3);
         } else if ($$4 instanceof cml) {
            this.a(awx.D, $$3);
         }
      }
   }

   private static boolean r(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(awu<?> $$0, int $$1) {
      this.cH.b(this, $$0, $$1);
      this.gw().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(awu<?> $$0) {
      this.cH.a(this, $$0, 0);
      this.gw().a($$0, this, fbb::c);
   }

   @Override
   public int a(Collection<dbc<?>> $$0) {
      return this.cZ.a($$0, this);
   }

   @Override
   public void a(dbc<?> $$0, List<cwm> $$1) {
      ao.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<alj> $$0) {
      List<dbc<?>> $$1 = $$0.stream().flatMap($$0x -> this.g.aI().a($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<dbc<?>> $$0) {
      return this.cZ.b($$0, this);
   }

   @Override
   public void s() {
      super.s();
      this.a(awx.E);
      if (this.cj()) {
         this.G(0.2F);
      } else {
         this.G(0.05F);
      }
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cR = -1;
   }

   @Override
   public void t() {
      this.dc = true;
      this.bP();
      if (this.fP()) {
         this.a(true, false);
      }
   }

   public boolean u() {
      return this.dc;
   }

   public void v() {
      this.cO = -1.0E8F;
   }

   @Override
   public void a(xj $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void w() {
      if (!this.by.f() && this.fx()) {
         this.f.b(new adj(this, (byte)9));
         super.w();
      }
   }

   @Override
   public void a(fi.a $$0, ezy $$1) {
      super.a($$0, $$1);
      this.f.b(new aen($$0, $$1.d, $$1.e, $$1.f));
   }

   public void a(fi.a $$0, bul $$1, fi.a $$2) {
      ezy $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.f.b(new aen($$0, $$1, $$2));
   }

   public void a(arq $$0, boolean $$1) {
      this.ds = $$0.ds;
      this.dz = $$0.dz;
      this.h.a($$0.h.b(), $$0.h.c());
      this.x();
      if ($$1) {
         this.eW().b($$0.eW());
         this.eW().c($$0.eW());
         this.x($$0.eD());
         this.cd = $$0.cd;

         for (btq $$2 : $$0.eA()) {
            this.a(new btq($$2));
         }

         this.gg().a($$0.gg());
         this.cp = $$0.cp;
         this.cq = $$0.cq;
         this.cr = $$0.cr;
         this.q($$0.gb());
         this.as = $$0.as;
      } else {
         this.eW().b($$0.eW());
         this.x(this.eR());
         if (this.y().N().b(dfi.d) || $$0.Y_()) {
            this.gg().a($$0.gg());
            this.cp = $$0.cp;
            this.cq = $$0.cq;
            this.cr = $$0.cr;
            this.q($$0.gb());
         }
      }

      this.cs = $$0.cs;
      this.ca = $$0.ca;
      this.au().a(bW, $$0.au().a(bW));
      this.cR = -1;
      this.cO = -1.0F;
      this.cP = -1;
      this.cZ.a($$0.cZ);
      this.i = $$0.i;
      this.dg = $$0.dg;
      this.dj = $$0.dj;
      this.i($$0.gy());
      this.j($$0.gz());
      this.c($$0.gG());
   }

   @Override
   protected void a(btq $$0, @Nullable bul $$1) {
      super.a($$0, $$1);
      this.f.b(new agp(this.ar(), $$0, true));
      if ($$0.a(bts.y)) {
         this.db = this.af;
         this.da = this.dt();
      }

      ao.B.a(this, $$1);
   }

   @Override
   protected void a(btq $$0, boolean $$1, @Nullable bul $$2) {
      super.a($$0, $$1, $$2);
      this.f.b(new agp(this.ar(), $$0, false));
      ao.B.a(this, $$2);
   }

   @Override
   protected void c(Collection<btq> $$0) {
      super.c($$0);

      for (btq $$1 : $$0) {
         this.f.b(new aes(this.ar(), $$1.c()));
         if ($$1.a(bts.y)) {
            this.da = null;
         }
      }

      ao.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.f.a(new bvu(new ezy($$0, $$1, $$2), ezy.c, 0.0F, 0.0F), bvv.a(bvv.l, bvv.k));
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.f.a(new bvu(new ezy($$0, $$1, $$2), ezy.c, 0.0F, 0.0F), bvv.j);
   }

   @Override
   public boolean a(arp $$0, double $$1, double $$2, double $$3, Set<bvv> $$4, float $$5, float $$6, boolean $$7) {
      des $$8 = new des(jh.a($$1, $$2, $$3));
      $$0.m().a(arv.g, $$8, 1, this.ar());
      if (this.fP()) {
         this.a(true, true);
      }

      if ($$7) {
         this.d(this);
      }

      boolean $$9 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$9) {
         this.q($$4.contains(bvv.d) ? this.cA() + $$5 : $$5);
      }

      return $$9;
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      super.e($$0, $$1, $$2);
      this.f.l();
   }

   @Override
   public void b(bul $$0) {
      this.y().m().a(this, new aci($$0, 4));
   }

   @Override
   public void c(bul $$0) {
      this.y().m().a(this, new aci($$0, 5));
   }

   @Override
   public void x() {
      if (this.f != null) {
         this.f.b(new aeg(this.gh()));
         this.K();
      }
   }

   public arp y() {
      return (arp)this.dV();
   }

   public boolean a(dfj $$0) {
      boolean $$1 = this.Y_();
      if (!this.h.a($$0)) {
         return false;
      } else {
         this.f.b(new adm(adm.e, (float)$$0.a()));
         if ($$0 == dfj.d) {
            this.gv();
            this.ae();
            dcf.a(this);
         } else {
            this.d(this);
            if ($$1) {
               dcf.a(this.y(), this);
            }
         }

         this.x();
         this.fv();
         return true;
      }
   }

   @Override
   public boolean Y_() {
      return this.h.b() == dfj.d;
   }

   @Override
   public boolean b() {
      return this.h.b() == dfj.b;
   }

   public ev z() {
      return this.dA;
   }

   public ew A() {
      return new ew(this.z(), this.dt(), this.bU(), this.y(), this.G(), this.al().getString(), this.o_(), this.g, this);
   }

   public void a(xj $$0) {
      this.b($$0, false);
   }

   public void b(xj $$0, boolean $$1) {
      if (this.x($$1)) {
         this.f.a(new agg($$0, $$1), wq.a(() -> {
            if (this.x(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               xj $$3 = xj.b($$2).a(n.o);
               return new agg(xj.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(xy $$0, boolean $$1, xf.a $$2) {
      if (this.gR()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String B() {
      return this.f.m() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(ara $$0) {
      this.de = $$0.b();
      this.dd = $$0.c();
      this.cT = $$0.d();
      this.cV = $$0.e();
      this.dp = $$0.h();
      this.dq = $$0.i();
      this.cU = $$0.j();
      this.au().a(bW, (byte)$$0.f());
      this.au().a(bX, (byte)$$0.g().b());
   }

   public ara C() {
      int $$0 = this.au().a(bW);
      bvb $$1 = bvb.d.apply(this.au().a(bX));
      return new ara(this.de, this.dd, this.cT, this.cV, $$0, $$1, this.dp, this.dq, this.cU);
   }

   public boolean D() {
      return this.cV;
   }

   public cor E() {
      return this.cT;
   }

   private boolean x(boolean $$0) {
      return this.cT == cor.c ? $$0 : true;
   }

   private boolean gR() {
      return this.cT == cor.a;
   }

   public int F() {
      return this.dd;
   }

   public void a(akg $$0) {
      this.f.b(new aey($$0.a(), $$0.d().map(akg.a::a)));
   }

   @Override
   protected int G() {
      return this.g.c(this.gf());
   }

   public void H() {
      this.cW = ae.c();
   }

   public awt I() {
      return this.cH;
   }

   public aws J() {
      return this.cZ;
   }

   @Override
   protected void K() {
      if (this.Y_()) {
         this.ey();
         this.k(true);
      } else {
         super.K();
      }
   }

   public bul L() {
      return (bul)(this.cX == null ? this : this.cX);
   }

   @Override
   public void d(@Nullable bul $$0) {
      bul $$1 = this.L();
      this.cX = (bul)($$0 == null ? this : $$0);
      if ($$1 != this.cX) {
         if (this.cX.dV() instanceof arp $$2) {
            this.a($$2, this.cX.dA(), this.cX.dC(), this.cX.dG(), Set.of(), this.dL(), this.dN(), false);
         }

         if ($$0 != null) {
            this.y().m().a(this);
         }

         this.f.b(new aff(this.cX));
         this.f.l();
      }
   }

   @Override
   protected void M() {
      if (!this.cY) {
         super.M();
      }
   }

   @Override
   public void e(bul $$0) {
      if (this.h.b() == dfj.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long N() {
      return this.cW;
   }

   @Nullable
   public xj O() {
      return null;
   }

   public int P() {
      return 0;
   }

   @Override
   public void a(bsj $$0) {
      super.a($$0);
      this.gB();
   }

   public boolean Q() {
      return this.cY;
   }

   public void R() {
      this.cY = false;
   }

   public alr S() {
      return this.cG;
   }

   @Nullable
   public jh T() {
      return this.dl;
   }

   public float U() {
      return this.dn;
   }

   public ali<dfm> V() {
      return this.dk;
   }

   public boolean W() {
      return this.dm;
   }

   public void b(arq $$0) {
      this.a($$0.V(), $$0.T(), $$0.U(), $$0.W(), false);
   }

   public void a(ali<dfm> $$0, @Nullable jh $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.dl) && $$0.equals(this.dk);
         if ($$4 && !$$5) {
            this.a(xj.c("block.minecraft.set_spawn"));
         }

         this.dl = $$1;
         this.dk = $$0;
         this.dn = $$2;
         this.dm = $$3;
      } else {
         this.dl = null;
         this.dk = dfm.i;
         this.dn = 0.0F;
         this.dm = false;
      }
   }

   public kj X() {
      return this.di;
   }

   public void a(kj $$0) {
      this.di = $$0;
   }

   public aqz Y() {
      return this.dj;
   }

   public void a(aqz $$0) {
      this.dj = $$0;
   }

   @Override
   public void a(awm $$0, awo $$1, float $$2, float $$3) {
      this.f.b(new agd(lz.b.e($$0), $$1, this.dA(), this.dC(), this.dG(), $$2, $$3, this.ae.g()));
   }

   @Override
   public clc a(cwm $$0, boolean $$1, boolean $$2) {
      clc $$3 = this.b($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dV().b($$3);
         cwm $$4 = $$3.j();
         if ($$2) {
            if (!$$4.f()) {
               this.a(awx.f.b($$4.h()), $$0.L());
            }

            this.a(awx.F);
         }

         return $$3;
      }
   }

   @Nullable
   private clc b(cwm $$0, boolean $$1, boolean $$2) {
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
            $$4.n((double)(-azm.a($$6) * $$5), 0.2F, (double)(azm.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = azm.a(this.dN() * (float) (Math.PI / 180.0));
            float $$9 = azm.b(this.dN() * (float) (Math.PI / 180.0));
            float $$10 = azm.a(this.dL() * (float) (Math.PI / 180.0));
            float $$11 = azm.b(this.dL() * (float) (Math.PI / 180.0));
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

   public asy Z() {
      return this.do;
   }

   public void a(arp $$0) {
      this.a((dfm)$$0);
      this.h.a($$0);
   }

   @Nullable
   private static dfj a(@Nullable ul $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? dfj.a($$0.h($$1)) : null;
   }

   private dfj b(@Nullable dfj $$0) {
      dfj $$1 = this.g.bd();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.g.u();
      }
   }

   @Override
   public void c(@Nullable ul $$0) {
      this.h.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void m(ul $$0) {
      $$0.a("playerGameType", this.h.b().a());
      dfj $$1 = this.h.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean aa() {
      return this.dp;
   }

   public boolean c(arq $$0) {
      return $$0 == this ? false : this.dp || $$0.dp;
   }

   @Override
   public boolean c(arp $$0, jh $$1) {
      return super.c($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cwm $$0) {
      ao.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cot $$1 = this.gg();
      cwm $$2 = $$1.a($$0);
      this.cc.b($$1, $$1.j).ifPresent($$1x -> this.cc.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   @Override
   public void b(cwm $$0) {
      if (!this.gg().f($$0)) {
         this.a($$0, false);
      }
   }

   public boolean ab() {
      return this.dq;
   }

   @Override
   public Optional<cny> ac() {
      return Optional.of(this.ds);
   }

   public void b(boolean $$0) {
      this.dr = $$0;
   }

   @Override
   public void a(clc $$0) {
      super.a($$0);
      bul $$1 = $$0.p();
      if ($$1 != null) {
         ao.S.a(this, $$0.j(), $$1);
      }
   }

   public void a(ya $$0) {
      this.dz = $$0;
   }

   @Nullable
   public ya ad() {
      return this.dz != null && this.dz.b() ? null : this.dz;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cv = (float)(azm.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dL());
      this.f.b(new ado(this));
   }

   @Override
   public boolean a(bul $$0, boolean $$1) {
      if (super.a($$0, $$1)) {
         $$0.j(this);
         this.f.a(new bvu(this.dt(), ezy.c, 0.0F, 0.0F), bvv.k);
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
            this.f.b(new aes($$0.ar(), $$2.c()));
         }
      }
   }

   public agr b(arp $$0) {
      return new agr($$0.af(), $$0.ag(), dgq.a($$0.D()), this.h.b(), this.h.c(), $$0.ah(), $$0.C(), this.gG(), this.aC(), $$0.O());
   }

   @Override
   public void c(jh $$0) {
      this.dt = $$0;
   }

   public void af() {
      this.dt = null;
   }

   @Nullable
   public jh ag() {
      return this.dt;
   }

   @Override
   public ezy ah() {
      bul $$0 = this.dk();
      return $$0 != null && $$0.cX() != this ? $$0.ah() : this.du;
   }

   public void a(ezy $$0) {
      this.du = $$0;
   }

   @Override
   protected float a(bul $$0, float $$1, btb $$2) {
      return dcf.a(this.y(), this.dZ(), $$0, $$2, $$1);
   }

   @Override
   public void a(cwi $$0, but $$1) {
      super.a($$0, $$1);
      this.b(awx.d.b($$0));
   }

   public cos ai() {
      return this.dv;
   }

   public void a(cos $$0) {
      this.dv = $$0;
   }

   public ezy aj() {
      float $$0 = this.dv.c() == this.dv.d() ? 0.0F : (this.dv.c() ? 1.0F : -1.0F);
      float $$1 = this.dv.a() == this.dv.b() ? 0.0F : (this.dv.a() ? 1.0F : -1.0F);
      return a(new ezy((double)$$0, 0.0, (double)$$1), 1.0F, this.dL());
   }

   public void a(cpx $$0) {
      this.dw.add($$0);
   }

   public void b(cpx $$0) {
      this.dw.remove($$0);
   }

   public Set<cpx> ak() {
      return this.dw;
   }

   public long c(cpx $$0) {
      if ($$0.dV() instanceof arp $$1) {
         des $$2 = $$0.dx();
         this.a($$0);
         $$1.i();
         return a($$1, $$2) - 1L;
      } else {
         return 0L;
      }
   }

   public static long a(arp $$0, des $$1) {
      $$0.m().a(arv.f, $$1, 2, $$1);
      return arv.f.b();
   }

   static record a(ezy a, float b) {
      public static arq.a a(ezy $$0, jh $$1) {
         return new arq.a($$0, b($$0, $$1));
      }

      private static float b(ezy $$0, jh $$1) {
         ezy $$2 = ezy.c($$1).d($$0).d();
         return (float)azm.d(azm.d($$2.f, $$2.d) * 180.0F / (float)Math.PI - 90.0);
      }
   }
}
