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

public class eom extends ghw {
   static final agm a = new agm("icon/info");
   static final agm b = new agm("icon/new_realm");
   static final agm c = new agm("realm_status/expired");
   static final agm v = new agm("realm_status/expires_soon");
   static final agm w = new agm("realm_status/open");
   static final agm x = new agm("realm_status/closed");
   private static final agm y = new agm("icon/invite");
   private static final agm z = new agm("icon/news");
   static final Logger A = LogUtils.getLogger();
   private static final agm B = new agm("textures/gui/title/realms.png");
   private static final agm C = new agm("textures/gui/realms/no_realms.png");
   private static final uv D = uv.c("menu.online");
   private static final uv E = uv.c("mco.selectServer.loading");
   static final uv F = uv.c("mco.selectServer.uninitialized");
   static final uv G = uv.c("mco.selectServer.expiredList");
   private static final uv H = uv.c("mco.selectServer.expiredRenew");
   static final uv I = uv.c("mco.selectServer.expiredTrial");
   private static final uv J = uv.c("mco.selectServer.play");
   private static final uv K = uv.c("mco.selectServer.leave");
   private static final uv L = uv.c("mco.selectServer.configure");
   static final uv M = uv.c("mco.selectServer.expired");
   static final uv N = uv.c("mco.selectServer.expires.soon");
   static final uv O = uv.c("mco.selectServer.expires.day");
   static final uv P = uv.c("mco.selectServer.open");
   static final uv Q = uv.c("mco.selectServer.closed");
   static final uv R = uv.a("gui.narrate.button", F);
   private static final uv S = uv.c("mco.selectServer.noRealms");
   private static final uv T = uv.c("mco.invites.nopending");
   private static final uv U = uv.c("mco.invites.pending");
   private static final int V = 100;
   private static final int W = 3;
   private static final int X = 4;
   private static final int Y = 308;
   private static final int Z = 128;
   private static final int aa = 34;
   private static final int ab = 128;
   private static final int ac = 64;
   private static final int ad = 5;
   private static final int ae = 44;
   private static final int af = 11;
   private static final int ag = 40;
   private static final int ah = 20;
   private static final int ai = 216;
   private static final int aj = 36;
   private static final boolean ak = !aa.b().g();
   private static boolean al = ak;
   private final CompletableFuture<eol.a> am = eol.a();
   @Nullable
   private erq.c an;
   private final Set<UUID> ao = new HashSet<>();
   private static boolean ap;
   private final RateLimiter aq;
   private final faz ar;
   private eve as;
   private eve at;
   private eve au;
   private eve av;
   private eve aw;
   eom.j ax;
   private eqj ay;
   private List<epi> az = List.of();
   private volatile boolean aA;
   @Nullable
   private volatile String aB;
   long aC;
   private final List<eph> aD = new ArrayList<>();
   private eve aE;
   private eom.g aF;
   private eom.g aG;
   private eom.f aH;
   @Nullable
   private eyo aI;

