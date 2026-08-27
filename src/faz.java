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

public abstract class faz extends ewx implements ewh {
   private static final Logger a = LogUtils.getLogger();
   private static final Set<String> b = Sets.newHashSet(new String[]{"http", "https"});
   private static final uv c = uv.c("narrator.screen.usage");
   public static final agm d = new agm("textures/gui/options_background.png");
   protected final uv e;
   private final List<ewz> k = Lists.newArrayList();
   private final List<eyv> l = Lists.newArrayList();
   @Nullable
   protected eti f;
   private boolean m;
   public int g;
   public int h;
   private final List<ewh> n = Lists.newArrayList();
   protected eur i;
   @Nullable
   private URI o;
   private static final long p = TimeUnit.SECONDS.toMillis(2L);
   private static final long q = p;
   private static final long r = 750L;
   private static final long t = 200L;
   private static final long u = 200L;
   private final eza v = new eza();
   private long w = Long.MIN_VALUE;
   private long x = Long.MAX_VALUE;
   @Nullable
   private eyv y;
   @Nullable
   private faz.a z;
   protected final Executor j = $$0x -> this.f.execute(() -> {
         if (this.f.y == this) {
            $$0x.run();
         }
      });

   protected faz(uv $$0) {
      this.e = $$0;
   }

   public uv m() {
      return this.e;
   }

   public uv h() {
      return this.m();
   }

   public final void c(eut $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$1, $$2, $$3);
      if (this.z != null) {
         $$0.a(this.i, this.z.a(), this.z.b(), $$1, $$2);
         this.z = null;
      }
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      this.b($$0, $$1, $$2, $$3);

