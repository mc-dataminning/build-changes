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

public class fqc extends fhy<fqc.a> {
   static final ale a = new ale("server_list/incompatible");
   static final ale m = new ale("server_list/unreachable");
   static final ale n = new ale("server_list/ping_1");
   static final ale o = new ale("server_list/ping_2");
   static final ale p = new ale("server_list/ping_3");
   static final ale q = new ale("server_list/ping_4");
   static final ale r = new ale("server_list/ping_5");
   static final ale s = new ale("server_list/pinging_1");
   static final ale u = new ale("server_list/pinging_2");
   static final ale v = new ale("server_list/pinging_3");
   static final ale w = new ale("server_list/pinging_4");
   static final ale x = new ale("server_list/pinging_5");
   static final ale y = new ale("server_list/join_highlighted");
   static final ale z = new ale("server_list/join");
   static final ale A = new ale("server_list/move_up_highlighted");
   static final ale B = new ale("server_list/move_up");
   static final ale C = new ale("server_list/move_down_highlighted");
   static final ale D = new ale("server_list/move_down");
   static final Logger E = LogUtils.getLogger();
   static final ThreadPoolExecutor F = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new r(E)).build()
   );
   static final xo G = xo.c("lanServer.scanning");
   static final xo H = xo.c("multiplayer.status.cannot_resolve").b(-65536);
   static final xo I = xo.c("multiplayer.status.cannot_connect").b(-65536);
   static final xo J = xo.c("multiplayer.status.incompatible");
   static final xo K = xo.c("multiplayer.status.no_connection");
   static final xo L = xo.c("multiplayer.status.pinging");
   static final xo M = xo.c("multiplayer.status.online");
   private final fpz N;
   private final List<fqc.d> O = Lists.newArrayList();
   private final fqc.a P = new fqc.b();
   private final List<fqc.c> Q = Lists.newArrayList();

   public fqc(fpz $$0, ffd $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.N = $$0;
   }

   private void I() {
      this.k();
      this.O.forEach($$1 -> this.b($$1));
      this.b(this.P);
      this.Q.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable fqc.a $$0) {
      super.a($$0);
      this.N.D();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      fqc.a $$3 = this.h();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(fyi $$0) {
      this.O.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.O.add(new fqc.d(this.N, $$0.a($$1)));
      }

      this.I();
   }

   public void a(List<gtd> $$0) {
      int $$1 = $$0.size() - this.Q.size();
      this.Q.clear();

      for (gtd $$2 : $$0) {
         this.Q.add(new fqc.c(this.N, $$2));
      }

      this.I();

      for (int $$3 = this.Q.size() - $$1; $$3 < this.Q.size(); $$3++) {
         fqc.c $$4 = this.Q.get($$3);
         int $$5 = $$3 - this.Q.size() + this.aE_().size();
         int $$6 = this.g($$5);
         int $$7 = this.h($$5);
         if ($$7 >= this.D() && $$6 <= this.F()) {
            this.c.aX().b(xo.a("multiplayer.lan.server_found", $$4.c()));
         }
      }
   }

   @Override
   public int b() {
      return 305;
   }

   public void d() {
   }

   public abstract static class a extends fhy.a<fqc.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fqc.a {
      private final ffd a = ffd.Q();

      @Override
      public void a(fgp $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(this.a.h, fqc.G, this.a.y.n / 2 - this.a.h.a(fqc.G) / 2, $$10, 16777215, false);
         String $$11 = fmm.a(ac.c());
         $$0.a(this.a.h, $$11, this.a.y.n / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712, false);
      }

      @Override
      public xo a() {
         return fqc.G;
      }
   }

   public static class c extends fqc.a {
      private static final int c = 32;
      private static final xo d = xo.c("lanServer.title");
      private static final xo e = xo.c("selectServer.hiddenAddress");
      private final fpz f;
      protected final ffd a;
      protected final gtd b;
      private long g;

      protected c(fpz $$0, gtd $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = ffd.Q();
      }

      @Override
      public void a(fgp $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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

      public gtd b() {
         return this.b;
      }

      @Override
      public xo a() {
         return xo.a("narrator.select", this.c());
      }

      public xo c() {
         return xo.i().b(d).b(xn.v).f(this.b.a());
      }
   }

   public class d extends fqc.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 5;
      private static final int e = 10;
      private static final int f = 8;
      private final fpz g;
      private final ffd h;
      private final fyh i;
      private final fmf j;
      @Nullable
      private byte[] k;
      private long l;
      @Nullable
      private List<xo> m;
      @Nullable
      private ale n;
      @Nullable
      private xo o;

      protected d(final fpz $$1, final fyh $$2) {
         this.g = $$1;
         this.i = $$2;
         this.h = ffd.Q();
         this.j = fmf.b(this.h.aa(), $$2.b);
         this.d();
      }

      @Override
      public void a(fgp $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.g() == fyh.b.a) {
            this.i.a(fyh.b.b);
            this.i.d = xn.a;
            this.i.c = xn.a;
            fqc.F.submit(() -> {
               try {
                  this.g.E().a(this.i, () -> this.h.execute(this::b), () -> {
                     this.i.a(this.i.g == aa.b().e() ? fyh.b.e : fyh.b.d);
                     this.h.execute(this::d);
                  });
               } catch (UnknownHostException var2x) {
                  this.i.a(fyh.b.c);
                  this.i.d = fqc.H;
                  this.h.execute(this::d);
               } catch (Exception var3x) {
                  this.i.a(fyh.b.c);
                  this.i.d = fqc.I;
                  this.h.execute(this::d);
               }
            });
         }

         $$0.a(this.h.h, this.i.a, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         List<ayj> $$10 = this.h.h.c(this.i.d, $$4 - 32 - 2);

         for (int $$11 = 0; $$11 < Math.min($$10.size(), 2); $$11++) {
            $$0.a(this.h.h, $$10.get($$11), $$3 + 32 + 3, $$2 + 12 + 9 * $$11, -8355712, false);
         }

         this.a($$0, $$3, $$2, this.j.b());
         if (this.i.g() == fyh.b.b) {
            int $$12 = (int)(ac.c() / 100L + (long)($$1 * 2) & 7L);
            if ($$12 > 4) {
               $$12 = 8 - $$12;
            }
            this.n = switch ($$12) {
               case 1 -> fqc.u;
               case 2 -> fqc.v;
               case 3 -> fqc.w;
               case 4 -> fqc.x;
               default -> fqc.s;
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

         xo $$15 = (xo)(this.i.g() == fyh.b.d ? this.i.h.f().a(n.m) : this.i.c);
         int $$16 = this.h.h.a($$15);
         int $$17 = $$13 - $$16 - 5;
         $$0.a(this.h.h, $$15, $$17, $$2 + 1, -8355712, false);
         if (this.o != null && $$6 >= $$13 && $$6 <= $$13 + 10 && $$7 >= $$2 && $$7 <= $$2 + 8) {
            this.g.d(this.o);
         } else if (this.m != null && $$6 >= $$17 && $$6 <= $$17 + $$16 && $$7 >= $$2 && $$7 <= $$2 - 1 + 9) {
            this.g.b(Lists.transform(this.m, xo::g));
         }

         if (this.h.m.Z().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$18 = $$6 - $$3;
            int $$19 = $$7 - $$2;
            if (this.e()) {
               if ($$18 < 32 && $$18 > 16) {
                  $$0.a(fqc.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fqc.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$18 < 16 && $$19 < 16) {
                  $$0.a(fqc.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fqc.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.g.F().c() - 1) {
               if ($$18 < 16 && $$19 > 16) {
                  $$0.a(fqc.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fqc.D, $$3, $$2, 32, 32);
               }
            }
         }
      }

      private void d() {
         this.m = null;
         switch (this.i.g()) {
            case a:
            case b:
               this.n = fqc.n;
               this.o = fqc.L;
               break;
            case d:
               this.n = fqc.a;
               this.o = fqc.J;
               this.m = this.i.i;
               break;
            case c:
               this.n = fqc.m;
               this.o = fqc.K;
               break;
            case e:
               if (this.i.f < 150L) {
                  this.n = fqc.r;
               } else if (this.i.f < 300L) {
                  this.n = fqc.q;
               } else if (this.i.f < 600L) {
                  this.n = fqc.p;
               } else if (this.i.f < 1000L) {
                  this.n = fqc.o;
               } else {
                  this.n = fqc.n;
               }

               this.o = xo.a("multiplayer.status.ping", this.i.f);
               this.m = this.i.i;
         }
      }

      public void b() {
         this.g.F().b();
      }

      protected void a(fgp $$0, int $$1, int $$2, ale $$3) {
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
               this.j.a(eyx.a($$0));
            } catch (Throwable var3) {
               fqc.E.error("Invalid icon for server {} ({})", new Object[]{this.i.a, this.i.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fnb.s()) {
            fqc $$3 = this.g.r;
            int $$4 = $$3.aE_().indexOf(this);
            if ($$4 == -1) {
               return true;
            }

            if ($$0 == 264 && $$4 < this.g.F().c() - 1 || $$0 == 265 && $$4 > 0) {
               this.a($$4, $$0 == 264 ? $$4 + 1 : $$4 - 1);
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      private void a(int $$0, int $$1) {
         this.g.F().a($$0, $$1);
         this.g.r.a(this.g.F());
         fqc.a $$2 = this.g.r.aE_().get($$1);
         this.g.r.a($$2);
         fqc.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)fqc.this.r();
         double $$4 = $$1 - (double)fqc.this.g(fqc.this.aE_().indexOf(this));
         if ($$3 <= 32.0) {
            if ($$3 < 32.0 && $$3 > 16.0 && this.e()) {
               this.g.a(this);
               this.g.m();
               return true;
            }

            int $$5 = this.g.r.aE_().indexOf(this);
            if ($$3 < 16.0 && $$4 < 16.0 && $$5 > 0) {
               this.a($$5, $$5 - 1);
               return true;
            }

            if ($$3 < 16.0 && $$4 > 16.0 && $$5 < this.g.F().c() - 1) {
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

      public fyh c() {
         return this.i;
      }

      @Override
      public xo a() {
         yc $$0 = xo.i();
         $$0.b(xo.a("narrator.select", this.i.a));
         $$0.b(xn.t);
         switch (this.i.g()) {
            case b:
               $$0.b(fqc.L);
               break;
            case d:
               $$0.b(fqc.J);
               $$0.b(xn.t);
               $$0.b(xo.a("multiplayer.status.version.narration", this.i.h));
               $$0.b(xn.t);
               $$0.b(xo.a("multiplayer.status.motd.narration", this.i.d));
               break;
            case c:
               $$0.b(fqc.K);
               break;
            default:
               $$0.b(fqc.M);
               $$0.b(xn.t);
               $$0.b(xo.a("multiplayer.status.ping.narration", this.i.f));
               $$0.b(xn.t);
               $$0.b(xo.a("multiplayer.status.motd.narration", this.i.d));
               if (this.i.e != null) {
                  $$0.b(xn.t);
                  $$0.b(xo.a("multiplayer.status.player_count.narration", this.i.e.b(), this.i.e.a()));
                  $$0.b(xn.t);
                  $$0.b(xr.a(this.i.i, xo.b(", ")));
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
