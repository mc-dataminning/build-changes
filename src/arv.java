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

public class arv extends crz {
   private static final Logger cq = LogUtils.getLogger();
   private static final int cr = 32;
   private static final int cs = 10;
   private static final int ct = 25;
   public static final double a = 1.0;
   public static final double b = 3.0;
   public static final int c = 2;
   public static final String d = "ender_pearls";
   public static final String e = "ender_pearl_dimension";
   private static final bza cu = new bza(alk.b("creative_mode_block_range"), 0.5, bza.a.a);
   private static final bza cv = new bza(alk.b("creative_mode_entity_range"), 2.0, bza.a.a);
   private static final xc cw = xc.c("block.minecraft.set_spawn");
   private static final boolean cx = false;
   private static final boolean cy = false;
   public asx f;
   public final MinecraftServer g;
   public final arw h;
   private final als cz;
   private final awx cA;
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
   private crw cL = crw.a;
   private arm cM = arm.a;
   private boolean cN = true;
   private long cO = ag.c();
   @Nullable
   private bwv cP;
   private boolean cQ;
   public boolean i = false;
   private final aww cR;
   @Nullable
   private ffs cS;
   private int cT;
   private boolean cU;
   private int cV = 2;
   private String cW = "en_us";
   @Nullable
   private ffs cX;
   @Nullable
   private ffs cY;
   @Nullable
   private ffs cZ;
   private jz da = jz.a(0, 0, 0);
   private ard db = ard.a;
   @Nullable
   private arv.a dc;
   private final atd dd;
   private boolean de;
   private boolean df;
   private boolean dg = false;
   private cre dh = new cre();
   @Nullable
   private iw di;
   private ffs dj = ffs.c;
   private crx dk = crx.b;
   private final Set<cte> dl = new HashSet<>();
   private final cwh dm = new cwh() {
      @Override
      public void a(cvs $$0, jp<daa> $$1, daa $$2, int[] $$3) {
         arv.this.f.b(new acs($$0.l, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cvs $$0, int $$1, daa $$2) {
         arv.this.f.b(new acu($$0.l, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cvs $$0, daa $$1) {
         arv.this.f.b(new afe($$1.v()));
      }

      @Override
      public void a(cvs $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cvs $$0, int $$1, int $$2) {
         arv.this.f.b(new act($$0.l, $$1, $$2));
      }
   };
   private final cwg dn = new cwg() {
      @Override
      public void a(cvs $$0, int $$1, daa $$2) {
         cxp $$3 = $$0.b($$1);
         if (!($$3 instanceof cxl)) {
            if ($$3.c == arv.this.gj()) {
               aq.f.a(arv.this, arv.this.gj(), $$2);
            }
         }
      }

      @Override
      public void a(cvs $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private xt do;
   @Nullable
   public final Object j;
   private final ej dp = new ej() {
      @Override
      public boolean x_() {
         return arv.this.y().O().c(djv.q);
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
      public void a(xc $$0) {
         arv.this.a($$0);
      }
   };
   private int dq;
   public boolean k;

   public arv(MinecraftServer $$0, aru $$1, GameProfile $$2, are $$3) {
      super($$1, $$1.aa(), $$1.ab(), $$2);
      this.dd = $$0.a(this);
      this.h = $$0.b(this);
      this.cR = new aww(($$1x, $$2x) -> $$0.aI().a($$1x, $$2x));
      this.g = $$0;
      this.cA = $$0.ag().a((crz)this);
      this.cz = $$0.ag().g(this);
      this.b(this.a($$1, $$1.aa()).c(), 0.0F, 0.0F);
      this.a($$3);
      this.j = null;
   }

   @Override
   public iw a(aru $$0, iw $$1) {
      ffn $$2 = this.a(byi.a).a(ffs.c);
      iw $$3 = $$1;
      if ($$0.F_().g() && $$0.p().aZ().k() != djw.c) {
         int $$4 = Math.max(0, this.g.a($$0));
         int $$5 = azq.a($$0.E_().b((double)$$1.u(), (double)$$1.w()));
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
         int $$10 = azz.a().a($$8);

         for (int $$11 = 0; $$11 < $$8; $$11++) {
            int $$12 = ($$10 + $$9 * $$11) % $$8;
            int $$13 = $$12 % ($$4 * 2 + 1);
            int $$14 = $$12 / ($$4 * 2 + 1);
            int $$15 = $$1.u() + $$13 - $$4;
            int $$16 = $$1.w() + $$14 - $$4;

            try {
               $$3 = aro.a($$0, $$15, $$16);
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

   private boolean a(aru $$0, ffn $$1) {
      return $$0.a(this, $$1, true);
   }

   private int t(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.dh = $$0.<cre>a("warden_spawn_tracker", cre.a).orElseGet(cre::new);
      this.cY = $$0.<ffs>a("entered_nether_pos", ffs.a).orElse(null);
      this.i = $$0.b("seenCredits", false);
      this.cR.a($$0.n("recipeBook"), $$0x -> this.g.aI().b($$0x).isPresent());
      if (this.fR()) {
         this.fS();
      }

      this.dc = $$0.<arv.a>a("respawn", arv.a.a).orElse(null);
      this.dg = $$0.b("spawn_extra_particles_on_fall", false);
      this.di = $$0.<iw>a("raid_omen_position", iw.a).orElse(null);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("warden_spawn_tracker", cre.a, this.dh);
      this.p($$0);
      $$0.a("seenCredits", this.i);
      $$0.b("entered_nether_pos", ffs.a, this.cY);
      this.m($$0);
      $$0.a("recipeBook", this.cR.b());
      $$0.a("Dimension", this.dV().aj().a().toString());
      $$0.b("respawn", arv.a.a, this.dc);
      $$0.a("spawn_extra_particles_on_fall", this.dg);
      $$0.b("raid_omen_position", iw.a, this.di);
      this.n($$0);
   }

   private void m(ua $$0) {
      bwv $$1 = this.df();
      bwv $$2 = this.dk();
      if ($$2 != null && $$1 != this && $$1.de()) {
         ua $$3 = new ua();
         ua $$4 = new ua();
         $$1.g($$4);
         $$3.a("Attach", ka.a, $$2.cG());
         $$3.a("Entity", $$4);
         $$0.a("RootVehicle", $$3);
      }
   }

   @Override
   public void c(ua $$0) {
      Optional<ua> $$1 = $$0.m("RootVehicle");
      if (!$$1.isEmpty()) {
         aru $$2 = this.y();
         bwv $$3 = bxe.a($$1.get().n("Entity"), $$2, bxd.r, $$1x -> !$$2.c($$1x) ? null : $$1x);
         if ($$3 != null) {
            UUID $$4 = $$1.get().<UUID>a("Attach", ka.a).orElse(null);
            if ($$3.cG().equals($$4)) {
               this.a($$3, true);
            } else {
               for (bwv $$5 : $$3.dc()) {
                  if ($$5.cG().equals($$4)) {
                     this.a($$5, true);
                     break;
                  }
               }
            }

            if (!this.bY()) {
               cq.warn("Couldn't reattach entity to player");
               $$3.aq();

               for (bwv $$6 : $$3.dc()) {
                  $$6.aq();
               }
            }
         }
      }
   }

   private void n(ua $$0) {
      if (!this.dl.isEmpty()) {
         ug $$1 = new ug();

         for (cte $$2 : this.dl) {
            if ($$2.dQ()) {
               cq.warn("Trying to save removed ender pearl, skipping");
            } else {
               ua $$3 = new ua();
               $$2.g($$3);
               $$3.a("ender_pearl_dimension", djz.h, $$2.dV().aj());
               $$1.add($$3);
            }
         }

         $$0.a("ender_pearls", $$1);
      }
   }

   @Override
   public void d(ua $$0) {
      $$0.o("ender_pearls").ifPresent($$0x -> $$0x.j().forEach(this::o));
   }

   private void o(ua $$0) {
      Optional<alj<djz>> $$1 = $$0.a("ender_pearl_dimension", djz.h);
      if (!$$1.isEmpty()) {
         aru $$2 = this.y().p().a($$1.get());
         if ($$2 != null) {
            bwv $$3 = bxe.a($$0, $$2, bxd.r, $$1x -> !$$2.c($$1x) ? null : $$1x);
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
      this.ch = azq.a((float)$$0 / $$1, 0.0F, $$2);
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
   public void a(daa $$0, int $$1) {
      super.a($$0, $$1);
      this.cK = -1;
   }

   private void a(cvs $$0) {
      $$0.a(this.dn);
      $$0.a(this.dm);
   }

   public void d() {
      this.a(this.bQ);
   }

   @Override
   public void e_() {
      super.e_();
      this.f.b(aec.a);
   }

   @Override
   public void N_() {
      super.N_();
      this.f.b(new aeb(this.eS()));
   }

   @Override
   public void a(ebg $$0) {
      aq.e.a(this, $$0);
   }

   @Override
   protected czx g() {
      return new day(this);
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

      bwv $$0 = this.L();
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
      byy $$0 = this.g(bzc.g);
      if ($$0 != null) {
         if (this.b()) {
            $$0.a(cu);
         } else {
            $$0.e(cu);
         }
      }

      byy $$1 = this.g(bzc.j);
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
            daa $$1 = this.gj().a($$0);
            if (!$$1.f()) {
               this.i($$1);
            }
         }

         if (this.eG() != this.cH || this.cI != this.bS.a() || this.bS.c() == 0.0F != this.cJ) {
            this.f.b(new afm(this.eG(), this.bS.a(), this.bS.c()));
            this.cH = this.eG();
            this.cI = this.bS.a();
            this.cJ = this.bS.c() == 0.0F;
         }

         if (this.eG() + this.fw() != this.cB) {
            this.cB = this.eG() + this.fw();
            this.a(fha.h, azq.f(this.cB));
         }

         if (this.bS.a() != this.cC) {
            this.cC = this.bS.a();
            this.a(fha.i, azq.f((float)this.cC));
         }

         if (this.cs() != this.cD) {
            this.cD = this.cs();
            this.a(fha.j, azq.f((float)this.cD));
         }

         if (this.eR() != this.cE) {
            this.cE = this.eR();
            this.a(fha.k, azq.f((float)this.cE));
         }

         if (this.cg != this.cG) {
            this.cG = this.cg;
            this.a(fha.l, azq.f((float)this.cG));
         }

         if (this.cf != this.cF) {
            this.cF = this.cf;
            this.a(fha.m, azq.f((float)this.cF));
         }

         if (this.cg != this.cK) {
            this.cK = this.cg;
            this.f.b(new afl(this.ch, this.cg, this.cf));
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

   private void i(daa $$0) {
      ezj $$1 = $$0.a(kl.M);
      ezl $$2 = dan.a($$1, this.dV());
      if ($$2 != null) {
         zj<?> $$3 = $$2.a($$1, this);
         if ($$3 != null) {
            this.f.b($$3);
         }
      }
   }

   @Override
   protected void j() {
      if (this.dV().an() == buq.a && this.y().O().c(djv.l)) {
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

   private void a(fha $$0, int $$1) {
      this.gz().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(bvk $$0) {
      this.a(egg.p);
      boolean $$1 = this.y().O().c(djv.o);
      if ($$1) {
         xc $$2 = this.eS().a();
         this.f.a(new aed(this.ao(), $$2), wj.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            xc $$3x = xc.a("death.attack.message_too_long", xc.b($$2x).a(o.o));
            xc $$4x = xc.a("death.attack.even_more_magic", this.m_()).a($$1xx -> $$1xx.a(new xi.e($$3x)));
            return new aed(this.ao(), $$4x);
         }));
         fgz $$3 = this.cq();
         if ($$3 == null || $$3.l() == fgz.b.a) {
            this.g.ag().a($$2, false);
         } else if ($$3.l() == fgz.b.c) {
            this.g.ag().a(this, $$2);
         } else if ($$3.l() == fgz.b.d) {
            this.g.ag().b(this, $$2);
         }
      } else {
         this.f.b(new aed(this.ao(), xb.a));
      }

      this.gy();
      if (this.y().O().c(djv.P)) {
         this.gS();
      }

      if (!this.Z_()) {
         this.b(this.y(), $$0);
      }

      this.gz().a(fha.e, this, fgv::b);
      bxw $$4 = this.eT();
      if ($$4 != null) {
         this.b(axb.h.b($$4.an()));
         $$4.a(this, $$0);
         this.e($$4);
      }

      this.dV().a(this, (byte)3);
      this.a(axb.N);
      this.a(axb.i.b(axb.m));
      this.a(axb.i.b(axb.n));
      this.aF();
      this.k(0);
      this.c(false);
      this.eS().c();
      this.a(Optional.of(jf.a(this.dV().aj(), this.dv())));
      this.v(false);
   }

   private void gS() {
      ffn $$0 = new ffn(this.dv()).c(32.0, 10.0, 32.0);
      this.dV().a(bxy.class, $$0, bxc.f).stream().filter($$0x -> $$0x instanceof byb).forEach($$0x -> ((byb)$$0x).a_(this.y(), this));
   }

   @Override
   public void a(bwv $$0, bvk $$1) {
      if ($$0 != this) {
         super.a($$0, $$1);
         this.gz().a(fha.g, this, fgv::b);
         if ($$0 instanceof crz) {
            this.a(axb.Q);
            this.gz().a(fha.f, this, fgv::b);
         } else {
            this.a(axb.O);
         }

         this.a(this, $$0, fha.n);
         this.a($$0, this, fha.o);
         aq.c.a(this, $$0, $$1);
      }
   }

   private void a(fgw $$0, fgw $$1, fha[] $$2) {
      fgs $$3 = this.gz().e($$1.cI());
      if ($$3 != null) {
         int $$4 = $$3.o().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gz().a($$2[$$4], $$0, fgv::b);
         }
      }
   }

   @Override
   public boolean a(aru $$0, bvk $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         bwv $$3 = $$1.d();
         if ($$3 instanceof crz $$4 && !this.a($$4)) {
            return false;
         }

         if ($$3 instanceof csh $$5 && $$5.q() instanceof crz $$7 && !this.a($$7)) {
            return false;
         }

         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(crz $$0) {
      return !this.gT() ? false : super.a($$0);
   }

   private boolean gT() {
      return this.g.ac();
   }

   public eyq a(boolean $$0, eyq.a $$1) {
      arv.a $$2 = this.T();
      aru $$3 = this.g.a(arv.a.b($$2));
      if ($$3 != null && $$2 != null) {
         Optional<arv.b> $$4 = a($$3, $$2, $$0);
         if ($$4.isPresent()) {
            arv.b $$5 = $$4.get();
            return new eyq($$3, $$5.a(), ffs.c, $$5.b(), 0.0F, $$1);
         } else {
            return eyq.a(this.g.J(), this, $$1);
         }
      } else {
         return new eyq(this.g.J(), this, $$1);
      }
   }

   private static Optional<arv.b> a(aru $$0, arv.a $$1, boolean $$2) {
      iw $$3 = $$1.c;
      float $$4 = $$1.d;
      boolean $$5 = $$1.e;
      ebg $$6 = $$0.a_($$3);
      dne $$7 = $$6.b();
      if ($$7 instanceof dtt && ($$5 || $$6.c(dtt.d) > 0) && dtt.a($$0)) {
         Optional<ffs> $$8 = dtt.a(bxe.bT, $$0, $$3);
         if (!$$5 && $$2 && $$8.isPresent()) {
            $$0.a($$3, $$6.b(dtt.d, Integer.valueOf($$6.c(dtt.d) - 1)), 3);
         }

         return $$8.map($$1x -> arv.b.a($$1x, $$3));
      } else if ($$7 instanceof dmx && dmx.a($$0)) {
         return dmx.a(bxe.bT, $$0, $$3, $$6.c(dmx.e), $$4).map($$1x -> arv.b.a($$1x, $$3));
      } else if (!$$5) {
         return Optional.empty();
      } else {
         boolean $$9 = $$7.a($$6);
         ebg $$10 = $$0.a_($$3.d());
         boolean $$11 = $$10.b().a($$10);
         return $$9 && $$11 ? Optional.of(new arv.b(new ffs((double)$$3.u() + 0.5, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5), $$4)) : Optional.empty();
      }
   }

   @Override
   public void n() {
      this.al();
      this.y().a(this, bwv.d.e);
      if (!this.k) {
         this.k = true;
         this.f.b(new adf(adf.f, 0.0F));
         this.i = true;
      }
   }

   @Nullable
   public arv a(eyq $$0) {
      if (this.dQ()) {
         return null;
      } else {
         if ($$0.g()) {
            this.f.b(new adf(adf.b, 0.0F));
         }

         aru $$1 = $$0.b();
         aru $$2 = this.y();
         alj<djz> $$3 = $$2.aj();
         if (!$$0.h()) {
            this.ab();
         }

         if ($$1.aj() == $$3) {
            this.f.a(byj.a($$0), $$0.i());
            this.f.l();
            $$0.j().onTransition(this);
            return this;
         } else {
            this.cQ = true;
            ezt $$4 = $$1.C_();
            this.f.b(new aeq(this.b($$1), (byte)3));
            this.f.b(new ack($$4.q(), $$4.r()));
            avu $$5 = this.g.ag();
            $$5.e(this);
            $$2.a(this, bwv.d.e);
            this.dS();
            brd $$6 = brc.a();
            $$6.a("moving");
            if ($$3 == djz.i && $$1.aj() == djz.j) {
               this.cY = this.dt();
            }

            $$6.c();
            $$6.a("placing");
            this.a($$1);
            this.f.a(byj.a($$0), $$0.i());
            this.f.l();
            $$1.d(this);
            $$6.c();
            this.g($$2);
            this.fF();
            this.f.b(new adz(this.gk()));
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
      this.f.b(new aei($$0, $$1));
   }

   private void g(aru $$0) {
      alj<djz> $$1 = $$0.aj();
      alj<djz> $$2 = this.dV().aj();
      aq.w.a(this, $$1, $$2);
      if ($$1 == djz.j && $$2 == djz.i && this.cY != null) {
         aq.D.a(this, this.cY);
      }

      if ($$2 != djz.j) {
         this.cY = null;
      }
   }

   @Override
   public boolean a(arv $$0) {
      if ($$0.Z_()) {
         return this.L() == this;
      } else {
         return this.Z_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bwv $$0, int $$1) {
      super.a($$0, $$1);
      this.bR.d();
   }

   @Override
   public Either<crz.a, bay> a(iw $$0) {
      jc $$1 = this.dV().a_($$0).c(drf.e);
      if (this.fR() || !this.bJ()) {
         return Either.left(crz.a.e);
      } else if (!this.dV().F_().j()) {
         return Either.left(crz.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(crz.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(crz.a.d);
      } else {
         this.a(new arv.a(this.dV().aj(), $$0, this.dL(), false), true);
         if (this.dV().V()) {
            return Either.left(crz.a.b);
         } else {
            if (!this.b()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               ffs $$4 = ffs.c($$0);
               List<cpb> $$5 = this.dV()
                  .a(
                     cpb.class,
                     new ffn($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0),
                     $$0x -> $$0x.a(this.y(), this)
                  );
               if (!$$5.isEmpty()) {
                  return Either.left(crz.a.f);
               }
            }

            Either<crz.a, bay> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(axb.ap);
               aq.r.a(this);
            });
            if (!this.y().e()) {
               this.a(xc.c("sleep.not_possible"), true);
            }

            ((aru)this.dV()).f();
            return $$6;
         }
      }
   }

   @Override
   public void b(iw $$0) {
      this.a(axb.i.b(axb.n));
      super.b($$0);
   }

   private boolean a(iw $$0, jc $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(iw $$0) {
      ffs $$1 = ffs.c($$0);
      return Math.abs(this.dA() - $$1.a()) <= 3.0 && Math.abs(this.dC() - $$1.b()) <= 2.0 && Math.abs(this.dG() - $$1.c()) <= 3.0;
   }

   private boolean b(iw $$0, jc $$1) {
      iw $$2 = $$0.d();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fR()) {
         this.y().m().a(this, new aca(this, 2));
      }

      super.a($$0, $$1);
      if (this.f != null) {
         this.f.a(this.dA(), this.dC(), this.dG(), this.dL(), this.dN());
      }
   }

   @Override
   public boolean a(aru $$0, bvk $$1) {
      return super.a($$0, $$1) || this.Q() && !$$1.a(bvn.m) || !this.gJ();
   }

   @Override
   protected void b(aru $$0, iw $$1) {
      if (!this.Z_()) {
         super.b($$0, $$1);
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, ebg $$2, iw $$3) {
      if (this.dg && $$1 && this.Z > 0.0) {
         ffs $$4 = $$3.b().b(0.0, 0.5, 0.0);
         int $$5 = (int)azq.a(50.0 * this.Z, 0.0, 200.0);
         this.y().a(new lr(lz.b, $$2), $$4.d, $$4.e, $$4.f, $$5, 0.3F, 0.3F, 0.3F, 0.15F);
         this.dg = false;
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b_(@Nullable bwv $$0) {
      super.b_($$0);
      this.cm = this.dt();
      this.cn = $$0;
      this.w($$0 != null && $$0.an() == bxe.bI);
   }

   @Override
   protected void o() {
      if (this.dV().u().i()) {
         super.o();
      }
   }

   @Override
   public void a(dzs $$0, boolean $$1) {
      this.f.b(new acg(this.dV(), $$0.aB_()));
      this.f.b(new adx($$0.aB_(), $$1));
   }

   private void gU() {
      this.dq = this.dq % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable buv $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.bR != this.bQ) {
            this.p();
         }

         this.gU();
         cvs $$1 = $$0.createMenu(this.dq, this.gj(), this);
         if ($$1 == null) {
            if (this.Z_()) {
               this.a(xc.c("container.spectatorCantOpen").a(o.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.f.b(new adw($$1.l, $$1.a(), $$0.m_()));
            this.a($$1);
            this.bR = $$1;
            return OptionalInt.of(this.dq);
         }
      }
   }

   @Override
   public void a(int $$0, diw $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.f.b(new adr($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(clv $$0, bum $$1) {
      if (this.bR != this.bQ) {
         this.p();
      }

      this.gU();
      int $$2 = $$0.ad_();
      this.f.b(new adg(this.dq, $$2, $$0.ao()));
      this.bR = new cwu(this.dq, this.gj(), $$1, $$0, $$2);
      this.a(this.bR);
   }

   @Override
   public void a(daa $$0, bus $$1) {
      if ($$0.c(kl.V)) {
         if (ddk.a($$0, this.A(), this)) {
            this.bR.d();
         }

         this.f.b(new adv($$1));
      }
   }

   @Override
   public void a(dyp $$0) {
      this.f.b(ace.a($$0, dye::e));
   }

   @Override
   public void p() {
      this.f.b(new acr(this.bR.l));
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
               this.a(axb.C, $$3);
               this.G(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(axl.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(axb.w, $$4);
               this.G(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.bi()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(axb.s, $$5);
               this.G(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.d_()) {
            if ($$1 > 0.0) {
               this.a(axb.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aH()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.ci()) {
                  this.a(axb.r, $$6);
                  this.G(0.1F * (float)$$6 * 0.01F);
               } else if (this.ch()) {
                  this.a(axb.q, $$6);
                  this.G(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(axb.p, $$6);
                  this.G(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fJ()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(axb.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(axb.v, $$8);
            }
         }
      }
   }

   private void q(double $$0, double $$1, double $$2) {
      if (this.bY() && !r($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         bwv $$4 = this.dk();
         if ($$4 instanceof cum) {
            this.a(axb.x, $$3);
         } else if ($$4 instanceof cuk) {
            this.a(axb.y, $$3);
         } else if ($$4 instanceof ckh) {
            this.a(axb.z, $$3);
         } else if ($$4 instanceof clv) {
            this.a(axb.A, $$3);
         } else if ($$4 instanceof cpo) {
            this.a(axb.D, $$3);
         }
      }
   }

   private static boolean r(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(awy<?> $$0, int $$1) {
      this.cA.b(this, $$0, $$1);
      this.gz().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(awy<?> $$0) {
      this.cA.a(this, $$0, 0);
      this.gz().a($$0, this, fgv::c);
   }

   @Override
   public int a(Collection<dew<?>> $$0) {
      return this.cR.a($$0, this);
   }

   @Override
   public void a(dew<?> $$0, List<daa> $$1) {
      aq.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<alj<der<?>>> $$0) {
      List<dew<?>> $$1 = $$0.stream().flatMap($$0x -> this.g.aI().b($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<dew<?>> $$0) {
      return this.cR.b($$0, this);
   }

   @Override
   public void s() {
      super.s();
      this.a(axb.E);
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
   public void a(xc $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void O_() {
      if (!this.bm.f() && this.fz()) {
         this.f.b(new adb(this, (byte)9));
         super.O_();
      }
   }

   @Override
   public void a(ew.a $$0, ffs $$1) {
      super.a($$0, $$1);
      this.f.b(new aeg($$0, $$1.d, $$1.e, $$1.f));
   }

   public void a(ew.a $$0, bwv $$1, ew.a $$2) {
      ffs $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.f.b(new aeg($$0, $$1, $$2));
   }

   public void a(arv $$0, boolean $$1) {
      this.dh = $$0.dh;
      this.do = $$0.do;
      this.h.a($$0.h.b(), $$0.h.c());
      this.x();
      if ($$1) {
         this.fa().b($$0.fa());
         this.fa().c($$0.fa());
         this.d($$0.eG());
         this.bS = $$0.bS;

         for (bvz $$2 : $$0.eD()) {
            this.a(new bvz($$2));
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
         if (this.y().O().c(djv.e) || $$0.Z_()) {
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
   protected void a(bvz $$0, @Nullable bwv $$1) {
      super.a($$0, $$1);
      this.f.b(new agm(this.ao(), $$0, true));
      if ($$0.a(bwb.y)) {
         this.cT = this.af;
         this.cS = this.dt();
      }

      aq.B.a(this, $$1);
   }

   @Override
   protected void a(bvz $$0, boolean $$1, @Nullable bwv $$2) {
      super.a($$0, $$1, $$2);
      this.f.b(new agm(this.ao(), $$0, false));
      aq.B.a(this, $$2);
   }

   @Override
   protected void c(Collection<bvz> $$0) {
      super.c($$0);

      for (bvz $$1 : $$0) {
         this.f.b(new aeo(this.ao(), $$1.c()));
         if ($$1.a(bwb.y)) {
            this.cS = null;
         }
      }

      aq.B.a(this, null);
   }

   @Override
   public void b(double $$0, double $$1, double $$2) {
      this.f.a(new byj(new ffs($$0, $$1, $$2), ffs.c, 0.0F, 0.0F), byk.a(byk.l, byk.k));
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.f.a(new byj(new ffs($$0, $$1, $$2), ffs.c, 0.0F, 0.0F), byk.j);
   }

   @Override
   public boolean a(aru $$0, double $$1, double $$2, double $$3, Set<byk> $$4, float $$5, float $$6, boolean $$7) {
      if (this.fR()) {
         this.a(true, true);
      }

      if ($$7) {
         this.d(this);
      }

      boolean $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$8) {
         this.r($$4.contains(byk.d) ? this.cA() + $$5 : $$5);
      }

      return $$8;
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      super.d($$0, $$1, $$2);
      this.f.l();
   }

   @Override
   public void b(bwv $$0) {
      this.y().m().a(this, new aca($$0, 4));
   }

   @Override
   public void c(bwv $$0) {
      this.y().m().a(this, new aca($$0, 5));
   }

   @Override
   public void x() {
      if (this.f != null) {
         this.f.b(new adz(this.gk()));
         this.K();
      }
   }

   public aru y() {
      return (aru)this.dV();
   }

   public boolean a(djw $$0) {
      boolean $$1 = this.Z_();
      if (!this.h.a($$0)) {
         return false;
      } else {
         this.f.b(new adf(adf.e, (float)$$0.a()));
         if ($$0 == djw.d) {
            this.gy();
            this.bO();
            dgp.a(this);
         } else {
            this.d(this);
            if ($$1) {
               dgp.a(this.y(), this);
            }
         }

         this.x();
         this.fx();
         return true;
      }
   }

   @Override
   public boolean Z_() {
      return this.h.b() == djw.d;
   }

   @Override
   public boolean b() {
      return this.h.b() == djw.b;
   }

   public ej z() {
      return this.dp;
   }

   public ek A() {
      return new ek(this.z(), this.dt(), this.bT(), this.y(), this.G(), this.ai().getString(), this.m_(), this.g, this);
   }

   public void a(xc $$0) {
      this.b($$0, false);
   }

   public void b(xc $$0, boolean $$1) {
      if (this.x($$1)) {
         this.f.a(new agc($$0, $$1), wj.a(() -> {
            if (this.x(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               xc $$3 = xc.b($$2).a(o.o);
               return new agc(xc.a("multiplayer.message_not_delivered", $$3).a(o.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(xr $$0, boolean $$1, wy.a $$2) {
      if (this.gV()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String B() {
      return this.f.m() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(are $$0) {
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

   public are C() {
      int $$0 = this.ar().a(bK);
      bxn $$1 = bxn.d.apply(this.ar().a(bL));
      return new are(this.cW, this.cV, this.cL, this.cN, $$0, $$1, this.de, this.df, this.cM);
   }

   public boolean D() {
      return this.cN;
   }

   public crw E() {
      return this.cL;
   }

   private boolean x(boolean $$0) {
      return this.cL == crw.c ? $$0 : true;
   }

   private boolean gV() {
      return this.cL == crw.a;
   }

   public int F() {
      return this.cV;
   }

   public void a(akh $$0) {
      this.f.b(new aeu($$0.a(), $$0.d().map(akh.a::a)));
   }

   @Override
   public int G() {
      return this.g.c(this.gi());
   }

   public void H() {
      this.cO = ag.c();
   }

   public awx I() {
      return this.cA;
   }

   public aww J() {
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

   public bwv L() {
      return (bwv)(this.cP == null ? this : this.cP);
   }

   @Override
   public void d(@Nullable bwv $$0) {
      bwv $$1 = this.L();
      this.cP = (bwv)($$0 == null ? this : $$0);
      if ($$1 != this.cP) {
         if (this.cP.dV() instanceof aru $$2) {
            this.a($$2, this.cP.dA(), this.cP.dC(), this.cP.dG(), Set.of(), this.dL(), this.dN(), false);
         }

         if ($$0 != null) {
            this.y().m().a(this);
         }

         this.f.b(new afb(this.cP));
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
   public void e(bwv $$0) {
      if (this.h.b() == djw.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long N() {
      return this.cO;
   }

   @Nullable
   public xc O() {
      return null;
   }

   public int P() {
      return 0;
   }

   @Override
   public void a(bus $$0) {
      super.a($$0);
      this.gE();
   }

   public boolean Q() {
      return this.cQ;
   }

   public void R() {
      this.cQ = false;
   }

   public als S() {
      return this.cz;
   }

   @Nullable
   public arv.a T() {
      return this.dc;
   }

   public void b(arv $$0) {
      this.a($$0.dc, false);
   }

   public void a(@Nullable arv.a $$0, boolean $$1) {
      if ($$1 && $$0 != null && !$$0.a(this.dc)) {
         this.a(cw);
      }

      this.dc = $$0;
   }

   public jz U() {
      return this.da;
   }

   public void a(jz $$0) {
      this.da = $$0;
   }

   public ard V() {
      return this.db;
   }

   public void a(ard $$0) {
      this.db = $$0;
   }

   @Override
   public void a(awq $$0, aws $$1, float $$2, float $$3) {
      this.f.b(new afz(mh.b.e($$0), $$1, this.dA(), this.dC(), this.dG(), $$2, $$3, this.ae.g()));
   }

   @Override
   public coe a(daa $$0, boolean $$1, boolean $$2) {
      coe $$3 = super.a($$0, $$1, $$2);
      if ($$2) {
         daa $$4 = $$3 != null ? $$3.f() : daa.k;
         if (!$$4.f()) {
            this.a(axb.f.b($$4.h()), $$0.M());
            this.a(axb.F);
         }
      }

      return $$3;
   }

   public atd W() {
      return this.dd;
   }

   public void a(aru $$0) {
      this.a((djz)$$0);
      this.h.a($$0);
   }

   @Nullable
   private static djw a(@Nullable ua $$0, String $$1) {
      return $$0 != null ? $$0.<djw>a($$1, djw.g).orElse(null) : null;
   }

   private djw b(@Nullable djw $$0) {
      djw $$1 = this.g.bd();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.g.u();
      }
   }

   @Override
   public void e(@Nullable ua $$0) {
      this.h.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void p(ua $$0) {
      $$0.a("playerGameType", djw.g, this.h.b());
      djw $$1 = this.h.c();
      $$0.b("previousPlayerGameType", djw.g, $$1);
   }

   @Override
   public boolean X() {
      return this.de;
   }

   public boolean c(arv $$0) {
      return $$0 == this ? false : this.de || $$0.de;
   }

   @Override
   public boolean c(aru $$0, iw $$1) {
      return super.c($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(daa $$0) {
      aq.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cry $$1 = this.gj();
      daa $$2 = $$1.a($$0);
      this.bR.b($$1, $$1.f()).ifPresent($$1x -> this.bR.a($$1x, $$1.g()));
      return this.a($$2, false, true) != null;
   }

   @Override
   public void b(daa $$0) {
      if (!this.gj().g($$0)) {
         this.a($$0, false);
      }
   }

   public boolean Y() {
      return this.df;
   }

   @Override
   public Optional<cre> Z() {
      return Optional.of(this.dh);
   }

   public void b(boolean $$0) {
      this.dg = $$0;
   }

   @Override
   public void a(coe $$0) {
      super.a($$0);
      bwv $$1 = $$0.q();
      if ($$1 != null) {
         aq.S.a(this, $$0.f(), $$1);
      }
   }

   public void a(xt $$0) {
      this.do = $$0;
   }

   @Nullable
   public xt aa() {
      return this.do != null && this.do.b() ? null : this.do;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cl = (float)(azq.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dL());
      this.f.b(new adh(this));
   }

   @Override
   public boolean a(bwv $$0, boolean $$1) {
      if (super.a($$0, $$1)) {
         $$0.j(this);
         this.f.a(new byj(this.dt(), ffs.c, 0.0F, 0.0F), byk.k);
         if ($$0 instanceof bxw $$2) {
            this.g.ag().a($$2, this.f);
         }

         this.f.b(new afp($$0));
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void ab() {
      bwv $$0 = this.dk();
      super.ab();
      if ($$0 instanceof bxw $$1) {
         for (bvz $$2 : $$1.eD()) {
            this.f.b(new aeo($$0.ao(), $$2.c()));
         }
      }

      if ($$0 != null) {
         this.f.b(new afp($$0));
      }
   }

   public ago b(aru $$0) {
      return new ago($$0.ai(), $$0.aj(), dle.a($$0.E()), this.h.b(), this.h.c(), $$0.ak(), $$0.D(), this.gI(), this.az(), $$0.P());
   }

   @Override
   public void c(iw $$0) {
      this.di = $$0;
   }

   public void ac() {
      this.di = null;
   }

   @Nullable
   public iw ad() {
      return this.di;
   }

   @Override
   public ffs ae() {
      bwv $$0 = this.dk();
      return $$0 != null && $$0.cW() != this ? $$0.ae() : this.dj;
   }

   public void a(ffs $$0) {
      this.dj = $$0;
   }

   @Override
   protected float a(bwv $$0, float $$1, bvk $$2) {
      return dgp.a(this.y(), this.dZ(), $$0, $$2, $$1);
   }

   @Override
   public void a(czw $$0, bxf $$1) {
      super.a($$0, $$1);
      this.b(axb.d.b($$0));
   }

   public crx af() {
      return this.dk;
   }

   public void a(crx $$0) {
      this.dk = $$0;
   }

   public ffs ag() {
      float $$0 = this.dk.c() == this.dk.d() ? 0.0F : (this.dk.c() ? 1.0F : -1.0F);
      float $$1 = this.dk.a() == this.dk.b() ? 0.0F : (this.dk.a() ? 1.0F : -1.0F);
      return a(new ffs((double)$$0, 0.0, (double)$$1), 1.0F, this.dL());
   }

   public void a(cte $$0) {
      this.dl.add($$0);
   }

   public void b(cte $$0) {
      this.dl.remove($$0);
   }

   public Set<cte> ah() {
      return this.dl;
   }

   public long c(cte $$0) {
      if ($$0.dV() instanceof aru $$1) {
         dje $$2 = $$0.dx();
         this.a($$0);
         $$1.i();
         return a($$1, $$2) - 1L;
      } else {
         return 0L;
      }
   }

   public static long a(aru $$0, dje $$1) {
      $$0.m().a(asb.h, $$1, 2);
      return asb.h.d();
   }

   public static record a(alj<djz> b, iw c, float d, boolean e) {
      public static final Codec<arv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  djz.h.optionalFieldOf("dimension", djz.i).forGetter(arv.a::a),
                  iw.a.fieldOf("pos").forGetter(arv.a::b),
                  Codec.FLOAT.optionalFieldOf("angle", 0.0F).forGetter(arv.a::c),
                  Codec.BOOL.optionalFieldOf("forced", false).forGetter(arv.a::d)
               )
               .apply($$0, arv.a::new)
      );

      static alj<djz> b(@Nullable arv.a $$0) {
         return $$0 != null ? $$0.a() : djz.i;
      }

      public boolean a(@Nullable arv.a $$0) {
         return $$0 != null && this.b == $$0.b && this.c.equals($$0.c);
      }

      public alj<djz> a() {
         return this.b;
      }

      public iw b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }
   }

   static record b(ffs a, float b) {
      public static arv.b a(ffs $$0, iw $$1) {
         return new arv.b($$0, b($$0, $$1));
      }

      private static float b(ffs $$0, iw $$1) {
         ffs $$2 = ffs.c($$1).d($$0).d();
         return (float)azq.d(azq.d($$2.f, $$2.d) * 180.0F / (float)Math.PI - 90.0);
      }
   }
}
