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

public class fav extends ete<fav.a> {
   static final aep a = new aep("server_list/incompatible");
   static final aep l = new aep("server_list/unreachable");
   static final aep m = new aep("server_list/ping_1");
   static final aep n = new aep("server_list/ping_2");
   static final aep o = new aep("server_list/ping_3");
   static final aep p = new aep("server_list/ping_4");
   static final aep q = new aep("server_list/ping_5");
   static final aep s = new aep("server_list/pinging_1");
   static final aep t = new aep("server_list/pinging_2");
   static final aep u = new aep("server_list/pinging_3");
   static final aep v = new aep("server_list/pinging_4");
   static final aep w = new aep("server_list/pinging_5");
   static final aep x = new aep("server_list/join_highlighted");
   static final aep y = new aep("server_list/join");
   static final aep z = new aep("server_list/move_up_highlighted");
   static final aep A = new aep("server_list/move_up");
   static final aep B = new aep("server_list/move_down_highlighted");
   static final aep C = new aep("server_list/move_down");
   static final Logger D = LogUtils.getLogger();
   static final ThreadPoolExecutor E = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new r(D)).build()
   );
   private static final aep F = new aep("textures/misc/unknown_server.png");
   static final te G = te.c("lanServer.scanning");
   static final te H = te.c("multiplayer.status.cannot_resolve").a($$0 -> $$0.a(-65536));
   static final te I = te.c("multiplayer.status.cannot_connect").a($$0 -> $$0.a(-65536));
   static final te J = te.c("multiplayer.status.incompatible");
   static final te K = te.c("multiplayer.status.no_connection");
   static final te L = te.c("multiplayer.status.pinging");
   static final te M = te.c("multiplayer.status.online");
   private final far N;
   private final List<fav.d> O = Lists.newArrayList();
   private final fav.a P = new fav.b();
   private final List<fav.c> Q = Lists.newArrayList();

   public fav(far $$0, eqn $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      super($$1, $$2, $$3, $$4, $$5, $$6);
      this.N = $$0;
   }

   private void e() {
      this.j();
      this.O.forEach($$1 -> this.b($$1));
      this.b(this.P);
      this.Q.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable fav.a $$0) {
      super.a($$0);
      this.N.B();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      fav.a $$3 = this.f();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(fio $$0) {
      this.O.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.O.add(new fav.d(this.N, $$0.a($$1)));
      }

      this.e();
   }

   public void a(List<gcg> $$0) {
      int $$1 = $$0.size() - this.Q.size();
      this.Q.clear();

      for (gcg $$2 : $$0) {
         this.Q.add(new fav.c(this.N, $$2));
      }

      this.e();

      for (int $$3 = this.Q.size() - $$1; $$3 < this.Q.size(); $$3++) {
         fav.c $$4 = this.Q.get($$3);
         int $$5 = $$3 - this.Q.size() + this.i().size();
         int $$6 = this.g($$5);
         int $$7 = this.h($$5);
         if ($$7 >= this.f && $$6 <= this.g) {
            this.b.aU().b(te.a("multiplayer.lan.server_found", $$4.d()));
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

   public abstract static class a extends ete.a<fav.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fav.a {
      private final eqn a = eqn.N();

      @Override
      public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(this.a.h, fav.G, this.a.z.g / 2 - this.a.h.a(fav.G) / 2, $$10, 16777215, false);
         String $$11 = exg.a(ac.b());
         $$0.a(this.a.h, $$11, this.a.z.g / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712, false);
      }

      @Override
      public te a() {
         return fav.G;
      }
   }

   public static class c extends fav.a {
      private static final int c = 32;
      private static final te d = te.c("lanServer.title");
      private static final te e = te.c("selectServer.hiddenAddress");
      private final far f;
      protected final eqn a;
      protected final gcg b;
      private long g;

      protected c(far $$0, gcg $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = eqn.N();
      }

      @Override
      public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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

      public gcg b() {
         return this.b;
      }

      @Override
      public te a() {
         return te.a("narrator.select", this.d());
      }

      public te d() {
         return te.h().b(d).b(td.u).f(this.b.a());
      }
   }

   public class d extends fav.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 32;
      private final far e;
      private final eqn f;
      private final fin g;
      private final exa h;
      @Nullable
      private byte[] i;
      private long j;

      protected d(far $$1, fin $$2) {
         this.e = $$1;
         this.g = $$2;
         this.f = eqn.N();
         this.h = exa.b(this.f.X(), $$2.b);
      }

      @Override
      public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (!this.g.i) {
            this.g.i = true;
            this.g.f = -2L;
            this.g.d = td.a;
            this.g.c = td.a;
            fav.E.submit(() -> {
               try {
                  this.e.C().a(this.g, () -> this.f.execute(this::b));
               } catch (UnknownHostException var2x) {
                  this.g.f = -1L;
                  this.g.d = fav.H;
               } catch (Exception var3x) {
                  this.g.f = -1L;
                  this.g.d = fav.I;
               }
            });
         }

         boolean $$10 = !this.f();
         $$0.a(this.f.h, this.g.a, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         List<ara> $$11 = this.f.h.c(this.g.d, $$4 - 32 - 2);

         for (int $$12 = 0; $$12 < Math.min($$11.size(), 2); $$12++) {
            $$0.a(this.f.h, $$11.get($$12), $$3 + 32 + 3, $$2 + 12 + 9 * $$12, -8355712, false);
         }

         te $$13 = (te)($$10 ? this.g.h.e().a(n.m) : this.g.c);
         int $$14 = this.f.h.a($$13);
         $$0.a(this.f.h, $$13, $$3 + $$4 - $$14 - 15 - 2, $$2 + 1, -8355712, false);
         aep $$15;
         List<te> $$17;
         te $$16;
         if ($$10) {
            $$15 = fav.a;
            $$16 = fav.J;
            $$17 = this.g.j;
         } else if (this.e()) {
            if (this.g.f < 0L) {
               $$15 = fav.l;
            } else if (this.g.f < 150L) {
               $$15 = fav.q;
            } else if (this.g.f < 300L) {
               $$15 = fav.p;
            } else if (this.g.f < 600L) {
               $$15 = fav.o;
            } else if (this.g.f < 1000L) {
               $$15 = fav.n;
            } else {
               $$15 = fav.m;
            }

            if (this.g.f < 0L) {
               $$16 = fav.K;
               $$17 = Collections.emptyList();
            } else {
               $$16 = te.a("multiplayer.status.ping", this.g.f);
               $$17 = this.g.j;
            }
         } else {
            int $$28 = (int)(ac.b() / 100L + (long)($$1 * 2) & 7L);
            if ($$28 > 4) {
               $$28 = 8 - $$28;
            }
            $$15 = switch ($$28) {
               case 1 -> fav.t;
               case 2 -> fav.u;
               case 3 -> fav.v;
               case 4 -> fav.w;
               default -> fav.s;
            };
            $$16 = fav.L;
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

         if (this.f.m.U().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$35 = $$6 - $$3;
            int $$36 = $$7 - $$2;
            if (this.g()) {
               if ($$35 < 32 && $$35 > 16) {
                  $$0.a(fav.x, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fav.y, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$35 < 16 && $$36 < 16) {
                  $$0.a(fav.z, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fav.A, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.e.D().c() - 1) {
               if ($$35 < 16 && $$36 > 16) {
                  $$0.a(fav.B, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fav.C, $$3, $$2, 32, 32);
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
         this.e.D().b();
      }

      protected void a(erx $$0, int $$1, int $$2, aep $$3) {
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
               this.h.a(eki.a($$0));
            } catch (Throwable var3) {
               fav.D.error("Invalid icon for server {} ({})", new Object[]{this.g.a, this.g.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (exv.q()) {
            fav $$3 = this.e.l;
            int $$4 = $$3.i().indexOf(this);
            if ($$4 == -1) {
               return true;
            }

            if ($$0 == 264 && $$4 < this.e.D().c() - 1 || $$0 == 265 && $$4 > 0) {
               this.a($$4, $$0 == 264 ? $$4 + 1 : $$4 - 1);
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      private void a(int $$0, int $$1) {
         this.e.D().a($$0, $$1);
         this.e.l.a(this.e.D());
         fav.a $$2 = this.e.l.i().get($$1);
         this.e.l.a($$2);
         fav.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)fav.this.o();
         double $$4 = $$1 - (double)fav.this.g(fav.this.i().indexOf(this));
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

            if ($$3 < 16.0 && $$4 > 16.0 && $$5 < this.e.D().c() - 1) {
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

      public fin d() {
         return this.g;
      }

      @Override
      public te a() {
         tr $$0 = te.h();
         $$0.b(te.a("narrator.select", this.g.a));
         $$0.b(td.s);
         if (!this.f()) {
            $$0.b(fav.J);
            $$0.b(td.s);
            $$0.b(te.a("multiplayer.status.version.narration", this.g.h));
            $$0.b(td.s);
            $$0.b(te.a("multiplayer.status.motd.narration", this.g.d));
         } else if (this.g.f < 0L) {
            $$0.b(fav.K);
         } else if (!this.e()) {
            $$0.b(fav.L);
         } else {
            $$0.b(fav.M);
            $$0.b(td.s);
            $$0.b(te.a("multiplayer.status.ping.narration", this.g.f));
            $$0.b(td.s);
            $$0.b(te.a("multiplayer.status.motd.narration", this.g.d));
            if (this.g.e != null) {
               $$0.b(td.s);
               $$0.b(te.a("multiplayer.status.player_count.narration", this.g.e.b(), this.g.e.a()));
               $$0.b(td.s);
               $$0.b(tg.a(this.g.j, te.b(", ")));
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
