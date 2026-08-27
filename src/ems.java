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

public class ems extends gfx {
   static final afw a = new afw("icon/info");
   static final afw b = new afw("icon/new_realm");
   static final afw c = new afw("realm_status/expired");
   static final afw y = new afw("realm_status/expires_soon");
   static final afw z = new afw("realm_status/open");
   static final afw A = new afw("realm_status/closed");
   private static final afw B = new afw("icon/invite");
   private static final afw C = new afw("icon/news");
   static final Logger D = LogUtils.getLogger();
   private static final afw E = new afw("textures/gui/title/realms.png");
   private static final afw F = new afw("textures/gui/realms/no_realms.png");
   private static final ui G = ui.c("menu.online");
   private static final ui H = ui.c("mco.selectServer.loading");
   static final ui I = ui.c("mco.selectServer.uninitialized");
   static final ui J = ui.c("mco.selectServer.expiredList");
   private static final ui K = ui.c("mco.selectServer.expiredRenew");
   static final ui L = ui.c("mco.selectServer.expiredTrial");
   private static final ui M = ui.c("mco.selectServer.play");
   private static final ui N = ui.c("mco.selectServer.leave");
   private static final ui O = ui.c("mco.selectServer.configure");
   static final ui P = ui.c("mco.selectServer.expired");
   static final ui Q = ui.c("mco.selectServer.expires.soon");
   static final ui R = ui.c("mco.selectServer.expires.day");
   static final ui S = ui.c("mco.selectServer.open");
   static final ui T = ui.c("mco.selectServer.closed");
   static final ui U = ui.a("gui.narrate.button", I);
   private static final ui V = ui.c("mco.selectServer.noRealms");
   private static final euu W = euu.a(ui.c("mco.invites.nopending"));
   private static final euu X = euu.a(ui.c("mco.invites.pending"));
   private static final int Y = 100;
   private static final int Z = 3;
   private static final int aa = 4;
   private static final int ab = 308;
   private static final int ac = 128;
   private static final int ad = 34;
   private static final int ae = 128;
   private static final int af = 64;
   private static final int ag = 5;
   private static final int ah = 44;
   private static final int ai = 11;
   private static final int aj = 40;
   private static final int ak = 20;
   private static final int al = 216;
   private static final int am = 36;
   private static final boolean an = !aa.b().g();
   private static boolean ao = an;
   private final CompletableFuture<emr.a> ap = emr.a();
   @Nullable
   private epw.c aq;
   private final Set<UUID> ar = new HashSet<>();
   private static boolean as;
   private final RateLimiter at;
   private final ezd au;
   private etj av;
   private etj aw;
   private etj ax;
   private etj ay;
   private etj az;
   private ems.j aA;
   private eop aB;
   private List<eno> aC = List.of();
   private volatile boolean aD;
   @Nullable
   private volatile String aE;
   long aF;
   private final List<enn> aG = new ArrayList<>();
   private etj aH;
   private ems.g aI;
   private ems.g aJ;
   private ems.f aK;
   @Nullable
   private ewt aL;

