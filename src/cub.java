import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cub {
   static final alc a = a("items");
   private final xd b;
   alc c = a;
   boolean d = true;
   boolean e = true;
   boolean f = false;
   private final cub.f g;
   private final int h;
   private final cub.h i;
   @Nullable
   private cvp j;
   private Collection<cvp> k = cvq.a();
   private Set<cvp> l = cvq.a();
   private final Supplier<cvp> m;
   private final cub.b n;

   cub(cub.f $$0, int $$1, cub.h $$2, xd $$3, Supplier<cvp> $$4, cub.b $$5) {
      this.g = $$0;
      this.h = $$1;
      this.b = $$3;
      this.m = $$4;
      this.n = $$5;
      this.i = $$2;
   }

   public static alc a(String $$0) {
      return alc.b("textures/gui/container/creative_inventory/tab_" + $$0 + ".png");
   }

   public static cub.a a(cub.f $$0, int $$1) {
      return new cub.a($$0, $$1);
   }

   public xd a() {
      return this.b;
   }

   public cvp b() {
      if (this.j == null) {
         this.j = this.m.get();
      }

      return this.j;
   }

   public alc c() {
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

   public cub.f g() {
      return this.g;
   }

   public boolean h() {
      return !this.k.isEmpty();
   }

   public boolean i() {
      return this.i != cub.h.a || this.h();
   }

   public boolean j() {
      return this.f;
   }

   public cub.h k() {
      return this.i;
   }

   public void a(cub.d $$0) {
      cub.c $$1 = new cub.c(this, $$0.a);
      alb<cub> $$2 = lu.al.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.k = $$1.a;
      this.l = $$1.b;
   }

   public Collection<cvp> l() {
      return this.k;
   }

   public Collection<cvp> m() {
      return this.l;
   }

   public boolean a(cvp $$0) {
      return this.l.contains($$0);
   }

   public static class a {
      private static final cub.b a = ($$0, $$1) -> {
      };
      private final cub.f b;
      private final int c;
      private xd d = xd.i();
      private Supplier<cvp> e = () -> cvp.k;
      private cub.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cub.h j = cub.h.a;
      private alc k = cub.a;

      public a(cub.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cub.a a(xd $$0) {
         this.d = $$0;
         return this;
      }

      public cub.a a(Supplier<cvp> $$0) {
         this.e = $$0;
         return this;
      }

      public cub.a a(cub.b $$0) {
         this.f = $$0;
         return this;
      }

      public cub.a a() {
         this.i = true;
         return this;
      }

      public cub.a b() {
         this.h = false;
         return this;
      }

      public cub.a c() {
         this.g = false;
         return this;
      }

      protected cub.a a(cub.h $$0) {
         this.j = $$0;
         return this;
      }

      public cub.a a(alc $$0) {
         this.k = $$0;
         return this;
      }

      public cub d() {
         if ((this.j == cub.h.c || this.j == cub.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cub $$0 = new cub(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cub.d var1, cub.e var2);
   }

   static class c implements cub.e {
      public final Collection<cvp> a = cvq.a();
      public final Set<cvp> b = cvq.a();
      private final cub c;
      private final cqn d;

      public c(cub $$0, cqn $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cvp $$0, cub.g $$1) {
         if ($$0.J() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cub.g.c;
            if ($$2) {
               throw new IllegalStateException(
                  "Accidentally adding the same item stack twice " + $$0.H().getString() + " to a Creative Mode Tab: " + this.c.a().getString()
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

   public static record d(cqn a, boolean b, jp.a c) {

      public boolean a(cqn $$0, boolean $$1, jp.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cvp var1, cub.g var2);

      default void a(cvp $$0) {
         this.a($$0, cub.g.a);
      }

      default void a(def $$0, cub.g $$1) {
         this.a(new cvp($$0), $$1);
      }

      default void a(def $$0) {
         this.a(new cvp($$0), cub.g.a);
      }

      default void a(Collection<cvp> $$0, cub.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cvp> $$0) {
         this.a($$0, cub.g.a);
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
