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

public abstract class ftr extends fpu implements fpc {
   private static final Logger a = LogUtils.getLogger();
   private static final xv b = xv.c("narrator.screen.usage");
   protected static final gkp e = new gkp(alz.b("textures/gui/title/background/panorama"));
   protected static final glh f = new glh(e);
   public static final alz g = alz.b("textures/gui/menu_background.png");
   public static final alz h = alz.b("textures/gui/header_separator.png");
   public static final alz i = alz.b("textures/gui/footer_separator.png");
   private static final alz c = alz.b("textures/gui/inworld_menu_background.png");
   public static final alz j = alz.b("textures/gui/inworld_header_separator.png");
   public static final alz k = alz.b("textures/gui/inworld_footer_separator.png");
   protected final xv l;
   private final List<fpw> d = Lists.newArrayList();
   private final List<fru> s = Lists.newArrayList();
   @Nullable
   protected flz m;
   private boolean u;
   public int n;
   public int o;
   private final List<fpc> v = Lists.newArrayList();
   protected fnj p;
   private static final long w = TimeUnit.SECONDS.toMillis(2L);
   private static final long x = w;
   private static final long y = 750L;
   private static final long z = 200L;
   private static final long A = 200L;
   private final frz B = new frz();
   private long C = Long.MIN_VALUE;
   private long D = Long.MAX_VALUE;
   @Nullable
   protected fof<fmb> q;
   @Nullable
   private fru E;
   @Nullable
   private ftr.a F;
   protected final Executor r = $$0x -> this.m.execute(() -> {
         if (this.m.z == this) {
            $$0x.run();
         }
      });

   protected ftr(xv $$0) {
      this.l = $$0;
   }

   public xv m() {
      return this.l;
   }

   public xv i() {
      return this.m();
   }

