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

public abstract class eya extends ety implements eti {
   private static final Logger a = LogUtils.getLogger();
   private static final Set<String> b = Sets.newHashSet(new String[]{"http", "https"});
   private static final tf c = tf.c("narrator.screen.usage");
   public static final aer d = new aer("textures/gui/options_background.png");
   protected final tf e;
   private final List<eua> k = Lists.newArrayList();
   private final List<evw> l = Lists.newArrayList();
   @Nullable
   protected eql f;
   private boolean m;
   public int g;
   public int h;
   private final List<eti> n = Lists.newArrayList();
   protected ert i;
   @Nullable
   private URI o;
   private static final long p = TimeUnit.SECONDS.toMillis(2L);
   private static final long q = p;
   private static final long s = 750L;
   private static final long t = 200L;
   private static final long u = 200L;
   private final ewb v = new ewb();
   private long w = Long.MIN_VALUE;
   private long x = Long.MAX_VALUE;
   @Nullable
   private evw y;
   @Nullable
   private eya.a z;
   protected final Executor j = $$0x -> this.f.execute(() -> {
         if (this.f.y == this) {
            $$0x.run();
         }
      });

   protected eya(tf $$0) {
      this.e = $$0;
   }

   public tf m() {
      return this.e;
   }

   public tf e() {
      return this.m();
   }