   public eom(faz $$0) {
      super(D);
      this.ar = $$0;
      this.aq = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aQ_() {
      this.ay = new eqj(this.f);
      this.ax = this.d(new eom.j());
      uv $$0 = uv.c("mco.invites.title");
      this.aF = new eom.g($$0, y, $$1x -> this.f.a(new erc(this, $$0)));
      uv $$1 = uv.c("mco.news");
      this.aG = new eom.g($$1, z, $$0x -> {
         String $$1x = this.aB;
         if ($$1x != null) {
            ezr.a(this, $$1x);
            if (this.aG.a() != 0) {
               erw.a $$2 = erw.b();
               $$2.b = false;
               erw.b($$2);
               this.aG.a(0);
            }
         }
      });
      this.aG.a(ewp.a($$1));
      this.as = eve.a(J, $$0x -> a(this.K(), this)).a(100).a();
      this.av = eve.a(L, $$0x -> this.f(this.K())).a(100).a();
      this.au = eve.a(H, $$0x -> this.e(this.K())).a(100).a();
      this.aw = eve.a(K, $$0x -> this.g(this.K())).a(100).a();
      this.aE = eve.a(uv.c("mco.selectServer.purchase"), $$0x -> this.L()).b(100, 20).a();
      this.at = eve.a(uu.k, $$0x -> this.f.a(this.ar)).a(100).a();
      if (eor.a == eor.b.b) {
         this.d(evl.a(uv.b("Snapshot"), uv.b("Release")).a(5, 5, 100, 20, uv.b("Realm"), ($$0x, $$1x) -> {
            al = $$1x;
            this.az = List.of();
            this.G();
         }));
      }

      this.a(eom.f.a);
      this.F();
      this.am.thenAcceptAsync($$0x -> {
         faz $$1x = $$0x.a(this.ar);
         if ($$1x == null) {
            this.an = this.a(this.f.aX());
         } else {
            this.f.a($$1x);
         }
      }, this.j);
   }

   public static boolean b() {
      return ak && al;
   }

   @Override
   protected void c() {
      if (this.aI != null) {
         this.ax.a(this.g, this.h, this.aI.c(), this.h - this.aI.b());
         this.aI.a();
      }
   }

   private void C() {
      if (this.ay.a() && this.az.isEmpty() && this.aD.isEmpty()) {
         this.a(eom.f.b);
      } else {
         this.a(eom.f.c);
      }
   }

   private void a(eom.f $$0) {
      if (this.aH != $$0) {
         if (this.aI != null) {
            this.aI.a($$1 -> this.f($$1));
         }

         this.aI = this.b($$0);
         this.aH = $$0;
         this.aI.a($$1 -> {
            evc var10000 = this.d($$1);
         });
         this.c();
      }
   }

   private eyo b(eom.f $$0) {
      eyo $$1 = new eyo(this);
      $$1.b(44);
      $$1.a(this.D());
      eyp $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.i() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new evt(this.i, E));
            break;
         case b:
            $$1.c(this.E());
      }

