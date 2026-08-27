import com.google.common.collect.Lists;
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
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class amj extends cdz {
   private static final Logger b = LogUtils.getLogger();
   private static final int cm = 32;
   private static final int cn = 10;
   private static final int co = 25;
   public anh c;
   public final MinecraftServer d;
   public final amk e;
   private final agu cp;
   private final arb cq;
   private float cr = Float.MIN_VALUE;
   private int cs = Integer.MIN_VALUE;
   private int ct = Integer.MIN_VALUE;
   private int cu = Integer.MIN_VALUE;
   private int cv = Integer.MIN_VALUE;
   private int cw = Integer.MIN_VALUE;
   private float cx = -1.0E8F;
   private int cy = -99999999;
   private boolean cz = true;
   private int cA = -99999999;
   private int cB = 60;
   private cdx cC = cdx.a;
   private boolean cD = true;
   private long cE = ac.b();
   @Nullable
   private bkv cF;
   private boolean cG;
   private boolean cH;
   private final ara cI = new ara();
   @Nullable
   private ejz cJ;
   private int cK;
   private boolean cL;
   private int cM = 2;
   private String cN = "en_us";
   @Nullable
   private ejz cO;
   @Nullable
   private ejz cP;
   @Nullable
   private ejz cQ;
   private iy cR = iy.a(0, 0, 0);
   private alw cS = alw.a;
   private agl<csf> cT = csf.h;
   @Nullable
   private hx cU;
   private boolean cV;
   private float cW;
   private final anm cX;
   private boolean cY;
   private boolean cZ;
   private cdf da = new cdf(0, 0, 0);
   private final che db = new che() {
      @Override
      public void a(cgr $$0, ip<clo> $$1, clo $$2, int[] $$3) {
         amj.this.c.b(new zb($$0.j, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cgr $$0, int $$1, clo $$2) {
         amj.this.c.b(new zd($$0.j, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cgr $$0, clo $$1) {
         amj.this.c.b(new zd(-1, $$0.k(), -1, $$1));
      }

      @Override
      public void a(cgr $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cgr $$0, int $$1, int $$2) {
         amj.this.c.b(new zc($$0.j, $$1, $$2));
      }
   };
   private final chd dc = new chd() {
      @Override
      public void a(cgr $$0, int $$1, clo $$2) {
         cim $$3 = $$0.b($$1);
         if (!($$3 instanceof cii)) {
            if ($$3.d == amj.this.fT()) {
               al.e.a(amj.this, amj.this.fT(), $$2);
            }
         }
      }

      @Override
      public void a(cgr $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private vm dd;
   private int de;
   public boolean f;

   public amj(MinecraftServer $$0, ami $$1, GameProfile $$2, alx $$3) {
      super($$1, $$1.S(), $$1.T(), $$2);
      this.cX = $$0.a(this);
      this.e = $$0.b(this);
      this.d = $$0;
      this.cq = $$0.ae().a((cdz)this);
      this.cp = $$0.ae().f(this);
      this.t(1.0F);
      this.e($$1);
      this.a($$3);
   }

   private void e(ami $$0) {
      hx $$1 = $$0.S();
      if ($$0.E_().g() && $$0.n().aY().m() != csc.c) {
         int $$2 = Math.max(0, this.d.a($$0));
         int $$3 = atq.a($$0.D_().b((double)$$1.u(), (double)$$1.w()));
         if ($$3 < $$2) {
            $$2 = $$3;
         }

         if ($$3 <= 1) {
            $$2 = 1;
         }

         long $$4 = (long)($$2 * 2 + 1);
         long $$5 = $$4 * $$4;
         int $$6 = $$5 > 2147483647L ? Integer.MAX_VALUE : (int)$$5;
         int $$7 = this.u($$6);
         int $$8 = atw.a().a($$6);

         for (int $$9 = 0; $$9 < $$6; $$9++) {
            int $$10 = ($$8 + $$7 * $$9) % $$6;
            int $$11 = $$10 % ($$2 * 2 + 1);
            int $$12 = $$10 / ($$2 * 2 + 1);
            hx $$13 = amd.a($$0, $$1.u() + $$11 - $$2, $$1.w() + $$12 - $$2);
            if ($$13 != null) {
               this.a($$13, 0.0F, 0.0F);
               if ($$0.g(this)) {
                  break;
               }
            }
         }
      } else {
         this.a($$1, 0.0F, 0.0F);

         while (!$$0.g(this) && this.du() < (double)($$0.ak() - 1)) {
            this.a_(this.ds(), this.du() + 1.0, this.dy());
         }
      }
   }

   private int u(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         cdf.a.parse(new Dynamic(sr.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(b::error).ifPresent($$0x -> this.da = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         sd $$1 = $$0.p("enteredNetherPosition");
         this.cP = new ejz($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.cH = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cI.a($$0.p("recipeBook"), this.d.aG());
      }

      if (this.fE()) {
         this.fF();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.cU = new hx($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.cV = $$0.q("SpawnForced");
         this.cW = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.cT = csf.g.parse(sr.a, $$0.c("SpawnDimension")).resultOrPartial(b::error).orElse(csf.h);
         }
      }
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      cdf.a.encodeStart(sr.a, this.da).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.cH);
      if (this.cP != null) {
         sd $$1 = new sd();
         $$1.a("x", this.cP.c);
         $$1.a("y", this.cP.d);
         $$1.a("z", this.cP.e);
         $$0.a("enteredNetherPosition", $$1);
      }

      bkv $$2 = this.cX();
      bkv $$3 = this.da();
      if ($$3 != null && $$2 != this && $$2.cW()) {
         sd $$4 = new sd();
         sd $$5 = new sd();
         $$2.e($$5);
         $$4.a("Attach", $$3.cw());
         $$4.a("Entity", $$5);
         $$0.a("RootVehicle", $$4);
      }

      $$0.a("recipeBook", this.cI.b());
      $$0.a("Dimension", this.dN().ad().a().toString());
      if (this.cU != null) {
         $$0.a("SpawnX", this.cU.u());
         $$0.a("SpawnY", this.cU.v());
         $$0.a("SpawnZ", this.cU.w());
         $$0.a("SpawnForced", this.cV);
         $$0.a("SpawnAngle", this.cW);
         agm.a.encodeStart(sr.a, this.cT.a()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gc();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.ch = atq.a((float)$$0 / $$1, 0.0F, $$2);
      this.cA = -1;
   }

   public void b(int $$0) {
      this.cf = $$0;
      this.cA = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cA = -1;
   }

   @Override
   public void a(clo $$0, int $$1) {
      super.a($$0, $$1);
      this.cA = -1;
   }

   private void a(cgr $$0) {
      $$0.a(this.dc);
      $$0.a(this.db);
   }

   public void h() {
      this.a(this.bR);
   }

   @Override
   public void g_() {
      super.g_();
      this.c.b(new aai());
   }

   @Override
   public void h_() {
      super.h_();
      this.c.b(new aah(this.eL()));
   }

   @Override
   protected void a(dhn $$0) {
      al.d.a(this, $$0);
   }

   @Override
   protected clk k() {
      return new cmj(this);
   }

   @Override
   public void l() {
      this.e.a();
      this.da.a();
      this.cB--;
      if (this.al > 0) {
         this.al--;
      }

      this.bS.d();
      if (!this.dN().B && !this.bS.a(this)) {
         this.r();
         this.bS = this.bR;
      }

      bkv $$0 = this.K();
      if ($$0 != this) {
         if ($$0.bx()) {
            this.a($$0.ds(), $$0.du(), $$0.dy(), $$0.dD(), $$0.dF());
            this.z().k().a(this);
            if (this.fK()) {
               this.c(this);
            }
         } else {
            this.c(this);
         }
      }

      al.w.a(this);
      if (this.cJ != null) {
         al.u.a(this, this.cJ, this.ah - this.cK);
      }

      this.o();
      this.p();
      this.cp.b(this);
   }

   public void m() {
      try {
         if (!this.P_() || !this.df()) {
            super.l();
         }

         for (int $$0 = 0; $$0 < this.fT().b(); $$0++) {
            clo $$1 = this.fT().a($$0);
            if ($$1.d().am_()) {
               wo<?> $$2 = ((cjt)$$1.d()).a($$1, this.dN(), this);
               if ($$2 != null) {
                  this.c.b($$2);
               }
            }
         }

         if (this.ew() != this.cx || this.cy != this.bT.a() || this.bT.e() == 0.0F != this.cz) {
            this.c.b(new abn(this.ew(), this.bT.a(), this.bT.e()));
            this.cx = this.ew();
            this.cy = this.bT.a();
            this.cz = this.bT.e() == 0.0F;
         }

         if (this.ew() + this.fl() != this.cr) {
            this.cr = this.ew() + this.fl();
            this.a(elb.f, atq.f(this.cr));
         }

         if (this.bT.a() != this.cs) {
            this.cs = this.bT.a();
            this.a(elb.g, atq.f((float)this.cs));
         }

         if (this.ci() != this.ct) {
            this.ct = this.ci();
            this.a(elb.h, atq.f((float)this.ct));
         }

         if (this.eK() != this.cu) {
            this.cu = this.eK();
            this.a(elb.i, atq.f((float)this.cu));
         }

         if (this.cg != this.cw) {
            this.cw = this.cg;
            this.a(elb.j, atq.f((float)this.cw));
         }

         if (this.cf != this.cv) {
            this.cv = this.cf;
            this.a(elb.k, atq.f((float)this.cv));
         }

         if (this.cg != this.cA) {
            this.cA = this.cg;
            this.c.b(new abm(this.ch, this.cg, this.cf));
         }

         if (this.ah % 20 == 0) {
            al.p.a(this);
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
      if (this.ew() > 0.0F && this.cO != null) {
         al.U.a(this, this.cO);
      }

      this.cO = null;
      super.n();
   }

   public void o() {
      if (this.ab > 0.0F && this.cO == null) {
         this.cO = this.dl();
      }
   }

   public void p() {
      if (this.da() != null && this.da().bn()) {
         if (this.cQ == null) {
            this.cQ = this.dl();
         } else {
            al.V.a(this, this.cQ);
         }
      }

      if (this.cQ != null && (this.da() == null || !this.da().bn())) {
         this.cQ = null;
      }
   }

   private void a(elb $$0, int $$1) {
      this.gi().a($$0, this.cy(), $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(bjt $$0) {
      this.a(dlx.p);
      boolean $$1 = this.dN().Y().b(csb.n);
      if ($$1) {
         uv $$2 = this.eL().a();
         this.c.a(new aaj(this.aj(), $$2), uf.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            uv $$3x = uv.a("death.attack.message_too_long", uv.b($$2x).a(n.o));
            uv $$4x = uv.a("death.attack.even_more_magic", this.Q_()).a($$1xx -> $$1xx.a(new vb(vb.a.a, $$3x)));
            return new aaj(this.aj(), $$4x);
         }));
         ela $$3 = this.cg();
         if ($$3 == null || $$3.k() == ela.b.a) {
            this.d.ae().a($$2, false);
         } else if ($$3.k() == ela.b.c) {
            this.d.ae().a(this, $$2);
         } else if ($$3.k() == ela.b.d) {
            this.d.ae().b(this, $$2);
         }
      } else {
         this.c.b(new aaj(this.aj(), uu.a));
      }

      this.gh();
      if (this.dN().Y().b(csb.N)) {
         this.gt();
      }

      if (!this.P_()) {
         this.g($$0);
      }

      this.gi().a(elb.c, this.cy(), ekx::a);
      bll $$4 = this.eM();
      if ($$4 != null) {
         this.b(arf.h.b($$4.ai()));
         $$4.a(this, this.bh, $$0);
         this.f($$4);
      }

      this.dN().a(this, (byte)3);
      this.a(arf.N);
      this.a(arf.i.b(arf.m));
      this.a(arf.i.b(arf.n));
      this.aA();
      this.k(0);
      this.a_(false);
      this.eL().c();
      this.a(Optional.of(ie.a(this.dN().ad(), this.dn())));
   }

   private void gt() {
      eju $$0 = new eju(this.dn()).c(32.0, 10.0, 32.0);
      this.dN().a(bln.class, $$0, bky.f).stream().filter($$0x -> $$0x instanceof bls).forEach($$0x -> ((bls)$$0x).a_((cdz)this));
   }

   @Override
   public void a(bkv $$0, int $$1, bjt $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.s($$1);
         String $$3 = this.cy();
         String $$4 = $$0.cy();
         this.gi().a(elb.e, $$3, ekx::a);
         if ($$0 instanceof cdz) {
            this.a(arf.Q);
            this.gi().a(elb.d, $$3, ekx::a);
         } else {
            this.a(arf.O);
         }

         this.a($$3, $$4, elb.l);
         this.a($$4, $$3, elb.m);
         al.b.a(this, $$0, $$2);
      }
   }

   private void a(String $$0, String $$1, elb[] $$2) {
      ekw $$3 = this.gi().g($$1);
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gi().a($$2[$$4], $$0, ekx::a);
         }
      }
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.d.l() && this.gu() && $$0.a(arm.m);
         if (!$$2 && this.cB > 0 && !$$0.a(arm.d)) {
            return false;
         } else {
            bkv $$3 = $$0.d();
            if ($$3 instanceof cdz $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof cef $$5 && $$5.w() instanceof cdz $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(cdz $$0) {
      return !this.gu() ? false : super.a($$0);
   }

   private boolean gu() {
      return this.d.aa();
   }

   @Nullable
   @Override
   protected edu a(ami $$0) {
      edu $$1 = super.a($$0);
      if ($$1 != null && this.dN().ad() == csf.h && $$0.ad() == csf.j) {
         ejz $$2 = $$1.a.b(0.0, -1.0, 0.0);
         return new edu($$2, ejz.b, 90.0F, 0.0F);
      } else {
         return $$1;
      }
   }

   @Nullable
   @Override
   public bkv b(ami $$0) {
      this.cG = true;
      ami $$1 = this.z();
      agl<csf> $$2 = $$1.ad();
      if ($$2 == csf.j && $$0.ad() == csf.h) {
         this.ag();
         this.z().a(this, bkv.c.e);
         if (!this.f) {
            this.f = true;
            this.c.b(new zm(zm.e, this.cH ? 0.0F : 1.0F));
            this.cH = true;
         }

         return this;
      } else {
         eeo $$3 = $$0.B_();
         this.c.b(new aar(this.d($$0), (byte)3));
         this.c.b(new yt($$3.s(), $$3.t()));
         apy $$4 = this.d.ae();
         $$4.d(this);
         $$1.a(this, bkv.c.e);
         this.dK();
         edu $$5 = this.a($$0);
         if ($$5 != null) {
            $$1.ae().a("moving");
            if ($$2 == csf.h && $$0.ad() == csf.i) {
               this.cP = this.dl();
            } else if ($$0.ad() == csf.j) {
               this.a($$0, hx.a($$5.a));
            }

            $$1.ae().c();
            $$1.ae().a("placing");
            this.c($$0);
            this.c.a($$5.a.c, $$5.a.d, $$5.a.e, $$5.c, $$5.d);
            this.c.m();
            $$0.b(this);
            $$1.ae().c();
            this.f($$1);
            this.c.b(new aaf(this.fU()));
            $$4.a(this, $$0);
            $$4.e(this);

            for (bki $$6 : this.et()) {
               this.c.b(new ack(this.aj(), $$6));
            }

            this.c.b(new zs(1032, hx.b, 0, false));
            this.cA = -1;
            this.cx = -1.0F;
            this.cy = -1;
         }

         return this;
      }
   }

   private void a(ami $$0, hx $$1) {
      hx.a $$2 = $$1.j();

      for (int $$3 = -2; $$3 <= 2; $$3++) {
         for (int $$4 = -2; $$4 <= 2; $$4++) {
            for (int $$5 = -1; $$5 < 3; $$5++) {
               dhn $$6 = $$5 == -1 ? cvh.co.o() : cvh.a.o();
               $$0.b($$2.g($$1).e($$4, $$5, $$3), $$6);
            }
         }
      }
   }

   @Override
   protected Optional<l.a> a(ami $$0, hx $$1, boolean $$2, dje $$3) {
      Optional<l.a> $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         ib.a $$5 = this.dN().a_(this.ax).d(dai.b).orElse(ib.a.a);
         Optional<l.a> $$6 = $$0.o().a($$1, $$5);
         if ($$6.isEmpty()) {
            b.error("Unable to create a portal, likely target out of worldborder");
         }

         return $$6;
      }
   }

   private void f(ami $$0) {
      agl<csf> $$1 = $$0.ad();
      agl<csf> $$2 = this.dN().ad();
      al.v.a(this, $$1, $$2);
      if ($$1 == csf.i && $$2 == csf.h && this.cP != null) {
         al.C.a(this, this.cP);
      }

      if ($$2 != csf.i) {
         this.cP = null;
      }
   }

   @Override
   public boolean a(amj $$0) {
      if ($$0.P_()) {
         return this.K() == this;
      } else {
         return this.P_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bkv $$0, int $$1) {
      super.a($$0, $$1);
      this.bS.d();
   }

   @Override
   public Either<cdz.a, aus> a(hx $$0) {
      ib $$1 = this.dN().a_($$0).c(cza.aE);
      if (this.fE() || !this.bx()) {
         return Either.left(cdz.a.e);
      } else if (!this.dN().E_().j()) {
         return Either.left(cdz.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cdz.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cdz.a.d);
      } else {
         this.a(this.dN().ad(), $$0, this.dD(), false, true);
         if (this.dN().O()) {
            return Either.left(cdz.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               ejz $$4 = ejz.c($$0);
               List<cbn> $$5 = this.dN()
                  .a(cbn.class, new eju($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.f(this));
               if (!$$5.isEmpty()) {
                  return Either.left(cdz.a.f);
               }
            }

            Either<cdz.a, aus> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(arf.ap);
               al.q.a(this);
            });
            if (!this.z().d()) {
               this.a(uv.c("sleep.not_possible"), true);
            }

            ((ami)this.dN()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(hx $$0) {
      this.a(arf.i.b(arf.n));
      super.b($$0);
   }

   private boolean a(hx $$0, ib $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(hx $$0) {
      ejz $$1 = ejz.c($$0);
      return Math.abs(this.ds() - $$1.a()) <= 3.0 && Math.abs(this.du() - $$1.b()) <= 2.0 && Math.abs(this.dy() - $$1.c()) <= 3.0;
   }

   private boolean b(hx $$0, ib $$1) {
      hx $$2 = $$0.c();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fE()) {
         this.z().k().a(this, new yk(this, 2));
      }

      super.a($$0, $$1);
      if (this.c != null) {
         this.c.a(this.ds(), this.du(), this.dy(), this.dD(), this.dF());
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.bC();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public boolean b(bjt $$0) {
      return super.b($$0) || this.O();
   }

   @Override
   protected void a(double $$0, boolean $$1, dhn $$2, hx $$3) {
   }

   @Override
   protected void c(hx $$0) {
      if (!this.P_()) {
         super.c($$0);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.df()) {
         this.b($$3, new ejz($$0, $$1, $$2));
         hx $$4 = this.aH();
         super.a($$1, $$3, this.dN().a_($$4), $$4);
      }
   }

   @Override
   protected void M_() {
      if (this.dN().r().i()) {
         super.M_();
      }
   }

   @Override
   public void a(dgr $$0, boolean $$1) {
      this.c.b(new yq(this.dN(), $$0.aC_()));
      this.c.b(new aad($$0.aC_(), $$1));
   }

   private void gv() {
      this.de = this.de % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bje $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.bS != this.bR) {
            this.r();
         }

         this.gv();
         cgr $$1 = $$0.createMenu(this.de, this.fT(), this);
         if ($$1 == null) {
            if (this.P_()) {
               this.a(uv.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.c.b(new aac($$1.j, $$1.a(), $$0.Q_()));
            this.a($$1);
            this.bS = $$1;
            return OptionalInt.of(this.de);
         }
      }
   }

   @Override
   public void a(int $$0, cre $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.c.b(new zy($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(byv $$0, biu $$1) {
      if (this.bS != this.bR) {
         this.r();
      }

      this.gv();
      this.c.b(new zn(this.de, $$1.b(), $$0.aj()));
      this.bS = new chr(this.de, this.fT(), $$1, $$0);
      this.a(this.bS);
   }

   @Override
   public void a(clo $$0, bja $$1) {
      if ($$0.a(clr.tT)) {
         if (cnk.a($$0, this.de(), this)) {
            this.bS.d();
         }

         this.c.b(new aab($$1));
      }
   }

   @Override
   public void a(dfs $$0) {
      this.c.b(yo.a($$0, dfi::q));
   }

   @Override
   public void r() {
      this.c.b(new za(this.bS.j));
      this.s();
   }

   @Override
   public void s() {
      this.bS.b(this);
      this.bR.a(this.bS);
      this.bS = this.bR;
   }

   public void a(float $$0, float $$1, boolean $$2, boolean $$3) {
      if (this.bO()) {
         if ($$0 >= -1.0F && $$0 <= 1.0F) {
            this.bk = $$0;
         }

         if ($$1 >= -1.0F && $$1 <= 1.0F) {
            this.bm = $$1;
         }

         this.bj = $$2;
         this.f($$3);
      }
   }

   @Override
   public void a(ejz $$0) {
      double $$1 = this.ds();
      double $$2 = this.du();
      double $$3 = this.dy();
      super.a($$0);
      this.b(this.ds() - $$1, this.du() - $$2, this.dy() - $$3);
   }

   @Override
   public void t() {
      double $$0 = this.ds();
      double $$1 = this.du();
      double $$2 = this.dy();
      super.t();
      this.r(this.ds() - $$0, this.du() - $$1, this.dy() - $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (!this.bO() && !s($$0, $$1, $$2)) {
         if (this.bZ()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(arf.C, $$3);
               this.A(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(arp.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(arf.w, $$4);
               this.A(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.aZ()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(arf.s, $$5);
               this.A(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.e_()) {
            if ($$1 > 0.0) {
               this.a(arf.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aC()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.bY()) {
                  this.a(arf.r, $$6);
                  this.A(0.1F * (float)$$6 * 0.01F);
               } else if (this.bX()) {
                  this.a(arf.q, $$6);
                  this.A(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(arf.p, $$6);
                  this.A(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fx()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(arf.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(arf.v, $$8);
            }
         }
      }
   }

   private void r(double $$0, double $$1, double $$2) {
      if (this.bO() && !s($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         bkv $$4 = this.da();
         if ($$4 instanceof cfq) {
            this.a(arf.x, $$3);
         } else if ($$4 instanceof cfs) {
            this.a(arf.y, $$3);
         } else if ($$4 instanceof bxn) {
            this.a(arf.z, $$3);
         } else if ($$4 instanceof byv) {
            this.a(arf.A, $$3);
         } else if ($$4 instanceof cca) {
            this.a(arf.D, $$3);
         }
      }
   }

   private static boolean s(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(arc<?> $$0, int $$1) {
      this.cq.b(this, $$0, $$1);
      this.gi().a($$0, this.cy(), $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(arc<?> $$0) {
      this.cq.a(this, $$0, 0);
      this.gi().a($$0, this.cy(), ekx::c);
   }

   @Override
   public int a(Collection<cov<?>> $$0) {
      return this.cI.a($$0, this);
   }

   @Override
   public void a(cov<?> $$0, List<clo> $$1) {
      al.Z.a(this, $$0.a(), $$1);
   }

   @Override
   public void a(agm[] $$0) {
      List<cov<?>> $$1 = Lists.newArrayList();

      for (agm $$2 : $$0) {
         this.d.aG().a($$2).ifPresent($$1::add);
      }

      this.a($$1);
   }

   @Override
   public int b(Collection<cov<?>> $$0) {
      return this.cI.b($$0, this);
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cA = -1;
   }

   @Override
   public void u() {
      this.cL = true;
      this.bB();
      if (this.fE()) {
         this.a(true, false);
      }
   }

   public boolean v() {
      return this.cL;
   }

   @Override
   public void w() {
      this.cx = -1.0E8F;
   }

   @Override
   public void a(uv $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void x() {
      if (!this.bv.b() && this.fo()) {
         this.c.b(new zj(this, (byte)9));
         super.x();
      }
   }

   @Override
   public void a(ef.a $$0, ejz $$1) {
      super.a($$0, $$1);
      this.c.b(new aam($$0, $$1.c, $$1.d, $$1.e));
   }

   public void a(ef.a $$0, bkv $$1, ef.a $$2) {
      ejz $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.c.b(new aam($$0, $$1, $$2));
   }

   public void a(amj $$0, boolean $$1) {
      this.da = $$0.da;
      this.dd = $$0.dd;
      this.e.a($$0.e.b(), $$0.e.c());
      this.y();
      if ($$1) {
         this.fT().a($$0.fT());
         this.c($$0.ew());
         this.bT = $$0.bT;
         this.cf = $$0.cf;
         this.cg = $$0.cg;
         this.ch = $$0.ch;
         this.r($$0.fO());
         this.ax = $$0.ax;
      } else if (this.dN().Y().b(csb.d) || $$0.P_()) {
         this.fT().a($$0.fT());
         this.cf = $$0.cf;
         this.cg = $$0.cg;
         this.ch = $$0.ch;
         this.r($$0.fO());
      }

      this.ci = $$0.ci;
      this.bQ = $$0.bQ;
      this.an().b(bM, $$0.an().b(bM));
      this.cA = -1;
      this.cx = -1.0F;
      this.cy = -1;
      this.cI.a($$0.cI);
      this.cH = $$0.cH;
      this.cP = $$0.cP;
      this.cS = $$0.cS;
      this.i($$0.gk());
      this.j($$0.gl());
      this.a($$0.gs());
   }

   @Override
   protected void a(bki $$0, @Nullable bkv $$1) {
      super.a($$0, $$1);
      this.c.b(new ack(this.aj(), $$0));
      if ($$0.c() == bkk.y) {
         this.cK = this.ah;
         this.cJ = this.dl();
      }

      al.A.a(this, $$1);
   }

   @Override
   protected void a(bki $$0, boolean $$1, @Nullable bkv $$2) {
      super.a($$0, $$1, $$2);
      this.c.b(new ack(this.aj(), $$0));
      al.A.a(this, $$2);
   }

   @Override
   protected void a(bki $$0) {
      super.a($$0);
      this.c.b(new aaq(this.aj(), $$0.c()));
      if ($$0.c() == bkk.y) {
         this.cJ = null;
      }

      al.A.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.c.a($$0, $$1, $$2, this.dD(), this.dF(), blz.g);
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.c.a(this.ds() + $$0, this.du() + $$1, this.dy() + $$2, this.dD(), this.dF(), blz.f);
   }

   @Override
   public boolean a(ami $$0, double $$1, double $$2, double $$3, Set<blz> $$4, float $$5, float $$6) {
      crm $$7 = new crm(hx.a($$1, $$2, $$3));
      $$0.k().a(amn.g, $$7, 1, this.aj());
      this.ac();
      if (this.fE()) {
         this.a(true, true);
      }

      if ($$0 == this.dN()) {
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
   public void a(bkv $$0) {
      this.z().k().a(this, new yk($$0, 4));
   }

   @Override
   public void b(bkv $$0) {
      this.z().k().a(this, new yk($$0, 5));
   }

   @Override
   public void y() {
      if (this.c != null) {
         this.c.b(new aaf(this.fU()));
         this.J();
      }
   }

   public ami z() {
      return (ami)this.dN();
   }

   public boolean a(csc $$0) {
      if (!this.e.a($$0)) {
         return false;
      } else {
         this.c.b(new zm(zm.d, (float)$$0.a()));
         if ($$0 == csc.d) {
            this.gh();
            this.ac();
         } else {
            this.c(this);
         }

         this.y();
         this.fm();
         return true;
      }
   }

   @Override
   public boolean P_() {
      return this.e.b() == csc.d;
   }

   @Override
   public boolean f() {
      return this.e.b() == csc.b;
   }

   @Override
   public void a(uv $$0) {
      this.b($$0, false);
   }

   public void b(uv $$0, boolean $$1) {
      if (this.w($$1)) {
         this.c.a(new acb($$0, $$1), uf.a(() -> {
            if (this.w(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               uv $$3 = uv.b($$2).a(n.o);
               return new acb(uv.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(vk $$0, boolean $$1, ur.a $$2) {
      if (this.gw()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String A() {
      return this.c.n() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(alx $$0) {
      this.cN = $$0.b();
      this.cM = $$0.c();
      this.cC = $$0.d();
      this.cD = $$0.e();
      this.cY = $$0.h();
      this.cZ = $$0.i();
      this.an().b(bM, (byte)$$0.f());
      this.an().b(bN, (byte)$$0.g().a());
   }

   public alx B() {
      int $$0 = this.an().b(bM);
      blf $$1 = blf.d.apply(this.an().b(bN));
      return new alx(this.cN, this.cM, this.cC, this.cD, $$0, $$1, this.cY, this.cZ);
   }

   public boolean C() {
      return this.cD;
   }

   public cdx D() {
      return this.cC;
   }

   private boolean w(boolean $$0) {
      return this.cC == cdx.c ? $$0 : true;
   }

   private boolean gw() {
      return this.cC == cdx.a;
   }

   public int E() {
      return this.cM;
   }

   public void a(afn $$0) {
      this.c.b(new aav($$0.a(), $$0.d().map(afn.a::a), $$0.e()));
   }

   @Override
   protected int F() {
      return this.d.c(this.fS());
   }

   public void G() {
      this.cE = ac.b();
   }

   public arb H() {
      return this.cq;
   }

   public ara I() {
      return this.cI;
   }

   @Override
   protected void J() {
      if (this.P_()) {
         this.er();
         this.j(true);
      } else {
         super.J();
      }
   }

   public bkv K() {
      return (bkv)(this.cF == null ? this : this.cF);
   }

   @Override
   public void c(@Nullable bkv $$0) {
      bkv $$1 = this.K();
      this.cF = (bkv)($$0 == null ? this : $$0);
      if ($$1 != this.cF) {
         if (this.cF.dN() instanceof ami $$2) {
            this.a($$2, this.cF.ds(), this.cF.du(), this.cF.dy(), Set.of(), this.dD(), this.dF());
         }

         if ($$0 != null) {
            this.z().k().a(this);
         }

         this.c.b(new abc(this.cF));
         this.c.m();
      }
   }

   @Override
   protected void L() {
      if (!this.cG) {
         super.L();
      }
   }

   @Override
   public void d(bkv $$0) {
      if (this.e.b() == csc.d) {
         this.c($$0);
      } else {
         super.d($$0);
      }
   }

   public long M() {
      return this.cE;
   }

   @Nullable
   public uv N() {
      return null;
   }

   @Override
   public void a(bja $$0) {
      super.a($$0);
      this.gn();
   }

   public boolean O() {
      return this.cG;
   }

   public void P() {
      this.cG = false;
   }

   public agu Q() {
      return this.cp;
   }

   public void a(ami $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      this.c(this);
      this.ac();
      if ($$0 == this.dN()) {
         this.c.a($$1, $$2, $$3, $$4, $$5);
      } else {
         ami $$6 = this.z();
         eeo $$7 = $$0.B_();
         this.c.b(new aar(this.d($$0), (byte)3));
         this.c.b(new yt($$7.s(), $$7.t()));
         this.d.ae().d(this);
         $$6.a(this, bkv.c.e);
         this.dK();
         this.b($$1, $$2, $$3, $$4, $$5);
         this.c($$0);
         $$0.a(this);
         this.f($$6);
         this.c.a($$1, $$2, $$3, $$4, $$5);
         this.d.ae().a(this, $$0);
         this.d.ae().e(this);
      }
   }

   @Nullable
   public hx R() {
      return this.cU;
   }

   public float S() {
      return this.cW;
   }

   public agl<csf> T() {
      return this.cT;
   }

   public boolean U() {
      return this.cV;
   }

   public void a(agl<csf> $$0, @Nullable hx $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.cU) && $$0.equals(this.cT);
         if ($$4 && !$$5) {
            this.a(uv.c("block.minecraft.set_spawn"));
         }

         this.cU = $$1;
         this.cT = $$0;
         this.cW = $$2;
         this.cV = $$3;
      } else {
         this.cU = null;
         this.cT = csf.h;
         this.cW = 0.0F;
         this.cV = false;
      }
   }

   public iy V() {
      return this.cR;
   }

   public void a(iy $$0) {
      this.cR = $$0;
   }

   public alw W() {
      return this.cS;
   }

   public void a(alw $$0) {
      this.cS = $$0;
   }

   @Override
   public void a(aqu $$0, aqw $$1, float $$2, float $$3) {
      this.c.b(new aby(kc.c.d($$0), $$1, this.ds(), this.du(), this.dy(), $$2, $$3, this.ag.g()));
   }

   @Override
   public cas a(clo $$0, boolean $$1, boolean $$2) {
      cas $$3 = super.a($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dN().b($$3);
         clo $$4 = $$3.q();
         if ($$2) {
            if (!$$4.b()) {
               this.a(arf.f.b($$4.d()), $$0.L());
            }

            this.a(arf.F);
         }

         return $$3;
      }
   }

   public anm X() {
      return this.cX;
   }

   public void c(ami $$0) {
      this.a((csf)$$0);
      this.e.a($$0);
   }

   @Nullable
   private static csc a(@Nullable sd $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? csc.a($$0.h($$1)) : null;
   }

   private csc b(@Nullable csc $$0) {
      csc $$1 = this.d.bb();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.d.v_();
      }
   }

   @Override
   public void c(@Nullable sd $$0) {
      this.e.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void k(sd $$0) {
      $$0.a("playerGameType", this.e.b().a());
      csc $$1 = this.e.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean Y() {
      return this.cY;
   }

   public boolean b(amj $$0) {
      return $$0 == this ? false : this.cY || $$0.cY;
   }

   @Override
   public boolean a(csf $$0, hx $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(clo $$0) {
      al.T.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cdy $$1 = this.fT();
      clo $$2 = $$1.a($$0);
      this.bS.b($$1, $$1.l).ifPresent($$1x -> this.bS.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean Z() {
      return this.cZ;
   }

   @Override
   public Optional<cdf> aa() {
      return Optional.of(this.da);
   }

   @Override
   public void a(cas $$0) {
      super.a($$0);
      bkv $$1 = $$0.w();
      if ($$1 != null) {
         al.P.a(this, $$0.q(), $$1);
      }
   }

   public void a(vm $$0) {
      this.dd = $$0;
   }

   @Nullable
   public vm ab() {
      return this.dd != null && this.dd.b() ? null : this.dd;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cl = (float)(atq.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dD());
      this.c.b(new zo(this));
   }

   @Override
   public boolean a(bkv $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         $$0.i(this);
         this.c.a(this.ds(), this.du(), this.dy(), this.dD(), this.dF());
         if ($$0 instanceof bll $$2) {
            for (bki $$3 : $$2.et()) {
               this.c.b(new ack($$0.aj(), $$3));
            }
         }

         return true;
      }
   }

   @Override
   public void ac() {
      bkv $$0 = this.da();
      super.ac();
      if ($$0 instanceof bll $$1) {
         for (bki $$2 : $$1.et()) {
            this.c.b(new aaq($$0.aj(), $$2.c()));
         }
      }
   }

   public acm d(ami $$0) {
      return new acm($$0.ab(), $$0.ad(), ctf.a($$0.B()), this.e.b(), this.e.c(), $$0.ag(), $$0.A(), this.gs(), this.av());
   }
}
