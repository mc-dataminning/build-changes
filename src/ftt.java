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

public class ftt extends fmd<ftt.a> {
   static final ali a = ali.b("server_list/incompatible");
   static final ali m = ali.b("server_list/unreachable");
   static final ali n = ali.b("server_list/ping_1");
   static final ali o = ali.b("server_list/ping_2");
   static final ali p = ali.b("server_list/ping_3");
   static final ali q = ali.b("server_list/ping_4");
   static final ali r = ali.b("server_list/ping_5");
   static final ali s = ali.b("server_list/pinging_1");
   static final ali u = ali.b("server_list/pinging_2");
   static final ali v = ali.b("server_list/pinging_3");
   static final ali w = ali.b("server_list/pinging_4");
   static final ali x = ali.b("server_list/pinging_5");
   static final ali y = ali.b("server_list/join_highlighted");
   static final ali z = ali.b("server_list/join");
   static final ali A = ali.b("server_list/move_up_highlighted");
   static final ali B = ali.b("server_list/move_up");
   static final ali C = ali.b("server_list/move_down_highlighted");
   static final ali D = ali.b("server_list/move_down");
   static final Logger E = LogUtils.getLogger();
   static final ThreadPoolExecutor F = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new r(E)).build()
   );
   static final xi G = xi.c("lanServer.scanning");
   static final xi H = xi.c("multiplayer.status.cannot_resolve").b(-65536);
   static final xi I = xi.c("multiplayer.status.cannot_connect").b(-65536);
   static final xi J = xi.c("multiplayer.status.incompatible");
   static final xi K = xi.c("multiplayer.status.no_connection");
   static final xi L = xi.c("multiplayer.status.pinging");
   static final xi M = xi.c("multiplayer.status.online");
   private final ftp N;
   private final List<ftt.d> O = Lists.newArrayList();
   private final ftt.a P = new ftt.b();
   private final List<ftt.c> Q = Lists.newArrayList();

   public ftt(ftp $$0, fji $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.N = $$0;
   }

   private void J() {
      this.k();
      this.O.forEach($$1 -> this.b($$1));
      this.b(this.P);
      this.Q.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable ftt.a $$0) {
      super.a($$0);
      this.N.D();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      ftt.a $$3 = this.h();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(gcx $$0) {
      this.O.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.O.add(new ftt.d(this.N, $$0.a($$1)));
      }

      this.J();
   }

   public void a(List<hcp> $$0) {
      int $$1 = $$0.size() - this.Q.size();
      this.Q.clear();

      for (hcp $$2 : $$0) {
         this.Q.add(new ftt.c(this.N, $$2));
      }

      this.J();

      for (int $$3 = this.Q.size() - $$1; $$3 < this.Q.size(); $$3++) {
         ftt.c $$4 = this.Q.get($$3);
         int $$5 = $$3 - this.Q.size() + this.aI_().size();
         int $$6 = this.g($$5);
         int $$7 = this.h($$5);
         if ($$7 >= this.E() && $$6 <= this.G()) {
            this.c.aZ().b(xi.a("multiplayer.lan.server_found", $$4.c()));
         }
      }
   }

   @Override
   public int b() {
      return 305;
   }

   public void c() {
   }

   public abstract static class a extends fmd.a<ftt.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends ftt.a {
      private final fji a = fji.Q();

      @Override
      public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(this.a.h, ftt.G, this.a.z.n / 2 - this.a.h.a(ftt.G) / 2, $$10, 16777215, false);
         String $$11 = fqp.a(ae.c());
         $$0.a(this.a.h, $$11, this.a.z.n / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712, false);
      }

      @Override
      public xi a() {
         return ftt.G;
      }
   }

   public static class c extends ftt.a {
      private static final int c = 32;
      private static final xi d = xi.c("lanServer.title");
      private static final xi e = xi.c("selectServer.hiddenAddress");
      private final ftp f;
      protected final fji a;
      protected final hcp b;
      private long g;

      protected c(ftp $$0, hcp $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = fji.Q();
      }

      @Override
      public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
         if (ae.c() - this.g < 250L) {
            this.f.m();
         }

         this.g = ae.c();
         return super.a($$0, $$1, $$2);
      }

      public hcp b() {
         return this.b;
      }

      @Override
      public xi a() {
         return xi.a("narrator.select", this.c());
      }

      public xi c() {
         return xi.i().b(d).b(xh.v).f(this.b.a());
      }
   }

   public class d extends ftt.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 5;
      private static final int e = 10;
      private static final int f = 8;
      private final ftp g;
      private final fji h;
      private final gcw i;
      private final fqk j;
      @Nullable
      private byte[] k;
      private long l;
      @Nullable
      private List<xi> m;
      @Nullable
      private ali n;
      @Nullable
      private xi o;

      protected d(final ftp $$1, final gcw $$2) {
         this.g = $$1;
         this.i = $$2;
         this.h = fji.Q();
         this.j = fqk.b(this.h.aa(), $$2.b);
         this.d();
      }

      @Override
      public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.g() == gcw.b.a) {
            this.i.a(gcw.b.b);
            this.i.d = xh.a;
            this.i.c = xh.a;
            ftt.F.submit(() -> {
               try {
                  this.g.E().a(this.i, () -> this.h.execute(this::b), () -> {
                     this.i.a(this.i.g == ab.b().e() ? gcw.b.e : gcw.b.d);
                     this.h.execute(this::d);
                  });
               } catch (UnknownHostException var2x) {
                  this.i.a(gcw.b.c);
                  this.i.d = ftt.H;
                  this.h.execute(this::d);
               } catch (Exception var3x) {
                  this.i.a(gcw.b.c);
                  this.i.d = ftt.I;
                  this.h.execute(this::d);
               }
            });
         }

         $$0.a(this.h.h, this.i.a, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         List<ayw> $$10 = this.h.h.c(this.i.d, $$4 - 32 - 2);

         for (int $$11 = 0; $$11 < Math.min($$10.size(), 2); $$11++) {
            $$0.a(this.h.h, $$10.get($$11), $$3 + 32 + 3, $$2 + 12 + 9 * $$11, -8355712, false);
         }

         this.a($$0, $$3, $$2, this.j.b());
         if (this.i.g() == gcw.b.b) {
            int $$12 = (int)(ae.c() / 100L + (long)($$1 * 2) & 7L);
            if ($$12 > 4) {
               $$12 = 8 - $$12;
            }
            this.n = switch ($$12) {
               case 1 -> ftt.u;
               case 2 -> ftt.v;
               case 3 -> ftt.w;
               case 4 -> ftt.x;
               default -> ftt.s;
            };
         }

         int $$13 = $$3 + $$4 - 10 - 5;
         if (this.n != null) {
            $$0.a(gir::B, this.n, $$13, $$2, 10, 8);
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

         xi $$15 = (xi)(this.i.g() == gcw.b.d ? this.i.h.f().a(n.m) : this.i.c);
         int $$16 = this.h.h.a($$15);
         int $$17 = $$13 - $$16 - 5;
         $$0.a(this.h.h, $$15, $$17, $$2 + 1, -8355712, false);
         if (this.o != null && $$6 >= $$13 && $$6 <= $$13 + 10 && $$7 >= $$2 && $$7 <= $$2 + 8) {
            this.g.d(this.o);
         } else if (this.m != null && $$6 >= $$17 && $$6 <= $$17 + $$16 && $$7 >= $$2 && $$7 <= $$2 - 1 + 9) {
            this.g.b(Lists.transform(this.m, xi::g));
         }

         if (this.h.n.ab().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$18 = $$6 - $$3;
            int $$19 = $$7 - $$2;
            if (this.e()) {
               if ($$18 < 32 && $$18 > 16) {
                  $$0.a(gir::B, ftt.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gir::B, ftt.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$18 < 16 && $$19 < 16) {
                  $$0.a(gir::B, ftt.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gir::B, ftt.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.g.F().c() - 1) {
               if ($$18 < 16 && $$19 > 16) {
                  $$0.a(gir::B, ftt.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gir::B, ftt.D, $$3, $$2, 32, 32);
               }
            }
         }
      }

      private void d() {
         this.m = null;
         switch (this.i.g()) {
            case a:
            case b:
               this.n = ftt.n;
               this.o = ftt.L;
               break;
            case d:
               this.n = ftt.a;
               this.o = ftt.J;
               this.m = this.i.i;
               break;
            case c:
               this.n = ftt.m;
               this.o = ftt.K;
               break;
            case e:
               if (this.i.f < 150L) {
                  this.n = ftt.r;
               } else if (this.i.f < 300L) {
                  this.n = ftt.q;
               } else if (this.i.f < 600L) {
                  this.n = ftt.p;
               } else if (this.i.f < 1000L) {
                  this.n = ftt.o;
               } else {
                  this.n = ftt.n;
               }

               this.o = xi.a("multiplayer.status.ping", this.i.f);
               this.m = this.i.i;
         }
      }

      public void b() {
         this.g.F().b();
      }

      protected void a(fku $$0, int $$1, int $$2, ali $$3) {
         $$0.a(gir::B, $$3, $$1, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
      }

      private boolean e() {
         return true;
      }

      private boolean a(@Nullable byte[] $$0) {
         if ($$0 == null) {
            this.j.a();
         } else {
            try {
               this.j.a(fdb.a($$0));
            } catch (Throwable var3) {
               ftt.E.error("Invalid icon for server {} ({})", new Object[]{this.i.a, this.i.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fra.t()) {
            ftt $$3 = this.g.s;
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
         ftt.a $$2 = this.g.s.aI_().get($$1);
         this.g.s.a($$2);
         ftt.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)ftt.this.s();
         double $$4 = $$1 - (double)ftt.this.g(ftt.this.aI_().indexOf(this));
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
         if (ae.c() - this.l < 250L) {
            this.g.m();
         }

         this.l = ae.c();
         return super.a($$0, $$1, $$2);
      }

      public gcw c() {
         return this.i;
      }

      @Override
      public xi a() {
         xw $$0 = xi.i();
         $$0.b(xi.a("narrator.select", this.i.a));
         $$0.b(xh.t);
         switch (this.i.g()) {
            case b:
               $$0.b(ftt.L);
               break;
            case d:
               $$0.b(ftt.J);
               $$0.b(xh.t);
               $$0.b(xi.a("multiplayer.status.version.narration", this.i.h));
               $$0.b(xh.t);
               $$0.b(xi.a("multiplayer.status.motd.narration", this.i.d));
               break;
            case c:
               $$0.b(ftt.K);
               break;
            default:
               $$0.b(ftt.M);
               $$0.b(xh.t);
               $$0.b(xi.a("multiplayer.status.ping.narration", this.i.f));
               $$0.b(xh.t);
               $$0.b(xi.a("multiplayer.status.motd.narration", this.i.d));
               if (this.i.e != null) {
                  $$0.b(xh.t);
                  $$0.b(xi.a("multiplayer.status.player_count.narration", this.i.e.b(), this.i.e.a()));
                  $$0.b(xh.t);
                  $$0.b(xl.a(this.i.i, xi.b(", ")));
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
