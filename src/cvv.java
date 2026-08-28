import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cvv {
   static final alp a = a("items");
   private final xk b;
   alp c = a;
   boolean d = true;
   boolean e = true;
   boolean f = false;
   private final cvv.f g;
   private final int h;
   private final cvv.h i;
   @Nullable
   private cxg j;
   private Collection<cxg> k = cxh.a();
   private Set<cxg> l = cxh.a();
   private final Supplier<cxg> m;
   private final cvv.b n;

   cvv(cvv.f $$0, int $$1, cvv.h $$2, xk $$3, Supplier<cxg> $$4, cvv.b $$5) {
      this.g = $$0;
      this.h = $$1;
      this.b = $$3;
      this.m = $$4;
      this.n = $$5;
      this.i = $$2;
   }

   public static alp a(String $$0) {
      return alp.b("textures/gui/container/creative_inventory/tab_" + $$0 + ".png");
   }

   public static cvv.a a(cvv.f $$0, int $$1) {
      return new cvv.a($$0, $$1);
   }

   public xk a() {
      return this.b;
   }

   public cxg b() {
      if (this.j == null) {
         this.j = this.m.get();
      }

      return this.j;
   }

   public alp c() {
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

   public cvv.f g() {
      return this.g;
   }

   public boolean h() {
      return !this.k.isEmpty();
   }

   public boolean i() {
      return this.i != cvv.h.a || this.h();
   }

   public boolean j() {
      return this.f;
   }

   public cvv.h k() {
      return this.i;
   }

   public void a(cvv.d $$0) {
      cvv.c $$1 = new cvv.c(this, $$0.a);
      alo<cvv> $$2 = ma.al.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.k = $$1.a;
      this.l = $$1.b;
   }

   public Collection<cxg> l() {
      return this.k;
   }

   public Collection<cxg> m() {
      return this.l;
   }

   public boolean a(cxg $$0) {
      return this.l.contains($$0);
   }

   public static class a {
      private static final cvv.b a = ($$0, $$1) -> {
      };
      private final cvv.f b;
      private final int c;
      private xk d = xk.i();
      private Supplier<cxg> e = () -> cxg.j;
      private cvv.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cvv.h j = cvv.h.a;
      private alp k = cvv.a;

      public a(cvv.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cvv.a a(xk $$0) {
         this.d = $$0;
         return this;
      }

      public cvv.a a(Supplier<cxg> $$0) {
         this.e = $$0;
         return this;
      }

      public cvv.a a(cvv.b $$0) {
         this.f = $$0;
         return this;
      }

      public cvv.a a() {
         this.i = true;
         return this;
      }

      public cvv.a b() {
         this.h = false;
         return this;
      }

      public cvv.a c() {
         this.g = false;
         return this;
      }

      protected cvv.a a(cvv.h $$0) {
         this.j = $$0;
         return this;
      }

      public cvv.a a(alp $$0) {
         this.k = $$0;
         return this;
      }

      public cvv d() {
         if ((this.j == cvv.h.c || this.j == cvv.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cvv $$0 = new cvv(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cvv.d var1, cvv.e var2);
   }

   static class c implements cvv.e {
      public final Collection<cxg> a = cxh.a();
      public final Set<cxg> b = cxh.a();
      private final cvv c;
      private final csk d;

      public c(cvv $$0, csk $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cxg $$0, cvv.g $$1) {
         if ($$0.M() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cvv.g.c;
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

   public static record d(csk a, boolean b, js.a c) {

      public boolean a(csk $$0, boolean $$1, js.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cxg var1, cvv.g var2);

      default void a(cxg $$0) {
         this.a($$0, cvv.g.a);
      }

      default void a(dgy $$0, cvv.g $$1) {
         this.a(new cxg($$0), $$1);
      }

      default void a(dgy $$0) {
         this.a(new cxg($$0), cvv.g.a);
      }

      default void a(Collection<cxg> $$0, cvv.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cxg> $$0) {
         this.a($$0, cvv.g.a);
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
