import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cyp {
   static final ali a = a("items");
   private final xa b;
   ali c = a;
   boolean d = true;
   boolean e = true;
   boolean f = false;
   private final cyp.f g;
   private final int h;
   private final cyp.h i;
   @Nullable
   private czy j;
   private Collection<czy> k = czz.a();
   private Set<czy> l = czz.a();
   private final Supplier<czy> m;
   private final cyp.b n;

   cyp(cyp.f $$0, int $$1, cyp.h $$2, xa $$3, Supplier<czy> $$4, cyp.b $$5) {
      this.g = $$0;
      this.h = $$1;
      this.b = $$3;
      this.m = $$4;
      this.n = $$5;
      this.i = $$2;
   }

   public static ali a(String $$0) {
      return ali.b("textures/gui/container/creative_inventory/tab_" + $$0 + ".png");
   }

   public static cyp.a a(cyp.f $$0, int $$1) {
      return new cyp.a($$0, $$1);
   }

   public xa a() {
      return this.b;
   }

   public czy b() {
      if (this.j == null) {
         this.j = this.m.get();
      }

      return this.j;
   }

   public ali c() {
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

   public cyp.f g() {
      return this.g;
   }

   public boolean h() {
      return !this.k.isEmpty();
   }

   public boolean i() {
      return this.i != cyp.h.a || this.h();
   }

   public boolean j() {
      return this.f;
   }

   public cyp.h k() {
      return this.i;
   }

   public void a(cyp.d $$0) {
      cyp.c $$1 = new cyp.c(this, $$0.a);
      alh<cyp> $$2 = mg.aj.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.k = $$1.a;
      this.l = $$1.b;
   }

   public Collection<czy> l() {
      return this.k;
   }

   public Collection<czy> m() {
      return this.l;
   }

   public boolean a(czy $$0) {
      return this.l.contains($$0);
   }

   public static class a {
      private static final cyp.b a = ($$0, $$1) -> {
      };
      private final cyp.f b;
      private final int c;
      private xa d = xa.i();
      private Supplier<czy> e = () -> czy.k;
      private cyp.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cyp.h j = cyp.h.a;
      private ali k = cyp.a;

      public a(cyp.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cyp.a a(xa $$0) {
         this.d = $$0;
         return this;
      }

      public cyp.a a(Supplier<czy> $$0) {
         this.e = $$0;
         return this;
      }

      public cyp.a a(cyp.b $$0) {
         this.f = $$0;
         return this;
      }

      public cyp.a a() {
         this.i = true;
         return this;
      }

      public cyp.a b() {
         this.h = false;
         return this;
      }

      public cyp.a c() {
         this.g = false;
         return this;
      }

      protected cyp.a a(cyp.h $$0) {
         this.j = $$0;
         return this;
      }

      public cyp.a a(ali $$0) {
         this.k = $$0;
         return this;
      }

      public cyp d() {
         if ((this.j == cyp.h.c || this.j == cyp.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cyp $$0 = new cyp(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cyp.d var1, cyp.e var2);
   }

   static class c implements cyp.e {
      public final Collection<czy> a = czz.a();
      public final Set<czy> b = czz.a();
      private final cyp c;
      private final cvh d;

      public c(cyp $$0, cvh $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(czy $$0, cyp.g $$1) {
         if ($$0.M() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cyp.g.c;
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

   public static record d(cvh a, boolean b, jh.a c) {

      public boolean a(cvh $$0, boolean $$1, jh.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(czy var1, cyp.g var2);

      default void a(czy $$0) {
         this.a($$0, cyp.g.a);
      }

      default void a(djw $$0, cyp.g $$1) {
         this.a(new czy($$0), $$1);
      }

      default void a(djw $$0) {
         this.a(new czy($$0), cyp.g.a);
      }

      default void a(Collection<czy> $$0, cyp.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<czy> $$0) {
         this.a($$0, cyp.g.a);
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
