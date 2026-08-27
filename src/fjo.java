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

public abstract class fjo extends ffj implements fes {
   private static final Logger a = LogUtils.getLogger();
   private static final Set<String> b = Sets.newHashSet(new String[]{"http", "https"});
   private static final wg c = wg.c("narrator.screen.usage");
   protected static final fzn e = new fzn(new ajt("textures/gui/title/background/panorama"));
   protected static final gab f = new gab(e);
   protected static final ajt g = new ajt("textures/gui/title/background/panorama_overlay.png");
   public static final ajt h = new ajt("textures/gui/menu_background.png");
   protected final wg i;
   private final List<ffl> d = Lists.newArrayList();
   private final List<fhj> o = Lists.newArrayList();
   @Nullable
   protected fbp j;
   private boolean p;
   public int k;
   public int l;
   private final List<fes> q = Lists.newArrayList();
   protected fda m;
   @Nullable
   private URI r;
   private static final long s = TimeUnit.SECONDS.toMillis(2L);
   private static final long u = s;
   private static final long v = 750L;
   private static final long w = 200L;
   private static final long x = 200L;
   private final fho y = new fho();
   private long z = Long.MIN_VALUE;
   private long A = Long.MAX_VALUE;
   @Nullable
   private fhj B;
   @Nullable
   private fjo.a C;
   protected final Executor n = $$0x -> this.j.execute(() -> {
         if (this.j.y == this) {
            $$0x.run();
         }
      });

   protected fjo(wg $$0) {
      this.i = $$0;
   }

   public wg n() {
      return this.i;
   }

   public wg i() {
      return this.n();
   }

   public final void c(fdc $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$1, $$2, $$3);
      if (this.C != null) {
         $$0.a(this.m, this.C.a(), this.C.b(), $$1, $$2);
         this.C = null;
      }
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      this.b($$0, $$1, $$2, $$3);