   public ems(ezd $$0) {
      super(G);
      this.au = $$0;
      this.at = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aM_() {
      this.aB = new eop(this.f);
      this.aA = this.d(new ems.j());
      ui $$0 = ui.c("mco.invites.title");
      this.aI = new ems.g($$0, B, $$1x -> this.f.a(new epi(this, $$0)));
      ui $$1 = ui.c("mco.news");
      this.aJ = new ems.g($$1, C, $$0x -> {
         if (this.aE != null) {
            exw.a(this.aE, this, true);
            if (this.aJ.a() != 0) {
               eqc.a $$1x = eqc.b();
               $$1x.b = false;
               eqc.b($$1x);
               this.aJ.a(0);
            }
         }
      });
      this.aJ.a(euu.a($$1));
      this.av = etj.a(M, $$0x -> a(this.K(), this)).a(100).a();
      this.ay = etj.a(O, $$0x -> this.f(this.K())).a(100).a();
      this.ax = etj.a(K, $$0x -> this.e(this.K())).a(100).a();
      this.az = etj.a(N, $$0x -> this.g(this.K())).a(100).a();
      this.aH = etj.a(ui.c("mco.selectServer.purchase"), $$0x -> this.L()).b(100, 20).a();
      this.aw = etj.a(uh.k, $$0x -> this.f.a(this.au)).a(100).a();
      if (emx.a == emx.b.b) {
         this.d(etq.a(ui.b("Snapshot"), ui.b("Release")).a(5, 5, 100, 20, ui.b("Realm"), ($$0x, $$1x) -> {
            ao = $$1x;
            this.aC = List.of();
            this.G();
         }));
      }

      this.a(ems.f.a);
      this.F();
      this.ap.thenAcceptAsync($$0x -> {
         ezd $$1x = $$0x.a(this.au);
         if ($$1x == null) {
            this.aq = this.a(this.f.aY());
         } else {
            this.f.a($$1x);
         }
      }, this.j);
   }

   public static boolean b() {
      return an && ao;
   }

   @Override
   protected void c() {
      if (this.aL != null) {
         this.aA.a(this.g, this.h, this.aL.c(), this.h - this.aL.b());
         this.aL.a();
      }
   }

   private void C() {
      if (this.aB.a() && this.aC.isEmpty() && this.aG.isEmpty()) {
         this.a(ems.f.b);
      } else {
         this.a(ems.f.c);
      }
   }

   private void a(ems.f $$0) {
      if (this.aK != $$0) {
         if (this.aL != null) {
            this.aL.a($$1 -> this.f($$1));
         }

         this.aL = this.b($$0);
         this.aK = $$0;
         this.aL.a($$1 -> {
            eth var10000 = this.d($$1);
         });
         this.c();
      }
   }

   private ewt b(ems.f $$0) {
      ewt $$1 = new ewt(this);
      $$1.b(44);
      $$1.a(this.D());
      ewu $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.i() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new ety(this.i, H));
            break;
         case b:
            $$1.c(this.E());
      }

