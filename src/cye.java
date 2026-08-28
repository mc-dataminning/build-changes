import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cye {
   static final alg a = a("items");
   private final wy b;
   alg c = a;
   boolean d = true;
   boolean e = true;
   boolean f = false;
   private final cye.f g;
   private final int h;
   private final cye.h i;
   @Nullable
   private czn j;
   private Collection<czn> k = czo.a();
   private Set<czn> l = czo.a();
   private final Supplier<czn> m;
   private final cye.b n;

   cye(cye.f $$0, int $$1, cye.h $$2, wy $$3, Supplier<czn> $$4, cye.b $$5) {
      this.g = $$0;
      this.h = $$1;
      this.b = $$3;
      this.m = $$4;
      this.n = $$5;
      this.i = $$2;
   }

   public static alg a(String $$0) {
      return alg.b("textures/gui/container/creative_inventory/tab_" + $$0 + ".png");
   }

   public static cye.a a(cye.f $$0, int $$1) {
      return new cye.a($$0, $$1);
   }

   public wy a() {
      return this.b;
   }

   public czn b() {
      if (this.j == null) {
         this.j = this.m.get();
      }

      return this.j;
   }

   public alg c() {
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

   public cye.f g() {
      return this.g;
   }

   public boolean h() {
      return !this.k.isEmpty();
   }

   public boolean i() {
      return this.i != cye.h.a || this.h();
   }

   public boolean j() {
      return this.f;
   }

   public cye.h k() {
      return this.i;
   }

   public void a(cye.d $$0) {
      cye.c $$1 = new cye.c(this, $$0.a);
      alf<cye> $$2 = mg.aj.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.k = $$1.a;
      this.l = $$1.b;
   }

   public Collection<czn> l() {
      return this.k;
   }

   public Collection<czn> m() {
      return this.l;
   }

   public boolean a(czn $$0) {
      return this.l.contains($$0);
   }

   public static class a {
      private static final cye.b a = ($$0, $$1) -> {
      };
      private final cye.f b;
      private final int c;
      private wy d = wy.i();
      private Supplier<czn> e = () -> czn.k;
      private cye.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cye.h j = cye.h.a;
      private alg k = cye.a;

      public a(cye.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cye.a a(wy $$0) {
         this.d = $$0;
         return this;
      }

      public cye.a a(Supplier<czn> $$0) {
         this.e = $$0;
         return this;
      }

      public cye.a a(cye.b $$0) {
         this.f = $$0;
         return this;
      }

      public cye.a a() {
         this.i = true;
         return this;
      }

      public cye.a b() {
         this.h = false;
         return this;
      }

      public cye.a c() {
         this.g = false;
         return this;
      }

      protected cye.a a(cye.h $$0) {
         this.j = $$0;
         return this;
      }

      public cye.a a(alg $$0) {
         this.k = $$0;
         return this;
      }

      public cye d() {
         if ((this.j == cye.h.c || this.j == cye.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cye $$0 = new cye(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cye.d var1, cye.e var2);
   }

   static class c implements cye.e {
      public final Collection<czn> a = czo.a();
      public final Set<czn> b = czo.a();
      private final cye c;
      private final cuw d;

      public c(cye $$0, cuw $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(czn $$0, cye.g $$1) {
         if ($$0.M() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cye.g.c;
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

   public static record d(cuw a, boolean b, jh.a c) {

      public boolean a(cuw $$0, boolean $$1, jh.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(czn var1, cye.g var2);

      default void a(czn $$0) {
         this.a($$0, cye.g.a);
      }

      default void a(djl $$0, cye.g $$1) {
         this.a(new czn($$0), $$1);
      }

      default void a(djl $$0) {
         this.a(new czn($$0), cye.g.a);
      }

      default void a(Collection<czn> $$0, cye.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<czn> $$0) {
         this.a($$0, cye.g.a);
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
