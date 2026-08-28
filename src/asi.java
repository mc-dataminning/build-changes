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

public class asi extends cps {
   private static final Logger cz = LogUtils.getLogger();
   private static final int cC = 32;
   private static final int cD = 10;
   private static final int cE = 25;
   public static final double a = 1.0;
   public static final double b = 3.0;
   public static final int c = 2;
   public static final String d = "ender_pearls";
   public static final String e = "ender_pearl_dimension";
   private static final bxh cF = new bxh(alz.b("creative_mode_block_range"), 0.5, bxh.a.a);
   private static final bxh cG = new bxh(alz.b("creative_mode_entity_range"), 2.0, bxh.a.a);
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
   private cpp cU = cpp.a;
   private arz cV = arz.a;
   private boolean cW = true;
   private long cX = ae.c();
   @Nullable
   private bvf cY;
   private boolean cZ;
   public boolean i;
   private final axk da;
   @Nullable
   private fbs db;
   private int dc;
   private boolean dd;
   private int de = 2;
   private String df = "en_us";
   @Nullable
   private fbs dg;
   @Nullable
   private fbs dh;
   @Nullable
   private fbs di;
   private kj dj = kj.a(0, 0, 0);
   private arr dk = arr.a;
   private aly<dha> dl = dha.i;
   @Nullable
   private jh dm;
   private boolean dn;
   private float do;
   private final atq dp;
   private boolean dq;
   private boolean dr;
   private boolean ds;
   private cox dt = new cox(0, 0, 0);
   @Nullable
   private jh du;
   private fbs dv = fbs.c;
   private cpq dw = cpq.b;
   private final Set<cqv> dx = new HashSet<>();
   private final ctm dy = new ctm() {
      @Override
      public void a(csx $$0, jz<cxk> $$1, cxk $$2, int[] $$3) {
         asi.this.f.b(new adm($$0.l, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(csx $$0, int $$1, cxk $$2) {
         asi.this.f.b(new ado($$0.l, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(csx $$0, cxk $$1) {
         asi.this.f.b(new afy($$1.v()));
      }

      @Override
      public void a(csx $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(csx $$0, int $$1, int $$2) {
         asi.this.f.b(new adn($$0.l, $$1, $$2));
      }
   };
   private final ctl dz = new ctl() {
      @Override
      public void a(csx $$0, int $$1, cxk $$2) {
         cuu $$3 = $$0.b($$1);
         if (!($$3 instanceof cuq)) {
            if ($$3.c == asi.this.gg()) {
               ao.f.a(asi.this, asi.this.gg(), $$2);
            }
         }
      }

      @Override
      public void a(csx $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private ym dA;
   @Nullable
   public final Object j;
   private final ev dB = new ev() {
      @Override
      public boolean y_() {
         return asi.this.y().N().b(dgw.p);
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
      this.cI = $$0.ag().a((cps)this);
      this.cH = $$0.ag().g(this);
      this.b(this.a($$1, $$1.Y()).c(), 0.0F, 0.0F);
      this.a($$3);
      this.j = null;
   }

   @Override
   public jh a(ash $$0, jh $$1) {
      fbn $$2 = this.a(bwn.a).a(fbs.c);
      jh $$3 = $$1;
      if ($$0.G_().g() && $$0.p().aZ().k() != dgx.c) {
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

   private boolean a(ash $$0, fbn $$1) {
      return $$0.a(this, $$1, true);
   }

   private int t(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         cox.a.parse(new Dynamic(vl.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(cz::error).ifPresent($$0x -> this.dt = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         ux $$1 = $$0.p("enteredNetherPosition");
         this.dh = new fbs($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.i = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.da.a($$0.p("recipeBook"), $$0x -> this.g.aI().b($$0x).isPresent());
      }

      if (this.fP()) {
         this.fQ();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.dm = new jh($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.dn = $$0.q("SpawnForced");
         this.do = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.dl = dha.h.parse(vl.a, $$0.c("SpawnDimension")).resultOrPartial(cz::error).orElse(dha.i);
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
      cox.a.encodeStart(vl.a, this.dt).resultOrPartial(cz::error).ifPresent($$1x -> $$0.a("warden_spawn_tracker", $$1x));
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
      $$0.a("Dimension", this.dV().ah().a().toString());
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
      bvf $$1 = this.dg();
      bvf $$2 = this.dk();
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
      if ($$0.isPresent() && $$0.get().b("RootVehicle", 10) && this.dV() instanceof ash $$1) {
         ux $$2 = $$0.get().p("RootVehicle");
         bvf $$3 = bvm.a($$2.p("Entity"), $$1, bvl.r, $$1x -> !$$1.c($$1x) ? null : $$1x);
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
            for (bvf $$6 : $$3.dd()) {
               if ($$6.cG().equals($$4)) {
                  this.a($$6, true);
                  break;
               }
            }
         }

         if (!this.bZ()) {
            cz.warn("Couldn't reattach entity to player");
            $$3.at();

            for (bvf $$7 : $$3.dd()) {
               $$7.at();
            }
         }
      }
   }

   private void l(ux $$0) {
      if (!this.dx.isEmpty()) {
         vd $$1 = new vd();

         for (cqv $$2 : this.dx) {
            if ($$2.dQ()) {
               cz.warn("Trying to save removed ender pearl, skipping");
            } else {
               ux $$3 = new ux();
               $$2.e($$3);
               alz.a.encodeStart(vl.a, $$2.dV().ah().a()).resultOrPartial(cz::error).ifPresent($$1x -> $$3.a("ender_pearl_dimension", $$1x));
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
               Optional<aly<dha>> $$2x = dha.h.parse(vl.a, $$1.c("ender_pearl_dimension")).resultOrPartial(cz::error);
               if ($$2x.isEmpty()) {
                  cz.warn("No dimension defined for ender pearl, skipping");
                  return;
               }

               ash $$3 = this.dV().p().a($$2x.get());
               if ($$3 != null) {
                  bvf $$4 = bvm.a($$1, $$3, bvl.r, $$1x -> !$$3.c($$1x) ? null : $$1x);
                  if ($$4 != null) {
                     a($$3, $$4.dx());
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
      float $$1 = (float)this.gq();
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
   public void a(cxk $$0, int $$1) {
      super.a($$0, $$1);
      this.cS = -1;
   }

   private void a(csx $$0) {
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
      this.f.b(new aev(this.eP()));
   }

   @Override
   public void a(dxn $$0) {
      ao.e.a(this, $$0);
   }

   @Override
   protected cxh g() {
      return new cyk(this);
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
      if (!this.dV().C && !this.cd.b(this)) {
         this.p();
         this.cd = this.cc;
      }

      bvf $$0 = this.L();
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
      if (this.db != null) {
         ao.v.a(this, this.db, this.af - this.dc);
      }

      this.l();
      this.m();
      this.gN();
      this.cH.b(this);
   }

   private void gN() {
      bxf $$0 = this.g(bxj.g);
      if ($$0 != null) {
         if (this.b()) {
            $$0.a(cF);
         } else {
            $$0.e(cF);
         }
      }

      bxf $$1 = this.g(bxj.j);
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
         if (!this.aa_() || !this.do()) {
            super.h();
         }

         for (int $$0 = 0; $$0 < this.gg().b(); $$0++) {
            cxk $$1 = this.gg().a($$0);
            if (!$$1.f()) {
               this.j($$1);
            }
         }

         if (this.eD() != this.cP || this.cQ != this.ce.a() || this.ce.c() == 0.0F != this.cR) {
            this.f.b(new agg(this.eD(), this.ce.a(), this.ce.c()));
            this.cP = this.eD();
            this.cQ = this.ce.a();
            this.cR = this.ce.c() == 0.0F;
         }

         if (this.eD() + this.fu() != this.cJ) {
            this.cJ = this.eD() + this.fu();
            this.a(fda.g, bae.f(this.cJ));
         }

         if (this.ce.a() != this.cK) {
            this.cK = this.ce.a();
            this.a(fda.h, bae.f((float)this.cK));
         }

         if (this.ct() != this.cL) {
            this.cL = this.ct();
            this.a(fda.i, bae.f((float)this.cL));
         }

         if (this.eO() != this.cM) {
            this.cM = this.eO();
            this.a(fda.j, bae.f((float)this.cM));
         }

         if (this.cr != this.cO) {
            this.cO = this.cr;
            this.a(fda.k, bae.f((float)this.cO));
         }

         if (this.cq != this.cN) {
            this.cN = this.cq;
            this.a(fda.l, bae.f((float)this.cN));
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

   private void j(cxk $$0) {
      evh $$1 = $$0.a(ku.L);
      evj $$2 = cxx.a($$1, this.dV());
      if ($$2 != null) {
         aac<?> $$3 = $$2.a($$1, this);
         if ($$3 != null) {
            this.f.b($$3);
         }
      }
   }

   @Override
   protected void j() {
      if (this.dV().al() == btb.a && this.y().N().b(dgw.k)) {
         if (this.af % 20 == 0) {
            if (this.eD() < this.eR()) {
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
         ao.X.a(this, this.dg);
      }

      this.dg = null;
      super.k();
   }

   public void l() {
      if (this.Z > 0.0F && this.dg == null) {
         this.dg = this.dt();
         if (this.cx != null && this.cx.e <= this.dg.e) {
            ao.ae.a(this, this.cx, this.cy);
         }
      }
   }

   @Override
   public void m() {
      if (this.dk() != null && this.dk().bx()) {
         if (this.di == null) {
            this.di = this.dt();
         } else {
            ao.Y.a(this, this.di);
         }
      }

      if (this.di != null && (this.dk() == null || !this.dk().bx())) {
         this.di = null;
      }
   }

   private void a(fda $$0, int $$1) {
      this.gw().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(btv $$0) {
      this.a(ecj.p);
      boolean $$1 = this.y().N().b(dgw.n);
      if ($$1) {
         xv $$2 = this.eP().a();
         this.f.a(new aex(this.ar(), $$2), xc.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            xv $$3x = xv.a("death.attack.message_too_long", xv.b($$2x).a(n.o));
            xv $$4x = xv.a("death.attack.even_more_magic", this.p_()).a($$1xx -> $$1xx.a(new yb(yb.a.a, $$3x)));
            return new aex(this.ar(), $$4x);
         }));
         fcz $$3 = this.cr();
         if ($$3 == null || $$3.k() == fcz.b.a) {
            this.g.ag().a($$2, false);
         } else if ($$3.k() == fcz.b.c) {
            this.g.ag().a(this, $$2);
         } else if ($$3.k() == fcz.b.d) {
            this.g.ag().b(this, $$2);
         }
      } else {
         this.f.b(new aex(this.ar(), xu.a));
      }

      this.gv();
      if (this.y().N().b(dgw.N)) {
         this.gO();
      }

      if (!this.aa_()) {
         this.b(this.y(), $$0);
      }

      this.gw().a(fda.d, this, fcv::b);
      bwb $$4 = this.eQ();
      if ($$4 != null) {
         this.b(axp.h.b($$4.aq()));
         $$4.a(this, this.bl, $$0);
         this.f($$4);
      }

      this.dV().a(this, (byte)3);
      this.a(axp.N);
      this.a(axp.i.b(axp.m));
      this.a(axp.i.b(axp.n));
      this.aH();
      this.k(0);
      this.c(false);
      this.eP().c();
      this.c(Optional.of(jp.a(this.dV().ah(), this.dv())));
   }

   private void gO() {
      fbn $$0 = new fbn(this.dv()).c(32.0, 10.0, 32.0);
      this.dV().a(bwd.class, $$0, bvk.f).stream().filter($$0x -> $$0x instanceof bwg).forEach($$0x -> ((bwg)$$0x).a_(this.y(), this));
   }

   @Override
   public void a(bvf $$0, int $$1, btv $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.r($$1);
         this.gw().a(fda.f, this, fcv::b);
         if ($$0 instanceof cps) {
            this.a(axp.Q);
            this.gw().a(fda.e, this, fcv::b);
         } else {
            this.a(axp.O);
         }

         this.a(this, $$0, fda.m);
         this.a($$0, this, fda.n);
         ao.c.a(this, $$0, $$2);
      }
   }

   private void a(fcw $$0, fcw $$1, fda[] $$2) {
      fcs $$3 = this.gw().e($$1.cI());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gw().a($$2[$$4], $$0, fcv::b);
         }
      }
   }

   @Override
   public boolean a(ash $$0, btv $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         boolean $$3 = this.g.n() && this.gP() && $$1.a(axw.m);
         if (!$$3 && this.cT > 0 && !$$1.a(axw.d)) {
            return false;
         } else {
            bvf $$4 = $$1.d();
            if ($$4 instanceof cps $$5 && !this.a($$5)) {
               return false;
            }

            if ($$4 instanceof cpz $$6 && $$6.p() instanceof cps $$8 && !this.a($$8)) {
               return false;
            }

            return super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   public boolean a(cps $$0) {
      return !this.gP() ? false : super.a($$0);
   }

   private boolean gP() {
      return this.g.ac();
   }

   public eup a(boolean $$0, eup.a $$1) {
      jh $$2 = this.T();
      float $$3 = this.U();
      boolean $$4 = this.W();
      ash $$5 = this.g.a(this.V());
      if ($$5 != null && $$2 != null) {
         Optional<asi.a> $$6 = a($$5, $$2, $$3, $$4, $$0);
         if ($$6.isPresent()) {
            asi.a $$7 = $$6.get();
            return new eup($$5, $$7.a(), fbs.c, $$7.b(), 0.0F, $$1);
         } else {
            return eup.a(this.g.J(), this, $$1);
         }
      } else {
         return new eup(this.g.J(), this, $$1);
      }
   }

   private static Optional<asi.a> a(ash $$0, jh $$1, float $$2, boolean $$3, boolean $$4) {
      dxn $$5 = $$0.a_($$1);
      dke $$6 = $$5.b();
      if ($$6 instanceof dqp && ($$3 || $$5.c(dqp.d) > 0) && dqp.a($$0)) {
         Optional<fbs> $$7 = dqp.a(bvm.bS, $$0, $$1);
         if (!$$3 && $$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.b(dqp.d, Integer.valueOf($$5.c(dqp.d) - 1)), 3);
         }

         return $$7.map($$1x -> asi.a.a($$1x, $$1));
      } else if ($$6 instanceof djx && djx.a($$0)) {
         return djx.a(bvm.bS, $$0, $$1, $$5.c(djx.aF), $$2).map($$1x -> asi.a.a($$1x, $$1));
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dxn $$9 = $$0.a_($$1.d());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new asi.a(new fbs((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5), $$2)) : Optional.empty();
      }
   }

   public void n() {
      this.ao();
      this.y().a(this, bvf.c.e);
      if (!this.k) {
         this.k = true;
         this.f.b(new adz(adz.f, 0.0F));
         this.i = true;
      }
   }

   @Nullable
   public asi a(eup $$0) {
      if (this.dQ()) {
         return null;
      } else {
         if ($$0.g()) {
            this.f.b(new adz(adz.b, 0.0F));
         }

         ash $$1 = $$0.b();
         ash $$2 = this.y();
         aly<dha> $$3 = $$2.ah();
         if (!$$0.h()) {
            this.ae();
         }

         if ($$1.ah() == $$3) {
            this.f.a(bwo.a($$0), $$0.i());
            this.f.l();
            $$0.j().onTransition(this);
            return this;
         } else {
            this.cZ = true;
            evr $$4 = $$1.D_();
            this.f.b(new afk(this.b($$1), (byte)3));
            this.f.b(new ade($$4.q(), $$4.r()));
            awi $$5 = this.g.ag();
            $$5.e(this);
            $$2.a(this, bvf.c.e);
            this.dS();
            bpo $$6 = bpn.a();
            $$6.a("moving");
            if ($$3 == dha.i && $$1.ah() == dha.j) {
               this.dh = this.dt();
            }

            $$6.c();
            $$6.a("placing");
            this.a($$1);
            this.f.a(bwo.a($$0), $$0.i());
            this.f.l();
            $$1.d(this);
            $$6.c();
            this.g($$2);
            this.fD();
            this.f.b(new aet(this.gh()));
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
      aly<dha> $$1 = $$0.ah();
      aly<dha> $$2 = this.dV().ah();
      ao.w.a(this, $$1, $$2);
      if ($$1 == dha.j && $$2 == dha.i && this.dh != null) {
         ao.D.a(this, this.dh);
      }

      if ($$2 != dha.j) {
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
   public void a(bvf $$0, int $$1) {
      super.a($$0, $$1);
      this.cd.d();
   }

   @Override
   public Either<cps.a, bbk> a(jh $$0) {
      jm $$1 = this.dV().a_($$0).c(doc.aF);
      if (this.fP() || !this.bL()) {
         return Either.left(cps.a.e);
      } else if (!this.dV().G_().j()) {
         return Either.left(cps.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cps.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cps.a.d);
      } else {
         this.a(this.dV().ah(), $$0, this.dL(), false, true);
         if (this.dV().U()) {
            return Either.left(cps.a.b);
         } else {
            if (!this.b()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               fbs $$4 = fbs.c($$0);
               List<cms> $$5 = this.dV()
                  .a(
                     cms.class,
                     new fbn($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0),
                     $$0x -> $$0x.a(this.y(), this)
                  );
               if (!$$5.isEmpty()) {
                  return Either.left(cps.a.f);
               }
            }

            Either<cps.a, bbk> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(axp.ap);
               ao.r.a(this);
            });
            if (!this.y().e()) {
               this.a(xv.c("sleep.not_possible"), true);
            }

            ((ash)this.dV()).f();
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
      fbs $$1 = fbs.c($$0);
      return Math.abs(this.dA() - $$1.a()) <= 3.0 && Math.abs(this.dC() - $$1.b()) <= 2.0 && Math.abs(this.dG() - $$1.c()) <= 3.0;
   }

   private boolean b(jh $$0, jm $$1) {
      jh $$2 = $$0.d();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fP()) {
         this.y().m().a(this, new acu(this, 2));
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
   public boolean a(ash $$0, btv $$1) {
      return super.a($$0, $$1) || this.Q() && !$$1.a(bty.m);
   }

   @Override
   protected void a(double $$0, boolean $$1, dxn $$2, jh $$3) {
   }

   @Override
   protected void b(ash $$0, jh $$1) {
      if (!this.aa_()) {
         super.b($$0, $$1);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.do()) {
         this.a($$3, new fbs($$0, $$1, $$2));
         jh $$4 = this.aP();
         dxn $$5 = this.dV().a_($$4);
         if (this.ds && $$3 && this.Z > 0.0F) {
            fbs $$6 = $$4.b().b(0.0, 0.5, 0.0);
            int $$7 = (int)bae.a(50.0F * this.Z, 0.0F, 200.0F);
            this.y().a(new lk(ls.b, $$5), $$6.d, $$6.e, $$6.f, $$7, 0.3F, 0.3F, 0.3F, 0.15F);
            this.ds = false;
         }

         super.a($$1, $$3, $$5, $$4);
      }
   }

   @Override
   public void b_(@Nullable bvf $$0) {
      super.b_($$0);
      this.cx = this.dt();
      this.cy = $$0;
      this.w($$0 != null && $$0.aq() == bvm.bH);
   }

   @Override
   protected void o() {
      if (this.dV().t().i()) {
         super.o();
      }
   }

   @Override
   public void a(dwc $$0, boolean $$1) {
      this.f.b(new ada(this.dV(), $$0.aB_()));
      this.f.b(new aer($$0.aB_(), $$1));
   }

   private void gQ() {
      this.dC = this.dC % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable btg $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.cd != this.cc) {
            this.p();
         }

         this.gQ();
         csx $$1 = $$0.createMenu(this.dC, this.gg(), this);
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
   public void a(int $$0, dfy $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.f.b(new ael($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(cjw $$0, bsx $$1) {
      if (this.cd != this.cc) {
         this.p();
      }

      this.gQ();
      int $$2 = $$0.ag_();
      this.f.b(new aea(this.dC, $$2, $$0.ar()));
      this.cd = new ctz(this.dC, this.gg(), $$1, $$0, $$2);
      this.a(this.cd);
   }

   @Override
   public void a(cxk $$0, btd $$1) {
      if ($$0.b(ku.T)) {
         if (czg.a($$0, this.A(), this)) {
            this.cd.d();
         }

         this.f.b(new aep($$1));
      }
   }

   @Override
   public void a(duz $$0) {
      this.f.b(acy.a($$0, dup::e));
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
         } else if (this.fH()) {
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
         bvf $$4 = this.dk();
         if ($$4 instanceof crr) {
            this.a(axp.x, $$3);
         } else if ($$4 instanceof crp) {
            this.a(axp.y, $$3);
         } else if ($$4 instanceof cij) {
            this.a(axp.z, $$3);
         } else if ($$4 instanceof cjw) {
            this.a(axp.A, $$3);
         } else if ($$4 instanceof cnf) {
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
      this.gw().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(axm<?> $$0) {
      this.cI.a(this, $$0, 0);
      this.gw().a($$0, this, fcv::c);
   }

   @Override
   public int a(Collection<dcd<?>> $$0) {
      return this.da.a($$0, this);
   }

   @Override
   public void a(dcd<?> $$0, List<cxk> $$1) {
      ao.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<aly<dbz<?>>> $$0) {
      List<dcd<?>> $$1 = $$0.stream().flatMap($$0x -> this.g.aI().b($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<dcd<?>> $$0) {
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
      if (this.fP()) {
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
      if (!this.bz.f() && this.fx()) {
         this.f.b(new adv(this, (byte)9));
         super.w();
      }
   }

   @Override
   public void a(fi.a $$0, fbs $$1) {
      super.a($$0, $$1);
      this.f.b(new afa($$0, $$1.d, $$1.e, $$1.f));
   }

   public void a(fi.a $$0, bvf $$1, fi.a $$2) {
      fbs $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.f.b(new afa($$0, $$1, $$2));
   }

   public void a(asi $$0, boolean $$1) {
      this.dt = $$0.dt;
      this.dA = $$0.dA;
      this.h.a($$0.h.b(), $$0.h.c());
      this.x();
      if ($$1) {
         this.eW().b($$0.eW());
         this.eW().c($$0.eW());
         this.x($$0.eD());
         this.ce = $$0.ce;

         for (buk $$2 : $$0.eA()) {
            this.a(new buk($$2));
         }

         this.gg().a($$0.gg());
         this.cq = $$0.cq;
         this.cr = $$0.cr;
         this.cs = $$0.cs;
         this.q($$0.gb());
         this.as = $$0.as;
      } else {
         this.eW().b($$0.eW());
         this.x(this.eR());
         if (this.y().N().b(dgw.d) || $$0.aa_()) {
            this.gg().a($$0.gg());
            this.cq = $$0.cq;
            this.cr = $$0.cr;
            this.cs = $$0.cs;
            this.q($$0.gb());
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
      this.i($$0.gy());
      this.j($$0.gz());
      this.c($$0.gG());
   }

   @Override
   protected void a(buk $$0, @Nullable bvf $$1) {
      super.a($$0, $$1);
      this.f.b(new ahf(this.ar(), $$0, true));
      if ($$0.a(bum.y)) {
         this.dc = this.af;
         this.db = this.dt();
      }

      ao.B.a(this, $$1);
   }

   @Override
   protected void a(buk $$0, boolean $$1, @Nullable bvf $$2) {
      super.a($$0, $$1, $$2);
      this.f.b(new ahf(this.ar(), $$0, false));
      ao.B.a(this, $$2);
   }

   @Override
   protected void c(Collection<buk> $$0) {
      super.c($$0);

      for (buk $$1 : $$0) {
         this.f.b(new afi(this.ar(), $$1.c()));
         if ($$1.a(bum.y)) {
            this.db = null;
         }
      }

      ao.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.f.a(new bwo(new fbs($$0, $$1, $$2), fbs.c, 0.0F, 0.0F), bwp.a(bwp.l, bwp.k));
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.f.a(new bwo(new fbs($$0, $$1, $$2), fbs.c, 0.0F, 0.0F), bwp.j);
   }

   @Override
   public boolean a(ash $$0, double $$1, double $$2, double $$3, Set<bwp> $$4, float $$5, float $$6, boolean $$7) {
      dgg $$8 = new dgg(jh.a($$1, $$2, $$3));
      $$0.m().a(asn.g, $$8, 1, this.ar());
      if (this.fP()) {
         this.a(true, true);
      }

      if ($$7) {
         this.d(this);
      }

      boolean $$9 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$9) {
         this.q($$4.contains(bwp.d) ? this.cA() + $$5 : $$5);
      }

      return $$9;
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      super.e($$0, $$1, $$2);
      this.f.l();
   }

   @Override
   public void b(bvf $$0) {
      this.y().m().a(this, new acu($$0, 4));
   }

   @Override
   public void c(bvf $$0) {
      this.y().m().a(this, new acu($$0, 5));
   }

   @Override
   public void x() {
      if (this.f != null) {
         this.f.b(new aet(this.gh()));
         this.K();
      }
   }

   public ash y() {
      return (ash)this.dV();
   }

   public boolean a(dgx $$0) {
      boolean $$1 = this.aa_();
      if (!this.h.a($$0)) {
         return false;
      } else {
         this.f.b(new adz(adz.e, (float)$$0.a()));
         if ($$0 == dgx.d) {
            this.gv();
            this.ae();
            ddt.a(this);
         } else {
            this.d(this);
            if ($$1) {
               ddt.a(this.y(), this);
            }
         }

         this.x();
         this.fv();
         return true;
      }
   }

   @Override
   public boolean aa_() {
      return this.h.b() == dgx.d;
   }

   @Override
   public boolean b() {
      return this.h.b() == dgx.b;
   }

   public ev z() {
      return this.dB;
   }

   public ew A() {
      return new ew(this.z(), this.dt(), this.bU(), this.y(), this.G(), this.al().getString(), this.p_(), this.g, this);
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
      if (this.gR()) {
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
      bvv $$1 = bvv.d.apply(this.au().a(bY));
      return new ars(this.df, this.de, this.cU, this.cW, $$0, $$1, this.dq, this.dr, this.cV);
   }

   public boolean D() {
      return this.cW;
   }

   public cpp E() {
      return this.cU;
   }

   private boolean x(boolean $$0) {
      return this.cU == cpp.c ? $$0 : true;
   }

   private boolean gR() {
      return this.cU == cpp.a;
   }

   public int F() {
      return this.de;
   }

   public void a(akw $$0) {
      this.f.b(new afo($$0.a(), $$0.d().map(akw.a::a)));
   }

   @Override
   protected int G() {
      return this.g.c(this.gf());
   }

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
         this.ey();
         this.k(true);
      } else {
         super.K();
      }
   }

   public bvf L() {
      return (bvf)(this.cY == null ? this : this.cY);
   }

   @Override
   public void d(@Nullable bvf $$0) {
      bvf $$1 = this.L();
      this.cY = (bvf)($$0 == null ? this : $$0);
      if ($$1 != this.cY) {
         if (this.cY.dV() instanceof ash $$2) {
            this.a($$2, this.cY.dA(), this.cY.dC(), this.cY.dG(), Set.of(), this.dL(), this.dN(), false);
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
   public void e(bvf $$0) {
      if (this.h.b() == dgx.d) {
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
   public void a(btd $$0) {
      super.a($$0);
      this.gB();
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

   public aly<dha> V() {
      return this.dl;
   }

   public boolean W() {
      return this.dn;
   }

   public void b(asi $$0) {
      this.a($$0.V(), $$0.T(), $$0.U(), $$0.W(), false);
   }

   public void a(aly<dha> $$0, @Nullable jh $$1, float $$2, boolean $$3, boolean $$4) {
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
         this.dl = dha.i;
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
      this.f.b(new agt(ma.b.e($$0), $$1, this.dA(), this.dC(), this.dG(), $$2, $$3, this.ae.g()));
   }

   @Override
   public clw a(cxk $$0, boolean $$1, boolean $$2) {
      clw $$3 = this.b($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dV().b($$3);
         cxk $$4 = $$3.l();
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
   private clw b(cxk $$0, boolean $$1, boolean $$2) {
      if ($$0.f()) {
         return null;
      } else {
         double $$3 = this.dE() - 0.3F;
         clw $$4 = new clw(this.dV(), this.dA(), $$3, this.dG(), $$0);
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
            float $$8 = bae.a(this.dN() * (float) (Math.PI / 180.0));
            float $$9 = bae.b(this.dN() * (float) (Math.PI / 180.0));
            float $$10 = bae.a(this.dL() * (float) (Math.PI / 180.0));
            float $$11 = bae.b(this.dL() * (float) (Math.PI / 180.0));
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
      this.a((dha)$$0);
      this.h.a($$0);
   }

   @Nullable
   private static dgx a(@Nullable ux $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? dgx.a($$0.h($$1)) : null;
   }

   private dgx b(@Nullable dgx $$0) {
      dgx $$1 = this.g.bd();
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
      dgx $$1 = this.h.c();
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
   protected void a(cxk $$0) {
      ao.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cpr $$1 = this.gg();
      cxk $$2 = $$1.a($$0);
      this.cd.b($$1, $$1.j).ifPresent($$1x -> this.cd.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   @Override
   public void b(cxk $$0) {
      if (!this.gg().f($$0)) {
         this.a($$0, false);
      }
   }

   public boolean ab() {
      return this.dr;
   }

   @Override
   public Optional<cox> ac() {
      return Optional.of(this.dt);
   }

   public void b(boolean $$0) {
      this.ds = $$0;
   }

   @Override
   public void a(clw $$0) {
      super.a($$0);
      bvf $$1 = $$0.p();
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
      this.cw = (float)(bae.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dL());
      this.f.b(new aeb(this));
   }

   @Override
   public boolean a(bvf $$0, boolean $$1) {
      if (super.a($$0, $$1)) {
         $$0.j(this);
         this.f.a(new bwo(this.dt(), fbs.c, 0.0F, 0.0F), bwp.k);
         if ($$0 instanceof bwb $$2) {
            this.g.ag().a($$2, this.f);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void ae() {
      bvf $$0 = this.dk();
      super.ae();
      if ($$0 instanceof bwb $$1) {
         for (buk $$2 : $$1.eA()) {
            this.f.b(new afi($$0.ar(), $$2.c()));
         }
      }
   }

   public ahh b(ash $$0) {
      return new ahh($$0.ag(), $$0.ah(), die.a($$0.D()), this.h.b(), this.h.c(), $$0.ai(), $$0.C(), this.gG(), this.aC(), $$0.O());
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
   public fbs ah() {
      bvf $$0 = this.dk();
      return $$0 != null && $$0.cX() != this ? $$0.ah() : this.dv;
   }

   public void a(fbs $$0) {
      this.dv = $$0;
   }

   @Override
   protected float a(bvf $$0, float $$1, btv $$2) {
      return ddt.a(this.y(), this.dZ(), $$0, $$2, $$1);
   }

   @Override
   public void a(cxg $$0, bvn $$1) {
      super.a($$0, $$1);
      this.b(axp.d.b($$0));
   }

   public cpq ai() {
      return this.dw;
   }

   public void a(cpq $$0) {
      this.dw = $$0;
   }

   public fbs aj() {
      float $$0 = this.dw.c() == this.dw.d() ? 0.0F : (this.dw.c() ? 1.0F : -1.0F);
      float $$1 = this.dw.a() == this.dw.b() ? 0.0F : (this.dw.a() ? 1.0F : -1.0F);
      return a(new fbs((double)$$0, 0.0, (double)$$1), 1.0F, this.dL());
   }

   public void a(cqv $$0) {
      this.dx.add($$0);
   }

   public void b(cqv $$0) {
      this.dx.remove($$0);
   }

   public Set<cqv> ak() {
      return this.dx;
   }

   public long c(cqv $$0) {
      if ($$0.dV() instanceof ash $$1) {
         dgg $$2 = $$0.dx();
         this.a($$0);
         $$1.i();
         return a($$1, $$2) - 1L;
      } else {
         return 0L;
      }
   }

   public static long a(ash $$0, dgg $$1) {
      $$0.m().a(asn.f, $$1, 2, $$1);
      return asn.f.b();
   }

   static record a(fbs a, float b) {
      public static asi.a a(fbs $$0, jh $$1) {
         return new asi.a($$0, b($$0, $$1));
      }

      private static float b(fbs $$0, jh $$1) {
         fbs $$2 = fbs.c($$1).d($$0).d();
         return (float)bae.d(bae.d($$2.f, $$2.d) * 180.0F / (float)Math.PI - 90.0);
      }
   }
}
