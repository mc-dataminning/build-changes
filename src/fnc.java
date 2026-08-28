import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class fnc extends fix implements fig {
   private static final Logger a = LogUtils.getLogger();
   private static final Set<String> b = Sets.newHashSet(new String[]{"http", "https"});
   private static final xo c = xo.c("narrator.screen.usage");
   protected static final gdb e = new gdb(new ale("textures/gui/title/background/panorama"));
   protected static final gdp f = new gdp(e);
   public static final ale g = new ale("textures/gui/menu_background.png");
   public static final ale h = new ale("textures/gui/header_separator.png");
   public static final ale i = new ale("textures/gui/footer_separator.png");
   private static final ale d = new ale("textures/gui/inworld_menu_background.png");
   public static final ale j = new ale("textures/gui/inworld_header_separator.png");
   public static final ale k = new ale("textures/gui/inworld_footer_separator.png");
   protected final xo l;
   private final List<fiz> r = Lists.newArrayList();
   private final List<fkx> s = Lists.newArrayList();
   @Nullable
   protected ffe m;
   private boolean u;
   public int n;
   public int o;
   private final List<fig> v = Lists.newArrayList();
   private long w = ac.c();
   protected fgo p;
   @Nullable
   private URI x;
   private static final long y = TimeUnit.SECONDS.toMillis(2L);
   private static final long z = y;
   private static final long A = 750L;
   private static final long B = 200L;
   private static final long C = 200L;
   private final flc D = new flc();
   private long E = Long.MIN_VALUE;
   private long F = Long.MAX_VALUE;
   @Nullable
   private fkx G;
   @Nullable
   private fnc.a H;
   protected final Executor q = $$0x -> this.m.execute(() -> {
         if (this.m.y == this) {
            $$0x.run();
         }
      });

   protected fnc(xo $$0) {
      this.l = $$0;
   }

   public xo n() {
      return this.l;
   }

   public xo i() {
      return this.n();
   }

   public final void c(fgq $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$1, $$2, $$3);
      if (this.H != null) {
         $$0.a(this.p, this.H.a(), this.H.b(), $$1, $$2);
         this.H = null;
      }
   }

   @Override
   public void a(fgq $$0, int $$1, int $$2, float $$3) {
      this.b($$0, $$1, $$2, $$3);

      for (fig $$4 : this.v) {
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256 && this.aC_()) {
         this.d();
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         flf $$3 = (flf)(switch ($$0) {
            case 258 -> this.m();
            default -> null;
            case 262 -> this.a(flh.d);
            case 263 -> this.a(flh.c);
            case 264 -> this.a(flh.b);
            case 265 -> this.a(flh.a);
         });
         if ($$3 != null) {
            fgn $$4 = super.a($$3);
            if ($$4 == null && $$3 instanceof flf.c) {
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

   private flf.c m() {
      boolean $$0 = !t();
      return new flf.c($$0);
   }

   private flf.a a(flh $$0) {
      return new flf.a($$0);
   }

   protected void aB_() {
      if (this.m.aW().b()) {
         flf.c $$0 = new flf.c(true);
         fgn $$1 = super.a($$0);
         if ($$1 != null) {
            this.a($$1);
         }
      }
   }

   protected void b(fiz $$0) {
      fgn $$1 = fgn.a(this, $$0.a(new flf.b()));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   public void o() {
      fgn $$0 = this.aI_();
      if ($$0 != null) {
         $$0.a(false);
      }
   }

   @VisibleForTesting
   protected void a(fgn $$0) {
      this.o();
      $$0.a(true);
   }

   public boolean aC_() {
      return true;
   }

   public void d() {
      this.m.a(null);
   }

   protected <T extends fiz & fig & fkx> T c(T $$0) {
      this.v.add($$0);
      return this.d($$0);
   }

   protected <T extends fig> T a(T $$0) {
      this.v.add($$0);
      return $$0;
   }

   protected <T extends fiz & fkx> T d(T $$0) {
      this.r.add($$0);
      this.s.add($$0);
      return $$0;
   }

   protected void e(fiz $$0) {
      if ($$0 instanceof fig) {
         this.v.remove((fig)$$0);
      }

      if ($$0 instanceof fkx) {
         this.s.remove((fkx)$$0);
      }

      this.r.remove($$0);
   }

   protected void p() {
      this.v.clear();
      this.r.clear();
      this.s.clear();
   }

   public static List<xo> a(ffe $$0, cuo $$1) {
      return $$1.a(cuj.b.a($$0.r), $$0.s, $$0.m.m ? cwh.a.b : cwh.a.a);
   }

   protected void a_(String $$0, boolean $$1) {
   }

   public boolean a(@Nullable yl $$0) {
      if ($$0 == null) {
         return false;
      } else {
         xm $$1 = $$0.h();
         if (t()) {
            if ($$0.j() != null) {
               this.a_($$0.j(), false);
            }
         } else if ($$1 != null) {
            if ($$1.a() == xm.a.a) {
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
                     this.x = $$2;
                     this.m.a(new flt(this::c, $$1.b(), false));
                  } else {
                     this.a($$2);
                  }
               } catch (URISyntaxException var5) {
                  a.error("Can't open url for {}", $$1, var5);
               }
            } else if ($$1.a() == xm.a.b) {
               URI $$5 = new File($$1.b()).toURI();
               this.a($$5);
            } else if ($$1.a() == xm.a.d) {
               this.a_(azu.g($$1.b()), true);
            } else if ($$1.a() == xm.a.c) {
               String $$6 = azu.g($$1.b());
               if ($$6.startsWith("/")) {
                  if (!this.m.s.cz.d($$6.substring(1))) {
                     a.error("Not allowed to run command with signed argument from click event: '{}'", $$6);
                  }
               } else {
                  a.error("Failed to run command without '/' prefix from click event: '{}'", $$6);
               }
            } else if ($$1.a() == xm.a.f) {
               this.m.o.a($$1.b());
            } else {
               a.error("Don't know how to handle {}", $$1);
            }

            return true;
         }

         return false;
      }
   }

   public final void b(ffe $$0, int $$1, int $$2) {
      this.m = $$0;
      this.p = $$0.h;
      this.n = $$1;
      this.o = $$2;
      if (!this.u) {
         this.aM_();
         this.aB_();
      } else {
         this.c();
      }

      this.u = true;
      this.d(false);
      this.a(y);
   }

   protected void q() {
      this.p();
      this.o();
      this.aM_();
      this.aB_();
   }

   @Override
   public List<? extends fiz> aD_() {
      return this.r;
   }

   protected void aM_() {
   }

   public void e() {
   }

   public void j() {
   }

   public void aE_() {
   }

   public void b(fgq $$0, int $$1, int $$2, float $$3) {
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

   protected float r() {
      long $$0 = ac.c();
      long $$1 = 50L;
      float $$2 = (float)($$0 - this.w) / 50.0F;
      this.w = $$0;
      return $$2 > 7.0F ? 0.5F : $$2;
   }

   protected void a(fgq $$0, float $$1) {
      f.a($$0, this.n, this.o, 1.0F, this.r());
   }

   protected void a(fgq $$0) {
      this.a($$0, 0, 0, this.n, this.o);
   }

   protected void a(fgq $$0, int $$1, int $$2, int $$3, int $$4) {
      a($$0, this.m.r == null ? g : d, $$1, $$2, 0.0F, 0.0F, $$3, $$4);
   }

   public static void a(fgq $$0, ale $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7) {
      int $$8 = 32;
      RenderSystem.enableBlend();
      $$0.a($$1, $$2, $$3, 0, $$4, $$5, $$6, $$7, 32, 32);
      RenderSystem.disableBlend();
   }

   public void b(fgq $$0) {
      $$0.b(0, 0, this.n, this.o, -1072689136, -804253680);
   }

   public boolean k() {
      return true;
   }

   private void c(boolean $$0) {
      if ($$0) {
         this.a(this.x);
      }

      this.x = null;
      this.m.a(this);
   }

   private void a(URI $$0) {
      ac.k().a($$0);
   }

   public static boolean s() {
      return ffe.a ? eys.a(ffe.Q().aO().i(), 343) || eys.a(ffe.Q().aO().i(), 347) : eys.a(ffe.Q().aO().i(), 341) || eys.a(ffe.Q().aO().i(), 345);
   }

   public static boolean t() {
      return eys.a(ffe.Q().aO().i(), 340) || eys.a(ffe.Q().aO().i(), 344);
   }

   public static boolean u() {
      return eys.a(ffe.Q().aO().i(), 342) || eys.a(ffe.Q().aO().i(), 346);
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

   public void a(ffe $$0, int $$1, int $$2) {
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
         throw new y($$4);
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
      this.F = ac.c() + $$0;
      if ($$1) {
         this.E = Long.MIN_VALUE;
      }
   }

   private void a(long $$0) {
      this.E = ac.c() + $$0;
   }

   public void w() {
      this.a(750L, false);
   }

   public void x() {
      this.a(200L, true);
   }

   public void y() {
      this.a(200L, true);
   }

   private boolean E() {
      return this.m.aX().a();
   }

   public void z() {
      if (this.E()) {
         long $$0 = ac.c();
         if ($$0 > this.F && $$0 > this.E) {
            this.e(true);
            this.F = Long.MAX_VALUE;
         }
      }
   }

   public void d(boolean $$0) {
      if (this.E()) {
         this.e($$0);
      }
   }

   private void e(boolean $$0) {
      this.D.a(this::a);
      String $$1 = this.D.a(!$$0);
      if (!$$1.isEmpty()) {
         this.m.aX().a($$1);
      }
   }

   protected boolean aL_() {
      return true;
   }

   protected void a(fkz $$0) {
      $$0.a(fky.a, this.i());
      if (this.aL_()) {
         $$0.a(fky.d, c);
      }

      this.b($$0);
   }

   protected void b(fkz $$0) {
      List<fkx> $$1 = this.s.stream().filter(fkx::B).sorted(Comparator.comparingInt(fin::H)).toList();
      fnc.b $$2 = a($$1, this.G);
      if ($$2 != null) {
         if ($$2.c.a()) {
            this.G = $$2.a;
         }

         if ($$1.size() > 1) {
            $$0.a(fky.b, xo.a("narrator.position.screen", $$2.b + 1, $$1.size()));
            if ($$2.c == fkx.a.c) {
               $$0.a(fky.d, this.A());
            }
         }

         $$2.a.b($$0.a());
      }
   }

   protected xo A() {
      return xo.c("narration.component_list.usage");
   }

   @Nullable
   public static fnc.b a(List<? extends fkx> $$0, @Nullable fkx $$1) {
      fnc.b $$2 = null;
      fnc.b $$3 = null;
      int $$4 = 0;

      for (int $$5 = $$0.size(); $$4 < $$5; $$4++) {
         fkx $$6 = $$0.get($$4);
         fkx.a $$7 = $$6.t();
         if ($$7.a()) {
            if ($$6 != $$1) {
               return new fnc.b($$6, $$4, $$7);
            }

            $$3 = new fnc.b($$6, $$4, $$7);
         } else if ($$7.compareTo($$2 != null ? $$2.c : fkx.a.a) > 0) {
            $$2 = new fnc.b($$6, $$4, $$7);
         }
      }

      return $$2 != null ? $$2 : $$3;
   }

   public void B() {
      this.a(z, false);
   }

   protected void C() {
      this.H = null;
   }

   public void b(List<ayk> $$0) {
      this.a($$0, fpw.a, true);
   }

   public void a(List<ayk> $$0, fpv $$1, boolean $$2) {
      if (this.H == null || $$2) {
         this.H = new fnc.a($$0, $$1);
      }
   }

   public void d(xo $$0) {
      this.b(fio.a(this.m, $$0));
   }

   public void a(fio $$0, fpv $$1, boolean $$2) {
      this.a($$0.a(this.m), $$1, $$2);
   }

   @Override
   public flj G() {
      return new flj(0, 0, this.n, this.o);
   }

   @Nullable
   public avw D() {
      return null;
   }

   static record a(List<ayk> a, fpv b) {
   }

   public static class b {
      public final fkx a;
      public final int b;
      public final fkx.a c;

      public b(fkx $$0, int $$1, fkx.a $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
