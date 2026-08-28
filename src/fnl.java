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

public abstract class fnl extends fjo implements fix {
   private static final Logger a = LogUtils.getLogger();
   private static final Set<String> b = Sets.newHashSet(new String[]{"http", "https"});
   private static final wu c = wu.c("narrator.screen.usage");
   protected static final gdt d = new gdt(new akk("textures/gui/title/background/panorama"));
   protected static final geh e = new geh(d);
   public static final akk f = new akk("textures/gui/menu_background.png");
   public static final akk g = new akk("textures/gui/header_separator.png");
   public static final akk h = new akk("textures/gui/footer_separator.png");
   private static final akk q = new akk("textures/gui/inworld_menu_background.png");
   public static final akk i = new akk("textures/gui/inworld_header_separator.png");
   public static final akk j = new akk("textures/gui/inworld_footer_separator.png");
   protected final wu k;
   private final List<fjq> r = Lists.newArrayList();
   private final List<flo> s = Lists.newArrayList();
   @Nullable
   protected ffw l;
   private boolean u;
   public int m;
   public int n;
   private final List<fix> v = Lists.newArrayList();
   protected fhf o;
   @Nullable
   private URI w;
   private static final long x = TimeUnit.SECONDS.toMillis(2L);
   private static final long y = x;
   private static final long z = 750L;
   private static final long A = 200L;
   private static final long B = 200L;
   private final flt C = new flt();
   private long D = Long.MIN_VALUE;
   private long E = Long.MAX_VALUE;
   @Nullable
   private flo F;
   @Nullable
   private fnl.a G;
   protected final Executor p = $$0x -> this.l.execute(() -> {
         if (this.l.y == this) {
            $$0x.run();
         }
      });

   protected fnl(wu $$0) {
      this.k = $$0;
   }

   public wu n() {
      return this.k;
   }

   public wu i() {
      return this.n();
   }

