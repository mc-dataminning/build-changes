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

public class asi extends cpx {
   private static final Logger cz = LogUtils.getLogger();
   private static final int cC = 32;
   private static final int cD = 10;
   private static final int cE = 25;
   public static final double a = 1.0;
   public static final double b = 3.0;
   public static final int c = 2;
   public static final String d = "ender_pearls";
   public static final String e = "ender_pearl_dimension";
   private static final bxm cF = new bxm(alz.b("creative_mode_block_range"), 0.5, bxm.a.a);
   private static final bxm cG = new bxm(alz.b("creative_mode_entity_range"), 2.0, bxm.a.a);
   public atk f;
   public final MinecraftServer g;
   public final asj h;
   private final amh cH;
   private final axl cI;
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
   private cpu cU = cpu.a;
   private arz cV = arz.a;
   private boolean cW = true;
   private long cX = ae.c();
   @Nullable
   private bvk cY;
   private boolean cZ;
   public boolean i;
   private final axk da;
   @Nullable
   private fby db;
   private int dc;
   private boolean dd;
   private int de = 2;
   private String df = "en_us";
   @Nullable
   private fby dg;
   @Nullable
   private fby dh;
   @Nullable
   private fby di;
   private kj dj = kj.a(0, 0, 0);
   private arr dk = arr.a;
   private aly<dhi> dl = dhi.i;
   @Nullable
   private jh dm;
   private boolean dn;
   private float do;
   private final atq dp;
   private boolean dq;
   private boolean dr;
   private boolean ds;
   private cpc dt = new cpc(0, 0, 0);
   @Nullable
   private jh du;
   private fby dv = fby.c;
   private cpv dw = cpv.b;
   private final Set<cra> dx = new HashSet<>();
   private final ctr dy = new ctr() {
      @Override
      public void a(ctc $$0, jz<cxp> $$1, cxp $$2, int[] $$3) {
         asi.this.f.b(new adm($$0.l, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(ctc $$0, int $$1, cxp $$2) {
         asi.this.f.b(new ado($$0.l, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(ctc $$0, cxp $$1) {
         asi.this.f.b(new afy($$1.v()));
      }

      @Override
      public void a(ctc $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(ctc $$0, int $$1, int $$2) {
         asi.this.f.b(new adn($$0.l, $$1, $$2));
      }
   };
   private final ctq dz = new ctq() {
      @Override
      public void a(ctc $$0, int $$1, cxp $$2) {
         cuz $$3 = $$0.b($$1);
         if (!($$3 instanceof cuv)) {
            if ($$3.c == asi.this.gi()) {
               ao.f.a(asi.this, asi.this.gi(), $$2);
            }
         }
      }

      @Override
      public void a(ctc $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private ym dA;
   @Nullable
   public final Object j;
   private final ev dB = new ev() {
      @Override
      public boolean y_() {
         return asi.this.y().N().b(dhe.p);
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
      public void a(xv $$0) {
         asi.this.a($$0);
      }
   };
   private int dC;
   public boolean k;

   public asi(MinecraftServer $$0, ash $$1, GameProfile $$2, ars $$3) {
      super($$1, $$1.Y(), $$1.Z(), $$2);
      this.dp = $$0.a(this);
      this.h = $$0.b(this);
      this.da = new axk(($$1x, $$2x) -> $$0.aI().a($$1x, $$2x));
      this.g = $$0;
      this.cI = $$0.ag().a((cpx)this);
      this.cH = $$0.ag().g(this);
      this.b(this.a($$1, $$1.Y()).c(), 0.0F, 0.0F);
      this.a($$3);
      this.j = null;
   }

   @Override
   public jh a(ash $$0, jh $$1) {
      fbt $$2 = this.a(bws.a).a(fby.c);
      jh $$3 = $$1;
      if ($$0.G_().g() && $$0.p().aZ().k() != dhf.c) {
         int $$4 = Math.max(0, this.g.a($$0));
         int $$5 = bae.a($$0.F_().b((double)$$1.u(), (double)$$1.w()));
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
         int $$10 = bam.a().a($$8);

         for (int $$11 = 0; $$11 < $$8; $$11++) {
            int $$12 = ($$10 + $$9 * $$11) % $$8;
            int $$13 = $$12 % ($$4 * 2 + 1);
            int $$14 = $$12 / ($$4 * 2 + 1);
            int $$15 = $$1.u() + $$13 - $$4;
            int $$16 = $$1.w() + $$14 - $$4;

            try {
               $$3 = asb.a($$0, $$15, $$16);
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

      while (!this.a($$0, $$2.c($$3.c())) && $$3.v() < $$0.am()) {
         $$3 = $$3.d();
      }

      while (this.a($$0, $$2.c($$3.e().c())) && $$3.v() > $$0.L_() + 1) {
         $$3 = $$3.e();
      }

      return $$3;
   }

   private boolean a(ash $$0, fbt $$1) {
      return $$0.a(this, $$1, true);
   }

   private int t(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         cpc.a.parse(new Dynamic(vl.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(cz::error).ifPresent($$0x -> this.dt = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         ux $$1 = $$0.p("enteredNetherPosition");
         this.dh = new fby($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.i = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.da.a($$0.p("recipeBook"), $$0x -> this.g.aI().b($$0x).isPresent());
      }

      if (this.fR()) {
         this.fS();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.dm = new jh($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.dn = $$0.q("SpawnForced");
         this.do = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.dl = dhi.h.parse(vl.a, $$0.c("SpawnDimension")).resultOrPartial(cz::error).orElse(dhi.i);
         }
      }

      this.ds = $$0.q("spawn_extra_particles_on_fall");
      vu $$2 = $$0.c("raid_omen_position");
      if ($$2 != null) {
         jh.a.parse(vl.a, $$2).resultOrPartial(cz::error).ifPresent($$0x -> this.du = $$0x);
      }
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      cpc.a.encodeStart(vl.a, this.dt).resultOrPartial(cz::error).ifPresent($$1x -> $$0.a("warden_spawn_tracker", $$1x));
      this.m($$0);
      $$0.a("seenCredits", this.i);
      if (this.dh != null) {
         ux $$1 = new ux();
         $$1.a("x", this.dh.d);
         $$1.a("y", this.dh.e);
         $$1.a("z", this.dh.f);
         $$0.a("enteredNetherPosition", $$1);
      }

      this.k($$0);
      $$0.a("recipeBook", this.da.b());
      $$0.a("Dimension", this.dW().ah().a().toString());
      if (this.dm != null) {
         $$0.a("SpawnX", this.dm.u());
         $$0.a("SpawnY", this.dm.v());
         $$0.a("SpawnZ", this.dm.w());
         $$0.a("SpawnForced", this.dn);
         $$0.a("SpawnAngle", this.do);
         alz.a.encodeStart(vl.a, this.dl.a()).resultOrPartial(cz::error).ifPresent($$1x -> $$0.a("SpawnDimension", $$1x));
      }

      $$0.a("spawn_extra_particles_on_fall", this.ds);
      if (this.du != null) {
         jh.a.encodeStart(vl.a, this.du).resultOrPartial(cz::error).ifPresent($$1x -> $$0.a("raid_omen_position", $$1x));
      }

      this.l($$0);
   }

   private void k(ux $$0) {
      bvk $$1 = this.dg();
      bvk $$2 = this.dl();
      if ($$2 != null && $$1 != this && $$1.df()) {
         ux $$3 = new ux();
         ux $$4 = new ux();
         $$1.e($$4);
         $$3.a("Attach", $$2.cG());
         $$3.a("Entity", $$4);
         $$0.a("RootVehicle", $$3);
      }
   }

   public void a(Optional<ux> $$0) {
      if ($$0.isPresent() && $$0.get().b("RootVehicle", 10) && this.dW() instanceof ash $$1) {
         ux $$2 = $$0.get().p("RootVehicle");
         bvk $$3 = bvr.a($$2.p("Entity"), $$1, bvq.r, $$1x -> !$$1.c($$1x) ? null : $$1x);
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
            for (bvk $$6 : $$3.dd()) {
               if ($$6.cG().equals($$4)) {
                  this.a($$6, true);
                  break;
               }
            }
         }

         if (!this.bZ()) {
            cz.warn("Couldn't reattach entity to player");
            $$3.at();

            for (bvk $$7 : $$3.dd()) {
               $$7.at();
            }
         }
      }
   }

   private void l(ux $$0) {
      if (!this.dx.isEmpty()) {
         vd $$1 = new vd();

         for (cra $$2 : this.dx) {
            if ($$2.dR()) {
               cz.warn("Trying to save removed ender pearl, skipping");
            } else {
               ux $$3 = new ux();
               $$2.e($$3);
               alz.a.encodeStart(vl.a, $$2.dW().ah().a()).resultOrPartial(cz::error).ifPresent($$1x -> $$3.a("ender_pearl_dimension", $$1x));
               $$1.add($$3);
            }
         }

         $$0.a("ender_pearls", $$1);
      }
   }

   public void b(Optional<ux> $$0) {
      if ($$0.isPresent() && $$0.get().b("ender_pearls", 9) && $$0.get().c("ender_pearls") instanceof vd $$2) {
         $$2.forEach($$0x -> {
            if ($$0x instanceof ux $$1 && $$1.e("ender_pearl_dimension")) {
               Optional<aly<dhi>> $$2x = dhi.h.parse(vl.a, $$1.c("ender_pearl_dimension")).resultOrPartial(cz::error);
               if ($$2x.isEmpty()) {
                  cz.warn("No dimension defined for ender pearl, skipping");
                  return;
               }

               ash $$3 = this.dW().p().a($$2x.get());
               if ($$3 != null) {
                  bvk $$4 = bvr.a($$1, $$3, bvq.r, $$1x -> !$$3.c($$1x) ? null : $$1x);
                  if ($$4 != null) {
                     a($$3, $$4.dy());
                  } else {
                     cz.warn("Failed to spawn player ender pearl in level ({}), skipping", $$2x.get());
                  }
               } else {
                  cz.warn("Trying to load ender pearl without level ({}) being loaded, skipping", $$2x.get());
               }
            }
         });
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gs();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.cs = bae.a((float)$$0 / $$1, 0.0F, $$2);
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
   public void a(cxp $$0, int $$1) {
      super.a($$0, $$1);
      this.cS = -1;
   }

   private void a(ctc $$0) {
      $$0.a(this.dz);
      $$0.a(this.dy);
   }

   public void d() {
      this.a(this.cc);
   }

   @Override
   public void i_() {
      super.i_();
      this.f.b(aew.a);
   }

   @Override
   public void j_() {
      super.j_();
      this.f.b(new aev(this.eQ()));
   }

   @Override
   public void a(dxv $$0) {
      ao.e.a(this, $$0);
   }

   @Override
   protected cxm g() {
      return new cyp(this);
   }

   @Override
   public void h() {
      this.h.a();
      this.dt.a();
      this.cT--;
      if (this.aj > 0) {
         this.aj--;
      }

      this.cd.d();
      if (!this.dW().C && !this.cd.b(this)) {
         this.p();
         this.cd = this.cc;
      }

      bvk $$0 = this.L();
      if ($$0 != this) {
         if ($$0.bL()) {
            this.a($$0.dB(), $$0.dD(), $$0.dH(), $$0.dM(), $$0.dO());
            this.y().m().a(this);
            if (this.fZ()) {
               this.d(this);
            }
         } else {
            this.d(this);
         }
      }

      ao.x.a(this);
      if (this.db != null) {
         ao.v.a(this, this.db, this.af - this.dc);
      }

      this.l();
      this.m();
      this.gP();
      this.cH.b(this);
   }

   private void gP() {
      bxk $$0 = this.g(bxo.g);
      if ($$0 != null) {
         if (this.b()) {
            $$0.a(cF);
         } else {
            $$0.e(cF);
         }
      }

      bxk $$1 = this.g(bxo.j);
      if ($$1 != null) {
         if (this.b()) {
            $$1.a(cG);
         } else {
            $$1.e(cG);
         }
      }
   }

   public void i() {
      try {
         if (!this.aa_() || !this.dp()) {
            super.h();
         }

         for (int $$0 = 0; $$0 < this.gi().b(); $$0++) {
            cxp $$1 = this.gi().a($$0);
            if (!$$1.f()) {
               this.j($$1);
            }
         }

         if (this.eE() != this.cP || this.cQ != this.ce.a() || this.ce.c() == 0.0F != this.cR) {
            this.f.b(new agg(this.eE(), this.ce.a(), this.ce.c()));
            this.cP = this.eE();
            this.cQ = this.ce.a();
            this.cR = this.ce.c() == 0.0F;
         }

         if (this.eE() + this.fw() != this.cJ) {
            this.cJ = this.eE() + this.fw();
            this.a(fdg.g, bae.f(this.cJ));
         }

         if (this.ce.a() != this.cK) {
            this.cK = this.ce.a();
            this.a(fdg.h, bae.f((float)this.cK));
         }

         if (this.ct() != this.cL) {
            this.cL = this.ct();
            this.a(fdg.i, bae.f((float)this.cL));
         }

         if (this.eP() != this.cM) {
            this.cM = this.eP();
            this.a(fdg.j, bae.f((float)this.cM));
         }

         if (this.cr != this.cO) {
            this.cO = this.cr;
            this.a(fdg.k, bae.f((float)this.cO));
         }

         if (this.cq != this.cN) {
            this.cN = this.cq;
            this.a(fdg.l, bae.f((float)this.cN));
         }

         if (this.cr != this.cS) {
            this.cS = this.cr;
            this.f.b(new agf(this.cs, this.cr, this.cq));
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

   private void j(cxp $$0) {
      evp $$1 = $$0.a(ku.L);
      evr $$2 = cyc.a($$1, this.dW());
      if ($$2 != null) {
         aac<?> $$3 = $$2.a($$1, this);
         if ($$3 != null) {
            this.f.b($$3);
         }
      }
   }

   @Override
   protected void j() {
      if (this.dW().al() == btg.a && this.y().N().b(dhe.k)) {
         if (this.af % 20 == 0) {
            if (this.eE() < this.eS()) {
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
      if (this.eE() > 0.0F && this.dg != null) {
         ao.X.a(this, this.dg);
      }

      this.dg = null;
      super.k();
   }

   public void l() {
      if (this.Z > 0.0F && this.dg == null) {
         this.dg = this.du();
         if (this.cx != null && this.cx.e <= this.dg.e) {
            ao.ae.a(this, this.cx, this.cy);
         }
      }
   }

   @Override
   public void m() {
      if (this.dl() != null && this.dl().bx()) {
         if (this.di == null) {
            this.di = this.du();
         } else {
            ao.Y.a(this, this.di);
         }
      }

      if (this.di != null && (this.dl() == null || !this.dl().bx())) {
         this.di = null;
      }
   }

   private void a(fdg $$0, int $$1) {
      this.gy().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(bua $$0) {
      this.a(ecr.p);
      boolean $$1 = this.y().N().b(dhe.n);
      if ($$1) {
         xv $$2 = this.eQ().a();
         this.f.a(new aex(this.ar(), $$2), xc.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            xv $$3x = xv.a("death.attack.message_too_long", xv.b($$2x).a(n.o));
            xv $$4x = xv.a("death.attack.even_more_magic", this.p_()).a($$1xx -> $$1xx.a(new yb(yb.a.a, $$3x)));
            return new aex(this.ar(), $$4x);
         }));
         fdf $$3 = this.cr();
         if ($$3 == null || $$3.k() == fdf.b.a) {
            this.g.ag().a($$2, false);
         } else if ($$3.k() == fdf.b.c) {
            this.g.ag().a(this, $$2);
         } else if ($$3.k() == fdf.b.d) {
            this.g.ag().b(this, $$2);
         }
      } else {
         this.f.b(new aex(this.ar(), xu.a));
      }

      this.gx();
      if (this.y().N().b(dhe.O)) {
         this.gQ();
      }

      if (!this.aa_()) {
         this.b(this.y(), $$0);
      }

      this.gy().a(fdg.d, this, fdb::b);
      bwg $$4 = this.eR();
      if ($$4 != null) {
         this.b(axp.h.b($$4.aq()));
         $$4.a(this, this.bl, $$0);
         this.f($$4);
      }

      this.dW().a(this, (byte)3);
      this.a(axp.N);
      this.a(axp.i.b(axp.m));
      this.a(axp.i.b(axp.n));
      this.aH();
      this.k(0);
      this.c(false);
      this.eQ().c();
      this.c(Optional.of(jp.a(this.dW().ah(), this.dw())));
   }

   private void gQ() {
      fbt $$0 = new fbt(this.dw()).c(32.0, 10.0, 32.0);
      this.dW().a(bwi.class, $$0, bvp.f).stream().filter($$0x -> $$0x instanceof bwl).forEach($$0x -> ((bwl)$$0x).a_(this.y(), this));
   }

   @Override
   public void a(bvk $$0, int $$1, bua $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.r($$1);
         this.gy().a(fdg.f, this, fdb::b);
         if ($$0 instanceof cpx) {
            this.a(axp.Q);
            this.gy().a(fdg.e, this, fdb::b);
         } else {
            this.a(axp.O);
         }

         this.a(this, $$0, fdg.m);
         this.a($$0, this, fdg.n);
         ao.c.a(this, $$0, $$2);
      }
   }

   private void a(fdc $$0, fdc $$1, fdg[] $$2) {
      fcy $$3 = this.gy().e($$1.cI());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gy().a($$2[$$4], $$0, fdb::b);
         }
      }
   }

   @Override
   public boolean a(ash $$0, bua $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         boolean $$3 = this.g.n() && this.gR() && $$1.a(axw.m);
         if (!$$3 && this.cT > 0 && !$$1.a(axw.d)) {
            return false;
         } else {
            bvk $$4 = $$1.d();
            if ($$4 instanceof cpx $$5 && !this.a($$5)) {
               return false;
            }

            if ($$4 instanceof cqe $$6 && $$6.p() instanceof cpx $$8 && !this.a($$8)) {
               return false;
            }

            return super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   public boolean a(cpx $$0) {
      return !this.gR() ? false : super.a($$0);
   }

   private boolean gR() {
      return this.g.ac();
   }

   public eux a(boolean $$0, eux.a $$1) {
      jh $$2 = this.T();
      float $$3 = this.U();
      boolean $$4 = this.W();
      ash $$5 = this.g.a(this.V());
      if ($$5 != null && $$2 != null) {
         Optional<asi.a> $$6 = a($$5, $$2, $$3, $$4, $$0);
         if ($$6.isPresent()) {
            asi.a $$7 = $$6.get();
            return new eux($$5, $$7.a(), fby.c, $$7.b(), 0.0F, $$1);
         } else {
            return eux.a(this.g.J(), this, $$1);
         }
      } else {
         return new eux(this.g.J(), this, $$1);
      }
   }

   private static Optional<asi.a> a(ash $$0, jh $$1, float $$2, boolean $$3, boolean $$4) {
      dxv $$5 = $$0.a_($$1);
      dkm $$6 = $$5.b();
      if ($$6 instanceof dqx && ($$3 || $$5.c(dqx.d) > 0) && dqx.a($$0)) {
         Optional<fby> $$7 = dqx.a(bvr.bS, $$0, $$1);
         if (!$$3 && $$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.b(dqx.d, Integer.valueOf($$5.c(dqx.d) - 1)), 3);
         }

         return $$7.map($$1x -> asi.a.a($$1x, $$1));
      } else if ($$6 instanceof dkf && dkf.a($$0)) {
         return dkf.a(bvr.bS, $$0, $$1, $$5.c(dkf.aF), $$2).map($$1x -> asi.a.a($$1x, $$1));
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dxv $$9 = $$0.a_($$1.d());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new asi.a(new fby((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5), $$2)) : Optional.empty();
      }
   }

   public void n() {
      this.ao();
      this.y().a(this, bvk.d.e);
      if (!this.k) {
         this.k = true;
         this.f.b(new adz(adz.f, 0.0F));
         this.i = true;
      }
   }

   @Nullable
   public asi a(eux $$0) {
      if (this.dR()) {
         return null;
      } else {
         if ($$0.g()) {
            this.f.b(new adz(adz.b, 0.0F));
         }

         ash $$1 = $$0.b();
         ash $$2 = this.y();
         aly<dhi> $$3 = $$2.ah();
         if (!$$0.h()) {
            this.ae();
         }

         if ($$1.ah() == $$3) {
            this.f.a(bwt.a($$0), $$0.i());
            this.f.l();
            $$0.j().onTransition(this);
            return this;
         } else {
            this.cZ = true;
            evz $$4 = $$1.D_();
            this.f.b(new afk(this.b($$1), (byte)3));
            this.f.b(new ade($$4.q(), $$4.r()));
            awi $$5 = this.g.ag();
            $$5.e(this);
            $$2.a(this, bvk.d.e);
            this.dT();
            bpt $$6 = bps.a();
            $$6.a("moving");
            if ($$3 == dhi.i && $$1.ah() == dhi.j) {
               this.dh = this.du();
            }

            $$6.c();
            $$6.a("placing");
            this.a($$1);
            this.f.a(bwt.a($$0), $$0.i());
            this.f.l();
            $$1.d(this);
            $$6.c();
            this.g($$2);
            this.fF();
            this.f.b(new aet(this.gj()));
            $$5.a(this, $$1);
            $$5.f(this);
            $$5.d(this);
            $$0.j().onTransition(this);
            this.cS = -1;
            this.cP = -1.0F;
            this.cQ = -1;
            return this;
         }
      }
   }

   @Override
   public void a(float $$0, float $$1) {
      this.f.b(new afc($$0, $$1));
   }

   private void g(ash $$0) {
      aly<dhi> $$1 = $$0.ah();
      aly<dhi> $$2 = this.dW().ah();
      ao.w.a(this, $$1, $$2);
      if ($$1 == dhi.j && $$2 == dhi.i && this.dh != null) {
         ao.D.a(this, this.dh);
      }

      if ($$2 != dhi.j) {
         this.dh = null;
      }
   }

   @Override
   public boolean a(asi $$0) {
      if ($$0.aa_()) {
         return this.L() == this;
      } else {
         return this.aa_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bvk $$0, int $$1) {
      super.a($$0, $$1);
      this.cd.d();
   }

   @Override
   public Either<cpx.a, bbk> a(jh $$0) {
      jm $$1 = this.dW().a_($$0).c(dok.aF);
      if (this.fR() || !this.bL()) {
         return Either.left(cpx.a.e);
      } else if (!this.dW().G_().j()) {
         return Either.left(cpx.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cpx.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cpx.a.d);
      } else {
         this.a(this.dW().ah(), $$0, this.dM(), false, true);
         if (this.dW().U()) {
            return Either.left(cpx.a.b);
         } else {
            if (!this.b()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               fby $$4 = fby.c($$0);
               List<cmx> $$5 = this.dW()
                  .a(
                     cmx.class,
                     new fbt($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0),
                     $$0x -> $$0x.a(this.y(), this)
                  );
               if (!$$5.isEmpty()) {
                  return Either.left(cpx.a.f);
               }
            }

            Either<cpx.a, bbk> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(axp.ap);
               ao.r.a(this);
            });
            if (!this.y().e()) {
               this.a(xv.c("sleep.not_possible"), true);
            }

            ((ash)this.dW()).f();
            return $$6;
         }
      }
   }

   @Override
   public void b(jh $$0) {
      this.a(axp.i.b(axp.n));
      super.b($$0);
   }

   private boolean a(jh $$0, jm $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(jh $$0) {
      fby $$1 = fby.c($$0);
      return Math.abs(this.dB() - $$1.a()) <= 3.0 && Math.abs(this.dD() - $$1.b()) <= 2.0 && Math.abs(this.dH() - $$1.c()) <= 3.0;
   }

   private boolean b(jh $$0, jm $$1) {
      jh $$2 = $$0.d();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fR()) {
         this.y().m().a(this, new acu(this, 2));
      }

      super.a($$0, $$1);
      if (this.f != null) {
         this.f.a(this.dB(), this.dD(), this.dH(), this.dM(), this.dO());
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.bQ();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public boolean a(ash $$0, bua $$1) {
      return super.a($$0, $$1) || this.Q() && !$$1.a(bud.m);
   }

   @Override
   protected void a(double $$0, boolean $$1, dxv $$2, jh $$3) {
   }

   @Override
   protected void b(ash $$0, jh $$1) {
      if (!this.aa_()) {
         super.b($$0, $$1);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.dp()) {
         this.a($$3, new fby($$0, $$1, $$2));
         jh $$4 = this.aP();
         dxv $$5 = this.dW().a_($$4);
         if (this.ds && $$3 && this.Z > 0.0F) {
            fby $$6 = $$4.b().b(0.0, 0.5, 0.0);
            int $$7 = (int)bae.a(50.0F * this.Z, 0.0F, 200.0F);
            this.y().a(new lk(ls.b, $$5), $$6.d, $$6.e, $$6.f, $$7, 0.3F, 0.3F, 0.3F, 0.15F);
            this.ds = false;
         }

         super.a($$1, $$3, $$5, $$4);
      }
   }

   @Override
   public void b_(@Nullable bvk $$0) {
      super.b_($$0);
      this.cx = this.du();
      this.cy = $$0;
      this.w($$0 != null && $$0.aq() == bvr.bH);
   }

   @Override
   protected void o() {
      if (this.dW().t().i()) {
         super.o();
      }
   }

   @Override
   public void a(dwk $$0, boolean $$1) {
      this.f.b(new ada(this.dW(), $$0.aB_()));
      this.f.b(new aer($$0.aB_(), $$1));
   }

   private void gS() {
      this.dC = this.dC % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable btl $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.cd != this.cc) {
            this.p();
         }

         this.gS();
         ctc $$1 = $$0.createMenu(this.dC, this.gi(), this);
         if ($$1 == null) {
            if (this.aa_()) {
               this.a(xv.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.f.b(new aeq($$1.l, $$1.a(), $$0.p_()));
            this.a($$1);
            this.cd = $$1;
            return OptionalInt.of(this.dC);
         }
      }
   }

   @Override
   public void a(int $$0, dgg $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.f.b(new ael($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(ckb $$0, btc $$1) {
      if (this.cd != this.cc) {
         this.p();
      }

      this.gS();
      int $$2 = $$0.ag_();
      this.f.b(new aea(this.dC, $$2, $$0.ar()));
      this.cd = new cue(this.dC, this.gi(), $$1, $$0, $$2);
      this.a(this.cd);
   }

   @Override
   public void a(cxp $$0, bti $$1) {
      if ($$0.b(ku.T)) {
         if (czl.a($$0, this.A(), this)) {
            this.cd.d();
         }

         this.f.b(new aep($$1));
      }
   }

   @Override
   public void a(dvh $$0) {
      this.f.b(acy.a($$0, dux::e));
   }

   @Override
   public void p() {
      this.f.b(new adl(this.cd.l));
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
      double $$0 = this.dB();
      double $$1 = this.dD();
      double $$2 = this.dH();
      super.r();
      this.q(this.dB() - $$0, this.dD() - $$1, this.dH() - $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (!this.bZ() && !r($$0, $$1, $$2)) {
         if (this.ck()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(axp.C, $$3);
               this.G(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(aya.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(axp.w, $$4);
               this.G(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.bj()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(axp.s, $$5);
               this.G(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.q_()) {
            if ($$1 > 0.0) {
               this.a(axp.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aJ()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.cj()) {
                  this.a(axp.r, $$6);
                  this.G(0.1F * (float)$$6 * 0.01F);
               } else if (this.ci()) {
                  this.a(axp.q, $$6);
                  this.G(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(axp.p, $$6);
                  this.G(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fJ()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(axp.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(axp.v, $$8);
            }
         }
      }
   }

   private void q(double $$0, double $$1, double $$2) {
      if (this.bZ() && !r($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         bvk $$4 = this.dl();
         if ($$4 instanceof crw) {
            this.a(axp.x, $$3);
         } else if ($$4 instanceof cru) {
            this.a(axp.y, $$3);
         } else if ($$4 instanceof cio) {
            this.a(axp.z, $$3);
         } else if ($$4 instanceof ckb) {
            this.a(axp.A, $$3);
         } else if ($$4 instanceof cnk) {
            this.a(axp.D, $$3);
         }
      }
   }

   private static boolean r(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(axm<?> $$0, int $$1) {
      this.cI.b(this, $$0, $$1);
      this.gy().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(axm<?> $$0) {
      this.cI.a(this, $$0, 0);
      this.gy().a($$0, this, fdb::c);
   }

   @Override
   public int a(Collection<dcj<?>> $$0) {
      return this.da.a($$0, this);
   }

   @Override
   public void a(dcj<?> $$0, List<cxp> $$1) {
      ao.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<aly<dce<?>>> $$0) {
      List<dcj<?>> $$1 = $$0.stream().flatMap($$0x -> this.g.aI().b($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<dcj<?>> $$0) {
      return this.da.b($$0, this);
   }

   @Override
   public void s() {
      super.s();
      this.a(axp.E);
      if (this.cj()) {
         this.G(0.2F);
      } else {
         this.G(0.05F);
      }
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cS = -1;
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
      this.cP = -1.0E8F;
   }

   @Override
   public void a(xv $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void w() {
      if (!this.bz.f() && this.fz()) {
         this.f.b(new adv(this, (byte)9));
         super.w();
      }
   }

   @Override
   public void a(fi.a $$0, fby $$1) {
      super.a($$0, $$1);
      this.f.b(new afa($$0, $$1.d, $$1.e, $$1.f));
   }

   public void a(fi.a $$0, bvk $$1, fi.a $$2) {
      fby $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.f.b(new afa($$0, $$1, $$2));
   }

   public void a(asi $$0, boolean $$1) {
      this.dt = $$0.dt;
      this.dA = $$0.dA;
      this.h.a($$0.h.b(), $$0.h.c());
      this.x();
      if ($$1) {
         this.eY().b($$0.eY());
         this.eY().c($$0.eY());
         this.x($$0.eE());
         this.ce = $$0.ce;

         for (bup $$2 : $$0.eB()) {
            this.a(new bup($$2));
         }

         this.gi().a($$0.gi());
         this.cq = $$0.cq;
         this.cr = $$0.cr;
         this.cs = $$0.cs;
         this.q($$0.gd());
         this.as = $$0.as;
      } else {
         this.eY().b($$0.eY());
         this.x(this.eS());
         if (this.y().N().b(dhe.d) || $$0.aa_()) {
            this.gi().a($$0.gi());
            this.cq = $$0.cq;
            this.cr = $$0.cr;
            this.cs = $$0.cs;
            this.q($$0.gd());
         }
      }

      this.ct = $$0.ct;
      this.cb = $$0.cb;
      this.au().a(bX, $$0.au().a(bX));
      this.cS = -1;
      this.cP = -1.0F;
      this.cQ = -1;
      this.da.a($$0.da);
      this.i = $$0.i;
      this.dh = $$0.dh;
      this.dk = $$0.dk;
      this.i($$0.gA());
      this.j($$0.gB());
      this.c($$0.gI());
   }

   @Override
   protected void a(bup $$0, @Nullable bvk $$1) {
      super.a($$0, $$1);
      this.f.b(new ahf(this.ar(), $$0, true));
      if ($$0.a(bur.y)) {
         this.dc = this.af;
         this.db = this.du();
      }

      ao.B.a(this, $$1);
   }

   @Override
   protected void a(bup $$0, boolean $$1, @Nullable bvk $$2) {
      super.a($$0, $$1, $$2);
      this.f.b(new ahf(this.ar(), $$0, false));
      ao.B.a(this, $$2);
   }

   @Override
   protected void c(Collection<bup> $$0) {
      super.c($$0);

      for (bup $$1 : $$0) {
         this.f.b(new afi(this.ar(), $$1.c()));
         if ($$1.a(bur.y)) {
            this.db = null;
         }
      }

      ao.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.f.a(new bwt(new fby($$0, $$1, $$2), fby.c, 0.0F, 0.0F), bwu.a(bwu.l, bwu.k));
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.f.a(new bwt(new fby($$0, $$1, $$2), fby.c, 0.0F, 0.0F), bwu.j);
   }

   @Override
   public boolean a(ash $$0, double $$1, double $$2, double $$3, Set<bwu> $$4, float $$5, float $$6, boolean $$7) {
      dgo $$8 = new dgo(jh.a($$1, $$2, $$3));
      $$0.m().a(asn.g, $$8, 1, this.ar());
      if (this.fR()) {
         this.a(true, true);
      }

      if ($$7) {
         this.d(this);
      }

      boolean $$9 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$9) {
         this.q($$4.contains(bwu.d) ? this.cA() + $$5 : $$5);
      }

      return $$9;
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      super.e($$0, $$1, $$2);
      this.f.l();
   }

   @Override
   public void b(bvk $$0) {
      this.y().m().a(this, new acu($$0, 4));
   }

   @Override
   public void c(bvk $$0) {
      this.y().m().a(this, new acu($$0, 5));
   }

   @Override
   public void x() {
      if (this.f != null) {
         this.f.b(new aet(this.gj()));
         this.K();
      }
   }

   public ash y() {
      return (ash)this.dW();
   }

   public boolean a(dhf $$0) {
      boolean $$1 = this.aa_();
      if (!this.h.a($$0)) {
         return false;
      } else {
         this.f.b(new adz(adz.e, (float)$$0.a()));
         if ($$0 == dhf.d) {
            this.gx();
            this.ae();
            deb.a(this);
         } else {
            this.d(this);
            if ($$1) {
               deb.a(this.y(), this);
            }
         }

         this.x();
         this.fx();
         return true;
      }
   }

   @Override
   public boolean aa_() {
      return this.h.b() == dhf.d;
   }

   @Override
   public boolean b() {
      return this.h.b() == dhf.b;
   }

   public ev z() {
      return this.dB;
   }

   public ew A() {
      return new ew(this.z(), this.du(), this.bU(), this.y(), this.G(), this.al().getString(), this.p_(), this.g, this);
   }

   public void a(xv $$0) {
      this.b($$0, false);
   }

   public void b(xv $$0, boolean $$1) {
      if (this.x($$1)) {
         this.f.a(new agw($$0, $$1), xc.a(() -> {
            if (this.x(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               xv $$3 = xv.b($$2).a(n.o);
               return new agw(xv.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(yk $$0, boolean $$1, xr.a $$2) {
      if (this.gT()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String B() {
      return this.f.m() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(ars $$0) {
      this.df = $$0.b();
      this.de = $$0.c();
      this.cU = $$0.d();
      this.cW = $$0.e();
      this.dq = $$0.h();
      this.dr = $$0.i();
      this.cV = $$0.j();
      this.au().a(bX, (byte)$$0.f());
      this.au().a(bY, (byte)$$0.g().b());
   }

   public ars C() {
      int $$0 = this.au().a(bX);
      bwa $$1 = bwa.d.apply(this.au().a(bY));
      return new ars(this.df, this.de, this.cU, this.cW, $$0, $$1, this.dq, this.dr, this.cV);
   }

   public boolean D() {
      return this.cW;
   }

   public cpu E() {
      return this.cU;
   }

   private boolean x(boolean $$0) {
      return this.cU == cpu.c ? $$0 : true;
   }

   private boolean gT() {
      return this.cU == cpu.a;
   }

   public int F() {
      return this.de;
   }

   public void a(akw $$0) {
      this.f.b(new afo($$0.a(), $$0.d().map(akw.a::a)));
   }

   @Override
   protected int G() {
      return this.g.c(this.gh());
   }

   @Override
   public void H() {
      this.cX = ae.c();
   }

   public axl I() {
      return this.cI;
   }

   public axk J() {
      return this.da;
   }

   @Override
   protected void K() {
      if (this.aa_()) {
         this.ez();
         this.k(true);
      } else {
         super.K();
      }
   }

   public bvk L() {
      return (bvk)(this.cY == null ? this : this.cY);
   }

   @Override
   public void d(@Nullable bvk $$0) {
      bvk $$1 = this.L();
      this.cY = (bvk)($$0 == null ? this : $$0);
      if ($$1 != this.cY) {
         if (this.cY.dW() instanceof ash $$2) {
            this.a($$2, this.cY.dB(), this.cY.dD(), this.cY.dH(), Set.of(), this.dM(), this.dO(), false);
         }

         if ($$0 != null) {
            this.y().m().a(this);
         }

         this.f.b(new afv(this.cY));
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
   public void e(bvk $$0) {
      if (this.h.b() == dhf.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long N() {
      return this.cX;
   }

   @Nullable
   public xv O() {
      return null;
   }

   public int P() {
      return 0;
   }

   @Override
   public void a(bti $$0) {
      super.a($$0);
      this.gD();
   }

   public boolean Q() {
      return this.cZ;
   }

   public void R() {
      this.cZ = false;
   }

   public amh S() {
      return this.cH;
   }

   @Nullable
   public jh T() {
      return this.dm;
   }

   public float U() {
      return this.do;
   }

   public aly<dhi> V() {
      return this.dl;
   }

   public boolean W() {
      return this.dn;
   }

   public void b(asi $$0) {
      this.a($$0.V(), $$0.T(), $$0.U(), $$0.W(), false);
   }

   public void a(aly<dhi> $$0, @Nullable jh $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.dm) && $$0.equals(this.dl);
         if ($$4 && !$$5) {
            this.a(xv.c("block.minecraft.set_spawn"));
         }

         this.dm = $$1;
         this.dl = $$0;
         this.do = $$2;
         this.dn = $$3;
      } else {
         this.dm = null;
         this.dl = dhi.i;
         this.do = 0.0F;
         this.dn = false;
      }
   }

   public kj X() {
      return this.dj;
   }

   public void a(kj $$0) {
      this.dj = $$0;
   }

   public arr Y() {
      return this.dk;
   }

   public void a(arr $$0) {
      this.dk = $$0;
   }

   @Override
   public void a(axe $$0, axg $$1, float $$2, float $$3) {
      this.f.b(new agt(ma.b.e($$0), $$1, this.dB(), this.dD(), this.dH(), $$2, $$3, this.ae.g()));
   }

   @Override
   public cmb a(cxp $$0, boolean $$1, boolean $$2) {
      cmb $$3 = this.b($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dW().b($$3);
         cxp $$4 = $$3.l();
         if ($$2) {
            if (!$$4.f()) {
               this.a(axp.f.b($$4.h()), $$0.L());
            }

            this.a(axp.F);
         }

         return $$3;
      }
   }

   @Nullable
   private cmb b(cxp $$0, boolean $$1, boolean $$2) {
      if ($$0.f()) {
         return null;
      } else {
         double $$3 = this.dF() - 0.3F;
         cmb $$4 = new cmb(this.dW(), this.dB(), $$3, this.dH(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.ae.i() * 0.5F;
            float $$6 = this.ae.i() * (float) (Math.PI * 2);
            $$4.n((double)(-bae.a($$6) * $$5), 0.2F, (double)(bae.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = bae.a(this.dO() * (float) (Math.PI / 180.0));
            float $$9 = bae.b(this.dO() * (float) (Math.PI / 180.0));
            float $$10 = bae.a(this.dM() * (float) (Math.PI / 180.0));
            float $$11 = bae.b(this.dM() * (float) (Math.PI / 180.0));
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

   public atq Z() {
      return this.dp;
   }

   public void a(ash $$0) {
      this.a((dhi)$$0);
      this.h.a($$0);
   }

   @Nullable
   private static dhf a(@Nullable ux $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? dhf.a($$0.h($$1)) : null;
   }

   private dhf b(@Nullable dhf $$0) {
      dhf $$1 = this.g.bd();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.g.u();
      }
   }

   @Override
   public void c(@Nullable ux $$0) {
      this.h.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void m(ux $$0) {
      $$0.a("playerGameType", this.h.b().a());
      dhf $$1 = this.h.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean aa() {
      return this.dq;
   }

   public boolean c(asi $$0) {
      return $$0 == this ? false : this.dq || $$0.dq;
   }

   @Override
   public boolean c(ash $$0, jh $$1) {
      return super.c($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cxp $$0) {
      ao.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cpw $$1 = this.gi();
      cxp $$2 = $$1.a($$0);
      this.cd.b($$1, $$1.j).ifPresent($$1x -> this.cd.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   @Override
   public void b(cxp $$0) {
      if (!this.gi().f($$0)) {
         this.a($$0, false);
      }
   }

   public boolean ab() {
      return this.dr;
   }

   @Override
   public Optional<cpc> ac() {
      return Optional.of(this.dt);
   }

   public void b(boolean $$0) {
      this.ds = $$0;
   }

   @Override
   public void a(cmb $$0) {
      super.a($$0);
      bvk $$1 = $$0.p();
      if ($$1 != null) {
         ao.S.a(this, $$0.l(), $$1);
      }
   }

   public void a(ym $$0) {
      this.dA = $$0;
   }

   @Nullable
   public ym ad() {
      return this.dA != null && this.dA.b() ? null : this.dA;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cw = (float)(bae.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dM());
      this.f.b(new aeb(this));
   }

   @Override
   public boolean a(bvk $$0, boolean $$1) {
      if (super.a($$0, $$1)) {
         $$0.j(this);
         this.f.a(new bwt(this.du(), fby.c, 0.0F, 0.0F), bwu.k);
         if ($$0 instanceof bwg $$2) {
            this.g.ag().a($$2, this.f);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void ae() {
      bvk $$0 = this.dl();
      super.ae();
      if ($$0 instanceof bwg $$1) {
         for (bup $$2 : $$1.eB()) {
            this.f.b(new afi($$0.ar(), $$2.c()));
         }
      }
   }

   public ahh b(ash $$0) {
      return new ahh($$0.ag(), $$0.ah(), dim.a($$0.D()), this.h.b(), this.h.c(), $$0.ai(), $$0.C(), this.gI(), this.aC(), $$0.O());
   }

   @Override
   public void c(jh $$0) {
      this.du = $$0;
   }

   public void af() {
      this.du = null;
   }

   @Nullable
   public jh ag() {
      return this.du;
   }

   @Override
   public fby ah() {
      bvk $$0 = this.dl();
      return $$0 != null && $$0.cX() != this ? $$0.ah() : this.dv;
   }

   public void a(fby $$0) {
      this.dv = $$0;
   }

   @Override
   protected float a(bvk $$0, float $$1, bua $$2) {
      return deb.a(this.y(), this.ea(), $$0, $$2, $$1);
   }

   @Override
   public void a(cxl $$0, bvs $$1) {
      super.a($$0, $$1);
      this.b(axp.d.b($$0));
   }

   public cpv ai() {
      return this.dw;
   }

   public void a(cpv $$0) {
      this.dw = $$0;
   }

   public fby aj() {
      float $$0 = this.dw.c() == this.dw.d() ? 0.0F : (this.dw.c() ? 1.0F : -1.0F);
      float $$1 = this.dw.a() == this.dw.b() ? 0.0F : (this.dw.a() ? 1.0F : -1.0F);
      return a(new fby((double)$$0, 0.0, (double)$$1), 1.0F, this.dM());
   }

   public void a(cra $$0) {
      this.dx.add($$0);
   }

   public void b(cra $$0) {
      this.dx.remove($$0);
   }

   public Set<cra> ak() {
      return this.dx;
   }

   public long c(cra $$0) {
      if ($$0.dW() instanceof ash $$1) {
         dgo $$2 = $$0.dy();
         this.a($$0);
         $$1.i();
         return a($$1, $$2) - 1L;
      } else {
         return 0L;
      }
   }

   public static long a(ash $$0, dgo $$1) {
      $$0.m().a(asn.f, $$1, 2, $$1);
      return asn.f.b();
   }

   static record a(fby a, float b) {
      public static asi.a a(fby $$0, jh $$1) {
         return new asi.a($$0, b($$0, $$1));
      }

      private static float b(fby $$0, jh $$1) {
         fby $$2 = fby.c($$1).d($$0).d();
         return (float)bae.d(bae.d($$2.f, $$2.d) * 180.0F / (float)Math.PI - 90.0);
      }
   }
}
