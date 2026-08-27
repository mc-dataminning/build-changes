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

public class fgo extends eyn<fgo.a> {
   static final ahh a = new ahh("server_list/incompatible");
   static final ahh m = new ahh("server_list/unreachable");
   static final ahh n = new ahh("server_list/ping_1");
   static final ahh o = new ahh("server_list/ping_2");
   static final ahh p = new ahh("server_list/ping_3");
   static final ahh q = new ahh("server_list/ping_4");
   static final ahh r = new ahh("server_list/ping_5");
   static final ahh t = new ahh("server_list/pinging_1");
   static final ahh u = new ahh("server_list/pinging_2");
   static final ahh v = new ahh("server_list/pinging_3");
   static final ahh w = new ahh("server_list/pinging_4");
   static final ahh x = new ahh("server_list/pinging_5");
   static final ahh y = new ahh("server_list/join_highlighted");
   static final ahh z = new ahh("server_list/join");
   static final ahh A = new ahh("server_list/move_up_highlighted");
   static final ahh B = new ahh("server_list/move_up");
   static final ahh C = new ahh("server_list/move_down_highlighted");
   static final ahh D = new ahh("server_list/move_down");
   static final Logger E = LogUtils.getLogger();
   static final ThreadPoolExecutor F = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new r(E)).build()
   );
   private static final ahh G = new ahh("textures/misc/unknown_server.png");
   static final vg H = vg.c("lanServer.scanning");
   static final vg I = vg.c("multiplayer.status.cannot_resolve").b(-65536);
   static final vg J = vg.c("multiplayer.status.cannot_connect").b(-65536);
   static final vg K = vg.c("multiplayer.status.incompatible");
   static final vg L = vg.c("multiplayer.status.no_connection");
   static final vg M = vg.c("multiplayer.status.pinging");
   static final vg N = vg.c("multiplayer.status.online");
   private final fgk O;
   private final List<fgo.d> P = Lists.newArrayList();
   private final fgo.a Q = new fgo.b();
   private final List<fgo.c> R = Lists.newArrayList();

   public fgo(fgk $$0, evr $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.O = $$0;
   }

   private void e() {
      this.m();
      this.P.forEach($$1 -> this.b($$1));
      this.b(this.Q);
      this.R.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable fgo.a $$0) {
      super.a($$0);
      this.O.E();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      fgo.a $$3 = this.i();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(foq $$0) {
      this.P.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.P.add(new fgo.d(this.O, $$0.a($$1)));
      }

      this.e();
   }

   public void a(List<gjg> $$0) {
      int $$1 = $$0.size() - this.R.size();
      this.R.clear();

      for (gjg $$2 : $$0) {
         this.R.add(new fgo.c(this.O, $$2));
      }

      this.e();

      for (int $$3 = this.R.size() - $$1; $$3 < this.R.size(); $$3++) {
         fgo.c $$4 = this.R.get($$3);
         int $$5 = $$3 - this.R.size() + this.l().size();
         int $$6 = this.g($$5);
         int $$7 = this.h($$5);
         if ($$7 >= this.C() && $$6 <= this.E()) {
            this.c.aW().b(vg.a("multiplayer.lan.server_found", $$4.c()));
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

   public abstract static class a extends eyn.a<fgo.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fgo.a {
      private final evr a = evr.O();

      @Override
      public void a(exe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(this.a.h, fgo.H, this.a.y.g / 2 - this.a.h.a(fgo.H) / 2, $$10, 16777215, false);
         String $$11 = fcx.a(ac.b());
         $$0.a(this.a.h, $$11, this.a.y.g / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712, false);
      }

      @Override
      public vg a() {
         return fgo.H;
      }
   }

   public static class c extends fgo.a {
      private static final int c = 32;
      private static final vg d = vg.c("lanServer.title");
      private static final vg e = vg.c("selectServer.hiddenAddress");
      private final fgk f;
      protected final evr a;
      protected final gjg b;
      private long g;

      protected c(fgk $$0, gjg $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = evr.O();
      }

      @Override
      public void a(exe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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

      public gjg b() {
         return this.b;
      }

      @Override
      public vg a() {
         return vg.a("narrator.select", this.c());
      }

      public vg c() {
         return vg.i().b(d).b(vf.u).f(this.b.a());
      }
   }

   public class d extends fgo.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 5;
      private static final int e = 10;
      private static final int f = 8;
      private final fgk g;
      private final evr h;
      private final fop i;
      private final fcr j;
      @Nullable
      private byte[] k;
      private long l;
      @Nullable
      private List<vg> m;
      private ahh n;
      private vg o;

      protected d(fgk $$1, fop $$2) {
         this.g = $$1;
         this.i = $$2;
         this.h = evr.O();
         this.j = fcr.b(this.h.Y(), $$2.b);
         this.d();
      }

      @Override
      public void a(exe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.h() == fop.b.a) {
            this.i.a(fop.b.b);
            this.i.d = vf.a;
            this.i.c = vf.a;
            fgo.F.submit(() -> {
               try {
                  this.g.H().a(this.i, () -> this.h.execute(this::b), () -> {
                     this.i.a(this.i.g == aa.b().e() ? fop.b.e : fop.b.d);
                     this.h.execute(this::d);
                  });
               } catch (UnknownHostException var2x) {
                  this.i.a(fop.b.c);
                  this.i.d = fgo.I;
                  this.h.execute(this::d);
               } catch (Exception var3x) {
                  this.i.a(fop.b.c);
                  this.i.d = fgo.J;
                  this.h.execute(this::d);
               }
            });
         }

         $$0.a(this.h.h, this.i.a, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         List<aub> $$10 = this.h.h.c(this.i.d, $$4 - 32 - 2);

         for (int $$11 = 0; $$11 < Math.min($$10.size(), 2); $$11++) {
            $$0.a(this.h.h, $$10.get($$11), $$3 + 32 + 3, $$2 + 12 + 9 * $$11, -8355712, false);
         }

         this.a($$0, $$3, $$2, this.j.b());
         if (this.i.h() == fop.b.b) {
            int $$12 = (int)(ac.b() / 100L + (long)($$1 * 2) & 7L);
            if ($$12 > 4) {
               $$12 = 8 - $$12;
            }
            this.n = switch ($$12) {
               case 1 -> fgo.u;
               case 2 -> fgo.v;
               case 3 -> fgo.w;
               case 4 -> fgo.x;
               default -> fgo.t;
            };
         }

         int $$13 = $$3 + $$4 - 10 - 5;
         $$0.a(this.n, $$13, $$2, 10, 8);
         byte[] $$14 = this.i.c();
         if (!Arrays.equals($$14, this.k)) {
            if (this.a($$14)) {
               this.k = $$14;
            } else {
               this.i.a(null);
               this.b();
            }
         }

         vg $$15 = (vg)(this.i.h() == fop.b.d ? this.i.h.f().a(n.m) : this.i.c);
         int $$16 = this.h.h.a($$15);
         int $$17 = $$13 - $$16 - 5;
         $$0.a(this.h.h, $$15, $$17, $$2 + 1, -8355712, false);
         if ($$6 >= $$13 && $$6 <= $$13 + 10 && $$7 >= $$2 && $$7 <= $$2 + 8) {
            this.g.d(this.o);
         } else if (this.m != null && $$6 >= $$17 && $$6 <= $$17 + $$16 && $$7 >= $$2 && $$7 <= $$2 - 1 + 9) {
            this.g.b(Lists.transform(this.m, vg::g));
         }

         if (this.h.m.W().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$18 = $$6 - $$3;
            int $$19 = $$7 - $$2;
            if (this.e()) {
               if ($$18 < 32 && $$18 > 16) {
                  $$0.a(fgo.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fgo.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$18 < 16 && $$19 < 16) {
                  $$0.a(fgo.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fgo.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.g.I().c() - 1) {
               if ($$18 < 16 && $$19 > 16) {
                  $$0.a(fgo.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fgo.D, $$3, $$2, 32, 32);
               }
            }
         }
      }

      private void d() {
         this.m = null;
         switch (this.i.h()) {
            case a:
            case b:
               this.o = fgo.M;
               break;
            case d:
               this.n = fgo.a;
               this.o = fgo.K;
               this.m = this.i.i;
               break;
            case c:
               this.n = fgo.m;
               this.o = fgo.L;
               break;
            case e:
               if (this.i.f < 150L) {
                  this.n = fgo.r;
               } else if (this.i.f < 300L) {
                  this.n = fgo.q;
               } else if (this.i.f < 600L) {
                  this.n = fgo.p;
               } else if (this.i.f < 1000L) {
                  this.n = fgo.o;
               } else {
                  this.n = fgo.n;
               }

               this.o = vg.a("multiplayer.status.ping", this.i.f);
               this.m = this.i.i;
         }
      }

      public void b() {
         this.g.I().b();
      }

      protected void a(exe $$0, int $$1, int $$2, ahh $$3) {
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
               this.j.a(epl.a($$0));
            } catch (Throwable var3) {
               fgo.E.error("Invalid icon for server {} ({})", new Object[]{this.i.a, this.i.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fdm.v()) {
            fgo $$3 = this.g.l;
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
         fgo.a $$2 = this.g.l.l().get($$1);
         this.g.l.a($$2);
         fgo.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)fgo.this.q();
         double $$4 = $$1 - (double)fgo.this.g(fgo.this.l().indexOf(this));
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

      public fop c() {
         return this.i;
      }

      @Override
      public vg a() {
         vu $$0 = vg.i();
         $$0.b(vg.a("narrator.select", this.i.a));
         $$0.b(vf.s);
         switch (this.i.h()) {
            case b:
               $$0.b(fgo.M);
               break;
            case d:
               $$0.b(fgo.K);
               $$0.b(vf.s);
               $$0.b(vg.a("multiplayer.status.version.narration", this.i.h));
               $$0.b(vf.s);
               $$0.b(vg.a("multiplayer.status.motd.narration", this.i.d));
               break;
            case c:
               $$0.b(fgo.L);
               break;
            default:
               $$0.b(fgo.N);
               $$0.b(vf.s);
               $$0.b(vg.a("multiplayer.status.ping.narration", this.i.f));
               $$0.b(vf.s);
               $$0.b(vg.a("multiplayer.status.motd.narration", this.i.d));
               if (this.i.e != null) {
                  $$0.b(vf.s);
                  $$0.b(vg.a("multiplayer.status.player_count.narration", this.i.e.b(), this.i.e.a()));
                  $$0.b(vf.s);
                  $$0.b(vj.a(this.i.i, vg.b(", ")));
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
