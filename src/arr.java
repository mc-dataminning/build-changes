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

public class arr extends crc {
   private static final Logger cq = LogUtils.getLogger();
   private static final int cr = 32;
   private static final int cs = 10;
   private static final int ct = 25;
   public static final double a = 1.0;
   public static final double b = 3.0;
   public static final int c = 2;
   public static final String d = "ender_pearls";
   public static final String e = "ender_pearl_dimension";
   private static final byi cu = new byi(alg.b("creative_mode_block_range"), 0.5, byi.a.a);
   private static final byi cv = new byi(alg.b("creative_mode_entity_range"), 2.0, byi.a.a);
   public ast f;
   public final MinecraftServer g;
   public final ars h;
   private final alo cw;
   private final awt cx;
   private float cy = Float.MIN_VALUE;
   private int cz = Integer.MIN_VALUE;
   private int cA = Integer.MIN_VALUE;
   private int cB = Integer.MIN_VALUE;
   private int cC = Integer.MIN_VALUE;
   private int cD = Integer.MIN_VALUE;
   private float cE = -1.0E8F;
   private int cF = -99999999;
   private boolean cG = true;
   private int cH = -99999999;
   private cqz cI = cqz.a;
   private ari cJ = ari.a;
   private boolean cK = true;
   private long cL = af.c();
   @Nullable
   private bwf cM;
   private boolean cN;
   public boolean i;
   private final aws cO;
   @Nullable
   private feq cP;
   private int cQ;
   private boolean cR;
   private int cS = 2;
   private String cT = "en_us";
   @Nullable
   private feq cU;
   @Nullable
   private feq cV;
   @Nullable
   private feq cW;
   private jx cX = jx.a(0, 0, 0);
   private aqz cY = aqz.a;
   private alf<dja> cZ = dja.i;
   @Nullable
   private iu da;
   private boolean db;
   private float dc;
   private final asz dd;
   private boolean de;
   private boolean df;
   private boolean dg;
   private cqh dh = new cqh();
   @Nullable
   private iu di;
   private feq dj = feq.c;
   private cra dk = cra.b;
   private final Set<csh> dl = new HashSet<>();
   private final cvk dm = new cvk() {
      @Override
      public void a(cuv $$0, jn<czd> $$1, czd $$2, int[] $$3) {
         arr.this.f.b(new aco($$0.l, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cuv $$0, int $$1, czd $$2) {
         arr.this.f.b(new acq($$0.l, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cuv $$0, czd $$1) {
         arr.this.f.b(new afa($$1.v()));
      }

      @Override
      public void a(cuv $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cuv $$0, int $$1, int $$2) {
         arr.this.f.b(new acp($$0.l, $$1, $$2));
      }
   };
   private final cvj dn = new cvj() {
      @Override
      public void a(cuv $$0, int $$1, czd $$2) {
         cws $$3 = $$0.b($$1);
         if (!($$3 instanceof cwo)) {
            if ($$3.c == arr.this.gj()) {
               ap.f.a(arr.this, arr.this.gj(), $$2);
            }
         }
      }

      @Override
      public void a(cuv $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private xp do;
   @Nullable
   public final Object j;
   private final eh dp = new eh() {
      @Override
      public boolean t_() {
         return arr.this.y().O().c(diw.q);
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
   private int dq;
   public boolean k;

   public arr(MinecraftServer $$0, arq $$1, GameProfile $$2, ara $$3) {
      super($$1, $$1.aa(), $$1.ab(), $$2);
      this.dd = $$0.a(this);
      this.h = $$0.b(this);
      this.cO = new aws(($$1x, $$2x) -> $$0.aI().a($$1x, $$2x));
      this.g = $$0;
      this.cx = $$0.ag().a((crc)this);
      this.cw = $$0.ag().g(this);
      this.b(this.a($$1, $$1.aa()).c(), 0.0F, 0.0F);
      this.a($$3);
      this.j = null;
   }

   @Override
   public iu a(arq $$0, iu $$1) {
      fel $$2 = this.a(bxq.a).a(feq.c);
      iu $$3 = $$1;
      if ($$0.B_().g() && $$0.p().aZ().k() != dix.c) {
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

   private boolean a(arq $$0, fel $$1) {
      return $$0.a(this, $$1, true);
   }

   private int t(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.dh = $$0.<cqh>a("warden_spawn_tracker", cqh.a).orElseGet(cqh::new);
      if ($$0.b("enteredNetherPosition", 10)) {
         tz $$1 = $$0.p("enteredNetherPosition");
         this.cV = new feq($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.i = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cO.a($$0.p("recipeBook"), $$0x -> this.g.aI().b($$0x).isPresent());
      }

      if (this.fR()) {
         this.fS();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.da = new iu($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.db = $$0.q("SpawnForced");
         this.dc = $$0.j("SpawnAngle");
         this.cZ = $$0.<alf<dja>>a("SpawnDimension", dja.h).orElse(dja.i);
      }

      this.dg = $$0.q("spawn_extra_particles_on_fall");
      this.di = $$0.<iu>a("raid_omen_position", iu.a).orElse(null);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("warden_spawn_tracker", cqh.a, this.dh);
      this.m($$0);
      $$0.a("seenCredits", this.i);
      if (this.cV != null) {
         tz $$1 = new tz();
         $$1.a("x", this.cV.d);
         $$1.a("y", this.cV.e);
         $$1.a("z", this.cV.f);
         $$0.a("enteredNetherPosition", $$1);
      }

      this.k($$0);
      $$0.a("recipeBook", this.cO.b());
      $$0.a("Dimension", this.dV().aj().a().toString());
      if (this.da != null) {
         $$0.a("SpawnX", this.da.u());
         $$0.a("SpawnY", this.da.v());
         $$0.a("SpawnZ", this.da.w());
         $$0.a("SpawnForced", this.db);
         $$0.a("SpawnAngle", this.dc);
         $$0.a("SpawnDimension", dja.h, this.cZ);
      }

      $$0.a("spawn_extra_particles_on_fall", this.dg);
      if (this.di != null) {
         $$0.a("raid_omen_position", iu.a, this.di);
      }

      this.l($$0);
   }

   private void k(tz $$0) {
      bwf $$1 = this.df();
      bwf $$2 = this.dk();
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
         bwf $$3 = bwo.a($$2.p("Entity"), $$1, bwn.r, $$1x -> !$$1.c($$1x) ? null : $$1x);
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
            for (bwf $$6 : $$3.dc()) {
               if ($$6.cG().equals($$4)) {
                  this.a($$6, true);
                  break;
               }
            }
         }

         if (!this.bZ()) {
            cq.warn("Couldn't reattach entity to player");
            $$3.at();

            for (bwf $$7 : $$3.dc()) {
               $$7.at();
            }
         }
      }
   }

   private void l(tz $$0) {
      if (!this.dl.isEmpty()) {
         uf $$1 = new uf();

         for (csh $$2 : this.dl) {
            if ($$2.dQ()) {
               cq.warn("Trying to save removed ender pearl, skipping");
            } else {
               tz $$3 = new tz();
               $$2.e($$3);
               $$3.a("ender_pearl_dimension", dja.h, $$2.dV().aj());
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
               Optional<alf<dja>> $$2x = $$1.a("ender_pearl_dimension", dja.h);
               if ($$2x.isEmpty()) {
                  cq.warn("No dimension defined for ender pearl, skipping");
                  return;
               }

               arq $$3 = this.dV().p().a($$2x.get());
               if ($$3 != null) {
                  bwf $$4 = bwo.a($$1, $$3, bwn.r, $$1x -> !$$3.c($$1x) ? null : $$1x);
                  if ($$4 != null) {
                     a($$3, $$4.dx());
                  } else {
                     cq.warn("Failed to spawn player ender pearl in level ({}), skipping", $$2x.get());
                  }
               } else {
                  cq.warn("Trying to load ender pearl without level ({}) being loaded, skipping", $$2x.get());
               }
            }
         });
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gt();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.ch = azm.a((float)$$0 / $$1, 0.0F, $$2);
      this.cH = -1;
   }

   public void b(int $$0) {
      this.cf = $$0;
      this.cH = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cH = -1;
   }

   @Override
   public void a(czd $$0, int $$1) {
      super.a($$0, $$1);
      this.cH = -1;
   }

   private void a(cuv $$0) {
      $$0.a(this.dn);
      $$0.a(this.dm);
   }

   public void d() {
      this.a(this.bQ);
   }

   @Override
   public void e_() {
      super.e_();
      this.f.b(ady.a);
   }

   @Override
   public void J_() {
      super.J_();
      this.f.b(new adx(this.eS()));
   }

   @Override
   public void a(eah $$0) {
      ap.e.a(this, $$0);
   }

   @Override
   protected cza g() {
      return new dab(this);
   }

   @Override
   public void h() {
      this.gK();
      this.h.a();
      this.dh.a();
      if (this.aj > 0) {
         this.aj--;
      }

      this.bR.d();
      if (!this.bR.b(this)) {
         this.p();
         this.bR = this.bQ;
      }

      bwf $$0 = this.L();
      if ($$0 != this) {
         if ($$0.bK()) {
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
      if (this.cP != null) {
         ap.v.a(this, this.cP, this.af - this.cQ);
      }

      this.l();
      this.m();
      this.gR();
      this.cw.a(this, true);
   }

   private void gR() {
      byg $$0 = this.g(byk.g);
      if ($$0 != null) {
         if (this.b()) {
            $$0.a(cu);
         } else {
            $$0.e(cu);
         }
      }

      byg $$1 = this.g(byk.j);
      if ($$1 != null) {
         if (this.b()) {
            $$1.a(cv);
         } else {
            $$1.e(cv);
         }
      }
   }

   public void i() {
      try {
         if (!this.V_() || !this.do()) {
            super.h();
         }

         for (int $$0 = 0; $$0 < this.gj().b(); $$0++) {
            czd $$1 = this.gj().a($$0);
            if (!$$1.f()) {
               this.i($$1);
            }
         }

         if (this.eG() != this.cE || this.cF != this.bS.a() || this.bS.c() == 0.0F != this.cG) {
            this.f.b(new afi(this.eG(), this.bS.a(), this.bS.c()));
            this.cE = this.eG();
            this.cF = this.bS.a();
            this.cG = this.bS.c() == 0.0F;
         }

         if (this.eG() + this.fw() != this.cy) {
            this.cy = this.eG() + this.fw();
            this.a(ffy.h, azm.f(this.cy));
         }

         if (this.bS.a() != this.cz) {
            this.cz = this.bS.a();
            this.a(ffy.i, azm.f((float)this.cz));
         }

         if (this.ct() != this.cA) {
            this.cA = this.ct();
            this.a(ffy.j, azm.f((float)this.cA));
         }

         if (this.eR() != this.cB) {
            this.cB = this.eR();
            this.a(ffy.k, azm.f((float)this.cB));
         }

         if (this.cg != this.cD) {
            this.cD = this.cg;
            this.a(ffy.l, azm.f((float)this.cD));
         }

         if (this.cf != this.cC) {
            this.cC = this.cf;
            this.a(ffy.m, azm.f((float)this.cC));
         }

         if (this.cg != this.cH) {
            this.cH = this.cg;
            this.f.b(new afh(this.ch, this.cg, this.cf));
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

   private void i(czd $$0) {
      eyh $$1 = $$0.a(kj.M);
      eyj $$2 = czq.a($$1, this.dV());
      if ($$2 != null) {
         zf<?> $$3 = $$2.a($$1, this);
         if ($$3 != null) {
            this.f.b($$3);
         }
      }
   }

   @Override
   protected void j() {
      if (this.dV().an() == bua.a && this.y().O().c(diw.l)) {
         if (this.af % 20 == 0) {
            if (this.eG() < this.eU()) {
               this.c(1.0F);
            }

            float $$0 = this.bS.c();
            if ($$0 < 20.0F) {
               this.bS.b($$0 + 1.0F);
            }
         }

         if (this.af % 10 == 0 && this.bS.b()) {
            this.bS.a(this.bS.a() + 1);
         }
      }
   }

   @Override
   public void k() {
      if (this.eG() > 0.0F && this.cU != null) {
         ap.X.a(this, this.cU);
      }

      this.cU = null;
      super.k();
   }

   public void l() {
      if (this.Z > 0.0 && this.cU == null) {
         this.cU = this.dt();
         if (this.cm != null && this.cm.e <= this.cU.e) {
            ap.ae.a(this, this.cm, this.cn);
         }
      }
   }

   @Override
   public void m() {
      if (this.dk() != null && this.dk().bw()) {
         if (this.cW == null) {
            this.cW = this.dt();
         } else {
            ap.Y.a(this, this.cW);
         }
      }

      if (this.cW != null && (this.dk() == null || !this.dk().bw())) {
         this.cW = null;
      }
   }

   private void a(ffy $$0, int $$1) {
      this.gz().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(buu $$0) {
      this.a(efh.p);
      boolean $$1 = this.y().O().c(diw.o);
      if ($$1) {
         wy $$2 = this.eS().a();
         this.f.a(new adz(this.ar(), $$2), wf.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            wy $$3x = wy.a("death.attack.message_too_long", wy.b($$2x).a(n.o));
            wy $$4x = wy.a("death.attack.even_more_magic", this.m_()).a($$1xx -> $$1xx.a(new xe.e($$3x)));
            return new adz(this.ar(), $$4x);
         }));
         ffx $$3 = this.cr();
         if ($$3 == null || $$3.l() == ffx.b.a) {
            this.g.ag().a($$2, false);
         } else if ($$3.l() == ffx.b.c) {
            this.g.ag().a(this, $$2);
         } else if ($$3.l() == ffx.b.d) {
            this.g.ag().b(this, $$2);
         }
      } else {
         this.f.b(new adz(this.ar(), wx.a));
      }

      this.gy();
      if (this.y().O().c(diw.P)) {
         this.gS();
      }

      if (!this.V_()) {
         this.b(this.y(), $$0);
      }

      this.gz().a(ffy.e, this, fft::b);
      bxe $$4 = this.eT();
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
      this.eS().c();
      this.c(Optional.of(jd.a(this.dV().aj(), this.dv())));
      this.v(false);
   }

   private void gS() {
      fel $$0 = new fel(this.dv()).c(32.0, 10.0, 32.0);
      this.dV().a(bxg.class, $$0, bwm.f).stream().filter($$0x -> $$0x instanceof bxj).forEach($$0x -> ((bxj)$$0x).a_(this.y(), this));
   }

   @Override
   public void a(bwf $$0, buu $$1) {
      if ($$0 != this) {
         super.a($$0, $$1);
         this.gz().a(ffy.g, this, fft::b);
         if ($$0 instanceof crc) {
            this.a(awx.Q);
            this.gz().a(ffy.f, this, fft::b);
         } else {
            this.a(awx.O);
         }

         this.a(this, $$0, ffy.n);
         this.a($$0, this, ffy.o);
         ap.c.a(this, $$0, $$1);
      }
   }

   private void a(ffu $$0, ffu $$1, ffy[] $$2) {
      ffq $$3 = this.gz().e($$1.cI());
      if ($$3 != null) {
         int $$4 = $$3.o().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gz().a($$2[$$4], $$0, fft::b);
         }
      }
   }

   @Override
   public boolean a(arq $$0, buu $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         bwf $$3 = $$1.d();
         if ($$3 instanceof crc $$4 && !this.a($$4)) {
            return false;
         }

         if ($$3 instanceof crk $$5 && $$5.q() instanceof crc $$7 && !this.a($$7)) {
            return false;
         }

         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(crc $$0) {
      return !this.gT() ? false : super.a($$0);
   }

   private boolean gT() {
      return this.g.ac();
   }

   public exo a(boolean $$0, exo.a $$1) {
      iu $$2 = this.T();
      float $$3 = this.U();
      boolean $$4 = this.W();
      arq $$5 = this.g.a(this.V());
      if ($$5 != null && $$2 != null) {
         Optional<arr.a> $$6 = a($$5, $$2, $$3, $$4, $$0);
         if ($$6.isPresent()) {
            arr.a $$7 = $$6.get();
            return new exo($$5, $$7.a(), feq.c, $$7.b(), 0.0F, $$1);
         } else {
            return exo.a(this.g.J(), this, $$1);
         }
      } else {
         return new exo(this.g.J(), this, $$1);
      }
   }

   private static Optional<arr.a> a(arq $$0, iu $$1, float $$2, boolean $$3, boolean $$4) {
      eah $$5 = $$0.a_($$1);
      dmf $$6 = $$5.b();
      if ($$6 instanceof dsu && ($$3 || $$5.c(dsu.d) > 0) && dsu.a($$0)) {
         Optional<feq> $$7 = dsu.a(bwo.bS, $$0, $$1);
         if (!$$3 && $$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.b(dsu.d, Integer.valueOf($$5.c(dsu.d) - 1)), 3);
         }

         return $$7.map($$1x -> arr.a.a($$1x, $$1));
      } else if ($$6 instanceof dly && dly.a($$0)) {
         return dly.a(bwo.bS, $$0, $$1, $$5.c(dly.e), $$2).map($$1x -> arr.a.a($$1x, $$1));
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         eah $$9 = $$0.a_($$1.d());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new arr.a(new feq((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5), $$2)) : Optional.empty();
      }
   }

   @Override
   public void n() {
      this.ao();
      this.y().a(this, bwf.e.e);
      if (!this.k) {
         this.k = true;
         this.f.b(new adb(adb.f, 0.0F));
         this.i = true;
      }
   }

   @Nullable
   public arr a(exo $$0) {
      if (this.dQ()) {
         return null;
      } else {
         if ($$0.g()) {
            this.f.b(new adb(adb.b, 0.0F));
         }

         arq $$1 = $$0.b();
         arq $$2 = this.y();
         alf<dja> $$3 = $$2.aj();
         if (!$$0.h()) {
            this.ae();
         }

         if ($$1.aj() == $$3) {
            this.f.a(bxr.a($$0), $$0.i());
            this.f.l();
            $$0.j().onTransition(this);
            return this;
         } else {
            this.cN = true;
            eyr $$4 = $$1.y_();
            this.f.b(new aem(this.b($$1), (byte)3));
            this.f.b(new acg($$4.q(), $$4.r()));
            avq $$5 = this.g.ag();
            $$5.e(this);
            $$2.a(this, bwf.e.e);
            this.dS();
            bqo $$6 = bqn.a();
            $$6.a("moving");
            if ($$3 == dja.i && $$1.aj() == dja.j) {
               this.cV = this.dt();
            }

            $$6.c();
            $$6.a("placing");
            this.a($$1);
            this.f.a(bxr.a($$0), $$0.i());
            this.f.l();
            $$1.d(this);
            $$6.c();
            this.g($$2);
            this.fF();
            this.f.b(new adv(this.gk()));
            $$5.a(this, $$1);
            $$5.f(this);
            $$5.d(this);
            $$0.j().onTransition(this);
            this.cH = -1;
            this.cE = -1.0F;
            this.cF = -1;
            return this;
         }
      }
   }

   @Override
   public void a(float $$0, float $$1) {
      this.f.b(new aee($$0, $$1));
   }

   private void g(arq $$0) {
      alf<dja> $$1 = $$0.aj();
      alf<dja> $$2 = this.dV().aj();
      ap.w.a(this, $$1, $$2);
      if ($$1 == dja.j && $$2 == dja.i && this.cV != null) {
         ap.D.a(this, this.cV);
      }

      if ($$2 != dja.j) {
         this.cV = null;
      }
   }

   @Override
   public boolean a(arr $$0) {
      if ($$0.V_()) {
         return this.L() == this;
      } else {
         return this.V_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bwf $$0, int $$1) {
      super.a($$0, $$1);
      this.bR.d();
   }

   @Override
   public Either<crc.a, bau> a(iu $$0) {
      ja $$1 = this.dV().a_($$0).c(dqg.e);
      if (this.fR() || !this.bK()) {
         return Either.left(crc.a.e);
      } else if (!this.dV().B_().j()) {
         return Either.left(crc.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(crc.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(crc.a.d);
      } else {
         this.a(this.dV().aj(), $$0, this.dL(), false, true);
         if (this.dV().V()) {
            return Either.left(crc.a.b);
         } else {
            if (!this.b()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               feq $$4 = feq.c($$0);
               List<cod> $$5 = this.dV()
                  .a(
                     cod.class,
                     new fel($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0),
                     $$0x -> $$0x.a(this.y(), this)
                  );
               if (!$$5.isEmpty()) {
                  return Either.left(crc.a.f);
               }
            }

            Either<crc.a, bau> $$6 = super.a($$0).ifRight($$0x -> {
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
      feq $$1 = feq.c($$0);
      return Math.abs(this.dA() - $$1.a()) <= 3.0 && Math.abs(this.dC() - $$1.b()) <= 2.0 && Math.abs(this.dG() - $$1.c()) <= 3.0;
   }

   private boolean b(iu $$0, ja $$1) {
      iu $$2 = $$0.d();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fR()) {
         this.y().m().a(this, new abw(this, 2));
      }

      super.a($$0, $$1);
      if (this.f != null) {
         this.f.a(this.dA(), this.dC(), this.dG(), this.dL(), this.dN());
      }
   }

   @Override
   public boolean a(arq $$0, buu $$1) {
      return super.a($$0, $$1) || this.Q() && !$$1.a(bux.m) || !this.gJ();
   }

   @Override
   protected void b(arq $$0, iu $$1) {
      if (!this.V_()) {
         super.b($$0, $$1);
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, eah $$2, iu $$3) {
      if (this.dg && $$1 && this.Z > 0.0) {
         feq $$4 = $$3.b().b(0.0, 0.5, 0.0);
         int $$5 = (int)azm.a(50.0 * this.Z, 0.0, 200.0);
         this.y().a(new lp(lx.b, $$2), $$4.d, $$4.e, $$4.f, $$5, 0.3F, 0.3F, 0.3F, 0.15F);
         this.dg = false;
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b_(@Nullable bwf $$0) {
      super.b_($$0);
      this.cm = this.dt();
      this.cn = $$0;
      this.w($$0 != null && $$0.aq() == bwo.bH);
   }

   @Override
   protected void o() {
      if (this.dV().u().i()) {
         super.o();
      }
   }

   @Override
   public void a(dyt $$0, boolean $$1) {
      this.f.b(new acc(this.dV(), $$0.ax_()));
      this.f.b(new adt($$0.ax_(), $$1));
   }

   private void gU() {
      this.dq = this.dq % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable buf $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.bR != this.bQ) {
            this.p();
         }

         this.gU();
         cuv $$1 = $$0.createMenu(this.dq, this.gj(), this);
         if ($$1 == null) {
            if (this.V_()) {
               this.a(wy.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.f.b(new ads($$1.l, $$1.a(), $$0.m_()));
            this.a($$1);
            this.bR = $$1;
            return OptionalInt.of(this.dq);
         }
      }
   }

   @Override
   public void a(int $$0, dhz $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.f.b(new adn($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(clh $$0, btw $$1) {
      if (this.bR != this.bQ) {
         this.p();
      }

      this.gU();
      int $$2 = $$0.ab_();
      this.f.b(new adc(this.dq, $$2, $$0.ar()));
      this.bR = new cvx(this.dq, this.gj(), $$1, $$0, $$2);
      this.a(this.bR);
   }

   @Override
   public void a(czd $$0, buc $$1) {
      if ($$0.c(kj.V)) {
         if (dcn.a($$0, this.A(), this)) {
            this.bR.d();
         }

         this.f.b(new adr($$1));
      }
   }

   @Override
   public void a(dxq $$0) {
      this.f.b(aca.a($$0, dxf::e));
   }

   @Override
   public void p() {
      this.f.b(new acn(this.bR.l));
      this.q();
   }

   @Override
   public void q() {
      this.bR.a(this);
      this.bQ.a(this.bR);
      this.bR = this.bQ;
   }

   @Override
   public void r() {
      double $$0 = this.dA();
      double $$1 = this.dC();
      double $$2 = this.dG();
      super.r();
      this.q(this.dA() - $$0, this.dC() - $$1, this.dG() - $$2);
   }

   public void a(double $$0, double $$1, double $$2) {
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
         } else if (this.fJ()) {
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
         bwf $$4 = this.dk();
         if ($$4 instanceof ctp) {
            this.a(awx.x, $$3);
         } else if ($$4 instanceof ctn) {
            this.a(awx.y, $$3);
         } else if ($$4 instanceof cjp) {
            this.a(awx.z, $$3);
         } else if ($$4 instanceof clh) {
            this.a(awx.A, $$3);
         } else if ($$4 instanceof cor) {
            this.a(awx.D, $$3);
         }
      }
   }

   private static boolean r(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(awu<?> $$0, int $$1) {
      this.cx.b(this, $$0, $$1);
      this.gz().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(awu<?> $$0) {
      this.cx.a(this, $$0, 0);
      this.gz().a($$0, this, fft::c);
   }

   @Override
   public int a(Collection<ddz<?>> $$0) {
      return this.cO.a($$0, this);
   }

   @Override
   public void a(ddz<?> $$0, List<czd> $$1) {
      ap.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<alf<ddu<?>>> $$0) {
      List<ddz<?>> $$1 = $$0.stream().flatMap($$0x -> this.g.aI().b($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<ddz<?>> $$0) {
      return this.cO.b($$0, this);
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
      this.cH = -1;
   }

   public void t() {
      this.cR = true;
      this.bO();
      if (this.fR()) {
         this.a(true, false);
      }
   }

   public boolean u() {
      return this.cR;
   }

   @Override
   public void v() {
      this.cE = -1.0E8F;
   }

   @Override
   public void a(wy $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void K_() {
      if (!this.bm.f() && this.fz()) {
         this.f.b(new acx(this, (byte)9));
         super.K_();
      }
   }

   @Override
   public void a(eu.a $$0, feq $$1) {
      super.a($$0, $$1);
      this.f.b(new aec($$0, $$1.d, $$1.e, $$1.f));
   }

   public void a(eu.a $$0, bwf $$1, eu.a $$2) {
      feq $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.f.b(new aec($$0, $$1, $$2));
   }

   public void a(arr $$0, boolean $$1) {
      this.dh = $$0.dh;
      this.do = $$0.do;
      this.h.a($$0.h.b(), $$0.h.c());
      this.x();
      if ($$1) {
         this.fa().b($$0.fa());
         this.fa().c($$0.fa());
         this.d($$0.eG());
         this.bS = $$0.bS;

         for (bvj $$2 : $$0.eD()) {
            this.a(new bvj($$2));
         }

         this.gj().a($$0.gj());
         this.cf = $$0.cf;
         this.cg = $$0.cg;
         this.ch = $$0.ch;
         this.q($$0.gd());
         this.as = $$0.as;
      } else {
         this.fa().b($$0.fa());
         this.d(this.eU());
         if (this.y().O().c(diw.e) || $$0.V_()) {
            this.gj().a($$0.gj());
            this.cf = $$0.cf;
            this.cg = $$0.cg;
            this.ch = $$0.ch;
            this.q($$0.gd());
         }
      }

      this.ci = $$0.ci;
      this.bP = $$0.bP;
      this.au().a(bK, $$0.au().a(bK));
      this.cH = -1;
      this.cE = -1.0F;
      this.cF = -1;
      this.cO.a($$0.cO);
      this.i = $$0.i;
      this.cV = $$0.cV;
      this.cY = $$0.cY;
      this.i($$0.gB());
      this.j($$0.gC());
      this.c($$0.gI());
   }

   @Override
   protected void a(bvj $$0, @Nullable bwf $$1) {
      super.a($$0, $$1);
      this.f.b(new agi(this.ar(), $$0, true));
      if ($$0.a(bvl.y)) {
         this.cQ = this.af;
         this.cP = this.dt();
      }

      ap.B.a(this, $$1);
   }

   @Override
   protected void a(bvj $$0, boolean $$1, @Nullable bwf $$2) {
      super.a($$0, $$1, $$2);
      this.f.b(new agi(this.ar(), $$0, false));
      ap.B.a(this, $$2);
   }

   @Override
   protected void c(Collection<bvj> $$0) {
      super.c($$0);

      for (bvj $$1 : $$0) {
         this.f.b(new aek(this.ar(), $$1.c()));
         if ($$1.a(bvl.y)) {
            this.cP = null;
         }
      }

      ap.B.a(this, null);
   }

   @Override
   public void b(double $$0, double $$1, double $$2) {
      this.f.a(new bxr(new feq($$0, $$1, $$2), feq.c, 0.0F, 0.0F), bxs.a(bxs.l, bxs.k));
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.f.a(new bxr(new feq($$0, $$1, $$2), feq.c, 0.0F, 0.0F), bxs.j);
   }

   @Override
   public boolean a(arq $$0, double $$1, double $$2, double $$3, Set<bxs> $$4, float $$5, float $$6, boolean $$7) {
      if (this.fR()) {
         this.a(true, true);
      }

      if ($$7) {
         this.d(this);
      }

      boolean $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$8) {
         this.r($$4.contains(bxs.d) ? this.cA() + $$5 : $$5);
      }

      return $$8;
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      super.d($$0, $$1, $$2);
      this.f.l();
   }

   @Override
   public void b(bwf $$0) {
      this.y().m().a(this, new abw($$0, 4));
   }

   @Override
   public void c(bwf $$0) {
      this.y().m().a(this, new abw($$0, 5));
   }

   @Override
   public void x() {
      if (this.f != null) {
         this.f.b(new adv(this.gk()));
         this.K();
      }
   }

   public arq y() {
      return (arq)this.dV();
   }

   public boolean a(dix $$0) {
      boolean $$1 = this.V_();
      if (!this.h.a($$0)) {
         return false;
      } else {
         this.f.b(new adb(adb.e, (float)$$0.a()));
         if ($$0 == dix.d) {
            this.gy();
            this.bP();
            dfs.a(this);
         } else {
            this.d(this);
            if ($$1) {
               dfs.a(this.y(), this);
            }
         }

         this.x();
         this.fx();
         return true;
      }
   }

   @Override
   public boolean V_() {
      return this.h.b() == dix.d;
   }

   @Override
   public boolean b() {
      return this.h.b() == dix.b;
   }

   public eh z() {
      return this.dp;
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
      if (this.gV()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String B() {
      return this.f.m() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(ara $$0) {
      this.cT = $$0.b();
      this.cS = $$0.c();
      this.cI = $$0.d();
      this.cK = $$0.e();
      this.de = $$0.h();
      this.df = $$0.i();
      this.cJ = $$0.j();
      this.au().a(bK, (byte)$$0.f());
      this.au().a(bL, (byte)$$0.g().b());
   }

   public ara C() {
      int $$0 = this.au().a(bK);
      bwx $$1 = bwx.d.apply(this.au().a(bL));
      return new ara(this.cT, this.cS, this.cI, this.cK, $$0, $$1, this.de, this.df, this.cJ);
   }

   public boolean D() {
      return this.cK;
   }

   public cqz E() {
      return this.cI;
   }

   private boolean x(boolean $$0) {
      return this.cI == cqz.c ? $$0 : true;
   }

   private boolean gV() {
      return this.cI == cqz.a;
   }

   public int F() {
      return this.cS;
   }

   public void a(akd $$0) {
      this.f.b(new aeq($$0.a(), $$0.d().map(akd.a::a)));
   }

   @Override
   public int G() {
      return this.g.c(this.gi());
   }

   public void H() {
      this.cL = af.c();
   }

   public awt I() {
      return this.cx;
   }

   public aws J() {
      return this.cO;
   }

   @Override
   protected void K() {
      if (this.V_()) {
         this.eB();
         this.k(true);
      } else {
         super.K();
      }
   }

   public bwf L() {
      return (bwf)(this.cM == null ? this : this.cM);
   }

   @Override
   public void d(@Nullable bwf $$0) {
      bwf $$1 = this.L();
      this.cM = (bwf)($$0 == null ? this : $$0);
      if ($$1 != this.cM) {
         if (this.cM.dV() instanceof arq $$2) {
            this.a($$2, this.cM.dA(), this.cM.dC(), this.cM.dG(), Set.of(), this.dL(), this.dN(), false);
         }

         if ($$0 != null) {
            this.y().m().a(this);
         }

         this.f.b(new aex(this.cM));
         this.f.l();
      }
   }

   @Override
   protected void M() {
      if (!this.cN) {
         super.M();
      }
   }

   @Override
   public void e(bwf $$0) {
      if (this.h.b() == dix.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long N() {
      return this.cL;
   }

   @Nullable
   public wy O() {
      return null;
   }

   public int P() {
      return 0;
   }

   @Override
   public void a(buc $$0) {
      super.a($$0);
      this.gE();
   }

   public boolean Q() {
      return this.cN;
   }

   public void R() {
      this.cN = false;
   }

   public alo S() {
      return this.cw;
   }

   @Nullable
   public iu T() {
      return this.da;
   }

   public float U() {
      return this.dc;
   }

   public alf<dja> V() {
      return this.cZ;
   }

   public boolean W() {
      return this.db;
   }

   public void b(arr $$0) {
      this.a($$0.V(), $$0.T(), $$0.U(), $$0.W(), false);
   }

   public void a(alf<dja> $$0, @Nullable iu $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.da) && $$0.equals(this.cZ);
         if ($$4 && !$$5) {
            this.a(wy.c("block.minecraft.set_spawn"));
         }

         this.da = $$1;
         this.cZ = $$0;
         this.dc = $$2;
         this.db = $$3;
      } else {
         this.da = null;
         this.cZ = dja.i;
         this.dc = 0.0F;
         this.db = false;
      }
   }

   public jx X() {
      return this.cX;
   }

   public void a(jx $$0) {
      this.cX = $$0;
   }

   public aqz Y() {
      return this.cY;
   }

   public void a(aqz $$0) {
      this.cY = $$0;
   }

   @Override
   public void a(awm $$0, awo $$1, float $$2, float $$3) {
      this.f.b(new afv(mf.b.e($$0), $$1, this.dA(), this.dC(), this.dG(), $$2, $$3, this.ae.g()));
   }

   @Override
   public cnh a(czd $$0, boolean $$1, boolean $$2) {
      cnh $$3 = super.a($$0, $$1, $$2);
      if ($$2) {
         czd $$4 = $$3 != null ? $$3.f() : czd.k;
         if (!$$4.f()) {
            this.a(awx.f.b($$4.h()), $$0.M());
            this.a(awx.F);
         }
      }

      return $$3;
   }

   public asz Z() {
      return this.dd;
   }

   public void a(arq $$0) {
      this.a((dja)$$0);
      this.h.a($$0);
   }

   @Nullable
   private static dix a(@Nullable tz $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? dix.a($$0.h($$1)) : null;
   }

   private dix b(@Nullable dix $$0) {
      dix $$1 = this.g.bd();
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
      dix $$1 = this.h.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean aa() {
      return this.de;
   }

   public boolean c(arr $$0) {
      return $$0 == this ? false : this.de || $$0.de;
   }

   @Override
   public boolean c(arq $$0, iu $$1) {
      return super.c($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(czd $$0) {
      ap.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      crb $$1 = this.gj();
      czd $$2 = $$1.a($$0);
      this.bR.b($$1, $$1.f()).ifPresent($$1x -> this.bR.a($$1x, $$1.g()));
      return this.a($$2, false, true) != null;
   }

   @Override
   public void b(czd $$0) {
      if (!this.gj().g($$0)) {
         this.a($$0, false);
      }
   }

   public boolean ab() {
      return this.df;
   }

   @Override
   public Optional<cqh> ac() {
      return Optional.of(this.dh);
   }

   public void b(boolean $$0) {
      this.dg = $$0;
   }

   @Override
   public void a(cnh $$0) {
      super.a($$0);
      bwf $$1 = $$0.q();
      if ($$1 != null) {
         ap.S.a(this, $$0.f(), $$1);
      }
   }

   public void a(xp $$0) {
      this.do = $$0;
   }

   @Nullable
   public xp ad() {
      return this.do != null && this.do.b() ? null : this.do;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cl = (float)(azm.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dL());
      this.f.b(new add(this));
   }

   @Override
   public boolean a(bwf $$0, boolean $$1) {
      if (super.a($$0, $$1)) {
         $$0.j(this);
         this.f.a(new bxr(this.dt(), feq.c, 0.0F, 0.0F), bxs.k);
         if ($$0 instanceof bxe $$2) {
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
      bwf $$0 = this.dk();
      super.ae();
      if ($$0 instanceof bxe $$1) {
         for (bvj $$2 : $$1.eD()) {
            this.f.b(new aek($$0.ar(), $$2.c()));
         }
      }

      if ($$0 != null) {
         this.f.b(new afl($$0));
      }
   }

   public agk b(arq $$0) {
      return new agk($$0.ai(), $$0.aj(), dkf.a($$0.E()), this.h.b(), this.h.c(), $$0.ak(), $$0.D(), this.gI(), this.aC(), $$0.P());
   }

   @Override
   public void c(iu $$0) {
      this.di = $$0;
   }

   public void af() {
      this.di = null;
   }

   @Nullable
   public iu ag() {
      return this.di;
   }

   @Override
   public feq ah() {
      bwf $$0 = this.dk();
      return $$0 != null && $$0.cW() != this ? $$0.ah() : this.dj;
   }

   public void a(feq $$0) {
      this.dj = $$0;
   }

   @Override
   protected float a(bwf $$0, float $$1, buu $$2) {
      return dfs.a(this.y(), this.dZ(), $$0, $$2, $$1);
   }

   @Override
   public void a(cyz $$0, bwp $$1) {
      super.a($$0, $$1);
      this.b(awx.d.b($$0));
   }

   public cra ai() {
      return this.dk;
   }

   public void a(cra $$0) {
      this.dk = $$0;
   }

   public feq aj() {
      float $$0 = this.dk.c() == this.dk.d() ? 0.0F : (this.dk.c() ? 1.0F : -1.0F);
      float $$1 = this.dk.a() == this.dk.b() ? 0.0F : (this.dk.a() ? 1.0F : -1.0F);
      return a(new feq((double)$$0, 0.0, (double)$$1), 1.0F, this.dL());
   }

   public void a(csh $$0) {
      this.dl.add($$0);
   }

   public void b(csh $$0) {
      this.dl.remove($$0);
   }

   public Set<csh> ak() {
      return this.dl;
   }

   public long c(csh $$0) {
      if ($$0.dV() instanceof arq $$1) {
         dih $$2 = $$0.dx();
         this.a($$0);
         $$1.i();
         return a($$1, $$2) - 1L;
      } else {
         return 0L;
      }
   }

   public static long a(arq $$0, dih $$1) {
      $$0.m().a(arx.h, $$1, 2);
      return arx.h.d();
   }

   static record a(feq a, float b) {
      public static arr.a a(feq $$0, iu $$1) {
         return new arr.a($$0, b($$0, $$1));
      }

      private static float b(feq $$0, iu $$1) {
         feq $$2 = feq.c($$1).d($$0).d();
         return (float)azm.d(azm.d($$2.f, $$2.d) * 180.0F / (float)Math.PI - 90.0);
      }
   }
}
