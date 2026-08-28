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

public class ary extends cpo {
   private static final Logger cz = LogUtils.getLogger();
   private static final int cC = 32;
   private static final int cD = 10;
   private static final int cE = 25;
   public static final double a = 1.0;
   public static final double b = 3.0;
   public static final int c = 2;
   public static final String d = "ender_pearls";
   public static final String e = "ender_pearl_dimension";
   private static final bxd cF = new bxd(alp.b("creative_mode_block_range"), 0.5, bxd.a.a);
   private static final bxd cG = new bxd(alp.b("creative_mode_entity_range"), 2.0, bxd.a.a);
   public ata f;
   public final MinecraftServer g;
   public final arz h;
   private final alx cH;
   private final axb cI;
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
   private cpl cU = cpl.a;
   private arp cV = arp.a;
   private boolean cW = true;
   private long cX = ae.c();
   @Nullable
   private bvb cY;
   private boolean cZ;
   public boolean i;
   private final axa da;
   @Nullable
   private fbr db;
   private int dc;
   private boolean dd;
   private int de = 2;
   private String df = "en_us";
   @Nullable
   private fbr dg;
   @Nullable
   private fbr dh;
   @Nullable
   private fbr di;
   private kj dj = kj.a(0, 0, 0);
   private arh dk = arh.a;
   private alo<dgz> dl = dgz.i;
   @Nullable
   private jh dm;
   private boolean dn;
   private float do;
   private final atg dp;
   private boolean dq;
   private boolean dr;
   private boolean ds;
   private cot dt = new cot(0, 0, 0);
   @Nullable
   private jh du;
   private fbr dv = fbr.c;
   private cpm dw = cpm.b;
   private final Set<cqr> dx = new HashSet<>();
   private final cti dy = new cti() {
      @Override
      public void a(cst $$0, jz<cxg> $$1, cxg $$2, int[] $$3) {
         ary.this.f.b(new adb($$0.l, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cst $$0, int $$1, cxg $$2) {
         ary.this.f.b(new add($$0.l, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cst $$0, cxg $$1) {
         ary.this.f.b(new afn($$1.v()));
      }

      @Override
      public void a(cst $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cst $$0, int $$1, int $$2) {
         ary.this.f.b(new adc($$0.l, $$1, $$2));
      }
   };
   private final cth dz = new cth() {
      @Override
      public void a(cst $$0, int $$1, cxg $$2) {
         cuq $$3 = $$0.b($$1);
         if (!($$3 instanceof cum)) {
            if ($$3.c == ary.this.gi()) {
               ao.f.a(ary.this, ary.this.gi(), $$2);
            }
         }
      }

      @Override
      public void a(cst $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private yb dA;
   @Nullable
   public final Object j;
   private final ev dB = new ev() {
      @Override
      public boolean y_() {
         return ary.this.y().O().b(dgv.p);
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
      public void a(xk $$0) {
         ary.this.a($$0);
      }
   };
   private int dC;
   public boolean k;

   public ary(MinecraftServer $$0, arx $$1, GameProfile $$2, ari $$3) {
      super($$1, $$1.Z(), $$1.aa(), $$2);
      this.dp = $$0.a(this);
      this.h = $$0.b(this);
      this.da = new axa(($$1x, $$2x) -> $$0.aI().a($$1x, $$2x));
      this.g = $$0;
      this.cI = $$0.ag().a((cpo)this);
      this.cH = $$0.ag().g(this);
      this.b(this.a($$1, $$1.Z()).c(), 0.0F, 0.0F);
      this.a($$3);
      this.j = null;
   }

   @Override
   public jh a(arx $$0, jh $$1) {
      fbm $$2 = this.a(bwj.a).a(fbr.c);
      jh $$3 = $$1;
      if ($$0.G_().g() && $$0.p().aZ().k() != dgw.c) {
         int $$4 = Math.max(0, this.g.a($$0));
         int $$5 = azu.a($$0.F_().b((double)$$1.u(), (double)$$1.w()));
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
         int $$10 = bac.a().a($$8);

         for (int $$11 = 0; $$11 < $$8; $$11++) {
            int $$12 = ($$10 + $$9 * $$11) % $$8;
            int $$13 = $$12 % ($$4 * 2 + 1);
            int $$14 = $$12 / ($$4 * 2 + 1);
            int $$15 = $$1.u() + $$13 - $$4;
            int $$16 = $$1.w() + $$14 - $$4;

            try {
               $$3 = arr.a($$0, $$15, $$16);
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

   private boolean a(arx $$0, fbm $$1) {
      return $$0.a(this, $$1, true);
   }

   private int t(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         cot.a.parse(new Dynamic(va.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(cz::error).ifPresent($$0x -> this.dt = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         um $$1 = $$0.p("enteredNetherPosition");
         this.dh = new fbr($$1.k("x"), $$1.k("y"), $$1.k("z"));
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
            this.dl = dgz.h.parse(va.a, $$0.c("SpawnDimension")).resultOrPartial(cz::error).orElse(dgz.i);
         }
      }

      this.ds = $$0.q("spawn_extra_particles_on_fall");
      vj $$2 = $$0.c("raid_omen_position");
      if ($$2 != null) {
         jh.a.parse(va.a, $$2).resultOrPartial(cz::error).ifPresent($$0x -> this.du = $$0x);
      }
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      cot.a.encodeStart(va.a, this.dt).resultOrPartial(cz::error).ifPresent($$1x -> $$0.a("warden_spawn_tracker", $$1x));
      this.m($$0);
      $$0.a("seenCredits", this.i);
      if (this.dh != null) {
         um $$1 = new um();
         $$1.a("x", this.dh.d);
         $$1.a("y", this.dh.e);
         $$1.a("z", this.dh.f);
         $$0.a("enteredNetherPosition", $$1);
      }

      this.k($$0);
      $$0.a("recipeBook", this.da.b());
      $$0.a("Dimension", this.dW().ai().a().toString());
      if (this.dm != null) {
         $$0.a("SpawnX", this.dm.u());
         $$0.a("SpawnY", this.dm.v());
         $$0.a("SpawnZ", this.dm.w());
         $$0.a("SpawnForced", this.dn);
         $$0.a("SpawnAngle", this.do);
         alp.a.encodeStart(va.a, this.dl.a()).resultOrPartial(cz::error).ifPresent($$1x -> $$0.a("SpawnDimension", $$1x));
      }

      $$0.a("spawn_extra_particles_on_fall", this.ds);
      if (this.du != null) {
         jh.a.encodeStart(va.a, this.du).resultOrPartial(cz::error).ifPresent($$1x -> $$0.a("raid_omen_position", $$1x));
      }

      this.l($$0);
   }

   private void k(um $$0) {
      bvb $$1 = this.dg();
      bvb $$2 = this.dl();
      if ($$2 != null && $$1 != this && $$1.df()) {
         um $$3 = new um();
         um $$4 = new um();
         $$1.e($$4);
         $$3.a("Attach", $$2.cG());
         $$3.a("Entity", $$4);
         $$0.a("RootVehicle", $$3);
      }
   }

   public void a(Optional<um> $$0) {
      if ($$0.isPresent() && $$0.get().b("RootVehicle", 10) && this.dW() instanceof arx $$1) {
         um $$2 = $$0.get().p("RootVehicle");
         bvb $$3 = bvi.a($$2.p("Entity"), $$1, bvh.r, $$1x -> !$$1.c($$1x) ? null : $$1x);
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
            for (bvb $$6 : $$3.dd()) {
               if ($$6.cG().equals($$4)) {
                  this.a($$6, true);
                  break;
               }
            }
         }

         if (!this.bZ()) {
            cz.warn("Couldn't reattach entity to player");
            $$3.at();

            for (bvb $$7 : $$3.dd()) {
               $$7.at();
            }
         }
      }
   }

   private void l(um $$0) {
      if (!this.dx.isEmpty()) {
         us $$1 = new us();

         for (cqr $$2 : this.dx) {
            if ($$2.dR()) {
               cz.warn("Trying to save removed ender pearl, skipping");
            } else {
               um $$3 = new um();
               $$2.e($$3);
               alp.a.encodeStart(va.a, $$2.dW().ai().a()).resultOrPartial(cz::error).ifPresent($$1x -> $$3.a("ender_pearl_dimension", $$1x));
               $$1.add($$3);
            }
         }

         $$0.a("ender_pearls", $$1);
      }
   }

   public void b(Optional<um> $$0) {
      if ($$0.isPresent() && $$0.get().b("ender_pearls", 9) && $$0.get().c("ender_pearls") instanceof us $$2) {
         $$2.forEach($$0x -> {
            if ($$0x instanceof um $$1 && $$1.e("ender_pearl_dimension")) {
               Optional<alo<dgz>> $$2x = dgz.h.parse(va.a, $$1.c("ender_pearl_dimension")).resultOrPartial(cz::error);
               if ($$2x.isEmpty()) {
                  cz.warn("No dimension defined for ender pearl, skipping");
                  return;
               }

               arx $$3 = this.dW().p().a($$2x.get());
               if ($$3 != null) {
                  bvb $$4 = bvi.a($$1, $$3, bvh.r, $$1x -> !$$3.c($$1x) ? null : $$1x);
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
      this.cs = azu.a((float)$$0 / $$1, 0.0F, $$2);
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
   public void a(cxg $$0, int $$1) {
      super.a($$0, $$1);
      this.cS = -1;
   }

   private void a(cst $$0) {
      $$0.a(this.dz);
      $$0.a(this.dy);
   }

   public void d() {
      this.a(this.cc);
   }

   @Override
   public void i_() {
      super.i_();
      this.f.b(ael.a);
   }

   @Override
   public void j_() {
      super.j_();
      this.f.b(new aek(this.eQ()));
   }

   @Override
   public void a(dxo $$0) {
      ao.e.a(this, $$0);
   }

   @Override
   protected cxd g() {
      return new cyg(this);
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

      bvb $$0 = this.L();
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
      bxb $$0 = this.g(bxf.g);
      if ($$0 != null) {
         if (this.b()) {
            $$0.a(cF);
         } else {
            $$0.e(cF);
         }
      }

      bxb $$1 = this.g(bxf.j);
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
            cxg $$1 = this.gi().a($$0);
            if (!$$1.f()) {
               this.j($$1);
            }
         }

         if (this.eE() != this.cP || this.cQ != this.ce.a() || this.ce.c() == 0.0F != this.cR) {
            this.f.b(new afv(this.eE(), this.ce.a(), this.ce.c()));
            this.cP = this.eE();
            this.cQ = this.ce.a();
            this.cR = this.ce.c() == 0.0F;
         }

         if (this.eE() + this.fw() != this.cJ) {
            this.cJ = this.eE() + this.fw();
            this.a(fcz.g, azu.f(this.cJ));
         }

         if (this.ce.a() != this.cK) {
            this.cK = this.ce.a();
            this.a(fcz.h, azu.f((float)this.cK));
         }

         if (this.ct() != this.cL) {
            this.cL = this.ct();
            this.a(fcz.i, azu.f((float)this.cL));
         }

         if (this.eP() != this.cM) {
            this.cM = this.eP();
            this.a(fcz.j, azu.f((float)this.cM));
         }

         if (this.cr != this.cO) {
            this.cO = this.cr;
            this.a(fcz.k, azu.f((float)this.cO));
         }

         if (this.cq != this.cN) {
            this.cN = this.cq;
            this.a(fcz.l, azu.f((float)this.cN));
         }

         if (this.cr != this.cS) {
            this.cS = this.cr;
            this.f.b(new afu(this.cs, this.cr, this.cq));
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

   private void j(cxg $$0) {
      evi $$1 = $$0.a(ku.L);
      evk $$2 = cxt.a($$1, this.dW());
      if ($$2 != null) {
         zr<?> $$3 = $$2.a($$1, this);
         if ($$3 != null) {
            this.f.b($$3);
         }
      }
   }

   @Override
   protected void j() {
      if (this.dW().am() == bsx.a && this.y().O().b(dgv.k)) {
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

   private void a(fcz $$0, int $$1) {
      this.gy().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(btr $$0) {
      this.a(eck.p);
      boolean $$1 = this.y().O().b(dgv.n);
      if ($$1) {
         xk $$2 = this.eQ().a();
         this.f.a(new aem(this.ar(), $$2), wr.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            xk $$3x = xk.a("death.attack.message_too_long", xk.b($$2x).a(n.o));
            xk $$4x = xk.a("death.attack.even_more_magic", this.p_()).a($$1xx -> $$1xx.a(new xq(xq.a.a, $$3x)));
            return new aem(this.ar(), $$4x);
         }));
         fcy $$3 = this.cr();
         if ($$3 == null || $$3.k() == fcy.b.a) {
            this.g.ag().a($$2, false);
         } else if ($$3.k() == fcy.b.c) {
            this.g.ag().a(this, $$2);
         } else if ($$3.k() == fcy.b.d) {
            this.g.ag().b(this, $$2);
         }
      } else {
         this.f.b(new aem(this.ar(), xj.a));
      }

      this.gx();
      if (this.y().O().b(dgv.O)) {
         this.gQ();
      }

      if (!this.aa_()) {
         this.b(this.y(), $$0);
      }

      this.gy().a(fcz.d, this, fcu::b);
      bvx $$4 = this.eR();
      if ($$4 != null) {
         this.b(axf.h.b($$4.aq()));
         $$4.a(this, this.bl, $$0);
         this.f($$4);
      }

      this.dW().a(this, (byte)3);
      this.a(axf.N);
      this.a(axf.i.b(axf.m));
      this.a(axf.i.b(axf.n));
      this.aH();
      this.k(0);
      this.c(false);
      this.eQ().c();
      this.c(Optional.of(jp.a(this.dW().ai(), this.dw())));
   }

   private void gQ() {
      fbm $$0 = new fbm(this.dw()).c(32.0, 10.0, 32.0);
      this.dW().a(bvz.class, $$0, bvg.f).stream().filter($$0x -> $$0x instanceof bwc).forEach($$0x -> ((bwc)$$0x).a_(this.y(), this));
   }

   @Override
   public void a(bvb $$0, int $$1, btr $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.r($$1);
         this.gy().a(fcz.f, this, fcu::b);
         if ($$0 instanceof cpo) {
            this.a(axf.Q);
            this.gy().a(fcz.e, this, fcu::b);
         } else {
            this.a(axf.O);
         }

         this.a(this, $$0, fcz.m);
         this.a($$0, this, fcz.n);
         ao.c.a(this, $$0, $$2);
      }
   }

   private void a(fcv $$0, fcv $$1, fcz[] $$2) {
      fcr $$3 = this.gy().e($$1.cI());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gy().a($$2[$$4], $$0, fcu::b);
         }
      }
   }

   @Override
   public boolean a(arx $$0, btr $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         boolean $$3 = this.g.n() && this.gR() && $$1.a(axm.m);
         if (!$$3 && this.cT > 0 && !$$1.a(axm.d)) {
            return false;
         } else {
            bvb $$4 = $$1.d();
            if ($$4 instanceof cpo $$5 && !this.a($$5)) {
               return false;
            }

            if ($$4 instanceof cpv $$6 && $$6.p() instanceof cpo $$8 && !this.a($$8)) {
               return false;
            }

            return super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   public boolean a(cpo $$0) {
      return !this.gR() ? false : super.a($$0);
   }

   private boolean gR() {
      return this.g.ac();
   }

   public euq a(boolean $$0, euq.a $$1) {
      jh $$2 = this.T();
      float $$3 = this.U();
      boolean $$4 = this.W();
      arx $$5 = this.g.a(this.V());
      if ($$5 != null && $$2 != null) {
         Optional<ary.a> $$6 = a($$5, $$2, $$3, $$4, $$0);
         if ($$6.isPresent()) {
            ary.a $$7 = $$6.get();
            return new euq($$5, $$7.a(), fbr.c, $$7.b(), 0.0F, $$1);
         } else {
            return euq.a(this.g.J(), this, $$1);
         }
      } else {
         return new euq(this.g.J(), this, $$1);
      }
   }

   private static Optional<ary.a> a(arx $$0, jh $$1, float $$2, boolean $$3, boolean $$4) {
      dxo $$5 = $$0.a_($$1);
      dkd $$6 = $$5.b();
      if ($$6 instanceof dqq && ($$3 || $$5.c(dqq.d) > 0) && dqq.a($$0)) {
         Optional<fbr> $$7 = dqq.a(bvi.bS, $$0, $$1);
         if (!$$3 && $$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.b(dqq.d, Integer.valueOf($$5.c(dqq.d) - 1)), 3);
         }

         return $$7.map($$1x -> ary.a.a($$1x, $$1));
      } else if ($$6 instanceof djw && djw.a($$0)) {
         return djw.a(bvi.bS, $$0, $$1, $$5.c(djw.aF), $$2).map($$1x -> ary.a.a($$1x, $$1));
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dxo $$9 = $$0.a_($$1.d());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new ary.a(new fbr((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5), $$2)) : Optional.empty();
      }
   }

   public void n() {
      this.ao();
      this.y().a(this, bvb.d.e);
      if (!this.k) {
         this.k = true;
         this.f.b(new ado(ado.f, 0.0F));
         this.i = true;
      }
   }

   @Nullable
   public ary a(euq $$0) {
      if (this.dR()) {
         return null;
      } else {
         if ($$0.g()) {
            this.f.b(new ado(ado.b, 0.0F));
         }

         arx $$1 = $$0.b();
         arx $$2 = this.y();
         alo<dgz> $$3 = $$2.ai();
         if (!$$0.h()) {
            this.ae();
         }

         if ($$1.ai() == $$3) {
            this.f.a(bwk.a($$0), $$0.i());
            this.f.l();
            $$0.j().onTransition(this);
            return this;
         } else {
            this.cZ = true;
            evs $$4 = $$1.D_();
            this.f.b(new aez(this.b($$1), (byte)3));
            this.f.b(new act($$4.q(), $$4.r()));
            avy $$5 = this.g.ag();
            $$5.e(this);
            $$2.a(this, bvb.d.e);
            this.dT();
            bpj $$6 = bpi.a();
            $$6.a("moving");
            if ($$3 == dgz.i && $$1.ai() == dgz.j) {
               this.dh = this.du();
            }

            $$6.c();
            $$6.a("placing");
            this.a($$1);
            this.f.a(bwk.a($$0), $$0.i());
            this.f.l();
            $$1.d(this);
            $$6.c();
            this.g($$2);
            this.fF();
            this.f.b(new aei(this.gj()));
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
      this.f.b(new aer($$0, $$1));
   }

   private void g(arx $$0) {
      alo<dgz> $$1 = $$0.ai();
      alo<dgz> $$2 = this.dW().ai();
      ao.w.a(this, $$1, $$2);
      if ($$1 == dgz.j && $$2 == dgz.i && this.dh != null) {
         ao.D.a(this, this.dh);
      }

      if ($$2 != dgz.j) {
         this.dh = null;
      }
   }

   @Override
   public boolean a(ary $$0) {
      if ($$0.aa_()) {
         return this.L() == this;
      } else {
         return this.aa_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bvb $$0, int $$1) {
      super.a($$0, $$1);
      this.cd.d();
   }

   @Override
   public Either<cpo.a, bba> a(jh $$0) {
      jm $$1 = this.dW().a_($$0).c(dob.aF);
      if (this.fR() || !this.bL()) {
         return Either.left(cpo.a.e);
      } else if (!this.dW().G_().j()) {
         return Either.left(cpo.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cpo.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cpo.a.d);
      } else {
         this.a(this.dW().ai(), $$0, this.dM(), false, true);
         if (this.dW().V()) {
            return Either.left(cpo.a.b);
         } else {
            if (!this.b()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               fbr $$4 = fbr.c($$0);
               List<cmo> $$5 = this.dW()
                  .a(
                     cmo.class,
                     new fbm($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0),
                     $$0x -> $$0x.a(this.y(), this)
                  );
               if (!$$5.isEmpty()) {
                  return Either.left(cpo.a.f);
               }
            }

            Either<cpo.a, bba> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(axf.ap);
               ao.r.a(this);
            });
            if (!this.y().e()) {
               this.a(xk.c("sleep.not_possible"), true);
            }

            ((arx)this.dW()).f();
            return $$6;
         }
      }
   }

   @Override
   public void b(jh $$0) {
      this.a(axf.i.b(axf.n));
      super.b($$0);
   }

   private boolean a(jh $$0, jm $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(jh $$0) {
      fbr $$1 = fbr.c($$0);
      return Math.abs(this.dB() - $$1.a()) <= 3.0 && Math.abs(this.dD() - $$1.b()) <= 2.0 && Math.abs(this.dH() - $$1.c()) <= 3.0;
   }

   private boolean b(jh $$0, jm $$1) {
      jh $$2 = $$0.d();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fR()) {
         this.y().m().a(this, new acj(this, 2));
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
   public boolean a(arx $$0, btr $$1) {
      return super.a($$0, $$1) || this.Q() && !$$1.a(btu.m);
   }

   @Override
   protected void a(double $$0, boolean $$1, dxo $$2, jh $$3) {
   }

   @Override
   protected void b(arx $$0, jh $$1) {
      if (!this.aa_()) {
         super.b($$0, $$1);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.dp()) {
         this.a($$3, new fbr($$0, $$1, $$2));
         jh $$4 = this.aP();
         dxo $$5 = this.dW().a_($$4);
         if (this.ds && $$3 && this.Z > 0.0F) {
            fbr $$6 = $$4.b().b(0.0, 0.5, 0.0);
            int $$7 = (int)azu.a(50.0F * this.Z, 0.0F, 200.0F);
            this.y().a(new lk(ls.b, $$5), $$6.d, $$6.e, $$6.f, $$7, 0.3F, 0.3F, 0.3F, 0.15F);
            this.ds = false;
         }

         super.a($$1, $$3, $$5, $$4);
      }
   }

   @Override
   public void b_(@Nullable bvb $$0) {
      super.b_($$0);
      this.cx = this.du();
      this.cy = $$0;
      this.w($$0 != null && $$0.aq() == bvi.bH);
   }

   @Override
   protected void o() {
      if (this.dW().u().i()) {
         super.o();
      }
   }

   @Override
   public void a(dwd $$0, boolean $$1) {
      this.f.b(new acp(this.dW(), $$0.aB_()));
      this.f.b(new aeg($$0.aB_(), $$1));
   }

   private void gS() {
      this.dC = this.dC % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable btc $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.cd != this.cc) {
            this.p();
         }

         this.gS();
         cst $$1 = $$0.createMenu(this.dC, this.gi(), this);
         if ($$1 == null) {
            if (this.aa_()) {
               this.a(xk.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.f.b(new aef($$1.l, $$1.a(), $$0.p_()));
            this.a($$1);
            this.cd = $$1;
            return OptionalInt.of(this.dC);
         }
      }
   }

   @Override
   public void a(int $$0, dfx $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.f.b(new aea($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(cjs $$0, bst $$1) {
      if (this.cd != this.cc) {
         this.p();
      }

      this.gS();
      int $$2 = $$0.ag_();
      this.f.b(new adp(this.dC, $$2, $$0.ar()));
      this.cd = new ctv(this.dC, this.gi(), $$1, $$0, $$2);
      this.a(this.cd);
   }

   @Override
   public void a(cxg $$0, bsz $$1) {
      if ($$0.b(ku.T)) {
         if (czc.a($$0, this.A(), this)) {
            this.cd.d();
         }

         this.f.b(new aee($$1));
      }
   }

   @Override
   public void a(dva $$0) {
      this.f.b(acn.a($$0, duq::e));
   }

   @Override
   public void p() {
      this.f.b(new ada(this.cd.l));
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
               this.a(axf.C, $$3);
               this.G(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(axq.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(axf.w, $$4);
               this.G(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.bj()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(axf.s, $$5);
               this.G(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.q_()) {
            if ($$1 > 0.0) {
               this.a(axf.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aJ()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.cj()) {
                  this.a(axf.r, $$6);
                  this.G(0.1F * (float)$$6 * 0.01F);
               } else if (this.ci()) {
                  this.a(axf.q, $$6);
                  this.G(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(axf.p, $$6);
                  this.G(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fJ()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(axf.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(axf.v, $$8);
            }
         }
      }
   }

   private void q(double $$0, double $$1, double $$2) {
      if (this.bZ() && !r($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         bvb $$4 = this.dl();
         if ($$4 instanceof crn) {
            this.a(axf.x, $$3);
         } else if ($$4 instanceof crl) {
            this.a(axf.y, $$3);
         } else if ($$4 instanceof cif) {
            this.a(axf.z, $$3);
         } else if ($$4 instanceof cjs) {
            this.a(axf.A, $$3);
         } else if ($$4 instanceof cnb) {
            this.a(axf.D, $$3);
         }
      }
   }

   private static boolean r(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(axc<?> $$0, int $$1) {
      this.cI.b(this, $$0, $$1);
      this.gy().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(axc<?> $$0) {
      this.cI.a(this, $$0, 0);
      this.gy().a($$0, this, fcu::c);
   }

   @Override
   public int a(Collection<dca<?>> $$0) {
      return this.da.a($$0, this);
   }

   @Override
   public void a(dca<?> $$0, List<cxg> $$1) {
      ao.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<alo<dbv<?>>> $$0) {
      List<dca<?>> $$1 = $$0.stream().flatMap($$0x -> this.g.aI().b($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<dca<?>> $$0) {
      return this.da.b($$0, this);
   }

   @Override
   public void s() {
      super.s();
      this.a(axf.E);
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
   public void a(xk $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void w() {
      if (!this.bz.f() && this.fz()) {
         this.f.b(new adk(this, (byte)9));
         super.w();
      }
   }

   @Override
   public void a(fi.a $$0, fbr $$1) {
      super.a($$0, $$1);
      this.f.b(new aep($$0, $$1.d, $$1.e, $$1.f));
   }

   public void a(fi.a $$0, bvb $$1, fi.a $$2) {
      fbr $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.f.b(new aep($$0, $$1, $$2));
   }

   public void a(ary $$0, boolean $$1) {
      this.dt = $$0.dt;
      this.dA = $$0.dA;
      this.h.a($$0.h.b(), $$0.h.c());
      this.x();
      if ($$1) {
         this.eY().b($$0.eY());
         this.eY().c($$0.eY());
         this.x($$0.eE());
         this.ce = $$0.ce;

         for (bug $$2 : $$0.eB()) {
            this.a(new bug($$2));
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
         if (this.y().O().b(dgv.d) || $$0.aa_()) {
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
   protected void a(bug $$0, @Nullable bvb $$1) {
      super.a($$0, $$1);
      this.f.b(new agu(this.ar(), $$0, true));
      if ($$0.a(bui.y)) {
         this.dc = this.af;
         this.db = this.du();
      }

      ao.B.a(this, $$1);
   }

   @Override
   protected void a(bug $$0, boolean $$1, @Nullable bvb $$2) {
      super.a($$0, $$1, $$2);
      this.f.b(new agu(this.ar(), $$0, false));
      ao.B.a(this, $$2);
   }

   @Override
   protected void c(Collection<bug> $$0) {
      super.c($$0);

      for (bug $$1 : $$0) {
         this.f.b(new aex(this.ar(), $$1.c()));
         if ($$1.a(bui.y)) {
            this.db = null;
         }
      }

      ao.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.f.a(new bwk(new fbr($$0, $$1, $$2), fbr.c, 0.0F, 0.0F), bwl.a(bwl.l, bwl.k));
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.f.a(new bwk(new fbr($$0, $$1, $$2), fbr.c, 0.0F, 0.0F), bwl.j);
   }

   @Override
   public boolean a(arx $$0, double $$1, double $$2, double $$3, Set<bwl> $$4, float $$5, float $$6, boolean $$7) {
      if (this.fR()) {
         this.a(true, true);
      }

      if ($$7) {
         this.d(this);
      }

      boolean $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$8) {
         this.q($$4.contains(bwl.d) ? this.cA() + $$5 : $$5);
      }

      return $$8;
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      super.e($$0, $$1, $$2);
      this.f.l();
   }

   @Override
   public void b(bvb $$0) {
      this.y().m().a(this, new acj($$0, 4));
   }

   @Override
   public void c(bvb $$0) {
      this.y().m().a(this, new acj($$0, 5));
   }

   @Override
   public void x() {
      if (this.f != null) {
         this.f.b(new aei(this.gj()));
         this.K();
      }
   }

   public arx y() {
      return (arx)this.dW();
   }

   public boolean a(dgw $$0) {
      boolean $$1 = this.aa_();
      if (!this.h.a($$0)) {
         return false;
      } else {
         this.f.b(new ado(ado.e, (float)$$0.a()));
         if ($$0 == dgw.d) {
            this.gx();
            this.ae();
            dds.a(this);
         } else {
            this.d(this);
            if ($$1) {
               dds.a(this.y(), this);
            }
         }

         this.x();
         this.fx();
         return true;
      }
   }

   @Override
   public boolean aa_() {
      return this.h.b() == dgw.d;
   }

   @Override
   public boolean b() {
      return this.h.b() == dgw.b;
   }

   public ev z() {
      return this.dB;
   }

   public ew A() {
      return new ew(this.z(), this.du(), this.bU(), this.y(), this.G(), this.al().getString(), this.p_(), this.g, this);
   }

   public void a(xk $$0) {
      this.b($$0, false);
   }

   public void b(xk $$0, boolean $$1) {
      if (this.x($$1)) {
         this.f.a(new agl($$0, $$1), wr.a(() -> {
            if (this.x(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               xk $$3 = xk.b($$2).a(n.o);
               return new agl(xk.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(xz $$0, boolean $$1, xg.a $$2) {
      if (this.gT()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String B() {
      return this.f.m() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(ari $$0) {
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

   public ari C() {
      int $$0 = this.au().a(bX);
      bvr $$1 = bvr.d.apply(this.au().a(bY));
      return new ari(this.df, this.de, this.cU, this.cW, $$0, $$1, this.dq, this.dr, this.cV);
   }

   public boolean D() {
      return this.cW;
   }

   public cpl E() {
      return this.cU;
   }

   private boolean x(boolean $$0) {
      return this.cU == cpl.c ? $$0 : true;
   }

   private boolean gT() {
      return this.cU == cpl.a;
   }

   public int F() {
      return this.de;
   }

   public void a(akm $$0) {
      this.f.b(new afd($$0.a(), $$0.d().map(akm.a::a)));
   }

   @Override
   public int G() {
      return this.g.c(this.gh());
   }

   @Override
   public void H() {
      this.cX = ae.c();
   }

   public axb I() {
      return this.cI;
   }

   public axa J() {
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

   public bvb L() {
      return (bvb)(this.cY == null ? this : this.cY);
   }

   @Override
   public void d(@Nullable bvb $$0) {
      bvb $$1 = this.L();
      this.cY = (bvb)($$0 == null ? this : $$0);
      if ($$1 != this.cY) {
         if (this.cY.dW() instanceof arx $$2) {
            this.a($$2, this.cY.dB(), this.cY.dD(), this.cY.dH(), Set.of(), this.dM(), this.dO(), false);
         }

         if ($$0 != null) {
            this.y().m().a(this);
         }

         this.f.b(new afk(this.cY));
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
   public void e(bvb $$0) {
      if (this.h.b() == dgw.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long N() {
      return this.cX;
   }

   @Nullable
   public xk O() {
      return null;
   }

   public int P() {
      return 0;
   }

   @Override
   public void a(bsz $$0) {
      super.a($$0);
      this.gD();
   }

   public boolean Q() {
      return this.cZ;
   }

   public void R() {
      this.cZ = false;
   }

   public alx S() {
      return this.cH;
   }

   @Nullable
   public jh T() {
      return this.dm;
   }

   public float U() {
      return this.do;
   }

   public alo<dgz> V() {
      return this.dl;
   }

   public boolean W() {
      return this.dn;
   }

   public void b(ary $$0) {
      this.a($$0.V(), $$0.T(), $$0.U(), $$0.W(), false);
   }

   public void a(alo<dgz> $$0, @Nullable jh $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.dm) && $$0.equals(this.dl);
         if ($$4 && !$$5) {
            this.a(xk.c("block.minecraft.set_spawn"));
         }

         this.dm = $$1;
         this.dl = $$0;
         this.do = $$2;
         this.dn = $$3;
      } else {
         this.dm = null;
         this.dl = dgz.i;
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

   public arh Y() {
      return this.dk;
   }

   public void a(arh $$0) {
      this.dk = $$0;
   }

   @Override
   public void a(awu $$0, aww $$1, float $$2, float $$3) {
      this.f.b(new agi(ma.b.e($$0), $$1, this.dB(), this.dD(), this.dH(), $$2, $$3, this.ae.g()));
   }

   @Override
   public cls a(cxg $$0, boolean $$1, boolean $$2) {
      cls $$3 = this.b($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dW().b($$3);
         cxg $$4 = $$3.l();
         if ($$2) {
            if (!$$4.f()) {
               this.a(axf.f.b($$4.h()), $$0.M());
            }

            this.a(axf.F);
         }

         return $$3;
      }
   }

   @Nullable
   private cls b(cxg $$0, boolean $$1, boolean $$2) {
      if ($$0.f()) {
         return null;
      } else {
         double $$3 = this.dF() - 0.3F;
         cls $$4 = new cls(this.dW(), this.dB(), $$3, this.dH(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.ae.i() * 0.5F;
            float $$6 = this.ae.i() * (float) (Math.PI * 2);
            $$4.n((double)(-azu.a($$6) * $$5), 0.2F, (double)(azu.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = azu.a(this.dO() * (float) (Math.PI / 180.0));
            float $$9 = azu.b(this.dO() * (float) (Math.PI / 180.0));
            float $$10 = azu.a(this.dM() * (float) (Math.PI / 180.0));
            float $$11 = azu.b(this.dM() * (float) (Math.PI / 180.0));
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

   public atg Z() {
      return this.dp;
   }

   public void a(arx $$0) {
      this.a((dgz)$$0);
      this.h.a($$0);
   }

   @Nullable
   private static dgw a(@Nullable um $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? dgw.a($$0.h($$1)) : null;
   }

   private dgw b(@Nullable dgw $$0) {
      dgw $$1 = this.g.bd();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.g.u();
      }
   }

   @Override
   public void c(@Nullable um $$0) {
      this.h.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void m(um $$0) {
      $$0.a("playerGameType", this.h.b().a());
      dgw $$1 = this.h.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean aa() {
      return this.dq;
   }

   public boolean c(ary $$0) {
      return $$0 == this ? false : this.dq || $$0.dq;
   }

   @Override
   public boolean c(arx $$0, jh $$1) {
      return super.c($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cxg $$0) {
      ao.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cpn $$1 = this.gi();
      cxg $$2 = $$1.a($$0);
      this.cd.b($$1, $$1.j).ifPresent($$1x -> this.cd.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   @Override
   public void b(cxg $$0) {
      if (!this.gi().f($$0)) {
         this.a($$0, false);
      }
   }

   public boolean ab() {
      return this.dr;
   }

   @Override
   public Optional<cot> ac() {
      return Optional.of(this.dt);
   }

   public void b(boolean $$0) {
      this.ds = $$0;
   }

   @Override
   public void a(cls $$0) {
      super.a($$0);
      bvb $$1 = $$0.p();
      if ($$1 != null) {
         ao.S.a(this, $$0.l(), $$1);
      }
   }

   public void a(yb $$0) {
      this.dA = $$0;
   }

   @Nullable
   public yb ad() {
      return this.dA != null && this.dA.b() ? null : this.dA;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cw = (float)(azu.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dM());
      this.f.b(new adq(this));
   }

   @Override
   public boolean a(bvb $$0, boolean $$1) {
      if (super.a($$0, $$1)) {
         $$0.j(this);
         this.f.a(new bwk(this.du(), fbr.c, 0.0F, 0.0F), bwl.k);
         if ($$0 instanceof bvx $$2) {
            this.g.ag().a($$2, this.f);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void ae() {
      bvb $$0 = this.dl();
      super.ae();
      if ($$0 instanceof bvx $$1) {
         for (bug $$2 : $$1.eB()) {
            this.f.b(new aex($$0.ar(), $$2.c()));
         }
      }
   }

   public agw b(arx $$0) {
      return new agw($$0.ah(), $$0.ai(), did.a($$0.E()), this.h.b(), this.h.c(), $$0.aj(), $$0.D(), this.gI(), this.aC(), $$0.P());
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
   public fbr ah() {
      bvb $$0 = this.dl();
      return $$0 != null && $$0.cX() != this ? $$0.ah() : this.dv;
   }

   public void a(fbr $$0) {
      this.dv = $$0;
   }

   @Override
   protected float a(bvb $$0, float $$1, btr $$2) {
      return dds.a(this.y(), this.ea(), $$0, $$2, $$1);
   }

   @Override
   public void a(cxc $$0, bvj $$1) {
      super.a($$0, $$1);
      this.b(axf.d.b($$0));
   }

   public cpm ai() {
      return this.dw;
   }

   public void a(cpm $$0) {
      this.dw = $$0;
   }

   public fbr aj() {
      float $$0 = this.dw.c() == this.dw.d() ? 0.0F : (this.dw.c() ? 1.0F : -1.0F);
      float $$1 = this.dw.a() == this.dw.b() ? 0.0F : (this.dw.a() ? 1.0F : -1.0F);
      return a(new fbr((double)$$0, 0.0, (double)$$1), 1.0F, this.dM());
   }

   public void a(cqr $$0) {
      this.dx.add($$0);
   }

   public void b(cqr $$0) {
      this.dx.remove($$0);
   }

   public Set<cqr> ak() {
      return this.dx;
   }

   public long c(cqr $$0) {
      if ($$0.dW() instanceof arx $$1) {
         dgf $$2 = $$0.dy();
         this.a($$0);
         $$1.i();
         return a($$1, $$2) - 1L;
      } else {
         return 0L;
      }
   }

   public static long a(arx $$0, dgf $$1) {
      $$0.m().a(asd.f, $$1, 2, $$1);
      return asd.f.b();
   }

   static record a(fbr a, float b) {
      public static ary.a a(fbr $$0, jh $$1) {
         return new ary.a($$0, b($$0, $$1));
      }

      private static float b(fbr $$0, jh $$1) {
         fbr $$2 = fbr.c($$1).d($$0).d();
         return (float)azu.d(azu.d($$2.f, $$2.d) * 180.0F / (float)Math.PI - 90.0);
      }
   }
}
