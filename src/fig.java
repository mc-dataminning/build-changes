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

public class fig extends fad<fig.a> {
   static final aiy a = new aiy("server_list/incompatible");
   static final aiy m = new aiy("server_list/unreachable");
   static final aiy n = new aiy("server_list/ping_1");
   static final aiy o = new aiy("server_list/ping_2");
   static final aiy p = new aiy("server_list/ping_3");
   static final aiy q = new aiy("server_list/ping_4");
   static final aiy r = new aiy("server_list/ping_5");
   static final aiy t = new aiy("server_list/pinging_1");
   static final aiy u = new aiy("server_list/pinging_2");
   static final aiy v = new aiy("server_list/pinging_3");
   static final aiy w = new aiy("server_list/pinging_4");
   static final aiy x = new aiy("server_list/pinging_5");
   static final aiy y = new aiy("server_list/join_highlighted");
   static final aiy z = new aiy("server_list/join");
   static final aiy A = new aiy("server_list/move_up_highlighted");
   static final aiy B = new aiy("server_list/move_up");
   static final aiy C = new aiy("server_list/move_down_highlighted");
   static final aiy D = new aiy("server_list/move_down");
   static final Logger E = LogUtils.getLogger();
   static final ThreadPoolExecutor F = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new r(E)).build()
   );
   static final vq G = vq.c("lanServer.scanning");
   static final vq H = vq.c("multiplayer.status.cannot_resolve").b(-65536);
   static final vq I = vq.c("multiplayer.status.cannot_connect").b(-65536);
   static final vq J = vq.c("multiplayer.status.incompatible");
   static final vq K = vq.c("multiplayer.status.no_connection");
   static final vq L = vq.c("multiplayer.status.pinging");
   static final vq M = vq.c("multiplayer.status.online");
   private final fic N;
   private final List<fig.d> O = Lists.newArrayList();
   private final fig.a P = new fig.b();
   private final List<fig.c> Q = Lists.newArrayList();

   public fig(fic $$0, exh $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.N = $$0;
   }

   private void e() {
      this.m();
      this.O.forEach($$1 -> this.b($$1));
      this.b(this.P);
      this.Q.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable fig.a $$0) {
      super.a($$0);
      this.N.E();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      fig.a $$3 = this.i();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(fqj $$0) {
      this.O.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.O.add(new fig.d(this.N, $$0.a($$1)));
      }

      this.e();
   }

   public void a(List<gkz> $$0) {
      int $$1 = $$0.size() - this.Q.size();
      this.Q.clear();

      for (gkz $$2 : $$0) {
         this.Q.add(new fig.c(this.N, $$2));
      }

      this.e();

      for (int $$3 = this.Q.size() - $$1; $$3 < this.Q.size(); $$3++) {
         fig.c $$4 = this.Q.get($$3);
         int $$5 = $$3 - this.Q.size() + this.l().size();
         int $$6 = this.g($$5);
         int $$7 = this.h($$5);
         if ($$7 >= this.C() && $$6 <= this.E()) {
            this.c.aW().b(vq.a("multiplayer.lan.server_found", $$4.c()));
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

   public abstract static class a extends fad.a<fig.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fig.a {
      private final exh a = exh.O();

      @Override
      public void a(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(this.a.h, fig.G, this.a.y.g / 2 - this.a.h.a(fig.G) / 2, $$10, 16777215, false);
         String $$11 = fep.a(ac.b());
         $$0.a(this.a.h, $$11, this.a.y.g / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712, false);
      }

      @Override
      public vq a() {
         return fig.G;
      }
   }

   public static class c extends fig.a {
      private static final int c = 32;
      private static final vq d = vq.c("lanServer.title");
      private static final vq e = vq.c("selectServer.hiddenAddress");
      private final fic f;
      protected final exh a;
      protected final gkz b;
      private long g;

      protected c(fic $$0, gkz $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = exh.O();
      }

      @Override
      public void a(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
            this.f.o();
         }

         this.g = ac.b();
         return false;
      }

      public gkz b() {
         return this.b;
      }

      @Override
      public vq a() {
         return vq.a("narrator.select", this.c());
      }

      public vq c() {
         return vq.i().b(d).b(vp.v).f(this.b.a());
      }
   }

   public class d extends fig.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 5;
      private static final int e = 10;
      private static final int f = 8;
      private final fic g;
      private final exh h;
      private final fqi i;
      private final fej j;
      @Nullable
      private byte[] k;
      private long l;
      @Nullable
      private List<vq> m;
      @Nullable
      private aiy n;
      @Nullable
      private vq o;

      protected d(fic $$1, fqi $$2) {
         this.g = $$1;
         this.i = $$2;
         this.h = exh.O();
         this.j = fej.b(this.h.Y(), $$2.b);
         this.d();
      }

      @Override
      public void a(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.g() == fqi.b.a) {
            this.i.a(fqi.b.b);
            this.i.d = vp.a;
            this.i.c = vp.a;
            fig.F.submit(() -> {
               try {
                  this.g.H().a(this.i, () -> this.h.execute(this::b), () -> {
                     this.i.a(this.i.g == aa.b().e() ? fqi.b.e : fqi.b.d);
                     this.h.execute(this::d);
                  });
               } catch (UnknownHostException var2x) {
                  this.i.a(fqi.b.c);
                  this.i.d = fig.H;
                  this.h.execute(this::d);
               } catch (Exception var3x) {
                  this.i.a(fqi.b.c);
                  this.i.d = fig.I;
                  this.h.execute(this::d);
               }
            });
         }

         $$0.a(this.h.h, this.i.a, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         List<avt> $$10 = this.h.h.c(this.i.d, $$4 - 32 - 2);

         for (int $$11 = 0; $$11 < Math.min($$10.size(), 2); $$11++) {
            $$0.a(this.h.h, $$10.get($$11), $$3 + 32 + 3, $$2 + 12 + 9 * $$11, -8355712, false);
         }

         this.a($$0, $$3, $$2, this.j.b());
         if (this.i.g() == fqi.b.b) {
            int $$12 = (int)(ac.b() / 100L + (long)($$1 * 2) & 7L);
            if ($$12 > 4) {
               $$12 = 8 - $$12;
            }
            this.n = switch ($$12) {
               case 1 -> fig.u;
               case 2 -> fig.v;
               case 3 -> fig.w;
               case 4 -> fig.x;
               default -> fig.t;
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

         vq $$15 = (vq)(this.i.g() == fqi.b.d ? this.i.h.f().a(n.m) : this.i.c);
         int $$16 = this.h.h.a($$15);
         int $$17 = $$13 - $$16 - 5;
         $$0.a(this.h.h, $$15, $$17, $$2 + 1, -8355712, false);
         if (this.o != null && $$6 >= $$13 && $$6 <= $$13 + 10 && $$7 >= $$2 && $$7 <= $$2 + 8) {
            this.g.d(this.o);
         } else if (this.m != null && $$6 >= $$17 && $$6 <= $$17 + $$16 && $$7 >= $$2 && $$7 <= $$2 - 1 + 9) {
            this.g.b(Lists.transform(this.m, vq::g));
         }

         if (this.h.m.W().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$18 = $$6 - $$3;
            int $$19 = $$7 - $$2;
            if (this.e()) {
               if ($$18 < 32 && $$18 > 16) {
                  $$0.a(fig.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fig.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$18 < 16 && $$19 < 16) {
                  $$0.a(fig.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fig.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.g.I().c() - 1) {
               if ($$18 < 16 && $$19 > 16) {
                  $$0.a(fig.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fig.D, $$3, $$2, 32, 32);
               }
            }
         }
      }

      private void d() {
         this.m = null;
         switch (this.i.g()) {
            case a:
            case b:
               this.n = fig.n;
               this.o = fig.L;
               break;
            case d:
               this.n = fig.a;
               this.o = fig.J;
               this.m = this.i.i;
               break;
            case c:
               this.n = fig.m;
               this.o = fig.K;
               break;
            case e:
               if (this.i.f < 150L) {
                  this.n = fig.r;
               } else if (this.i.f < 300L) {
                  this.n = fig.q;
               } else if (this.i.f < 600L) {
                  this.n = fig.p;
               } else if (this.i.f < 1000L) {
                  this.n = fig.o;
               } else {
                  this.n = fig.n;
               }

               this.o = vq.a("multiplayer.status.ping", this.i.f);
               this.m = this.i.i;
         }
      }

      public void b() {
         this.g.I().b();
      }

      protected void a(eyu $$0, int $$1, int $$2, aiy $$3) {
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
               this.j.a(erb.a($$0));
            } catch (Throwable var3) {
               fig.E.error("Invalid icon for server {} ({})", new Object[]{this.i.a, this.i.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (ffe.v()) {
            fig $$3 = this.g.l;
            int $$4 = $$3.l().indexOf(this);
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
         this.g.l.a(this.g.I());
         fig.a $$2 = this.g.l.l().get($$1);
         this.g.l.a($$2);
         fig.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)fig.this.q();
         double $$4 = $$1 - (double)fig.this.g(fig.this.l().indexOf(this));
         if ($$3 <= 32.0) {
            if ($$3 < 32.0 && $$3 > 16.0 && this.e()) {
               this.g.a(this);
               this.g.o();
               return true;
            }

            int $$5 = this.g.l.l().indexOf(this);
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
         if (ac.b() - this.l < 250L) {
            this.g.o();
         }

         this.l = ac.b();
         return true;
      }

      public fqi c() {
         return this.i;
      }

      @Override
      public vq a() {
         we $$0 = vq.i();
         $$0.b(vq.a("narrator.select", this.i.a));
         $$0.b(vp.t);
         switch (this.i.g()) {
            case b:
               $$0.b(fig.L);
               break;
            case d:
               $$0.b(fig.J);
               $$0.b(vp.t);
               $$0.b(vq.a("multiplayer.status.version.narration", this.i.h));
               $$0.b(vp.t);
               $$0.b(vq.a("multiplayer.status.motd.narration", this.i.d));
               break;
            case c:
               $$0.b(fig.K);
               break;
            default:
               $$0.b(fig.M);
               $$0.b(vp.t);
               $$0.b(vq.a("multiplayer.status.ping.narration", this.i.f));
               $$0.b(vp.t);
               $$0.b(vq.a("multiplayer.status.motd.narration", this.i.d));
               if (this.i.e != null) {
                  $$0.b(vp.t);
                  $$0.b(vq.a("multiplayer.status.player_count.narration", this.i.e.b(), this.i.e.a()));
                  $$0.b(vp.t);
                  $$0.b(vt.a(this.i.i, vq.b(", ")));
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
