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

public abstract class fdb extends eyz implements eyj {
   private static final Logger a = LogUtils.getLogger();
   private static final Set<String> b = Sets.newHashSet(new String[]{"http", "https"});
   private static final vf c = vf.c("narrator.screen.usage");
   public static final ahg d = new ahg("textures/gui/options_background.png");
   protected final vf e;
   private final List<ezb> k = Lists.newArrayList();
   private final List<fax> l = Lists.newArrayList();
   @Nullable
   protected evi f;
   private boolean m;
   public int g;
   public int h;
   private final List<eyj> n = Lists.newArrayList();
   protected ews i;
   @Nullable
   private URI o;
   private static final long p = TimeUnit.SECONDS.toMillis(2L);
   private static final long q = p;
   private static final long r = 750L;
   private static final long t = 200L;
   private static final long u = 200L;
   private final fbc v = new fbc();
   private long w = Long.MIN_VALUE;
   private long x = Long.MAX_VALUE;
   @Nullable
   private fax y;
   @Nullable
   private fdb.a z;
   protected final Executor j = $$0x -> this.f.execute(() -> {
         if (this.f.y == this) {
            $$0x.run();
         }
      });

   protected fdb(vf $$0) {
      this.e = $$0;
   }

   public vf o() {
      return this.e;
   }

   public vf h() {
      return this.o();
   }