      for (ewh $$4 : this.n) {
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256 && this.aF_()) {
         this.aG_();
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         ezd $$3 = (ezd)(switch ($$0) {
            case 258 -> this.l();
            default -> null;
            case 262 -> this.a(ezf.d);
            case 263 -> this.a(ezf.c);
            case 264 -> this.a(ezf.b);
            case 265 -> this.a(ezf.a);
         });
         if ($$3 != null) {
            euq $$4 = super.a($$3);
            if ($$4 == null && $$3 instanceof ezd.c) {
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

   private ezd.c l() {
      boolean $$0 = !q();
      return new ezd.c($$0);
   }

   private ezd.a a(ezf $$0) {
      return new ezd.a($$0);
   }

   protected void c(ewz $$0) {
      euq $$1 = euq.a(this, $$0.a(new ezd.b()));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   private void C() {
      euq $$0 = this.aO_();
      if ($$0 != null) {
         $$0.a(false);
      }
   }

   @VisibleForTesting
   protected void a(euq $$0) {
      this.C();
      $$0.a(true);
   }

   public boolean aF_() {
      return true;
   }

   public void aG_() {
      this.f.a(null);
   }

   protected <T extends ewz & ewh & eyv> T d(T $$0) {
      this.n.add($$0);
      return this.e($$0);
   }

   protected <T extends ewh> T a(T $$0) {
      this.n.add($$0);
      return $$0;
   }

   protected <T extends ewz & eyv> T e(T $$0) {
      this.k.add($$0);
      this.l.add($$0);
      return $$0;
   }

   protected void f(ewz $$0) {
      if ($$0 instanceof ewh) {
         this.n.remove((ewh)$$0);
      }

      if ($$0 instanceof eyv) {
         this.l.remove((eyv)$$0);
      }

      this.k.remove($$0);
   }

   protected void n() {
      this.n.clear();
      this.k.clear();
      this.l.clear();
   }

   public static List<uv> a(eti $$0, clo $$1) {
      return $$1.a($$0.s, $$0.m.m ? cnf.a.b : cnf.a.a);
   }

   protected void a_(String $$0, boolean $$1) {
   }

   public boolean a(@Nullable vs $$0) {
      if ($$0 == null) {
         return false;
      } else {
         ut $$1 = $$0.h();
         if (q()) {
            if ($$0.j() != null) {
               this.a_($$0.j(), false);
            }
         } else if ($$1 != null) {
            if ($$1.a() == ut.a.a) {
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
                     this.f.a(new ezr(this::c, $$1.b(), false));
                  } else {
                     this.a($$2);
                  }
               } catch (URISyntaxException var5) {
                  a.error("Can't open url for {}", $$1, var5);
               }
            } else if ($$1.a() == ut.a.b) {
               URI $$5 = new File($$1.b()).toURI();
               this.a($$5);
            } else if ($$1.a() == ut.a.d) {
               this.a_(aa.a($$1.b()), true);
            } else if ($$1.a() == ut.a.c) {
               String $$6 = aa.a($$1.b());
               if ($$6.startsWith("/")) {
                  if (!this.f.s.cn.d($$6.substring(1))) {
                     a.error("Not allowed to run command with signed argument from click event: '{}'", $$6);
                  }
               } else {
                  a.error("Failed to run command without '/' prefix from click event: '{}'", $$6);
               }
            } else if ($$1.a() == ut.a.f) {
               this.f.o.a($$1.b());
            } else {
               a.error("Don't know how to handle {}", $$1);
            }

            return true;
         }

         return false;
      }
   }

   public final void b(eti $$0, int $$1, int $$2) {
      this.f = $$0;
      this.i = $$0.h;
      this.g = $$1;
      this.h = $$2;
      if (!this.m) {
         this.aQ_();
      } else {
         this.c();
      }

      this.m = true;
      this.d(false);
      this.a(p);
   }

   protected void o() {
      this.n();
      this.C();
      this.aQ_();
   }

   @Override
   public List<? extends ewz> i() {
      return this.k;
   }

   protected void aQ_() {
   }

   public void d() {
   }

   public void aH_() {
   }

   public void aI_() {
   }

   public void b(eut $$0, int $$1, int $$2, float $$3) {
      if (this.f.r != null) {
         this.a($$0);
      } else {
         this.b($$0);
      }
   }

   public void a(eut $$0) {
      $$0.b(0, 0, this.g, this.h, -1072689136, -804253680);
   }

   public void b(eut $$0) {
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
      return eti.a ? emw.a(eti.N().aL().i(), 343) || emw.a(eti.N().aL().i(), 347) : emw.a(eti.N().aL().i(), 341) || emw.a(eti.N().aL().i(), 345);
   }

   public static boolean q() {
      return emw.a(eti.N().aL().i(), 340) || emw.a(eti.N().aL().i(), 344);
   }

   public static boolean r() {
      return emw.a(eti.N().aL().i(), 342) || emw.a(eti.N().aL().i(), 346);
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

   protected void c() {
      this.o();
   }

   public void a(eti $$0, int $$1, int $$2) {
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

   private boolean G() {
      return this.f.aU().a();
   }

   public void y() {
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
         this.f.aU().a($$1);
      }
   }

   protected boolean aP_() {
      return true;
   }

   protected void a(eyx $$0) {
      $$0.a(eyw.a, this.h());
      if (this.aP_()) {
         $$0.a(eyw.d, c);
      }

      this.b($$0);
   }

   protected void b(eyx $$0) {
      List<eyv> $$1 = this.l.stream().filter(eyv::aM_).collect(Collectors.toList());
      Collections.sort($$1, Comparator.comparingInt(ewo::aL_));
      faz.b $$2 = a($$1, this.y);
      if ($$2 != null) {
         if ($$2.c.a()) {
            this.y = $$2.a;
         }

         if ($$1.size() > 1) {
            $$0.a(eyw.b, uv.a("narrator.position.screen", $$2.b + 1, $$1.size()));
            if ($$2.c == eyv.a.c) {
               $$0.a(eyw.d, this.z());
            }
         }

         $$2.a.b($$0.a());
      }
   }

   protected uv z() {
      return uv.c("narration.component_list.usage");
   }

   @Nullable
   public static faz.b a(List<? extends eyv> $$0, @Nullable eyv $$1) {
      faz.b $$2 = null;
      faz.b $$3 = null;
      int $$4 = 0;

      for (int $$5 = $$0.size(); $$4 < $$5; $$4++) {
         eyv $$6 = $$0.get($$4);
         eyv.a $$7 = $$6.q();
         if ($$7.a()) {
            if ($$6 != $$1) {
               return new faz.b($$6, $$4, $$7);
            }

            $$3 = new faz.b($$6, $$4, $$7);
         } else if ($$7.compareTo($$2 != null ? $$2.c : eyv.a.a) > 0) {
            $$2 = new faz.b($$6, $$4, $$7);
         }
      }

      return $$2 != null ? $$2 : $$3;
   }

   public void A() {
      this.a(q, false);
   }

   public void b(List<atc> $$0) {
      this.a($$0, fdt.a, true);
   }

   public void a(List<atc> $$0, fds $$1, boolean $$2) {
      if (this.z == null || $$2) {
         this.z = new faz.a($$0, $$1);
      }
   }

   protected void d(uv $$0) {
      this.b(ewp.a(this.f, $$0));
   }

   public void a(ewp $$0, fds $$1, boolean $$2) {
      this.a($$0.a(this.f), $$1, $$2);
   }

   protected static void a(evc... $$0) {
      for (evc $$1 : $$0) {
         $$1.j = false;
      }
   }

   @Override
   public ezh s() {
      return new ezh(0, 0, this.g, this.h);
   }

   @Nullable
   public aqs B() {
      return null;
   }

   static record a(List<atc> a, fds b) {
   }

   public static class b {
      public final eyv a;
      public final int b;
      public final eyv.a c;

      public b(eyv $$0, int $$1, eyv.a $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
