import com.google.common.net.InetAddresses;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
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

public class art extends crx {
   private static final Logger cq = LogUtils.getLogger();
   private static final int cr = 32;
   private static final int cs = 10;
   private static final int ct = 25;
   public static final double a = 1.0;
   public static final double b = 3.0;
   public static final int c = 2;
   public static final String d = "ender_pearls";
   public static final String e = "ender_pearl_dimension";
   private static final byy cu = new byy(ali.b("creative_mode_block_range"), 0.5, byy.a.a);
   private static final byy cv = new byy(ali.b("creative_mode_entity_range"), 2.0, byy.a.a);
   private static final xa cw = xa.c("block.minecraft.set_spawn");
   private static final boolean cx = false;
   private static final boolean cy = false;
   public asv f;
   public final MinecraftServer g;
   public final aru h;
   private final alq cz;
   private final awv cA;
   private float cB = Float.MIN_VALUE;
   private int cC = Integer.MIN_VALUE;
   private int cD = Integer.MIN_VALUE;
   private int cE = Integer.MIN_VALUE;
   private int cF = Integer.MIN_VALUE;
   private int cG = Integer.MIN_VALUE;
   private float cH = -1.0E8F;
   private int cI = -99999999;
   private boolean cJ = true;
   private int cK = -99999999;
   private cru cL = cru.a;
   private ark cM = ark.a;
   private boolean cN = true;
   private long cO = ag.c();
   @Nullable
   private bwt cP;
   private boolean cQ;
   public boolean i = false;
   private final awu cR;
   @Nullable
   private ffq cS;
   private int cT;
   private boolean cU;
   private int cV = 2;
   private String cW = "en_us";
   @Nullable
   private ffq cX;
   @Nullable
   private ffq cY;
   @Nullable
   private ffq cZ;
   private jy da = jy.a(0, 0, 0);
   private arb db = arb.a;
   @Nullable
   private art.a dc;
   private final atb dd;
   private boolean de;
   private boolean df;
   private boolean dg = false;
   private crc dh = new crc();
   @Nullable
   private iv di;
   private ffq dj = ffq.c;
   private crv dk = crv.b;
   private final Set<ctc> dl = new HashSet<>();
   private final cwf dm = new cwf() {
      @Override
      public void a(cvq $$0, jo<czy> $$1, czy $$2, int[] $$3) {
         art.this.f.b(new acq($$0.l, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cvq $$0, int $$1, czy $$2) {
         art.this.f.b(new acs($$0.l, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cvq $$0, czy $$1) {
         art.this.f.b(new afc($$1.v()));
      }

      @Override
      public void a(cvq $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cvq $$0, int $$1, int $$2) {
         art.this.f.b(new acr($$0.l, $$1, $$2));
      }
   };
   private final cwe dn = new cwe() {
      @Override
      public void a(cvq $$0, int $$1, czy $$2) {
         cxn $$3 = $$0.b($$1);
         if (!($$3 instanceof cxj)) {
            if ($$3.c == art.this.gj()) {
               aq.f.a(art.this, art.this.gj(), $$2);
            }
         }
      }

      @Override
      public void a(cvq $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private xr do;
   @Nullable
   public final Object j;
   private final ei dp = new ei() {
      @Override
      public boolean x_() {
         return art.this.y().O().c(djt.q);
      }

      @Override
      public boolean y_() {
         return true;
      }

      @Override
      public boolean c() {
         return true;
      }

      @Override
      public void a(xa $$0) {
         art.this.a($$0);
      }
   };
   private int dq;
   public boolean k;

   public art(MinecraftServer $$0, ars $$1, GameProfile $$2, arc $$3) {
      super($$1, $$1.aa(), $$1.ab(), $$2);
      this.dd = $$0.a(this);
      this.h = $$0.b(this);
      this.cR = new awu(($$1x, $$2x) -> $$0.aI().a($$1x, $$2x));
      this.g = $$0;
      this.cA = $$0.ag().a((crx)this);
      this.cz = $$0.ag().g(this);
      this.b(this.a($$1, $$1.aa()).c(), 0.0F, 0.0F);
      this.a($$3);
      this.j = null;
   }

   @Override
   public iv a(ars $$0, iv $$1) {
      ffl $$2 = this.a(byg.a).a(ffq.c);
      iv $$3 = $$1;
      if ($$0.F_().g() && $$0.p().aZ().k() != dju.c) {
         int $$4 = Math.max(0, this.g.a($$0));
         int $$5 = azo.a($$0.E_().b((double)$$1.u(), (double)$$1.w()));
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
         int $$10 = azx.a().a($$8);

         for (int $$11 = 0; $$11 < $$8; $$11++) {
            int $$12 = ($$10 + $$9 * $$11) % $$8;
            int $$13 = $$12 % ($$4 * 2 + 1);
            int $$14 = $$12 / ($$4 * 2 + 1);
            int $$15 = $$1.u() + $$13 - $$4;
            int $$16 = $$1.w() + $$14 - $$4;

            try {
               $$3 = arm.a($$0, $$15, $$16);
               if ($$3 != null && this.a($$0, $$2.c($$3.c()))) {
                  return $$3;
               }
            } catch (Exception var25) {
               int $$18 = $$11;
               int $$19 = $$4;
               p $$20 = p.a(var25, "Searching for spawn");
               q $$21 = $$20.a("Spawn Lookup");
               $$21.a("Origin", $$1::toString);
               $$21.a("Radius", () -> Integer.toString($$19));
               $$21.a("Candidate", () -> "[" + $$15 + "," + $$16 + "]");
               $$21.a("Progress", () -> $$18 + " out of " + $$8);
               throw new aa($$20);
            }
         }

         $$3 = $$1;
      }

      while (!this.a($$0, $$2.c($$3.c())) && $$3.v() < $$0.ao()) {
         $$3 = $$3.d();
      }

      while (this.a($$0, $$2.c($$3.e().c())) && $$3.v() > $$0.K_() + 1) {
         $$3 = $$3.e();
      }

      return $$3;
   }

   private boolean a(ars $$0, ffl $$1) {
      return $$0.a(this, $$1, true);
   }

   private int t(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.dh = $$0.<crc>a("warden_spawn_tracker", crc.a).orElseGet(crc::new);
      this.cY = $$0.<ffq>a("entered_nether_pos", ffq.a).orElse(null);
      this.i = $$0.b("seenCredits", false);
      this.cR.a($$0.n("recipeBook"), $$0x -> this.g.aI().b($$0x).isPresent());
      if (this.fR()) {
         this.fS();
      }

      this.dc = $$0.<art.a>a("respawn", art.a.a).orElse(null);
      this.dg = $$0.b("spawn_extra_particles_on_fall", false);
      this.di = $$0.<iv>a("raid_omen_position", iv.a).orElse(null);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("warden_spawn_tracker", crc.a, this.dh);
      this.p($$0);
      $$0.a("seenCredits", this.i);
      $$0.b("entered_nether_pos", ffq.a, this.cY);
      this.m($$0);
      $$0.a("recipeBook", this.cR.b());
      $$0.a("Dimension", this.dV().aj().a().toString());
      $$0.b("respawn", art.a.a, this.dc);
      $$0.a("spawn_extra_particles_on_fall", this.dg);
      $$0.b("raid_omen_position", iv.a, this.di);
      this.n($$0);
   }

   private void m(tz $$0) {
      bwt $$1 = this.df();
      bwt $$2 = this.dk();
      if ($$2 != null && $$1 != this && $$1.de()) {
         tz $$3 = new tz();
         tz $$4 = new tz();
         $$1.g($$4);
         $$3.a("Attach", jz.a, $$2.cG());
         $$3.a("Entity", $$4);
         $$0.a("RootVehicle", $$3);
      }
   }

   @Override
   public void c(tz $$0) {
      Optional<tz> $$1 = $$0.m("RootVehicle");
      if (!$$1.isEmpty()) {
         ars $$2 = this.y();
         bwt $$3 = bxc.a($$1.get().n("Entity"), $$2, bxb.r, $$1x -> !$$2.c($$1x) ? null : $$1x);
         if ($$3 != null) {
            UUID $$4 = $$1.get().<UUID>a("Attach", jz.a).orElse(null);
            if ($$3.cG().equals($$4)) {
               this.a($$3, true);
            } else {
               for (bwt $$5 : $$3.dc()) {
                  if ($$5.cG().equals($$4)) {
                     this.a($$5, true);
                     break;
                  }
               }
            }

            if (!this.bY()) {
               cq.warn("Couldn't reattach entity to player");
               $$3.aq();

               for (bwt $$6 : $$3.dc()) {
                  $$6.aq();
               }
            }
         }
      }
   }

   private void n(tz $$0) {
      if (!this.dl.isEmpty()) {
         uf $$1 = new uf();

         for (ctc $$2 : this.dl) {
            if ($$2.dQ()) {
               cq.warn("Trying to save removed ender pearl, skipping");
            } else {
               tz $$3 = new tz();
               $$2.g($$3);
               $$3.a("ender_pearl_dimension", djx.h, $$2.dV().aj());
               $$1.add($$3);
            }
         }

         $$0.a("ender_pearls", $$1);
      }
   }

   @Override
   public void d(tz $$0) {
      $$0.o("ender_pearls").ifPresent($$0x -> $$0x.j().forEach(this::o));
   }

   private void o(tz $$0) {
      Optional<alh<djx>> $$1 = $$0.a("ender_pearl_dimension", djx.h);
      if (!$$1.isEmpty()) {
         ars $$2 = this.y().p().a($$1.get());
         if ($$2 != null) {
            bwt $$3 = bxc.a($$0, $$2, bxb.r, $$1x -> !$$2.c($$1x) ? null : $$1x);
            if ($$3 != null) {
               a($$2, $$3.dx());
            } else {
               cq.warn("Failed to spawn player ender pearl in level ({}), skipping", $$1.get());
            }
         } else {
            cq.warn("Trying to load ender pearl without level ({}) being loaded, skipping", $$1.get());
         }
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gt();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.ch = azo.a((float)$$0 / $$1, 0.0F, $$2);
      this.cK = -1;
   }

   public void b(int $$0) {
      this.cf = $$0;
      this.cK = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cK = -1;
   }

   @Override
   public void a(czy $$0, int $$1) {
      super.a($$0, $$1);
      this.cK = -1;
   }

   private void a(cvq $$0) {
      $$0.a(this.dn);
      $$0.a(this.dm);
   }

   public void d() {
      this.a(this.bQ);
   }

   @Override
   public void e_() {
      super.e_();
      this.f.b(aea.a);
   }

   @Override
   public void N_() {
      super.N_();
      this.f.b(new adz(this.eS()));
   }

   @Override
   public void a(ebe $$0) {
      aq.e.a(this, $$0);
   }

   @Override
   protected czv g() {
      return new daw(this);
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

      bwt $$0 = this.L();
      if ($$0 != this) {
         if ($$0.bJ()) {
            this.a($$0.dA(), $$0.dC(), $$0.dG(), $$0.dL(), $$0.dN());
            this.y().m().a(this);
            if (this.fZ()) {
               this.d(this);
            }
         } else {
            this.d(this);
         }
      }

      aq.x.a(this);
      if (this.cS != null) {
         aq.v.a(this, this.cS, this.af - this.cT);
      }

      this.l();
      this.m();
      this.gR();
      this.cz.a(this, true);
   }

   private void gR() {
      byw $$0 = this.g(bza.g);
      if ($$0 != null) {
         if (this.b()) {
            $$0.a(cu);
         } else {
            $$0.e(cu);
         }
      }

      byw $$1 = this.g(bza.j);
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
         if (!this.Z_() || !this.do()) {
            super.h();
         }

         for (int $$0 = 0; $$0 < this.gj().b(); $$0++) {
            czy $$1 = this.gj().a($$0);
            if (!$$1.f()) {
               this.i($$1);
            }
         }

         if (this.eG() != this.cH || this.cI != this.bS.a() || this.bS.c() == 0.0F != this.cJ) {
            this.f.b(new afk(this.eG(), this.bS.a(), this.bS.c()));
            this.cH = this.eG();
            this.cI = this.bS.a();
            this.cJ = this.bS.c() == 0.0F;
         }

         if (this.eG() + this.fw() != this.cB) {
            this.cB = this.eG() + this.fw();
            this.a(fgy.h, azo.f(this.cB));
         }

         if (this.bS.a() != this.cC) {
            this.cC = this.bS.a();
            this.a(fgy.i, azo.f((float)this.cC));
         }

         if (this.cs() != this.cD) {
            this.cD = this.cs();
            this.a(fgy.j, azo.f((float)this.cD));
         }

         if (this.eR() != this.cE) {
            this.cE = this.eR();
            this.a(fgy.k, azo.f((float)this.cE));
         }

         if (this.cg != this.cG) {
            this.cG = this.cg;
            this.a(fgy.l, azo.f((float)this.cG));
         }

         if (this.cf != this.cF) {
            this.cF = this.cf;
            this.a(fgy.m, azo.f((float)this.cF));
         }

         if (this.cg != this.cK) {
            this.cK = this.cg;
            this.f.b(new afj(this.ch, this.cg, this.cf));
         }

         if (this.af % 20 == 0) {
            aq.q.a(this);
         }
      } catch (Throwable var4) {
         p $$3 = p.a(var4, "Ticking player");
         q $$4 = $$3.a("Player being ticked");
         this.a($$4);
         throw new aa($$3);
      }
   }

   private void i(czy $$0) {
      ezh $$1 = $$0.a(kk.M);
      ezj $$2 = dal.a($$1, this.dV());
      if ($$2 != null) {
         zh<?> $$3 = $$2.a($$1, this);
         if ($$3 != null) {
            this.f.b($$3);
         }
      }
   }

   @Override
   protected void j() {
      if (this.dV().an() == buo.a && this.y().O().c(djt.l)) {
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
      if (this.eG() > 0.0F && this.cX != null) {
         aq.X.a(this, this.cX);
      }

      this.cX = null;
      super.k();
   }

   public void l() {
      if (this.Z > 0.0 && this.cX == null) {
         this.cX = this.dt();
         if (this.cm != null && this.cm.e <= this.cX.e) {
            aq.ae.a(this, this.cm, this.cn);
         }
      }
   }

   @Override
   public void m() {
      if (this.dk() != null && this.dk().bv()) {
         if (this.cZ == null) {
            this.cZ = this.dt();
         } else {
            aq.Y.a(this, this.cZ);
         }
      }

      if (this.cZ != null && (this.dk() == null || !this.dk().bv())) {
         this.cZ = null;
      }
   }

   private void a(fgy $$0, int $$1) {
      this.gz().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(bvi $$0) {
      this.a(ege.p);
      boolean $$1 = this.y().O().c(djt.o);
      if ($$1) {
         xa $$2 = this.eS().a();
         this.f.a(new aeb(this.ao(), $$2), wh.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            xa $$3x = xa.a("death.attack.message_too_long", xa.b($$2x).a(o.o));
            xa $$4x = xa.a("death.attack.even_more_magic", this.m_()).a($$1xx -> $$1xx.a(new xg.e($$3x)));
            return new aeb(this.ao(), $$4x);
         }));
         fgx $$3 = this.cq();
         if ($$3 == null || $$3.l() == fgx.b.a) {
            this.g.ag().a($$2, false);
         } else if ($$3.l() == fgx.b.c) {
            this.g.ag().a(this, $$2);
         } else if ($$3.l() == fgx.b.d) {
            this.g.ag().b(this, $$2);
         }
      } else {
         this.f.b(new aeb(this.ao(), wz.a));
      }

      this.gy();
      if (this.y().O().c(djt.P)) {
         this.gS();
      }

      if (!this.Z_()) {
         this.b(this.y(), $$0);
      }

      this.gz().a(fgy.e, this, fgt::b);
      bxu $$4 = this.eT();
      if ($$4 != null) {
         this.b(awz.h.b($$4.an()));
         $$4.a(this, $$0);
         this.e($$4);
      }

      this.dV().a(this, (byte)3);
      this.a(awz.N);
      this.a(awz.i.b(awz.m));
      this.a(awz.i.b(awz.n));
      this.aF();
      this.k(0);
      this.c(false);
      this.eS().c();
      this.a(Optional.of(je.a(this.dV().aj(), this.dv())));
      this.v(false);
   }

   private void gS() {
      ffl $$0 = new ffl(this.dv()).c(32.0, 10.0, 32.0);
      this.dV().a(bxw.class, $$0, bxa.f).stream().filter($$0x -> $$0x instanceof bxz).forEach($$0x -> ((bxz)$$0x).a_(this.y(), this));
   }

   @Override
   public void a(bwt $$0, bvi $$1) {
      if ($$0 != this) {
         super.a($$0, $$1);
         this.gz().a(fgy.g, this, fgt::b);
         if ($$0 instanceof crx) {
            this.a(awz.Q);
            this.gz().a(fgy.f, this, fgt::b);
         } else {
            this.a(awz.O);
         }

         this.a(this, $$0, fgy.n);
         this.a($$0, this, fgy.o);
         aq.c.a(this, $$0, $$1);
      }
   }

   private void a(fgu $$0, fgu $$1, fgy[] $$2) {
      fgq $$3 = this.gz().e($$1.cI());
      if ($$3 != null) {
         int $$4 = $$3.o().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gz().a($$2[$$4], $$0, fgt::b);
         }
      }
   }

   @Override
   public boolean a(ars $$0, bvi $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         bwt $$3 = $$1.d();
         if ($$3 instanceof crx $$4 && !this.a($$4)) {
            return false;
         }

         if ($$3 instanceof csf $$5 && $$5.q() instanceof crx $$7 && !this.a($$7)) {
            return false;
         }

         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(crx $$0) {
      return !this.gT() ? false : super.a($$0);
   }

   private boolean gT() {
      return this.g.ac();
   }

   public eyo a(boolean $$0, eyo.a $$1) {
      art.a $$2 = this.T();
      ars $$3 = this.g.a(art.a.b($$2));
      if ($$3 != null && $$2 != null) {
         Optional<art.b> $$4 = a($$3, $$2, $$0);
         if ($$4.isPresent()) {
            art.b $$5 = $$4.get();
            return new eyo($$3, $$5.a(), ffq.c, $$5.b(), 0.0F, $$1);
         } else {
            return eyo.a(this.g.J(), this, $$1);
         }
      } else {
         return new eyo(this.g.J(), this, $$1);
      }
   }

   private static Optional<art.b> a(ars $$0, art.a $$1, boolean $$2) {
      iv $$3 = $$1.c;
      float $$4 = $$1.d;
      boolean $$5 = $$1.e;
      ebe $$6 = $$0.a_($$3);
      dnc $$7 = $$6.b();
      if ($$7 instanceof dtr && ($$5 || $$6.c(dtr.d) > 0) && dtr.a($$0)) {
         Optional<ffq> $$8 = dtr.a(bxc.bT, $$0, $$3);
         if (!$$5 && $$2 && $$8.isPresent()) {
            $$0.a($$3, $$6.b(dtr.d, Integer.valueOf($$6.c(dtr.d) - 1)), 3);
         }

         return $$8.map($$1x -> art.b.a($$1x, $$3));
      } else if ($$7 instanceof dmv && dmv.a($$0)) {
         return dmv.a(bxc.bT, $$0, $$3, $$6.c(dmv.e), $$4).map($$1x -> art.b.a($$1x, $$3));
      } else if (!$$5) {
         return Optional.empty();
      } else {
         boolean $$9 = $$7.a($$6);
         ebe $$10 = $$0.a_($$3.d());
         boolean $$11 = $$10.b().a($$10);
         return $$9 && $$11 ? Optional.of(new art.b(new ffq((double)$$3.u() + 0.5, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5), $$4)) : Optional.empty();
      }
   }

   @Override
   public void n() {
      this.al();
      this.y().a(this, bwt.d.e);
      if (!this.k) {
         this.k = true;
         this.f.b(new add(add.f, 0.0F));
         this.i = true;
      }
   }

   @Nullable
   public art a(eyo $$0) {
      if (this.dQ()) {
         return null;
      } else {
         if ($$0.g()) {
            this.f.b(new add(add.b, 0.0F));
         }

         ars $$1 = $$0.b();
         ars $$2 = this.y();
         alh<djx> $$3 = $$2.aj();
         if (!$$0.h()) {
            this.ab();
         }

         if ($$1.aj() == $$3) {
            this.f.a(byh.a($$0), $$0.i());
            this.f.l();
            $$0.j().onTransition(this);
            return this;
         } else {
            this.cQ = true;
            ezr $$4 = $$1.C_();
            this.f.b(new aeo(this.b($$1), (byte)3));
            this.f.b(new aci($$4.q(), $$4.r()));
            avs $$5 = this.g.ag();
            $$5.e(this);
            $$2.a(this, bwt.d.e);
            this.dS();
            brb $$6 = bra.a();
            $$6.a("moving");
            if ($$3 == djx.i && $$1.aj() == djx.j) {
               this.cY = this.dt();
            }

            $$6.c();
            $$6.a("placing");
            this.a($$1);
            this.f.a(byh.a($$0), $$0.i());
            this.f.l();
            $$1.d(this);
            $$6.c();
            this.g($$2);
            this.fF();
            this.f.b(new adx(this.gk()));
            $$5.a(this, $$1);
            $$5.f(this);
            $$5.d(this);
            $$0.j().onTransition(this);
            this.cK = -1;
            this.cH = -1.0F;
            this.cI = -1;
            return this;
         }
      }
   }

   @Override
   public void a(float $$0, float $$1) {
      this.f.b(new aeg($$0, $$1));
   }

   private void g(ars $$0) {
      alh<djx> $$1 = $$0.aj();
      alh<djx> $$2 = this.dV().aj();
      aq.w.a(this, $$1, $$2);
      if ($$1 == djx.j && $$2 == djx.i && this.cY != null) {
         aq.D.a(this, this.cY);
      }

      if ($$2 != djx.j) {
         this.cY = null;
      }
   }

   @Override
   public boolean a(art $$0) {
      if ($$0.Z_()) {
         return this.L() == this;
      } else {
         return this.Z_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bwt $$0, int $$1) {
      super.a($$0, $$1);
      this.bR.d();
   }

   @Override
   public Either<crx.a, baw> a(iv $$0) {
      jb $$1 = this.dV().a_($$0).c(drd.e);
      if (this.fR() || !this.bJ()) {
         return Either.left(crx.a.e);
      } else if (!this.dV().F_().j()) {
         return Either.left(crx.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(crx.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(crx.a.d);
      } else {
         this.a(new art.a(this.dV().aj(), $$0, this.dL(), false), true);
         if (this.dV().V()) {
            return Either.left(crx.a.b);
         } else {
            if (!this.b()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               ffq $$4 = ffq.c($$0);
               List<coz> $$5 = this.dV()
                  .a(
                     coz.class,
                     new ffl($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0),
                     $$0x -> $$0x.a(this.y(), this)
                  );
               if (!$$5.isEmpty()) {
                  return Either.left(crx.a.f);
               }
            }

            Either<crx.a, baw> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(awz.ap);
               aq.r.a(this);
            });
            if (!this.y().e()) {
               this.a(xa.c("sleep.not_possible"), true);
            }

            ((ars)this.dV()).f();
            return $$6;
         }
      }
   }

   @Override
   public void b(iv $$0) {
      this.a(awz.i.b(awz.n));
      super.b($$0);
   }

   private boolean a(iv $$0, jb $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(iv $$0) {
      ffq $$1 = ffq.c($$0);
      return Math.abs(this.dA() - $$1.a()) <= 3.0 && Math.abs(this.dC() - $$1.b()) <= 2.0 && Math.abs(this.dG() - $$1.c()) <= 3.0;
   }

   private boolean b(iv $$0, jb $$1) {
      iv $$2 = $$0.d();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fR()) {
         this.y().m().a(this, new aby(this, 2));
      }

      super.a($$0, $$1);
      if (this.f != null) {
         this.f.a(this.dA(), this.dC(), this.dG(), this.dL(), this.dN());
      }
   }

   @Override
   public boolean a(ars $$0, bvi $$1) {
      return super.a($$0, $$1) || this.Q() && !$$1.a(bvl.m) || !this.gJ();
   }

   @Override
   protected void b(ars $$0, iv $$1) {
      if (!this.Z_()) {
         super.b($$0, $$1);
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, ebe $$2, iv $$3) {
      if (this.dg && $$1 && this.Z > 0.0) {
         ffq $$4 = $$3.b().b(0.0, 0.5, 0.0);
         int $$5 = (int)azo.a(50.0 * this.Z, 0.0, 200.0);
         this.y().a(new lq(ly.b, $$2), $$4.d, $$4.e, $$4.f, $$5, 0.3F, 0.3F, 0.3F, 0.15F);
         this.dg = false;
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b_(@Nullable bwt $$0) {
      super.b_($$0);
      this.cm = this.dt();
      this.cn = $$0;
      this.w($$0 != null && $$0.an() == bxc.bI);
   }

   @Override
   protected void o() {
      if (this.dV().u().i()) {
         super.o();
      }
   }

   @Override
   public void a(dzq $$0, boolean $$1) {
      this.f.b(new ace(this.dV(), $$0.aB_()));
      this.f.b(new adv($$0.aB_(), $$1));
   }

   private void gU() {
      this.dq = this.dq % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable but $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.bR != this.bQ) {
            this.p();
         }

         this.gU();
         cvq $$1 = $$0.createMenu(this.dq, this.gj(), this);
         if ($$1 == null) {
            if (this.Z_()) {
               this.a(xa.c("container.spectatorCantOpen").a(o.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.f.b(new adu($$1.l, $$1.a(), $$0.m_()));
            this.a($$1);
            this.bR = $$1;
            return OptionalInt.of(this.dq);
         }
      }
   }

   @Override
   public void a(int $$0, diu $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.f.b(new adp($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(clt $$0, buk $$1) {
      if (this.bR != this.bQ) {
         this.p();
      }

      this.gU();
      int $$2 = $$0.ad_();
      this.f.b(new ade(this.dq, $$2, $$0.ao()));
      this.bR = new cws(this.dq, this.gj(), $$1, $$0, $$2);
      this.a(this.bR);
   }

   @Override
   public void a(czy $$0, buq $$1) {
      if ($$0.c(kk.V)) {
         if (ddi.a($$0, this.A(), this)) {
            this.bR.d();
         }

         this.f.b(new adt($$1));
      }
   }

   @Override
   public void a(dyn $$0) {
      this.f.b(acc.a($$0, dyc::e));
   }

   @Override
   public void p() {
      this.f.b(new acp(this.bR.l));
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
      if (!this.bY() && !r($$0, $$1, $$2)) {
         if (this.cj()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(awz.C, $$3);
               this.G(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(axj.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(awz.w, $$4);
               this.G(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.bi()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(awz.s, $$5);
               this.G(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.d_()) {
            if ($$1 > 0.0) {
               this.a(awz.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aH()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.ci()) {
                  this.a(awz.r, $$6);
                  this.G(0.1F * (float)$$6 * 0.01F);
               } else if (this.ch()) {
                  this.a(awz.q, $$6);
                  this.G(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(awz.p, $$6);
                  this.G(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fJ()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(awz.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(awz.v, $$8);
            }
         }
      }
   }

   private void q(double $$0, double $$1, double $$2) {
      if (this.bY() && !r($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         bwt $$4 = this.dk();
         if ($$4 instanceof cuk) {
            this.a(awz.x, $$3);
         } else if ($$4 instanceof cui) {
            this.a(awz.y, $$3);
         } else if ($$4 instanceof ckf) {
            this.a(awz.z, $$3);
         } else if ($$4 instanceof clt) {
            this.a(awz.A, $$3);
         } else if ($$4 instanceof cpm) {
            this.a(awz.D, $$3);
         }
      }
   }

   private static boolean r(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(aww<?> $$0, int $$1) {
      this.cA.b(this, $$0, $$1);
      this.gz().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(aww<?> $$0) {
      this.cA.a(this, $$0, 0);
      this.gz().a($$0, this, fgt::c);
   }

   @Override
   public int a(Collection<deu<?>> $$0) {
      return this.cR.a($$0, this);
   }

   @Override
   public void a(deu<?> $$0, List<czy> $$1) {
      aq.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<alh<dep<?>>> $$0) {
      List<deu<?>> $$1 = $$0.stream().flatMap($$0x -> this.g.aI().b($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<deu<?>> $$0) {
      return this.cR.b($$0, this);
   }

   @Override
   public void s() {
      super.s();
      this.a(awz.E);
      if (this.ci()) {
         this.G(0.2F);
      } else {
         this.G(0.05F);
      }
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cK = -1;
   }

   public void t() {
      this.cU = true;
      this.bN();
      if (this.fR()) {
         this.a(true, false);
      }
   }

   public boolean u() {
      return this.cU;
   }

   @Override
   public void v() {
      this.cH = -1.0E8F;
   }

   @Override
   public void a(xa $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void O_() {
      if (!this.bm.f() && this.fz()) {
         this.f.b(new acz(this, (byte)9));
         super.O_();
      }
   }

   @Override
   public void a(ev.a $$0, ffq $$1) {
      super.a($$0, $$1);
      this.f.b(new aee($$0, $$1.d, $$1.e, $$1.f));
   }

   public void a(ev.a $$0, bwt $$1, ev.a $$2) {
      ffq $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.f.b(new aee($$0, $$1, $$2));
   }

   public void a(art $$0, boolean $$1) {
      this.dh = $$0.dh;
      this.do = $$0.do;
      this.h.a($$0.h.b(), $$0.h.c());
      this.x();
      if ($$1) {
         this.fa().b($$0.fa());
         this.fa().c($$0.fa());
         this.d($$0.eG());
         this.bS = $$0.bS;

         for (bvx $$2 : $$0.eD()) {
            this.a(new bvx($$2));
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
         if (this.y().O().c(djt.e) || $$0.Z_()) {
            this.gj().a($$0.gj());
            this.cf = $$0.cf;
            this.cg = $$0.cg;
            this.ch = $$0.ch;
            this.q($$0.gd());
         }
      }

      this.ci = $$0.ci;
      this.bP = $$0.bP;
      this.ar().a(bK, $$0.ar().a(bK));
      this.cK = -1;
      this.cH = -1.0F;
      this.cI = -1;
      this.cR.a($$0.cR);
      this.i = $$0.i;
      this.cY = $$0.cY;
      this.db = $$0.db;
      this.k($$0.gB());
      this.l($$0.gC());
      this.a($$0.gI());
   }

   @Override
   protected void a(bvx $$0, @Nullable bwt $$1) {
      super.a($$0, $$1);
      this.f.b(new agk(this.ao(), $$0, true));
      if ($$0.a(bvz.y)) {
         this.cT = this.af;
         this.cS = this.dt();
      }

      aq.B.a(this, $$1);
   }

   @Override
   protected void a(bvx $$0, boolean $$1, @Nullable bwt $$2) {
      super.a($$0, $$1, $$2);
      this.f.b(new agk(this.ao(), $$0, false));
      aq.B.a(this, $$2);
   }

   @Override
   protected void c(Collection<bvx> $$0) {
      super.c($$0);

      for (bvx $$1 : $$0) {
         this.f.b(new aem(this.ao(), $$1.c()));
         if ($$1.a(bvz.y)) {
            this.cS = null;
         }
      }

      aq.B.a(this, null);
   }

   @Override
   public void b(double $$0, double $$1, double $$2) {
      this.f.a(new byh(new ffq($$0, $$1, $$2), ffq.c, 0.0F, 0.0F), byi.a(byi.l, byi.k));
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.f.a(new byh(new ffq($$0, $$1, $$2), ffq.c, 0.0F, 0.0F), byi.j);
   }

   @Override
   public boolean a(ars $$0, double $$1, double $$2, double $$3, Set<byi> $$4, float $$5, float $$6, boolean $$7) {
      if (this.fR()) {
         this.a(true, true);
      }

      if ($$7) {
         this.d(this);
      }

      boolean $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$8) {
         this.r($$4.contains(byi.d) ? this.cA() + $$5 : $$5);
      }

      return $$8;
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      super.d($$0, $$1, $$2);
      this.f.l();
   }

   @Override
   public void b(bwt $$0) {
      this.y().m().a(this, new aby($$0, 4));
   }

   @Override
   public void c(bwt $$0) {
      this.y().m().a(this, new aby($$0, 5));
   }

   @Override
   public void x() {
      if (this.f != null) {
         this.f.b(new adx(this.gk()));
         this.K();
      }
   }

   public ars y() {
      return (ars)this.dV();
   }

   public boolean a(dju $$0) {
      boolean $$1 = this.Z_();
      if (!this.h.a($$0)) {
         return false;
      } else {
         this.f.b(new add(add.e, (float)$$0.a()));
         if ($$0 == dju.d) {
            this.gy();
            this.bO();
            dgn.a(this);
         } else {
            this.d(this);
            if ($$1) {
               dgn.a(this.y(), this);
            }
         }

         this.x();
         this.fx();
         return true;
      }
   }

   @Override
   public boolean Z_() {
      return this.h.b() == dju.d;
   }

   @Override
   public boolean b() {
      return this.h.b() == dju.b;
   }

   public ei z() {
      return this.dp;
   }

   public ej A() {
      return new ej(this.z(), this.dt(), this.bT(), this.y(), this.G(), this.ai().getString(), this.m_(), this.g, this);
   }

   public void a(xa $$0) {
      this.b($$0, false);
   }

   public void b(xa $$0, boolean $$1) {
      if (this.x($$1)) {
         this.f.a(new aga($$0, $$1), wh.a(() -> {
            if (this.x(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               xa $$3 = xa.b($$2).a(o.o);
               return new aga(xa.a("multiplayer.message_not_delivered", $$3).a(o.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(xp $$0, boolean $$1, ww.a $$2) {
      if (this.gV()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String B() {
      return this.f.m() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(arc $$0) {
      this.cW = $$0.b();
      this.cV = $$0.c();
      this.cL = $$0.d();
      this.cN = $$0.e();
      this.de = $$0.h();
      this.df = $$0.i();
      this.cM = $$0.j();
      this.ar().a(bK, (byte)$$0.f());
      this.ar().a(bL, (byte)$$0.g().b());
   }

   public arc C() {
      int $$0 = this.ar().a(bK);
      bxl $$1 = bxl.d.apply(this.ar().a(bL));
      return new arc(this.cW, this.cV, this.cL, this.cN, $$0, $$1, this.de, this.df, this.cM);
   }

   public boolean D() {
      return this.cN;
   }

   public cru E() {
      return this.cL;
   }

   private boolean x(boolean $$0) {
      return this.cL == cru.c ? $$0 : true;
   }

   private boolean gV() {
      return this.cL == cru.a;
   }

   public int F() {
      return this.cV;
   }

   public void a(akf $$0) {
      this.f.b(new aes($$0.a(), $$0.d().map(akf.a::a)));
   }

   @Override
   public int G() {
      return this.g.c(this.gi());
   }

   public void H() {
      this.cO = ag.c();
   }

   public awv I() {
      return this.cA;
   }

   public awu J() {
      return this.cR;
   }

   @Override
   protected void K() {
      if (this.Z_()) {
         this.eB();
         this.k(true);
      } else {
         super.K();
      }
   }

   public bwt L() {
      return (bwt)(this.cP == null ? this : this.cP);
   }

   @Override
   public void d(@Nullable bwt $$0) {
      bwt $$1 = this.L();
      this.cP = (bwt)($$0 == null ? this : $$0);
      if ($$1 != this.cP) {
         if (this.cP.dV() instanceof ars $$2) {
            this.a($$2, this.cP.dA(), this.cP.dC(), this.cP.dG(), Set.of(), this.dL(), this.dN(), false);
         }

         if ($$0 != null) {
            this.y().m().a(this);
         }

         this.f.b(new aez(this.cP));
         this.f.l();
      }
   }

   @Override
   protected void M() {
      if (!this.cQ) {
         super.M();
      }
   }

   @Override
   public void e(bwt $$0) {
      if (this.h.b() == dju.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long N() {
      return this.cO;
   }

   @Nullable
   public xa O() {
      return null;
   }

   public int P() {
      return 0;
   }

   @Override
   public void a(buq $$0) {
      super.a($$0);
      this.gE();
   }

   public boolean Q() {
      return this.cQ;
   }

   public void R() {
      this.cQ = false;
   }

   public alq S() {
      return this.cz;
   }

   @Nullable
   public art.a T() {
      return this.dc;
   }

   public void b(art $$0) {
      this.a($$0.dc, false);
   }

   public void a(@Nullable art.a $$0, boolean $$1) {
      if ($$1 && $$0 != null && !$$0.a(this.dc)) {
         this.a(cw);
      }

      this.dc = $$0;
   }

   public jy U() {
      return this.da;
   }

   public void a(jy $$0) {
      this.da = $$0;
   }

   public arb V() {
      return this.db;
   }

   public void a(arb $$0) {
      this.db = $$0;
   }

   @Override
   public void a(awo $$0, awq $$1, float $$2, float $$3) {
      this.f.b(new afx(mg.b.e($$0), $$1, this.dA(), this.dC(), this.dG(), $$2, $$3, this.ae.g()));
   }

   @Override
   public coc a(czy $$0, boolean $$1, boolean $$2) {
      coc $$3 = super.a($$0, $$1, $$2);
      if ($$2) {
         czy $$4 = $$3 != null ? $$3.f() : czy.k;
         if (!$$4.f()) {
            this.a(awz.f.b($$4.h()), $$0.M());
            this.a(awz.F);
         }
      }

      return $$3;
   }

   public atb W() {
      return this.dd;
   }

   public void a(ars $$0) {
      this.a((djx)$$0);
      this.h.a($$0);
   }

   @Nullable
   private static dju a(@Nullable tz $$0, String $$1) {
      return $$0 != null ? $$0.<dju>a($$1, dju.g).orElse(null) : null;
   }

   private dju b(@Nullable dju $$0) {
      dju $$1 = this.g.bd();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.g.u();
      }
   }

   @Override
   public void e(@Nullable tz $$0) {
      this.h.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void p(tz $$0) {
      $$0.a("playerGameType", dju.g, this.h.b());
      dju $$1 = this.h.c();
      $$0.b("previousPlayerGameType", dju.g, $$1);
   }

   @Override
   public boolean X() {
      return this.de;
   }

   public boolean c(art $$0) {
      return $$0 == this ? false : this.de || $$0.de;
   }

   @Override
   public boolean c(ars $$0, iv $$1) {
      return super.c($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(czy $$0) {
      aq.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      crw $$1 = this.gj();
      czy $$2 = $$1.a($$0);
      this.bR.b($$1, $$1.f()).ifPresent($$1x -> this.bR.a($$1x, $$1.g()));
      return this.a($$2, false, true) != null;
   }

   @Override
   public void b(czy $$0) {
      if (!this.gj().g($$0)) {
         this.a($$0, false);
      }
   }

   public boolean Y() {
      return this.df;
   }

   @Override
   public Optional<crc> Z() {
      return Optional.of(this.dh);
   }

   public void b(boolean $$0) {
      this.dg = $$0;
   }

   @Override
   public void a(coc $$0) {
      super.a($$0);
      bwt $$1 = $$0.q();
      if ($$1 != null) {
         aq.S.a(this, $$0.f(), $$1);
      }
   }

   public void a(xr $$0) {
      this.do = $$0;
   }

   @Nullable
   public xr aa() {
      return this.do != null && this.do.b() ? null : this.do;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cl = (float)(azo.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dL());
      this.f.b(new adf(this));
   }

   @Override
   public boolean a(bwt $$0, boolean $$1) {
      if (super.a($$0, $$1)) {
         $$0.j(this);
         this.f.a(new byh(this.dt(), ffq.c, 0.0F, 0.0F), byi.k);
         if ($$0 instanceof bxu $$2) {
            this.g.ag().a($$2, this.f);
         }

         this.f.b(new afn($$0));
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void ab() {
      bwt $$0 = this.dk();
      super.ab();
      if ($$0 instanceof bxu $$1) {
         for (bvx $$2 : $$1.eD()) {
            this.f.b(new aem($$0.ao(), $$2.c()));
         }
      }

      if ($$0 != null) {
         this.f.b(new afn($$0));
      }
   }

   public agm b(ars $$0) {
      return new agm($$0.ai(), $$0.aj(), dlc.a($$0.E()), this.h.b(), this.h.c(), $$0.ak(), $$0.D(), this.gI(), this.az(), $$0.P());
   }

   @Override
   public void c(iv $$0) {
      this.di = $$0;
   }

   public void ac() {
      this.di = null;
   }

   @Nullable
   public iv ad() {
      return this.di;
   }

   @Override
   public ffq ae() {
      bwt $$0 = this.dk();
      return $$0 != null && $$0.cW() != this ? $$0.ae() : this.dj;
   }

   public void a(ffq $$0) {
      this.dj = $$0;
   }

   @Override
   protected float a(bwt $$0, float $$1, bvi $$2) {
      return dgn.a(this.y(), this.dZ(), $$0, $$2, $$1);
   }

   @Override
   public void a(czu $$0, bxd $$1) {
      super.a($$0, $$1);
      this.b(awz.d.b($$0));
   }

   public crv af() {
      return this.dk;
   }

   public void a(crv $$0) {
      this.dk = $$0;
   }

   public ffq ag() {
      float $$0 = this.dk.c() == this.dk.d() ? 0.0F : (this.dk.c() ? 1.0F : -1.0F);
      float $$1 = this.dk.a() == this.dk.b() ? 0.0F : (this.dk.a() ? 1.0F : -1.0F);
      return a(new ffq((double)$$0, 0.0, (double)$$1), 1.0F, this.dL());
   }

   public void a(ctc $$0) {
      this.dl.add($$0);
   }

   public void b(ctc $$0) {
      this.dl.remove($$0);
   }

   public Set<ctc> ah() {
      return this.dl;
   }

   public long c(ctc $$0) {
      if ($$0.dV() instanceof ars $$1) {
         djc $$2 = $$0.dx();
         this.a($$0);
         $$1.i();
         return a($$1, $$2) - 1L;
      } else {
         return 0L;
      }
   }

   public static long a(ars $$0, djc $$1) {
      $$0.m().a(arz.h, $$1, 2);
      return arz.h.d();
   }

   public static record a(alh<djx> b, iv c, float d, boolean e) {
      public static final Codec<art.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  djx.h.optionalFieldOf("dimension", djx.i).forGetter(art.a::a),
                  iv.a.fieldOf("pos").forGetter(art.a::b),
                  Codec.FLOAT.optionalFieldOf("angle", 0.0F).forGetter(art.a::c),
                  Codec.BOOL.optionalFieldOf("forced", false).forGetter(art.a::d)
               )
               .apply($$0, art.a::new)
      );

      static alh<djx> b(@Nullable art.a $$0) {
         return $$0 != null ? $$0.a() : djx.i;
      }

      public boolean a(@Nullable art.a $$0) {
         return $$0 != null && this.b == $$0.b && this.c.equals($$0.c);
      }

      public alh<djx> a() {
         return this.b;
      }

      public iv b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }
   }

   static record b(ffq a, float b) {
      public static art.b a(ffq $$0, iv $$1) {
         return new art.b($$0, b($$0, $$1));
      }

      private static float b(ffq $$0, iv $$1) {
         ffq $$2 = ffq.c($$1).d($$0).d();
         return (float)azo.d(azo.d($$2.f, $$2.d) * 180.0F / (float)Math.PI - 90.0);
      }
   }
}
