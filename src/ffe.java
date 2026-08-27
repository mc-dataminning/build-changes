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

public abstract class ffe extends fbb implements fak {
   private static final Logger a = LogUtils.getLogger();
   private static final Set<String> b = Sets.newHashSet(new String[]{"http", "https"});
   private static final vq c = vq.c("narrator.screen.usage");
   public static final aiy d = new aiy("textures/gui/options_background.png");
   protected final vq e;
   private final List<fbd> k = Lists.newArrayList();
   private final List<fda> l = Lists.newArrayList();
   @Nullable
   protected exh f;
   private boolean m;
   public int g;
   public int h;
   private final List<fak> n = Lists.newArrayList();
   protected eys i;
   @Nullable
   private URI o;
   private static final long p = TimeUnit.SECONDS.toMillis(2L);
   private static final long q = p;
   private static final long r = 750L;
   private static final long t = 200L;
   private static final long u = 200L;
   private final fdf v = new fdf();
   private long w = Long.MIN_VALUE;
   private long x = Long.MAX_VALUE;
   @Nullable
   private fda y;
   @Nullable
   private ffe.a z;
   protected final Executor j = $$0x -> this.f.execute(() -> {
         if (this.f.y == this) {
            $$0x.run();
         }
      });

   protected ffe(vq $$0) {
      this.e = $$0;
   }

   public vq p() {
      return this.e;
   }

   public vq i() {
      return this.p();
   }

   public final void c(eyu $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$1, $$2, $$3);
      if (this.z != null) {
         $$0.a(this.i, this.z.a(), this.z.b(), $$1, $$2);
         this.z = null;
      }
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
      this.b($$0, $$1, $$2, $$3);

