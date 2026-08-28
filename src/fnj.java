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

public abstract class fnj extends fjm implements fiv {
   private static final Logger a = LogUtils.getLogger();
   private static final Set<String> b = Sets.newHashSet(new String[]{"http", "https"});
   private static final wu c = wu.c("narrator.screen.usage");
   protected static final gdr d = new gdr(new akk("textures/gui/title/background/panorama"));
   protected static final gef e = new gef(d);
   public static final akk f = new akk("textures/gui/menu_background.png");
   public static final akk g = new akk("textures/gui/header_separator.png");
   public static final akk h = new akk("textures/gui/footer_separator.png");
   private static final akk q = new akk("textures/gui/inworld_menu_background.png");
   public static final akk i = new akk("textures/gui/inworld_header_separator.png");
   public static final akk j = new akk("textures/gui/inworld_footer_separator.png");
   protected final wu k;
   private final List<fjo> r = Lists.newArrayList();
   private final List<flm> s = Lists.newArrayList();
   @Nullable
   protected fft l;
   private boolean u;
   public int m;
   public int n;
   private final List<fiv> v = Lists.newArrayList();
   private long w = ac.c();
   protected fhd o;
   @Nullable
   private URI x;
   private static final long y = TimeUnit.SECONDS.toMillis(2L);
   private static final long z = y;
   private static final long A = 750L;
   private static final long B = 200L;
   private static final long C = 200L;
   private final flr D = new flr();
   private long E = Long.MIN_VALUE;
   private long F = Long.MAX_VALUE;
   @Nullable
   private flm G;
   @Nullable
   private fnj.a H;
   protected final Executor p = $$0x -> this.l.execute(() -> {
         if (this.l.y == this) {
            $$0x.run();
         }
      });

   protected fnj(wu $$0) {
      this.k = $$0;
   }

   public wu n() {
      return this.k;
   }

   public wu i() {
      return this.n();
   }

