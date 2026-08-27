import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmy extends feu<fmy.a> {
   static final ajv a = new ajv("server_list/incompatible");
   static final ajv m = new ajv("server_list/unreachable");
   static final ajv n = new ajv("server_list/ping_1");
   static final ajv o = new ajv("server_list/ping_2");
   static final ajv p = new ajv("server_list/ping_3");
   static final ajv q = new ajv("server_list/ping_4");
   static final ajv r = new ajv("server_list/ping_5");
   static final ajv s = new ajv("server_list/pinging_1");
   static final ajv u = new ajv("server_list/pinging_2");
   static final ajv v = new ajv("server_list/pinging_3");
   static final ajv w = new ajv("server_list/pinging_4");
   static final ajv x = new ajv("server_list/pinging_5");
   static final ajv y = new ajv("server_list/join_highlighted");
   static final ajv z = new ajv("server_list/join");
   static final ajv A = new ajv("server_list/move_up_highlighted");
   static final ajv B = new ajv("server_list/move_up");
   static final ajv C = new ajv("server_list/move_down_highlighted");
   static final ajv D = new ajv("server_list/move_down");
   static final Logger E = LogUtils.getLogger();
   static final ThreadPoolExecutor F = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new r(E)).build()
   );
   static final wi G = wi.c("lanServer.scanning");
   static final wi H = wi.c("multiplayer.status.cannot_resolve").b(-65536);
   static final wi I = wi.c("multiplayer.status.cannot_connect").b(-65536);
   static final wi J = wi.c("multiplayer.status.incompatible");
   static final wi K = wi.c("multiplayer.status.no_connection");
   static final wi L = wi.c("multiplayer.status.pinging");
   static final wi M = wi.c("multiplayer.status.online");
   private final fmu N;
   private final List<fmy.d> O = Lists.newArrayList();
   private final fmy.a P = new fmy.b();
   private final List<fmy.c> Q = Lists.newArrayList();

   public fmy(fmu $$0, fby $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.N = $$0;
   }

   private void I() {
      this.k();
      this.O.forEach($$1 -> this.b($$1));
      this.b(this.P);
      this.Q.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable fmy.a $$0) {
      super.a($$0);
      this.N.C();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      fmy.a $$3 = this.h();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(fvf $$0) {
      this.O.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.O.add(new fmy.d(this.N, $$0.a($$1)));
      }

      this.I();
   }

   public void a(List<gpx> $$0) {
      int $$1 = $$0.size() - this.Q.size();
      this.Q.clear();

      for (gpx $$2 : $$0) {
         this.Q.add(new fmy.c(this.N, $$2));
      }

      this.I();

      for (int $$3 = this.Q.size() - $$1; $$3 < this.Q.size(); $$3++) {
         fmy.c $$4 = this.Q.get($$3);
         int $$5 = $$3 - this.Q.size() + this.aE_().size();
         int $$6 = this.g($$5);
         int $$7 = this.h($$5);
         if ($$7 >= this.D() && $$6 <= this.F()) {
            this.c.aY().b(wi.a("multiplayer.lan.server_found", $$4.c()));
         }
      }
   }

   @Override
   public int b() {
      return 305;
   }

   public void d() {
   }

   public abstract static class a extends feu.a<fmy.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fmy.a {
      private final fby a = fby.Q();

      @Override
      public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(this.a.h, fmy.G, this.a.y.k / 2 - this.a.h.a(fmy.G) / 2, $$10, 16777215, false);
         String $$11 = fji.a(ac.b());
         $$0.a(this.a.h, $$11, this.a.y.k / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712, false);
      }

      @Override
      public wi a() {
         return fmy.G;
      }
   }

   public static class c extends fmy.a {
      private static final int c = 32;
      private static final wi d = wi.c("lanServer.title");
      private static final wi e = wi.c("selectServer.hiddenAddress");
      private final fmu f;
      protected final fby a;
      protected final gpx b;
      private long g;

      protected c(fmu $$0, gpx $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = fby.Q();
      }

      @Override
      public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(this.a.h, d, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         $$0.a(this.a.h, this.b.a(), $$3 + 32 + 3, $$2 + 12, -8355712, false);
         if (this.a.m.l) {
            $$0.a(this.a.h, e, $$3 + 32 + 3, $$2 + 12 + 11, 3158064, false);
         } else {
            $$0.a(this.a.h, this.b.b(), $$3 + 32 + 3, $$2 + 12 + 11, 3158064, false);
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.f.a(this);
         if (ac.b() - this.g < 250L) {
            this.f.m();
         }

         this.g = ac.b();
         return super.a($$0, $$1, $$2);
      }

      public gpx b() {
         return this.b;
      }

      @Override
      public wi a() {
         return wi.a("narrator.select", this.c());
      }

      public wi c() {
         return wi.i().b(d).b(wh.v).f(this.b.a());
      }
   }

   public class d extends fmy.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 5;
      private static final int e = 10;
      private static final int f = 8;
      private final fmu g;
      private final fby h;
      private final fve i;
      private final fjb j;
      @Nullable
      private byte[] k;
      private long l;
      @Nullable
      private List<wi> m;
      @Nullable
      private ajv n;
      @Nullable
      private wi o;

      protected d(fmu $$1, fve $$2) {
         this.g = $$1;
         this.i = $$2;
         this.h = fby.Q();
         this.j = fjb.b(this.h.aa(), $$2.b);
         this.d();
      }

      @Override
      public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.g() == fve.b.a) {
            this.i.a(fve.b.b);
            this.i.d = wh.a;
            this.i.c = wh.a;
            fmy.F.submit(() -> {
               try {
                  this.g.D().a(this.i, () -> this.h.execute(this::b), () -> {
                     this.i.a(this.i.g == aa.b().e() ? fve.b.e : fve.b.d);
                     this.h.execute(this::d);
                  });
               } catch (UnknownHostException var2x) {
                  this.i.a(fve.b.c);
                  this.i.d = fmy.H;
                  this.h.execute(this::d);
               } catch (Exception var3x) {
                  this.i.a(fve.b.c);
                  this.i.d = fmy.I;
                  this.h.execute(this::d);
               }
            });
         }

         $$0.a(this.h.h, this.i.a, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         List<awy> $$10 = this.h.h.c(this.i.d, $$4 - 32 - 2);

         for (int $$11 = 0; $$11 < Math.min($$10.size(), 2); $$11++) {
            $$0.a(this.h.h, $$10.get($$11), $$3 + 32 + 3, $$2 + 12 + 9 * $$11, -8355712, false);
         }

         this.a($$0, $$3, $$2, this.j.b());
         if (this.i.g() == fve.b.b) {
            int $$12 = (int)(ac.b() / 100L + (long)($$1 * 2) & 7L);
            if ($$12 > 4) {
               $$12 = 8 - $$12;
            }
            this.n = switch ($$12) {
               case 1 -> fmy.u;
               case 2 -> fmy.v;
               case 3 -> fmy.w;
               case 4 -> fmy.x;
               default -> fmy.s;
            };
         }

         int $$13 = $$3 + $$4 - 10 - 5;
         if (this.n != null) {
            $$0.a(this.n, $$13, $$2, 10, 8);
         }

         byte[] $$14 = this.i.c();
         if (!Arrays.equals($$14, this.k)) {
            if (this.a($$14)) {
               this.k = $$14;
            } else {
               this.i.a(null);
               this.b();
            }
         }

         wi $$15 = (wi)(this.i.g() == fve.b.d ? this.i.h.f().a(n.m) : this.i.c);
         int $$16 = this.h.h.a($$15);
         int $$17 = $$13 - $$16 - 5;
         $$0.a(this.h.h, $$15, $$17, $$2 + 1, -8355712, false);
         if (this.o != null && $$6 >= $$13 && $$6 <= $$13 + 10 && $$7 >= $$2 && $$7 <= $$2 + 8) {
            this.g.d(this.o);
         } else if (this.m != null && $$6 >= $$17 && $$6 <= $$17 + $$16 && $$7 >= $$2 && $$7 <= $$2 - 1 + 9) {
            this.g.b(Lists.transform(this.m, wi::g));
         }

         if (this.h.m.Z().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$18 = $$6 - $$3;
            int $$19 = $$7 - $$2;
            if (this.e()) {
               if ($$18 < 32 && $$18 > 16) {
                  $$0.a(fmy.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fmy.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$18 < 16 && $$19 < 16) {
                  $$0.a(fmy.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fmy.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.g.E().c() - 1) {
               if ($$18 < 16 && $$19 > 16) {
                  $$0.a(fmy.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fmy.D, $$3, $$2, 32, 32);
               }
            }
         }
      }

      private void d() {
         this.m = null;
         switch (this.i.g()) {
            case a:
            case b:
               this.n = fmy.n;
               this.o = fmy.L;
               break;
            case d:
               this.n = fmy.a;
               this.o = fmy.J;
               this.m = this.i.i;
               break;
            case c:
               this.n = fmy.m;
               this.o = fmy.K;
               break;
            case e:
               if (this.i.f < 150L) {
                  this.n = fmy.r;
               } else if (this.i.f < 300L) {
                  this.n = fmy.q;
               } else if (this.i.f < 600L) {
                  this.n = fmy.p;
               } else if (this.i.f < 1000L) {
                  this.n = fmy.o;
               } else {
                  this.n = fmy.n;
               }

               this.o = wi.a("multiplayer.status.ping", this.i.f);
               this.m = this.i.i;
         }
      }

      public void b() {
         this.g.E().b();
      }

      protected void a(fdl $$0, int $$1, int $$2, ajv $$3) {
         RenderSystem.enableBlend();
         $$0.a($$3, $$1, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         RenderSystem.disableBlend();
      }

      private boolean e() {
         return true;
      }

      private boolean a(@Nullable byte[] $$0) {
         if ($$0 == null) {
            this.j.a();
         } else {
            try {
               this.j.a(evs.a($$0));
            } catch (Throwable var3) {
               fmy.E.error("Invalid icon for server {} ({})", new Object[]{this.i.a, this.i.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fjx.s()) {
            fmy $$3 = this.g.o;
            int $$4 = $$3.aE_().indexOf(this);
            if ($$4 == -1) {
               return true;
            }

            if ($$0 == 264 && $$4 < this.g.E().c() - 1 || $$0 == 265 && $$4 > 0) {
               this.a($$4, $$0 == 264 ? $$4 + 1 : $$4 - 1);
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      private void a(int $$0, int $$1) {
         this.g.E().a($$0, $$1);
         this.g.o.a(this.g.E());
         fmy.a $$2 = this.g.o.aE_().get($$1);
         this.g.o.a($$2);
         fmy.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)fmy.this.r();
         double $$4 = $$1 - (double)fmy.this.g(fmy.this.aE_().indexOf(this));
         if ($$3 <= 32.0) {
            if ($$3 < 32.0 && $$3 > 16.0 && this.e()) {
               this.g.a(this);
               this.g.m();
               return true;
            }

            int $$5 = this.g.o.aE_().indexOf(this);
            if ($$3 < 16.0 && $$4 < 16.0 && $$5 > 0) {
               this.a($$5, $$5 - 1);
               return true;
            }

            if ($$3 < 16.0 && $$4 > 16.0 && $$5 < this.g.E().c() - 1) {
               this.a($$5, $$5 + 1);
               return true;
            }
         }

         this.g.a(this);
         if (ac.b() - this.l < 250L) {
            this.g.m();
         }

         this.l = ac.b();
         return super.a($$0, $$1, $$2);
      }

      public fve c() {
         return this.i;
      }

      @Override
      public wi a() {
         ww $$0 = wi.i();
         $$0.b(wi.a("narrator.select", this.i.a));
         $$0.b(wh.t);
         switch (this.i.g()) {
            case b:
               $$0.b(fmy.L);
               break;
            case d:
               $$0.b(fmy.J);
               $$0.b(wh.t);
               $$0.b(wi.a("multiplayer.status.version.narration", this.i.h));
               $$0.b(wh.t);
               $$0.b(wi.a("multiplayer.status.motd.narration", this.i.d));
               break;
            case c:
               $$0.b(fmy.K);
               break;
            default:
               $$0.b(fmy.M);
               $$0.b(wh.t);
               $$0.b(wi.a("multiplayer.status.ping.narration", this.i.f));
               $$0.b(wh.t);
               $$0.b(wi.a("multiplayer.status.motd.narration", this.i.d));
               if (this.i.e != null) {
                  $$0.b(wh.t);
                  $$0.b(wi.a("multiplayer.status.player_count.narration", this.i.e.b(), this.i.e.a()));
                  $$0.b(wh.t);
                  $$0.b(wl.a(this.i.i, wi.b(", ")));
               }
         }

         return $$0;
      }

      @Override
      public void close() {
         this.j.close();
      }
   }
}