      return $$1;
   }

   private ewu D() {
      int $$0 = 90;
      ewx $$1 = ewx.e().a(4);
      $$1.c().e();
      $$1.a(this.aI);
      $$1.a(this.aJ);
      ewx $$2 = ewx.e();
      $$2.c().e();
      $$2.a(ewy.a(90));
      $$2.a(etw.a(128, 34, E, 128, 64), eww::b);
      $$2.a(new ewr(90, 44)).a($$1, eww::c);
      return $$2;
   }

   private ewu c(ems.f $$0) {
      ews $$1 = new ews().c(4);
      ews.b $$2 = $$1.d(3);
      if ($$0 == ems.f.c) {
         $$2.a(this.av);
         $$2.a(this.ay);
         $$2.a(this.ax);
         $$2.a(this.az);
      }

      $$2.a(this.aH);
      $$2.a(this.aw);
      return $$1;
   }

   private ewx E() {
      ewx $$0 = ewx.d().a(10);
      $$0.c().b();
      $$0.a(etw.a(130, 64, F, 130, 64));
      etu $$1 = new etu(308, V, this.i, false);
      $$0.a($$1);
      return $$0;
   }

   void F() {
      eno $$0 = this.K();
      this.aH.i = this.aK != ems.f.a;
      this.av.i = $$0 != null && this.a($$0);
      this.ax.i = $$0 != null && this.b($$0);
      this.az.i = $$0 != null && this.d($$0);
      this.ay.i = $$0 != null && this.c($$0);
   }

   boolean a(eno $$0) {
      boolean $$1 = !$$0.j && $$0.e == eno.c.b;
      return $$1 && ($$0.d() || this.i($$0));
   }

   private boolean b(eno $$0) {
      return $$0.j && this.i($$0);
   }

   private boolean c(eno $$0) {
      return this.i($$0);
   }

   private boolean d(eno $$0) {
      return !this.i($$0);
   }

   @Override
   public void d() {
      super.d();
      if (this.aq != null) {
         this.aq.b();
      }
   }

   public static void e() {
      ero.O().aY().d.a();
   }

   public static void f() {
      ero.O().aY().c.a();
   }

   private void G() {
      for (epw.e<?> $$0 : this.f.aY().a()) {
         $$0.a();
      }
   }

   private epw.c a(eon $$0) {
      epw.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aB.a($$0x.a());
         this.aC = $$0x.b();
         this.H();
         boolean $$1x = false;

         for (eno $$2 : this.aB) {
            if (this.j($$2)) {
               $$1x = true;
            }
         }

         if (!as && $$1x) {
            as = true;
            this.I();
         }
      });
      a(emx::d, $$0x -> {
         this.aG.clear();
         this.aG.addAll($$0x);

         for (enn $$1x : $$0x) {
            if ($$1x instanceof enn.a $$2) {
               eul $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.f.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aG.isEmpty() && this.aK != ems.f.a) {
            this.H();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aI.a($$0x);
         this.aI.a($$0x == 0 ? W : X);
         if ($$0x > 0 && this.at.tryAcquire(1)) {
            this.f.aV().c(ui.a("mco.configure.world.invite.narration", $$0x));
         }
      });
      $$1.a($$0.e, $$0x -> this.aD = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.g.a($$1x);
         this.aE = $$0.g.b();
         this.aJ.a($$0.g.a() ? Integer.MAX_VALUE : 0);
      });
      return $$1;
   }

   private void a(Collection<enn> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (enn $$2 : $$0) {
         if (!$$2.a() && !this.ar.contains($$2.c())) {
            $$1.add($$2.c());
         }
      }

      if (!$$1.isEmpty()) {
         a($$1x -> {
            $$1x.a($$1);
            return null;
         }, $$1x -> this.ar.addAll($$1));
      }
   }

   private static <T> void a(ems.k<T> $$0, Consumer<T> $$1) {
      ero $$2 = ero.O();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(emx.a($$2));
         } catch (eok var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         D.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void H() {
      eno $$0 = this.K();
      this.aA.v();

      for (enn $$1 : this.aG) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (eno $$2 : this.aC) {
         this.aA.a(new ems.a($$2));
      }

      for (eno $$3 : this.aB) {
         ems.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == eno.c.c) {
               continue;
            }

            $$4 = new ems.i($$3);
         } else {
            $$4 = new ems.l($$3);
         }

         this.aA.a((ems.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.aA.a($$4);
         }
      }

      this.C();
      this.F();
   }

   private boolean a(enn $$0) {
      if (!($$0 instanceof enn.c $$1)) {
         return false;
      } else {
         ui $$2 = $$1.d();
         int $$3 = this.i.b($$2, 216);
         int $$4 = asy.e($$3 + 7, 36) - 1;
         this.aA.a(new ems.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.aA.a(new ems.d());
         }

         this.aA.a(new ems.b($$1.a(this)));
         return true;
      }
   }

   private void I() {
      new Thread(() -> {
         List<eny> $$0 = emw.a();
         emx $$1 = emx.a();
         enj $$2 = new enj();
         $$2.a = $$0;
         $$2.b = this.J();

         try {
            $$1.a($$2);
         } catch (Throwable var5) {
            D.warn("Could not send ping result to Realms: ", var5);
         }
      }).start();
   }

   private List<Long> J() {
      List<Long> $$0 = Lists.newArrayList();

      for (eno $$1 : this.aB) {
         if (this.j($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable eno $$0) {
      if ($$0 != null) {
         String $$1 = arv.a($$0.b, this.f.V().b(), $$0.k);
         this.f.o.a($$1);
         ac.i().a($$1);
      }
   }

   private void f(@Nullable eno $$0) {
      if ($$0 != null && this.f.b($$0.g)) {
         this.f.a(new eox(this, $$0.a));
      }
   }

   private void g(@Nullable eno $$0) {
      if ($$0 != null && !this.f.b($$0.g)) {
         ui $$1 = ui.c("mco.configure.world.leave.question.line1");
         ui $$2 = ui.c("mco.configure.world.leave.question.line2");
         this.f.a(new epd($$1x -> this.a($$1x, $$0), epd.a.b, $$1, $$2, true));
      }
   }

   @Nullable
   private eno K() {
      return this.aA.f() instanceof ems.l $$0 ? $$0.c() : null;
   }

   private void a(boolean $$0, final eno $$1) {
      if ($$0) {
         (new Thread("Realms-leave-server") {
            @Override
            public void run() {
               try {
                  emx $$0 = emx.a();
                  $$0.d($$1.a);
                  ems.this.f.execute(() -> ems.this.h($$1));
               } catch (eok var2) {
                  ems.D.error("Couldn't configure world", var2);
                  ems.this.f.execute(() -> ems.this.f.a(new epb(var2, ems.this)));
               }
            }
         }).start();
      }

      this.f.a(this);
   }

   void h(eno $$0) {
      this.aB.a($$0);
      this.aA.i().removeIf($$1 -> {
         if ($$1 instanceof ems.l $$2) {
            eno $$3 = $$2.c();
            return $$3.a == $$0.a;
         } else {
            return false;
         }
      });
      this.aA.a(null);
      this.F();
   }

   void a(UUID $$0) {
      a($$1 -> {
         $$1.b(List.of($$0));
         return null;
      }, $$1 -> {
         this.aG.removeIf($$1x -> $$1x.b() && $$0.equals($$1x.c()));
         this.H();
      });
   }

   public void g() {
      this.aA.a(null);
   }

   @Override
   public ui h() {
      return (ui)(switch (this.aK) {
         case a -> uh.a(super.h(), H);
         case b -> uh.a(super.h(), V);
         case c -> super.h();
      });
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.i, "Minecraft " + aa.b().c(), 2, this.h - 10, -1);
      }

      if (this.aD && this.aH.i) {
         epk.a($$0, this.aH);
      }

      switch (emx.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void L() {
      this.f.a(new epk(this, this.aD));
   }

   public static void a(@Nullable eno $$0, ezd $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable eno $$0, ezd $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2) {
            ero.O().a(new epe($$1, new eqn($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case e:
               ero.O().a(new epe($$1, new eqn($$1, $$0)));
               break;
            case a:
               a($$0, $$1, ui.c("mco.compatibility.unverifiable.title").a(n.o), ui.c("mco.compatibility.unverifiable.message"), uh.j);
               break;
            case c:
               a(
                  $$0,
                  $$1,
                  ui.c("selectWorld.backupQuestion.downgrade").a($$0x -> $$0x.a(-2142128)),
                  ui.a("mco.compatibility.downgrade.description", ui.b($$0.t).a(n.o), ui.b(aa.b().c()).a(n.o)),
                  ui.c("mco.compatibility.downgrade")
               );
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  ui.c("mco.compatibility.upgrade.title").a(n.o),
                  ui.a("mco.compatibility.upgrade.description", ui.b($$0.t).a(n.o), ui.b(aa.b().c()).a(n.o)),
                  ui.c("mco.compatibility.upgrade")
               );
         }
      }
   }

   private static void a(eno $$0, ezd $$1, ui $$2, ui $$3, ui $$4) {
      ero.O().a(new exx($$2x -> {
         ezd $$3x;
         if ($$2x) {
            $$3x = new epe($$1, new eqn($$1, $$0));
            f();
         } else {
            $$3x = $$1;
         }

         ero.O().a($$3x);
      }, $$2, $$3, $$4, uh.e));
   }

   boolean i(eno $$0) {
      return this.f.b($$0.g);
   }

   private boolean j(eno $$0) {
      return this.i($$0) && !$$0.j;
   }

   private void a(esy $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.g / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.i, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends ems.e {
      private static final ui c = ui.c("mco.snapshot.start");
      private static final int d = 5;
      private final euu e;
      private final eno f;

      public a(eno $$0) {
         this.f = $$0;
         this.e = euu.a(ui.c("mco.snapshot.tooltip"));
      }

      @Override
      public void a(esy $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(ems.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(ems.this.i, c, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(ems.this.i, ui.a("mco.snapshot.description", this.f.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.e.a($$8, this.aG_(), new exm($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (exh.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         ems.this.f.ai().a(gdd.a(aqd.yw, 1.0F));
         ems.this.f
            .a(
               new eul.a(ems.this, ui.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(ui.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(ui.c("mco.selectServer.create"), $$0 -> ems.this.f.a(new eoz(ems.this, this.f.a)))
                  .a(uh.e, eul::aC_)
                  .a()
            );
      }

      @Override
      public ui a() {
         return ui.a("gui.narrate.button", uh.a(c, ui.a("mco.snapshot.description", this.f.c)));
      }
   }

   class b extends ems.e {
      private final etj c;

      public b(etj $$0) {
         this.c = $$0;
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c.a($$0, $$1, $$2);
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         return this.c.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      @Override
      public void a(esy $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.b(ems.this.g / 2 - 75, $$2 + 4);
         this.c.a($$0, $$6, $$7, $$9);
      }

      @Override
      public ui a() {
         return this.c.l();
      }
   }

   static class c extends etv {
      private static final euw b = new euw(new afw("widget/cross_button"), new afw("widget/cross_button_highlighted"));

      protected c(etj.c $$0, ui $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(euu.a($$1));
      }
   }

   class d extends ems.e {
      @Override
      public void a(esy $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public ui a() {
         return ui.i();
      }
   }

   abstract class e extends euf.a<ems.e> {
      private static final int a = 10;
      private static final int c = 28;
      private static final int d = 7;

      protected void a(eno $$0, esy $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, ems.c, () -> ems.P);
         } else if ($$0.e == eno.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, ems.A, () -> ems.T);
         } else if (ems.this.i($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, ems.y, () -> {
               if ($$0.l <= 0) {
                  return ems.Q;
               } else {
                  return (ui)($$0.l == 1 ? ems.R : ui.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == eno.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, ems.z, () -> ems.S);
         }
      }

      private void a(esy $$0, int $$1, int $$2, int $$3, int $$4, afw $$5, Supplier<ui> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27 && $$4 < ems.this.h - 40 && $$4 > 32) {
            ems.this.d($$6.get());
         }
      }

      protected void a(esy $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (ems.this.i.b($$1) > $$6) {
            String $$7 = ems.this.i.a($$1, $$6 - ems.this.i.b("... "));
            $$0.a(ems.this.i, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(ems.this.i, $$1, $$2, $$3, $$5, false);
         }
      }

      protected ui a(eno $$0, int $$1) {
         return (ui)(StringUtils.isBlank($$0.t) ? uh.a : ui.a("mco.version", ui.b($$0.t).a($$1x -> $$1x.a($$1))));
      }

      protected int a(int $$0, int $$1, ui $$2) {
         return $$0 + $$1 - ems.this.i.a($$2) - 20;
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

   static class g extends euo.b {
      private static final afw[] d = new afw[]{
         new afw("notification/1"),
         new afw("notification/2"),
         new afw("notification/3"),
         new afw("notification/4"),
         new afw("notification/5"),
         new afw("notification/more")
      };
      private static final int s = Integer.MAX_VALUE;
      private static final int t = 20;
      private static final int u = 14;
      private int v;

      public g(ui $$0, afw $$1, etj.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2);
      }

      int a() {
         return this.v;
      }

      public void a(int $$0) {
         this.v = $$0;
      }

      @Override
      public void b(esy $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.i && this.v != 0) {
            this.a($$0);
         }
      }

      private void a(esy $$0) {
         $$0.a(d[Math.min(this.v, 6) - 1], this.p() + this.k() - 5, this.r() - 3, 8, 8);
      }
   }

   class h extends ems.e {
      private static final int c = 40;
      private static final int d = -12303292;
      private final ui e;
      private final int f;
      private final List<eth> g = new ArrayList<>();
      @Nullable
      private final ems.c h;
      private final eud i;
      private final ews j;
      private final ewr k;
      private int l = -1;

      public h(ui $$0, int $$1, enn $$2) {
         this.e = $$0;
         this.f = $$1;
         this.j = new ews();
         int $$3 = 7;
         this.j.a(etw.a(20, 20, ems.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(ewy.a(40), 0, 0);
         this.k = this.j.a(new ewr(0, 9 * 3 * ($$1 - 1)), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new eud($$0, ems.this.i).b(true), this.k.b().b().d());
         this.j.a(ewy.a(40), 0, 2);
         if ($$2.b()) {
            this.h = this.j.a(new ems.c($$1x -> ems.this.a($$2.c()), ui.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
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
         this.i.j($$1);
         this.j.a();
      }

      @Override
      public void b(esy $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.f - 2, -12303292);
      }

      @Override
      public void a(esy $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.j.b($$3, $$2);
         this.e($$4 - 4);
         this.g.forEach($$4x -> $$4x.a($$0, $$6, $$7, $$9));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.h != null) {
            this.h.a($$0, $$1, $$2);
         }

         return true;
      }

      @Override
      public ui a() {
         return this.e;
      }
   }

   class i extends ems.e {
      private final eno c;
      private final euu d;

      public i(eno $$0) {
         this.c = $$0;
         this.d = euu.a(ui.c("mco.snapshot.parent.tooltip"));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void a(esy $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         eqe.a($$0, $$3, $$2, 32, this.c.g);
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         ui $$12 = this.a(this.c, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.c.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != uh.a) {
            $$0.a(ems.this.i, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(ems.this.i, this.c.a(), $$10, this.c($$11), -8355712, false);
         if (!ems.this.i(this.c)) {
            $$0.a(ems.this.i, this.c.f, $$10, this.d($$11), -8355712, false);
         }

         this.d.a($$8, this.aG_(), new exm($$3, $$2, $$4, $$5));
         this.a(this.c, $$0, $$3 + $$4, $$2, $$6, $$7);
      }

      @Override
      public ui a() {
         return ui.b(this.c.c);
      }
   }

   class j extends gfw<ems.e> {
      public j() {
         super(ems.this.g, ems.this.h, 0, ems.this.h, 36);
      }

      public void a(@Nullable ems.e $$0) {
         super.a($$0);
         ems.this.F();
      }

      @Override
      public int a() {
         return this.k() * 36;
      }

      @Override
      public int b() {
         return 300;
      }
   }

   interface k<T> {
      T request(emx var1) throws eok;
   }

   class l extends ems.e {
      private static final int c = 36;
      private final eno d;
      @Nullable
      private final euu e;

      public l(eno $$0) {
         this.d = $$0;
         boolean $$1 = ems.this.i($$0);
         if (ems.b() && $$1 && $$0.h()) {
            this.e = euu.a(ui.a("mco.snapshot.paired", $$0.s));
         } else if (ems.b() && !$$1 && $$0.e()) {
            this.e = euu.a(ui.a("mco.snapshot.friendsRealm.upgrade", $$0.f));
         } else if (ems.b() && !$$1 && $$0.f()) {
            this.e = euu.a(ui.a("mco.snapshot.friendsRealm.downgrade", $$0.t));
         } else {
            this.e = null;
         }
      }

      @Override
      public void a(esy $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.d.e == eno.c.c) {
            $$0.a(ems.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(ems.this.i, ems.I, $$3 + 40 - 2, $$10, 8388479);
         } else {
            this.a(this.d, $$0, $$3 + $$4, $$2, $$6, $$7);
            int $$11 = this.b($$3);
            int $$12 = this.a($$2);
            int $$13 = this.c($$12);
            int $$14 = this.d($$12);
            ui $$15 = this.a(this.d, this.d.d() ? -8355712 : -2142128);
            int $$16 = this.a($$3, $$4, $$15);
            this.a($$0, this.d.b(), $$11, $$12, $$16, -1);
            if (ems.this.i(this.d) && this.d.j) {
               ui $$17 = this.d.k ? ems.L : ems.J;
               $$0.a(ems.this.i, $$17, $$11, $$14, 15553363, false);
            } else if (this.d.m == eno.d.b) {
               ui $$18 = ui.b(this.d.c()).a(n.h);
               $$0.a(ems.this.i, ui.a("mco.selectServer.minigameName", $$18).a(n.o), $$11, $$13, 13413468, false);
            } else {
               $$0.a(ems.this.i, this.d.a(), $$11, $$13, -8355712, false);
               if ($$15 != uh.a) {
                  $$0.a(ems.this.i, $$15, $$16, $$12, -8355712, false);
               }

               if (!ems.this.i(this.d)) {
                  $$0.a(ems.this.i, this.d.f, $$11, $$14, -8355712, false);
               }
            }

            if (this.e != null) {
               this.e.a($$8, this.aG_(), new exm($$3, $$2, $$4, $$5));
            }

            eqe.a($$0, $$3, $$2, 32, this.d.g);
         }
      }

      private void e() {
         ems.this.f.ai().a(gdd.a(aqd.yw, 1.0F));
         ems.a(this.d, ems.this);
      }

      private void f() {
         ems.this.f.ai().a(gdd.a(aqd.yw, 1.0F));
         eoz $$0 = new eoz(ems.this, this.d);
         ems.this.f.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == eno.c.c) {
            this.f();
         } else if (ems.this.a(this.d)) {
            if (ac.b() - ems.this.aF < 250L && this.aG_()) {
               this.e();
            }

            ems.this.aF = ac.b();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (exh.a($$0)) {
            if (this.d.e == eno.c.c) {
               this.f();
               return true;
            }

            if (ems.this.a(this.d)) {
               this.e();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public ui a() {
         return (ui)(this.d.e == eno.c.c ? ems.U : ui.a("narrator.select", this.d.c));
      }

      public eno c() {
         return this.d;
      }
   }
}
