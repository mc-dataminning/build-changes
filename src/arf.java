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

public class arf extends cmv {
   private static final Logger cz = LogUtils.getLogger();
   private static final int cA = 32;
   private static final int cB = 10;
   private static final int cC = 25;
   public static final double b = 1.0;
   private static final but cD = new but(UUID.fromString("736565d2-e1a7-403d-a3f8-1aeb3e302542"), "Creative block interaction range modifier", 0.5, but.a.a);
   private static final but cE = new but(UUID.fromString("98491ef6-97b1-4584-ae82-71a8cc85cf73"), "Creative entity interaction range modifier", 2.0, but.a.a);
   public ase c;
   public final MinecraftServer d;
   public final arg e;
   private final alm cF;
   private final awf cG;
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
   private cmt cS = cmt.a;
   private boolean cT = true;
   private long cU = ac.c();
   @Nullable
   private bss cV;
   private boolean cW;
   private boolean cX;
   private final awe cY = new awe();
   @Nullable
   private evp cZ;
   private int da;
   private boolean db;
   private int dc = 2;
   private String dd = "en_us";
   @Nullable
   private evp de;
   @Nullable
   private evp df;
   @Nullable
   private evp dg;
   private kb dh = kb.a(0, 0, 0);
   private aqs di = aqs.a;
   private ald<dbw> dj = dbw.h;
   @Nullable
   private iz dk;
   private boolean dl;
   private float dm;
   private final asj dn;
   private boolean do;
   private boolean dp;
   private boolean dq;
   private cmb dr = new cmb(0, 0, 0);
   @Nullable
   private iz ds;
   private final cqf dt = new cqf() {
      @Override
      public void a(cps $$0, jr<cun> $$1, cun $$2, int[] $$3) {
         arf.this.c.b(new adc($$0.j, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cps $$0, int $$1, cun $$2) {
         arf.this.c.b(new ade($$0.j, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cps $$0, cun $$1) {
         arf.this.c.b(new ade(-1, $$0.k(), -1, $$1));
      }

      @Override
      public void a(cps $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cps $$0, int $$1, int $$2) {
         arf.this.c.b(new add($$0.j, $$1, $$2));
      }
   };
   private final cqe du = new cqe() {
      @Override
      public void a(cps $$0, int $$1, cun $$2) {
         crn $$3 = $$0.b($$1);
         if (!($$3 instanceof crj)) {
            if ($$3.c == arf.this.gc()) {
               am.f.a(arf.this, arf.this.gc(), $$2);
            }
         }
      }

      @Override
      public void a(cps $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private yf dv;
   @Nullable
   public final Object f;
   private int dw;
   public boolean g;

   public arf(MinecraftServer $$0, are $$1, GameProfile $$2, aqt $$3) {
      super($$1, $$1.V(), $$1.W(), $$2);
      this.dn = $$0.a(this);
      this.e = $$0.b(this);
      this.d = $$0;
      this.cG = $$0.ah().a((cmv)this);
      this.cF = $$0.ah().f(this);
      this.e($$1);
      this.a($$3);
      this.f = null;
   }

   private void e(are $$0) {
      iz $$1 = $$0.V();
      if ($$0.D_().g() && $$0.o().bb().k() != dbt.c) {
         int $$2 = Math.max(0, this.d.a($$0));
         int $$3 = ayx.a($$0.C_().b((double)$$1.u(), (double)$$1.w()));
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
         int $$8 = azf.a().a($$6);

         for (int $$9 = 0; $$9 < $$6; $$9++) {
            int $$10 = ($$8 + $$7 * $$9) % $$6;
            int $$11 = $$10 % ($$2 * 2 + 1);
            int $$12 = $$10 / ($$2 * 2 + 1);
            iz $$13 = aqz.a($$0, $$1.u() + $$11 - $$2, $$1.w() + $$12 - $$2);
            if ($$13 != null) {
               this.a($$13, 0.0F, 0.0F);
               if ($$0.g(this)) {
                  break;
               }
            }
         }
      } else {
         this.a($$1, 0.0F, 0.0F);

         while (!$$0.g(this) && this.dw() < (double)($$0.am() - 1)) {
            this.a_(this.du(), this.dw() + 1.0, this.dA());
         }
      }
   }

   private int v(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         cmb.a.parse(new Dynamic(vf.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(cz::error).ifPresent($$0x -> this.dr = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         ur $$1 = $$0.p("enteredNetherPosition");
         this.df = new evp($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.cX = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cY.a($$0.p("recipeBook"), this.d.aJ());
      }

      if (this.fL()) {
         this.fM();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.dk = new iz($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.dl = $$0.q("SpawnForced");
         this.dm = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.dj = dbw.g.parse(vf.a, $$0.c("SpawnDimension")).resultOrPartial(cz::error).orElse(dbw.h);
         }
      }

      this.dq = $$0.q("spawn_extra_particles_on_fall");
      vo $$2 = $$0.c("raid_omen_position");
      if ($$2 != null) {
         iz.a.parse(vf.a, $$2).resultOrPartial(cz::error).ifPresent($$0x -> this.ds = $$0x);
      }
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      cmb.a.encodeStart(vf.a, this.dr).resultOrPartial(cz::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.cX);
      if (this.df != null) {
         ur $$1 = new ur();
         $$1.a("x", this.df.c);
         $$1.a("y", this.df.d);
         $$1.a("z", this.df.e);
         $$0.a("enteredNetherPosition", $$1);
      }

      bss $$2 = this.cZ();
      bss $$3 = this.dc();
      if ($$3 != null && $$2 != this && $$2.cY()) {
         ur $$4 = new ur();
         ur $$5 = new ur();
         $$2.e($$5);
         $$4.a("Attach", $$3.cz());
         $$4.a("Entity", $$5);
         $$0.a("RootVehicle", $$4);
      }

      $$0.a("recipeBook", this.cY.b());
      $$0.a("Dimension", this.dP().af().a().toString());
      if (this.dk != null) {
         $$0.a("SpawnX", this.dk.u());
         $$0.a("SpawnY", this.dk.v());
         $$0.a("SpawnZ", this.dk.w());
         $$0.a("SpawnForced", this.dl);
         $$0.a("SpawnAngle", this.dm);
         ale.a.encodeStart(vf.a, this.dj.a()).resultOrPartial(cz::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }

      $$0.a("spawn_extra_particles_on_fall", this.dq);
      if (this.ds != null) {
         iz.a.encodeStart(vf.a, this.ds).resultOrPartial(cz::error).ifPresent($$1 -> $$0.a("raid_omen_position", $$1));
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gl();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.cq = ayx.a((float)$$0 / $$1, 0.0F, $$2);
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
   public void a(cun $$0, int $$1) {
      super.a($$0, $$1);
      this.cQ = -1;
   }

   private void a(cps $$0) {
      $$0.a(this.du);
      $$0.a(this.dt);
   }

   public void h() {
      this.a(this.ca);
   }

   @Override
   public void f_() {
      super.f_();
      this.c.b(aek.a);
   }

   @Override
   public void g_() {
      super.g_();
      this.c.b(new aej(this.eP()));
   }

   @Override
   protected void a(dsa $$0) {
      am.e.a(this, $$0);
   }

   @Override
   protected cuj k() {
      return new cvl(this);
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

      bss $$0 = this.K();
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
      bur $$0 = this.f(buv.g);
      if ($$0 != null) {
         if (this.f()) {
            $$0.b(cD);
         } else {
            $$0.e(cD);
         }
      }

      bur $$1 = this.f(buv.h);
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
            cun $$1 = this.gc().a($$0);
            if ($$1.g().ak_()) {
               zv<?> $$2 = ((csx)$$1.g()).a($$1, this.dP(), this);
               if ($$2 != null) {
                  this.c.b($$2);
               }
            }
         }

         if (this.eA() != this.cN || this.cO != this.cc.a() || this.cc.e() == 0.0F != this.cP) {
            this.c.b(new afr(this.eA(), this.cc.a(), this.cc.e()));
            this.cN = this.eA();
            this.cO = this.cc.a();
            this.cP = this.cc.e() == 0.0F;
         }

         if (this.eA() + this.fs() != this.cH) {
            this.cH = this.eA() + this.fs();
            this.a(eww.g, ayx.f(this.cH));
         }

         if (this.cc.a() != this.cI) {
            this.cI = this.cc.a();
            this.a(eww.h, ayx.f((float)this.cI));
         }

         if (this.cl() != this.cJ) {
            this.cJ = this.cl();
            this.a(eww.i, ayx.f((float)this.cJ));
         }

         if (this.eO() != this.cK) {
            this.cK = this.eO();
            this.a(eww.j, ayx.f((float)this.cK));
         }

         if (this.cp != this.cM) {
            this.cM = this.cp;
            this.a(eww.k, ayx.f((float)this.cM));
         }

         if (this.co != this.cL) {
            this.cL = this.co;
            this.a(eww.l, ayx.f((float)this.cL));
         }

         if (this.cp != this.cQ) {
            this.cQ = this.cp;
            this.c.b(new afq(this.cq, this.cp, this.co));
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

   private void a(eww $$0, int $$1) {
      this.gr().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(brl $$0) {
      this.a(dwt.p);
      boolean $$1 = this.dP().ab().b(dbs.n);
      if ($$1) {
         xo $$2 = this.eP().a();
         this.c.a(new ael(this.al(), $$2), wv.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            xo $$3x = xo.a("death.attack.message_too_long", xo.b($$2x).a(n.o));
            xo $$4x = xo.a("death.attack.even_more_magic", this.O_()).a($$1xx -> $$1xx.a(new xu(xu.a.a, $$3x)));
            return new ael(this.al(), $$4x);
         }));
         ewv $$3 = this.cj();
         if ($$3 == null || $$3.k() == ewv.b.a) {
            this.d.ah().a($$2, false);
         } else if ($$3.k() == ewv.b.c) {
            this.d.ah().a(this, $$2);
         } else if ($$3.k() == ewv.b.d) {
            this.d.ah().b(this, $$2);
         }
      } else {
         this.c.b(new ael(this.al(), xn.a));
      }

      this.gq();
      if (this.dP().ab().b(dbs.N)) {
         this.gG();
      }

      if (!this.N_()) {
         this.g($$0);
      }

      this.gr().a(eww.d, this, ewr::b);
      btn $$4 = this.eQ();
      if ($$4 != null) {
         this.b(awj.h.b($$4.ak()));
         $$4.a(this, this.bl, $$0);
         this.f($$4);
      }

      this.dP().a(this, (byte)3);
      this.a(awj.N);
      this.a(awj.i.b(awj.m));
      this.a(awj.i.b(awj.n));
      this.aC();
      this.l(0);
      this.c(false);
      this.eP().c();
      this.a(Optional.of(jh.a(this.dP().af(), this.dp())));
   }

   private void gG() {
      evk $$0 = new evk(this.dp()).c(32.0, 10.0, 32.0);
      this.dP().a(btp.class, $$0, bsx.f).stream().filter($$0x -> $$0x instanceof btt).forEach($$0x -> ((btt)$$0x).a_((cmv)this));
   }

   @Override
   public void a(bss $$0, int $$1, brl $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.t($$1);
         this.gr().a(eww.f, this, ewr::b);
         if ($$0 instanceof cmv) {
            this.a(awj.Q);
            this.gr().a(eww.e, this, ewr::b);
         } else {
            this.a(awj.O);
         }

         this.a(this, $$0, eww.m);
         this.a($$0, this, eww.n);
         am.c.a(this, $$0, $$2);
      }
   }

   private void a(ews $$0, ews $$1, eww[] $$2) {
      ewo $$3 = this.gr().e($$1.cB());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gr().a($$2[$$4], $$0, ewr::b);
         }
      }
   }

   @Override
   public boolean a(brl $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.d.n() && this.gH() && $$0.a(awq.n);
         if (!$$2 && this.cR > 0 && !$$0.a(awq.e)) {
            return false;
         } else {
            bss $$3 = $$0.d();
            if ($$3 instanceof cmv $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof cnb $$5 && $$5.s() instanceof cmv $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(cmv $$0) {
      return !this.gH() ? false : super.a($$0);
   }

   private boolean gH() {
      return this.d.ad();
   }

   @Nullable
   @Override
   protected eos a(are $$0) {
      eos $$1 = super.a($$0);
      if ($$1 != null && this.dP().af() == dbw.h && $$0.af() == dbw.j) {
         evp $$2 = $$1.a.b(0.0, -1.0, 0.0);
         return new eos($$2, evp.b, 90.0F, 0.0F);
      } else {
         return $$1;
      }
   }

   @Nullable
   @Override
   public bss b(are $$0) {
      this.cW = true;
      are $$1 = this.z();
      ald<dbw> $$2 = $$1.af();
      if ($$2 == dbw.j && $$0.af() == dbw.h) {
         this.ai();
         this.z().a(this, bss.c.e);
         if (!this.g) {
            this.g = true;
            this.c.b(new ado(ado.f, this.cX ? 0.0F : 1.0F));
            this.cX = true;
         }

         return this;
      } else {
         epq $$3 = $$0.A_();
         this.c.b(new aev(this.d($$0), (byte)3));
         this.c.b(new acu($$3.q(), $$3.r()));
         avc $$4 = this.d.ah();
         $$4.d(this);
         $$1.a(this, bss.c.e);
         this.dM();
         eos $$5 = this.a($$0);
         if ($$5 != null) {
            $$1.ag().a("moving");
            if ($$2 == dbw.h && $$0.af() == dbw.i) {
               this.df = this.dn();
            } else if ($$0.af() == dbw.j) {
               this.a($$0, iz.a($$5.a));
            }

            $$1.ag().c();
            $$1.ag().a("placing");
            this.c($$0);
            this.c.a($$5.a.c, $$5.a.d, $$5.a.e, $$5.c, $$5.d);
            this.c.l();
            $$0.b(this);
            $$1.ag().c();
            this.f($$1);
            this.c.b(new aeh(this.gd()));
            $$4.a(this, $$0);
            $$4.e(this);

            for (bsa $$6 : this.ex()) {
               this.c.b(new ago(this.al(), $$6, false));
            }

            this.c.b(new adu(1032, iz.c, 0, false));
            this.cQ = -1;
            this.cN = -1.0F;
            this.cO = -1;
         }

         return this;
      }
   }

   private void a(are $$0, iz $$1) {
      iz.a $$2 = $$1.j();

      for (int $$3 = -2; $$3 <= 2; $$3++) {
         for (int $$4 = -2; $$4 <= 2; $$4++) {
            for (int $$5 = -1; $$5 < 3; $$5++) {
               dsa $$6 = $$5 == -1 ? dez.co.o() : dez.a.o();
               $$0.b($$2.g($$1).e($$4, $$5, $$3), $$6);
            }
         }
      }
   }

   @Override
   protected Optional<l.a> a(are $$0, iz $$1, boolean $$2, dtr $$3) {
      Optional<l.a> $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         je.a $$5 = this.dP().a_(this.ay).d(dkb.b).orElse(je.a.a);
         Optional<l.a> $$6 = $$0.p().a($$1, $$5);
         if ($$6.isEmpty()) {
            cz.error("Unable to create a portal, likely target out of worldborder");
         }

         return $$6;
      }
   }

   private void f(are $$0) {
      ald<dbw> $$1 = $$0.af();
      ald<dbw> $$2 = this.dP().af();
      am.w.a(this, $$1, $$2);
      if ($$1 == dbw.i && $$2 == dbw.h && this.df != null) {
         am.D.a(this, this.df);
      }

      if ($$2 != dbw.i) {
         this.df = null;
      }
   }

   @Override
   public boolean a(arf $$0) {
      if ($$0.N_()) {
         return this.K() == this;
      } else {
         return this.N_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bss $$0, int $$1) {
      super.a($$0, $$1);
      this.cb.d();
   }

   @Override
   public Either<cmv.a, baa> a(iz $$0) {
      je $$1 = this.dP().a_($$0).c(dit.aE);
      if (this.fL() || !this.bD()) {
         return Either.left(cmv.a.e);
      } else if (!this.dP().D_().j()) {
         return Either.left(cmv.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cmv.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cmv.a.d);
      } else {
         this.a(this.dP().af(), $$0, this.dF(), false, true);
         if (this.dP().R()) {
            return Either.left(cmv.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               evp $$4 = evp.c($$0);
               List<ckb> $$5 = this.dP()
                  .a(ckb.class, new evk($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.f(this));
               if (!$$5.isEmpty()) {
                  return Either.left(cmv.a.f);
               }
            }

            Either<cmv.a, baa> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(awj.ap);
               am.r.a(this);
            });
            if (!this.z().d()) {
               this.a(xo.c("sleep.not_possible"), true);
            }

            ((are)this.dP()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(iz $$0) {
      this.a(awj.i.b(awj.n));
      super.b($$0);
   }

   private boolean a(iz $$0, je $$1) {
      return this.j($$0) || this.j($$0.a($$1.g()));
   }

   private boolean j(iz $$0) {
      evp $$1 = evp.c($$0);
      return Math.abs(this.du() - $$1.a()) <= 3.0 && Math.abs(this.dw() - $$1.b()) <= 2.0 && Math.abs(this.dA() - $$1.c()) <= 3.0;
   }

   private boolean b(iz $$0, je $$1) {
      iz $$2 = $$0.c();
      return !this.i($$2) || !this.i($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fL()) {
         this.z().l().a(this, new ack(this, 2));
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
   public boolean b(brl $$0) {
      return super.b($$0) || this.O();
   }

   @Override
   protected void a(double $$0, boolean $$1, dsa $$2, iz $$3) {
   }

   @Override
   protected void c(iz $$0) {
      if (!this.N_()) {
         super.c($$0);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.dh()) {
         this.b($$3, new evp($$0, $$1, $$2));
         iz $$4 = this.aJ();
         dsa $$5 = this.dP().a_($$4);
         if (this.dq && $$3 && this.ac > 0.0F) {
            evp $$6 = $$4.b().b(0.0, 0.5, 0.0);
            int $$7 = (int)(50.0F * this.ac);
            this.z().a(new la(li.b, $$5), $$6.c, $$6.d, $$6.e, $$7, 0.3F, 0.3F, 0.3F, 0.15F);
            this.dq = false;
         }

         super.a($$1, $$3, $$5, $$4);
      }
   }

   @Override
   public void a(@Nullable bss $$0) {
      super.a($$0);
      this.cv = this.dn();
      this.cw = $$0;
      this.cx = $$0 != null && $$0.ak() == bsy.bn;
   }

   @Override
   protected void q() {
      if (this.dP().s().i()) {
         super.q();
      }
   }

   @Override
   public void a(dqp $$0, boolean $$1) {
      this.c.b(new acq(this.dP(), $$0.az_()));
      this.c.b(new aef($$0.az_(), $$1));
   }

   private void gI() {
      this.dw = this.dw % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bqw $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.cb != this.ca) {
            this.r();
         }

         this.gI();
         cps $$1 = $$0.createMenu(this.dw, this.gc(), this);
         if ($$1 == null) {
            if (this.N_()) {
               this.a(xo.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.c.b(new aee($$1.j, $$1.a(), $$0.O_()));
            this.a($$1);
            this.cb = $$1;
            return OptionalInt.of(this.dw);
         }
      }
   }

   @Override
   public void a(int $$0, dav $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.c.b(new aea($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(chh $$0, bql $$1) {
      if (this.cb != this.ca) {
         this.r();
      }

      this.gI();
      this.c.b(new adp(this.dw, $$1.b(), $$0.al()));
      this.cb = new cqs(this.dw, this.gc(), $$1, $$0);
      this.a(this.cb);
   }

   @Override
   public void a(cun $$0, bqr $$1) {
      if ($$0.a(cuq.ua)) {
         if (cwl.a($$0, this.dg(), this)) {
            this.cb.d();
         }

         this.c.b(new aed($$1));
      }
   }

   @Override
   public void a(dpp $$0) {
      this.c.b(aco.a($$0, dpf::e));
   }

   @Override
   public void r() {
      this.c.b(new adb(this.cb.j));
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
   public void a(evp $$0) {
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
               this.a(awj.C, $$3);
               this.C(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(awu.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(awj.w, $$4);
               this.C(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.be()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(awj.s, $$5);
               this.C(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.q_()) {
            if ($$1 > 0.0) {
               this.a(awj.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aE()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.cb()) {
                  this.a(awj.r, $$6);
                  this.C(0.1F * (float)$$6 * 0.01F);
               } else if (this.ca()) {
                  this.a(awj.q, $$6);
                  this.C(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(awj.p, $$6);
                  this.C(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fE()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(awj.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(awj.v, $$8);
            }
         }
      }
   }

   private void r(double $$0, double $$1, double $$2) {
      if (this.bR() && !s($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         bss $$4 = this.dc();
         if ($$4 instanceof cor) {
            this.a(awj.x, $$3);
         } else if ($$4 instanceof cot) {
            this.a(awj.y, $$3);
         } else if ($$4 instanceof cfu) {
            this.a(awj.z, $$3);
         } else if ($$4 instanceof chh) {
            this.a(awj.A, $$3);
         } else if ($$4 instanceof cko) {
            this.a(awj.D, $$3);
         }
      }
   }

   private static boolean s(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(awg<?> $$0, int $$1) {
      this.cG.b(this, $$0, $$1);
      this.gr().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(awg<?> $$0) {
      this.cG.a(this, $$0, 0);
      this.gr().a($$0, this, ewr::c);
   }

   @Override
   public int a(Collection<cyv<?>> $$0) {
      return this.cY.a($$0, this);
   }

   @Override
   public void a(cyv<?> $$0, List<cun> $$1) {
      am.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<ale> $$0) {
      List<cyv<?>> $$1 = $$0.stream().flatMap($$0x -> this.d.aJ().a($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<cyv<?>> $$0) {
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
   public void a(xo $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void x() {
      if (!this.bz.e() && this.fv()) {
         this.c.b(new adl(this, (byte)9));
         super.x();
      }
   }

   @Override
   public void a(fb.a $$0, evp $$1) {
      super.a($$0, $$1);
      this.c.b(new aeo($$0, $$1.c, $$1.d, $$1.e));
   }

   public void a(fb.a $$0, bss $$1, fb.a $$2) {
      evp $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.c.b(new aeo($$0, $$1, $$2));
   }

   public void a(arf $$0, boolean $$1) {
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
      } else if (this.dP().ab().b(dbs.d) || $$0.N_()) {
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
   protected void a(bsa $$0, @Nullable bss $$1) {
      super.a($$0, $$1);
      this.c.b(new ago(this.al(), $$0, true));
      if ($$0.a(bsc.y)) {
         this.da = this.ai;
         this.cZ = this.dn();
      }

      am.B.a(this, $$1);
   }

   @Override
   protected void a(bsa $$0, boolean $$1, @Nullable bss $$2) {
      super.a($$0, $$1, $$2);
      this.c.b(new ago(this.al(), $$0, false));
      am.B.a(this, $$2);
   }

   @Override
   protected void a(bsa $$0) {
      super.a($$0);
      this.c.b(new aet(this.al(), $$0.c()));
      if ($$0.a(bsc.y)) {
         this.cZ = null;
      }

      am.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.c.a($$0, $$1, $$2, this.dF(), this.dH(), bub.g);
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.c.a(this.du() + $$0, this.dw() + $$1, this.dA() + $$2, this.dF(), this.dH(), bub.f);
   }

   @Override
   public boolean a(are $$0, double $$1, double $$2, double $$3, Set<bub> $$4, float $$5, float $$6) {
      dbd $$7 = new dbd(iz.a($$1, $$2, $$3));
      $$0.l().a(arj.g, $$7, 1, this.al());
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
      this.c.l();
   }

   @Override
   public void b(bss $$0) {
      this.z().l().a(this, new ack($$0, 4));
   }

   @Override
   public void c(bss $$0) {
      this.z().l().a(this, new ack($$0, 5));
   }

   @Override
   public void y() {
      if (this.c != null) {
         this.c.b(new aeh(this.gd()));
         this.J();
      }
   }

   public are z() {
      return (are)this.dP();
   }

   public boolean a(dbt $$0) {
      if (!this.e.a($$0)) {
         return false;
      } else {
         this.c.b(new ado(ado.e, (float)$$0.a()));
         if ($$0 == dbt.d) {
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
      return this.e.b() == dbt.d;
   }

   @Override
   public boolean f() {
      return this.e.b() == dbt.b;
   }

   @Override
   public void a(xo $$0) {
      this.b($$0, false);
   }

   public void b(xo $$0, boolean $$1) {
      if (this.v($$1)) {
         this.c.a(new agf($$0, $$1), wv.a(() -> {
            if (this.v(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               xo $$3 = xo.b($$2).a(n.o);
               return new agf(xo.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(yd $$0, boolean $$1, xk.a $$2) {
      if (this.gJ()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String A() {
      return this.c.m() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(aqt $$0) {
      this.dd = $$0.b();
      this.dc = $$0.c();
      this.cS = $$0.d();
      this.cT = $$0.e();
      this.do = $$0.h();
      this.dp = $$0.i();
      this.ap().a(bV, (byte)$$0.f());
      this.ap().a(bW, (byte)$$0.g().a());
   }

   public aqt B() {
      int $$0 = this.ap().a(bV);
      bth $$1 = bth.d.apply(this.ap().a(bW));
      return new aqt(this.dd, this.dc, this.cS, this.cT, $$0, $$1, this.do, this.dp);
   }

   public boolean C() {
      return this.cT;
   }

   public cmt D() {
      return this.cS;
   }

   private boolean v(boolean $$0) {
      return this.cS == cmt.c ? $$0 : true;
   }

   private boolean gJ() {
      return this.cS == cmt.a;
   }

   public int E() {
      return this.dc;
   }

   public void a(akd $$0) {
      this.c.b(new aez($$0.a(), $$0.d().map(akd.a::a)));
   }

   @Override
   protected int F() {
      return this.d.c(this.gb());
   }

   @Override
   public void G() {
      this.cU = ac.c();
   }

   public awf H() {
      return this.cG;
   }

   public awe I() {
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

   public bss K() {
      return (bss)(this.cV == null ? this : this.cV);
   }

   @Override
   public void d(@Nullable bss $$0) {
      bss $$1 = this.K();
      this.cV = (bss)($$0 == null ? this : $$0);
      if ($$1 != this.cV) {
         if (this.cV.dP() instanceof are $$2) {
            this.a($$2, this.cV.du(), this.cV.dw(), this.cV.dA(), Set.of(), this.dF(), this.dH());
         }

         if ($$0 != null) {
            this.z().l().a(this);
         }

         this.c.b(new afg(this.cV));
         this.c.l();
      }
   }

   @Override
   protected void L() {
      if (!this.cW) {
         super.L();
      }
   }

   @Override
   public void e(bss $$0) {
      if (this.e.b() == dbt.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long M() {
      return this.cU;
   }

   @Nullable
   public xo N() {
      return null;
   }

   @Override
   public void a(bqr $$0) {
      super.a($$0);
      this.gw();
   }

   public boolean O() {
      return this.cW;
   }

   public void P() {
      this.cW = false;
   }

   public alm Q() {
      return this.cF;
   }

   public void a(are $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      this.d(this);
      this.ac();
      if ($$0 == this.dP()) {
         this.c.a($$1, $$2, $$3, $$4, $$5);
      } else {
         are $$6 = this.z();
         epq $$7 = $$0.A_();
         this.c.b(new aev(this.d($$0), (byte)3));
         this.c.b(new acu($$7.q(), $$7.r()));
         this.d.ah().d(this);
         $$6.a(this, bss.c.e);
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
   public iz R() {
      return this.dk;
   }

   public float S() {
      return this.dm;
   }

   public ald<dbw> T() {
      return this.dj;
   }

   public boolean U() {
      return this.dl;
   }

   public void a(ald<dbw> $$0, @Nullable iz $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.dk) && $$0.equals(this.dj);
         if ($$4 && !$$5) {
            this.a(xo.c("block.minecraft.set_spawn"));
         }

         this.dk = $$1;
         this.dj = $$0;
         this.dm = $$2;
         this.dl = $$3;
      } else {
         this.dk = null;
         this.dj = dbw.h;
         this.dm = 0.0F;
         this.dl = false;
      }
   }

   public kb V() {
      return this.dh;
   }

   public void a(kb $$0) {
      this.dh = $$0;
   }

   public aqs W() {
      return this.di;
   }

   public void a(aqs $$0) {
      this.di = $$0;
   }

   @Override
   public void a(avy $$0, awa $$1, float $$2, float $$3) {
      this.c.b(new agc(lp.b.e($$0), $$1, this.du(), this.dw(), this.dA(), $$2, $$3, this.ah.g()));
   }

   @Override
   public cjf a(cun $$0, boolean $$1, boolean $$2) {
      cjf $$3 = super.a($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dP().b($$3);
         cun $$4 = $$3.p();
         if ($$2) {
            if (!$$4.e()) {
               this.a(awj.f.b($$4.g()), $$0.I());
            }

            this.a(awj.F);
         }

         return $$3;
      }
   }

   public asj X() {
      return this.dn;
   }

   public void c(are $$0) {
      this.a((dbw)$$0);
      this.e.a($$0);
   }

   @Nullable
   private static dbt a(@Nullable ur $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? dbt.a($$0.h($$1)) : null;
   }

   private dbt b(@Nullable dbt $$0) {
      dbt $$1 = this.d.bf();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.d.u_();
      }
   }

   @Override
   public void c(@Nullable ur $$0) {
      this.e.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void k(ur $$0) {
      $$0.a("playerGameType", this.e.b().a());
      dbt $$1 = this.e.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean Y() {
      return this.do;
   }

   public boolean b(arf $$0) {
      return $$0 == this ? false : this.do || $$0.do;
   }

   @Override
   public boolean a(dbw $$0, iz $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cun $$0) {
      am.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cmu $$1 = this.gc();
      cun $$2 = $$1.a($$0);
      this.cb.b($$1, $$1.k).ifPresent($$1x -> this.cb.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean Z() {
      return this.dp;
   }

   @Override
   public Optional<cmb> aa() {
      return Optional.of(this.dr);
   }

   public void b(boolean $$0) {
      this.dq = $$0;
   }

   @Override
   public void a(cjf $$0) {
      super.a($$0);
      bss $$1 = $$0.s();
      if ($$1 != null) {
         am.S.a(this, $$0.p(), $$1);
      }
   }

   public void a(yf $$0) {
      this.dv = $$0;
   }

   @Nullable
   public yf ab() {
      return this.dv != null && this.dv.b() ? null : this.dv;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cu = (float)(ayx.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dF());
      this.c.b(new adq(this));
   }

   @Override
   public boolean a(bss $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         $$0.j(this);
         this.c.a(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
         if ($$0 instanceof btn $$2) {
            for (bsa $$3 : $$2.ex()) {
               this.c.b(new ago($$0.al(), $$3, false));
            }
         }

         return true;
      }
   }

   @Override
   public void ac() {
      bss $$0 = this.dc();
      super.ac();
      if ($$0 instanceof btn $$1) {
         for (bsa $$2 : $$1.ex()) {
            this.c.b(new aet($$0.al(), $$2.c()));
         }
      }
   }

   public agq d(are $$0) {
      return new agq($$0.ae(), $$0.af(), dcx.a($$0.C()), this.e.b(), this.e.c(), $$0.ai(), $$0.B(), this.gB(), this.ax());
   }

   @Override
   public void d(iz $$0) {
      this.ds = $$0;
   }

   public void ad() {
      this.ds = null;
   }

   @Nullable
   public iz ae() {
      return this.ds;
   }
}
