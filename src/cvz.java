import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cvz {
   static final alz a = a("items");
   private final xv b;
   alz c = a;
   boolean d = true;
   boolean e = true;
   boolean f = false;
   private final cvz.f g;
   private final int h;
   private final cvz.h i;
   @Nullable
   private cxk j;
   private Collection<cxk> k = cxl.a();
   private Set<cxk> l = cxl.a();
   private final Supplier<cxk> m;
   private final cvz.b n;

   cvz(cvz.f $$0, int $$1, cvz.h $$2, xv $$3, Supplier<cxk> $$4, cvz.b $$5) {
      this.g = $$0;
      this.h = $$1;
      this.b = $$3;
      this.m = $$4;
      this.n = $$5;
      this.i = $$2;
   }

   public static alz a(String $$0) {
      return alz.b("textures/gui/container/creative_inventory/tab_" + $$0 + ".png");
   }

   public static cvz.a a(cvz.f $$0, int $$1) {
      return new cvz.a($$0, $$1);
   }

   public xv a() {
      return this.b;
   }

   public cxk b() {
      if (this.j == null) {
         this.j = this.m.get();
      }

      return this.j;
   }

   public alz c() {
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

   public cvz.f g() {
      return this.g;
   }

   public boolean h() {
      return !this.k.isEmpty();
   }

   public boolean i() {
      return this.i != cvz.h.a || this.h();
   }

   public boolean j() {
      return this.f;
   }

   public cvz.h k() {
      return this.i;
   }

   public void a(cvz.d $$0) {
      cvz.c $$1 = new cvz.c(this, $$0.a);
      aly<cvz> $$2 = ma.al.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.k = $$1.a;
      this.l = $$1.b;
   }

   public Collection<cxk> l() {
      return this.k;
   }

   public Collection<cxk> m() {
      return this.l;
   }

   public boolean a(cxk $$0) {
      return this.l.contains($$0);
   }

   public static class a {
      private static final cvz.b a = ($$0, $$1) -> {
      };
      private final cvz.f b;
      private final int c;
      private xv d = xv.i();
      private Supplier<cxk> e = () -> cxk.k;
      private cvz.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cvz.h j = cvz.h.a;
      private alz k = cvz.a;

      public a(cvz.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cvz.a a(xv $$0) {
         this.d = $$0;
         return this;
      }

      public cvz.a a(Supplier<cxk> $$0) {
         this.e = $$0;
         return this;
      }

      public cvz.a a(cvz.b $$0) {
         this.f = $$0;
         return this;
      }

      public cvz.a a() {
         this.i = true;
         return this;
      }

      public cvz.a b() {
         this.h = false;
         return this;
      }

      public cvz.a c() {
         this.g = false;
         return this;
      }

      protected cvz.a a(cvz.h $$0) {
         this.j = $$0;
         return this;
      }

      public cvz.a a(alz $$0) {
         this.k = $$0;
         return this;
      }

      public cvz d() {
         if ((this.j == cvz.h.c || this.j == cvz.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cvz $$0 = new cvz(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cvz.d var1, cvz.e var2);
   }

   static class c implements cvz.e {
      public final Collection<cxk> a = cxl.a();
      public final Set<cxk> b = cxl.a();
      private final cvz c;
      private final cso d;

      public c(cvz $$0, cso $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cxk $$0, cvz.g $$1) {
         if ($$0.L() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cvz.g.c;
            if ($$2) {
               throw new IllegalStateException(
                  "Accidentally adding the same item stack twice " + $$0.J().getString() + " to a Creative Mode Tab: " + this.c.a().getString()
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

   public static record d(cso a, boolean b, js.a c) {

      public boolean a(cso $$0, boolean $$1, js.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cxk var1, cvz.g var2);

      default void a(cxk $$0) {
         this.a($$0, cvz.g.a);
      }

      default void a(dgz $$0, cvz.g $$1) {
         this.a(new cxk($$0), $$1);
      }

      default void a(dgz $$0) {
         this.a(new cxk($$0), cvz.g.a);
      }

      default void a(Collection<cxk> $$0, cvz.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cxk> $$0) {
         this.a($$0, cvz.g.a);
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
