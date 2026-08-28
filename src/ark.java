import com.google.common.net.InetAddresses;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ark extends cnx {
   private static final Logger cv = LogUtils.getLogger();
   private static final int cw = 32;
   private static final int cx = 10;
   private static final int cy = 25;
   public static final double b = 1.0;
   private static final bvs cA = new bvs(ale.b("creative_mode_block_range"), 0.5, bvs.a.a);
   private static final bvs cB = new bvs(ale.b("creative_mode_entity_range"), 2.0, bvs.a.a);
   public asl c;
   public final MinecraftServer d;
   public final arl e;
   private final alm cC;
   private final awm cD;
   private float cE = Float.MIN_VALUE;
   private int cF = Integer.MIN_VALUE;
   private int cG = Integer.MIN_VALUE;
   private int cH = Integer.MIN_VALUE;
   private int cI = Integer.MIN_VALUE;
   private int cJ = Integer.MIN_VALUE;
   private float cK = -1.0E8F;
   private int cL = -99999999;
   private boolean cM = true;
   private int cN = -99999999;
   private int cO = 60;
   private cnv cP = cnv.a;
   private arc cQ = arc.a;
   private boolean cR = true;
   private long cS = ad.c();
   @Nullable
   private btr cT;
   private boolean cU;
   public boolean f;
   private final awl cV = new awl();
   @Nullable
   private eyw cW;
   private int cX;
   private boolean cY;
   private int cZ = 2;
   private String da = "en_us";
   @Nullable
   private eyw db;
   @Nullable
   private eyw dc;
   @Nullable
   private eyw dd;
   private kh de = kh.a(0, 0, 0);
   private aqu df = aqu.a;
   private ald<dej> dg = dej.h;
   @Nullable
   private jf dh;
   private boolean di;
   private float dj;
   private final asr dk;
   private boolean dl;
   private boolean dm;
   private boolean dn;
   private cnd do = new cnd(0, 0, 0);
   @Nullable
   private jf dp;
   private eyw dq = eyw.c;
   private final cro dr = new cro() {
      @Override
      public void a(cqz $$0, jx<cvs> $$1, cvs $$2, int[] $$3) {
         ark.this.c.b(new acv($$0.l, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cqz $$0, int $$1, cvs $$2) {
         ark.this.c.b(new acx($$0.l, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cqz $$0, cvs $$1) {
         ark.this.c.b(new afd($$1.u()));
      }

      @Override
      public void a(cqz $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cqz $$0, int $$1, int $$2) {
         ark.this.c.b(new acw($$0.l, $$1, $$2));
      }
   };
   private final crn ds = new crn() {
      @Override
      public void a(cqz $$0, int $$1, cvs $$2) {
         csw $$3 = $$0.b($$1);
         if (!($$3 instanceof css)) {
            if ($$3.c == ark.this.gd()) {
               an.f.a(ark.this, ark.this.gd(), $$2);
            }
         }
      }

      @Override
      public void a(cqz $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private xv dt;
   @Nullable
   public final Object g;
   private int du;
   public boolean h;

   public ark(MinecraftServer $$0, arj $$1, GameProfile $$2, aqv $$3) {
      super($$1, $$1.W(), $$1.X(), $$2);
      this.dk = $$0.a(this);
      this.e = $$0.b(this);
      this.d = $$0;
      this.cD = $$0.ag().a((cnx)this);
      this.cC = $$0.ag().g(this);
      this.b(this.a($$1, $$1.W()).c(), 0.0F, 0.0F);
      this.a($$3);
      this.g = null;
   }

   @Override
   public jf a(arj $$0, jf $$1) {
      eyr $$2 = this.a(buz.a).a(eyw.c);
      jf $$3 = $$1;
      if ($$0.C_().g() && $$0.o().ba().k() != deg.c) {
         int $$4 = Math.max(0, this.d.a($$0));
         int $$5 = azf.a($$0.B_().b((double)$$1.u(), (double)$$1.w()));
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
         int $$10 = azn.a().a($$8);

         for (int $$11 = 0; $$11 < $$8; $$11++) {
            int $$12 = ($$10 + $$9 * $$11) % $$8;
            int $$13 = $$12 % ($$4 * 2 + 1);
            int $$14 = $$12 / ($$4 * 2 + 1);
            int $$15 = $$1.u() + $$13 - $$4;
            int $$16 = $$1.w() + $$14 - $$4;

            try {
               $$3 = are.a($$0, $$15, $$16);
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

      while (this.a($$0, $$2.c($$3.e().c())) && $$3.v() > $$0.H_() + 1) {
         $$3 = $$3.e();
      }

      return $$3;
   }

   private boolean a(arj $$0, eyr $$1) {
      return $$0.a(this, $$1, true);
   }

   private int t(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         cnd.a.parse(new Dynamic(uu.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(cv::error).ifPresent($$0x -> this.do = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         ug $$1 = $$0.p("enteredNetherPosition");
         this.dc = new eyw($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.f = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cV.a($$0.p("recipeBook"), this.d.aI());
      }

      if (this.fN()) {
         this.fO();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.dh = new jf($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.di = $$0.q("SpawnForced");
         this.dj = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.dg = dej.g.parse(uu.a, $$0.c("SpawnDimension")).resultOrPartial(cv::error).orElse(dej.h);
         }
      }

      this.dn = $$0.q("spawn_extra_particles_on_fall");
      vd $$2 = $$0.c("raid_omen_position");
      if ($$2 != null) {
         jf.a.parse(uu.a, $$2).resultOrPartial(cv::error).ifPresent($$0x -> this.dp = $$0x);
      }
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      cnd.a.encodeStart(uu.a, this.do).resultOrPartial(cv::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.f);
      if (this.dc != null) {
         ug $$1 = new ug();
         $$1.a("x", this.dc.d);
         $$1.a("y", this.dc.e);
         $$1.a("z", this.dc.f);
         $$0.a("enteredNetherPosition", $$1);
      }

      btr $$2 = this.dd();
      btr $$3 = this.dg();
      if ($$3 != null && $$2 != this && $$2.dc()) {
         ug $$4 = new ug();
         ug $$5 = new ug();
         $$2.e($$5);
         $$4.a("Attach", $$3.cD());
         $$4.a("Entity", $$5);
         $$0.a("RootVehicle", $$4);
      }

      $$0.a("recipeBook", this.cV.b());
      $$0.a("Dimension", this.dS().ag().a().toString());
      if (this.dh != null) {
         $$0.a("SpawnX", this.dh.u());
         $$0.a("SpawnY", this.dh.v());
         $$0.a("SpawnZ", this.dh.w());
         $$0.a("SpawnForced", this.di);
         $$0.a("SpawnAngle", this.dj);
         ale.a.encodeStart(uu.a, this.dg.a()).resultOrPartial(cv::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }

      $$0.a("spawn_extra_particles_on_fall", this.dn);
      if (this.dp != null) {
         jf.a.encodeStart(uu.a, this.dp).resultOrPartial(cv::error).ifPresent($$1 -> $$0.a("raid_omen_position", $$1));
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gm();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.co = azf.a((float)$$0 / $$1, 0.0F, $$2);
      this.cN = -1;
   }

   public void b(int $$0) {
      this.cm = $$0;
      this.cN = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cN = -1;
   }

   @Override
   public void a(cvs $$0, int $$1) {
      super.a($$0, $$1);
      this.cN = -1;
   }

   private void a(cqz $$0) {
      $$0.a(this.ds);
      $$0.a(this.dr);
   }

   public void h() {
      this.a(this.bY);
   }

   @Override
   public void g_() {
      super.g_();
      this.c.b(aee.a);
   }

   @Override
   public void h_() {
      super.h_();
      this.c.b(new aed(this.eO()));
   }

   @Override
   public void a(dus $$0) {
      an.e.a(this, $$0);
   }

   @Override
   protected cvo k() {
      return new cws(this);
   }

   @Override
   public void l() {
      this.e.a();
      this.do.a();
      this.cO--;
      if (this.ak > 0) {
         this.ak--;
      }

      this.bZ.d();
      if (!this.dS().B && !this.bZ.b(this)) {
         this.s();
         this.bZ = this.bY;
      }

      btr $$0 = this.M();
      if ($$0 != this) {
         if ($$0.bI()) {
            this.a($$0.dx(), $$0.dz(), $$0.dD(), $$0.dI(), $$0.dK());
            this.B().l().a(this);
            if (this.fU()) {
               this.d(this);
            }
         } else {
            this.d(this);
         }
      }

      an.x.a(this);
      if (this.cW != null) {
         an.v.a(this, this.cW, this.ag - this.cX);
      }

      this.o();
      this.p();
      this.gJ();
      this.cC.b(this);
   }

   private void gJ() {
      bvq $$0 = this.g(bvu.g);
      if ($$0 != null) {
         if (this.f()) {
            $$0.a(cA);
         } else {
            $$0.e(cA);
         }
      }

      bvq $$1 = this.g(bvu.j);
      if ($$1 != null) {
         if (this.f()) {
            $$1.a(cB);
         } else {
            $$1.e(cB);
         }
      }
   }

   public void m() {
      try {
         if (!this.Q_() || !this.dl()) {
            super.l();
         }

         for (int $$0 = 0; $$0 < this.gd().b(); $$0++) {
            cvs $$1 = this.gd().a($$0);
            if ($$1.h().ao_()) {
               zl<?> $$2 = ((cud)$$1.h()).a($$1, this.dS(), this);
               if ($$2 != null) {
                  this.c.b($$2);
               }
            }
         }

         if (this.eB() != this.cK || this.cL != this.ca.a() || this.ca.e() == 0.0F != this.cM) {
            this.c.b(new afl(this.eB(), this.ca.a(), this.ca.e()));
            this.cK = this.eB();
            this.cL = this.ca.a();
            this.cM = this.ca.e() == 0.0F;
         }

         if (this.eB() + this.fs() != this.cE) {
            this.cE = this.eB() + this.fs();
            this.a(fae.g, azf.f(this.cE));
         }

         if (this.ca.a() != this.cF) {
            this.cF = this.ca.a();
            this.a(fae.h, azf.f((float)this.cF));
         }

         if (this.cq() != this.cG) {
            this.cG = this.cq();
            this.a(fae.i, azf.f((float)this.cG));
         }

         if (this.eN() != this.cH) {
            this.cH = this.eN();
            this.a(fae.j, azf.f((float)this.cH));
         }

         if (this.cn != this.cJ) {
            this.cJ = this.cn;
            this.a(fae.k, azf.f((float)this.cJ));
         }

         if (this.cm != this.cI) {
            this.cI = this.cm;
            this.a(fae.l, azf.f((float)this.cI));
         }

         if (this.cn != this.cN) {
            this.cN = this.cn;
            this.c.b(new afk(this.co, this.cn, this.cm));
         }

         if (this.ag % 20 == 0) {
            an.q.a(this);
         }
      } catch (Throwable var4) {
         o $$4 = o.a(var4, "Ticking player");
         p $$5 = $$4.a("Player being ticked");
         this.a($$5);
         throw new z($$4);
      }
   }

   @Override
   public void n() {
      if (this.eB() > 0.0F && this.db != null) {
         an.X.a(this, this.db);
      }

      this.db = null;
      super.n();
   }

   @Override
   public void o() {
      if (this.aa > 0.0F && this.db == null) {
         this.db = this.dq();
         if (this.ct != null && this.ct.e <= this.db.e) {
            an.ae.a(this, this.ct, this.cu);
         }
      }
   }

   public void p() {
      if (this.dg() != null && this.dg().bw()) {
         if (this.dd == null) {
            this.dd = this.dq();
         } else {
            an.Y.a(this, this.dd);
         }
      }

      if (this.dd != null && (this.dg() == null || !this.dg().bw())) {
         this.dd = null;
      }
   }

   private void a(fae $$0, int $$1) {
      this.gs().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(bsj $$0) {
      this.a(dzp.p);
      boolean $$1 = this.dS().ac().b(def.n);
      if ($$1) {
         xe $$2 = this.eO().a();
         this.c.a(new aef(this.ap(), $$2), wl.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            xe $$3x = xe.a("death.attack.message_too_long", xe.b($$2x).a(n.o));
            xe $$4x = xe.a("death.attack.even_more_magic", this.R_()).a($$1xx -> $$1xx.a(new xk(xk.a.a, $$3x)));
            return new aef(this.ap(), $$4x);
         }));
         fad $$3 = this.co();
         if ($$3 == null || $$3.k() == fad.b.a) {
            this.d.ag().a($$2, false);
         } else if ($$3.k() == fad.b.c) {
            this.d.ag().a(this, $$2);
         } else if ($$3.k() == fad.b.d) {
            this.d.ag().b(this, $$2);
         }
      } else {
         this.c.b(new aef(this.ap(), xd.a));
      }

      this.gr();
      if (this.dS().ac().b(def.N)) {
         this.gK();
      }

      if (!this.Q_()) {
         this.a(this.B(), $$0);
      }

      this.gs().a(fae.d, this, ezz::b);
      bun $$4 = this.eP();
      if ($$4 != null) {
         this.b(awq.h.b($$4.ao()));
         $$4.a(this, this.bh, $$0);
         this.f($$4);
      }

      this.dS().a(this, (byte)3);
      this.a(awq.N);
      this.a(awq.i.b(awq.m));
      this.a(awq.i.b(awq.n));
      this.aF();
      this.k(0);
      this.c(false);
      this.eO().c();
      this.a(Optional.of(jn.a(this.dS().ag(), this.ds())));
   }

   private void gK() {
      eyr $$0 = new eyr(this.ds()).c(32.0, 10.0, 32.0);
      this.dS().a(bup.class, $$0, btw.f).stream().filter($$0x -> $$0x instanceof bus).forEach($$0x -> ((bus)$$0x).a_((cnx)this));
   }

   @Override
   public void a(btr $$0, int $$1, bsj $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.s($$1);
         this.gs().a(fae.f, this, ezz::b);
         if ($$0 instanceof cnx) {
            this.a(awq.Q);
            this.gs().a(fae.e, this, ezz::b);
         } else {
            this.a(awq.O);
         }

         this.a(this, $$0, fae.m);
         this.a($$0, this, fae.n);
         an.c.a(this, $$0, $$2);
      }
   }

   private void a(faa $$0, faa $$1, fae[] $$2) {
      ezw $$3 = this.gs().e($$1.cF());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gs().a($$2[$$4], $$0, ezz::b);
         }
      }
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.d.n() && this.gL() && $$0.a(awx.m);
         if (!$$2 && this.cO > 0 && !$$0.a(awx.d)) {
            return false;
         } else {
            btr $$3 = $$0.d();
            if ($$3 instanceof cnx $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof coe $$5 && $$5.s() instanceof cnx $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(cnx $$0) {
      return !this.gL() ? false : super.a($$0);
   }

   private boolean gL() {
      return this.d.ac();
   }

   public err a(boolean $$0, err.a $$1) {
      jf $$2 = this.U();
      float $$3 = this.V();
      boolean $$4 = this.X();
      arj $$5 = this.d.a(this.W());
      if ($$5 != null && $$2 != null) {
         Optional<ark.a> $$6 = a($$5, $$2, $$3, $$4, $$0);
         if ($$6.isPresent()) {
            ark.a $$7 = $$6.get();
            return new err($$5, $$7.a(), eyw.c, $$7.b(), 0.0F, $$1);
         } else {
            return err.a(this.d.J(), this, $$1);
         }
      } else {
         return new err(this.d.J(), this, $$1);
      }
   }

   private static Optional<ark.a> a(arj $$0, jf $$1, float $$2, boolean $$3, boolean $$4) {
      dus $$5 = $$0.a_($$1);
      dhm $$6 = $$5.b();
      if ($$6 instanceof dnv && ($$3 || $$5.c(dnv.d) > 0) && dnv.a($$0)) {
         Optional<eyw> $$7 = dnv.a(bty.by, $$0, $$1);
         if (!$$3 && $$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.b(dnv.d, Integer.valueOf($$5.c(dnv.d) - 1)), 3);
         }

         return $$7.map($$1x -> ark.a.a($$1x, $$1));
      } else if ($$6 instanceof dhf && dhf.a($$0)) {
         return dhf.a(bty.by, $$0, $$1, $$5.c(dhf.aF), $$2).map($$1x -> ark.a.a($$1x, $$1));
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dus $$9 = $$0.a_($$1.d());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new ark.a(new eyw((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5), $$2)) : Optional.empty();
      }
   }

   @Override
   public void q() {
      this.am();
      this.B().a(this, btr.c.e);
      if (!this.h) {
         this.h = true;
         this.c.b(new adh(adh.f, 0.0F));
         this.f = true;
      }
   }

   @Nullable
   public cnx a(err $$0) {
      if (this.dN()) {
         return null;
      } else {
         if ($$0.f()) {
            this.c.b(new adh(adh.b, 0.0F));
         }

         arj $$1 = $$0.a();
         arj $$2 = this.B();
         ald<dej> $$3 = $$2.ag();
         if ($$1.ag() == $$3) {
            this.c.a($$0.b().d, $$0.b().e, $$0.b().f, $$0.d(), $$0.e());
            this.c.l();
            $$0.g().onTransition(this);
            return this;
         } else {
            this.cU = true;
            esv $$4 = $$1.z_();
            this.c.b(new aep(this.b($$1), (byte)3));
            this.c.b(new acn($$4.q(), $$4.r()));
            avj $$5 = this.d.ag();
            $$5.e(this);
            $$2.a(this, btr.c.e);
            this.dP();
            $$2.ah().a("moving");
            if ($$3 == dej.h && $$1.ag() == dej.i) {
               this.dc = this.dq();
            }

            this.c($$0);
            $$2.ah().c();
            $$2.ah().a("placing");
            this.a($$1);
            this.c.a($$0.b().d, $$0.b().e, $$0.b().f, $$0.d(), $$0.e());
            this.c.l();
            $$1.d(this);
            $$2.ah().c();
            this.c($$2);
            this.fB();
            this.c.b(new aeb(this.ge()));
            $$5.a(this, $$1);
            $$5.f(this);
            $$5.d(this);
            $$0.g().onTransition(this);
            this.cN = -1;
            this.cK = -1.0F;
            this.cL = -1;
            return this;
         }
      }
   }

   private void c(arj $$0) {
      ald<dej> $$1 = $$0.ag();
      ald<dej> $$2 = this.dS().ag();
      an.w.a(this, $$1, $$2);
      if ($$1 == dej.i && $$2 == dej.h && this.dc != null) {
         an.D.a(this, this.dc);
      }

      if ($$2 != dej.i) {
         this.dc = null;
      }
   }

   @Override
   public boolean a(ark $$0) {
      if ($$0.Q_()) {
         return this.M() == this;
      } else {
         return this.Q_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(btr $$0, int $$1) {
      super.a($$0, $$1);
      this.bZ.d();
   }

   @Override
   public Either<cnx.a, bak> a(jf $$0) {
      jk $$1 = this.dS().a_($$0).c(dli.aF);
      if (this.fN() || !this.bI()) {
         return Either.left(cnx.a.e);
      } else if (!this.dS().C_().j()) {
         return Either.left(cnx.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cnx.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cnx.a.d);
      } else {
         this.a(this.dS().ag(), $$0, this.dI(), false, true);
         if (this.dS().S()) {
            return Either.left(cnx.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               eyw $$4 = eyw.c($$0);
               List<cld> $$5 = this.dS()
                  .a(cld.class, new eyr($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.a(this));
               if (!$$5.isEmpty()) {
                  return Either.left(cnx.a.f);
               }
            }

            Either<cnx.a, bak> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(awq.ap);
               an.r.a(this);
            });
            if (!this.B().d()) {
               this.a(xe.c("sleep.not_possible"), true);
            }

            ((arj)this.dS()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(jf $$0) {
      this.a(awq.i.b(awq.n));
      super.b($$0);
   }

   private boolean a(jf $$0, jk $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(jf $$0) {
      eyw $$1 = eyw.c($$0);
      return Math.abs(this.dx() - $$1.a()) <= 3.0 && Math.abs(this.dz() - $$1.b()) <= 2.0 && Math.abs(this.dD() - $$1.c()) <= 3.0;
   }

   private boolean b(jf $$0, jk $$1) {
      jf $$2 = $$0.d();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fN()) {
         this.B().l().a(this, new acd(this, 2));
      }

      super.a($$0, $$1);
      if (this.c != null) {
         this.c.a(this.dx(), this.dz(), this.dD(), this.dI(), this.dK());
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.bN();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public boolean b(bsj $$0) {
      return super.b($$0) || this.R() && !$$0.a(bsm.m);
   }

   @Override
   protected void a(double $$0, boolean $$1, dus $$2, jf $$3) {
   }

   @Override
   protected void b(arj $$0, jf $$1) {
      if (!this.Q_()) {
         super.b($$0, $$1);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.dl()) {
         this.a($$3, new eyw($$0, $$1, $$2));
         jf $$4 = this.aN();
         dus $$5 = this.dS().a_($$4);
         if (this.dn && $$3 && this.aa > 0.0F) {
            eyw $$6 = $$4.b().b(0.0, 0.5, 0.0);
            int $$7 = (int)azf.a(50.0F * this.aa, 0.0F, 200.0F);
            this.B().a(new lg(lo.b, $$5), $$6.d, $$6.e, $$6.f, $$7, 0.3F, 0.3F, 0.3F, 0.15F);
            this.dn = false;
         }

         super.a($$1, $$3, $$5, $$4);
      }
   }

   @Override
   public void a(@Nullable btr $$0) {
      super.a($$0);
      this.ct = this.dq();
      this.cu = $$0;
      this.w($$0 != null && $$0.ao() == bty.bn);
   }

   @Override
   protected void r() {
      if (this.dS().s().i()) {
         super.r();
      }
   }

   @Override
   public void a(dth $$0, boolean $$1) {
      this.c.b(new acj(this.dS(), $$0.aC_()));
      this.c.b(new adz($$0.aC_(), $$1));
   }

   private void gM() {
      this.du = this.du % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bru $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.bZ != this.bY) {
            this.s();
         }

         this.gM();
         cqz $$1 = $$0.createMenu(this.du, this.gd(), this);
         if ($$1 == null) {
            if (this.Q_()) {
               this.a(xe.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.c.b(new ady($$1.l, $$1.a(), $$0.R_()));
            this.a($$1);
            this.bZ = $$1;
            return OptionalInt.of(this.du);
         }
      }
   }

   @Override
   public void a(int $$0, ddh $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.c.b(new adt($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(cih $$0, brl $$1) {
      if (this.bZ != this.bY) {
         this.s();
      }

      this.gM();
      int $$2 = $$0.af_();
      this.c.b(new adi(this.du, $$2, $$0.ap()));
      this.bZ = new csb(this.du, this.gd(), $$1, $$0, $$2);
      this.a(this.bZ);
   }

   @Override
   public void a(cvs $$0, brr $$1) {
      if ($$0.a(cvw.ub)) {
         if (cxo.a($$0, this.dk(), this)) {
            this.bZ.d();
         }

         this.c.b(new adx($$1));
      }
   }

   @Override
   public void a(dsf $$0) {
      this.c.b(ach.a($$0, drv::e));
   }

   @Override
   public void s() {
      this.c.b(new acu(this.bZ.l));
      this.t();
   }

   @Override
   public void t() {
      this.bZ.a(this);
      this.bY.a(this.bZ);
      this.bZ = this.bY;
   }

   @Override
   public void u() {
      double $$0 = this.dx();
      double $$1 = this.dz();
      double $$2 = this.dD();
      super.u();
      this.q(this.dx() - $$0, this.dz() - $$1, this.dD() - $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (!this.bW() && !r($$0, $$1, $$2)) {
         if (this.ch()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(awq.C, $$3);
               this.G(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(axb.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(awq.w, $$4);
               this.G(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.bi()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(awq.s, $$5);
               this.G(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.q_()) {
            if ($$1 > 0.0) {
               this.a(awq.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aH()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.cg()) {
                  this.a(awq.r, $$6);
                  this.G(0.1F * (float)$$6 * 0.01F);
               } else if (this.cf()) {
                  this.a(awq.q, $$6);
                  this.G(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(awq.p, $$6);
                  this.G(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fF()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(awq.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(awq.v, $$8);
            }
         }
      }
   }

   private void q(double $$0, double $$1, double $$2) {
      if (this.bW() && !r($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         btr $$4 = this.dg();
         if ($$4 instanceof cpv) {
            this.a(awq.x, $$3);
         } else if ($$4 instanceof cpx) {
            this.a(awq.y, $$3);
         } else if ($$4 instanceof cgu) {
            this.a(awq.z, $$3);
         } else if ($$4 instanceof cih) {
            this.a(awq.A, $$3);
         } else if ($$4 instanceof clq) {
            this.a(awq.D, $$3);
         }
      }
   }

   private static boolean r(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(awn<?> $$0, int $$1) {
      this.cD.b(this, $$0, $$1);
      this.gs().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(awn<?> $$0) {
      this.cD.a(this, $$0, 0);
      this.gs().a($$0, this, ezz::c);
   }

   @Override
   public int a(Collection<dam<?>> $$0) {
      return this.cV.a($$0, this);
   }

   @Override
   public void a(dam<?> $$0, List<cvs> $$1) {
      an.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<ale> $$0) {
      List<dam<?>> $$1 = $$0.stream().flatMap($$0x -> this.d.aI().a($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<dam<?>> $$0) {
      return this.cV.b($$0, this);
   }

   @Override
   public void v() {
      super.v();
      this.a(awq.E);
      if (this.cg()) {
         this.G(0.2F);
      } else {
         this.G(0.05F);
      }
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cN = -1;
   }

   @Override
   public void w() {
      this.cY = true;
      this.bM();
      if (this.fN()) {
         this.a(true, false);
      }
   }

   public boolean x() {
      return this.cY;
   }

   public void y() {
      this.cK = -1.0E8F;
   }

   @Override
   public void a(xe $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void z() {
      if (!this.bv.f() && this.fv()) {
         this.c.b(new ade(this, (byte)9));
         super.z();
      }
   }

   @Override
   public void a(fg.a $$0, eyw $$1) {
      super.a($$0, $$1);
      this.c.b(new aei($$0, $$1.d, $$1.e, $$1.f));
   }

   public void a(fg.a $$0, btr $$1, fg.a $$2) {
      eyw $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.c.b(new aei($$0, $$1, $$2));
   }

   public void a(ark $$0, boolean $$1) {
      this.do = $$0.do;
      this.dt = $$0.dt;
      this.e.a($$0.e.b(), $$0.e.c());
      this.A();
      if ($$1) {
         this.eV().b($$0.eV());
         this.eV().c($$0.eV());
         this.x($$0.eB());
         this.ca = $$0.ca;

         for (bsy $$2 : $$0.ey()) {
            this.a(new bsy($$2));
         }

         this.gd().a($$0.gd());
         this.cm = $$0.cm;
         this.cn = $$0.cn;
         this.co = $$0.co;
         this.r($$0.fY());
         this.at = $$0.at;
      } else {
         this.eV().b($$0.eV());
         this.x(this.eQ());
         if (this.dS().ac().b(def.d) || $$0.Q_()) {
            this.gd().a($$0.gd());
            this.cm = $$0.cm;
            this.cn = $$0.cn;
            this.co = $$0.co;
            this.r($$0.fY());
         }
      }

      this.cp = $$0.cp;
      this.bX = $$0.bX;
      this.at().a(bT, $$0.at().a(bT));
      this.cN = -1;
      this.cK = -1.0F;
      this.cL = -1;
      this.cV.a($$0.cV);
      this.f = $$0.f;
      this.dc = $$0.dc;
      this.df = $$0.df;
      this.i($$0.gu());
      this.j($$0.gv());
      this.a($$0.gC());
   }

   @Override
   protected void a(bsy $$0, @Nullable btr $$1) {
      super.a($$0, $$1);
      this.c.b(new agk(this.ap(), $$0, true));
      if ($$0.a(bta.y)) {
         this.cX = this.ag;
         this.cW = this.dq();
      }

      an.B.a(this, $$1);
   }

   @Override
   protected void a(bsy $$0, boolean $$1, @Nullable btr $$2) {
      super.a($$0, $$1, $$2);
      this.c.b(new agk(this.ap(), $$0, false));
      an.B.a(this, $$2);
   }

   @Override
   protected void c(Collection<bsy> $$0) {
      super.c($$0);

      for (bsy $$1 : $$0) {
         this.c.b(new aen(this.ap(), $$1.c()));
         if ($$1.a(bta.y)) {
            this.cW = null;
         }
      }

      an.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.c.a($$0, $$1, $$2, this.dI(), this.dK(), bva.g);
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.c.a(this.dx() + $$0, this.dz() + $$1, this.dD() + $$2, this.dI(), this.dK(), bva.f);
   }

   @Override
   public boolean a(arj $$0, double $$1, double $$2, double $$3, Set<bva> $$4, float $$5, float $$6, boolean $$7) {
      ddp $$8 = new ddp(jf.a($$1, $$2, $$3));
      $$0.l().a(aro.f, $$8, 1, this.ap());
      if (this.fN()) {
         this.a(true, true);
      }

      this.a($$0, $$1, $$2, $$3, $$5, $$6, $$7);
      this.q($$5);
      return true;
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      super.e($$0, $$1, $$2);
      this.c.l();
   }

   @Override
   public void b(btr $$0) {
      this.B().l().a(this, new acd($$0, 4));
   }

   @Override
   public void c(btr $$0) {
      this.B().l().a(this, new acd($$0, 5));
   }

   @Override
   public void A() {
      if (this.c != null) {
         this.c.b(new aeb(this.ge()));
         this.L();
      }
   }

   public arj B() {
      return (arj)this.dS();
   }

   public boolean a(deg $$0) {
      boolean $$1 = this.Q_();
      if (!this.e.a($$0)) {
         return false;
      } else {
         this.c.b(new adh(adh.e, (float)$$0.a()));
         if ($$0 == deg.d) {
            this.gr();
            this.af();
            dbp.a(this);
         } else {
            this.d(this);
            if ($$1) {
               dbp.a(this.B(), this);
            }
         }

         this.A();
         this.ft();
         return true;
      }
   }

   @Override
   public boolean Q_() {
      return this.e.b() == deg.d;
   }

   @Override
   public boolean f() {
      return this.e.b() == deg.b;
   }

   @Override
   public void a(xe $$0) {
      this.b($$0, false);
   }

   public void b(xe $$0, boolean $$1) {
      if (this.x($$1)) {
         this.c.a(new agb($$0, $$1), wl.a(() -> {
            if (this.x(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               xe $$3 = xe.b($$2).a(n.o);
               return new agb(xe.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(xt $$0, boolean $$1, xa.a $$2) {
      if (this.gN()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String C() {
      return this.c.m() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(aqv $$0) {
      this.da = $$0.b();
      this.cZ = $$0.c();
      this.cP = $$0.d();
      this.cR = $$0.e();
      this.dl = $$0.h();
      this.dm = $$0.i();
      this.cQ = $$0.j();
      this.at().a(bT, (byte)$$0.f());
      this.at().a(bU, (byte)$$0.g().b());
   }

   public aqv D() {
      int $$0 = this.at().a(bT);
      buh $$1 = buh.d.apply(this.at().a(bU));
      return new aqv(this.da, this.cZ, this.cP, this.cR, $$0, $$1, this.dl, this.dm, this.cQ);
   }

   public boolean E() {
      return this.cR;
   }

   public cnv F() {
      return this.cP;
   }

   private boolean x(boolean $$0) {
      return this.cP == cnv.c ? $$0 : true;
   }

   private boolean gN() {
      return this.cP == cnv.a;
   }

   public int G() {
      return this.cZ;
   }

   public void a(akb $$0) {
      this.c.b(new aet($$0.a(), $$0.d().map(akb.a::a)));
   }

   @Override
   protected int H() {
      return this.d.c(this.gc());
   }

   @Override
   public void I() {
      this.cS = ad.c();
   }

   public awm J() {
      return this.cD;
   }

   public awl K() {
      return this.cV;
   }

   @Override
   protected void L() {
      if (this.Q_()) {
         this.ew();
         this.k(true);
      } else {
         super.L();
      }
   }

   public btr M() {
      return (btr)(this.cT == null ? this : this.cT);
   }

   @Override
   public void d(@Nullable btr $$0) {
      btr $$1 = this.M();
      this.cT = (btr)($$0 == null ? this : $$0);
      if ($$1 != this.cT) {
         if (this.cT.dS() instanceof arj $$2) {
            this.a($$2, this.cT.dx(), this.cT.dz(), this.cT.dD(), Set.of(), this.dI(), this.dK(), false);
         }

         if ($$0 != null) {
            this.B().l().a(this);
         }

         this.c.b(new afa(this.cT));
         this.c.l();
      }
   }

   @Override
   protected void N() {
      if (!this.cU) {
         super.N();
      }
   }

   @Override
   public void e(btr $$0) {
      if (this.e.b() == deg.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long O() {
      return this.cS;
   }

   @Nullable
   public xe P() {
      return null;
   }

   public int Q() {
      return 0;
   }

   @Override
   public void a(brr $$0) {
      super.a($$0);
      this.gx();
   }

   public boolean R() {
      return this.cU;
   }

   public void S() {
      this.cU = false;
   }

   public alm T() {
      return this.cC;
   }

   public void a(arj $$0, double $$1, double $$2, double $$3, float $$4, float $$5, boolean $$6) {
      if ($$6) {
         this.d(this);
      }

      this.af();
      this.a(new err($$0, new eyw($$1, $$2, $$3), eyw.c, $$4, $$5, err.a));
   }

   @Nullable
   public jf U() {
      return this.dh;
   }

   public float V() {
      return this.dj;
   }

   public ald<dej> W() {
      return this.dg;
   }

   public boolean X() {
      return this.di;
   }

   public void b(ark $$0) {
      this.a($$0.W(), $$0.U(), $$0.V(), $$0.X(), false);
   }

   public void a(ald<dej> $$0, @Nullable jf $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.dh) && $$0.equals(this.dg);
         if ($$4 && !$$5) {
            this.a(xe.c("block.minecraft.set_spawn"));
         }

         this.dh = $$1;
         this.dg = $$0;
         this.dj = $$2;
         this.di = $$3;
      } else {
         this.dh = null;
         this.dg = dej.h;
         this.dj = 0.0F;
         this.di = false;
      }
   }

   public kh Y() {
      return this.de;
   }

   public void a(kh $$0) {
      this.de = $$0;
   }

   public aqu Z() {
      return this.df;
   }

   public void a(aqu $$0) {
      this.df = $$0;
   }

   @Override
   public void a(awf $$0, awh $$1, float $$2, float $$3) {
      this.c.b(new afy(lv.b.e($$0), $$1, this.dx(), this.dz(), this.dD(), $$2, $$3, this.af.g()));
   }

   @Override
   public ckh a(cvs $$0, boolean $$1, boolean $$2) {
      ckh $$3 = this.b($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dS().b($$3);
         cvs $$4 = $$3.m();
         if ($$2) {
            if (!$$4.f()) {
               this.a(awq.f.b($$4.h()), $$0.K());
            }

            this.a(awq.F);
         }

         return $$3;
      }
   }

   @Nullable
   private ckh b(cvs $$0, boolean $$1, boolean $$2) {
      if ($$0.f()) {
         return null;
      } else {
         double $$3 = this.dB() - 0.3F;
         ckh $$4 = new ckh(this.dS(), this.dx(), $$3, this.dD(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.af.i() * 0.5F;
            float $$6 = this.af.i() * (float) (Math.PI * 2);
            $$4.n((double)(-azf.a($$6) * $$5), 0.2F, (double)(azf.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = azf.a(this.dK() * (float) (Math.PI / 180.0));
            float $$9 = azf.b(this.dK() * (float) (Math.PI / 180.0));
            float $$10 = azf.a(this.dI() * (float) (Math.PI / 180.0));
            float $$11 = azf.b(this.dI() * (float) (Math.PI / 180.0));
            float $$12 = this.af.i() * (float) (Math.PI * 2);
            float $$13 = 0.02F * this.af.i();
            $$4.n(
               (double)(-$$10 * $$9 * 0.3F) + Math.cos((double)$$12) * (double)$$13,
               (double)(-$$8 * 0.3F + 0.1F + (this.af.i() - this.af.i()) * 0.1F),
               (double)($$11 * $$9 * 0.3F) + Math.sin((double)$$12) * (double)$$13
            );
         }

         return $$4;
      }
   }

   public asr aa() {
      return this.dk;
   }

   public void a(arj $$0) {
      this.a((dej)$$0);
      this.e.a($$0);
   }

   @Nullable
   private static deg a(@Nullable ug $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? deg.a($$0.h($$1)) : null;
   }

   private deg b(@Nullable deg $$0) {
      deg $$1 = this.d.be();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.d.u_();
      }
   }

   @Override
   public void c(@Nullable ug $$0) {
      this.e.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void k(ug $$0) {
      $$0.a("playerGameType", this.e.b().a());
      deg $$1 = this.e.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean ab() {
      return this.dl;
   }

   public boolean c(ark $$0) {
      return $$0 == this ? false : this.dl || $$0.dl;
   }

   @Override
   public boolean a(dej $$0, jf $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cvs $$0) {
      an.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cnw $$1 = this.gd();
      cvs $$2 = $$1.a($$0);
      this.bZ.b($$1, $$1.j).ifPresent($$1x -> this.bZ.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean ac() {
      return this.dm;
   }

   @Override
   public Optional<cnd> ad() {
      return Optional.of(this.do);
   }

   public void b(boolean $$0) {
      this.dn = $$0;
   }

   @Override
   public void a(ckh $$0) {
      super.a($$0);
      btr $$1 = $$0.s();
      if ($$1 != null) {
         an.S.a(this, $$0.m(), $$1);
      }
   }

   public void a(xv $$0) {
      this.dt = $$0;
   }

   @Nullable
   public xv ae() {
      return this.dt != null && this.dt.b() ? null : this.dt;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cs = (float)(azf.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dI());
      this.c.b(new adj(this));
   }

   @Override
   public boolean a(btr $$0, boolean $$1) {
      if (super.a($$0, $$1)) {
         $$0.j(this);
         this.c.a(this.dx(), this.dz(), this.dD(), this.dI(), this.dK());
         if ($$0 instanceof bun $$2) {
            this.d.ag().a($$2, this.c);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void af() {
      btr $$0 = this.dg();
      super.af();
      if ($$0 instanceof bun $$1) {
         for (bsy $$2 : $$1.ey()) {
            this.c.b(new aen($$0.ap(), $$2.c()));
         }
      }
   }

   public agm b(arj $$0) {
      return new agm($$0.af(), $$0.ag(), dfm.a($$0.C()), this.e.b(), this.e.c(), $$0.aj(), $$0.B(), this.gC(), this.aB(), $$0.N());
   }

   @Override
   public void c(jf $$0) {
      this.dp = $$0;
   }

   public void ag() {
      this.dp = null;
   }

   @Nullable
   public jf ah() {
      return this.dp;
   }

   @Override
   public eyw ai() {
      btr $$0 = this.dg();
      return $$0 != null && $$0.cU() != this ? $$0.ai() : this.dq;
   }

   public void a(eyw $$0) {
      this.dq = $$0;
   }

   @Override
   protected float a(btr $$0, float $$1, bsj $$2) {
      return dbp.a(this.B(), this.dW(), $$0, $$2, $$1);
   }

   @Override
   public void a(cvn $$0, btz $$1) {
      super.a($$0, $$1);
      this.b(awq.d.b($$0));
   }

   static record a(eyw a, float b) {
      public static ark.a a(eyw $$0, jf $$1) {
         return new ark.a($$0, b($$0, $$1));
      }

      private static float b(eyw $$0, jf $$1) {
         eyw $$2 = eyw.c($$1).d($$0).d();
         return (float)azf.d(azf.d($$2.f, $$2.d) * 180.0F / (float)Math.PI - 90.0);
      }
   }
}