   public final void c(fnl $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$1, $$2, $$3);
      if (this.F != null) {
         $$0.a(this.p, this.F.a(), this.F.b(), $$1, $$2);
         this.F = null;
      }
   }

   @Override
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      this.b($$0, $$1, $$2, $$3);

      for (fpc $$4 : this.v) {
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256 && this.aH_()) {
         this.aP_();
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         fsc $$3 = (fsc)(switch ($$0) {
            case 258 -> this.l();
            default -> null;
            case 262 -> this.a(fse.d);
            case 263 -> this.a(fse.c);
            case 264 -> this.a(fse.b);
            case 265 -> this.a(fse.a);
         });
         if ($$3 != null) {
            fni $$4 = super.a($$3);
            if ($$4 == null && $$3 instanceof fsc.c) {
               this.n();
               $$4 = super.a($$3);
            }

            if ($$4 != null) {
               this.a($$4);
            }
         }

         return false;
      }
   }

   private fsc.c l() {
      boolean $$0 = !s();
      return new fsc.c($$0);
   }

   private fsc.a a(fse $$0) {
      return new fsc.a($$0);
   }

   protected void aG_() {
      if (this.m.aY().b()) {
         fsc.c $$0 = new fsc.c(true);
         fni $$1 = super.a($$0);
         if ($$1 != null) {
            this.a($$1);
         }
      }
   }

   protected void b(fpw $$0) {
      fni $$1 = fni.a(this, $$0.a(new fsc.b()));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   public void n() {
      fni $$0 = this.aO_();
      if ($$0 != null) {
         $$0.a(false);
      }
   }

   @VisibleForTesting
   protected void a(fni $$0) {
      this.n();
      $$0.a(true);
   }

   public boolean aH_() {
      return true;
   }

   public void aP_() {
      this.m.a(null);
   }

   protected <T extends fpw & fpc & fru> T c(T $$0) {
      this.v.add($$0);
      return this.d($$0);
   }

   protected <T extends fpc> T a(T $$0) {
      this.v.add($$0);
      return $$0;
   }

   protected <T extends fpw & fru> T d(T $$0) {
      this.d.add($$0);
      this.s.add($$0);
      return $$0;
   }

   protected void e(fpw $$0) {
      if ($$0 instanceof fpc) {
         this.v.remove((fpc)$$0);
      }

      if ($$0 instanceof fru) {
         this.s.remove((fru)$$0);
      }

      this.d.remove($$0);
   }

   protected void o() {
      this.v.clear();
      this.d.clear();
      this.s.clear();
   }

   public static List<xv> a(flz $$0, cxk $$1) {
      return $$1.a(cxg.b.a($$0.s), $$0.t, $$0.n.m ? czc.a.b : czc.a.a);
   }

   protected void a_(String $$0, boolean $$1) {
   }

   public boolean a(@Nullable ys $$0) {
      if ($$0 == null) {
         return false;
      } else {
         xt $$1 = $$0.h();
         if (s()) {
            if ($$0.j() != null) {
               this.a_($$0.j(), false);
            }
         } else if ($$1 != null) {
            if ($$1.a() == xt.a.a) {
               if (!this.m.n.O().c()) {
                  return false;
               }

               try {
                  URI $$2 = ae.a($$1.b());
                  if (this.m.n.P().c()) {
                     this.m.a(new fso($$1x -> {
                        if ($$1x) {
                           ae.m().a($$2);
                        }

                        this.m.a(this);
                     }, $$1.b(), false));
                  } else {
                     ae.m().a($$2);
                  }
               } catch (URISyntaxException var4) {
                  a.error("Can't open url for {}", $$1, var4);
               }
            } else if ($$1.a() == xt.a.b) {
               ae.m().a(new File($$1.b()));
            } else if ($$1.a() == xt.a.d) {
               this.a_(bbb.g($$1.b()), true);
            } else if ($$1.a() == xt.a.c) {
               String $$4 = bbb.g($$1.b());
               if ($$4.startsWith("/")) {
                  if (!this.m.t.i.d($$4.substring(1))) {
                     a.error("Not allowed to run command with signed argument from click event: '{}'", $$4);
                  }
               } else {
                  a.error("Failed to run command without '/' prefix from click event: '{}'", $$4);
               }
            } else if ($$1.a() == xt.a.f) {
               this.m.p.a($$1.b());
            } else {
               a.error("Don't know how to handle {}", $$1);
            }

            return true;
         }

         return false;
      }
   }

   public final void b(flz $$0, int $$1, int $$2) {
      this.m = $$0;
      this.p = $$0.h;
      this.n = $$1;
      this.o = $$2;
      if (!this.u) {
         this.aT_();
         this.aG_();
      } else {
         this.c();
      }

      this.u = true;
      this.d(false);
      this.a(w);
   }

   protected void p() {
      this.o();
      this.n();
      this.aT_();
      this.aG_();
   }

   @Override
   public List<? extends fpw> aI_() {
      return this.d;
   }

   protected void aT_() {
   }

   public void e() {
   }

   public void aJ_() {
   }

   public void aK_() {
   }

   public void b(fnl $$0, int $$1, int $$2, float $$3) {
      if (this.m.s == null) {
         this.a($$0, $$3);
      }

      this.q();
      this.a($$0);
   }

   protected void q() {
      this.m.j.d();
      this.m.h().a(false);
   }

   protected void a(fnl $$0, float $$1) {
      f.a($$0, this.n, this.o, 1.0F, $$1);
   }

   protected void a(fnl $$0) {
      this.a($$0, 0, 0, this.n, this.o);
   }

   protected void a(fnl $$0, int $$1, int $$2, int $$3, int $$4) {
      a($$0, this.m.s == null ? g : c, $$1, $$2, 0.0F, 0.0F, $$3, $$4);
   }

   public static void a(fnl $$0, alz $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7) {
      int $$8 = 32;
      $$0.a(glo::B, $$1, $$2, $$3, $$4, $$5, $$6, $$7, 32, 32);
   }

   public void b(fnl $$0) {
      $$0.b(0, 0, this.n, this.o, -1072689136, -804253680);
   }

   public boolean j() {
      return true;
   }

   public static boolean r() {
      return flz.a ? ffg.a(flz.Q().aO().h(), 343) || ffg.a(flz.Q().aO().h(), 347) : ffg.a(flz.Q().aO().h(), 341) || ffg.a(flz.Q().aO().h(), 345);
   }

   public static boolean s() {
      return ffg.a(flz.Q().aO().h(), 340) || ffg.a(flz.Q().aO().h(), 344);
   }

   public static boolean t() {
      return ffg.a(flz.Q().aO().h(), 342) || ffg.a(flz.Q().aO().h(), 346);
   }

   public static boolean c(int $$0) {
      return $$0 == 88 && r() && !s() && !t();
   }

   public static boolean d(int $$0) {
      return $$0 == 86 && r() && !s() && !t();
   }

   public static boolean e(int $$0) {
      return $$0 == 67 && r() && !s() && !t();
   }

   public static boolean f(int $$0) {
      return $$0 == 65 && r() && !s() && !t();
   }

   protected void c() {
      this.p();
   }

   public void a(flz $$0, int $$1, int $$2) {
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
      this.D = ae.c() + $$0;
      if ($$1) {
         this.C = Long.MIN_VALUE;
      }
   }

   private void a(long $$0) {
      this.C = ae.c() + $$0;
   }

   public void u() {
      this.a(750L, false);
   }

   public void v() {
      this.a(200L, true);
   }

   public void x() {
      this.a(200L, true);
   }

   private boolean E() {
      return this.m.aZ().a();
   }

   public void y() {
      if (this.E()) {
         long $$0 = ae.c();
         if ($$0 > this.D && $$0 > this.C) {
            this.c(true);
            this.D = Long.MAX_VALUE;
         }
      }
   }

   public void d(boolean $$0) {
      if (this.E()) {
         this.c($$0);
      }
   }

   private void c(boolean $$0) {
      this.B.a(this::a);
      String $$1 = this.B.a(!$$0);
      if (!$$1.isEmpty()) {
         this.m.aZ().a($$1);
      }
   }

   protected boolean aS_() {
      return true;
   }

   protected void a(frw $$0) {
      $$0.a(frv.a, this.i());
      if (this.aS_()) {
         $$0.a(frv.d, b);
      }

      this.b($$0);
   }

   protected void b(frw $$0) {
      List<fru> $$1 = this.s.stream().filter(fru::C).sorted(Comparator.comparingInt(fpj::I)).toList();
      ftr.b $$2 = a($$1, this.E);
      if ($$2 != null) {
         if ($$2.c.a()) {
            this.E = $$2.a;
         }

         if ($$1.size() > 1) {
            $$0.a(frv.b, xv.a("narrator.position.screen", $$2.b + 1, $$1.size()));
            if ($$2.c == fru.a.c) {
               $$0.a(frv.d, this.z());
            }
         }

         $$2.a.b($$0.a());
      }
   }

   protected xv z() {
      return xv.c("narration.component_list.usage");
   }

   @Nullable
   public static ftr.b a(List<? extends fru> $$0, @Nullable fru $$1) {
      ftr.b $$2 = null;
      ftr.b $$3 = null;
      int $$4 = 0;

      for (int $$5 = $$0.size(); $$4 < $$5; $$4++) {
         fru $$6 = $$0.get($$4);
         fru.a $$7 = $$6.u();
         if ($$7.a()) {
            if ($$6 != $$1) {
               return new ftr.b($$6, $$4, $$7);
            }

            $$3 = new ftr.b($$6, $$4, $$7);
         } else if ($$7.compareTo($$2 != null ? $$2.c : fru.a.a) > 0) {
            $$2 = new ftr.b($$6, $$4, $$7);
         }
      }

      return $$2 != null ? $$2 : $$3;
   }

   public void e(boolean $$0) {
      if ($$0) {
         this.a(x, false);
      }

      if (this.q != null) {
         this.q.a(this.m.n.av().c());
      }
   }

   protected void A() {
      this.F = null;
   }

   public void b(List<azq> $$0) {
      this.a($$0, fwd.a, true);
   }

   public void a(List<azq> $$0, fwc $$1, boolean $$2) {
      if (this.F == null || $$2) {
         this.F = new ftr.a($$0, $$1);
      }
   }

   public void d(xv $$0) {
      this.b(fpk.a(this.m, $$0));
   }

   public void a(fpk $$0, fwc $$1, boolean $$2) {
      this.a($$0.a(this.m), $$1, $$2);
   }

   public fnj B() {
      return this.p;
   }

   public boolean C() {
      return false;
   }

   @Override
   public fsg H() {
      return new fsg(0, 0, this.n, this.o);
   }

   @Nullable
   public axc D() {
      return null;
   }

   static record a(List<azq> a, fwc b) {
   }

   public static class b {
      public final fru a;
      public final int b;
      public final fru.a c;

      public b(fru $$0, int $$1, fru.a $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
