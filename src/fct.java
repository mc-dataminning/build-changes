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

public abstract class fct extends eyr implements eyb {
   private static final Logger a = LogUtils.getLogger();
   private static final Set<String> b = Sets.newHashSet(new String[]{"http", "https"});
   private static final vd c = vd.c("narrator.screen.usage");
   public static final ahd d = new ahd("textures/gui/options_background.png");
   protected final vd e;
   private final List<eyt> k = Lists.newArrayList();
   private final List<fap> l = Lists.newArrayList();
   @Nullable
   protected eva f;
   private boolean m;
   public int g;
   public int h;
   private final List<eyb> n = Lists.newArrayList();
   protected ewk i;
   @Nullable
   private URI o;
   private static final long p = TimeUnit.SECONDS.toMillis(2L);
   private static final long q = p;
   private static final long r = 750L;
   private static final long t = 200L;
   private static final long u = 200L;
   private final fau v = new fau();
   private long w = Long.MIN_VALUE;
   private long x = Long.MAX_VALUE;
   @Nullable
   private fap y;
   @Nullable
   private fct.a z;
   protected final Executor j = $$0x -> this.f.execute(() -> {
         if (this.f.y == this) {
            $$0x.run();
         }
      });

   protected fct(vd $$0) {
      this.e = $$0;
   }

   public vd o() {
      return this.e;
   }

   public vd h() {
      return this.o();
   }

   public final void c(ewm $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$1, $$2, $$3);
      if (this.z != null) {
         $$0.a(this.i, this.z.a(), this.z.b(), $$1, $$2);
         this.z = null;
      }
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      this.b($$0, $$1, $$2, $$3);

