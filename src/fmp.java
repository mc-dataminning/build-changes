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

public class fmp extends fel<fmp.a> {
   static final ajt a = new ajt("server_list/incompatible");
   static final ajt m = new ajt("server_list/unreachable");
   static final ajt n = new ajt("server_list/ping_1");
   static final ajt o = new ajt("server_list/ping_2");
   static final ajt p = new ajt("server_list/ping_3");
   static final ajt q = new ajt("server_list/ping_4");
   static final ajt r = new ajt("server_list/ping_5");
   static final ajt s = new ajt("server_list/pinging_1");
   static final ajt u = new ajt("server_list/pinging_2");
   static final ajt v = new ajt("server_list/pinging_3");
   static final ajt w = new ajt("server_list/pinging_4");
   static final ajt x = new ajt("server_list/pinging_5");
   static final ajt y = new ajt("server_list/join_highlighted");
   static final ajt z = new ajt("server_list/join");
   static final ajt A = new ajt("server_list/move_up_highlighted");
   static final ajt B = new ajt("server_list/move_up");
   static final ajt C = new ajt("server_list/move_down_highlighted");
   static final ajt D = new ajt("server_list/move_down");
   static final Logger E = LogUtils.getLogger();
   static final ThreadPoolExecutor F = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new r(E)).build()
   );
   static final wg G = wg.c("lanServer.scanning");
   static final wg H = wg.c("multiplayer.status.cannot_resolve").b(-65536);
   static final wg I = wg.c("multiplayer.status.cannot_connect").b(-65536);
   static final wg J = wg.c("multiplayer.status.incompatible");
   static final wg K = wg.c("multiplayer.status.no_connection");
   static final wg L = wg.c("multiplayer.status.pinging");
   static final wg M = wg.c("multiplayer.status.online");
   private final fml N;
   private final List<fmp.d> O = Lists.newArrayList();
   private final fmp.a P = new fmp.b();
   private final List<fmp.c> Q = Lists.newArrayList();

   public fmp(fml $$0, fbp $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.N = $$0;
   }

   private void I() {
      this.k();
      this.O.forEach($$1 -> this.b($$1));
      this.b(this.P);
      this.Q.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable fmp.a $$0) {
      super.a($$0);
      this.N.C();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      fmp.a $$3 = this.h();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(fuw $$0) {
      this.O.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.O.add(new fmp.d(this.N, $$0.a($$1)));
      }

      this.I();
   }

   public void a(List<gpo> $$0) {
      int $$1 = $$0.size() - this.Q.size();
      this.Q.clear();

      for (gpo $$2 : $$0) {
         this.Q.add(new fmp.c(this.N, $$2));
      }

      this.I();

      for (int $$3 = this.Q.size() - $$1; $$3 < this.Q.size(); $$3++) {
         fmp.c $$4 = this.Q.get($$3);
         int $$5 = $$3 - this.Q.size() + this.aF_().size();
         int $$6 = this.g($$5);
         int $$7 = this.h($$5);
         if ($$7 >= this.D() && $$6 <= this.F()) {
            this.c.aY().b(wg.a("multiplayer.lan.server_found", $$4.c()));
         }
      }
   }

   @Override
   public int b() {
      return 305;
   }

   public void d() {
   }

   public abstract static class a extends fel.a<fmp.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fmp.a {
      private final fbp a = fbp.Q();

      @Override
      public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(this.a.h, fmp.G, this.a.y.k / 2 - this.a.h.a(fmp.G) / 2, $$10, 16777215, false);
         String $$11 = fiz.a(ac.b());
         $$0.a(this.a.h, $$11, this.a.y.k / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712, false);
      }

      @Override
      public wg a() {
         return fmp.G;
      }
   }

   public static class c extends fmp.a {
      private static final int c = 32;
      private static final wg d = wg.c("lanServer.title");
      private static final wg e = wg.c("selectServer.hiddenAddress");
      private final fml f;
      protected final fbp a;
      protected final gpo b;
      private long g;

      protected c(fml $$0, gpo $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = fbp.Q();
      }

      @Override
      public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
            this.f.m();
         }

         this.g = ac.b();
         return super.a($$0, $$1, $$2);
      }

      public gpo b() {
         return this.b;
      }

      @Override
      public wg a() {
         return wg.a("narrator.select", this.c());
      }

      public wg c() {
         return wg.i().b(d).b(wf.v).f(this.b.a());
      }
   }

   public class d extends fmp.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 5;
      private static final int e = 10;
      private static final int f = 8;
      private final fml g;
      private final fbp h;
      private final fuv i;
      private final fis j;
      @Nullable
      private byte[] k;
      private long l;
      @Nullable
      private List<wg> m;
      @Nullable
      private ajt n;
      @Nullable
      private wg o;

      protected d(fml $$1, fuv $$2) {
         this.g = $$1;
         this.i = $$2;
         this.h = fbp.Q();
         this.j = fis.b(this.h.aa(), $$2.b);
         this.d();
      }

      @Override
      public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.g() == fuv.b.a) {
            this.i.a(fuv.b.b);
            this.i.d = wf.a;
            this.i.c = wf.a;
            fmp.F.submit(() -> {
               try {
                  this.g.D().a(this.i, () -> this.h.execute(this::b), () -> {
                     this.i.a(this.i.g == aa.b().e() ? fuv.b.e : fuv.b.d);
                     this.h.execute(this::d);
                  });
               } catch (UnknownHostException var2x) {
                  this.i.a(fuv.b.c);
                  this.i.d = fmp.H;
                  this.h.execute(this::d);
               } catch (Exception var3x) {
                  this.i.a(fuv.b.c);
                  this.i.d = fmp.I;
                  this.h.execute(this::d);
               }
            });
         }

         $$0.a(this.h.h, this.i.a, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         List<aww> $$10 = this.h.h.c(this.i.d, $$4 - 32 - 2);

         for (int $$11 = 0; $$11 < Math.min($$10.size(), 2); $$11++) {
            $$0.a(this.h.h, $$10.get($$11), $$3 + 32 + 3, $$2 + 12 + 9 * $$11, -8355712, false);
         }

         this.a($$0, $$3, $$2, this.j.b());
         if (this.i.g() == fuv.b.b) {
            int $$12 = (int)(ac.b() / 100L + (long)($$1 * 2) & 7L);
            if ($$12 > 4) {
               $$12 = 8 - $$12;
            }
            this.n = switch ($$12) {
               case 1 -> fmp.u;
               case 2 -> fmp.v;
               case 3 -> fmp.w;
               case 4 -> fmp.x;
               default -> fmp.s;
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

         wg $$15 = (wg)(this.i.g() == fuv.b.d ? this.i.h.f().a(n.m) : this.i.c);
         int $$16 = this.h.h.a($$15);
         int $$17 = $$13 - $$16 - 5;
         $$0.a(this.h.h, $$15, $$17, $$2 + 1, -8355712, false);
         if (this.o != null && $$6 >= $$13 && $$6 <= $$13 + 10 && $$7 >= $$2 && $$7 <= $$2 + 8) {
            this.g.d(this.o);
         } else if (this.m != null && $$6 >= $$17 && $$6 <= $$17 + $$16 && $$7 >= $$2 && $$7 <= $$2 - 1 + 9) {
            this.g.b(Lists.transform(this.m, wg::g));
         }

         if (this.h.m.Z().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$18 = $$6 - $$3;
            int $$19 = $$7 - $$2;
            if (this.e()) {
               if ($$18 < 32 && $$18 > 16) {
                  $$0.a(fmp.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fmp.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$18 < 16 && $$19 < 16) {
                  $$0.a(fmp.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fmp.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.g.E().c() - 1) {
               if ($$18 < 16 && $$19 > 16) {
                  $$0.a(fmp.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fmp.D, $$3, $$2, 32, 32);
               }
            }
         }
      }

      private void d() {
         this.m = null;
         switch (this.i.g()) {
            case a:
            case b:
               this.n = fmp.n;
               this.o = fmp.L;
               break;
            case d:
               this.n = fmp.a;
               this.o = fmp.J;
               this.m = this.i.i;
               break;
            case c:
               this.n = fmp.m;
               this.o = fmp.K;
               break;
            case e:
               if (this.i.f < 150L) {
                  this.n = fmp.r;
               } else if (this.i.f < 300L) {
                  this.n = fmp.q;
               } else if (this.i.f < 600L) {
                  this.n = fmp.p;
               } else if (this.i.f < 1000L) {
                  this.n = fmp.o;
               } else {
                  this.n = fmp.n;
               }

               this.o = wg.a("multiplayer.status.ping", this.i.f);
               this.m = this.i.i;
         }
      }

      public void b() {
         this.g.E().b();
      }

      protected void a(fdc $$0, int $$1, int $$2, ajt $$3) {
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
               this.j.a(evj.a($$0));
            } catch (Throwable var3) {
               fmp.E.error("Invalid icon for server {} ({})", new Object[]{this.i.a, this.i.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fjo.s()) {
            fmp $$3 = this.g.o;
            int $$4 = $$3.aF_().indexOf(this);
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
         this.g.o.a(this.g.E());
         fmp.a $$2 = this.g.o.aF_().get($$1);
         this.g.o.a($$2);
         fmp.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)fmp.this.r();
         double $$4 = $$1 - (double)fmp.this.g(fmp.this.aF_().indexOf(this));
         if ($$3 <= 32.0) {
            if ($$3 < 32.0 && $$3 > 16.0 && this.e()) {
               this.g.a(this);
               this.g.m();
               return true;
            }

            int $$5 = this.g.o.aF_().indexOf(this);
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
         if (ac.b() - this.l < 250L) {
            this.g.m();
         }

         this.l = ac.b();
         return super.a($$0, $$1, $$2);
      }

      public fuv c() {
         return this.i;
      }

      @Override
      public wg a() {
         wu $$0 = wg.i();
         $$0.b(wg.a("narrator.select", this.i.a));
         $$0.b(wf.t);
         switch (this.i.g()) {
            case b:
               $$0.b(fmp.L);
               break;
            case d:
               $$0.b(fmp.J);
               $$0.b(wf.t);
               $$0.b(wg.a("multiplayer.status.version.narration", this.i.h));
               $$0.b(wf.t);
               $$0.b(wg.a("multiplayer.status.motd.narration", this.i.d));
               break;
            case c:
               $$0.b(fmp.K);
               break;
            default:
               $$0.b(fmp.M);
               $$0.b(wf.t);
               $$0.b(wg.a("multiplayer.status.ping.narration", this.i.f));
               $$0.b(wf.t);
               $$0.b(wg.a("multiplayer.status.motd.narration", this.i.d));
               if (this.i.e != null) {
                  $$0.b(wf.t);
                  $$0.b(wg.a("multiplayer.status.player_count.narration", this.i.e.b(), this.i.e.a()));
                  $$0.b(wf.t);
                  $$0.b(wj.a(this.i.i, wg.b(", ")));
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
