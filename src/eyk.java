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

public abstract class eyk extends eui implements ets {
   private static final Logger a = LogUtils.getLogger();
   private static final Set<String> b = Sets.newHashSet(new String[]{"http", "https"});
   private static final tm c = tm.c("narrator.screen.usage");
   public static final aex d = new aex("textures/gui/options_background.png");
   protected final tm e;
   private final List<euk> k = Lists.newArrayList();
   private final List<ewg> l = Lists.newArrayList();
   @Nullable
   protected eqv f;
   private boolean m;
   public int g;
   public int h;
   private final List<ets> n = Lists.newArrayList();
   protected esd i;
   @Nullable
   private URI o;
   private static final long p = TimeUnit.SECONDS.toMillis(2L);
   private static final long q = p;
   private static final long s = 750L;
   private static final long t = 200L;
   private static final long u = 200L;
   private final ewl v = new ewl();
   private long w = Long.MIN_VALUE;
   private long x = Long.MAX_VALUE;
   @Nullable
   private ewg y;
   @Nullable
   private eyk.a z;
   protected final Executor j = $$0x -> this.f.execute(() -> {
         if (this.f.y == this) {
            $$0x.run();
         }
      });

   protected eyk(tm $$0) {
      this.e = $$0;
   }

   public tm m() {
      return this.e;
   }

   public tm g() {
      return this.m();
   }

   public final void c(esf $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$1, $$2, $$3);
      if (this.z != null) {
         $$0.a(this.i, this.z.a(), this.z.b(), $$1, $$2);
         this.z = null;
      }
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      this.b($$0, $$1, $$2, $$3);

