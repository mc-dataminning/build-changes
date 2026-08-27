import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
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

public abstract class fdm extends ezk implements eyu {
   private static final Logger a = LogUtils.getLogger();
   private static final Set<String> b = Sets.newHashSet(new String[]{"http", "https"});
   private static final vg c = vg.c("narrator.screen.usage");
   public static final ahh d = new ahh("textures/gui/options_background.png");
   protected final vg e;
   private final List<ezm> k = Lists.newArrayList();
   private final List<fbi> l = Lists.newArrayList();
   @Nullable
   protected evr f;
   private boolean m;
   public int g;
   public int h;
   private final List<eyu> n = Lists.newArrayList();
   protected exc i;
   @Nullable
   private URI o;
   private static final long p = TimeUnit.SECONDS.toMillis(2L);
   private static final long q = p;
   private static final long r = 750L;
   private static final long t = 200L;
   private static final long u = 200L;
   private final fbn v = new fbn();
   private long w = Long.MIN_VALUE;
   private long x = Long.MAX_VALUE;
   @Nullable
   private fbi y;
   @Nullable
   private fdm.a z;
   protected final Executor j = $$0x -> this.f.execute(() -> {
         if (this.f.y == this) {
            $$0x.run();
         }
      });

   protected fdm(vg $$0) {
      this.e = $$0;
   }

   public vg p() {
      return this.e;
   }

   public vg i() {
      return this.p();
   }

   public final void c(exe $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$1, $$2, $$3);
      if (this.z != null) {
         $$0.a(this.i, this.z.a(), this.z.b(), $$1, $$2);
         this.z = null;
      }
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      this.b($$0, $$1, $$2, $$3);

