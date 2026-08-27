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

public class eto extends gob {
   static final ajc a = new ajc("icon/info");
   static final ajc b = new ajc("icon/new_realm");
   static final ajc c = new ajc("realm_status/expired");
   static final ajc v = new ajc("realm_status/expires_soon");
   static final ajc w = new ajc("realm_status/open");
   static final ajc x = new ajc("realm_status/closed");
   private static final ajc y = new ajc("icon/invite");
   private static final ajc z = new ajc("icon/news");
   static final Logger A = LogUtils.getLogger();
   private static final ajc B = new ajc("textures/gui/title/realms.png");
   private static final ajc C = new ajc("textures/gui/realms/no_realms.png");
   private static final vs D = vs.c("menu.online");
   private static final vs E = vs.c("mco.selectServer.loading");
   static final vs F = vs.c("mco.selectServer.uninitialized");
   static final vs G = vs.c("mco.selectServer.expiredList");
   private static final vs H = vs.c("mco.selectServer.expiredRenew");
   static final vs I = vs.c("mco.selectServer.expiredTrial");
   private static final vs J = vs.c("mco.selectServer.play");
   private static final vs K = vs.c("mco.selectServer.leave");
   private static final vs L = vs.c("mco.selectServer.configure");
   static final vs M = vs.c("mco.selectServer.expired");
   static final vs N = vs.c("mco.selectServer.expires.soon");
   static final vs O = vs.c("mco.selectServer.expires.day");
   static final vs P = vs.c("mco.selectServer.open");
   static final vs Q = vs.c("mco.selectServer.closed");
   static final vs R = vs.a("gui.narrate.button", F);
   private static final vs S = vs.c("mco.selectServer.noRealms");
   private static final vs T = vs.c("mco.invites.nopending");
   private static final vs U = vs.c("mco.invites.pending");
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
   private final CompletableFuture<etn.a> am = etn.a();
   @Nullable
   private ews.c an;
   private final Set<UUID> ao = new HashSet<>();
   private static boolean ap;
   private final RateLimiter aq;
   private final fgh ar;
   private fak as;
   private fak at;
   private fak au;
   private fak av;
   private fak aw;
   eto.j ax;
   private evl ay;
   private List<euk> az = List.of();
   private volatile boolean aA;
   @Nullable
   private volatile String aB;
   long aC;
   private final List<euj> aD = new ArrayList<>();
   private fak aE;
   private eto.g aF;
   private eto.g aG;
   private eto.f aH;
   @Nullable
   private fdw aI;