   public final void c(fhh $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$1, $$2, $$3);
      if (this.G != null) {
         $$0.a(this.o, this.G.a(), this.G.b(), $$1, $$2);
         this.G = null;
      }
   }

   @Override
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
      this.b($$0, $$1, $$2, $$3);

      for (fix $$4 : this.v) {
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256 && this.aF_()) {
         this.d();
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         flw $$3 = (flw)(switch ($$0) {
            case 258 -> this.m();
            default -> null;
            case 262 -> this.a(fly.d);
            case 263 -> this.a(fly.c);
            case 264 -> this.a(fly.b);
            case 265 -> this.a(fly.a);
         });
         if ($$3 != null) {
            fhe $$4 = super.a($$3);
            if ($$4 == null && $$3 instanceof flw.c) {
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

   private flw.c m() {
      boolean $$0 = !s();
      return new flw.c($$0);
   }

   private flw.a a(fly $$0) {
      return new flw.a($$0);
   }

   protected void aE_() {
      if (this.l.aU().b()) {
         flw.c $$0 = new flw.c(true);
         fhe $$1 = super.a($$0);
         if ($$1 != null) {
            this.a($$1);
         }
      }
   }

   protected void b(fjq $$0) {
      fhe $$1 = fhe.a(this, $$0.a(new flw.b()));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   public void o() {
      fhe $$0 = this.aL_();
      if ($$0 != null) {
         $$0.a(false);
      }
   }

   @VisibleForTesting
   protected void a(fhe $$0) {
      this.o();
      $$0.a(true);
   }

   public boolean aF_() {
      return true;
   }

   public void d() {
      this.l.a(null);
   }

   protected <T extends fjq & fix & flo> T c(T $$0) {
      this.v.add($$0);
      return this.d($$0);
   }

   protected <T extends fix> T a(T $$0) {
      this.v.add($$0);
      return $$0;
   }

   protected <T extends fjq & flo> T d(T $$0) {
      this.r.add($$0);
      this.s.add($$0);
      return $$0;
   }

   protected void e(fjq $$0) {
      if ($$0 instanceof fix) {
         this.v.remove((fix)$$0);
      }

      if ($$0 instanceof flo) {
         this.s.remove((flo)$$0);
      }

      this.r.remove($$0);
   }

   protected void p() {
      this.v.clear();
      this.r.clear();
      this.s.clear();
   }

   public static List<wu> a(ffw $$0, cud $$1) {
      return $$1.a(cty.b.a($$0.r), $$0.s, $$0.m.m ? cvw.a.b : cvw.a.a);
   }

   protected void a_(String $$0, boolean $$1) {
   }

   public boolean a(@Nullable xr $$0) {
      if ($$0 == null) {
         return false;
      } else {
         ws $$1 = $$0.h();
         if (s()) {
            if ($$0.j() != null) {
               this.a_($$0.j(), false);
            }
         } else if ($$1 != null) {
            if ($$1.a() == ws.a.a) {
               if (!this.l.m.L().c()) {
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

                  if (this.l.m.M().c()) {
                     this.w = $$2;
                     this.l.a(new fmi(this::c, $$1.b(), false));
                  } else {
                     this.a($$2);
                  }
               } catch (URISyntaxException var5) {
                  a.error("Can't open url for {}", $$1, var5);
               }
            } else if ($$1.a() == ws.a.b) {
               URI $$5 = new File($$1.b()).toURI();
               this.a($$5);
            } else if ($$1.a() == ws.a.d) {
               this.a_(azd.g($$1.b()), true);
            } else if ($$1.a() == ws.a.c) {
               String $$6 = azd.g($$1.b());
               if ($$6.startsWith("/")) {
                  if (!this.l.s.h.d($$6.substring(1))) {
                     a.error("Not allowed to run command with signed argument from click event: '{}'", $$6);
                  }
               } else {
                  a.error("Failed to run command without '/' prefix from click event: '{}'", $$6);
               }
            } else if ($$1.a() == ws.a.f) {
               this.l.o.a($$1.b());
            } else {
               a.error("Don't know how to handle {}", $$1);
            }

            return true;
         }

         return false;
      }
   }

   public final void b(ffw $$0, int $$1, int $$2) {
      this.l = $$0;
      this.o = $$0.h;
      this.m = $$1;
      this.n = $$2;
      if (!this.u) {
         this.aP_();
         this.aE_();
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
      this.aP_();
      this.aE_();
   }

   @Override
   public List<? extends fjq> aG_() {
      return this.r;
   }

   protected void aP_() {
   }

   public void e() {
   }

   public void j() {
   }

   public void aH_() {
   }

   public void b(fhh $$0, int $$1, int $$2, float $$3) {
      if (this.l.r == null) {
         this.a($$0, $$3);
      }

      this.a($$3);
      this.a($$0);
   }

   protected void a(float $$0) {
      this.l.j.a($$0);
      this.l.h().a(false);
   }

   protected void a(fhh $$0, float $$1) {
      e.a($$0, this.m, this.n, 1.0F, $$1);
   }

   protected void a(fhh $$0) {
      this.a($$0, 0, 0, this.m, this.n);
   }

   protected void a(fhh $$0, int $$1, int $$2, int $$3, int $$4) {
      a($$0, this.l.r == null ? f : q, $$1, $$2, 0.0F, 0.0F, $$3, $$4);
   }

   public static void a(fhh $$0, akk $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7) {
      int $$8 = 32;
      RenderSystem.enableBlend();
      $$0.a($$1, $$2, $$3, 0, $$4, $$5, $$6, $$7, 32, 32);
      RenderSystem.disableBlend();
   }

   public void b(fhh $$0) {
      $$0.b(0, 0, this.m, this.n, -1072689136, -804253680);
   }

   public boolean k() {
      return true;
   }

   private void c(boolean $$0) {
      if ($$0) {
         this.a(this.w);
      }

      this.w = null;
      this.l.a(this);
   }

   private void a(URI $$0) {
      ac.k().a($$0);
   }

   public static boolean r() {
      return ffw.a ? ezj.a(ffw.Q().aM().i(), 343) || ezj.a(ffw.Q().aM().i(), 347) : ezj.a(ffw.Q().aM().i(), 341) || ezj.a(ffw.Q().aM().i(), 345);
   }

   public static boolean s() {
      return ezj.a(ffw.Q().aM().i(), 340) || ezj.a(ffw.Q().aM().i(), 344);
   }

   public static boolean t() {
      return ezj.a(ffw.Q().aM().i(), 342) || ezj.a(ffw.Q().aM().i(), 346);
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

   public void a(ffw $$0, int $$1, int $$2) {
      this.m = $$1;
      this.n = $$2;
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
      this.E = ac.c() + $$0;
      if ($$1) {
         this.D = Long.MIN_VALUE;
      }
   }

   private void a(long $$0) {
      this.D = ac.c() + $$0;
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

   private boolean D() {
      return this.l.aV().a();
   }

   public void y() {
      if (this.D()) {
         long $$0 = ac.c();
         if ($$0 > this.E && $$0 > this.D) {
            this.e(true);
            this.E = Long.MAX_VALUE;
         }
      }
   }

   public void d(boolean $$0) {
      if (this.D()) {
         this.e($$0);
      }
   }

   private void e(boolean $$0) {
      this.C.a(this::a);
      String $$1 = this.C.a(!$$0);
      if (!$$1.isEmpty()) {
         this.l.aV().a($$1);
      }
   }

   protected boolean aO_() {
      return true;
   }

   protected void a(flq $$0) {
      $$0.a(flp.a, this.i());
      if (this.aO_()) {
         $$0.a(flp.d, c);
      }

      this.b($$0);
   }

   protected void b(flq $$0) {
      List<flo> $$1 = this.s.stream().filter(flo::C).sorted(Comparator.comparingInt(fje::I)).toList();
      fnl.b $$2 = a($$1, this.F);
      if ($$2 != null) {
         if ($$2.c.a()) {
            this.F = $$2.a;
         }

         if ($$1.size() > 1) {
            $$0.a(flp.b, wu.a("narrator.position.screen", $$2.b + 1, $$1.size()));
            if ($$2.c == flo.a.c) {
               $$0.a(flp.d, this.z());
            }
         }

         $$2.a.b($$0.a());
      }
   }

   protected wu z() {
      return wu.c("narration.component_list.usage");
   }

   @Nullable
   public static fnl.b a(List<? extends flo> $$0, @Nullable flo $$1) {
      fnl.b $$2 = null;
      fnl.b $$3 = null;
      int $$4 = 0;

      for (int $$5 = $$0.size(); $$4 < $$5; $$4++) {
         flo $$6 = $$0.get($$4);
         flo.a $$7 = $$6.u();
         if ($$7.a()) {
            if ($$6 != $$1) {
               return new fnl.b($$6, $$4, $$7);
            }

            $$3 = new fnl.b($$6, $$4, $$7);
         } else if ($$7.compareTo($$2 != null ? $$2.c : flo.a.a) > 0) {
            $$2 = new fnl.b($$6, $$4, $$7);
         }
      }

      return $$2 != null ? $$2 : $$3;
   }

   public void A() {
      this.a(y, false);
   }

   protected void B() {
      this.G = null;
   }

   public void b(List<axs> $$0) {
      this.a($$0, fpw.a, true);
   }

   public void a(List<axs> $$0, fpv $$1, boolean $$2) {
      if (this.G == null || $$2) {
         this.G = new fnl.a($$0, $$1);
      }
   }

   public void d(wu $$0) {
      this.b(fjf.a(this.l, $$0));
   }

   public void a(fjf $$0, fpv $$1, boolean $$2) {
      this.a($$0.a(this.l), $$1, $$2);
   }

   @Override
   public fma H() {
      return new fma(0, 0, this.m, this.n);
   }

   @Nullable
   public ave C() {
      return null;
   }

   static record a(List<axs> a, fpv b) {
   }

   public static class b {
      public final flo a;
      public final int b;
      public final flo.a c;

      public b(flo $$0, int $$1, flo.a $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
