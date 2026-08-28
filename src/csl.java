import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class csl {
   private final wu a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final csl.f f;
   private final int g;
   private final csl.h h;
   @Nullable
   private cua i;
   private Collection<cua> j = cub.a();
   private Set<cua> k = cub.a();
   private final Supplier<cua> l;
   private final csl.b m;

   csl(csl.f $$0, int $$1, csl.h $$2, wu $$3, Supplier<cua> $$4, csl.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.l = $$4;
      this.m = $$5;
      this.h = $$2;
   }

   public static csl.a a(csl.f $$0, int $$1) {
      return new csl.a($$0, $$1);
   }

   public wu a() {
      return this.a;
   }

   public cua b() {
      if (this.i == null) {
         this.i = this.l.get();
      }

      return this.i;
   }

   public String c() {
      return this.b;
   }

   public boolean d() {
      return this.d;
   }

   public boolean e() {
      return this.c;
   }

   public int f() {
      return this.g;
   }

   public csl.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != csl.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public csl.h k() {
      return this.h;
   }

   public void a(csl.d $$0) {
      csl.c $$1 = new csl.c(this, $$0.a);
      akj<csl> $$2 = lq.am.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.m.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
   }

   public Collection<cua> l() {
      return this.j;
   }

   public Collection<cua> m() {
      return this.k;
   }

   public boolean a(cua $$0) {
      return this.k.contains($$0);
   }

   public static class a {
      private static final csl.b a = ($$0, $$1) -> {
      };
      private final csl.f b;
      private final int c;
      private wu d = wu.i();
      private Supplier<cua> e = () -> cua.l;
      private csl.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private csl.h j = csl.h.a;
      private String k = "items.png";

      public a(csl.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public csl.a a(wu $$0) {
         this.d = $$0;
         return this;
      }

      public csl.a a(Supplier<cua> $$0) {
         this.e = $$0;
         return this;
      }

      public csl.a a(csl.b $$0) {
         this.f = $$0;
         return this;
      }

      public csl.a a() {
         this.i = true;
         return this;
      }

      public csl.a b() {
         this.h = false;
         return this;
      }

      public csl.a c() {
         this.g = false;
         return this;
      }

      protected csl.a a(csl.h $$0) {
         this.j = $$0;
         return this;
      }

      public csl.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public csl d() {
         if ((this.j == csl.h.c || this.j == csl.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            csl $$0 = new csl(this.b, this.c, this.j, this.d, this.e, this.f);
            $$0.e = this.i;
            $$0.d = this.h;
            $$0.c = this.g;
            $$0.b = this.k;
            return $$0;
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(csl.d var1, csl.e var2);
   }

   static class c implements csl.e {
      public final Collection<cua> a = cub.a();
      public final Set<cua> b = cub.a();
      private final csl c;
      private final cov d;

      public c(csl $$0, cov $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cua $$0, csl.g $$1) {
         if ($$0.H() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != csl.g.c;
            if ($$2) {
               throw new IllegalStateException(
                  "Accidentally adding the same item stack twice " + $$0.F().getString() + " to a Creative Mode Tab: " + this.c.a().getString()
               );
            } else {
               if ($$0.g().a(this.d)) {
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

   public static record d(cov a, boolean b, jl.a c) {

      public boolean a(cov $$0, boolean $$1, jl.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cua var1, csl.g var2);

      default void a(cua $$0) {
         this.a($$0, csl.g.a);
      }

      default void a(dcc $$0, csl.g $$1) {
         this.a(new cua($$0), $$1);
      }

      default void a(dcc $$0) {
         this.a(new cua($$0), csl.g.a);
      }

      default void a(Collection<cua> $$0, csl.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cua> $$0) {
         this.a($$0, csl.g.a);
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