   public final void c(ewu $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$1, $$2, $$3);
      if (this.z != null) {
         $$0.a(this.i, this.z.a(), this.z.b(), $$1, $$2);
         this.z = null;
      }
   }

   @Override
   public void a(ewu $$0, int $$1, int $$2, float $$3) {
      this.b($$0, $$1, $$2, $$3);

      for (eyj $$4 : this.n) {
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
         fbf $$3 = (fbf)(switch ($$0) {
            case 258 -> this.n();
            default -> null;
            case 262 -> this.a(fbh.d);
            case 263 -> this.a(fbh.c);
            case 264 -> this.a(fbh.b);
            case 265 -> this.a(fbh.a);
         });
         if ($$3 != null) {
            ewr $$4 = super.a($$3);
            if ($$4 == null && $$3 instanceof fbf.c) {
               this.p();
               $$4 = super.a($$3);
            }

            if ($$4 != null) {
               this.a($$4);
            }
         }

         return false;
      }
   }

   private fbf.c n() {
      boolean $$0 = !t();
      return new fbf.c($$0);
   }

   private fbf.a a(fbh $$0) {
      return new fbf.a($$0);
   }

   protected void c(ezb $$0) {
      ewr $$1 = ewr.a(this, $$0.a(new fbf.b()));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   public void p() {
      ewr $$0 = this.aJ_();
      if ($$0 != null) {
         $$0.a(false);
      }
   }

   @VisibleForTesting
   protected void a(ewr $$0) {
      this.p();
      $$0.a(true);
   }

   public boolean aL_() {
      return true;
   }

   public void aE_() {
      this.f.a(null);
   }

   protected <T extends ezb & eyj & fax> T d(T $$0) {
      this.n.add($$0);
      return this.e($$0);
   }

   protected <T extends eyj> T a(T $$0) {
      this.n.add($$0);
      return $$0;
   }

   protected <T extends ezb & fax> T e(T $$0) {
      this.k.add($$0);
      this.l.add($$0);
      return $$0;
   }

   protected void f(ezb $$0) {
      if ($$0 instanceof eyj) {
         this.n.remove((eyj)$$0);
      }

      if ($$0 instanceof fax) {
         this.l.remove((fax)$$0);
      }

      this.k.remove($$0);
   }

   protected void q() {
      this.n.clear();
      this.k.clear();
      this.l.clear();
   }

   public static List<vf> a(evi $$0, cmy $$1) {
      return $$1.a($$0.s, $$0.m.m ? coq.a.b : coq.a.a);
   }

   protected void a_(String $$0, boolean $$1) {
   }

   public boolean a(@Nullable wc $$0) {
      if ($$0 == null) {
         return false;
      } else {
         vd $$1 = $$0.h();
         if (t()) {
            if ($$0.j() != null) {
               this.a_($$0.j(), false);
            }
         } else if ($$1 != null) {
            if ($$1.a() == vd.a.a) {
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
                     this.f.a(new fbt(this::c, $$1.b(), false));
                  } else {
                     this.a($$2);
                  }
               } catch (URISyntaxException var5) {
                  a.error("Can't open url for {}", $$1, var5);
               }
            } else if ($$1.a() == vd.a.b) {
               URI $$5 = new File($$1.b()).toURI();
               this.a($$5);
            } else if ($$1.a() == vd.a.d) {
               this.a_(aa.a($$1.b()), true);
            } else if ($$1.a() == vd.a.c) {
               String $$6 = aa.a($$1.b());
               if ($$6.startsWith("/")) {
                  if (!this.f.s.cn.d($$6.substring(1))) {
                     a.error("Not allowed to run command with signed argument from click event: '{}'", $$6);
                  }
               } else {
                  a.error("Failed to run command without '/' prefix from click event: '{}'", $$6);
               }
            } else if ($$1.a() == vd.a.f) {
               this.f.o.a($$1.b());
            } else {
               a.error("Don't know how to handle {}", $$1);
            }

            return true;
         }

         return false;
      }
   }

   public final void b(evi $$0, int $$1, int $$2) {
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

   protected void r() {
      this.q();
      this.p();
      this.aN_();
   }

   @Override
   public List<? extends ezb> l() {
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

   public void b(ewu $$0, int $$1, int $$2, float $$3) {
      if (this.f.r != null) {
         this.a($$0);
      } else {
         this.b($$0);
      }
   }

   public void a(ewu $$0) {
      $$0.b(0, 0, this.g, this.h, -1072689136, -804253680);
   }

   public void b(ewu $$0) {
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
      ac.j().a($$0);
   }

   public static boolean s() {
      return evi.a ? eow.a(evi.O().aM().i(), 343) || eow.a(evi.O().aM().i(), 347) : eow.a(evi.O().aM().i(), 341) || eow.a(evi.O().aM().i(), 345);
   }

   public static boolean t() {
      return eow.a(evi.O().aM().i(), 340) || eow.a(evi.O().aM().i(), 344);
   }

   public static boolean v() {
      return eow.a(evi.O().aM().i(), 342) || eow.a(evi.O().aM().i(), 346);
   }

   public static boolean c(int $$0) {
      return $$0 == 88 && s() && !t() && !v();
   }

   public static boolean d(int $$0) {
      return $$0 == 86 && s() && !t() && !v();
   }

   public static boolean e(int $$0) {
      return $$0 == 67 && s() && !t() && !v();
   }

   public static boolean f(int $$0) {
      return $$0 == 65 && s() && !t() && !v();
   }

   protected void c() {
      this.r();
   }

   public void a(evi $$0, int $$1, int $$2) {
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

   public void w() {
      this.a(750L, false);
   }

   public void x() {
      this.a(200L, true);
   }

   public void y() {
      this.a(200L, true);
   }

   private boolean D() {
      return this.f.aW().a();
   }

   public void z() {
      if (this.D()) {
         long $$0 = ac.b();
         if ($$0 > this.x && $$0 > this.w) {
            this.e(true);
            this.x = Long.MAX_VALUE;
         }
      }
   }

   public void d(boolean $$0) {
      if (this.D()) {
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

   protected boolean aM_() {
      return true;
   }

   protected void a(faz $$0) {
      $$0.a(fay.a, this.h());
      if (this.aM_()) {
         $$0.a(fay.d, c);
      }

      this.b($$0);
   }

   protected void b(faz $$0) {
      List<fax> $$1 = this.l.stream().filter(fax::A).collect(Collectors.toList());
      Collections.sort($$1, Comparator.comparingInt(eyq::G));
      fdb.b $$2 = a($$1, this.y);
      if ($$2 != null) {
         if ($$2.c.a()) {
            this.y = $$2.a;
         }

         if ($$1.size() > 1) {
            $$0.a(fay.b, vf.a("narrator.position.screen", $$2.b + 1, $$1.size()));
            if ($$2.c == fax.a.c) {
               $$0.a(fay.d, this.A());
            }
         }

         $$2.a.b($$0.a());
      }
   }

   protected vf A() {
      return vf.c("narration.component_list.usage");
   }

   @Nullable
   public static fdb.b a(List<? extends fax> $$0, @Nullable fax $$1) {
      fdb.b $$2 = null;
      fdb.b $$3 = null;
      int $$4 = 0;

      for (int $$5 = $$0.size(); $$4 < $$5; $$4++) {
         fax $$6 = $$0.get($$4);
         fax.a $$7 = $$6.s();
         if ($$7.a()) {
            if ($$6 != $$1) {
               return new fdb.b($$6, $$4, $$7);
            }

            $$3 = new fdb.b($$6, $$4, $$7);
         } else if ($$7.compareTo($$2 != null ? $$2.c : fax.a.a) > 0) {
            $$2 = new fdb.b($$6, $$4, $$7);
         }
      }

      return $$2 != null ? $$2 : $$3;
   }

   public void B() {
      this.a(q, false);
   }

   public void b(List<aua> $$0) {
      this.a($$0, ffv.a, true);
   }

   public void a(List<aua> $$0, ffu $$1, boolean $$2) {
      if (this.z == null || $$2) {
         this.z = new fdb.a($$0, $$1);
      }
   }

   protected void d(vf $$0) {
      this.b(eyr.a(this.f, $$0));
   }

   public void a(eyr $$0, ffu $$1, boolean $$2) {
      this.a($$0.a(this.f), $$1, $$2);
   }

   protected static void a(exe... $$0) {
      for (exe $$1 : $$0) {
         $$1.k = false;
      }
   }

   @Override
   public fbj F() {
      return new fbj(0, 0, this.g, this.h);
   }

   @Nullable
   public arp C() {
      return null;
   }

   static record a(List<aua> a, ffu b) {
   }

   public static class b {
      public final fax a;
      public final int b;
      public final fax.a c;

      public b(fax $$0, int $$1, fax.a $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
