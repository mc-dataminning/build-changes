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

public abstract class exv extends etu implements etj {
   private static final Logger a = LogUtils.getLogger();
   private static final Set<String> b = Sets.newHashSet(new String[]{"http", "https"});
   private static final te c = te.c("narrator.screen.usage");
   public static final aep d = new aep("textures/gui/options_background.png");
   protected final te e;
   private final List<etw> k = Lists.newArrayList();
   private final List<evr> l = Lists.newArrayList();
   @Nullable
   protected eqn f;
   private boolean m;
   public int g;
   public int h;
   private final List<etj> n = Lists.newArrayList();
   protected erv i;
   @Nullable
   private URI o;
   private static final long p = TimeUnit.SECONDS.toMillis(2L);
   private static final long q = p;
   private static final long s = 750L;
   private static final long t = 200L;
   private static final long u = 200L;
   private final evw v = new evw();
   private long w = Long.MIN_VALUE;
   private long x = Long.MAX_VALUE;
   @Nullable
   private evr y;
   @Nullable
   private exv.a z;
   protected final Executor j = $$0x -> this.f.execute(() -> {
         if (this.f.z == this) {
            $$0x.run();
         }
      });

   protected exv(te $$0) {
      this.e = $$0;
   }

   public te m() {
      return this.e;
   }

   public te e() {
      return this.m();
   }

   public final void c(erx $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$1, $$2, $$3);
      if (this.z != null) {
         $$0.a(this.i, this.z.a(), this.z.b(), $$1, $$2);
         this.z = null;
      }
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      this.b($$0, $$1, $$2, $$3);

