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

public class fpa extends fgv<fpa.a> {
   static final akm a = new akm("server_list/incompatible");
   static final akm m = new akm("server_list/unreachable");
   static final akm n = new akm("server_list/ping_1");
   static final akm o = new akm("server_list/ping_2");
   static final akm p = new akm("server_list/ping_3");
   static final akm q = new akm("server_list/ping_4");
   static final akm r = new akm("server_list/ping_5");
   static final akm s = new akm("server_list/pinging_1");
   static final akm u = new akm("server_list/pinging_2");
   static final akm v = new akm("server_list/pinging_3");
   static final akm w = new akm("server_list/pinging_4");
   static final akm x = new akm("server_list/pinging_5");
   static final akm y = new akm("server_list/join_highlighted");
   static final akm z = new akm("server_list/join");
   static final akm A = new akm("server_list/move_up_highlighted");
   static final akm B = new akm("server_list/move_up");
   static final akm C = new akm("server_list/move_down_highlighted");
   static final akm D = new akm("server_list/move_down");
   static final Logger E = LogUtils.getLogger();
   static final ThreadPoolExecutor F = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new r(E)).build()
   );
   static final wx G = wx.c("lanServer.scanning");
   static final wx H = wx.c("multiplayer.status.cannot_resolve").b(-65536);
   static final wx I = wx.c("multiplayer.status.cannot_connect").b(-65536);
   static final wx J = wx.c("multiplayer.status.incompatible");
   static final wx K = wx.c("multiplayer.status.no_connection");
   static final wx L = wx.c("multiplayer.status.pinging");
   static final wx M = wx.c("multiplayer.status.online");
   private final fow N;
   private final List<fpa.d> O = Lists.newArrayList();
   private final fpa.a P = new fpa.b();
   private final List<fpa.c> Q = Lists.newArrayList();

   public fpa(fow $$0, fdz $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.N = $$0;
   }

   private void I() {
      this.k();
      this.O.forEach($$1 -> this.b($$1));
      this.b(this.P);
      this.Q.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable fpa.a $$0) {
      super.a($$0);
      this.N.C();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      fpa.a $$3 = this.h();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(fxg $$0) {
      this.O.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.O.add(new fpa.d(this.N, $$0.a($$1)));
      }

      this.I();
   }

   public void a(List<gsb> $$0) {
      int $$1 = $$0.size() - this.Q.size();
      this.Q.clear();

      for (gsb $$2 : $$0) {
         this.Q.add(new fpa.c(this.N, $$2));
      }

      this.I();

      for (int $$3 = this.Q.size() - $$1; $$3 < this.Q.size(); $$3++) {
         fpa.c $$4 = this.Q.get($$3);
         int $$5 = $$3 - this.Q.size() + this.aE_().size();
         int $$6 = this.g($$5);
         int $$7 = this.h($$5);
         if ($$7 >= this.D() && $$6 <= this.F()) {
            this.c.aZ().b(wx.a("multiplayer.lan.server_found", $$4.c()));
         }
      }
   }

   @Override
   public int b() {
      return 305;
   }

   public void d() {
   }

   public abstract static class a extends fgv.a<fpa.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fpa.a {
      private final fdz a = fdz.Q();

      @Override
      public void a(ffm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(this.a.h, fpa.G, this.a.y.n / 2 - this.a.h.a(fpa.G) / 2, $$10, 16777215, false);
         String $$11 = flj.a(ac.c());
         $$0.a(this.a.h, $$11, this.a.y.n / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712, false);
      }

      @Override
      public wx a() {
         return fpa.G;
      }
   }

   public static class c extends fpa.a {
      private static final int c = 32;
      private static final wx d = wx.c("lanServer.title");
      private static final wx e = wx.c("selectServer.hiddenAddress");
      private final fow f;
      protected final fdz a;
      protected final gsb b;
      private long g;

      protected c(fow $$0, gsb $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = fdz.Q();
      }

      @Override
      public void a(ffm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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

      public gsb b() {
         return this.b;
      }

      @Override
      public wx a() {
         return wx.a("narrator.select", this.c());
      }

      public wx c() {
         return wx.i().b(d).b(ww.v).f(this.b.a());
      }
   }

   public class d extends fpa.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 5;
      private static final int e = 10;
      private static final int f = 8;
      private final fow g;
      private final fdz h;
      private final fxf i;
      private final flc j;
      @Nullable
      private byte[] k;
      private long l;
      @Nullable
      private List<wx> m;
      @Nullable
      private akm n;
      @Nullable
      private wx o;

      protected d(fow $$1, fxf $$2) {
         this.g = $$1;
         this.i = $$2;
         this.h = fdz.Q();
         this.j = flc.b(this.h.aa(), $$2.b);
         this.d();
      }

      @Override
      public void a(ffm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.g() == fxf.b.a) {
            this.i.a(fxf.b.b);
            this.i.d = ww.a;
            this.i.c = ww.a;
            fpa.F.submit(() -> {
               try {
                  this.g.D().a(this.i, () -> this.h.execute(this::b), () -> {
                     this.i.a(this.i.g == aa.b().e() ? fxf.b.e : fxf.b.d);
                     this.h.execute(this::d);
                  });
               } catch (UnknownHostException var2x) {
                  this.i.a(fxf.b.c);
                  this.i.d = fpa.H;
                  this.h.execute(this::d);
               } catch (Exception var3x) {
                  this.i.a(fxf.b.c);
                  this.i.d = fpa.I;
                  this.h.execute(this::d);
               }
            });
         }

         $$0.a(this.h.h, this.i.a, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         List<axq> $$10 = this.h.h.c(this.i.d, $$4 - 32 - 2);

         for (int $$11 = 0; $$11 < Math.min($$10.size(), 2); $$11++) {
            $$0.a(this.h.h, $$10.get($$11), $$3 + 32 + 3, $$2 + 12 + 9 * $$11, -8355712, false);
         }

         this.a($$0, $$3, $$2, this.j.b());
         if (this.i.g() == fxf.b.b) {
            int $$12 = (int)(ac.c() / 100L + (long)($$1 * 2) & 7L);
            if ($$12 > 4) {
               $$12 = 8 - $$12;
            }
            this.n = switch ($$12) {
               case 1 -> fpa.u;
               case 2 -> fpa.v;
               case 3 -> fpa.w;
               case 4 -> fpa.x;
               default -> fpa.s;
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

         wx $$15 = (wx)(this.i.g() == fxf.b.d ? this.i.h.f().a(n.m) : this.i.c);
         int $$16 = this.h.h.a($$15);
         int $$17 = $$13 - $$16 - 5;
         $$0.a(this.h.h, $$15, $$17, $$2 + 1, -8355712, false);
         if (this.o != null && $$6 >= $$13 && $$6 <= $$13 + 10 && $$7 >= $$2 && $$7 <= $$2 + 8) {
            this.g.d(this.o);
         } else if (this.m != null && $$6 >= $$17 && $$6 <= $$17 + $$16 && $$7 >= $$2 && $$7 <= $$2 - 1 + 9) {
            this.g.b(Lists.transform(this.m, wx::g));
         }

         if (this.h.m.Z().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$18 = $$6 - $$3;
            int $$19 = $$7 - $$2;
            if (this.e()) {
               if ($$18 < 32 && $$18 > 16) {
                  $$0.a(fpa.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fpa.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$18 < 16 && $$19 < 16) {
                  $$0.a(fpa.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fpa.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.g.E().c() - 1) {
               if ($$18 < 16 && $$19 > 16) {
                  $$0.a(fpa.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fpa.D, $$3, $$2, 32, 32);
               }
            }
         }
      }

      private void d() {
         this.m = null;
         switch (this.i.g()) {
            case a:
            case b:
               this.n = fpa.n;
               this.o = fpa.L;
               break;
            case d:
               this.n = fpa.a;
               this.o = fpa.J;
               this.m = this.i.i;
               break;
            case c:
               this.n = fpa.m;
               this.o = fpa.K;
               break;
            case e:
               if (this.i.f < 150L) {
                  this.n = fpa.r;
               } else if (this.i.f < 300L) {
                  this.n = fpa.q;
               } else if (this.i.f < 600L) {
                  this.n = fpa.p;
               } else if (this.i.f < 1000L) {
                  this.n = fpa.o;
               } else {
                  this.n = fpa.n;
               }

               this.o = wx.a("multiplayer.status.ping", this.i.f);
               this.m = this.i.i;
         }
      }

      public void b() {
         this.g.E().b();
      }

      protected void a(ffm $$0, int $$1, int $$2, akm $$3) {
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
               this.j.a(ext.a($$0));
            } catch (Throwable var3) {
               fpa.E.error("Invalid icon for server {} ({})", new Object[]{this.i.a, this.i.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fly.s()) {
            fpa $$3 = this.g.r;
            int $$4 = $$3.aE_().indexOf(this);
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
         this.g.r.a(this.g.E());
         fpa.a $$2 = this.g.r.aE_().get($$1);
         this.g.r.a($$2);
         fpa.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)fpa.this.r();
         double $$4 = $$1 - (double)fpa.this.g(fpa.this.aE_().indexOf(this));
         if ($$3 <= 32.0) {
            if ($$3 < 32.0 && $$3 > 16.0 && this.e()) {
               this.g.a(this);
               this.g.m();
               return true;
            }

            int $$5 = this.g.r.aE_().indexOf(this);
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
         if (ac.c() - this.l < 250L) {
            this.g.m();
         }

         this.l = ac.c();
         return super.a($$0, $$1, $$2);
      }

      public fxf c() {
         return this.i;
      }

      @Override
      public wx a() {
         xl $$0 = wx.i();
         $$0.b(wx.a("narrator.select", this.i.a));
         $$0.b(ww.t);
         switch (this.i.g()) {
            case b:
               $$0.b(fpa.L);
               break;
            case d:
               $$0.b(fpa.J);
               $$0.b(ww.t);
               $$0.b(wx.a("multiplayer.status.version.narration", this.i.h));
               $$0.b(ww.t);
               $$0.b(wx.a("multiplayer.status.motd.narration", this.i.d));
               break;
            case c:
               $$0.b(fpa.K);
               break;
            default:
               $$0.b(fpa.M);
               $$0.b(ww.t);
               $$0.b(wx.a("multiplayer.status.ping.narration", this.i.f));
               $$0.b(ww.t);
               $$0.b(wx.a("multiplayer.status.motd.narration", this.i.d));
               if (this.i.e != null) {
                  $$0.b(ww.t);
                  $$0.b(wx.a("multiplayer.status.player_count.narration", this.i.e.b(), this.i.e.a()));
                  $$0.b(ww.t);
                  $$0.b(xa.a(this.i.i, wx.b(", ")));
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
