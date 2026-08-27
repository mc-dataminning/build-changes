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

public class amb extends cdm {
   private static final Logger b = LogUtils.getLogger();
   private static final int cm = 32;
   private static final int cn = 10;
   public amz c;
   public final MinecraftServer d;
   public final amc e;
   private final ago co;
   private final aqt cp;
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
   private cdk cB = cdk.a;
   private boolean cC = true;
   private long cD = ac.b();
   @Nullable
   private bki cE;
   private boolean cF;
   private boolean cG;
   private final aqs cH = new aqs();
   @Nullable
   private eji cI;
   private int cJ;
   private boolean cK;
   private int cL = 2;
   private String cM = "en_us";
   @Nullable
   private eji cN;
   @Nullable
   private eji cO;
   @Nullable
   private eji cP;
   private iu cQ = iu.a(0, 0, 0);
   private alo cR = alo.a;
   private agf<crs> cS = crs.h;
   @Nullable
   private ht cT;
   private boolean cU;
   private float cV;
   private final ane cW;
   private boolean cX;
   private boolean cY;
   private ccs cZ = new ccs(0, 0, 0);
   private final cgr da = new cgr() {
      @Override
      public void a(cge $$0, il<clb> $$1, clb $$2, int[] $$3) {
         amb.this.c.b(new yx($$0.j, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cge $$0, int $$1, clb $$2) {
         amb.this.c.b(new yz($$0.j, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cge $$0, clb $$1) {
         amb.this.c.b(new yz(-1, $$0.k(), -1, $$1));
      }

      @Override
      public void a(cge $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cge $$0, int $$1, int $$2) {
         amb.this.c.b(new yy($$0.j, $$1, $$2));
      }
   };
   private final cgq db = new cgq() {
      @Override
      public void a(cge $$0, int $$1, clb $$2) {
         chz $$3 = $$0.b($$1);
         if (!($$3 instanceof chv)) {
            if ($$3.d == amb.this.fS()) {
               al.e.a(amb.this, amb.this.fS(), $$2);
            }
         }
      }

      @Override
      public void a(cge $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private vi dc;
   private int dd;
   public boolean f;

   public amb(MinecraftServer $$0, ama $$1, GameProfile $$2, alp $$3) {
      super($$1, $$1.R(), $$1.S(), $$2);
      this.cW = $$0.a(this);
      this.e = $$0.b(this);
      this.d = $$0;
      this.cp = $$0.ac().a((cdm)this);
      this.co = $$0.ac().f(this);
      this.t(1.0F);
      this.e($$1);
      this.a($$3);
   }

   private void e(ama $$0) {
      ht $$1 = $$0.R();
      if ($$0.D_().g() && $$0.n().aT().m() != crp.c) {
         int $$2 = Math.max(0, this.d.a($$0));
         int $$3 = ati.a($$0.C_().b((double)$$1.u(), (double)$$1.w()));
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
         int $$8 = ato.a().a($$6);

         for (int $$9 = 0; $$9 < $$6; $$9++) {
            int $$10 = ($$8 + $$7 * $$9) % $$6;
            int $$11 = $$10 % ($$2 * 2 + 1);
            int $$12 = $$10 / ($$2 * 2 + 1);
            ht $$13 = alv.a($$0, $$1.u() + $$11 - $$2, $$1.w() + $$12 - $$2);
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
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         ccs.a.parse(new Dynamic(sn.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(b::error).ifPresent($$0x -> this.cZ = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         rz $$1 = $$0.p("enteredNetherPosition");
         this.cO = new eji($$1.k("x"), $$1.k("y"), $$1.k("z"));
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
            this.cS = crs.g.parse(sn.a, $$0.c("SpawnDimension")).resultOrPartial(b::error).orElse(crs.h);
         }
      }
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      ccs.a.encodeStart(sn.a, this.cZ).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.cG);
      if (this.cO != null) {
         rz $$1 = new rz();
         $$1.a("x", this.cO.c);
         $$1.a("y", this.cO.d);
         $$1.a("z", this.cO.e);
         $$0.a("enteredNetherPosition", $$1);
      }

      bki $$2 = this.cV();
      bki $$3 = this.cY();
      if ($$3 != null && $$2 != this && $$2.cU()) {
         rz $$4 = new rz();
         rz $$5 = new rz();
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
         agg.a.encodeStart(sn.a, this.cS.a()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gb();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.ch = ati.a((float)$$0 / $$1, 0.0F, $$2);
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
   public void a(clb $$0, int $$1) {
      super.a($$0, $$1);
      this.cz = -1;
   }

   private void a(cge $$0) {
      $$0.a(this.db);
      $$0.a(this.da);
   }

   public void h() {
      this.a(this.bR);
   }

   @Override
   public void f_() {
      super.f_();
      this.c.b(new aae());
   }

   @Override
   public void g_() {
      super.g_();
      this.c.b(new aad(this.eJ()));
   }

   @Override
   protected void a(dgw $$0) {
      al.d.a(this, $$0);
   }

   @Override
   protected ckx k() {
      return new clw(this);
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

      bki $$0 = this.I();
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
            clb $$1 = this.fS().a($$0);
            if ($$1.d().ak_()) {
               wk<?> $$2 = ((cjg)$$1.d()).a($$1, this.dL(), this);
               if ($$2 != null) {
                  this.c.b($$2);
               }
            }
         }

         if (this.eu() != this.cw || this.cx != this.bT.a() || this.bT.e() == 0.0F != this.cy) {
            this.c.b(new abj(this.eu(), this.bT.a(), this.bT.e()));
            this.cw = this.eu();
            this.cx = this.bT.a();
            this.cy = this.bT.e() == 0.0F;
         }

         if (this.eu() + this.fk() != this.cq) {
            this.cq = this.eu() + this.fk();
            this.a(ekk.f, ati.f(this.cq));
         }

         if (this.bT.a() != this.cr) {
            this.cr = this.bT.a();
            this.a(ekk.g, ati.f((float)this.cr));
         }

         if (this.ch() != this.cs) {
            this.cs = this.ch();
            this.a(ekk.h, ati.f((float)this.cs));
         }

         if (this.eI() != this.ct) {
            this.ct = this.eI();
            this.a(ekk.i, ati.f((float)this.ct));
         }

         if (this.cg != this.cv) {
            this.cv = this.cg;
            this.a(ekk.j, ati.f((float)this.cv));
         }

         if (this.cf != this.cu) {
            this.cu = this.cf;
            this.a(ekk.k, ati.f((float)this.cu));
         }

         if (this.cg != this.cz) {
            this.cz = this.cg;
            this.c.b(new abi(this.ch, this.cg, this.cf));
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

   private void a(ekk $$0, int $$1) {
      this.gh().a($$0, this.cx(), $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(bjg $$0) {
      this.a(dlg.p);
      boolean $$1 = this.dL().X().b(cro.n);
      if ($$1) {
         ur $$2 = this.eJ().a();
         this.c.a(new aaf(this.ah(), $$2), ub.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            ur $$3x = ur.a("death.attack.message_too_long", ur.b($$2x).a(n.o));
            ur $$4x = ur.a("death.attack.even_more_magic", this.O_()).a($$1xx -> $$1xx.a(new ux(ux.a.a, $$3x)));
            return new aaf(this.ah(), $$4x);
         }));
         ekj $$3 = this.cf();
         if ($$3 == null || $$3.k() == ekj.b.a) {
            this.d.ac().a($$2, false);
         } else if ($$3.k() == ekj.b.c) {
            this.d.ac().a(this, $$2);
         } else if ($$3.k() == ekj.b.d) {
            this.d.ac().b(this, $$2);
         }
      } else {
         this.c.b(new aaf(this.ah(), uq.a));
      }

      this.gg();
      if (this.dL().X().b(cro.N)) {
         this.gs();
      }

      if (!this.N_()) {
         this.g($$0);
      }

      this.gh().a(ekk.c, this.cx(), ekg::a);
      bky $$4 = this.eK();
      if ($$4 != null) {
         this.b(aqx.h.b($$4.ag()));
         $$4.a(this, this.bh, $$0);
         this.f($$4);
      }

      this.dL().a(this, (byte)3);
      this.a(aqx.N);
      this.a(aqx.i.b(aqx.m));
      this.a(aqx.i.b(aqx.n));
      this.ay();
      this.k(0);
      this.a_(false);
      this.eJ().c();
      this.a(Optional.of(ia.a(this.dL().ac(), this.dl())));
   }

   private void gs() {
      ejd $$0 = new ejd(this.dl()).c(32.0, 10.0, 32.0);
      this.dL().a(bla.class, $$0, bkl.f).stream().filter($$0x -> $$0x instanceof blf).forEach($$0x -> ((blf)$$0x).a_((cdm)this));
   }

   @Override
   public void a(bki $$0, int $$1, bjg $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.s($$1);
         String $$3 = this.cx();
         String $$4 = $$0.cx();
         this.gh().a(ekk.e, $$3, ekg::a);
         if ($$0 instanceof cdm) {
            this.a(aqx.Q);
            this.gh().a(ekk.d, $$3, ekg::a);
         } else {
            this.a(aqx.O);
         }

         this.a($$3, $$4, ekk.l);
         this.a($$4, $$3, ekk.m);
         al.b.a(this, $$0, $$2);
      }
   }

   private void a(String $$0, String $$1, ekk[] $$2) {
      ekf $$3 = this.gh().g($$1);
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gh().a($$2[$$4], $$0, ekg::a);
         }
      }
   }

   @Override
   public boolean a(bjg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.d.l() && this.gt() && $$0.a(are.m);
         if (!$$2 && this.cA > 0 && !$$0.a(are.d)) {
            return false;
         } else {
            bki $$3 = $$0.d();
            if ($$3 instanceof cdm $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof cds $$5 && $$5.v() instanceof cdm $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(cdm $$0) {
      return !this.gt() ? false : super.a($$0);
   }

   private boolean gt() {
      return this.d.Y();
   }

   @Nullable
   @Override
   protected edd a(ama $$0) {
      edd $$1 = super.a($$0);
      if ($$1 != null && this.dL().ac() == crs.h && $$0.ac() == crs.j) {
         eji $$2 = $$1.a.b(0.0, -1.0, 0.0);
         return new edd($$2, eji.b, 90.0F, 0.0F);
      } else {
         return $$1;
      }
   }

   @Nullable
   @Override
   public bki b(ama $$0) {
      this.cF = true;
      ama $$1 = this.x();
      agf<crs> $$2 = $$1.ac();
      if ($$2 == crs.j && $$0.ac() == crs.h) {
         this.ae();
         this.x().a(this, bki.c.e);
         if (!this.f) {
            this.f = true;
            this.c.b(new zi(zi.e, this.cG ? 0.0F : 1.0F));
            this.cG = true;
         }

         return this;
      } else {
         edx $$3 = $$0.A_();
         this.c.b(new aan(this.d($$0), (byte)3));
         this.c.b(new yp($$3.s(), $$3.t()));
         apq $$4 = this.d.ac();
         $$4.d(this);
         $$1.a(this, bki.c.e);
         this.dI();
         edd $$5 = this.a($$0);
         if ($$5 != null) {
            $$1.ad().a("moving");
            if ($$2 == crs.h && $$0.ac() == crs.i) {
               this.cO = this.dj();
            } else if ($$0.ac() == crs.j) {
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
            this.c.b(new aab(this.fT()));
            $$4.a(this, $$0);
            $$4.e(this);

            for (bjv $$6 : this.er()) {
               this.c.b(new ace(this.ah(), $$6));
            }

            this.c.b(new zo(1032, ht.b, 0, false));
            this.cz = -1;
            this.cw = -1.0F;
            this.cx = -1;
         }

         return this;
      }
   }

   private void a(ama $$0, ht $$1) {
      ht.a $$2 = $$1.j();

      for (int $$3 = -2; $$3 <= 2; $$3++) {
         for (int $$4 = -2; $$4 <= 2; $$4++) {
            for (int $$5 = -1; $$5 < 3; $$5++) {
               dgw $$6 = $$5 == -1 ? cuv.co.o() : cuv.a.o();
               $$0.b($$2.g($$1).e($$4, $$5, $$3), $$6);
            }
         }
      }
   }

   @Override
   protected Optional<l.a> a(ama $$0, ht $$1, boolean $$2, din $$3) {
      Optional<l.a> $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         hx.a $$5 = this.dL().a_(this.ax).d(czw.b).orElse(hx.a.a);
         Optional<l.a> $$6 = $$0.o().a($$1, $$5);
         if ($$6.isEmpty()) {
            b.error("Unable to create a portal, likely target out of worldborder");
         }

         return $$6;
      }
   }

   private void f(ama $$0) {
      agf<crs> $$1 = $$0.ac();
      agf<crs> $$2 = this.dL().ac();
      al.v.a(this, $$1, $$2);
      if ($$1 == crs.i && $$2 == crs.h && this.cO != null) {
         al.C.a(this, this.cO);
      }

      if ($$2 != crs.i) {
         this.cO = null;
      }
   }

   @Override
   public boolean a(amb $$0) {
      if ($$0.N_()) {
         return this.I() == this;
      } else {
         return this.N_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bki $$0, int $$1) {
      super.a($$0, $$1);
      this.bS.d();
   }

   @Override
   public Either<cdm.a, auj> a(ht $$0) {
      hx $$1 = this.dL().a_($$0).c(cyo.aE);
      if (this.fD() || !this.bv()) {
         return Either.left(cdm.a.e);
      } else if (!this.dL().D_().j()) {
         return Either.left(cdm.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cdm.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cdm.a.d);
      } else {
         this.a(this.dL().ac(), $$0, this.dB(), false, true);
         if (this.dL().N()) {
            return Either.left(cdm.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               eji $$4 = eji.c($$0);
               List<cba> $$5 = this.dL()
                  .a(cba.class, new ejd($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.f(this));
               if (!$$5.isEmpty()) {
                  return Either.left(cdm.a.f);
               }
            }

            Either<cdm.a, auj> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(aqx.ap);
               al.q.a(this);
            });
            if (!this.x().d()) {
               this.a(ur.c("sleep.not_possible"), true);
            }

            ((ama)this.dL()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(ht $$0) {
      this.a(aqx.i.b(aqx.n));
      super.b($$0);
   }

   private boolean a(ht $$0, hx $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(ht $$0) {
      eji $$1 = eji.c($$0);
      return Math.abs(this.dq() - $$1.a()) <= 3.0 && Math.abs(this.ds() - $$1.b()) <= 2.0 && Math.abs(this.dw() - $$1.c()) <= 3.0;
   }

   private boolean b(ht $$0, hx $$1) {
      ht $$2 = $$0.c();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fD()) {
         this.x().k().a(this, new yg(this, 2));
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
   public boolean b(bjg $$0) {
      return super.b($$0) || this.M();
   }

   @Override
   protected void a(double $$0, boolean $$1, dgw $$2, ht $$3) {
   }

   @Override
   protected void c(ht $$0) {
      if (!this.N_()) {
         super.c($$0);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.dd()) {
         this.b($$3, new eji($$0, $$1, $$2));
         ht $$4 = this.aF();
         super.a($$1, $$3, this.dL().a_($$4), $$4);
      }
   }

   @Override
   public void a(dga $$0, boolean $$1) {
      this.c.b(new ym(this.dL(), $$0.p()));
      this.c.b(new zz($$0.p(), $$1));
   }

   private void gu() {
      this.dd = this.dd % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bit $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.bS != this.bR) {
            this.q();
         }

         this.gu();
         cge $$1 = $$0.createMenu(this.dd, this.fS(), this);
         if ($$1 == null) {
            if (this.N_()) {
               this.a(ur.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.c.b(new zy($$1.j, $$1.a(), $$0.O_()));
            this.a($$1);
            this.bS = $$1;
            return OptionalInt.of(this.dd);
         }
      }
   }

   @Override
   public void a(int $$0, cqr $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.c.b(new zu($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(byi $$0, bij $$1) {
      if (this.bS != this.bR) {
         this.q();
      }

      this.gu();
      this.c.b(new zj(this.dd, $$1.b(), $$0.ah()));
      this.bS = new che(this.dd, this.fS(), $$1, $$0);
      this.a(this.bS);
   }

   @Override
   public void a(clb $$0, bip $$1) {
      if ($$0.a(cle.ti)) {
         if (cmx.a($$0, this.dc(), this)) {
            this.bS.d();
         }

         this.c.b(new zx($$1));
      }
   }

   @Override
   public void a(dfb $$0) {
      this.c.b(yk.a($$0, der::o));
   }

   @Override
   public void q() {
      this.c.b(new yw(this.bS.j));
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
   public void a(aqu<?> $$0, int $$1) {
      this.cp.b(this, $$0, $$1);
      this.gh().a($$0, this.cx(), $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(aqu<?> $$0) {
      this.cp.a(this, $$0, 0);
      this.gh().a($$0, this.cx(), ekg::c);
   }

   @Override
   public int a(Collection<coh<?>> $$0) {
      return this.cH.a($$0, this);
   }

   @Override
   public void a(coh<?> $$0, List<clb> $$1) {
      al.Z.a(this, $$0.a(), $$1);
   }

   @Override
   public void a(agg[] $$0) {
      List<coh<?>> $$1 = Lists.newArrayList();

      for (agg $$2 : $$0) {
         this.d.aE().a($$2).ifPresent($$1::add);
      }

      this.a($$1);
   }

   @Override
   public int b(Collection<coh<?>> $$0) {
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
   public void a(ur $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void ae_() {
      if (!this.bv.b() && this.fn()) {
         this.c.b(new zf(this, (byte)9));
         super.ae_();
      }
   }

   @Override
   public void a(ef.a $$0, eji $$1) {
      super.a($$0, $$1);
      this.c.b(new aai($$0, $$1.c, $$1.d, $$1.e));
   }

   public void a(ef.a $$0, bki $$1, ef.a $$2) {
      eji $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.c.b(new aai($$0, $$1, $$2));
   }

   public void a(amb $$0, boolean $$1) {
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
      } else if (this.dL().X().b(cro.d) || $$0.N_()) {
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
   protected void a(bjv $$0, @Nullable bki $$1) {
      super.a($$0, $$1);
      this.c.b(new ace(this.ah(), $$0));
      if ($$0.c() == bjx.y) {
         this.cJ = this.ah;
         this.cI = this.dj();
      }

      al.A.a(this, $$1);
   }

   @Override
   protected void a(bjv $$0, boolean $$1, @Nullable bki $$2) {
      super.a($$0, $$1, $$2);
      this.c.b(new ace(this.ah(), $$0));
      al.A.a(this, $$2);
   }

   @Override
   protected void a(bjv $$0) {
      super.a($$0);
      this.c.b(new aam(this.ah(), $$0.c()));
      if ($$0.c() == bjx.y) {
         this.cI = null;
      }

      al.A.a(this, null);
   }

   @Override
   public void b(double $$0, double $$1, double $$2) {
      this.c.a($$0, $$1, $$2, this.dB(), this.dD(), blm.g);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.c.a(this.dq() + $$0, this.ds() + $$1, this.dw() + $$2, this.dB(), this.dD(), blm.f);
   }

   @Override
   public boolean a(ama $$0, double $$1, double $$2, double $$3, Set<blm> $$4, float $$5, float $$6) {
      cqz $$7 = new cqz(ht.a($$1, $$2, $$3));
      $$0.k().a(amf.g, $$7, 1, this.ah());
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
   public void a(bki $$0) {
      this.x().k().a(this, new yg($$0, 4));
   }

   @Override
   public void b(bki $$0) {
      this.x().k().a(this, new yg($$0, 5));
   }

   @Override
   public void w() {
      if (this.c != null) {
         this.c.b(new aab(this.fT()));
         this.H();
      }
   }

   public ama x() {
      return (ama)this.dL();
   }

   public boolean a(crp $$0) {
      if (!this.e.a($$0)) {
         return false;
      } else {
         this.c.b(new zi(zi.d, (float)$$0.a()));
         if ($$0 == crp.d) {
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
      return this.e.b() == crp.d;
   }

   @Override
   public boolean f() {
      return this.e.b() == crp.b;
   }

   @Override
   public void a(ur $$0) {
      this.b($$0, false);
   }

   public void b(ur $$0, boolean $$1) {
      if (this.w($$1)) {
         this.c.a(new abx($$0, $$1), ub.a(() -> {
            if (this.w(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               ur $$3 = ur.b($$2).a(n.o);
               return new abx(ur.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(vg $$0, boolean $$1, un.a $$2) {
      if (this.gv()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String y() {
      return this.c.n() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(alp $$0) {
      this.cM = $$0.b();
      this.cL = $$0.c();
      this.cB = $$0.d();
      this.cC = $$0.e();
      this.cX = $$0.h();
      this.cY = $$0.i();
      this.al().b(bM, (byte)$$0.f());
      this.al().b(bN, (byte)$$0.g().a());
   }

   public alp z() {
      int $$0 = this.al().b(bM);
      bks $$1 = bks.d.apply(this.al().b(bN));
      return new alp(this.cM, this.cL, this.cB, this.cC, $$0, $$1, this.cX, this.cY);
   }

   public boolean A() {
      return this.cC;
   }

   public cdk B() {
      return this.cB;
   }

   private boolean w(boolean $$0) {
      return this.cB == cdk.c ? $$0 : true;
   }

   private boolean gv() {
      return this.cB == cdk.a;
   }

   public int C() {
      return this.cL;
   }

   public void a(afh $$0) {
      this.c.b(new aar($$0.a(), $$0.d().map(afh.a::a), $$0.e()));
   }

   @Override
   protected int D() {
      return this.d.c(this.fR());
   }

   public void E() {
      this.cD = ac.b();
   }

   public aqt F() {
      return this.cp;
   }

   public aqs G() {
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

   public bki I() {
      return (bki)(this.cE == null ? this : this.cE);
   }

   @Override
   public void c(@Nullable bki $$0) {
      bki $$1 = this.I();
      this.cE = (bki)($$0 == null ? this : $$0);
      if ($$1 != this.cE) {
         if (this.cE.dL() instanceof ama $$2) {
            this.a($$2, this.cE.dq(), this.cE.ds(), this.cE.dw(), Set.of(), this.dB(), this.dD());
         }

         if ($$0 != null) {
            this.x().k().a(this);
         }

         this.c.b(new aay(this.cE));
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
   public void d(bki $$0) {
      if (this.e.b() == crp.d) {
         this.c($$0);
      } else {
         super.d($$0);
      }
   }

   public long K() {
      return this.cD;
   }

   @Nullable
   public ur L() {
      return null;
   }

   @Override
   public void a(bip $$0) {
      super.a($$0);
      this.gm();
   }

   public boolean M() {
      return this.cF;
   }

   public void N() {
      this.cF = false;
   }

   public ago O() {
      return this.co;
   }

   public void a(ama $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      this.c(this);
      this.aa();
      if ($$0 == this.dL()) {
         this.c.a($$1, $$2, $$3, $$4, $$5);
      } else {
         ama $$6 = this.x();
         edx $$7 = $$0.A_();
         this.c.b(new aan(this.d($$0), (byte)3));
         this.c.b(new yp($$7.s(), $$7.t()));
         this.d.ac().d(this);
         $$6.a(this, bki.c.e);
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

   public agf<crs> R() {
      return this.cS;
   }

   public boolean S() {
      return this.cU;
   }

   public void a(agf<crs> $$0, @Nullable ht $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.cT) && $$0.equals(this.cS);
         if ($$4 && !$$5) {
            this.a(ur.c("block.minecraft.set_spawn"));
         }

         this.cT = $$1;
         this.cS = $$0;
         this.cV = $$2;
         this.cU = $$3;
      } else {
         this.cT = null;
         this.cS = crs.h;
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

   public alo U() {
      return this.cR;
   }

   public void a(alo $$0) {
      this.cR = $$0;
   }

   @Override
   public void a(aqm $$0, aqo $$1, float $$2, float $$3) {
      this.c.b(new abu(jy.c.d($$0), $$1, this.dq(), this.ds(), this.dw(), $$2, $$3, this.ag.g()));
   }

   @Override
   public caf a(clb $$0, boolean $$1, boolean $$2) {
      caf $$3 = super.a($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dL().b($$3);
         clb $$4 = $$3.q();
         if ($$2) {
            if (!$$4.b()) {
               this.a(aqx.f.b($$4.d()), $$0.L());
            }

            this.a(aqx.F);
         }

         return $$3;
      }
   }

   public ane V() {
      return this.cW;
   }

   public void c(ama $$0) {
      this.a((crs)$$0);
      this.e.a($$0);
   }

   @Nullable
   private static crp a(@Nullable rz $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? crp.a($$0.h($$1)) : null;
   }

   private crp b(@Nullable crp $$0) {
      crp $$1 = this.d.aW();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.d.u_();
      }
   }

   @Override
   public void c(@Nullable rz $$0) {
      this.e.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void k(rz $$0) {
      $$0.a("playerGameType", this.e.b().a());
      crp $$1 = this.e.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean W() {
      return this.cX;
   }

   public boolean b(amb $$0) {
      return $$0 == this ? false : this.cX || $$0.cX;
   }

   @Override
   public boolean a(crs $$0, ht $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(clb $$0) {
      al.T.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cdl $$1 = this.fS();
      clb $$2 = $$1.a($$0);
      this.bS.b($$1, $$1.l).ifPresent($$1x -> this.bS.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean X() {
      return this.cY;
   }

   @Override
   public Optional<ccs> Y() {
      return Optional.of(this.cZ);
   }

   @Override
   public void a(caf $$0) {
      super.a($$0);
      bki $$1 = $$0.v();
      if ($$1 != null) {
         al.P.a(this, $$0.q(), $$1);
      }
   }

   public void a(vi $$0) {
      this.dc = $$0;
   }

   @Nullable
   public vi Z() {
      return this.dc != null && this.dc.b() ? null : this.dc;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cl = (float)(ati.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dB());
      this.c.b(new zk(this));
   }

   @Override
   public boolean a(bki $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         $$0.i(this);
         this.c.a(this.dq(), this.ds(), this.dw(), this.dB(), this.dD());
         if ($$0 instanceof bky $$2) {
            for (bjv $$3 : $$2.er()) {
               this.c.b(new ace($$0.ah(), $$3));
            }
         }

         return true;
      }
   }

   @Override
   public void aa() {
      bki $$0 = this.cY();
      super.aa();
      if ($$0 instanceof bky $$1) {
         for (bjv $$2 : $$1.er()) {
            this.c.b(new aam($$0.ah(), $$2.c()));
         }
      }
   }

   public acg d(ama $$0) {
      return new acg($$0.aa(), $$0.ac(), css.a($$0.A()), this.e.b(), this.e.c(), $$0.af(), $$0.z(), this.gr(), this.at());
   }
}
