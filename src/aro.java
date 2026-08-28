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

public class aro extends com {
   private static final Logger cA = LogUtils.getLogger();
   private static final int cB = 32;
   private static final int cC = 10;
   private static final int cD = 25;
   public static final double b = 1.0;
   public static final double c = 3.0;
   public static final int d = 2;
   public static final String e = "ender_pearls";
   public static final String f = "ender_pearl_dimension";
   private static final bwg cE = new bwg(ali.b("creative_mode_block_range"), 0.5, bwg.a.a);
   private static final bwg cF = new bwg(ali.b("creative_mode_entity_range"), 2.0, bwg.a.a);
   public asq g;
   public final MinecraftServer h;
   public final arp i;
   private final alq cG;
   private final awr cH;
   private float cI = Float.MIN_VALUE;
   private int cJ = Integer.MIN_VALUE;
   private int cK = Integer.MIN_VALUE;
   private int cL = Integer.MIN_VALUE;
   private int cM = Integer.MIN_VALUE;
   private int cN = Integer.MIN_VALUE;
   private float cO = -1.0E8F;
   private int cP = -99999999;
   private boolean cQ = true;
   private int cR = -99999999;
   private int cS = 60;
   private coj cT = coj.a;
   private arg cU = arg.a;
   private boolean cV = true;
   private long cW = ae.c();
   @Nullable
   private bue cX;
   private boolean cY;
   public boolean j;
   private final awq cZ = new awq();
   @Nullable
   private ezn da;
   private int db;
   private boolean dc;
   private int dd = 2;
   private String de = "en_us";
   @Nullable
   private ezn df;
   @Nullable
   private ezn dg;
   @Nullable
   private ezn dh;
   private kj di = kj.a(0, 0, 0);
   private aqy dj = aqy.a;
   private alh<dfb> dk = dfb.i;
   @Nullable
   private jh dl;
   private boolean dm;
   private float dn;
   private final asw do;
   private boolean dp;
   private boolean dq;
   private boolean dr;
   private cnr ds = new cnr(0, 0, 0);
   @Nullable
   private jh dt;
   private ezn du = ezn.c;
   private cok dv = cok.b;
   private final Set<cpq> dw = new HashSet<>();
   private final csd dx = new csd() {
      @Override
      public void a(cro $$0, jz<cwb> $$1, cwb $$2, int[] $$3) {
         aro.this.g.b(new acz($$0.l, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cro $$0, int $$1, cwb $$2) {
         aro.this.g.b(new adb($$0.l, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cro $$0, cwb $$1) {
         aro.this.g.b(new afh($$1.v()));
      }

      @Override
      public void a(cro $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cro $$0, int $$1, int $$2) {
         aro.this.g.b(new ada($$0.l, $$1, $$2));
      }
   };
   private final csc dy = new csc() {
      @Override
      public void a(cro $$0, int $$1, cwb $$2) {
         ctl $$3 = $$0.b($$1);
         if (!($$3 instanceof cth)) {
            if ($$3.c == aro.this.gk()) {
               ao.f.a(aro.this, aro.this.gk(), $$2);
            }
         }
      }

      @Override
      public void a(cro $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private xz dz;
   @Nullable
   public final Object k;
   private int dA;
   public boolean l;

   public aro(MinecraftServer $$0, arn $$1, GameProfile $$2, aqz $$3) {
      super($$1, $$1.W(), $$1.X(), $$2);
      this.do = $$0.a(this);
      this.i = $$0.b(this);
      this.h = $$0;
      this.cH = $$0.ag().a((com)this);
      this.cG = $$0.ag().g(this);
      this.b(this.a($$1, $$1.W()).c(), 0.0F, 0.0F);
      this.a($$3);
      this.k = null;
   }

   @Override
   public jh a(arn $$0, jh $$1) {
      ezi $$2 = this.a(bvm.a).a(ezn.c);
      jh $$3 = $$1;
      if ($$0.D_().g() && $$0.o().aZ().k() != dey.c) {
         int $$4 = Math.max(0, this.h.a($$0));
         int $$5 = azk.a($$0.C_().b((double)$$1.u(), (double)$$1.w()));
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

      while (!this.a($$0, $$2.c($$3.c())) && $$3.v() < $$0.al()) {
         $$3 = $$3.d();
      }

      while (this.a($$0, $$2.c($$3.e().c())) && $$3.v() > $$0.I_() + 1) {
         $$3 = $$3.e();
      }

      return $$3;
   }

   private boolean a(arn $$0, ezi $$1) {
      return $$0.a(this, $$1, true);
   }

   private int t(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         cnr.a.parse(new Dynamic(uy.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(cA::error).ifPresent($$0x -> this.ds = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         uk $$1 = $$0.p("enteredNetherPosition");
         this.dg = new ezn($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.j = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cZ.a($$0.p("recipeBook"), this.h.aI());
      }

      if (this.fT()) {
         this.fU();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.dl = new jh($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.dm = $$0.q("SpawnForced");
         this.dn = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.dk = dfb.h.parse(uy.a, $$0.c("SpawnDimension")).resultOrPartial(cA::error).orElse(dfb.i);
         }
      }

      this.dr = $$0.q("spawn_extra_particles_on_fall");
      vh $$2 = $$0.c("raid_omen_position");
      if ($$2 != null) {
         jh.a.parse(uy.a, $$2).resultOrPartial(cA::error).ifPresent($$0x -> this.dt = $$0x);
      }
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      cnr.a.encodeStart(uy.a, this.ds).resultOrPartial(cA::error).ifPresent($$1x -> $$0.a("warden_spawn_tracker", $$1x));
      this.m($$0);
      $$0.a("seenCredits", this.j);
      if (this.dg != null) {
         uk $$1 = new uk();
         $$1.a("x", this.dg.d);
         $$1.a("y", this.dg.e);
         $$1.a("z", this.dg.f);
         $$0.a("enteredNetherPosition", $$1);
      }

      this.k($$0);
      $$0.a("recipeBook", this.cZ.b());
      $$0.a("Dimension", this.dX().ag().a().toString());
      if (this.dl != null) {
         $$0.a("SpawnX", this.dl.u());
         $$0.a("SpawnY", this.dl.v());
         $$0.a("SpawnZ", this.dl.w());
         $$0.a("SpawnForced", this.dm);
         $$0.a("SpawnAngle", this.dn);
         ali.a.encodeStart(uy.a, this.dk.a()).resultOrPartial(cA::error).ifPresent($$1x -> $$0.a("SpawnDimension", $$1x));
      }

      $$0.a("spawn_extra_particles_on_fall", this.dr);
      if (this.dt != null) {
         jh.a.encodeStart(uy.a, this.dt).resultOrPartial(cA::error).ifPresent($$1x -> $$0.a("raid_omen_position", $$1x));
      }

      this.l($$0);
   }

   private void k(uk $$0) {
      bue $$1 = this.dh();
      bue $$2 = this.dl();
      if ($$2 != null && $$1 != this && $$1.dg()) {
         uk $$3 = new uk();
         uk $$4 = new uk();
         $$1.e($$4);
         $$3.a("Attach", $$2.cH());
         $$3.a("Entity", $$4);
         $$0.a("RootVehicle", $$3);
      }
   }

   public void a(Optional<uk> $$0) {
      if ($$0.isPresent() && $$0.get().b("RootVehicle", 10) && this.dX() instanceof arn $$1) {
         uk $$2 = $$0.get().p("RootVehicle");
         bue $$3 = bul.a($$2.p("Entity"), $$1, buk.r, $$1x -> !$$1.c($$1x) ? null : $$1x);
         if ($$3 != null) {
            UUID $$4;
            if ($$2.b("Attach")) {
               $$4 = $$2.a("Attach");
            } else {
               $$4 = null;
            }

            if ($$3.cH().equals($$4)) {
               this.a($$3, true);
            } else {
               for (bue $$6 : $$3.de()) {
                  if ($$6.cH().equals($$4)) {
                     this.a($$6, true);
                     break;
                  }
               }
            }

            if (!this.ca()) {
               cA.warn("Couldn't reattach entity to player");
               $$3.av();

               for (bue $$7 : $$3.de()) {
                  $$7.av();
               }
            }
         }
      }
   }

   private void l(uk $$0) {
      if (!this.dw.isEmpty()) {
         uq $$1 = new uq();

         for (cpq $$2 : this.dw) {
            if ($$2.dS()) {
               cA.warn("Trying to save removed ender pearl, skipping");
            } else {
               uk $$3 = new uk();
               $$2.e($$3);
               ali.a.encodeStart(uy.a, $$2.dX().ag().a()).resultOrPartial(cA::error).ifPresent($$1x -> $$3.a("ender_pearl_dimension", $$1x));
               $$1.add($$3);
            }
         }

         $$0.a("ender_pearls", $$1);
      }
   }

   public void b(Optional<uk> $$0) {
      if ($$0.isPresent() && $$0.get().b("ender_pearls", 9) && $$0.get().c("ender_pearls") instanceof uq $$2) {
         $$2.forEach($$0x -> {
            if ($$0x instanceof uk $$1 && $$1.e("ender_pearl_dimension")) {
               Optional<alh<dfb>> $$2x = dfb.h.parse(uy.a, $$1.c("ender_pearl_dimension")).resultOrPartial(cA::error);
               if ($$2x.isEmpty()) {
                  cA.warn("No dimension defined for ender pearl, skipping");
                  return;
               }

               arn $$3 = this.dX().o().a($$2x.get());
               if ($$3 != null) {
                  bue $$4 = bul.a($$1, $$3, buk.r, $$1x -> !$$3.c($$1x) ? null : $$1x);
                  if ($$4 != null) {
                     a($$3, $$4.dz());
                  } else {
                     cA.warn("Failed to spawn player ender pearl in level ({}), skipping", $$2x.get());
                  }
               } else {
                  cA.warn("Trying to load ender pearl without level ({}) being loaded, skipping", $$2x.get());
               }
            }
         });
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gt();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.cs = azk.a((float)$$0 / $$1, 0.0F, $$2);
      this.cR = -1;
   }

   public void b(int $$0) {
      this.cq = $$0;
      this.cR = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cR = -1;
   }

   @Override
   public void a(cwb $$0, int $$1) {
      super.a($$0, $$1);
      this.cR = -1;
   }

   private void a(cro $$0) {
      $$0.a(this.dy);
      $$0.a(this.dx);
   }

   public void h() {
      this.a(this.cc);
   }

   @Override
   public void g_() {
      super.g_();
      this.g.b(aei.a);
   }

   @Override
   public void h_() {
      super.h_();
      this.g.b(new aeh(this.eT()));
   }

   @Override
   public void a(dvj $$0) {
      ao.e.a(this, $$0);
   }

   @Override
   protected cvy k() {
      return new cxb(this);
   }

   @Override
   public void l() {
      this.i.a();
      this.ds.a();
      this.cS--;
      if (this.ak > 0) {
         this.ak--;
      }

      this.cd.d();
      if (!this.dX().C && !this.cd.b(this)) {
         this.s();
         this.cd = this.cc;
      }

      bue $$0 = this.M();
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

      ao.x.a(this);
      if (this.da != null) {
         ao.v.a(this, this.da, this.ag - this.db);
      }

      this.o();
      this.p();
      this.gQ();
      this.cG.b(this);
   }

   private void gQ() {
      bwe $$0 = this.g(bwi.g);
      if ($$0 != null) {
         if (this.f()) {
            $$0.a(cE);
         } else {
            $$0.e(cE);
         }
      }

      bwe $$1 = this.g(bwi.j);
      if ($$1 != null) {
         if (this.f()) {
            $$1.a(cF);
         } else {
            $$1.e(cF);
         }
      }
   }

   public void m() {
      try {
         if (!this.R_() || !this.dq()) {
            super.l();
         }

         for (int $$0 = 0; $$0 < this.gk().b(); $$0++) {
            cwb $$1 = this.gk().a($$0);
            if (!$$1.f()) {
               this.j($$1);
            }
         }

         if (this.eG() != this.cO || this.cP != this.ce.a() || this.ce.e() == 0.0F != this.cQ) {
            this.g.b(new afp(this.eG(), this.ce.a(), this.ce.e()));
            this.cO = this.eG();
            this.cP = this.ce.a();
            this.cQ = this.ce.e() == 0.0F;
         }

         if (this.eG() + this.fy() != this.cI) {
            this.cI = this.eG() + this.fy();
            this.a(fav.g, azk.f(this.cI));
         }

         if (this.ce.a() != this.cJ) {
            this.cJ = this.ce.a();
            this.a(fav.h, azk.f((float)this.cJ));
         }

         if (this.cu() != this.cK) {
            this.cK = this.cu();
            this.a(fav.i, azk.f((float)this.cK));
         }

         if (this.eS() != this.cL) {
            this.cL = this.eS();
            this.a(fav.j, azk.f((float)this.cL));
         }

         if (this.cr != this.cN) {
            this.cN = this.cr;
            this.a(fav.k, azk.f((float)this.cN));
         }

         if (this.cq != this.cM) {
            this.cM = this.cq;
            this.a(fav.l, azk.f((float)this.cM));
         }

         if (this.cr != this.cR) {
            this.cR = this.cr;
            this.g.b(new afo(this.cs, this.cr, this.cq));
         }

         if (this.ag % 20 == 0) {
            ao.q.a(this);
         }
      } catch (Throwable var4) {
         o $$3 = o.a(var4, "Ticking player");
         p $$4 = $$3.a("Player being ticked");
         this.a($$4);
         throw new z($$3);
      }
   }

   private void j(cwb $$0) {
      etc $$1 = $$0.a(ku.L);
      ete $$2 = cwo.a($$1, this.dX());
      if ($$2 != null) {
         zp<?> $$3 = $$2.a($$1, this);
         if ($$3 != null) {
            this.g.b($$3);
         }
      }
   }

   @Override
   public void n() {
      if (this.eG() > 0.0F && this.df != null) {
         ao.X.a(this, this.df);
      }

      this.df = null;
      super.n();
   }

   @Override
   public void o() {
      if (this.aa > 0.0F && this.df == null) {
         this.df = this.dv();
         if (this.cx != null && this.cx.e <= this.df.e) {
            ao.ae.a(this, this.cx, this.cy);
         }
      }
   }

   public void p() {
      if (this.dl() != null && this.dl().by()) {
         if (this.dh == null) {
            this.dh = this.dv();
         } else {
            ao.Y.a(this, this.dh);
         }
      }

      if (this.dh != null && (this.dl() == null || !this.dl().by())) {
         this.dh = null;
      }
   }

   private void a(fav $$0, int $$1) {
      this.gz().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(bsu $$0) {
      this.a(eag.p);
      boolean $$1 = this.dX().ac().b(dex.n);
      if ($$1) {
         xi $$2 = this.eT().a();
         this.g.a(new aej(this.as(), $$2), wp.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            xi $$3x = xi.a("death.attack.message_too_long", xi.b($$2x).a(n.o));
            xi $$4x = xi.a("death.attack.even_more_magic", this.S_()).a($$1xx -> $$1xx.a(new xo(xo.a.a, $$3x)));
            return new aej(this.as(), $$4x);
         }));
         fau $$3 = this.cs();
         if ($$3 == null || $$3.k() == fau.b.a) {
            this.h.ag().a($$2, false);
         } else if ($$3.k() == fau.b.c) {
            this.h.ag().a(this, $$2);
         } else if ($$3.k() == fau.b.d) {
            this.h.ag().b(this, $$2);
         }
      } else {
         this.g.b(new aej(this.as(), xh.a));
      }

      this.gy();
      if (this.dX().ac().b(dex.N)) {
         this.gR();
      }

      if (!this.R_()) {
         this.a(this.B(), $$0);
      }

      this.gz().a(fav.d, this, faq::b);
      bva $$4 = this.eU();
      if ($$4 != null) {
         this.b(awv.h.b($$4.ar()));
         $$4.a(this, this.bl, $$0);
         this.f($$4);
      }

      this.dX().a(this, (byte)3);
      this.a(awv.N);
      this.a(awv.i.b(awv.m));
      this.a(awv.i.b(awv.n));
      this.aI();
      this.k(0);
      this.c(false);
      this.eT().c();
      this.c(Optional.of(jp.a(this.dX().ag(), this.dx())));
   }

   private void gR() {
      ezi $$0 = new ezi(this.dx()).c(32.0, 10.0, 32.0);
      this.dX().a(bvc.class, $$0, buj.f).stream().filter($$0x -> $$0x instanceof bvf).forEach($$0x -> ((bvf)$$0x).a_((com)this));
   }

   @Override
   public void a(bue $$0, int $$1, bsu $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.s($$1);
         this.gz().a(fav.f, this, faq::b);
         if ($$0 instanceof com) {
            this.a(awv.Q);
            this.gz().a(fav.e, this, faq::b);
         } else {
            this.a(awv.O);
         }

         this.a(this, $$0, fav.m);
         this.a($$0, this, fav.n);
         ao.c.a(this, $$0, $$2);
      }
   }

   private void a(far $$0, far $$1, fav[] $$2) {
      fan $$3 = this.gz().e($$1.cJ());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gz().a($$2[$$4], $$0, faq::b);
         }
      }
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.h.n() && this.gS() && $$0.a(axc.m);
         if (!$$2 && this.cS > 0 && !$$0.a(axc.d)) {
            return false;
         } else {
            bue $$3 = $$0.d();
            if ($$3 instanceof com $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof cou $$5 && $$5.s() instanceof com $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(com $$0) {
      return !this.gS() ? false : super.a($$0);
   }

   private boolean gS() {
      return this.h.ac();
   }

   public esi a(boolean $$0, esi.a $$1) {
      jh $$2 = this.U();
      float $$3 = this.V();
      boolean $$4 = this.X();
      arn $$5 = this.h.a(this.W());
      if ($$5 != null && $$2 != null) {
         Optional<aro.a> $$6 = a($$5, $$2, $$3, $$4, $$0);
         if ($$6.isPresent()) {
            aro.a $$7 = $$6.get();
            return new esi($$5, $$7.a(), ezn.c, $$7.b(), 0.0F, $$1);
         } else {
            return esi.a(this.h.J(), this, $$1);
         }
      } else {
         return new esi(this.h.J(), this, $$1);
      }
   }

   private static Optional<aro.a> a(arn $$0, jh $$1, float $$2, boolean $$3, boolean $$4) {
      dvj $$5 = $$0.a_($$1);
      die $$6 = $$5.b();
      if ($$6 instanceof dom && ($$3 || $$5.c(dom.d) > 0) && dom.a($$0)) {
         Optional<ezn> $$7 = dom.a(bul.by, $$0, $$1);
         if (!$$3 && $$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.b(dom.d, Integer.valueOf($$5.c(dom.d) - 1)), 3);
         }

         return $$7.map($$1x -> aro.a.a($$1x, $$1));
      } else if ($$6 instanceof dhx && dhx.a($$0)) {
         return dhx.a(bul.by, $$0, $$1, $$5.c(dhx.aF), $$2).map($$1x -> aro.a.a($$1x, $$1));
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dvj $$9 = $$0.a_($$1.d());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new aro.a(new ezn((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5), $$2)) : Optional.empty();
      }
   }

   @Override
   public void q() {
      this.ap();
      this.B().a(this, bue.c.e);
      if (!this.l) {
         this.l = true;
         this.g.b(new adl(adl.f, 0.0F));
         this.j = true;
      }
   }

   @Nullable
   public com a(esi $$0) {
      if (this.dS()) {
         return null;
      } else {
         if ($$0.f()) {
            this.g.b(new adl(adl.b, 0.0F));
         }

         arn $$1 = $$0.a();
         arn $$2 = this.B();
         alh<dfb> $$3 = $$2.ag();
         this.af();
         if ($$1.ag() == $$3) {
            this.c($$0);
            this.g.a(bvn.a($$0), $$0.g());
            this.g.l();
            $$0.h().onTransition(this);
            return this;
         } else {
            this.cY = true;
            etm $$4 = $$1.A_();
            this.g.b(new aet(this.b($$1), (byte)3));
            this.g.b(new acr($$4.q(), $$4.r()));
            avo $$5 = this.h.ag();
            $$5.e(this);
            $$2.a(this, bue.c.e);
            this.dU();
            bon $$6 = bom.a();
            $$6.a("moving");
            if ($$3 == dfb.i && $$1.ag() == dfb.j) {
               this.dg = this.dv();
            }

            this.c($$0);
            $$6.c();
            $$6.a("placing");
            this.a($$1);
            this.g.a(bvn.a($$0), $$0.g());
            this.g.l();
            $$1.d(this);
            $$6.c();
            this.c($$2);
            this.fH();
            this.g.b(new aef(this.gl()));
            $$5.a(this, $$1);
            $$5.f(this);
            $$5.d(this);
            $$0.h().onTransition(this);
            this.cR = -1;
            this.cO = -1.0F;
            this.cP = -1;
            return this;
         }
      }
   }

   private void c(arn $$0) {
      alh<dfb> $$1 = $$0.ag();
      alh<dfb> $$2 = this.dX().ag();
      ao.w.a(this, $$1, $$2);
      if ($$1 == dfb.j && $$2 == dfb.i && this.dg != null) {
         ao.D.a(this, this.dg);
      }

      if ($$2 != dfb.j) {
         this.dg = null;
      }
   }

   @Override
   public boolean a(aro $$0) {
      if ($$0.R_()) {
         return this.M() == this;
      } else {
         return this.R_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bue $$0, int $$1) {
      super.a($$0, $$1);
      this.cd.d();
   }

   @Override
   public Either<com.a, bap> a(jh $$0) {
      jm $$1 = this.dX().a_($$0).c(dlz.aF);
      if (this.fT() || !this.bM()) {
         return Either.left(com.a.e);
      } else if (!this.dX().D_().j()) {
         return Either.left(com.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(com.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(com.a.d);
      } else {
         this.a(this.dX().ag(), $$0, this.dN(), false, true);
         if (this.dX().S()) {
            return Either.left(com.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               ezn $$4 = ezn.c($$0);
               List<clr> $$5 = this.dX()
                  .a(clr.class, new ezi($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.a(this));
               if (!$$5.isEmpty()) {
                  return Either.left(com.a.f);
               }
            }

            Either<com.a, bap> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(awv.ap);
               ao.r.a(this);
            });
            if (!this.B().d()) {
               this.a(xi.c("sleep.not_possible"), true);
            }

            ((arn)this.dX()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(jh $$0) {
      this.a(awv.i.b(awv.n));
      super.b($$0);
   }

   private boolean a(jh $$0, jm $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(jh $$0) {
      ezn $$1 = ezn.c($$0);
      return Math.abs(this.dC() - $$1.a()) <= 3.0 && Math.abs(this.dE() - $$1.b()) <= 2.0 && Math.abs(this.dI() - $$1.c()) <= 3.0;
   }

   private boolean b(jh $$0, jm $$1) {
      jh $$2 = $$0.d();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fT()) {
         this.B().l().a(this, new ach(this, 2));
      }

      super.a($$0, $$1);
      if (this.g != null) {
         this.g.a(this.dC(), this.dE(), this.dI(), this.dN(), this.dP());
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.bR();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public boolean b(bsu $$0) {
      return super.b($$0) || this.R() && !$$0.a(bsx.m);
   }

   @Override
   protected void a(double $$0, boolean $$1, dvj $$2, jh $$3) {
   }

   @Override
   protected void b(arn $$0, jh $$1) {
      if (!this.R_()) {
         super.b($$0, $$1);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.dq()) {
         this.a($$3, new ezn($$0, $$1, $$2));
         jh $$4 = this.aQ();
         dvj $$5 = this.dX().a_($$4);
         if (this.dr && $$3 && this.aa > 0.0F) {
            ezn $$6 = $$4.b().b(0.0, 0.5, 0.0);
            int $$7 = (int)azk.a(50.0F * this.aa, 0.0F, 200.0F);
            this.B().a(new lj(lr.b, $$5), $$6.d, $$6.e, $$6.f, $$7, 0.3F, 0.3F, 0.3F, 0.15F);
            this.dr = false;
         }

         super.a($$1, $$3, $$5, $$4);
      }
   }

   @Override
   public void a(@Nullable bue $$0) {
      super.a($$0);
      this.cx = this.dv();
      this.cy = $$0;
      this.w($$0 != null && $$0.ar() == bul.bn);
   }

   @Override
   protected void r() {
      if (this.dX().s().i()) {
         super.r();
      }
   }

   @Override
   public void a(dty $$0, boolean $$1) {
      this.g.b(new acn(this.dX(), $$0.aB_()));
      this.g.b(new aed($$0.aB_(), $$1));
   }

   private void gT() {
      this.dA = this.dA % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bsf $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.cd != this.cc) {
            this.s();
         }

         this.gT();
         cro $$1 = $$0.createMenu(this.dA, this.gk(), this);
         if ($$1 == null) {
            if (this.R_()) {
               this.a(xi.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.g.b(new aec($$1.l, $$1.a(), $$0.S_()));
            this.a($$1);
            this.cd = $$1;
            return OptionalInt.of(this.dA);
         }
      }
   }

   @Override
   public void a(int $$0, ddz $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.g.b(new adx($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(civ $$0, brw $$1) {
      if (this.cd != this.cc) {
         this.s();
      }

      this.gT();
      int $$2 = $$0.ag_();
      this.g.b(new adm(this.dA, $$2, $$0.as()));
      this.cd = new csq(this.dA, this.gk(), $$1, $$0, $$2);
      this.a(this.cd);
   }

   @Override
   public void a(cwb $$0, bsc $$1) {
      if ($$0.b(ku.T)) {
         if (cxx.a($$0, this.dp(), this)) {
            this.cd.d();
         }

         this.g.b(new aeb($$1));
      }
   }

   @Override
   public void a(dsw $$0) {
      this.g.b(acl.a($$0, dsm::e));
   }

   @Override
   public void s() {
      this.g.b(new acy(this.cd.l));
      this.t();
   }

   @Override
   public void t() {
      this.cd.a(this);
      this.cc.a(this.cd);
      this.cd = this.cc;
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
               this.a(awv.C, $$3);
               this.G(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(axg.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(awv.w, $$4);
               this.G(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.bk()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(awv.s, $$5);
               this.G(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.q_()) {
            if ($$1 > 0.0) {
               this.a(awv.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aK()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.ck()) {
                  this.a(awv.r, $$6);
                  this.G(0.1F * (float)$$6 * 0.01F);
               } else if (this.cj()) {
                  this.a(awv.q, $$6);
                  this.G(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(awv.p, $$6);
                  this.G(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fL()) {
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
      if (this.ca() && !r($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         bue $$4 = this.dl();
         if ($$4 instanceof cqk) {
            this.a(awv.x, $$3);
         } else if ($$4 instanceof cqm) {
            this.a(awv.y, $$3);
         } else if ($$4 instanceof chi) {
            this.a(awv.z, $$3);
         } else if ($$4 instanceof civ) {
            this.a(awv.A, $$3);
         } else if ($$4 instanceof cme) {
            this.a(awv.D, $$3);
         }
      }
   }

   private static boolean r(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(aws<?> $$0, int $$1) {
      this.cH.b(this, $$0, $$1);
      this.gz().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(aws<?> $$0) {
      this.cH.a(this, $$0, 0);
      this.gz().a($$0, this, faq::c);
   }

   @Override
   public int a(Collection<dar<?>> $$0) {
      return this.cZ.a($$0, this);
   }

   @Override
   public void a(dar<?> $$0, List<cwb> $$1) {
      ao.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<ali> $$0) {
      List<dar<?>> $$1 = $$0.stream().flatMap($$0x -> this.h.aI().a($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<dar<?>> $$0) {
      return this.cZ.b($$0, this);
   }

   @Override
   public void v() {
      super.v();
      this.a(awv.E);
      if (this.ck()) {
         this.G(0.2F);
      } else {
         this.G(0.05F);
      }
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cR = -1;
   }

   @Override
   public void w() {
      this.dc = true;
      this.bQ();
      if (this.fT()) {
         this.a(true, false);
      }
   }

   public boolean x() {
      return this.dc;
   }

   public void y() {
      this.cO = -1.0E8F;
   }

   @Override
   public void a(xi $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void z() {
      if (!this.bz.f() && this.fB()) {
         this.g.b(new adi(this, (byte)9));
         super.z();
      }
   }

   @Override
   public void a(fi.a $$0, ezn $$1) {
      super.a($$0, $$1);
      this.g.b(new aem($$0, $$1.d, $$1.e, $$1.f));
   }

   public void a(fi.a $$0, bue $$1, fi.a $$2) {
      ezn $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.g.b(new aem($$0, $$1, $$2));
   }

   public void a(aro $$0, boolean $$1) {
      this.ds = $$0.ds;
      this.dz = $$0.dz;
      this.i.a($$0.i.b(), $$0.i.c());
      this.A();
      if ($$1) {
         this.fa().b($$0.fa());
         this.fa().c($$0.fa());
         this.x($$0.eG());
         this.ce = $$0.ce;

         for (btj $$2 : $$0.eD()) {
            this.a(new btj($$2));
         }

         this.gk().a($$0.gk());
         this.cq = $$0.cq;
         this.cr = $$0.cr;
         this.cs = $$0.cs;
         this.r($$0.gf());
         this.at = $$0.at;
      } else {
         this.fa().b($$0.fa());
         this.x(this.eV());
         if (this.dX().ac().b(dex.d) || $$0.R_()) {
            this.gk().a($$0.gk());
            this.cq = $$0.cq;
            this.cr = $$0.cr;
            this.cs = $$0.cs;
            this.r($$0.gf());
         }
      }

      this.ct = $$0.ct;
      this.cb = $$0.cb;
      this.aw().a(bX, $$0.aw().a(bX));
      this.cR = -1;
      this.cO = -1.0F;
      this.cP = -1;
      this.cZ.a($$0.cZ);
      this.j = $$0.j;
      this.dg = $$0.dg;
      this.dj = $$0.dj;
      this.i($$0.gB());
      this.j($$0.gC());
      this.c($$0.gJ());
   }

   @Override
   protected void a(btj $$0, @Nullable bue $$1) {
      super.a($$0, $$1);
      this.g.b(new ago(this.as(), $$0, true));
      if ($$0.a(btl.y)) {
         this.db = this.ag;
         this.da = this.dv();
      }

      ao.B.a(this, $$1);
   }

   @Override
   protected void a(btj $$0, boolean $$1, @Nullable bue $$2) {
      super.a($$0, $$1, $$2);
      this.g.b(new ago(this.as(), $$0, false));
      ao.B.a(this, $$2);
   }

   @Override
   protected void c(Collection<btj> $$0) {
      super.c($$0);

      for (btj $$1 : $$0) {
         this.g.b(new aer(this.as(), $$1.c()));
         if ($$1.a(btl.y)) {
            this.da = null;
         }
      }

      ao.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.g.a(new bvn(new ezn($$0, $$1, $$2), ezn.c, 0.0F, 0.0F), bvo.a(bvo.l, bvo.k));
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.g.a(new bvn(new ezn($$0, $$1, $$2), ezn.c, 0.0F, 0.0F), bvo.j);
   }

   @Override
   public boolean a(arn $$0, double $$1, double $$2, double $$3, Set<bvo> $$4, float $$5, float $$6, boolean $$7) {
      deh $$8 = new deh(jh.a($$1, $$2, $$3));
      $$0.l().a(art.g, $$8, 1, this.as());
      if (this.fT()) {
         this.a(true, true);
      }

      if ($$7) {
         this.d(this);
      }

      boolean $$9 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$9) {
         this.q($$4.contains(bvo.d) ? this.cB() + $$5 : $$5);
      }

      return $$9;
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      super.e($$0, $$1, $$2);
      this.g.l();
   }

   @Override
   public void b(bue $$0) {
      this.B().l().a(this, new ach($$0, 4));
   }

   @Override
   public void c(bue $$0) {
      this.B().l().a(this, new ach($$0, 5));
   }

   @Override
   public void A() {
      if (this.g != null) {
         this.g.b(new aef(this.gl()));
         this.L();
      }
   }

   public arn B() {
      return (arn)this.dX();
   }

   public boolean a(dey $$0) {
      boolean $$1 = this.R_();
      if (!this.i.a($$0)) {
         return false;
      } else {
         this.g.b(new adl(adl.e, (float)$$0.a()));
         if ($$0 == dey.d) {
            this.gy();
            this.af();
            dbu.a(this);
         } else {
            this.d(this);
            if ($$1) {
               dbu.a(this.B(), this);
            }
         }

         this.A();
         this.fz();
         return true;
      }
   }

   @Override
   public boolean R_() {
      return this.i.b() == dey.d;
   }

   @Override
   public boolean f() {
      return this.i.b() == dey.b;
   }

   @Override
   public void a(xi $$0) {
      this.b($$0, false);
   }

   public void b(xi $$0, boolean $$1) {
      if (this.x($$1)) {
         this.g.a(new agf($$0, $$1), wp.a(() -> {
            if (this.x(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               xi $$3 = xi.b($$2).a(n.o);
               return new agf(xi.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(xx $$0, boolean $$1, xe.a $$2) {
      if (this.gU()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String C() {
      return this.g.m() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(aqz $$0) {
      this.de = $$0.b();
      this.dd = $$0.c();
      this.cT = $$0.d();
      this.cV = $$0.e();
      this.dp = $$0.h();
      this.dq = $$0.i();
      this.cU = $$0.j();
      this.aw().a(bX, (byte)$$0.f());
      this.aw().a(bY, (byte)$$0.g().b());
   }

   public aqz D() {
      int $$0 = this.aw().a(bX);
      buu $$1 = buu.d.apply(this.aw().a(bY));
      return new aqz(this.de, this.dd, this.cT, this.cV, $$0, $$1, this.dp, this.dq, this.cU);
   }

   public boolean E() {
      return this.cV;
   }

   public coj F() {
      return this.cT;
   }

   private boolean x(boolean $$0) {
      return this.cT == coj.c ? $$0 : true;
   }

   private boolean gU() {
      return this.cT == coj.a;
   }

   public int G() {
      return this.dd;
   }

   public void a(akf $$0) {
      this.g.b(new aex($$0.a(), $$0.d().map(akf.a::a)));
   }

   @Override
   protected int H() {
      return this.h.c(this.gj());
   }

   @Override
   public void I() {
      this.cW = ae.c();
   }

   public awr J() {
      return this.cH;
   }

   public awq K() {
      return this.cZ;
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

   public bue M() {
      return (bue)(this.cX == null ? this : this.cX);
   }

   @Override
   public void d(@Nullable bue $$0) {
      bue $$1 = this.M();
      this.cX = (bue)($$0 == null ? this : $$0);
      if ($$1 != this.cX) {
         if (this.cX.dX() instanceof arn $$2) {
            this.a($$2, this.cX.dC(), this.cX.dE(), this.cX.dI(), Set.of(), this.dN(), this.dP(), false);
         }

         if ($$0 != null) {
            this.B().l().a(this);
         }

         this.g.b(new afe(this.cX));
         this.g.l();
      }
   }

   @Override
   protected void N() {
      if (!this.cY) {
         super.N();
      }
   }

   @Override
   public void e(bue $$0) {
      if (this.i.b() == dey.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long O() {
      return this.cW;
   }

   @Nullable
   public xi P() {
      return null;
   }

   public int Q() {
      return 0;
   }

   @Override
   public void a(bsc $$0) {
      super.a($$0);
      this.gE();
   }

   public boolean R() {
      return this.cY;
   }

   public void S() {
      this.cY = false;
   }

   public alq T() {
      return this.cG;
   }

   @Nullable
   public jh U() {
      return this.dl;
   }

   public float V() {
      return this.dn;
   }

   public alh<dfb> W() {
      return this.dk;
   }

   public boolean X() {
      return this.dm;
   }

   public void b(aro $$0) {
      this.a($$0.W(), $$0.U(), $$0.V(), $$0.X(), false);
   }

   public void a(alh<dfb> $$0, @Nullable jh $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.dl) && $$0.equals(this.dk);
         if ($$4 && !$$5) {
            this.a(xi.c("block.minecraft.set_spawn"));
         }

         this.dl = $$1;
         this.dk = $$0;
         this.dn = $$2;
         this.dm = $$3;
      } else {
         this.dl = null;
         this.dk = dfb.i;
         this.dn = 0.0F;
         this.dm = false;
      }
   }

   public kj Y() {
      return this.di;
   }

   public void a(kj $$0) {
      this.di = $$0;
   }

   public aqy Z() {
      return this.dj;
   }

   public void a(aqy $$0) {
      this.dj = $$0;
   }

   @Override
   public void a(awk $$0, awm $$1, float $$2, float $$3) {
      this.g.b(new agc(ly.b.e($$0), $$1, this.dC(), this.dE(), this.dI(), $$2, $$3, this.af.g()));
   }

   @Override
   public ckv a(cwb $$0, boolean $$1, boolean $$2) {
      ckv $$3 = this.b($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dX().b($$3);
         cwb $$4 = $$3.m();
         if ($$2) {
            if (!$$4.f()) {
               this.a(awv.f.b($$4.h()), $$0.L());
            }

            this.a(awv.F);
         }

         return $$3;
      }
   }

   @Nullable
   private ckv b(cwb $$0, boolean $$1, boolean $$2) {
      if ($$0.f()) {
         return null;
      } else {
         double $$3 = this.dG() - 0.3F;
         ckv $$4 = new ckv(this.dX(), this.dC(), $$3, this.dI(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.af.i() * 0.5F;
            float $$6 = this.af.i() * (float) (Math.PI * 2);
            $$4.n((double)(-azk.a($$6) * $$5), 0.2F, (double)(azk.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = azk.a(this.dP() * (float) (Math.PI / 180.0));
            float $$9 = azk.b(this.dP() * (float) (Math.PI / 180.0));
            float $$10 = azk.a(this.dN() * (float) (Math.PI / 180.0));
            float $$11 = azk.b(this.dN() * (float) (Math.PI / 180.0));
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

   public asw aa() {
      return this.do;
   }

   public void a(arn $$0) {
      this.a((dfb)$$0);
      this.i.a($$0);
   }

   @Nullable
   private static dey a(@Nullable uk $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? dey.a($$0.h($$1)) : null;
   }

   private dey b(@Nullable dey $$0) {
      dey $$1 = this.h.bd();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.h.u();
      }
   }

   @Override
   public void c(@Nullable uk $$0) {
      this.i.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void m(uk $$0) {
      $$0.a("playerGameType", this.i.b().a());
      dey $$1 = this.i.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean ab() {
      return this.dp;
   }

   public boolean c(aro $$0) {
      return $$0 == this ? false : this.dp || $$0.dp;
   }

   @Override
   public boolean a(dfb $$0, jh $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cwb $$0) {
      ao.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      col $$1 = this.gk();
      cwb $$2 = $$1.a($$0);
      this.cd.b($$1, $$1.j).ifPresent($$1x -> this.cd.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean ac() {
      return this.dq;
   }

   @Override
   public Optional<cnr> ad() {
      return Optional.of(this.ds);
   }

   public void b(boolean $$0) {
      this.dr = $$0;
   }

   @Override
   public void a(ckv $$0) {
      super.a($$0);
      bue $$1 = $$0.s();
      if ($$1 != null) {
         ao.S.a(this, $$0.m(), $$1);
      }
   }

   public void a(xz $$0) {
      this.dz = $$0;
   }

   @Nullable
   public xz ae() {
      return this.dz != null && this.dz.b() ? null : this.dz;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cw = (float)(azk.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dN());
      this.g.b(new adn(this));
   }

   @Override
   public boolean a(bue $$0, boolean $$1) {
      if (super.a($$0, $$1)) {
         $$0.j(this);
         this.g.a(new bvn(this.dv(), ezn.c, 0.0F, 0.0F), bvo.k);
         if ($$0 instanceof bva $$2) {
            this.h.ag().a($$2, this.g);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void af() {
      bue $$0 = this.dl();
      super.af();
      if ($$0 instanceof bva $$1) {
         for (btj $$2 : $$1.eD()) {
            this.g.b(new aer($$0.as(), $$2.c()));
         }
      }
   }

   public agq b(arn $$0) {
      return new agq($$0.af(), $$0.ag(), dge.a($$0.C()), this.i.b(), this.i.c(), $$0.ah(), $$0.B(), this.gJ(), this.aE(), $$0.N());
   }

   @Override
   public void c(jh $$0) {
      this.dt = $$0;
   }

   public void ag() {
      this.dt = null;
   }

   @Nullable
   public jh ah() {
      return this.dt;
   }

   @Override
   public ezn ai() {
      bue $$0 = this.dl();
      return $$0 != null && $$0.cY() != this ? $$0.ai() : this.du;
   }

   public void a(ezn $$0) {
      this.du = $$0;
   }

   @Override
   protected float a(bue $$0, float $$1, bsu $$2) {
      return dbu.a(this.B(), this.eb(), $$0, $$2, $$1);
   }

   @Override
   public void a(cvx $$0, bum $$1) {
      super.a($$0, $$1);
      this.b(awv.d.b($$0));
   }

   public cok aj() {
      return this.dv;
   }

   public void a(cok $$0) {
      this.dv = $$0;
   }

   public ezn ak() {
      float $$0 = this.dv.c() == this.dv.d() ? 0.0F : (this.dv.c() ? 1.0F : -1.0F);
      float $$1 = this.dv.a() == this.dv.b() ? 0.0F : (this.dv.a() ? 1.0F : -1.0F);
      return a(new ezn((double)$$0, 0.0, (double)$$1), 1.0F, this.dN());
   }

   public void a(cpq $$0) {
      this.dw.add($$0);
   }

   public void b(cpq $$0) {
      this.dw.remove($$0);
   }

   public Set<cpq> al() {
      return this.dw;
   }

   public long c(cpq $$0) {
      if ($$0.dX() instanceof arn $$1) {
         deh $$2 = $$0.dz();
         this.a($$0);
         $$1.h();
         return a($$1, $$2) - 1L;
      } else {
         return 0L;
      }
   }

   public static long a(arn $$0, deh $$1) {
      $$0.l().a(art.f, $$1, 2, $$1);
      return art.f.b();
   }

   static record a(ezn a, float b) {
      public static aro.a a(ezn $$0, jh $$1) {
         return new aro.a($$0, b($$0, $$1));
      }

      private static float b(ezn $$0, jh $$1) {
         ezn $$2 = ezn.c($$1).d($$0).d();
         return (float)azk.d(azk.d($$2.f, $$2.d) * 180.0F / (float)Math.PI - 90.0);
      }
   }
}
