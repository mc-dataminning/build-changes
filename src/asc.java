import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.hash.HashCode;
import com.google.common.net.InetAddresses;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
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
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class asc extends csi {
   private static final Logger cq = LogUtils.getLogger();
   private static final int cr = 32;
   private static final int cs = 10;
   private static final int ct = 25;
   public static final double a = 1.0;
   public static final double b = 3.0;
   public static final int c = 2;
   public static final String d = "ender_pearls";
   public static final String e = "ender_pearl_dimension";
   private static final bzj cu = new bzj(alr.b("creative_mode_block_range"), 0.5, bzj.a.a);
   private static final bzj cv = new bzj(alr.b("creative_mode_entity_range"), 2.0, bzj.a.a);
   private static final xg cw = xg.c("block.minecraft.set_spawn");
   private static final boolean cx = false;
   private static final boolean cy = false;
   public ate f;
   public final MinecraftServer g;
   public final asd h;
   private final alz cz;
   private final axe cA;
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
   private csf cL = csf.a;
   private art cM = art.a;
   private boolean cN = true;
   private long cO = ag.c();
   @Nullable
   private bxe cP;
   private boolean cQ;
   public boolean i = false;
   private final axd cR;
   @Nullable
   private fgc cS;
   private int cT;
   private boolean cU;
   private int cV = 2;
   private String cW = "en_us";
   @Nullable
   private fgc cX;
   @Nullable
   private fgc cY;
   @Nullable
   private fgc cZ;
   private jz da = jz.a(0, 0, 0);
   private ark db = ark.a;
   @Nullable
   private asc.a dc;
   private final atk dd;
   private boolean de;
   private boolean df;
   private boolean dg = false;
   private crn dh = new crn();
   @Nullable
   private iw di;
   private fgc dj = fgc.c;
   private csg dk = csg.b;
   private final Set<ctn> dl = new HashSet<>();
   private final cwq dm = new cwq() {
      private final LoadingCache<kn<?>, Integer> b = CacheBuilder.newBuilder().maximumSize(256L).build(new CacheLoader<kn<?>, Integer>() {
         private final DynamicOps<HashCode> b = asc.this.dX().a(azp.c);

         public Integer a(kn<?> $$0) {
            return ((HashCode)$$0.a(this.b).getOrThrow($$1 -> new IllegalArgumentException("Failed to hash " + $$0 + ": " + $$1))).asInt();
         }
      });

      @Override
      public void a(cwb $$0, List<dak> $$1, dak $$2, int[] $$3) {
         asc.this.f.b(new acz($$0.l, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cwb $$0, int $$1, dak $$2) {
         asc.this.f.b(new adb($$0.l, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cwb $$0, dak $$1) {
         asc.this.f.b(new afl($$1));
      }

      @Override
      public void a(cwb $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cwb $$0, int $$1, int $$2) {
         asc.this.f.b(new ada($$0.l, $$1, $$2));
      }

      @Override
      public cxt a() {
         return new cxt.a(this.b::getUnchecked);
      }
   };
   private final cwp dn = new cwp() {
      @Override
      public void a(cwb $$0, int $$1, dak $$2) {
         cxz $$3 = $$0.b($$1);
         if (!($$3 instanceof cxv)) {
            if ($$3.c == asc.this.gj()) {
               aq.f.a(asc.this, asc.this.gj(), $$2);
            }
         }
      }

      @Override
      public void a(cwb $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private xx do;
   @Nullable
   public final Object j;
   private final ej dp = new ej() {
      @Override
      public boolean x_() {
         return asc.this.x().O().c(dkf.q);
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
      public void a(xg $$0) {
         asc.this.a($$0);
      }
   };
   private int dq;
   public boolean k;

   public asc(MinecraftServer $$0, asb $$1, GameProfile $$2, arl $$3) {
      super($$1, $$1.aa(), $$1.ab(), $$2);
      this.dd = $$0.a(this);
      this.h = $$0.b(this);
      this.cR = new axd(($$1x, $$2x) -> $$0.aI().a($$1x, $$2x));
      this.g = $$0;
      this.cA = $$0.ag().a((csi)this);
      this.cz = $$0.ag().g(this);
      this.b(this.a($$1, $$1.aa()).c(), 0.0F, 0.0F);
      this.a($$3);
      this.j = null;
   }

   @Override
   public iw a(asb $$0, iw $$1) {
      ffx $$2 = this.a(byr.a).a(fgc.c);
      iw $$3 = $$1;
      if ($$0.F_().g() && $$0.p().aZ().k() != dkg.c) {
         int $$4 = Math.max(0, this.g.a($$0));
         int $$5 = azz.a($$0.E_().b((double)$$1.u(), (double)$$1.w()));
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
         int $$10 = bai.a().a($$8);

         for (int $$11 = 0; $$11 < $$8; $$11++) {
            int $$12 = ($$10 + $$9 * $$11) % $$8;
            int $$13 = $$12 % ($$4 * 2 + 1);
            int $$14 = $$12 / ($$4 * 2 + 1);
            int $$15 = $$1.u() + $$13 - $$4;
            int $$16 = $$1.w() + $$14 - $$4;

            try {
               $$3 = arv.a($$0, $$15, $$16);
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

   private boolean a(asb $$0, ffx $$1) {
      return $$0.a(this, $$1, true);
   }

   private int t(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.dh = $$0.<crn>a("warden_spawn_tracker", crn.a).orElseGet(crn::new);
      this.cY = $$0.<fgc>a("entered_nether_pos", fgc.a).orElse(null);
      this.i = $$0.b("seenCredits", false);
      this.cR.a($$0.n("recipeBook"), $$0x -> this.g.aI().b($$0x).isPresent());
      if (this.fR()) {
         this.fS();
      }

      this.dc = $$0.<asc.a>a("respawn", asc.a.a).orElse(null);
      this.dg = $$0.b("spawn_extra_particles_on_fall", false);
      this.di = $$0.<iw>a("raid_omen_position", iw.a).orElse(null);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("warden_spawn_tracker", crn.a, this.dh);
      this.p($$0);
      $$0.a("seenCredits", this.i);
      $$0.b("entered_nether_pos", fgc.a, this.cY);
      this.m($$0);
      $$0.a("recipeBook", this.cR.b());
      $$0.a("Dimension", this.dV().aj().a().toString());
      $$0.b("respawn", asc.a.a, this.dc);
      $$0.a("spawn_extra_particles_on_fall", this.dg);
      $$0.b("raid_omen_position", iw.a, this.di);
      this.n($$0);
   }

   private void m(ua $$0) {
      bxe $$1 = this.df();
      bxe $$2 = this.dk();
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
         asb $$2 = this.x();
         bxe $$3 = bxn.a($$1.get().n("Entity"), $$2, bxm.r, $$1x -> !$$2.c($$1x) ? null : $$1x);
         if ($$3 != null) {
            UUID $$4 = $$1.get().<UUID>a("Attach", ka.a).orElse(null);
            if ($$3.cG().equals($$4)) {
               this.a($$3, true);
            } else {
               for (bxe $$5 : $$3.dc()) {
                  if ($$5.cG().equals($$4)) {
                     this.a($$5, true);
                     break;
                  }
               }
            }

            if (!this.bY()) {
               cq.warn("Couldn't reattach entity to player");
               $$3.aq();

               for (bxe $$6 : $$3.dc()) {
                  $$6.aq();
               }
            }
         }
      }
   }

   private void n(ua $$0) {
      if (!this.dl.isEmpty()) {
         ug $$1 = new ug();

         for (ctn $$2 : this.dl) {
            if ($$2.dQ()) {
               cq.warn("Trying to save removed ender pearl, skipping");
            } else {
               ua $$3 = new ua();
               $$2.g($$3);
               $$3.a("ender_pearl_dimension", dkj.h, $$2.dV().aj());
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
      Optional<alq<dkj>> $$1 = $$0.a("ender_pearl_dimension", dkj.h);
      if (!$$1.isEmpty()) {
         asb $$2 = this.x().p().a($$1.get());
         if ($$2 != null) {
            bxe $$3 = bxn.a($$0, $$2, bxm.r, $$1x -> !$$2.c($$1x) ? null : $$1x);
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
      this.ch = azz.a((float)$$0 / $$1, 0.0F, $$2);
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
   public void a(dak $$0, int $$1) {
      super.a($$0, $$1);
      this.cK = -1;
   }

   private void a(cwb $$0) {
      $$0.a(this.dn);
      $$0.a(this.dm);
   }

   public void c() {
      this.a(this.bQ);
   }

   @Override
   public void f_() {
      super.f_();
      this.f.b(aej.a);
   }

   @Override
   public void O_() {
      super.O_();
      this.f.b(new aei(this.eS()));
   }

   @Override
   public void a(ebq $$0) {
      aq.e.a(this, $$0);
   }

   @Override
   protected dah f() {
      return new dbi(this);
   }

   @Override
   public void g() {
      this.gL();
      this.h.a();
      this.dh.a();
      if (this.aj > 0) {
         this.aj--;
      }

      this.bR.d();
      if (!this.bR.b(this)) {
         this.o();
         this.bR = this.bQ;
      }

      bxe $$0 = this.K();
      if ($$0 != this) {
         if ($$0.bJ()) {
            this.a($$0.dA(), $$0.dC(), $$0.dG(), $$0.dL(), $$0.dN());
            this.x().m().a(this);
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

      this.k();
      this.l();
      this.gT();
      this.cz.a(this, true);
   }

   private void gT() {
      bzh $$0 = this.g(bzl.g);
      if ($$0 != null) {
         if (this.gz()) {
            $$0.a(cu);
         } else {
            $$0.e(cu);
         }
      }

      bzh $$1 = this.g(bzl.j);
      if ($$1 != null) {
         if (this.gz()) {
            $$1.a(cv);
         } else {
            $$1.e(cv);
         }
      }
   }

   public void h() {
      try {
         if (!this.ak() || !this.do()) {
            super.g();
         }

         for (int $$0 = 0; $$0 < this.gj().b(); $$0++) {
            dak $$1 = this.gj().a($$0);
            if (!$$1.f()) {
               this.i($$1);
            }
         }

         if (this.eG() != this.cH || this.cI != this.bS.a() || this.bS.c() == 0.0F != this.cJ) {
            this.f.b(new aft(this.eG(), this.bS.a(), this.bS.c()));
            this.cH = this.eG();
            this.cI = this.bS.a();
            this.cJ = this.bS.c() == 0.0F;
         }

         if (this.eG() + this.fw() != this.cB) {
            this.cB = this.eG() + this.fw();
            this.a(fhk.h, azz.f(this.cB));
         }

         if (this.bS.a() != this.cC) {
            this.cC = this.bS.a();
            this.a(fhk.i, azz.f((float)this.cC));
         }

         if (this.cs() != this.cD) {
            this.cD = this.cs();
            this.a(fhk.j, azz.f((float)this.cD));
         }

         if (this.eR() != this.cE) {
            this.cE = this.eR();
            this.a(fhk.k, azz.f((float)this.cE));
         }

         if (this.cg != this.cG) {
            this.cG = this.cg;
            this.a(fhk.l, azz.f((float)this.cG));
         }

         if (this.cf != this.cF) {
            this.cF = this.cf;
            this.a(fhk.m, azz.f((float)this.cF));
         }

         if (this.cg != this.cK) {
            this.cK = this.cg;
            this.f.b(new afs(this.ch, this.cg, this.cf));
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

   private void i(dak $$0) {
      ezt $$1 = $$0.a(kl.M);
      ezv $$2 = dax.a($$1, this.dV());
      if ($$2 != null) {
         zo<?> $$3 = $$2.a($$1, this);
         if ($$3 != null) {
            this.f.b($$3);
         }
      }
   }

   @Override
   protected void i() {
      if (this.dV().an() == buz.a && this.x().O().c(dkf.l)) {
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
   public void j() {
      if (this.eG() > 0.0F && this.cX != null) {
         aq.X.a(this, this.cX);
      }

      this.cX = null;
      super.j();
   }

   public void k() {
      if (this.Z > 0.0 && this.cX == null) {
         this.cX = this.dt();
         if (this.cm != null && this.cm.e <= this.cX.e) {
            aq.ae.a(this, this.cm, this.cn);
         }
      }
   }

   @Override
   public void l() {
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

   private void a(fhk $$0, int $$1) {
      this.gA().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(bvt $$0) {
      this.a(egq.p);
      boolean $$1 = this.x().O().c(dkf.o);
      if ($$1) {
         xg $$2 = this.eS().a();
         this.f.a(new aek(this.ao(), $$2), wl.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            xg $$3x = xg.a("death.attack.message_too_long", xg.b($$2x).a(o.o));
            xg $$4x = xg.a("death.attack.even_more_magic", this.P_()).a($$1xx -> $$1xx.a(new xm.e($$3x)));
            return new aek(this.ao(), $$4x);
         }));
         fhj $$3 = this.cq();
         if ($$3 == null || $$3.l() == fhj.b.a) {
            this.g.ag().a($$2, false);
         } else if ($$3.l() == fhj.b.c) {
            this.g.ag().a(this, $$2);
         } else if ($$3.l() == fhj.b.d) {
            this.g.ag().b(this, $$2);
         }
      } else {
         this.f.b(new aek(this.ao(), xf.a));
      }

      this.gy();
      if (this.x().O().c(dkf.P)) {
         this.gU();
      }

      if (!this.ak()) {
         this.b(this.x(), $$0);
      }

      this.gA().a(fhk.e, this, fhf::b);
      byf $$4 = this.eT();
      if ($$4 != null) {
         this.b(axi.h.b($$4.an()));
         $$4.a(this, $$0);
         this.e($$4);
      }

      this.dV().a(this, (byte)3);
      this.a(axi.N);
      this.a(axi.i.b(axi.m));
      this.a(axi.i.b(axi.n));
      this.aF();
      this.k(0);
      this.c(false);
      this.eS().c();
      this.a(Optional.of(jf.a(this.dV().aj(), this.dv())));
      this.v(false);
   }

   private void gU() {
      ffx $$0 = new ffx(this.dv()).c(32.0, 10.0, 32.0);
      this.dV().a(byh.class, $$0, bxl.f).stream().filter($$0x -> $$0x instanceof byk).forEach($$0x -> ((byk)$$0x).a_(this.x(), this));
   }

   @Override
   public void a(bxe $$0, bvt $$1) {
      if ($$0 != this) {
         super.a($$0, $$1);
         this.gA().a(fhk.g, this, fhf::b);
         if ($$0 instanceof csi) {
            this.a(axi.Q);
            this.gA().a(fhk.f, this, fhf::b);
         } else {
            this.a(axi.O);
         }

         this.a(this, $$0, fhk.n);
         this.a($$0, this, fhk.o);
         aq.c.a(this, $$0, $$1);
      }
   }

   private void a(fhg $$0, fhg $$1, fhk[] $$2) {
      fhc $$3 = this.gA().e($$1.cI());
      if ($$3 != null) {
         int $$4 = $$3.o().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gA().a($$2[$$4], $$0, fhf::b);
         }
      }
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         bxe $$3 = $$1.d();
         if ($$3 instanceof csi $$4 && !this.a($$4)) {
            return false;
         }

         if ($$3 instanceof csq $$5 && $$5.p() instanceof csi $$7 && !this.a($$7)) {
            return false;
         }

         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(csi $$0) {
      return !this.gV() ? false : super.a($$0);
   }

   private boolean gV() {
      return this.g.ac();
   }

   public eza a(boolean $$0, eza.a $$1) {
      asc.a $$2 = this.S();
      asb $$3 = this.g.a(asc.a.b($$2));
      if ($$3 != null && $$2 != null) {
         Optional<asc.b> $$4 = a($$3, $$2, $$0);
         if ($$4.isPresent()) {
            asc.b $$5 = $$4.get();
            return new eza($$3, $$5.a(), fgc.c, $$5.b(), 0.0F, $$1);
         } else {
            return eza.a(this.g.J(), this, $$1);
         }
      } else {
         return new eza(this.g.J(), this, $$1);
      }
   }

   private static Optional<asc.b> a(asb $$0, asc.a $$1, boolean $$2) {
      iw $$3 = $$1.c;
      float $$4 = $$1.d;
      boolean $$5 = $$1.e;
      ebq $$6 = $$0.a_($$3);
      dno $$7 = $$6.b();
      if ($$7 instanceof dud && ($$5 || $$6.c(dud.d) > 0) && dud.a($$0)) {
         Optional<fgc> $$8 = dud.a(bxn.bT, $$0, $$3);
         if (!$$5 && $$2 && $$8.isPresent()) {
            $$0.a($$3, $$6.b(dud.d, Integer.valueOf($$6.c(dud.d) - 1)), 3);
         }

         return $$8.map($$1x -> asc.b.a($$1x, $$3));
      } else if ($$7 instanceof dnh && dnh.a($$0)) {
         return dnh.a(bxn.bT, $$0, $$3, $$6.c(dnh.e), $$4).map($$1x -> asc.b.a($$1x, $$3));
      } else if (!$$5) {
         return Optional.empty();
      } else {
         boolean $$9 = $$7.a($$6);
         ebq $$10 = $$0.a_($$3.d());
         boolean $$11 = $$10.b().a($$10);
         return $$9 && $$11 ? Optional.of(new asc.b(new fgc((double)$$3.u() + 0.5, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5), $$4)) : Optional.empty();
      }
   }

   @Override
   public void m() {
      this.al();
      this.x().a(this, bxe.d.e);
      if (!this.k) {
         this.k = true;
         this.f.b(new adm(adm.f, 0.0F));
         this.i = true;
      }
   }

   @Nullable
   public asc a(eza $$0) {
      if (this.dQ()) {
         return null;
      } else {
         if ($$0.g()) {
            this.f.b(new adm(adm.b, 0.0F));
         }

         asb $$1 = $$0.b();
         asb $$2 = this.x();
         alq<dkj> $$3 = $$2.aj();
         if (!$$0.h()) {
            this.aa();
         }

         if ($$1.aj() == $$3) {
            this.f.a(bys.a($$0), $$0.i());
            this.f.l();
            $$0.j().onTransition(this);
            return this;
         } else {
            this.cQ = true;
            fad $$4 = $$1.C_();
            this.f.b(new aex(this.b($$1), (byte)3));
            this.f.b(new acr($$4.q(), $$4.r()));
            awb $$5 = this.g.ag();
            $$5.e(this);
            $$2.a(this, bxe.d.e);
            this.dS();
            brm $$6 = brl.a();
            $$6.a("moving");
            if ($$3 == dkj.i && $$1.aj() == dkj.j) {
               this.cY = this.dt();
            }

            $$6.c();
            $$6.a("placing");
            this.a($$1);
            this.f.a(bys.a($$0), $$0.i());
            this.f.l();
            $$1.d(this);
            $$6.c();
            this.g($$2);
            this.fF();
            this.f.b(new aeg(this.gk()));
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
      this.f.b(new aep($$0, $$1));
   }

   private void g(asb $$0) {
      alq<dkj> $$1 = $$0.aj();
      alq<dkj> $$2 = this.dV().aj();
      aq.w.a(this, $$1, $$2);
      if ($$1 == dkj.j && $$2 == dkj.i && this.cY != null) {
         aq.D.a(this, this.cY);
      }

      if ($$2 != dkj.j) {
         this.cY = null;
      }
   }

   @Override
   public boolean a(asc $$0) {
      if ($$0.ak()) {
         return this.K() == this;
      } else {
         return this.ak() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bxe $$0, int $$1) {
      super.a($$0, $$1);
      this.bR.d();
   }

   @Override
   public Either<csi.a, bbh> a(iw $$0) {
      jc $$1 = this.dV().a_($$0).c(drp.e);
      if (this.fR() || !this.bJ()) {
         return Either.left(csi.a.e);
      } else if (!this.dV().F_().j()) {
         return Either.left(csi.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(csi.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(csi.a.d);
      } else {
         this.a(new asc.a(this.dV().aj(), $$0, this.dL(), false), true);
         if (this.dV().V()) {
            return Either.left(csi.a.b);
         } else {
            if (!this.gz()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               fgc $$4 = fgc.c($$0);
               List<cpk> $$5 = this.dV()
                  .a(
                     cpk.class,
                     new ffx($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0),
                     $$0x -> $$0x.a(this.x(), this)
                  );
               if (!$$5.isEmpty()) {
                  return Either.left(csi.a.f);
               }
            }

            Either<csi.a, bbh> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(axi.ap);
               aq.r.a(this);
            });
            if (!this.x().e()) {
               this.a(xg.c("sleep.not_possible"), true);
            }

            ((asb)this.dV()).f();
            return $$6;
         }
      }
   }

   @Override
   public void b(iw $$0) {
      this.a(axi.i.b(axi.n));
      super.b($$0);
   }

   private boolean a(iw $$0, jc $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(iw $$0) {
      fgc $$1 = fgc.c($$0);
      return Math.abs(this.dA() - $$1.a()) <= 3.0 && Math.abs(this.dC() - $$1.b()) <= 2.0 && Math.abs(this.dG() - $$1.c()) <= 3.0;
   }

   private boolean b(iw $$0, jc $$1) {
      iw $$2 = $$0.d();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fR()) {
         this.x().m().a(this, new ach(this, 2));
      }

      super.a($$0, $$1);
      if (this.f != null) {
         this.f.a(this.dA(), this.dC(), this.dG(), this.dL(), this.dN());
      }
   }

   @Override
   public boolean a(asb $$0, bvt $$1) {
      return super.a($$0, $$1) || this.P() && !$$1.a(bvw.m) || !this.gK();
   }

   @Override
   protected void b(asb $$0, iw $$1) {
      if (!this.ak()) {
         super.b($$0, $$1);
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, ebq $$2, iw $$3) {
      if (this.dg && $$1 && this.Z > 0.0) {
         fgc $$4 = $$3.b().b(0.0, 0.5, 0.0);
         int $$5 = (int)azz.a(50.0 * this.Z, 0.0, 200.0);
         this.x().a(new lr(lz.b, $$2), $$4.d, $$4.e, $$4.f, $$5, 0.3F, 0.3F, 0.3F, 0.15F);
         this.dg = false;
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b_(@Nullable bxe $$0) {
      super.b_($$0);
      this.cm = this.dt();
      this.cn = $$0;
      this.w($$0 != null && $$0.an() == bxn.bI);
   }

   @Override
   protected void n() {
      if (this.dV().u().i()) {
         super.n();
      }
   }

   @Override
   public void a(eac $$0, boolean $$1) {
      this.f.b(new acn(this.dV(), $$0.ax_()));
      this.f.b(new aee($$0.ax_(), $$1));
   }

   private void gW() {
      this.dq = this.dq % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bve $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.bR != this.bQ) {
            this.o();
         }

         this.gW();
         cwb $$1 = $$0.createMenu(this.dq, this.gj(), this);
         if ($$1 == null) {
            if (this.ak()) {
               this.a(xg.c("container.spectatorCantOpen").a(o.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.f.b(new aed($$1.l, $$1.a(), $$0.P_()));
            this.a($$1);
            this.bR = $$1;
            return OptionalInt.of(this.dq);
         }
      }
   }

   @Override
   public void a(int $$0, djg $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.f.b(new ady($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(cme $$0, buv $$1) {
      if (this.bR != this.bQ) {
         this.o();
      }

      this.gW();
      int $$2 = $$0.ab_();
      this.f.b(new adn(this.dq, $$2, $$0.ao()));
      this.bR = new cxd(this.dq, this.gj(), $$1, $$0, $$2);
      this.a(this.bR);
   }

   @Override
   public void a(dak $$0, bvb $$1) {
      if ($$0.c(kl.V)) {
         if (ddu.a($$0, this.z(), this)) {
            this.bR.d();
         }

         this.f.b(new aec($$1));
      }
   }

   @Override
   public void a(dyz $$0) {
      this.f.b(acl.a($$0, dyo::e));
   }

   @Override
   public void o() {
      this.f.b(new acy(this.bR.l));
      this.p();
   }

   @Override
   public void p() {
      this.bR.a(this);
      this.bQ.a(this.bR);
      this.bR = this.bQ;
   }

   @Override
   public void q() {
      double $$0 = this.dA();
      double $$1 = this.dC();
      double $$2 = this.dG();
      super.q();
      this.q(this.dA() - $$0, this.dC() - $$1, this.dG() - $$2);
   }

   public void a(double $$0, double $$1, double $$2) {
      if (!this.bY() && !r($$0, $$1, $$2)) {
         if (this.cj()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(axi.C, $$3);
               this.G(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(axs.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(axi.w, $$4);
               this.G(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.bi()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(axi.s, $$5);
               this.G(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.k_()) {
            if ($$1 > 0.0) {
               this.a(axi.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aH()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.ci()) {
                  this.a(axi.r, $$6);
                  this.G(0.1F * (float)$$6 * 0.01F);
               } else if (this.ch()) {
                  this.a(axi.q, $$6);
                  this.G(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(axi.p, $$6);
                  this.G(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fJ()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(axi.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(axi.v, $$8);
            }
         }
      }
   }

   private void q(double $$0, double $$1, double $$2) {
      if (this.bY() && !r($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         bxe $$4 = this.dk();
         if ($$4 instanceof cuv) {
            this.a(axi.x, $$3);
         } else if ($$4 instanceof cut) {
            this.a(axi.y, $$3);
         } else if ($$4 instanceof ckq) {
            this.a(axi.z, $$3);
         } else if ($$4 instanceof cme) {
            this.a(axi.A, $$3);
         } else if ($$4 instanceof cpx) {
            this.a(axi.D, $$3);
         }
      }
   }

   private static boolean r(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(axf<?> $$0, int $$1) {
      this.cA.b(this, $$0, $$1);
      this.gA().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(axf<?> $$0) {
      this.cA.a(this, $$0, 0);
      this.gA().a($$0, this, fhf::c);
   }

   @Override
   public int a(Collection<dfg<?>> $$0) {
      return this.cR.a($$0, this);
   }

   @Override
   public void a(dfg<?> $$0, List<dak> $$1) {
      aq.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<alq<dfb<?>>> $$0) {
      List<dfg<?>> $$1 = $$0.stream().flatMap($$0x -> this.g.aI().b($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<dfg<?>> $$0) {
      return this.cR.b($$0, this);
   }

   @Override
   public void r() {
      super.r();
      this.a(axi.E);
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

   @Override
   public void s() {
      this.cU = true;
      this.bN();
      if (this.fR()) {
         this.a(true, false);
      }
   }

   public boolean t() {
      return this.cU;
   }

   public void u() {
      this.cH = -1.0E8F;
   }

   @Override
   public void a(xg $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void v() {
      if (!this.bm.f() && this.fz()) {
         this.f.b(new adi(this, (byte)9));
         super.v();
      }
   }

   @Override
   public void a(ew.a $$0, fgc $$1) {
      super.a($$0, $$1);
      this.f.b(new aen($$0, $$1.d, $$1.e, $$1.f));
   }

   public void a(ew.a $$0, bxe $$1, ew.a $$2) {
      fgc $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.f.b(new aen($$0, $$1, $$2));
   }

   public void a(asc $$0, boolean $$1) {
      this.dh = $$0.dh;
      this.do = $$0.do;
      this.h.a($$0.h.b(), $$0.h.c());
      this.w();
      if ($$1) {
         this.fa().b($$0.fa());
         this.fa().c($$0.fa());
         this.d($$0.eG());
         this.bS = $$0.bS;

         for (bwi $$2 : $$0.eD()) {
            this.a(new bwi($$2));
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
         if (this.x().O().c(dkf.e) || $$0.ak()) {
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
      this.k($$0.gC());
      this.l($$0.gD());
      this.a($$0.gJ());
   }

   @Override
   protected void a(bwi $$0, @Nullable bxe $$1) {
      super.a($$0, $$1);
      this.f.b(new agt(this.ao(), $$0, true));
      if ($$0.a(bwk.y)) {
         this.cT = this.af;
         this.cS = this.dt();
      }

      aq.B.a(this, $$1);
   }

   @Override
   protected void a(bwi $$0, boolean $$1, @Nullable bxe $$2) {
      super.a($$0, $$1, $$2);
      this.f.b(new agt(this.ao(), $$0, false));
      aq.B.a(this, $$2);
   }

   @Override
   protected void c(Collection<bwi> $$0) {
      super.c($$0);

      for (bwi $$1 : $$0) {
         this.f.b(new aev(this.ao(), $$1.c()));
         if ($$1.a(bwk.y)) {
            this.cS = null;
         }
      }

      aq.B.a(this, null);
   }

   @Override
   public void b(double $$0, double $$1, double $$2) {
      this.f.a(new bys(new fgc($$0, $$1, $$2), fgc.c, 0.0F, 0.0F), byt.a(byt.l, byt.k));
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.f.a(new bys(new fgc($$0, $$1, $$2), fgc.c, 0.0F, 0.0F), byt.j);
   }

   @Override
   public boolean a(asb $$0, double $$1, double $$2, double $$3, Set<byt> $$4, float $$5, float $$6, boolean $$7) {
      if (this.fR()) {
         this.a(true, true);
      }

      if ($$7) {
         this.d(this);
      }

      boolean $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$8) {
         this.r($$4.contains(byt.d) ? this.cA() + $$5 : $$5);
      }

      return $$8;
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      super.d($$0, $$1, $$2);
      this.f.l();
   }

   @Override
   public void b(bxe $$0) {
      this.x().m().a(this, new ach($$0, 4));
   }

   @Override
   public void c(bxe $$0) {
      this.x().m().a(this, new ach($$0, 5));
   }

   @Override
   public void w() {
      if (this.f != null) {
         this.f.b(new aeg(this.gk()));
         this.J();
      }
   }

   public asb x() {
      return (asb)this.dV();
   }

   public boolean a(dkg $$0) {
      boolean $$1 = this.ak();
      if (!this.h.a($$0)) {
         return false;
      } else {
         this.f.b(new adm(adm.e, (float)$$0.a()));
         if ($$0 == dkg.d) {
            this.gy();
            this.bO();
            dgz.a(this);
         } else {
            this.d(this);
            if ($$1) {
               dgz.a(this.x(), this);
            }
         }

         this.w();
         this.fx();
         return true;
      }
   }

   @Nonnull
   @Override
   public dkg a() {
      return this.h.b();
   }

   public ej y() {
      return this.dp;
   }

   public ek z() {
      return new ek(this.y(), this.dt(), this.bT(), this.x(), this.F(), this.ah().getString(), this.P_(), this.g, this);
   }

   public void a(xg $$0) {
      this.b($$0, false);
   }

   public void b(xg $$0, boolean $$1) {
      if (this.x($$1)) {
         this.f.a(new agj($$0, $$1), wl.a(() -> {
            if (this.x(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               xg $$3 = xg.b($$2).a(o.o);
               return new agj(xg.a("multiplayer.message_not_delivered", $$3).a(o.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(xv $$0, boolean $$1, xc.a $$2) {
      if (this.gX()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String A() {
      return this.f.m() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(arl $$0) {
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

   public arl B() {
      int $$0 = this.ar().a(bK);
      bxw $$1 = bxw.d.apply(this.ar().a(bL));
      return new arl(this.cW, this.cV, this.cL, this.cN, $$0, $$1, this.de, this.df, this.cM);
   }

   public boolean C() {
      return this.cN;
   }

   public csf D() {
      return this.cL;
   }

   private boolean x(boolean $$0) {
      return this.cL == csf.c ? $$0 : true;
   }

   private boolean gX() {
      return this.cL == csf.a;
   }

   public int E() {
      return this.cV;
   }

   public void a(ako $$0) {
      this.f.b(new afb($$0.a(), $$0.d().map(ako.a::a)));
   }

   @Override
   public int F() {
      return this.g.c(this.gi());
   }

   @Override
   public void G() {
      this.cO = ag.c();
   }

   public axe H() {
      return this.cA;
   }

   public axd I() {
      return this.cR;
   }

   @Override
   protected void J() {
      if (this.ak()) {
         this.eB();
         this.k(true);
      } else {
         super.J();
      }
   }

   public bxe K() {
      return (bxe)(this.cP == null ? this : this.cP);
   }

   @Override
   public void d(@Nullable bxe $$0) {
      bxe $$1 = this.K();
      this.cP = (bxe)($$0 == null ? this : $$0);
      if ($$1 != this.cP) {
         if (this.cP.dV() instanceof asb $$2) {
            this.a($$2, this.cP.dA(), this.cP.dC(), this.cP.dG(), Set.of(), this.dL(), this.dN(), false);
         }

         if ($$0 != null) {
            this.x().m().a(this);
         }

         this.f.b(new afi(this.cP));
         this.f.l();
      }
   }

   @Override
   protected void L() {
      if (!this.cQ) {
         super.L();
      }
   }

   @Override
   public void e(bxe $$0) {
      if (this.ak()) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long M() {
      return this.cO;
   }

   @Nullable
   public xg N() {
      return null;
   }

   public int O() {
      return 0;
   }

   @Override
   public void a(bvb $$0) {
      super.a($$0);
      this.gF();
   }

   public boolean P() {
      return this.cQ;
   }

   public void Q() {
      this.cQ = false;
   }

   public alz R() {
      return this.cz;
   }

   @Nullable
   public asc.a S() {
      return this.dc;
   }

   public void b(asc $$0) {
      this.a($$0.dc, false);
   }

   public void a(@Nullable asc.a $$0, boolean $$1) {
      if ($$1 && $$0 != null && !$$0.a(this.dc)) {
         this.a(cw);
      }

      this.dc = $$0;
   }

   public jz T() {
      return this.da;
   }

   public void a(jz $$0) {
      this.da = $$0;
   }

   public ark U() {
      return this.db;
   }

   public void a(ark $$0) {
      this.db = $$0;
   }

   @Override
   public void a(awx $$0, awz $$1, float $$2, float $$3) {
      this.f.b(new agg(mh.b.e($$0), $$1, this.dA(), this.dC(), this.dG(), $$2, $$3, this.ae.g()));
   }

   @Override
   public coo a(dak $$0, boolean $$1, boolean $$2) {
      coo $$3 = super.a($$0, $$1, $$2);
      if ($$2) {
         dak $$4 = $$3 != null ? $$3.e() : dak.l;
         if (!$$4.f()) {
            this.a(axi.f.b($$4.h()), $$0.M());
            this.a(axi.F);
         }
      }

      return $$3;
   }

   public atk V() {
      return this.dd;
   }

   public void a(asb $$0) {
      this.a((dkj)$$0);
      this.h.a($$0);
   }

   @Nullable
   private static dkg a(@Nullable ua $$0, String $$1) {
      return $$0 != null ? $$0.<dkg>a($$1, dkg.g).orElse(null) : null;
   }

   private dkg b(@Nullable dkg $$0) {
      dkg $$1 = this.g.bd();
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
      $$0.a("playerGameType", dkg.g, this.h.b());
      dkg $$1 = this.h.c();
      $$0.b("previousPlayerGameType", dkg.g, $$1);
   }

   @Override
   public boolean W() {
      return this.de;
   }

   public boolean c(asc $$0) {
      return $$0 == this ? false : this.de || $$0.de;
   }

   @Override
   public boolean c(asb $$0, iw $$1) {
      return super.c($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(dak $$0) {
      aq.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      csh $$1 = this.gj();
      dak $$2 = $$1.a($$0);
      this.bR.b($$1, $$1.f()).ifPresent($$1x -> this.bR.a($$1x, $$1.g()));
      return this.a($$2, false, true) != null;
   }

   @Override
   public void b(dak $$0) {
      if (!this.gj().g($$0)) {
         this.a($$0, false);
      }
   }

   public boolean X() {
      return this.df;
   }

   @Override
   public Optional<crn> Y() {
      return Optional.of(this.dh);
   }

   public void b(boolean $$0) {
      this.dg = $$0;
   }

   @Override
   public void a(coo $$0) {
      super.a($$0);
      bxe $$1 = $$0.p();
      if ($$1 != null) {
         aq.S.a(this, $$0.e(), $$1);
      }
   }

   public void a(xx $$0) {
      this.do = $$0;
   }

   @Nullable
   public xx Z() {
      return this.do != null && this.do.b() ? null : this.do;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cl = (float)(azz.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dL());
      this.f.b(new ado(this));
   }

   @Override
   public boolean a(bxe $$0, boolean $$1) {
      if (super.a($$0, $$1)) {
         $$0.j(this);
         this.f.a(new bys(this.dt(), fgc.c, 0.0F, 0.0F), byt.k);
         if ($$0 instanceof byf $$2) {
            this.g.ag().a($$2, this.f);
         }

         this.f.b(new afw($$0));
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void aa() {
      bxe $$0 = this.dk();
      super.aa();
      if ($$0 instanceof byf $$1) {
         for (bwi $$2 : $$1.eD()) {
            this.f.b(new aev($$0.ao(), $$2.c()));
         }
      }

      if ($$0 != null) {
         this.f.b(new afw($$0));
      }
   }

   public agv b(asb $$0) {
      return new agv($$0.ai(), $$0.aj(), dlo.a($$0.E()), this.h.b(), this.h.c(), $$0.ak(), $$0.D(), this.gJ(), this.az(), $$0.P());
   }

   @Override
   public void c(iw $$0) {
      this.di = $$0;
   }

   public void ab() {
      this.di = null;
   }

   @Nullable
   public iw ac() {
      return this.di;
   }

   @Override
   public fgc ad() {
      bxe $$0 = this.dk();
      return $$0 != null && $$0.cW() != this ? $$0.ad() : this.dj;
   }

   public void a(fgc $$0) {
      this.dj = $$0;
   }

   @Override
   protected float a(bxe $$0, float $$1, bvt $$2) {
      return dgz.a(this.x(), this.dZ(), $$0, $$2, $$1);
   }

   @Override
   public void a(dag $$0, bxo $$1) {
      super.a($$0, $$1);
      this.b(axi.d.b($$0));
   }

   public csg ae() {
      return this.dk;
   }

   public void a(csg $$0) {
      this.dk = $$0;
   }

   public fgc af() {
      float $$0 = this.dk.c() == this.dk.d() ? 0.0F : (this.dk.c() ? 1.0F : -1.0F);
      float $$1 = this.dk.a() == this.dk.b() ? 0.0F : (this.dk.a() ? 1.0F : -1.0F);
      return a(new fgc((double)$$0, 0.0, (double)$$1), 1.0F, this.dL());
   }

   public void a(ctn $$0) {
      this.dl.add($$0);
   }

   public void b(ctn $$0) {
      this.dl.remove($$0);
   }

   public Set<ctn> ag() {
      return this.dl;
   }

   public long c(ctn $$0) {
      if ($$0.dV() instanceof asb $$1) {
         djo $$2 = $$0.dx();
         this.a($$0);
         $$1.i();
         return a($$1, $$2) - 1L;
      } else {
         return 0L;
      }
   }

   public static long a(asb $$0, djo $$1) {
      $$0.m().a(asi.h, $$1, 2);
      return asi.h.d();
   }

   public static record a(alq<dkj> b, iw c, float d, boolean e) {
      public static final Codec<asc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dkj.h.optionalFieldOf("dimension", dkj.i).forGetter(asc.a::a),
                  iw.a.fieldOf("pos").forGetter(asc.a::b),
                  Codec.FLOAT.optionalFieldOf("angle", 0.0F).forGetter(asc.a::c),
                  Codec.BOOL.optionalFieldOf("forced", false).forGetter(asc.a::d)
               )
               .apply($$0, asc.a::new)
      );

      static alq<dkj> b(@Nullable asc.a $$0) {
         return $$0 != null ? $$0.a() : dkj.i;
      }

      public boolean a(@Nullable asc.a $$0) {
         return $$0 != null && this.b == $$0.b && this.c.equals($$0.c);
      }

      public alq<dkj> a() {
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

   static record b(fgc a, float b) {
      public static asc.b a(fgc $$0, iw $$1) {
         return new asc.b($$0, b($$0, $$1));
      }

      private static float b(fgc $$0, iw $$1) {
         fgc $$2 = fgc.c($$1).d($$0).d();
         return (float)azz.d(azz.d($$2.f, $$2.d) * 180.0F / (float)Math.PI - 90.0);
      }
   }
}