      for (eyu $$4 : this.n) {
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256 && this.aN_()) {
         this.d();
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         fbq $$3 = (fbq)(switch ($$0) {
            case 258 -> this.o();
            default -> null;
            case 262 -> this.a(fbs.d);
            case 263 -> this.a(fbs.c);
            case 264 -> this.a(fbs.b);
            case 265 -> this.a(fbs.a);
         });
         if ($$3 != null) {
            exb $$4 = super.a($$3);
            if ($$4 == null && $$3 instanceof fbq.c) {
               this.q();
               $$4 = super.a($$3);
            }

            if ($$4 != null) {
               this.a($$4);
            }
         }

         return false;
      }
   }

   private fbq.c o() {
      boolean $$0 = !v();
      return new fbq.c($$0);
   }

   private fbq.a a(fbs $$0) {
      return new fbq.a($$0);
   }

   protected void c(ezm $$0) {
      exb $$1 = exb.a(this, $$0.a(new fbq.b()));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   public void q() {
      exb $$0 = this.aL_();
      if ($$0 != null) {
         $$0.a(false);
      }
   }

   @VisibleForTesting
   protected void a(exb $$0) {
      this.q();
      $$0.a(true);
   }

   public boolean aN_() {
      return true;
   }

   public void d() {
      this.f.a(null);
   }

   protected <T extends ezm & eyu & fbi> T d(T $$0) {
      this.n.add($$0);
      return this.e($$0);
   }

   protected <T extends eyu> T a(T $$0) {
      this.n.add($$0);
      return $$0;
   }

   protected <T extends ezm & fbi> T e(T $$0) {
      this.k.add($$0);
      this.l.add($$0);
      return $$0;
   }

   protected void f(ezm $$0) {
      if ($$0 instanceof eyu) {
         this.n.remove((eyu)$$0);
      }

      if ($$0 instanceof fbi) {
         this.l.remove((fbi)$$0);
      }

      this.k.remove($$0);
   }

   protected void r() {
      this.n.clear();
      this.k.clear();
      this.l.clear();
   }

   public static List<vg> a(evr $$0, cng $$1) {
      return $$1.a($$0.s, $$0.m.m ? coy.a.b : coy.a.a);
   }

   protected void a_(String $$0, boolean $$1) {
   }

   public boolean a(@Nullable wd $$0) {
      if ($$0 == null) {
         return false;
      } else {
         ve $$1 = $$0.h();
         if (v()) {
            if ($$0.j() != null) {
               this.a_($$0.j(), false);
            }
         } else if ($$1 != null) {
            if ($$1.a() == ve.a.a) {
               if (!this.f.m.J().c()) {
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

                  if (this.f.m.K().c()) {
                     this.o = $$2;
                     this.f.a(new fce(this::c, $$1.b(), false));
                  } else {
                     this.a($$2);
                  }
               } catch (URISyntaxException var5) {
                  a.error("Can't open url for {}", $$1, var5);
               }
            } else if ($$1.a() == ve.a.b) {
               URI $$5 = new File($$1.b()).toURI();
               this.a($$5);
            } else if ($$1.a() == ve.a.d) {
               this.a_(aa.a($$1.b()), true);
            } else if ($$1.a() == ve.a.c) {
               String $$6 = aa.a($$1.b());
               if ($$6.startsWith("/")) {
                  if (!this.f.s.cr.d($$6.substring(1))) {
                     a.error("Not allowed to run command with signed argument from click event: '{}'", $$6);
                  }
               } else {
                  a.error("Failed to run command without '/' prefix from click event: '{}'", $$6);
               }
            } else if ($$1.a() == ve.a.f) {
               this.f.o.a($$1.b());
            } else {
               a.error("Don't know how to handle {}", $$1);
            }

            return true;
         }

         return false;
      }
   }

   public final void b(evr $$0, int $$1, int $$2) {
      this.f = $$0;
      this.i = $$0.h;
      this.g = $$1;
      this.h = $$2;
      if (!this.m) {
         this.aP_();
      } else {
         this.c();
      }

      this.m = true;
      this.d(false);
      this.a(p);
   }

   protected void s() {
      this.r();
      this.q();
      this.aP_();
   }

   @Override
   public List<? extends ezm> l() {
      return this.k;
   }

   protected void aP_() {
   }

   public void e() {
   }

   public void k() {
   }

   public void aH_() {
   }

   public void b(exe $$0, int $$1, int $$2, float $$3) {
      if (this.f.r != null) {
         this.a($$0);
      } else {
         this.b($$0);
      }
   }

   public void a(exe $$0) {
      $$0.b(0, 0, this.g, this.h, -1072689136, -804253680);
   }

   public void b(exe $$0) {
      $$0.a(0.25F, 0.25F, 0.25F, 1.0F);
      int $$1 = 32;
      $$0.a(d, 0, 0, 0, 0.0F, 0.0F, this.g, this.h, 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public boolean m() {
      return true;
   }

   private void c(boolean $$0) {
      if ($$0) {
         this.a(this.o);
      }

      this.o = null;
      this.f.a(this);
   }

   private void a(URI $$0) {
      ac.j().a($$0);
   }

   public static boolean t() {
      return evr.a ? epf.a(evr.O().aM().i(), 343) || epf.a(evr.O().aM().i(), 347) : epf.a(evr.O().aM().i(), 341) || epf.a(evr.O().aM().i(), 345);
   }

   public static boolean v() {
      return epf.a(evr.O().aM().i(), 340) || epf.a(evr.O().aM().i(), 344);
   }

   public static boolean w() {
      return epf.a(evr.O().aM().i(), 342) || epf.a(evr.O().aM().i(), 346);
   }

   public static boolean c(int $$0) {
      return $$0 == 88 && t() && !v() && !w();
   }

   public static boolean d(int $$0) {
      return $$0 == 86 && t() && !v() && !w();
   }

   public static boolean e(int $$0) {
      return $$0 == 67 && t() && !v() && !w();
   }

   public static boolean f(int $$0) {
      return $$0 == 65 && t() && !v() && !w();
   }

   protected void c() {
      this.s();
   }

   public void a(evr $$0, int $$1, int $$2) {
      this.g = $$1;
      this.h = $$2;
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
      this.x = ac.b() + $$0;
      if ($$1) {
         this.w = Long.MIN_VALUE;
      }
   }

   private void a(long $$0) {
      this.w = ac.b() + $$0;
   }

   public void x() {
      this.a(750L, false);
   }

   public void y() {
      this.a(200L, true);
   }

   public void z() {
      this.a(200L, true);
   }

   private boolean E() {
      return this.f.aW().a();
   }

   public void A() {
      if (this.E()) {
         long $$0 = ac.b();
         if ($$0 > this.x && $$0 > this.w) {
            this.e(true);
            this.x = Long.MAX_VALUE;
         }
      }
   }

   public void d(boolean $$0) {
      if (this.E()) {
         this.e($$0);
      }
   }

   private void e(boolean $$0) {
      this.v.a(this::a);
      String $$1 = this.v.a(!$$0);
      if (!$$1.isEmpty()) {
         this.f.aW().a($$1);
      }
   }

   protected boolean aO_() {
      return true;
   }

   protected void a(fbk $$0) {
      $$0.a(fbj.a, this.i());
      if (this.aO_()) {
         $$0.a(fbj.d, c);
      }

      this.b($$0);
   }

   protected void b(fbk $$0) {
      List<fbi> $$1 = this.l.stream().filter(fbi::A).collect(Collectors.toList());
      Collections.sort($$1, Comparator.comparingInt(ezb::G));
      fdm.b $$2 = a($$1, this.y);
      if ($$2 != null) {
         if ($$2.c.a()) {
            this.y = $$2.a;
         }

         if ($$1.size() > 1) {
            $$0.a(fbj.b, vg.a("narrator.position.screen", $$2.b + 1, $$1.size()));
            if ($$2.c == fbi.a.c) {
               $$0.a(fbj.d, this.B());
            }
         }

         $$2.a.b($$0.a());
      }
   }

   protected vg B() {
      return vg.c("narration.component_list.usage");
   }

   @Nullable
   public static fdm.b a(List<? extends fbi> $$0, @Nullable fbi $$1) {
      fdm.b $$2 = null;
      fdm.b $$3 = null;
      int $$4 = 0;

      for (int $$5 = $$0.size(); $$4 < $$5; $$4++) {
         fbi $$6 = $$0.get($$4);
         fbi.a $$7 = $$6.s();
         if ($$7.a()) {
            if ($$6 != $$1) {
               return new fdm.b($$6, $$4, $$7);
            }

            $$3 = new fdm.b($$6, $$4, $$7);
         } else if ($$7.compareTo($$2 != null ? $$2.c : fbi.a.a) > 0) {
            $$2 = new fdm.b($$6, $$4, $$7);
         }
      }

      return $$2 != null ? $$2 : $$3;
   }

   public void C() {
      this.a(q, false);
   }

   public void b(List<aub> $$0) {
      this.a($$0, fgg.a, true);
   }

   public void a(List<aub> $$0, fgf $$1, boolean $$2) {
      if (this.z == null || $$2) {
         this.z = new fdm.a($$0, $$1);
      }
   }

   public void d(vg $$0) {
      this.b(ezc.a(this.f, $$0));
   }

   public void a(ezc $$0, fgf $$1, boolean $$2) {
      this.a($$0.a(this.f), $$1, $$2);
   }

   protected static void a(exp... $$0) {
      for (exp $$1 : $$0) {
         $$1.k = false;
      }
   }

   @Override
   public fbu F() {
      return new fbu(0, 0, this.g, this.h);
   }

   @Nullable
   public arq D() {
      return null;
   }

   static record a(List<aub> a, fgf b) {
   }

   public static class b {
      public final fbi a;
      public final int b;
      public final fbi.a c;

      public b(fbi $$0, int $$1, fbi.a $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
