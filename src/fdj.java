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

public class fdj extends evi<fdj.a> {
   static final agg a = new agg("server_list/incompatible");
   static final agg m = new agg("server_list/unreachable");
   static final agg n = new agg("server_list/ping_1");
   static final agg o = new agg("server_list/ping_2");
   static final agg p = new agg("server_list/ping_3");
   static final agg q = new agg("server_list/ping_4");
   static final agg r = new agg("server_list/ping_5");
   static final agg t = new agg("server_list/pinging_1");
   static final agg u = new agg("server_list/pinging_2");
   static final agg v = new agg("server_list/pinging_3");
   static final agg w = new agg("server_list/pinging_4");
   static final agg x = new agg("server_list/pinging_5");
   static final agg y = new agg("server_list/join_highlighted");
   static final agg z = new agg("server_list/join");
   static final agg A = new agg("server_list/move_up_highlighted");
   static final agg B = new agg("server_list/move_up");
   static final agg C = new agg("server_list/move_down_highlighted");
   static final agg D = new agg("server_list/move_down");
   static final Logger E = LogUtils.getLogger();
   static final ThreadPoolExecutor F = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new r(E)).build()
   );
   private static final agg G = new agg("textures/misc/unknown_server.png");
   static final ur H = ur.c("lanServer.scanning");
   static final ur I = ur.c("multiplayer.status.cannot_resolve").b(-65536);
   static final ur J = ur.c("multiplayer.status.cannot_connect").b(-65536);
   static final ur K = ur.c("multiplayer.status.incompatible");
   static final ur L = ur.c("multiplayer.status.no_connection");
   static final ur M = ur.c("multiplayer.status.pinging");
   static final ur N = ur.c("multiplayer.status.online");
   private final fdf O;
   private final List<fdj.d> P = Lists.newArrayList();
   private final fdj.a Q = new fdj.b();
   private final List<fdj.c> R = Lists.newArrayList();

   public fdj(fdf $$0, esr $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      super($$1, $$2, $$3, $$4, $$5, $$6);
      this.O = $$0;
   }

   private void v() {
      this.j();
      this.P.forEach($$1 -> this.b($$1));
      this.b(this.Q);
      this.R.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable fdj.a $$0) {
      super.a($$0);
      this.O.C();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      fdj.a $$3 = this.f();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(fli $$0) {
      this.P.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.P.add(new fdj.d(this.O, $$0.a($$1)));
      }

      this.v();
   }

   public void a(List<gfh> $$0) {
      int $$1 = $$0.size() - this.R.size();
      this.R.clear();

      for (gfh $$2 : $$0) {
         this.R.add(new fdj.c(this.O, $$2));
      }

      this.v();

      for (int $$3 = this.R.size() - $$1; $$3 < this.R.size(); $$3++) {
         fdj.c $$4 = this.R.get($$3);
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

   public abstract static class a extends evi.a<fdj.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fdj.a {
      private final esr a = esr.N();

      @Override
      public void a(eub $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(this.a.h, fdj.H, this.a.y.g / 2 - this.a.h.a(fdj.H) / 2, $$10, 16777215, false);
         String $$11 = ezs.a(ac.b());
         $$0.a(this.a.h, $$11, this.a.y.g / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712, false);
      }

      @Override
      public ur a() {
         return fdj.H;
      }
   }

   public static class c extends fdj.a {
      private static final int c = 32;
      private static final ur d = ur.c("lanServer.title");
      private static final ur e = ur.c("selectServer.hiddenAddress");
      private final fdf f;
      protected final esr a;
      protected final gfh b;
      private long g;

      protected c(fdf $$0, gfh $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = esr.N();
      }

      @Override
      public void a(eub $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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

      public gfh b() {
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

   public class d extends fdj.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 32;
      private final fdf e;
      private final esr f;
      private final flh g;
      private final ezm h;
      @Nullable
      private byte[] i;
      private long j;

      protected d(fdf $$1, flh $$2) {
         this.e = $$1;
         this.g = $$2;
         this.f = esr.N();
         this.h = ezm.b(this.f.X(), $$2.b);
      }

      @Override
      public void a(eub $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (!this.g.i) {
            this.g.i = true;
            this.g.f = -2L;
            this.g.d = uq.a;
            this.g.c = uq.a;
            fdj.F.submit(() -> {
               try {
                  this.e.D().a(this.g, () -> this.f.execute(this::b));
               } catch (UnknownHostException var2x) {
                  this.g.f = -1L;
                  this.g.d = fdj.I;
               } catch (Exception var3x) {
                  this.g.f = -1L;
                  this.g.d = fdj.J;
               }
            });
         }

         boolean $$10 = !this.f();
         $$0.a(this.f.h, this.g.a, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         List<asu> $$11 = this.f.h.c(this.g.d, $$4 - 32 - 2);

         for (int $$12 = 0; $$12 < Math.min($$11.size(), 2); $$12++) {
            $$0.a(this.f.h, $$11.get($$12), $$3 + 32 + 3, $$2 + 12 + 9 * $$12, -8355712, false);
         }

         ur $$13 = (ur)($$10 ? this.g.h.f().a(n.m) : this.g.c);
         int $$14 = this.f.h.a($$13);
         $$0.a(this.f.h, $$13, $$3 + $$4 - $$14 - 15 - 2, $$2 + 1, -8355712, false);
         agg $$15;
         List<ur> $$17;
         ur $$16;
         if ($$10) {
            $$15 = fdj.a;
            $$16 = fdj.K;
            $$17 = this.g.j;
         } else if (this.e()) {
            if (this.g.f < 0L) {
               $$15 = fdj.m;
            } else if (this.g.f < 150L) {
               $$15 = fdj.r;
            } else if (this.g.f < 300L) {
               $$15 = fdj.q;
            } else if (this.g.f < 600L) {
               $$15 = fdj.p;
            } else if (this.g.f < 1000L) {
               $$15 = fdj.o;
            } else {
               $$15 = fdj.n;
            }

            if (this.g.f < 0L) {
               $$16 = fdj.L;
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
               case 1 -> fdj.u;
               case 2 -> fdj.v;
               case 3 -> fdj.w;
               case 4 -> fdj.x;
               default -> fdj.t;
            };
            $$16 = fdj.M;
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
                  $$0.a(fdj.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fdj.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$35 < 16 && $$36 < 16) {
                  $$0.a(fdj.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fdj.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.e.E().c() - 1) {
               if ($$35 < 16 && $$36 > 16) {
                  $$0.a(fdj.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fdj.D, $$3, $$2, 32, 32);
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

      protected void a(eub $$0, int $$1, int $$2, agg $$3) {
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
               this.h.a(eml.a($$0));
            } catch (Throwable var3) {
               fdj.E.error("Invalid icon for server {} ({})", new Object[]{this.g.a, this.g.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fah.q()) {
            fdj $$3 = this.e.l;
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
         fdj.a $$2 = this.e.l.i().get($$1);
         this.e.l.a($$2);
         fdj.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)fdj.this.o();
         double $$4 = $$1 - (double)fdj.this.h(fdj.this.i().indexOf(this));
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

      public flh c() {
         return this.g;
      }

      @Override
      public ur a() {
         vf $$0 = ur.i();
         $$0.b(ur.a("narrator.select", this.g.a));
         $$0.b(uq.s);
         if (!this.f()) {
            $$0.b(fdj.K);
            $$0.b(uq.s);
            $$0.b(ur.a("multiplayer.status.version.narration", this.g.h));
            $$0.b(uq.s);
            $$0.b(ur.a("multiplayer.status.motd.narration", this.g.d));
         } else if (this.g.f < 0L) {
            $$0.b(fdj.L);
         } else if (!this.e()) {
            $$0.b(fdj.M);
         } else {
            $$0.b(fdj.N);
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
