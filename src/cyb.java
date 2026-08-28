import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cyb {
   static final alg a = a("items");
   private final wy b;
   alg c = a;
   boolean d = true;
   boolean e = true;
   boolean f = false;
   private final cyb.f g;
   private final int h;
   private final cyb.h i;
   @Nullable
   private czk j;
   private Collection<czk> k = czl.a();
   private Set<czk> l = czl.a();
   private final Supplier<czk> m;
   private final cyb.b n;

   cyb(cyb.f $$0, int $$1, cyb.h $$2, wy $$3, Supplier<czk> $$4, cyb.b $$5) {
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

   public static cyb.a a(cyb.f $$0, int $$1) {
      return new cyb.a($$0, $$1);
   }

   public wy a() {
      return this.b;
   }

   public czk b() {
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

   public cyb.f g() {
      return this.g;
   }

   public boolean h() {
      return !this.k.isEmpty();
   }

   public boolean i() {
      return this.i != cyb.h.a || this.h();
   }

   public boolean j() {
      return this.f;
   }

   public cyb.h k() {
      return this.i;
   }

   public void a(cyb.d $$0) {
      cyb.c $$1 = new cyb.c(this, $$0.a);
      alf<cyb> $$2 = mg.aj.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.k = $$1.a;
      this.l = $$1.b;
   }

   public Collection<czk> l() {
      return this.k;
   }

   public Collection<czk> m() {
      return this.l;
   }

   public boolean a(czk $$0) {
      return this.l.contains($$0);
   }

   public static class a {
      private static final cyb.b a = ($$0, $$1) -> {
      };
      private final cyb.f b;
      private final int c;
      private wy d = wy.i();
      private Supplier<czk> e = () -> czk.k;
      private cyb.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cyb.h j = cyb.h.a;
      private alg k = cyb.a;

      public a(cyb.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cyb.a a(wy $$0) {
         this.d = $$0;
         return this;
      }

      public cyb.a a(Supplier<czk> $$0) {
         this.e = $$0;
         return this;
      }

      public cyb.a a(cyb.b $$0) {
         this.f = $$0;
         return this;
      }

      public cyb.a a() {
         this.i = true;
         return this;
      }

      public cyb.a b() {
         this.h = false;
         return this;
      }

      public cyb.a c() {
         this.g = false;
         return this;
      }

      protected cyb.a a(cyb.h $$0) {
         this.j = $$0;
         return this;
      }

      public cyb.a a(alg $$0) {
         this.k = $$0;
         return this;
      }

      public cyb d() {
         if ((this.j == cyb.h.c || this.j == cyb.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cyb $$0 = new cyb(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cyb.d var1, cyb.e var2);
   }

   static class c implements cyb.e {
      public final Collection<czk> a = czl.a();
      public final Set<czk> b = czl.a();
      private final cyb c;
      private final cut d;

      public c(cyb $$0, cut $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(czk $$0, cyb.g $$1) {
         if ($$0.M() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cyb.g.c;
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

   public static record d(cut a, boolean b, jh.a c) {

      public boolean a(cut $$0, boolean $$1, jh.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(czk var1, cyb.g var2);

      default void a(czk $$0) {
         this.a($$0, cyb.g.a);
      }

      default void a(djg $$0, cyb.g $$1) {
         this.a(new czk($$0), $$1);
      }

      default void a(djg $$0) {
         this.a(new czk($$0), cyb.g.a);
      }

      default void a(Collection<czk> $$0, cyb.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<czk> $$0) {
         this.a($$0, cyb.g.a);
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
