import com.google.common.net.InetAddresses;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
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

public class aqu extends cly {
   private static final Logger b = LogUtils.getLogger();
   private static final int cQ = 32;
   private static final int cR = 10;
   private static final int cS = 25;
   public static final double c = 1.0;
   private static final btt cT = new btt(UUID.fromString("736565d2-e1a7-403d-a3f8-1aeb3e302542"), "Creative block interaction range modifier", 0.5, btt.a.a);
   private static final btt cU = new btt(UUID.fromString("98491ef6-97b1-4584-ae82-71a8cc85cf73"), "Creative entity interaction range modifier", 2.0, btt.a.a);
   public art d;
   public final MinecraftServer e;
   public final aqv f;
   private final alb cV;
   private final avv cW;
   private float cX = Float.MIN_VALUE;
   private int cY = Integer.MIN_VALUE;
   private int cZ = Integer.MIN_VALUE;
   private int da = Integer.MIN_VALUE;
   private int db = Integer.MIN_VALUE;
   private int dc = Integer.MIN_VALUE;
   private float dd = -1.0E8F;
   private int de = -99999999;
   private boolean df = true;
   private int dg = -99999999;
   private int dh = 60;
   private clw di = clw.a;
   private boolean dj = true;
   private long dk = ad.b();
   @Nullable
   private brv dl;
   private boolean dm;
   private boolean dn;
   private final avu do = new avu();
   @Nullable
   private ewu dp;
   private int dq;
   private boolean dr;
   private int ds = 2;
   private String dt = "en_us";
   @Nullable
   private ewu du;
   @Nullable
   private ewu dv;
   @Nullable
   private ewu dw;
   private jt dx = jt.a(0, 0, 0);
   private aqh dy = aqh.a;
   private aks<dca> dz = dca.h;
   @Nullable
   private ir dA;
   private boolean dB;
   private float dC;
   private final ary dD;
   private boolean dE;
   private boolean dF;
   private boolean dG;
   private cle dH = new cle(0, 0, 0);
   private final cpt dI = new cpt() {
      @Override
      public void a(cpg $$0, jj<cuh> $$1, cuh $$2, int[] $$3) {
         aqu.this.d.b(new acs($$0.j, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cpg $$0, int $$1, cuh $$2) {
         aqu.this.d.b(new acu($$0.j, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cpg $$0, cuh $$1) {
         aqu.this.d.b(new acu(-1, $$0.k(), -1, $$1));
      }

      @Override
      public void a(cpg $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cpg $$0, int $$1, int $$2) {
         aqu.this.d.b(new act($$0.j, $$1, $$2));
      }
   };
   private final cps dJ = new cps() {
      @Override
      public void a(cpg $$0, int $$1, cuh $$2) {
         cre $$3 = $$0.b($$1);
         if (!($$3 instanceof cra)) {
            if ($$3.d == aqu.this.gl()) {
               an.f.a(aqu.this, aqu.this.gl(), $$2);
            }
         }
      }

      @Override
      public void a(cpg $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private xv dK;
   @Nullable
   public final Object g;
   private int dL;
   public boolean h;
   public boolean i;

   public aqu(MinecraftServer $$0, aqt $$1, GameProfile $$2, aqi $$3) {
      super($$1, $$1.V(), $$1.W(), $$2);
      this.dD = $$0.a(this);
      this.f = $$0.b(this);
      this.e = $$0;
      this.cW = $$0.ah().a((cly)this);
      this.cV = $$0.ah().g(this);
      this.c($$1);
      this.a($$3);
      this.g = null;
   }

   private void c(aqt $$0) {
      ir $$1 = $$0.V();
      if ($$0.E_().g() && $$0.o().bb().k() != dbx.c) {
         int $$2 = Math.max(0, this.e.a($$0));
         int $$3 = aym.a($$0.D_().b((double)$$1.u(), (double)$$1.w()));
         if ($$3 < $$2) {
            $$2 = $$3;
         }

         if ($$3 <= 1) {
            $$2 = 1;
         }

         long $$4 = (long)($$2 * 2 + 1);
         long $$5 = $$4 * $$4;
         int $$6 = $$5 > 2147483647L ? Integer.MAX_VALUE : (int)$$5;
         int $$7 = this.w($$6);
         int $$8 = ayt.a().a($$6);

         for (int $$9 = 0; $$9 < $$6; $$9++) {
            int $$10 = ($$8 + $$7 * $$9) % $$6;
            int $$11 = $$10 % ($$2 * 2 + 1);
            int $$12 = $$10 / ($$2 * 2 + 1);
            ir $$13 = aqo.a($$0, $$1.u() + $$11 - $$2, $$1.w() + $$12 - $$2);
            if ($$13 != null) {
               this.a($$13, 0.0F, 0.0F);
               if ($$0.g(this)) {
                  break;
               }
            }
         }
      } else {
         this.a($$1, 0.0F, 0.0F);

         while (!$$0.g(this) && this.dB() < (double)($$0.am() - 1)) {
            this.a_(this.dz(), this.dB() + 1.0, this.dF());
         }
      }
   }

   private int w(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         cle.a.parse(new Dynamic(uy.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(b::error).ifPresent($$0x -> this.dH = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         uk $$1 = $$0.p("enteredNetherPosition");
         this.dv = new ewu($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.dn = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.do.a($$0.p("recipeBook"), this.e.aJ());
      }

      if (this.fU()) {
         this.fV();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.dA = new ir($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.dB = $$0.q("SpawnForced");
         this.dC = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.dz = dca.g.parse(uy.a, $$0.c("SpawnDimension")).resultOrPartial(b::error).orElse(dca.h);
         }
      }

      this.dG = $$0.q("spawn_extra_particles_on_fall");
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      cle.a.encodeStart(uy.a, this.dH).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.dn);
      if (this.dv != null) {
         uk $$1 = new uk();
         $$1.a("x", this.dv.c);
         $$1.a("y", this.dv.d);
         $$1.a("z", this.dv.e);
         $$0.a("enteredNetherPosition", $$1);
      }

      brv $$2 = this.de();
      brv $$3 = this.dh();
      if ($$3 != null && $$2 != this && $$2.dd()) {
         uk $$4 = new uk();
         uk $$5 = new uk();
         $$2.e($$5);
         $$4.a("Attach", $$3.cE());
         $$4.a("Entity", $$5);
         $$0.a("RootVehicle", $$4);
      }

      $$0.a("recipeBook", this.do.b());
      $$0.a("Dimension", this.dU().af().a().toString());
      if (this.dA != null) {
         $$0.a("SpawnX", this.dA.u());
         $$0.a("SpawnY", this.dA.v());
         $$0.a("SpawnZ", this.dA.w());
         $$0.a("SpawnForced", this.dB);
         $$0.a("SpawnAngle", this.dC);
         akt.a.encodeStart(uy.a, this.dz.a()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }

      $$0.a("spawn_extra_particles_on_fall", this.dG);
   }

   public void a(int $$0) {
      float $$1 = (float)this.gw();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.cG = aym.a((float)$$0 / $$1, 0.0F, $$2);
      this.dg = -1;
   }

   public void b(int $$0) {
      this.cE = $$0;
      this.dg = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.dg = -1;
   }

   @Override
   public void a(cuh $$0, int $$1) {
      super.a($$0, $$1);
      this.dg = -1;
   }

   private void a(cpg $$0) {
      $$0.a(this.dJ);
      $$0.a(this.dI);
   }

   public void h() {
      this.a(this.cp);
   }

   @Override
   public void f_() {
      super.f_();
      this.d.b(aea.a);
   }

   @Override
   public void g_() {
      super.g_();
      this.d.b(new adz(this.eX()));
   }

   @Override
   protected void a(dtc $$0) {
      an.e.a(this, $$0);
   }

   @Override
   protected cud k() {
      return new cvn(this);
   }

   @Override
   public void l() {
      this.gQ();
      this.f.a();
      this.dH.a();
      this.dh--;
      if (this.aq > 0) {
         this.aq--;
      }

      this.cq.d();
      if (!this.dU().C && !this.cq.a(this)) {
         this.t();
         this.cq = this.cp;
      }

      brv $$0 = this.M();
      if ($$0 != this) {
         if ($$0.bI()) {
            this.a($$0.dz(), $$0.dB(), $$0.dF(), $$0.dK(), $$0.dM());
            this.B().l().a(this);
            if (this.gb()) {
               this.d(this);
            }
         } else {
            this.d(this);
         }
      }

      an.x.a(this);
      if (this.dp != null) {
         an.v.a(this, this.dp, this.am - this.dq);
      }

      this.o();
      this.p();
      this.gR();
      this.cV.b(this);
   }

   private void gQ() {
      dca $$0 = this.dU();
      if ($$0 instanceof aqt $$1) {
         clx $$3 = this.gl();
         if (this.gq()) {
            an.ah.a(this);
         }

         if ((this.b("intro", 22) || this.b("leaving_village", 1)) && $$1.c(this.aO())) {
            this.c("in_village");
         }

         if (this.b("in_village", 0)) {
            if (!$$1.c(this.aO())) {
               this.c("leaving_village");
            }

            if ($$3.b($$0x -> $$0x.a(awm.P))) {
               this.c("took_bed");
            }

            if (this.fU()) {
               this.c("slept_in_bed");
            }
         }

         if (this.b("slept_in_bed", 3) || this.b("took_bed", 1)) {
            this.c("meta_one");
         }

         if (this.a("meta_one", 13)) {
            cuh $$4 = new cuh(cuk.sl);
            $$4.b(ke.g, new cxn(List.of(xe.c("paper.thoughts"))));
            $$3.f($$4);
            this.c("got_paper");
         }

         if (this.a("got_paper", 2)) {
            iw $$5 = iw.a((double)this.dK());
            ir $$6 = this.aO().b(2).a($$5.q().o(4));
            boolean $$7 = false;

            for (ir $$8 : ir.a($$6, 4, $$5, $$5.i())) {
               if ($$0.u($$8)) {
                  $$0.b($$8, dfe.hM.n());
                  $$7 = true;
                  break;
               }
            }

            if (!$$7) {
               $$0.b(this.aO().b(2), dfe.hM.n());
            }

            this.c("anvil_dropped");
         }

         if (this.a("thrown_eye", 13)) {
            cuh $$9 = new cuh(cuk.vC);
            $$9.b(
               ke.H,
               new cya(
                  ark.a(xe.c("potato.quest.book.title").getString()),
                  xe.c("potato.quest.book.author").getString(),
                  0,
                  List.of(ark.a(xe.c("potato.quest.book.page.0")), ark.a(xe.c("potato.quest.book.page.1")), ark.a(xe.c("potato.quest.book.page.2"))),
                  false
               )
            );
            $$3.f($$9);
            this.c("got_book");
         }

         if (this.b("thrown_eye", 0) || this.b("got_book", 0)) {
            Optional<ir> $$10 = this.as.a(cl);
            if ($$10.isPresent() && $$10.get().k(this.aO().h(0)) < 16) {
               this.c("found_portal");
            }
         }

         if (this.b("dimension", 10) && $$1.z_() && $$1.c(this.aO())) {
            this.c("potato_village");
         }

         if (this.b("thrown_eye_part_two", 3)) {
            Optional<ir> $$11 = this.as.a(cm);
            if ($$11.isPresent() && $$11.get().k(this.aO().h(0)) < 16) {
               this.c("found_colosseum");
            }
         }

         if (this.b("found_colosseum", 2) && $$1.a().a(this.aO(), awp.v).b()) {
            this.c("inside_colosseum");
         }

         if (this.a("inside_colosseum", 3)) {
            $$3.f(new cuh(cuk.qe));
            this.c("got_sword");
         }

         if (this.a("got_sword", 13)) {
            this.c("got_sword", 1);
         }

         if ($$3.a(Set.of(cuk.Ax))) {
            Pair<String, Integer> $$12 = this.gr();
            if (!((String)$$12.getFirst()).equals("composted_staff") && !((String)$$12.getFirst()).equals("got_staff")) {
               this.c("got_staff");
            }
         }

         if (this.gq() && !this.as.a(cn)) {
            this.a(avz.aJ);
         }

         if (this.a("composted_staff", 5)) {
            this.as.a(cn, true);
         }
      }
   }

   private void gR() {
      btr $$0 = this.f(btv.g);
      if ($$0 != null) {
         if (this.f()) {
            $$0.b(cT);
         } else {
            $$0.e(cT);
         }
      }

      btr $$1 = this.f(btv.h);
      if ($$1 != null) {
         if (this.f()) {
            $$1.b(cU);
         } else {
            $$1.e(cU);
         }
      }
   }

   public void m() {
      try {
         if (!this.O_() || !this.dm()) {
            super.l();
         }

         for (int $$0 = 0; $$0 < this.gl().b(); $$0++) {
            cuh $$1 = this.gl().a($$0);
            if ($$1.f().ak_()) {
               zl<?> $$2 = ((cso)$$1.f()).a($$1, this.dU(), this);
               if ($$2 != null) {
                  this.d.b($$2);
               }
            }
         }

         if (this.eI() != this.dd || this.de != this.cr.a() || this.cr.e() == 0.0F != this.df) {
            this.d.b(new afg(this.eI(), this.cr.a(), this.cr.e()));
            this.dd = this.eI();
            this.de = this.cr.a();
            this.df = this.cr.e() == 0.0F;
         }

         if (this.eI() + this.fB() != this.cX) {
            this.cX = this.eI() + this.fB();
            this.a(eyb.g, aym.f(this.cX));
         }

         if (this.cr.a() != this.cY) {
            this.cY = this.cr.a();
            this.a(eyb.h, aym.f((float)this.cY));
         }

         if (this.cq() != this.cZ) {
            this.cZ = this.cq();
            this.a(eyb.i, aym.f((float)this.cZ));
         }

         if (this.eW() != this.da) {
            this.da = this.eW();
            this.a(eyb.j, aym.f((float)this.da));
         }

         if (this.cF != this.dc) {
            this.dc = this.cF;
            this.a(eyb.k, aym.f((float)this.dc));
         }

         if (this.cE != this.db) {
            this.db = this.cE;
            this.a(eyb.l, aym.f((float)this.db));
         }

         if (this.cF != this.dg) {
            this.dg = this.cF;
            this.d.b(new aff(this.cG, this.cF, this.cE));
         }

         if (this.am % 20 == 0) {
            an.q.a(this);
         }
      } catch (Throwable var4) {
         o $$4 = o.a(var4, "Ticking player");
         p $$5 = $$4.a("Player being ticked");
         this.a($$5);
         throw new z($$4);
      }
   }

   @Override
   public void n() {
      if (this.eI() > 0.0F && this.du != null) {
         an.X.a(this, this.du);
      }

      this.du = null;
      super.n();
   }

   public void o() {
      if (this.ad > 0.0F && this.du == null) {
         this.du = this.ds();
         if (this.cM != null) {
            an.ae.a(this, this.cM, this.cN);
         }
      }
   }

   public void p() {
      if (this.dh() != null && this.dh().bx()) {
         if (this.dw == null) {
            this.dw = this.ds();
         } else {
            an.Y.a(this, this.dw);
         }
      }

      if (this.dw != null && (this.dh() == null || !this.dh().bx())) {
         this.dw = null;
      }
   }

   public boolean q() {
      if (this.dU() instanceof aqt $$0) {
         alb $$2 = $$0.o().ah().g(this);
         ah $$3 = $$2.c().a(new akt("good_plant"));
         return $$3 != null;
      } else {
         return false;
      }
   }

   private void a(eyb $$0, int $$1) {
      this.gC().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(bqt $$0) {
      this.a(dxv.p);
      boolean $$1 = this.dU().ab().b(dbw.n);
      if ($$1) {
         xe $$2 = this.eX().a();
         this.d.a(new aeb(this.al(), $$2), wl.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            xe $$3x = xe.a("death.attack.message_too_long", xe.b($$2x).a(n.o));
            xe $$4x = xe.a("death.attack.even_more_magic", this.P_()).a($$1xx -> $$1xx.a(new xk(xk.a.a, $$3x)));
            return new aeb(this.al(), $$4x);
         }));
         eya $$3 = this.co();
         if ($$3 == null || $$3.k() == eya.b.a) {
            this.e.ah().a($$2, false);
         } else if ($$3.k() == eya.b.c) {
            this.e.ah().a(this, $$2);
         } else if ($$3.k() == eya.b.d) {
            this.e.ah().b(this, $$2);
         }
      } else {
         this.d.b(new aeb(this.al(), xd.a));
      }

      this.gB();
      if (this.dU().ab().b(dbw.O)) {
         this.gS();
      }

      if (!this.O_()) {
         this.g($$0);
      }

      this.gC().a(eyb.d, this, exw::b);
      bso $$4 = this.eY();
      if ($$4 != null) {
         this.b(avz.h.b($$4.ak()));
         $$4.a(this, this.bw, $$0);
         this.f($$4);
      }

      this.dU().a(this, (byte)3);
      this.a(avz.N);
      this.a(avz.i.b(avz.m));
      this.a(avz.i.b(avz.n));
      this.aC();
      this.l(0);
      this.c(false);
      this.eX().c();
      this.a(Optional.of(iz.a(this.dU().af(), this.du())));
      this.as.a(ck, "potato.quest.intro.jump.0");
      if (!this.as.a(cn)) {
         this.a(avz.i.b(avz.aJ));
      }
   }

   private void gS() {
      ewp $$0 = new ewp(this.du()).c(32.0, 10.0, 32.0);
      this.dU().a(bsq.class, $$0, bsa.f).stream().filter($$0x -> $$0x instanceof bsu).forEach($$0x -> ((bsu)$$0x).a_((cly)this));
   }

   @Override
   public void a(brv $$0, int $$1, bqt $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.u($$1);
         this.gC().a(eyb.f, this, exw::b);
         if ($$0 instanceof cly) {
            this.a(avz.Q);
            this.gC().a(eyb.e, this, exw::b);
         } else {
            this.a(avz.O);
         }

         this.a(this, $$0, eyb.m);
         this.a($$0, this, eyb.n);
         an.c.a(this, $$0, $$2);
      }
   }

   private void a(exx $$0, exx $$1, eyb[] $$2) {
      ext $$3 = this.gC().e($$1.cG());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gC().a($$2[$$4], $$0, exw::b);
         }
      }
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.e.n() && this.gT() && $$0.a(awg.n);
         if (!$$2 && this.dh > 0 && !$$0.a(awg.e)) {
            return false;
         } else {
            brv $$3 = $$0.d();
            if ($$3 instanceof cly $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof cme $$5 && $$5.t() instanceof cly $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(cly $$0) {
      return !this.gT() ? false : super.a($$0);
   }

   private boolean gT() {
      return this.e.ad();
   }

   @Nullable
   @Override
   protected eqd a(aqt $$0, boolean $$1) {
      eqd $$2 = super.a($$0, $$1);
      if ($$2 != null && this.dU().af() == dca.h && $$0.af() == dca.j) {
         ewu $$3 = $$2.a.b(0.0, -1.0, 0.0);
         return new eqd($$3, ewu.b, 90.0F, 0.0F);
      } else {
         return $$2;
      }
   }

   @Override
   public void r() {
      this.dm = true;
      this.ai();
      this.B().a(this, brv.d.e);
      this.d.b(new ade(ade.p, 0.0F));
   }

   @Nullable
   @Override
   public brv b(aqt $$0, boolean $$1) {
      this.dm = true;
      aqt $$2 = this.B();
      aks<dca> $$3 = $$2.af();
      boolean $$4 = $$0.z_() || $$2.z_();
      if ($$3 == dca.j && $$0.af() == dca.h) {
         this.ai();
         this.B().a(this, brv.d.e);
         if (!this.h) {
            this.h = true;
            this.d.b(new ade(ade.f, this.dn ? 0.0F : 1.0F));
            this.dn = true;
         }

         return this;
      } else {
         erb $$5 = $$0.B_();
         this.d.b(new aek(this.b($$0), (byte)3));
         this.d.b(new ack($$5.q(), $$5.r()));
         auq $$6 = this.e.ah();
         $$6.e(this);
         $$2.a(this, brv.d.e);
         this.dR();
         eqd $$7 = this.a($$0, $$1);
         if ($$7 != null) {
            $$2.ag().a("moving");
            if ($$3 == dca.h && $$0.af() == dca.i) {
               this.dv = this.ds();
            } else if ($$0.af() == dca.j) {
               this.a($$0, ir.a($$7.a));
            }

            $$2.ag().c();
            $$2.ag().a("placing");
            this.a($$0);
            this.d.a($$7.a.c, $$7.a.d, $$7.a.e, $$7.c, $$7.d);
            this.d.m();
            $$0.b(this);
            $$2.ag().c();
            this.d($$2);
            this.d.b(new adx(this.gm()));
            $$6.a(this, $$0);
            $$6.f(this);

            for (brh $$8 : this.eF()) {
               this.d.b(new age(this.al(), $$8, false));
            }

            this.d.b(new adk(1032, ir.c, $$4 ? 1 : 0, false));
            this.dg = -1;
            this.dd = -1.0F;
            this.de = -1;
         }

         return this;
      }
   }

   private void a(aqt $$0, ir $$1) {
      ir.a $$2 = $$1.j();

      for (int $$3 = -2; $$3 <= 2; $$3++) {
         for (int $$4 = -2; $$4 <= 2; $$4++) {
            for (int $$5 = -1; $$5 < 3; $$5++) {
               dtc $$6 = $$5 == -1 ? dfe.cZ.n() : dfe.a.n();
               $$0.b($$2.g($$1).e($$4, $$5, $$3), $$6);
            }
         }
      }
   }

   @Override
   protected Optional<l.a> a(aqt $$0, ir $$1, boolean $$2, dut $$3) {
      Optional<l.a> $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         iw.a $$5 = this.dU().a_(this.aC).d(dkl.b).orElse(iw.a.a);
         Optional<l.a> $$6 = $$0.p().a($$1, $$5);
         if ($$6.isEmpty()) {
            b.error("Unable to create a portal, likely target out of worldborder");
         }

         return $$6;
      }
   }

   private void d(aqt $$0) {
      aks<dca> $$1 = $$0.af();
      aks<dca> $$2 = this.dU().af();
      an.w.a(this, $$1, $$2);
      if ($$1 == dca.i && $$2 == dca.h && this.dv != null) {
         an.D.a(this, this.dv);
      }

      if ($$2 != dca.i) {
         this.dv = null;
      }
   }

   @Override
   public boolean a(aqu $$0) {
      if ($$0.O_()) {
         return this.M() == this;
      } else {
         return this.O_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(brv $$0, int $$1) {
      super.a($$0, $$1);
      this.cq.d();
   }

   @Override
   public Either<cly.a, azo> a(ir $$0) {
      iw $$1 = this.dU().a_($$0).c(djc.aE);
      if (this.fU() || !this.bI()) {
         return Either.left(cly.a.e);
      } else if (!this.dU().E_().j()) {
         return Either.left(cly.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cly.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cly.a.d);
      } else {
         this.a(this.dU().af(), $$0, this.dK(), false, true);
         if (this.dU().R()) {
            return Either.left(cly.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               ewu $$4 = ewu.c($$0);
               List<cjd> $$5 = this.dU()
                  .a(cjd.class, new ewp($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.f(this));
               if (!$$5.isEmpty()) {
                  return Either.left(cly.a.f);
               }
            }

            Either<cly.a, azo> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(avz.aq);
               an.r.a(this);
            });
            if (!this.B().d()) {
               this.a(xe.c("sleep.not_possible"), true);
            }

            ((aqt)this.dU()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(ir $$0) {
      this.a(avz.i.b(avz.n));
      super.b($$0);
   }

   private boolean a(ir $$0, iw $$1) {
      return this.k($$0) || this.k($$0.a($$1.g()));
   }

   private boolean k(ir $$0) {
      ewu $$1 = ewu.c($$0);
      return Math.abs(this.dz() - $$1.a()) <= 3.0 && Math.abs(this.dB() - $$1.b()) <= 2.0 && Math.abs(this.dF() - $$1.c()) <= 3.0;
   }

   private boolean b(ir $$0, iw $$1) {
      ir $$2 = $$0.c();
      return !this.j($$2) || !this.j($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fU()) {
         this.B().l().a(this, new aca(this, 2));
      }

      super.a($$0, $$1);
      if (this.d != null) {
         this.d.a(this.dz(), this.dB(), this.dF(), this.dK(), this.dM());
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.bN();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public boolean b(bqt $$0) {
      return super.b($$0) || this.Q();
   }

   @Override
   protected void a(double $$0, boolean $$1, dtc $$2, ir $$3) {
   }

   @Override
   protected void c(ir $$0) {
      if (!this.O_()) {
         super.c($$0);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.dm()) {
         this.b($$3, new ewu($$0, $$1, $$2));
         ir $$4 = this.aM();
         dtc $$5 = this.bv();
         if (this.dG && $$3 && this.ad > 0.0F) {
            ewu $$6 = $$4.b().b(0.0, 0.5, 0.0);
            int $$7 = (int)(50.0F * this.ad);
            this.B().a(new ks(lb.b, $$5), $$6.c, $$6.d, $$6.e, $$7, 0.3F, 0.3F, 0.3F, 0.15F);
            this.dG = false;
         }

         super.a($$1, $$3, $$5, $$4);
      }
   }

   @Override
   public void a(@Nullable brv $$0) {
      super.a($$0);
      this.cM = this.ds();
      this.cN = $$0;
      this.cO = $$0 != null && $$0.ak() == bsb.br;
   }

   @Override
   protected void s() {
      if (this.dU().s().i()) {
         super.s();
      }
   }

   @Override
   public void a(drr $$0, boolean $$1) {
      this.d.b(new acg(this.dU(), $$0.az_()));
      this.d.b(new adv($$0.az_(), $$1));
   }

   private void gU() {
      this.dL = this.dL % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bqe $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.cq != this.cp) {
            this.t();
         }

         this.gU();
         cpg $$1 = $$0.createMenu(this.dL, this.gl(), this);
         if ($$1 == null) {
            if (this.O_()) {
               this.a(xe.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.d.b(new adu($$1.j, $$1.a(), $$0.P_()));
            this.a($$1);
            this.cq = $$1;
            return OptionalInt.of(this.dL);
         }
      }
   }

   @Override
   public void a(int $$0, daz $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.d.b(new adq($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(cgi $$0, bpt $$1) {
      if (this.cq != this.cp) {
         this.t();
      }

      this.gU();
      this.d.b(new adf(this.dL, $$1.b(), $$0.al()));
      this.cq = new cqh(this.dL, this.gl(), $$1, $$0);
      this.a(this.cq);
   }

   @Override
   public void a(cuh $$0, bpz $$1) {
      if ($$0.a(cuk.vC)) {
         if (cwo.a($$0, this.dl(), this)) {
            this.cq.d();
         }

         this.d.b(new adt($$1));
      }
   }

   @Override
   public void a(dqm $$0) {
      this.d.b(ace.a($$0, dqc::d));
   }

   @Override
   public void t() {
      this.d.b(new acr(this.cq.j));
      this.u();
   }

   @Override
   public void u() {
      this.cq.b(this);
      this.cp.a(this.cq);
      this.cq = this.cp;
   }

   public void a(float $$0, float $$1, boolean $$2, boolean $$3) {
      if (this.bW()) {
         if ($$0 >= -1.0F && $$0 <= 1.0F) {
            this.bz = $$0;
         }

         if ($$1 >= -1.0F && $$1 <= 1.0F) {
            this.bB = $$1;
         }

         this.by = $$2;
         this.g($$3);
      }
   }

   @Override
   public void a(ewu $$0) {
      double $$1 = this.dz();
      double $$2 = this.dB();
      double $$3 = this.dF();
      super.a($$0);
      this.b(this.dz() - $$1, this.dB() - $$2, this.dF() - $$3);
   }

   @Override
   public void v() {
      double $$0 = this.dz();
      double $$1 = this.dB();
      double $$2 = this.dF();
      super.v();
      this.r(this.dz() - $$0, this.dB() - $$1, this.dF() - $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (!this.bW() && !s($$0, $$1, $$2)) {
         if (this.ch()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(avz.C, $$3);
               this.C(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(awj.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(avz.w, $$4);
               this.C(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.bi()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(avz.s, $$5);
               this.C(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.p_()) {
            if ($$1 > 0.0) {
               this.a(avz.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aE()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.cg()) {
                  this.a(avz.r, $$6);
                  this.C(0.1F * (float)$$6 * 0.01F);
               } else if (this.cf()) {
                  this.a(avz.q, $$6);
                  this.C(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(avz.p, $$6);
                  this.C(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fN()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(avz.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(avz.v, $$8);
            }
         }
      }
   }

   private void r(double $$0, double $$1, double $$2) {
      if (this.bW() && !s($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         brv $$4 = this.dh();
         if ($$4 instanceof cnw) {
            this.a(avz.x, $$3);
         } else if ($$4 instanceof cny) {
            this.a(avz.y, $$3);
         } else if ($$4 instanceof cev) {
            this.a(avz.z, $$3);
         } else if ($$4 instanceof cgi) {
            this.a(avz.A, $$3);
         } else if ($$4 instanceof cjr) {
            this.a(avz.D, $$3);
         }
      }
   }

   private static boolean s(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(avw<?> $$0, int $$1) {
      this.cW.b(this, $$0, $$1);
      this.gC().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(avw<?> $$0) {
      this.cW.a(this, $$0, 0);
      this.gC().a($$0, this, exw::c);
   }

   @Override
   public int a(Collection<czc<?>> $$0) {
      return this.do.a($$0, this);
   }

   @Override
   public void a(czc<?> $$0, List<cuh> $$1) {
      an.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<akt> $$0) {
      List<czc<?>> $$1 = $$0.stream().flatMap($$0x -> this.e.aJ().a($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<czc<?>> $$0) {
      return this.do.b($$0, this);
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.dg = -1;
   }

   public void w() {
      this.dr = true;
      this.bM();
      if (this.fU()) {
         this.a(true, false);
      }
   }

   public boolean x() {
      return this.dr;
   }

   @Override
   public void y() {
      this.dd = -1.0E8F;
   }

   @Override
   public void a(xe $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void z() {
      if (!this.bK.d() && this.fE()) {
         this.d.b(new adb(this, (byte)9));
         super.z();
      }
   }

   @Override
   public void a(et.a $$0, ewu $$1) {
      super.a($$0, $$1);
      this.d.b(new aee($$0, $$1.c, $$1.d, $$1.e));
   }

   public void a(et.a $$0, brv $$1, et.a $$2) {
      ewu $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.d.b(new aee($$0, $$1, $$2));
   }

   public void a(aqu $$0, boolean $$1) {
      this.dH = $$0.dH;
      this.dK = $$0.dK;
      this.f.a($$0.f.b(), $$0.f.c());
      this.A();
      if ($$1) {
         this.gl().a($$0.gl());
         this.t($$0.eI());
         this.cr = $$0.cr;
         this.cE = $$0.cE;
         this.cF = $$0.cF;
         this.cG = $$0.cG;
         this.t($$0.gf());
         this.aC = $$0.aC;
      } else if (this.dU().ab().b(dbw.d) || $$0.O_()) {
         this.gl().a($$0.gl());
         this.cE = $$0.cE;
         this.cF = $$0.cF;
         this.cG = $$0.cG;
         this.t($$0.gf());
      }

      this.cH = $$0.cH;
      this.co = $$0.co;
      this.ap().a(cg, $$0.ap().a(cg));
      this.dg = -1;
      this.dd = -1.0F;
      this.de = -1;
      this.do.a($$0.do);
      this.dn = $$0.dn;
      this.dv = $$0.dv;
      this.dy = $$0.dy;
      this.i($$0.gE());
      this.j($$0.gF());
      this.a($$0.gM());
   }

   @Override
   protected void a(brh $$0, @Nullable brv $$1) {
      super.a($$0, $$1);
      this.d.b(new age(this.al(), $$0, true));
      if ($$0.a(brj.y)) {
         this.dq = this.am;
         this.dp = this.ds();
      }

      an.B.a(this, $$1);
   }

   @Override
   protected void a(brh $$0, boolean $$1, @Nullable brv $$2) {
      super.a($$0, $$1, $$2);
      this.d.b(new age(this.al(), $$0, false));
      an.B.a(this, $$2);
   }

   @Override
   protected void a(brh $$0) {
      super.a($$0);
      this.d.b(new aei(this.al(), $$0.c()));
      if ($$0.a(brj.y)) {
         this.dp = null;
      }

      an.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.d.a($$0, $$1, $$2, this.dK(), this.dM(), btb.g);
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.d.a(this.dz() + $$0, this.dB() + $$1, this.dF() + $$2, this.dK(), this.dM(), btb.f);
   }

   @Override
   public boolean a(aqt $$0, double $$1, double $$2, double $$3, Set<btb> $$4, float $$5, float $$6) {
      dbh $$7 = new dbh(ir.a($$1, $$2, $$3));
      $$0.l().a(aqy.g, $$7, 1, this.al());
      this.ae();
      if (this.fU()) {
         this.a(true, true);
      }

      if ($$0 == this.dU()) {
         this.d.a($$1, $$2, $$3, $$5, $$6, $$4);
      } else {
         this.a($$0, $$1, $$2, $$3, $$5, $$6);
      }

      this.n($$5);
      return true;
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      super.e($$0, $$1, $$2);
      this.d.m();
   }

   @Override
   public void b(brv $$0) {
      this.B().l().a(this, new aca($$0, 4));
   }

   @Override
   public void c(brv $$0) {
      this.B().l().a(this, new aca($$0, 5));
   }

   @Override
   public void A() {
      if (this.d != null) {
         this.d.b(new adx(this.gm()));
         this.L();
      }
   }

   public aqt B() {
      return (aqt)this.dU();
   }

   public boolean a(dbx $$0) {
      if (!this.f.a($$0)) {
         return false;
      } else {
         this.d.b(new ade(ade.e, (float)$$0.a()));
         if ($$0 == dbx.d) {
            this.gB();
            this.ae();
         } else {
            this.d(this);
         }

         this.A();
         this.fC();
         return true;
      }
   }

   @Override
   public boolean O_() {
      return this.f.b() == dbx.d;
   }

   @Override
   public boolean f() {
      return this.f.b() == dbx.b;
   }

   @Override
   public void a(xe $$0) {
      this.b($$0, false);
   }

   public void b(xe $$0, boolean $$1) {
      if (this.v($$1)) {
         this.d.a(new afv($$0, $$1), wl.a(() -> {
            if (this.v(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               xe $$3 = xe.b($$2).a(n.o);
               return new afv(xe.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(xt $$0, boolean $$1, xa.a $$2) {
      if (this.gV()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String C() {
      return this.d.n() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(aqi $$0) {
      this.dt = $$0.b();
      this.ds = $$0.c();
      this.di = $$0.d();
      this.dj = $$0.e();
      this.dE = $$0.h();
      this.dF = $$0.i();
      this.ap().a(cg, (byte)$$0.f());
      this.ap().a(ch, (byte)$$0.g().a());
   }

   public aqi D() {
      int $$0 = this.ap().a(cg);
      bsi $$1 = bsi.d.apply(this.ap().a(ch));
      return new aqi(this.dt, this.ds, this.di, this.dj, $$0, $$1, this.dE, this.dF);
   }

   public boolean E() {
      return this.dj;
   }

   public clw F() {
      return this.di;
   }

   private boolean v(boolean $$0) {
      return this.di == clw.c ? $$0 : true;
   }

   private boolean gV() {
      return this.di == clw.a;
   }

   public int G() {
      return this.ds;
   }

   public void a(ajs $$0) {
      this.d.b(new aeo($$0.a(), $$0.d().map(ajs.a::a)));
   }

   @Override
   protected int H() {
      return this.e.c(this.gk());
   }

   public void I() {
      this.dk = ad.b();
   }

   public avv J() {
      return this.cW;
   }

   public avu K() {
      return this.do;
   }

   @Override
   protected void L() {
      if (this.O_()) {
         this.eD();
         this.k(true);
      } else {
         super.L();
      }
   }

   public brv M() {
      return (brv)(this.dl == null ? this : this.dl);
   }

   @Override
   public void d(@Nullable brv $$0) {
      brv $$1 = this.M();
      this.dl = (brv)($$0 == null ? this : $$0);
      if ($$1 != this.dl) {
         if (this.dl.dU() instanceof aqt $$2) {
            this.a($$2, this.dl.dz(), this.dl.dB(), this.dl.dF(), Set.of(), this.dK(), this.dM());
         }

         if ($$0 != null) {
            this.B().l().a(this);
         }

         this.d.b(new aev(this.dl));
         this.d.m();
      }
   }

   @Override
   protected void N() {
      if (!this.dm) {
         super.N();
      }
   }

   @Override
   public void e(brv $$0) {
      if (this.f.b() == dbx.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long O() {
      return this.dk;
   }

   @Nullable
   public xe P() {
      return null;
   }

   @Override
   public void a(bpz $$0) {
      super.a($$0);
      this.gH();
   }

   public boolean Q() {
      return this.dm;
   }

   public void R() {
      this.dm = false;
   }

   public alb S() {
      return this.cV;
   }

   public void a(aqt $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      this.d(this);
      this.ae();
      if ($$0 == this.dU()) {
         this.d.a($$1, $$2, $$3, $$4, $$5);
      } else {
         aqt $$6 = this.B();
         erb $$7 = $$0.B_();
         this.d.b(new aek(this.b($$0), (byte)3));
         this.d.b(new ack($$7.q(), $$7.r()));
         this.e.ah().e(this);
         $$6.a(this, brv.d.e);
         this.dR();
         this.b($$1, $$2, $$3, $$4, $$5);
         this.a($$0);
         $$0.a(this);
         this.d($$6);
         this.d.a($$1, $$2, $$3, $$4, $$5);
         this.e.ah().a(this, $$0);
         this.e.ah().f(this);
      }
   }

   @Nullable
   public ir T() {
      return this.dA;
   }

   public float U() {
      return this.dC;
   }

   public aks<dca> V() {
      return this.dz;
   }

   public boolean W() {
      return this.dB;
   }

   public void a(aks<dca> $$0, @Nullable ir $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.dA) && $$0.equals(this.dz);
         if ($$4 && !$$5) {
            this.a(xe.c("block.minecraft.set_spawn"));
         }

         this.dA = $$1;
         this.dz = $$0;
         this.dC = $$2;
         this.dB = $$3;
      } else {
         this.dA = null;
         this.dz = dca.h;
         this.dC = 0.0F;
         this.dB = false;
      }
   }

   public jt X() {
      return this.dx;
   }

   public void a(jt $$0) {
      this.dx = $$0;
   }

   public aqh Y() {
      return this.dy;
   }

   public void a(aqh $$0) {
      this.dy = $$0;
   }

   @Override
   public void a(avn $$0, avq $$1, float $$2, float $$3) {
      this.d.b(new afr(lh.b.e($$0), $$1, this.dz(), this.dB(), this.dF(), $$2, $$3, this.al.g()));
   }

   @Override
   public cig a(cuh $$0, boolean $$1, boolean $$2) {
      cig $$3 = super.a($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dU().b($$3);
         cuh $$4 = $$3.p();
         if ($$2) {
            if (!$$4.d()) {
               this.a(avz.f.b($$4.f()), $$0.G());
               an.ak.a(this, $$0);
            }

            this.a(avz.F);
         }

         return $$3;
      }
   }

   public ary Z() {
      return this.dD;
   }

   public void a(aqt $$0) {
      this.a((dca)$$0);
      this.f.a($$0);
   }

   @Nullable
   private static dbx a(@Nullable uk $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? dbx.a($$0.h($$1)) : null;
   }

   private dbx b(@Nullable dbx $$0) {
      dbx $$1 = this.e.bf();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.e.u_();
      }
   }

   @Override
   public void c(@Nullable uk $$0) {
      this.f.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void k(uk $$0) {
      $$0.a("playerGameType", this.f.b().a());
      dbx $$1 = this.f.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean aa() {
      return this.dE;
   }

   public boolean b(aqu $$0) {
      return $$0 == this ? false : this.dE || $$0.dE;
   }

   @Override
   public boolean a(dca $$0, ir $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cuh $$0) {
      an.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      clx $$1 = this.gl();
      cuh $$2 = $$1.a($$0);
      this.cq.b($$1, $$1.k).ifPresent($$1x -> this.cq.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean ab() {
      return this.dF;
   }

   @Override
   public Optional<cle> ac() {
      return Optional.of(this.dH);
   }

   public void b(boolean $$0) {
      this.dG = $$0;
   }

   @Override
   public void a(cig $$0) {
      super.a($$0);
      brv $$1 = $$0.t();
      if ($$1 != null) {
         an.S.a(this, $$0.p(), $$1);
      }
   }

   public void a(xv $$0) {
      this.dK = $$0;
   }

   @Nullable
   public xv ad() {
      return this.dK != null && this.dK.b() ? null : this.dK;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cL = (float)(aym.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dK());
      this.d.b(new adg(this));
   }

   @Override
   public boolean a(brv $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         $$0.j(this);
         this.d.a(this.dz(), this.dB(), this.dF(), this.dK(), this.dM());
         if ($$0 instanceof bso $$2) {
            for (brh $$3 : $$2.eF()) {
               this.d.b(new age($$0.al(), $$3, false));
            }
         }

         return true;
      }
   }

   @Override
   public void ae() {
      brv $$0 = this.dh();
      super.ae();
      if ($$0 instanceof bso $$1) {
         for (brh $$2 : $$1.eF()) {
            this.d.b(new aei($$0.al(), $$2.c()));
         }
      }
   }

   public agg b(aqt $$0) {
      return new agg(
         $$0.ae(), $$0.af(), ddb.a($$0.C()), this.f.b(), this.f.c(), $$0.ai(), $$0.B(), this.gM(), this.ax(), this.aJ != null ? this.aJ.c() : this.aL
      );
   }

   @Override
   public void d(ir $$0) {
      this.as.a(cly.cl, Optional.of($$0));
   }

   public void e(ir $$0) {
      this.as.a(cly.cm, Optional.of($$0));
   }
}
