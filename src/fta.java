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

public class fta extends flk<fta.a> {
   static final ale a = ale.b("server_list/incompatible");
   static final ale m = ale.b("server_list/unreachable");
   static final ale n = ale.b("server_list/ping_1");
   static final ale o = ale.b("server_list/ping_2");
   static final ale p = ale.b("server_list/ping_3");
   static final ale q = ale.b("server_list/ping_4");
   static final ale r = ale.b("server_list/ping_5");
   static final ale s = ale.b("server_list/pinging_1");
   static final ale u = ale.b("server_list/pinging_2");
   static final ale v = ale.b("server_list/pinging_3");
   static final ale w = ale.b("server_list/pinging_4");
   static final ale x = ale.b("server_list/pinging_5");
   static final ale y = ale.b("server_list/join_highlighted");
   static final ale z = ale.b("server_list/join");
   static final ale A = ale.b("server_list/move_up_highlighted");
   static final ale B = ale.b("server_list/move_up");
   static final ale C = ale.b("server_list/move_down_highlighted");
   static final ale D = ale.b("server_list/move_down");
   static final Logger E = LogUtils.getLogger();
   static final ThreadPoolExecutor F = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new r(E)).build()
   );
   static final xe G = xe.c("lanServer.scanning");
   static final xe H = xe.c("multiplayer.status.cannot_resolve").b(-65536);
   static final xe I = xe.c("multiplayer.status.cannot_connect").b(-65536);
   static final xe J = xe.c("multiplayer.status.incompatible");
   static final xe K = xe.c("multiplayer.status.no_connection");
   static final xe L = xe.c("multiplayer.status.pinging");
   static final xe M = xe.c("multiplayer.status.online");
   private final fsw N;
   private final List<fta.d> O = Lists.newArrayList();
   private final fta.a P = new fta.b();
   private final List<fta.c> Q = Lists.newArrayList();

   public fta(fsw $$0, fip $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.N = $$0;
   }

   private void J() {
      this.k();
      this.O.forEach($$1 -> this.b($$1));
      this.b(this.P);
      this.Q.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable fta.a $$0) {
      super.a($$0);
      this.N.D();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      fta.a $$3 = this.h();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(gcb $$0) {
      this.O.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.O.add(new fta.d(this.N, $$0.a($$1)));
      }

      this.J();
   }

   public void a(List<hbp> $$0) {
      int $$1 = $$0.size() - this.Q.size();
      this.Q.clear();

      for (hbp $$2 : $$0) {
         this.Q.add(new fta.c(this.N, $$2));
      }

      this.J();

      for (int $$3 = this.Q.size() - $$1; $$3 < this.Q.size(); $$3++) {
         fta.c $$4 = this.Q.get($$3);
         int $$5 = $$3 - this.Q.size() + this.aJ_().size();
         int $$6 = this.g($$5);
         int $$7 = this.h($$5);
         if ($$7 >= this.E() && $$6 <= this.G()) {
            this.c.aZ().b(xe.a("multiplayer.lan.server_found", $$4.c()));
         }
      }
   }

   @Override
   public int b() {
      return 305;
   }

   public void c() {
   }

   public abstract static class a extends flk.a<fta.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fta.a {
      private final fip a = fip.Q();

      @Override
      public void a(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(this.a.h, fta.G, this.a.z.n / 2 - this.a.h.a(fta.G) / 2, $$10, 16777215, false);
         String $$11 = fpw.a(ad.c());
         $$0.a(this.a.h, $$11, this.a.z.n / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712, false);
      }

      @Override
      public xe a() {
         return fta.G;
      }
   }

   public static class c extends fta.a {
      private static final int c = 32;
      private static final xe d = xe.c("lanServer.title");
      private static final xe e = xe.c("selectServer.hiddenAddress");
      private final fsw f;
      protected final fip a;
      protected final hbp b;
      private long g;

      protected c(fsw $$0, hbp $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = fip.Q();
      }

      @Override
      public void a(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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

      public hbp b() {
         return this.b;
      }

      @Override
      public xe a() {
         return xe.a("narrator.select", this.c());
      }

      public xe c() {
         return xe.i().b(d).b(xd.v).f(this.b.a());
      }
   }

   public class d extends fta.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 5;
      private static final int e = 10;
      private static final int f = 8;
      private final fsw g;
      private final fip h;
      private final gca i;
      private final fpr j;
      @Nullable
      private byte[] k;
      private long l;
      @Nullable
      private List<xe> m;
      @Nullable
      private ale n;
      @Nullable
      private xe o;

      protected d(final fsw $$1, final gca $$2) {
         this.g = $$1;
         this.i = $$2;
         this.h = fip.Q();
         this.j = fpr.b(this.h.aa(), $$2.b);
         this.d();
      }

      @Override
      public void a(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.g() == gca.b.a) {
            this.i.a(gca.b.b);
            this.i.d = xd.a;
            this.i.c = xd.a;
            fta.F.submit(() -> {
               try {
                  this.g.E().a(this.i, () -> this.h.execute(this::b), () -> {
                     this.i.a(this.i.g == ab.b().e() ? gca.b.e : gca.b.d);
                     this.h.execute(this::d);
                  });
               } catch (UnknownHostException var2x) {
                  this.i.a(gca.b.c);
                  this.i.d = fta.H;
                  this.h.execute(this::d);
               } catch (Exception var3x) {
                  this.i.a(gca.b.c);
                  this.i.d = fta.I;
                  this.h.execute(this::d);
               }
            });
         }

         $$0.a(this.h.h, this.i.a, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         List<ayr> $$10 = this.h.h.c(this.i.d, $$4 - 32 - 2);

         for (int $$11 = 0; $$11 < Math.min($$10.size(), 2); $$11++) {
            $$0.a(this.h.h, $$10.get($$11), $$3 + 32 + 3, $$2 + 12 + 9 * $$11, -8355712, false);
         }

         this.a($$0, $$3, $$2, this.j.b());
         if (this.i.g() == gca.b.b) {
            int $$12 = (int)(ad.c() / 100L + (long)($$1 * 2) & 7L);
            if ($$12 > 4) {
               $$12 = 8 - $$12;
            }
            this.n = switch ($$12) {
               case 1 -> fta.u;
               case 2 -> fta.v;
               case 3 -> fta.w;
               case 4 -> fta.x;
               default -> fta.s;
            };
         }

         int $$13 = $$3 + $$4 - 10 - 5;
         if (this.n != null) {
            $$0.a(ghv::B, this.n, $$13, $$2, 10, 8);
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

         xe $$15 = (xe)(this.i.g() == gca.b.d ? this.i.h.f().a(n.m) : this.i.c);
         int $$16 = this.h.h.a($$15);
         int $$17 = $$13 - $$16 - 5;
         $$0.a(this.h.h, $$15, $$17, $$2 + 1, -8355712, false);
         if (this.o != null && $$6 >= $$13 && $$6 <= $$13 + 10 && $$7 >= $$2 && $$7 <= $$2 + 8) {
            this.g.d(this.o);
         } else if (this.m != null && $$6 >= $$17 && $$6 <= $$17 + $$16 && $$7 >= $$2 && $$7 <= $$2 - 1 + 9) {
            this.g.b(Lists.transform(this.m, xe::g));
         }

         if (this.h.n.ab().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$18 = $$6 - $$3;
            int $$19 = $$7 - $$2;
            if (this.e()) {
               if ($$18 < 32 && $$18 > 16) {
                  $$0.a(ghv::B, fta.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(ghv::B, fta.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$18 < 16 && $$19 < 16) {
                  $$0.a(ghv::B, fta.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(ghv::B, fta.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.g.F().c() - 1) {
               if ($$18 < 16 && $$19 > 16) {
                  $$0.a(ghv::B, fta.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(ghv::B, fta.D, $$3, $$2, 32, 32);
               }
            }
         }
      }

      private void d() {
         this.m = null;
         switch (this.i.g()) {
            case a:
            case b:
               this.n = fta.n;
               this.o = fta.L;
               break;
            case d:
               this.n = fta.a;
               this.o = fta.J;
               this.m = this.i.i;
               break;
            case c:
               this.n = fta.m;
               this.o = fta.K;
               break;
            case e:
               if (this.i.f < 150L) {
                  this.n = fta.r;
               } else if (this.i.f < 300L) {
                  this.n = fta.q;
               } else if (this.i.f < 600L) {
                  this.n = fta.p;
               } else if (this.i.f < 1000L) {
                  this.n = fta.o;
               } else {
                  this.n = fta.n;
               }

               this.o = xe.a("multiplayer.status.ping", this.i.f);
               this.m = this.i.i;
         }
      }

      public void b() {
         this.g.F().b();
      }

      protected void a(fkb $$0, int $$1, int $$2, ale $$3) {
         $$0.a(ghv::B, $$3, $$1, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
      }

      private boolean e() {
         return true;
      }

      private boolean a(@Nullable byte[] $$0) {
         if ($$0 == null) {
            this.j.a();
         } else {
            try {
               this.j.a(fci.a($$0));
            } catch (Throwable var3) {
               fta.E.error("Invalid icon for server {} ({})", new Object[]{this.i.a, this.i.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fqh.t()) {
            fta $$3 = this.g.s;
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
         fta.a $$2 = this.g.s.aJ_().get($$1);
         this.g.s.a($$2);
         fta.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)fta.this.s();
         double $$4 = $$1 - (double)fta.this.g(fta.this.aJ_().indexOf(this));
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

      public gca c() {
         return this.i;
      }

      @Override
      public xe a() {
         xs $$0 = xe.i();
         $$0.b(xe.a("narrator.select", this.i.a));
         $$0.b(xd.t);
         switch (this.i.g()) {
            case b:
               $$0.b(fta.L);
               break;
            case d:
               $$0.b(fta.J);
               $$0.b(xd.t);
               $$0.b(xe.a("multiplayer.status.version.narration", this.i.h));
               $$0.b(xd.t);
               $$0.b(xe.a("multiplayer.status.motd.narration", this.i.d));
               break;
            case c:
               $$0.b(fta.K);
               break;
            default:
               $$0.b(fta.M);
               $$0.b(xd.t);
               $$0.b(xe.a("multiplayer.status.ping.narration", this.i.f));
               $$0.b(xd.t);
               $$0.b(xe.a("multiplayer.status.motd.narration", this.i.d));
               if (this.i.e != null) {
                  $$0.b(xd.t);
                  $$0.b(xe.a("multiplayer.status.player_count.narration", this.i.e.b(), this.i.e.a()));
                  $$0.b(xd.t);
                  $$0.b(xh.a(this.i.i, xe.b(", ")));
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
