import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

public class exy extends gsq {
   static final akf a = new akf("icon/info");
   static final akf b = new akf("icon/new_realm");
   static final akf c = new akf("realm_status/expired");
   static final akf B = new akf("realm_status/expires_soon");
   static final akf C = new akf("realm_status/open");
   static final akf D = new akf("realm_status/closed");
   private static final akf E = new akf("icon/invite");
   private static final akf F = new akf("icon/news");
   static final Logger G = LogUtils.getLogger();
   private static final akf H = new akf("textures/gui/title/realms.png");
   private static final akf I = new akf("textures/gui/realms/no_realms.png");
   private static final ws J = ws.c("menu.online");
   private static final ws K = ws.c("mco.selectServer.loading");
   static final ws L = ws.c("mco.selectServer.uninitialized");
   static final ws M = ws.c("mco.selectServer.expiredList");
   private static final ws N = ws.c("mco.selectServer.expiredRenew");
   static final ws O = ws.c("mco.selectServer.expiredTrial");
   private static final ws P = ws.c("mco.selectServer.play");
   private static final ws Q = ws.c("mco.selectServer.leave");
   private static final ws R = ws.c("mco.selectServer.configure");
   static final ws S = ws.c("mco.selectServer.expired");
   static final ws T = ws.c("mco.selectServer.expires.soon");
   static final ws U = ws.c("mco.selectServer.expires.day");
   static final ws V = ws.c("mco.selectServer.open");
   static final ws W = ws.c("mco.selectServer.closed");
   static final ws X = ws.a("gui.narrate.button", L);
   private static final ws Y = ws.c("mco.selectServer.noRealms");
   private static final ws Z = ws.c("mco.invites.nopending");
   private static final ws aa = ws.c("mco.invites.pending");
   private static final int ab = 100;
   private static final int ac = 3;
   private static final int ad = 4;
   private static final int ae = 308;
   private static final int af = 128;
   private static final int ag = 34;
   private static final int ah = 128;
   private static final int ai = 64;
   private static final int aj = 5;
   private static final int ak = 44;
   private static final int al = 11;
   private static final int am = 40;
   private static final int an = 20;
   private static final int ao = 216;
   private static final int ap = 36;
   private static final boolean aq = !aa.b().g();
   private static boolean ar = aq;
   private final CompletableFuture<exx.a> as = exx.a();
   @Nullable
   private fbc.c at;
   private final Set<UUID> au = new HashSet<>();
   private static boolean av;
   private final RateLimiter aw;
   private final fkt ax;
   private feu ay;
   private feu az;
   private feu aA;
   private feu aB;
   private feu aC;
   exy.j aD;
   private ezv aE;
   private List<eyu> aF = List.of();
   private volatile boolean aG;
   @Nullable
   private volatile String aH;
   long aI;
   private final List<eyt> aJ = new ArrayList<>();
   private feu aK;
   private exy.g aL;
   private exy.g aM;
   private exy.f aN;
   @Nullable
   private fih aO;

