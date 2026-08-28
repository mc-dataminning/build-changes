import com.google.common.net.InetAddresses;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
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

public class arr extends cqy {
   private static final Logger cp = LogUtils.getLogger();
   private static final int cq = 32;
   private static final int cr = 10;
   private static final int cs = 25;
   public static final double a = 1.0;
   public static final double b = 3.0;
   public static final int c = 2;
   public static final String d = "ender_pearls";
   public static final String e = "ender_pearl_dimension";
   private static final byg ct = new byg(alg.b("creative_mode_block_range"), 0.5, byg.a.a);
   private static final byg cu = new byg(alg.b("creative_mode_entity_range"), 2.0, byg.a.a);
   public ast f;
   public final MinecraftServer g;
   public final ars h;
   private final alo cv;
   private final awt cw;
   private float cx = Float.MIN_VALUE;
   private int cy = Integer.MIN_VALUE;
   private int cz = Integer.MIN_VALUE;
   private int cA = Integer.MIN_VALUE;
   private int cB = Integer.MIN_VALUE;
   private int cC = Integer.MIN_VALUE;
   private float cD = -1.0E8F;
   private int cE = -99999999;
   private boolean cF = true;
   private int cG = -99999999;
   private cqv cH = cqv.a;
   private ari cI = ari.a;
   private boolean cJ = true;
   private long cK = af.c();
   @Nullable
   private bwd cL;
   private boolean cM;
   public boolean i;
   private final aws cN;
   @Nullable
   private fei cO;
   private int cP;
   private boolean cQ;
   private int cR = 2;
   private String cS = "en_us";
   @Nullable
   private fei cT;
   @Nullable
   private fei cU;
   @Nullable
   private fei cV;
   private jx cW = jx.a(0, 0, 0);
   private aqz cX = aqz.a;
   private alf<div> cY = div.i;
   @Nullable
   private iu cZ;
   private boolean da;
   private float db;
   private final asz dc;
   private boolean dd;
   private boolean de;
   private boolean df;
   private cqd dg = new cqd();
   @Nullable
   private iu dh;
   private fei di = fei.c;
   private cqw dj = cqw.b;
   private final Set<csc> dk = new HashSet<>();
   private final cvf dl = new cvf() {
      @Override
      public void a(cuq $$0, jn<cyy> $$1, cyy $$2, int[] $$3) {
         arr.this.f.b(new aco($$0.l, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cuq $$0, int $$1, cyy $$2) {
         arr.this.f.b(new acq($$0.l, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cuq $$0, cyy $$1) {
         arr.this.f.b(new afa($$1.v()));
      }

      @Override
      public void a(cuq $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cuq $$0, int $$1, int $$2) {
         arr.this.f.b(new acp($$0.l, $$1, $$2));
      }
   };
   private final cve dm = new cve() {
      @Override
      public void a(cuq $$0, int $$1, cyy $$2) {
         cwn $$3 = $$0.b($$1);
         if (!($$3 instanceof cwj)) {
            if ($$3.c == arr.this.gi()) {
               ap.f.a(arr.this, arr.this.gi(), $$2);
            }
         }
      }

      @Override
      public void a(cuq $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private xp dn;
   @Nullable
   public final Object j;
   private final eh do = new eh() {
      @Override
      public boolean t_() {
         return arr.this.y().O().c(dir.p);
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
      public void a(wy $$0) {
         arr.this.a($$0);
      }
   };
   private int dp;
   public boolean k;

   public arr(MinecraftServer $$0, arq $$1, GameProfile $$2, ara $$3) {
      super($$1, $$1.aa(), $$1.ab(), $$2);
      this.dc = $$0.a(this);
      this.h = $$0.b(this);
      this.cN = new aws(($$1x, $$2x) -> $$0.aI().a($$1x, $$2x));
      this.g = $$0;
      this.cw = $$0.ag().a((cqy)this);
      this.cv = $$0.ag().g(this);
      this.b(this.a($$1, $$1.aa()).c(), 0.0F, 0.0F);
      this.a($$3);
      this.j = null;
   }

   @Override
   public iu a(arq $$0, iu $$1) {
      fed $$2 = this.a(bxo.a).a(fei.c);
      iu $$3 = $$1;
      if ($$0.B_().g() && $$0.p().aZ().k() != dis.c) {
         int $$4 = Math.max(0, this.g.a($$0));
         int $$5 = azm.a($$0.A_().b((double)$$1.u(), (double)$$1.w()));
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
         int $$10 = azv.a().a($$8);

         for (int $$11 = 0; $$11 < $$8; $$11++) {
            int $$12 = ($$10 + $$9 * $$11) % $$8;
            int $$13 = $$12 % ($$4 * 2 + 1);
            int $$14 = $$12 / ($$4 * 2 + 1);
            int $$15 = $$1.u() + $$13 - $$4;
            int $$16 = $$1.w() + $$14 - $$4;

            try {
               $$3 = ark.a($$0, $$15, $$16);
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

   private boolean a(arq $$0, fed $$1) {
      return $$0.a(this, $$1, true);
   }

   private int t(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.dg = $$0.<cqd>a("warden_spawn_tracker", cqd.a).orElseGet(cqd::new);
      if ($$0.b("enteredNetherPosition", 10)) {
         tz $$1 = $$0.p("enteredNetherPosition");
         this.cU = new fei($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.i = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cN.a($$0.p("recipeBook"), $$0x -> this.g.aI().b($$0x).isPresent());
      }

      if (this.fQ()) {
         this.fR();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.cZ = new iu($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.da = $$0.q("SpawnForced");
         this.db = $$0.j("SpawnAngle");
         this.cY = $$0.<alf<div>>a("SpawnDimension", div.h).orElse(div.i);
      }

      this.df = $$0.q("spawn_extra_particles_on_fall");
      this.dh = $$0.<iu>a("raid_omen_position", iu.a).orElse(null);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("warden_spawn_tracker", cqd.a, this.dg);
      this.m($$0);
      $$0.a("seenCredits", this.i);
      if (this.cU != null) {
         tz $$1 = new tz();
         $$1.a("x", this.cU.d);
         $$1.a("y", this.cU.e);
         $$1.a("z", this.cU.f);
         $$0.a("enteredNetherPosition", $$1);
      }

      this.k($$0);
      $$0.a("recipeBook", this.cN.b());
      $$0.a("Dimension", this.dV().aj().a().toString());
      if (this.cZ != null) {
         $$0.a("SpawnX", this.cZ.u());
         $$0.a("SpawnY", this.cZ.v());
         $$0.a("SpawnZ", this.cZ.w());
         $$0.a("SpawnForced", this.da);
         $$0.a("SpawnAngle", this.db);
         $$0.a("SpawnDimension", div.h, this.cY);
      }

      $$0.a("spawn_extra_particles_on_fall", this.df);
      if (this.dh != null) {
         $$0.a("raid_omen_position", iu.a, this.dh);
      }

      this.l($$0);
   }

   private void k(tz $$0) {
      bwd $$1 = this.df();
      bwd $$2 = this.dk();
      if ($$2 != null && $$1 != this && $$1.de()) {
         tz $$3 = new tz();
         tz $$4 = new tz();
         $$1.e($$4);
         $$3.a("Attach", $$2.cG());
         $$3.a("Entity", $$4);
         $$0.a("RootVehicle", $$3);
      }
   }

   public void a(Optional<tz> $$0) {
      if ($$0.isPresent() && $$0.get().b("RootVehicle", 10) && this.dV() instanceof arq $$1) {
         tz $$2 = $$0.get().p("RootVehicle");
         bwd $$3 = bwm.a($$2.p("Entity"), $$1, bwl.r, $$1x -> !$$1.c($$1x) ? null : $$1x);
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
            for (bwd $$6 : $$3.dc()) {
               if ($$6.cG().equals($$4)) {
                  this.a($$6, true);
                  break;
               }
            }
         }

         if (!this.bZ()) {
            cp.warn("Couldn't reattach entity to player");
            $$3.at();

            for (bwd $$7 : $$3.dc()) {
               $$7.at();
            }
         }
      }
   }

   private void l(tz $$0) {
      if (!this.dk.isEmpty()) {
         uf $$1 = new uf();

         for (csc $$2 : this.dk) {
            if ($$2.dQ()) {
               cp.warn("Trying to save removed ender pearl, skipping");
            } else {
               tz $$3 = new tz();
               $$2.e($$3);
               $$3.a("ender_pearl_dimension", div.h, $$2.dV().aj());
               $$1.add($$3);
            }
         }

         $$0.a("ender_pearls", $$1);
      }
   }

   public void b(Optional<tz> $$0) {
      if ($$0.isPresent() && $$0.get().b("ender_pearls", 9) && $$0.get().c("ender_pearls") instanceof uf $$2) {
         $$2.forEach($$0x -> {
            if ($$0x instanceof tz $$1 && $$1.e("ender_pearl_dimension")) {
               Optional<alf<div>> $$2x = $$1.a("ender_pearl_dimension", div.h);
               if ($$2x.isEmpty()) {
                  cp.warn("No dimension defined for ender pearl, skipping");
                  return;
               }

               arq $$3 = this.dV().p().a($$2x.get());
               if ($$3 != null) {
                  bwd $$4 = bwm.a($$1, $$3, bwl.r, $$1x -> !$$3.c($$1x) ? null : $$1x);
                  if ($$4 != null) {
                     a($$3, $$4.dx());
                  } else {
                     cp.warn("Failed to spawn player ender pearl in level ({}), skipping", $$2x.get());
                  }
               } else {
                  cp.warn("Trying to load ender pearl without level ({}) being loaded, skipping", $$2x.get());
               }
            }
         });
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gs();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.cg = azm.a((float)$$0 / $$1, 0.0F, $$2);
      this.cG = -1;
   }

   public void b(int $$0) {
      this.ce = $$0;
      this.cG = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cG = -1;
   }

   @Override
   public void a(cyy $$0, int $$1) {
      super.a($$0, $$1);
      this.cG = -1;
   }

   private void a(cuq $$0) {
      $$0.a(this.dm);
      $$0.a(this.dl);
   }

   public void d() {
      this.a(this.bP);
   }

   @Override
   public void e_() {
      super.e_();
      this.f.b(ady.a);
   }

   @Override
   public void J_() {
      super.J_();
      this.f.b(new adx(this.eR()));
   }

   @Override
   public void a(dzz $$0) {
      ap.e.a(this, $$0);
   }

   @Override
   protected cyv g() {
      return new czw(this);
   }

   @Override
   public void h() {
      this.gJ();
      this.h.a();
      this.dg.a();
      if (this.aj > 0) {
         this.aj--;
      }

      this.bQ.d();
      if (!this.bQ.b(this)) {
         this.p();
         this.bQ = this.bP;
      }

      bwd $$0 = this.L();
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
      if (this.cO != null) {
         ap.v.a(this, this.cO, this.af - this.cP);
      }

      this.l();
      this.m();
      this.gQ();
      this.cv.a(this, true);
   }

   private void gQ() {
      bye $$0 = this.g(byi.g);
      if ($$0 != null) {
         if (this.b()) {
            $$0.a(ct);
         } else {
            $$0.e(ct);
         }
      }

      bye $$1 = this.g(byi.j);
      if ($$1 != null) {
         if (this.b()) {
            $$1.a(cu);
         } else {
            $$1.e(cu);
         }
      }
   }

   public void i() {
      try {
         if (!this.U_() || !this.do()) {
            super.h();
         }

         for (int $$0 = 0; $$0 < this.gi().b(); $$0++) {
            cyy $$1 = this.gi().a($$0);
            if (!$$1.f()) {
               this.j($$1);
            }
         }

         if (this.eF() != this.cD || this.cE != this.bR.a() || this.bR.c() == 0.0F != this.cF) {
            this.f.b(new afi(this.eF(), this.bR.a(), this.bR.c()));
            this.cD = this.eF();
            this.cE = this.bR.a();
            this.cF = this.bR.c() == 0.0F;
         }

         if (this.eF() + this.fv() != this.cx) {
            this.cx = this.eF() + this.fv();
            this.a(ffq.h, azm.f(this.cx));
         }

         if (this.bR.a() != this.cy) {
            this.cy = this.bR.a();
            this.a(ffq.i, azm.f((float)this.cy));
         }

         if (this.ct() != this.cz) {
            this.cz = this.ct();
            this.a(ffq.j, azm.f((float)this.cz));
         }

         if (this.eQ() != this.cA) {
            this.cA = this.eQ();
            this.a(ffq.k, azm.f((float)this.cA));
         }

         if (this.cf != this.cC) {
            this.cC = this.cf;
            this.a(ffq.l, azm.f((float)this.cC));
         }

         if (this.ce != this.cB) {
            this.cB = this.ce;
            this.a(ffq.m, azm.f((float)this.cB));
         }

         if (this.cf != this.cG) {
            this.cG = this.cf;
            this.f.b(new afh(this.cg, this.cf, this.ce));
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

   private void j(cyy $$0) {
      exz $$1 = $$0.a(kj.M);
      eyb $$2 = czl.a($$1, this.dV());
      if ($$2 != null) {
         zf<?> $$3 = $$2.a($$1, this);
         if ($$3 != null) {
            this.f.b($$3);
         }
      }
   }

   @Override
   protected void j() {
      if (this.dV().an() == bty.a && this.y().O().c(dir.k)) {
         if (this.af % 20 == 0) {
            if (this.eF() < this.eT()) {
               this.c(1.0F);
            }

            float $$0 = this.bR.c();
            if ($$0 < 20.0F) {
               this.bR.b($$0 + 1.0F);
            }
         }

         if (this.af % 10 == 0 && this.bR.b()) {
            this.bR.a(this.bR.a() + 1);
         }
      }
   }

   @Override
   public void k() {
      if (this.eF() > 0.0F && this.cT != null) {
         ap.X.a(this, this.cT);
      }

      this.cT = null;
      super.k();
   }

   public void l() {
      if (this.Z > 0.0 && this.cT == null) {
         this.cT = this.dt();
         if (this.cl != null && this.cl.e <= this.cT.e) {
            ap.ae.a(this, this.cl, this.cm);
         }
      }
   }

   @Override
   public void m() {
      if (this.dk() != null && this.dk().bw()) {
         if (this.cV == null) {
            this.cV = this.dt();
         } else {
            ap.Y.a(this, this.cV);
         }
      }

      if (this.cV != null && (this.dk() == null || !this.dk().bw())) {
         this.cV = null;
      }
   }

   private void a(ffq $$0, int $$1) {
      this.gy().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(bus $$0) {
      this.a(eez.p);
      boolean $$1 = this.y().O().c(dir.n);
      if ($$1) {
         wy $$2 = this.eR().a();
         this.f.a(new adz(this.ar(), $$2), wf.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            wy $$3x = wy.a("death.attack.message_too_long", wy.b($$2x).a(n.o));
            wy $$4x = wy.a("death.attack.even_more_magic", this.m_()).a($$1xx -> $$1xx.a(new xe.e($$3x)));
            return new adz(this.ar(), $$4x);
         }));
         ffp $$3 = this.cr();
         if ($$3 == null || $$3.l() == ffp.b.a) {
            this.g.ag().a($$2, false);
         } else if ($$3.l() == ffp.b.c) {
            this.g.ag().a(this, $$2);
         } else if ($$3.l() == ffp.b.d) {
            this.g.ag().b(this, $$2);
         }
      } else {
         this.f.b(new adz(this.ar(), wx.a));
      }

      this.gx();
      if (this.y().O().c(dir.O)) {
         this.gR();
      }

      if (!this.U_()) {
         this.b(this.y(), $$0);
      }

      this.gy().a(ffq.e, this, ffl::b);
      bxc $$4 = this.eS();
      if ($$4 != null) {
         this.b(awx.h.b($$4.aq()));
         $$4.a(this, $$0);
         this.e($$4);
      }

      this.dV().a(this, (byte)3);
      this.a(awx.N);
      this.a(awx.i.b(awx.m));
      this.a(awx.i.b(awx.n));
      this.aH();
      this.k(0);
      this.c(false);
      this.eR().c();
      this.c(Optional.of(jd.a(this.dV().aj(), this.dv())));
      this.v(false);
   }

   private void gR() {
      fed $$0 = new fed(this.dv()).c(32.0, 10.0, 32.0);
      this.dV().a(bxe.class, $$0, bwk.f).stream().filter($$0x -> $$0x instanceof bxh).forEach($$0x -> ((bxh)$$0x).a_(this.y(), this));
   }

   @Override
   public void a(bwd $$0, bus $$1) {
      if ($$0 != this) {
         super.a($$0, $$1);
         this.gy().a(ffq.g, this, ffl::b);
         if ($$0 instanceof cqy) {
            this.a(awx.Q);
            this.gy().a(ffq.f, this, ffl::b);
         } else {
            this.a(awx.O);
         }

         this.a(this, $$0, ffq.n);
         this.a($$0, this, ffq.o);
         ap.c.a(this, $$0, $$1);
      }
   }

   private void a(ffm $$0, ffm $$1, ffq[] $$2) {
      ffi $$3 = this.gy().e($$1.cI());
      if ($$3 != null) {
         int $$4 = $$3.o().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gy().a($$2[$$4], $$0, ffl::b);
         }
      }
   }

   @Override
   public boolean a(arq $$0, bus $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         bwd $$3 = $$1.d();
         if ($$3 instanceof cqy $$4 && !this.a($$4)) {
            return false;
         }

         if ($$3 instanceof crf $$5 && $$5.q() instanceof cqy $$7 && !this.a($$7)) {
            return false;
         }

         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(cqy $$0) {
      return !this.gS() ? false : super.a($$0);
   }

   private boolean gS() {
      return this.g.ac();
   }

   public exg a(boolean $$0, exg.a $$1) {
      iu $$2 = this.T();
      float $$3 = this.U();
      boolean $$4 = this.W();
      arq $$5 = this.g.a(this.V());
      if ($$5 != null && $$2 != null) {
         Optional<arr.a> $$6 = a($$5, $$2, $$3, $$4, $$0);
         if ($$6.isPresent()) {
            arr.a $$7 = $$6.get();
            return new exg($$5, $$7.a(), fei.c, $$7.b(), 0.0F, $$1);
         } else {
            return exg.a(this.g.J(), this, $$1);
         }
      } else {
         return new exg(this.g.J(), this, $$1);
      }
   }

   private static Optional<arr.a> a(arq $$0, iu $$1, float $$2, boolean $$3, boolean $$4) {
      dzz $$5 = $$0.a_($$1);
      dma $$6 = $$5.b();
      if ($$6 instanceof dso && ($$3 || $$5.c(dso.d) > 0) && dso.a($$0)) {
         Optional<fei> $$7 = dso.a(bwm.bS, $$0, $$1);
         if (!$$3 && $$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.b(dso.d, Integer.valueOf($$5.c(dso.d) - 1)), 3);
         }

         return $$7.map($$1x -> arr.a.a($$1x, $$1));
      } else if ($$6 instanceof dlt && dlt.a($$0)) {
         return dlt.a(bwm.bS, $$0, $$1, $$5.c(dlt.e), $$2).map($$1x -> arr.a.a($$1x, $$1));
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dzz $$9 = $$0.a_($$1.d());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new arr.a(new fei((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5), $$2)) : Optional.empty();
      }
   }

   @Override
   public void n() {
      this.ao();
      this.y().a(this, bwd.e.e);
      if (!this.k) {
         this.k = true;
         this.f.b(new adb(adb.f, 0.0F));
         this.i = true;
      }
   }

   @Nullable
   public arr a(exg $$0) {
      if (this.dQ()) {
         return null;
      } else {
         if ($$0.g()) {
            this.f.b(new adb(adb.b, 0.0F));
         }

         arq $$1 = $$0.b();
         arq $$2 = this.y();
         alf<div> $$3 = $$2.aj();
         if (!$$0.h()) {
            this.ae();
         }

         if ($$1.aj() == $$3) {
            this.f.a(bxp.a($$0), $$0.i());
            this.f.l();
            $$0.j().onTransition(this);
            return this;
         } else {
            this.cM = true;
            eyj $$4 = $$1.y_();
            this.f.b(new aem(this.b($$1), (byte)3));
            this.f.b(new acg($$4.q(), $$4.r()));
            avq $$5 = this.g.ag();
            $$5.e(this);
            $$2.a(this, bwd.e.e);
            this.dS();
            bqm $$6 = bql.a();
            $$6.a("moving");
            if ($$3 == div.i && $$1.aj() == div.j) {
               this.cU = this.dt();
            }

            $$6.c();
            $$6.a("placing");
            this.a($$1);
            this.f.a(bxp.a($$0), $$0.i());
            this.f.l();
            $$1.d(this);
            $$6.c();
            this.g($$2);
            this.fE();
            this.f.b(new adv(this.gj()));
            $$5.a(this, $$1);
            $$5.f(this);
            $$5.d(this);
            $$0.j().onTransition(this);
            this.cG = -1;
            this.cD = -1.0F;
            this.cE = -1;
            return this;
         }
      }
   }

   @Override
   public void a(float $$0, float $$1) {
      this.f.b(new aee($$0, $$1));
   }

   private void g(arq $$0) {
      alf<div> $$1 = $$0.aj();
      alf<div> $$2 = this.dV().aj();
      ap.w.a(this, $$1, $$2);
      if ($$1 == div.j && $$2 == div.i && this.cU != null) {
         ap.D.a(this, this.cU);
      }

      if ($$2 != div.j) {
         this.cU = null;
      }
   }

   @Override
   public boolean a(arr $$0) {
      if ($$0.U_()) {
         return this.L() == this;
      } else {
         return this.U_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bwd $$0, int $$1) {
      super.a($$0, $$1);
      this.bQ.d();
   }

   @Override
   public Either<cqy.a, bau> a(iu $$0) {
      ja $$1 = this.dV().a_($$0).c(dqa.e);
      if (this.fQ() || !this.bK()) {
         return Either.left(cqy.a.e);
      } else if (!this.dV().B_().j()) {
         return Either.left(cqy.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cqy.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cqy.a.d);
      } else {
         this.a(this.dV().aj(), $$0, this.dL(), false, true);
         if (this.dV().V()) {
            return Either.left(cqy.a.b);
         } else {
            if (!this.b()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               fei $$4 = fei.c($$0);
               List<cnz> $$5 = this.dV()
                  .a(
                     cnz.class,
                     new fed($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0),
                     $$0x -> $$0x.a(this.y(), this)
                  );
               if (!$$5.isEmpty()) {
                  return Either.left(cqy.a.f);
               }
            }

            Either<cqy.a, bau> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(awx.ap);
               ap.r.a(this);
            });
            if (!this.y().e()) {
               this.a(wy.c("sleep.not_possible"), true);
            }

            ((arq)this.dV()).f();
            return $$6;
         }
      }
   }

   @Override
   public void b(iu $$0) {
      this.a(awx.i.b(awx.n));
      super.b($$0);
   }

   private boolean a(iu $$0, ja $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(iu $$0) {
      fei $$1 = fei.c($$0);
      return Math.abs(this.dA() - $$1.a()) <= 3.0 && Math.abs(this.dC() - $$1.b()) <= 2.0 && Math.abs(this.dG() - $$1.c()) <= 3.0;
   }

   private boolean b(iu $$0, ja $$1) {
      iu $$2 = $$0.d();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fQ()) {
         this.y().m().a(this, new abw(this, 2));
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
   public boolean a(arq $$0, bus $$1) {
      return super.a($$0, $$1) || this.Q() && !$$1.a(buv.m) || !this.gI();
   }

   @Override
   protected void b(arq $$0, iu $$1) {
      if (!this.U_()) {
         super.b($$0, $$1);
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, dzz $$2, iu $$3) {
      if (this.df && $$1 && this.Z > 0.0) {
         fei $$4 = $$3.b().b(0.0, 0.5, 0.0);
         int $$5 = (int)azm.a(50.0 * this.Z, 0.0, 200.0);
         this.y().a(new lp(lx.b, $$2), $$4.d, $$4.e, $$4.f, $$5, 0.3F, 0.3F, 0.3F, 0.15F);
         this.df = false;
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b_(@Nullable bwd $$0) {
      super.b_($$0);
      this.cl = this.dt();
      this.cm = $$0;
      this.w($$0 != null && $$0.aq() == bwm.bH);
   }

   @Override
   protected void o() {
      if (this.dV().u().i()) {
         super.o();
      }
   }

   @Override
   public void a(dyl $$0, boolean $$1) {
      this.f.b(new acc(this.dV(), $$0.aw_()));
      this.f.b(new adt($$0.aw_(), $$1));
   }

   private void gT() {
      this.dp = this.dp % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bud $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.bQ != this.bP) {
            this.p();
         }

         this.gT();
         cuq $$1 = $$0.createMenu(this.dp, this.gi(), this);
         if ($$1 == null) {
            if (this.U_()) {
               this.a(wy.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.f.b(new ads($$1.l, $$1.a(), $$0.m_()));
            this.a($$1);
            this.bQ = $$1;
            return OptionalInt.of(this.dp);
         }
      }
   }

   @Override
   public void a(int $$0, dhu $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.f.b(new adn($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(cld $$0, btu $$1) {
      if (this.bQ != this.bP) {
         this.p();
      }

      this.gT();
      int $$2 = $$0.aa_();
      this.f.b(new adc(this.dp, $$2, $$0.ar()));
      this.bQ = new cvs(this.dp, this.gi(), $$1, $$0, $$2);
      this.a(this.bQ);
   }

   @Override
   public void a(cyy $$0, bua $$1) {
      if ($$0.c(kj.V)) {
         if (dci.a($$0, this.A(), this)) {
            this.bQ.d();
         }

         this.f.b(new adr($$1));
      }
   }

   @Override
   public void a(dxi $$0) {
      this.f.b(aca.a($$0, dwx::e));
   }

   @Override
   public void p() {
      this.f.b(new acn(this.bQ.l));
      this.q();
   }

   @Override
   public void q() {
      this.bQ.a(this);
      this.bP.a(this.bQ);
      this.bQ = this.bP;
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
         } else if (this.a(axh.a)) {
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
         } else if (this.d_()) {
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
         } else if (this.fI()) {
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
         bwd $$4 = this.dk();
         if ($$4 instanceof ctk) {
            this.a(awx.x, $$3);
         } else if ($$4 instanceof cti) {
            this.a(awx.y, $$3);
         } else if ($$4 instanceof cjl) {
            this.a(awx.z, $$3);
         } else if ($$4 instanceof cld) {
            this.a(awx.A, $$3);
         } else if ($$4 instanceof com) {
            this.a(awx.D, $$3);
         }
      }
   }

   private static boolean r(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(awu<?> $$0, int $$1) {
      this.cw.b(this, $$0, $$1);
      this.gy().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(awu<?> $$0) {
      this.cw.a(this, $$0, 0);
      this.gy().a($$0, this, ffl::c);
   }

   @Override
   public int a(Collection<ddu<?>> $$0) {
      return this.cN.a($$0, this);
   }

   @Override
   public void a(ddu<?> $$0, List<cyy> $$1) {
      ap.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<alf<ddp<?>>> $$0) {
      List<ddu<?>> $$1 = $$0.stream().flatMap($$0x -> this.g.aI().b($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<ddu<?>> $$0) {
      return this.cN.b($$0, this);
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
      this.cG = -1;
   }

   public void t() {
      this.cQ = true;
      this.bO();
      if (this.fQ()) {
         this.a(true, false);
      }
   }

   public boolean u() {
      return this.cQ;
   }

   @Override
   public void v() {
      this.cD = -1.0E8F;
   }

   @Override
   public void a(wy $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void K_() {
      if (!this.bm.f() && this.fy()) {
         this.f.b(new acx(this, (byte)9));
         super.K_();
      }
   }

   @Override
   public void a(eu.a $$0, fei $$1) {
      super.a($$0, $$1);
      this.f.b(new aec($$0, $$1.d, $$1.e, $$1.f));
   }

   public void a(eu.a $$0, bwd $$1, eu.a $$2) {
      fei $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.f.b(new aec($$0, $$1, $$2));
   }

   public void a(arr $$0, boolean $$1) {
      this.dg = $$0.dg;
      this.dn = $$0.dn;
      this.h.a($$0.h.b(), $$0.h.c());
      this.x();
      if ($$1) {
         this.eZ().b($$0.eZ());
         this.eZ().c($$0.eZ());
         this.d($$0.eF());
         this.bR = $$0.bR;

         for (bvh $$2 : $$0.eC()) {
            this.a(new bvh($$2));
         }

         this.gi().a($$0.gi());
         this.ce = $$0.ce;
         this.cf = $$0.cf;
         this.cg = $$0.cg;
         this.q($$0.gc());
         this.as = $$0.as;
      } else {
         this.eZ().b($$0.eZ());
         this.d(this.eT());
         if (this.y().O().c(dir.d) || $$0.U_()) {
            this.gi().a($$0.gi());
            this.ce = $$0.ce;
            this.cf = $$0.cf;
            this.cg = $$0.cg;
            this.q($$0.gc());
         }
      }

      this.ch = $$0.ch;
      this.bO = $$0.bO;
      this.au().a(bJ, $$0.au().a(bJ));
      this.cG = -1;
      this.cD = -1.0F;
      this.cE = -1;
      this.cN.a($$0.cN);
      this.i = $$0.i;
      this.cU = $$0.cU;
      this.cX = $$0.cX;
      this.i($$0.gA());
      this.j($$0.gB());
      this.c($$0.gH());
   }

   @Override
   protected void a(bvh $$0, @Nullable bwd $$1) {
      super.a($$0, $$1);
      this.f.b(new agi(this.ar(), $$0, true));
      if ($$0.a(bvj.y)) {
         this.cP = this.af;
         this.cO = this.dt();
      }

      ap.B.a(this, $$1);
   }

   @Override
   protected void a(bvh $$0, boolean $$1, @Nullable bwd $$2) {
      super.a($$0, $$1, $$2);
      this.f.b(new agi(this.ar(), $$0, false));
      ap.B.a(this, $$2);
   }

   @Override
   protected void c(Collection<bvh> $$0) {
      super.c($$0);

      for (bvh $$1 : $$0) {
         this.f.b(new aek(this.ar(), $$1.c()));
         if ($$1.a(bvj.y)) {
            this.cO = null;
         }
      }

      ap.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.f.a(new bxp(new fei($$0, $$1, $$2), fei.c, 0.0F, 0.0F), bxq.a(bxq.l, bxq.k));
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.f.a(new bxp(new fei($$0, $$1, $$2), fei.c, 0.0F, 0.0F), bxq.j);
   }

   @Override
   public boolean a(arq $$0, double $$1, double $$2, double $$3, Set<bxq> $$4, float $$5, float $$6, boolean $$7) {
      if (this.fQ()) {
         this.a(true, true);
      }

      if ($$7) {
         this.d(this);
      }

      boolean $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$8) {
         this.r($$4.contains(bxq.d) ? this.cA() + $$5 : $$5);
      }

      return $$8;
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      super.e($$0, $$1, $$2);
      this.f.l();
   }

   @Override
   public void b(bwd $$0) {
      this.y().m().a(this, new abw($$0, 4));
   }

   @Override
   public void c(bwd $$0) {
      this.y().m().a(this, new abw($$0, 5));
   }

   @Override
   public void x() {
      if (this.f != null) {
         this.f.b(new adv(this.gj()));
         this.K();
      }
   }

   public arq y() {
      return (arq)this.dV();
   }

   public boolean a(dis $$0) {
      boolean $$1 = this.U_();
      if (!this.h.a($$0)) {
         return false;
      } else {
         this.f.b(new adb(adb.e, (float)$$0.a()));
         if ($$0 == dis.d) {
            this.gx();
            this.bP();
            dfn.a(this);
         } else {
            this.d(this);
            if ($$1) {
               dfn.a(this.y(), this);
            }
         }

         this.x();
         this.fw();
         return true;
      }
   }

   @Override
   public boolean U_() {
      return this.h.b() == dis.d;
   }

   @Override
   public boolean b() {
      return this.h.b() == dis.b;
   }

   public eh z() {
      return this.do;
   }

   public ei A() {
      return new ei(this.z(), this.dt(), this.bU(), this.y(), this.G(), this.al().getString(), this.m_(), this.g, this);
   }

   public void a(wy $$0) {
      this.b($$0, false);
   }

   public void b(wy $$0, boolean $$1) {
      if (this.x($$1)) {
         this.f.a(new afy($$0, $$1), wf.a(() -> {
            if (this.x(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               wy $$3 = wy.b($$2).a(n.o);
               return new afy(wy.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(xn $$0, boolean $$1, wu.a $$2) {
      if (this.gU()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String B() {
      return this.f.m() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(ara $$0) {
      this.cS = $$0.b();
      this.cR = $$0.c();
      this.cH = $$0.d();
      this.cJ = $$0.e();
      this.dd = $$0.h();
      this.de = $$0.i();
      this.cI = $$0.j();
      this.au().a(bJ, (byte)$$0.f());
      this.au().a(bK, (byte)$$0.g().b());
   }

   public ara C() {
      int $$0 = this.au().a(bJ);
      bwv $$1 = bwv.d.apply(this.au().a(bK));
      return new ara(this.cS, this.cR, this.cH, this.cJ, $$0, $$1, this.dd, this.de, this.cI);
   }

   public boolean D() {
      return this.cJ;
   }

   public cqv E() {
      return this.cH;
   }

   private boolean x(boolean $$0) {
      return this.cH == cqv.c ? $$0 : true;
   }

   private boolean gU() {
      return this.cH == cqv.a;
   }

   public int F() {
      return this.cR;
   }

   public void a(akd $$0) {
      this.f.b(new aeq($$0.a(), $$0.d().map(akd.a::a)));
   }

   @Override
   public int G() {
      return this.g.c(this.gh());
   }

   public void H() {
      this.cK = af.c();
   }

   public awt I() {
      return this.cw;
   }

   public aws J() {
      return this.cN;
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

   public bwd L() {
      return (bwd)(this.cL == null ? this : this.cL);
   }

   @Override
   public void d(@Nullable bwd $$0) {
      bwd $$1 = this.L();
      this.cL = (bwd)($$0 == null ? this : $$0);
      if ($$1 != this.cL) {
         if (this.cL.dV() instanceof arq $$2) {
            this.a($$2, this.cL.dA(), this.cL.dC(), this.cL.dG(), Set.of(), this.dL(), this.dN(), false);
         }

         if ($$0 != null) {
            this.y().m().a(this);
         }

         this.f.b(new aex(this.cL));
         this.f.l();
      }
   }

   @Override
   protected void M() {
      if (!this.cM) {
         super.M();
      }
   }

   @Override
   public void e(bwd $$0) {
      if (this.h.b() == dis.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long N() {
      return this.cK;
   }

   @Nullable
   public wy O() {
      return null;
   }

   public int P() {
      return 0;
   }

   @Override
   public void a(bua $$0) {
      super.a($$0);
      this.gD();
   }

   public boolean Q() {
      return this.cM;
   }

   public void R() {
      this.cM = false;
   }

   public alo S() {
      return this.cv;
   }

   @Nullable
   public iu T() {
      return this.cZ;
   }

   public float U() {
      return this.db;
   }

   public alf<div> V() {
      return this.cY;
   }

   public boolean W() {
      return this.da;
   }

   public void b(arr $$0) {
      this.a($$0.V(), $$0.T(), $$0.U(), $$0.W(), false);
   }

   public void a(alf<div> $$0, @Nullable iu $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.cZ) && $$0.equals(this.cY);
         if ($$4 && !$$5) {
            this.a(wy.c("block.minecraft.set_spawn"));
         }

         this.cZ = $$1;
         this.cY = $$0;
         this.db = $$2;
         this.da = $$3;
      } else {
         this.cZ = null;
         this.cY = div.i;
         this.db = 0.0F;
         this.da = false;
      }
   }

   public jx X() {
      return this.cW;
   }

   public void a(jx $$0) {
      this.cW = $$0;
   }

   public aqz Y() {
      return this.cX;
   }

   public void a(aqz $$0) {
      this.cX = $$0;
   }

   @Override
   public void a(awm $$0, awo $$1, float $$2, float $$3) {
      this.f.b(new afv(mf.b.e($$0), $$1, this.dA(), this.dC(), this.dG(), $$2, $$3, this.ae.g()));
   }

   @Override
   public cnd a(cyy $$0, boolean $$1, boolean $$2) {
      cnd $$3 = this.b($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dV().b($$3);
         cyy $$4 = $$3.f();
         if ($$2) {
            if (!$$4.f()) {
               this.a(awx.f.b($$4.h()), $$0.M());
            }

            this.a(awx.F);
         }

         return $$3;
      }
   }

   @Nullable
   private cnd b(cyy $$0, boolean $$1, boolean $$2) {
      if ($$0.f()) {
         return null;
      } else {
         double $$3 = this.dE() - 0.3F;
         cnd $$4 = new cnd(this.dV(), this.dA(), $$3, this.dG(), $$0);
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

   public asz Z() {
      return this.dc;
   }

   public void a(arq $$0) {
      this.a((div)$$0);
      this.h.a($$0);
   }

   @Nullable
   private static dis a(@Nullable tz $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? dis.a($$0.h($$1)) : null;
   }

   private dis b(@Nullable dis $$0) {
      dis $$1 = this.g.bd();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.g.u();
      }
   }

   @Override
   public void c(@Nullable tz $$0) {
      this.h.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void m(tz $$0) {
      $$0.a("playerGameType", this.h.b().a());
      dis $$1 = this.h.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean aa() {
      return this.dd;
   }

   public boolean c(arr $$0) {
      return $$0 == this ? false : this.dd || $$0.dd;
   }

   @Override
   public boolean c(arq $$0, iu $$1) {
      return super.c($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cyy $$0) {
      ap.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cqx $$1 = this.gi();
      cyy $$2 = $$1.a($$0);
      this.bQ.b($$1, $$1.j).ifPresent($$1x -> this.bQ.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   @Override
   public void b(cyy $$0) {
      if (!this.gi().f($$0)) {
         this.a($$0, false);
      }
   }

   public boolean ab() {
      return this.de;
   }

   @Override
   public Optional<cqd> ac() {
      return Optional.of(this.dg);
   }

   public void b(boolean $$0) {
      this.df = $$0;
   }

   @Override
   public void a(cnd $$0) {
      super.a($$0);
      bwd $$1 = $$0.q();
      if ($$1 != null) {
         ap.S.a(this, $$0.f(), $$1);
      }
   }

   public void a(xp $$0) {
      this.dn = $$0;
   }

   @Nullable
   public xp ad() {
      return this.dn != null && this.dn.b() ? null : this.dn;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.ck = (float)(azm.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dL());
      this.f.b(new add(this));
   }

   @Override
   public boolean a(bwd $$0, boolean $$1) {
      if (super.a($$0, $$1)) {
         $$0.j(this);
         this.f.a(new bxp(this.dt(), fei.c, 0.0F, 0.0F), bxq.k);
         if ($$0 instanceof bxc $$2) {
            this.g.ag().a($$2, this.f);
         }

         this.f.b(new afl($$0));
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void ae() {
      bwd $$0 = this.dk();
      super.ae();
      if ($$0 instanceof bxc $$1) {
         for (bvh $$2 : $$1.eC()) {
            this.f.b(new aek($$0.ar(), $$2.c()));
         }
      }

      if ($$0 != null) {
         this.f.b(new afl($$0));
      }
   }

   public agk b(arq $$0) {
      return new agk($$0.ai(), $$0.aj(), dka.a($$0.E()), this.h.b(), this.h.c(), $$0.ak(), $$0.D(), this.gH(), this.aC(), $$0.P());
   }

   @Override
   public void c(iu $$0) {
      this.dh = $$0;
   }

   public void af() {
      this.dh = null;
   }

   @Nullable
   public iu ag() {
      return this.dh;
   }

   @Override
   public fei ah() {
      bwd $$0 = this.dk();
      return $$0 != null && $$0.cW() != this ? $$0.ah() : this.di;
   }

   public void a(fei $$0) {
      this.di = $$0;
   }

   @Override
   protected float a(bwd $$0, float $$1, bus $$2) {
      return dfn.a(this.y(), this.dZ(), $$0, $$2, $$1);
   }

   @Override
   public void a(cyu $$0, bwn $$1) {
      super.a($$0, $$1);
      this.b(awx.d.b($$0));
   }

   public cqw ai() {
      return this.dj;
   }

   public void a(cqw $$0) {
      this.dj = $$0;
   }

   public fei aj() {
      float $$0 = this.dj.c() == this.dj.d() ? 0.0F : (this.dj.c() ? 1.0F : -1.0F);
      float $$1 = this.dj.a() == this.dj.b() ? 0.0F : (this.dj.a() ? 1.0F : -1.0F);
      return a(new fei((double)$$0, 0.0, (double)$$1), 1.0F, this.dL());
   }

   public void a(csc $$0) {
      this.dk.add($$0);
   }

   public void b(csc $$0) {
      this.dk.remove($$0);
   }

   public Set<csc> ak() {
      return this.dk;
   }

   public long c(csc $$0) {
      if ($$0.dV() instanceof arq $$1) {
         dic $$2 = $$0.dx();
         this.a($$0);
         $$1.i();
         return a($$1, $$2) - 1L;
      } else {
         return 0L;
      }
   }

   public static long a(arq $$0, dic $$1) {
      $$0.m().a(arx.h, $$1, 2);
      return arx.h.d();
   }

   static record a(fei a, float b) {
      public static arr.a a(fei $$0, iu $$1) {
         return new arr.a($$0, b($$0, $$1));
      }

      private static float b(fei $$0, iu $$1) {
         fei $$2 = fei.c($$1).d($$0).d();
         return (float)azm.d(azm.d($$2.f, $$2.d) * 180.0F / (float)Math.PI - 90.0);
      }
   }
}
