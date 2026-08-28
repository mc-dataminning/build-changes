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

public class arr extends cor {
   private static final Logger cA = LogUtils.getLogger();
   private static final int cB = 32;
   private static final int cC = 10;
   private static final int cD = 25;
   public static final double b = 1.0;
   public static final double c = 3.0;
   public static final int d = 2;
   public static final String e = "ender_pearls";
   public static final String f = "ender_pearl_dimension";
   private static final bwk cE = new bwk(all.b("creative_mode_block_range"), 0.5, bwk.a.a);
   private static final bwk cF = new bwk(all.b("creative_mode_entity_range"), 2.0, bwk.a.a);
   public ast g;
   public final MinecraftServer h;
   public final ars i;
   private final alt cG;
   private final awu cH;
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
   private coo cT = coo.a;
   private arj cU = arj.a;
   private boolean cV = true;
   private long cW = ae.c();
   @Nullable
   private bui cX;
   private boolean cY;
   public boolean j;
   private final awt cZ = new awt();
   @Nullable
   private ezr da;
   private int db;
   private boolean dc;
   private int dd = 2;
   private String de = "en_us";
   @Nullable
   private ezr df;
   @Nullable
   private ezr dg;
   @Nullable
   private ezr dh;
   private kj di = kj.a(0, 0, 0);
   private arb dj = arb.a;
   private alk<dff> dk = dff.i;
   @Nullable
   private jh dl;
   private boolean dm;
   private float dn;
   private final asz do;
   private boolean dp;
   private boolean dq;
   private boolean dr;
   private cnv ds = new cnv(0, 0, 0);
   @Nullable
   private jh dt;
   private ezr du = ezr.c;
   private cop dv = cop.b;
   private final Set<cpu> dw = new HashSet<>();
   private final csh dx = new csh() {
      @Override
      public void a(crs $$0, jz<cwf> $$1, cwf $$2, int[] $$3) {
         arr.this.g.b(new adc($$0.l, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(crs $$0, int $$1, cwf $$2) {
         arr.this.g.b(new ade($$0.l, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(crs $$0, cwf $$1) {
         arr.this.g.b(new afk($$1.v()));
      }

      @Override
      public void a(crs $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(crs $$0, int $$1, int $$2) {
         arr.this.g.b(new add($$0.l, $$1, $$2));
      }
   };
   private final csg dy = new csg() {
      @Override
      public void a(crs $$0, int $$1, cwf $$2) {
         ctp $$3 = $$0.b($$1);
         if (!($$3 instanceof ctl)) {
            if ($$3.c == arr.this.gl()) {
               ao.f.a(arr.this, arr.this.gl(), $$2);
            }
         }
      }

      @Override
      public void a(crs $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private yc dz;
   @Nullable
   public final Object k;
   private int dA;
   public boolean l;

   public arr(MinecraftServer $$0, arq $$1, GameProfile $$2, arc $$3) {
      super($$1, $$1.W(), $$1.X(), $$2);
      this.do = $$0.a(this);
      this.i = $$0.b(this);
      this.h = $$0;
      this.cH = $$0.ag().a((cor)this);
      this.cG = $$0.ag().g(this);
      this.b(this.a($$1, $$1.W()).c(), 0.0F, 0.0F);
      this.a($$3);
      this.k = null;
   }

   @Override
   public jh a(arq $$0, jh $$1) {
      ezm $$2 = this.a(bvq.a).a(ezr.c);
      jh $$3 = $$1;
      if ($$0.D_().g() && $$0.o().aZ().k() != dfc.c) {
         int $$4 = Math.max(0, this.h.a($$0));
         int $$5 = azn.a($$0.C_().b((double)$$1.u(), (double)$$1.w()));
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
               $$3 = arl.a($$0, $$15, $$16);
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

   private boolean a(arq $$0, ezm $$1) {
      return $$0.a(this, $$1, true);
   }

   private int t(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         cnv.a.parse(new Dynamic(vb.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(cA::error).ifPresent($$0x -> this.ds = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         un $$1 = $$0.p("enteredNetherPosition");
         this.dg = new ezr($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.j = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cZ.a($$0.p("recipeBook"), this.h.aI());
      }

      if (this.fU()) {
         this.fV();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.dl = new jh($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.dm = $$0.q("SpawnForced");
         this.dn = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.dk = dff.h.parse(vb.a, $$0.c("SpawnDimension")).resultOrPartial(cA::error).orElse(dff.i);
         }
      }

      this.dr = $$0.q("spawn_extra_particles_on_fall");
      vk $$2 = $$0.c("raid_omen_position");
      if ($$2 != null) {
         jh.a.parse(vb.a, $$2).resultOrPartial(cA::error).ifPresent($$0x -> this.dt = $$0x);
      }
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      cnv.a.encodeStart(vb.a, this.ds).resultOrPartial(cA::error).ifPresent($$1x -> $$0.a("warden_spawn_tracker", $$1x));
      this.m($$0);
      $$0.a("seenCredits", this.j);
      if (this.dg != null) {
         un $$1 = new un();
         $$1.a("x", this.dg.d);
         $$1.a("y", this.dg.e);
         $$1.a("z", this.dg.f);
         $$0.a("enteredNetherPosition", $$1);
      }

      this.k($$0);
      $$0.a("recipeBook", this.cZ.b());
      $$0.a("Dimension", this.dY().ag().a().toString());
      if (this.dl != null) {
         $$0.a("SpawnX", this.dl.u());
         $$0.a("SpawnY", this.dl.v());
         $$0.a("SpawnZ", this.dl.w());
         $$0.a("SpawnForced", this.dm);
         $$0.a("SpawnAngle", this.dn);
         all.a.encodeStart(vb.a, this.dk.a()).resultOrPartial(cA::error).ifPresent($$1x -> $$0.a("SpawnDimension", $$1x));
      }

      $$0.a("spawn_extra_particles_on_fall", this.dr);
      if (this.dt != null) {
         jh.a.encodeStart(vb.a, this.dt).resultOrPartial(cA::error).ifPresent($$1x -> $$0.a("raid_omen_position", $$1x));
      }

      this.l($$0);
   }

   private void k(un $$0) {
      bui $$1 = this.di();
      bui $$2 = this.dm();
      if ($$2 != null && $$1 != this && $$1.dh()) {
         un $$3 = new un();
         un $$4 = new un();
         $$1.e($$4);
         $$3.a("Attach", $$2.cI());
         $$3.a("Entity", $$4);
         $$0.a("RootVehicle", $$3);
      }
   }

   public void a(Optional<un> $$0) {
      if ($$0.isPresent() && $$0.get().b("RootVehicle", 10) && this.dY() instanceof arq $$1) {
         un $$2 = $$0.get().p("RootVehicle");
         bui $$3 = bup.a($$2.p("Entity"), $$1, buo.r, $$1x -> !$$1.c($$1x) ? null : $$1x);
         if ($$3 != null) {
            UUID $$4;
            if ($$2.b("Attach")) {
               $$4 = $$2.a("Attach");
            } else {
               $$4 = null;
            }

            if ($$3.cI().equals($$4)) {
               this.a($$3, true);
            } else {
               for (bui $$6 : $$3.df()) {
                  if ($$6.cI().equals($$4)) {
                     this.a($$6, true);
                     break;
                  }
               }
            }

            if (!this.cb()) {
               cA.warn("Couldn't reattach entity to player");
               $$3.av();

               for (bui $$7 : $$3.df()) {
                  $$7.av();
               }
            }
         }
      }
   }

   private void l(un $$0) {
      if (!this.dw.isEmpty()) {
         ut $$1 = new ut();

         for (cpu $$2 : this.dw) {
            if ($$2.dT()) {
               cA.warn("Trying to save removed ender pearl, skipping");
            } else {
               un $$3 = new un();
               $$2.e($$3);
               all.a.encodeStart(vb.a, $$2.dY().ag().a()).resultOrPartial(cA::error).ifPresent($$1x -> $$3.a("ender_pearl_dimension", $$1x));
               $$1.add($$3);
            }
         }

         $$0.a("ender_pearls", $$1);
      }
   }

   public void b(Optional<un> $$0) {
      if ($$0.isPresent() && $$0.get().b("ender_pearls", 9) && $$0.get().c("ender_pearls") instanceof ut $$2) {
         $$2.forEach($$0x -> {
            if ($$0x instanceof un $$1 && $$1.e("ender_pearl_dimension")) {
               Optional<alk<dff>> $$2x = dff.h.parse(vb.a, $$1.c("ender_pearl_dimension")).resultOrPartial(cA::error);
               if ($$2x.isEmpty()) {
                  cA.warn("No dimension defined for ender pearl, skipping");
                  return;
               }

               arq $$3 = this.dY().o().a($$2x.get());
               if ($$3 != null) {
                  bui $$4 = bup.a($$1, $$3, buo.r, $$1x -> !$$3.c($$1x) ? null : $$1x);
                  if ($$4 != null) {
                     a($$3, $$4.dA());
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
      float $$1 = (float)this.gv();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.cs = azn.a((float)$$0 / $$1, 0.0F, $$2);
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
   public void a(cwf $$0, int $$1) {
      super.a($$0, $$1);
      this.cR = -1;
   }

   private void a(crs $$0) {
      $$0.a(this.dy);
      $$0.a(this.dx);
   }

   public void h() {
      this.a(this.cc);
   }

   @Override
   public void g_() {
      super.g_();
      this.g.b(ael.a);
   }

   @Override
   public void h_() {
      super.h_();
      this.g.b(new aek(this.eU()));
   }

   @Override
   public void a(dvo $$0) {
      ao.e.a(this, $$0);
   }

   @Override
   protected cwc k() {
      return new cxf(this);
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
      if (!this.dY().C && !this.cd.b(this)) {
         this.s();
         this.cd = this.cc;
      }

      bui $$0 = this.M();
      if ($$0 != this) {
         if ($$0.bN()) {
            this.a($$0.dD(), $$0.dF(), $$0.dJ(), $$0.dO(), $$0.dQ());
            this.B().l().a(this);
            if (this.gc()) {
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
      this.gS();
      this.cG.b(this);
   }

   private void gS() {
      bwi $$0 = this.g(bwm.g);
      if ($$0 != null) {
         if (this.f()) {
            $$0.a(cE);
         } else {
            $$0.e(cE);
         }
      }

      bwi $$1 = this.g(bwm.j);
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
         if (!this.R_() || !this.dr()) {
            super.l();
         }

         for (int $$0 = 0; $$0 < this.gl().b(); $$0++) {
            cwf $$1 = this.gl().a($$0);
            if (!$$1.f()) {
               this.j($$1);
            }
         }

         if (this.eH() != this.cO || this.cP != this.ce.a() || this.ce.e() == 0.0F != this.cQ) {
            this.g.b(new afs(this.eH(), this.ce.a(), this.ce.e()));
            this.cO = this.eH();
            this.cP = this.ce.a();
            this.cQ = this.ce.e() == 0.0F;
         }

         if (this.eH() + this.fz() != this.cI) {
            this.cI = this.eH() + this.fz();
            this.a(faz.g, azn.f(this.cI));
         }

         if (this.ce.a() != this.cJ) {
            this.cJ = this.ce.a();
            this.a(faz.h, azn.f((float)this.cJ));
         }

         if (this.cv() != this.cK) {
            this.cK = this.cv();
            this.a(faz.i, azn.f((float)this.cK));
         }

         if (this.eT() != this.cL) {
            this.cL = this.eT();
            this.a(faz.j, azn.f((float)this.cL));
         }

         if (this.cr != this.cN) {
            this.cN = this.cr;
            this.a(faz.k, azn.f((float)this.cN));
         }

         if (this.cq != this.cM) {
            this.cM = this.cq;
            this.a(faz.l, azn.f((float)this.cM));
         }

         if (this.cr != this.cR) {
            this.cR = this.cr;
            this.g.b(new afr(this.cs, this.cr, this.cq));
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

   private void j(cwf $$0) {
      etg $$1 = $$0.a(ku.L);
      eti $$2 = cws.a($$1, this.dY());
      if ($$2 != null) {
         zs<?> $$3 = $$2.a($$1, this);
         if ($$3 != null) {
            this.g.b($$3);
         }
      }
   }

   @Override
   public void n() {
      if (this.eH() > 0.0F && this.df != null) {
         ao.X.a(this, this.df);
      }

      this.df = null;
      super.n();
   }

   @Override
   public void o() {
      if (this.aa > 0.0F && this.df == null) {
         this.df = this.dw();
         if (this.cx != null && this.cx.e <= this.df.e) {
            ao.ae.a(this, this.cx, this.cy);
         }
      }
   }

   public void p() {
      if (this.dm() != null && this.dm().bz()) {
         if (this.dh == null) {
            this.dh = this.dw();
         } else {
            ao.Y.a(this, this.dh);
         }
      }

      if (this.dh != null && (this.dm() == null || !this.dm().bz())) {
         this.dh = null;
      }
   }

   private void a(faz $$0, int $$1) {
      this.gB().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(bsy $$0) {
      this.a(eak.p);
      boolean $$1 = this.dY().ac().b(dfb.n);
      if ($$1) {
         xl $$2 = this.eU().a();
         this.g.a(new aem(this.as(), $$2), ws.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            xl $$3x = xl.a("death.attack.message_too_long", xl.b($$2x).a(n.o));
            xl $$4x = xl.a("death.attack.even_more_magic", this.S_()).a($$1xx -> $$1xx.a(new xr(xr.a.a, $$3x)));
            return new aem(this.as(), $$4x);
         }));
         fay $$3 = this.ct();
         if ($$3 == null || $$3.k() == fay.b.a) {
            this.h.ag().a($$2, false);
         } else if ($$3.k() == fay.b.c) {
            this.h.ag().a(this, $$2);
         } else if ($$3.k() == fay.b.d) {
            this.h.ag().b(this, $$2);
         }
      } else {
         this.g.b(new aem(this.as(), xk.a));
      }

      this.gA();
      if (this.dY().ac().b(dfb.N)) {
         this.gT();
      }

      if (!this.R_()) {
         this.a(this.B(), $$0);
      }

      this.gB().a(faz.d, this, fau::b);
      bve $$4 = this.eV();
      if ($$4 != null) {
         this.b(awy.h.b($$4.ar()));
         $$4.a(this, this.bl, $$0);
         this.f($$4);
      }

      this.dY().a(this, (byte)3);
      this.a(awy.N);
      this.a(awy.i.b(awy.m));
      this.a(awy.i.b(awy.n));
      this.aJ();
      this.k(0);
      this.c(false);
      this.eU().c();
      this.c(Optional.of(jp.a(this.dY().ag(), this.dy())));
   }

   private void gT() {
      ezm $$0 = new ezm(this.dy()).c(32.0, 10.0, 32.0);
      this.dY().a(bvg.class, $$0, bun.f).stream().filter($$0x -> $$0x instanceof bvj).forEach($$0x -> ((bvj)$$0x).a_((cor)this));
   }

   @Override
   public void a(bui $$0, int $$1, bsy $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.s($$1);
         this.gB().a(faz.f, this, fau::b);
         if ($$0 instanceof cor) {
            this.a(awy.Q);
            this.gB().a(faz.e, this, fau::b);
         } else {
            this.a(awy.O);
         }

         this.a(this, $$0, faz.m);
         this.a($$0, this, faz.n);
         ao.c.a(this, $$0, $$2);
      }
   }

   private void a(fav $$0, fav $$1, faz[] $$2) {
      far $$3 = this.gB().e($$1.cK());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gB().a($$2[$$4], $$0, fau::b);
         }
      }
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.h.n() && this.gU() && $$0.a(axf.m);
         if (!$$2 && this.cS > 0 && !$$0.a(axf.d)) {
            return false;
         } else {
            bui $$3 = $$0.d();
            if ($$3 instanceof cor $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof coy $$5 && $$5.s() instanceof cor $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(cor $$0) {
      return !this.gU() ? false : super.a($$0);
   }

   private boolean gU() {
      return this.h.ac();
   }

   public esm a(boolean $$0, esm.a $$1) {
      jh $$2 = this.U();
      float $$3 = this.V();
      boolean $$4 = this.X();
      arq $$5 = this.h.a(this.W());
      if ($$5 != null && $$2 != null) {
         Optional<arr.a> $$6 = a($$5, $$2, $$3, $$4, $$0);
         if ($$6.isPresent()) {
            arr.a $$7 = $$6.get();
            return new esm($$5, $$7.a(), ezr.c, $$7.b(), 0.0F, $$1);
         } else {
            return esm.a(this.h.J(), this, $$1);
         }
      } else {
         return new esm(this.h.J(), this, $$1);
      }
   }

   private static Optional<arr.a> a(arq $$0, jh $$1, float $$2, boolean $$3, boolean $$4) {
      dvo $$5 = $$0.a_($$1);
      dij $$6 = $$5.b();
      if ($$6 instanceof dor && ($$3 || $$5.c(dor.d) > 0) && dor.a($$0)) {
         Optional<ezr> $$7 = dor.a(bup.by, $$0, $$1);
         if (!$$3 && $$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.b(dor.d, Integer.valueOf($$5.c(dor.d) - 1)), 3);
         }

         return $$7.map($$1x -> arr.a.a($$1x, $$1));
      } else if ($$6 instanceof dic && dic.a($$0)) {
         return dic.a(bup.by, $$0, $$1, $$5.c(dic.aF), $$2).map($$1x -> arr.a.a($$1x, $$1));
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dvo $$9 = $$0.a_($$1.d());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new arr.a(new ezr((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5), $$2)) : Optional.empty();
      }
   }

   @Override
   public void q() {
      this.ap();
      this.B().a(this, bui.c.e);
      if (!this.l) {
         this.l = true;
         this.g.b(new ado(ado.f, 0.0F));
         this.j = true;
      }
   }

   @Nullable
   public cor a(esm $$0) {
      if (this.dT()) {
         return null;
      } else {
         if ($$0.f()) {
            this.g.b(new ado(ado.b, 0.0F));
         }

         arq $$1 = $$0.a();
         arq $$2 = this.B();
         alk<dff> $$3 = $$2.ag();
         this.af();
         if ($$1.ag() == $$3) {
            this.c($$0);
            this.g.a(bvr.a($$0), $$0.g());
            this.g.l();
            $$0.h().onTransition(this);
            return this;
         } else {
            this.cY = true;
            etq $$4 = $$1.A_();
            this.g.b(new aew(this.b($$1), (byte)3));
            this.g.b(new acu($$4.q(), $$4.r()));
            avr $$5 = this.h.ag();
            $$5.e(this);
            $$2.a(this, bui.c.e);
            this.dV();
            bor $$6 = boq.a();
            $$6.a("moving");
            if ($$3 == dff.i && $$1.ag() == dff.j) {
               this.dg = this.dw();
            }

            this.c($$0);
            $$6.c();
            $$6.a("placing");
            this.a($$1);
            this.g.a(bvr.a($$0), $$0.g());
            this.g.l();
            $$1.d(this);
            $$6.c();
            this.c($$2);
            this.fI();
            this.g.b(new aei(this.gm()));
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

   private void c(arq $$0) {
      alk<dff> $$1 = $$0.ag();
      alk<dff> $$2 = this.dY().ag();
      ao.w.a(this, $$1, $$2);
      if ($$1 == dff.j && $$2 == dff.i && this.dg != null) {
         ao.D.a(this, this.dg);
      }

      if ($$2 != dff.j) {
         this.dg = null;
      }
   }

   @Override
   public boolean a(arr $$0) {
      if ($$0.R_()) {
         return this.M() == this;
      } else {
         return this.R_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bui $$0, int $$1) {
      super.a($$0, $$1);
      this.cd.d();
   }

   @Override
   public Either<cor.a, bat> a(jh $$0) {
      jm $$1 = this.dY().a_($$0).c(dme.aF);
      if (this.fU() || !this.bN()) {
         return Either.left(cor.a.e);
      } else if (!this.dY().D_().j()) {
         return Either.left(cor.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cor.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cor.a.d);
      } else {
         this.a(this.dY().ag(), $$0, this.dO(), false, true);
         if (this.dY().S()) {
            return Either.left(cor.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               ezr $$4 = ezr.c($$0);
               List<clv> $$5 = this.dY()
                  .a(clv.class, new ezm($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.a(this));
               if (!$$5.isEmpty()) {
                  return Either.left(cor.a.f);
               }
            }

            Either<cor.a, bat> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(awy.ap);
               ao.r.a(this);
            });
            if (!this.B().d()) {
               this.a(xl.c("sleep.not_possible"), true);
            }

            ((arq)this.dY()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(jh $$0) {
      this.a(awy.i.b(awy.n));
      super.b($$0);
   }

   private boolean a(jh $$0, jm $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(jh $$0) {
      ezr $$1 = ezr.c($$0);
      return Math.abs(this.dD() - $$1.a()) <= 3.0 && Math.abs(this.dF() - $$1.b()) <= 2.0 && Math.abs(this.dJ() - $$1.c()) <= 3.0;
   }

   private boolean b(jh $$0, jm $$1) {
      jh $$2 = $$0.d();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fU()) {
         this.B().l().a(this, new ack(this, 2));
      }

      super.a($$0, $$1);
      if (this.g != null) {
         this.g.a(this.dD(), this.dF(), this.dJ(), this.dO(), this.dQ());
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.bS();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public boolean b(bsy $$0) {
      return super.b($$0) || this.R() && !$$0.a(btb.m);
   }

   @Override
   protected void a(double $$0, boolean $$1, dvo $$2, jh $$3) {
   }

   @Override
   protected void b(arq $$0, jh $$1) {
      if (!this.R_()) {
         super.b($$0, $$1);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.dr()) {
         this.a($$3, new ezr($$0, $$1, $$2));
         jh $$4 = this.aR();
         dvo $$5 = this.dY().a_($$4);
         if (this.dr && $$3 && this.aa > 0.0F) {
            ezr $$6 = $$4.b().b(0.0, 0.5, 0.0);
            int $$7 = (int)azn.a(50.0F * this.aa, 0.0F, 200.0F);
            this.B().a(new lk(ls.b, $$5), $$6.d, $$6.e, $$6.f, $$7, 0.3F, 0.3F, 0.3F, 0.15F);
            this.dr = false;
         }

         super.a($$1, $$3, $$5, $$4);
      }
   }

   @Override
   public void a(@Nullable bui $$0) {
      super.a($$0);
      this.cx = this.dw();
      this.cy = $$0;
      this.w($$0 != null && $$0.ar() == bup.bn);
   }

   @Override
   protected void r() {
      if (this.dY().s().i()) {
         super.r();
      }
   }

   @Override
   public void a(dud $$0, boolean $$1) {
      this.g.b(new acq(this.dY(), $$0.aB_()));
      this.g.b(new aeg($$0.aB_(), $$1));
   }

   private void gV() {
      this.dA = this.dA % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bsj $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.cd != this.cc) {
            this.s();
         }

         this.gV();
         crs $$1 = $$0.createMenu(this.dA, this.gl(), this);
         if ($$1 == null) {
            if (this.R_()) {
               this.a(xl.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.g.b(new aef($$1.l, $$1.a(), $$0.S_()));
            this.a($$1);
            this.cd = $$1;
            return OptionalInt.of(this.dA);
         }
      }
   }

   @Override
   public void a(int $$0, ded $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.g.b(new aea($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(ciz $$0, bsa $$1) {
      if (this.cd != this.cc) {
         this.s();
      }

      this.gV();
      int $$2 = $$0.ag_();
      this.g.b(new adp(this.dA, $$2, $$0.as()));
      this.cd = new csu(this.dA, this.gl(), $$1, $$0, $$2);
      this.a(this.cd);
   }

   @Override
   public void a(cwf $$0, bsg $$1) {
      if ($$0.b(ku.T)) {
         if (cyb.a($$0, this.dq(), this)) {
            this.cd.d();
         }

         this.g.b(new aee($$1));
      }
   }

   @Override
   public void a(dtb $$0) {
      this.g.b(aco.a($$0, dsr::e));
   }

   @Override
   public void s() {
      this.g.b(new adb(this.cd.l));
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
      double $$0 = this.dD();
      double $$1 = this.dF();
      double $$2 = this.dJ();
      super.u();
      this.q(this.dD() - $$0, this.dF() - $$1, this.dJ() - $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (!this.cb() && !r($$0, $$1, $$2)) {
         if (this.cm()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(awy.C, $$3);
               this.G(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(axj.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(awy.w, $$4);
               this.G(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.bl()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(awy.s, $$5);
               this.G(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.q_()) {
            if ($$1 > 0.0) {
               this.a(awy.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aL()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.cl()) {
                  this.a(awy.r, $$6);
                  this.G(0.1F * (float)$$6 * 0.01F);
               } else if (this.ck()) {
                  this.a(awy.q, $$6);
                  this.G(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(awy.p, $$6);
                  this.G(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fM()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(awy.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(awy.v, $$8);
            }
         }
      }
   }

   private void q(double $$0, double $$1, double $$2) {
      if (this.cb() && !r($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         bui $$4 = this.dm();
         if ($$4 instanceof cqo) {
            this.a(awy.x, $$3);
         } else if ($$4 instanceof cqq) {
            this.a(awy.y, $$3);
         } else if ($$4 instanceof chm) {
            this.a(awy.z, $$3);
         } else if ($$4 instanceof ciz) {
            this.a(awy.A, $$3);
         } else if ($$4 instanceof cmi) {
            this.a(awy.D, $$3);
         }
      }
   }

   private static boolean r(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(awv<?> $$0, int $$1) {
      this.cH.b(this, $$0, $$1);
      this.gB().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(awv<?> $$0) {
      this.cH.a(this, $$0, 0);
      this.gB().a($$0, this, fau::c);
   }

   @Override
   public int a(Collection<dav<?>> $$0) {
      return this.cZ.a($$0, this);
   }

   @Override
   public void a(dav<?> $$0, List<cwf> $$1) {
      ao.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<all> $$0) {
      List<dav<?>> $$1 = $$0.stream().flatMap($$0x -> this.h.aI().a($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<dav<?>> $$0) {
      return this.cZ.b($$0, this);
   }

   @Override
   public void v() {
      super.v();
      this.a(awy.E);
      if (this.cl()) {
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
      this.bR();
      if (this.fU()) {
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
   public void a(xl $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void z() {
      if (!this.bz.f() && this.fC()) {
         this.g.b(new adl(this, (byte)9));
         super.z();
      }
   }

   @Override
   public void a(fi.a $$0, ezr $$1) {
      super.a($$0, $$1);
      this.g.b(new aep($$0, $$1.d, $$1.e, $$1.f));
   }

   public void a(fi.a $$0, bui $$1, fi.a $$2) {
      ezr $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.g.b(new aep($$0, $$1, $$2));
   }

   public void a(arr $$0, boolean $$1) {
      this.ds = $$0.ds;
      this.dz = $$0.dz;
      this.i.a($$0.i.b(), $$0.i.c());
      this.A();
      if ($$1) {
         this.fb().b($$0.fb());
         this.fb().c($$0.fb());
         this.x($$0.eH());
         this.ce = $$0.ce;

         for (btn $$2 : $$0.eE()) {
            this.a(new btn($$2));
         }

         this.gl().a($$0.gl());
         this.cq = $$0.cq;
         this.cr = $$0.cr;
         this.cs = $$0.cs;
         this.r($$0.gg());
         this.at = $$0.at;
      } else {
         this.fb().b($$0.fb());
         this.x(this.eW());
         if (this.dY().ac().b(dfb.d) || $$0.R_()) {
            this.gl().a($$0.gl());
            this.cq = $$0.cq;
            this.cr = $$0.cr;
            this.cs = $$0.cs;
            this.r($$0.gg());
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
      this.i($$0.gD());
      this.j($$0.gE());
      this.c($$0.gL());
   }

   @Override
   protected void a(btn $$0, @Nullable bui $$1) {
      super.a($$0, $$1);
      this.g.b(new agr(this.as(), $$0, true));
      if ($$0.a(btp.y)) {
         this.db = this.ag;
         this.da = this.dw();
      }

      ao.B.a(this, $$1);
   }

   @Override
   protected void a(btn $$0, boolean $$1, @Nullable bui $$2) {
      super.a($$0, $$1, $$2);
      this.g.b(new agr(this.as(), $$0, false));
      ao.B.a(this, $$2);
   }

   @Override
   protected void c(Collection<btn> $$0) {
      super.c($$0);

      for (btn $$1 : $$0) {
         this.g.b(new aeu(this.as(), $$1.c()));
         if ($$1.a(btp.y)) {
            this.da = null;
         }
      }

      ao.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.g.a(new bvr(new ezr($$0, $$1, $$2), ezr.c, 0.0F, 0.0F), bvs.a(bvs.l, bvs.k));
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.g.a(new bvr(new ezr($$0, $$1, $$2), ezr.c, 0.0F, 0.0F), bvs.j);
   }

   @Override
   public boolean a(arq $$0, double $$1, double $$2, double $$3, Set<bvs> $$4, float $$5, float $$6, boolean $$7) {
      del $$8 = new del(jh.a($$1, $$2, $$3));
      $$0.l().a(arw.g, $$8, 1, this.as());
      if (this.fU()) {
         this.a(true, true);
      }

      if ($$7) {
         this.d(this);
      }

      boolean $$9 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$9) {
         this.q($$4.contains(bvs.d) ? this.cC() + $$5 : $$5);
      }

      return $$9;
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      super.e($$0, $$1, $$2);
      this.g.l();
   }

   @Override
   public void b(bui $$0) {
      this.B().l().a(this, new ack($$0, 4));
   }

   @Override
   public void c(bui $$0) {
      this.B().l().a(this, new ack($$0, 5));
   }

   @Override
   public void A() {
      if (this.g != null) {
         this.g.b(new aei(this.gm()));
         this.L();
      }
   }

   public arq B() {
      return (arq)this.dY();
   }

   public boolean a(dfc $$0) {
      boolean $$1 = this.R_();
      if (!this.i.a($$0)) {
         return false;
      } else {
         this.g.b(new ado(ado.e, (float)$$0.a()));
         if ($$0 == dfc.d) {
            this.gA();
            this.af();
            dby.a(this);
         } else {
            this.d(this);
            if ($$1) {
               dby.a(this.B(), this);
            }
         }

         this.A();
         this.fA();
         return true;
      }
   }

   @Override
   public boolean R_() {
      return this.i.b() == dfc.d;
   }

   @Override
   public boolean f() {
      return this.i.b() == dfc.b;
   }

   @Override
   public void a(xl $$0) {
      this.b($$0, false);
   }

   public void b(xl $$0, boolean $$1) {
      if (this.x($$1)) {
         this.g.a(new agi($$0, $$1), ws.a(() -> {
            if (this.x(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               xl $$3 = xl.b($$2).a(n.o);
               return new agi(xl.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(ya $$0, boolean $$1, xh.a $$2) {
      if (this.gW()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String C() {
      return this.g.m() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(arc $$0) {
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

   public arc D() {
      int $$0 = this.aw().a(bX);
      buy $$1 = buy.d.apply(this.aw().a(bY));
      return new arc(this.de, this.dd, this.cT, this.cV, $$0, $$1, this.dp, this.dq, this.cU);
   }

   public boolean E() {
      return this.cV;
   }

   public coo F() {
      return this.cT;
   }

   private boolean x(boolean $$0) {
      return this.cT == coo.c ? $$0 : true;
   }

   private boolean gW() {
      return this.cT == coo.a;
   }

   public int G() {
      return this.dd;
   }

   public void a(aki $$0) {
      this.g.b(new afa($$0.a(), $$0.d().map(aki.a::a)));
   }

   @Override
   protected int H() {
      return this.h.c(this.gk());
   }

   @Override
   public void I() {
      this.cW = ae.c();
   }

   public awu J() {
      return this.cH;
   }

   public awt K() {
      return this.cZ;
   }

   @Override
   protected void L() {
      if (this.R_()) {
         this.eC();
         this.k(true);
      } else {
         super.L();
      }
   }

   public bui M() {
      return (bui)(this.cX == null ? this : this.cX);
   }

   @Override
   public void d(@Nullable bui $$0) {
      bui $$1 = this.M();
      this.cX = (bui)($$0 == null ? this : $$0);
      if ($$1 != this.cX) {
         if (this.cX.dY() instanceof arq $$2) {
            this.a($$2, this.cX.dD(), this.cX.dF(), this.cX.dJ(), Set.of(), this.dO(), this.dQ(), false);
         }

         if ($$0 != null) {
            this.B().l().a(this);
         }

         this.g.b(new afh(this.cX));
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
   public void e(bui $$0) {
      if (this.i.b() == dfc.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long O() {
      return this.cW;
   }

   @Nullable
   public xl P() {
      return null;
   }

   public int Q() {
      return 0;
   }

   @Override
   public void a(bsg $$0) {
      super.a($$0);
      this.gG();
   }

   public boolean R() {
      return this.cY;
   }

   public void S() {
      this.cY = false;
   }

   public alt T() {
      return this.cG;
   }

   @Nullable
   public jh U() {
      return this.dl;
   }

   public float V() {
      return this.dn;
   }

   public alk<dff> W() {
      return this.dk;
   }

   public boolean X() {
      return this.dm;
   }

   public void b(arr $$0) {
      this.a($$0.W(), $$0.U(), $$0.V(), $$0.X(), false);
   }

   public void a(alk<dff> $$0, @Nullable jh $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.dl) && $$0.equals(this.dk);
         if ($$4 && !$$5) {
            this.a(xl.c("block.minecraft.set_spawn"));
         }

         this.dl = $$1;
         this.dk = $$0;
         this.dn = $$2;
         this.dm = $$3;
      } else {
         this.dl = null;
         this.dk = dff.i;
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

   public arb Z() {
      return this.dj;
   }

   public void a(arb $$0) {
      this.dj = $$0;
   }

   @Override
   public void a(awn $$0, awp $$1, float $$2, float $$3) {
      this.g.b(new agf(lz.b.e($$0), $$1, this.dD(), this.dF(), this.dJ(), $$2, $$3, this.af.g()));
   }

   @Override
   public ckz a(cwf $$0, boolean $$1, boolean $$2) {
      ckz $$3 = this.b($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dY().b($$3);
         cwf $$4 = $$3.m();
         if ($$2) {
            if (!$$4.f()) {
               this.a(awy.f.b($$4.h()), $$0.L());
            }

            this.a(awy.F);
         }

         return $$3;
      }
   }

   @Nullable
   private ckz b(cwf $$0, boolean $$1, boolean $$2) {
      if ($$0.f()) {
         return null;
      } else {
         double $$3 = this.dH() - 0.3F;
         ckz $$4 = new ckz(this.dY(), this.dD(), $$3, this.dJ(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.af.i() * 0.5F;
            float $$6 = this.af.i() * (float) (Math.PI * 2);
            $$4.n((double)(-azn.a($$6) * $$5), 0.2F, (double)(azn.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = azn.a(this.dQ() * (float) (Math.PI / 180.0));
            float $$9 = azn.b(this.dQ() * (float) (Math.PI / 180.0));
            float $$10 = azn.a(this.dO() * (float) (Math.PI / 180.0));
            float $$11 = azn.b(this.dO() * (float) (Math.PI / 180.0));
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

   public asz aa() {
      return this.do;
   }

   public void a(arq $$0) {
      this.a((dff)$$0);
      this.i.a($$0);
   }

   @Nullable
   private static dfc a(@Nullable un $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? dfc.a($$0.h($$1)) : null;
   }

   private dfc b(@Nullable dfc $$0) {
      dfc $$1 = this.h.bd();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.h.u();
      }
   }

   @Override
   public void c(@Nullable un $$0) {
      this.i.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void m(un $$0) {
      $$0.a("playerGameType", this.i.b().a());
      dfc $$1 = this.i.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean ab() {
      return this.dp;
   }

   public boolean c(arr $$0) {
      return $$0 == this ? false : this.dp || $$0.dp;
   }

   @Override
   public boolean a(dff $$0, jh $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cwf $$0) {
      ao.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      coq $$1 = this.gl();
      cwf $$2 = $$1.a($$0);
      this.cd.b($$1, $$1.j).ifPresent($$1x -> this.cd.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean ac() {
      return this.dq;
   }

   @Override
   public Optional<cnv> ad() {
      return Optional.of(this.ds);
   }

   public void b(boolean $$0) {
      this.dr = $$0;
   }

   @Override
   public void a(ckz $$0) {
      super.a($$0);
      bui $$1 = $$0.s();
      if ($$1 != null) {
         ao.S.a(this, $$0.m(), $$1);
      }
   }

   public void a(yc $$0) {
      this.dz = $$0;
   }

   @Nullable
   public yc ae() {
      return this.dz != null && this.dz.b() ? null : this.dz;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cw = (float)(azn.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dO());
      this.g.b(new adq(this));
   }

   @Override
   public boolean a(bui $$0, boolean $$1) {
      if (super.a($$0, $$1)) {
         $$0.j(this);
         this.g.a(new bvr(this.dw(), ezr.c, 0.0F, 0.0F), bvs.k);
         if ($$0 instanceof bve $$2) {
            this.h.ag().a($$2, this.g);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void af() {
      bui $$0 = this.dm();
      super.af();
      if ($$0 instanceof bve $$1) {
         for (btn $$2 : $$1.eE()) {
            this.g.b(new aeu($$0.as(), $$2.c()));
         }
      }
   }

   public agt b(arq $$0) {
      return new agt($$0.af(), $$0.ag(), dgj.a($$0.C()), this.i.b(), this.i.c(), $$0.ah(), $$0.B(), this.gL(), this.aE(), $$0.N());
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
   public ezr ai() {
      bui $$0 = this.dm();
      return $$0 != null && $$0.cZ() != this ? $$0.ai() : this.du;
   }

   public void a(ezr $$0) {
      this.du = $$0;
   }

   @Override
   protected float a(bui $$0, float $$1, bsy $$2) {
      return dby.a(this.B(), this.ec(), $$0, $$2, $$1);
   }

   @Override
   public void a(cwb $$0, buq $$1) {
      super.a($$0, $$1);
      this.b(awy.d.b($$0));
   }

   public cop aj() {
      return this.dv;
   }

   public void a(cop $$0) {
      this.dv = $$0;
   }

   public ezr ak() {
      float $$0 = this.dv.c() == this.dv.d() ? 0.0F : (this.dv.c() ? 1.0F : -1.0F);
      float $$1 = this.dv.a() == this.dv.b() ? 0.0F : (this.dv.a() ? 1.0F : -1.0F);
      return a(new ezr((double)$$0, 0.0, (double)$$1), 1.0F, this.dO());
   }

   public void a(cpu $$0) {
      this.dw.add($$0);
   }

   public void b(cpu $$0) {
      this.dw.remove($$0);
   }

   public Set<cpu> al() {
      return this.dw;
   }

   public long c(cpu $$0) {
      if ($$0.dY() instanceof arq $$1) {
         del $$2 = $$0.dA();
         this.a($$0);
         $$1.h();
         return a($$1, $$2) - 1L;
      } else {
         return 0L;
      }
   }

   public static long a(arq $$0, del $$1) {
      $$0.l().a(arw.f, $$1, 2, $$1);
      return arw.f.b();
   }

   static record a(ezr a, float b) {
      public static arr.a a(ezr $$0, jh $$1) {
         return new arr.a($$0, b($$0, $$1));
      }

      private static float b(ezr $$0, jh $$1) {
         ezr $$2 = ezr.c($$1).d($$0).d();
         return (float)azn.d(azn.d($$2.f, $$2.d) * 180.0F / (float)Math.PI - 90.0);
      }
   }
}
