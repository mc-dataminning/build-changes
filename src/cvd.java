import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cvd {
   static final akv a = a("items");
   private final wp b;
   akv c = a;
   boolean d = true;
   boolean e = true;
   boolean f = false;
   private final cvd.f g;
   private final int h;
   private final cvd.h i;
   @Nullable
   private cwo j;
   private Collection<cwo> k = cwp.a();
   private Set<cwo> l = cwp.a();
   private final Supplier<cwo> m;
   private final cvd.b n;

   cvd(cvd.f $$0, int $$1, cvd.h $$2, wp $$3, Supplier<cwo> $$4, cvd.b $$5) {
      this.g = $$0;
      this.h = $$1;
      this.b = $$3;
      this.m = $$4;
      this.n = $$5;
      this.i = $$2;
   }

   public static akv a(String $$0) {
      return akv.b("textures/gui/container/creative_inventory/tab_" + $$0 + ".png");
   }

   public static cvd.a a(cvd.f $$0, int $$1) {
      return new cvd.a($$0, $$1);
   }

   public wp a() {
      return this.b;
   }

   public cwo b() {
      if (this.j == null) {
         this.j = this.m.get();
      }

      return this.j;
   }

   public akv c() {
      return this.c;
   }

   public boolean d() {
      return this.e;
   }

   public boolean e() {
      return this.d;
   }

   public int f() {
      return this.h;
   }

   public cvd.f g() {
      return this.g;
   }

   public boolean h() {
      return !this.k.isEmpty();
   }

   public boolean i() {
      return this.i != cvd.h.a || this.h();
   }

   public boolean j() {
      return this.f;
   }

   public cvd.h k() {
      return this.i;
   }

   public void a(cvd.d $$0) {
      cvd.c $$1 = new cvd.c(this, $$0.a);
      aku<cvd> $$2 = mb.al.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.k = $$1.a;
      this.l = $$1.b;
   }

   public Collection<cwo> l() {
      return this.k;
   }

   public Collection<cwo> m() {
      return this.l;
   }

   public boolean a(cwo $$0) {
      return this.l.contains($$0);
   }

   public static class a {
      private static final cvd.b a = ($$0, $$1) -> {
      };
      private final cvd.f b;
      private final int c;
      private wp d = wp.i();
      private Supplier<cwo> e = () -> cwo.j;
      private cvd.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cvd.h j = cvd.h.a;
      private akv k = cvd.a;

      public a(cvd.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cvd.a a(wp $$0) {
         this.d = $$0;
         return this;
      }

      public cvd.a a(Supplier<cwo> $$0) {
         this.e = $$0;
         return this;
      }

      public cvd.a a(cvd.b $$0) {
         this.f = $$0;
         return this;
      }

      public cvd.a a() {
         this.i = true;
         return this;
      }

      public cvd.a b() {
         this.h = false;
         return this;
      }

      public cvd.a c() {
         this.g = false;
         return this;
      }

      protected cvd.a a(cvd.h $$0) {
         this.j = $$0;
         return this;
      }

      public cvd.a a(akv $$0) {
         this.k = $$0;
         return this;
      }

      public cvd d() {
         if ((this.j == cvd.h.c || this.j == cvd.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cvd $$0 = new cvd(this.b, this.c, this.j, this.d, this.e, this.f);
            $$0.f = this.i;
            $$0.e = this.h;
            $$0.d = this.g;
            $$0.c = this.k;
            return $$0;
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(cvd.d var1, cvd.e var2);
   }

   static class c implements cvd.e {
      public final Collection<cwo> a = cwp.a();
      public final Set<cwo> b = cwp.a();
      private final cvd c;
      private final crs d;

      public c(cvd $$0, crs $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cwo $$0, cvd.g $$1) {
         if ($$0.M() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cvd.g.c;
            if ($$2) {
               throw new IllegalStateException(
                  "Accidentally adding the same item stack twice " + $$0.K().getString() + " to a Creative Mode Tab: " + this.c.a().getString()
               );
            } else {
               if ($$0.h().a(this.d)) {
                  switch ($$1) {
                     case a:
                        this.a.add($$0);
                        this.b.add($$0);
                        break;
                     case b:
                        this.a.add($$0);
                        break;
                     case c:
                        this.b.add($$0);
                  }
               }
            }
         }
      }
   }

   public static record d(crs a, boolean b, jt.a c) {

      public boolean a(crs $$0, boolean $$1, jt.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cwo var1, cvd.g var2);

      default void a(cwo $$0) {
         this.a($$0, cvd.g.a);
      }

      default void a(dgg $$0, cvd.g $$1) {
         this.a(new cwo($$0), $$1);
      }

      default void a(dgg $$0) {
         this.a(new cwo($$0), cvd.g.a);
      }

      default void a(Collection<cwo> $$0, cvd.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cwo> $$0) {
         this.a($$0, cvd.g.a);
      }
   }

   public static enum f {
      a,
      b;
   }

   protected static enum g {
      a,
      b,
      c;
   }

   public static enum h {
      a,
      b,
      c,
      d;
   }
}
