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

public class alr extends ccx {
   private static final Logger b = LogUtils.getLogger();
   private static final int cm = 32;
   private static final int cn = 10;
   public amp c;
   public final MinecraftServer d;
   public final als e;
   private final age co;
   private final aqj cp;
   private float cq = Float.MIN_VALUE;
   private int cr = Integer.MIN_VALUE;
   private int cs = Integer.MIN_VALUE;
   private int ct = Integer.MIN_VALUE;
   private int cu = Integer.MIN_VALUE;
   private int cv = Integer.MIN_VALUE;
   private float cw = -1.0E8F;
   private int cx = -99999999;
   private boolean cy = true;
   private int cz = -99999999;
   private int cA = 60;
   private ccv cB = ccv.a;
   private boolean cC = true;
   private long cD = ac.b();
   @Nullable
   private bjt cE;
   private boolean cF;
   private boolean cG;
   private final aqi cH = new aqi();
   @Nullable
   private eif cI;
   private int cJ;
   private boolean cK;
   private int cL = 2;
   private String cM = "en_us";
   @Nullable
   private eif cN;
   @Nullable
   private eif cO;
   @Nullable
   private eif cP;
   private iu cQ = iu.a(0, 0, 0);
   private ale cR = ale.a;
   private afv<cqz> cS = cqz.h;
   @Nullable
   private ht cT;
   private boolean cU;
   private float cV;
   private final amu cW;
   private boolean cX;
   private boolean cY;
   private ccd cZ = new ccd(0, 0, 0);
   private final cgc da = new cgc() {
      @Override
      public void a(cfp $$0, il<ckj> $$1, ckj $$2, int[] $$3) {
         alr.this.c.b(new yo($$0.j, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cfp $$0, int $$1, ckj $$2) {
         alr.this.c.b(new yq($$0.j, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cfp $$0, ckj $$1) {
         alr.this.c.b(new yq(-1, $$0.k(), -1, $$1));
      }

      @Override
      public void a(cfp $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cfp $$0, int $$1, int $$2) {
         alr.this.c.b(new yp($$0.j, $$1, $$2));
      }
   };
   private final cgb db = new cgb() {
      @Override
      public void a(cfp $$0, int $$1, ckj $$2) {
         chh $$3 = $$0.b($$1);
         if (!($$3 instanceof chd)) {
            if ($$3.d == alr.this.fS()) {
               al.e.a(alr.this, alr.this.fS(), $$2);
            }
         }
      }

      @Override
      public void a(cfp $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private uz dc;
   private int dd;
   public boolean f;

   public alr(MinecraftServer $$0, alq $$1, GameProfile $$2, alf $$3) {
      super($$1, $$1.R(), $$1.S(), $$2);
      this.cW = $$0.a(this);
      this.e = $$0.b(this);
      this.d = $$0;
      this.cp = $$0.ac().a((ccx)this);
      this.co = $$0.ac().f(this);
      this.t(1.0F);
      this.e($$1);
      this.a($$3);
   }

   private void e(alq $$0) {
      ht $$1 = $$0.R();
      if ($$0.D_().g() && $$0.n().aT().m() != cqw.c) {
         int $$2 = Math.max(0, this.d.a($$0));
         int $$3 = asy.a($$0.C_().b((double)$$1.u(), (double)$$1.w()));
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
         int $$8 = ate.a().a($$6);

         for (int $$9 = 0; $$9 < $$6; $$9++) {
            int $$10 = ($$8 + $$7 * $$9) % $$6;
            int $$11 = $$10 % ($$2 * 2 + 1);
            int $$12 = $$10 / ($$2 * 2 + 1);
            ht $$13 = all.a($$0, $$1.u() + $$11 - $$2, $$1.w() + $$12 - $$2);
            if ($$13 != null) {
               this.a($$13, 0.0F, 0.0F);
               if ($$0.g(this)) {
                  break;
               }
            }
         }
      } else {
         this.a($$1, 0.0F, 0.0F);

         while (!$$0.g(this) && this.ds() < (double)($$0.aj() - 1)) {
            this.e(this.dq(), this.ds() + 1.0, this.dw());
         }
      }
   }

   private int u(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         ccd.a.parse(new Dynamic(sf.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(b::error).ifPresent($$0x -> this.cZ = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         rt $$1 = $$0.p("enteredNetherPosition");
         this.cO = new eif($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.cG = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cH.a($$0.p("recipeBook"), this.d.aE());
      }

      if (this.fD()) {
         this.fE();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.cT = new ht($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.cU = $$0.q("SpawnForced");
         this.cV = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.cS = cqz.g.parse(sf.a, $$0.c("SpawnDimension")).resultOrPartial(b::error).orElse(cqz.h);
         }
      }
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      ccd.a.encodeStart(sf.a, this.cZ).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.cG);
      if (this.cO != null) {
         rt $$1 = new rt();
         $$1.a("x", this.cO.c);
         $$1.a("y", this.cO.d);
         $$1.a("z", this.cO.e);
         $$0.a("enteredNetherPosition", $$1);
      }

      bjt $$2 = this.cV();
      bjt $$3 = this.cY();
      if ($$3 != null && $$2 != this && $$2.cU()) {
         rt $$4 = new rt();
         rt $$5 = new rt();
         $$2.e($$5);
         $$4.a("Attach", $$3.cv());
         $$4.a("Entity", $$5);
         $$0.a("RootVehicle", $$4);
      }

      $$0.a("recipeBook", this.cH.b());
      $$0.a("Dimension", this.dL().ac().a().toString());
      if (this.cT != null) {
         $$0.a("SpawnX", this.cT.u());
         $$0.a("SpawnY", this.cT.v());
         $$0.a("SpawnZ", this.cT.w());
         $$0.a("SpawnForced", this.cU);
         $$0.a("SpawnAngle", this.cV);
         afw.a.encodeStart(sf.a, this.cS.a()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gb();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.ch = asy.a((float)$$0 / $$1, 0.0F, $$2);
      this.cz = -1;
   }

   public void b(int $$0) {
      this.cf = $$0;
      this.cz = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cz = -1;
   }

   @Override
   public void a(ckj $$0, int $$1) {
      super.a($$0, $$1);
      this.cz = -1;
   }

   private void a(cfp $$0) {
      $$0.a(this.db);
      $$0.a(this.da);
   }

   public void h() {
      this.a(this.bR);
   }

   @Override
   public void f_() {
      super.f_();
      this.c.b(new zv());
   }

   @Override
   public void g_() {
      super.g_();
      this.c.b(new zu(this.eJ()));
   }

   @Override
   protected void a(dgb $$0) {
      al.d.a(this, $$0);
   }

   @Override
   protected ckf k() {
      return new cle(this);
   }

   @Override
   public void l() {
      this.e.a();
      this.cZ.a();
      this.cA--;
      if (this.al > 0) {
         this.al--;
      }

      this.bS.d();
      if (!this.dL().B && !this.bS.a(this)) {
         this.q();
         this.bS = this.bR;
      }

      bjt $$0 = this.I();
      if ($$0 != this) {
         if ($$0.bv()) {
            this.a($$0.dq(), $$0.ds(), $$0.dw(), $$0.dB(), $$0.dD());
            this.x().k().a(this);
            if (this.fJ()) {
               this.c(this);
            }
         } else {
            this.c(this);
         }
      }

      al.w.a(this);
      if (this.cI != null) {
         al.u.a(this, this.cI, this.ah - this.cJ);
      }

      this.o();
      this.p();
      this.co.b(this);
   }

   public void m() {
      try {
         if (!this.N_() || !this.dd()) {
            super.l();
         }

         for (int $$0 = 0; $$0 < this.fS().b(); $$0++) {
            ckj $$1 = this.fS().a($$0);
            if ($$1.d().ak_()) {
               wb<?> $$2 = ((cio)$$1.d()).a($$1, this.dL(), this);
               if ($$2 != null) {
                  this.c.b($$2);
               }
            }
         }

         if (this.eu() != this.cw || this.cx != this.bT.a() || this.bT.e() == 0.0F != this.cy) {
            this.c.b(new aba(this.eu(), this.bT.a(), this.bT.e()));
            this.cw = this.eu();
            this.cx = this.bT.a();
            this.cy = this.bT.e() == 0.0F;
         }

         if (this.eu() + this.fk() != this.cq) {
            this.cq = this.eu() + this.fk();
            this.a(ejh.f, asy.f(this.cq));
         }

         if (this.bT.a() != this.cr) {
            this.cr = this.bT.a();
            this.a(ejh.g, asy.f((float)this.cr));
         }

         if (this.ch() != this.cs) {
            this.cs = this.ch();
            this.a(ejh.h, asy.f((float)this.cs));
         }

         if (this.eI() != this.ct) {
            this.ct = this.eI();
            this.a(ejh.i, asy.f((float)this.ct));
         }

         if (this.cg != this.cv) {
            this.cv = this.cg;
            this.a(ejh.j, asy.f((float)this.cv));
         }

         if (this.cf != this.cu) {
            this.cu = this.cf;
            this.a(ejh.k, asy.f((float)this.cu));
         }

         if (this.cg != this.cz) {
            this.cz = this.cg;
            this.c.b(new aaz(this.ch, this.cg, this.cf));
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
      if (this.eu() > 0.0F && this.cN != null) {
         al.U.a(this, this.cN);
      }

      this.cN = null;
      super.n();
   }

   public void o() {
      if (this.ab > 0.0F && this.cN == null) {
         this.cN = this.dj();
      }
   }

   public void p() {
      if (this.cY() != null && this.cY().bl()) {
         if (this.cP == null) {
            this.cP = this.dj();
         } else {
            al.V.a(this, this.cP);
         }
      }

      if (this.cP != null && (this.cY() == null || !this.cY().bl())) {
         this.cP = null;
      }
   }

   private void a(ejh $$0, int $$1) {
      this.gh().a($$0, this.cx(), $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(bir $$0) {
      this.a(dkl.p);
      boolean $$1 = this.dL().X().b(cqv.m);
      if ($$1) {
         ui $$2 = this.eJ().a();
         this.c.a(new zw(this.ah(), $$2), ts.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            ui $$3x = ui.a("death.attack.message_too_long", ui.b($$2x).a(n.o));
            ui $$4x = ui.a("death.attack.even_more_magic", this.O_()).a($$1xx -> $$1xx.a(new uo(uo.a.a, $$3x)));
            return new zw(this.ah(), $$4x);
         }));
         ejg $$3 = this.cf();
         if ($$3 == null || $$3.k() == ejg.b.a) {
            this.d.ac().a($$2, false);
         } else if ($$3.k() == ejg.b.c) {
            this.d.ac().a(this, $$2);
         } else if ($$3.k() == ejg.b.d) {
            this.d.ac().b(this, $$2);
         }
      } else {
         this.c.b(new zw(this.ah(), uh.a));
      }

      this.gg();
      if (this.dL().X().b(cqv.K)) {
         this.gs();
      }

      if (!this.N_()) {
         this.g($$0);
      }

      this.gh().a(ejh.c, this.cx(), ejd::a);
      bkj $$4 = this.eK();
      if ($$4 != null) {
         this.b(aqn.h.b($$4.ag()));
         $$4.a(this, this.bh, $$0);
         this.f($$4);
      }

      this.dL().a(this, (byte)3);
      this.a(aqn.N);
      this.a(aqn.i.b(aqn.m));
      this.a(aqn.i.b(aqn.n));
      this.ay();
      this.k(0);
      this.a_(false);
      this.eJ().c();
      this.a(Optional.of(ia.a(this.dL().ac(), this.dl())));
   }

   private void gs() {
      eia $$0 = new eia(this.dl()).c(32.0, 10.0, 32.0);
      this.dL().a(bkl.class, $$0, bjw.f).stream().filter($$0x -> $$0x instanceof bkq).forEach($$0x -> ((bkq)$$0x).a_((ccx)this));
   }

   @Override
   public void a(bjt $$0, int $$1, bir $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.s($$1);
         String $$3 = this.cx();
         String $$4 = $$0.cx();
         this.gh().a(ejh.e, $$3, ejd::a);
         if ($$0 instanceof ccx) {
            this.a(aqn.Q);
            this.gh().a(ejh.d, $$3, ejd::a);
         } else {
            this.a(aqn.O);
         }

         this.a($$3, $$4, ejh.l);
         this.a($$4, $$3, ejh.m);
         al.b.a(this, $$0, $$2);
      }
   }

   private void a(String $$0, String $$1, ejh[] $$2) {
      ejc $$3 = this.gh().g($$1);
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gh().a($$2[$$4], $$0, ejd::a);
         }
      }
   }

   @Override
   public boolean a(bir $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.d.l() && this.gt() && $$0.a(aqu.m);
         if (!$$2 && this.cA > 0 && !$$0.a(aqu.d)) {
            return false;
         } else {
            bjt $$3 = $$0.d();
            if ($$3 instanceof ccx $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof cdd $$5 && $$5.v() instanceof ccx $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(ccx $$0) {
      return !this.gt() ? false : super.a($$0);
   }

   private boolean gt() {
      return this.d.Y();
   }

   @Nullable
   @Override
   protected ecb a(alq $$0) {
      ecb $$1 = super.a($$0);
      if ($$1 != null && this.dL().ac() == cqz.h && $$0.ac() == cqz.j) {
         eif $$2 = $$1.a.b(0.0, -1.0, 0.0);
         return new ecb($$2, eif.b, 90.0F, 0.0F);
      } else {
         return $$1;
      }
   }

   @Nullable
   @Override
   public bjt b(alq $$0) {
      this.cF = true;
      alq $$1 = this.x();
      afv<cqz> $$2 = $$1.ac();
      if ($$2 == cqz.j && $$0.ac() == cqz.h) {
         this.ae();
         this.x().a(this, bjt.c.e);
         if (!this.f) {
            this.f = true;
            this.c.b(new yz(yz.e, this.cG ? 0.0F : 1.0F));
            this.cG = true;
         }

         return this;
      } else {
         ecv $$3 = $$0.A_();
         this.c.b(new aae(this.d($$0), (byte)3));
         this.c.b(new yg($$3.s(), $$3.t()));
         apg $$4 = this.d.ac();
         $$4.d(this);
         $$1.a(this, bjt.c.e);
         this.dI();
         ecb $$5 = this.a($$0);
         if ($$5 != null) {
            $$1.ad().a("moving");
            if ($$2 == cqz.h && $$0.ac() == cqz.i) {
               this.cO = this.dj();
            } else if ($$0.ac() == cqz.j) {
               this.a($$0, ht.a($$5.a));
            }

            $$1.ad().c();
            $$1.ad().a("placing");
            this.c($$0);
            this.c.a($$5.a.c, $$5.a.d, $$5.a.e, $$5.c, $$5.d);
            this.c.m();
            $$0.b(this);
            $$1.ad().c();
            this.f($$1);
            this.c.b(new zs(this.fT()));
            $$4.a(this, $$0);
            $$4.e(this);

            for (bjg $$6 : this.er()) {
               this.c.b(new abv(this.ah(), $$6));
            }

            this.c.b(new zf(1032, ht.b, 0, false));
            this.cz = -1;
            this.cw = -1.0F;
            this.cx = -1;
         }

         return this;
      }
   }

   private void a(alq $$0, ht $$1) {
      ht.a $$2 = $$1.j();

      for (int $$3 = -2; $$3 <= 2; $$3++) {
         for (int $$4 = -2; $$4 <= 2; $$4++) {
            for (int $$5 = -1; $$5 < 3; $$5++) {
               dgb $$6 = $$5 == -1 ? cuc.co.o() : cuc.a.o();
               $$0.b($$2.g($$1).e($$4, $$5, $$3), $$6);
            }
         }
      }
   }

   @Override
   protected Optional<l.a> a(alq $$0, ht $$1, boolean $$2, dhs $$3) {
      Optional<l.a> $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         hx.a $$5 = this.dL().a_(this.ax).d(czc.b).orElse(hx.a.a);
         Optional<l.a> $$6 = $$0.o().a($$1, $$5);
         if ($$6.isEmpty()) {
            b.error("Unable to create a portal, likely target out of worldborder");
         }

         return $$6;
      }
   }

   private void f(alq $$0) {
      afv<cqz> $$1 = $$0.ac();
      afv<cqz> $$2 = this.dL().ac();
      al.v.a(this, $$1, $$2);
      if ($$1 == cqz.i && $$2 == cqz.h && this.cO != null) {
         al.C.a(this, this.cO);
      }

      if ($$2 != cqz.i) {
         this.cO = null;
      }
   }

   @Override
   public boolean a(alr $$0) {
      if ($$0.N_()) {
         return this.I() == this;
      } else {
         return this.N_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bjt $$0, int $$1) {
      super.a($$0, $$1);
      this.bS.d();
   }

   @Override
   public Either<ccx.a, atz> a(ht $$0) {
      hx $$1 = this.dL().a_($$0).c(cxu.aE);
      if (this.fD() || !this.bv()) {
         return Either.left(ccx.a.e);
      } else if (!this.dL().D_().j()) {
         return Either.left(ccx.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(ccx.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(ccx.a.d);
      } else {
         this.a(this.dL().ac(), $$0, this.dB(), false, true);
         if (this.dL().N()) {
            return Either.left(ccx.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               eif $$4 = eif.c($$0);
               List<cal> $$5 = this.dL()
                  .a(cal.class, new eia($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.f(this));
               if (!$$5.isEmpty()) {
                  return Either.left(ccx.a.f);
               }
            }

            Either<ccx.a, atz> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(aqn.ap);
               al.q.a(this);
            });
            if (!this.x().d()) {
               this.a(ui.c("sleep.not_possible"), true);
            }

            ((alq)this.dL()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(ht $$0) {
      this.a(aqn.i.b(aqn.n));
      super.b($$0);
   }

   private boolean a(ht $$0, hx $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(ht $$0) {
      eif $$1 = eif.c($$0);
      return Math.abs(this.dq() - $$1.a()) <= 3.0 && Math.abs(this.ds() - $$1.b()) <= 2.0 && Math.abs(this.dw() - $$1.c()) <= 3.0;
   }

   private boolean b(ht $$0, hx $$1) {
      ht $$2 = $$0.c();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fD()) {
         this.x().k().a(this, new xx(this, 2));
      }

      super.a($$0, $$1);
      if (this.c != null) {
         this.c.a(this.dq(), this.ds(), this.dw(), this.dB(), this.dD());
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.bB();
      this.e($$0, $$1, $$2);
   }

   @Override
   public boolean b(bir $$0) {
      return super.b($$0) || this.M();
   }

   @Override
   protected void a(double $$0, boolean $$1, dgb $$2, ht $$3) {
   }

   @Override
   protected void c(ht $$0) {
      if (!this.N_()) {
         super.c($$0);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.dd()) {
         this.b($$3, new eif($$0, $$1, $$2));
         ht $$4 = this.aF();
         super.a($$1, $$3, this.dL().a_($$4), $$4);
      }
   }

   @Override
   public void a(dff $$0, boolean $$1) {
      this.c.b(new yd(this.dL(), $$0.p()));
      this.c.b(new zq($$0.p(), $$1));
   }

   private void gu() {
      this.dd = this.dd % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bie $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.bS != this.bR) {
            this.q();
         }

         this.gu();
         cfp $$1 = $$0.createMenu(this.dd, this.fS(), this);
         if ($$1 == null) {
            if (this.N_()) {
               this.a(ui.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.c.b(new zp($$1.j, $$1.a(), $$0.O_()));
            this.a($$1);
            this.bS = $$1;
            return OptionalInt.of(this.dd);
         }
      }
   }

   @Override
   public void a(int $$0, cpy $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.c.b(new zl($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(bxt $$0, bhu $$1) {
      if (this.bS != this.bR) {
         this.q();
      }

      this.gu();
      this.c.b(new za(this.dd, $$1.b(), $$0.ah()));
      this.bS = new cgn(this.dd, this.fS(), $$1, $$0);
      this.a(this.bS);
   }

   @Override
   public void a(ckj $$0, bia $$1) {
      if ($$0.a(ckm.th)) {
         if (cmf.a($$0, this.dc(), this)) {
            this.bS.d();
         }

         this.c.b(new zo($$1));
      }
   }

   @Override
   public void a(deh $$0) {
      this.c.b(yb.a($$0, ddx::o));
   }

   @Override
   public void q() {
      this.c.b(new yn(this.bS.j));
      this.r();
   }

   @Override
   public void r() {
      this.bS.b(this);
      this.bR.a(this.bS);
      this.bS = this.bR;
   }

   public void a(float $$0, float $$1, boolean $$2, boolean $$3) {
      if (this.bN()) {
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
   public void a(aqk<?> $$0, int $$1) {
      this.cp.b(this, $$0, $$1);
      this.gh().a($$0, this.cx(), $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(aqk<?> $$0) {
      this.cp.a(this, $$0, 0);
      this.gh().a($$0, this.cx(), ejd::c);
   }

   @Override
   public int a(Collection<cno<?>> $$0) {
      return this.cH.a($$0, this);
   }

   @Override
   public void a(cno<?> $$0, List<ckj> $$1) {
      al.Z.a(this, $$0.a(), $$1);
   }

   @Override
   public void a(afw[] $$0) {
      List<cno<?>> $$1 = Lists.newArrayList();

      for (afw $$2 : $$0) {
         this.d.aE().a($$2).ifPresent($$1::add);
      }

      this.a($$1);
   }

   @Override
   public int b(Collection<cno<?>> $$0) {
      return this.cH.b($$0, this);
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cz = -1;
   }

   @Override
   public void s() {
      this.cK = true;
      this.bA();
      if (this.fD()) {
         this.a(true, false);
      }
   }

   public boolean t() {
      return this.cK;
   }

   public void u() {
      this.cw = -1.0E8F;
   }

   @Override
   public void a(ui $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void ae_() {
      if (!this.bv.b() && this.fn()) {
         this.c.b(new yw(this, (byte)9));
         super.ae_();
      }
   }

   @Override
   public void a(ef.a $$0, eif $$1) {
      super.a($$0, $$1);
      this.c.b(new zz($$0, $$1.c, $$1.d, $$1.e));
   }

   public void a(ef.a $$0, bjt $$1, ef.a $$2) {
      eif $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.c.b(new zz($$0, $$1, $$2));
   }

   public void a(alr $$0, boolean $$1) {
      this.cZ = $$0.cZ;
      this.dc = $$0.dc;
      this.e.a($$0.e.b(), $$0.e.c());
      this.w();
      if ($$1) {
         this.fS().a($$0.fS());
         this.c($$0.eu());
         this.bT = $$0.bT;
         this.cf = $$0.cf;
         this.cg = $$0.cg;
         this.ch = $$0.ch;
         this.r($$0.fN());
         this.ax = $$0.ax;
      } else if (this.dL().X().b(cqv.d) || $$0.N_()) {
         this.fS().a($$0.fS());
         this.cf = $$0.cf;
         this.cg = $$0.cg;
         this.ch = $$0.ch;
         this.r($$0.fN());
      }

      this.ci = $$0.ci;
      this.bQ = $$0.bQ;
      this.al().b(bM, $$0.al().b(bM));
      this.cz = -1;
      this.cw = -1.0F;
      this.cx = -1;
      this.cH.a($$0.cH);
      this.cG = $$0.cG;
      this.cO = $$0.cO;
      this.cR = $$0.cR;
      this.i($$0.gj());
      this.j($$0.gk());
      this.a($$0.gr());
   }

   @Override
   protected void a(bjg $$0, @Nullable bjt $$1) {
      super.a($$0, $$1);
      this.c.b(new abv(this.ah(), $$0));
      if ($$0.c() == bji.y) {
         this.cJ = this.ah;
         this.cI = this.dj();
      }

      al.A.a(this, $$1);
   }

   @Override
   protected void a(bjg $$0, boolean $$1, @Nullable bjt $$2) {
      super.a($$0, $$1, $$2);
      this.c.b(new abv(this.ah(), $$0));
      al.A.a(this, $$2);
   }

   @Override
   protected void a(bjg $$0) {
      super.a($$0);
      this.c.b(new aad(this.ah(), $$0.c()));
      if ($$0.c() == bji.y) {
         this.cI = null;
      }

      al.A.a(this, null);
   }

   @Override
   public void b(double $$0, double $$1, double $$2) {
      this.c.a($$0, $$1, $$2, this.dB(), this.dD(), bkx.g);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.c.a(this.dq() + $$0, this.ds() + $$1, this.dw() + $$2, this.dB(), this.dD(), bkx.f);
   }

   @Override
   public boolean a(alq $$0, double $$1, double $$2, double $$3, Set<bkx> $$4, float $$5, float $$6) {
      cqg $$7 = new cqg(ht.a($$1, $$2, $$3));
      $$0.k().a(alv.g, $$7, 1, this.ah());
      this.aa();
      if (this.fD()) {
         this.a(true, true);
      }

      if ($$0 == this.dL()) {
         this.c.a($$1, $$2, $$3, $$5, $$6, $$4);
      } else {
         this.a($$0, $$1, $$2, $$3, $$5, $$6);
      }

      this.n($$5);
      return true;
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      super.d($$0, $$1, $$2);
      this.c.m();
   }

   @Override
   public void a(bjt $$0) {
      this.x().k().a(this, new xx($$0, 4));
   }

   @Override
   public void b(bjt $$0) {
      this.x().k().a(this, new xx($$0, 5));
   }

   @Override
   public void w() {
      if (this.c != null) {
         this.c.b(new zs(this.fT()));
         this.H();
      }
   }

   public alq x() {
      return (alq)this.dL();
   }

   public boolean a(cqw $$0) {
      if (!this.e.a($$0)) {
         return false;
      } else {
         this.c.b(new yz(yz.d, (float)$$0.a()));
         if ($$0 == cqw.d) {
            this.gg();
            this.aa();
         } else {
            this.c(this);
         }

         this.w();
         this.fl();
         return true;
      }
   }

   @Override
   public boolean N_() {
      return this.e.b() == cqw.d;
   }

   @Override
   public boolean f() {
      return this.e.b() == cqw.b;
   }

   @Override
   public void a(ui $$0) {
      this.b($$0, false);
   }

   public void b(ui $$0, boolean $$1) {
      if (this.w($$1)) {
         this.c.a(new abo($$0, $$1), ts.a(() -> {
            if (this.w(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               ui $$3 = ui.b($$2).a(n.o);
               return new abo(ui.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(ux $$0, boolean $$1, ue.a $$2) {
      if (this.gv()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String y() {
      return this.c.n() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(alf $$0) {
      this.cM = $$0.b();
      this.cL = $$0.c();
      this.cB = $$0.d();
      this.cC = $$0.e();
      this.cX = $$0.h();
      this.cY = $$0.i();
      this.al().b(bM, (byte)$$0.f());
      this.al().b(bN, (byte)$$0.g().a());
   }

   public alf z() {
      int $$0 = this.al().b(bM);
      bkd $$1 = bkd.d.apply(this.al().b(bN));
      return new alf(this.cM, this.cL, this.cB, this.cC, $$0, $$1, this.cX, this.cY);
   }

   public boolean A() {
      return this.cC;
   }

   public ccv B() {
      return this.cB;
   }

   private boolean w(boolean $$0) {
      return this.cB == ccv.c ? $$0 : true;
   }

   private boolean gv() {
      return this.cB == ccv.a;
   }

   public int C() {
      return this.cL;
   }

   public void a(aex $$0) {
      this.c.b(new aai($$0.a(), $$0.d().map(aex.a::a), $$0.e()));
   }

   @Override
   protected int D() {
      return this.d.c(this.fR());
   }

   public void E() {
      this.cD = ac.b();
   }

   public aqj F() {
      return this.cp;
   }

   public aqi G() {
      return this.cH;
   }

   @Override
   protected void H() {
      if (this.N_()) {
         this.ep();
         this.j(true);
      } else {
         super.H();
      }
   }

   public bjt I() {
      return (bjt)(this.cE == null ? this : this.cE);
   }

   @Override
   public void c(@Nullable bjt $$0) {
      bjt $$1 = this.I();
      this.cE = (bjt)($$0 == null ? this : $$0);
      if ($$1 != this.cE) {
         if (this.cE.dL() instanceof alq $$2) {
            this.a($$2, this.cE.dq(), this.cE.ds(), this.cE.dw(), Set.of(), this.dB(), this.dD());
         }

         if ($$0 != null) {
            this.x().k().a(this);
         }

         this.c.b(new aap(this.cE));
         this.c.m();
      }
   }

   @Override
   protected void J() {
      if (!this.cF) {
         super.J();
      }
   }

   @Override
   public void d(bjt $$0) {
      if (this.e.b() == cqw.d) {
         this.c($$0);
      } else {
         super.d($$0);
      }
   }

   public long K() {
      return this.cD;
   }

   @Nullable
   public ui L() {
      return null;
   }

   @Override
   public void a(bia $$0) {
      super.a($$0);
      this.gm();
   }

   public boolean M() {
      return this.cF;
   }

   public void N() {
      this.cF = false;
   }

   public age O() {
      return this.co;
   }

   public void a(alq $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      this.c(this);
      this.aa();
      if ($$0 == this.dL()) {
         this.c.a($$1, $$2, $$3, $$4, $$5);
      } else {
         alq $$6 = this.x();
         ecv $$7 = $$0.A_();
         this.c.b(new aae(this.d($$0), (byte)3));
         this.c.b(new yg($$7.s(), $$7.t()));
         this.d.ac().d(this);
         $$6.a(this, bjt.c.e);
         this.dI();
         this.b($$1, $$2, $$3, $$4, $$5);
         this.c($$0);
         $$0.a(this);
         this.f($$6);
         this.c.a($$1, $$2, $$3, $$4, $$5);
         this.d.ac().a(this, $$0);
         this.d.ac().e(this);
      }
   }

   @Nullable
   public ht P() {
      return this.cT;
   }

   public float Q() {
      return this.cV;
   }

   public afv<cqz> R() {
      return this.cS;
   }

   public boolean S() {
      return this.cU;
   }

   public void a(afv<cqz> $$0, @Nullable ht $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.cT) && $$0.equals(this.cS);
         if ($$4 && !$$5) {
            this.a(ui.c("block.minecraft.set_spawn"));
         }

         this.cT = $$1;
         this.cS = $$0;
         this.cV = $$2;
         this.cU = $$3;
      } else {
         this.cT = null;
         this.cS = cqz.h;
         this.cV = 0.0F;
         this.cU = false;
      }
   }

   public iu T() {
      return this.cQ;
   }

   public void a(iu $$0) {
      this.cQ = $$0;
   }

   public ale U() {
      return this.cR;
   }

   public void a(ale $$0) {
      this.cR = $$0;
   }

   @Override
   public void a(aqc $$0, aqe $$1, float $$2, float $$3) {
      this.c.b(new abl(jy.c.d($$0), $$1, this.dq(), this.ds(), this.dw(), $$2, $$3, this.ag.g()));
   }

   @Override
   public bzq a(ckj $$0, boolean $$1, boolean $$2) {
      bzq $$3 = super.a($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dL().b($$3);
         ckj $$4 = $$3.q();
         if ($$2) {
            if (!$$4.b()) {
               this.a(aqn.f.b($$4.d()), $$0.L());
            }

            this.a(aqn.F);
         }

         return $$3;
      }
   }

   public amu V() {
      return this.cW;
   }

   public void c(alq $$0) {
      this.a((cqz)$$0);
      this.e.a($$0);
   }

   @Nullable
   private static cqw a(@Nullable rt $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? cqw.a($$0.h($$1)) : null;
   }

   private cqw b(@Nullable cqw $$0) {
      cqw $$1 = this.d.aW();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.d.u_();
      }
   }

   @Override
   public void c(@Nullable rt $$0) {
      this.e.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void k(rt $$0) {
      $$0.a("playerGameType", this.e.b().a());
      cqw $$1 = this.e.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean W() {
      return this.cX;
   }

   public boolean b(alr $$0) {
      return $$0 == this ? false : this.cX || $$0.cX;
   }

   @Override
   public boolean a(cqz $$0, ht $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(ckj $$0) {
      al.T.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      ccw $$1 = this.fS();
      ckj $$2 = $$1.a($$0);
      this.bS.b($$1, $$1.l).ifPresent($$1x -> this.bS.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean X() {
      return this.cY;
   }

   @Override
   public Optional<ccd> Y() {
      return Optional.of(this.cZ);
   }

   @Override
   public void a(bzq $$0) {
      super.a($$0);
      bjt $$1 = $$0.v();
      if ($$1 != null) {
         al.P.a(this, $$0.q(), $$1);
      }
   }

   public void a(uz $$0) {
      this.dc = $$0;
   }

   @Nullable
   public uz Z() {
      return this.dc != null && this.dc.b() ? null : this.dc;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cl = (float)(asy.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dB());
      this.c.b(new zb(this));
   }

   @Override
   public boolean a(bjt $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         $$0.i(this);
         this.c.a(this.dq(), this.ds(), this.dw(), this.dB(), this.dD());
         if ($$0 instanceof bkj $$2) {
            for (bjg $$3 : $$2.er()) {
               this.c.b(new abv($$0.ah(), $$3));
            }
         }

         return true;
      }
   }

   @Override
   public void aa() {
      bjt $$0 = this.cY();
      super.aa();
      if ($$0 instanceof bkj $$1) {
         for (bjg $$2 : $$1.er()) {
            this.c.b(new aad($$0.ah(), $$2.c()));
         }
      }
   }

   public abx d(alq $$0) {
      return new abx($$0.aa(), $$0.ac(), crz.a($$0.A()), this.e.b(), this.e.c(), $$0.af(), $$0.z(), this.gr(), this.at());
   }
}
