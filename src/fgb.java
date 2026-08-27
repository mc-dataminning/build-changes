import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgb extends eya<fgb.a> {
   static final ahg a = new ahg("server_list/incompatible");
   static final ahg m = new ahg("server_list/unreachable");
   static final ahg n = new ahg("server_list/ping_1");
   static final ahg o = new ahg("server_list/ping_2");
   static final ahg p = new ahg("server_list/ping_3");
   static final ahg q = new ahg("server_list/ping_4");
   static final ahg r = new ahg("server_list/ping_5");
   static final ahg t = new ahg("server_list/pinging_1");
   static final ahg u = new ahg("server_list/pinging_2");
   static final ahg v = new ahg("server_list/pinging_3");
   static final ahg w = new ahg("server_list/pinging_4");
   static final ahg x = new ahg("server_list/pinging_5");
   static final ahg y = new ahg("server_list/join_highlighted");
   static final ahg z = new ahg("server_list/join");
   static final ahg A = new ahg("server_list/move_up_highlighted");
   static final ahg B = new ahg("server_list/move_up");
   static final ahg C = new ahg("server_list/move_down_highlighted");
   static final ahg D = new ahg("server_list/move_down");
   static final Logger E = LogUtils.getLogger();
   static final ThreadPoolExecutor F = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new r(E)).build()
   );
   private static final ahg G = new ahg("textures/misc/unknown_server.png");
   static final vf H = vf.c("lanServer.scanning");
   static final vf I = vf.c("multiplayer.status.cannot_resolve").b(-65536);
   static final vf J = vf.c("multiplayer.status.cannot_connect").b(-65536);
   static final vf K = vf.c("multiplayer.status.incompatible");
   static final vf L = vf.c("multiplayer.status.no_connection");
   static final vf M = vf.c("multiplayer.status.pinging");
   static final vf N = vf.c("multiplayer.status.online");
   private final ffx O;
   private final List<fgb.d> P = Lists.newArrayList();
   private final fgb.a Q = new fgb.b();
   private final List<fgb.c> R = Lists.newArrayList();

   public fgb(ffx $$0, evg $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.O = $$0;
   }

   private void e() {
      this.m();
      this.P.forEach($$1 -> this.b($$1));
      this.b(this.Q);
      this.R.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable fgb.a $$0) {
      super.a($$0);
      this.O.C();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      fgb.a $$3 = this.i();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(foc $$0) {
      this.P.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.P.add(new fgb.d(this.O, $$0.a($$1)));
      }

      this.e();
   }

   public void a(List<giq> $$0) {
      int $$1 = $$0.size() - this.R.size();
      this.R.clear();

      for (giq $$2 : $$0) {
         this.R.add(new fgb.c(this.O, $$2));
      }

      this.e();

      for (int $$3 = this.R.size() - $$1; $$3 < this.R.size(); $$3++) {
         fgb.c $$4 = this.R.get($$3);
         int $$5 = $$3 - this.R.size() + this.l().size();
         int $$6 = this.g($$5);
         int $$7 = this.h($$5);
         if ($$7 >= this.C() && $$6 <= this.E()) {
            this.c.aV().b(vf.a("multiplayer.lan.server_found", $$4.c()));
         }
      }
   }

   @Override
   protected int c() {
      return super.c() + 30;
   }

   @Override
   public int b() {
      return super.b() + 85;
   }

   public void d() {
   }

   public abstract static class a extends eya.a<fgb.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fgb.a {
      private final evg a = evg.O();

      @Override
      public void a(ews $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(this.a.h, fgb.H, this.a.y.g / 2 - this.a.h.a(fgb.H) / 2, $$10, 16777215, false);
         String $$11 = fck.a(ac.b());
         $$0.a(this.a.h, $$11, this.a.y.g / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712, false);
      }

      @Override
      public vf a() {
         return fgb.H;
      }
   }

   public static class c extends fgb.a {
      private static final int c = 32;
      private static final vf d = vf.c("lanServer.title");
      private static final vf e = vf.c("selectServer.hiddenAddress");
      private final ffx f;
      protected final evg a;
      protected final giq b;
      private long g;

      protected c(ffx $$0, giq $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = evg.O();
      }

      @Override
      public void a(ews $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
            this.f.n();
         }

         this.g = ac.b();
         return false;
      }

      public giq b() {
         return this.b;
      }

      @Override
      public vf a() {
         return vf.a("narrator.select", this.c());
      }

      public vf c() {
         return vf.i().b(d).b(ve.u).f(this.b.a());
      }
   }

   public class d extends fgb.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 32;
      private final ffx e;
      private final evg f;
      private final fob g;
      private final fce h;
      @Nullable
      private byte[] i;
      private long j;

      protected d(ffx $$1, fob $$2) {
         this.e = $$1;
         this.g = $$2;
         this.f = evg.O();
         this.h = fce.b(this.f.Y(), $$2.b);
      }

      @Override
      public void a(ews $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (!this.g.i) {
            this.g.i = true;
            this.g.f = -2L;
            this.g.d = ve.a;
            this.g.c = ve.a;
            fgb.F.submit(() -> {
               try {
                  this.e.D().a(this.g, () -> this.f.execute(this::b));
               } catch (UnknownHostException var2x) {
                  this.g.f = -1L;
                  this.g.d = fgb.I;
               } catch (Exception var3x) {
                  this.g.f = -1L;
                  this.g.d = fgb.J;
               }
            });
         }

         boolean $$10 = !this.e();
         $$0.a(this.f.h, this.g.a, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         List<atz> $$11 = this.f.h.c(this.g.d, $$4 - 32 - 2);

         for (int $$12 = 0; $$12 < Math.min($$11.size(), 2); $$12++) {
            $$0.a(this.f.h, $$11.get($$12), $$3 + 32 + 3, $$2 + 12 + 9 * $$12, -8355712, false);
         }

         vf $$13 = (vf)($$10 ? this.g.h.f().a(n.m) : this.g.c);
         int $$14 = this.f.h.a($$13);
         $$0.a(this.f.h, $$13, $$3 + $$4 - $$14 - 15 - 2, $$2 + 1, -8355712, false);
         ahg $$15;
         List<vf> $$17;
         vf $$16;
         if ($$10) {
            $$15 = fgb.a;
            $$16 = fgb.K;
            $$17 = this.g.j;
         } else if (this.d()) {
            if (this.g.f < 0L) {
               $$15 = fgb.m;
            } else if (this.g.f < 150L) {
               $$15 = fgb.r;
            } else if (this.g.f < 300L) {
               $$15 = fgb.q;
            } else if (this.g.f < 600L) {
               $$15 = fgb.p;
            } else if (this.g.f < 1000L) {
               $$15 = fgb.o;
            } else {
               $$15 = fgb.n;
            }

            if (this.g.f < 0L) {
               $$16 = fgb.L;
               $$17 = Collections.emptyList();
            } else {
               $$16 = vf.a("multiplayer.status.ping", this.g.f);
               $$17 = this.g.j;
            }
         } else {
            int $$28 = (int)(ac.b() / 100L + (long)($$1 * 2) & 7L);
            if ($$28 > 4) {
               $$28 = 8 - $$28;
            }
            $$15 = switch ($$28) {
               case 1 -> fgb.u;
               case 2 -> fgb.v;
               case 3 -> fgb.w;
               case 4 -> fgb.x;
               default -> fgb.t;
            };
            $$16 = fgb.M;
            $$17 = Collections.emptyList();
         }

         $$0.a($$15, $$3 + $$4 - 15, $$2, 10, 8);
         byte[] $$32 = this.g.c();
         if (!Arrays.equals($$32, this.i)) {
            if (this.a($$32)) {
               this.i = $$32;
            } else {
               this.g.a(null);
               this.b();
            }
         }

         this.a($$0, $$3, $$2, this.h.b());
         int $$33 = $$6 - $$3;
         int $$34 = $$7 - $$2;
         if ($$33 >= $$4 - 15 && $$33 <= $$4 - 5 && $$34 >= 0 && $$34 <= 8) {
            this.e.c(Collections.singletonList($$16));
         } else if ($$33 >= $$4 - $$14 - 15 - 2 && $$33 <= $$4 - 15 - 2 && $$34 >= 0 && $$34 <= 8) {
            this.e.c($$17);
         }

         if (this.f.m.W().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$35 = $$6 - $$3;
            int $$36 = $$7 - $$2;
            if (this.f()) {
               if ($$35 < 32 && $$35 > 16) {
                  $$0.a(fgb.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fgb.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$35 < 16 && $$36 < 16) {
                  $$0.a(fgb.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fgb.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.e.E().c() - 1) {
               if ($$35 < 16 && $$36 > 16) {
                  $$0.a(fgb.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fgb.D, $$3, $$2, 32, 32);
               }
            }
         }
      }

      private boolean d() {
         return this.g.i && this.g.f != -2L;
      }

      private boolean e() {
         return this.g.g == aa.b().e();
      }

      public void b() {
         this.e.E().b();
      }

      protected void a(ews $$0, int $$1, int $$2, ahg $$3) {
         RenderSystem.enableBlend();
         $$0.a($$3, $$1, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         RenderSystem.disableBlend();
      }

      private boolean f() {
         return true;
      }

      private boolean a(@Nullable byte[] $$0) {
         if ($$0 == null) {
            this.h.a();
         } else {
            try {
               this.h.a(epa.a($$0));
            } catch (Throwable var3) {
               fgb.E.error("Invalid icon for server {} ({})", new Object[]{this.g.a, this.g.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fcz.s()) {
            fgb $$3 = this.e.l;
            int $$4 = $$3.l().indexOf(this);
            if ($$4 == -1) {
               return true;
            }

            if ($$0 == 264 && $$4 < this.e.E().c() - 1 || $$0 == 265 && $$4 > 0) {
               this.a($$4, $$0 == 264 ? $$4 + 1 : $$4 - 1);
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      private void a(int $$0, int $$1) {
         this.e.E().a($$0, $$1);
         this.e.l.a(this.e.E());
         fgb.a $$2 = this.e.l.l().get($$1);
         this.e.l.a($$2);
         fgb.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)fgb.this.q();
         double $$4 = $$1 - (double)fgb.this.g(fgb.this.l().indexOf(this));
         if ($$3 <= 32.0) {
            if ($$3 < 32.0 && $$3 > 16.0 && this.f()) {
               this.e.a(this);
               this.e.n();
               return true;
            }

            int $$5 = this.e.l.l().indexOf(this);
            if ($$3 < 16.0 && $$4 < 16.0 && $$5 > 0) {
               this.a($$5, $$5 - 1);
               return true;
            }

            if ($$3 < 16.0 && $$4 > 16.0 && $$5 < this.e.E().c() - 1) {
               this.a($$5, $$5 + 1);
               return true;
            }
         }

         this.e.a(this);
         if (ac.b() - this.j < 250L) {
            this.e.n();
         }

         this.j = ac.b();
         return true;
      }

      public fob c() {
         return this.g;
      }

      @Override
      public vf a() {
         vt $$0 = vf.i();
         $$0.b(vf.a("narrator.select", this.g.a));
         $$0.b(ve.s);
         if (!this.e()) {
            $$0.b(fgb.K);
            $$0.b(ve.s);
            $$0.b(vf.a("multiplayer.status.version.narration", this.g.h));
            $$0.b(ve.s);
            $$0.b(vf.a("multiplayer.status.motd.narration", this.g.d));
         } else if (this.g.f < 0L) {
            $$0.b(fgb.L);
         } else if (!this.d()) {
            $$0.b(fgb.M);
         } else {
            $$0.b(fgb.N);
            $$0.b(ve.s);
            $$0.b(vf.a("multiplayer.status.ping.narration", this.g.f));
            $$0.b(ve.s);
            $$0.b(vf.a("multiplayer.status.motd.narration", this.g.d));
            if (this.g.e != null) {
               $$0.b(ve.s);
               $$0.b(vf.a("multiplayer.status.player_count.narration", this.g.e.b(), this.g.e.a()));
               $$0.b(ve.s);
               $$0.b(vi.a(this.g.j, vf.b(", ")));
            }
         }

         return $$0;
      }

      @Override
      public void close() {
         this.h.close();
      }
   }
}