      for (fes $$4 : this.q) {
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256 && this.aE_()) {
         this.d();
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         fhr $$3 = (fhr)(switch ($$0) {
            case 258 -> this.m();
            default -> null;
            case 262 -> this.a(fht.d);
            case 263 -> this.a(fht.c);
            case 264 -> this.a(fht.b);
            case 265 -> this.a(fht.a);
         });
         if ($$3 != null) {
            fcz $$4 = super.a($$3);
            if ($$4 == null && $$3 instanceof fhr.c) {
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

   private fhr.c m() {
      boolean $$0 = !s();
      return new fhr.c($$0);
   }

   private fhr.a a(fht $$0) {
      return new fhr.a($$0);
   }

   protected void aD_() {
      if (this.j.aX().b()) {
         fhr.c $$0 = new fhr.c(true);
         fcz $$1 = super.a($$0);
         if ($$1 != null) {
            this.a($$1);
         }
      }
   }

   protected void b(ffl $$0) {
      fcz $$1 = fcz.a(this, $$0.a(new fhr.b()));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   public void o() {
      fcz $$0 = this.aK_();
      if ($$0 != null) {
         $$0.a(false);
      }
   }

   @VisibleForTesting
   protected void a(fcz $$0) {
      this.o();
      $$0.a(true);
   }

   public boolean aE_() {
      return true;
   }

   public void d() {
      this.j.a(null);
   }

   protected <T extends ffl & fes & fhj> T c(T $$0) {
      this.q.add($$0);
      return this.d($$0);
   }

   protected <T extends fes> T a(T $$0) {
      this.q.add($$0);
      return $$0;
   }

   protected <T extends ffl & fhj> T d(T $$0) {
      this.d.add($$0);
      this.o.add($$0);
      return $$0;
   }

   protected void e(ffl $$0) {
      if ($$0 instanceof fes) {
         this.q.remove((fes)$$0);
      }

      if ($$0 instanceof fhj) {
         this.o.remove((fhj)$$0);
      }

      this.d.remove($$0);
   }

   protected void p() {
      this.q.clear();
      this.d.clear();
      this.o.clear();
   }

   public static List<wg> a(fbp $$0, crj $$1) {
      return $$1.a($$0.s, $$0.m.m ? csz.a.b : csz.a.a);
   }

   protected void a_(String $$0, boolean $$1) {
   }

   public boolean a(@Nullable xd $$0) {
      if ($$0 == null) {
         return false;
      } else {
         we $$1 = $$0.h();
         if (s()) {
            if ($$0.j() != null) {
               this.a_($$0.j(), false);
            }
         } else if ($$1 != null) {
            if ($$1.a() == we.a.a) {
               if (!this.j.m.L().c()) {
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

                  if (this.j.m.M().c()) {
                     this.r = $$2;
                     this.j.a(new fif(this::c, $$1.b(), false));
                  } else {
                     this.a($$2);
                  }
               } catch (URISyntaxException var5) {
                  a.error("Can't open url for {}", $$1, var5);
               }
            } else if ($$1.a() == we.a.b) {
               URI $$5 = new File($$1.b()).toURI();
               this.a($$5);
            } else if ($$1.a() == we.a.d) {
               this.a_(ayf.g($$1.b()), true);
            } else if ($$1.a() == we.a.c) {
               String $$6 = ayf.g($$1.b());
               if ($$6.startsWith("/")) {
                  if (!this.j.s.ct.d($$6.substring(1))) {
                     a.error("Not allowed to run command with signed argument from click event: '{}'", $$6);
                  }
               } else {
                  a.error("Failed to run command without '/' prefix from click event: '{}'", $$6);
               }
            } else if ($$1.a() == we.a.f) {
               this.j.o.a($$1.b());
            } else {
               a.error("Don't know how to handle {}", $$1);
            }

            return true;
         }

         return false;
      }
   }

   public final void b(fbp $$0, int $$1, int $$2) {
      this.j = $$0;
      this.m = $$0.h;
      this.k = $$1;
      this.l = $$2;
      if (!this.p) {
         this.aN_();
         this.aD_();
      } else {
         this.c();
      }

      this.p = true;
      this.d(false);
      this.a(s);
   }

   protected void q() {
      this.p();
      this.o();
      this.aN_();
      this.aD_();
   }

   @Override
   public List<? extends ffl> aF_() {
      return this.d;
   }

   protected void aN_() {
   }

   public void e() {
   }

   public void j() {
   }

   public void aG_() {
   }

   public void b(fdc $$0, int $$1, int $$2, float $$3) {
      if (this.j.r == null) {
         this.a($$0, $$3);
      }

      this.a($$3);
      this.a($$0);
   }

   protected void a(float $$0) {
      this.j.j.a($$0);
      this.j.h().a(false);
   }

   protected void a(fdc $$0, float $$1) {
      f.a($$1);
   }

   protected void a(fdc $$0) {
      this.a($$0, 0, 0, this.k, this.l);
   }

   protected void a(fdc $$0, int $$1, int $$2, int $$3, int $$4) {
      b($$0, $$1, $$2, $$3, $$4);
   }

   public static void b(fdc $$0, int $$1, int $$2, int $$3, int $$4) {
      int $$5 = 32;
      RenderSystem.enableBlend();
      $$0.a(h, $$1, $$2, 0, 0.0F, 0.0F, $$3, $$4, 32, 32);
      RenderSystem.disableBlend();
   }

   public void b(fdc $$0) {
      $$0.b(0, 0, this.k, this.l, -1072689136, -804253680);
   }

   public boolean k() {
      return true;
   }

   private void c(boolean $$0) {
      if ($$0) {
         this.a(this.r);
      }

      this.r = null;
      this.j.a(this);
   }

   private void a(URI $$0) {
      ac.j().a($$0);
   }

   public static boolean r() {
      return fbp.a ? evd.a(fbp.Q().aO().i(), 343) || evd.a(fbp.Q().aO().i(), 347) : evd.a(fbp.Q().aO().i(), 341) || evd.a(fbp.Q().aO().i(), 345);
   }

   public static boolean s() {
      return evd.a(fbp.Q().aO().i(), 340) || evd.a(fbp.Q().aO().i(), 344);
   }

   public static boolean t() {
      return evd.a(fbp.Q().aO().i(), 342) || evd.a(fbp.Q().aO().i(), 346);
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

   public void a(fbp $$0, int $$1, int $$2) {
      this.k = $$1;
      this.l = $$2;
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
      this.A = ac.b() + $$0;
      if ($$1) {
         this.z = Long.MIN_VALUE;
      }
   }

   private void a(long $$0) {
      this.z = ac.b() + $$0;
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
      return this.j.aY().a();
   }

   public void y() {
      if (this.C()) {
         long $$0 = ac.b();
         if ($$0 > this.A && $$0 > this.z) {
            this.e(true);
            this.A = Long.MAX_VALUE;
         }
      }
   }

   public void d(boolean $$0) {
      if (this.C()) {
         this.e($$0);
      }
   }

   private void e(boolean $$0) {
      this.y.a(this::a);
      String $$1 = this.y.a(!$$0);
      if (!$$1.isEmpty()) {
         this.j.aY().a($$1);
      }
   }

   protected boolean aM_() {
      return true;
   }

   protected void a(fhl $$0) {
      $$0.a(fhk.a, this.i());
      if (this.aM_()) {
         $$0.a(fhk.d, c);
      }

      this.b($$0);
   }

   protected void b(fhl $$0) {
      List<fhj> $$1 = this.o.stream().filter(fhj::B).collect(Collectors.toList());
      Collections.sort($$1, Comparator.comparingInt(fez::H));
      fjo.b $$2 = a($$1, this.B);
      if ($$2 != null) {
         if ($$2.c.a()) {
            this.B = $$2.a;
         }

         if ($$1.size() > 1) {
            $$0.a(fhk.b, wg.a("narrator.position.screen", $$2.b + 1, $$1.size()));
            if ($$2.c == fhj.a.c) {
               $$0.a(fhk.d, this.z());
            }
         }

         $$2.a.b($$0.a());
      }
   }

   protected wg z() {
      return wg.c("narration.component_list.usage");
   }

   @Nullable
   public static fjo.b a(List<? extends fhj> $$0, @Nullable fhj $$1) {
      fjo.b $$2 = null;
      fjo.b $$3 = null;
      int $$4 = 0;

      for (int $$5 = $$0.size(); $$4 < $$5; $$4++) {
         fhj $$6 = $$0.get($$4);
         fhj.a $$7 = $$6.t();
         if ($$7.a()) {
            if ($$6 != $$1) {
               return new fjo.b($$6, $$4, $$7);
            }

            $$3 = new fjo.b($$6, $$4, $$7);
         } else if ($$7.compareTo($$2 != null ? $$2.c : fhj.a.a) > 0) {
            $$2 = new fjo.b($$6, $$4, $$7);
         }
      }

      return $$2 != null ? $$2 : $$3;
   }

   public void A() {
      this.a(u, false);
   }

   public void b(List<aww> $$0) {
      this.a($$0, fmh.a, true);
   }

   public void a(List<aww> $$0, fmg $$1, boolean $$2) {
      if (this.C == null || $$2) {
         this.C = new fjo.a($$0, $$1);
      }
   }

   public void d(wg $$0) {
      this.b(ffa.a(this.j, $$0));
   }

   public void a(ffa $$0, fmg $$1, boolean $$2) {
      this.a($$0.a(this.j), $$1, $$2);
   }

   protected static void a(fdn... $$0) {
      for (fdn $$1 : $$0) {
         $$1.k = false;
      }
   }

   @Override
   public fhv G() {
      return new fhv(0, 0, this.k, this.l);
   }

   @Nullable
   public auj B() {
      return null;
   }

   static record a(List<aww> a, fmg b) {
   }

   public static class b {
      public final fhj a;
      public final int b;
      public final fhj.a c;

      public b(fhj $$0, int $$1, fhj.a $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
