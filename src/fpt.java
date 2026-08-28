import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class fpt extends flv implements fld {
   private static final Logger a = LogUtils.getLogger();
   private static final xd b = xd.c("narrator.screen.usage");
   protected static final ggf e = new ggf(alb.b("textures/gui/title/background/panorama"));
   protected static final ggx f = new ggx(e);
   public static final alb g = alb.b("textures/gui/menu_background.png");
   public static final alb h = alb.b("textures/gui/header_separator.png");
   public static final alb i = alb.b("textures/gui/footer_separator.png");
   private static final alb c = alb.b("textures/gui/inworld_menu_background.png");
   public static final alb j = alb.b("textures/gui/inworld_header_separator.png");
   public static final alb k = alb.b("textures/gui/inworld_footer_separator.png");
   protected final xd l;
   private final List<flx> d = Lists.newArrayList();
   private final List<fnv> s = Lists.newArrayList();
   @Nullable
   protected fib m;
   private boolean u;
   public int n;
   public int o;
   private final List<fld> v = Lists.newArrayList();
   protected fjl p;
   private static final long w = TimeUnit.SECONDS.toMillis(2L);
   private static final long x = w;
   private static final long y = 750L;
   private static final long z = 200L;
   private static final long A = 200L;
   private final foa B = new foa();
   private long C = Long.MIN_VALUE;
   private long D = Long.MAX_VALUE;
   @Nullable
   protected fkh<fid> q;
   @Nullable
   private fnv E;
   @Nullable
   private fpt.a F;
   protected final Executor r = $$0x -> this.m.execute(() -> {
         if (this.m.z == this) {
            $$0x.run();
         }
      });

   protected fpt(xd $$0) {
      this.l = $$0;
   }

   public xd n() {
      return this.l;
   }

   public xd i() {
      return this.n();
   }

   public final void c(fjn $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$1, $$2, $$3);
      if (this.F != null) {
         $$0.a(this.p, this.F.a(), this.F.b(), $$1, $$2);
         this.F = null;
      }
   }

   @Override
   public void a(fjn $$0, int $$1, int $$2, float $$3) {
      this.b($$0, $$1, $$2, $$3);

      for (fld $$4 : this.v) {
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256 && this.aJ_()) {
         this.d();
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         fod $$3 = (fod)(switch ($$0) {
            case 258 -> this.m();
            default -> null;
            case 262 -> this.a(fof.d);
            case 263 -> this.a(fof.c);
            case 264 -> this.a(fof.b);
            case 265 -> this.a(fof.a);
         });
         if ($$3 != null) {
            fjk $$4 = super.a($$3);
            if ($$4 == null && $$3 instanceof fod.c) {
               this.o();
               $$4 = super.a($$3);
            }

            if ($$4 != null) {
               this.a($$4);
            }
         }

         return false;
      }
   }

   private fod.c m() {
      boolean $$0 = !t();
      return new fod.c($$0);
   }

   private fod.a a(fof $$0) {
      return new fod.a($$0);
   }

   protected void aI_() {
      if (this.m.aX().b()) {
         fod.c $$0 = new fod.c(true);
         fjk $$1 = super.a($$0);
         if ($$1 != null) {
            this.a($$1);
         }
      }
   }

   protected void b(flx $$0) {
      fjk $$1 = fjk.a(this, $$0.a(new fod.b()));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   public void o() {
      fjk $$0 = this.aP_();
      if ($$0 != null) {
         $$0.a(false);
      }
   }

   @VisibleForTesting
   protected void a(fjk $$0) {
      this.o();
      $$0.a(true);
   }

   public boolean aJ_() {
      return true;
   }

   public void d() {
      this.m.a(null);
   }

   protected <T extends flx & fld & fnv> T c(T $$0) {
      this.v.add($$0);
      return this.d($$0);
   }

   protected <T extends fld> T a(T $$0) {
      this.v.add($$0);
      return $$0;
   }

   protected <T extends flx & fnv> T d(T $$0) {
      this.d.add($$0);
      this.s.add($$0);
      return $$0;
   }

   protected void e(flx $$0) {
      if ($$0 instanceof fld) {
         this.v.remove((fld)$$0);
      }

      if ($$0 instanceof fnv) {
         this.s.remove((fnv)$$0);
      }

      this.d.remove($$0);
   }

   protected void p() {
      this.v.clear();
      this.d.clear();
      this.s.clear();
   }

   public static List<xd> a(fib $$0, cvl $$1) {
      return $$1.a(cvg.b.a($$0.s), $$0.t, $$0.n.m ? cxf.a.b : cxf.a.a);
   }

   protected void a_(String $$0, boolean $$1) {
   }

   public boolean a(@Nullable ya $$0) {
      if ($$0 == null) {
         return false;
      } else {
         xb $$1 = $$0.h();
         if (t()) {
            if ($$0.j() != null) {
               this.a_($$0.j(), false);
            }
         } else if ($$1 != null) {
            if ($$1.a() == xb.a.a) {
               if (!this.m.n.N().c()) {
                  return false;
               }

               try {
                  URI $$2 = ad.a($$1.b());
                  if (this.m.n.O().c()) {
                     this.m.a(new fop($$1x -> {
                        if ($$1x) {
                           ad.m().a($$2);
                        }

                        this.m.a(this);
                     }, $$1.b(), false));
                  } else {
                     ad.m().a($$2);
                  }
               } catch (URISyntaxException var4) {
                  a.error("Can't open url for {}", $$1, var4);
               }
            } else if ($$1.a() == xb.a.b) {
               ad.m().a(new File($$1.b()));
            } else if ($$1.a() == xb.a.d) {
               this.a_(azz.g($$1.b()), true);
            } else if ($$1.a() == xb.a.c) {
               String $$4 = azz.g($$1.b());
               if ($$4.startsWith("/")) {
                  if (!this.m.t.cx.d($$4.substring(1))) {
                     a.error("Not allowed to run command with signed argument from click event: '{}'", $$4);
                  }
               } else {
                  a.error("Failed to run command without '/' prefix from click event: '{}'", $$4);
               }
            } else if ($$1.a() == xb.a.f) {
               this.m.p.a($$1.b());
            } else {
               a.error("Don't know how to handle {}", $$1);
            }

            return true;
         }

         return false;
      }
   }

   public final void b(fib $$0, int $$1, int $$2) {
      this.m = $$0;
      this.p = $$0.h;
      this.n = $$1;
      this.o = $$2;
      if (!this.u) {
         this.aT_();
         this.aI_();
      } else {
         this.c();
      }

      this.u = true;
      this.d(false);
      this.a(w);
   }

   protected void q() {
      this.p();
      this.o();
      this.aT_();
      this.aI_();
   }

   @Override
   public List<? extends flx> aK_() {
      return this.d;
   }

   protected void aT_() {
   }

   public void e() {
   }

   public void j() {
   }

   public void aL_() {
   }

   public void b(fjn $$0, int $$1, int $$2, float $$3) {
      if (this.m.s == null) {
         this.a($$0, $$3);
      }

      this.r();
      this.a($$0);
   }

   protected void r() {
      this.m.j.d();
      this.m.h().a(false);
   }

   protected void a(fjn $$0, float $$1) {
      f.a($$0, this.n, this.o, 1.0F, $$1);
   }

   protected void a(fjn $$0) {
      this.a($$0, 0, 0, this.n, this.o);
   }

   protected void a(fjn $$0, int $$1, int $$2, int $$3, int $$4) {
      a($$0, this.m.s == null ? g : c, $$1, $$2, 0.0F, 0.0F, $$3, $$4);
   }

   public static void a(fjn $$0, alb $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7) {
      int $$8 = 32;
      $$0.a(ghe::C, $$1, $$2, $$3, $$4, $$5, $$6, $$7, 32, 32);
   }

   public void b(fjn $$0) {
      $$0.b(0, 0, this.n, this.o, -1072689136, -804253680);
   }

   public boolean k() {
      return true;
   }

   public static boolean s() {
      return fib.a ? fbk.a(fib.Q().aO().i(), 343) || fbk.a(fib.Q().aO().i(), 347) : fbk.a(fib.Q().aO().i(), 341) || fbk.a(fib.Q().aO().i(), 345);
   }

   public static boolean t() {
      return fbk.a(fib.Q().aO().i(), 340) || fbk.a(fib.Q().aO().i(), 344);
   }

   public static boolean u() {
      return fbk.a(fib.Q().aO().i(), 342) || fbk.a(fib.Q().aO().i(), 346);
   }

   public static boolean c(int $$0) {
      return $$0 == 88 && s() && !t() && !u();
   }

   public static boolean d(int $$0) {
      return $$0 == 86 && s() && !t() && !u();
   }

   public static boolean e(int $$0) {
      return $$0 == 67 && s() && !t() && !u();
   }

   public static boolean f(int $$0) {
      return $$0 == 65 && s() && !t() && !u();
   }

   protected void c() {
      this.q();
   }

   public void a(fib $$0, int $$1, int $$2) {
      this.n = $$1;
      this.o = $$2;
      this.c();
   }

   public static void a(Runnable $$0, String $$1, String $$2) {
      try {
         $$0.run();
      } catch (Throwable var6) {
         o $$4 = o.a(var6, $$1);
         p $$5 = $$4.a("Affected screen");
         $$5.a("Screen name", () -> $$2);
         throw new z($$4);
      }
   }

   protected boolean a(String $$0, char $$1, int $$2) {
      int $$3 = $$0.indexOf(58);
      int $$4 = $$0.indexOf(47);
      if ($$1 == ':') {
         return ($$4 == -1 || $$2 <= $$4) && $$3 == -1;
      } else {
         return $$1 == '/' ? $$2 > $$3 : $$1 == '_' || $$1 == '-' || $$1 >= 'a' && $$1 <= 'z' || $$1 >= '0' && $$1 <= '9' || $$1 == '.';
      }
   }

   @Override
   public boolean c(double $$0, double $$1) {
      return true;
   }

   public void a(List<Path> $$0) {
   }

   private void a(long $$0, boolean $$1) {
      this.D = ad.c() + $$0;
      if ($$1) {
         this.C = Long.MIN_VALUE;
      }
   }

   private void a(long $$0) {
      this.C = ad.c() + $$0;
   }

   public void v() {
      this.a(750L, false);
   }

   public void x() {
      this.a(200L, true);
   }

   public void y() {
      this.a(200L, true);
   }

   private boolean D() {
      return this.m.aY().a();
   }

   public void z() {
      if (this.D()) {
         long $$0 = ad.c();
         if ($$0 > this.D && $$0 > this.C) {
            this.c(true);
            this.D = Long.MAX_VALUE;
         }
      }
   }

   public void d(boolean $$0) {
      if (this.D()) {
         this.c($$0);
      }
   }

   private void c(boolean $$0) {
      this.B.a(this::a);
      String $$1 = this.B.a(!$$0);
      if (!$$1.isEmpty()) {
         this.m.aY().a($$1);
      }
   }

   protected boolean aS_() {
      return true;
   }

   protected void a(fnx $$0) {
      $$0.a(fnw.a, this.i());
      if (this.aS_()) {
         $$0.a(fnw.d, b);
      }

      this.b($$0);
   }

   protected void b(fnx $$0) {
      List<fnv> $$1 = this.s.stream().filter(fnv::C).sorted(Comparator.comparingInt(flk::I)).toList();
      fpt.b $$2 = a($$1, this.E);
      if ($$2 != null) {
         if ($$2.c.a()) {
            this.E = $$2.a;
         }

         if ($$1.size() > 1) {
            $$0.a(fnw.b, xd.a("narrator.position.screen", $$2.b + 1, $$1.size()));
            if ($$2.c == fnv.a.c) {
               $$0.a(fnw.d, this.A());
            }
         }

         $$2.a.b($$0.a());
      }
   }

   protected xd A() {
      return xd.c("narration.component_list.usage");
   }

   @Nullable
   public static fpt.b a(List<? extends fnv> $$0, @Nullable fnv $$1) {
      fpt.b $$2 = null;
      fpt.b $$3 = null;
      int $$4 = 0;

      for (int $$5 = $$0.size(); $$4 < $$5; $$4++) {
         fnv $$6 = $$0.get($$4);
         fnv.a $$7 = $$6.u();
         if ($$7.a()) {
            if ($$6 != $$1) {
               return new fpt.b($$6, $$4, $$7);
            }

            $$3 = new fpt.b($$6, $$4, $$7);
         } else if ($$7.compareTo($$2 != null ? $$2.c : fnv.a.a) > 0) {
            $$2 = new fpt.b($$6, $$4, $$7);
         }
      }

      return $$2 != null ? $$2 : $$3;
   }

   public void e(boolean $$0) {
      if ($$0) {
         this.a(x, false);
      }

      if (this.q != null) {
         this.q.a(this.m.n.au().c());
      }
   }

   protected void B() {
      this.F = null;
   }

   public void b(List<ayo> $$0) {
      this.a($$0, fse.a, true);
   }

   public void a(List<ayo> $$0, fsd $$1, boolean $$2) {
      if (this.F == null || $$2) {
         this.F = new fpt.a($$0, $$1);
      }
   }

   public void d(xd $$0) {
      this.b(fll.a(this.m, $$0));
   }

   public void a(fll $$0, fsd $$1, boolean $$2) {
      this.a($$0.a(this.m), $$1, $$2);
   }

   @Override
   public foh H() {
      return new foh(0, 0, this.n, this.o);
   }

   @Nullable
   public awa C() {
      return null;
   }

   static record a(List<ayo> a, fsd b) {
   }

   public static class b {
      public final fnv a;
      public final int b;
      public final fnv.a c;

      public b(fnv $$0, int $$1, fnv.a $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
