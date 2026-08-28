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

public abstract class fty extends fqb implements fpj {
   private static final Logger a = LogUtils.getLogger();
   private static final xv b = xv.c("narrator.screen.usage");
   protected static final gkw e = new gkw(alz.b("textures/gui/title/background/panorama"));
   protected static final glo f = new glo(e);
   public static final alz g = alz.b("textures/gui/menu_background.png");
   public static final alz h = alz.b("textures/gui/header_separator.png");
   public static final alz i = alz.b("textures/gui/footer_separator.png");
   private static final alz c = alz.b("textures/gui/inworld_menu_background.png");
   public static final alz j = alz.b("textures/gui/inworld_header_separator.png");
   public static final alz k = alz.b("textures/gui/inworld_footer_separator.png");
   protected final xv l;
   private final List<fqd> d = Lists.newArrayList();
   private final List<fsb> s = Lists.newArrayList();
   @Nullable
   protected fmg m;
   private boolean u;
   public int n;
   public int o;
   private final List<fpj> v = Lists.newArrayList();
   protected fnq p;
   private static final long w = TimeUnit.SECONDS.toMillis(2L);
   private static final long x = w;
   private static final long y = 750L;
   private static final long z = 200L;
   private static final long A = 200L;
   private final fsg B = new fsg();
   private long C = Long.MIN_VALUE;
   private long D = Long.MAX_VALUE;
   @Nullable
   protected fom<fmi> q;
   @Nullable
   private fsb E;
   @Nullable
   private fty.a F;
   protected final Executor r = $$0x -> this.m.execute(() -> {
         if (this.m.z == this) {
            $$0x.run();
         }
      });

   protected fty(xv $$0) {
      this.l = $$0;
   }

   public xv m() {
      return this.l;
   }

   public xv i() {
      return this.m();
   }

