import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class fon extends fkh implements fjq {
   private static final Logger a = LogUtils.getLogger();
   private static final Set<String> b = Sets.newHashSet(new String[]{"http", "https"});
   private static final xe c = xe.c("narrator.screen.usage");
   protected static final geu e = new geu(new akt("nothingtoseeheremovealong", "textures/gui/title/background/panorama"));
   protected static final gfi f = new gfi(e);
   public static final akt g = new akt("textures/gui/menu_background.png");
   public static final akt h = new akt("textures/gui/header_separator.png");
   public static final akt i = new akt("textures/gui/footer_separator.png");
   private static final akt d = new akt("textures/gui/inworld_menu_background.png");
   public static final akt j = new akt("textures/gui/inworld_header_separator.png");
   public static final akt k = new akt("textures/gui/inworld_footer_separator.png");
   protected final xe l;
   private final List<fkj> r = Lists.newArrayList();
   private final List<fmh> s = Lists.newArrayList();
   @Nullable
   protected fgj m;
   private boolean u;
   public int n;
   public int o;
   private final List<fjq> v = Lists.newArrayList();
   protected fhy p;
   @Nullable
   private URI w;
   private static final long x = TimeUnit.SECONDS.toMillis(2L);
   private static final long y = x;
   private static final long z = 750L;
   private static final long A = 200L;
   private static final long B = 200L;
   private final fmm C = new fmm();
   private long D = Long.MIN_VALUE;
   private long E = Long.MAX_VALUE;
   @Nullable
   private fmh F;
   @Nullable
   private fon.a G;
   protected final Executor q = $$0x -> this.m.execute(() -> {
         if (this.m.y == this) {
            $$0x.run();
         }
      });

   protected fon(xe $$0) {
      this.l = $$0;
   }

   public xe n() {
      return this.l;
   }

   public xe i() {
      return this.n();
   }

   public final void c(fia $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$1, $$2, $$3);
      if (this.G != null) {
         $$0.a(this.p, this.G.a(), this.G.b(), $$1, $$2);
         this.G = null;
      }
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      this.b($$0, $$1, $$2, $$3);

      for (fjq $$4 : this.v) {
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256 && this.aD_()) {
         this.d();
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         fmp $$3 = (fmp)(switch ($$0) {
            case 258 -> this.B();
            default -> null;
            case 262 -> this.a(fmr.d);
            case 263 -> this.a(fmr.c);
            case 264 -> this.a(fmr.b);
            case 265 -> this.a(fmr.a);
         });
         if ($$3 != null) {
            fhx $$4 = super.a($$3);
            if ($$4 == null && $$3 instanceof fmp.c) {
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

   private fmp.c B() {
      boolean $$0 = !s();
      return new fmp.c($$0);
   }

   private fmp.a a(fmr $$0) {
      return new fmp.a($$0);
   }

   protected void aC_() {
      if (this.m.aY().b()) {
         fmp.c $$0 = new fmp.c(true);
         fhx $$1 = super.a($$0);
         if ($$1 != null) {
            this.a($$1);
         }
      }
   }

   protected void b(fkj $$0) {
      fhx $$1 = fhx.a(this, $$0.a(new fmp.b()));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   public void o() {
      fhx $$0 = this.aJ_();
      if ($$0 != null) {
         $$0.a(false);
      }
   }

   @VisibleForTesting
   protected void a(fhx $$0) {
      this.o();
      $$0.a(true);
   }

   public boolean aD_() {
      return true;
   }

   public void d() {
      this.m.a(null);
   }

   protected <T extends fkj & fjq & fmh> T c(T $$0) {
      this.v.add($$0);
      return this.d($$0);
   }

   protected <T extends fjq> T a(T $$0) {
      this.v.add($$0);
      return $$0;
   }

   protected <T extends fkj & fmh> T d(T $$0) {
      this.r.add($$0);
      this.s.add($$0);
      return $$0;
   }

   protected void e(fkj $$0) {
      if ($$0 instanceof fjq) {
         this.v.remove((fjq)$$0);
      }

      if ($$0 instanceof fmh) {
         this.s.remove((fmh)$$0);
      }

      this.r.remove($$0);
   }

   protected void p() {
      this.v.clear();
      this.r.clear();
      this.s.clear();
   }

   public static List<xe> a(fgj $$0, cuh $$1) {
      return $$1.a($$0.s, $$0.m.m ? cwi.a.b : cwi.a.a);
   }

   protected void a_(String $$0, boolean $$1) {
   }

   public boolean a(@Nullable yb $$0) {
      if ($$0 == null) {
         return false;
      } else {
         xc $$1 = $$0.h();
         if (s()) {
            if ($$0.j() != null) {
               this.a_($$0.j(), false);
            }
         } else if ($$1 != null) {
            if ($$1.a() == xc.a.a) {
               if (!this.m.m.L().c()) {
                  return false;
               }

               try {
                  URI $$2 = new URI($$1.b());
                  String $$3 = $$2.getScheme();
                  if ($$3 == null) {
                     throw new URISyntaxException($$1.b(), "Missing protocol");
                  }

                  if (!b.contains($$3.toLowerCase(Locale.ROOT))) {
                     throw new URISyntaxException($$1.b(), "Unsupported protocol: " + $$3.toLowerCase(Locale.ROOT));
                  }

                  if (this.m.m.M().c()) {
                     this.w = $$2;
                     this.m.a(new fnd(this::c, $$1.b(), false));
                  } else {
                     this.a($$2);
                  }
               } catch (URISyntaxException var5) {
                  a.error("Can't open url for {}", $$1, var5);
               }
            } else if ($$1.a() == xc.a.b) {
               URI $$5 = new File($$1.b()).toURI();
               this.a($$5);
            } else if ($$1.a() == xc.a.d) {
               this.a_(azh.g($$1.b()), true);
            } else if ($$1.a() == xc.a.c) {
               String $$6 = azh.g($$1.b());
               if ($$6.startsWith("/")) {
                  if (!this.m.s.h.d($$6.substring(1))) {
                     a.error("Not allowed to run command with signed argument from click event: '{}'", $$6);
                  }
               } else {
                  a.error("Failed to run command without '/' prefix from click event: '{}'", $$6);
               }
            } else if ($$1.a() == xc.a.f) {
               this.m.o.a($$1.b());
            } else {
               a.error("Don't know how to handle {}", $$1);
            }

            return true;
         }

         return false;
      }
   }

   public final void b(fgj $$0, int $$1, int $$2) {
      this.m = $$0;
      this.p = $$0.h;
      this.n = $$1;
      this.o = $$2;
      if (!this.u) {
         this.aN_();
         this.aC_();
      } else {
         this.c();
      }

      this.u = true;
      this.d(false);
      this.a(x);
   }

   protected void q() {
      this.p();
      this.o();
      this.aN_();
      this.aC_();
   }

   @Override
   public List<? extends fkj> aE_() {
      return this.r;
   }

   protected void aN_() {
   }

   public void e() {
   }

   public void j() {
   }

   public void aF_() {
   }

   public void b(fia $$0, int $$1, int $$2, float $$3) {
      if (this.m.r == null) {
         this.a($$0, $$3);
      }

      this.a($$3);
      this.a($$0);
   }

   protected void a(float $$0) {
      this.m.j.a($$0);
      this.m.h().a(false);
   }

   protected void a(fia $$0, float $$1) {
      f.a($$0, this.n, this.o, 1.0F, $$1);
   }

   protected void a(fia $$0) {
      this.a($$0, 0, 0, this.n, this.o);
   }

   protected void a(fia $$0, int $$1, int $$2, int $$3, int $$4) {
      a($$0, this.m.r == null ? g : d, $$1, $$2, 0.0F, 0.0F, $$3, $$4);
   }

   public static void a(fia $$0, akt $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7) {
      int $$8 = 32;
      RenderSystem.enableBlend();
      $$0.a($$1, $$2, $$3, 0, $$4, $$5, $$6, $$7, 32, 32);
      RenderSystem.disableBlend();
   }

   public void b(fia $$0) {
      $$0.b(0, 0, this.n, this.o, -1072689136, -804253680);
   }

   public boolean k() {
      return true;
   }

   private void c(boolean $$0) {
      if ($$0) {
         this.a(this.w);
      }

      this.w = null;
      this.m.a(this);
   }

   private void a(URI $$0) {
      ad.j().a($$0);
   }

   public static boolean r() {
      return fgj.a ? ezx.a(fgj.Q().aP().i(), 343) || ezx.a(fgj.Q().aP().i(), 347) : ezx.a(fgj.Q().aP().i(), 341) || ezx.a(fgj.Q().aP().i(), 345);
   }

   public static boolean s() {
      return ezx.a(fgj.Q().aP().i(), 340) || ezx.a(fgj.Q().aP().i(), 344);
   }

   public static boolean t() {
      return ezx.a(fgj.Q().aP().i(), 342) || ezx.a(fgj.Q().aP().i(), 346);
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
      this.q();
   }

   public void a(fgj $$0, int $$1, int $$2) {
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
      this.E = ad.b() + $$0;
      if ($$1) {
         this.D = Long.MIN_VALUE;
      }
   }

   private void a(long $$0) {
      this.D = ad.b() + $$0;
   }

   public void u() {
      this.a(750L, false);
   }

   public void w() {
      this.a(200L, true);
   }

   public void x() {
      this.a(200L, true);
   }

   private boolean C() {
      return this.m.aZ().a();
   }

   public void y() {
      if (this.C()) {
         long $$0 = ad.b();
         if ($$0 > this.E && $$0 > this.D) {
            this.e(true);
            this.E = Long.MAX_VALUE;
         }
      }
   }

   public void d(boolean $$0) {
      if (this.C()) {
         this.e($$0);
      }
   }

   private void e(boolean $$0) {
      this.C.a(this::a);
      String $$1 = this.C.a(!$$0);
      if (!$$1.isEmpty()) {
         this.m.aZ().a($$1);
      }
   }

   protected boolean aM_() {
      return true;
   }

   protected void a(fmj $$0) {
      $$0.a(fmi.a, this.i());
      if (this.aM_()) {
         $$0.a(fmi.d, c);
      }

      this.b($$0);
   }

   protected void b(fmj $$0) {
      List<fmh> $$1 = this.s.stream().filter(fmh::B).collect(Collectors.toList());
      Collections.sort($$1, Comparator.comparingInt(fjx::H));
      fon.b $$2 = a($$1, this.F);
      if ($$2 != null) {
         if ($$2.c.a()) {
            this.F = $$2.a;
         }

         if ($$1.size() > 1) {
            $$0.a(fmi.b, xe.a("narrator.position.screen", $$2.b + 1, $$1.size()));
            if ($$2.c == fmh.a.c) {
               $$0.a(fmi.d, this.z());
            }
         }

         $$2.a.b($$0.a());
      }
   }

   protected xe z() {
      return xe.c("narration.component_list.usage");
   }

   @Nullable
   public static fon.b a(List<? extends fmh> $$0, @Nullable fmh $$1) {
      fon.b $$2 = null;
      fon.b $$3 = null;
      int $$4 = 0;

      for (int $$5 = $$0.size(); $$4 < $$5; $$4++) {
         fmh $$6 = $$0.get($$4);
         fmh.a $$7 = $$6.t();
         if ($$7.a()) {
            if ($$6 != $$1) {
               return new fon.b($$6, $$4, $$7);
            }

            $$3 = new fon.b($$6, $$4, $$7);
         } else if ($$7.compareTo($$2 != null ? $$2.c : fmh.a.a) > 0) {
            $$2 = new fon.b($$6, $$4, $$7);
         }
      }

      return $$2 != null ? $$2 : $$3;
   }

   public void A() {
      this.a(y, false);
   }

   public void b(List<axy> $$0) {
      this.a($$0, frl.a, true);
   }

   public void a(List<axy> $$0, frk $$1, boolean $$2) {
      if (this.G == null || $$2) {
         this.G = new fon.a($$0, $$1);
      }
   }

   public void d(xe $$0) {
      this.b(fjy.a(this.m, $$0));
   }

   public void a(fjy $$0, frk $$1, boolean $$2) {
      this.a($$0.a(this.m), $$1, $$2);
   }

   @Override
   public fmt G() {
      return new fmt(0, 0, this.n, this.o);
   }

   @Nullable
   public avl aL_() {
      return null;
   }

   static record a(List<axy> a, frk b) {
   }

   public static class b {
      public final fmh a;
      public final int b;
      public final fmh.a c;

      public b(fmh $$0, int $$1, fmh.a $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
