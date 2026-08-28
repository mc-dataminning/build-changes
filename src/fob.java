import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
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

public abstract class fob extends fke implements fjn {
   private static final Logger a = LogUtils.getLogger();
   private static final wz b = wz.c("narrator.screen.usage");
   protected static final gel d = new gel(akr.b("textures/gui/title/background/panorama"));
   protected static final gez e = new gez(d);
   public static final akr f = akr.b("textures/gui/menu_background.png");
   public static final akr g = akr.b("textures/gui/header_separator.png");
   public static final akr h = akr.b("textures/gui/footer_separator.png");
   private static final akr c = akr.b("textures/gui/inworld_menu_background.png");
   public static final akr i = akr.b("textures/gui/inworld_header_separator.png");
   public static final akr j = akr.b("textures/gui/inworld_footer_separator.png");
   protected final wz k;
   private final List<fkg> r = Lists.newArrayList();
   private final List<fme> s = Lists.newArrayList();
   @Nullable
   protected fgm l;
   private boolean u;
   public int m;
   public int n;
   private final List<fjn> v = Lists.newArrayList();
   protected fhv o;
   private static final long w = TimeUnit.SECONDS.toMillis(2L);
   private static final long x = w;
   private static final long y = 750L;
   private static final long z = 200L;
   private static final long A = 200L;
   private final fmj B = new fmj();
   private long C = Long.MIN_VALUE;
   private long D = Long.MAX_VALUE;
   @Nullable
   protected fir<fgo> p;
   @Nullable
   private fme E;
   @Nullable
   private fob.a F;
   protected final Executor q = $$0x -> this.l.execute(() -> {
         if (this.l.y == this) {
            $$0x.run();
         }
      });

   protected fob(wz $$0) {
      this.k = $$0;
   }

   public wz n() {
      return this.k;
   }

   public wz i() {
      return this.n();
   }

   public final void c(fhx $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$1, $$2, $$3);
      if (this.F != null) {
         $$0.a(this.o, this.F.a(), this.F.b(), $$1, $$2);
         this.F = null;
      }
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      this.b($$0, $$1, $$2, $$3);

