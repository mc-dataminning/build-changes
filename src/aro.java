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

public class aro extends cqi {
   private static final Logger co = LogUtils.getLogger();
   private static final int cp = 32;
   private static final int cq = 10;
   private static final int cr = 25;
   public static final double a = 1.0;
   public static final double b = 3.0;
   public static final int c = 2;
   public static final String d = "ender_pearls";
   public static final String e = "ender_pearl_dimension";
   private static final bxv cs = new bxv(ald.b("creative_mode_block_range"), 0.5, bxv.a.a);
   private static final bxv ct = new bxv(ald.b("creative_mode_entity_range"), 2.0, bxv.a.a);
   public asq f;
   public final MinecraftServer g;
   public final arp h;
   private final all cu;
   private final awq cv;
   private float cw = Float.MIN_VALUE;
   private int cx = Integer.MIN_VALUE;
   private int cy = Integer.MIN_VALUE;
   private int cz = Integer.MIN_VALUE;
   private int cA = Integer.MIN_VALUE;
   private int cB = Integer.MIN_VALUE;
   private float cC = -1.0E8F;
   private int cD = -99999999;
   private boolean cE = true;
   private int cF = -99999999;
   private cqf cG = cqf.a;
   private arf cH = arf.a;
   private boolean cI = true;
   private long cJ = af.c();
   @Nullable
   private bvs cK;
   private boolean cL;
   public boolean i;
   private final awp cM;
   @Nullable
   private fcu cN;
   private int cO;
   private boolean cP;
   private int cQ = 2;
   private String cR = "en_us";
   @Nullable
   private fcu cS;
   @Nullable
   private fcu cT;
   @Nullable
   private fcu cU;
   private kl cV = kl.a(0, 0, 0);
   private aqw cW = aqw.a;
   private alc<dhp> cX = dhp.i;
   @Nullable
   private jj cY;
   private boolean cZ;
   private float da;
   private final asw db;
   private boolean dc;
   private boolean dd;
   private boolean de;
   private cpn df = new cpn(0, 0, 0);
   @Nullable
   private jj dg;
   private fcu dh = fcu.c;
   private cqg di = cqg.b;
   private final Set<crl> dj = new HashSet<>();
   private final cuc dk = new cuc() {
      @Override
      public void a(ctn $$0, kb<cxy> $$1, cxy $$2, int[] $$3) {
         aro.this.f.b(new acl($$0.l, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(ctn $$0, int $$1, cxy $$2) {
         aro.this.f.b(new acn($$0.l, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(ctn $$0, cxy $$1) {
         aro.this.f.b(new aex($$1.v()));
      }

      @Override
      public void a(ctn $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(ctn $$0, int $$1, int $$2) {
         aro.this.f.b(new acm($$0.l, $$1, $$2));
      }
   };
   private final cub dl = new cub() {
      @Override
      public void a(ctn $$0, int $$1, cxy $$2) {
         cvk $$3 = $$0.b($$1);
         if (!($$3 instanceof cvg)) {
            if ($$3.c == aro.this.gi()) {
               ap.f.a(aro.this, aro.this.gi(), $$2);
            }
         }
      }

      @Override
      public void a(ctn $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private xm dm;
   @Nullable
   public final Object j;
   private final ew dn = new ew() {
      @Override
      public boolean t_() {
         return aro.this.y().O().c(dhl.p);
      }

      @Override
      public boolean u_() {
         return true;
      }

      @Override
      public boolean c() {
         return true;
      }

      @Override
      public void a(wv $$0) {
         aro.this.a($$0);
      }
   };
   private int do;
   public boolean k;

   public aro(MinecraftServer $$0, arn $$1, GameProfile $$2, aqx $$3) {
      super($$1, $$1.aa(), $$1.ab(), $$2);
      this.db = $$0.a(this);
      this.h = $$0.b(this);
      this.cM = new awp(($$1x, $$2x) -> $$0.aI().a($$1x, $$2x));
      this.g = $$0;
      this.cv = $$0.ag().a((cqi)this);
      this.cu = $$0.ag().g(this);
      this.b(this.a($$1, $$1.aa()).c(), 0.0F, 0.0F);
      this.a($$3);
      this.j = null;
   }

   @Override
   public jj a(arn $$0, jj $$1) {
      fcp $$2 = this.a(bxd.a).a(fcu.c);
      jj $$3 = $$1;
      if ($$0.B_().g() && $$0.p().aZ().k() != dhm.c) {
         int $$4 = Math.max(0, this.g.a($$0));
         int $$5 = azk.a($$0.A_().b((double)$$1.u(), (double)$$1.w()));
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
         int $$10 = azs.a().a($$8);

         for (int $$11 = 0; $$11 < $$8; $$11++) {
            int $$12 = ($$10 + $$9 * $$11) % $$8;
            int $$13 = $$12 % ($$4 * 2 + 1);
            int $$14 = $$12 / ($$4 * 2 + 1);
            int $$15 = $$1.u() + $$13 - $$4;
            int $$16 = $$1.w() + $$14 - $$4;

            try {
               $$3 = arh.a($$0, $$15, $$16);
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

      while (!this.a($$0, $$2.c($$3.c())) && $$3.v() < $$0.ao()) {
         $$3 = $$3.d();
      }

      while (this.a($$0, $$2.c($$3.e().c())) && $$3.v() > $$0.G_() + 1) {
         $$3 = $$3.e();
      }

      return $$3;
   }

   private boolean a(arn $$0, fcp $$1) {
      return $$0.a(this, $$1, true);
   }

   private int t(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         cpn.a.parse(new Dynamic(uk.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(co::error).ifPresent($$0x -> this.df = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         tw $$1 = $$0.p("enteredNetherPosition");
         this.cT = new fcu($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.i = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cM.a($$0.p("recipeBook"), $$0x -> this.g.aI().b($$0x).isPresent());
      }

      if (this.fQ()) {
         this.fR();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.cY = new jj($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.cZ = $$0.q("SpawnForced");
         this.da = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.cX = dhp.h.parse(uk.a, $$0.c("SpawnDimension")).resultOrPartial(co::error).orElse(dhp.i);
         }
      }

      this.de = $$0.q("spawn_extra_particles_on_fall");
      ut $$2 = $$0.c("raid_omen_position");
      if ($$2 != null) {
         jj.a.parse(uk.a, $$2).resultOrPartial(co::error).ifPresent($$0x -> this.dg = $$0x);
      }
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      cpn.a.encodeStart(uk.a, this.df).resultOrPartial(co::error).ifPresent($$1x -> $$0.a("warden_spawn_tracker", $$1x));
      this.m($$0);
      $$0.a("seenCredits", this.i);
      if (this.cT != null) {
         tw $$1 = new tw();
         $$1.a("x", this.cT.d);
         $$1.a("y", this.cT.e);
         $$1.a("z", this.cT.f);
         $$0.a("enteredNetherPosition", $$1);
      }

      this.k($$0);
      $$0.a("recipeBook", this.cM.b());
      $$0.a("Dimension", this.dV().aj().a().toString());
      if (this.cY != null) {
         $$0.a("SpawnX", this.cY.u());
         $$0.a("SpawnY", this.cY.v());
         $$0.a("SpawnZ", this.cY.w());
         $$0.a("SpawnForced", this.cZ);
         $$0.a("SpawnAngle", this.da);
         ald.a.encodeStart(uk.a, this.cX.a()).resultOrPartial(co::error).ifPresent($$1x -> $$0.a("SpawnDimension", $$1x));
      }

      $$0.a("spawn_extra_particles_on_fall", this.de);
      if (this.dg != null) {
         jj.a.encodeStart(uk.a, this.dg).resultOrPartial(co::error).ifPresent($$1x -> $$0.a("raid_omen_position", $$1x));
      }

      this.l($$0);
   }

   private void k(tw $$0) {
      bvs $$1 = this.df();
      bvs $$2 = this.dk();
      if ($$2 != null && $$1 != this && $$1.de()) {
         tw $$3 = new tw();
         tw $$4 = new tw();
         $$1.e($$4);
         $$3.a("Attach", $$2.cG());
         $$3.a("Entity", $$4);
         $$0.a("RootVehicle", $$3);
      }
   }

   public void a(Optional<tw> $$0) {
      if ($$0.isPresent() && $$0.get().b("RootVehicle", 10) && this.dV() instanceof arn $$1) {
         tw $$2 = $$0.get().p("RootVehicle");
         bvs $$3 = bwb.a($$2.p("Entity"), $$1, bwa.r, $$1x -> !$$1.c($$1x) ? null : $$1x);
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
            for (bvs $$6 : $$3.dc()) {
               if ($$6.cG().equals($$4)) {
                  this.a($$6, true);
                  break;
               }
            }
         }

         if (!this.bZ()) {
            co.warn("Couldn't reattach entity to player");
            $$3.at();

            for (bvs $$7 : $$3.dc()) {
               $$7.at();
            }
         }
      }
   }

   private void l(tw $$0) {
      if (!this.dj.isEmpty()) {
         uc $$1 = new uc();

         for (crl $$2 : this.dj) {
            if ($$2.dQ()) {
               co.warn("Trying to save removed ender pearl, skipping");
            } else {
               tw $$3 = new tw();
               $$2.e($$3);
               ald.a.encodeStart(uk.a, $$2.dV().aj().a()).resultOrPartial(co::error).ifPresent($$1x -> $$3.a("ender_pearl_dimension", $$1x));
               $$1.add($$3);
            }
         }

         $$0.a("ender_pearls", $$1);
      }
   }

   public void b(Optional<tw> $$0) {
      if ($$0.isPresent() && $$0.get().b("ender_pearls", 9) && $$0.get().c("ender_pearls") instanceof uc $$2) {
         $$2.forEach($$0x -> {
            if ($$0x instanceof tw $$1 && $$1.e("ender_pearl_dimension")) {
               Optional<alc<dhp>> $$2x = dhp.h.parse(uk.a, $$1.c("ender_pearl_dimension")).resultOrPartial(co::error);
               if ($$2x.isEmpty()) {
                  co.warn("No dimension defined for ender pearl, skipping");
                  return;
               }

               arn $$3 = this.dV().p().a($$2x.get());
               if ($$3 != null) {
                  bvs $$4 = bwb.a($$1, $$3, bwa.r, $$1x -> !$$3.c($$1x) ? null : $$1x);
                  if ($$4 != null) {
                     a($$3, $$4.dx());
                  } else {
                     co.warn("Failed to spawn player ender pearl in level ({}), skipping", $$2x.get());
                  }
               } else {
                  co.warn("Trying to load ender pearl without level ({}) being loaded, skipping", $$2x.get());
               }
            }
         });
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gs();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.cf = azk.a((float)$$0 / $$1, 0.0F, $$2);
      this.cF = -1;
   }

   public void b(int $$0) {
      this.cd = $$0;
      this.cF = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cF = -1;
   }

   @Override
   public void a(cxy $$0, int $$1) {
      super.a($$0, $$1);
      this.cF = -1;
   }

   private void a(ctn $$0) {
      $$0.a(this.dl);
      $$0.a(this.dk);
   }

   public void d() {
      this.a(this.bO);
   }

   @Override
   public void e_() {
      super.e_();
      this.f.b(adv.a);
   }

   @Override
   public void J_() {
      super.J_();
      this.f.b(new adu(this.eR()));
   }

   @Override
   public void a(dym $$0) {
      ap.e.a(this, $$0);
   }

   @Override
   protected cxv g() {
      return new cyw(this);
   }

   @Override
   public void h() {
      this.gJ();
      this.h.a();
      this.df.a();
      if (this.aj > 0) {
         this.aj--;
      }

      this.bP.d();
      if (!this.bP.b(this)) {
         this.p();
         this.bP = this.bO;
      }

      bvs $$0 = this.L();
      if ($$0 != this) {
         if ($$0.bK()) {
            this.a($$0.dA(), $$0.dC(), $$0.dG(), $$0.dL(), $$0.dN());
            this.y().m().a(this);
            if (this.fY()) {
               this.d(this);
            }
         } else {
            this.d(this);
         }
      }

      ap.x.a(this);
      if (this.cN != null) {
         ap.v.a(this, this.cN, this.af - this.cO);
      }

      this.l();
      this.m();
      this.gQ();
      this.cu.a(this, true);
   }

   private void gQ() {
      bxt $$0 = this.g(bxx.g);
      if ($$0 != null) {
         if (this.b()) {
            $$0.a(cs);
         } else {
            $$0.e(cs);
         }
      }

      bxt $$1 = this.g(bxx.j);
      if ($$1 != null) {
         if (this.b()) {
            $$1.a(ct);
         } else {
            $$1.e(ct);
         }
      }
   }

   public void i() {
      try {
         if (!this.U_() || !this.do()) {
            super.h();
         }

         for (int $$0 = 0; $$0 < this.gi().b(); $$0++) {
            cxy $$1 = this.gi().a($$0);
            if (!$$1.f()) {
               this.k($$1);
            }
         }

         if (this.eF() != this.cC || this.cD != this.bQ.a() || this.bQ.c() == 0.0F != this.cE) {
            this.f.b(new aff(this.eF(), this.bQ.a(), this.bQ.c()));
            this.cC = this.eF();
            this.cD = this.bQ.a();
            this.cE = this.bQ.c() == 0.0F;
         }

         if (this.eF() + this.fv() != this.cw) {
            this.cw = this.eF() + this.fv();
            this.a(fec.g, azk.f(this.cw));
         }

         if (this.bQ.a() != this.cx) {
            this.cx = this.bQ.a();
            this.a(fec.h, azk.f((float)this.cx));
         }

         if (this.ct() != this.cy) {
            this.cy = this.ct();
            this.a(fec.i, azk.f((float)this.cy));
         }

         if (this.eQ() != this.cz) {
            this.cz = this.eQ();
            this.a(fec.j, azk.f((float)this.cz));
         }

         if (this.ce != this.cB) {
            this.cB = this.ce;
            this.a(fec.k, azk.f((float)this.cB));
         }

         if (this.cd != this.cA) {
            this.cA = this.cd;
            this.a(fec.l, azk.f((float)this.cA));
         }

         if (this.ce != this.cF) {
            this.cF = this.ce;
            this.f.b(new afe(this.cf, this.ce, this.cd));
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

   private void k(cxy $$0) {
      ewl $$1 = $$0.a(kx.M);
      ewn $$2 = cyl.a($$1, this.dV());
      if ($$2 != null) {
         zc<?> $$3 = $$2.a($$1, this);
         if ($$3 != null) {
            this.f.b($$3);
         }
      }
   }

   @Override
   protected void j() {
      if (this.dV().an() == btn.a && this.y().O().c(dhl.k)) {
         if (this.af % 20 == 0) {
            if (this.eF() < this.eT()) {
               this.c(1.0F);
            }

            float $$0 = this.bQ.c();
            if ($$0 < 20.0F) {
               this.bQ.b($$0 + 1.0F);
            }
         }

         if (this.af % 10 == 0 && this.bQ.b()) {
            this.bQ.a(this.bQ.a() + 1);
         }
      }
   }

   @Override
   public void k() {
      if (this.eF() > 0.0F && this.cS != null) {
         ap.X.a(this, this.cS);
      }

      this.cS = null;
      super.k();
   }

   public void l() {
      if (this.Z > 0.0 && this.cS == null) {
         this.cS = this.dt();
         if (this.ck != null && this.ck.e <= this.cS.e) {
            ap.ae.a(this, this.ck, this.cl);
         }
      }
   }

   @Override
   public void m() {
      if (this.dk() != null && this.dk().bw()) {
         if (this.cU == null) {
            this.cU = this.dt();
         } else {
            ap.Y.a(this, this.cU);
         }
      }

      if (this.cU != null && (this.dk() == null || !this.dk().bw())) {
         this.cU = null;
      }
   }

   private void a(fec $$0, int $$1) {
      this.gy().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(buh $$0) {
      this.a(edm.p);
      boolean $$1 = this.y().O().c(dhl.n);
      if ($$1) {
         wv $$2 = this.eR().a();
         this.f.a(new adw(this.ar(), $$2), wc.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            wv $$3x = wv.a("death.attack.message_too_long", wv.b($$2x).a(n.o));
            wv $$4x = wv.a("death.attack.even_more_magic", this.m_()).a($$1xx -> $$1xx.a(new xb.e($$3x)));
            return new adw(this.ar(), $$4x);
         }));
         feb $$3 = this.cr();
         if ($$3 == null || $$3.k() == feb.b.a) {
            this.g.ag().a($$2, false);
         } else if ($$3.k() == feb.b.c) {
            this.g.ag().a(this, $$2);
         } else if ($$3.k() == feb.b.d) {
            this.g.ag().b(this, $$2);
         }
      } else {
         this.f.b(new adw(this.ar(), wu.a));
      }

      this.gx();
      if (this.y().O().c(dhl.O)) {
         this.gR();
      }

      if (!this.U_()) {
         this.b(this.y(), $$0);
      }

      this.gy().a(fec.d, this, fdx::b);
      bwr $$4 = this.eS();
      if ($$4 != null) {
         this.b(awu.h.b($$4.aq()));
         $$4.a(this, $$0);
         this.f($$4);
      }

      this.dV().a(this, (byte)3);
      this.a(awu.N);
      this.a(awu.i.b(awu.m));
      this.a(awu.i.b(awu.n));
      this.aH();
      this.k(0);
      this.c(false);
      this.eR().c();
      this.c(Optional.of(jr.a(this.dV().aj(), this.dv())));
      this.v(false);
   }

   private void gR() {
      fcp $$0 = new fcp(this.dv()).c(32.0, 10.0, 32.0);
      this.dV().a(bwt.class, $$0, bvz.f).stream().filter($$0x -> $$0x instanceof bww).forEach($$0x -> ((bww)$$0x).a_(this.y(), this));
   }

   @Override
   public void a(bvs $$0, buh $$1) {
      if ($$0 != this) {
         super.a($$0, $$1);
         this.gy().a(fec.f, this, fdx::b);
         if ($$0 instanceof cqi) {
            this.a(awu.Q);
            this.gy().a(fec.e, this, fdx::b);
         } else {
            this.a(awu.O);
         }

         this.a(this, $$0, fec.m);
         this.a($$0, this, fec.n);
         ap.c.a(this, $$0, $$1);
      }
   }

   private void a(fdy $$0, fdy $$1, fec[] $$2) {
      fdu $$3 = this.gy().e($$1.cI());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gy().a($$2[$$4], $$0, fdx::b);
         }
      }
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         bvs $$3 = $$1.d();
         if ($$3 instanceof cqi $$4 && !this.a($$4)) {
            return false;
         }

         if ($$3 instanceof cqp $$5 && $$5.q() instanceof cqi $$7 && !this.a($$7)) {
            return false;
         }

         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(cqi $$0) {
      return !this.gS() ? false : super.a($$0);
   }

   private boolean gS() {
      return this.g.ac();
   }

   public evt a(boolean $$0, evt.a $$1) {
      jj $$2 = this.T();
      float $$3 = this.U();
      boolean $$4 = this.W();
      arn $$5 = this.g.a(this.V());
      if ($$5 != null && $$2 != null) {
         Optional<aro.a> $$6 = a($$5, $$2, $$3, $$4, $$0);
         if ($$6.isPresent()) {
            aro.a $$7 = $$6.get();
            return new evt($$5, $$7.a(), fcu.c, $$7.b(), 0.0F, $$1);
         } else {
            return evt.a(this.g.J(), this, $$1);
         }
      } else {
         return new evt(this.g.J(), this, $$1);
      }
   }

   private static Optional<aro.a> a(arn $$0, jj $$1, float $$2, boolean $$3, boolean $$4) {
      dym $$5 = $$0.a_($$1);
      dku $$6 = $$5.b();
      if ($$6 instanceof drh && ($$3 || $$5.c(drh.d) > 0) && drh.a($$0)) {
         Optional<fcu> $$7 = drh.a(bwb.bR, $$0, $$1);
         if (!$$3 && $$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.b(drh.d, Integer.valueOf($$5.c(drh.d) - 1)), 3);
         }

         return $$7.map($$1x -> aro.a.a($$1x, $$1));
      } else if ($$6 instanceof dkn && dkn.a($$0)) {
         return dkn.a(bwb.bR, $$0, $$1, $$5.c(dkn.e), $$2).map($$1x -> aro.a.a($$1x, $$1));
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dym $$9 = $$0.a_($$1.d());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new aro.a(new fcu((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5), $$2)) : Optional.empty();
      }
   }

   @Override
   public void n() {
      this.ao();
      this.y().a(this, bvs.e.e);
      if (!this.k) {
         this.k = true;
         this.f.b(new acy(acy.f, 0.0F));
         this.i = true;
      }
   }

   @Nullable
   public aro a(evt $$0) {
      if (this.dQ()) {
         return null;
      } else {
         if ($$0.g()) {
            this.f.b(new acy(acy.b, 0.0F));
         }

         arn $$1 = $$0.b();
         arn $$2 = this.y();
         alc<dhp> $$3 = $$2.aj();
         if (!$$0.h()) {
            this.ae();
         }

         if ($$1.aj() == $$3) {
            this.f.a(bxe.a($$0), $$0.i());
            this.f.l();
            $$0.j().onTransition(this);
            return this;
         } else {
            this.cL = true;
            ewv $$4 = $$1.y_();
            this.f.b(new aej(this.b($$1), (byte)3));
            this.f.b(new acd($$4.q(), $$4.r()));
            avn $$5 = this.g.ag();
            $$5.e(this);
            $$2.a(this, bvs.e.e);
            this.dS();
            bqb $$6 = bqa.a();
            $$6.a("moving");
            if ($$3 == dhp.i && $$1.aj() == dhp.j) {
               this.cT = this.dt();
            }

            $$6.c();
            $$6.a("placing");
            this.a($$1);
            this.f.a(bxe.a($$0), $$0.i());
            this.f.l();
            $$1.d(this);
            $$6.c();
            this.g($$2);
            this.fE();
            this.f.b(new ads(this.gj()));
            $$5.a(this, $$1);
            $$5.f(this);
            $$5.d(this);
            $$0.j().onTransition(this);
            this.cF = -1;
            this.cC = -1.0F;
            this.cD = -1;
            return this;
         }
      }
   }

   @Override
   public void a(float $$0, float $$1) {
      this.f.b(new aeb($$0, $$1));
   }

   private void g(arn $$0) {
      alc<dhp> $$1 = $$0.aj();
      alc<dhp> $$2 = this.dV().aj();
      ap.w.a(this, $$1, $$2);
      if ($$1 == dhp.j && $$2 == dhp.i && this.cT != null) {
         ap.D.a(this, this.cT);
      }

      if ($$2 != dhp.j) {
         this.cT = null;
      }
   }

   @Override
   public boolean a(aro $$0) {
      if ($$0.U_()) {
         return this.L() == this;
      } else {
         return this.U_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bvs $$0, int $$1) {
      super.a($$0, $$1);
      this.bP.d();
   }

   @Override
   public Either<cqi.a, baq> a(jj $$0) {
      jo $$1 = this.dV().a_($$0).c(dot.e);
      if (this.fQ() || !this.bK()) {
         return Either.left(cqi.a.e);
      } else if (!this.dV().B_().j()) {
         return Either.left(cqi.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cqi.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cqi.a.d);
      } else {
         this.a(this.dV().aj(), $$0, this.dL(), false, true);
         if (this.dV().V()) {
            return Either.left(cqi.a.b);
         } else {
            if (!this.b()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               fcu $$4 = fcu.c($$0);
               List<cnj> $$5 = this.dV()
                  .a(
                     cnj.class,
                     new fcp($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0),
                     $$0x -> $$0x.a(this.y(), this)
                  );
               if (!$$5.isEmpty()) {
                  return Either.left(cqi.a.f);
               }
            }

            Either<cqi.a, baq> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(awu.ap);
               ap.r.a(this);
            });
            if (!this.y().e()) {
               this.a(wv.c("sleep.not_possible"), true);
            }

            ((arn)this.dV()).f();
            return $$6;
         }
      }
   }

   @Override
   public void b(jj $$0) {
      this.a(awu.i.b(awu.n));
      super.b($$0);
   }

   private boolean a(jj $$0, jo $$1) {
      return this.j($$0) || this.j($$0.a($$1.g()));
   }

   private boolean j(jj $$0) {
      fcu $$1 = fcu.c($$0);
      return Math.abs(this.dA() - $$1.a()) <= 3.0 && Math.abs(this.dC() - $$1.b()) <= 2.0 && Math.abs(this.dG() - $$1.c()) <= 3.0;
   }

   private boolean b(jj $$0, jo $$1) {
      jj $$2 = $$0.d();
      return !this.i($$2) || !this.i($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fQ()) {
         this.y().m().a(this, new abt(this, 2));
      }

      super.a($$0, $$1);
      if (this.f != null) {
         this.f.a(this.dA(), this.dC(), this.dG(), this.dL(), this.dN());
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.ae();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public boolean a(arn $$0, buh $$1) {
      return super.a($$0, $$1) || this.Q() && !$$1.a(buk.m) || !this.gI();
   }

   @Override
   protected void b(arn $$0, jj $$1) {
      if (!this.U_()) {
         super.b($$0, $$1);
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, dym $$2, jj $$3) {
      if (this.de && $$1 && this.Z > 0.0) {
         fcu $$4 = $$3.b().b(0.0, 0.5, 0.0);
         int $$5 = (int)azk.a(50.0 * this.Z, 0.0, 200.0);
         this.y().a(new ln(lv.b, $$2), $$4.d, $$4.e, $$4.f, $$5, 0.3F, 0.3F, 0.3F, 0.15F);
         this.de = false;
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b_(@Nullable bvs $$0) {
      super.b_($$0);
      this.ck = this.dt();
      this.cl = $$0;
      this.w($$0 != null && $$0.aq() == bwb.bG);
   }

   @Override
   protected void o() {
      if (this.dV().u().i()) {
         super.o();
      }
   }

   @Override
   public void a(dwz $$0, boolean $$1) {
      this.f.b(new abz(this.dV(), $$0.aw_()));
      this.f.b(new adq($$0.aw_(), $$1));
   }

   private void gT() {
      this.do = this.do % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bts $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.bP != this.bO) {
            this.p();
         }

         this.gT();
         ctn $$1 = $$0.createMenu(this.do, this.gi(), this);
         if ($$1 == null) {
            if (this.U_()) {
               this.a(wv.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.f.b(new adp($$1.l, $$1.a(), $$0.m_()));
            this.a($$1);
            this.bP = $$1;
            return OptionalInt.of(this.do);
         }
      }
   }

   @Override
   public void a(int $$0, dgo $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.f.b(new adk($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(ckn $$0, btj $$1) {
      if (this.bP != this.bO) {
         this.p();
      }

      this.gT();
      int $$2 = $$0.aa_();
      this.f.b(new acz(this.do, $$2, $$0.ar()));
      this.bP = new cup(this.do, this.gi(), $$1, $$0, $$2);
      this.a(this.bP);
   }

   @Override
   public void a(cxy $$0, btp $$1) {
      if ($$0.c(kx.V)) {
         if (dbe.a($$0, this.A(), this)) {
            this.bP.d();
         }

         this.f.b(new ado($$1));
      }
   }

   @Override
   public void a(dvw $$0) {
      this.f.b(abx.a($$0, dvl::e));
   }

   @Override
   public void p() {
      this.f.b(new ack(this.bP.l));
      this.q();
   }

   @Override
   public void q() {
      this.bP.a(this);
      this.bO.a(this.bP);
      this.bP = this.bO;
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
               this.a(awu.C, $$3);
               this.H(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(axf.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(awu.w, $$4);
               this.H(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.bj()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(awu.s, $$5);
               this.H(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.d_()) {
            if ($$1 > 0.0) {
               this.a(awu.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aJ()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.cj()) {
                  this.a(awu.r, $$6);
                  this.H(0.1F * (float)$$6 * 0.01F);
               } else if (this.ci()) {
                  this.a(awu.q, $$6);
                  this.H(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(awu.p, $$6);
                  this.H(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fI()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(awu.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(awu.v, $$8);
            }
         }
      }
   }

   private void q(double $$0, double $$1, double $$2) {
      if (this.bZ() && !r($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         bvs $$4 = this.dk();
         if ($$4 instanceof csh) {
            this.a(awu.x, $$3);
         } else if ($$4 instanceof csf) {
            this.a(awu.y, $$3);
         } else if ($$4 instanceof cix) {
            this.a(awu.z, $$3);
         } else if ($$4 instanceof ckn) {
            this.a(awu.A, $$3);
         } else if ($$4 instanceof cnw) {
            this.a(awu.D, $$3);
         }
      }
   }

   private static boolean r(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(awr<?> $$0, int $$1) {
      this.cv.b(this, $$0, $$1);
      this.gy().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(awr<?> $$0) {
      this.cv.a(this, $$0, 0);
      this.gy().a($$0, this, fdx::c);
   }

   @Override
   public int a(Collection<dcq<?>> $$0) {
      return this.cM.a($$0, this);
   }

   @Override
   public void a(dcq<?> $$0, List<cxy> $$1) {
      ap.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<alc<dcl<?>>> $$0) {
      List<dcq<?>> $$1 = $$0.stream().flatMap($$0x -> this.g.aI().b($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<dcq<?>> $$0) {
      return this.cM.b($$0, this);
   }

   @Override
   public void s() {
      super.s();
      this.a(awu.E);
      if (this.cj()) {
         this.H(0.2F);
      } else {
         this.H(0.05F);
      }
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cF = -1;
   }

   public void t() {
      this.cP = true;
      this.bO();
      if (this.fQ()) {
         this.a(true, false);
      }
   }

   public boolean u() {
      return this.cP;
   }

   @Override
   public void v() {
      this.cC = -1.0E8F;
   }

   @Override
   public void a(wv $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void K_() {
      if (!this.bl.f() && this.fy()) {
         this.f.b(new acu(this, (byte)9));
         super.K_();
      }
   }

   @Override
   public void a(fj.a $$0, fcu $$1) {
      super.a($$0, $$1);
      this.f.b(new adz($$0, $$1.d, $$1.e, $$1.f));
   }

   public void a(fj.a $$0, bvs $$1, fj.a $$2) {
      fcu $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.f.b(new adz($$0, $$1, $$2));
   }

   public void a(aro $$0, boolean $$1) {
      this.df = $$0.df;
      this.dm = $$0.dm;
      this.h.a($$0.h.b(), $$0.h.c());
      this.x();
      if ($$1) {
         this.eZ().b($$0.eZ());
         this.eZ().c($$0.eZ());
         this.d($$0.eF());
         this.bQ = $$0.bQ;

         for (buw $$2 : $$0.eC()) {
            this.a(new buw($$2));
         }

         this.gi().a($$0.gi());
         this.cd = $$0.cd;
         this.ce = $$0.ce;
         this.cf = $$0.cf;
         this.q($$0.gc());
         this.as = $$0.as;
      } else {
         this.eZ().b($$0.eZ());
         this.d(this.eT());
         if (this.y().O().c(dhl.d) || $$0.U_()) {
            this.gi().a($$0.gi());
            this.cd = $$0.cd;
            this.ce = $$0.ce;
            this.cf = $$0.cf;
            this.q($$0.gc());
         }
      }

      this.cg = $$0.cg;
      this.bN = $$0.bN;
      this.au().a(bI, $$0.au().a(bI));
      this.cF = -1;
      this.cC = -1.0F;
      this.cD = -1;
      this.cM.a($$0.cM);
      this.i = $$0.i;
      this.cT = $$0.cT;
      this.cW = $$0.cW;
      this.i($$0.gA());
      this.j($$0.gB());
      this.c($$0.gH());
   }

   @Override
   protected void a(buw $$0, @Nullable bvs $$1) {
      super.a($$0, $$1);
      this.f.b(new agf(this.ar(), $$0, true));
      if ($$0.a(buy.y)) {
         this.cO = this.af;
         this.cN = this.dt();
      }

      ap.B.a(this, $$1);
   }

   @Override
   protected void a(buw $$0, boolean $$1, @Nullable bvs $$2) {
      super.a($$0, $$1, $$2);
      this.f.b(new agf(this.ar(), $$0, false));
      ap.B.a(this, $$2);
   }

   @Override
   protected void c(Collection<buw> $$0) {
      super.c($$0);

      for (buw $$1 : $$0) {
         this.f.b(new aeh(this.ar(), $$1.c()));
         if ($$1.a(buy.y)) {
            this.cN = null;
         }
      }

      ap.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.f.a(new bxe(new fcu($$0, $$1, $$2), fcu.c, 0.0F, 0.0F), bxf.a(bxf.l, bxf.k));
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.f.a(new bxe(new fcu($$0, $$1, $$2), fcu.c, 0.0F, 0.0F), bxf.j);
   }

   @Override
   public boolean a(arn $$0, double $$1, double $$2, double $$3, Set<bxf> $$4, float $$5, float $$6, boolean $$7) {
      if (this.fQ()) {
         this.a(true, true);
      }

      if ($$7) {
         this.d(this);
      }

      boolean $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$8) {
         this.r($$4.contains(bxf.d) ? this.cA() + $$5 : $$5);
      }

      return $$8;
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      super.e($$0, $$1, $$2);
      this.f.l();
   }

   @Override
   public void b(bvs $$0) {
      this.y().m().a(this, new abt($$0, 4));
   }

   @Override
   public void c(bvs $$0) {
      this.y().m().a(this, new abt($$0, 5));
   }

   @Override
   public void x() {
      if (this.f != null) {
         this.f.b(new ads(this.gj()));
         this.K();
      }
   }

   public arn y() {
      return (arn)this.dV();
   }

   public boolean a(dhm $$0) {
      boolean $$1 = this.U_();
      if (!this.h.a($$0)) {
         return false;
      } else {
         this.f.b(new acy(acy.e, (float)$$0.a()));
         if ($$0 == dhm.d) {
            this.gx();
            this.bP();
            dej.a(this);
         } else {
            this.d(this);
            if ($$1) {
               dej.a(this.y(), this);
            }
         }

         this.x();
         this.fw();
         return true;
      }
   }

   @Override
   public boolean U_() {
      return this.h.b() == dhm.d;
   }

   @Override
   public boolean b() {
      return this.h.b() == dhm.b;
   }

   public ew z() {
      return this.dn;
   }

   public ex A() {
      return new ex(this.z(), this.dt(), this.bU(), this.y(), this.G(), this.al().getString(), this.m_(), this.g, this);
   }

   public void a(wv $$0) {
      this.b($$0, false);
   }

   public void b(wv $$0, boolean $$1) {
      if (this.x($$1)) {
         this.f.a(new afv($$0, $$1), wc.a(() -> {
            if (this.x(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               wv $$3 = wv.b($$2).a(n.o);
               return new afv(wv.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(xk $$0, boolean $$1, wr.a $$2) {
      if (this.gU()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String B() {
      return this.f.m() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(aqx $$0) {
      this.cR = $$0.b();
      this.cQ = $$0.c();
      this.cG = $$0.d();
      this.cI = $$0.e();
      this.dc = $$0.h();
      this.dd = $$0.i();
      this.cH = $$0.j();
      this.au().a(bI, (byte)$$0.f());
      this.au().a(bJ, (byte)$$0.g().b());
   }

   public aqx C() {
      int $$0 = this.au().a(bI);
      bwk $$1 = bwk.d.apply(this.au().a(bJ));
      return new aqx(this.cR, this.cQ, this.cG, this.cI, $$0, $$1, this.dc, this.dd, this.cH);
   }

   public boolean D() {
      return this.cI;
   }

   public cqf E() {
      return this.cG;
   }

   private boolean x(boolean $$0) {
      return this.cG == cqf.c ? $$0 : true;
   }

   private boolean gU() {
      return this.cG == cqf.a;
   }

   public int F() {
      return this.cQ;
   }

   public void a(aka $$0) {
      this.f.b(new aen($$0.a(), $$0.d().map(aka.a::a)));
   }

   @Override
   public int G() {
      return this.g.c(this.gh());
   }

   public void H() {
      this.cJ = af.c();
   }

   public awq I() {
      return this.cv;
   }

   public awp J() {
      return this.cM;
   }

   @Override
   protected void K() {
      if (this.U_()) {
         this.eA();
         this.k(true);
      } else {
         super.K();
      }
   }

   public bvs L() {
      return (bvs)(this.cK == null ? this : this.cK);
   }

   @Override
   public void d(@Nullable bvs $$0) {
      bvs $$1 = this.L();
      this.cK = (bvs)($$0 == null ? this : $$0);
      if ($$1 != this.cK) {
         if (this.cK.dV() instanceof arn $$2) {
            this.a($$2, this.cK.dA(), this.cK.dC(), this.cK.dG(), Set.of(), this.dL(), this.dN(), false);
         }

         if ($$0 != null) {
            this.y().m().a(this);
         }

         this.f.b(new aeu(this.cK));
         this.f.l();
      }
   }

   @Override
   protected void M() {
      if (!this.cL) {
         super.M();
      }
   }

   @Override
   public void e(bvs $$0) {
      if (this.h.b() == dhm.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long N() {
      return this.cJ;
   }

   @Nullable
   public wv O() {
      return null;
   }

   public int P() {
      return 0;
   }

   @Override
   public void a(btp $$0) {
      super.a($$0);
      this.gD();
   }

   public boolean Q() {
      return this.cL;
   }

   public void R() {
      this.cL = false;
   }

   public all S() {
      return this.cu;
   }

   @Nullable
   public jj T() {
      return this.cY;
   }

   public float U() {
      return this.da;
   }

   public alc<dhp> V() {
      return this.cX;
   }

   public boolean W() {
      return this.cZ;
   }

   public void b(aro $$0) {
      this.a($$0.V(), $$0.T(), $$0.U(), $$0.W(), false);
   }

   public void a(alc<dhp> $$0, @Nullable jj $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.cY) && $$0.equals(this.cX);
         if ($$4 && !$$5) {
            this.a(wv.c("block.minecraft.set_spawn"));
         }

         this.cY = $$1;
         this.cX = $$0;
         this.da = $$2;
         this.cZ = $$3;
      } else {
         this.cY = null;
         this.cX = dhp.i;
         this.da = 0.0F;
         this.cZ = false;
      }
   }

   public kl X() {
      return this.cV;
   }

   public void a(kl $$0) {
      this.cV = $$0;
   }

   public aqw Y() {
      return this.cW;
   }

   public void a(aqw $$0) {
      this.cW = $$0;
   }

   @Override
   public void a(awj $$0, awl $$1, float $$2, float $$3) {
      this.f.b(new afs(md.b.e($$0), $$1, this.dA(), this.dC(), this.dG(), $$2, $$3, this.ae.g()));
   }

   @Override
   public cmn a(cxy $$0, boolean $$1, boolean $$2) {
      cmn $$3 = this.b($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dV().b($$3);
         cxy $$4 = $$3.f();
         if ($$2) {
            if (!$$4.f()) {
               this.a(awu.f.b($$4.h()), $$0.M());
            }

            this.a(awu.F);
         }

         return $$3;
      }
   }

   @Nullable
   private cmn b(cxy $$0, boolean $$1, boolean $$2) {
      if ($$0.f()) {
         return null;
      } else {
         double $$3 = this.dE() - 0.3F;
         cmn $$4 = new cmn(this.dV(), this.dA(), $$3, this.dG(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.ae.i() * 0.5F;
            float $$6 = this.ae.i() * (float) (Math.PI * 2);
            $$4.n((double)(-azk.a($$6) * $$5), 0.2F, (double)(azk.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = azk.a(this.dN() * (float) (Math.PI / 180.0));
            float $$9 = azk.b(this.dN() * (float) (Math.PI / 180.0));
            float $$10 = azk.a(this.dL() * (float) (Math.PI / 180.0));
            float $$11 = azk.b(this.dL() * (float) (Math.PI / 180.0));
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

   public asw Z() {
      return this.db;
   }

   public void a(arn $$0) {
      this.a((dhp)$$0);
      this.h.a($$0);
   }

   @Nullable
   private static dhm a(@Nullable tw $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? dhm.a($$0.h($$1)) : null;
   }

   private dhm b(@Nullable dhm $$0) {
      dhm $$1 = this.g.bd();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.g.u();
      }
   }

   @Override
   public void c(@Nullable tw $$0) {
      this.h.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void m(tw $$0) {
      $$0.a("playerGameType", this.h.b().a());
      dhm $$1 = this.h.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean aa() {
      return this.dc;
   }

   public boolean c(aro $$0) {
      return $$0 == this ? false : this.dc || $$0.dc;
   }

   @Override
   public boolean c(arn $$0, jj $$1) {
      return super.c($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cxy $$0) {
      ap.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cqh $$1 = this.gi();
      cxy $$2 = $$1.a($$0);
      this.bP.b($$1, $$1.j).ifPresent($$1x -> this.bP.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   @Override
   public void b(cxy $$0) {
      if (!this.gi().f($$0)) {
         this.a($$0, false);
      }
   }

   public boolean ab() {
      return this.dd;
   }

   @Override
   public Optional<cpn> ac() {
      return Optional.of(this.df);
   }

   public void b(boolean $$0) {
      this.de = $$0;
   }

   @Override
   public void a(cmn $$0) {
      super.a($$0);
      bvs $$1 = $$0.q();
      if ($$1 != null) {
         ap.S.a(this, $$0.f(), $$1);
      }
   }

   public void a(xm $$0) {
      this.dm = $$0;
   }

   @Nullable
   public xm ad() {
      return this.dm != null && this.dm.b() ? null : this.dm;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cj = (float)(azk.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dL());
      this.f.b(new ada(this));
   }

   @Override
   public boolean a(bvs $$0, boolean $$1) {
      if (super.a($$0, $$1)) {
         $$0.j(this);
         this.f.a(new bxe(this.dt(), fcu.c, 0.0F, 0.0F), bxf.k);
         if ($$0 instanceof bwr $$2) {
            this.g.ag().a($$2, this.f);
         }

         this.f.b(new afi($$0));
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void ae() {
      bvs $$0 = this.dk();
      super.ae();
      if ($$0 instanceof bwr $$1) {
         for (buw $$2 : $$1.eC()) {
            this.f.b(new aeh($$0.ar(), $$2.c()));
         }
      }

      if ($$0 != null) {
         this.f.b(new afi($$0));
      }
   }

   public agh b(arn $$0) {
      return new agh($$0.ai(), $$0.aj(), diu.a($$0.E()), this.h.b(), this.h.c(), $$0.ak(), $$0.D(), this.gH(), this.aC(), $$0.P());
   }

   @Override
   public void c(jj $$0) {
      this.dg = $$0;
   }

   public void af() {
      this.dg = null;
   }

   @Nullable
   public jj ag() {
      return this.dg;
   }

   @Override
   public fcu ah() {
      bvs $$0 = this.dk();
      return $$0 != null && $$0.cW() != this ? $$0.ah() : this.dh;
   }

   public void a(fcu $$0) {
      this.dh = $$0;
   }

   @Override
   protected float a(bvs $$0, float $$1, buh $$2) {
      return dej.a(this.y(), this.dZ(), $$0, $$2, $$1);
   }

   @Override
   public void a(cxu $$0, bwc $$1) {
      super.a($$0, $$1);
      this.b(awu.d.b($$0));
   }

   public cqg ai() {
      return this.di;
   }

   public void a(cqg $$0) {
      this.di = $$0;
   }

   public fcu aj() {
      float $$0 = this.di.c() == this.di.d() ? 0.0F : (this.di.c() ? 1.0F : -1.0F);
      float $$1 = this.di.a() == this.di.b() ? 0.0F : (this.di.a() ? 1.0F : -1.0F);
      return a(new fcu((double)$$0, 0.0, (double)$$1), 1.0F, this.dL());
   }

   public void a(crl $$0) {
      this.dj.add($$0);
   }

   public void b(crl $$0) {
      this.dj.remove($$0);
   }

   public Set<crl> ak() {
      return this.dj;
   }

   public long c(crl $$0) {
      if ($$0.dV() instanceof arn $$1) {
         dgw $$2 = $$0.dx();
         this.a($$0);
         $$1.i();
         return a($$1, $$2) - 1L;
      } else {
         return 0L;
      }
   }

   public static long a(arn $$0, dgw $$1) {
      $$0.m().a(aru.h, $$1, 2);
      return aru.h.d();
   }

   static record a(fcu a, float b) {
      public static aro.a a(fcu $$0, jj $$1) {
         return new aro.a($$0, b($$0, $$1));
      }

      private static float b(fcu $$0, jj $$1) {
         fcu $$2 = fcu.c($$1).d($$0).d();
         return (float)azk.d(azk.d($$2.f, $$2.d) * 180.0F / (float)Math.PI - 90.0);
      }
   }
}
