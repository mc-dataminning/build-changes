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

public abstract class ftw extends fpz implements fph {
   private static final Logger a = LogUtils.getLogger();
   private static final xv b = xv.c("narrator.screen.usage");
   protected static final gku e = new gku(alz.b("textures/gui/title/background/panorama"));
   protected static final glm f = new glm(e);
   public static final alz g = alz.b("textures/gui/menu_background.png");
   public static final alz h = alz.b("textures/gui/header_separator.png");
   public static final alz i = alz.b("textures/gui/footer_separator.png");
   private static final alz c = alz.b("textures/gui/inworld_menu_background.png");
   public static final alz j = alz.b("textures/gui/inworld_header_separator.png");
   public static final alz k = alz.b("textures/gui/inworld_footer_separator.png");
   protected final xv l;
   private final List<fqb> d = Lists.newArrayList();
   private final List<frz> s = Lists.newArrayList();
   @Nullable
   protected fme m;
   private boolean u;
   public int n;
   public int o;
   private final List<fph> v = Lists.newArrayList();
   protected fno p;
   private static final long w = TimeUnit.SECONDS.toMillis(2L);
   private static final long x = w;
   private static final long y = 750L;
   private static final long z = 200L;
   private static final long A = 200L;
   private final fse B = new fse();
   private long C = Long.MIN_VALUE;
   private long D = Long.MAX_VALUE;
   @Nullable
   protected fok<fmg> q;
   @Nullable
   private frz E;
   @Nullable
   private ftw.a F;
   protected final Executor r = $$0x -> this.m.execute(() -> {
         if (this.m.z == this) {
            $$0x.run();
         }
      });

   protected ftw(xv $$0) {
      this.l = $$0;
   }

   public xv m() {
      return this.l;
   }

   public xv i() {
      return this.m();
   }

