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

public class fjj extends fbg<fjj.a> {
   static final ajc a = new ajc("server_list/incompatible");
   static final ajc m = new ajc("server_list/unreachable");
   static final ajc n = new ajc("server_list/ping_1");
   static final ajc o = new ajc("server_list/ping_2");
   static final ajc p = new ajc("server_list/ping_3");
   static final ajc q = new ajc("server_list/ping_4");
   static final ajc r = new ajc("server_list/ping_5");
   static final ajc t = new ajc("server_list/pinging_1");
   static final ajc u = new ajc("server_list/pinging_2");
   static final ajc v = new ajc("server_list/pinging_3");
   static final ajc w = new ajc("server_list/pinging_4");
   static final ajc x = new ajc("server_list/pinging_5");
   static final ajc y = new ajc("server_list/join_highlighted");
   static final ajc z = new ajc("server_list/join");
   static final ajc A = new ajc("server_list/move_up_highlighted");
   static final ajc B = new ajc("server_list/move_up");
   static final ajc C = new ajc("server_list/move_down_highlighted");
   static final ajc D = new ajc("server_list/move_down");
   static final Logger E = LogUtils.getLogger();
   static final ThreadPoolExecutor F = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new r(E)).build()
   );
   static final vs G = vs.c("lanServer.scanning");
   static final vs H = vs.c("multiplayer.status.cannot_resolve").b(-65536);
   static final vs I = vs.c("multiplayer.status.cannot_connect").b(-65536);
   static final vs J = vs.c("multiplayer.status.incompatible");
   static final vs K = vs.c("multiplayer.status.no_connection");
   static final vs L = vs.c("multiplayer.status.pinging");
   static final vs M = vs.c("multiplayer.status.online");
   private final fjf N;
   private final List<fjj.d> O = Lists.newArrayList();
   private final fjj.a P = new fjj.b();
   private final List<fjj.c> Q = Lists.newArrayList();

   public fjj(fjf $$0, eyk $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.N = $$0;
   }

   private void e() {
      this.m();
      this.O.forEach($$1 -> this.b($$1));
      this.b(this.P);
      this.Q.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable fjj.a $$0) {
      super.a($$0);
      this.N.E();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      fjj.a $$3 = this.i();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(fro $$0) {
      this.O.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.O.add(new fjj.d(this.N, $$0.a($$1)));
      }

      this.e();
   }

   public void a(List<gme> $$0) {
      int $$1 = $$0.size() - this.Q.size();
      this.Q.clear();

      for (gme $$2 : $$0) {
         this.Q.add(new fjj.c(this.N, $$2));
      }

      this.e();

      for (int $$3 = this.Q.size() - $$1; $$3 < this.Q.size(); $$3++) {
         fjj.c $$4 = this.Q.get($$3);
         int $$5 = $$3 - this.Q.size() + this.l().size();
         int $$6 = this.g($$5);
         int $$7 = this.h($$5);
         if ($$7 >= this.C() && $$6 <= this.E()) {
            this.c.aX().b(vs.a("multiplayer.lan.server_found", $$4.c()));
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

   public abstract static class a extends fbg.a<fjj.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fjj.a {
      private final eyk a = eyk.P();

      @Override
      public void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(this.a.h, fjj.G, this.a.y.g / 2 - this.a.h.a(fjj.G) / 2, $$10, 16777215, false);
         String $$11 = ffs.a(ac.b());
         $$0.a(this.a.h, $$11, this.a.y.g / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712, false);
      }

      @Override
      public vs a() {
         return fjj.G;
      }
   }

   public static class c extends fjj.a {
      private static final int c = 32;
      private static final vs d = vs.c("lanServer.title");
      private static final vs e = vs.c("selectServer.hiddenAddress");
      private final fjf f;
      protected final eyk a;
      protected final gme b;
      private long g;

      protected c(fjf $$0, gme $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = eyk.P();
      }

      @Override
      public void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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

      public gme b() {
         return this.b;
      }

      @Override
      public vs a() {
         return vs.a("narrator.select", this.c());
      }

      public vs c() {
         return vs.i().b(d).b(vr.v).f(this.b.a());
      }
   }

   public class d extends fjj.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 5;
      private static final int e = 10;
      private static final int f = 8;
      private final fjf g;
      private final eyk h;
      private final frn i;
      private final ffm j;
      @Nullable
      private byte[] k;
      private long l;
      @Nullable
      private List<vs> m;
      @Nullable
      private ajc n;
      @Nullable
      private vs o;

      protected d(fjf $$1, frn $$2) {
         this.g = $$1;
         this.i = $$2;
         this.h = eyk.P();
         this.j = ffm.b(this.h.Z(), $$2.b);
         this.d();
      }

      @Override
      public void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.g() == frn.b.a) {
            this.i.a(frn.b.b);
            this.i.d = vr.a;
            this.i.c = vr.a;
            fjj.F.submit(() -> {
               try {
                  this.g.H().a(this.i, () -> this.h.execute(this::b), () -> {
                     this.i.a(this.i.g == aa.b().e() ? frn.b.e : frn.b.d);
                     this.h.execute(this::d);
                  });
               } catch (UnknownHostException var2x) {
                  this.i.a(frn.b.c);
                  this.i.d = fjj.H;
                  this.h.execute(this::d);
               } catch (Exception var3x) {
                  this.i.a(frn.b.c);
                  this.i.d = fjj.I;
                  this.h.execute(this::d);
               }
            });
         }

         $$0.a(this.h.h, this.i.a, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         List<avy> $$10 = this.h.h.c(this.i.d, $$4 - 32 - 2);

         for (int $$11 = 0; $$11 < Math.min($$10.size(), 2); $$11++) {
            $$0.a(this.h.h, $$10.get($$11), $$3 + 32 + 3, $$2 + 12 + 9 * $$11, -8355712, false);
         }

         this.a($$0, $$3, $$2, this.j.b());
         if (this.i.g() == frn.b.b) {
            int $$12 = (int)(ac.b() / 100L + (long)($$1 * 2) & 7L);
            if ($$12 > 4) {
               $$12 = 8 - $$12;
            }
            this.n = switch ($$12) {
               case 1 -> fjj.u;
               case 2 -> fjj.v;
               case 3 -> fjj.w;
               case 4 -> fjj.x;
               default -> fjj.t;
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

         vs $$15 = (vs)(this.i.g() == frn.b.d ? this.i.h.f().a(n.m) : this.i.c);
         int $$16 = this.h.h.a($$15);
         int $$17 = $$13 - $$16 - 5;
         $$0.a(this.h.h, $$15, $$17, $$2 + 1, -8355712, false);
         if (this.o != null && $$6 >= $$13 && $$6 <= $$13 + 10 && $$7 >= $$2 && $$7 <= $$2 + 8) {
            this.g.d(this.o);
         } else if (this.m != null && $$6 >= $$17 && $$6 <= $$17 + $$16 && $$7 >= $$2 && $$7 <= $$2 - 1 + 9) {
            this.g.b(Lists.transform(this.m, vs::g));
         }

         if (this.h.m.W().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$18 = $$6 - $$3;
            int $$19 = $$7 - $$2;
            if (this.e()) {
               if ($$18 < 32 && $$18 > 16) {
                  $$0.a(fjj.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fjj.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$18 < 16 && $$19 < 16) {
                  $$0.a(fjj.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fjj.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.g.I().c() - 1) {
               if ($$18 < 16 && $$19 > 16) {
                  $$0.a(fjj.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(fjj.D, $$3, $$2, 32, 32);
               }
            }
         }
      }

      private void d() {
         this.m = null;
         switch (this.i.g()) {
            case a:
            case b:
               this.n = fjj.n;
               this.o = fjj.L;
               break;
            case d:
               this.n = fjj.a;
               this.o = fjj.J;
               this.m = this.i.i;
               break;
            case c:
               this.n = fjj.m;
               this.o = fjj.K;
               break;
            case e:
               if (this.i.f < 150L) {
                  this.n = fjj.r;
               } else if (this.i.f < 300L) {
                  this.n = fjj.q;
               } else if (this.i.f < 600L) {
                  this.n = fjj.p;
               } else if (this.i.f < 1000L) {
                  this.n = fjj.o;
               } else {
                  this.n = fjj.n;
               }

               this.o = vs.a("multiplayer.status.ping", this.i.f);
               this.m = this.i.i;
         }
      }

      public void b() {
         this.g.I().b();
      }

      protected void a(ezx $$0, int $$1, int $$2, ajc $$3) {
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
               this.j.a(ese.a($$0));
            } catch (Throwable var3) {
               fjj.E.error("Invalid icon for server {} ({})", new Object[]{this.i.a, this.i.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fgh.v()) {
            fjj $$3 = this.g.l;
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
         fjj.a $$2 = this.g.l.l().get($$1);
         this.g.l.a($$2);
         fjj.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)fjj.this.q();
         double $$4 = $$1 - (double)fjj.this.g(fjj.this.l().indexOf(this));
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

      public frn c() {
         return this.i;
      }

      @Override
      public vs a() {
         wg $$0 = vs.i();
         $$0.b(vs.a("narrator.select", this.i.a));
         $$0.b(vr.t);
         switch (this.i.g()) {
            case b:
               $$0.b(fjj.L);
               break;
            case d:
               $$0.b(fjj.J);
               $$0.b(vr.t);
               $$0.b(vs.a("multiplayer.status.version.narration", this.i.h));
               $$0.b(vr.t);
               $$0.b(vs.a("multiplayer.status.motd.narration", this.i.d));
               break;
            case c:
               $$0.b(fjj.K);
               break;
            default:
               $$0.b(fjj.M);
               $$0.b(vr.t);
               $$0.b(vs.a("multiplayer.status.ping.narration", this.i.f));
               $$0.b(vr.t);
               $$0.b(vs.a("multiplayer.status.motd.narration", this.i.d));
               if (this.i.e != null) {
                  $$0.b(vr.t);
                  $$0.b(vs.a("multiplayer.status.player_count.narration", this.i.e.b(), this.i.e.a()));
                  $$0.b(vr.t);
                  $$0.b(vv.a(this.i.i, vs.b(", ")));
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
