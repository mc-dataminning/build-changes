import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class czb {
   static final alr a = a("items");
   private final xg b;
   alr c = a;
   boolean d = true;
   boolean e = true;
   boolean f = false;
   private final czb.f g;
   private final int h;
   private final czb.h i;
   @Nullable
   private dak j;
   private Collection<dak> k = dal.a();
   private Set<dak> l = dal.a();
   private final Supplier<dak> m;
   private final czb.b n;

   czb(czb.f $$0, int $$1, czb.h $$2, xg $$3, Supplier<dak> $$4, czb.b $$5) {
      this.g = $$0;
      this.h = $$1;
      this.b = $$3;
      this.m = $$4;
      this.n = $$5;
      this.i = $$2;
   }

   public static alr a(String $$0) {
      return alr.b("textures/gui/container/creative_inventory/tab_" + $$0 + ".png");
   }

   public static czb.a a(czb.f $$0, int $$1) {
      return new czb.a($$0, $$1);
   }

   public xg a() {
      return this.b;
   }

   public dak b() {
      if (this.j == null) {
         this.j = this.m.get();
      }

      return this.j;
   }

   public alr c() {
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

   public czb.f g() {
      return this.g;
   }

   public boolean h() {
      return !this.k.isEmpty();
   }

   public boolean i() {
      return this.i != czb.h.a || this.h();
   }

   public boolean j() {
      return this.f;
   }

   public czb.h k() {
      return this.i;
   }

   public void a(czb.d $$0) {
      czb.c $$1 = new czb.c(this, $$0.a);
      alq<czb> $$2 = mh.aj.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.k = $$1.a;
      this.l = $$1.b;
   }

   public Collection<dak> l() {
      return this.k;
   }

   public Collection<dak> m() {
      return this.l;
   }

   public boolean a(dak $$0) {
      return this.l.contains($$0);
   }

   public static class a {
      private static final czb.b a = ($$0, $$1) -> {
      };
      private final czb.f b;
      private final int c;
      private xg d = xg.i();
      private Supplier<dak> e = () -> dak.l;
      private czb.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private czb.h j = czb.h.a;
      private alr k = czb.a;

      public a(czb.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public czb.a a(xg $$0) {
         this.d = $$0;
         return this;
      }

      public czb.a a(Supplier<dak> $$0) {
         this.e = $$0;
         return this;
      }

      public czb.a a(czb.b $$0) {
         this.f = $$0;
         return this;
      }

      public czb.a a() {
         this.i = true;
         return this;
      }

      public czb.a b() {
         this.h = false;
         return this;
      }

      public czb.a c() {
         this.g = false;
         return this;
      }

      protected czb.a a(czb.h $$0) {
         this.j = $$0;
         return this;
      }

      public czb.a a(alr $$0) {
         this.k = $$0;
         return this;
      }

      public czb d() {
         if ((this.j == czb.h.c || this.j == czb.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            czb $$0 = new czb(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(czb.d var1, czb.e var2);
   }

   static class c implements czb.e {
      public final Collection<dak> a = dal.a();
      public final Set<dak> b = dal.a();
      private final czb c;
      private final cvs d;

      public c(czb $$0, cvs $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(dak $$0, czb.g $$1) {
         if ($$0.M() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != czb.g.c;
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

   public static record d(cvs a, boolean b, ji.a c) {

      public boolean a(cvs $$0, boolean $$1, ji.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(dak var1, czb.g var2);

      default void a(dak $$0) {
         this.a($$0, czb.g.a);
      }

      default void a(dki $$0, czb.g $$1) {
         this.a(new dak($$0), $$1);
      }

      default void a(dki $$0) {
         this.a(new dak($$0), czb.g.a);
      }

      default void a(Collection<dak> $$0, czb.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<dak> $$0) {
         this.a($$0, czb.g.a);
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