   public final void c(fnq $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$1, $$2, $$3);
      if (this.F != null) {
         $$0.a(this.p, this.F.a(), this.F.b(), $$1, $$2);
         this.F = null;
      }
   }

   @Override
   public void a(fnq $$0, int $$1, int $$2, float $$3) {
      this.b($$0, $$1, $$2, $$3);

      for (fph $$4 : this.v) {
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
         fsh $$3 = (fsh)(switch ($$0) {
            case 258 -> this.l();
            default -> null;
            case 262 -> this.a(fsj.d);
            case 263 -> this.a(fsj.c);
            case 264 -> this.a(fsj.b);
            case 265 -> this.a(fsj.a);
         });
         if ($$3 != null) {
            fnn $$4 = super.a($$3);
            if ($$4 == null && $$3 instanceof fsh.c) {
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

   private fsh.c l() {
      boolean $$0 = !s();
      return new fsh.c($$0);
   }

   private fsh.a a(fsj $$0) {
      return new fsh.a($$0);
   }

   protected void aG_() {
      if (this.m.aY().b()) {
         fsh.c $$0 = new fsh.c(true);
         fnn $$1 = super.a($$0);
         if ($$1 != null) {
            this.a($$1);
         }
      }
   }

   protected void b(fqb $$0) {
      fnn $$1 = fnn.a(this, $$0.a(new fsh.b()));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   public void n() {
      fnn $$0 = this.aO_();
      if ($$0 != null) {
         $$0.a(false);
      }
   }

   @VisibleForTesting
   protected void a(fnn $$0) {
      this.n();
      $$0.a(true);
   }

   public boolean aH_() {
      return true;
   }

   public void aP_() {
      this.m.a(null);
   }

   protected <T extends fqb & fph & frz> T c(T $$0) {
      this.v.add($$0);
      return this.d($$0);
   }

   protected <T extends fph> T a(T $$0) {
      this.v.add($$0);
      return $$0;
   }

   protected <T extends fqb & frz> T d(T $$0) {
      this.d.add($$0);
      this.s.add($$0);
      return $$0;
   }

   protected void e(fqb $$0) {
      if ($$0 instanceof fph) {
         this.v.remove((fph)$$0);
      }

      if ($$0 instanceof frz) {
         this.s.remove((frz)$$0);
      }

      this.d.remove($$0);
   }

   protected void o() {
      this.v.clear();
      this.d.clear();
      this.s.clear();
   }

   public static List<xv> a(fme $$0, cxo $$1) {
      return $$1.a(cxk.b.a($$0.s), $$0.t, $$0.n.m ? czg.a.b : czg.a.a);
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
                     this.m.a(new fst($$1x -> {
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

   public final void b(fme $$0, int $$1, int $$2) {
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
   public List<? extends fqb> aI_() {
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

   public void b(fnq $$0, int $$1, int $$2, float $$3) {
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

   protected void a(fnq $$0, float $$1) {
      f.a($$0, this.n, this.o, 1.0F, $$1);
   }

   protected void a(fnq $$0) {
      this.a($$0, 0, 0, this.n, this.o);
   }

   protected void a(fnq $$0, int $$1, int $$2, int $$3, int $$4) {
      a($$0, this.m.s == null ? g : c, $$1, $$2, 0.0F, 0.0F, $$3, $$4);
   }

   public static void a(fnq $$0, alz $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7) {
      int $$8 = 32;
      $$0.a(glt::B, $$1, $$2, $$3, $$4, $$5, $$6, $$7, 32, 32);
   }

   public void b(fnq $$0) {
      $$0.b(0, 0, this.n, this.o, -1072689136, -804253680);
   }

   public boolean j() {
      return true;
   }

   public static boolean r() {
      return fme.a ? ffl.a(fme.Q().aO().h(), 343) || ffl.a(fme.Q().aO().h(), 347) : ffl.a(fme.Q().aO().h(), 341) || ffl.a(fme.Q().aO().h(), 345);
   }

   public static boolean s() {
      return ffl.a(fme.Q().aO().h(), 340) || ffl.a(fme.Q().aO().h(), 344);
   }

   public static boolean t() {
      return ffl.a(fme.Q().aO().h(), 342) || ffl.a(fme.Q().aO().h(), 346);
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

   public void a(fme $$0, int $$1, int $$2) {
      this.n = $$1;
      this.o = $$2;
      this.c();
   }

   public void a(o $$0) {
      p $$1 = $$0.a("Affected screen", 1);
      $$1.a("Screen name", () -> this.getClass().getCanonicalName());
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

   protected void a(fsb $$0) {
      $$0.a(fsa.a, this.i());
      if (this.aS_()) {
         $$0.a(fsa.d, b);
      }

      this.b($$0);
   }

   protected void b(fsb $$0) {
      List<frz> $$1 = this.s.stream().filter(frz::C).sorted(Comparator.comparingInt(fpo::I)).toList();
      ftw.b $$2 = a($$1, this.E);
      if ($$2 != null) {
         if ($$2.c.a()) {
            this.E = $$2.a;
         }

         if ($$1.size() > 1) {
            $$0.a(fsa.b, xv.a("narrator.position.screen", $$2.b + 1, $$1.size()));
            if ($$2.c == frz.a.c) {
               $$0.a(fsa.d, this.z());
            }
         }

         $$2.a.b($$0.a());
      }
   }

   protected xv z() {
      return xv.c("narration.component_list.usage");
   }

   @Nullable
   public static ftw.b a(List<? extends frz> $$0, @Nullable frz $$1) {
      ftw.b $$2 = null;
      ftw.b $$3 = null;
      int $$4 = 0;

      for (int $$5 = $$0.size(); $$4 < $$5; $$4++) {
         frz $$6 = $$0.get($$4);
         frz.a $$7 = $$6.u();
         if ($$7.a()) {
            if ($$6 != $$1) {
               return new ftw.b($$6, $$4, $$7);
            }

            $$3 = new ftw.b($$6, $$4, $$7);
         } else if ($$7.compareTo($$2 != null ? $$2.c : frz.a.a) > 0) {
            $$2 = new ftw.b($$6, $$4, $$7);
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
      this.a($$0, fwi.a, true);
   }

   public void a(List<azq> $$0, fwh $$1, boolean $$2) {
      if (this.F == null || $$2) {
         this.F = new ftw.a($$0, $$1);
      }
   }

   public void d(xv $$0) {
      this.b(fpp.a(this.m, $$0));
   }

   public void a(fpp $$0, fwh $$1, boolean $$2) {
      this.a($$0.a(this.m), $$1, $$2);
   }

   public fno B() {
      return this.p;
   }

   public boolean C() {
      return false;
   }

   @Override
   public fsl H() {
      return new fsl(0, 0, this.n, this.o);
   }

   @Nullable
   public axc D() {
      return null;
   }

   static record a(List<azq> a, fwh b) {
   }

   public static class b {
      public final frz a;
      public final int b;
      public final frz.a c;

      public b(frz $$0, int $$1, frz.a $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