      for (ets $$4 : this.n) {
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256 && this.ay_()) {
         this.az_();
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         ewo $$3 = (ewo)(switch ($$0) {
            case 258 -> this.l();
            default -> null;
            case 262 -> this.a(ewq.d);
            case 263 -> this.a(ewq.c);
            case 264 -> this.a(ewq.b);
            case 265 -> this.a(ewq.a);
         });
         if ($$3 != null) {
            esc $$4 = super.a($$3);
            if ($$4 == null && $$3 instanceof ewo.c) {
               this.D();
               $$4 = super.a($$3);
            }

            if ($$4 != null) {
               this.a($$4);
            }
         }

         return false;
      }
   }

   private ewo.c l() {
      boolean $$0 = !q();
      return new ewo.c($$0);
   }

   private ewo.a a(ewq $$0) {
      return new ewo.a($$0);
   }

   protected void c(euk $$0) {
      esc $$1 = esc.a(this, $$0.a(new ewo.b()));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   private void D() {
      esc $$0 = this.aG_();
      if ($$0 != null) {
         $$0.a(false);
      }
   }

   @VisibleForTesting
   protected void a(esc $$0) {
      this.D();
      $$0.a(true);
   }

   public boolean ay_() {
      return true;
   }

   public void az_() {
      this.f.a(null);
   }

   protected <T extends euk & ets & ewg> T d(T $$0) {
      this.n.add($$0);
      return this.e($$0);
   }

   protected <T extends ets> T a(T $$0) {
      this.n.add($$0);
      return $$0;
   }

   protected <T extends euk & ewg> T e(T $$0) {
      this.k.add($$0);
      this.l.add($$0);
      return $$0;
   }

   protected void f(euk $$0) {
      if ($$0 instanceof ets) {
         this.n.remove((ets)$$0);
      }

      if ($$0 instanceof ewg) {
         this.l.remove((ewg)$$0);
      }

      this.k.remove($$0);
   }

   protected void n() {
      this.n.clear();
      this.k.clear();
      this.l.clear();
   }

   public static List<tm> a(eqv $$0, cjf $$1) {
      return $$1.a($$0.s, $$0.m.m ? ckw.a.b : ckw.a.a);
   }

   protected void a(String $$0, boolean $$1) {
   }

   public boolean a(@Nullable ui $$0) {
      if ($$0 == null) {
         return false;
      } else {
         tk $$1 = $$0.h();
         if (q()) {
            if ($$0.j() != null) {
               this.a($$0.j(), false);
            }
         } else if ($$1 != null) {
            if ($$1.a() == tk.a.a) {
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
                     this.f.a(new exc(this::c, $$1.b(), false));
                  } else {
                     this.a($$2);
                  }
               } catch (URISyntaxException var5) {
                  a.error("Can't open url for {}", $$1, var5);
               }
            } else if ($$1.a() == tk.a.b) {
               URI $$5 = new File($$1.b()).toURI();
               this.a($$5);
            } else if ($$1.a() == tk.a.d) {
               this.a(aa.a($$1.b()), true);
            } else if ($$1.a() == tk.a.c) {
               String $$6 = aa.a($$1.b());
               if ($$6.startsWith("/")) {
                  if (!this.f.s.cn.d($$6.substring(1))) {
                     a.error("Not allowed to run command with signed argument from click event: '{}'", $$6);
                  }
               } else {
                  a.error("Failed to run command without '/' prefix from click event: '{}'", $$6);
               }
            } else if ($$1.a() == tk.a.f) {
               this.f.o.a($$1.b());
            } else {
               a.error("Don't know how to handle {}", $$1);
            }

            return true;
         }

         return false;
      }
   }

   public final void b(eqv $$0, int $$1, int $$2) {
      this.f = $$0;
      this.i = $$0.h;
      this.g = $$1;
      this.h = $$2;
      if (!this.m) {
         this.aI_();
      } else {
         this.b();
      }

      this.m = true;
      this.d(false);
      this.a(p);
   }

   protected void o() {
      this.n();
      this.D();
      this.aI_();
   }

   @Override
   public List<? extends euk> i() {
      return this.k;
   }

   protected void aI_() {
   }

   public void c() {
   }

   public void aA_() {
   }

   public void aB_() {
   }

   public void b(esf $$0, int $$1, int $$2, float $$3) {
      if (this.f.r != null) {
         this.a($$0);
      } else {
         this.b($$0);
      }
   }

   public void a(esf $$0) {
      $$0.b(0, 0, this.g, this.h, -1072689136, -804253680);
   }

   public void b(esf $$0) {
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
      return eqv.a ? ekk.a(eqv.O().aM().i(), 343) || ekk.a(eqv.O().aM().i(), 347) : ekk.a(eqv.O().aM().i(), 341) || ekk.a(eqv.O().aM().i(), 345);
   }

   public static boolean q() {
      return ekk.a(eqv.O().aM().i(), 340) || ekk.a(eqv.O().aM().i(), 344);
   }

   public static boolean r() {
      return ekk.a(eqv.O().aM().i(), 342) || ekk.a(eqv.O().aM().i(), 346);
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

   public void a(eqv $$0, int $$1, int $$2) {
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

   private boolean H() {
      return this.f.aV().a();
   }

   public void z() {
      if (this.H()) {
         long $$0 = ac.b();
         if ($$0 > this.x && $$0 > this.w) {
            this.e(true);
            this.x = Long.MAX_VALUE;
         }
      }
   }

   public void d(boolean $$0) {
      if (this.H()) {
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

   protected boolean aH_() {
      return true;
   }

   protected void a(ewi $$0) {
      $$0.a(ewh.a, this.g());
      if (this.aH_()) {
         $$0.a(ewh.d, c);
      }

      this.b($$0);
   }

   protected void b(ewi $$0) {
      List<ewg> $$1 = this.l.stream().filter(ewg::aE_).collect(Collectors.toList());
      Collections.sort($$1, Comparator.comparingInt(etz::u));
      eyk.b $$2 = a($$1, this.y);
      if ($$2 != null) {
         if ($$2.c.a()) {
            this.y = $$2.a;
         }

         if ($$1.size() > 1) {
            $$0.a(ewh.b, tm.a("narrator.position.screen", $$2.b + 1, $$1.size()));
            if ($$2.c == ewg.a.c) {
               $$0.a(ewh.d, this.A());
            }
         }

         $$2.a.b($$0.a());
      }
   }

   protected tm A() {
      return tm.c("narration.component_list.usage");
   }

   @Nullable
   public static eyk.b a(List<? extends ewg> $$0, @Nullable ewg $$1) {
      eyk.b $$2 = null;
      eyk.b $$3 = null;
      int $$4 = 0;

      for (int $$5 = $$0.size(); $$4 < $$5; $$4++) {
         ewg $$6 = $$0.get($$4);
         ewg.a $$7 = $$6.q();
         if ($$7.a()) {
            if ($$6 != $$1) {
               return new eyk.b($$6, $$4, $$7);
            }

            $$3 = new eyk.b($$6, $$4, $$7);
         } else if ($$7.compareTo($$2 != null ? $$2.c : ewg.a.a) > 0) {
            $$2 = new eyk.b($$6, $$4, $$7);
         }
      }

      return $$2 != null ? $$2 : $$3;
   }

   public void B() {
      this.a(q, false);
   }

   public void b(List<ark> $$0) {
      this.a($$0, fbc.a, true);
   }

   public void a(List<ark> $$0, fbb $$1, boolean $$2) {
      if (this.z == null || $$2) {
         this.z = new eyk.a($$0, $$1);
      }
   }

   protected void d(tm $$0) {
      this.b(eua.a(this.f, $$0));
   }

   public void a(eua $$0, fbb $$1, boolean $$2) {
      this.a($$0.a(this.f), $$1, $$2);
   }

   protected static void a(eso... $$0) {
      for (eso $$1 : $$0) {
         $$1.j = false;
      }
   }

   @Override
   public ews s() {
      return new ews(0, 0, this.g, this.h);
   }

   @Nullable
   public apb C() {
      return null;
   }

   static record a(List<ark> a, fbb b) {
   }

   public static class b {
      public final ewg a;
      public final int b;
      public final ewg.a c;

      public b(ewg $$0, int $$1, ewg.a $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
