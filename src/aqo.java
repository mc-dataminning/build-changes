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
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class aqo extends cly {
   private static final Logger cz = LogUtils.getLogger();
   private static final int cA = 32;
   private static final int cB = 10;
   private static final int cC = 25;
   public static final double b = 1.0;
   private static final btw cD = new btw(UUID.fromString("736565d2-e1a7-403d-a3f8-1aeb3e302542"), "Creative block interaction range modifier", 0.5, btw.a.a);
   private static final btw cE = new btw(UUID.fromString("98491ef6-97b1-4584-ae82-71a8cc85cf73"), "Creative entity interaction range modifier", 2.0, btw.a.a);
   public arn c;
   public final MinecraftServer d;
   public final aqp e;
   private final akv cF;
   private final avo cG;
   private float cH = Float.MIN_VALUE;
   private int cI = Integer.MIN_VALUE;
   private int cJ = Integer.MIN_VALUE;
   private int cK = Integer.MIN_VALUE;
   private int cL = Integer.MIN_VALUE;
   private int cM = Integer.MIN_VALUE;
   private float cN = -1.0E8F;
   private int cO = -99999999;
   private boolean cP = true;
   private int cQ = -99999999;
   private int cR = 60;
   private clw cS = clw.a;
   private boolean cT = true;
   private long cU = ac.c();
   @Nullable
   private brw cV;
   private boolean cW;
   private boolean cX;
   private final avn cY = new avn();
   @Nullable
   private eum cZ;
   private int da;
   private boolean db;
   private int dc = 2;
   private String dd = "en_us";
   @Nullable
   private eum de;
   @Nullable
   private eum df;
   @Nullable
   private eum dg;
   private jq dh = jq.a(0, 0, 0);
   private aqb di = aqb.a;
   private akm<daz> dj = daz.h;
   @Nullable
   private io dk;
   private boolean dl;
   private float dm;
   private final ars dn;
   private boolean do;
   private boolean dp;
   private boolean dq;
   private cle dr = new cle(0, 0, 0);
   @Nullable
   private io ds;
   private final cpi dt = new cpi() {
      @Override
      public void a(cov $$0, jg<ctq> $$1, ctq $$2, int[] $$3) {
         aqo.this.c.b(new acl($$0.j, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cov $$0, int $$1, ctq $$2) {
         aqo.this.c.b(new acn($$0.j, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cov $$0, ctq $$1) {
         aqo.this.c.b(new acn(-1, $$0.k(), -1, $$1));
      }

      @Override
      public void a(cov $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cov $$0, int $$1, int $$2) {
         aqo.this.c.b(new acm($$0.j, $$1, $$2));
      }
   };
   private final cph du = new cph() {
      @Override
      public void a(cov $$0, int $$1, ctq $$2) {
         cqq $$3 = $$0.b($$1);
         if (!($$3 instanceof cqm)) {
            if ($$3.c == aqo.this.gc()) {
               am.f.a(aqo.this, aqo.this.gc(), $$2);
            }
         }
      }

      @Override
      public void a(cov $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private xo dv;
   @Nullable
   public final Object f;
   private int dw;
   public boolean g;

   public aqo(MinecraftServer $$0, aqn $$1, GameProfile $$2, aqc $$3) {
      super($$1, $$1.U(), $$1.V(), $$2);
      this.dn = $$0.a(this);
      this.e = $$0.b(this);
      this.d = $$0;
      this.cG = $$0.ah().a((cly)this);
      this.cF = $$0.ah().f(this);
      this.e($$1);
      this.a($$3);
      this.f = null;
   }

   private void e(aqn $$0) {
      io $$1 = $$0.U();
      if ($$0.D_().g() && $$0.o().bb().k() != daw.c) {
         int $$2 = Math.max(0, this.d.a($$0));
         int $$3 = ayf.a($$0.C_().b((double)$$1.u(), (double)$$1.w()));
         if ($$3 < $$2) {
            $$2 = $$3;
         }

         if ($$3 <= 1) {
            $$2 = 1;
         }

         long $$4 = (long)($$2 * 2 + 1);
         long $$5 = $$4 * $$4;
         int $$6 = $$5 > 2147483647L ? Integer.MAX_VALUE : (int)$$5;
         int $$7 = this.v($$6);
         int $$8 = aym.a().a($$6);

         for (int $$9 = 0; $$9 < $$6; $$9++) {
            int $$10 = ($$8 + $$7 * $$9) % $$6;
            int $$11 = $$10 % ($$2 * 2 + 1);
            int $$12 = $$10 / ($$2 * 2 + 1);
            io $$13 = aqi.a($$0, $$1.u() + $$11 - $$2, $$1.w() + $$12 - $$2);
            if ($$13 != null) {
               this.a($$13, 0.0F, 0.0F);
               if ($$0.g(this)) {
                  break;
               }
            }
         }
      } else {
         this.a($$1, 0.0F, 0.0F);

         while (!$$0.g(this) && this.dw() < (double)($$0.al() - 1)) {
            this.a_(this.du(), this.dw() + 1.0, this.dA());
         }
      }
   }

   private int v(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         cle.a.parse(new Dynamic(ur.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(cz::error).ifPresent($$0x -> this.dr = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         ud $$1 = $$0.p("enteredNetherPosition");
         this.df = new eum($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.cX = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cY.a($$0.p("recipeBook"), this.d.aJ());
      }

      if (this.fL()) {
         this.fM();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.dk = new io($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.dl = $$0.q("SpawnForced");
         this.dm = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.dj = daz.g.parse(ur.a, $$0.c("SpawnDimension")).resultOrPartial(cz::error).orElse(daz.h);
         }
      }

      this.dq = $$0.q("spawn_extra_particles_on_fall");
      io.a.parse(ur.a, $$0.c("raid_omen_position")).resultOrPartial(cz::error).ifPresent($$0x -> this.ds = $$0x);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      cle.a.encodeStart(ur.a, this.dr).resultOrPartial(cz::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.cX);
      if (this.df != null) {
         ud $$1 = new ud();
         $$1.a("x", this.df.c);
         $$1.a("y", this.df.d);
         $$1.a("z", this.df.e);
         $$0.a("enteredNetherPosition", $$1);
      }

      brw $$2 = this.cZ();
      brw $$3 = this.dc();
      if ($$3 != null && $$2 != this && $$2.cY()) {
         ud $$4 = new ud();
         ud $$5 = new ud();
         $$2.e($$5);
         $$4.a("Attach", $$3.cz());
         $$4.a("Entity", $$5);
         $$0.a("RootVehicle", $$4);
      }

      $$0.a("recipeBook", this.cY.b());
      $$0.a("Dimension", this.dP().ae().a().toString());
      if (this.dk != null) {
         $$0.a("SpawnX", this.dk.u());
         $$0.a("SpawnY", this.dk.v());
         $$0.a("SpawnZ", this.dk.w());
         $$0.a("SpawnForced", this.dl);
         $$0.a("SpawnAngle", this.dm);
         akn.a.encodeStart(ur.a, this.dj.a()).resultOrPartial(cz::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }

      $$0.a("spawn_extra_particles_on_fall", this.dq);
      if (this.ds != null) {
         io.a.encodeStart(ur.a, this.ds).resultOrPartial(cz::error).ifPresent($$1 -> $$0.a("raid_omen_position", $$1));
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gl();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.cq = ayf.a((float)$$0 / $$1, 0.0F, $$2);
      this.cQ = -1;
   }

   public void b(int $$0) {
      this.co = $$0;
      this.cQ = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cQ = -1;
   }

   @Override
   public void a(ctq $$0, int $$1) {
      super.a($$0, $$1);
      this.cQ = -1;
   }

   private void a(cov $$0) {
      $$0.a(this.du);
      $$0.a(this.dt);
   }

   public void h() {
      this.a(this.ca);
   }

   @Override
   public void f_() {
      super.f_();
      this.c.b(adt.a);
   }

   @Override
   public void g_() {
      super.g_();
      this.c.b(new ads(this.eP()));
   }

   @Override
   protected void a(drd $$0) {
      am.e.a(this, $$0);
   }

   @Override
   protected ctm k() {
      return new cuo(this);
   }

   @Override
   public void l() {
      this.e.a();
      this.dr.a();
      this.cR--;
      if (this.am > 0) {
         this.am--;
      }

      this.cb.d();
      if (!this.dP().B && !this.cb.a(this)) {
         this.r();
         this.cb = this.ca;
      }

      brw $$0 = this.K();
      if ($$0 != this) {
         if ($$0.bD()) {
            this.a($$0.du(), $$0.dw(), $$0.dA(), $$0.dF(), $$0.dH());
            this.z().l().a(this);
            if (this.fS()) {
               this.d(this);
            }
         } else {
            this.d(this);
         }
      }

      am.x.a(this);
      if (this.cZ != null) {
         am.v.a(this, this.cZ, this.ai - this.da);
      }

      this.o();
      this.p();
      this.gF();
      this.cF.b(this);
   }

   private void gF() {
      btu $$0 = this.f(bty.g);
      if ($$0 != null) {
         if (this.f()) {
            $$0.b(cD);
         } else {
            $$0.e(cD);
         }
      }

      btu $$1 = this.f(bty.h);
      if ($$1 != null) {
         if (this.f()) {
            $$1.b(cE);
         } else {
            $$1.e(cE);
         }
      }
   }

   public void m() {
      try {
         if (!this.N_() || !this.dh()) {
            super.l();
         }

         for (int $$0 = 0; $$0 < this.gc().b(); $$0++) {
            ctq $$1 = this.gc().a($$0);
            if ($$1.g().ak_()) {
               ze<?> $$2 = ((csa)$$1.g()).a($$1, this.dP(), this);
               if ($$2 != null) {
                  this.c.b($$2);
               }
            }
         }

         if (this.eA() != this.cN || this.cO != this.cc.a() || this.cc.e() == 0.0F != this.cP) {
            this.c.b(new afa(this.eA(), this.cc.a(), this.cc.e()));
            this.cN = this.eA();
            this.cO = this.cc.a();
            this.cP = this.cc.e() == 0.0F;
         }

         if (this.eA() + this.fs() != this.cH) {
            this.cH = this.eA() + this.fs();
            this.a(evt.g, ayf.f(this.cH));
         }

         if (this.cc.a() != this.cI) {
            this.cI = this.cc.a();
            this.a(evt.h, ayf.f((float)this.cI));
         }

         if (this.cl() != this.cJ) {
            this.cJ = this.cl();
            this.a(evt.i, ayf.f((float)this.cJ));
         }

         if (this.eO() != this.cK) {
            this.cK = this.eO();
            this.a(evt.j, ayf.f((float)this.cK));
         }

         if (this.cp != this.cM) {
            this.cM = this.cp;
            this.a(evt.k, ayf.f((float)this.cM));
         }

         if (this.co != this.cL) {
            this.cL = this.co;
            this.a(evt.l, ayf.f((float)this.cL));
         }

         if (this.cp != this.cQ) {
            this.cQ = this.cp;
            this.c.b(new aez(this.cq, this.cp, this.co));
         }

         if (this.ai % 20 == 0) {
            am.q.a(this);
         }
      } catch (Throwable var4) {
         o $$4 = o.a(var4, "Ticking player");
         p $$5 = $$4.a("Player being ticked");
         this.a($$5);
         throw new y($$4);
      }
   }

   @Override
   public void n() {
      if (this.eA() > 0.0F && this.de != null) {
         am.X.a(this, this.de);
      }

      this.de = null;
      super.n();
   }

   public void o() {
      if (this.ac > 0.0F && this.de == null) {
         this.de = this.dn();
         if (this.cv != null) {
            am.ae.a(this, this.cv, this.cw);
         }
      }
   }

   public void p() {
      if (this.dc() != null && this.dc().bs()) {
         if (this.dg == null) {
            this.dg = this.dn();
         } else {
            am.Y.a(this, this.dg);
         }
      }

      if (this.dg != null && (this.dc() == null || !this.dc().bs())) {
         this.dg = null;
      }
   }

   private void a(evt $$0, int $$1) {
      this.gr().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(bqp $$0) {
      this.a(dvw.p);
      boolean $$1 = this.dP().aa().b(dav.n);
      if ($$1) {
         wx $$2 = this.eP().a();
         this.c.a(new adu(this.al(), $$2), we.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            wx $$3x = wx.a("death.attack.message_too_long", wx.b($$2x).a(n.o));
            wx $$4x = wx.a("death.attack.even_more_magic", this.O_()).a($$1xx -> $$1xx.a(new xd(xd.a.a, $$3x)));
            return new adu(this.al(), $$4x);
         }));
         evs $$3 = this.cj();
         if ($$3 == null || $$3.k() == evs.b.a) {
            this.d.ah().a($$2, false);
         } else if ($$3.k() == evs.b.c) {
            this.d.ah().a(this, $$2);
         } else if ($$3.k() == evs.b.d) {
            this.d.ah().b(this, $$2);
         }
      } else {
         this.c.b(new adu(this.al(), ww.a));
      }

      this.gq();
      if (this.dP().aa().b(dav.N)) {
         this.gG();
      }

      if (!this.N_()) {
         this.g($$0);
      }

      this.gr().a(evt.d, this, evo::b);
      bsq $$4 = this.eQ();
      if ($$4 != null) {
         this.b(avs.h.b($$4.ak()));
         $$4.a(this, this.bl, $$0);
         this.f($$4);
      }

      this.dP().a(this, (byte)3);
      this.a(avs.N);
      this.a(avs.i.b(avs.m));
      this.a(avs.i.b(avs.n));
      this.aC();
      this.l(0);
      this.c(false);
      this.eP().c();
      this.a(Optional.of(iw.a(this.dP().ae(), this.dp())));
   }

   private void gG() {
      euh $$0 = new euh(this.dp()).c(32.0, 10.0, 32.0);
      this.dP().a(bss.class, $$0, bsb.f).stream().filter($$0x -> $$0x instanceof bsw).forEach($$0x -> ((bsw)$$0x).a_((cly)this));
   }

   @Override
   public void a(brw $$0, int $$1, bqp $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.t($$1);
         this.gr().a(evt.f, this, evo::b);
         if ($$0 instanceof cly) {
            this.a(avs.Q);
            this.gr().a(evt.e, this, evo::b);
         } else {
            this.a(avs.O);
         }

         this.a(this, $$0, evt.m);
         this.a($$0, this, evt.n);
         am.c.a(this, $$0, $$2);
      }
   }

   private void a(evp $$0, evp $$1, evt[] $$2) {
      evl $$3 = this.gr().e($$1.cB());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gr().a($$2[$$4], $$0, evo::b);
         }
      }
   }

   @Override
   public boolean a(bqp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.d.n() && this.gH() && $$0.a(avz.n);
         if (!$$2 && this.cR > 0 && !$$0.a(avz.e)) {
            return false;
         } else {
            brw $$3 = $$0.d();
            if ($$3 instanceof cly $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof cme $$5 && $$5.s() instanceof cly $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(cly $$0) {
      return !this.gH() ? false : super.a($$0);
   }

   private boolean gH() {
      return this.d.ad();
   }

   @Nullable
   @Override
   protected env a(aqn $$0) {
      env $$1 = super.a($$0);
      if ($$1 != null && this.dP().ae() == daz.h && $$0.ae() == daz.j) {
         eum $$2 = $$1.a.b(0.0, -1.0, 0.0);
         return new env($$2, eum.b, 90.0F, 0.0F);
      } else {
         return $$1;
      }
   }

   @Nullable
   @Override
   public brw b(aqn $$0) {
      this.cW = true;
      aqn $$1 = this.z();
      akm<daz> $$2 = $$1.ae();
      if ($$2 == daz.j && $$0.ae() == daz.h) {
         this.ai();
         this.z().a(this, brw.c.e);
         if (!this.g) {
            this.g = true;
            this.c.b(new acx(acx.f, this.cX ? 0.0F : 1.0F));
            this.cX = true;
         }

         return this;
      } else {
         eot $$3 = $$0.A_();
         this.c.b(new aee(this.d($$0), (byte)3));
         this.c.b(new acd($$3.q(), $$3.r()));
         auk $$4 = this.d.ah();
         $$4.d(this);
         $$1.a(this, brw.c.e);
         this.dM();
         env $$5 = this.a($$0);
         if ($$5 != null) {
            $$1.af().a("moving");
            if ($$2 == daz.h && $$0.ae() == daz.i) {
               this.df = this.dn();
            } else if ($$0.ae() == daz.j) {
               this.a($$0, io.a($$5.a));
            }

            $$1.af().c();
            $$1.af().a("placing");
            this.c($$0);
            this.c.a($$5.a.c, $$5.a.d, $$5.a.e, $$5.c, $$5.d);
            this.c.m();
            $$0.b(this);
            $$1.af().c();
            this.f($$1);
            this.c.b(new adq(this.gd()));
            $$4.a(this, $$0);
            $$4.e(this);

            for (bre $$6 : this.ex()) {
               this.c.b(new afx(this.al(), $$6, false));
            }

            this.c.b(new add(1032, io.c, 0, false));
            this.cQ = -1;
            this.cN = -1.0F;
            this.cO = -1;
         }

         return this;
      }
   }

   private void a(aqn $$0, io $$1) {
      io.a $$2 = $$1.j();

      for (int $$3 = -2; $$3 <= 2; $$3++) {
         for (int $$4 = -2; $$4 <= 2; $$4++) {
            for (int $$5 = -1; $$5 < 3; $$5++) {
               drd $$6 = $$5 == -1 ? dec.co.n() : dec.a.n();
               $$0.b($$2.g($$1).e($$4, $$5, $$3), $$6);
            }
         }
      }
   }

   @Override
   protected Optional<l.a> a(aqn $$0, io $$1, boolean $$2, dsu $$3) {
      Optional<l.a> $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         it.a $$5 = this.dP().a_(this.ay).d(dje.b).orElse(it.a.a);
         Optional<l.a> $$6 = $$0.p().a($$1, $$5);
         if ($$6.isEmpty()) {
            cz.error("Unable to create a portal, likely target out of worldborder");
         }

         return $$6;
      }
   }

   private void f(aqn $$0) {
      akm<daz> $$1 = $$0.ae();
      akm<daz> $$2 = this.dP().ae();
      am.w.a(this, $$1, $$2);
      if ($$1 == daz.i && $$2 == daz.h && this.df != null) {
         am.D.a(this, this.df);
      }

      if ($$2 != daz.i) {
         this.df = null;
      }
   }

   @Override
   public boolean a(aqo $$0) {
      if ($$0.N_()) {
         return this.K() == this;
      } else {
         return this.N_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(brw $$0, int $$1) {
      super.a($$0, $$1);
      this.cb.d();
   }

   @Override
   public Either<cly.a, azh> a(io $$0) {
      it $$1 = this.dP().a_($$0).c(dhw.aE);
      if (this.fL() || !this.bD()) {
         return Either.left(cly.a.e);
      } else if (!this.dP().D_().j()) {
         return Either.left(cly.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cly.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cly.a.d);
      } else {
         this.a(this.dP().ae(), $$0, this.dF(), false, true);
         if (this.dP().Q()) {
            return Either.left(cly.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               eum $$4 = eum.c($$0);
               List<cje> $$5 = this.dP()
                  .a(cje.class, new euh($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.f(this));
               if (!$$5.isEmpty()) {
                  return Either.left(cly.a.f);
               }
            }

            Either<cly.a, azh> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(avs.ap);
               am.r.a(this);
            });
            if (!this.z().d()) {
               this.a(wx.c("sleep.not_possible"), true);
            }

            ((aqn)this.dP()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(io $$0) {
      this.a(avs.i.b(avs.n));
      super.b($$0);
   }

   private boolean a(io $$0, it $$1) {
      return this.j($$0) || this.j($$0.a($$1.g()));
   }

   private boolean j(io $$0) {
      eum $$1 = eum.c($$0);
      return Math.abs(this.du() - $$1.a()) <= 3.0 && Math.abs(this.dw() - $$1.b()) <= 2.0 && Math.abs(this.dA() - $$1.c()) <= 3.0;
   }

   private boolean b(io $$0, it $$1) {
      io $$2 = $$0.c();
      return !this.i($$2) || !this.i($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fL()) {
         this.z().l().a(this, new abt(this, 2));
      }

      super.a($$0, $$1);
      if (this.c != null) {
         this.c.a(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.bI();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public boolean b(bqp $$0) {
      return super.b($$0) || this.O();
   }

   @Override
   protected void a(double $$0, boolean $$1, drd $$2, io $$3) {
   }

   @Override
   protected void c(io $$0) {
      if (!this.N_()) {
         super.c($$0);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.dh()) {
         this.b($$3, new eum($$0, $$1, $$2));
         io $$4 = this.aJ();
         drd $$5 = this.dP().a_($$4);
         if (this.dq && $$3 && this.ac > 0.0F) {
            eum $$6 = $$4.b().b(0.0, 0.5, 0.0);
            int $$7 = (int)(50.0F * this.ac);
            this.z().a(new kp(ky.b, $$5), $$6.c, $$6.d, $$6.e, $$7, 0.3F, 0.3F, 0.3F, 0.15F);
            this.dq = false;
         }

         super.a($$1, $$3, $$5, $$4);
      }
   }

   @Override
   public void a(@Nullable brw $$0) {
      super.a($$0);
      this.cv = this.dn();
      this.cw = $$0;
      this.cx = $$0 != null && $$0.ak() == bsc.bn;
   }

   @Override
   protected void q() {
      if (this.dP().s().i()) {
         super.q();
      }
   }

   @Override
   public void a(dps $$0, boolean $$1) {
      this.c.b(new abz(this.dP(), $$0.aA_()));
      this.c.b(new ado($$0.aA_(), $$1));
   }

   private void gI() {
      this.dw = this.dw % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bqa $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.cb != this.ca) {
            this.r();
         }

         this.gI();
         cov $$1 = $$0.createMenu(this.dw, this.gc(), this);
         if ($$1 == null) {
            if (this.N_()) {
               this.a(wx.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.c.b(new adn($$1.j, $$1.a(), $$0.O_()));
            this.a($$1);
            this.cb = $$1;
            return OptionalInt.of(this.dw);
         }
      }
   }

   @Override
   public void a(int $$0, czy $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.c.b(new adj($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(cgk $$0, bpp $$1) {
      if (this.cb != this.ca) {
         this.r();
      }

      this.gI();
      this.c.b(new acy(this.dw, $$1.b(), $$0.al()));
      this.cb = new cpv(this.dw, this.gc(), $$1, $$0);
      this.a(this.cb);
   }

   @Override
   public void a(ctq $$0, bpv $$1) {
      if ($$0.a(ctt.ua)) {
         if (cvo.a($$0, this.dg(), this)) {
            this.cb.d();
         }

         this.c.b(new adm($$1));
      }
   }

   @Override
   public void a(dos $$0) {
      this.c.b(abx.a($$0, doi::e));
   }

   @Override
   public void r() {
      this.c.b(new ack(this.cb.j));
      this.s();
   }

   @Override
   public void s() {
      this.cb.b(this);
      this.ca.a(this.cb);
      this.cb = this.ca;
   }

   public void a(float $$0, float $$1, boolean $$2, boolean $$3) {
      if (this.bR()) {
         if ($$0 >= -1.0F && $$0 <= 1.0F) {
            this.bo = $$0;
         }

         if ($$1 >= -1.0F && $$1 <= 1.0F) {
            this.bq = $$1;
         }

         this.bn = $$2;
         this.g($$3);
      }
   }

   @Override
   public void a(eum $$0) {
      double $$1 = this.du();
      double $$2 = this.dw();
      double $$3 = this.dA();
      super.a($$0);
      this.b(this.du() - $$1, this.dw() - $$2, this.dA() - $$3);
   }

   @Override
   public void t() {
      double $$0 = this.du();
      double $$1 = this.dw();
      double $$2 = this.dA();
      super.t();
      this.r(this.du() - $$0, this.dw() - $$1, this.dA() - $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (!this.bR() && !s($$0, $$1, $$2)) {
         if (this.cc()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(avs.C, $$3);
               this.C(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(awc.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(avs.w, $$4);
               this.C(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.be()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(avs.s, $$5);
               this.C(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.q_()) {
            if ($$1 > 0.0) {
               this.a(avs.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aE()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.cb()) {
                  this.a(avs.r, $$6);
                  this.C(0.1F * (float)$$6 * 0.01F);
               } else if (this.ca()) {
                  this.a(avs.q, $$6);
                  this.C(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(avs.p, $$6);
                  this.C(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fE()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(avs.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(avs.v, $$8);
            }
         }
      }
   }

   private void r(double $$0, double $$1, double $$2) {
      if (this.bR() && !s($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         brw $$4 = this.dc();
         if ($$4 instanceof cnt) {
            this.a(avs.x, $$3);
         } else if ($$4 instanceof cnv) {
            this.a(avs.y, $$3);
         } else if ($$4 instanceof cex) {
            this.a(avs.z, $$3);
         } else if ($$4 instanceof cgk) {
            this.a(avs.A, $$3);
         } else if ($$4 instanceof cjr) {
            this.a(avs.D, $$3);
         }
      }
   }

   private static boolean s(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(avp<?> $$0, int $$1) {
      this.cG.b(this, $$0, $$1);
      this.gr().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(avp<?> $$0) {
      this.cG.a(this, $$0, 0);
      this.gr().a($$0, this, evo::c);
   }

   @Override
   public int a(Collection<cxy<?>> $$0) {
      return this.cY.a($$0, this);
   }

   @Override
   public void a(cxy<?> $$0, List<ctq> $$1) {
      am.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<akn> $$0) {
      List<cxy<?>> $$1 = $$0.stream().flatMap($$0x -> this.d.aJ().a($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<cxy<?>> $$0) {
      return this.cY.b($$0, this);
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cQ = -1;
   }

   @Override
   public void u() {
      this.db = true;
      this.bH();
      if (this.fL()) {
         this.a(true, false);
      }
   }

   public boolean v() {
      return this.db;
   }

   public void w() {
      this.cN = -1.0E8F;
   }

   @Override
   public void a(wx $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void x() {
      if (!this.bz.e() && this.fv()) {
         this.c.b(new acu(this, (byte)9));
         super.x();
      }
   }

   @Override
   public void a(eq.a $$0, eum $$1) {
      super.a($$0, $$1);
      this.c.b(new adx($$0, $$1.c, $$1.d, $$1.e));
   }

   public void a(eq.a $$0, brw $$1, eq.a $$2) {
      eum $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.c.b(new adx($$0, $$1, $$2));
   }

   public void a(aqo $$0, boolean $$1) {
      this.dr = $$0.dr;
      this.dv = $$0.dv;
      this.e.a($$0.e.b(), $$0.e.c());
      this.y();
      if ($$1) {
         this.gc().a($$0.gc());
         this.t($$0.eA());
         this.cc = $$0.cc;
         this.co = $$0.co;
         this.cp = $$0.cp;
         this.cq = $$0.cq;
         this.s($$0.fW());
         this.ay = $$0.ay;
      } else if (this.dP().aa().b(dav.d) || $$0.N_()) {
         this.gc().a($$0.gc());
         this.co = $$0.co;
         this.cp = $$0.cp;
         this.cq = $$0.cq;
         this.s($$0.fW());
      }

      this.cr = $$0.cr;
      this.bZ = $$0.bZ;
      this.ap().a(bV, $$0.ap().a(bV));
      this.cQ = -1;
      this.cN = -1.0F;
      this.cO = -1;
      this.cY.a($$0.cY);
      this.cX = $$0.cX;
      this.df = $$0.df;
      this.di = $$0.di;
      this.i($$0.gt());
      this.j($$0.gu());
      this.a($$0.gB());
   }

   @Override
   protected void a(bre $$0, @Nullable brw $$1) {
      super.a($$0, $$1);
      this.c.b(new afx(this.al(), $$0, true));
      if ($$0.a(brg.y)) {
         this.da = this.ai;
         this.cZ = this.dn();
      }

      am.B.a(this, $$1);
   }

   @Override
   protected void a(bre $$0, boolean $$1, @Nullable brw $$2) {
      super.a($$0, $$1, $$2);
      this.c.b(new afx(this.al(), $$0, false));
      am.B.a(this, $$2);
   }

   @Override
   protected void a(bre $$0) {
      super.a($$0);
      this.c.b(new aec(this.al(), $$0.c()));
      if ($$0.a(brg.y)) {
         this.cZ = null;
      }

      am.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.c.a($$0, $$1, $$2, this.dF(), this.dH(), bte.g);
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.c.a(this.du() + $$0, this.dw() + $$1, this.dA() + $$2, this.dF(), this.dH(), bte.f);
   }

   @Override
   public boolean a(aqn $$0, double $$1, double $$2, double $$3, Set<bte> $$4, float $$5, float $$6) {
      dag $$7 = new dag(io.a($$1, $$2, $$3));
      $$0.l().a(aqs.g, $$7, 1, this.al());
      this.ac();
      if (this.fL()) {
         this.a(true, true);
      }

      if ($$0 == this.dP()) {
         this.c.a($$1, $$2, $$3, $$5, $$6, $$4);
      } else {
         this.a($$0, $$1, $$2, $$3, $$5, $$6);
      }

      this.n($$5);
      return true;
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      super.e($$0, $$1, $$2);
      this.c.m();
   }

   @Override
   public void b(brw $$0) {
      this.z().l().a(this, new abt($$0, 4));
   }

   @Override
   public void c(brw $$0) {
      this.z().l().a(this, new abt($$0, 5));
   }

   @Override
   public void y() {
      if (this.c != null) {
         this.c.b(new adq(this.gd()));
         this.J();
      }
   }

   public aqn z() {
      return (aqn)this.dP();
   }

   public boolean a(daw $$0) {
      if (!this.e.a($$0)) {
         return false;
      } else {
         this.c.b(new acx(acx.e, (float)$$0.a()));
         if ($$0 == daw.d) {
            this.gq();
            this.ac();
         } else {
            this.d(this);
         }

         this.y();
         this.ft();
         return true;
      }
   }

   @Override
   public boolean N_() {
      return this.e.b() == daw.d;
   }

   @Override
   public boolean f() {
      return this.e.b() == daw.b;
   }

   @Override
   public void a(wx $$0) {
      this.b($$0, false);
   }

   public void b(wx $$0, boolean $$1) {
      if (this.v($$1)) {
         this.c.a(new afo($$0, $$1), we.a(() -> {
            if (this.v(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               wx $$3 = wx.b($$2).a(n.o);
               return new afo(wx.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(xm $$0, boolean $$1, wt.a $$2) {
      if (this.gJ()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String A() {
      return this.c.n() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(aqc $$0) {
      this.dd = $$0.b();
      this.dc = $$0.c();
      this.cS = $$0.d();
      this.cT = $$0.e();
      this.do = $$0.h();
      this.dp = $$0.i();
      this.ap().a(bV, (byte)$$0.f());
      this.ap().a(bW, (byte)$$0.g().a());
   }

   public aqc B() {
      int $$0 = this.ap().a(bV);
      bsk $$1 = bsk.d.apply(this.ap().a(bW));
      return new aqc(this.dd, this.dc, this.cS, this.cT, $$0, $$1, this.do, this.dp);
   }

   public boolean C() {
      return this.cT;
   }

   public clw D() {
      return this.cS;
   }

   private boolean v(boolean $$0) {
      return this.cS == clw.c ? $$0 : true;
   }

   private boolean gJ() {
      return this.cS == clw.a;
   }

   public int E() {
      return this.dc;
   }

   public void a(ajm $$0) {
      this.c.b(new aei($$0.a(), $$0.d().map(ajm.a::a)));
   }

   @Override
   protected int F() {
      return this.d.c(this.gb());
   }

   @Override
   public void G() {
      this.cU = ac.c();
   }

   public avo H() {
      return this.cG;
   }

   public avn I() {
      return this.cY;
   }

   @Override
   protected void J() {
      if (this.N_()) {
         this.ev();
         this.k(true);
      } else {
         super.J();
      }
   }

   public brw K() {
      return (brw)(this.cV == null ? this : this.cV);
   }

   @Override
   public void d(@Nullable brw $$0) {
      brw $$1 = this.K();
      this.cV = (brw)($$0 == null ? this : $$0);
      if ($$1 != this.cV) {
         if (this.cV.dP() instanceof aqn $$2) {
            this.a($$2, this.cV.du(), this.cV.dw(), this.cV.dA(), Set.of(), this.dF(), this.dH());
         }

         if ($$0 != null) {
            this.z().l().a(this);
         }

         this.c.b(new aep(this.cV));
         this.c.m();
      }
   }

   @Override
   protected void L() {
      if (!this.cW) {
         super.L();
      }
   }

   @Override
   public void e(brw $$0) {
      if (this.e.b() == daw.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long M() {
      return this.cU;
   }

   @Nullable
   public wx N() {
      return null;
   }

   @Override
   public void a(bpv $$0) {
      super.a($$0);
      this.gw();
   }

   public boolean O() {
      return this.cW;
   }

   public void P() {
      this.cW = false;
   }

   public akv Q() {
      return this.cF;
   }

   public void a(aqn $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      this.d(this);
      this.ac();
      if ($$0 == this.dP()) {
         this.c.a($$1, $$2, $$3, $$4, $$5);
      } else {
         aqn $$6 = this.z();
         eot $$7 = $$0.A_();
         this.c.b(new aee(this.d($$0), (byte)3));
         this.c.b(new acd($$7.q(), $$7.r()));
         this.d.ah().d(this);
         $$6.a(this, brw.c.e);
         this.dM();
         this.b($$1, $$2, $$3, $$4, $$5);
         this.c($$0);
         $$0.a(this);
         this.f($$6);
         this.c.a($$1, $$2, $$3, $$4, $$5);
         this.d.ah().a(this, $$0);
         this.d.ah().e(this);
      }
   }

   @Nullable
   public io R() {
      return this.dk;
   }

   public float S() {
      return this.dm;
   }

   public akm<daz> T() {
      return this.dj;
   }

   public boolean U() {
      return this.dl;
   }

   public void a(akm<daz> $$0, @Nullable io $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.dk) && $$0.equals(this.dj);
         if ($$4 && !$$5) {
            this.a(wx.c("block.minecraft.set_spawn"));
         }

         this.dk = $$1;
         this.dj = $$0;
         this.dm = $$2;
         this.dl = $$3;
      } else {
         this.dk = null;
         this.dj = daz.h;
         this.dm = 0.0F;
         this.dl = false;
      }
   }

   public jq V() {
      return this.dh;
   }

   public void a(jq $$0) {
      this.dh = $$0;
   }

   public aqb W() {
      return this.di;
   }

   public void a(aqb $$0) {
      this.di = $$0;
   }

   @Override
   public void a(avh $$0, avj $$1, float $$2, float $$3) {
      this.c.b(new afl(le.b.e($$0), $$1, this.du(), this.dw(), this.dA(), $$2, $$3, this.ah.g()));
   }

   @Override
   public cii a(ctq $$0, boolean $$1, boolean $$2) {
      cii $$3 = super.a($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dP().b($$3);
         ctq $$4 = $$3.p();
         if ($$2) {
            if (!$$4.e()) {
               this.a(avs.f.b($$4.g()), $$0.I());
            }

            this.a(avs.F);
         }

         return $$3;
      }
   }

   public ars X() {
      return this.dn;
   }

   public void c(aqn $$0) {
      this.a((daz)$$0);
      this.e.a($$0);
   }

   @Nullable
   private static daw a(@Nullable ud $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? daw.a($$0.h($$1)) : null;
   }

   private daw b(@Nullable daw $$0) {
      daw $$1 = this.d.bf();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.d.u_();
      }
   }

   @Override
   public void c(@Nullable ud $$0) {
      this.e.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void k(ud $$0) {
      $$0.a("playerGameType", this.e.b().a());
      daw $$1 = this.e.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean Y() {
      return this.do;
   }

   public boolean b(aqo $$0) {
      return $$0 == this ? false : this.do || $$0.do;
   }

   @Override
   public boolean a(daz $$0, io $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(ctq $$0) {
      am.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      clx $$1 = this.gc();
      ctq $$2 = $$1.a($$0);
      this.cb.b($$1, $$1.k).ifPresent($$1x -> this.cb.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean Z() {
      return this.dp;
   }

   @Override
   public Optional<cle> aa() {
      return Optional.of(this.dr);
   }

   public void b(boolean $$0) {
      this.dq = $$0;
   }

   @Override
   public void a(cii $$0) {
      super.a($$0);
      brw $$1 = $$0.s();
      if ($$1 != null) {
         am.S.a(this, $$0.p(), $$1);
      }
   }

   public void a(xo $$0) {
      this.dv = $$0;
   }

   @Nullable
   public xo ab() {
      return this.dv != null && this.dv.b() ? null : this.dv;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cu = (float)(ayf.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dF());
      this.c.b(new acz(this));
   }

   @Override
   public boolean a(brw $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         $$0.j(this);
         this.c.a(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
         if ($$0 instanceof bsq $$2) {
            for (bre $$3 : $$2.ex()) {
               this.c.b(new afx($$0.al(), $$3, false));
            }
         }

         return true;
      }
   }

   @Override
   public void ac() {
      brw $$0 = this.dc();
      super.ac();
      if ($$0 instanceof bsq $$1) {
         for (bre $$2 : $$1.ex()) {
            this.c.b(new aec($$0.al(), $$2.c()));
         }
      }
   }

   public afz d(aqn $$0) {
      return new afz($$0.ad(), $$0.ae(), dca.a($$0.C()), this.e.b(), this.e.c(), $$0.ah(), $$0.B(), this.gB(), this.ax());
   }

   @Override
   public void d(io $$0) {
      this.ds = $$0;
   }

   public void ad() {
      this.ds = null;
   }

   @Nullable
   public io ae() {
      return this.ds;
   }
}