      for (eyb $$4 : this.n) {
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256 && this.aL_()) {
         this.aE_();
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         fax $$3 = (fax)(switch ($$0) {
            case 258 -> this.n();
            default -> null;
            case 262 -> this.a(faz.d);
            case 263 -> this.a(faz.c);
            case 264 -> this.a(faz.b);
            case 265 -> this.a(faz.a);
         });
         if ($$3 != null) {
            ewj $$4 = super.a($$3);
            if ($$4 == null && $$3 instanceof fax.c) {
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

   private fax.c n() {
      boolean $$0 = !s();
      return new fax.c($$0);
   }

   private fax.a a(faz $$0) {
      return new fax.a($$0);
   }

   protected void c(eyt $$0) {
      ewj $$1 = ewj.a(this, $$0.a(new fax.b()));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   private void C() {
      ewj $$0 = this.aJ_();
      if ($$0 != null) {
         $$0.a(false);
      }
   }

   @VisibleForTesting
   protected void a(ewj $$0) {
      this.C();
      $$0.a(true);
   }

   public boolean aL_() {
      return true;
   }

   public void aE_() {
      this.f.a(null);
   }

   protected <T extends eyt & eyb & fap> T d(T $$0) {
      this.n.add($$0);
      return this.e($$0);
   }

   protected <T extends eyb> T a(T $$0) {
      this.n.add($$0);
      return $$0;
   }

   protected <T extends eyt & fap> T e(T $$0) {
      this.k.add($$0);
      this.l.add($$0);
      return $$0;
   }

   protected void f(eyt $$0) {
      if ($$0 instanceof eyb) {
         this.n.remove((eyb)$$0);
      }

      if ($$0 instanceof fap) {
         this.l.remove((fap)$$0);
      }

      this.k.remove($$0);
   }

   protected void p() {
      this.n.clear();
      this.k.clear();
      this.l.clear();
   }

   public static List<vd> a(eva $$0, cmr $$1) {
      return $$1.a($$0.s, $$0.m.m ? coi.a.b : coi.a.a);
   }

   protected void a_(String $$0, boolean $$1) {
   }

   public boolean a(@Nullable wa $$0) {
      if ($$0 == null) {
         return false;
      } else {
         vb $$1 = $$0.h();
         if (s()) {
            if ($$0.j() != null) {
               this.a_($$0.j(), false);
            }
         } else if ($$1 != null) {
            if ($$1.a() == vb.a.a) {
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
                     this.f.a(new fbl(this::c, $$1.b(), false));
                  } else {
                     this.a($$2);
                  }
               } catch (URISyntaxException var5) {
                  a.error("Can't open url for {}", $$1, var5);
               }
            } else if ($$1.a() == vb.a.b) {
               URI $$5 = new File($$1.b()).toURI();
               this.a($$5);
            } else if ($$1.a() == vb.a.d) {
               this.a_(aa.a($$1.b()), true);
            } else if ($$1.a() == vb.a.c) {
               String $$6 = aa.a($$1.b());
               if ($$6.startsWith("/")) {
                  if (!this.f.s.cn.d($$6.substring(1))) {
                     a.error("Not allowed to run command with signed argument from click event: '{}'", $$6);
                  }
               } else {
                  a.error("Failed to run command without '/' prefix from click event: '{}'", $$6);
               }
            } else if ($$1.a() == vb.a.f) {
               this.f.o.a($$1.b());
            } else {
               a.error("Don't know how to handle {}", $$1);
            }

            return true;
         }

         return false;
      }
   }

   public final void b(eva $$0, int $$1, int $$2) {
      this.f = $$0;
      this.i = $$0.h;
      this.g = $$1;
      this.h = $$2;
      if (!this.m) {
         this.aN_();
      } else {
         this.c();
      }

      this.m = true;
      this.d(false);
      this.a(p);
   }

   protected void q() {
      this.p();
      this.C();
      this.aN_();
   }

   @Override
   public List<? extends eyt> l() {
      return this.k;
   }

   protected void aN_() {
   }

   public void d() {
   }

   public void j() {
   }

   public void aF_() {
   }

   public void b(ewm $$0, int $$1, int $$2, float $$3) {
      if (this.f.r != null) {
         this.a($$0);
      } else {
         this.b($$0);
      }
   }

   public void a(ewm $$0) {
      $$0.b(0, 0, this.g, this.h, -1072689136, -804253680);
   }

   public void b(ewm $$0) {
      $$0.a(0.25F, 0.25F, 0.25F, 1.0F);
      int $$1 = 32;
      $$0.a(d, 0, 0, 0, 0.0F, 0.0F, this.g, this.h, 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public boolean k() {
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

   public static boolean r() {
      return eva.a ? eoo.a(eva.N().aL().i(), 343) || eoo.a(eva.N().aL().i(), 347) : eoo.a(eva.N().aL().i(), 341) || eoo.a(eva.N().aL().i(), 345);
   }

   public static boolean s() {
      return eoo.a(eva.N().aL().i(), 340) || eoo.a(eva.N().aL().i(), 344);
   }

   public static boolean t() {
      return eoo.a(eva.N().aL().i(), 342) || eoo.a(eva.N().aL().i(), 346);
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

   public void a(eva $$0, int $$1, int $$2) {
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

   public void v() {
      this.a(750L, false);
   }

   public void w() {
      this.a(200L, true);
   }

   public void x() {
      this.a(200L, true);
   }

   private boolean I() {
      return this.f.aU().a();
   }

   public void y() {
      if (this.I()) {
         long $$0 = ac.b();
         if ($$0 > this.x && $$0 > this.w) {
            this.e(true);
            this.x = Long.MAX_VALUE;
         }
      }
   }

   public void d(boolean $$0) {
      if (this.I()) {
         this.e($$0);
      }
   }

   private void e(boolean $$0) {
      this.v.a(this::a);
      String $$1 = this.v.a(!$$0);
      if (!$$1.isEmpty()) {
         this.f.aU().a($$1);
      }
   }

   protected boolean aM_() {
      return true;
   }

   protected void a(far $$0) {
      $$0.a(faq.a, this.h());
      if (this.aM_()) {
         $$0.a(faq.d, c);
      }

      this.b($$0);
   }

   protected void b(far $$0) {
      List<fap> $$1 = this.l.stream().filter(fap::A).collect(Collectors.toList());
      Collections.sort($$1, Comparator.comparingInt(eyi::G));
      fct.b $$2 = a($$1, this.y);
      if ($$2 != null) {
         if ($$2.c.a()) {
            this.y = $$2.a;
         }

         if ($$1.size() > 1) {
            $$0.a(faq.b, vd.a("narrator.position.screen", $$2.b + 1, $$1.size()));
            if ($$2.c == fap.a.c) {
               $$0.a(faq.d, this.z());
            }
         }

         $$2.a.b($$0.a());
      }
   }

   protected vd z() {
      return vd.c("narration.component_list.usage");
   }

   @Nullable
   public static fct.b a(List<? extends fap> $$0, @Nullable fap $$1) {
      fct.b $$2 = null;
      fct.b $$3 = null;
      int $$4 = 0;

      for (int $$5 = $$0.size(); $$4 < $$5; $$4++) {
         fap $$6 = $$0.get($$4);
         fap.a $$7 = $$6.s();
         if ($$7.a()) {
            if ($$6 != $$1) {
               return new fct.b($$6, $$4, $$7);
            }

            $$3 = new fct.b($$6, $$4, $$7);
         } else if ($$7.compareTo($$2 != null ? $$2.c : fap.a.a) > 0) {
            $$2 = new fct.b($$6, $$4, $$7);
         }
      }

      return $$2 != null ? $$2 : $$3;
   }

   public void A() {
      this.a(q, false);
   }

   public void b(List<atu> $$0) {
      this.a($$0, ffn.a, true);
   }

   public void a(List<atu> $$0, ffm $$1, boolean $$2) {
      if (this.z == null || $$2) {
         this.z = new fct.a($$0, $$1);
      }
   }

   protected void d(vd $$0) {
      this.b(eyj.a(this.f, $$0));
   }

   public void a(eyj $$0, ffm $$1, boolean $$2) {
      this.a($$0.a(this.f), $$1, $$2);
   }

   protected static void a(eww... $$0) {
      for (eww $$1 : $$0) {
         $$1.k = false;
      }
   }

   @Override
   public fbb F() {
      return new fbb(0, 0, this.g, this.h);
   }

   @Nullable
   public arj B() {
      return null;
   }

   static record a(List<atu> a, ffm b) {
   }

   public static class b {
      public final fap a;
      public final int b;
      public final fap.a c;

      public b(fap $$0, int $$1, fap.a $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