   public exy(fkt $$0) {
      super(J);
      this.ax = $$0;
      this.aw = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aM_() {
      this.aE = new ezv(this.m);
      this.aD = new exy.j();
      ws $$0 = ws.c("mco.invites.title");
      this.aL = new exy.g($$0, E, $$1x -> this.m.a(new fao(this, $$0)));
      ws $$1 = ws.c("mco.news");
      this.aM = new exy.g($$1, F, $$0x -> {
         String $$1x = this.aH;
         if ($$1x != null) {
            fjk.a(this, $$1x);
            if (this.aM.a() != 0) {
               fbi.a $$2 = fbi.b();
               $$2.b = false;
               fbi.b($$2);
               this.aM.a(0);
            }
         }
      });
      this.aM.a(fgf.a($$1));
      this.ay = feu.a(P, $$0x -> a(this.M(), this)).a(100).a();
      this.aB = feu.a(R, $$0x -> this.f(this.M())).a(100).a();
      this.aA = feu.a(N, $$0x -> this.e(this.M())).a(100).a();
      this.aC = feu.a(Q, $$0x -> this.g(this.M())).a(100).a();
      this.aK = feu.a(ws.c("mco.selectServer.purchase"), $$0x -> this.N()).b(100, 20).a();
      this.az = feu.a(wr.k, $$0x -> this.d()).a(100).a();
      if (eyd.a == eyd.b.b) {
         this.c(ffb.a(ws.b("Snapshot"), ws.b("Release")).a(5, 5, 100, 20, ws.b("Realm"), ($$0x, $$1x) -> {
            ar = $$1x;
            this.aF = List.of();
            this.I();
         }));
      }

      this.a(exy.f.a);
      this.F();
      this.as.thenAcceptAsync($$0x -> {
         fkt $$1x = $$0x.a(this.ax);
         if ($$1x == null) {
            this.at = this.a(this.m.bb());
         } else {
            this.m.a($$1x);
         }
      }, this.q);
   }

   public static boolean b() {
      return aq && ar;
   }

   @Override
   protected void c() {
      if (this.aO != null) {
         this.aD.a(this.n, this.aO);
         this.aO.a();
      }
   }

   @Override
   public void d() {
      this.m.a(this.ax);
   }

   private void C() {
      if (this.aE.a() && this.aF.isEmpty() && this.aJ.isEmpty()) {
         this.a(exy.f.b);
      } else {
         this.a(exy.f.c);
      }
   }

   private void a(exy.f $$0) {
      if (this.aN != $$0) {
         if (this.aO != null) {
            this.aO.a($$1 -> this.e($$1));
         }

         this.aO = this.b($$0);
         this.aN = $$0;
         this.aO.a($$1 -> {
            fes var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private fih b(exy.f $$0) {
      fih $$1 = new fih(this);
      $$1.b(44);
      $$1.a(this.D());
      fii $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.v() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new ffj(this.p, K));
            break;
         case b:
            $$1.c(this.E());
            break;
         case c:
            $$1.c(this.aD);
      }

      return $$1;
   }

   private fii D() {
      int $$0 = 90;
      fil $$1 = fil.e().a(4);
      $$1.c().e();
      $$1.a(this.aL);
      $$1.a(this.aM);
      fil $$2 = fil.e();
      $$2.c().e();
      $$2.a(fim.a(90));
      $$2.a(ffh.a(128, 34, H, 128, 64), fik::b);
      $$2.a(new fif(90, 44)).a($$1, fik::c);
      return $$2;
   }

   private fii c(exy.f $$0) {
      fig $$1 = new fig().c(4);
      fig.b $$2 = $$1.d(3);
      if ($$0 == exy.f.c) {
         $$2.a(this.ay);
         $$2.a(this.aB);
         $$2.a(this.aA);
         $$2.a(this.aC);
      }

      $$2.a(this.aK);
      $$2.a(this.az);
      return $$1;
   }

   private fil E() {
      fil $$0 = fil.d().a(8);
      $$0.c().b();
      $$0.a(ffh.a(130, 64, I, 130, 64));
      fff $$1 = new fff(308, Y, this.p, false, 4);
      $$0.a($$1);
      return $$0;
   }

   void F() {
      eyu $$0 = this.M();
      this.aK.j = this.aN != exy.f.a;
      this.ay.j = $$0 != null && this.a($$0);
      this.aA.j = $$0 != null && this.b($$0);
      this.aC.j = $$0 != null && this.d($$0);
      this.aB.j = $$0 != null && this.c($$0);
   }

   boolean a(eyu $$0) {
      boolean $$1 = !$$0.j && $$0.e == eyu.c.b;
      return $$1 && ($$0.d() || this.h($$0));
   }

   private boolean b(eyu $$0) {
      return $$0.j && this.h($$0);
   }

   private boolean c(eyu $$0) {
      return this.h($$0) && $$0.e != eyu.c.c;
   }

   private boolean d(eyu $$0) {
      return !this.h($$0);
   }

   @Override
   public void e() {
      super.e();
      if (this.at != null) {
         this.at.b();
      }
   }

   public static void f() {
      fcu.Q().bb().d.a();
   }

   public static void g() {
      fcu.Q().bb().c.a();
   }

   private void I() {
      for (fbc.e<?> $$0 : this.m.bb().a()) {
         $$0.a();
      }
   }

   private fbc.c a(ezt $$0) {
      fbc.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aE.a($$0x.a());
         this.aF = $$0x.b();
         this.J();
         boolean $$1x = false;

         for (eyu $$2 : this.aE) {
            if (this.i($$2)) {
               $$1x = true;
            }
         }

         if (!av && $$1x) {
            av = true;
            this.K();
         }
      });
      a(eyd::d, $$0x -> {
         this.aJ.clear();
         this.aJ.addAll($$0x);

         for (eyt $$1x : $$0x) {
            if ($$1x instanceof eyt.a $$2) {
               ffw $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.m.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aJ.isEmpty() && this.aN != exy.f.a) {
            this.J();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aL.a($$0x);
         this.aL.a($$0x == 0 ? fgf.a(Z) : fgf.a(aa));
         if ($$0x > 0 && this.aw.tryAcquire(1)) {
            this.m.aY().c(ws.a("mco.configure.world.invite.narration", $$0x));
         }
      });
      $$1.a($$0.e, $$0x -> this.aG = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.g.a($$1x);
         this.aH = $$0.g.b();
         this.aM.a($$0.g.a() ? Integer.MAX_VALUE : 0);
      });
      return $$1;
   }

   private void a(Collection<eyt> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (eyt $$2 : $$0) {
         if (!$$2.a() && !this.au.contains($$2.c())) {
            $$1.add($$2.c());
         }
      }

      if (!$$1.isEmpty()) {
         a($$1x -> {
            $$1x.a($$1);
            return null;
         }, $$1x -> this.au.addAll($$1));
      }
   }

   private static <T> void a(exy.k<T> $$0, Consumer<T> $$1) {
      fcu $$2 = fcu.Q();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(eyd.a($$2));
         } catch (ezq var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         G.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void J() {
      eyu $$0 = this.M();
      this.aD.I();

      for (eyt $$1 : this.aJ) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (eyu $$2 : this.aF) {
         this.aD.a(new exy.a($$2));
      }

      for (eyu $$3 : this.aE) {
         exy.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == eyu.c.c) {
               continue;
            }

            $$4 = new exy.i($$3);
         } else {
            $$4 = new exy.l($$3);
         }

         this.aD.a((exy.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.aD.a($$4);
         }
      }

      this.C();
      this.F();
   }

   private boolean a(eyt $$0) {
      if (!($$0 instanceof eyt.c $$1)) {
         return false;
      } else {
         ws $$2 = $$1.d();
         int $$3 = this.p.b($$2, 216);
         int $$4 = axw.e($$3 + 7, 36) - 1;
         this.aD.a(new exy.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.aD.a(new exy.d());
         }

         this.aD.a(new exy.b($$1.a(this)));
         return true;
      }
   }

   private void K() {
      new Thread(() -> {
         List<eze> $$0 = eyc.a();
         eyd $$1 = eyd.a();
         eyp $$2 = new eyp();
         $$2.a = $$0;
         $$2.b = this.L();

         try {
            $$1.a($$2);
         } catch (Throwable var5) {
            G.warn("Could not send ping result to Realms: ", var5);
         }
      }).start();
   }

   private List<Long> L() {
      List<Long> $$0 = Lists.newArrayList();

      for (eyu $$1 : this.aE) {
         if (this.i($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable eyu $$0) {
      if ($$0 != null) {
         String $$1 = aws.a($$0.b, this.m.X().b(), $$0.k);
         this.m.o.a($$1);
         ac.j().a($$1);
      }
   }

   private void f(@Nullable eyu $$0) {
      if ($$0 != null && this.m.b($$0.g)) {
         this.m.a(new fad(this, $$0.a));
      }
   }

   private void g(@Nullable eyu $$0) {
      if ($$0 != null && !this.m.b($$0.g)) {
         ws $$1 = ws.c("mco.configure.world.leave.question.line1");
         ws $$2 = ws.c("mco.configure.world.leave.question.line2");
         this.m.a(new faj($$1x -> this.a($$1x, $$0), faj.a.b, $$1, $$2, true));
      }
   }

   @Nullable
   private eyu M() {
      return this.aD.h() instanceof exy.l $$0 ? $$0.c() : null;
   }

   private void a(boolean $$0, final eyu $$1) {
      if ($$0) {
         (new Thread("Realms-leave-server") {
            @Override
            public void run() {
               try {
                  eyd $$0 = eyd.a();
                  $$0.d($$1.a);
                  exy.this.m.execute(exy::g);
               } catch (ezq var2) {
                  exy.G.error("Couldn't configure world", var2);
                  exy.this.m.execute(() -> exy.this.m.a(new fah(var2, exy.this)));
               }
            }
         }).start();
      }

      this.m.a(this);
   }

   void a(UUID $$0) {
      a($$1 -> {
         $$1.b(List.of($$0));
         return null;
      }, $$1 -> {
         this.aJ.removeIf($$1x -> $$1x.b() && $$0.equals($$1x.c()));
         this.J();
      });
   }

   public void h() {
      this.aD.a(null);
      g();
   }

   @Override
   public ws i() {
      return (ws)(switch (this.aN) {
         case a -> wr.a(super.i(), K);
         case b -> wr.a(super.i(), Y);
         case c -> super.i();
      });
   }

   @Override
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.p, "Minecraft " + aa.b().c(), 2, this.o - 10, -1);
      }

      if (this.aG && this.aK.j) {
         faq.a($$0, this.aK);
      }

      switch (eyd.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void N() {
      this.m.a(new faq(this, this.aG));
   }

   public static void a(@Nullable eyu $$0, fkt $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable eyu $$0, fkt $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2) {
            fcu.Q().a(new fak($$1, new fbt($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case e:
               fcu.Q().a(new fak($$1, new fbt($$1, $$0)));
               break;
            case a:
               a($$0, $$1, ws.c("mco.compatibility.unverifiable.title").b(-171), ws.c("mco.compatibility.unverifiable.message"), wr.j);
               break;
            case c:
               a(
                  $$0,
                  $$1,
                  ws.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  ws.a("mco.compatibility.downgrade.description", ws.b($$0.t).b(-171), ws.b(aa.b().c()).b(-171)),
                  ws.c("mco.compatibility.downgrade")
               );
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  ws.c("mco.compatibility.upgrade.title").b(-171),
                  ws.a("mco.compatibility.upgrade.description", ws.b($$0.t).b(-171), ws.b(aa.b().c()).b(-171)),
                  ws.c("mco.compatibility.upgrade")
               );
         }
      }
   }

   private static void a(eyu $$0, fkt $$1, ws $$2, ws $$3, ws $$4) {
      fcu.Q().a(new fjl($$2x -> {
         fkt $$3x;
         if ($$2x) {
            $$3x = new fak($$1, new fbt($$1, $$0));
            g();
         } else {
            $$3x = $$1;
         }

         fcu.Q().a($$3x);
      }, $$2, $$3, $$4, wr.e));
   }

   public static ws a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static ws a(String $$0, int $$1) {
      return (ws)(StringUtils.isBlank($$0) ? wr.a : ws.a("mco.version", ws.b($$0).b($$1)));
   }

   boolean h(eyu $$0) {
      return this.m.b($$0.g);
   }

   private boolean i(eyu $$0) {
      return this.h($$0) && !$$0.j;
   }

   private void a(feh $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.n / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.p, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends exy.e {
      private static final ws c = ws.c("mco.snapshot.start");
      private static final int d = 5;
      private final fgi e = new fgi();
      private final eyu f;

      public a(eyu $$0) {
         this.f = $$0;
         this.e.a(fgf.a(ws.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(feh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(exy.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(exy.this.p, c, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(exy.this.p, ws.a("mco.snapshot.description", this.f.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.e.a($$8, this.aI_(), new fja($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fiv.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         exy.this.m.ak().a(gpw.a(auz.Ac, 1.0F));
         exy.this.m
            .a(
               new ffw.a(exy.this, ws.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(ws.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(ws.c("mco.selectServer.create"), $$0 -> exy.this.m.a(new faf(exy.this, this.f.a)))
                  .a(wr.e, ffw::d)
                  .a()
            );
      }

      @Override
      public ws a() {
         return ws.a("gui.narrate.button", wr.a(c, ws.a("mco.snapshot.description", this.f.c)));
      }
   }

   class b extends exy.e {
      private final feu c;

      public b(feu $$0) {
         this.c = $$0;
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c.a($$0, $$1, $$2);
         return super.a($$0, $$1, $$2);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         return this.c.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      @Override
      public void a(feh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.c(exy.this.n / 2 - 75, $$2 + 4);
         this.c.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.c.a($$0);
      }

      @Override
      public ws a() {
         return this.c.y();
      }
   }

   static class c extends ffg {
      private static final fgh b = new fgh(new akf("widget/cross_button"), new akf("widget/cross_button_highlighted"));

      protected c(feu.c $$0, ws $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(fgf.a($$1));
      }
   }

   class d extends exy.e {
      @Override
      public void a(feh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public ws a() {
         return ws.i();
      }
   }

   abstract class e extends ffq.a<exy.e> {
      private static final int a = 10;
      private static final int c = 28;
      private static final int d = 7;

      protected void a(eyu $$0, feh $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, exy.c, () -> exy.S);
         } else if ($$0.e == eyu.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, exy.D, () -> exy.W);
         } else if (exy.this.h($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, exy.B, () -> {
               if ($$0.l <= 0) {
                  return exy.T;
               } else {
                  return (ws)($$0.l == 1 ? exy.U : ws.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == eyu.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, exy.C, () -> exy.V);
         }
      }

      private void a(feh $$0, int $$1, int $$2, int $$3, int $$4, akf $$5, Supplier<ws> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if (exy.this.aD.c((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            exy.this.d($$6.get());
         }
      }

      protected void a(feh $$0, int $$1, int $$2, eyu $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!exy.this.h($$3)) {
            $$0.a(exy.this.p, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            ws $$7 = $$3.k ? exy.O : exy.M;
            $$0.a(exy.this.p, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(feh $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (exy.this.p.b($$1) > $$6) {
            String $$7 = exy.this.p.a($$1, $$6 - exy.this.p.b("... "));
            $$0.a(exy.this.p, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(exy.this.p, $$1, $$2, $$3, $$5, false);
         }
      }

      protected int a(int $$0, int $$1, ws $$2) {
         return $$0 + $$1 - exy.this.p.a($$2) - 20;
      }

      protected int a(int $$0) {
         return $$0 + 1;
      }

      protected int b() {
         return 2 + 9;
      }

      protected int b(int $$0) {
         return $$0 + 36 + 2;
      }

      protected int c(int $$0) {
         return $$0 + this.b();
      }

      protected int d(int $$0) {
         return $$0 + this.b() * 2;
      }
   }

   static enum f {
      a,
      b,
      c;
   }

   static class g extends ffz.b {
      private static final akf[] d = new akf[]{
         new akf("notification/1"),
         new akf("notification/2"),
         new akf("notification/3"),
         new akf("notification/4"),
         new akf("notification/5"),
         new akf("notification/more")
      };
      private static final int u = Integer.MAX_VALUE;
      private static final int v = 20;
      private static final int w = 14;
      private int x;

      public g(ws $$0, akf $$1, feu.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2, null);
      }

      int a() {
         return this.x;
      }

      public void a(int $$0) {
         this.x = $$0;
      }

      @Override
      public void b(feh $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.x != 0) {
            this.a($$0);
         }
      }

      private void a(feh $$0) {
         $$0.a(d[Math.min(this.x, 6) - 1], this.C() + this.x() - 5, this.D() - 3, 8, 8);
      }
   }

   class h extends exy.e {
      private static final int c = 40;
      private static final int d = -12303292;
      private final ws e;
      private final int f;
      private final List<fes> g = new ArrayList<>();
      @Nullable
      private final exy.c h;
      private final ffo i;
      private final fig j;
      private final fif k;
      private int l = -1;

      public h(ws $$0, int $$1, eyt $$2) {
         this.e = $$0;
         this.f = $$1;
         this.j = new fig();
         int $$3 = 7;
         this.j.a(ffh.a(20, 20, exy.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(fim.a(40), 0, 0);
         this.k = this.j.a(new fif(0, 9 * 3 * ($$1 - 1)), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new ffo($$0, exy.this.p).b(true), this.k.b().b().d());
         this.j.a(fim.a(40), 0, 2);
         if ($$2.b()) {
            this.h = this.j.a(new exy.c($$1x -> exy.this.a($$2.c()), ws.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
         } else {
            this.h = null;
         }

         this.j.a(this.g::add);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         return this.h != null && this.h.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      private void e(int $$0) {
         if (this.l != $$0) {
            this.f($$0);
            this.l = $$0;
         }
      }

      private void f(int $$0) {
         int $$1 = $$0 - 80;
         this.k.b($$1);
         this.i.d($$1);
         this.j.a();
      }

      @Override
      public void b(feh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.f - 2, -12303292);
      }

      @Override
      public void a(feh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.j.c($$3, $$2);
         this.e($$4 - 4);
         this.g.forEach($$4x -> $$4x.a($$0, $$6, $$7, $$9));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.h != null) {
            this.h.a($$0, $$1, $$2);
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public ws a() {
         return this.e;
      }
   }

   class i extends exy.e {
      private final eyu c;
      private final fgi d = new fgi();

      public i(eyu $$0) {
         this.c = $$0;
         this.d.a(fgf.a(ws.c("mco.snapshot.parent.tooltip")));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void a(feh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         fbk.a($$0, $$3, $$2, 32, this.c.g);
         ws $$12 = exy.a(this.c.t, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.c.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != wr.a) {
            $$0.a(exy.this.p, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(exy.this.p, this.c.a(), $$10, this.c($$11), -8355712, false);
         this.a($$0, $$2, $$3, this.c);
         this.a(this.c, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.d.a($$8, this.aI_(), new fja($$3, $$2, $$4, $$5));
      }

      @Override
      public ws a() {
         return ws.b(this.c.c);
      }
   }

   class j extends gsp<exy.e> {
      public j() {
         super(exy.this.n, exy.this.o, 0, 36);
      }

      public void a(@Nullable exy.e $$0) {
         super.a($$0);
         exy.this.F();
      }

      @Override
      public int a() {
         return this.l() * 36;
      }

      @Override
      public int b() {
         return 300;
      }
   }

   interface k<T> {
      T request(eyd var1) throws ezq;
   }

   class l extends exy.e {
      private static final int c = 36;
      private final eyu d;
      private final fgi e = new fgi();

      public l(eyu $$0) {
         this.d = $$0;
         boolean $$1 = exy.this.h($$0);
         if (exy.b() && $$1 && $$0.h()) {
            this.e.a(fgf.a(ws.a("mco.snapshot.paired", $$0.s)));
         } else if (!$$1 && $$0.e()) {
            this.e.a(fgf.a(ws.a("mco.snapshot.friendsRealm.upgrade", $$0.f)));
         } else if (!$$1 && $$0.f()) {
            this.e.a(fgf.a(ws.a("mco.snapshot.friendsRealm.downgrade", $$0.t)));
         }
      }

      @Override
      public void a(feh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.d.e == eyu.c.c) {
            $$0.a(exy.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(exy.this.p, exy.L, $$3 + 40 - 2, $$10, 8388479);
         } else {
            fbk.a($$0, $$3, $$2, 32, this.d.g);
            this.a($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3);
            this.a($$0, $$2, $$3, this.d);
            this.a(this.d, $$0, $$3 + $$4, $$2, $$6, $$7);
            this.e.a($$8, this.aI_(), new fja($$3, $$2, $$4, $$5));
         }
      }

      private void a(feh $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         ws $$6 = exy.a(this.d.t, this.d.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.d.b(), $$4, $$5, $$7, -1);
         if ($$6 != wr.a) {
            $$0.a(exy.this.p, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void a(feh $$0, int $$1, int $$2) {
         int $$3 = this.b($$2);
         int $$4 = this.a($$1);
         int $$5 = this.c($$4);
         String $$6 = this.d.c();
         if (this.d.m == eyu.d.b && $$6 != null) {
            ws $$7 = ws.b($$6).a(n.h);
            $$0.a(exy.this.p, ws.a("mco.selectServer.minigameName", $$7).b(-171), $$3, $$5, -1, false);
         } else {
            $$0.a(exy.this.p, this.d.a(), $$3, this.c($$4), -8355712, false);
         }
      }

      private void d() {
         exy.this.m.ak().a(gpw.a(auz.Ac, 1.0F));
         exy.a(this.d, exy.this);
      }

      private void e() {
         exy.this.m.ak().a(gpw.a(auz.Ac, 1.0F));
         faf $$0 = new faf(exy.this, this.d);
         exy.this.m.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == eyu.c.c) {
            this.e();
         } else if (exy.this.a(this.d)) {
            if (ac.b() - exy.this.aI < 250L && this.aI_()) {
               this.d();
            }

            exy.this.aI = ac.b();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fiv.a($$0)) {
            if (this.d.e == eyu.c.c) {
               this.e();
               return true;
            }

            if (exy.this.a(this.d)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public ws a() {
         return (ws)(this.d.e == eyu.c.c ? exy.X : ws.a("narrator.select", this.d.c));
      }

      public eyu c() {
         return this.d;
      }
   }
}
