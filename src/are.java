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

public class are extends cpr {
   private static final Logger cp = LogUtils.getLogger();
   private static final int cq = 32;
   private static final int cr = 10;
   private static final int cs = 25;
   public static final double a = 1.0;
   public static final double b = 3.0;
   public static final int c = 2;
   public static final String d = "ender_pearls";
   public static final String e = "ender_pearl_dimension";
   private static final bxe ct = new bxe(aku.b("creative_mode_block_range"), 0.5, bxe.a.a);
   private static final bxe cu = new bxe(aku.b("creative_mode_entity_range"), 2.0, bxe.a.a);
   public asg f;
   public final MinecraftServer g;
   public final arf h;
   private final alc cv;
   private final awg cw;
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
   private cpo cH = cpo.a;
   private aqv cI = aqv.a;
   private boolean cJ = true;
   private long cK = af.c();
   @Nullable
   private bva cL;
   private boolean cM;
   public boolean i;
   private final awf cN;
   @Nullable
   private fbx cO;
   private int cP;
   private boolean cQ;
   private int cR = 2;
   private String cS = "en_us";
   @Nullable
   private fbx cT;
   @Nullable
   private fbx cU;
   @Nullable
   private fbx cV;
   private kk cW = kk.a(0, 0, 0);
   private aqm cX = aqm.a;
   private akt<dgz> cY = dgz.i;
   @Nullable
   private ji cZ;
   private boolean da;
   private float db;
   private final asm dc;
   private boolean dd;
   private boolean de;
   private boolean df;
   private cow dg = new cow(0, 0, 0);
   @Nullable
   private ji dh;
   private fbx di = fbx.c;
   private cpp dj = cpp.b;
   private final Set<cqu> dk = new HashSet<>();
   private final ctl dl = new ctl() {
      @Override
      public void a(csw $$0, ka<cxh> $$1, cxh $$2, int[] $$3) {
         are.this.f.b(new acf($$0.l, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(csw $$0, int $$1, cxh $$2) {
         are.this.f.b(new ach($$0.l, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(csw $$0, cxh $$1) {
         are.this.f.b(new aer($$1.v()));
      }

      @Override
      public void a(csw $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(csw $$0, int $$1, int $$2) {
         are.this.f.b(new acg($$0.l, $$1, $$2));
      }
   };
   private final ctk dm = new ctk() {
      @Override
      public void a(csw $$0, int $$1, cxh $$2) {
         cut $$3 = $$0.b($$1);
         if (!($$3 instanceof cup)) {
            if ($$3.c == are.this.gl()) {
               ap.f.a(are.this, are.this.gl(), $$2);
            }
         }
      }

      @Override
      public void a(csw $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private xg dn;
   @Nullable
   public final Object j;
   private final ew do = new ew() {
      @Override
      public boolean t_() {
         return are.this.y().O().b(dgv.p);
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
      public void a(wp $$0) {
         are.this.a($$0);
      }
   };
   private int dp;
   public boolean k;

   public are(MinecraftServer $$0, ard $$1, GameProfile $$2, aqn $$3) {
      super($$1, $$1.aa(), $$1.ab(), $$2);
      this.dc = $$0.a(this);
      this.h = $$0.b(this);
      this.cN = new awf(($$1x, $$2x) -> $$0.aI().a($$1x, $$2x));
      this.g = $$0;
      this.cw = $$0.ag().a((cpr)this);
      this.cv = $$0.ag().g(this);
      this.b(this.a($$1, $$1.aa()).c(), 0.0F, 0.0F);
      this.a($$3);
      this.j = null;
   }

   @Override
   public ji a(ard $$0, ji $$1) {
      fbs $$2 = this.a(bwk.a).a(fbx.c);
      ji $$3 = $$1;
      if ($$0.B_().g() && $$0.p().aZ().k() != dgw.c) {
         int $$4 = Math.max(0, this.g.a($$0));
         int $$5 = ayz.a($$0.A_().b((double)$$1.u(), (double)$$1.w()));
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

      while (!this.a($$0, $$2.c($$3.c())) && $$3.v() < $$0.ao()) {
         $$3 = $$3.d();
      }

      while (this.a($$0, $$2.c($$3.e().c())) && $$3.v() > $$0.G_() + 1) {
         $$3 = $$3.e();
      }

      return $$3;
   }

   private boolean a(ard $$0, fbs $$1) {
      return $$0.a(this, $$1, true);
   }

   private int t(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         cow.a.parse(new Dynamic(ue.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(cp::error).ifPresent($$0x -> this.dg = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         tq $$1 = $$0.p("enteredNetherPosition");
         this.cU = new fbx($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.i = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cN.a($$0.p("recipeBook"), $$0x -> this.g.aI().b($$0x).isPresent());
      }

      if (this.fT()) {
         this.fU();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.cZ = new ji($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.da = $$0.q("SpawnForced");
         this.db = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.cY = dgz.h.parse(ue.a, $$0.c("SpawnDimension")).resultOrPartial(cp::error).orElse(dgz.i);
         }
      }

      this.df = $$0.q("spawn_extra_particles_on_fall");
      un $$2 = $$0.c("raid_omen_position");
      if ($$2 != null) {
         ji.a.parse(ue.a, $$2).resultOrPartial(cp::error).ifPresent($$0x -> this.dh = $$0x);
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      cow.a.encodeStart(ue.a, this.dg).resultOrPartial(cp::error).ifPresent($$1x -> $$0.a("warden_spawn_tracker", $$1x));
      this.m($$0);
      $$0.a("seenCredits", this.i);
      if (this.cU != null) {
         tq $$1 = new tq();
         $$1.a("x", this.cU.d);
         $$1.a("y", this.cU.e);
         $$1.a("z", this.cU.f);
         $$0.a("enteredNetherPosition", $$1);
      }

      this.k($$0);
      $$0.a("recipeBook", this.cN.b());
      $$0.a("Dimension", this.dU().aj().a().toString());
      if (this.cZ != null) {
         $$0.a("SpawnX", this.cZ.u());
         $$0.a("SpawnY", this.cZ.v());
         $$0.a("SpawnZ", this.cZ.w());
         $$0.a("SpawnForced", this.da);
         $$0.a("SpawnAngle", this.db);
         aku.a.encodeStart(ue.a, this.cY.a()).resultOrPartial(cp::error).ifPresent($$1x -> $$0.a("SpawnDimension", $$1x));
      }

      $$0.a("spawn_extra_particles_on_fall", this.df);
      if (this.dh != null) {
         ji.a.encodeStart(ue.a, this.dh).resultOrPartial(cp::error).ifPresent($$1x -> $$0.a("raid_omen_position", $$1x));
      }

      this.l($$0);
   }

   private void k(tq $$0) {
      bva $$1 = this.de();
      bva $$2 = this.dj();
      if ($$2 != null && $$1 != this && $$1.dd()) {
         tq $$3 = new tq();
         tq $$4 = new tq();
         $$1.e($$4);
         $$3.a("Attach", $$2.cF());
         $$3.a("Entity", $$4);
         $$0.a("RootVehicle", $$3);
      }
   }

   public void a(Optional<tq> $$0) {
      if ($$0.isPresent() && $$0.get().b("RootVehicle", 10) && this.dU() instanceof ard $$1) {
         tq $$2 = $$0.get().p("RootVehicle");
         bva $$3 = bvi.a($$2.p("Entity"), $$1, bvh.r, $$1x -> !$$1.c($$1x) ? null : $$1x);
         if ($$3 == null) {
            return;
         }

         UUID $$4;
         if ($$2.b("Attach")) {
            $$4 = $$2.a("Attach");
         } else {
            $$4 = null;
         }

         if ($$3.cF().equals($$4)) {
            this.a($$3, true);
         } else {
            for (bva $$6 : $$3.db()) {
               if ($$6.cF().equals($$4)) {
                  this.a($$6, true);
                  break;
               }
            }
         }

         if (!this.bY()) {
            cp.warn("Couldn't reattach entity to player");
            $$3.at();

            for (bva $$7 : $$3.db()) {
               $$7.at();
            }
         }
      }
   }

   private void l(tq $$0) {
      if (!this.dk.isEmpty()) {
         tw $$1 = new tw();

         for (cqu $$2 : this.dk) {
            if ($$2.dP()) {
               cp.warn("Trying to save removed ender pearl, skipping");
            } else {
               tq $$3 = new tq();
               $$2.e($$3);
               aku.a.encodeStart(ue.a, $$2.dU().aj().a()).resultOrPartial(cp::error).ifPresent($$1x -> $$3.a("ender_pearl_dimension", $$1x));
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
               Optional<akt<dgz>> $$2x = dgz.h.parse(ue.a, $$1.c("ender_pearl_dimension")).resultOrPartial(cp::error);
               if ($$2x.isEmpty()) {
                  cp.warn("No dimension defined for ender pearl, skipping");
                  return;
               }

               ard $$3 = this.dU().p().a($$2x.get());
               if ($$3 != null) {
                  bva $$4 = bvi.a($$1, $$3, bvh.r, $$1x -> !$$3.c($$1x) ? null : $$1x);
                  if ($$4 != null) {
                     a($$3, $$4.dw());
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
      float $$1 = (float)this.gv();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.cg = ayz.a((float)$$0 / $$1, 0.0F, $$2);
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
   public void a(cxh $$0, int $$1) {
      super.a($$0, $$1);
      this.cG = -1;
   }

   private void a(csw $$0) {
      $$0.a(this.dm);
      $$0.a(this.dl);
   }

   public void d() {
      this.a(this.bP);
   }

   @Override
   public void e_() {
      super.e_();
      this.f.b(adp.a);
   }

   @Override
   public void J_() {
      super.J_();
      this.f.b(new ado(this.eQ()));
   }

   @Override
   public void a(dxq $$0) {
      ap.e.a(this, $$0);
   }

   @Override
   protected cxe g() {
      return new cyg(this);
   }

   @Override
   public void h() {
      this.gM();
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

      bva $$0 = this.L();
      if ($$0 != this) {
         if ($$0.bJ()) {
            this.a($$0.dz(), $$0.dB(), $$0.dF(), $$0.dK(), $$0.dM());
            this.y().m().a(this);
            if (this.gb()) {
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
      this.gT();
      this.cv.a(this, true);
   }

   private void gT() {
      bxc $$0 = this.g(bxg.g);
      if ($$0 != null) {
         if (this.b()) {
            $$0.a(ct);
         } else {
            $$0.e(ct);
         }
      }

      bxc $$1 = this.g(bxg.j);
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
         if (!this.U_() || !this.dn()) {
            super.h();
         }

         for (int $$0 = 0; $$0 < this.gl().b(); $$0++) {
            cxh $$1 = this.gl().a($$0);
            if (!$$1.f()) {
               this.j($$1);
            }
         }

         if (this.eE() != this.cD || this.cE != this.bR.a() || this.bR.c() == 0.0F != this.cF) {
            this.f.b(new aez(this.eE(), this.bR.a(), this.bR.c()));
            this.cD = this.eE();
            this.cE = this.bR.a();
            this.cF = this.bR.c() == 0.0F;
         }

         if (this.eE() + this.fy() != this.cx) {
            this.cx = this.eE() + this.fy();
            this.a(fdf.g, ayz.f(this.cx));
         }

         if (this.bR.a() != this.cy) {
            this.cy = this.bR.a();
            this.a(fdf.h, ayz.f((float)this.cy));
         }

         if (this.cs() != this.cz) {
            this.cz = this.cs();
            this.a(fdf.i, ayz.f((float)this.cz));
         }

         if (this.eP() != this.cA) {
            this.cA = this.eP();
            this.a(fdf.j, ayz.f((float)this.cA));
         }

         if (this.cf != this.cC) {
            this.cC = this.cf;
            this.a(fdf.k, ayz.f((float)this.cC));
         }

         if (this.ce != this.cB) {
            this.cB = this.ce;
            this.a(fdf.l, ayz.f((float)this.cB));
         }

         if (this.cf != this.cG) {
            this.cG = this.cf;
            this.f.b(new aey(this.cg, this.cf, this.ce));
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

   private void j(cxh $$0) {
      evo $$1 = $$0.a(kv.M);
      evq $$2 = cxu.a($$1, this.dU());
      if ($$2 != null) {
         yw<?> $$3 = $$2.a($$1, this);
         if ($$3 != null) {
            this.f.b($$3);
         }
      }
   }

   @Override
   protected void j() {
      if (this.dU().an() == bsv.a && this.y().O().b(dgv.k)) {
         if (this.af % 20 == 0) {
            if (this.eE() < this.eS()) {
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
      if (this.eE() > 0.0F && this.cT != null) {
         ap.X.a(this, this.cT);
      }

      this.cT = null;
      super.k();
   }

   public void l() {
      if (this.Z > 0.0F && this.cT == null) {
         this.cT = this.ds();
         if (this.cl != null && this.cl.e <= this.cT.e) {
            ap.ae.a(this, this.cl, this.cm);
         }
      }
   }

   @Override
   public void m() {
      if (this.dj() != null && this.dj().bv()) {
         if (this.cV == null) {
            this.cV = this.ds();
         } else {
            ap.Y.a(this, this.cV);
         }
      }

      if (this.cV != null && (this.dj() == null || !this.dj().bv())) {
         this.cV = null;
      }
   }

   private void a(fdf $$0, int $$1) {
      this.gB().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(btp $$0) {
      this.a(ecp.p);
      boolean $$1 = this.y().O().b(dgv.n);
      if ($$1) {
         wp $$2 = this.eQ().a();
         this.f.a(new adq(this.ar(), $$2), vw.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            wp $$3x = wp.a("death.attack.message_too_long", wp.b($$2x).a(n.o));
            wp $$4x = wp.a("death.attack.even_more_magic", this.m_()).a($$1xx -> $$1xx.a(new wv.e($$3x)));
            return new adq(this.ar(), $$4x);
         }));
         fde $$3 = this.cq();
         if ($$3 == null || $$3.k() == fde.b.a) {
            this.g.ag().a($$2, false);
         } else if ($$3.k() == fde.b.c) {
            this.g.ag().a(this, $$2);
         } else if ($$3.k() == fde.b.d) {
            this.g.ag().b(this, $$2);
         }
      } else {
         this.f.b(new adq(this.ar(), wo.a));
      }

      this.gA();
      if (this.y().O().b(dgv.O)) {
         this.gU();
      }

      if (!this.U_()) {
         this.b(this.y(), $$0);
      }

      this.gB().a(fdf.d, this, fda::b);
      bvy $$4 = this.eR();
      if ($$4 != null) {
         this.b(awk.h.b($$4.aq()));
         $$4.a(this, $$0);
         this.f($$4);
      }

      this.dU().a(this, (byte)3);
      this.a(awk.N);
      this.a(awk.i.b(awk.m));
      this.a(awk.i.b(awk.n));
      this.aH();
      this.k(0);
      this.c(false);
      this.eQ().c();
      this.c(Optional.of(jq.a(this.dU().aj(), this.du())));
      this.v(false);
   }

   private void gU() {
      fbs $$0 = new fbs(this.du()).c(32.0, 10.0, 32.0);
      this.dU().a(bwa.class, $$0, bvg.f).stream().filter($$0x -> $$0x instanceof bwd).forEach($$0x -> ((bwd)$$0x).a_(this.y(), this));
   }

   @Override
   public void a(bva $$0, btp $$1) {
      if ($$0 != this) {
         super.a($$0, $$1);
         this.gB().a(fdf.f, this, fda::b);
         if ($$0 instanceof cpr) {
            this.a(awk.Q);
            this.gB().a(fdf.e, this, fda::b);
         } else {
            this.a(awk.O);
         }

         this.a(this, $$0, fdf.m);
         this.a($$0, this, fdf.n);
         ap.c.a(this, $$0, $$1);
      }
   }

   private void a(fdb $$0, fdb $$1, fdf[] $$2) {
      fcx $$3 = this.gB().e($$1.cH());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gB().a($$2[$$4], $$0, fda::b);
         }
      }
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         bva $$3 = $$1.d();
         if ($$3 instanceof cpr $$4 && !this.a($$4)) {
            return false;
         }

         if ($$3 instanceof cpy $$5 && $$5.q() instanceof cpr $$7 && !this.a($$7)) {
            return false;
         }

         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(cpr $$0) {
      return !this.gV() ? false : super.a($$0);
   }

   private boolean gV() {
      return this.g.ac();
   }

   public euw a(boolean $$0, euw.a $$1) {
      ji $$2 = this.T();
      float $$3 = this.U();
      boolean $$4 = this.W();
      ard $$5 = this.g.a(this.V());
      if ($$5 != null && $$2 != null) {
         Optional<are.a> $$6 = a($$5, $$2, $$3, $$4, $$0);
         if ($$6.isPresent()) {
            are.a $$7 = $$6.get();
            return new euw($$5, $$7.a(), fbx.c, $$7.b(), 0.0F, $$1);
         } else {
            return euw.a(this.g.J(), this, $$1);
         }
      } else {
         return new euw(this.g.J(), this, $$1);
      }
   }

   private static Optional<are.a> a(ard $$0, ji $$1, float $$2, boolean $$3, boolean $$4) {
      dxq $$5 = $$0.a_($$1);
      dke $$6 = $$5.b();
      if ($$6 instanceof dqr && ($$3 || $$5.c(dqr.d) > 0) && dqr.a($$0)) {
         Optional<fbx> $$7 = dqr.a(bvi.bR, $$0, $$1);
         if (!$$3 && $$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.b(dqr.d, Integer.valueOf($$5.c(dqr.d) - 1)), 3);
         }

         return $$7.map($$1x -> are.a.a($$1x, $$1));
      } else if ($$6 instanceof djx && djx.a($$0)) {
         return djx.a(bvi.bR, $$0, $$1, $$5.c(djx.e), $$2).map($$1x -> are.a.a($$1x, $$1));
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dxq $$9 = $$0.a_($$1.d());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new are.a(new fbx((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5), $$2)) : Optional.empty();
      }
   }

   @Override
   public void n() {
      this.ao();
      this.y().a(this, bva.d.e);
      if (!this.k) {
         this.k = true;
         this.f.b(new acs(acs.f, 0.0F));
         this.i = true;
      }
   }

   @Nullable
   public are a(euw $$0) {
      if (this.dP()) {
         return null;
      } else {
         if ($$0.g()) {
            this.f.b(new acs(acs.b, 0.0F));
         }

         ard $$1 = $$0.b();
         ard $$2 = this.y();
         akt<dgz> $$3 = $$2.aj();
         if (!$$0.h()) {
            this.ae();
         }

         if ($$1.aj() == $$3) {
            this.f.a(bwl.a($$0), $$0.i());
            this.f.l();
            $$0.j().onTransition(this);
            return this;
         } else {
            this.cM = true;
            evy $$4 = $$1.y_();
            this.f.b(new aed(this.b($$1), (byte)3));
            this.f.b(new abx($$4.q(), $$4.r()));
            avd $$5 = this.g.ag();
            $$5.e(this);
            $$2.a(this, bva.d.e);
            this.dR();
            bpj $$6 = bpi.a();
            $$6.a("moving");
            if ($$3 == dgz.i && $$1.aj() == dgz.j) {
               this.cU = this.ds();
            }

            $$6.c();
            $$6.a("placing");
            this.a($$1);
            this.f.a(bwl.a($$0), $$0.i());
            this.f.l();
            $$1.d(this);
            $$6.c();
            this.g($$2);
            this.fH();
            this.f.b(new adm(this.gm()));
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
      this.f.b(new adv($$0, $$1));
   }

   private void g(ard $$0) {
      akt<dgz> $$1 = $$0.aj();
      akt<dgz> $$2 = this.dU().aj();
      ap.w.a(this, $$1, $$2);
      if ($$1 == dgz.j && $$2 == dgz.i && this.cU != null) {
         ap.D.a(this, this.cU);
      }

      if ($$2 != dgz.j) {
         this.cU = null;
      }
   }

   @Override
   public boolean a(are $$0) {
      if ($$0.U_()) {
         return this.L() == this;
      } else {
         return this.U_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bva $$0, int $$1) {
      super.a($$0, $$1);
      this.bQ.d();
   }

   @Override
   public Either<cpr.a, baf> a(ji $$0) {
      jn $$1 = this.dU().a_($$0).c(dod.e);
      if (this.fT() || !this.bJ()) {
         return Either.left(cpr.a.e);
      } else if (!this.dU().B_().j()) {
         return Either.left(cpr.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cpr.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cpr.a.d);
      } else {
         this.a(this.dU().aj(), $$0, this.dK(), false, true);
         if (this.dU().V()) {
            return Either.left(cpr.a.b);
         } else {
            if (!this.b()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               fbx $$4 = fbx.c($$0);
               List<cms> $$5 = this.dU()
                  .a(
                     cms.class,
                     new fbs($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0),
                     $$0x -> $$0x.a(this.y(), this)
                  );
               if (!$$5.isEmpty()) {
                  return Either.left(cpr.a.f);
               }
            }

            Either<cpr.a, baf> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(awk.ap);
               ap.r.a(this);
            });
            if (!this.y().e()) {
               this.a(wp.c("sleep.not_possible"), true);
            }

            ((ard)this.dU()).f();
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
      return this.j($$0) || this.j($$0.a($$1.g()));
   }

   private boolean j(ji $$0) {
      fbx $$1 = fbx.c($$0);
      return Math.abs(this.dz() - $$1.a()) <= 3.0 && Math.abs(this.dB() - $$1.b()) <= 2.0 && Math.abs(this.dF() - $$1.c()) <= 3.0;
   }

   private boolean b(ji $$0, jn $$1) {
      ji $$2 = $$0.d();
      return !this.i($$2) || !this.i($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fT()) {
         this.y().m().a(this, new abn(this, 2));
      }

      super.a($$0, $$1);
      if (this.f != null) {
         this.f.a(this.dz(), this.dB(), this.dF(), this.dK(), this.dM());
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.ae();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public boolean a(ard $$0, btp $$1) {
      return super.a($$0, $$1) || this.Q() && !$$1.a(bts.m) || !this.gL();
   }

   @Override
   protected void b(ard $$0, ji $$1) {
      if (!this.U_()) {
         super.b($$0, $$1);
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, dxq $$2, ji $$3) {
      if (this.df && $$1 && this.Z > 0.0F) {
         fbx $$4 = $$3.b().b(0.0, 0.5, 0.0);
         int $$5 = (int)ayz.a(50.0F * this.Z, 0.0F, 200.0F);
         this.y().a(new ll(lt.b, $$2), $$4.d, $$4.e, $$4.f, $$5, 0.3F, 0.3F, 0.3F, 0.15F);
         this.df = false;
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b_(@Nullable bva $$0) {
      super.b_($$0);
      this.cl = this.ds();
      this.cm = $$0;
      this.w($$0 != null && $$0.aq() == bvi.bG);
   }

   @Override
   protected void o() {
      if (this.dU().u().i()) {
         super.o();
      }
   }

   @Override
   public void a(dwf $$0, boolean $$1) {
      this.f.b(new abt(this.dU(), $$0.aA_()));
      this.f.b(new adk($$0.aA_(), $$1));
   }

   private void gW() {
      this.dp = this.dp % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bta $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.bQ != this.bP) {
            this.p();
         }

         this.gW();
         csw $$1 = $$0.createMenu(this.dp, this.gl(), this);
         if ($$1 == null) {
            if (this.U_()) {
               this.a(wp.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.f.b(new adj($$1.l, $$1.a(), $$0.m_()));
            this.a($$1);
            this.bQ = $$1;
            return OptionalInt.of(this.dp);
         }
      }
   }

   @Override
   public void a(int $$0, dfy $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.f.b(new ade($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(cjw $$0, bsr $$1) {
      if (this.bQ != this.bP) {
         this.p();
      }

      this.gW();
      int $$2 = $$0.ad_();
      this.f.b(new act(this.dp, $$2, $$0.ar()));
      this.bQ = new cty(this.dp, this.gl(), $$1, $$0, $$2);
      this.a(this.bQ);
   }

   @Override
   public void a(cxh $$0, bsx $$1) {
      if ($$0.b(kv.V)) {
         if (dao.a($$0, this.A(), this)) {
            this.bQ.d();
         }

         this.f.b(new adi($$1));
      }
   }

   @Override
   public void a(dvc $$0) {
      this.f.b(abr.a($$0, dus::e));
   }

   @Override
   public void p() {
      this.f.b(new ace(this.bQ.l));
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
      double $$0 = this.dz();
      double $$1 = this.dB();
      double $$2 = this.dF();
      super.r();
      this.q(this.dz() - $$0, this.dB() - $$1, this.dF() - $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (!this.bY() && !r($$0, $$1, $$2)) {
         if (this.cj()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(awk.C, $$3);
               this.H(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(awv.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(awk.w, $$4);
               this.H(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.bj()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(awk.s, $$5);
               this.H(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.d_()) {
            if ($$1 > 0.0) {
               this.a(awk.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aJ()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.ci()) {
                  this.a(awk.r, $$6);
                  this.H(0.1F * (float)$$6 * 0.01F);
               } else if (this.ch()) {
                  this.a(awk.q, $$6);
                  this.H(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(awk.p, $$6);
                  this.H(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fL()) {
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
      if (this.bY() && !r($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         bva $$4 = this.dj();
         if ($$4 instanceof crq) {
            this.a(awk.x, $$3);
         } else if ($$4 instanceof cro) {
            this.a(awk.y, $$3);
         } else if ($$4 instanceof cig) {
            this.a(awk.z, $$3);
         } else if ($$4 instanceof cjw) {
            this.a(awk.A, $$3);
         } else if ($$4 instanceof cnf) {
            this.a(awk.D, $$3);
         }
      }
   }

   private static boolean r(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(awh<?> $$0, int $$1) {
      this.cw.b(this, $$0, $$1);
      this.gB().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(awh<?> $$0) {
      this.cw.a(this, $$0, 0);
      this.gB().a($$0, this, fda::c);
   }

   @Override
   public int a(Collection<dca<?>> $$0) {
      return this.cN.a($$0, this);
   }

   @Override
   public void a(dca<?> $$0, List<cxh> $$1) {
      ap.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<akt<dbv<?>>> $$0) {
      List<dca<?>> $$1 = $$0.stream().flatMap($$0x -> this.g.aI().b($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<dca<?>> $$0) {
      return this.cN.b($$0, this);
   }

   @Override
   public void s() {
      super.s();
      this.a(awk.E);
      if (this.ci()) {
         this.H(0.2F);
      } else {
         this.H(0.05F);
      }
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cG = -1;
   }

   public void t() {
      this.cQ = true;
      this.bN();
      if (this.fT()) {
         this.a(true, false);
      }
   }

   public boolean u() {
      return this.cQ;
   }

   public void v() {
      this.cD = -1.0E8F;
   }

   @Override
   public void a(wp $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void K_() {
      if (!this.bm.f() && this.fB()) {
         this.f.b(new aco(this, (byte)9));
         super.K_();
      }
   }

   @Override
   public void a(fj.a $$0, fbx $$1) {
      super.a($$0, $$1);
      this.f.b(new adt($$0, $$1.d, $$1.e, $$1.f));
   }

   public void a(fj.a $$0, bva $$1, fj.a $$2) {
      fbx $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.f.b(new adt($$0, $$1, $$2));
   }

   public void a(are $$0, boolean $$1) {
      this.dg = $$0.dg;
      this.dn = $$0.dn;
      this.h.a($$0.h.b(), $$0.h.c());
      this.x();
      if ($$1) {
         this.eY().b($$0.eY());
         this.eY().c($$0.eY());
         this.d($$0.eE());
         this.bR = $$0.bR;

         for (bue $$2 : $$0.eB()) {
            this.a(new bue($$2));
         }

         this.gl().a($$0.gl());
         this.ce = $$0.ce;
         this.cf = $$0.cf;
         this.cg = $$0.cg;
         this.q($$0.gf());
         this.as = $$0.as;
      } else {
         this.eY().b($$0.eY());
         this.d(this.eS());
         if (this.y().O().b(dgv.d) || $$0.U_()) {
            this.gl().a($$0.gl());
            this.ce = $$0.ce;
            this.cf = $$0.cf;
            this.cg = $$0.cg;
            this.q($$0.gf());
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
      this.i($$0.gD());
      this.j($$0.gE());
      this.c($$0.gK());
   }

   @Override
   protected void a(bue $$0, @Nullable bva $$1) {
      super.a($$0, $$1);
      this.f.b(new afy(this.ar(), $$0, true));
      if ($$0.a(bug.y)) {
         this.cP = this.af;
         this.cO = this.ds();
      }

      ap.B.a(this, $$1);
   }

   @Override
   protected void a(bue $$0, boolean $$1, @Nullable bva $$2) {
      super.a($$0, $$1, $$2);
      this.f.b(new afy(this.ar(), $$0, false));
      ap.B.a(this, $$2);
   }

   @Override
   protected void c(Collection<bue> $$0) {
      super.c($$0);

      for (bue $$1 : $$0) {
         this.f.b(new aeb(this.ar(), $$1.c()));
         if ($$1.a(bug.y)) {
            this.cO = null;
         }
      }

      ap.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.f.a(new bwl(new fbx($$0, $$1, $$2), fbx.c, 0.0F, 0.0F), bwm.a(bwm.l, bwm.k));
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.f.a(new bwl(new fbx($$0, $$1, $$2), fbx.c, 0.0F, 0.0F), bwm.j);
   }

   @Override
   public boolean a(ard $$0, double $$1, double $$2, double $$3, Set<bwm> $$4, float $$5, float $$6, boolean $$7) {
      if (this.fT()) {
         this.a(true, true);
      }

      if ($$7) {
         this.d(this);
      }

      boolean $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$8) {
         this.r($$4.contains(bwm.d) ? this.cz() + $$5 : $$5);
      }

      return $$8;
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      super.e($$0, $$1, $$2);
      this.f.l();
   }

   @Override
   public void b(bva $$0) {
      this.y().m().a(this, new abn($$0, 4));
   }

   @Override
   public void c(bva $$0) {
      this.y().m().a(this, new abn($$0, 5));
   }

   @Override
   public void x() {
      if (this.f != null) {
         this.f.b(new adm(this.gm()));
         this.K();
      }
   }

   public ard y() {
      return (ard)this.dU();
   }

   public boolean a(dgw $$0) {
      boolean $$1 = this.U_();
      if (!this.h.a($$0)) {
         return false;
      } else {
         this.f.b(new acs(acs.e, (float)$$0.a()));
         if ($$0 == dgw.d) {
            this.gA();
            this.bO();
            ddt.a(this);
         } else {
            this.d(this);
            if ($$1) {
               ddt.a(this.y(), this);
            }
         }

         this.x();
         this.fz();
         return true;
      }
   }

   @Override
   public boolean U_() {
      return this.h.b() == dgw.d;
   }

   @Override
   public boolean b() {
      return this.h.b() == dgw.b;
   }

   public ew z() {
      return this.do;
   }

   public ex A() {
      return new ex(this.z(), this.ds(), this.bT(), this.y(), this.G(), this.al().getString(), this.m_(), this.g, this);
   }

   public void a(wp $$0) {
      this.b($$0, false);
   }

   public void b(wp $$0, boolean $$1) {
      if (this.x($$1)) {
         this.f.a(new afp($$0, $$1), vw.a(() -> {
            if (this.x(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               wp $$3 = wp.b($$2).a(n.o);
               return new afp(wp.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(xe $$0, boolean $$1, wl.a $$2) {
      if (this.gX()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String B() {
      return this.f.m() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(aqn $$0) {
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

   public aqn C() {
      int $$0 = this.au().a(bJ);
      bvr $$1 = bvr.d.apply(this.au().a(bK));
      return new aqn(this.cS, this.cR, this.cH, this.cJ, $$0, $$1, this.dd, this.de, this.cI);
   }

   public boolean D() {
      return this.cJ;
   }

   public cpo E() {
      return this.cH;
   }

   private boolean x(boolean $$0) {
      return this.cH == cpo.c ? $$0 : true;
   }

   private boolean gX() {
      return this.cH == cpo.a;
   }

   public int F() {
      return this.cR;
   }

   public void a(ajr $$0) {
      this.f.b(new aeh($$0.a(), $$0.d().map(ajr.a::a)));
   }

   @Override
   public int G() {
      return this.g.c(this.gk());
   }

   @Override
   public void H() {
      this.cK = af.c();
   }

   public awg I() {
      return this.cw;
   }

   public awf J() {
      return this.cN;
   }

   @Override
   protected void K() {
      if (this.U_()) {
         this.ez();
         this.k(true);
      } else {
         super.K();
      }
   }

   public bva L() {
      return (bva)(this.cL == null ? this : this.cL);
   }

   @Override
   public void d(@Nullable bva $$0) {
      bva $$1 = this.L();
      this.cL = (bva)($$0 == null ? this : $$0);
      if ($$1 != this.cL) {
         if (this.cL.dU() instanceof ard $$2) {
            this.a($$2, this.cL.dz(), this.cL.dB(), this.cL.dF(), Set.of(), this.dK(), this.dM(), false);
         }

         if ($$0 != null) {
            this.y().m().a(this);
         }

         this.f.b(new aeo(this.cL));
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
   public void e(bva $$0) {
      if (this.h.b() == dgw.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long N() {
      return this.cK;
   }

   @Nullable
   public wp O() {
      return null;
   }

   public int P() {
      return 0;
   }

   @Override
   public void a(bsx $$0) {
      super.a($$0);
      this.gG();
   }

   public boolean Q() {
      return this.cM;
   }

   public void R() {
      this.cM = false;
   }

   public alc S() {
      return this.cv;
   }

   @Nullable
   public ji T() {
      return this.cZ;
   }

   public float U() {
      return this.db;
   }

   public akt<dgz> V() {
      return this.cY;
   }

   public boolean W() {
      return this.da;
   }

   public void b(are $$0) {
      this.a($$0.V(), $$0.T(), $$0.U(), $$0.W(), false);
   }

   public void a(akt<dgz> $$0, @Nullable ji $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.cZ) && $$0.equals(this.cY);
         if ($$4 && !$$5) {
            this.a(wp.c("block.minecraft.set_spawn"));
         }

         this.cZ = $$1;
         this.cY = $$0;
         this.db = $$2;
         this.da = $$3;
      } else {
         this.cZ = null;
         this.cY = dgz.i;
         this.db = 0.0F;
         this.da = false;
      }
   }

   public kk X() {
      return this.cW;
   }

   public void a(kk $$0) {
      this.cW = $$0;
   }

   public aqm Y() {
      return this.cX;
   }

   public void a(aqm $$0) {
      this.cX = $$0;
   }

   @Override
   public void a(avz $$0, awb $$1, float $$2, float $$3) {
      this.f.b(new afm(mb.b.e($$0), $$1, this.dz(), this.dB(), this.dF(), $$2, $$3, this.ae.g()));
   }

   @Override
   public clw a(cxh $$0, boolean $$1, boolean $$2) {
      clw $$3 = this.b($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dU().b($$3);
         cxh $$4 = $$3.f();
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
   private clw b(cxh $$0, boolean $$1, boolean $$2) {
      if ($$0.f()) {
         return null;
      } else {
         double $$3 = this.dD() - 0.3F;
         clw $$4 = new clw(this.dU(), this.dz(), $$3, this.dF(), $$0);
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
            float $$8 = ayz.a(this.dM() * (float) (Math.PI / 180.0));
            float $$9 = ayz.b(this.dM() * (float) (Math.PI / 180.0));
            float $$10 = ayz.a(this.dK() * (float) (Math.PI / 180.0));
            float $$11 = ayz.b(this.dK() * (float) (Math.PI / 180.0));
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
      return this.dc;
   }

   public void a(ard $$0) {
      this.a((dgz)$$0);
      this.h.a($$0);
   }

   @Nullable
   private static dgw a(@Nullable tq $$0, String $$1) {
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
   public void c(@Nullable tq $$0) {
      this.h.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void m(tq $$0) {
      $$0.a("playerGameType", this.h.b().a());
      dgw $$1 = this.h.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean aa() {
      return this.dd;
   }

   public boolean c(are $$0) {
      return $$0 == this ? false : this.dd || $$0.dd;
   }

   @Override
   public boolean c(ard $$0, ji $$1) {
      return super.c($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cxh $$0) {
      ap.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cpq $$1 = this.gl();
      cxh $$2 = $$1.a($$0);
      this.bQ.b($$1, $$1.j).ifPresent($$1x -> this.bQ.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   @Override
   public void b(cxh $$0) {
      if (!this.gl().f($$0)) {
         this.a($$0, false);
      }
   }

   public boolean ab() {
      return this.de;
   }

   @Override
   public Optional<cow> ac() {
      return Optional.of(this.dg);
   }

   public void b(boolean $$0) {
      this.df = $$0;
   }

   @Override
   public void a(clw $$0) {
      super.a($$0);
      bva $$1 = $$0.q();
      if ($$1 != null) {
         ap.S.a(this, $$0.f(), $$1);
      }
   }

   public void a(xg $$0) {
      this.dn = $$0;
   }

   @Nullable
   public xg ad() {
      return this.dn != null && this.dn.b() ? null : this.dn;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.ck = (float)(ayz.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dK());
      this.f.b(new acu(this));
   }

   @Override
   public boolean a(bva $$0, boolean $$1) {
      if (super.a($$0, $$1)) {
         $$0.j(this);
         this.f.a(new bwl(this.ds(), fbx.c, 0.0F, 0.0F), bwm.k);
         if ($$0 instanceof bvy $$2) {
            this.g.ag().a($$2, this.f);
         }

         this.f.b(new afc($$0));
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void ae() {
      bva $$0 = this.dj();
      super.ae();
      if ($$0 instanceof bvy $$1) {
         for (bue $$2 : $$1.eB()) {
            this.f.b(new aeb($$0.ar(), $$2.c()));
         }
      }

      if ($$0 != null) {
         this.f.b(new afc($$0));
      }
   }

   public aga b(ard $$0) {
      return new aga($$0.ai(), $$0.aj(), die.a($$0.E()), this.h.b(), this.h.c(), $$0.ak(), $$0.D(), this.gK(), this.aC(), $$0.P());
   }

   @Override
   public void c(ji $$0) {
      this.dh = $$0;
   }

   public void af() {
      this.dh = null;
   }

   @Nullable
   public ji ag() {
      return this.dh;
   }

   @Override
   public fbx ah() {
      bva $$0 = this.dj();
      return $$0 != null && $$0.cV() != this ? $$0.ah() : this.di;
   }

   public void a(fbx $$0) {
      this.di = $$0;
   }

   @Override
   protected float a(bva $$0, float $$1, btp $$2) {
      return ddt.a(this.y(), this.dY(), $$0, $$2, $$1);
   }

   @Override
   public void a(cxd $$0, bvj $$1) {
      super.a($$0, $$1);
      this.b(awk.d.b($$0));
   }

   public cpp ai() {
      return this.dj;
   }

   public void a(cpp $$0) {
      this.dj = $$0;
   }

   public fbx aj() {
      float $$0 = this.dj.c() == this.dj.d() ? 0.0F : (this.dj.c() ? 1.0F : -1.0F);
      float $$1 = this.dj.a() == this.dj.b() ? 0.0F : (this.dj.a() ? 1.0F : -1.0F);
      return a(new fbx((double)$$0, 0.0, (double)$$1), 1.0F, this.dK());
   }

   public void a(cqu $$0) {
      this.dk.add($$0);
   }

   public void b(cqu $$0) {
      this.dk.remove($$0);
   }

   public Set<cqu> ak() {
      return this.dk;
   }

   public long c(cqu $$0) {
      if ($$0.dU() instanceof ard $$1) {
         dgg $$2 = $$0.dw();
         this.a($$0);
         $$1.i();
         return a($$1, $$2) - 1L;
      } else {
         return 0L;
      }
   }

   public static long a(ard $$0, dgg $$1) {
      $$0.m().a(ark.h, $$1, 2);
      return ark.h.d();
   }

   static record a(fbx a, float b) {
      public static are.a a(fbx $$0, ji $$1) {
         return new are.a($$0, b($$0, $$1));
      }

      private static float b(fbx $$0, ji $$1) {
         fbx $$2 = fbx.c($$1).d($$0).d();
         return (float)ayz.d(ayz.d($$2.f, $$2.d) * 180.0F / (float)Math.PI - 90.0);
      }
   }
}
