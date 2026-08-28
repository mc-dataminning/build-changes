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

public class arn extends coh {
   private static final Logger cw = LogUtils.getLogger();
   private static final int cx = 32;
   private static final int cy = 10;
   private static final int cA = 25;
   public static final double b = 1.0;
   public static final double c = 3.0;
   private static final bwb cB = new bwb(alh.b("creative_mode_block_range"), 0.5, bwb.a.a);
   private static final bwb cC = new bwb(alh.b("creative_mode_entity_range"), 2.0, bwb.a.a);
   public asp d;
   public final MinecraftServer e;
   public final aro f;
   private final alp cD;
   private final awq cE;
   private float cF = Float.MIN_VALUE;
   private int cG = Integer.MIN_VALUE;
   private int cH = Integer.MIN_VALUE;
   private int cI = Integer.MIN_VALUE;
   private int cJ = Integer.MIN_VALUE;
   private int cK = Integer.MIN_VALUE;
   private float cL = -1.0E8F;
   private int cM = -99999999;
   private boolean cN = true;
   private int cO = -99999999;
   private int cP = 60;
   private coe cQ = coe.a;
   private arf cR = arf.a;
   private boolean cS = true;
   private long cT = ad.c();
   @Nullable
   private btz cU;
   private boolean cV;
   public boolean g;
   private final awp cW = new awp();
   @Nullable
   private ezh cX;
   private int cY;
   private boolean cZ;
   private int da = 2;
   private String db = "en_us";
   @Nullable
   private ezh dc;
   @Nullable
   private ezh dd;
   @Nullable
   private ezh de;
   private ki df = ki.a(0, 0, 0);
   private aqx dg = aqx.a;
   private alg<dev> dh = dev.i;
   @Nullable
   private jg di;
   private boolean dj;
   private float dk;
   private final asv dl;
   private boolean dm;
   private boolean dn;
   private boolean do;
   private cnm dp = new cnm(0, 0, 0);
   @Nullable
   private jg dq;
   private ezh dr = ezh.c;
   private cof ds = cof.b;
   private final cry dt = new cry() {
      @Override
      public void a(crj $$0, jy<cvx> $$1, cvx $$2, int[] $$3) {
         arn.this.d.b(new acy($$0.l, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(crj $$0, int $$1, cvx $$2) {
         arn.this.d.b(new ada($$0.l, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(crj $$0, cvx $$1) {
         arn.this.d.b(new afg($$1.v()));
      }

      @Override
      public void a(crj $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(crj $$0, int $$1, int $$2) {
         arn.this.d.b(new acz($$0.l, $$1, $$2));
      }
   };
   private final crx du = new crx() {
      @Override
      public void a(crj $$0, int $$1, cvx $$2) {
         ctg $$3 = $$0.b($$1);
         if (!($$3 instanceof ctc)) {
            if ($$3.c == arn.this.gk()) {
               an.f.a(arn.this, arn.this.gk(), $$2);
            }
         }
      }

      @Override
      public void a(crj $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private xy dv;
   @Nullable
   public final Object h;
   private int dw;
   public boolean i;

   public arn(MinecraftServer $$0, arm $$1, GameProfile $$2, aqy $$3) {
      super($$1, $$1.W(), $$1.X(), $$2);
      this.dl = $$0.a(this);
      this.f = $$0.b(this);
      this.e = $$0;
      this.cE = $$0.ag().a((coh)this);
      this.cD = $$0.ag().g(this);
      this.b(this.a($$1, $$1.W()).c(), 0.0F, 0.0F);
      this.a($$3);
      this.h = null;
   }

   @Override
   public jg a(arm $$0, jg $$1) {
      ezc $$2 = this.a(bvh.a).a(ezh.c);
      jg $$3 = $$1;
      if ($$0.D_().g() && $$0.o().ba().k() != des.c) {
         int $$4 = Math.max(0, this.e.a($$0));
         int $$5 = azj.a($$0.C_().b((double)$$1.u(), (double)$$1.w()));
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
         int $$10 = azr.a().a($$8);

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

      while (!this.a($$0, $$2.c($$3.c())) && $$3.v() < $$0.an()) {
         $$3 = $$3.d();
      }

      while (this.a($$0, $$2.c($$3.e().c())) && $$3.v() > $$0.I_() + 1) {
         $$3 = $$3.e();
      }

      return $$3;
   }

   private boolean a(arm $$0, ezc $$1) {
      return $$0.a(this, $$1, true);
   }

   private int t(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         cnm.a.parse(new Dynamic(ux.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(cw::error).ifPresent($$0x -> this.dp = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         uj $$1 = $$0.p("enteredNetherPosition");
         this.dd = new ezh($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.g = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cW.a($$0.p("recipeBook"), this.e.aI());
      }

      if (this.fT()) {
         this.fU();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.di = new jg($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.dj = $$0.q("SpawnForced");
         this.dk = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.dh = dev.h.parse(ux.a, $$0.c("SpawnDimension")).resultOrPartial(cw::error).orElse(dev.i);
         }
      }

      this.do = $$0.q("spawn_extra_particles_on_fall");
      vg $$2 = $$0.c("raid_omen_position");
      if ($$2 != null) {
         jg.a.parse(ux.a, $$2).resultOrPartial(cw::error).ifPresent($$0x -> this.dq = $$0x);
      }
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      cnm.a.encodeStart(ux.a, this.dp).resultOrPartial(cw::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.g);
      if (this.dd != null) {
         uj $$1 = new uj();
         $$1.a("x", this.dd.d);
         $$1.a("y", this.dd.e);
         $$1.a("z", this.dd.f);
         $$0.a("enteredNetherPosition", $$1);
      }

      btz $$2 = this.dh();
      btz $$3 = this.dl();
      if ($$3 != null && $$2 != this && $$2.dg()) {
         uj $$4 = new uj();
         uj $$5 = new uj();
         $$2.e($$5);
         $$4.a("Attach", $$3.cH());
         $$4.a("Entity", $$5);
         $$0.a("RootVehicle", $$4);
      }

      $$0.a("recipeBook", this.cW.b());
      $$0.a("Dimension", this.dX().ag().a().toString());
      if (this.di != null) {
         $$0.a("SpawnX", this.di.u());
         $$0.a("SpawnY", this.di.v());
         $$0.a("SpawnZ", this.di.w());
         $$0.a("SpawnForced", this.dj);
         $$0.a("SpawnAngle", this.dk);
         alh.a.encodeStart(ux.a, this.dh.a()).resultOrPartial(cw::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }

      $$0.a("spawn_extra_particles_on_fall", this.do);
      if (this.dq != null) {
         jg.a.encodeStart(ux.a, this.dq).resultOrPartial(cw::error).ifPresent($$1 -> $$0.a("raid_omen_position", $$1));
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gt();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.cp = azj.a((float)$$0 / $$1, 0.0F, $$2);
      this.cO = -1;
   }

   public void b(int $$0) {
      this.cn = $$0;
      this.cO = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cO = -1;
   }

   @Override
   public void a(cvx $$0, int $$1) {
      super.a($$0, $$1);
      this.cO = -1;
   }

   private void a(crj $$0) {
      $$0.a(this.du);
      $$0.a(this.dt);
   }

   public void h() {
      this.a(this.bZ);
   }

   @Override
   public void g_() {
      super.g_();
      this.d.b(aeh.a);
   }

   @Override
   public void h_() {
      super.h_();
      this.d.b(new aeg(this.eT()));
   }

   @Override
   public void a(dvd $$0) {
      an.e.a(this, $$0);
   }

   @Override
   protected cvu k() {
      return new cwx(this);
   }

   @Override
   public void l() {
      this.f.a();
      this.dp.a();
      this.cP--;
      if (this.ak > 0) {
         this.ak--;
      }

      this.ca.d();
      if (!this.dX().C && !this.ca.b(this)) {
         this.s();
         this.ca = this.bZ;
      }

      btz $$0 = this.M();
      if ($$0 != this) {
         if ($$0.bM()) {
            this.a($$0.dC(), $$0.dE(), $$0.dI(), $$0.dN(), $$0.dP());
            this.B().l().a(this);
            if (this.gb()) {
               this.d(this);
            }
         } else {
            this.d(this);
         }
      }

      an.x.a(this);
      if (this.cX != null) {
         an.v.a(this, this.cX, this.ag - this.cY);
      }

      this.o();
      this.p();
      this.gQ();
      this.cD.b(this);
   }

   private void gQ() {
      bvz $$0 = this.g(bwd.g);
      if ($$0 != null) {
         if (this.f()) {
            $$0.a(cB);
         } else {
            $$0.e(cB);
         }
      }

      bvz $$1 = this.g(bwd.j);
      if ($$1 != null) {
         if (this.f()) {
            $$1.a(cC);
         } else {
            $$1.e(cC);
         }
      }
   }

   public void m() {
      try {
         if (!this.R_() || !this.dq()) {
            super.l();
         }

         for (int $$0 = 0; $$0 < this.gk().b(); $$0++) {
            cvx $$1 = this.gk().a($$0);
            if ($$1.h().ap_()) {
               zo<?> $$2 = ((cul)$$1.h()).a($$1, this.dX(), this);
               if ($$2 != null) {
                  this.d.b($$2);
               }
            }
         }

         if (this.eG() != this.cL || this.cM != this.cb.a() || this.cb.e() == 0.0F != this.cN) {
            this.d.b(new afo(this.eG(), this.cb.a(), this.cb.e()));
            this.cL = this.eG();
            this.cM = this.cb.a();
            this.cN = this.cb.e() == 0.0F;
         }

         if (this.eG() + this.fy() != this.cF) {
            this.cF = this.eG() + this.fy();
            this.a(fap.g, azj.f(this.cF));
         }

         if (this.cb.a() != this.cG) {
            this.cG = this.cb.a();
            this.a(fap.h, azj.f((float)this.cG));
         }

         if (this.cu() != this.cH) {
            this.cH = this.cu();
            this.a(fap.i, azj.f((float)this.cH));
         }

         if (this.eS() != this.cI) {
            this.cI = this.eS();
            this.a(fap.j, azj.f((float)this.cI));
         }

         if (this.co != this.cK) {
            this.cK = this.co;
            this.a(fap.k, azj.f((float)this.cK));
         }

         if (this.cn != this.cJ) {
            this.cJ = this.cn;
            this.a(fap.l, azj.f((float)this.cJ));
         }

         if (this.co != this.cO) {
            this.cO = this.co;
            this.d.b(new afn(this.cp, this.co, this.cn));
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
      if (this.eG() > 0.0F && this.dc != null) {
         an.X.a(this, this.dc);
      }

      this.dc = null;
      super.n();
   }

   @Override
   public void o() {
      if (this.aa > 0.0F && this.dc == null) {
         this.dc = this.dv();
         if (this.cu != null && this.cu.e <= this.dc.e) {
            an.ae.a(this, this.cu, this.cv);
         }
      }
   }

   public void p() {
      if (this.dl() != null && this.dl().by()) {
         if (this.de == null) {
            this.de = this.dv();
         } else {
            an.Y.a(this, this.de);
         }
      }

      if (this.de != null && (this.dl() == null || !this.dl().by())) {
         this.de = null;
      }
   }

   private void a(fap $$0, int $$1) {
      this.gz().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(bsp $$0) {
      this.a(eaa.p);
      boolean $$1 = this.dX().ac().b(der.n);
      if ($$1) {
         xh $$2 = this.eT().a();
         this.d.a(new aei(this.ar(), $$2), wo.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            xh $$3x = xh.a("death.attack.message_too_long", xh.b($$2x).a(n.o));
            xh $$4x = xh.a("death.attack.even_more_magic", this.S_()).a($$1xx -> $$1xx.a(new xn(xn.a.a, $$3x)));
            return new aei(this.ar(), $$4x);
         }));
         fao $$3 = this.cs();
         if ($$3 == null || $$3.k() == fao.b.a) {
            this.e.ag().a($$2, false);
         } else if ($$3.k() == fao.b.c) {
            this.e.ag().a(this, $$2);
         } else if ($$3.k() == fao.b.d) {
            this.e.ag().b(this, $$2);
         }
      } else {
         this.d.b(new aei(this.ar(), xg.a));
      }

      this.gy();
      if (this.dX().ac().b(der.N)) {
         this.gR();
      }

      if (!this.R_()) {
         this.a(this.B(), $$0);
      }

      this.gz().a(fap.d, this, fak::b);
      buv $$4 = this.eU();
      if ($$4 != null) {
         this.b(awu.h.b($$4.aq()));
         $$4.a(this, this.bi, $$0);
         this.f($$4);
      }

      this.dX().a(this, (byte)3);
      this.a(awu.N);
      this.a(awu.i.b(awu.m));
      this.a(awu.i.b(awu.n));
      this.aH();
      this.k(0);
      this.c(false);
      this.eT().c();
      this.a(Optional.of(jo.a(this.dX().ag(), this.dx())));
   }

   private void gR() {
      ezc $$0 = new ezc(this.dx()).c(32.0, 10.0, 32.0);
      this.dX().a(bux.class, $$0, bue.f).stream().filter($$0x -> $$0x instanceof bva).forEach($$0x -> ((bva)$$0x).a_((coh)this));
   }

   @Override
   public void a(btz $$0, int $$1, bsp $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.s($$1);
         this.gz().a(fap.f, this, fak::b);
         if ($$0 instanceof coh) {
            this.a(awu.Q);
            this.gz().a(fap.e, this, fak::b);
         } else {
            this.a(awu.O);
         }

         this.a(this, $$0, fap.m);
         this.a($$0, this, fap.n);
         an.c.a(this, $$0, $$2);
      }
   }

   private void a(fal $$0, fal $$1, fap[] $$2) {
      fah $$3 = this.gz().e($$1.cJ());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gz().a($$2[$$4], $$0, fak::b);
         }
      }
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.e.n() && this.gS() && $$0.a(axb.m);
         if (!$$2 && this.cP > 0 && !$$0.a(axb.d)) {
            return false;
         } else {
            btz $$3 = $$0.d();
            if ($$3 instanceof coh $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof cop $$5 && $$5.s() instanceof coh $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(coh $$0) {
      return !this.gS() ? false : super.a($$0);
   }

   private boolean gS() {
      return this.e.ac();
   }

   public esc a(boolean $$0, esc.a $$1) {
      jg $$2 = this.U();
      float $$3 = this.V();
      boolean $$4 = this.X();
      arm $$5 = this.e.a(this.W());
      if ($$5 != null && $$2 != null) {
         Optional<arn.a> $$6 = a($$5, $$2, $$3, $$4, $$0);
         if ($$6.isPresent()) {
            arn.a $$7 = $$6.get();
            return new esc($$5, $$7.a(), ezh.c, $$7.b(), 0.0F, $$1);
         } else {
            return esc.a(this.e.J(), this, $$1);
         }
      } else {
         return new esc(this.e.J(), this, $$1);
      }
   }

   private static Optional<arn.a> a(arm $$0, jg $$1, float $$2, boolean $$3, boolean $$4) {
      dvd $$5 = $$0.a_($$1);
      dhy $$6 = $$5.b();
      if ($$6 instanceof dog && ($$3 || $$5.c(dog.d) > 0) && dog.a($$0)) {
         Optional<ezh> $$7 = dog.a(bug.by, $$0, $$1);
         if (!$$3 && $$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.b(dog.d, Integer.valueOf($$5.c(dog.d) - 1)), 3);
         }

         return $$7.map($$1x -> arn.a.a($$1x, $$1));
      } else if ($$6 instanceof dhr && dhr.a($$0)) {
         return dhr.a(bug.by, $$0, $$1, $$5.c(dhr.aF), $$2).map($$1x -> arn.a.a($$1x, $$1));
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dvd $$9 = $$0.a_($$1.d());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new arn.a(new ezh((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5), $$2)) : Optional.empty();
      }
   }

   @Override
   public void q() {
      this.ao();
      this.B().a(this, btz.c.e);
      if (!this.i) {
         this.i = true;
         this.d.b(new adk(adk.f, 0.0F));
         this.g = true;
      }
   }

   @Nullable
   public coh a(esc $$0) {
      if (this.dS()) {
         return null;
      } else {
         if ($$0.f()) {
            this.d.b(new adk(adk.b, 0.0F));
         }

         arm $$1 = $$0.a();
         arm $$2 = this.B();
         alg<dev> $$3 = $$2.ag();
         this.af();
         if ($$1.ag() == $$3) {
            this.d.a(bvi.a($$0), $$0.g());
            this.d.l();
            $$0.h().onTransition(this);
            return this;
         } else {
            this.cV = true;
            etg $$4 = $$1.A_();
            this.d.b(new aes(this.b($$1), (byte)3));
            this.d.b(new acq($$4.q(), $$4.r()));
            avn $$5 = this.e.ag();
            $$5.e(this);
            $$2.a(this, btz.c.e);
            this.dU();
            $$2.ah().a("moving");
            if ($$3 == dev.i && $$1.ag() == dev.j) {
               this.dd = this.dv();
            }

            this.c($$0);
            $$2.ah().c();
            $$2.ah().a("placing");
            this.a($$1);
            this.d.a(bvi.a($$0), $$0.g());
            this.d.l();
            $$1.d(this);
            $$2.ah().c();
            this.c($$2);
            this.fH();
            this.d.b(new aee(this.gl()));
            $$5.a(this, $$1);
            $$5.f(this);
            $$5.d(this);
            $$0.h().onTransition(this);
            this.cO = -1;
            this.cL = -1.0F;
            this.cM = -1;
            return this;
         }
      }
   }

   private void c(arm $$0) {
      alg<dev> $$1 = $$0.ag();
      alg<dev> $$2 = this.dX().ag();
      an.w.a(this, $$1, $$2);
      if ($$1 == dev.j && $$2 == dev.i && this.dd != null) {
         an.D.a(this, this.dd);
      }

      if ($$2 != dev.j) {
         this.dd = null;
      }
   }

   @Override
   public boolean a(arn $$0) {
      if ($$0.R_()) {
         return this.M() == this;
      } else {
         return this.R_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(btz $$0, int $$1) {
      super.a($$0, $$1);
      this.ca.d();
   }

   @Override
   public Either<coh.a, bao> a(jg $$0) {
      jl $$1 = this.dX().a_($$0).c(dlt.aF);
      if (this.fT() || !this.bM()) {
         return Either.left(coh.a.e);
      } else if (!this.dX().D_().j()) {
         return Either.left(coh.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(coh.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(coh.a.d);
      } else {
         this.a(this.dX().ag(), $$0, this.dN(), false, true);
         if (this.dX().S()) {
            return Either.left(coh.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               ezh $$4 = ezh.c($$0);
               List<clm> $$5 = this.dX()
                  .a(clm.class, new ezc($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.a(this));
               if (!$$5.isEmpty()) {
                  return Either.left(coh.a.f);
               }
            }

            Either<coh.a, bao> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(awu.ap);
               an.r.a(this);
            });
            if (!this.B().d()) {
               this.a(xh.c("sleep.not_possible"), true);
            }

            ((arm)this.dX()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(jg $$0) {
      this.a(awu.i.b(awu.n));
      super.b($$0);
   }

   private boolean a(jg $$0, jl $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(jg $$0) {
      ezh $$1 = ezh.c($$0);
      return Math.abs(this.dC() - $$1.a()) <= 3.0 && Math.abs(this.dE() - $$1.b()) <= 2.0 && Math.abs(this.dI() - $$1.c()) <= 3.0;
   }

   private boolean b(jg $$0, jl $$1) {
      jg $$2 = $$0.d();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fT()) {
         this.B().l().a(this, new acg(this, 2));
      }

      super.a($$0, $$1);
      if (this.d != null) {
         this.d.a(this.dC(), this.dE(), this.dI(), this.dN(), this.dP());
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.bR();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public boolean b(bsp $$0) {
      return super.b($$0) || this.R() && !$$0.a(bss.m);
   }

   @Override
   protected void a(double $$0, boolean $$1, dvd $$2, jg $$3) {
   }

   @Override
   protected void b(arm $$0, jg $$1) {
      if (!this.R_()) {
         super.b($$0, $$1);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.dq()) {
         this.a($$3, new ezh($$0, $$1, $$2));
         jg $$4 = this.aP();
         dvd $$5 = this.dX().a_($$4);
         if (this.do && $$3 && this.aa > 0.0F) {
            ezh $$6 = $$4.b().b(0.0, 0.5, 0.0);
            int $$7 = (int)azj.a(50.0F * this.aa, 0.0F, 200.0F);
            this.B().a(new li(lq.b, $$5), $$6.d, $$6.e, $$6.f, $$7, 0.3F, 0.3F, 0.3F, 0.15F);
            this.do = false;
         }

         super.a($$1, $$3, $$5, $$4);
      }
   }

   @Override
   public void a(@Nullable btz $$0) {
      super.a($$0);
      this.cu = this.dv();
      this.cv = $$0;
      this.w($$0 != null && $$0.aq() == bug.bn);
   }

   @Override
   protected void r() {
      if (this.dX().s().i()) {
         super.r();
      }
   }

   @Override
   public void a(dts $$0, boolean $$1) {
      this.d.b(new acm(this.dX(), $$0.aC_()));
      this.d.b(new aec($$0.aC_(), $$1));
   }

   private void gT() {
      this.dw = this.dw % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bsa $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.ca != this.bZ) {
            this.s();
         }

         this.gT();
         crj $$1 = $$0.createMenu(this.dw, this.gk(), this);
         if ($$1 == null) {
            if (this.R_()) {
               this.a(xh.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.d.b(new aeb($$1.l, $$1.a(), $$0.S_()));
            this.a($$1);
            this.ca = $$1;
            return OptionalInt.of(this.dw);
         }
      }
   }

   @Override
   public void a(int $$0, ddt $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.d.b(new adw($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(ciq $$0, brr $$1) {
      if (this.ca != this.bZ) {
         this.s();
      }

      this.gT();
      int $$2 = $$0.ag_();
      this.d.b(new adl(this.dw, $$2, $$0.ar()));
      this.ca = new csl(this.dw, this.gk(), $$1, $$0, $$2);
      this.a(this.ca);
   }

   @Override
   public void a(cvx $$0, brx $$1) {
      if ($$0.a(cwb.ub)) {
         if (cxt.a($$0, this.dp(), this)) {
            this.ca.d();
         }

         this.d.b(new aea($$1));
      }
   }

   @Override
   public void a(dsq $$0) {
      this.d.b(ack.a($$0, dsg::e));
   }

   @Override
   public void s() {
      this.d.b(new acx(this.ca.l));
      this.t();
   }

   @Override
   public void t() {
      this.ca.a(this);
      this.bZ.a(this.ca);
      this.ca = this.bZ;
   }

   @Override
   public void u() {
      double $$0 = this.dC();
      double $$1 = this.dE();
      double $$2 = this.dI();
      super.u();
      this.q(this.dC() - $$0, this.dE() - $$1, this.dI() - $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (!this.ca() && !r($$0, $$1, $$2)) {
         if (this.cl()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(awu.C, $$3);
               this.G(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(axf.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(awu.w, $$4);
               this.G(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.bk()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(awu.s, $$5);
               this.G(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.q_()) {
            if ($$1 > 0.0) {
               this.a(awu.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aJ()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.ck()) {
                  this.a(awu.r, $$6);
                  this.G(0.1F * (float)$$6 * 0.01F);
               } else if (this.cj()) {
                  this.a(awu.q, $$6);
                  this.G(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(awu.p, $$6);
                  this.G(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fL()) {
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
      if (this.ca() && !r($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         btz $$4 = this.dl();
         if ($$4 instanceof cqf) {
            this.a(awu.x, $$3);
         } else if ($$4 instanceof cqh) {
            this.a(awu.y, $$3);
         } else if ($$4 instanceof chd) {
            this.a(awu.z, $$3);
         } else if ($$4 instanceof ciq) {
            this.a(awu.A, $$3);
         } else if ($$4 instanceof clz) {
            this.a(awu.D, $$3);
         }
      }
   }

   private static boolean r(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(awr<?> $$0, int $$1) {
      this.cE.b(this, $$0, $$1);
      this.gz().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(awr<?> $$0) {
      this.cE.a(this, $$0, 0);
      this.gz().a($$0, this, fak::c);
   }

   @Override
   public int a(Collection<dal<?>> $$0) {
      return this.cW.a($$0, this);
   }

   @Override
   public void a(dal<?> $$0, List<cvx> $$1) {
      an.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<alh> $$0) {
      List<dal<?>> $$1 = $$0.stream().flatMap($$0x -> this.e.aI().a($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<dal<?>> $$0) {
      return this.cW.b($$0, this);
   }

   @Override
   public void v() {
      super.v();
      this.a(awu.E);
      if (this.ck()) {
         this.G(0.2F);
      } else {
         this.G(0.05F);
      }
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cO = -1;
   }

   @Override
   public void w() {
      this.cZ = true;
      this.bQ();
      if (this.fT()) {
         this.a(true, false);
      }
   }

   public boolean x() {
      return this.cZ;
   }

   public void y() {
      this.cL = -1.0E8F;
   }

   @Override
   public void a(xh $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void z() {
      if (!this.bw.f() && this.fB()) {
         this.d.b(new adh(this, (byte)9));
         super.z();
      }
   }

   @Override
   public void a(fh.a $$0, ezh $$1) {
      super.a($$0, $$1);
      this.d.b(new ael($$0, $$1.d, $$1.e, $$1.f));
   }

   public void a(fh.a $$0, btz $$1, fh.a $$2) {
      ezh $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.d.b(new ael($$0, $$1, $$2));
   }

   public void a(arn $$0, boolean $$1) {
      this.dp = $$0.dp;
      this.dv = $$0.dv;
      this.f.a($$0.f.b(), $$0.f.c());
      this.A();
      if ($$1) {
         this.fa().b($$0.fa());
         this.fa().c($$0.fa());
         this.x($$0.eG());
         this.cb = $$0.cb;

         for (bte $$2 : $$0.eD()) {
            this.a(new bte($$2));
         }

         this.gk().a($$0.gk());
         this.cn = $$0.cn;
         this.co = $$0.co;
         this.cp = $$0.cp;
         this.r($$0.gf());
         this.at = $$0.at;
      } else {
         this.fa().b($$0.fa());
         this.x(this.eV());
         if (this.dX().ac().b(der.d) || $$0.R_()) {
            this.gk().a($$0.gk());
            this.cn = $$0.cn;
            this.co = $$0.co;
            this.cp = $$0.cp;
            this.r($$0.gf());
         }
      }

      this.cq = $$0.cq;
      this.bY = $$0.bY;
      this.av().a(bU, $$0.av().a(bU));
      this.cO = -1;
      this.cL = -1.0F;
      this.cM = -1;
      this.cW.a($$0.cW);
      this.g = $$0.g;
      this.dd = $$0.dd;
      this.dg = $$0.dg;
      this.i($$0.gB());
      this.j($$0.gC());
      this.a($$0.gJ());
   }

   @Override
   protected void a(bte $$0, @Nullable btz $$1) {
      super.a($$0, $$1);
      this.d.b(new agn(this.ar(), $$0, true));
      if ($$0.a(btg.y)) {
         this.cY = this.ag;
         this.cX = this.dv();
      }

      an.B.a(this, $$1);
   }

   @Override
   protected void a(bte $$0, boolean $$1, @Nullable btz $$2) {
      super.a($$0, $$1, $$2);
      this.d.b(new agn(this.ar(), $$0, false));
      an.B.a(this, $$2);
   }

   @Override
   protected void c(Collection<bte> $$0) {
      super.c($$0);

      for (bte $$1 : $$0) {
         this.d.b(new aeq(this.ar(), $$1.c()));
         if ($$1.a(btg.y)) {
            this.cX = null;
         }
      }

      an.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.d.a(new bvi(new ezh($$0, $$1, $$2), ezh.c, 0.0F, 0.0F), bvj.a(bvj.l, bvj.k));
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.d.a(new bvi(new ezh($$0, $$1, $$2), ezh.c, 0.0F, 0.0F), bvj.j);
   }

   @Override
   public boolean a(arm $$0, double $$1, double $$2, double $$3, Set<bvj> $$4, float $$5, float $$6, boolean $$7) {
      deb $$8 = new deb(jg.a($$1, $$2, $$3));
      $$0.l().a(ars.f, $$8, 1, this.ar());
      if (this.fT()) {
         this.a(true, true);
      }

      if ($$7) {
         this.d(this);
      }

      boolean $$9 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$9) {
         this.q($$4.contains(bvj.d) ? this.cB() + $$5 : $$5);
      }

      return $$9;
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      super.e($$0, $$1, $$2);
      this.d.l();
   }

   @Override
   public void b(btz $$0) {
      this.B().l().a(this, new acg($$0, 4));
   }

   @Override
   public void c(btz $$0) {
      this.B().l().a(this, new acg($$0, 5));
   }

   @Override
   public void A() {
      if (this.d != null) {
         this.d.b(new aee(this.gl()));
         this.L();
      }
   }

   public arm B() {
      return (arm)this.dX();
   }

   public boolean a(des $$0) {
      boolean $$1 = this.R_();
      if (!this.f.a($$0)) {
         return false;
      } else {
         this.d.b(new adk(adk.e, (float)$$0.a()));
         if ($$0 == des.d) {
            this.gy();
            this.af();
            dbo.a(this);
         } else {
            this.d(this);
            if ($$1) {
               dbo.a(this.B(), this);
            }
         }

         this.A();
         this.fz();
         return true;
      }
   }

   @Override
   public boolean R_() {
      return this.f.b() == des.d;
   }

   @Override
   public boolean f() {
      return this.f.b() == des.b;
   }

   @Override
   public void a(xh $$0) {
      this.b($$0, false);
   }

   public void b(xh $$0, boolean $$1) {
      if (this.x($$1)) {
         this.d.a(new age($$0, $$1), wo.a(() -> {
            if (this.x(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               xh $$3 = xh.b($$2).a(n.o);
               return new age(xh.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(xw $$0, boolean $$1, xd.a $$2) {
      if (this.gU()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String C() {
      return this.d.m() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(aqy $$0) {
      this.db = $$0.b();
      this.da = $$0.c();
      this.cQ = $$0.d();
      this.cS = $$0.e();
      this.dm = $$0.h();
      this.dn = $$0.i();
      this.cR = $$0.j();
      this.av().a(bU, (byte)$$0.f());
      this.av().a(bV, (byte)$$0.g().b());
   }

   public aqy D() {
      int $$0 = this.av().a(bU);
      bup $$1 = bup.d.apply(this.av().a(bV));
      return new aqy(this.db, this.da, this.cQ, this.cS, $$0, $$1, this.dm, this.dn, this.cR);
   }

   public boolean E() {
      return this.cS;
   }

   public coe F() {
      return this.cQ;
   }

   private boolean x(boolean $$0) {
      return this.cQ == coe.c ? $$0 : true;
   }

   private boolean gU() {
      return this.cQ == coe.a;
   }

   public int G() {
      return this.da;
   }

   public void a(ake $$0) {
      this.d.b(new aew($$0.a(), $$0.d().map(ake.a::a)));
   }

   @Override
   protected int H() {
      return this.e.c(this.gj());
   }

   @Override
   public void I() {
      this.cT = ad.c();
   }

   public awq J() {
      return this.cE;
   }

   public awp K() {
      return this.cW;
   }

   @Override
   protected void L() {
      if (this.R_()) {
         this.eB();
         this.k(true);
      } else {
         super.L();
      }
   }

   public btz M() {
      return (btz)(this.cU == null ? this : this.cU);
   }

   @Override
   public void d(@Nullable btz $$0) {
      btz $$1 = this.M();
      this.cU = (btz)($$0 == null ? this : $$0);
      if ($$1 != this.cU) {
         if (this.cU.dX() instanceof arm $$2) {
            this.a($$2, this.cU.dC(), this.cU.dE(), this.cU.dI(), Set.of(), this.dN(), this.dP(), false);
         }

         if ($$0 != null) {
            this.B().l().a(this);
         }

         this.d.b(new afd(this.cU));
         this.d.l();
      }
   }

   @Override
   protected void N() {
      if (!this.cV) {
         super.N();
      }
   }

   @Override
   public void e(btz $$0) {
      if (this.f.b() == des.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long O() {
      return this.cT;
   }

   @Nullable
   public xh P() {
      return null;
   }

   public int Q() {
      return 0;
   }

   @Override
   public void a(brx $$0) {
      super.a($$0);
      this.gE();
   }

   public boolean R() {
      return this.cV;
   }

   public void S() {
      this.cV = false;
   }

   public alp T() {
      return this.cD;
   }

   @Nullable
   public jg U() {
      return this.di;
   }

   public float V() {
      return this.dk;
   }

   public alg<dev> W() {
      return this.dh;
   }

   public boolean X() {
      return this.dj;
   }

   public void b(arn $$0) {
      this.a($$0.W(), $$0.U(), $$0.V(), $$0.X(), false);
   }

   public void a(alg<dev> $$0, @Nullable jg $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.di) && $$0.equals(this.dh);
         if ($$4 && !$$5) {
            this.a(xh.c("block.minecraft.set_spawn"));
         }

         this.di = $$1;
         this.dh = $$0;
         this.dk = $$2;
         this.dj = $$3;
      } else {
         this.di = null;
         this.dh = dev.i;
         this.dk = 0.0F;
         this.dj = false;
      }
   }

   public ki Y() {
      return this.df;
   }

   public void a(ki $$0) {
      this.df = $$0;
   }

   public aqx Z() {
      return this.dg;
   }

   public void a(aqx $$0) {
      this.dg = $$0;
   }

   @Override
   public void a(awj $$0, awl $$1, float $$2, float $$3) {
      this.d.b(new agb(lx.b.e($$0), $$1, this.dC(), this.dE(), this.dI(), $$2, $$3, this.af.g()));
   }

   @Override
   public ckq a(cvx $$0, boolean $$1, boolean $$2) {
      ckq $$3 = this.b($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dX().b($$3);
         cvx $$4 = $$3.m();
         if ($$2) {
            if (!$$4.f()) {
               this.a(awu.f.b($$4.h()), $$0.L());
            }

            this.a(awu.F);
         }

         return $$3;
      }
   }

   @Nullable
   private ckq b(cvx $$0, boolean $$1, boolean $$2) {
      if ($$0.f()) {
         return null;
      } else {
         double $$3 = this.dG() - 0.3F;
         ckq $$4 = new ckq(this.dX(), this.dC(), $$3, this.dI(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.af.i() * 0.5F;
            float $$6 = this.af.i() * (float) (Math.PI * 2);
            $$4.n((double)(-azj.a($$6) * $$5), 0.2F, (double)(azj.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = azj.a(this.dP() * (float) (Math.PI / 180.0));
            float $$9 = azj.b(this.dP() * (float) (Math.PI / 180.0));
            float $$10 = azj.a(this.dN() * (float) (Math.PI / 180.0));
            float $$11 = azj.b(this.dN() * (float) (Math.PI / 180.0));
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

   public asv aa() {
      return this.dl;
   }

   public void a(arm $$0) {
      this.a((dev)$$0);
      this.f.a($$0);
   }

   @Nullable
   private static des a(@Nullable uj $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? des.a($$0.h($$1)) : null;
   }

   private des b(@Nullable des $$0) {
      des $$1 = this.e.be();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.e.u_();
      }
   }

   @Override
   public void c(@Nullable uj $$0) {
      this.f.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void k(uj $$0) {
      $$0.a("playerGameType", this.f.b().a());
      des $$1 = this.f.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean ab() {
      return this.dm;
   }

   public boolean c(arn $$0) {
      return $$0 == this ? false : this.dm || $$0.dm;
   }

   @Override
   public boolean a(dev $$0, jg $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cvx $$0) {
      an.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cog $$1 = this.gk();
      cvx $$2 = $$1.a($$0);
      this.ca.b($$1, $$1.j).ifPresent($$1x -> this.ca.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean ac() {
      return this.dn;
   }

   @Override
   public Optional<cnm> ad() {
      return Optional.of(this.dp);
   }

   public void b(boolean $$0) {
      this.do = $$0;
   }

   @Override
   public void a(ckq $$0) {
      super.a($$0);
      btz $$1 = $$0.s();
      if ($$1 != null) {
         an.S.a(this, $$0.m(), $$1);
      }
   }

   public void a(xy $$0) {
      this.dv = $$0;
   }

   @Nullable
   public xy ae() {
      return this.dv != null && this.dv.b() ? null : this.dv;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.ct = (float)(azj.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dN());
      this.d.b(new adm(this));
   }

   @Override
   public boolean a(btz $$0, boolean $$1) {
      if (super.a($$0, $$1)) {
         $$0.j(this);
         this.d.a(new bvi(this.dv(), ezh.c, 0.0F, 0.0F), bvj.k);
         if ($$0 instanceof buv $$2) {
            this.e.ag().a($$2, this.d);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void af() {
      btz $$0 = this.dl();
      super.af();
      if ($$0 instanceof buv $$1) {
         for (bte $$2 : $$1.eD()) {
            this.d.b(new aeq($$0.ar(), $$2.c()));
         }
      }
   }

   public agp b(arm $$0) {
      return new agp($$0.af(), $$0.ag(), dfy.a($$0.C()), this.f.b(), this.f.c(), $$0.aj(), $$0.B(), this.gJ(), this.aD(), $$0.N());
   }

   @Override
   public void c(jg $$0) {
      this.dq = $$0;
   }

   public void ag() {
      this.dq = null;
   }

   @Nullable
   public jg ah() {
      return this.dq;
   }

   @Override
   public ezh ai() {
      btz $$0 = this.dl();
      return $$0 != null && $$0.cY() != this ? $$0.ai() : this.dr;
   }

   public void a(ezh $$0) {
      this.dr = $$0;
   }

   @Override
   protected float a(btz $$0, float $$1, bsp $$2) {
      return dbo.a(this.B(), this.eb(), $$0, $$2, $$1);
   }

   @Override
   public void a(cvt $$0, buh $$1) {
      super.a($$0, $$1);
      this.b(awu.d.b($$0));
   }

   public cof aj() {
      return this.ds;
   }

   public void a(cof $$0) {
      this.ds = $$0;
   }

   public ezh ak() {
      float $$0 = this.ds.c() == this.ds.d() ? 0.0F : (this.ds.c() ? 1.0F : -1.0F);
      float $$1 = this.ds.a() == this.ds.b() ? 0.0F : (this.ds.a() ? 1.0F : -1.0F);
      return a(new ezh((double)$$0, 0.0, (double)$$1), 1.0F, this.dN());
   }

   static record a(ezh a, float b) {
      public static arn.a a(ezh $$0, jg $$1) {
         return new arn.a($$0, b($$0, $$1));
      }

      private static float b(ezh $$0, jg $$1) {
         ezh $$2 = ezh.c($$1).d($$0).d();
         return (float)azj.d(azj.d($$2.f, $$2.d) * 180.0F / (float)Math.PI - 90.0);
      }
   }
}
