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

public class fkj extends fce<fkj.a> {
   static final ajh a = new ajh("server_list/incompatible");
   static final ajh m = new ajh("server_list/unreachable");
   static final ajh n = new ajh("server_list/ping_1");
   static final ajh o = new ajh("server_list/ping_2");
   static final ajh p = new ajh("server_list/ping_3");
   static final ajh q = new ajh("server_list/ping_4");
   static final ajh r = new ajh("server_list/ping_5");
   static final ajh t = new ajh("server_list/pinging_1");
   static final ajh u = new ajh("server_list/pinging_2");
   static final ajh v = new ajh("server_list/pinging_3");
   static final ajh w = new ajh("server_list/pinging_4");
   static final ajh x = new ajh("server_list/pinging_5");
   static final ajh y = new ajh("server_list/join_highlighted");
   static final ajh z = new ajh("server_list/join");
   static final ajh A = new ajh("server_list/move_up_highlighted");
   static final ajh B = new ajh("server_list/move_up");
   static final ajh C = new ajh("server_list/move_down_highlighted");
   static final ajh D = new ajh("server_list/move_down");
   static final Logger E = LogUtils.getLogger();
   static final ThreadPoolExecutor F = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new r(E)).build()
   );
   static final vu G = vu.c("lanServer.scanning");
   static final vu H = vu.c("multiplayer.status.cannot_resolve").b(-65536);
   static final vu I = vu.c("multiplayer.status.cannot_connect").b(-65536);
   static final vu J = vu.c("multiplayer.status.incompatible");
   static final vu K = vu.c("multiplayer.status.no_connection");
   static final vu L = vu.c("multiplayer.status.pinging");
   static final vu M = vu.c("multiplayer.status.online");
   private final fkf N;
   private final List<fkj.d> O = Lists.newArrayList();
   private final fkj.a P = new fkj.b();
   private final List<fkj.c> Q = Lists.newArrayList();

   public fkj(fkf $$0, ezi $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.N = $$0;
   }

   private void e() {
      this.m();
      this.O.forEach($$1 -> this.b($$1));
      this.b(this.P);
      this.Q.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable fkj.a $$0) {
      super.a($$0);
      this.N.E();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      fkj.a $$3 = this.i();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(fsp $$0) {
      this.O.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.O.add(new fkj.d(this.N, $$0.a($$1)));
      }

      this.e();
   }

   public void a(List<gnh> $$0) {
      int $$1 = $$0.size() - this.Q.size();
      this.Q.clear();

      for (gnh $$2 : $$0) {
         this.Q.add(new fkj.c(this.N, $$2));
      }

      this.e();

      for (int $$3 = this.Q.size() - $$1; $$3 < this.Q.size(); $$3++) {
         fkj.c $$4 = this.Q.get($$3);
         int $$5 = $$3 - this.Q.size() + this.l().size();
         int $$6 = this.g($$5);
         int $$7 = this.h($$5);
         if ($$7 >= this.C() && $$6 <= this.E()) {
            this.c.aY().b(vu.a("multiplayer.lan.server_found", $$4.c()));
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

   public abstract static class a extends fce.a<fkj.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fkj.a {
      private final ezi a = ezi.Q();

      @Override
      public void a(fav $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(this.a.h, fkj.G, this.a.y.g / 2 - this.a.h.a(fkj.G) / 2, $$10, 16777215, false);
         String $$11 = fgs.a(ac.b());
         $$0.a(this.a.h, $$11, this.a.y.g / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712, false);
      }

      @Override
      public vu a() {
         return fkj.G;
      }
   }

   public static class c extends fkj.a {
      private static final int c = 32;
      private static final vu d = vu.c("lanServer.title");
      private static final vu e = vu.c("selectServer.hiddenAddress");
      private final fkf f;
      protected final ezi a;
      protected final gnh b;
      private long g;

      protected c(fkf $$0, gnh $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = ezi.Q();
      }

      @Override
      public void a(fav $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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

      public gnh b() {
         return this.b;
      }

      @Override
      public vu a() {
         return vu.a("narrator.select", this.c());
      }

      public vu c() {
         return vu.i().b(d).b(vt.v).f(this.b.a());
      }
   }

   public class d extends fkj.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 5;
      private static final int e = 10;
      private static final int f = 8;
      private final fkf g;
      private final ezi h;
      private final fso i;
      private final fgl j;
      @Nullable
      private byte[] k;
      private long l;
      @Nullable
      private List<vu> m;
      @Nullable
      private ajh n;
      @Nullable
      private vu o;

      protected d(fkf $$1, fso $$2) {
         this.g = $$1;
         this.i = $$2;
         this.h = ezi.Q();
         this.j = fgl.b(this.h.aa(), $$2.b);
         this.d();
      }

      @Override
      public void a(fav $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.g() == fso.b.a) {
            this.i.a(fso.b.b);
            this.i.d = vt.a;
            this.i.c = vt.a;
            fkj.F.submit(() -> {
               try {
                  this.g.H().a(this.i, () -> this.h.execute(this::b), () -> {
                     this.i.a(this.i.g == aa.b().e() ? fso.b.e : fso.b.d);
                     this.h.execute(this::d);
                  });
               } catch (UnknownHostException var2x) {
                  this.i.a(fso.b.c);
                  this.i.d = fkj.H;
                  this.h.execute(this::d);
               } catch (Exception var3x) {
                  this.i.a(fso.b.c);
                  this.i.d = fkj.I;
                  this.h.execute(this::d);
               }
            });
         }

         $$0.a(this.h.h, this.i.a, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         List<awi> $$10 = this.h.h.c(this.i.d, $$4 - 32 - 2);

         for (int $$11 = 0; $$11 < Math.min($$10.size(), 2); $$11++) {
            $$0.a(this.h.h, $$10.get($$11), $$3 + 32 + 3, $$2 + 12 + 9 * $$11, -8355712, false);
         }

         this.a($$0, $$3, $$2, this.j.b());
         if (this.i.g() == fso.b.b) {
            int $$12 = (int)(ac.b() / 100L + (long)($$1 * 2) & 7L);
            if ($$12 > 4) {
               $$12 = 8 - $$12;
            }
            this.n = switch ($$12) {
               case 1 -> fkj.u;
               case 2 -> fkj.v;
               case 3 -> fkj.w;
               case 4 -> fkj.x;
               default -> fkj.t;
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

         vu $$15 = (vu)(this.i.g() == fso.b.d ? this.i.h.f().a(n.m) : this.i.c);
         int $$16 = this.h.h.a($$15);
         int $$17 = $$13 - $$16 - 5;
         $$0.a(this.h.h, $$15, $$17, $$2 + 1, -8355712, false);
         if (this.o != null && $$6 >= $$13 && $$6 <= $$13 + 10 && $$7 >= $$2 && $$7 <= $$2 + 8) {
            this.g.d(this.o);
         } else if (this.m != null && $$6 >= $$17 && $$6 <= $$17 + $$16 && $$7 >= $$2 && $$7 <= $$2 - 1 + 9) {
            this.g.b(Lists.transform(this.m, vu::g));
         }

         if (this.h.m.X().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$18 = $$6 - $$3;
            int $$19 = $$7 - $$2;
            if (this.e()) {
               if ($$18 < 32 && $$18 > 16) {
                  $$0.a(fkj.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fkj.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$18 < 16 && $$19 < 16) {
                  $$0.a(fkj.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fkj.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.g.I().c() - 1) {
               if ($$18 < 16 && $$19 > 16) {
                  $$0.a(fkj.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fkj.D, $$3, $$2, 32, 32);
               }
            }
         }
      }

      private void d() {
         this.m = null;
         switch (this.i.g()) {
            case a:
            case b:
               this.n = fkj.n;
               this.o = fkj.L;
               break;
            case d:
               this.n = fkj.a;
               this.o = fkj.J;
               this.m = this.i.i;
               break;
            case c:
               this.n = fkj.m;
               this.o = fkj.K;
               break;
            case e:
               if (this.i.f < 150L) {
                  this.n = fkj.r;
               } else if (this.i.f < 300L) {
                  this.n = fkj.q;
               } else if (this.i.f < 600L) {
                  this.n = fkj.p;
               } else if (this.i.f < 1000L) {
                  this.n = fkj.o;
               } else {
                  this.n = fkj.n;
               }

               this.o = vu.a("multiplayer.status.ping", this.i.f);
               this.m = this.i.i;
         }
      }

      public void b() {
         this.g.I().b();
      }

      protected void a(fav $$0, int $$1, int $$2, ajh $$3) {
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
               this.j.a(etc.a($$0));
            } catch (Throwable var3) {
               fkj.E.error("Invalid icon for server {} ({})", new Object[]{this.i.a, this.i.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fhh.v()) {
            fkj $$3 = this.g.l;
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
         fkj.a $$2 = this.g.l.l().get($$1);
         this.g.l.a($$2);
         fkj.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)fkj.this.q();
         double $$4 = $$1 - (double)fkj.this.g(fkj.this.l().indexOf(this));
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

      public fso c() {
         return this.i;
      }

      @Override
      public vu a() {
         wi $$0 = vu.i();
         $$0.b(vu.a("narrator.select", this.i.a));
         $$0.b(vt.t);
         switch (this.i.g()) {
            case b:
               $$0.b(fkj.L);
               break;
            case d:
               $$0.b(fkj.J);
               $$0.b(vt.t);
               $$0.b(vu.a("multiplayer.status.version.narration", this.i.h));
               $$0.b(vt.t);
               $$0.b(vu.a("multiplayer.status.motd.narration", this.i.d));
               break;
            case c:
               $$0.b(fkj.K);
               break;
            default:
               $$0.b(fkj.M);
               $$0.b(vt.t);
               $$0.b(vu.a("multiplayer.status.ping.narration", this.i.f));
               $$0.b(vt.t);
               $$0.b(vu.a("multiplayer.status.motd.narration", this.i.d));
               if (this.i.e != null) {
                  $$0.b(vt.t);
                  $$0.b(vu.a("multiplayer.status.player_count.narration", this.i.e.b(), this.i.e.a()));
                  $$0.b(vt.t);
                  $$0.b(vx.a(this.i.i, vu.b(", ")));
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
