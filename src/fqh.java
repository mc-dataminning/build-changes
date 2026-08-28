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

public abstract class fqh extends fmj implements flr {
   private static final Logger a = LogUtils.getLogger();
   private static final xe b = xe.c("narrator.screen.usage");
   protected static final ggw e = new ggw(ale.b("textures/gui/title/background/panorama"));
   protected static final gho f = new gho(e);
   public static final ale g = ale.b("textures/gui/menu_background.png");
   public static final ale h = ale.b("textures/gui/header_separator.png");
   public static final ale i = ale.b("textures/gui/footer_separator.png");
   private static final ale c = ale.b("textures/gui/inworld_menu_background.png");
   public static final ale j = ale.b("textures/gui/inworld_header_separator.png");
   public static final ale k = ale.b("textures/gui/inworld_footer_separator.png");
   protected final xe l;
   private final List<fml> d = Lists.newArrayList();
   private final List<foj> s = Lists.newArrayList();
   @Nullable
   protected fip m;
   private boolean u;
   public int n;
   public int o;
   private final List<flr> v = Lists.newArrayList();
   protected fjz p;
   private static final long w = TimeUnit.SECONDS.toMillis(2L);
   private static final long x = w;
   private static final long y = 750L;
   private static final long z = 200L;
   private static final long A = 200L;
   private final foo B = new foo();
   private long C = Long.MIN_VALUE;
   private long D = Long.MAX_VALUE;
   @Nullable
   protected fkv<fir> q;
   @Nullable
   private foj E;
   @Nullable
   private fqh.a F;
   protected final Executor r = $$0x -> this.m.execute(() -> {
         if (this.m.z == this) {
            $$0x.run();
         }
      });

   protected fqh(xe $$0) {
      this.l = $$0;
   }

   public xe n() {
      return this.l;
   }

   public xe i() {
      return this.n();
   }

