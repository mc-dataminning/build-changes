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

public class frt extends fjj<frt.a> {
   static final akt a = new akt("server_list/incompatible");
   static final akt m = new akt("server_list/unreachable");
   static final akt n = new akt("server_list/ping_1");
   static final akt o = new akt("server_list/ping_2");
   static final akt p = new akt("server_list/ping_3");
   static final akt q = new akt("server_list/ping_4");
   static final akt r = new akt("server_list/ping_5");
   static final akt s = new akt("server_list/pinging_1");
   static final akt u = new akt("server_list/pinging_2");
   static final akt v = new akt("server_list/pinging_3");
   static final akt w = new akt("server_list/pinging_4");
   static final akt x = new akt("server_list/pinging_5");
   static final akt y = new akt("server_list/join_highlighted");
   static final akt z = new akt("server_list/join");
   static final akt A = new akt("server_list/move_up_highlighted");
   static final akt B = new akt("server_list/move_up");
   static final akt C = new akt("server_list/move_down_highlighted");
   static final akt D = new akt("server_list/move_down");
   static final Logger E = LogUtils.getLogger();
   static final ThreadPoolExecutor F = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new r(E)).build()
   );
   static final xe G = xe.c("lanServer.scanning");
   static final xe H = xe.c("multiplayer.status.cannot_resolve").b(-65536);
   static final xe I = xe.c("multiplayer.status.cannot_connect").b(-65536);
   static final xe J = xe.c("multiplayer.status.incompatible");
   static final xe K = xe.c("multiplayer.status.no_connection");
   static final xe L = xe.c("multiplayer.status.pinging");
   static final xe M = xe.c("multiplayer.status.online");
   private final frp N;
   private final List<frt.d> O = Lists.newArrayList();
   private final frt.a P = new frt.b();
   private final List<frt.c> Q = Lists.newArrayList();

   public frt(frp $$0, fgj $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.N = $$0;
   }

   private void I() {
      this.k();
      this.O.forEach($$1 -> this.b($$1));
      this.b(this.P);
      this.Q.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable frt.a $$0) {
      super.a($$0);
      this.N.C();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      frt.a $$3 = this.h();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(gac $$0) {
      this.O.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.O.add(new frt.d(this.N, $$0.a($$1)));
      }

      this.I();
   }

   public void a(List<gve> $$0) {
      int $$1 = $$0.size() - this.Q.size();
      this.Q.clear();

      for (gve $$2 : $$0) {
         this.Q.add(new frt.c(this.N, $$2));
      }

      this.I();

      for (int $$3 = this.Q.size() - $$1; $$3 < this.Q.size(); $$3++) {
         frt.c $$4 = this.Q.get($$3);
         int $$5 = $$3 - this.Q.size() + this.aE_().size();
         int $$6 = this.g($$5);
         int $$7 = this.h($$5);
         if ($$7 >= this.D() && $$6 <= this.F()) {
            this.c.aZ().b(xe.a("multiplayer.lan.server_found", $$4.c()));
         }
      }
   }

   @Override
   public int b() {
      return 305;
   }

   public void d() {
   }

   public abstract static class a extends fjj.a<frt.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends frt.a {
      private final fgj a = fgj.Q();

      @Override
      public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(this.a.h, frt.G, this.a.y.n / 2 - this.a.h.a(frt.G) / 2, $$10, 16777215, false);
         String $$11 = fnx.a(ad.b());
         $$0.a(this.a.h, $$11, this.a.y.n / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712, false);
      }

      @Override
      public xe a() {
         return frt.G;
      }
   }

   public static class c extends frt.a {
      private static final int c = 32;
      private static final xe d = xe.c("lanServer.title");
      private static final xe e = xe.c("selectServer.hiddenAddress");
      private final frp f;
      protected final fgj a;
      protected final gve b;
      private long g;

      protected c(frp $$0, gve $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = fgj.Q();
      }

      @Override
      public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
         if (ad.b() - this.g < 250L) {
            this.f.B();
         }

         this.g = ad.b();
         return super.a($$0, $$1, $$2);
      }

      public gve b() {
         return this.b;
      }

      @Override
      public xe a() {
         return xe.a("narrator.select", this.c());
      }

      public xe c() {
         return xe.i().a(d).a(xd.v).f(this.b.a());
      }
   }

   public class d extends frt.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 5;
      private static final int e = 10;
      private static final int f = 8;
      private final frp g;
      private final fgj h;
      private final gab i;
      private final fnq j;
      @Nullable
      private byte[] k;
      private long l;
      @Nullable
      private List<xe> m;
      @Nullable
      private akt n;
      @Nullable
      private xe o;

      protected d(frp $$1, gab $$2) {
         this.g = $$1;
         this.i = $$2;
         this.h = fgj.Q();
         this.j = fnq.b(this.h.aa(), $$2.b);
         this.d();
      }

      @Override
      public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.g() == gab.b.a) {
            this.i.a(gab.b.b);
            this.i.d = xd.a;
            this.i.c = xd.a;
            frt.F.submit(() -> {
               try {
                  this.g.D().a(this.i, () -> this.h.execute(this::b), () -> {
                     this.i.a(this.i.g == ab.b().e() ? gab.b.e : gab.b.d);
                     this.h.execute(this::d);
                  });
               } catch (UnknownHostException var2x) {
                  this.i.a(gab.b.c);
                  this.i.d = frt.H;
                  this.h.execute(this::d);
               } catch (Exception var3x) {
                  this.i.a(gab.b.c);
                  this.i.d = frt.I;
                  this.h.execute(this::d);
               }
            });
         }

         $$0.a(this.h.h, this.i.a, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         List<axy> $$10 = this.h.h.c(this.i.d, $$4 - 32 - 2);

         for (int $$11 = 0; $$11 < Math.min($$10.size(), 2); $$11++) {
            $$0.a(this.h.h, $$10.get($$11), $$3 + 32 + 3, $$2 + 12 + 9 * $$11, -8355712, false);
         }

         this.a($$0, $$3, $$2, this.j.b());
         if (this.i.g() == gab.b.b) {
            int $$12 = (int)(ad.b() / 100L + (long)($$1 * 2) & 7L);
            if ($$12 > 4) {
               $$12 = 8 - $$12;
            }
            this.n = switch ($$12) {
               case 1 -> frt.u;
               case 2 -> frt.v;
               case 3 -> frt.w;
               case 4 -> frt.x;
               default -> frt.s;
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

         xe $$15 = (xe)(this.i.g() == gab.b.d ? this.i.h.f().a(n.m) : this.i.c);
         int $$16 = this.h.h.a($$15);
         int $$17 = $$13 - $$16 - 5;
         $$0.a(this.h.h, $$15, $$17, $$2 + 1, -8355712, false);
         if (this.o != null && $$6 >= $$13 && $$6 <= $$13 + 10 && $$7 >= $$2 && $$7 <= $$2 + 8) {
            this.g.d(this.o);
         } else if (this.m != null && $$6 >= $$17 && $$6 <= $$17 + $$16 && $$7 >= $$2 && $$7 <= $$2 - 1 + 9) {
            this.g.b(Lists.transform(this.m, xe::g));
         }

         if (this.h.m.Z().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$18 = $$6 - $$3;
            int $$19 = $$7 - $$2;
            if (this.e()) {
               if ($$18 < 32 && $$18 > 16) {
                  $$0.a(frt.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(frt.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$18 < 16 && $$19 < 16) {
                  $$0.a(frt.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(frt.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.g.E().c() - 1) {
               if ($$18 < 16 && $$19 > 16) {
                  $$0.a(frt.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(frt.D, $$3, $$2, 32, 32);
               }
            }
         }
      }

      private void d() {
         this.m = null;
         switch (this.i.g()) {
            case a:
            case b:
               this.n = frt.n;
               this.o = frt.L;
               break;
            case d:
               this.n = frt.a;
               this.o = frt.J;
               this.m = this.i.i;
               break;
            case c:
               this.n = frt.m;
               this.o = frt.K;
               break;
            case e:
               if (this.i.f < 150L) {
                  this.n = frt.r;
               } else if (this.i.f < 300L) {
                  this.n = frt.q;
               } else if (this.i.f < 600L) {
                  this.n = frt.p;
               } else if (this.i.f < 1000L) {
                  this.n = frt.o;
               } else {
                  this.n = frt.n;
               }

               this.o = xe.a("multiplayer.status.ping", this.i.f);
               this.m = this.i.i;
         }
      }

      public void b() {
         this.g.E().b();
      }

      protected void a(fia $$0, int $$1, int $$2, akt $$3) {
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
               this.j.a(fad.a($$0));
            } catch (Throwable var3) {
               frt.E.error("Invalid icon for server {} ({})", new Object[]{this.i.a, this.i.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fon.s()) {
            frt $$3 = this.g.r;
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
         this.g.r.a(this.g.E());
         frt.a $$2 = this.g.r.aE_().get($$1);
         this.g.r.a($$2);
         frt.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)frt.this.r();
         double $$4 = $$1 - (double)frt.this.g(frt.this.aE_().indexOf(this));
         if ($$3 <= 32.0) {
            if ($$3 < 32.0 && $$3 > 16.0 && this.e()) {
               this.g.a(this);
               this.g.B();
               return true;
            }

            int $$5 = this.g.r.aE_().indexOf(this);
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
         if (ad.b() - this.l < 250L) {
            this.g.B();
         }

         this.l = ad.b();
         return super.a($$0, $$1, $$2);
      }

      public gab c() {
         return this.i;
      }

      @Override
      public xe a() {
         xs $$0 = xe.i();
         $$0.a(xe.a("narrator.select", this.i.a));
         $$0.a(xd.t);
         switch (this.i.g()) {
            case b:
               $$0.a(frt.L);
               break;
            case d:
               $$0.a(frt.J);
               $$0.a(xd.t);
               $$0.a(xe.a("multiplayer.status.version.narration", this.i.h));
               $$0.a(xd.t);
               $$0.a(xe.a("multiplayer.status.motd.narration", this.i.d));
               break;
            case c:
               $$0.a(frt.K);
               break;
            default:
               $$0.a(frt.M);
               $$0.a(xd.t);
               $$0.a(xe.a("multiplayer.status.ping.narration", this.i.f));
               $$0.a(xd.t);
               $$0.a(xe.a("multiplayer.status.motd.narration", this.i.d));
               if (this.i.e != null) {
                  $$0.a(xd.t);
                  $$0.a(xe.a("multiplayer.status.player_count.narration", this.i.e.b(), this.i.e.a()));
                  $$0.a(xd.t);
                  $$0.a(xh.a(this.i.i, xe.b(", ")));
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
