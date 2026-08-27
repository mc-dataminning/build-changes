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
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class amq extends cer {
   private static final Logger b = LogUtils.getLogger();
   private static final int cm = 32;
   private static final int cn = 10;
   private static final int co = 25;
   public ano c;
   public final MinecraftServer d;
   public final amr e;
   private final ahb cp;
   private final ari cq;
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
   private cep cC = cep.a;
   private boolean cD = true;
   private long cE = ac.b();
   @Nullable
   private blf cF;
   private boolean cG;
   private boolean cH;
   private final arh cI = new arh();
   @Nullable
   private elb cJ;
   private int cK;
   private boolean cL;
   private int cM = 2;
   private String cN = "en_us";
   @Nullable
   private elb cO;
   @Nullable
   private elb cP;
   @Nullable
   private elb cQ;
   private ix cR = ix.a(0, 0, 0);
   private amd cS = amd.a;
   private ags<csy> cT = csy.h;
   @Nullable
   private hv cU;
   private boolean cV;
   private float cW;
   private final ant cX;
   private boolean cY;
   private boolean cZ;
   private cdx da = new cdx(0, 0, 0);
   private final chx db = new chx() {
      @Override
      public void a(chk $$0, io<cmh> $$1, cmh $$2, int[] $$3) {
         amq.this.c.b(new zi($$0.j, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(chk $$0, int $$1, cmh $$2) {
         amq.this.c.b(new zk($$0.j, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(chk $$0, cmh $$1) {
         amq.this.c.b(new zk(-1, $$0.k(), -1, $$1));
      }

      @Override
      public void a(chk $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(chk $$0, int $$1, int $$2) {
         amq.this.c.b(new zj($$0.j, $$1, $$2));
      }
   };
   private final chw dc = new chw() {
      @Override
      public void a(chk $$0, int $$1, cmh $$2) {
         cjf $$3 = $$0.b($$1);
         if (!($$3 instanceof cjb)) {
            if ($$3.d == amq.this.fS()) {
               am.f.a(amq.this, amq.this.fS(), $$2);
            }
         }
      }

      @Override
      public void a(chk $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private vs dd;
   private int de;
   public boolean f;

   public amq(MinecraftServer $$0, amp $$1, GameProfile $$2, ame $$3) {
      super($$1, $$1.S(), $$1.T(), $$2);
      this.cX = $$0.a(this);
      this.e = $$0.b(this);
      this.d = $$0;
      this.cq = $$0.ae().a((cer)this);
      this.cp = $$0.ae().f(this);
      this.t(1.0F);
      this.e($$1);
      this.a($$3);
   }

   private void e(amp $$0) {
      hv $$1 = $$0.S();
      if ($$0.E_().g() && $$0.n().aY().m() != csv.c) {
         int $$2 = Math.max(0, this.d.a($$0));
         int $$3 = aty.a($$0.D_().b((double)$$1.u(), (double)$$1.w()));
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
         int $$8 = auf.a().a($$6);

         for (int $$9 = 0; $$9 < $$6; $$9++) {
            int $$10 = ($$8 + $$7 * $$9) % $$6;
            int $$11 = $$10 % ($$2 * 2 + 1);
            int $$12 = $$10 / ($$2 * 2 + 1);
            hv $$13 = amk.a($$0, $$1.u() + $$11 - $$2, $$1.w() + $$12 - $$2);
            if ($$13 != null) {
               this.a($$13, 0.0F, 0.0F);
               if ($$0.g(this)) {
                  break;
               }
            }
         }
      } else {
         this.a($$1, 0.0F, 0.0F);

         while (!$$0.g(this) && this.dt() < (double)($$0.ak() - 1)) {
            this.a_(this.dr(), this.dt() + 1.0, this.dx());
         }
      }
   }

   private int u(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         cdx.a.parse(new Dynamic(sx.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(b::error).ifPresent($$0x -> this.da = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         sj $$1 = $$0.p("enteredNetherPosition");
         this.cP = new elb($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.cH = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cI.a($$0.p("recipeBook"), this.d.aG());
      }

      if (this.fD()) {
         this.fE();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.cU = new hv($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.cV = $$0.q("SpawnForced");
         this.cW = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.cT = csy.g.parse(sx.a, $$0.c("SpawnDimension")).resultOrPartial(b::error).orElse(csy.h);
         }
      }
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      cdx.a.encodeStart(sx.a, this.da).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.cH);
      if (this.cP != null) {
         sj $$1 = new sj();
         $$1.a("x", this.cP.c);
         $$1.a("y", this.cP.d);
         $$1.a("z", this.cP.e);
         $$0.a("enteredNetherPosition", $$1);
      }

      blf $$2 = this.cW();
      blf $$3 = this.cZ();
      if ($$3 != null && $$2 != this && $$2.cV()) {
         sj $$4 = new sj();
         sj $$5 = new sj();
         $$2.e($$5);
         $$4.a("Attach", $$3.cw());
         $$4.a("Entity", $$5);
         $$0.a("RootVehicle", $$4);
      }

      $$0.a("recipeBook", this.cI.b());
      $$0.a("Dimension", this.dM().ad().a().toString());
      if (this.cU != null) {
         $$0.a("SpawnX", this.cU.u());
         $$0.a("SpawnY", this.cU.v());
         $$0.a("SpawnZ", this.cU.w());
         $$0.a("SpawnForced", this.cV);
         $$0.a("SpawnAngle", this.cW);
         agt.a.encodeStart(sx.a, this.cT.a()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gb();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.ch = aty.a((float)$$0 / $$1, 0.0F, $$2);
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
   public void a(cmh $$0, int $$1) {
      super.a($$0, $$1);
      this.cA = -1;
   }

   private void a(chk $$0) {
      $$0.a(this.dc);
      $$0.a(this.db);
   }

   public void h() {
      this.a(this.bR);
   }

   @Override
   public void g_() {
      super.g_();
      this.c.b(new aap());
   }

   @Override
   public void h_() {
      super.h_();
      this.c.b(new aao(this.eK()));
   }

   @Override
   protected void a(dip $$0) {
      am.e.a(this, $$0);
   }

   @Override
   protected cmd k() {
      return new cnc(this);
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
      if (!this.dM().B && !this.bS.a(this)) {
         this.r();
         this.bS = this.bR;
      }

      blf $$0 = this.K();
      if ($$0 != this) {
         if ($$0.bx()) {
            this.a($$0.dr(), $$0.dt(), $$0.dx(), $$0.dC(), $$0.dE());
            this.z().k().a(this);
            if (this.fJ()) {
               this.c(this);
            }
         } else {
            this.c(this);
         }
      }

      am.x.a(this);
      if (this.cJ != null) {
         am.v.a(this, this.cJ, this.ah - this.cK);
      }

      this.o();
      this.p();
      this.cp.b(this);
   }

   public void m() {
      try {
         if (!this.P_() || !this.de()) {
            super.l();
         }

         for (int $$0 = 0; $$0 < this.fS().b(); $$0++) {
            cmh $$1 = this.fS().a($$0);
            if ($$1.d().al_()) {
               wu<?> $$2 = ((ckm)$$1.d()).a($$1, this.dM(), this);
               if ($$2 != null) {
                  this.c.b($$2);
               }
            }
         }

         if (this.ev() != this.cx || this.cy != this.bT.a() || this.bT.e() == 0.0F != this.cz) {
            this.c.b(new abu(this.ev(), this.bT.a(), this.bT.e()));
            this.cx = this.ev();
            this.cy = this.bT.a();
            this.cz = this.bT.e() == 0.0F;
         }

         if (this.ev() + this.fk() != this.cr) {
            this.cr = this.ev() + this.fk();
            this.a(emd.f, aty.f(this.cr));
         }

         if (this.bT.a() != this.cs) {
            this.cs = this.bT.a();
            this.a(emd.g, aty.f((float)this.cs));
         }

         if (this.ci() != this.ct) {
            this.ct = this.ci();
            this.a(emd.h, aty.f((float)this.ct));
         }

         if (this.eJ() != this.cu) {
            this.cu = this.eJ();
            this.a(emd.i, aty.f((float)this.cu));
         }

         if (this.cg != this.cw) {
            this.cw = this.cg;
            this.a(emd.j, aty.f((float)this.cw));
         }

         if (this.cf != this.cv) {
            this.cv = this.cf;
            this.a(emd.k, aty.f((float)this.cv));
         }

         if (this.cg != this.cA) {
            this.cA = this.cg;
            this.c.b(new abt(this.ch, this.cg, this.cf));
         }

         if (this.ah % 20 == 0) {
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
      if (this.ev() > 0.0F && this.cO != null) {
         am.V.a(this, this.cO);
      }

      this.cO = null;
      super.n();
   }

   public void o() {
      if (this.ab > 0.0F && this.cO == null) {
         this.cO = this.dk();
      }
   }

   public void p() {
      if (this.cZ() != null && this.cZ().bn()) {
         if (this.cQ == null) {
            this.cQ = this.dk();
         } else {
            am.W.a(this, this.cQ);
         }
      }

      if (this.cQ != null && (this.cZ() == null || !this.cZ().bn())) {
         this.cQ = null;
      }
   }

   private void a(emd $$0, int $$1) {
      this.gh().a($$0, this.cy(), $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(bkd $$0) {
      this.a(dmz.p);
      boolean $$1 = this.dM().Y().b(csu.n);
      if ($$1) {
         vb $$2 = this.eK().a();
         this.c.a(new aaq(this.aj(), $$2), ul.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            vb $$3x = vb.a("death.attack.message_too_long", vb.b($$2x).a(n.o));
            vb $$4x = vb.a("death.attack.even_more_magic", this.Q_()).a($$1xx -> $$1xx.a(new vh(vh.a.a, $$3x)));
            return new aaq(this.aj(), $$4x);
         }));
         emc $$3 = this.cg();
         if ($$3 == null || $$3.k() == emc.b.a) {
            this.d.ae().a($$2, false);
         } else if ($$3.k() == emc.b.c) {
            this.d.ae().a(this, $$2);
         } else if ($$3.k() == emc.b.d) {
            this.d.ae().b(this, $$2);
         }
      } else {
         this.c.b(new aaq(this.aj(), va.a));
      }

      this.gg();
      if (this.dM().Y().b(csu.N)) {
         this.gs();
      }

      if (!this.P_()) {
         this.g($$0);
      }

      this.gh().a(emd.c, this.cy(), elz::a);
      blv $$4 = this.eL();
      if ($$4 != null) {
         this.b(arm.h.b($$4.ai()));
         $$4.a(this, this.bh, $$0);
         this.f($$4);
      }

      this.dM().a(this, (byte)3);
      this.a(arm.N);
      this.a(arm.i.b(arm.m));
      this.a(arm.i.b(arm.n));
      this.aA();
      this.k(0);
      this.a_(false);
      this.eK().c();
      this.a(Optional.of(id.a(this.dM().ad(), this.dm())));
   }

   private void gs() {
      ekw $$0 = new ekw(this.dm()).c(32.0, 10.0, 32.0);
      this.dM().a(blx.class, $$0, bli.f).stream().filter($$0x -> $$0x instanceof bmc).forEach($$0x -> ((bmc)$$0x).a_((cer)this));
   }

   @Override
   public void a(blf $$0, int $$1, bkd $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.s($$1);
         String $$3 = this.cy();
         String $$4 = $$0.cy();
         this.gh().a(emd.e, $$3, elz::a);
         if ($$0 instanceof cer) {
            this.a(arm.Q);
            this.gh().a(emd.d, $$3, elz::a);
         } else {
            this.a(arm.O);
         }

         this.a($$3, $$4, emd.l);
         this.a($$4, $$3, emd.m);
         am.c.a(this, $$0, $$2);
      }
   }

   private void a(String $$0, String $$1, emd[] $$2) {
      ely $$3 = this.gh().g($$1);
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gh().a($$2[$$4], $$0, elz::a);
         }
      }
   }

   @Override
   public boolean a(bkd $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.d.l() && this.gt() && $$0.a(art.n);
         if (!$$2 && this.cB > 0 && !$$0.a(art.e)) {
            return false;
         } else {
            blf $$3 = $$0.d();
            if ($$3 instanceof cer $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof cex $$5 && $$5.w() instanceof cer $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(cer $$0) {
      return !this.gt() ? false : super.a($$0);
   }

   private boolean gt() {
      return this.d.aa();
   }

   @Nullable
   @Override
   protected eew a(amp $$0) {
      eew $$1 = super.a($$0);
      if ($$1 != null && this.dM().ad() == csy.h && $$0.ad() == csy.j) {
         elb $$2 = $$1.a.b(0.0, -1.0, 0.0);
         return new eew($$2, elb.b, 90.0F, 0.0F);
      } else {
         return $$1;
      }
   }

   @Nullable
   @Override
   public blf b(amp $$0) {
      this.cG = true;
      amp $$1 = this.z();
      ags<csy> $$2 = $$1.ad();
      if ($$2 == csy.j && $$0.ad() == csy.h) {
         this.ag();
         this.z().a(this, blf.c.e);
         if (!this.f) {
            this.f = true;
            this.c.b(new zt(zt.e, this.cH ? 0.0F : 1.0F));
            this.cH = true;
         }

         return this;
      } else {
         efq $$3 = $$0.B_();
         this.c.b(new aay(this.d($$0), (byte)3));
         this.c.b(new za($$3.s(), $$3.t()));
         aqf $$4 = this.d.ae();
         $$4.d(this);
         $$1.a(this, blf.c.e);
         this.dJ();
         eew $$5 = this.a($$0);
         if ($$5 != null) {
            $$1.ae().a("moving");
            if ($$2 == csy.h && $$0.ad() == csy.i) {
               this.cP = this.dk();
            } else if ($$0.ad() == csy.j) {
               this.a($$0, hv.a($$5.a));
            }

            $$1.ae().c();
            $$1.ae().a("placing");
            this.c($$0);
            this.c.a($$5.a.c, $$5.a.d, $$5.a.e, $$5.c, $$5.d);
            this.c.m();
            $$0.b(this);
            $$1.ae().c();
            this.f($$1);
            this.c.b(new aam(this.fT()));
            $$4.a(this, $$0);
            $$4.e(this);

            for (bks $$6 : this.es()) {
               this.c.b(new acr(this.aj(), $$6));
            }

            this.c.b(new zz(1032, hv.b, 0, false));
            this.cA = -1;
            this.cx = -1.0F;
            this.cy = -1;
         }

         return this;
      }
   }

   private void a(amp $$0, hv $$1) {
      hv.a $$2 = $$1.j();

      for (int $$3 = -2; $$3 <= 2; $$3++) {
         for (int $$4 = -2; $$4 <= 2; $$4++) {
            for (int $$5 = -1; $$5 < 3; $$5++) {
               dip $$6 = $$5 == -1 ? cwb.co.o() : cwb.a.o();
               $$0.b($$2.g($$1).e($$4, $$5, $$3), $$6);
            }
         }
      }
   }

   @Override
   protected Optional<l.a> a(amp $$0, hv $$1, boolean $$2, dkg $$3) {
      Optional<l.a> $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         ia.a $$5 = this.dM().a_(this.ax).d(dbc.b).orElse(ia.a.a);
         Optional<l.a> $$6 = $$0.o().a($$1, $$5);
         if ($$6.isEmpty()) {
            b.error("Unable to create a portal, likely target out of worldborder");
         }

         return $$6;
      }
   }

   private void f(amp $$0) {
      ags<csy> $$1 = $$0.ad();
      ags<csy> $$2 = this.dM().ad();
      am.w.a(this, $$1, $$2);
      if ($$1 == csy.i && $$2 == csy.h && this.cP != null) {
         am.D.a(this, this.cP);
      }

      if ($$2 != csy.i) {
         this.cP = null;
      }
   }

   @Override
   public boolean a(amq $$0) {
      if ($$0.P_()) {
         return this.K() == this;
      } else {
         return this.P_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(blf $$0, int $$1) {
      super.a($$0, $$1);
      this.bS.d();
   }

   @Override
   public Either<cer.a, avc> a(hv $$0) {
      ia $$1 = this.dM().a_($$0).c(czu.aE);
      if (this.fD() || !this.bx()) {
         return Either.left(cer.a.e);
      } else if (!this.dM().E_().j()) {
         return Either.left(cer.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cer.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cer.a.d);
      } else {
         this.a(this.dM().ad(), $$0, this.dC(), false, true);
         if (this.dM().O()) {
            return Either.left(cer.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               elb $$4 = elb.c($$0);
               List<cbz> $$5 = this.dM()
                  .a(cbz.class, new ekw($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.f(this));
               if (!$$5.isEmpty()) {
                  return Either.left(cer.a.f);
               }
            }

            Either<cer.a, avc> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(arm.ap);
               am.r.a(this);
            });
            if (!this.z().d()) {
               this.a(vb.c("sleep.not_possible"), true);
            }

            ((amp)this.dM()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(hv $$0) {
      this.a(arm.i.b(arm.n));
      super.b($$0);
   }

   private boolean a(hv $$0, ia $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(hv $$0) {
      elb $$1 = elb.c($$0);
      return Math.abs(this.dr() - $$1.a()) <= 3.0 && Math.abs(this.dt() - $$1.b()) <= 2.0 && Math.abs(this.dx() - $$1.c()) <= 3.0;
   }

   private boolean b(hv $$0, ia $$1) {
      hv $$2 = $$0.c();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fD()) {
         this.z().k().a(this, new yr(this, 2));
      }

      super.a($$0, $$1);
      if (this.c != null) {
         this.c.a(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.bC();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public boolean b(bkd $$0) {
      return super.b($$0) || this.O();
   }

   @Override
   protected void a(double $$0, boolean $$1, dip $$2, hv $$3) {
   }

   @Override
   protected void c(hv $$0) {
      if (!this.P_()) {
         super.c($$0);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.de()) {
         this.b($$3, new elb($$0, $$1, $$2));
         hv $$4 = this.aH();
         super.a($$1, $$3, this.dM().a_($$4), $$4);
      }
   }

   @Override
   protected void M_() {
      if (this.dM().r().i()) {
         super.M_();
      }
   }

   @Override
   public void a(dhm $$0, boolean $$1) {
      this.c.b(new yx(this.dM(), $$0.aB_()));
      this.c.b(new aak($$0.aB_(), $$1));
   }

   private void gu() {
      this.de = this.de % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bjo $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.bS != this.bR) {
            this.r();
         }

         this.gu();
         chk $$1 = $$0.createMenu(this.de, this.fS(), this);
         if ($$1 == null) {
            if (this.P_()) {
               this.a(vb.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.c.b(new aaj($$1.j, $$1.a(), $$0.Q_()));
            this.a($$1);
            this.bS = $$1;
            return OptionalInt.of(this.de);
         }
      }
   }

   @Override
   public void a(int $$0, crx $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.c.b(new aaf($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(bzh $$0, bje $$1) {
      if (this.bS != this.bR) {
         this.r();
      }

      this.gu();
      this.c.b(new zu(this.de, $$1.b(), $$0.aj()));
      this.bS = new cik(this.de, this.fS(), $$1, $$0);
      this.a(this.bS);
   }

   @Override
   public void a(cmh $$0, bjk $$1) {
      if ($$0.a(cmk.tU)) {
         if (cod.a($$0, this.dd(), this)) {
            this.bS.d();
         }

         this.c.b(new aai($$1));
      }
   }

   @Override
   public void a(dgn $$0) {
      this.c.b(yv.a($$0, dgd::q));
   }

   @Override
   public void r() {
      this.c.b(new zh(this.bS.j));
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
   public void a(elb $$0) {
      double $$1 = this.dr();
      double $$2 = this.dt();
      double $$3 = this.dx();
      super.a($$0);
      this.b(this.dr() - $$1, this.dt() - $$2, this.dx() - $$3);
   }

   @Override
   public void t() {
      double $$0 = this.dr();
      double $$1 = this.dt();
      double $$2 = this.dx();
      super.t();
      this.r(this.dr() - $$0, this.dt() - $$1, this.dx() - $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (!this.bO() && !s($$0, $$1, $$2)) {
         if (this.bZ()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(arm.C, $$3);
               this.A(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(arw.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(arm.w, $$4);
               this.A(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.aZ()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(arm.s, $$5);
               this.A(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.e_()) {
            if ($$1 > 0.0) {
               this.a(arm.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aC()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.bY()) {
                  this.a(arm.r, $$6);
                  this.A(0.1F * (float)$$6 * 0.01F);
               } else if (this.bX()) {
                  this.a(arm.q, $$6);
                  this.A(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(arm.p, $$6);
                  this.A(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fw()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(arm.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(arm.v, $$8);
            }
         }
      }
   }

   private void r(double $$0, double $$1, double $$2) {
      if (this.bO() && !s($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         blf $$4 = this.cZ();
         if ($$4 instanceof cgj) {
            this.a(arm.x, $$3);
         } else if ($$4 instanceof cgl) {
            this.a(arm.y, $$3);
         } else if ($$4 instanceof bxz) {
            this.a(arm.z, $$3);
         } else if ($$4 instanceof bzh) {
            this.a(arm.A, $$3);
         } else if ($$4 instanceof ccm) {
            this.a(arm.D, $$3);
         }
      }
   }

   private static boolean s(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(arj<?> $$0, int $$1) {
      this.cq.b(this, $$0, $$1);
      this.gh().a($$0, this.cy(), $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(arj<?> $$0) {
      this.cq.a(this, $$0, 0);
      this.gh().a($$0, this.cy(), elz::c);
   }

   @Override
   public int a(Collection<cpn<?>> $$0) {
      return this.cI.a($$0, this);
   }

   @Override
   public void a(cpn<?> $$0, List<cmh> $$1) {
      am.aa.a(this, $$0.a(), $$1);
   }

   @Override
   public void a(List<agt> $$0) {
      List<cpn<?>> $$1 = $$0.stream().flatMap($$0x -> this.d.aG().a($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<cpn<?>> $$0) {
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
      if (this.fD()) {
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
   public void a(vb $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void x() {
      if (!this.bv.b() && this.fn()) {
         this.c.b(new zq(this, (byte)9));
         super.x();
      }
   }

   @Override
   public void a(ed.a $$0, elb $$1) {
      super.a($$0, $$1);
      this.c.b(new aat($$0, $$1.c, $$1.d, $$1.e));
   }

   public void a(ed.a $$0, blf $$1, ed.a $$2) {
      elb $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.c.b(new aat($$0, $$1, $$2));
   }

   public void a(amq $$0, boolean $$1) {
      this.da = $$0.da;
      this.dd = $$0.dd;
      this.e.a($$0.e.b(), $$0.e.c());
      this.y();
      if ($$1) {
         this.fS().a($$0.fS());
         this.c($$0.ev());
         this.bT = $$0.bT;
         this.cf = $$0.cf;
         this.cg = $$0.cg;
         this.ch = $$0.ch;
         this.r($$0.fN());
         this.ax = $$0.ax;
      } else if (this.dM().Y().b(csu.d) || $$0.P_()) {
         this.fS().a($$0.fS());
         this.cf = $$0.cf;
         this.cg = $$0.cg;
         this.ch = $$0.ch;
         this.r($$0.fN());
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
      this.i($$0.gj());
      this.j($$0.gk());
      this.a($$0.gr());
   }

   @Override
   protected void a(bks $$0, @Nullable blf $$1) {
      super.a($$0, $$1);
      this.c.b(new acr(this.aj(), $$0));
      if ($$0.c() == bku.y) {
         this.cK = this.ah;
         this.cJ = this.dk();
      }

      am.B.a(this, $$1);
   }

   @Override
   protected void a(bks $$0, boolean $$1, @Nullable blf $$2) {
      super.a($$0, $$1, $$2);
      this.c.b(new acr(this.aj(), $$0));
      am.B.a(this, $$2);
   }

   @Override
   protected void a(bks $$0) {
      super.a($$0);
      this.c.b(new aax(this.aj(), $$0.c()));
      if ($$0.c() == bku.y) {
         this.cJ = null;
      }

      am.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.c.a($$0, $$1, $$2, this.dC(), this.dE(), bmj.g);
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.c.a(this.dr() + $$0, this.dt() + $$1, this.dx() + $$2, this.dC(), this.dE(), bmj.f);
   }

   @Override
   public boolean a(amp $$0, double $$1, double $$2, double $$3, Set<bmj> $$4, float $$5, float $$6) {
      csf $$7 = new csf(hv.a($$1, $$2, $$3));
      $$0.k().a(amu.g, $$7, 1, this.aj());
      this.ac();
      if (this.fD()) {
         this.a(true, true);
      }

      if ($$0 == this.dM()) {
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
   public void a(blf $$0) {
      this.z().k().a(this, new yr($$0, 4));
   }

   @Override
   public void b(blf $$0) {
      this.z().k().a(this, new yr($$0, 5));
   }

   @Override
   public void y() {
      if (this.c != null) {
         this.c.b(new aam(this.fT()));
         this.J();
      }
   }

   public amp z() {
      return (amp)this.dM();
   }

   public boolean a(csv $$0) {
      if (!this.e.a($$0)) {
         return false;
      } else {
         this.c.b(new zt(zt.d, (float)$$0.a()));
         if ($$0 == csv.d) {
            this.gg();
            this.ac();
         } else {
            this.c(this);
         }

         this.y();
         this.fl();
         return true;
      }
   }

   @Override
   public boolean P_() {
      return this.e.b() == csv.d;
   }

   @Override
   public boolean f() {
      return this.e.b() == csv.b;
   }

   @Override
   public void a(vb $$0) {
      this.b($$0, false);
   }

   public void b(vb $$0, boolean $$1) {
      if (this.w($$1)) {
         this.c.a(new aci($$0, $$1), ul.a(() -> {
            if (this.w(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               vb $$3 = vb.b($$2).a(n.o);
               return new aci(vb.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(vq $$0, boolean $$1, ux.a $$2) {
      if (this.gv()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String A() {
      return this.c.n() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(ame $$0) {
      this.cN = $$0.b();
      this.cM = $$0.c();
      this.cC = $$0.d();
      this.cD = $$0.e();
      this.cY = $$0.h();
      this.cZ = $$0.i();
      this.an().b(bM, (byte)$$0.f());
      this.an().b(bN, (byte)$$0.g().a());
   }

   public ame B() {
      int $$0 = this.an().b(bM);
      blp $$1 = blp.d.apply(this.an().b(bN));
      return new ame(this.cN, this.cM, this.cC, this.cD, $$0, $$1, this.cY, this.cZ);
   }

   public boolean C() {
      return this.cD;
   }

   public cep D() {
      return this.cC;
   }

   private boolean w(boolean $$0) {
      return this.cC == cep.c ? $$0 : true;
   }

   private boolean gv() {
      return this.cC == cep.a;
   }

   public int E() {
      return this.cM;
   }

   public void a(afu $$0) {
      this.c.b(new abc($$0.a(), $$0.d().map(afu.a::a), $$0.e()));
   }

   @Override
   protected int F() {
      return this.d.c(this.fR());
   }

   public void G() {
      this.cE = ac.b();
   }

   public ari H() {
      return this.cq;
   }

   public arh I() {
      return this.cI;
   }

   @Override
   protected void J() {
      if (this.P_()) {
         this.eq();
         this.j(true);
      } else {
         super.J();
      }
   }

   public blf K() {
      return (blf)(this.cF == null ? this : this.cF);
   }

   @Override
   public void c(@Nullable blf $$0) {
      blf $$1 = this.K();
      this.cF = (blf)($$0 == null ? this : $$0);
      if ($$1 != this.cF) {
         if (this.cF.dM() instanceof amp $$2) {
            this.a($$2, this.cF.dr(), this.cF.dt(), this.cF.dx(), Set.of(), this.dC(), this.dE());
         }

         if ($$0 != null) {
            this.z().k().a(this);
         }

         this.c.b(new abj(this.cF));
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
   public void d(blf $$0) {
      if (this.e.b() == csv.d) {
         this.c($$0);
      } else {
         super.d($$0);
      }
   }

   public long M() {
      return this.cE;
   }

   @Nullable
   public vb N() {
      return null;
   }

   @Override
   public void a(bjk $$0) {
      super.a($$0);
      this.gm();
   }

   public boolean O() {
      return this.cG;
   }

   public void P() {
      this.cG = false;
   }

   public ahb Q() {
      return this.cp;
   }

   public void a(amp $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      this.c(this);
      this.ac();
      if ($$0 == this.dM()) {
         this.c.a($$1, $$2, $$3, $$4, $$5);
      } else {
         amp $$6 = this.z();
         efq $$7 = $$0.B_();
         this.c.b(new aay(this.d($$0), (byte)3));
         this.c.b(new za($$7.s(), $$7.t()));
         this.d.ae().d(this);
         $$6.a(this, blf.c.e);
         this.dJ();
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
   public hv R() {
      return this.cU;
   }

   public float S() {
      return this.cW;
   }

   public ags<csy> T() {
      return this.cT;
   }

   public boolean U() {
      return this.cV;
   }

   public void a(ags<csy> $$0, @Nullable hv $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.cU) && $$0.equals(this.cT);
         if ($$4 && !$$5) {
            this.a(vb.c("block.minecraft.set_spawn"));
         }

         this.cU = $$1;
         this.cT = $$0;
         this.cW = $$2;
         this.cV = $$3;
      } else {
         this.cU = null;
         this.cT = csy.h;
         this.cW = 0.0F;
         this.cV = false;
      }
   }

   public ix V() {
      return this.cR;
   }

   public void a(ix $$0) {
      this.cR = $$0;
   }

   public amd W() {
      return this.cS;
   }

   public void a(amd $$0) {
      this.cS = $$0;
   }

   @Override
   public void a(arb $$0, ard $$1, float $$2, float $$3) {
      this.c.b(new acf(kb.b.d($$0), $$1, this.dr(), this.dt(), this.dx(), $$2, $$3, this.ag.g()));
   }

   @Override
   public cbe a(cmh $$0, boolean $$1, boolean $$2) {
      cbe $$3 = super.a($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dM().b($$3);
         cmh $$4 = $$3.q();
         if ($$2) {
            if (!$$4.b()) {
               this.a(arm.f.b($$4.d()), $$0.L());
            }

            this.a(arm.F);
         }

         return $$3;
      }
   }

   public ant X() {
      return this.cX;
   }

   public void c(amp $$0) {
      this.a((csy)$$0);
      this.e.a($$0);
   }

   @Nullable
   private static csv a(@Nullable sj $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? csv.a($$0.h($$1)) : null;
   }

   private csv b(@Nullable csv $$0) {
      csv $$1 = this.d.bb();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.d.v_();
      }
   }

   @Override
   public void c(@Nullable sj $$0) {
      this.e.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void k(sj $$0) {
      $$0.a("playerGameType", this.e.b().a());
      csv $$1 = this.e.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean Y() {
      return this.cY;
   }

   public boolean b(amq $$0) {
      return $$0 == this ? false : this.cY || $$0.cY;
   }

   @Override
   public boolean a(csy $$0, hv $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cmh $$0) {
      am.U.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      ceq $$1 = this.fS();
      cmh $$2 = $$1.a($$0);
      this.bS.b($$1, $$1.l).ifPresent($$1x -> this.bS.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean Z() {
      return this.cZ;
   }

   @Override
   public Optional<cdx> aa() {
      return Optional.of(this.da);
   }

   @Override
   public void a(cbe $$0) {
      super.a($$0);
      blf $$1 = $$0.w();
      if ($$1 != null) {
         am.Q.a(this, $$0.q(), $$1);
      }
   }

   public void a(vs $$0) {
      this.dd = $$0;
   }

   @Nullable
   public vs ab() {
      return this.dd != null && this.dd.b() ? null : this.dd;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cl = (float)(aty.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dC());
      this.c.b(new zv(this));
   }

   @Override
   public boolean a(blf $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         $$0.i(this);
         this.c.a(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
         if ($$0 instanceof blv $$2) {
            for (bks $$3 : $$2.es()) {
               this.c.b(new acr($$0.aj(), $$3));
            }
         }

         return true;
      }
   }

   @Override
   public void ac() {
      blf $$0 = this.cZ();
      super.ac();
      if ($$0 instanceof blv $$1) {
         for (bks $$2 : $$1.es()) {
            this.c.b(new aax($$0.aj(), $$2.c()));
         }
      }
   }

   public act d(amp $$0) {
      return new act($$0.ab(), $$0.ad(), ctz.a($$0.B()), this.e.b(), this.e.c(), $$0.ag(), $$0.A(), this.gr(), this.av());
   }
}