   public final void c(fkb $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$1, $$2, $$3);
      if (this.F != null) {
         $$0.a(this.p, this.F.a(), this.F.b(), $$1, $$2);
         this.F = null;
      }
   }

   @Override
   public void a(fkb $$0, int $$1, int $$2, float $$3) {
      this.b($$0, $$1, $$2, $$3);

      for (flr $$4 : this.v) {
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256 && this.aI_()) {
         this.d();
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         fos $$3 = (fos)(switch ($$0) {
            case 258 -> this.m();
            default -> null;
            case 262 -> this.a(fou.d);
            case 263 -> this.a(fou.c);
            case 264 -> this.a(fou.b);
            case 265 -> this.a(fou.a);
         });
         if ($$3 != null) {
            fjy $$4 = super.a($$3);
            if ($$4 == null && $$3 instanceof fos.c) {
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

   private fos.c m() {
      boolean $$0 = !t();
      return new fos.c($$0);
   }

   private fos.a a(fou $$0) {
      return new fos.a($$0);
   }

   protected void aH_() {
      if (this.m.aY().b()) {
         fos.c $$0 = new fos.c(true);
         fjy $$1 = super.a($$0);
         if ($$1 != null) {
            this.a($$1);
         }
      }
   }

   protected void b(fml $$0) {
      fjy $$1 = fjy.a(this, $$0.a(new fos.b()));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   public void o() {
      fjy $$0 = this.aO_();
      if ($$0 != null) {
         $$0.a(false);
      }
   }

   @VisibleForTesting
   protected void a(fjy $$0) {
      this.o();
      $$0.a(true);
   }

   public boolean aI_() {
      return true;
   }

   public void d() {
      this.m.a(null);
   }

   protected <T extends fml & flr & foj> T c(T $$0) {
      this.v.add($$0);
      return this.d($$0);
   }

   protected <T extends flr> T a(T $$0) {
      this.v.add($$0);
      return $$0;
   }

   protected <T extends fml & foj> T d(T $$0) {
      this.d.add($$0);
      this.s.add($$0);
      return $$0;
   }

   protected void e(fml $$0) {
      if ($$0 instanceof flr) {
         this.v.remove((flr)$$0);
      }

      if ($$0 instanceof foj) {
         this.s.remove((foj)$$0);
      }

      this.d.remove($$0);
   }

   protected void p() {
      this.v.clear();
      this.d.clear();
      this.s.clear();
   }

   public static List<xe> a(fip $$0, cvs $$1) {
      return $$1.a(cvn.b.a($$0.s), $$0.t, $$0.n.m ? cxk.a.b : cxk.a.a);
   }

   protected void a_(String $$0, boolean $$1) {
   }

   public boolean a(@Nullable yb $$0) {
      if ($$0 == null) {
         return false;
      } else {
         xc $$1 = $$0.h();
         if (t()) {
            if ($$0.j() != null) {
               this.a_($$0.j(), false);
            }
         } else if ($$1 != null) {
            if ($$1.a() == xc.a.a) {
               if (!this.m.n.N().c()) {
                  return false;
               }

               try {
                  URI $$2 = ad.a($$1.b());
                  if (this.m.n.O().c()) {
                     this.m.a(new fpe($$1x -> {
                        if ($$1x) {
                           ad.m().a($$2);
                        }

                        this.m.a(this);
                     }, $$1.b(), false));
                  } else {
                     ad.m().a($$2);
                  }
               } catch (URISyntaxException var4) {
                  a.error("Can't open url for {}", $$1, var4);
               }
            } else if ($$1.a() == xc.a.b) {
               ad.m().a(new File($$1.b()));
            } else if ($$1.a() == xc.a.d) {
               this.a_(bac.g($$1.b()), true);
            } else if ($$1.a() == xc.a.c) {
               String $$4 = bac.g($$1.b());
               if ($$4.startsWith("/")) {
                  if (!this.m.t.cw.d($$4.substring(1))) {
                     a.error("Not allowed to run command with signed argument from click event: '{}'", $$4);
                  }
               } else {
                  a.error("Failed to run command without '/' prefix from click event: '{}'", $$4);
               }
            } else if ($$1.a() == xc.a.f) {
               this.m.p.a($$1.b());
            } else {
               a.error("Don't know how to handle {}", $$1);
            }

            return true;
         }

         return false;
      }
   }

   public final void b(fip $$0, int $$1, int $$2) {
      this.m = $$0;
      this.p = $$0.h;
      this.n = $$1;
      this.o = $$2;
      if (!this.u) {
         this.aS_();
         this.aH_();
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
      this.aS_();
      this.aH_();
   }

   @Override
   public List<? extends fml> aJ_() {
      return this.d;
   }

   protected void aS_() {
   }

   public void e() {
   }

   public void j() {
   }

   public void aK_() {
   }

   public void b(fkb $$0, int $$1, int $$2, float $$3) {
      if (this.m.s == null) {
         this.a($$0, $$3);
      }

      this.r();
      this.a($$0);
   }

   protected void r() {
      this.m.j.d();
      this.m.h().a(false);
   }

   protected void a(fkb $$0, float $$1) {
      f.a($$0, this.n, this.o, 1.0F, $$1);
   }

   protected void a(fkb $$0) {
      this.a($$0, 0, 0, this.n, this.o);
   }

   protected void a(fkb $$0, int $$1, int $$2, int $$3, int $$4) {
      a($$0, this.m.s == null ? g : c, $$1, $$2, 0.0F, 0.0F, $$3, $$4);
   }

   public static void a(fkb $$0, ale $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7) {
      int $$8 = 32;
      $$0.a(ghv::B, $$1, $$2, $$3, $$4, $$5, $$6, $$7, 32, 32);
   }

   public void b(fkb $$0) {
      $$0.b(0, 0, this.n, this.o, -1072689136, -804253680);
   }

   public boolean k() {
      return true;
   }

   public static boolean s() {
      return fip.a ? fcd.a(fip.Q().aP().i(), 343) || fcd.a(fip.Q().aP().i(), 347) : fcd.a(fip.Q().aP().i(), 341) || fcd.a(fip.Q().aP().i(), 345);
   }

   public static boolean t() {
      return fcd.a(fip.Q().aP().i(), 340) || fcd.a(fip.Q().aP().i(), 344);
   }

   public static boolean u() {
      return fcd.a(fip.Q().aP().i(), 342) || fcd.a(fip.Q().aP().i(), 346);
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

   public void a(fip $$0, int $$1, int $$2) {
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
      this.D = ad.c() + $$0;
      if ($$1) {
         this.C = Long.MIN_VALUE;
      }
   }

   private void a(long $$0) {
      this.C = ad.c() + $$0;
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

   private boolean D() {
      return this.m.aZ().a();
   }

   public void z() {
      if (this.D()) {
         long $$0 = ad.c();
         if ($$0 > this.D && $$0 > this.C) {
            this.c(true);
            this.D = Long.MAX_VALUE;
         }
      }
   }

   public void d(boolean $$0) {
      if (this.D()) {
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

   protected boolean aR_() {
      return true;
   }

   protected void a(fol $$0) {
      $$0.a(fok.a, this.i());
      if (this.aR_()) {
         $$0.a(fok.d, b);
      }

      this.b($$0);
   }

   protected void b(fol $$0) {
      List<foj> $$1 = this.s.stream().filter(foj::C).sorted(Comparator.comparingInt(fly::I)).toList();
      fqh.b $$2 = a($$1, this.E);
      if ($$2 != null) {
         if ($$2.c.a()) {
            this.E = $$2.a;
         }

         if ($$1.size() > 1) {
            $$0.a(fok.b, xe.a("narrator.position.screen", $$2.b + 1, $$1.size()));
            if ($$2.c == foj.a.c) {
               $$0.a(fok.d, this.A());
            }
         }

         $$2.a.b($$0.a());
      }
   }

   protected xe A() {
      return xe.c("narration.component_list.usage");
   }

   @Nullable
   public static fqh.b a(List<? extends foj> $$0, @Nullable foj $$1) {
      fqh.b $$2 = null;
      fqh.b $$3 = null;
      int $$4 = 0;

      for (int $$5 = $$0.size(); $$4 < $$5; $$4++) {
         foj $$6 = $$0.get($$4);
         foj.a $$7 = $$6.u();
         if ($$7.a()) {
            if ($$6 != $$1) {
               return new fqh.b($$6, $$4, $$7);
            }

            $$3 = new fqh.b($$6, $$4, $$7);
         } else if ($$7.compareTo($$2 != null ? $$2.c : foj.a.a) > 0) {
            $$2 = new fqh.b($$6, $$4, $$7);
         }
      }

      return $$2 != null ? $$2 : $$3;
   }

   public void e(boolean $$0) {
      if ($$0) {
         this.a(x, false);
      }

      if (this.q != null) {
         this.q.a(this.m.n.au().c());
      }
   }

   protected void B() {
      this.F = null;
   }

   public void b(List<ayr> $$0) {
      this.a($$0, fss.a, true);
   }

   public void a(List<ayr> $$0, fsr $$1, boolean $$2) {
      if (this.F == null || $$2) {
         this.F = new fqh.a($$0, $$1);
      }
   }

   public void d(xe $$0) {
      this.b(flz.a(this.m, $$0));
   }

   public void a(flz $$0, fsr $$1, boolean $$2) {
      this.a($$0.a(this.m), $$1, $$2);
   }

   @Override
   public fow H() {
      return new fow(0, 0, this.n, this.o);
   }

   @Nullable
   public awd C() {
      return null;
   }

   static record a(List<ayr> a, fsr b) {
   }

   public static class b {
      public final foj a;
      public final int b;
      public final foj.a c;

      public b(foj $$0, int $$1, foj.a $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
