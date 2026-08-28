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

public class fqb extends fio<fqb.a> {
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
   private final fpy N;
   private final List<fqb.d> O = Lists.newArrayList();
   private final fqb.a P = new fqb.b();
   private final List<fqb.c> Q = Lists.newArrayList();

   public fqb(fpy $$0, fft $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.N = $$0;
   }

   private void J() {
      this.k();
      this.O.forEach($$1 -> this.b($$1));
      this.b(this.P);
      this.Q.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable fqb.a $$0) {
      super.a($$0);
      this.N.E();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      fqb.a $$3 = this.h();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(fyy $$0) {
      this.O.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.O.add(new fqb.d(this.N, $$0.a($$1)));
      }

      this.J();
   }

   public void a(List<gtr> $$0) {
      int $$1 = $$0.size() - this.Q.size();
      this.Q.clear();

      for (gtr $$2 : $$0) {
         this.Q.add(new fqb.c(this.N, $$2));
      }

      this.J();

      for (int $$3 = this.Q.size() - $$1; $$3 < this.Q.size(); $$3++) {
         fqb.c $$4 = this.Q.get($$3);
         int $$5 = $$3 - this.Q.size() + this.aG_().size();
         int $$6 = this.g($$5);
         int $$7 = this.h($$5);
         if ($$7 >= this.E() && $$6 <= this.G()) {
            this.c.aX().b(wu.a("multiplayer.lan.server_found", $$4.c()));
         }
      }
   }

   @Override
   public int b() {
      return 305;
   }

   public void c() {
   }

   public abstract static class a extends fio.a<fqb.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fqb.a {
      private final fft a = fft.Q();

      @Override
      public void a(fhf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(this.a.h, fqb.G, this.a.y.m / 2 - this.a.h.a(fqb.G) / 2, $$10, 16777215, false);
         String $$11 = fmy.a(ac.c());
         $$0.a(this.a.h, $$11, this.a.y.m / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712, false);
      }

      @Override
      public wu a() {
         return fqb.G;
      }
   }

   public static class c extends fqb.a {
      private static final int c = 32;
      private static final wu d = wu.c("lanServer.title");
      private static final wu e = wu.c("selectServer.hiddenAddress");
      private final fpy f;
      protected final fft a;
      protected final gtr b;
      private long g;

      protected c(fpy $$0, gtr $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = fft.Q();
      }

      @Override
      public void a(fhf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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

      public gtr b() {
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

   public class d extends fqb.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 5;
      private static final int e = 10;
      private static final int f = 8;
      private final fpy g;
      private final fft h;
      private final fyx i;
      private final fmt j;
      @Nullable
      private byte[] k;
      private long l;
      @Nullable
      private List<wu> m;
      @Nullable
      private akk n;
      @Nullable
      private wu o;

      protected d(final fpy $$1, final fyx $$2) {
         this.g = $$1;
         this.i = $$2;
         this.h = fft.Q();
         this.j = fmt.b(this.h.aa(), $$2.b);
         this.d();
      }

      @Override
      public void a(fhf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.g() == fyx.b.a) {
            this.i.a(fyx.b.b);
            this.i.d = wt.a;
            this.i.c = wt.a;
            fqb.F.submit(() -> {
               try {
                  this.g.F().a(this.i, () -> this.h.execute(this::b), () -> {
                     this.i.a(this.i.g == aa.b().e() ? fyx.b.e : fyx.b.d);
                     this.h.execute(this::d);
                  });
               } catch (UnknownHostException var2x) {
                  this.i.a(fyx.b.c);
                  this.i.d = fqb.H;
                  this.h.execute(this::d);
               } catch (Exception var3x) {
                  this.i.a(fyx.b.c);
                  this.i.d = fqb.I;
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
         if (this.i.g() == fyx.b.b) {
            int $$12 = (int)(ac.c() / 100L + (long)($$1 * 2) & 7L);
            if ($$12 > 4) {
               $$12 = 8 - $$12;
            }
            this.n = switch ($$12) {
               case 1 -> fqb.u;
               case 2 -> fqb.v;
               case 3 -> fqb.w;
               case 4 -> fqb.x;
               default -> fqb.s;
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

         wu $$15 = (wu)(this.i.g() == fyx.b.d ? this.i.h.f().a(n.m) : this.i.c);
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
                  $$0.a(fqb.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fqb.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$18 < 16 && $$19 < 16) {
                  $$0.a(fqb.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fqb.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.g.G().c() - 1) {
               if ($$18 < 16 && $$19 > 16) {
                  $$0.a(fqb.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fqb.D, $$3, $$2, 32, 32);
               }
            }
         }
      }

      private void d() {
         this.m = null;
         switch (this.i.g()) {
            case a:
            case b:
               this.n = fqb.n;
               this.o = fqb.L;
               break;
            case d:
               this.n = fqb.a;
               this.o = fqb.J;
               this.m = this.i.i;
               break;
            case c:
               this.n = fqb.m;
               this.o = fqb.K;
               break;
            case e:
               if (this.i.f < 150L) {
                  this.n = fqb.r;
               } else if (this.i.f < 300L) {
                  this.n = fqb.q;
               } else if (this.i.f < 600L) {
                  this.n = fqb.p;
               } else if (this.i.f < 1000L) {
                  this.n = fqb.o;
               } else {
                  this.n = fqb.n;
               }

               this.o = wu.a("multiplayer.status.ping", this.i.f);
               this.m = this.i.i;
         }
      }

      public void b() {
         this.g.G().b();
      }

      protected void a(fhf $$0, int $$1, int $$2, akk $$3) {
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
               this.j.a(ezn.a($$0));
            } catch (Throwable var3) {
               fqb.E.error("Invalid icon for server {} ({})", new Object[]{this.i.a, this.i.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fnj.t()) {
            fqb $$3 = this.g.r;
            int $$4 = $$3.aG_().indexOf(this);
            if ($$4 == -1) {
               return true;
            }

            if ($$0 == 264 && $$4 < this.g.G().c() - 1 || $$0 == 265 && $$4 > 0) {
               this.a($$4, $$0 == 264 ? $$4 + 1 : $$4 - 1);
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      private void a(int $$0, int $$1) {
         this.g.G().a($$0, $$1);
         this.g.r.a(this.g.G());
         fqb.a $$2 = this.g.r.aG_().get($$1);
         this.g.r.a($$2);
         fqb.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)fqb.this.s();
         double $$4 = $$1 - (double)fqb.this.g(fqb.this.aG_().indexOf(this));
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

            if ($$3 < 16.0 && $$4 > 16.0 && $$5 < this.g.G().c() - 1) {
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

      public fyx c() {
         return this.i;
      }

      @Override
      public wu a() {
         xi $$0 = wu.i();
         $$0.b(wu.a("narrator.select", this.i.a));
         $$0.b(wt.t);
         switch (this.i.g()) {
            case b:
               $$0.b(fqb.L);
               break;
            case d:
               $$0.b(fqb.J);
               $$0.b(wt.t);
               $$0.b(wu.a("multiplayer.status.version.narration", this.i.h));
               $$0.b(wt.t);
               $$0.b(wu.a("multiplayer.status.motd.narration", this.i.d));
               break;
            case c:
               $$0.b(fqb.K);
               break;
            default:
               $$0.b(fqb.M);
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
