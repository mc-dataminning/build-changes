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

public class fdw extends evv<fdw.a> {
   static final agi a = new agi("server_list/incompatible");
   static final agi m = new agi("server_list/unreachable");
   static final agi n = new agi("server_list/ping_1");
   static final agi o = new agi("server_list/ping_2");
   static final agi p = new agi("server_list/ping_3");
   static final agi q = new agi("server_list/ping_4");
   static final agi r = new agi("server_list/ping_5");
   static final agi t = new agi("server_list/pinging_1");
   static final agi u = new agi("server_list/pinging_2");
   static final agi v = new agi("server_list/pinging_3");
   static final agi w = new agi("server_list/pinging_4");
   static final agi x = new agi("server_list/pinging_5");
   static final agi y = new agi("server_list/join_highlighted");
   static final agi z = new agi("server_list/join");
   static final agi A = new agi("server_list/move_up_highlighted");
   static final agi B = new agi("server_list/move_up");
   static final agi C = new agi("server_list/move_down_highlighted");
   static final agi D = new agi("server_list/move_down");
   static final Logger E = LogUtils.getLogger();
   static final ThreadPoolExecutor F = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new r(E)).build()
   );
   private static final agi G = new agi("textures/misc/unknown_server.png");
   static final ur H = ur.c("lanServer.scanning");
   static final ur I = ur.c("multiplayer.status.cannot_resolve").b(-65536);
   static final ur J = ur.c("multiplayer.status.cannot_connect").b(-65536);
   static final ur K = ur.c("multiplayer.status.incompatible");
   static final ur L = ur.c("multiplayer.status.no_connection");
   static final ur M = ur.c("multiplayer.status.pinging");
   static final ur N = ur.c("multiplayer.status.online");
   private final fds O;
   private final List<fdw.d> P = Lists.newArrayList();
   private final fdw.a Q = new fdw.b();
   private final List<fdw.c> R = Lists.newArrayList();

   public fdw(fds $$0, etd $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      super($$1, $$2, $$3, $$4, $$5, $$6);
      this.O = $$0;
   }

   private void v() {
      this.j();
      this.P.forEach($$1 -> this.b($$1));
      this.b(this.Q);
      this.R.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable fdw.a $$0) {
      super.a($$0);
      this.O.C();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      fdw.a $$3 = this.f();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(flv $$0) {
      this.P.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.P.add(new fdw.d(this.O, $$0.a($$1)));
      }

      this.v();
   }

   public void a(List<gfu> $$0) {
      int $$1 = $$0.size() - this.R.size();
      this.R.clear();

      for (gfu $$2 : $$0) {
         this.R.add(new fdw.c(this.O, $$2));
      }

      this.v();

      for (int $$3 = this.R.size() - $$1; $$3 < this.R.size(); $$3++) {
         fdw.c $$4 = this.R.get($$3);
         int $$5 = $$3 - this.R.size() + this.i().size();
         int $$6 = this.h($$5);
         int $$7 = this.i($$5);
         if ($$7 >= this.g && $$6 <= this.h) {
            this.c.aU().b(ur.a("multiplayer.lan.server_found", $$4.c()));
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

   public void e() {
   }

   public abstract static class a extends evv.a<fdw.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fdw.a {
      private final etd a = etd.N();

      @Override
      public void a(euo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(this.a.h, fdw.H, this.a.y.g / 2 - this.a.h.a(fdw.H) / 2, $$10, 16777215, false);
         String $$11 = faf.a(ac.b());
         $$0.a(this.a.h, $$11, this.a.y.g / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712, false);
      }

      @Override
      public ur a() {
         return fdw.H;
      }
   }

   public static class c extends fdw.a {
      private static final int c = 32;
      private static final ur d = ur.c("lanServer.title");
      private static final ur e = ur.c("selectServer.hiddenAddress");
      private final fds f;
      protected final etd a;
      protected final gfu b;
      private long g;

      protected c(fds $$0, gfu $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = etd.N();
      }

      @Override
      public void a(euo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
            this.f.l();
         }

         this.g = ac.b();
         return false;
      }

      public gfu b() {
         return this.b;
      }

      @Override
      public ur a() {
         return ur.a("narrator.select", this.c());
      }

      public ur c() {
         return ur.i().b(d).b(uq.u).f(this.b.a());
      }
   }

   public class d extends fdw.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 32;
      private final fds e;
      private final etd f;
      private final flu g;
      private final ezz h;
      @Nullable
      private byte[] i;
      private long j;

      protected d(fds $$1, flu $$2) {
         this.e = $$1;
         this.g = $$2;
         this.f = etd.N();
         this.h = ezz.b(this.f.X(), $$2.b);
      }

      @Override
      public void a(euo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (!this.g.i) {
            this.g.i = true;
            this.g.f = -2L;
            this.g.d = uq.a;
            this.g.c = uq.a;
            fdw.F.submit(() -> {
               try {
                  this.e.D().a(this.g, () -> this.f.execute(this::b));
               } catch (UnknownHostException var2x) {
                  this.g.f = -1L;
                  this.g.d = fdw.I;
               } catch (Exception var3x) {
                  this.g.f = -1L;
                  this.g.d = fdw.J;
               }
            });
         }

         boolean $$10 = !this.f();
         $$0.a(this.f.h, this.g.a, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         List<asy> $$11 = this.f.h.c(this.g.d, $$4 - 32 - 2);

         for (int $$12 = 0; $$12 < Math.min($$11.size(), 2); $$12++) {
            $$0.a(this.f.h, $$11.get($$12), $$3 + 32 + 3, $$2 + 12 + 9 * $$12, -8355712, false);
         }

         ur $$13 = (ur)($$10 ? this.g.h.f().a(n.m) : this.g.c);
         int $$14 = this.f.h.a($$13);
         $$0.a(this.f.h, $$13, $$3 + $$4 - $$14 - 15 - 2, $$2 + 1, -8355712, false);
         agi $$15;
         List<ur> $$17;
         ur $$16;
         if ($$10) {
            $$15 = fdw.a;
            $$16 = fdw.K;
            $$17 = this.g.j;
         } else if (this.e()) {
            if (this.g.f < 0L) {
               $$15 = fdw.m;
            } else if (this.g.f < 150L) {
               $$15 = fdw.r;
            } else if (this.g.f < 300L) {
               $$15 = fdw.q;
            } else if (this.g.f < 600L) {
               $$15 = fdw.p;
            } else if (this.g.f < 1000L) {
               $$15 = fdw.o;
            } else {
               $$15 = fdw.n;
            }

            if (this.g.f < 0L) {
               $$16 = fdw.L;
               $$17 = Collections.emptyList();
            } else {
               $$16 = ur.a("multiplayer.status.ping", this.g.f);
               $$17 = this.g.j;
            }
         } else {
            int $$28 = (int)(ac.b() / 100L + (long)($$1 * 2) & 7L);
            if ($$28 > 4) {
               $$28 = 8 - $$28;
            }
            $$15 = switch ($$28) {
               case 1 -> fdw.u;
               case 2 -> fdw.v;
               case 3 -> fdw.w;
               case 4 -> fdw.x;
               default -> fdw.t;
            };
            $$16 = fdw.M;
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
            if (this.g()) {
               if ($$35 < 32 && $$35 > 16) {
                  $$0.a(fdw.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fdw.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$35 < 16 && $$36 < 16) {
                  $$0.a(fdw.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fdw.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.e.E().c() - 1) {
               if ($$35 < 16 && $$36 > 16) {
                  $$0.a(fdw.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fdw.D, $$3, $$2, 32, 32);
               }
            }
         }
      }

      private boolean e() {
         return this.g.i && this.g.f != -2L;
      }

      private boolean f() {
         return this.g.g == aa.b().e();
      }

      public void b() {
         this.e.E().b();
      }

      protected void a(euo $$0, int $$1, int $$2, agi $$3) {
         RenderSystem.enableBlend();
         $$0.a($$3, $$1, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         RenderSystem.disableBlend();
      }

      private boolean g() {
         return true;
      }

      private boolean a(@Nullable byte[] $$0) {
         if ($$0 == null) {
            this.h.a();
         } else {
            try {
               this.h.a(emx.a($$0));
            } catch (Throwable var3) {
               fdw.E.error("Invalid icon for server {} ({})", new Object[]{this.g.a, this.g.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fau.q()) {
            fdw $$3 = this.e.l;
            int $$4 = $$3.i().indexOf(this);
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
         fdw.a $$2 = this.e.l.i().get($$1);
         this.e.l.a($$2);
         fdw.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)fdw.this.o();
         double $$4 = $$1 - (double)fdw.this.h(fdw.this.i().indexOf(this));
         if ($$3 <= 32.0) {
            if ($$3 < 32.0 && $$3 > 16.0 && this.g()) {
               this.e.a(this);
               this.e.l();
               return true;
            }

            int $$5 = this.e.l.i().indexOf(this);
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
            this.e.l();
         }

         this.j = ac.b();
         return true;
      }

      public flu c() {
         return this.g;
      }

      @Override
      public ur a() {
         vf $$0 = ur.i();
         $$0.b(ur.a("narrator.select", this.g.a));
         $$0.b(uq.s);
         if (!this.f()) {
            $$0.b(fdw.K);
            $$0.b(uq.s);
            $$0.b(ur.a("multiplayer.status.version.narration", this.g.h));
            $$0.b(uq.s);
            $$0.b(ur.a("multiplayer.status.motd.narration", this.g.d));
         } else if (this.g.f < 0L) {
            $$0.b(fdw.L);
         } else if (!this.e()) {
            $$0.b(fdw.M);
         } else {
            $$0.b(fdw.N);
            $$0.b(uq.s);
            $$0.b(ur.a("multiplayer.status.ping.narration", this.g.f));
            $$0.b(uq.s);
            $$0.b(ur.a("multiplayer.status.motd.narration", this.g.d));
            if (this.g.e != null) {
               $$0.b(uq.s);
               $$0.b(ur.a("multiplayer.status.player_count.narration", this.g.e.b(), this.g.e.a()));
               $$0.b(uq.s);
               $$0.b(uu.a(this.g.j, ur.b(", ")));
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
