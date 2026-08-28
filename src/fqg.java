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

public class fqg extends fic<fqg.a> {
   static final alf a = new alf("server_list/incompatible");
   static final alf m = new alf("server_list/unreachable");
   static final alf n = new alf("server_list/ping_1");
   static final alf o = new alf("server_list/ping_2");
   static final alf p = new alf("server_list/ping_3");
   static final alf q = new alf("server_list/ping_4");
   static final alf r = new alf("server_list/ping_5");
   static final alf s = new alf("server_list/pinging_1");
   static final alf u = new alf("server_list/pinging_2");
   static final alf v = new alf("server_list/pinging_3");
   static final alf w = new alf("server_list/pinging_4");
   static final alf x = new alf("server_list/pinging_5");
   static final alf y = new alf("server_list/join_highlighted");
   static final alf z = new alf("server_list/join");
   static final alf A = new alf("server_list/move_up_highlighted");
   static final alf B = new alf("server_list/move_up");
   static final alf C = new alf("server_list/move_down_highlighted");
   static final alf D = new alf("server_list/move_down");
   static final Logger E = LogUtils.getLogger();
   static final ThreadPoolExecutor F = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new r(E)).build()
   );
   static final xp G = xp.c("lanServer.scanning");
   static final xp H = xp.c("multiplayer.status.cannot_resolve").b(-65536);
   static final xp I = xp.c("multiplayer.status.cannot_connect").b(-65536);
   static final xp J = xp.c("multiplayer.status.incompatible");
   static final xp K = xp.c("multiplayer.status.no_connection");
   static final xp L = xp.c("multiplayer.status.pinging");
   static final xp M = xp.c("multiplayer.status.online");
   private final fqd N;
   private final List<fqg.d> O = Lists.newArrayList();
   private final fqg.a P = new fqg.b();
   private final List<fqg.c> Q = Lists.newArrayList();

   public fqg(fqd $$0, ffh $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.N = $$0;
   }

   private void I() {
      this.k();
      this.O.forEach($$1 -> this.b($$1));
      this.b(this.P);
      this.Q.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable fqg.a $$0) {
      super.a($$0);
      this.N.E();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      fqg.a $$3 = this.h();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(fym $$0) {
      this.O.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.O.add(new fqg.d(this.N, $$0.a($$1)));
      }

      this.I();
   }

   public void a(List<gth> $$0) {
      int $$1 = $$0.size() - this.Q.size();
      this.Q.clear();

      for (gth $$2 : $$0) {
         this.Q.add(new fqg.c(this.N, $$2));
      }

      this.I();

      for (int $$3 = this.Q.size() - $$1; $$3 < this.Q.size(); $$3++) {
         fqg.c $$4 = this.Q.get($$3);
         int $$5 = $$3 - this.Q.size() + this.aD_().size();
         int $$6 = this.g($$5);
         int $$7 = this.h($$5);
         if ($$7 >= this.D() && $$6 <= this.F()) {
            this.c.aX().b(xp.a("multiplayer.lan.server_found", $$4.c()));
         }
      }
   }

   @Override
   public int b() {
      return 305;
   }

   public void c() {
   }

   public abstract static class a extends fic.a<fqg.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fqg.a {
      private final ffh a = ffh.Q();

      @Override
      public void a(fgt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(this.a.h, fqg.G, this.a.y.n / 2 - this.a.h.a(fqg.G) / 2, $$10, 16777215, false);
         String $$11 = fmq.a(ac.c());
         $$0.a(this.a.h, $$11, this.a.y.n / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712, false);
      }

      @Override
      public xp a() {
         return fqg.G;
      }
   }

   public static class c extends fqg.a {
      private static final int c = 32;
      private static final xp d = xp.c("lanServer.title");
      private static final xp e = xp.c("selectServer.hiddenAddress");
      private final fqd f;
      protected final ffh a;
      protected final gth b;
      private long g;

      protected c(fqd $$0, gth $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = ffh.Q();
      }

      @Override
      public void a(fgt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
         if (ac.c() - this.g < 250L) {
            this.f.m();
         }

         this.g = ac.c();
         return super.a($$0, $$1, $$2);
      }

      public gth b() {
         return this.b;
      }

      @Override
      public xp a() {
         return xp.a("narrator.select", this.c());
      }

      public xp c() {
         return xp.i().b(d).b(xo.v).f(this.b.a());
      }
   }

   public class d extends fqg.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 5;
      private static final int e = 10;
      private static final int f = 8;
      private final fqd g;
      private final ffh h;
      private final fyl i;
      private final fmj j;
      @Nullable
      private byte[] k;
      private long l;
      @Nullable
      private List<xp> m;
      @Nullable
      private alf n;
      @Nullable
      private xp o;

      protected d(final fqd $$1, final fyl $$2) {
         this.g = $$1;
         this.i = $$2;
         this.h = ffh.Q();
         this.j = fmj.b(this.h.aa(), $$2.b);
         this.d();
      }

      @Override
      public void a(fgt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.g() == fyl.b.a) {
            this.i.a(fyl.b.b);
            this.i.d = xo.a;
            this.i.c = xo.a;
            fqg.F.submit(() -> {
               try {
                  this.g.F().a(this.i, () -> this.h.execute(this::b), () -> {
                     this.i.a(this.i.g == aa.b().e() ? fyl.b.e : fyl.b.d);
                     this.h.execute(this::d);
                  });
               } catch (UnknownHostException var2x) {
                  this.i.a(fyl.b.c);
                  this.i.d = fqg.H;
                  this.h.execute(this::d);
               } catch (Exception var3x) {
                  this.i.a(fyl.b.c);
                  this.i.d = fqg.I;
                  this.h.execute(this::d);
               }
            });
         }

         $$0.a(this.h.h, this.i.a, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         List<ayl> $$10 = this.h.h.c(this.i.d, $$4 - 32 - 2);

         for (int $$11 = 0; $$11 < Math.min($$10.size(), 2); $$11++) {
            $$0.a(this.h.h, $$10.get($$11), $$3 + 32 + 3, $$2 + 12 + 9 * $$11, -8355712, false);
         }

         this.a($$0, $$3, $$2, this.j.b());
         if (this.i.g() == fyl.b.b) {
            int $$12 = (int)(ac.c() / 100L + (long)($$1 * 2) & 7L);
            if ($$12 > 4) {
               $$12 = 8 - $$12;
            }
            this.n = switch ($$12) {
               case 1 -> fqg.u;
               case 2 -> fqg.v;
               case 3 -> fqg.w;
               case 4 -> fqg.x;
               default -> fqg.s;
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

         xp $$15 = (xp)(this.i.g() == fyl.b.d ? this.i.h.f().a(n.m) : this.i.c);
         int $$16 = this.h.h.a($$15);
         int $$17 = $$13 - $$16 - 5;
         $$0.a(this.h.h, $$15, $$17, $$2 + 1, -8355712, false);
         if (this.o != null && $$6 >= $$13 && $$6 <= $$13 + 10 && $$7 >= $$2 && $$7 <= $$2 + 8) {
            this.g.d(this.o);
         } else if (this.m != null && $$6 >= $$17 && $$6 <= $$17 + $$16 && $$7 >= $$2 && $$7 <= $$2 - 1 + 9) {
            this.g.b(Lists.transform(this.m, xp::g));
         }

         if (this.h.m.Z().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$18 = $$6 - $$3;
            int $$19 = $$7 - $$2;
            if (this.e()) {
               if ($$18 < 32 && $$18 > 16) {
                  $$0.a(fqg.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fqg.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$18 < 16 && $$19 < 16) {
                  $$0.a(fqg.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fqg.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.g.I().c() - 1) {
               if ($$18 < 16 && $$19 > 16) {
                  $$0.a(fqg.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fqg.D, $$3, $$2, 32, 32);
               }
            }
         }
      }

      private void d() {
         this.m = null;
         switch (this.i.g()) {
            case a:
            case b:
               this.n = fqg.n;
               this.o = fqg.L;
               break;
            case d:
               this.n = fqg.a;
               this.o = fqg.J;
               this.m = this.i.i;
               break;
            case c:
               this.n = fqg.m;
               this.o = fqg.K;
               break;
            case e:
               if (this.i.f < 150L) {
                  this.n = fqg.r;
               } else if (this.i.f < 300L) {
                  this.n = fqg.q;
               } else if (this.i.f < 600L) {
                  this.n = fqg.p;
               } else if (this.i.f < 1000L) {
                  this.n = fqg.o;
               } else {
                  this.n = fqg.n;
               }

               this.o = xp.a("multiplayer.status.ping", this.i.f);
               this.m = this.i.i;
         }
      }

      public void b() {
         this.g.I().b();
      }

      protected void a(fgt $$0, int $$1, int $$2, alf $$3) {
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
               this.j.a(ezb.a($$0));
            } catch (Throwable var3) {
               fqg.E.error("Invalid icon for server {} ({})", new Object[]{this.i.a, this.i.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fnf.t()) {
            fqg $$3 = this.g.r;
            int $$4 = $$3.aD_().indexOf(this);
            if ($$4 == -1) {
               return true;
            }

            if ($$0 == 264 && $$4 < this.g.I().c() - 1 || $$0 == 265 && $$4 > 0) {
               this.a($$4, $$0 == 264 ? $$4 + 1 : $$4 - 1);
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      private void a(int $$0, int $$1) {
         this.g.I().a($$0, $$1);
         this.g.r.a(this.g.I());
         fqg.a $$2 = this.g.r.aD_().get($$1);
         this.g.r.a($$2);
         fqg.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)fqg.this.r();
         double $$4 = $$1 - (double)fqg.this.g(fqg.this.aD_().indexOf(this));
         if ($$3 <= 32.0) {
            if ($$3 < 32.0 && $$3 > 16.0 && this.e()) {
               this.g.a(this);
               this.g.m();
               return true;
            }

            int $$5 = this.g.r.aD_().indexOf(this);
            if ($$3 < 16.0 && $$4 < 16.0 && $$5 > 0) {
               this.a($$5, $$5 - 1);
               return true;
            }

            if ($$3 < 16.0 && $$4 > 16.0 && $$5 < this.g.I().c() - 1) {
               this.a($$5, $$5 + 1);
               return true;
            }
         }

         this.g.a(this);
         if (ac.c() - this.l < 250L) {
            this.g.m();
         }

         this.l = ac.c();
         return super.a($$0, $$1, $$2);
      }

      public fyl c() {
         return this.i;
      }

      @Override
      public xp a() {
         yd $$0 = xp.i();
         $$0.b(xp.a("narrator.select", this.i.a));
         $$0.b(xo.t);
         switch (this.i.g()) {
            case b:
               $$0.b(fqg.L);
               break;
            case d:
               $$0.b(fqg.J);
               $$0.b(xo.t);
               $$0.b(xp.a("multiplayer.status.version.narration", this.i.h));
               $$0.b(xo.t);
               $$0.b(xp.a("multiplayer.status.motd.narration", this.i.d));
               break;
            case c:
               $$0.b(fqg.K);
               break;
            default:
               $$0.b(fqg.M);
               $$0.b(xo.t);
               $$0.b(xp.a("multiplayer.status.ping.narration", this.i.f));
               $$0.b(xo.t);
               $$0.b(xp.a("multiplayer.status.motd.narration", this.i.d));
               if (this.i.e != null) {
                  $$0.b(xo.t);
                  $$0.b(xp.a("multiplayer.status.player_count.narration", this.i.e.b(), this.i.e.a()));
                  $$0.b(xo.t);
                  $$0.b(xs.a(this.i.i, xp.b(", ")));
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
