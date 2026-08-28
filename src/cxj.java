import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cxj {
   static final ale a = a("items");
   private final ww b;
   ale c = a;
   boolean d = true;
   boolean e = true;
   boolean f = false;
   private final cxj.f g;
   private final int h;
   private final cxj.h i;
   @Nullable
   private cys j;
   private Collection<cys> k = cyt.a();
   private Set<cys> l = cyt.a();
   private final Supplier<cys> m;
   private final cxj.b n;

   cxj(cxj.f $$0, int $$1, cxj.h $$2, ww $$3, Supplier<cys> $$4, cxj.b $$5) {
      this.g = $$0;
      this.h = $$1;
      this.b = $$3;
      this.m = $$4;
      this.n = $$5;
      this.i = $$2;
   }

   public static ale a(String $$0) {
      return ale.b("textures/gui/container/creative_inventory/tab_" + $$0 + ".png");
   }

   public static cxj.a a(cxj.f $$0, int $$1) {
      return new cxj.a($$0, $$1);
   }

   public ww a() {
      return this.b;
   }

   public cys b() {
      if (this.j == null) {
         this.j = this.m.get();
      }

      return this.j;
   }

   public ale c() {
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

   public cxj.f g() {
      return this.g;
   }

   public boolean h() {
      return !this.k.isEmpty();
   }

   public boolean i() {
      return this.i != cxj.h.a || this.h();
   }

   public boolean j() {
      return this.f;
   }

   public cxj.h k() {
      return this.i;
   }

   public void a(cxj.d $$0) {
      cxj.c $$1 = new cxj.c(this, $$0.a);
      ald<cxj> $$2 = mf.aj.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.k = $$1.a;
      this.l = $$1.b;
   }

   public Collection<cys> l() {
      return this.k;
   }

   public Collection<cys> m() {
      return this.l;
   }

   public boolean a(cys $$0) {
      return this.l.contains($$0);
   }

   public static class a {
      private static final cxj.b a = ($$0, $$1) -> {
      };
      private final cxj.f b;
      private final int c;
      private ww d = ww.i();
      private Supplier<cys> e = () -> cys.k;
      private cxj.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cxj.h j = cxj.h.a;
      private ale k = cxj.a;

      public a(cxj.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cxj.a a(ww $$0) {
         this.d = $$0;
         return this;
      }

      public cxj.a a(Supplier<cys> $$0) {
         this.e = $$0;
         return this;
      }

      public cxj.a a(cxj.b $$0) {
         this.f = $$0;
         return this;
      }

      public cxj.a a() {
         this.i = true;
         return this;
      }

      public cxj.a b() {
         this.h = false;
         return this;
      }

      public cxj.a c() {
         this.g = false;
         return this;
      }

      protected cxj.a a(cxj.h $$0) {
         this.j = $$0;
         return this;
      }

      public cxj.a a(ale $$0) {
         this.k = $$0;
         return this;
      }

      public cxj d() {
         if ((this.j == cxj.h.c || this.j == cxj.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cxj $$0 = new cxj(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cxj.d var1, cxj.e var2);
   }

   static class c implements cxj.e {
      public final Collection<cys> a = cyt.a();
      public final Set<cys> b = cyt.a();
      private final cxj c;
      private final cub d;

      public c(cxj $$0, cub $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cys $$0, cxj.g $$1) {
         if ($$0.M() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cxj.g.c;
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

   public static record d(cub a, boolean b, jg.a c) {

      public boolean a(cub $$0, boolean $$1, jg.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cys var1, cxj.g var2);

      default void a(cys $$0) {
         this.a($$0, cxj.g.a);
      }

      default void a(dio $$0, cxj.g $$1) {
         this.a(new cys($$0), $$1);
      }

      default void a(dio $$0) {
         this.a(new cys($$0), cxj.g.a);
      }

      default void a(Collection<cys> $$0, cxj.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cys> $$0) {
         this.a($$0, cxj.g.a);
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