   public final void c(fhf $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$1, $$2, $$3);
      if (this.H != null) {
         $$0.a(this.o, this.H.a(), this.H.b(), $$1, $$2);
         this.H = null;
      }
   }

   @Override
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
      this.b($$0, $$1, $$2, $$3);

      for (fiv $$4 : this.v) {
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
         flu $$3 = (flu)(switch ($$0) {
            case 258 -> this.m();
            default -> null;
            case 262 -> this.a(flw.d);
            case 263 -> this.a(flw.c);
            case 264 -> this.a(flw.b);
            case 265 -> this.a(flw.a);
         });
         if ($$3 != null) {
            fhc $$4 = super.a($$3);
            if ($$4 == null && $$3 instanceof flu.c) {
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

   private flu.c m() {
      boolean $$0 = !t();
      return new flu.c($$0);
   }

   private flu.a a(flw $$0) {
      return new flu.a($$0);
   }

   protected void aE_() {
      if (this.l.aW().b()) {
         flu.c $$0 = new flu.c(true);
         fhc $$1 = super.a($$0);
         if ($$1 != null) {
            this.a($$1);
         }
      }
   }

   protected void b(fjo $$0) {
      fhc $$1 = fhc.a(this, $$0.a(new flu.b()));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   public void o() {
      fhc $$0 = this.aL_();
      if ($$0 != null) {
         $$0.a(false);
      }
   }

   @VisibleForTesting
   protected void a(fhc $$0) {
      this.o();
      $$0.a(true);
   }

   public boolean aF_() {
      return true;
   }

   public void d() {
      this.l.a(null);
   }

   protected <T extends fjo & fiv & flm> T c(T $$0) {
      this.v.add($$0);
      return this.d($$0);
   }

   protected <T extends fiv> T a(T $$0) {
      this.v.add($$0);
      return $$0;
   }

   protected <T extends fjo & flm> T d(T $$0) {
      this.r.add($$0);
      this.s.add($$0);
      return $$0;
   }

   protected void e(fjo $$0) {
      if ($$0 instanceof fiv) {
         this.v.remove((fiv)$$0);
      }

      if ($$0 instanceof flm) {
         this.s.remove((flm)$$0);
      }

      this.r.remove($$0);
   }

   protected void p() {
      this.v.clear();
      this.r.clear();
      this.s.clear();
   }

   public static List<wu> a(fft $$0, cuc $$1) {
      return $$1.a(ctx.b.a($$0.r), $$0.s, $$0.m.m ? cvv.a.b : cvv.a.a);
   }

   protected void a_(String $$0, boolean $$1) {
   }

   public boolean a(@Nullable xr $$0) {
      if ($$0 == null) {
         return false;
      } else {
         ws $$1 = $$0.h();
         if (t()) {
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
                     this.x = $$2;
                     this.l.a(new fmg(this::c, $$1.b(), false));
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
                  if (!this.l.s.cB.d($$6.substring(1))) {
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

   public final void b(fft $$0, int $$1, int $$2) {
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
      this.a(y);
   }

   protected void q() {
      this.p();
      this.o();
      this.aP_();
      this.aE_();
   }

   @Override
   public List<? extends fjo> aG_() {
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

   public void b(fhf $$0, int $$1, int $$2, float $$3) {
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

   protected float r() {
      long $$0 = ac.c();
      long $$1 = 50L;
      float $$2 = (float)($$0 - this.w) / 50.0F;
      this.w = $$0;
      return $$2 > 7.0F ? 0.5F : $$2;
   }

   protected void a(fhf $$0, float $$1) {
      e.a($$0, this.m, this.n, 1.0F, this.r());
   }

   protected void a(fhf $$0) {
      this.a($$0, 0, 0, this.m, this.n);
   }

   protected void a(fhf $$0, int $$1, int $$2, int $$3, int $$4) {
      a($$0, this.l.r == null ? f : q, $$1, $$2, 0.0F, 0.0F, $$3, $$4);
   }

   public static void a(fhf $$0, akk $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7) {
      int $$8 = 32;
      RenderSystem.enableBlend();
      $$0.a($$1, $$2, $$3, 0, $$4, $$5, $$6, $$7, 32, 32);
      RenderSystem.disableBlend();
   }

   public void b(fhf $$0) {
      $$0.b(0, 0, this.m, this.n, -1072689136, -804253680);
   }

   public boolean k() {
      return true;
   }

   private void c(boolean $$0) {
      if ($$0) {
         this.a(this.x);
      }

      this.x = null;
      this.l.a(this);
   }

   private void a(URI $$0) {
      ac.k().a($$0);
   }

   public static boolean s() {
      return fft.a ? ezh.a(fft.Q().aO().i(), 343) || ezh.a(fft.Q().aO().i(), 347) : ezh.a(fft.Q().aO().i(), 341) || ezh.a(fft.Q().aO().i(), 345);
   }

   public static boolean t() {
      return ezh.a(fft.Q().aO().i(), 340) || ezh.a(fft.Q().aO().i(), 344);
   }

   public static boolean u() {
      return ezh.a(fft.Q().aO().i(), 342) || ezh.a(fft.Q().aO().i(), 346);
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

   public void a(fft $$0, int $$1, int $$2) {
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
      this.F = ac.c() + $$0;
      if ($$1) {
         this.E = Long.MIN_VALUE;
      }
   }

   private void a(long $$0) {
      this.E = ac.c() + $$0;
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

   private boolean E() {
      return this.l.aX().a();
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
         this.l.aX().a($$1);
      }
   }

   protected boolean aO_() {
      return true;
   }

   protected void a(flo $$0) {
      $$0.a(fln.a, this.i());
      if (this.aO_()) {
         $$0.a(fln.d, c);
      }

      this.b($$0);
   }

   protected void b(flo $$0) {
      List<flm> $$1 = this.s.stream().filter(flm::C).sorted(Comparator.comparingInt(fjc::I)).toList();
      fnj.b $$2 = a($$1, this.G);
      if ($$2 != null) {
         if ($$2.c.a()) {
            this.G = $$2.a;
         }

         if ($$1.size() > 1) {
            $$0.a(fln.b, wu.a("narrator.position.screen", $$2.b + 1, $$1.size()));
            if ($$2.c == flm.a.c) {
               $$0.a(fln.d, this.A());
            }
         }

         $$2.a.b($$0.a());
      }
   }

   protected wu A() {
      return wu.c("narration.component_list.usage");
   }

   @Nullable
   public static fnj.b a(List<? extends flm> $$0, @Nullable flm $$1) {
      fnj.b $$2 = null;
      fnj.b $$3 = null;
      int $$4 = 0;

      for (int $$5 = $$0.size(); $$4 < $$5; $$4++) {
         flm $$6 = $$0.get($$4);
         flm.a $$7 = $$6.u();
         if ($$7.a()) {
            if ($$6 != $$1) {
               return new fnj.b($$6, $$4, $$7);
            }

            $$3 = new fnj.b($$6, $$4, $$7);
         } else if ($$7.compareTo($$2 != null ? $$2.c : flm.a.a) > 0) {
            $$2 = new fnj.b($$6, $$4, $$7);
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

   public void b(List<axs> $$0) {
      this.a($$0, fpu.a, true);
   }

   public void a(List<axs> $$0, fpt $$1, boolean $$2) {
      if (this.H == null || $$2) {
         this.H = new fnj.a($$0, $$1);
      }
   }

   public void d(wu $$0) {
      this.b(fjd.a(this.l, $$0));
   }

   public void a(fjd $$0, fpt $$1, boolean $$2) {
      this.a($$0.a(this.l), $$1, $$2);
   }

   @Override
   public fly H() {
      return new fly(0, 0, this.m, this.n);
   }

   @Nullable
   public ave D() {
      return null;
   }

   static record a(List<axs> a, fpt b) {
   }

   public static class b {
      public final flm a;
      public final int b;
      public final flm.a c;

      public b(flm $$0, int $$1, flm.a $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