   public final void c(erv $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$1, $$2, $$3);
      if (this.z != null) {
         $$0.a(this.i, this.z.a(), this.z.b(), $$1, $$2);
         this.z = null;
      }
   }

   @Override
   public void a(erv $$0, int $$1, int $$2, float $$3) {
      this.b($$0, $$1, $$2, $$3);

      for (eti $$4 : this.n) {
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256 && this.ay_()) {
         this.at_();
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         ewe $$3 = (ewe)(switch ($$0) {
            case 258 -> this.l();
            default -> null;
            case 262 -> this.a(ewg.d);
            case 263 -> this.a(ewg.c);
            case 264 -> this.a(ewg.b);
            case 265 -> this.a(ewg.a);
         });
         if ($$3 != null) {
            ers $$4 = super.a($$3);
            if ($$4 == null && $$3 instanceof ewe.c) {
               this.C();
               $$4 = super.a($$3);
            }

            if ($$4 != null) {
               this.a($$4);
            }
         }

         return false;
      }
   }

   private ewe.c l() {
      boolean $$0 = !q();
      return new ewe.c($$0);
   }

   private ewe.a a(ewg $$0) {
      return new ewe.a($$0);
   }

   protected void c(eua $$0) {
      ers $$1 = ers.a(this, $$0.a(new ewe.b()));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   private void C() {
      ers $$0 = this.aA_();
      if ($$0 != null) {
         $$0.a(false);
      }
   }

   @VisibleForTesting
   protected void a(ers $$0) {
      this.C();
      $$0.a(true);
   }

   public boolean ay_() {
      return true;
   }

   public void at_() {
      this.f.a(null);
   }

   protected <T extends eua & eti & evw> T d(T $$0) {
      this.n.add($$0);
      return this.e($$0);
   }

   protected <T extends eti> T a(T $$0) {
      this.n.add($$0);
      return $$0;
   }

   protected <T extends eua & evw> T e(T $$0) {
      this.k.add($$0);
      this.l.add($$0);
      return $$0;
   }

   protected void f(eua $$0) {
      if ($$0 instanceof eti) {
         this.n.remove((eti)$$0);
      }

      if ($$0 instanceof evw) {
         this.l.remove((evw)$$0);
      }

      this.k.remove($$0);
   }

   protected void n() {
      this.n.clear();
      this.k.clear();
      this.l.clear();
   }

   public static List<tf> a(eql $$0, cix $$1) {
      return $$1.a($$0.s, $$0.m.m ? cko.a.b : cko.a.a);
   }

   protected void a(String $$0, boolean $$1) {
   }

   public boolean a(@Nullable ub $$0) {
      if ($$0 == null) {
         return false;
      } else {
         td $$1 = $$0.h();
         if (q()) {
            if ($$0.j() != null) {
               this.a($$0.j(), false);
            }
         } else if ($$1 != null) {
            if ($$1.a() == td.a.a) {
               if (!this.f.m.I().c()) {
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

                  if (this.f.m.J().c()) {
                     this.o = $$2;
                     this.f.a(new ews(this::c, $$1.b(), false));
                  } else {
                     this.a($$2);
                  }
               } catch (URISyntaxException var5) {
                  a.error("Can't open url for {}", $$1, var5);
               }
            } else if ($$1.a() == td.a.b) {
               URI $$5 = new File($$1.b()).toURI();
               this.a($$5);
            } else if ($$1.a() == td.a.d) {
               this.a(aa.a($$1.b()), true);
            } else if ($$1.a() == td.a.c) {
               String $$6 = aa.a($$1.b());
               if ($$6.startsWith("/")) {
                  if (!this.f.s.cl.d($$6.substring(1))) {
                     a.error("Not allowed to run command with signed argument from click event: '{}'", $$6);
                  }
               } else {
                  a.error("Failed to run command without '/' prefix from click event: '{}'", $$6);
               }
            } else if ($$1.a() == td.a.f) {
               this.f.o.a($$1.b());
            } else {
               a.error("Don't know how to handle {}", $$1);
            }

            return true;
         }

         return false;
      }
   }

   public final void b(eql $$0, int $$1, int $$2) {
      this.f = $$0;
      this.i = $$0.h;
      this.g = $$1;
      this.h = $$2;
      if (!this.m) {
         this.aC_();
      } else {
         this.b();
      }

      this.m = true;
      this.d(false);
      this.a(p);
   }

   protected void o() {
      this.n();
      this.C();
      this.aC_();
   }

   @Override
   public List<? extends eua> i() {
      return this.k;
   }

   protected void aC_() {
   }

   public void c() {
   }

   public void h() {
   }

   public void au_() {
   }

   public void b(erv $$0, int $$1, int $$2, float $$3) {
      if (this.f.r != null) {
         this.a($$0);
      } else {
         this.b($$0);
      }
   }

   public void a(erv $$0) {
      $$0.b(0, 0, this.g, this.h, -1072689136, -804253680);
   }

   public void b(erv $$0) {
      $$0.a(0.25F, 0.25F, 0.25F, 1.0F);
      int $$1 = 32;
      $$0.a(d, 0, 0, 0, 0.0F, 0.0F, this.g, this.h, 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public boolean j() {
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
      ac.i().a($$0);
   }

   public static boolean p() {
      return eql.a ? eka.a(eql.O().aM().i(), 343) || eka.a(eql.O().aM().i(), 347) : eka.a(eql.O().aM().i(), 341) || eka.a(eql.O().aM().i(), 345);
   }

   public static boolean q() {
      return eka.a(eql.O().aM().i(), 340) || eka.a(eql.O().aM().i(), 344);
   }

   public static boolean r() {
      return eka.a(eql.O().aM().i(), 342) || eka.a(eql.O().aM().i(), 346);
   }

   public static boolean d(int $$0) {
      return $$0 == 88 && p() && !q() && !r();
   }

   public static boolean e(int $$0) {
      return $$0 == 86 && p() && !q() && !r();
   }

   public static boolean f(int $$0) {
      return $$0 == 67 && p() && !q() && !r();
   }

   public static boolean g(int $$0) {
      return $$0 == 65 && p() && !q() && !r();
   }

   protected void b() {
      this.o();
   }

   public void a(eql $$0, int $$1, int $$2) {
      this.g = $$1;
      this.h = $$2;
      this.b();
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
   public boolean a_(double $$0, double $$1) {
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

   public void w() {
      this.a(750L, false);
   }

   public void x() {
      this.a(200L, true);
   }

   public void y() {
      this.a(200L, true);
   }

   private boolean G() {
      return this.f.aV().a();
   }

   public void z() {
      if (this.G()) {
         long $$0 = ac.b();
         if ($$0 > this.x && $$0 > this.w) {
            this.e(true);
            this.x = Long.MAX_VALUE;
         }
      }
   }

   public void d(boolean $$0) {
      if (this.G()) {
         this.e($$0);
      }
   }

   private void e(boolean $$0) {
      this.v.a(this::a);
      String $$1 = this.v.a(!$$0);
      if (!$$1.isEmpty()) {
         this.f.aV().a($$1);
      }
   }

   protected boolean aB_() {
      return true;
   }

   protected void a(evy $$0) {
      $$0.a(evx.a, this.e());
      if (this.aB_()) {
         $$0.a(evx.d, c);
      }

      this.b($$0);
   }

   protected void b(evy $$0) {
      List<evw> $$1 = this.l.stream().filter(evw::ax_).collect(Collectors.toList());
      Collections.sort($$1, Comparator.comparingInt(etp::u));
      eya.b $$2 = a($$1, this.y);
      if ($$2 != null) {
         if ($$2.c.a()) {
            this.y = $$2.a;
         }

         if ($$1.size() > 1) {
            $$0.a(evx.b, tf.a("narrator.position.screen", $$2.b + 1, $$1.size()));
            if ($$2.c == evw.a.c) {
               $$0.a(evx.d, tf.c("narration.component_list.usage"));
            }
         }

         $$2.a.b($$0.a());
      }
   }

   @Nullable
   public static eya.b a(List<? extends evw> $$0, @Nullable evw $$1) {
      eya.b $$2 = null;
      eya.b $$3 = null;
      int $$4 = 0;

      for (int $$5 = $$0.size(); $$4 < $$5; $$4++) {
         evw $$6 = $$0.get($$4);
         evw.a $$7 = $$6.q();
         if ($$7.a()) {
            if ($$6 != $$1) {
               return new eya.b($$6, $$4, $$7);
            }

            $$3 = new eya.b($$6, $$4, $$7);
         } else if ($$7.compareTo($$2 != null ? $$2.c : evw.a.a) > 0) {
            $$2 = new eya.b($$6, $$4, $$7);
         }
      }

      return $$2 != null ? $$2 : $$3;
   }

   public void A() {
      this.a(q, false);
   }

   public void b(List<arc> $$0) {
      this.a($$0, fas.a, true);
   }

   public void a(List<arc> $$0, far $$1, boolean $$2) {
      if (this.z == null || $$2) {
         this.z = new eya.a($$0, $$1);
      }
   }

   protected void d(tf $$0) {
      this.b(etq.a(this.f, $$0));
   }

   public void a(etq $$0, far $$1, boolean $$2) {
      this.a($$0.a(this.f), $$1, $$2);
   }

   protected static void a(ese... $$0) {
      for (ese $$1 : $$0) {
         $$1.j = false;
      }
   }

   @Override
   public ewi s() {
      return new ewi(0, 0, this.g, this.h);
   }

   @Nullable
   public aot B() {
      return null;
   }

   static record a(List<arc> a, far b) {
   }

   public static class b {
      public final evw a;
      public final int b;
      public final evw.a c;

      public b(evw $$0, int $$1, evw.a $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