      for (etj $$4 : this.n) {
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256 && this.aA_()) {
         this.au_();
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         evz $$3 = (evz)(switch ($$0) {
            case 258 -> this.l();
            default -> null;
            case 262 -> this.a(ewb.d);
            case 263 -> this.a(ewb.c);
            case 264 -> this.a(ewb.b);
            case 265 -> this.a(ewb.a);
         });
         if ($$3 != null) {
            eru $$4 = super.a($$3);
            if ($$4 == null && $$3 instanceof evz.c) {
               this.B();
               $$4 = super.a($$3);
            }

            if ($$4 != null) {
               this.a($$4);
            }
         }

         return false;
      }
   }

   private evz.c l() {
      boolean $$0 = !q();
      return new evz.c($$0);
   }

   private evz.a a(ewb $$0) {
      return new evz.a($$0);
   }

   protected void c(etw $$0) {
      eru $$1 = eru.a(this, $$0.a(new evz.b()));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   private void B() {
      eru $$0 = this.aC_();
      if ($$0 != null) {
         $$0.a(false);
      }
   }

   @VisibleForTesting
   protected void a(eru $$0) {
      this.B();
      $$0.a(true);
   }

   public boolean aA_() {
      return true;
   }

   public void au_() {
      this.f.a(null);
   }

   protected <T extends etw & etj & evr> T d(T $$0) {
      this.n.add($$0);
      return this.e($$0);
   }

   protected <T extends etj> T a(T $$0) {
      this.n.add($$0);
      return $$0;
   }

   protected <T extends etw & evr> T e(T $$0) {
      this.k.add($$0);
      this.l.add($$0);
      return $$0;
   }

   protected void f(etw $$0) {
      if ($$0 instanceof etj) {
         this.n.remove((etj)$$0);
      }

      if ($$0 instanceof evr) {
         this.l.remove((evr)$$0);
      }

      this.k.remove($$0);
   }

   protected void n() {
      this.n.clear();
      this.k.clear();
      this.l.clear();
   }

   public static List<te> a(eqn $$0, ciw $$1) {
      return $$1.a($$0.t, $$0.m.m ? ckn.a.b : ckn.a.a);
   }

   protected void a(String $$0, boolean $$1) {
   }

   public boolean a(@Nullable ua $$0) {
      if ($$0 == null) {
         return false;
      } else {
         tc $$1 = $$0.h();
         if (q()) {
            if ($$0.j() != null) {
               this.a($$0.j(), false);
            }
         } else if ($$1 != null) {
            if ($$1.a() == tc.a.a) {
               if (!this.f.m.H().c()) {
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

                  if (this.f.m.I().c()) {
                     this.o = $$2;
                     this.f.a(new ewn(this::c, $$1.b(), false));
                  } else {
                     this.a($$2);
                  }
               } catch (URISyntaxException var5) {
                  a.error("Can't open url for {}", $$1, var5);
               }
            } else if ($$1.a() == tc.a.b) {
               URI $$5 = new File($$1.b()).toURI();
               this.a($$5);
            } else if ($$1.a() == tc.a.d) {
               this.a(aa.a($$1.b()), true);
            } else if ($$1.a() == tc.a.c) {
               String $$6 = aa.a($$1.b());
               if ($$6.startsWith("/")) {
                  if (!this.f.t.cl.d($$6.substring(1))) {
                     a.error("Not allowed to run command with signed argument from click event: '{}'", $$6);
                  }
               } else {
                  a.error("Failed to run command without '/' prefix from click event: '{}'", $$6);
               }
            } else if ($$1.a() == tc.a.f) {
               this.f.o.a($$1.b());
            } else {
               a.error("Don't know how to handle {}", $$1);
            }

            return true;
         }

         return false;
      }
   }

   public final void b(eqn $$0, int $$1, int $$2) {
      this.f = $$0;
      this.i = $$0.h;
      this.g = $$1;
      this.h = $$2;
      if (!this.m) {
         this.aE_();
      } else {
         this.b();
      }

      this.m = true;
      this.d(false);
      this.a(p);
   }

   protected void o() {
      this.n();
      this.B();
      this.aE_();
   }

   @Override
   public List<? extends etw> i() {
      return this.k;
   }

   protected void aE_() {
   }

   public void c() {
   }

   public void h() {
   }

   public void av_() {
   }

   public void b(erx $$0, int $$1, int $$2, float $$3) {
      if (this.f.s != null) {
         this.a($$0);
      } else {
         this.b($$0);
      }
   }

   public void a(erx $$0) {
      $$0.b(0, 0, this.g, this.h, -1072689136, -804253680);
   }

   public void b(erx $$0) {
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
      return eqn.a ? ekc.a(eqn.N().aM().i(), 343) || ekc.a(eqn.N().aM().i(), 347) : ekc.a(eqn.N().aM().i(), 341) || ekc.a(eqn.N().aM().i(), 345);
   }

   public static boolean q() {
      return ekc.a(eqn.N().aM().i(), 340) || ekc.a(eqn.N().aM().i(), 344);
   }

   public static boolean r() {
      return ekc.a(eqn.N().aM().i(), 342) || ekc.a(eqn.N().aM().i(), 346);
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

   public void a(eqn $$0, int $$1, int $$2) {
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

   public void v() {
      this.a(750L, false);
   }

   public void w() {
      this.a(200L, true);
   }

   public void x() {
      this.a(200L, true);
   }

   private boolean F() {
      return this.f.aU().a();
   }

   public void y() {
      if (this.F()) {
         long $$0 = ac.b();
         if ($$0 > this.x && $$0 > this.w) {
            this.e(true);
            this.x = Long.MAX_VALUE;
         }
      }
   }

   public void d(boolean $$0) {
      if (this.F()) {
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

   protected boolean aD_() {
      return true;
   }

   protected void a(evt $$0) {
      $$0.a(evs.a, this.e());
      if (this.aD_()) {
         $$0.a(evs.d, c);
      }

      this.b($$0);
   }

   protected void b(evt $$0) {
      List<evr> $$1 = this.l.stream().filter(evr::az_).collect(Collectors.toList());
      Collections.sort($$1, Comparator.comparingInt(etq::ay_));
      exv.b $$2 = a($$1, this.y);
      if ($$2 != null) {
         if ($$2.c.a()) {
            this.y = $$2.a;
         }

         if ($$1.size() > 1) {
            $$0.a(evs.b, te.a("narrator.position.screen", $$2.b + 1, $$1.size()));
            if ($$2.c == evr.a.c) {
               $$0.a(evs.d, te.c("narration.component_list.usage"));
            }
         }

         $$2.a.b($$0.a());
      }
   }

   @Nullable
   public static exv.b a(List<? extends evr> $$0, @Nullable evr $$1) {
      exv.b $$2 = null;
      exv.b $$3 = null;
      int $$4 = 0;

      for (int $$5 = $$0.size(); $$4 < $$5; $$4++) {
         evr $$6 = $$0.get($$4);
         evr.a $$7 = $$6.q();
         if ($$7.a()) {
            if ($$6 != $$1) {
               return new exv.b($$6, $$4, $$7);
            }

            $$3 = new exv.b($$6, $$4, $$7);
         } else if ($$7.compareTo($$2 != null ? $$2.c : evr.a.a) > 0) {
            $$2 = new exv.b($$6, $$4, $$7);
         }
      }

      return $$2 != null ? $$2 : $$3;
   }

   public void z() {
      this.a(q, false);
   }

   public void b(List<ara> $$0) {
      this.a($$0, fan.a, true);
   }

   public void a(List<ara> $$0, fam $$1, boolean $$2) {
      if (this.z == null || $$2) {
         this.z = new exv.a($$0, $$1);
      }
   }

   protected void d(te $$0) {
      this.b(etr.a(this.f, $$0));
   }

   public void a(etr $$0, fam $$1, boolean $$2) {
      this.a($$0.a(this.f), $$1, $$2);
   }

   protected static void a(esg... $$0) {
      for (esg $$1 : $$0) {
         $$1.j = false;
      }
   }

   @Override
   public ewd s() {
      return new ewd(0, 0, this.g, this.h);
   }

   @Nullable
   public aor A() {
      return null;
   }

   static record a(List<ara> a, fam b) {
   }

   public static class b {
      public final evr a;
      public final int b;
      public final evr.a c;

      public b(evr $$0, int $$1, evr.a $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
