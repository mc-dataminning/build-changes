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

public class fqr extends fjc<fqr.a> {
   static final akq a = akq.b("server_list/incompatible");
   static final akq m = akq.b("server_list/unreachable");
   static final akq n = akq.b("server_list/ping_1");
   static final akq o = akq.b("server_list/ping_2");
   static final akq p = akq.b("server_list/ping_3");
   static final akq q = akq.b("server_list/ping_4");
   static final akq r = akq.b("server_list/ping_5");
   static final akq s = akq.b("server_list/pinging_1");
   static final akq u = akq.b("server_list/pinging_2");
   static final akq v = akq.b("server_list/pinging_3");
   static final akq w = akq.b("server_list/pinging_4");
   static final akq x = akq.b("server_list/pinging_5");
   static final akq y = akq.b("server_list/join_highlighted");
   static final akq z = akq.b("server_list/join");
   static final akq A = akq.b("server_list/move_up_highlighted");
   static final akq B = akq.b("server_list/move_up");
   static final akq C = akq.b("server_list/move_down_highlighted");
   static final akq D = akq.b("server_list/move_down");
   static final Logger E = LogUtils.getLogger();
   static final ThreadPoolExecutor F = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new r(E)).build()
   );
   static final wy G = wy.c("lanServer.scanning");
   static final wy H = wy.c("multiplayer.status.cannot_resolve").b(-65536);
   static final wy I = wy.c("multiplayer.status.cannot_connect").b(-65536);
   static final wy J = wy.c("multiplayer.status.incompatible");
   static final wy K = wy.c("multiplayer.status.no_connection");
   static final wy L = wy.c("multiplayer.status.pinging");
   static final wy M = wy.c("multiplayer.status.online");
   private final fqn N;
   private final List<fqr.d> O = Lists.newArrayList();
   private final fqr.a P = new fqr.b();
   private final List<fqr.c> Q = Lists.newArrayList();

   public fqr(fqn $$0, fgi $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.N = $$0;
   }

   private void J() {
      this.k();
      this.O.forEach($$1 -> this.b($$1));
      this.b(this.P);
      this.Q.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable fqr.a $$0) {
      super.a($$0);
      this.N.D();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      fqr.a $$3 = this.h();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(fzo $$0) {
      this.O.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.O.add(new fqr.d(this.N, $$0.a($$1)));
      }

      this.J();
   }

   public void a(List<gui> $$0) {
      int $$1 = $$0.size() - this.Q.size();
      this.Q.clear();

      for (gui $$2 : $$0) {
         this.Q.add(new fqr.c(this.N, $$2));
      }

      this.J();

      for (int $$3 = this.Q.size() - $$1; $$3 < this.Q.size(); $$3++) {
         fqr.c $$4 = this.Q.get($$3);
         int $$5 = $$3 - this.Q.size() + this.aG_().size();
         int $$6 = this.g($$5);
         int $$7 = this.h($$5);
         if ($$7 >= this.E() && $$6 <= this.G()) {
            this.c.aV().b(wy.a("multiplayer.lan.server_found", $$4.c()));
         }
      }
   }

   @Override
   public int b() {
      return 305;
   }

   public void c() {
   }

   public abstract static class a extends fjc.a<fqr.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fqr.a {
      private final fgi a = fgi.Q();

      @Override
      public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(this.a.h, fqr.G, this.a.y.m / 2 - this.a.h.a(fqr.G) / 2, $$10, 16777215, false);
         String $$11 = fnm.a(ad.c());
         $$0.a(this.a.h, $$11, this.a.y.m / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712, false);
      }

      @Override
      public wy a() {
         return fqr.G;
      }
   }

   public static class c extends fqr.a {
      private static final int c = 32;
      private static final wy d = wy.c("lanServer.title");
      private static final wy e = wy.c("selectServer.hiddenAddress");
      private final fqn f;
      protected final fgi a;
      protected final gui b;
      private long g;

      protected c(fqn $$0, gui $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = fgi.Q();
      }

      @Override
      public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
         if (ad.c() - this.g < 250L) {
            this.f.m();
         }

         this.g = ad.c();
         return super.a($$0, $$1, $$2);
      }

      public gui b() {
         return this.b;
      }

      @Override
      public wy a() {
         return wy.a("narrator.select", this.c());
      }

      public wy c() {
         return wy.i().b(d).b(wx.v).f(this.b.a());
      }
   }

   public class d extends fqr.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 5;
      private static final int e = 10;
      private static final int f = 8;
      private final fqn g;
      private final fgi h;
      private final fzn i;
      private final fnh j;
      @Nullable
      private byte[] k;
      private long l;
      @Nullable
      private List<wy> m;
      @Nullable
      private akq n;
      @Nullable
      private wy o;

      protected d(final fqn $$1, final fzn $$2) {
         this.g = $$1;
         this.i = $$2;
         this.h = fgi.Q();
         this.j = fnh.b(this.h.aa(), $$2.b);
         this.d();
      }

      @Override
      public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.g() == fzn.b.a) {
            this.i.a(fzn.b.b);
            this.i.d = wx.a;
            this.i.c = wx.a;
            fqr.F.submit(() -> {
               try {
                  this.g.E().a(this.i, () -> this.h.execute(this::b), () -> {
                     this.i.a(this.i.g == ab.b().e() ? fzn.b.e : fzn.b.d);
                     this.h.execute(this::d);
                  });
               } catch (UnknownHostException var2x) {
                  this.i.a(fzn.b.c);
                  this.i.d = fqr.H;
                  this.h.execute(this::d);
               } catch (Exception var3x) {
                  this.i.a(fzn.b.c);
                  this.i.d = fqr.I;
                  this.h.execute(this::d);
               }
            });
         }

         $$0.a(this.h.h, this.i.a, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         List<axz> $$10 = this.h.h.c(this.i.d, $$4 - 32 - 2);

         for (int $$11 = 0; $$11 < Math.min($$10.size(), 2); $$11++) {
            $$0.a(this.h.h, $$10.get($$11), $$3 + 32 + 3, $$2 + 12 + 9 * $$11, -8355712, false);
         }

         this.a($$0, $$3, $$2, this.j.b());
         if (this.i.g() == fzn.b.b) {
            int $$12 = (int)(ad.c() / 100L + (long)($$1 * 2) & 7L);
            if ($$12 > 4) {
               $$12 = 8 - $$12;
            }
            this.n = switch ($$12) {
               case 1 -> fqr.u;
               case 2 -> fqr.v;
               case 3 -> fqr.w;
               case 4 -> fqr.x;
               default -> fqr.s;
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

         wy $$15 = (wy)(this.i.g() == fzn.b.d ? this.i.h.f().a(n.m) : this.i.c);
         int $$16 = this.h.h.a($$15);
         int $$17 = $$13 - $$16 - 5;
         $$0.a(this.h.h, $$15, $$17, $$2 + 1, -8355712, false);
         if (this.o != null && $$6 >= $$13 && $$6 <= $$13 + 10 && $$7 >= $$2 && $$7 <= $$2 + 8) {
            this.g.d(this.o);
         } else if (this.m != null && $$6 >= $$17 && $$6 <= $$17 + $$16 && $$7 >= $$2 && $$7 <= $$2 - 1 + 9) {
            this.g.b(Lists.transform(this.m, wy::g));
         }

         if (this.h.m.Z().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$18 = $$6 - $$3;
            int $$19 = $$7 - $$2;
            if (this.e()) {
               if ($$18 < 32 && $$18 > 16) {
                  $$0.a(fqr.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fqr.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$18 < 16 && $$19 < 16) {
                  $$0.a(fqr.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fqr.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.g.F().c() - 1) {
               if ($$18 < 16 && $$19 > 16) {
                  $$0.a(fqr.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fqr.D, $$3, $$2, 32, 32);
               }
            }
         }
      }

      private void d() {
         this.m = null;
         switch (this.i.g()) {
            case a:
            case b:
               this.n = fqr.n;
               this.o = fqr.L;
               break;
            case d:
               this.n = fqr.a;
               this.o = fqr.J;
               this.m = this.i.i;
               break;
            case c:
               this.n = fqr.m;
               this.o = fqr.K;
               break;
            case e:
               if (this.i.f < 150L) {
                  this.n = fqr.r;
               } else if (this.i.f < 300L) {
                  this.n = fqr.q;
               } else if (this.i.f < 600L) {
                  this.n = fqr.p;
               } else if (this.i.f < 1000L) {
                  this.n = fqr.o;
               } else {
                  this.n = fqr.n;
               }

               this.o = wy.a("multiplayer.status.ping", this.i.f);
               this.m = this.i.i;
         }
      }

      public void b() {
         this.g.F().b();
      }

      protected void a(fht $$0, int $$1, int $$2, akq $$3) {
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
               fqr.E.error("Invalid icon for server {} ({})", new Object[]{this.i.a, this.i.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fnx.s()) {
            fqr $$3 = this.g.r;
            int $$4 = $$3.aG_().indexOf(this);
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
         fqr.a $$2 = this.g.r.aG_().get($$1);
         this.g.r.a($$2);
         fqr.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)fqr.this.s();
         double $$4 = $$1 - (double)fqr.this.g(fqr.this.aG_().indexOf(this));
         if ($$3 <= 32.0) {
            if ($$3 < 32.0 && $$3 > 16.0 && this.e()) {
               this.g.a(this);
               this.g.m();
               return true;
            }

            int $$5 = this.g.r.aG_().indexOf(this);
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
         if (ad.c() - this.l < 250L) {
            this.g.m();
         }

         this.l = ad.c();
         return super.a($$0, $$1, $$2);
      }

      public fzn c() {
         return this.i;
      }

      @Override
      public wy a() {
         xm $$0 = wy.i();
         $$0.b(wy.a("narrator.select", this.i.a));
         $$0.b(wx.t);
         switch (this.i.g()) {
            case b:
               $$0.b(fqr.L);
               break;
            case d:
               $$0.b(fqr.J);
               $$0.b(wx.t);
               $$0.b(wy.a("multiplayer.status.version.narration", this.i.h));
               $$0.b(wx.t);
               $$0.b(wy.a("multiplayer.status.motd.narration", this.i.d));
               break;
            case c:
               $$0.b(fqr.K);
               break;
            default:
               $$0.b(fqr.M);
               $$0.b(wx.t);
               $$0.b(wy.a("multiplayer.status.ping.narration", this.i.f));
               $$0.b(wx.t);
               $$0.b(wy.a("multiplayer.status.motd.narration", this.i.d));
               if (this.i.e != null) {
                  $$0.b(wx.t);
                  $$0.b(wy.a("multiplayer.status.player_count.narration", this.i.e.b(), this.i.e.a()));
                  $$0.b(wx.t);
                  $$0.b(xb.a(this.i.i, wy.b(", ")));
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
