import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cum {
   static final alh a = a("items");
   private final xh b;
   alh c = a;
   boolean d = true;
   boolean e = true;
   boolean f = false;
   private final cum.f g;
   private final int h;
   private final cum.h i;
   @Nullable
   private cvx j;
   private Collection<cvx> k = cvy.a();
   private Set<cvx> l = cvy.a();
   private final Supplier<cvx> m;
   private final cum.b n;

   cum(cum.f $$0, int $$1, cum.h $$2, xh $$3, Supplier<cvx> $$4, cum.b $$5) {
      this.g = $$0;
      this.h = $$1;
      this.b = $$3;
      this.m = $$4;
      this.n = $$5;
      this.i = $$2;
   }

   public static alh a(String $$0) {
      return alh.b("textures/gui/container/creative_inventory/tab_" + $$0 + ".png");
   }

   public static cum.a a(cum.f $$0, int $$1) {
      return new cum.a($$0, $$1);
   }

   public xh a() {
      return this.b;
   }

   public cvx b() {
      if (this.j == null) {
         this.j = this.m.get();
      }

      return this.j;
   }

   public alh c() {
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

   public cum.f g() {
      return this.g;
   }

   public boolean h() {
      return !this.k.isEmpty();
   }

   public boolean i() {
      return this.i != cum.h.a || this.h();
   }

   public boolean j() {
      return this.f;
   }

   public cum.h k() {
      return this.i;
   }

   public void a(cum.d $$0) {
      cum.c $$1 = new cum.c(this, $$0.a);
      alg<cum> $$2 = lx.al.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.k = $$1.a;
      this.l = $$1.b;
   }

   public Collection<cvx> l() {
      return this.k;
   }

   public Collection<cvx> m() {
      return this.l;
   }

   public boolean a(cvx $$0) {
      return this.l.contains($$0);
   }

   public static class a {
      private static final cum.b a = ($$0, $$1) -> {
      };
      private final cum.f b;
      private final int c;
      private xh d = xh.i();
      private Supplier<cvx> e = () -> cvx.k;
      private cum.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cum.h j = cum.h.a;
      private alh k = cum.a;

      public a(cum.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cum.a a(xh $$0) {
         this.d = $$0;
         return this;
      }

      public cum.a a(Supplier<cvx> $$0) {
         this.e = $$0;
         return this;
      }

      public cum.a a(cum.b $$0) {
         this.f = $$0;
         return this;
      }

      public cum.a a() {
         this.i = true;
         return this;
      }

      public cum.a b() {
         this.h = false;
         return this;
      }

      public cum.a c() {
         this.g = false;
         return this;
      }

      protected cum.a a(cum.h $$0) {
         this.j = $$0;
         return this;
      }

      public cum.a a(alh $$0) {
         this.k = $$0;
         return this;
      }

      public cum d() {
         if ((this.j == cum.h.c || this.j == cum.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cum $$0 = new cum(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cum.d var1, cum.e var2);
   }

   static class c implements cum.e {
      public final Collection<cvx> a = cvy.a();
      public final Set<cvx> b = cvy.a();
      private final cum c;
      private final cra d;

      public c(cum $$0, cra $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cvx $$0, cum.g $$1) {
         if ($$0.L() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cum.g.c;
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

   public static record d(cra a, boolean b, jr.a c) {

      public boolean a(cra $$0, boolean $$1, jr.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cvx var1, cum.g var2);

      default void a(cvx $$0) {
         this.a($$0, cum.g.a);
      }

      default void a(deu $$0, cum.g $$1) {
         this.a(new cvx($$0), $$1);
      }

      default void a(deu $$0) {
         this.a(new cvx($$0), cum.g.a);
      }

      default void a(Collection<cvx> $$0, cum.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cvx> $$0) {
         this.a($$0, cum.g.a);
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
