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

public class ftl extends flv<ftl.a> {
   static final alh a = alh.b("server_list/incompatible");
   static final alh m = alh.b("server_list/unreachable");
   static final alh n = alh.b("server_list/ping_1");
   static final alh o = alh.b("server_list/ping_2");
   static final alh p = alh.b("server_list/ping_3");
   static final alh q = alh.b("server_list/ping_4");
   static final alh r = alh.b("server_list/ping_5");
   static final alh s = alh.b("server_list/pinging_1");
   static final alh u = alh.b("server_list/pinging_2");
   static final alh v = alh.b("server_list/pinging_3");
   static final alh w = alh.b("server_list/pinging_4");
   static final alh x = alh.b("server_list/pinging_5");
   static final alh y = alh.b("server_list/join_highlighted");
   static final alh z = alh.b("server_list/join");
   static final alh A = alh.b("server_list/move_up_highlighted");
   static final alh B = alh.b("server_list/move_up");
   static final alh C = alh.b("server_list/move_down_highlighted");
   static final alh D = alh.b("server_list/move_down");
   static final Logger E = LogUtils.getLogger();
   static final ThreadPoolExecutor F = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new r(E)).build()
   );
   static final xh G = xh.c("lanServer.scanning");
   static final xh H = xh.c("multiplayer.status.cannot_resolve").b(-65536);
   static final xh I = xh.c("multiplayer.status.cannot_connect").b(-65536);
   static final xh J = xh.c("multiplayer.status.incompatible");
   static final xh K = xh.c("multiplayer.status.no_connection");
   static final xh L = xh.c("multiplayer.status.pinging");
   static final xh M = xh.c("multiplayer.status.online");
   private final fth N;
   private final List<ftl.d> O = Lists.newArrayList();
   private final ftl.a P = new ftl.b();
   private final List<ftl.c> Q = Lists.newArrayList();

   public ftl(fth $$0, fja $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.N = $$0;
   }

   private void J() {
      this.k();
      this.O.forEach($$1 -> this.b($$1));
      this.b(this.P);
      this.Q.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable ftl.a $$0) {
      super.a($$0);
      this.N.D();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      ftl.a $$3 = this.h();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(gcm $$0) {
      this.O.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.O.add(new ftl.d(this.N, $$0.a($$1)));
      }

      this.J();
   }

   public void a(List<hce> $$0) {
      int $$1 = $$0.size() - this.Q.size();
      this.Q.clear();

      for (hce $$2 : $$0) {
         this.Q.add(new ftl.c(this.N, $$2));
      }

      this.J();

      for (int $$3 = this.Q.size() - $$1; $$3 < this.Q.size(); $$3++) {
         ftl.c $$4 = this.Q.get($$3);
         int $$5 = $$3 - this.Q.size() + this.aJ_().size();
         int $$6 = this.g($$5);
         int $$7 = this.h($$5);
         if ($$7 >= this.E() && $$6 <= this.G()) {
            this.c.ba().b(xh.a("multiplayer.lan.server_found", $$4.c()));
         }
      }
   }

   @Override
   public int b() {
      return 305;
   }

   public void c() {
   }

   public abstract static class a extends flv.a<ftl.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends ftl.a {
      private final fja a = fja.Q();

      @Override
      public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(this.a.h, ftl.G, this.a.z.n / 2 - this.a.h.a(ftl.G) / 2, $$10, 16777215, false);
         String $$11 = fqh.a(ad.c());
         $$0.a(this.a.h, $$11, this.a.z.n / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712, false);
      }

      @Override
      public xh a() {
         return ftl.G;
      }
   }

   public static class c extends ftl.a {
      private static final int c = 32;
      private static final xh d = xh.c("lanServer.title");
      private static final xh e = xh.c("selectServer.hiddenAddress");
      private final fth f;
      protected final fja a;
      protected final hce b;
      private long g;

      protected c(fth $$0, hce $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = fja.Q();
      }

      @Override
      public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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

      public hce b() {
         return this.b;
      }

      @Override
      public xh a() {
         return xh.a("narrator.select", this.c());
      }

      public xh c() {
         return xh.i().b(d).b(xg.v).f(this.b.a());
      }
   }

   public class d extends ftl.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 5;
      private static final int e = 10;
      private static final int f = 8;
      private final fth g;
      private final fja h;
      private final gcl i;
      private final fqc j;
      @Nullable
      private byte[] k;
      private long l;
      @Nullable
      private List<xh> m;
      @Nullable
      private alh n;
      @Nullable
      private xh o;

      protected d(final fth $$1, final gcl $$2) {
         this.g = $$1;
         this.i = $$2;
         this.h = fja.Q();
         this.j = fqc.b(this.h.aa(), $$2.b);
         this.d();
      }

      @Override
      public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.g() == gcl.b.a) {
            this.i.a(gcl.b.b);
            this.i.d = xg.a;
            this.i.c = xg.a;
            ftl.F.submit(() -> {
               try {
                  this.g.E().a(this.i, () -> this.h.execute(this::b), () -> {
                     this.i.a(this.i.g == ab.b().e() ? gcl.b.e : gcl.b.d);
                     this.h.execute(this::d);
                  });
               } catch (UnknownHostException var2x) {
                  this.i.a(gcl.b.c);
                  this.i.d = ftl.H;
                  this.h.execute(this::d);
               } catch (Exception var3x) {
                  this.i.a(gcl.b.c);
                  this.i.d = ftl.I;
                  this.h.execute(this::d);
               }
            });
         }

         $$0.a(this.h.h, this.i.a, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         List<ayv> $$10 = this.h.h.c(this.i.d, $$4 - 32 - 2);

         for (int $$11 = 0; $$11 < Math.min($$10.size(), 2); $$11++) {
            $$0.a(this.h.h, $$10.get($$11), $$3 + 32 + 3, $$2 + 12 + 9 * $$11, -8355712, false);
         }

         this.a($$0, $$3, $$2, this.j.b());
         if (this.i.g() == gcl.b.b) {
            int $$12 = (int)(ad.c() / 100L + (long)($$1 * 2) & 7L);
            if ($$12 > 4) {
               $$12 = 8 - $$12;
            }
            this.n = switch ($$12) {
               case 1 -> ftl.u;
               case 2 -> ftl.v;
               case 3 -> ftl.w;
               case 4 -> ftl.x;
               default -> ftl.s;
            };
         }

         int $$13 = $$3 + $$4 - 10 - 5;
         if (this.n != null) {
            $$0.a(gig::B, this.n, $$13, $$2, 10, 8);
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

         xh $$15 = (xh)(this.i.g() == gcl.b.d ? this.i.h.f().a(n.m) : this.i.c);
         int $$16 = this.h.h.a($$15);
         int $$17 = $$13 - $$16 - 5;
         $$0.a(this.h.h, $$15, $$17, $$2 + 1, -8355712, false);
         if (this.o != null && $$6 >= $$13 && $$6 <= $$13 + 10 && $$7 >= $$2 && $$7 <= $$2 + 8) {
            this.g.d(this.o);
         } else if (this.m != null && $$6 >= $$17 && $$6 <= $$17 + $$16 && $$7 >= $$2 && $$7 <= $$2 - 1 + 9) {
            this.g.b(Lists.transform(this.m, xh::g));
         }

         if (this.h.n.ab().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$18 = $$6 - $$3;
            int $$19 = $$7 - $$2;
            if (this.e()) {
               if ($$18 < 32 && $$18 > 16) {
                  $$0.a(gig::B, ftl.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gig::B, ftl.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$18 < 16 && $$19 < 16) {
                  $$0.a(gig::B, ftl.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gig::B, ftl.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.g.F().c() - 1) {
               if ($$18 < 16 && $$19 > 16) {
                  $$0.a(gig::B, ftl.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gig::B, ftl.D, $$3, $$2, 32, 32);
               }
            }
         }
      }

      private void d() {
         this.m = null;
         switch (this.i.g()) {
            case a:
            case b:
               this.n = ftl.n;
               this.o = ftl.L;
               break;
            case d:
               this.n = ftl.a;
               this.o = ftl.J;
               this.m = this.i.i;
               break;
            case c:
               this.n = ftl.m;
               this.o = ftl.K;
               break;
            case e:
               if (this.i.f < 150L) {
                  this.n = ftl.r;
               } else if (this.i.f < 300L) {
                  this.n = ftl.q;
               } else if (this.i.f < 600L) {
                  this.n = ftl.p;
               } else if (this.i.f < 1000L) {
                  this.n = ftl.o;
               } else {
                  this.n = ftl.n;
               }

               this.o = xh.a("multiplayer.status.ping", this.i.f);
               this.m = this.i.i;
         }
      }

      public void b() {
         this.g.F().b();
      }

      protected void a(fkm $$0, int $$1, int $$2, alh $$3) {
         $$0.a(gig::B, $$3, $$1, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
      }

      private boolean e() {
         return true;
      }

      private boolean a(@Nullable byte[] $$0) {
         if ($$0 == null) {
            this.j.a();
         } else {
            try {
               this.j.a(fct.a($$0));
            } catch (Throwable var3) {
               ftl.E.error("Invalid icon for server {} ({})", new Object[]{this.i.a, this.i.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fqs.t()) {
            ftl $$3 = this.g.s;
            int $$4 = $$3.aJ_().indexOf(this);
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
         ftl.a $$2 = this.g.s.aJ_().get($$1);
         this.g.s.a($$2);
         ftl.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)ftl.this.s();
         double $$4 = $$1 - (double)ftl.this.g(ftl.this.aJ_().indexOf(this));
         if ($$3 <= 32.0) {
            if ($$3 < 32.0 && $$3 > 16.0 && this.e()) {
               this.g.a(this);
               this.g.m();
               return true;
            }

            int $$5 = this.g.s.aJ_().indexOf(this);
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

      public gcl c() {
         return this.i;
      }

      @Override
      public xh a() {
         xv $$0 = xh.i();
         $$0.b(xh.a("narrator.select", this.i.a));
         $$0.b(xg.t);
         switch (this.i.g()) {
            case b:
               $$0.b(ftl.L);
               break;
            case d:
               $$0.b(ftl.J);
               $$0.b(xg.t);
               $$0.b(xh.a("multiplayer.status.version.narration", this.i.h));
               $$0.b(xg.t);
               $$0.b(xh.a("multiplayer.status.motd.narration", this.i.d));
               break;
            case c:
               $$0.b(ftl.K);
               break;
            default:
               $$0.b(ftl.M);
               $$0.b(xg.t);
               $$0.b(xh.a("multiplayer.status.ping.narration", this.i.f));
               $$0.b(xg.t);
               $$0.b(xh.a("multiplayer.status.motd.narration", this.i.d));
               if (this.i.e != null) {
                  $$0.b(xg.t);
                  $$0.b(xh.a("multiplayer.status.player_count.narration", this.i.e.b(), this.i.e.a()));
                  $$0.b(xg.t);
                  $$0.b(xk.a(this.i.i, xh.b(", ")));
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
