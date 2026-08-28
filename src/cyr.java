import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cyr {
   static final alk a = a("items");
   private final xc b;
   alk c = a;
   boolean d = true;
   boolean e = true;
   boolean f = false;
   private final cyr.f g;
   private final int h;
   private final cyr.h i;
   @Nullable
   private daa j;
   private Collection<daa> k = dab.a();
   private Set<daa> l = dab.a();
   private final Supplier<daa> m;
   private final cyr.b n;

   cyr(cyr.f $$0, int $$1, cyr.h $$2, xc $$3, Supplier<daa> $$4, cyr.b $$5) {
      this.g = $$0;
      this.h = $$1;
      this.b = $$3;
      this.m = $$4;
      this.n = $$5;
      this.i = $$2;
   }

   public static alk a(String $$0) {
      return alk.b("textures/gui/container/creative_inventory/tab_" + $$0 + ".png");
   }

   public static cyr.a a(cyr.f $$0, int $$1) {
      return new cyr.a($$0, $$1);
   }

   public xc a() {
      return this.b;
   }

   public daa b() {
      if (this.j == null) {
         this.j = this.m.get();
      }

      return this.j;
   }

   public alk c() {
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

   public cyr.f g() {
      return this.g;
   }

   public boolean h() {
      return !this.k.isEmpty();
   }

   public boolean i() {
      return this.i != cyr.h.a || this.h();
   }

   public boolean j() {
      return this.f;
   }

   public cyr.h k() {
      return this.i;
   }

   public void a(cyr.d $$0) {
      cyr.c $$1 = new cyr.c(this, $$0.a);
      alj<cyr> $$2 = mh.aj.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.k = $$1.a;
      this.l = $$1.b;
   }

   public Collection<daa> l() {
      return this.k;
   }

   public Collection<daa> m() {
      return this.l;
   }

   public boolean a(daa $$0) {
      return this.l.contains($$0);
   }

   public static class a {
      private static final cyr.b a = ($$0, $$1) -> {
      };
      private final cyr.f b;
      private final int c;
      private xc d = xc.i();
      private Supplier<daa> e = () -> daa.k;
      private cyr.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cyr.h j = cyr.h.a;
      private alk k = cyr.a;

      public a(cyr.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cyr.a a(xc $$0) {
         this.d = $$0;
         return this;
      }

      public cyr.a a(Supplier<daa> $$0) {
         this.e = $$0;
         return this;
      }

      public cyr.a a(cyr.b $$0) {
         this.f = $$0;
         return this;
      }

      public cyr.a a() {
         this.i = true;
         return this;
      }

      public cyr.a b() {
         this.h = false;
         return this;
      }

      public cyr.a c() {
         this.g = false;
         return this;
      }

      protected cyr.a a(cyr.h $$0) {
         this.j = $$0;
         return this;
      }

      public cyr.a a(alk $$0) {
         this.k = $$0;
         return this;
      }

      public cyr d() {
         if ((this.j == cyr.h.c || this.j == cyr.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cyr $$0 = new cyr(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cyr.d var1, cyr.e var2);
   }

   static class c implements cyr.e {
      public final Collection<daa> a = dab.a();
      public final Set<daa> b = dab.a();
      private final cyr c;
      private final cvj d;

      public c(cyr $$0, cvj $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(daa $$0, cyr.g $$1) {
         if ($$0.M() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cyr.g.c;
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

   public static record d(cvj a, boolean b, ji.a c) {

      public boolean a(cvj $$0, boolean $$1, ji.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(daa var1, cyr.g var2);

      default void a(daa $$0) {
         this.a($$0, cyr.g.a);
      }

      default void a(djy $$0, cyr.g $$1) {
         this.a(new daa($$0), $$1);
      }

      default void a(djy $$0) {
         this.a(new daa($$0), cyr.g.a);
      }

      default void a(Collection<daa> $$0, cyr.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<daa> $$0) {
         this.a($$0, cyr.g.a);
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