      return $$1;
   }

   private eyp D() {
      int $$0 = 90;
      eys $$1 = eys.e().a(4);
      $$1.c().e();
      $$1.a(this.aF);
      $$1.a(this.aG);
      eys $$2 = eys.e();
      $$2.c().e();
      $$2.a(eyt.a(90));
      $$2.a(evr.a(128, 34, B, 128, 64), eyr::b);
      $$2.a(new eym(90, 44)).a($$1, eyr::c);
      return $$2;
   }

   private eyp c(eom.f $$0) {
      eyn $$1 = new eyn().c(4);
      eyn.b $$2 = $$1.d(3);
      if ($$0 == eom.f.c) {
         $$2.a(this.as);
         $$2.a(this.av);
         $$2.a(this.au);
         $$2.a(this.aw);
      }

      $$2.a(this.aE);
      $$2.a(this.at);
      return $$1;
   }

   private eys E() {
      eys $$0 = eys.d().a(10);
      $$0.c().b();
      $$0.a(evr.a(130, 64, C, 130, 64));
      evp $$1 = new evp(308, S, this.i, false);
      $$0.a($$1);
      return $$0;
   }

   void F() {
      epi $$0 = this.K();
      this.aE.i = this.aH != eom.f.a;
      this.as.i = $$0 != null && this.a($$0);
      this.au.i = $$0 != null && this.b($$0);
      this.aw.i = $$0 != null && this.d($$0);
      this.av.i = $$0 != null && this.c($$0);
   }

   boolean a(epi $$0) {
      boolean $$1 = !$$0.j && $$0.e == epi.c.b;
      return $$1 && ($$0.d() || this.h($$0));
   }

   private boolean b(epi $$0) {
      return $$0.j && this.h($$0);
   }

   private boolean c(epi $$0) {
      return this.h($$0) && $$0.e != epi.c.c;
   }

   private boolean d(epi $$0) {
      return !this.h($$0);
   }

   @Override
   public void d() {
      super.d();
      if (this.an != null) {
         this.an.b();
      }
   }

   public static void e() {
      eti.N().aX().d.a();
   }

   public static void f() {
      eti.N().aX().c.a();
   }

   private void G() {
      for (erq.e<?> $$0 : this.f.aX().a()) {
         $$0.a();
      }
   }

   private erq.c a(eqh $$0) {
      erq.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.ay.a($$0x.a());
         this.az = $$0x.b();
         this.H();
         boolean $$1x = false;

         for (epi $$2 : this.ay) {
            if (this.i($$2)) {
               $$1x = true;
            }
         }

         if (!ap && $$1x) {
            ap = true;
            this.I();
         }
      });
      a(eor::d, $$0x -> {
         this.aD.clear();
         this.aD.addAll($$0x);

         for (eph $$1x : $$0x) {
            if ($$1x instanceof eph.a $$2) {
               ewg $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.f.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aD.isEmpty() && this.aH != eom.f.a) {
            this.H();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aF.a($$0x);
         this.aF.a($$0x == 0 ? ewp.a(T) : ewp.a(U));
         if ($$0x > 0 && this.aq.tryAcquire(1)) {
            this.f.aU().c(uv.a("mco.configure.world.invite.narration", $$0x));
         }
      });
      $$1.a($$0.e, $$0x -> this.aA = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.g.a($$1x);
         this.aB = $$0.g.b();
         this.aG.a($$0.g.a() ? Integer.MAX_VALUE : 0);
      });
      return $$1;
   }

   private void a(Collection<eph> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (eph $$2 : $$0) {
         if (!$$2.a() && !this.ao.contains($$2.c())) {
            $$1.add($$2.c());
         }
      }

      if (!$$1.isEmpty()) {
         a($$1x -> {
            $$1x.a($$1);
            return null;
         }, $$1x -> this.ao.addAll($$1));
      }
   }

   private static <T> void a(eom.k<T> $$0, Consumer<T> $$1) {
      eti $$2 = eti.N();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(eor.a($$2));
         } catch (eqe var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         A.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void H() {
      epi $$0 = this.K();
      this.ax.v();

      for (eph $$1 : this.aD) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (epi $$2 : this.az) {
         this.ax.a(new eom.a($$2));
      }

      for (epi $$3 : this.ay) {
         eom.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == epi.c.c) {
               continue;
            }

            $$4 = new eom.i($$3);
         } else {
            $$4 = new eom.l($$3);
         }

         this.ax.a((eom.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.ax.a($$4);
         }
      }

      this.C();
      this.F();
   }

   private boolean a(eph $$0) {
      if (!($$0 instanceof eph.c $$1)) {
         return false;
      } else {
         uv $$2 = $$1.d();
         int $$3 = this.i.b($$2, 216);
         int $$4 = atq.e($$3 + 7, 36) - 1;
         this.ax.a(new eom.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.ax.a(new eom.d());
         }

         this.ax.a(new eom.b($$1.a(this)));
         return true;
      }
   }

   private void I() {
      new Thread(() -> {
         List<eps> $$0 = eoq.a();
         eor $$1 = eor.a();
         epd $$2 = new epd();
         $$2.a = $$0;
         $$2.b = this.J();

         try {
            $$1.a($$2);
         } catch (Throwable var5) {
            A.warn("Could not send ping result to Realms: ", var5);
         }
      }).start();
   }

   private List<Long> J() {
      List<Long> $$0 = Lists.newArrayList();

      for (epi $$1 : this.ay) {
         if (this.i($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable epi $$0) {
      if ($$0 != null) {
         String $$1 = asn.a($$0.b, this.f.U().b(), $$0.k);
         this.f.o.a($$1);
         ac.i().a($$1);
      }
   }

   private void f(@Nullable epi $$0) {
      if ($$0 != null && this.f.b($$0.g)) {
         this.f.a(new eqr(this, $$0.a));
      }
   }

   private void g(@Nullable epi $$0) {
      if ($$0 != null && !this.f.b($$0.g)) {
         uv $$1 = uv.c("mco.configure.world.leave.question.line1");
         uv $$2 = uv.c("mco.configure.world.leave.question.line2");
         this.f.a(new eqx($$1x -> this.a($$1x, $$0), eqx.a.b, $$1, $$2, true));
      }
   }

   @Nullable
   private epi K() {
      return this.ax.f() instanceof eom.l $$0 ? $$0.c() : null;
   }

   private void a(boolean $$0, final epi $$1) {
      if ($$0) {
         (new Thread("Realms-leave-server") {
            @Override
            public void run() {
               try {
                  eor $$0 = eor.a();
                  $$0.d($$1.a);
                  eom.this.f.execute(eom::f);
               } catch (eqe var2) {
                  eom.A.error("Couldn't configure world", var2);
                  eom.this.f.execute(() -> eom.this.f.a(new eqv(var2, eom.this)));
               }
            }
         }).start();
      }

      this.f.a(this);
   }

   void a(UUID $$0) {
      a($$1 -> {
         $$1.b(List.of($$0));
         return null;
      }, $$1 -> {
         this.aD.removeIf($$1x -> $$1x.b() && $$0.equals($$1x.c()));
         this.H();
      });
   }

   public void g() {
      this.ax.a(null);
      f();
   }

   @Override
   public uv h() {
      return (uv)(switch (this.aH) {
         case a -> uu.a(super.h(), E);
         case b -> uu.a(super.h(), S);
         case c -> super.h();
      });
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.i, "Minecraft " + aa.b().c(), 2, this.h - 10, -1);
      }

      if (this.aA && this.aE.i) {
         ere.a($$0, this.aE);
      }

      switch (eor.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void L() {
      this.f.a(new ere(this, this.aA));
   }

   public static void a(@Nullable epi $$0, faz $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable epi $$0, faz $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2) {
            eti.N().a(new eqy($$1, new esh($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case e:
               eti.N().a(new eqy($$1, new esh($$1, $$0)));
               break;
            case a:
               a($$0, $$1, uv.c("mco.compatibility.unverifiable.title").b(-171), uv.c("mco.compatibility.unverifiable.message"), uu.j);
               break;
            case c:
               a(
                  $$0,
                  $$1,
                  uv.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  uv.a("mco.compatibility.downgrade.description", uv.b($$0.t).b(-171), uv.b(aa.b().c()).b(-171)),
                  uv.c("mco.compatibility.downgrade")
               );
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  uv.c("mco.compatibility.upgrade.title").b(-171),
                  uv.a("mco.compatibility.upgrade.description", uv.b($$0.t).b(-171), uv.b(aa.b().c()).b(-171)),
                  uv.c("mco.compatibility.upgrade")
               );
         }
      }
   }

   private static void a(epi $$0, faz $$1, uv $$2, uv $$3, uv $$4) {
      eti.N().a(new ezs($$2x -> {
         faz $$3x;
         if ($$2x) {
            $$3x = new eqy($$1, new esh($$1, $$0));
            f();
         } else {
            $$3x = $$1;
         }

         eti.N().a($$3x);
      }, $$2, $$3, $$4, uu.e));
   }

   public static uv a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static uv a(String $$0, int $$1) {
      return (uv)(StringUtils.isBlank($$0) ? uu.a : uv.a("mco.version", uv.b($$0).b($$1)));
   }

   boolean h(epi $$0) {
      return this.f.b($$0.g);
   }

   private boolean i(epi $$0) {
      return this.h($$0) && !$$0.j;
   }

   private void a(eut $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.g / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.i, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends eom.e {
      private static final uv c = uv.c("mco.snapshot.start");
      private static final int d = 5;
      private final ewp e;
      private final epi f;

      public a(epi $$0) {
         this.f = $$0;
         this.e = ewp.a(uv.c("mco.snapshot.tooltip"));
      }

      @Override
      public void a(eut $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(eom.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(eom.this.i, c, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(eom.this.i, uv.a("mco.snapshot.description", this.f.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.e.a($$8, this.aK_(), new ezh($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (ezc.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         eom.this.f.ah().a(gfc.a(aqv.yZ, 1.0F));
         eom.this.f
            .a(
               new ewg.a(eom.this, uv.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(uv.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(uv.c("mco.selectServer.create"), $$0 -> eom.this.f.a(new eqt(eom.this, this.f.a)))
                  .a(uu.e, ewg::aG_)
                  .a()
            );
      }

      @Override
      public uv a() {
         return uv.a("gui.narrate.button", uu.a(c, uv.a("mco.snapshot.description", this.f.c)));
      }
   }

   class b extends eom.e {
      private final eve c;

      public b(eve $$0) {
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
      public void a(eut $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.b(eom.this.g / 2 - 75, $$2 + 4);
         this.c.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.c.a($$0);
      }

      @Override
      public uv a() {
         return this.c.l();
      }
   }

   static class c extends evq {
      private static final ewr b = new ewr(new agm("widget/cross_button"), new agm("widget/cross_button_highlighted"));

      protected c(eve.c $$0, uv $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(ewp.a($$1));
      }
   }

   class d extends eom.e {
      @Override
      public void a(eut $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public uv a() {
         return uv.i();
      }
   }

   abstract class e extends ewa.a<eom.e> {
      private static final int a = 10;
      private static final int c = 28;
      private static final int d = 7;

      protected void a(epi $$0, eut $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, eom.c, () -> eom.M);
         } else if ($$0.e == epi.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, eom.x, () -> eom.Q);
         } else if (eom.this.h($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, eom.v, () -> {
               if ($$0.l <= 0) {
                  return eom.N;
               } else {
                  return (uv)($$0.l == 1 ? eom.O : uv.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == epi.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, eom.w, () -> eom.P);
         }
      }

      private void a(eut $$0, int $$1, int $$2, int $$3, int $$4, agm $$5, Supplier<uv> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if (eom.this.ax.a_((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            eom.this.d($$6.get());
         }
      }

      protected void a(eut $$0, int $$1, int $$2, epi $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!eom.this.h($$3)) {
            $$0.a(eom.this.i, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            uv $$7 = $$3.k ? eom.I : eom.G;
            $$0.a(eom.this.i, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(eut $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (eom.this.i.b($$1) > $$6) {
            String $$7 = eom.this.i.a($$1, $$6 - eom.this.i.b("... "));
            $$0.a(eom.this.i, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(eom.this.i, $$1, $$2, $$3, $$5, false);
         }
      }

      protected int a(int $$0, int $$1, uv $$2) {
         return $$0 + $$1 - eom.this.i.a($$2) - 20;
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

   static class g extends ewj.b {
      private static final agm[] d = new agm[]{
         new agm("notification/1"),
         new agm("notification/2"),
         new agm("notification/3"),
         new agm("notification/4"),
         new agm("notification/5"),
         new agm("notification/more")
      };
      private static final int t = Integer.MAX_VALUE;
      private static final int u = 20;
      private static final int v = 14;
      private int w;

      public g(uv $$0, agm $$1, eve.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2);
      }

      int a() {
         return this.w;
      }

      public void a(int $$0) {
         this.w = $$0;
      }

      @Override
      public void b(eut $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.i && this.w != 0) {
            this.a($$0);
         }
      }

      private void a(eut $$0) {
         $$0.a(d[Math.min(this.w, 6) - 1], this.p() + this.k() - 5, this.r() - 3, 8, 8);
      }
   }

   class h extends eom.e {
      private static final int c = 40;
      private static final int d = -12303292;
      private final uv e;
      private final int f;
      private final List<evc> g = new ArrayList<>();
      @Nullable
      private final eom.c h;
      private final evy i;
      private final eyn j;
      private final eym k;
      private int l = -1;

      public h(uv $$0, int $$1, eph $$2) {
         this.e = $$0;
         this.f = $$1;
         this.j = new eyn();
         int $$3 = 7;
         this.j.a(evr.a(20, 20, eom.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(eyt.a(40), 0, 0);
         this.k = this.j.a(new eym(0, 9 * 3 * ($$1 - 1)), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new evy($$0, eom.this.i).b(true), this.k.b().b().d());
         this.j.a(eyt.a(40), 0, 2);
         if ($$2.b()) {
            this.h = this.j.a(new eom.c($$1x -> eom.this.a($$2.c()), uv.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
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
      public void b(eut $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.f - 2, -12303292);
      }

      @Override
      public void a(eut $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public uv a() {
         return this.e;
      }
   }

   class i extends eom.e {
      private final epi c;
      private final ewp d;

      public i(epi $$0) {
         this.c = $$0;
         this.d = ewp.a(uv.c("mco.snapshot.parent.tooltip"));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void a(eut $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         ery.a($$0, $$3, $$2, 32, this.c.g);
         uv $$12 = eom.a(this.c.t, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.c.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != uu.a) {
            $$0.a(eom.this.i, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(eom.this.i, this.c.a(), $$10, this.c($$11), -8355712, false);
         this.a($$0, $$2, $$3, this.c);
         this.a(this.c, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.d.a($$8, this.aK_(), new ezh($$3, $$2, $$4, $$5));
      }

      @Override
      public uv a() {
         return uv.b(this.c.c);
      }
   }

   class j extends ghv<eom.e> {
      public j() {
         super(eom.this.g, eom.this.h, 0, eom.this.h, 36);
      }

      public void a(@Nullable eom.e $$0) {
         super.a($$0);
         eom.this.F();
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
      T request(eor var1) throws eqe;
   }

   class l extends eom.e {
      private static final int c = 36;
      private final epi d;
      @Nullable
      private final ewp e;

      public l(epi $$0) {
         this.d = $$0;
         boolean $$1 = eom.this.h($$0);
         if (eom.b() && $$1 && $$0.h()) {
            this.e = ewp.a(uv.a("mco.snapshot.paired", $$0.s));
         } else if (!$$1 && $$0.e()) {
            this.e = ewp.a(uv.a("mco.snapshot.friendsRealm.upgrade", $$0.f));
         } else if (!$$1 && $$0.f()) {
            this.e = ewp.a(uv.a("mco.snapshot.friendsRealm.downgrade", $$0.t));
         } else {
            this.e = null;
         }
      }

      @Override
      public void a(eut $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.d.e == epi.c.c) {
            $$0.a(eom.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(eom.this.i, eom.F, $$3 + 40 - 2, $$10, 8388479);
         } else {
            ery.a($$0, $$3, $$2, 32, this.d.g);
            this.a($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3);
            this.a($$0, $$2, $$3, this.d);
            this.a(this.d, $$0, $$3 + $$4, $$2, $$6, $$7);
            if (this.e != null) {
               this.e.a($$8, this.aK_(), new ezh($$3, $$2, $$4, $$5));
            }
         }
      }

      private void a(eut $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         uv $$6 = eom.a(this.d.t, this.d.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.d.b(), $$4, $$5, $$7, -1);
         if ($$6 != uu.a) {
            $$0.a(eom.this.i, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void a(eut $$0, int $$1, int $$2) {
         int $$3 = this.b($$2);
         int $$4 = this.a($$1);
         int $$5 = this.c($$4);
         if (this.d.m == epi.d.b) {
            uv $$6 = uv.b(this.d.c()).a(n.h);
            $$0.a(eom.this.i, uv.a("mco.selectServer.minigameName", $$6).b(-171), $$3, $$5, -1, false);
         } else {
            $$0.a(eom.this.i, this.d.a(), $$3, this.c($$4), -8355712, false);
         }
      }

      private void e() {
         eom.this.f.ah().a(gfc.a(aqv.yZ, 1.0F));
         eom.a(this.d, eom.this);
      }

      private void f() {
         eom.this.f.ah().a(gfc.a(aqv.yZ, 1.0F));
         eqt $$0 = new eqt(eom.this, this.d);
         eom.this.f.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == epi.c.c) {
            this.f();
         } else if (eom.this.a(this.d)) {
            if (ac.b() - eom.this.aC < 250L && this.aK_()) {
               this.e();
            }

            eom.this.aC = ac.b();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (ezc.a($$0)) {
            if (this.d.e == epi.c.c) {
               this.f();
               return true;
            }

            if (eom.this.a(this.d)) {
               this.e();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public uv a() {
         return (uv)(this.d.e == epi.c.c ? eom.R : uv.a("narrator.select", this.d.c));
      }

      public epi c() {
         return this.d;
      }
   }
}