      for (fjn $$4 : this.v) {
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
         fmm $$3 = (fmm)(switch ($$0) {
            case 258 -> this.m();
            default -> null;
            case 262 -> this.a(fmo.d);
            case 263 -> this.a(fmo.c);
            case 264 -> this.a(fmo.b);
            case 265 -> this.a(fmo.a);
         });
         if ($$3 != null) {
            fhu $$4 = super.a($$3);
            if ($$4 == null && $$3 instanceof fmm.c) {
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

   private fmm.c m() {
      boolean $$0 = !s();
      return new fmm.c($$0);
   }

   private fmm.a a(fmo $$0) {
      return new fmm.a($$0);
   }

   protected void aI_() {
      if (this.l.aU().b()) {
         fmm.c $$0 = new fmm.c(true);
         fhu $$1 = super.a($$0);
         if ($$1 != null) {
            this.a($$1);
         }
      }
   }

   protected void b(fkg $$0) {
      fhu $$1 = fhu.a(this, $$0.a(new fmm.b()));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   public void o() {
      fhu $$0 = this.aP_();
      if ($$0 != null) {
         $$0.a(false);
      }
   }

   @VisibleForTesting
   protected void a(fhu $$0) {
      this.o();
      $$0.a(true);
   }

   public boolean aJ_() {
      return true;
   }

   public void d() {
      this.l.a(null);
   }

   protected <T extends fkg & fjn & fme> T c(T $$0) {
      this.v.add($$0);
      return this.d($$0);
   }

   protected <T extends fjn> T a(T $$0) {
      this.v.add($$0);
      return $$0;
   }

   protected <T extends fkg & fme> T d(T $$0) {
      this.r.add($$0);
      this.s.add($$0);
      return $$0;
   }

   protected void e(fkg $$0) {
      if ($$0 instanceof fjn) {
         this.v.remove((fjn)$$0);
      }

      if ($$0 instanceof fme) {
         this.s.remove((fme)$$0);
      }

      this.r.remove($$0);
   }

   protected void p() {
      this.v.clear();
      this.r.clear();
      this.s.clear();
   }

   public static List<wz> a(fgm $$0, cuq $$1) {
      return $$1.a(cul.b.a($$0.r), $$0.s, $$0.m.m ? cwm.a.b : cwm.a.a);
   }

   protected void a_(String $$0, boolean $$1) {
   }

   public boolean a(@Nullable xw $$0) {
      if ($$0 == null) {
         return false;
      } else {
         wx $$1 = $$0.h();
         if (s()) {
            if ($$0.j() != null) {
               this.a_($$0.j(), false);
            }
         } else if ($$1 != null) {
            if ($$1.a() == wx.a.a) {
               if (!this.l.m.L().c()) {
                  return false;
               }

               try {
                  URI $$2 = ad.a($$1.b());
                  if (this.l.m.M().c()) {
                     this.l.a(new fmy($$1x -> {
                        if ($$1x) {
                           ad.k().a($$2);
                        }

                        this.l.a(this);
                     }, $$1.b(), false));
                  } else {
                     ad.k().a($$2);
                  }
               } catch (URISyntaxException var4) {
                  a.error("Can't open url for {}", $$1, var4);
               }
            } else if ($$1.a() == wx.a.b) {
               ad.k().a(new File($$1.b()));
            } else if ($$1.a() == wx.a.d) {
               this.a_(azl.g($$1.b()), true);
            } else if ($$1.a() == wx.a.c) {
               String $$4 = azl.g($$1.b());
               if ($$4.startsWith("/")) {
                  if (!this.l.s.h.d($$4.substring(1))) {
                     a.error("Not allowed to run command with signed argument from click event: '{}'", $$4);
                  }
               } else {
                  a.error("Failed to run command without '/' prefix from click event: '{}'", $$4);
               }
            } else if ($$1.a() == wx.a.f) {
               this.l.o.a($$1.b());
            } else {
               a.error("Don't know how to handle {}", $$1);
            }

            return true;
         }

         return false;
      }
   }

   public final void b(fgm $$0, int $$1, int $$2) {
      this.l = $$0;
      this.o = $$0.h;
      this.m = $$1;
      this.n = $$2;
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
   public List<? extends fkg> aK_() {
      return this.r;
   }

   protected void aT_() {
   }

   public void e() {
   }

   public void j() {
   }

   public void aL_() {
   }

   public void b(fhx $$0, int $$1, int $$2, float $$3) {
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

   protected void a(fhx $$0, float $$1) {
      e.a($$0, this.m, this.n, 1.0F, $$1);
   }

   protected void a(fhx $$0) {
      this.a($$0, 0, 0, this.m, this.n);
   }

   protected void a(fhx $$0, int $$1, int $$2, int $$3, int $$4) {
      a($$0, this.l.r == null ? f : c, $$1, $$2, 0.0F, 0.0F, $$3, $$4);
   }

   public static void a(fhx $$0, akr $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7) {
      int $$8 = 32;
      RenderSystem.enableBlend();
      $$0.a($$1, $$2, $$3, 0, $$4, $$5, $$6, $$7, 32, 32);
      RenderSystem.disableBlend();
   }

   public void b(fhx $$0) {
      $$0.b(0, 0, this.m, this.n, -1072689136, -804253680);
   }

   public boolean k() {
      return true;
   }

   public static boolean r() {
      return fgm.a ? fac.a(fgm.Q().aM().j(), 343) || fac.a(fgm.Q().aM().j(), 347) : fac.a(fgm.Q().aM().j(), 341) || fac.a(fgm.Q().aM().j(), 345);
   }

   public static boolean s() {
      return fac.a(fgm.Q().aM().j(), 340) || fac.a(fgm.Q().aM().j(), 344);
   }

   public static boolean t() {
      return fac.a(fgm.Q().aM().j(), 342) || fac.a(fgm.Q().aM().j(), 346);
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

   public void a(fgm $$0, int $$1, int $$2) {
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

   public void u() {
      this.a(750L, false);
   }

   public void v() {
      this.a(200L, true);
   }

   public void x() {
      this.a(200L, true);
   }

   private boolean C() {
      return this.l.aV().a();
   }

   public void y() {
      if (this.C()) {
         long $$0 = ad.c();
         if ($$0 > this.D && $$0 > this.C) {
            this.c(true);
            this.D = Long.MAX_VALUE;
         }
      }
   }

   public void d(boolean $$0) {
      if (this.C()) {
         this.c($$0);
      }
   }

   private void c(boolean $$0) {
      this.B.a(this::a);
      String $$1 = this.B.a(!$$0);
      if (!$$1.isEmpty()) {
         this.l.aV().a($$1);
      }
   }

   protected boolean aS_() {
      return true;
   }

   protected void a(fmg $$0) {
      $$0.a(fmf.a, this.i());
      if (this.aS_()) {
         $$0.a(fmf.d, b);
      }

      this.b($$0);
   }

   protected void b(fmg $$0) {
      List<fme> $$1 = this.s.stream().filter(fme::C).sorted(Comparator.comparingInt(fju::I)).toList();
      fob.b $$2 = a($$1, this.E);
      if ($$2 != null) {
         if ($$2.c.a()) {
            this.E = $$2.a;
         }

         if ($$1.size() > 1) {
            $$0.a(fmf.b, wz.a("narrator.position.screen", $$2.b + 1, $$1.size()));
            if ($$2.c == fme.a.c) {
               $$0.a(fmf.d, this.z());
            }
         }

         $$2.a.b($$0.a());
      }
   }

   protected wz z() {
      return wz.c("narration.component_list.usage");
   }

   @Nullable
   public static fob.b a(List<? extends fme> $$0, @Nullable fme $$1) {
      fob.b $$2 = null;
      fob.b $$3 = null;
      int $$4 = 0;

      for (int $$5 = $$0.size(); $$4 < $$5; $$4++) {
         fme $$6 = $$0.get($$4);
         fme.a $$7 = $$6.u();
         if ($$7.a()) {
            if ($$6 != $$1) {
               return new fob.b($$6, $$4, $$7);
            }

            $$3 = new fob.b($$6, $$4, $$7);
         } else if ($$7.compareTo($$2 != null ? $$2.c : fme.a.a) > 0) {
            $$2 = new fob.b($$6, $$4, $$7);
         }
      }

      return $$2 != null ? $$2 : $$3;
   }

   public void e(boolean $$0) {
      if ($$0) {
         this.a(x, false);
      }

      if (this.p != null) {
         this.p.a(this.l.m.as().c());
      }
   }

   protected void A() {
      this.F = null;
   }

   public void b(List<aya> $$0) {
      this.a($$0, fqn.a, true);
   }

   public void a(List<aya> $$0, fqm $$1, boolean $$2) {
      if (this.F == null || $$2) {
         this.F = new fob.a($$0, $$1);
      }
   }

   public void d(wz $$0) {
      this.b(fjv.a(this.l, $$0));
   }

   public void a(fjv $$0, fqm $$1, boolean $$2) {
      this.a($$0.a(this.l), $$1, $$2);
   }

   @Override
   public fmq H() {
      return new fmq(0, 0, this.m, this.n);
   }

   @Nullable
   public avm B() {
      return null;
   }

   static record a(List<aya> a, fqm b) {
   }

   public static class b {
      public final fme a;
      public final int b;
      public final fme.a c;

      public b(fme $$0, int $$1, fme.a $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