   public eto(fgh $$0) {
      super(D);
      this.ar = $$0;
      this.aq = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aP_() {
      this.ay = new evl(this.f);
      this.ax = new eto.j();
      vs $$0 = vs.c("mco.invites.title");
      this.aF = new eto.g($$0, y, $$1x -> this.f.a(new ewe(this, $$0)));
      vs $$1 = vs.c("mco.news");
      this.aG = new eto.g($$1, z, $$0x -> {
         String $$1x = this.aB;
         if ($$1x != null) {
            fez.a(this, $$1x);
            if (this.aG.a() != 0) {
               ewy.a $$2 = ewy.b();
               $$2.b = false;
               ewy.b($$2);
               this.aG.a(0);
            }
         }
      });
      this.aG.a(fbv.a($$1));
      this.as = fak.a(J, $$0x -> a(this.O(), this)).a(100).a();
      this.av = fak.a(L, $$0x -> this.f(this.O())).a(100).a();
      this.au = fak.a(H, $$0x -> this.e(this.O())).a(100).a();
      this.aw = fak.a(K, $$0x -> this.g(this.O())).a(100).a();
      this.aE = fak.a(vs.c("mco.selectServer.purchase"), $$0x -> this.P()).b(100, 20).a();
      this.at = fak.a(vr.k, $$0x -> this.d()).a(100).a();
      if (ett.a == ett.b.b) {
         this.c(far.a(vs.b("Snapshot"), vs.b("Release")).a(5, 5, 100, 20, vs.b("Realm"), ($$0x, $$1x) -> {
            al = $$1x;
            this.az = List.of();
            this.K();
         }));
      }

      this.a(eto.f.a);
      this.J();
      this.am.thenAcceptAsync($$0x -> {
         fgh $$1x = $$0x.a(this.ar);
         if ($$1x == null) {
            this.an = this.a(this.f.ba());
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
         this.ax.b(this.g, this.h - this.aI.b() - this.aI.c());
         this.aI.a();
      }
   }

   @Override
   public void d() {
      this.f.a(this.ar);
   }

   private void E() {
      if (this.ay.a() && this.az.isEmpty() && this.aD.isEmpty()) {
         this.a(eto.f.b);
      } else {
         this.a(eto.f.c);
      }
   }

   private void a(eto.f $$0) {
      if (this.aH != $$0) {
         if (this.aI != null) {
            this.aI.a($$1 -> this.e($$1));
         }

         this.aI = this.b($$0);
         this.aH = $$0;
         this.aI.a($$1 -> {
            fai var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private fdw b(eto.f $$0) {
      fdw $$1 = new fdw(this);
      $$1.b(44);
      $$1.a(this.H());
      fdx $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.u() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new faz(this.i, E));
            break;
         case b:
            $$1.c(this.I());
            break;
         case c:
            $$1.c(this.ax);
      }

      return $$1;
   }

   private fdx H() {
      int $$0 = 90;
      fea $$1 = fea.e().a(4);
      $$1.c().e();
      $$1.a(this.aF);
      $$1.a(this.aG);
      fea $$2 = fea.e();
      $$2.c().e();
      $$2.a(feb.a(90));
      $$2.a(fax.a(128, 34, B, 128, 64), fdz::b);
      $$2.a(new fdu(90, 44)).a($$1, fdz::c);
      return $$2;
   }

   private fdx c(eto.f $$0) {
      fdv $$1 = new fdv().c(4);
      fdv.b $$2 = $$1.d(3);
      if ($$0 == eto.f.c) {
         $$2.a(this.as);
         $$2.a(this.av);
         $$2.a(this.au);
         $$2.a(this.aw);
      }

      $$2.a(this.aE);
      $$2.a(this.at);
      return $$1;
   }

   private fea I() {
      fea $$0 = fea.d().a(10);
      $$0.c().b();
      $$0.a(fax.a(130, 64, C, 130, 64));
      fav $$1 = new fav(308, S, this.i, false);
      $$0.a($$1);
      return $$0;
   }

   void J() {
      euk $$0 = this.O();
      this.aE.j = this.aH != eto.f.a;
      this.as.j = $$0 != null && this.a($$0);
      this.au.j = $$0 != null && this.b($$0);
      this.aw.j = $$0 != null && this.d($$0);
      this.av.j = $$0 != null && this.c($$0);
   }

   boolean a(euk $$0) {
      boolean $$1 = !$$0.j && $$0.e == euk.c.b;
      return $$1 && ($$0.d() || this.h($$0));
   }

   private boolean b(euk $$0) {
      return $$0.j && this.h($$0);
   }

   private boolean c(euk $$0) {
      return this.h($$0) && $$0.e != euk.c.c;
   }

   private boolean d(euk $$0) {
      return !this.h($$0);
   }

   @Override
   public void e() {
      super.e();
      if (this.an != null) {
         this.an.b();
      }
   }

   public static void f() {
      eyk.P().ba().d.a();
   }

   public static void g() {
      eyk.P().ba().c.a();
   }

   private void K() {
      for (ews.e<?> $$0 : this.f.ba().a()) {
         $$0.a();
      }
   }

   private ews.c a(evj $$0) {
      ews.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.ay.a($$0x.a());
         this.az = $$0x.b();
         this.L();
         boolean $$1x = false;

         for (euk $$2 : this.ay) {
            if (this.i($$2)) {
               $$1x = true;
            }
         }

         if (!ap && $$1x) {
            ap = true;
            this.M();
         }
      });
      a(ett::d, $$0x -> {
         this.aD.clear();
         this.aD.addAll($$0x);

         for (euj $$1x : $$0x) {
            if ($$1x instanceof euj.a $$2) {
               fbm $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.f.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aD.isEmpty() && this.aH != eto.f.a) {
            this.L();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aF.a($$0x);
         this.aF.a($$0x == 0 ? fbv.a(T) : fbv.a(U));
         if ($$0x > 0 && this.aq.tryAcquire(1)) {
            this.f.aX().c(vs.a("mco.configure.world.invite.narration", $$0x));
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

   private void a(Collection<euj> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (euj $$2 : $$0) {
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

   private static <T> void a(eto.k<T> $$0, Consumer<T> $$1) {
      eyk $$2 = eyk.P();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(ett.a($$2));
         } catch (evg var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         A.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void L() {
      euk $$0 = this.O();
      this.ax.H();

      for (euj $$1 : this.aD) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (euk $$2 : this.az) {
         this.ax.a(new eto.a($$2));
      }

      for (euk $$3 : this.ay) {
         eto.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == euk.c.c) {
               continue;
            }

            $$4 = new eto.i($$3);
         } else {
            $$4 = new eto.l($$3);
         }

         this.ax.a((eto.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.ax.a($$4);
         }
      }

      this.E();
      this.J();
   }

   private boolean a(euj $$0) {
      if (!($$0 instanceof euj.c $$1)) {
         return false;
      } else {
         vs $$2 = $$1.d();
         int $$3 = this.i.b($$2, 216);
         int $$4 = awm.e($$3 + 7, 36) - 1;
         this.ax.a(new eto.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.ax.a(new eto.d());
         }

         this.ax.a(new eto.b($$1.a(this)));
         return true;
      }
   }

   private void M() {
      new Thread(() -> {
         List<euu> $$0 = ets.a();
         ett $$1 = ett.a();
         euf $$2 = new euf();
         $$2.a = $$0;
         $$2.b = this.N();

         try {
            $$1.a($$2);
         } catch (Throwable var5) {
            A.warn("Could not send ping result to Realms: ", var5);
         }
      }).start();
   }

   private List<Long> N() {
      List<Long> $$0 = Lists.newArrayList();

      for (euk $$1 : this.ay) {
         if (this.i($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable euk $$0) {
      if ($$0 != null) {
         String $$1 = avi.a($$0.b, this.f.W().b(), $$0.k);
         this.f.o.a($$1);
         ac.j().a($$1);
      }
   }

   private void f(@Nullable euk $$0) {
      if ($$0 != null && this.f.b($$0.g)) {
         this.f.a(new evt(this, $$0.a));
      }
   }

   private void g(@Nullable euk $$0) {
      if ($$0 != null && !this.f.b($$0.g)) {
         vs $$1 = vs.c("mco.configure.world.leave.question.line1");
         vs $$2 = vs.c("mco.configure.world.leave.question.line2");
         this.f.a(new evz($$1x -> this.a($$1x, $$0), evz.a.b, $$1, $$2, true));
      }
   }

   @Nullable
   private euk O() {
      return this.ax.i() instanceof eto.l $$0 ? $$0.c() : null;
   }

   private void a(boolean $$0, final euk $$1) {
      if ($$0) {
         (new Thread("Realms-leave-server") {
            @Override
            public void run() {
               try {
                  ett $$0 = ett.a();
                  $$0.d($$1.a);
                  eto.this.f.execute(eto::g);
               } catch (evg var2) {
                  eto.A.error("Couldn't configure world", var2);
                  eto.this.f.execute(() -> eto.this.f.a(new evx(var2, eto.this)));
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
         this.L();
      });
   }

   public void h() {
      this.ax.a(null);
      g();
   }

   @Override
   public vs i() {
      return (vs)(switch (this.aH) {
         case a -> vr.a(super.i(), E);
         case b -> vr.a(super.i(), S);
         case c -> super.i();
      });
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.i, "Minecraft " + aa.b().c(), 2, this.h - 10, -1);
      }

      if (this.aA && this.aE.j) {
         ewg.a($$0, this.aE);
      }

      switch (ett.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void P() {
      this.f.a(new ewg(this, this.aA));
   }

   public static void a(@Nullable euk $$0, fgh $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable euk $$0, fgh $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2) {
            eyk.P().a(new ewa($$1, new exj($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case e:
               eyk.P().a(new ewa($$1, new exj($$1, $$0)));
               break;
            case a:
               a($$0, $$1, vs.c("mco.compatibility.unverifiable.title").b(-171), vs.c("mco.compatibility.unverifiable.message"), vr.j);
               break;
            case c:
               a(
                  $$0,
                  $$1,
                  vs.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  vs.a("mco.compatibility.downgrade.description", vs.b($$0.t).b(-171), vs.b(aa.b().c()).b(-171)),
                  vs.c("mco.compatibility.downgrade")
               );
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  vs.c("mco.compatibility.upgrade.title").b(-171),
                  vs.a("mco.compatibility.upgrade.description", vs.b($$0.t).b(-171), vs.b(aa.b().c()).b(-171)),
                  vs.c("mco.compatibility.upgrade")
               );
         }
      }
   }

   private static void a(euk $$0, fgh $$1, vs $$2, vs $$3, vs $$4) {
      eyk.P().a(new ffa($$2x -> {
         fgh $$3x;
         if ($$2x) {
            $$3x = new ewa($$1, new exj($$1, $$0));
            g();
         } else {
            $$3x = $$1;
         }

         eyk.P().a($$3x);
      }, $$2, $$3, $$4, vr.e));
   }

   public static vs a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static vs a(String $$0, int $$1) {
      return (vs)(StringUtils.isBlank($$0) ? vr.a : vs.a("mco.version", vs.b($$0).b($$1)));
   }

   boolean h(euk $$0) {
      return this.f.b($$0.g);
   }

   private boolean i(euk $$0) {
      return this.h($$0) && !$$0.j;
   }

   private void a(ezx $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.g / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.i, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends eto.e {
      private static final vs c = vs.c("mco.snapshot.start");
      private static final int d = 5;
      private final fby e = new fby();
      private final euk f;

      public a(euk $$0) {
         this.f = $$0;
         this.e.a(fbv.a(vs.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(eto.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(eto.this.i, c, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(eto.this.i, vs.a("mco.snapshot.description", this.f.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.e.a($$8, this.aK_(), new fep($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fek.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         eto.this.f.aj().a(glh.a(atp.zK, 1.0F));
         eto.this.f
            .a(
               new fbm.a(eto.this, vs.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(vs.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(vs.c("mco.selectServer.create"), $$0 -> eto.this.f.a(new evv(eto.this, this.f.a)))
                  .a(vr.e, fbm::d)
                  .a()
            );
      }

      @Override
      public vs a() {
         return vs.a("gui.narrate.button", vr.a(c, vs.a("mco.snapshot.description", this.f.c)));
      }
   }

   class b extends eto.e {
      private final fak c;

      public b(fak $$0) {
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
      public void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.c(eto.this.g / 2 - 75, $$2 + 4);
         this.c.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.c.a($$0);
      }

      @Override
      public vs a() {
         return this.c.x();
      }
   }

   static class c extends faw {
      private static final fbx b = new fbx(new ajc("widget/cross_button"), new ajc("widget/cross_button_highlighted"));

      protected c(fak.c $$0, vs $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(fbv.a($$1));
      }
   }

   class d extends eto.e {
      @Override
      public void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public vs a() {
         return vs.i();
      }
   }

   abstract class e extends fbg.a<eto.e> {
      private static final int a = 10;
      private static final int c = 28;
      private static final int d = 7;

      protected void a(euk $$0, ezx $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, eto.c, () -> eto.M);
         } else if ($$0.e == euk.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, eto.x, () -> eto.Q);
         } else if (eto.this.h($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, eto.v, () -> {
               if ($$0.l <= 0) {
                  return eto.N;
               } else {
                  return (vs)($$0.l == 1 ? eto.O : vs.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == euk.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, eto.w, () -> eto.P);
         }
      }

      private void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, ajc $$5, Supplier<vs> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if (eto.this.ax.c((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            eto.this.d($$6.get());
         }
      }

      protected void a(ezx $$0, int $$1, int $$2, euk $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!eto.this.h($$3)) {
            $$0.a(eto.this.i, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            vs $$7 = $$3.k ? eto.I : eto.G;
            $$0.a(eto.this.i, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(ezx $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (eto.this.i.b($$1) > $$6) {
            String $$7 = eto.this.i.a($$1, $$6 - eto.this.i.b("... "));
            $$0.a(eto.this.i, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(eto.this.i, $$1, $$2, $$3, $$5, false);
         }
      }

      protected int a(int $$0, int $$1, vs $$2) {
         return $$0 + $$1 - eto.this.i.a($$2) - 20;
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

   static class g extends fbp.b {
      private static final ajc[] d = new ajc[]{
         new ajc("notification/1"),
         new ajc("notification/2"),
         new ajc("notification/3"),
         new ajc("notification/4"),
         new ajc("notification/5"),
         new ajc("notification/more")
      };
      private static final int t = Integer.MAX_VALUE;
      private static final int u = 20;
      private static final int v = 14;
      private int w;

      public g(vs $$0, ajc $$1, fak.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2);
      }

      int a() {
         return this.w;
      }

      public void a(int $$0) {
         this.w = $$0;
      }

      @Override
      public void b(ezx $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.w != 0) {
            this.a($$0);
         }
      }

      private void a(ezx $$0) {
         $$0.a(d[Math.min(this.w, 6) - 1], this.B() + this.w() - 5, this.C() - 3, 8, 8);
      }
   }

   class h extends eto.e {
      private static final int c = 40;
      private static final int d = -12303292;
      private final vs e;
      private final int f;
      private final List<fai> g = new ArrayList<>();
      @Nullable
      private final eto.c h;
      private final fbe i;
      private final fdv j;
      private final fdu k;
      private int l = -1;

      public h(vs $$0, int $$1, euj $$2) {
         this.e = $$0;
         this.f = $$1;
         this.j = new fdv();
         int $$3 = 7;
         this.j.a(fax.a(20, 20, eto.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(feb.a(40), 0, 0);
         this.k = this.j.a(new fdu(0, 9 * 3 * ($$1 - 1)), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new fbe($$0, eto.this.i).b(true), this.k.b().b().d());
         this.j.a(feb.a(40), 0, 2);
         if ($$2.b()) {
            this.h = this.j.a(new eto.c($$1x -> eto.this.a($$2.c()), vs.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
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
         this.i.c($$1);
         this.j.a();
      }

      @Override
      public void b(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.f - 2, -12303292);
      }

      @Override
      public void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.j.c($$3, $$2);
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
      public vs a() {
         return this.e;
      }
   }

   class i extends eto.e {
      private final euk c;
      private final fby d = new fby();

      public i(euk $$0) {
         this.c = $$0;
         this.d.a(fbv.a(vs.c("mco.snapshot.parent.tooltip")));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         exa.a($$0, $$3, $$2, 32, this.c.g);
         vs $$12 = eto.a(this.c.t, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.c.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != vr.a) {
            $$0.a(eto.this.i, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(eto.this.i, this.c.a(), $$10, this.c($$11), -8355712, false);
         this.a($$0, $$2, $$3, this.c);
         this.a(this.c, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.d.a($$8, this.aK_(), new fep($$3, $$2, $$4, $$5));
      }

      @Override
      public vs a() {
         return vs.b(this.c.c);
      }
   }

   class j extends goa<eto.e> {
      public j() {
         super(eto.this.g, eto.this.h, 0, 36);
      }

      public void a(@Nullable eto.e $$0) {
         super.a($$0);
         eto.this.J();
      }

      @Override
      public int a() {
         return this.n() * 36;
      }

      @Override
      public int b() {
         return 300;
      }
   }

   interface k<T> {
      T request(ett var1) throws evg;
   }

   class l extends eto.e {
      private static final int c = 36;
      private final euk d;
      private final fby e = new fby();

      public l(euk $$0) {
         this.d = $$0;
         boolean $$1 = eto.this.h($$0);
         if (eto.b() && $$1 && $$0.h()) {
            this.e.a(fbv.a(vs.a("mco.snapshot.paired", $$0.s)));
         } else if (!$$1 && $$0.e()) {
            this.e.a(fbv.a(vs.a("mco.snapshot.friendsRealm.upgrade", $$0.f)));
         } else if (!$$1 && $$0.f()) {
            this.e.a(fbv.a(vs.a("mco.snapshot.friendsRealm.downgrade", $$0.t)));
         }
      }

      @Override
      public void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.d.e == euk.c.c) {
            $$0.a(eto.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(eto.this.i, eto.F, $$3 + 40 - 2, $$10, 8388479);
         } else {
            exa.a($$0, $$3, $$2, 32, this.d.g);
            this.a($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3);
            this.a($$0, $$2, $$3, this.d);
            this.a(this.d, $$0, $$3 + $$4, $$2, $$6, $$7);
            this.e.a($$8, this.aK_(), new fep($$3, $$2, $$4, $$5));
         }
      }

      private void a(ezx $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         vs $$6 = eto.a(this.d.t, this.d.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.d.b(), $$4, $$5, $$7, -1);
         if ($$6 != vr.a) {
            $$0.a(eto.this.i, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void a(ezx $$0, int $$1, int $$2) {
         int $$3 = this.b($$2);
         int $$4 = this.a($$1);
         int $$5 = this.c($$4);
         String $$6 = this.d.c();
         if (this.d.m == euk.d.b && $$6 != null) {
            vs $$7 = vs.b($$6).a(n.h);
            $$0.a(eto.this.i, vs.a("mco.selectServer.minigameName", $$7).b(-171), $$3, $$5, -1, false);
         } else {
            $$0.a(eto.this.i, this.d.a(), $$3, this.c($$4), -8355712, false);
         }
      }

      private void d() {
         eto.this.f.aj().a(glh.a(atp.zK, 1.0F));
         eto.a(this.d, eto.this);
      }

      private void e() {
         eto.this.f.aj().a(glh.a(atp.zK, 1.0F));
         evv $$0 = new evv(eto.this, this.d);
         eto.this.f.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == euk.c.c) {
            this.e();
         } else if (eto.this.a(this.d)) {
            if (ac.b() - eto.this.aC < 250L && this.aK_()) {
               this.d();
            }

            eto.this.aC = ac.b();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fek.a($$0)) {
            if (this.d.e == euk.c.c) {
               this.e();
               return true;
            }

            if (eto.this.a(this.d)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public vs a() {
         return (vs)(this.d.e == euk.c.c ? eto.R : vs.a("narrator.select", this.d.c));
      }

      public euk c() {
         return this.d;
      }
   }
}
