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

public class fbf extends etg<fbf.a> {
   static final aez a = new aez("server_list/incompatible");
   static final aez m = new aez("server_list/unreachable");
   static final aez n = new aez("server_list/ping_1");
   static final aez o = new aez("server_list/ping_2");
   static final aez p = new aez("server_list/ping_3");
   static final aez q = new aez("server_list/ping_4");
   static final aez s = new aez("server_list/ping_5");
   static final aez t = new aez("server_list/pinging_1");
   static final aez u = new aez("server_list/pinging_2");
   static final aez v = new aez("server_list/pinging_3");
   static final aez w = new aez("server_list/pinging_4");
   static final aez x = new aez("server_list/pinging_5");
   static final aez y = new aez("server_list/join_highlighted");
   static final aez z = new aez("server_list/join");
   static final aez A = new aez("server_list/move_up_highlighted");
   static final aez B = new aez("server_list/move_up");
   static final aez C = new aez("server_list/move_down_highlighted");
   static final aez D = new aez("server_list/move_down");
   static final Logger E = LogUtils.getLogger();
   static final ThreadPoolExecutor F = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new r(E)).build()
   );
   private static final aez G = new aez("textures/misc/unknown_server.png");
   static final tl H = tl.c("lanServer.scanning");
   static final tl I = tl.c("multiplayer.status.cannot_resolve").a($$0 -> $$0.a(-65536));
   static final tl J = tl.c("multiplayer.status.cannot_connect").a($$0 -> $$0.a(-65536));
   static final tl K = tl.c("multiplayer.status.incompatible");
   static final tl L = tl.c("multiplayer.status.no_connection");
   static final tl M = tl.c("multiplayer.status.pinging");
   static final tl N = tl.c("multiplayer.status.online");
   private final fbb O;
   private final List<fbf.d> P = Lists.newArrayList();
   private final fbf.a Q = new fbf.b();
   private final List<fbf.c> R = Lists.newArrayList();

   public fbf(fbb $$0, eqp $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      super($$1, $$2, $$3, $$4, $$5, $$6);
      this.O = $$0;
   }

   private void e() {
      this.j();
      this.P.forEach($$1 -> this.b($$1));
      this.b(this.Q);
      this.R.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable fbf.a $$0) {
      super.a($$0);
      this.O.D();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      fbf.a $$3 = this.f();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(fje $$0) {
      this.P.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.P.add(new fbf.d(this.O, $$0.a($$1)));
      }

      this.e();
   }

   public void a(List<gda> $$0) {
      int $$1 = $$0.size() - this.R.size();
      this.R.clear();

      for (gda $$2 : $$0) {
         this.R.add(new fbf.c(this.O, $$2));
      }

      this.e();

      for (int $$3 = this.R.size() - $$1; $$3 < this.R.size(); $$3++) {
         fbf.c $$4 = this.R.get($$3);
         int $$5 = $$3 - this.R.size() + this.i().size();
         int $$6 = this.h($$5);
         int $$7 = this.i($$5);
         if ($$7 >= this.g && $$6 <= this.h) {
            this.c.aV().b(tl.a("multiplayer.lan.server_found", $$4.d()));
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

   public abstract static class a extends etg.a<fbf.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fbf.a {
      private final eqp a = eqp.O();

      @Override
      public void a(erz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(this.a.h, fbf.H, this.a.y.g / 2 - this.a.h.a(fbf.H) / 2, $$10, 16777215, false);
         String $$11 = exq.a(ac.b());
         $$0.a(this.a.h, $$11, this.a.y.g / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712, false);
      }

      @Override
      public tl a() {
         return fbf.H;
      }
   }

   public static class c extends fbf.a {
      private static final int c = 32;
      private static final tl d = tl.c("lanServer.title");
      private static final tl e = tl.c("selectServer.hiddenAddress");
      private final fbb f;
      protected final eqp a;
      protected final gda b;
      private long g;

      protected c(fbb $$0, gda $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = eqp.O();
      }

      @Override
      public void a(erz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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

      public gda b() {
         return this.b;
      }

      @Override
      public tl a() {
         return tl.a("narrator.select", this.d());
      }

      public tl d() {
         return tl.i().b(d).b(tk.u).f(this.b.a());
      }
   }

   public class d extends fbf.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 32;
      private final fbb e;
      private final eqp f;
      private final fjd g;
      private final exk h;
      @Nullable
      private byte[] i;
      private long j;

      protected d(fbb $$1, fjd $$2) {
         this.e = $$1;
         this.g = $$2;
         this.f = eqp.O();
         this.h = exk.b(this.f.Y(), $$2.b);
      }

      @Override
      public void a(erz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (!this.g.i) {
            this.g.i = true;
            this.g.f = -2L;
            this.g.d = tk.a;
            this.g.c = tk.a;
            fbf.F.submit(() -> {
               try {
                  this.e.E().a(this.g, () -> this.f.execute(this::b));
               } catch (UnknownHostException var2x) {
                  this.g.f = -1L;
                  this.g.d = fbf.I;
               } catch (Exception var3x) {
                  this.g.f = -1L;
                  this.g.d = fbf.J;
               }
            });
         }

         boolean $$10 = !this.f();
         $$0.a(this.f.h, this.g.a, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         List<arn> $$11 = this.f.h.c(this.g.d, $$4 - 32 - 2);

         for (int $$12 = 0; $$12 < Math.min($$11.size(), 2); $$12++) {
            $$0.a(this.f.h, $$11.get($$12), $$3 + 32 + 3, $$2 + 12 + 9 * $$12, -8355712, false);
         }

         tl $$13 = (tl)($$10 ? this.g.h.f().a(n.m) : this.g.c);
         int $$14 = this.f.h.a($$13);
         $$0.a(this.f.h, $$13, $$3 + $$4 - $$14 - 15 - 2, $$2 + 1, -8355712, false);
         aez $$15;
         List<tl> $$17;
         tl $$16;
         if ($$10) {
            $$15 = fbf.a;
            $$16 = fbf.K;
            $$17 = this.g.j;
         } else if (this.e()) {
            if (this.g.f < 0L) {
               $$15 = fbf.m;
            } else if (this.g.f < 150L) {
               $$15 = fbf.s;
            } else if (this.g.f < 300L) {
               $$15 = fbf.q;
            } else if (this.g.f < 600L) {
               $$15 = fbf.p;
            } else if (this.g.f < 1000L) {
               $$15 = fbf.o;
            } else {
               $$15 = fbf.n;
            }

            if (this.g.f < 0L) {
               $$16 = fbf.L;
               $$17 = Collections.emptyList();
            } else {
               $$16 = tl.a("multiplayer.status.ping", this.g.f);
               $$17 = this.g.j;
            }
         } else {
            int $$28 = (int)(ac.b() / 100L + (long)($$1 * 2) & 7L);
            if ($$28 > 4) {
               $$28 = 8 - $$28;
            }
            $$15 = switch ($$28) {
               case 1 -> fbf.u;
               case 2 -> fbf.v;
               case 3 -> fbf.w;
               case 4 -> fbf.x;
               default -> fbf.t;
            };
            $$16 = fbf.M;
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

         if (this.f.m.V().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$35 = $$6 - $$3;
            int $$36 = $$7 - $$2;
            if (this.g()) {
               if ($$35 < 32 && $$35 > 16) {
                  $$0.a(fbf.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fbf.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$35 < 16 && $$36 < 16) {
                  $$0.a(fbf.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fbf.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.e.F().c() - 1) {
               if ($$35 < 16 && $$36 > 16) {
                  $$0.a(fbf.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fbf.D, $$3, $$2, 32, 32);
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
         this.e.F().b();
      }

      protected void a(erz $$0, int $$1, int $$2, aez $$3) {
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
               this.h.a(ekk.a($$0));
            } catch (Throwable var3) {
               fbf.E.error("Invalid icon for server {} ({})", new Object[]{this.g.a, this.g.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (eye.q()) {
            fbf $$3 = this.e.l;
            int $$4 = $$3.i().indexOf(this);
            if ($$4 == -1) {
               return true;
            }

            if ($$0 == 264 && $$4 < this.e.F().c() - 1 || $$0 == 265 && $$4 > 0) {
               this.a($$4, $$0 == 264 ? $$4 + 1 : $$4 - 1);
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      private void a(int $$0, int $$1) {
         this.e.F().a($$0, $$1);
         this.e.l.a(this.e.F());
         fbf.a $$2 = this.e.l.i().get($$1);
         this.e.l.a($$2);
         fbf.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)fbf.this.o();
         double $$4 = $$1 - (double)fbf.this.h(fbf.this.i().indexOf(this));
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

            if ($$3 < 16.0 && $$4 > 16.0 && $$5 < this.e.F().c() - 1) {
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

      public fjd d() {
         return this.g;
      }

      @Override
      public tl a() {
         tz $$0 = tl.i();
         $$0.b(tl.a("narrator.select", this.g.a));
         $$0.b(tk.s);
         if (!this.f()) {
            $$0.b(fbf.K);
            $$0.b(tk.s);
            $$0.b(tl.a("multiplayer.status.version.narration", this.g.h));
            $$0.b(tk.s);
            $$0.b(tl.a("multiplayer.status.motd.narration", this.g.d));
         } else if (this.g.f < 0L) {
            $$0.b(fbf.L);
         } else if (!this.e()) {
            $$0.b(fbf.M);
         } else {
            $$0.b(fbf.N);
            $$0.b(tk.s);
            $$0.b(tl.a("multiplayer.status.ping.narration", this.g.f));
            $$0.b(tk.s);
            $$0.b(tl.a("multiplayer.status.motd.narration", this.g.d));
            if (this.g.e != null) {
               $$0.b(tk.s);
               $$0.b(tl.a("multiplayer.status.player_count.narration", this.g.e.b(), this.g.e.a()));
               $$0.b(tk.s);
               $$0.b(to.a(this.g.j, tl.b(", ")));
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