   public final void c(fns $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$1, $$2, $$3);
      if (this.F != null) {
         $$0.a(this.p, this.F.a(), this.F.b(), $$1, $$2);
         this.F = null;
      }
   }

   @Override
   public void a(fns $$0, int $$1, int $$2, float $$3) {
      this.b($$0, $$1, $$2, $$3);

      for (fpj $$4 : this.v) {
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
         fsj $$3 = (fsj)(switch ($$0) {
            case 258 -> this.l();
            default -> null;
            case 262 -> this.a(fsl.d);
            case 263 -> this.a(fsl.c);
            case 264 -> this.a(fsl.b);
            case 265 -> this.a(fsl.a);
         });
         if ($$3 != null) {
            fnp $$4 = super.a($$3);
            if ($$4 == null && $$3 instanceof fsj.c) {
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

   private fsj.c l() {
      boolean $$0 = !s();
      return new fsj.c($$0);
   }

   private fsj.a a(fsl $$0) {
      return new fsj.a($$0);
   }

   protected void aG_() {
      if (this.m.aY().b()) {
         fsj.c $$0 = new fsj.c(true);
         fnp $$1 = super.a($$0);
         if ($$1 != null) {
            this.a($$1);
         }
      }
   }

   protected void b(fqd $$0) {
      fnp $$1 = fnp.a(this, $$0.a(new fsj.b()));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   public void n() {
      fnp $$0 = this.aO_();
      if ($$0 != null) {
         $$0.a(false);
      }
   }

   @VisibleForTesting
   protected void a(fnp $$0) {
      this.n();
      $$0.a(true);
   }

   public boolean aH_() {
      return true;
   }

   public void aP_() {
      this.m.a(null);
   }

   protected <T extends fqd & fpj & fsb> T c(T $$0) {
      this.v.add($$0);
      return this.d($$0);
   }

   protected <T extends fpj> T a(T $$0) {
      this.v.add($$0);
      return $$0;
   }

   protected <T extends fqd & fsb> T d(T $$0) {
      this.d.add($$0);
      this.s.add($$0);
      return $$0;
   }

   protected void e(fqd $$0) {
      if ($$0 instanceof fpj) {
         this.v.remove((fpj)$$0);
      }

      if ($$0 instanceof fsb) {
         this.s.remove((fsb)$$0);
      }

      this.d.remove($$0);
   }

   protected void o() {
      this.v.clear();
      this.d.clear();
      this.s.clear();
   }

   public static List<xv> a(fmg $$0, cxp $$1) {
      return $$1.a(cxl.b.a($$0.s), $$0.t, $$0.n.m ? czh.a.b : czh.a.a);
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
                     this.m.a(new fsv($$1x -> {
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

   public final void b(fmg $$0, int $$1, int $$2) {
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
   public List<? extends fqd> aI_() {
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

   public void b(fns $$0, int $$1, int $$2, float $$3) {
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

   protected void a(fns $$0, float $$1) {
      f.a($$0, this.n, this.o, 1.0F, $$1);
   }

   protected void a(fns $$0) {
      this.a($$0, 0, 0, this.n, this.o);
   }

   protected void a(fns $$0, int $$1, int $$2, int $$3, int $$4) {
      a($$0, this.m.s == null ? g : c, $$1, $$2, 0.0F, 0.0F, $$3, $$4);
   }

   public static void a(fns $$0, alz $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7) {
      int $$8 = 32;
      $$0.a(glv::C, $$1, $$2, $$3, $$4, $$5, $$6, $$7, 32, 32);
   }

   public void b(fns $$0) {
      $$0.b(0, 0, this.n, this.o, -1072689136, -804253680);
   }

   public boolean j() {
      return true;
   }

   public static boolean r() {
      return fmg.a ? ffn.a(fmg.Q().aO().h(), 343) || ffn.a(fmg.Q().aO().h(), 347) : ffn.a(fmg.Q().aO().h(), 341) || ffn.a(fmg.Q().aO().h(), 345);
   }

   public static boolean s() {
      return ffn.a(fmg.Q().aO().h(), 340) || ffn.a(fmg.Q().aO().h(), 344);
   }

   public static boolean t() {
      return ffn.a(fmg.Q().aO().h(), 342) || ffn.a(fmg.Q().aO().h(), 346);
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

   public void a(fmg $$0, int $$1, int $$2) {
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

   protected void a(fsd $$0) {
      $$0.a(fsc.a, this.i());
      if (this.aS_()) {
         $$0.a(fsc.d, b);
      }

      this.b($$0);
   }

   protected void b(fsd $$0) {
      List<fsb> $$1 = this.s.stream().filter(fsb::C).sorted(Comparator.comparingInt(fpq::I)).toList();
      fty.b $$2 = a($$1, this.E);
      if ($$2 != null) {
         if ($$2.c.a()) {
            this.E = $$2.a;
         }

         if ($$1.size() > 1) {
            $$0.a(fsc.b, xv.a("narrator.position.screen", $$2.b + 1, $$1.size()));
            if ($$2.c == fsb.a.c) {
               $$0.a(fsc.d, this.z());
            }
         }

         $$2.a.b($$0.a());
      }
   }

   protected xv z() {
      return xv.c("narration.component_list.usage");
   }

   @Nullable
   public static fty.b a(List<? extends fsb> $$0, @Nullable fsb $$1) {
      fty.b $$2 = null;
      fty.b $$3 = null;
      int $$4 = 0;

      for (int $$5 = $$0.size(); $$4 < $$5; $$4++) {
         fsb $$6 = $$0.get($$4);
         fsb.a $$7 = $$6.u();
         if ($$7.a()) {
            if ($$6 != $$1) {
               return new fty.b($$6, $$4, $$7);
            }

            $$3 = new fty.b($$6, $$4, $$7);
         } else if ($$7.compareTo($$2 != null ? $$2.c : fsb.a.a) > 0) {
            $$2 = new fty.b($$6, $$4, $$7);
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
      this.a($$0, fwk.a, true);
   }

   public void a(List<azq> $$0, fwj $$1, boolean $$2) {
      if (this.F == null || $$2) {
         this.F = new fty.a($$0, $$1);
      }
   }

   public void d(xv $$0) {
      this.b(fpr.a(this.m, $$0));
   }

   public void a(fpr $$0, fwj $$1, boolean $$2) {
      this.a($$0.a(this.m), $$1, $$2);
   }

   public fnq B() {
      return this.p;
   }

   public boolean C() {
      return false;
   }

   @Override
   public fsn H() {
      return new fsn(0, 0, this.n, this.o);
   }

   @Nullable
   public axc D() {
      return null;
   }

   static record a(List<azq> a, fwj b) {
   }

   public static class b {
      public final fsb a;
      public final int b;
      public final fsb.a c;

      public b(fsb $$0, int $$1, fsb.a $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
