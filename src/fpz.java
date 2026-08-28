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

public class fpz extends fhv<fpz.a> {
   static final alb a = new alb("server_list/incompatible");
   static final alb m = new alb("server_list/unreachable");
   static final alb n = new alb("server_list/ping_1");
   static final alb o = new alb("server_list/ping_2");
   static final alb p = new alb("server_list/ping_3");
   static final alb q = new alb("server_list/ping_4");
   static final alb r = new alb("server_list/ping_5");
   static final alb s = new alb("server_list/pinging_1");
   static final alb u = new alb("server_list/pinging_2");
   static final alb v = new alb("server_list/pinging_3");
   static final alb w = new alb("server_list/pinging_4");
   static final alb x = new alb("server_list/pinging_5");
   static final alb y = new alb("server_list/join_highlighted");
   static final alb z = new alb("server_list/join");
   static final alb A = new alb("server_list/move_up_highlighted");
   static final alb B = new alb("server_list/move_up");
   static final alb C = new alb("server_list/move_down_highlighted");
   static final alb D = new alb("server_list/move_down");
   static final Logger E = LogUtils.getLogger();
   static final ThreadPoolExecutor F = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new r(E)).build()
   );
   static final xl G = xl.c("lanServer.scanning");
   static final xl H = xl.c("multiplayer.status.cannot_resolve").b(-65536);
   static final xl I = xl.c("multiplayer.status.cannot_connect").b(-65536);
   static final xl J = xl.c("multiplayer.status.incompatible");
   static final xl K = xl.c("multiplayer.status.no_connection");
   static final xl L = xl.c("multiplayer.status.pinging");
   static final xl M = xl.c("multiplayer.status.online");
   private final fpw N;
   private final List<fpz.d> O = Lists.newArrayList();
   private final fpz.a P = new fpz.b();
   private final List<fpz.c> Q = Lists.newArrayList();

   public fpz(fpw $$0, ffa $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.N = $$0;
   }

   private void I() {
      this.k();
      this.O.forEach($$1 -> this.b($$1));
      this.b(this.P);
      this.Q.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable fpz.a $$0) {
      super.a($$0);
      this.N.C();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      fpz.a $$3 = this.h();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(fyf $$0) {
      this.O.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.O.add(new fpz.d(this.N, $$0.a($$1)));
      }

      this.I();
   }

   public void a(List<gta> $$0) {
      int $$1 = $$0.size() - this.Q.size();
      this.Q.clear();

      for (gta $$2 : $$0) {
         this.Q.add(new fpz.c(this.N, $$2));
      }

      this.I();

      for (int $$3 = this.Q.size() - $$1; $$3 < this.Q.size(); $$3++) {
         fpz.c $$4 = this.Q.get($$3);
         int $$5 = $$3 - this.Q.size() + this.aF_().size();
         int $$6 = this.g($$5);
         int $$7 = this.h($$5);
         if ($$7 >= this.D() && $$6 <= this.F()) {
            this.c.aX().b(xl.a("multiplayer.lan.server_found", $$4.c()));
         }
      }
   }

   @Override
   public int b() {
      return 305;
   }

   public void d() {
   }

   public abstract static class a extends fhv.a<fpz.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fpz.a {
      private final ffa a = ffa.Q();

      @Override
      public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(this.a.h, fpz.G, this.a.y.n / 2 - this.a.h.a(fpz.G) / 2, $$10, 16777215, false);
         String $$11 = fmj.a(ac.c());
         $$0.a(this.a.h, $$11, this.a.y.n / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712, false);
      }

      @Override
      public xl a() {
         return fpz.G;
      }
   }

   public static class c extends fpz.a {
      private static final int c = 32;
      private static final xl d = xl.c("lanServer.title");
      private static final xl e = xl.c("selectServer.hiddenAddress");
      private final fpw f;
      protected final ffa a;
      protected final gta b;
      private long g;

      protected c(fpw $$0, gta $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = ffa.Q();
      }

      @Override
      public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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

      public gta b() {
         return this.b;
      }

      @Override
      public xl a() {
         return xl.a("narrator.select", this.c());
      }

      public xl c() {
         return xl.i().b(d).b(xk.v).f(this.b.a());
      }
   }

   public class d extends fpz.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 5;
      private static final int e = 10;
      private static final int f = 8;
      private final fpw g;
      private final ffa h;
      private final fye i;
      private final fmc j;
      @Nullable
      private byte[] k;
      private long l;
      @Nullable
      private List<xl> m;
      @Nullable
      private alb n;
      @Nullable
      private xl o;

      protected d(final fpw $$1, final fye $$2) {
         this.g = $$1;
         this.i = $$2;
         this.h = ffa.Q();
         this.j = fmc.b(this.h.aa(), $$2.b);
         this.d();
      }

      @Override
      public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.g() == fye.b.a) {
            this.i.a(fye.b.b);
            this.i.d = xk.a;
            this.i.c = xk.a;
            fpz.F.submit(() -> {
               try {
                  this.g.D().a(this.i, () -> this.h.execute(this::b), () -> {
                     this.i.a(this.i.g == aa.b().e() ? fye.b.e : fye.b.d);
                     this.h.execute(this::d);
                  });
               } catch (UnknownHostException var2x) {
                  this.i.a(fye.b.c);
                  this.i.d = fpz.H;
                  this.h.execute(this::d);
               } catch (Exception var3x) {
                  this.i.a(fye.b.c);
                  this.i.d = fpz.I;
                  this.h.execute(this::d);
               }
            });
         }

         $$0.a(this.h.h, this.i.a, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         List<ayg> $$10 = this.h.h.c(this.i.d, $$4 - 32 - 2);

         for (int $$11 = 0; $$11 < Math.min($$10.size(), 2); $$11++) {
            $$0.a(this.h.h, $$10.get($$11), $$3 + 32 + 3, $$2 + 12 + 9 * $$11, -8355712, false);
         }

         this.a($$0, $$3, $$2, this.j.b());
         if (this.i.g() == fye.b.b) {
            int $$12 = (int)(ac.c() / 100L + (long)($$1 * 2) & 7L);
            if ($$12 > 4) {
               $$12 = 8 - $$12;
            }
            this.n = switch ($$12) {
               case 1 -> fpz.u;
               case 2 -> fpz.v;
               case 3 -> fpz.w;
               case 4 -> fpz.x;
               default -> fpz.s;
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

         xl $$15 = (xl)(this.i.g() == fye.b.d ? this.i.h.f().a(n.m) : this.i.c);
         int $$16 = this.h.h.a($$15);
         int $$17 = $$13 - $$16 - 5;
         $$0.a(this.h.h, $$15, $$17, $$2 + 1, -8355712, false);
         if (this.o != null && $$6 >= $$13 && $$6 <= $$13 + 10 && $$7 >= $$2 && $$7 <= $$2 + 8) {
            this.g.d(this.o);
         } else if (this.m != null && $$6 >= $$17 && $$6 <= $$17 + $$16 && $$7 >= $$2 && $$7 <= $$2 - 1 + 9) {
            this.g.b(Lists.transform(this.m, xl::g));
         }

         if (this.h.m.Z().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$18 = $$6 - $$3;
            int $$19 = $$7 - $$2;
            if (this.e()) {
               if ($$18 < 32 && $$18 > 16) {
                  $$0.a(fpz.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fpz.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$18 < 16 && $$19 < 16) {
                  $$0.a(fpz.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fpz.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.g.E().c() - 1) {
               if ($$18 < 16 && $$19 > 16) {
                  $$0.a(fpz.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fpz.D, $$3, $$2, 32, 32);
               }
            }
         }
      }

      private void d() {
         this.m = null;
         switch (this.i.g()) {
            case a:
            case b:
               this.n = fpz.n;
               this.o = fpz.L;
               break;
            case d:
               this.n = fpz.a;
               this.o = fpz.J;
               this.m = this.i.i;
               break;
            case c:
               this.n = fpz.m;
               this.o = fpz.K;
               break;
            case e:
               if (this.i.f < 150L) {
                  this.n = fpz.r;
               } else if (this.i.f < 300L) {
                  this.n = fpz.q;
               } else if (this.i.f < 600L) {
                  this.n = fpz.p;
               } else if (this.i.f < 1000L) {
                  this.n = fpz.o;
               } else {
                  this.n = fpz.n;
               }

               this.o = xl.a("multiplayer.status.ping", this.i.f);
               this.m = this.i.i;
         }
      }

      public void b() {
         this.g.E().b();
      }

      protected void a(fgm $$0, int $$1, int $$2, alb $$3) {
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
               this.j.a(eyu.a($$0));
            } catch (Throwable var3) {
               fpz.E.error("Invalid icon for server {} ({})", new Object[]{this.i.a, this.i.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fmy.s()) {
            fpz $$3 = this.g.r;
            int $$4 = $$3.aF_().indexOf(this);
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
         this.g.r.a(this.g.E());
         fpz.a $$2 = this.g.r.aF_().get($$1);
         this.g.r.a($$2);
         fpz.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)fpz.this.r();
         double $$4 = $$1 - (double)fpz.this.g(fpz.this.aF_().indexOf(this));
         if ($$3 <= 32.0) {
            if ($$3 < 32.0 && $$3 > 16.0 && this.e()) {
               this.g.a(this);
               this.g.m();
               return true;
            }

            int $$5 = this.g.r.aF_().indexOf(this);
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
         if (ac.c() - this.l < 250L) {
            this.g.m();
         }

         this.l = ac.c();
         return super.a($$0, $$1, $$2);
      }

      public fye c() {
         return this.i;
      }

      @Override
      public xl a() {
         xz $$0 = xl.i();
         $$0.b(xl.a("narrator.select", this.i.a));
         $$0.b(xk.t);
         switch (this.i.g()) {
            case b:
               $$0.b(fpz.L);
               break;
            case d:
               $$0.b(fpz.J);
               $$0.b(xk.t);
               $$0.b(xl.a("multiplayer.status.version.narration", this.i.h));
               $$0.b(xk.t);
               $$0.b(xl.a("multiplayer.status.motd.narration", this.i.d));
               break;
            case c:
               $$0.b(fpz.K);
               break;
            default:
               $$0.b(fpz.M);
               $$0.b(xk.t);
               $$0.b(xl.a("multiplayer.status.ping.narration", this.i.f));
               $$0.b(xk.t);
               $$0.b(xl.a("multiplayer.status.motd.narration", this.i.d));
               if (this.i.e != null) {
                  $$0.b(xk.t);
                  $$0.b(xl.a("multiplayer.status.player_count.narration", this.i.e.b(), this.i.e.a()));
                  $$0.b(xk.t);
                  $$0.b(xo.a(this.i.i, xl.b(", ")));
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
