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

public class fqd extends fiq<fqd.a> {
   static final akk a = new akk("server_list/incompatible");
   static final akk m = new akk("server_list/unreachable");
   static final akk n = new akk("server_list/ping_1");
   static final akk o = new akk("server_list/ping_2");
   static final akk p = new akk("server_list/ping_3");
   static final akk q = new akk("server_list/ping_4");
   static final akk r = new akk("server_list/ping_5");
   static final akk s = new akk("server_list/pinging_1");
   static final akk u = new akk("server_list/pinging_2");
   static final akk v = new akk("server_list/pinging_3");
   static final akk w = new akk("server_list/pinging_4");
   static final akk x = new akk("server_list/pinging_5");
   static final akk y = new akk("server_list/join_highlighted");
   static final akk z = new akk("server_list/join");
   static final akk A = new akk("server_list/move_up_highlighted");
   static final akk B = new akk("server_list/move_up");
   static final akk C = new akk("server_list/move_down_highlighted");
   static final akk D = new akk("server_list/move_down");
   static final Logger E = LogUtils.getLogger();
   static final ThreadPoolExecutor F = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new r(E)).build()
   );
   static final wu G = wu.c("lanServer.scanning");
   static final wu H = wu.c("multiplayer.status.cannot_resolve").b(-65536);
   static final wu I = wu.c("multiplayer.status.cannot_connect").b(-65536);
   static final wu J = wu.c("multiplayer.status.incompatible");
   static final wu K = wu.c("multiplayer.status.no_connection");
   static final wu L = wu.c("multiplayer.status.pinging");
   static final wu M = wu.c("multiplayer.status.online");
   private final fqa N;
   private final List<fqd.d> O = Lists.newArrayList();
   private final fqd.a P = new fqd.b();
   private final List<fqd.c> Q = Lists.newArrayList();

   public fqd(fqa $$0, ffw $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.N = $$0;
   }

   private void J() {
      this.k();
      this.O.forEach($$1 -> this.b($$1));
      this.b(this.P);
      this.Q.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable fqd.a $$0) {
      super.a($$0);
      this.N.D();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      fqd.a $$3 = this.h();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(fza $$0) {
      this.O.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.O.add(new fqd.d(this.N, $$0.a($$1)));
      }

      this.J();
   }

   public void a(List<gtt> $$0) {
      int $$1 = $$0.size() - this.Q.size();
      this.Q.clear();

      for (gtt $$2 : $$0) {
         this.Q.add(new fqd.c(this.N, $$2));
      }

      this.J();

      for (int $$3 = this.Q.size() - $$1; $$3 < this.Q.size(); $$3++) {
         fqd.c $$4 = this.Q.get($$3);
         int $$5 = $$3 - this.Q.size() + this.aG_().size();
         int $$6 = this.g($$5);
         int $$7 = this.h($$5);
         if ($$7 >= this.E() && $$6 <= this.G()) {
            this.c.aV().b(wu.a("multiplayer.lan.server_found", $$4.c()));
         }
      }
   }

   @Override
   public int b() {
      return 305;
   }

   public void c() {
   }

   public abstract static class a extends fiq.a<fqd.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fqd.a {
      private final ffw a = ffw.Q();

      @Override
      public void a(fhh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(this.a.h, fqd.G, this.a.y.m / 2 - this.a.h.a(fqd.G) / 2, $$10, 16777215, false);
         String $$11 = fna.a(ac.c());
         $$0.a(this.a.h, $$11, this.a.y.m / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712, false);
      }

      @Override
      public wu a() {
         return fqd.G;
      }
   }

   public static class c extends fqd.a {
      private static final int c = 32;
      private static final wu d = wu.c("lanServer.title");
      private static final wu e = wu.c("selectServer.hiddenAddress");
      private final fqa f;
      protected final ffw a;
      protected final gtt b;
      private long g;

      protected c(fqa $$0, gtt $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = ffw.Q();
      }

      @Override
      public void a(fhh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
         if (ac.c() - this.g < 250L) {
            this.f.m();
         }

         this.g = ac.c();
         return super.a($$0, $$1, $$2);
      }

      public gtt b() {
         return this.b;
      }

      @Override
      public wu a() {
         return wu.a("narrator.select", this.c());
      }

      public wu c() {
         return wu.i().b(d).b(wt.v).f(this.b.a());
      }
   }

   public class d extends fqd.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 5;
      private static final int e = 10;
      private static final int f = 8;
      private final fqa g;
      private final ffw h;
      private final fyz i;
      private final fmv j;
      @Nullable
      private byte[] k;
      private long l;
      @Nullable
      private List<wu> m;
      @Nullable
      private akk n;
      @Nullable
      private wu o;

      protected d(final fqa $$1, final fyz $$2) {
         this.g = $$1;
         this.i = $$2;
         this.h = ffw.Q();
         this.j = fmv.b(this.h.aa(), $$2.b);
         this.d();
      }

      @Override
      public void a(fhh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.g() == fyz.b.a) {
            this.i.a(fyz.b.b);
            this.i.d = wt.a;
            this.i.c = wt.a;
            fqd.F.submit(() -> {
               try {
                  this.g.E().a(this.i, () -> this.h.execute(this::b), () -> {
                     this.i.a(this.i.g == aa.b().e() ? fyz.b.e : fyz.b.d);
                     this.h.execute(this::d);
                  });
               } catch (UnknownHostException var2x) {
                  this.i.a(fyz.b.c);
                  this.i.d = fqd.H;
                  this.h.execute(this::d);
               } catch (Exception var3x) {
                  this.i.a(fyz.b.c);
                  this.i.d = fqd.I;
                  this.h.execute(this::d);
               }
            });
         }

         $$0.a(this.h.h, this.i.a, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         List<axs> $$10 = this.h.h.c(this.i.d, $$4 - 32 - 2);

         for (int $$11 = 0; $$11 < Math.min($$10.size(), 2); $$11++) {
            $$0.a(this.h.h, $$10.get($$11), $$3 + 32 + 3, $$2 + 12 + 9 * $$11, -8355712, false);
         }

         this.a($$0, $$3, $$2, this.j.b());
         if (this.i.g() == fyz.b.b) {
            int $$12 = (int)(ac.c() / 100L + (long)($$1 * 2) & 7L);
            if ($$12 > 4) {
               $$12 = 8 - $$12;
            }
            this.n = switch ($$12) {
               case 1 -> fqd.u;
               case 2 -> fqd.v;
               case 3 -> fqd.w;
               case 4 -> fqd.x;
               default -> fqd.s;
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

         wu $$15 = (wu)(this.i.g() == fyz.b.d ? this.i.h.f().a(n.m) : this.i.c);
         int $$16 = this.h.h.a($$15);
         int $$17 = $$13 - $$16 - 5;
         $$0.a(this.h.h, $$15, $$17, $$2 + 1, -8355712, false);
         if (this.o != null && $$6 >= $$13 && $$6 <= $$13 + 10 && $$7 >= $$2 && $$7 <= $$2 + 8) {
            this.g.d(this.o);
         } else if (this.m != null && $$6 >= $$17 && $$6 <= $$17 + $$16 && $$7 >= $$2 && $$7 <= $$2 - 1 + 9) {
            this.g.b(Lists.transform(this.m, wu::g));
         }

         if (this.h.m.Z().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$18 = $$6 - $$3;
            int $$19 = $$7 - $$2;
            if (this.e()) {
               if ($$18 < 32 && $$18 > 16) {
                  $$0.a(fqd.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fqd.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$18 < 16 && $$19 < 16) {
                  $$0.a(fqd.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fqd.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.g.F().c() - 1) {
               if ($$18 < 16 && $$19 > 16) {
                  $$0.a(fqd.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fqd.D, $$3, $$2, 32, 32);
               }
            }
         }
      }

      private void d() {
         this.m = null;
         switch (this.i.g()) {
            case a:
            case b:
               this.n = fqd.n;
               this.o = fqd.L;
               break;
            case d:
               this.n = fqd.a;
               this.o = fqd.J;
               this.m = this.i.i;
               break;
            case c:
               this.n = fqd.m;
               this.o = fqd.K;
               break;
            case e:
               if (this.i.f < 150L) {
                  this.n = fqd.r;
               } else if (this.i.f < 300L) {
                  this.n = fqd.q;
               } else if (this.i.f < 600L) {
                  this.n = fqd.p;
               } else if (this.i.f < 1000L) {
                  this.n = fqd.o;
               } else {
                  this.n = fqd.n;
               }

               this.o = wu.a("multiplayer.status.ping", this.i.f);
               this.m = this.i.i;
         }
      }

      public void b() {
         this.g.F().b();
      }

      protected void a(fhh $$0, int $$1, int $$2, akk $$3) {
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
               this.j.a(ezp.a($$0));
            } catch (Throwable var3) {
               fqd.E.error("Invalid icon for server {} ({})", new Object[]{this.i.a, this.i.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fnl.s()) {
            fqd $$3 = this.g.r;
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
         fqd.a $$2 = this.g.r.aG_().get($$1);
         this.g.r.a($$2);
         fqd.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)fqd.this.s();
         double $$4 = $$1 - (double)fqd.this.g(fqd.this.aG_().indexOf(this));
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
         if (ac.c() - this.l < 250L) {
            this.g.m();
         }

         this.l = ac.c();
         return super.a($$0, $$1, $$2);
      }

      public fyz c() {
         return this.i;
      }

      @Override
      public wu a() {
         xi $$0 = wu.i();
         $$0.b(wu.a("narrator.select", this.i.a));
         $$0.b(wt.t);
         switch (this.i.g()) {
            case b:
               $$0.b(fqd.L);
               break;
            case d:
               $$0.b(fqd.J);
               $$0.b(wt.t);
               $$0.b(wu.a("multiplayer.status.version.narration", this.i.h));
               $$0.b(wt.t);
               $$0.b(wu.a("multiplayer.status.motd.narration", this.i.d));
               break;
            case c:
               $$0.b(fqd.K);
               break;
            default:
               $$0.b(fqd.M);
               $$0.b(wt.t);
               $$0.b(wu.a("multiplayer.status.ping.narration", this.i.f));
               $$0.b(wt.t);
               $$0.b(wu.a("multiplayer.status.motd.narration", this.i.d));
               if (this.i.e != null) {
                  $$0.b(wt.t);
                  $$0.b(wu.a("multiplayer.status.player_count.narration", this.i.e.b(), this.i.e.a()));
                  $$0.b(wt.t);
                  $$0.b(wx.a(this.i.i, wu.b(", ")));
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
