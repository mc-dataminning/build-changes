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

public class arp extends cqs {
   private static final Logger cp = LogUtils.getLogger();
   private static final int cq = 32;
   private static final int cr = 10;
   private static final int cs = 25;
   public static final double a = 1.0;
   public static final double b = 3.0;
   public static final int c = 2;
   public static final String d = "ender_pearls";
   public static final String e = "ender_pearl_dimension";
   private static final byd ct = new byd(ale.b("creative_mode_block_range"), 0.5, byd.a.a);
   private static final byd cu = new byd(ale.b("creative_mode_entity_range"), 2.0, byd.a.a);
   public asr f;
   public final MinecraftServer g;
   public final arq h;
   private final alm cv;
   private final awr cw;
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
   private cqp cH = cqp.a;
   private arg cI = arg.a;
   private boolean cJ = true;
   private long cK = af.c();
   @Nullable
   private bwa cL;
   private boolean cM;
   public boolean i;
   private final awq cN;
   @Nullable
   private fdw cO;
   private int cP;
   private boolean cQ;
   private int cR = 2;
   private String cS = "en_us";
   @Nullable
   private fdw cT;
   @Nullable
   private fdw cU;
   @Nullable
   private fdw cV;
   private jx cW = jx.a(0, 0, 0);
   private aqx cX = aqx.a;
   private ald<dip> cY = dip.i;
   @Nullable
   private iu cZ;
   private boolean da;
   private float db;
   private final asx dc;
   private boolean dd;
   private boolean de;
   private boolean df;
   private cpx dg = new cpx(0, 0, 0);
   @Nullable
   private iu dh;
   private fdw di = fdw.c;
   private cqq dj = cqq.b;
   private final Set<crw> dk = new HashSet<>();
   private final cuz dl = new cuz() {
      @Override
      public void a(cuk $$0, jn<cys> $$1, cys $$2, int[] $$3) {
         arp.this.f.b(new acm($$0.l, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cuk $$0, int $$1, cys $$2) {
         arp.this.f.b(new aco($$0.l, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cuk $$0, cys $$1) {
         arp.this.f.b(new aey($$1.v()));
      }

      @Override
      public void a(cuk $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cuk $$0, int $$1, int $$2) {
         arp.this.f.b(new acn($$0.l, $$1, $$2));
      }
   };
   private final cuy dm = new cuy() {
      @Override
      public void a(cuk $$0, int $$1, cys $$2) {
         cwh $$3 = $$0.b($$1);
         if (!($$3 instanceof cwd)) {
            if ($$3.c == arp.this.gi()) {
               ap.f.a(arp.this, arp.this.gi(), $$2);
            }
         }
      }

      @Override
      public void a(cuk $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private xn dn;
   @Nullable
   public final Object j;
   private final eh do = new eh() {
      @Override
      public boolean t_() {
         return arp.this.y().O().c(dil.p);
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
      public void a(ww $$0) {
         arp.this.a($$0);
      }
   };
   private int dp;
   public boolean k;

   public arp(MinecraftServer $$0, aro $$1, GameProfile $$2, aqy $$3) {
      super($$1, $$1.aa(), $$1.ab(), $$2);
      this.dc = $$0.a(this);
      this.h = $$0.b(this);
      this.cN = new awq(($$1x, $$2x) -> $$0.aI().a($$1x, $$2x));
      this.g = $$0;
      this.cw = $$0.ag().a((cqs)this);
      this.cv = $$0.ag().g(this);
      this.b(this.a($$1, $$1.aa()).c(), 0.0F, 0.0F);
      this.a($$3);
      this.j = null;
   }

   @Override
   public iu a(aro $$0, iu $$1) {
      fdr $$2 = this.a(bxl.a).a(fdw.c);
      iu $$3 = $$1;
      if ($$0.B_().g() && $$0.p().aZ().k() != dim.c) {
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
         int $$10 = azt.a().a($$8);

         for (int $$11 = 0; $$11 < $$8; $$11++) {
            int $$12 = ($$10 + $$9 * $$11) % $$8;
            int $$13 = $$12 % ($$4 * 2 + 1);
            int $$14 = $$12 / ($$4 * 2 + 1);
            int $$15 = $$1.u() + $$13 - $$4;
            int $$16 = $$1.w() + $$14 - $$4;

            try {
               $$3 = ari.a($$0, $$15, $$16);
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

   private boolean a(aro $$0, fdr $$1) {
      return $$0.a(this, $$1, true);
   }

   private int t(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         cpx.a.parse(new Dynamic(ul.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(cp::error).ifPresent($$0x -> this.dg = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         tx $$1 = $$0.p("enteredNetherPosition");
         this.cU = new fdw($$1.k("x"), $$1.k("y"), $$1.k("z"));
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
         if ($$0.e("SpawnDimension")) {
            this.cY = dip.h.parse(ul.a, $$0.c("SpawnDimension")).resultOrPartial(cp::error).orElse(dip.i);
         }
      }

      this.df = $$0.q("spawn_extra_particles_on_fall");
      uu $$2 = $$0.c("raid_omen_position");
      if ($$2 != null) {
         iu.a.parse(ul.a, $$2).resultOrPartial(cp::error).ifPresent($$0x -> this.dh = $$0x);
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      cpx.a.encodeStart(ul.a, this.dg).resultOrPartial(cp::error).ifPresent($$1x -> $$0.a("warden_spawn_tracker", $$1x));
      this.m($$0);
      $$0.a("seenCredits", this.i);
      if (this.cU != null) {
         tx $$1 = new tx();
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
         ale.a.encodeStart(ul.a, this.cY.a()).resultOrPartial(cp::error).ifPresent($$1x -> $$0.a("SpawnDimension", $$1x));
      }

      $$0.a("spawn_extra_particles_on_fall", this.df);
      if (this.dh != null) {
         iu.a.encodeStart(ul.a, this.dh).resultOrPartial(cp::error).ifPresent($$1x -> $$0.a("raid_omen_position", $$1x));
      }

      this.l($$0);
   }

   private void k(tx $$0) {
      bwa $$1 = this.df();
      bwa $$2 = this.dk();
      if ($$2 != null && $$1 != this && $$1.de()) {
         tx $$3 = new tx();
         tx $$4 = new tx();
         $$1.e($$4);
         $$3.a("Attach", $$2.cG());
         $$3.a("Entity", $$4);
         $$0.a("RootVehicle", $$3);
      }
   }

   public void a(Optional<tx> $$0) {
      if ($$0.isPresent() && $$0.get().b("RootVehicle", 10) && this.dV() instanceof aro $$1) {
         tx $$2 = $$0.get().p("RootVehicle");
         bwa $$3 = bwj.a($$2.p("Entity"), $$1, bwi.r, $$1x -> !$$1.c($$1x) ? null : $$1x);
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
            for (bwa $$6 : $$3.dc()) {
               if ($$6.cG().equals($$4)) {
                  this.a($$6, true);
                  break;
               }
            }
         }

         if (!this.bZ()) {
            cp.warn("Couldn't reattach entity to player");
            $$3.at();

            for (bwa $$7 : $$3.dc()) {
               $$7.at();
            }
         }
      }
   }

   private void l(tx $$0) {
      if (!this.dk.isEmpty()) {
         ud $$1 = new ud();

         for (crw $$2 : this.dk) {
            if ($$2.dQ()) {
               cp.warn("Trying to save removed ender pearl, skipping");
            } else {
               tx $$3 = new tx();
               $$2.e($$3);
               ale.a.encodeStart(ul.a, $$2.dV().aj().a()).resultOrPartial(cp::error).ifPresent($$1x -> $$3.a("ender_pearl_dimension", $$1x));
               $$1.add($$3);
            }
         }

         $$0.a("ender_pearls", $$1);
      }
   }

   public void b(Optional<tx> $$0) {
      if ($$0.isPresent() && $$0.get().b("ender_pearls", 9) && $$0.get().c("ender_pearls") instanceof ud $$2) {
         $$2.forEach($$0x -> {
            if ($$0x instanceof tx $$1 && $$1.e("ender_pearl_dimension")) {
               Optional<ald<dip>> $$2x = dip.h.parse(ul.a, $$1.c("ender_pearl_dimension")).resultOrPartial(cp::error);
               if ($$2x.isEmpty()) {
                  cp.warn("No dimension defined for ender pearl, skipping");
                  return;
               }

               aro $$3 = this.dV().p().a($$2x.get());
               if ($$3 != null) {
                  bwa $$4 = bwj.a($$1, $$3, bwi.r, $$1x -> !$$3.c($$1x) ? null : $$1x);
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
      this.cg = azk.a((float)$$0 / $$1, 0.0F, $$2);
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
   public void a(cys $$0, int $$1) {
      super.a($$0, $$1);
      this.cG = -1;
   }

   private void a(cuk $$0) {
      $$0.a(this.dm);
      $$0.a(this.dl);
   }

   public void d() {
      this.a(this.bP);
   }

   @Override
   public void e_() {
      super.e_();
      this.f.b(adw.a);
   }

   @Override
   public void J_() {
      super.J_();
      this.f.b(new adv(this.eR()));
   }

   @Override
   public void a(dzo $$0) {
      ap.e.a(this, $$0);
   }

   @Override
   protected cyp g() {
      return new czq(this);
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

      bwa $$0 = this.L();
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
      byb $$0 = this.g(byf.g);
      if ($$0 != null) {
         if (this.b()) {
            $$0.a(ct);
         } else {
            $$0.e(ct);
         }
      }

      byb $$1 = this.g(byf.j);
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
            cys $$1 = this.gi().a($$0);
            if (!$$1.f()) {
               this.j($$1);
            }
         }

         if (this.eF() != this.cD || this.cE != this.bR.a() || this.bR.c() == 0.0F != this.cF) {
            this.f.b(new afg(this.eF(), this.bR.a(), this.bR.c()));
            this.cD = this.eF();
            this.cE = this.bR.a();
            this.cF = this.bR.c() == 0.0F;
         }

         if (this.eF() + this.fv() != this.cx) {
            this.cx = this.eF() + this.fv();
            this.a(ffe.g, azk.f(this.cx));
         }

         if (this.bR.a() != this.cy) {
            this.cy = this.bR.a();
            this.a(ffe.h, azk.f((float)this.cy));
         }

         if (this.ct() != this.cz) {
            this.cz = this.ct();
            this.a(ffe.i, azk.f((float)this.cz));
         }

         if (this.eQ() != this.cA) {
            this.cA = this.eQ();
            this.a(ffe.j, azk.f((float)this.cA));
         }

         if (this.cf != this.cC) {
            this.cC = this.cf;
            this.a(ffe.k, azk.f((float)this.cC));
         }

         if (this.ce != this.cB) {
            this.cB = this.ce;
            this.a(ffe.l, azk.f((float)this.cB));
         }

         if (this.cf != this.cG) {
            this.cG = this.cf;
            this.f.b(new aff(this.cg, this.cf, this.ce));
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

   private void j(cys $$0) {
      exn $$1 = $$0.a(kj.M);
      exp $$2 = czf.a($$1, this.dV());
      if ($$2 != null) {
         zd<?> $$3 = $$2.a($$1, this);
         if ($$3 != null) {
            this.f.b($$3);
         }
      }
   }

   @Override
   protected void j() {
      if (this.dV().an() == btv.a && this.y().O().c(dil.k)) {
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

   private void a(ffe $$0, int $$1) {
      this.gy().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(bup $$0) {
      this.a(eeo.p);
      boolean $$1 = this.y().O().c(dil.n);
      if ($$1) {
         ww $$2 = this.eR().a();
         this.f.a(new adx(this.ar(), $$2), wd.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            ww $$3x = ww.a("death.attack.message_too_long", ww.b($$2x).a(n.o));
            ww $$4x = ww.a("death.attack.even_more_magic", this.m_()).a($$1xx -> $$1xx.a(new xc.e($$3x)));
            return new adx(this.ar(), $$4x);
         }));
         ffd $$3 = this.cr();
         if ($$3 == null || $$3.k() == ffd.b.a) {
            this.g.ag().a($$2, false);
         } else if ($$3.k() == ffd.b.c) {
            this.g.ag().a(this, $$2);
         } else if ($$3.k() == ffd.b.d) {
            this.g.ag().b(this, $$2);
         }
      } else {
         this.f.b(new adx(this.ar(), wv.a));
      }

      this.gx();
      if (this.y().O().c(dil.O)) {
         this.gR();
      }

      if (!this.U_()) {
         this.b(this.y(), $$0);
      }

      this.gy().a(ffe.d, this, fez::b);
      bwz $$4 = this.eS();
      if ($$4 != null) {
         this.b(awv.h.b($$4.aq()));
         $$4.a(this, $$0);
         this.e($$4);
      }

      this.dV().a(this, (byte)3);
      this.a(awv.N);
      this.a(awv.i.b(awv.m));
      this.a(awv.i.b(awv.n));
      this.aH();
      this.k(0);
      this.c(false);
      this.eR().c();
      this.c(Optional.of(jd.a(this.dV().aj(), this.dv())));
      this.v(false);
   }

   private void gR() {
      fdr $$0 = new fdr(this.dv()).c(32.0, 10.0, 32.0);
      this.dV().a(bxb.class, $$0, bwh.f).stream().filter($$0x -> $$0x instanceof bxe).forEach($$0x -> ((bxe)$$0x).a_(this.y(), this));
   }

   @Override
   public void a(bwa $$0, bup $$1) {
      if ($$0 != this) {
         super.a($$0, $$1);
         this.gy().a(ffe.f, this, fez::b);
         if ($$0 instanceof cqs) {
            this.a(awv.Q);
            this.gy().a(ffe.e, this, fez::b);
         } else {
            this.a(awv.O);
         }

         this.a(this, $$0, ffe.m);
         this.a($$0, this, ffe.n);
         ap.c.a(this, $$0, $$1);
      }
   }

   private void a(ffa $$0, ffa $$1, ffe[] $$2) {
      few $$3 = this.gy().e($$1.cI());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gy().a($$2[$$4], $$0, fez::b);
         }
      }
   }

   @Override
   public boolean a(aro $$0, bup $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         bwa $$3 = $$1.d();
         if ($$3 instanceof cqs $$4 && !this.a($$4)) {
            return false;
         }

         if ($$3 instanceof cqz $$5 && $$5.q() instanceof cqs $$7 && !this.a($$7)) {
            return false;
         }

         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(cqs $$0) {
      return !this.gS() ? false : super.a($$0);
   }

   private boolean gS() {
      return this.g.ac();
   }

   public ewv a(boolean $$0, ewv.a $$1) {
      iu $$2 = this.T();
      float $$3 = this.U();
      boolean $$4 = this.W();
      aro $$5 = this.g.a(this.V());
      if ($$5 != null && $$2 != null) {
         Optional<arp.a> $$6 = a($$5, $$2, $$3, $$4, $$0);
         if ($$6.isPresent()) {
            arp.a $$7 = $$6.get();
            return new ewv($$5, $$7.a(), fdw.c, $$7.b(), 0.0F, $$1);
         } else {
            return ewv.a(this.g.J(), this, $$1);
         }
      } else {
         return new ewv(this.g.J(), this, $$1);
      }
   }

   private static Optional<arp.a> a(aro $$0, iu $$1, float $$2, boolean $$3, boolean $$4) {
      dzo $$5 = $$0.a_($$1);
      dlu $$6 = $$5.b();
      if ($$6 instanceof dsh && ($$3 || $$5.c(dsh.d) > 0) && dsh.a($$0)) {
         Optional<fdw> $$7 = dsh.a(bwj.bS, $$0, $$1);
         if (!$$3 && $$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.b(dsh.d, Integer.valueOf($$5.c(dsh.d) - 1)), 3);
         }

         return $$7.map($$1x -> arp.a.a($$1x, $$1));
      } else if ($$6 instanceof dln && dln.a($$0)) {
         return dln.a(bwj.bS, $$0, $$1, $$5.c(dln.e), $$2).map($$1x -> arp.a.a($$1x, $$1));
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dzo $$9 = $$0.a_($$1.d());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new arp.a(new fdw((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5), $$2)) : Optional.empty();
      }
   }

   @Override
   public void n() {
      this.ao();
      this.y().a(this, bwa.e.e);
      if (!this.k) {
         this.k = true;
         this.f.b(new acz(acz.f, 0.0F));
         this.i = true;
      }
   }

   @Nullable
   public arp a(ewv $$0) {
      if (this.dQ()) {
         return null;
      } else {
         if ($$0.g()) {
            this.f.b(new acz(acz.b, 0.0F));
         }

         aro $$1 = $$0.b();
         aro $$2 = this.y();
         ald<dip> $$3 = $$2.aj();
         if (!$$0.h()) {
            this.ae();
         }

         if ($$1.aj() == $$3) {
            this.f.a(bxm.a($$0), $$0.i());
            this.f.l();
            $$0.j().onTransition(this);
            return this;
         } else {
            this.cM = true;
            exx $$4 = $$1.y_();
            this.f.b(new aek(this.b($$1), (byte)3));
            this.f.b(new ace($$4.q(), $$4.r()));
            avo $$5 = this.g.ag();
            $$5.e(this);
            $$2.a(this, bwa.e.e);
            this.dS();
            bqj $$6 = bqi.a();
            $$6.a("moving");
            if ($$3 == dip.i && $$1.aj() == dip.j) {
               this.cU = this.dt();
            }

            $$6.c();
            $$6.a("placing");
            this.a($$1);
            this.f.a(bxm.a($$0), $$0.i());
            this.f.l();
            $$1.d(this);
            $$6.c();
            this.g($$2);
            this.fE();
            this.f.b(new adt(this.gj()));
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
      this.f.b(new aec($$0, $$1));
   }

   private void g(aro $$0) {
      ald<dip> $$1 = $$0.aj();
      ald<dip> $$2 = this.dV().aj();
      ap.w.a(this, $$1, $$2);
      if ($$1 == dip.j && $$2 == dip.i && this.cU != null) {
         ap.D.a(this, this.cU);
      }

      if ($$2 != dip.j) {
         this.cU = null;
      }
   }

   @Override
   public boolean a(arp $$0) {
      if ($$0.U_()) {
         return this.L() == this;
      } else {
         return this.U_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bwa $$0, int $$1) {
      super.a($$0, $$1);
      this.bQ.d();
   }

   @Override
   public Either<cqs.a, bas> a(iu $$0) {
      ja $$1 = this.dV().a_($$0).c(dpt.e);
      if (this.fQ() || !this.bK()) {
         return Either.left(cqs.a.e);
      } else if (!this.dV().B_().j()) {
         return Either.left(cqs.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cqs.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cqs.a.d);
      } else {
         this.a(this.dV().aj(), $$0, this.dL(), false, true);
         if (this.dV().V()) {
            return Either.left(cqs.a.b);
         } else {
            if (!this.b()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               fdw $$4 = fdw.c($$0);
               List<cnt> $$5 = this.dV()
                  .a(
                     cnt.class,
                     new fdr($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0),
                     $$0x -> $$0x.a(this.y(), this)
                  );
               if (!$$5.isEmpty()) {
                  return Either.left(cqs.a.f);
               }
            }

            Either<cqs.a, bas> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(awv.ap);
               ap.r.a(this);
            });
            if (!this.y().e()) {
               this.a(ww.c("sleep.not_possible"), true);
            }

            ((aro)this.dV()).f();
            return $$6;
         }
      }
   }

   @Override
   public void b(iu $$0) {
      this.a(awv.i.b(awv.n));
      super.b($$0);
   }

   private boolean a(iu $$0, ja $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(iu $$0) {
      fdw $$1 = fdw.c($$0);
      return Math.abs(this.dA() - $$1.a()) <= 3.0 && Math.abs(this.dC() - $$1.b()) <= 2.0 && Math.abs(this.dG() - $$1.c()) <= 3.0;
   }

   private boolean b(iu $$0, ja $$1) {
      iu $$2 = $$0.d();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fQ()) {
         this.y().m().a(this, new abu(this, 2));
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
   public boolean a(aro $$0, bup $$1) {
      return super.a($$0, $$1) || this.Q() && !$$1.a(bus.m) || !this.gI();
   }

   @Override
   protected void b(aro $$0, iu $$1) {
      if (!this.U_()) {
         super.b($$0, $$1);
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, dzo $$2, iu $$3) {
      if (this.df && $$1 && this.Z > 0.0) {
         fdw $$4 = $$3.b().b(0.0, 0.5, 0.0);
         int $$5 = (int)azk.a(50.0 * this.Z, 0.0, 200.0);
         this.y().a(new lp(lx.b, $$2), $$4.d, $$4.e, $$4.f, $$5, 0.3F, 0.3F, 0.3F, 0.15F);
         this.df = false;
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b_(@Nullable bwa $$0) {
      super.b_($$0);
      this.cl = this.dt();
      this.cm = $$0;
      this.w($$0 != null && $$0.aq() == bwj.bH);
   }

   @Override
   protected void o() {
      if (this.dV().u().i()) {
         super.o();
      }
   }

   @Override
   public void a(dyb $$0, boolean $$1) {
      this.f.b(new aca(this.dV(), $$0.aw_()));
      this.f.b(new adr($$0.aw_(), $$1));
   }

   private void gT() {
      this.dp = this.dp % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bua $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.bQ != this.bP) {
            this.p();
         }

         this.gT();
         cuk $$1 = $$0.createMenu(this.dp, this.gi(), this);
         if ($$1 == null) {
            if (this.U_()) {
               this.a(ww.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.f.b(new adq($$1.l, $$1.a(), $$0.m_()));
            this.a($$1);
            this.bQ = $$1;
            return OptionalInt.of(this.dp);
         }
      }
   }

   @Override
   public void a(int $$0, dho $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.f.b(new adl($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(ckx $$0, btr $$1) {
      if (this.bQ != this.bP) {
         this.p();
      }

      this.gT();
      int $$2 = $$0.aa_();
      this.f.b(new ada(this.dp, $$2, $$0.ar()));
      this.bQ = new cvm(this.dp, this.gi(), $$1, $$0, $$2);
      this.a(this.bQ);
   }

   @Override
   public void a(cys $$0, btx $$1) {
      if ($$0.c(kj.V)) {
         if (dcc.a($$0, this.A(), this)) {
            this.bQ.d();
         }

         this.f.b(new adp($$1));
      }
   }

   @Override
   public void a(dwy $$0) {
      this.f.b(aby.a($$0, dwn::e));
   }

   @Override
   public void p() {
      this.f.b(new acl(this.bQ.l));
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
               this.a(awv.C, $$3);
               this.G(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(axf.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(awv.w, $$4);
               this.G(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.bj()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(awv.s, $$5);
               this.G(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.d_()) {
            if ($$1 > 0.0) {
               this.a(awv.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aJ()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.cj()) {
                  this.a(awv.r, $$6);
                  this.G(0.1F * (float)$$6 * 0.01F);
               } else if (this.ci()) {
                  this.a(awv.q, $$6);
                  this.G(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(awv.p, $$6);
                  this.G(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fI()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(awv.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(awv.v, $$8);
            }
         }
      }
   }

   private void q(double $$0, double $$1, double $$2) {
      if (this.bZ() && !r($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         bwa $$4 = this.dk();
         if ($$4 instanceof cte) {
            this.a(awv.x, $$3);
         } else if ($$4 instanceof ctc) {
            this.a(awv.y, $$3);
         } else if ($$4 instanceof cjf) {
            this.a(awv.z, $$3);
         } else if ($$4 instanceof ckx) {
            this.a(awv.A, $$3);
         } else if ($$4 instanceof cog) {
            this.a(awv.D, $$3);
         }
      }
   }

   private static boolean r(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(aws<?> $$0, int $$1) {
      this.cw.b(this, $$0, $$1);
      this.gy().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(aws<?> $$0) {
      this.cw.a(this, $$0, 0);
      this.gy().a($$0, this, fez::c);
   }

   @Override
   public int a(Collection<ddo<?>> $$0) {
      return this.cN.a($$0, this);
   }

   @Override
   public void a(ddo<?> $$0, List<cys> $$1) {
      ap.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<ald<ddj<?>>> $$0) {
      List<ddo<?>> $$1 = $$0.stream().flatMap($$0x -> this.g.aI().b($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<ddo<?>> $$0) {
      return this.cN.b($$0, this);
   }

   @Override
   public void s() {
      super.s();
      this.a(awv.E);
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
   public void a(ww $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void K_() {
      if (!this.bm.f() && this.fy()) {
         this.f.b(new acv(this, (byte)9));
         super.K_();
      }
   }

   @Override
   public void a(eu.a $$0, fdw $$1) {
      super.a($$0, $$1);
      this.f.b(new aea($$0, $$1.d, $$1.e, $$1.f));
   }

   public void a(eu.a $$0, bwa $$1, eu.a $$2) {
      fdw $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.f.b(new aea($$0, $$1, $$2));
   }

   public void a(arp $$0, boolean $$1) {
      this.dg = $$0.dg;
      this.dn = $$0.dn;
      this.h.a($$0.h.b(), $$0.h.c());
      this.x();
      if ($$1) {
         this.eZ().b($$0.eZ());
         this.eZ().c($$0.eZ());
         this.d($$0.eF());
         this.bR = $$0.bR;

         for (bve $$2 : $$0.eC()) {
            this.a(new bve($$2));
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
         if (this.y().O().c(dil.d) || $$0.U_()) {
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
   protected void a(bve $$0, @Nullable bwa $$1) {
      super.a($$0, $$1);
      this.f.b(new agg(this.ar(), $$0, true));
      if ($$0.a(bvg.y)) {
         this.cP = this.af;
         this.cO = this.dt();
      }

      ap.B.a(this, $$1);
   }

   @Override
   protected void a(bve $$0, boolean $$1, @Nullable bwa $$2) {
      super.a($$0, $$1, $$2);
      this.f.b(new agg(this.ar(), $$0, false));
      ap.B.a(this, $$2);
   }

   @Override
   protected void c(Collection<bve> $$0) {
      super.c($$0);

      for (bve $$1 : $$0) {
         this.f.b(new aei(this.ar(), $$1.c()));
         if ($$1.a(bvg.y)) {
            this.cO = null;
         }
      }

      ap.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.f.a(new bxm(new fdw($$0, $$1, $$2), fdw.c, 0.0F, 0.0F), bxn.a(bxn.l, bxn.k));
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.f.a(new bxm(new fdw($$0, $$1, $$2), fdw.c, 0.0F, 0.0F), bxn.j);
   }

   @Override
   public boolean a(aro $$0, double $$1, double $$2, double $$3, Set<bxn> $$4, float $$5, float $$6, boolean $$7) {
      if (this.fQ()) {
         this.a(true, true);
      }

      if ($$7) {
         this.d(this);
      }

      boolean $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$8) {
         this.r($$4.contains(bxn.d) ? this.cA() + $$5 : $$5);
      }

      return $$8;
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      super.e($$0, $$1, $$2);
      this.f.l();
   }

   @Override
   public void b(bwa $$0) {
      this.y().m().a(this, new abu($$0, 4));
   }

   @Override
   public void c(bwa $$0) {
      this.y().m().a(this, new abu($$0, 5));
   }

   @Override
   public void x() {
      if (this.f != null) {
         this.f.b(new adt(this.gj()));
         this.K();
      }
   }

   public aro y() {
      return (aro)this.dV();
   }

   public boolean a(dim $$0) {
      boolean $$1 = this.U_();
      if (!this.h.a($$0)) {
         return false;
      } else {
         this.f.b(new acz(acz.e, (float)$$0.a()));
         if ($$0 == dim.d) {
            this.gx();
            this.bP();
            dfh.a(this);
         } else {
            this.d(this);
            if ($$1) {
               dfh.a(this.y(), this);
            }
         }

         this.x();
         this.fw();
         return true;
      }
   }

   @Override
   public boolean U_() {
      return this.h.b() == dim.d;
   }

   @Override
   public boolean b() {
      return this.h.b() == dim.b;
   }

   public eh z() {
      return this.do;
   }

   public ei A() {
      return new ei(this.z(), this.dt(), this.bU(), this.y(), this.G(), this.al().getString(), this.m_(), this.g, this);
   }

   public void a(ww $$0) {
      this.b($$0, false);
   }

   public void b(ww $$0, boolean $$1) {
      if (this.x($$1)) {
         this.f.a(new afw($$0, $$1), wd.a(() -> {
            if (this.x(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               ww $$3 = ww.b($$2).a(n.o);
               return new afw(ww.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(xl $$0, boolean $$1, ws.a $$2) {
      if (this.gU()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String B() {
      return this.f.m() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(aqy $$0) {
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

   public aqy C() {
      int $$0 = this.au().a(bJ);
      bws $$1 = bws.d.apply(this.au().a(bK));
      return new aqy(this.cS, this.cR, this.cH, this.cJ, $$0, $$1, this.dd, this.de, this.cI);
   }

   public boolean D() {
      return this.cJ;
   }

   public cqp E() {
      return this.cH;
   }

   private boolean x(boolean $$0) {
      return this.cH == cqp.c ? $$0 : true;
   }

   private boolean gU() {
      return this.cH == cqp.a;
   }

   public int F() {
      return this.cR;
   }

   public void a(akb $$0) {
      this.f.b(new aeo($$0.a(), $$0.d().map(akb.a::a)));
   }

   @Override
   public int G() {
      return this.g.c(this.gh());
   }

   public void H() {
      this.cK = af.c();
   }

   public awr I() {
      return this.cw;
   }

   public awq J() {
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

   public bwa L() {
      return (bwa)(this.cL == null ? this : this.cL);
   }

   @Override
   public void d(@Nullable bwa $$0) {
      bwa $$1 = this.L();
      this.cL = (bwa)($$0 == null ? this : $$0);
      if ($$1 != this.cL) {
         if (this.cL.dV() instanceof aro $$2) {
            this.a($$2, this.cL.dA(), this.cL.dC(), this.cL.dG(), Set.of(), this.dL(), this.dN(), false);
         }

         if ($$0 != null) {
            this.y().m().a(this);
         }

         this.f.b(new aev(this.cL));
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
   public void e(bwa $$0) {
      if (this.h.b() == dim.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long N() {
      return this.cK;
   }

   @Nullable
   public ww O() {
      return null;
   }

   public int P() {
      return 0;
   }

   @Override
   public void a(btx $$0) {
      super.a($$0);
      this.gD();
   }

   public boolean Q() {
      return this.cM;
   }

   public void R() {
      this.cM = false;
   }

   public alm S() {
      return this.cv;
   }

   @Nullable
   public iu T() {
      return this.cZ;
   }

   public float U() {
      return this.db;
   }

   public ald<dip> V() {
      return this.cY;
   }

   public boolean W() {
      return this.da;
   }

   public void b(arp $$0) {
      this.a($$0.V(), $$0.T(), $$0.U(), $$0.W(), false);
   }

   public void a(ald<dip> $$0, @Nullable iu $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.cZ) && $$0.equals(this.cY);
         if ($$4 && !$$5) {
            this.a(ww.c("block.minecraft.set_spawn"));
         }

         this.cZ = $$1;
         this.cY = $$0;
         this.db = $$2;
         this.da = $$3;
      } else {
         this.cZ = null;
         this.cY = dip.i;
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

   public aqx Y() {
      return this.cX;
   }

   public void a(aqx $$0) {
      this.cX = $$0;
   }

   @Override
   public void a(awk $$0, awm $$1, float $$2, float $$3) {
      this.f.b(new aft(mf.b.e($$0), $$1, this.dA(), this.dC(), this.dG(), $$2, $$3, this.ae.g()));
   }

   @Override
   public cmx a(cys $$0, boolean $$1, boolean $$2) {
      cmx $$3 = this.b($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dV().b($$3);
         cys $$4 = $$3.f();
         if ($$2) {
            if (!$$4.f()) {
               this.a(awv.f.b($$4.h()), $$0.M());
            }

            this.a(awv.F);
         }

         return $$3;
      }
   }

   @Nullable
   private cmx b(cys $$0, boolean $$1, boolean $$2) {
      if ($$0.f()) {
         return null;
      } else {
         double $$3 = this.dE() - 0.3F;
         cmx $$4 = new cmx(this.dV(), this.dA(), $$3, this.dG(), $$0);
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

   public asx Z() {
      return this.dc;
   }

   public void a(aro $$0) {
      this.a((dip)$$0);
      this.h.a($$0);
   }

   @Nullable
   private static dim a(@Nullable tx $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? dim.a($$0.h($$1)) : null;
   }

   private dim b(@Nullable dim $$0) {
      dim $$1 = this.g.bd();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.g.u();
      }
   }

   @Override
   public void c(@Nullable tx $$0) {
      this.h.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void m(tx $$0) {
      $$0.a("playerGameType", this.h.b().a());
      dim $$1 = this.h.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean aa() {
      return this.dd;
   }

   public boolean c(arp $$0) {
      return $$0 == this ? false : this.dd || $$0.dd;
   }

   @Override
   public boolean c(aro $$0, iu $$1) {
      return super.c($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cys $$0) {
      ap.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cqr $$1 = this.gi();
      cys $$2 = $$1.a($$0);
      this.bQ.b($$1, $$1.j).ifPresent($$1x -> this.bQ.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   @Override
   public void b(cys $$0) {
      if (!this.gi().f($$0)) {
         this.a($$0, false);
      }
   }

   public boolean ab() {
      return this.de;
   }

   @Override
   public Optional<cpx> ac() {
      return Optional.of(this.dg);
   }

   public void b(boolean $$0) {
      this.df = $$0;
   }

   @Override
   public void a(cmx $$0) {
      super.a($$0);
      bwa $$1 = $$0.q();
      if ($$1 != null) {
         ap.S.a(this, $$0.f(), $$1);
      }
   }

   public void a(xn $$0) {
      this.dn = $$0;
   }

   @Nullable
   public xn ad() {
      return this.dn != null && this.dn.b() ? null : this.dn;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.ck = (float)(azk.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dL());
      this.f.b(new adb(this));
   }

   @Override
   public boolean a(bwa $$0, boolean $$1) {
      if (super.a($$0, $$1)) {
         $$0.j(this);
         this.f.a(new bxm(this.dt(), fdw.c, 0.0F, 0.0F), bxn.k);
         if ($$0 instanceof bwz $$2) {
            this.g.ag().a($$2, this.f);
         }

         this.f.b(new afj($$0));
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void ae() {
      bwa $$0 = this.dk();
      super.ae();
      if ($$0 instanceof bwz $$1) {
         for (bve $$2 : $$1.eC()) {
            this.f.b(new aei($$0.ar(), $$2.c()));
         }
      }

      if ($$0 != null) {
         this.f.b(new afj($$0));
      }
   }

   public agi b(aro $$0) {
      return new agi($$0.ai(), $$0.aj(), dju.a($$0.E()), this.h.b(), this.h.c(), $$0.ak(), $$0.D(), this.gH(), this.aC(), $$0.P());
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
   public fdw ah() {
      bwa $$0 = this.dk();
      return $$0 != null && $$0.cW() != this ? $$0.ah() : this.di;
   }

   public void a(fdw $$0) {
      this.di = $$0;
   }

   @Override
   protected float a(bwa $$0, float $$1, bup $$2) {
      return dfh.a(this.y(), this.dZ(), $$0, $$2, $$1);
   }

   @Override
   public void a(cyo $$0, bwk $$1) {
      super.a($$0, $$1);
      this.b(awv.d.b($$0));
   }

   public cqq ai() {
      return this.dj;
   }

   public void a(cqq $$0) {
      this.dj = $$0;
   }

   public fdw aj() {
      float $$0 = this.dj.c() == this.dj.d() ? 0.0F : (this.dj.c() ? 1.0F : -1.0F);
      float $$1 = this.dj.a() == this.dj.b() ? 0.0F : (this.dj.a() ? 1.0F : -1.0F);
      return a(new fdw((double)$$0, 0.0, (double)$$1), 1.0F, this.dL());
   }

   public void a(crw $$0) {
      this.dk.add($$0);
   }

   public void b(crw $$0) {
      this.dk.remove($$0);
   }

   public Set<crw> ak() {
      return this.dk;
   }

   public long c(crw $$0) {
      if ($$0.dV() instanceof aro $$1) {
         dhw $$2 = $$0.dx();
         this.a($$0);
         $$1.i();
         return a($$1, $$2) - 1L;
      } else {
         return 0L;
      }
   }

   public static long a(aro $$0, dhw $$1) {
      $$0.m().a(arv.h, $$1, 2);
      return arv.h.d();
   }

   static record a(fdw a, float b) {
      public static arp.a a(fdw $$0, iu $$1) {
         return new arp.a($$0, b($$0, $$1));
      }

      private static float b(fdw $$0, iu $$1) {
         fdw $$2 = fdw.c($$1).d($$0).d();
         return (float)azk.d(azk.d($$2.f, $$2.d) * 180.0F / (float)Math.PI - 90.0);
      }
   }
}