      for (fak $$4 : this.n) {
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256 && this.aO_()) {
         this.d();
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         fdi $$3 = (fdi)(switch ($$0) {
            case 258 -> this.o();
            default -> null;
            case 262 -> this.a(fdk.d);
            case 263 -> this.a(fdk.c);
            case 264 -> this.a(fdk.b);
            case 265 -> this.a(fdk.a);
         });
         if ($$3 != null) {
            eyr $$4 = super.a($$3);
            if ($$4 == null && $$3 instanceof fdi.c) {
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

   private fdi.c o() {
      boolean $$0 = !v();
      return new fdi.c($$0);
   }

   private fdi.a a(fdk $$0) {
      return new fdi.a($$0);
   }

   protected void aH_() {
      if (this.f.aV().b()) {
         fdi.c $$0 = new fdi.c(true);
         eyr $$1 = super.a($$0);
         if ($$1 != null) {
            this.a($$1);
         }
      }
   }

   protected void c(fbd $$0) {
      eyr $$1 = eyr.a(this, $$0.a(new fdi.b()));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   public void q() {
      eyr $$0 = this.aM_();
      if ($$0 != null) {
         $$0.a(false);
      }
   }

   @VisibleForTesting
   protected void a(eyr $$0) {
      this.q();
      $$0.a(true);
   }

   public boolean aO_() {
      return true;
   }

   public void d() {
      this.f.a(null);
   }

   protected <T extends fbd & fak & fda> T d(T $$0) {
      this.n.add($$0);
      return this.e($$0);
   }

   protected <T extends fak> T a(T $$0) {
      this.n.add($$0);
      return $$0;
   }

   protected <T extends fbd & fda> T e(T $$0) {
      this.k.add($$0);
      this.l.add($$0);
      return $$0;
   }

   protected void f(fbd $$0) {
      if ($$0 instanceof fak) {
         this.n.remove((fak)$$0);
      }

      if ($$0 instanceof fda) {
         this.l.remove((fda)$$0);
      }

      this.k.remove($$0);
   }

   protected void r() {
      this.n.clear();
      this.k.clear();
      this.l.clear();
   }

   public static List<vq> a(exh $$0, coz $$1) {
      return $$1.a($$0.s, $$0.m.m ? cqq.a.b : cqq.a.a);
   }

   protected void a_(String $$0, boolean $$1) {
   }

   public boolean a(@Nullable wn $$0) {
      if ($$0 == null) {
         return false;
      } else {
         vo $$1 = $$0.h();
         if (v()) {
            if ($$0.j() != null) {
               this.a_($$0.j(), false);
            }
         } else if ($$1 != null) {
            if ($$1.a() == vo.a.a) {
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
                     this.f.a(new fdw(this::c, $$1.b(), false));
                  } else {
                     this.a($$2);
                  }
               } catch (URISyntaxException var5) {
                  a.error("Can't open url for {}", $$1, var5);
               }
            } else if ($$1.a() == vo.a.b) {
               URI $$5 = new File($$1.b()).toURI();
               this.a($$5);
            } else if ($$1.a() == vo.a.d) {
               this.a_(aa.a($$1.b()), true);
            } else if ($$1.a() == vo.a.c) {
               String $$6 = aa.a($$1.b());
               if ($$6.startsWith("/")) {
                  if (!this.f.s.cq.d($$6.substring(1))) {
                     a.error("Not allowed to run command with signed argument from click event: '{}'", $$6);
                  }
               } else {
                  a.error("Failed to run command without '/' prefix from click event: '{}'", $$6);
               }
            } else if ($$1.a() == vo.a.f) {
               this.f.o.a($$1.b());
            } else {
               a.error("Don't know how to handle {}", $$1);
            }

            return true;
         }

         return false;
      }
   }

   public final void b(exh $$0, int $$1, int $$2) {
      this.f = $$0;
      this.i = $$0.h;
      this.g = $$1;
      this.h = $$2;
      if (!this.m) {
         this.aQ_();
         this.aH_();
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
      this.aQ_();
      this.aH_();
   }

   @Override
   public List<? extends fbd> l() {
      return this.k;
   }

   protected void aQ_() {
   }

   public void e() {
   }

   public void k() {
   }

   public void aI_() {
   }

   public void b(eyu $$0, int $$1, int $$2, float $$3) {
      if (this.f.r != null) {
         this.a($$0);
      } else {
         this.b($$0);
      }
   }

   public void a(eyu $$0) {
      $$0.b(0, 0, this.g, this.h, -1072689136, -804253680);
   }

   public void b(eyu $$0) {
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
      return exh.a ? eqv.a(exh.O().aM().i(), 343) || eqv.a(exh.O().aM().i(), 347) : eqv.a(exh.O().aM().i(), 341) || eqv.a(exh.O().aM().i(), 345);
   }

   public static boolean v() {
      return eqv.a(exh.O().aM().i(), 340) || eqv.a(exh.O().aM().i(), 344);
   }

   public static boolean w() {
      return eqv.a(exh.O().aM().i(), 342) || eqv.a(exh.O().aM().i(), 346);
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

   public void a(exh $$0, int $$1, int $$2) {
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

   protected boolean aP_() {
      return true;
   }

   protected void a(fdc $$0) {
      $$0.a(fdb.a, this.i());
      if (this.aP_()) {
         $$0.a(fdb.d, c);
      }

      this.b($$0);
   }

   protected void b(fdc $$0) {
      List<fda> $$1 = this.l.stream().filter(fda::A).collect(Collectors.toList());
      Collections.sort($$1, Comparator.comparingInt(far::G));
      ffe.b $$2 = a($$1, this.y);
      if ($$2 != null) {
         if ($$2.c.a()) {
            this.y = $$2.a;
         }

         if ($$1.size() > 1) {
            $$0.a(fdb.b, vq.a("narrator.position.screen", $$2.b + 1, $$1.size()));
            if ($$2.c == fda.a.c) {
               $$0.a(fdb.d, this.B());
            }
         }

         $$2.a.b($$0.a());
      }
   }

   protected vq B() {
      return vq.c("narration.component_list.usage");
   }

   @Nullable
   public static ffe.b a(List<? extends fda> $$0, @Nullable fda $$1) {
      ffe.b $$2 = null;
      ffe.b $$3 = null;
      int $$4 = 0;

      for (int $$5 = $$0.size(); $$4 < $$5; $$4++) {
         fda $$6 = $$0.get($$4);
         fda.a $$7 = $$6.s();
         if ($$7.a()) {
            if ($$6 != $$1) {
               return new ffe.b($$6, $$4, $$7);
            }

            $$3 = new ffe.b($$6, $$4, $$7);
         } else if ($$7.compareTo($$2 != null ? $$2.c : fda.a.a) > 0) {
            $$2 = new ffe.b($$6, $$4, $$7);
         }
      }

      return $$2 != null ? $$2 : $$3;
   }

   public void C() {
      this.a(q, false);
   }

   public void b(List<avt> $$0) {
      this.a($$0, fhy.a, true);
   }

   public void a(List<avt> $$0, fhx $$1, boolean $$2) {
      if (this.z == null || $$2) {
         this.z = new ffe.a($$0, $$1);
      }
   }

   public void d(vq $$0) {
      this.b(fas.a(this.f, $$0));
   }

   public void a(fas $$0, fhx $$1, boolean $$2) {
      this.a($$0.a(this.f), $$1, $$2);
   }

   protected static void a(ezf... $$0) {
      for (ezf $$1 : $$0) {
         $$1.k = false;
      }
   }

   @Override
   public fdm F() {
      return new fdm(0, 0, this.g, this.h);
   }

   @Nullable
   public ath D() {
      return null;
   }

   static record a(List<avt> a, fhx b) {
   }

   public static class b {
      public final fda a;
      public final int b;
      public final fda.a c;

      public b(fda $$0, int $$1, fda.a $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
