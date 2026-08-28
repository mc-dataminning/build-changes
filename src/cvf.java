import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cvf {
   static final akv a = a("items");
   private final wp b;
   akv c = a;
   boolean d = true;
   boolean e = true;
   boolean f = false;
   private final cvf.f g;
   private final int h;
   private final cvf.h i;
   @Nullable
   private cwq j;
   private Collection<cwq> k = cwr.a();
   private Set<cwq> l = cwr.a();
   private final Supplier<cwq> m;
   private final cvf.b n;

   cvf(cvf.f $$0, int $$1, cvf.h $$2, wp $$3, Supplier<cwq> $$4, cvf.b $$5) {
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

   public static cvf.a a(cvf.f $$0, int $$1) {
      return new cvf.a($$0, $$1);
   }

   public wp a() {
      return this.b;
   }

   public cwq b() {
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

   public cvf.f g() {
      return this.g;
   }

   public boolean h() {
      return !this.k.isEmpty();
   }

   public boolean i() {
      return this.i != cvf.h.a || this.h();
   }

   public boolean j() {
      return this.f;
   }

   public cvf.h k() {
      return this.i;
   }

   public void a(cvf.d $$0) {
      cvf.c $$1 = new cvf.c(this, $$0.a);
      aku<cvf> $$2 = mb.al.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.k = $$1.a;
      this.l = $$1.b;
   }

   public Collection<cwq> l() {
      return this.k;
   }

   public Collection<cwq> m() {
      return this.l;
   }

   public boolean a(cwq $$0) {
      return this.l.contains($$0);
   }

   public static class a {
      private static final cvf.b a = ($$0, $$1) -> {
      };
      private final cvf.f b;
      private final int c;
      private wp d = wp.i();
      private Supplier<cwq> e = () -> cwq.j;
      private cvf.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cvf.h j = cvf.h.a;
      private akv k = cvf.a;

      public a(cvf.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cvf.a a(wp $$0) {
         this.d = $$0;
         return this;
      }

      public cvf.a a(Supplier<cwq> $$0) {
         this.e = $$0;
         return this;
      }

      public cvf.a a(cvf.b $$0) {
         this.f = $$0;
         return this;
      }

      public cvf.a a() {
         this.i = true;
         return this;
      }

      public cvf.a b() {
         this.h = false;
         return this;
      }

      public cvf.a c() {
         this.g = false;
         return this;
      }

      protected cvf.a a(cvf.h $$0) {
         this.j = $$0;
         return this;
      }

      public cvf.a a(akv $$0) {
         this.k = $$0;
         return this;
      }

      public cvf d() {
         if ((this.j == cvf.h.c || this.j == cvf.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cvf $$0 = new cvf(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cvf.d var1, cvf.e var2);
   }

   static class c implements cvf.e {
      public final Collection<cwq> a = cwr.a();
      public final Set<cwq> b = cwr.a();
      private final cvf c;
      private final cru d;

      public c(cvf $$0, cru $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cwq $$0, cvf.g $$1) {
         if ($$0.M() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cvf.g.c;
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

   public static record d(cru a, boolean b, jt.a c) {

      public boolean a(cru $$0, boolean $$1, jt.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cwq var1, cvf.g var2);

      default void a(cwq $$0) {
         this.a($$0, cvf.g.a);
      }

      default void a(dgi $$0, cvf.g $$1) {
         this.a(new cwq($$0), $$1);
      }

      default void a(dgi $$0) {
         this.a(new cwq($$0), cvf.g.a);
      }

      default void a(Collection<cwq> $$0, cvf.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cwq> $$0) {
         this.a($$0, cvf.g.a);
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
