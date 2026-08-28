import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.logging.LogUtils;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fsw extends flg<fsw.a> {
   static final alc a = alc.b("server_list/incompatible");
   static final alc m = alc.b("server_list/unreachable");
   static final alc n = alc.b("server_list/ping_1");
   static final alc o = alc.b("server_list/ping_2");
   static final alc p = alc.b("server_list/ping_3");
   static final alc q = alc.b("server_list/ping_4");
   static final alc r = alc.b("server_list/ping_5");
   static final alc s = alc.b("server_list/pinging_1");
   static final alc u = alc.b("server_list/pinging_2");
   static final alc v = alc.b("server_list/pinging_3");
   static final alc w = alc.b("server_list/pinging_4");
   static final alc x = alc.b("server_list/pinging_5");
   static final alc y = alc.b("server_list/join_highlighted");
   static final alc z = alc.b("server_list/join");
   static final alc A = alc.b("server_list/move_up_highlighted");
   static final alc B = alc.b("server_list/move_up");
   static final alc C = alc.b("server_list/move_down_highlighted");
   static final alc D = alc.b("server_list/move_down");
   static final Logger E = LogUtils.getLogger();
   static final ThreadPoolExecutor F = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new r(E)).build()
   );
   static final xd G = xd.c("lanServer.scanning");
   static final xd H = xd.c("multiplayer.status.cannot_resolve").b(-65536);
   static final xd I = xd.c("multiplayer.status.cannot_connect").b(-65536);
   static final xd J = xd.c("multiplayer.status.incompatible");
   static final xd K = xd.c("multiplayer.status.no_connection");
   static final xd L = xd.c("multiplayer.status.pinging");
   static final xd M = xd.c("multiplayer.status.online");
   private final fss N;
   private final List<fsw.d> O = Lists.newArrayList();
   private final fsw.a P = new fsw.b();
   private final List<fsw.c> Q = Lists.newArrayList();

   public fsw(fss $$0, fil $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.N = $$0;
   }

   private void J() {
      this.k();
      this.O.forEach($$1 -> this.b($$1));
      this.b(this.P);
      this.Q.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable fsw.a $$0) {
      super.a($$0);
      this.N.D();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      fsw.a $$3 = this.h();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(gbw $$0) {
      this.O.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.O.add(new fsw.d(this.N, $$0.a($$1)));
      }

      this.J();
   }

   public void a(List<hbk> $$0) {
      int $$1 = $$0.size() - this.Q.size();
      this.Q.clear();

      for (hbk $$2 : $$0) {
         this.Q.add(new fsw.c(this.N, $$2));
      }

      this.J();

      for (int $$3 = this.Q.size() - $$1; $$3 < this.Q.size(); $$3++) {
         fsw.c $$4 = this.Q.get($$3);
         int $$5 = $$3 - this.Q.size() + this.aI_().size();
         int $$6 = this.g($$5);
         int $$7 = this.h($$5);
         if ($$7 >= this.E() && $$6 <= this.G()) {
            this.c.aZ().b(xd.a("multiplayer.lan.server_found", $$4.c()));
         }
      }
   }

   @Override
   public int b() {
      return 305;
   }

   public void c() {
   }

   public abstract static class a extends flg.a<fsw.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fsw.a {
      private final fil a = fil.Q();

      @Override
      public void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(this.a.h, fsw.G, this.a.z.n / 2 - this.a.h.a(fsw.G) / 2, $$10, 16777215, false);
         String $$11 = fps.a(ad.c());
         $$0.a(this.a.h, $$11, this.a.z.n / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712, false);
      }

      @Override
      public xd a() {
         return fsw.G;
      }
   }

   public static class c extends fsw.a {
      private static final int c = 32;
      private static final xd d = xd.c("lanServer.title");
      private static final xd e = xd.c("selectServer.hiddenAddress");
      private final fss f;
      protected final fil a;
      protected final hbk b;
      private long g;

      protected c(fss $$0, hbk $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = fil.Q();
      }

      @Override
      public void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(this.a.h, d, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         $$0.a(this.a.h, this.b.a(), $$3 + 32 + 3, $$2 + 12, -8355712, false);
         if (this.a.n.l) {
            $$0.a(this.a.h, e, $$3 + 32 + 3, $$2 + 12 + 11, 3158064, false);
         } else {
            $$0.a(this.a.h, this.b.b(), $$3 + 32 + 3, $$2 + 12 + 11, 3158064, false);
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.f.a(this);
         if (ad.c() - this.g < 250L) {
            this.f.m();
         }

         this.g = ad.c();
         return super.a($$0, $$1, $$2);
      }

      public hbk b() {
         return this.b;
      }

      @Override
      public xd a() {
         return xd.a("narrator.select", this.c());
      }

      public xd c() {
         return xd.i().b(d).b(xc.v).f(this.b.a());
      }
   }

   public class d extends fsw.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 5;
      private static final int e = 10;
      private static final int f = 8;
      private final fss g;
      private final fil h;
      private final gbv i;
      private final fpn j;
      @Nullable
      private byte[] k;
      private long l;
      @Nullable
      private List<xd> m;
      @Nullable
      private alc n;
      @Nullable
      private xd o;

      protected d(final fss $$1, final gbv $$2) {
         this.g = $$1;
         this.i = $$2;
         this.h = fil.Q();
         this.j = fpn.b(this.h.aa(), $$2.b);
         this.d();
      }

      @Override
      public void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.g() == gbv.b.a) {
            this.i.a(gbv.b.b);
            this.i.d = xc.a;
            this.i.c = xc.a;
            fsw.F.submit(() -> {
               try {
                  this.g.E().a(this.i, () -> this.h.execute(this::b), () -> {
                     this.i.a(this.i.g == ab.b().e() ? gbv.b.e : gbv.b.d);
                     this.h.execute(this::d);
                  });
               } catch (UnknownHostException var2x) {
                  this.i.a(gbv.b.c);
                  this.i.d = fsw.H;
                  this.h.execute(this::d);
               } catch (Exception var3x) {
                  this.i.a(gbv.b.c);
                  this.i.d = fsw.I;
                  this.h.execute(this::d);
               }
            });
         }

         $$0.a(this.h.h, this.i.a, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         List<ayp> $$10 = this.h.h.c(this.i.d, $$4 - 32 - 2);

         for (int $$11 = 0; $$11 < Math.min($$10.size(), 2); $$11++) {
            $$0.a(this.h.h, $$10.get($$11), $$3 + 32 + 3, $$2 + 12 + 9 * $$11, -8355712, false);
         }

         this.a($$0, $$3, $$2, this.j.b());
         if (this.i.g() == gbv.b.b) {
            int $$12 = (int)(ad.c() / 100L + (long)($$1 * 2) & 7L);
            if ($$12 > 4) {
               $$12 = 8 - $$12;
            }
            this.n = switch ($$12) {
               case 1 -> fsw.u;
               case 2 -> fsw.v;
               case 3 -> fsw.w;
               case 4 -> fsw.x;
               default -> fsw.s;
            };
         }

         int $$13 = $$3 + $$4 - 10 - 5;
         if (this.n != null) {
            $$0.a(ghq::B, this.n, $$13, $$2, 10, 8);
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

         xd $$15 = (xd)(this.i.g() == gbv.b.d ? this.i.h.f().a(n.m) : this.i.c);
         int $$16 = this.h.h.a($$15);
         int $$17 = $$13 - $$16 - 5;
         $$0.a(this.h.h, $$15, $$17, $$2 + 1, -8355712, false);
         if (this.o != null && $$6 >= $$13 && $$6 <= $$13 + 10 && $$7 >= $$2 && $$7 <= $$2 + 8) {
            this.g.d(this.o);
         } else if (this.m != null && $$6 >= $$17 && $$6 <= $$17 + $$16 && $$7 >= $$2 && $$7 <= $$2 - 1 + 9) {
            this.g.b(Lists.transform(this.m, xd::g));
         }

         if (this.h.n.ab().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$18 = $$6 - $$3;
            int $$19 = $$7 - $$2;
            if (this.e()) {
               if ($$18 < 32 && $$18 > 16) {
                  $$0.a(ghq::B, fsw.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(ghq::B, fsw.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$18 < 16 && $$19 < 16) {
                  $$0.a(ghq::B, fsw.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(ghq::B, fsw.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.g.F().c() - 1) {
               if ($$18 < 16 && $$19 > 16) {
                  $$0.a(ghq::B, fsw.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(ghq::B, fsw.D, $$3, $$2, 32, 32);
               }
            }
         }
      }

      private void d() {
         this.m = null;
         switch (this.i.g()) {
            case a:
            case b:
               this.n = fsw.n;
               this.o = fsw.L;
               break;
            case d:
               this.n = fsw.a;
               this.o = fsw.J;
               this.m = this.i.i;
               break;
            case c:
               this.n = fsw.m;
               this.o = fsw.K;
               break;
            case e:
               if (this.i.f < 150L) {
                  this.n = fsw.r;
               } else if (this.i.f < 300L) {
                  this.n = fsw.q;
               } else if (this.i.f < 600L) {
                  this.n = fsw.p;
               } else if (this.i.f < 1000L) {
                  this.n = fsw.o;
               } else {
                  this.n = fsw.n;
               }

               this.o = xd.a("multiplayer.status.ping", this.i.f);
               this.m = this.i.i;
         }
      }

      public void b() {
         this.g.F().b();
      }

      protected void a(fjx $$0, int $$1, int $$2, alc $$3) {
         $$0.a(ghq::B, $$3, $$1, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
      }

      private boolean e() {
         return true;
      }

      private boolean a(@Nullable byte[] $$0) {
         if ($$0 == null) {
            this.j.a();
         } else {
            try {
               this.j.a(fce.a($$0));
            } catch (Throwable var3) {
               fsw.E.error("Invalid icon for server {} ({})", new Object[]{this.i.a, this.i.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fqd.t()) {
            fsw $$3 = this.g.s;
            int $$4 = $$3.aI_().indexOf(this);
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
         this.g.s.a(this.g.F());
         fsw.a $$2 = this.g.s.aI_().get($$1);
         this.g.s.a($$2);
         fsw.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)fsw.this.s();
         double $$4 = $$1 - (double)fsw.this.g(fsw.this.aI_().indexOf(this));
         if ($$3 <= 32.0) {
            if ($$3 < 32.0 && $$3 > 16.0 && this.e()) {
               this.g.a(this);
               this.g.m();
               return true;
            }

            int $$5 = this.g.s.aI_().indexOf(this);
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
         if (ad.c() - this.l < 250L) {
            this.g.m();
         }

         this.l = ad.c();
         return super.a($$0, $$1, $$2);
      }

      public gbv c() {
         return this.i;
      }

      @Override
      public xd a() {
         xr $$0 = xd.i();
         $$0.b(xd.a("narrator.select", this.i.a));
         $$0.b(xc.t);
         switch (this.i.g()) {
            case b:
               $$0.b(fsw.L);
               break;
            case d:
               $$0.b(fsw.J);
               $$0.b(xc.t);
               $$0.b(xd.a("multiplayer.status.version.narration", this.i.h));
               $$0.b(xc.t);
               $$0.b(xd.a("multiplayer.status.motd.narration", this.i.d));
               break;
            case c:
               $$0.b(fsw.K);
               break;
            default:
               $$0.b(fsw.M);
               $$0.b(xc.t);
               $$0.b(xd.a("multiplayer.status.ping.narration", this.i.f));
               $$0.b(xc.t);
               $$0.b(xd.a("multiplayer.status.motd.narration", this.i.d));
               if (this.i.e != null) {
                  $$0.b(xc.t);
                  $$0.b(xd.a("multiplayer.status.player_count.narration", this.i.e.b(), this.i.e.a()));
                  $$0.b(xc.t);
                  $$0.b(xg.a(this.i.i, xd.b(", ")));
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
