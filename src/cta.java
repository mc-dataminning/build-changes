import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cta {
   static final akr a = a("items");
   private final wz b;
   akr c = a;
   boolean d = true;
   boolean e = true;
   boolean f = false;
   private final cta.f g;
   private final int h;
   private final cta.h i;
   @Nullable
   private cuq j;
   private Collection<cuq> k = cur.a();
   private Set<cuq> l = cur.a();
   private final Supplier<cuq> m;
   private final cta.b n;

   cta(cta.f $$0, int $$1, cta.h $$2, wz $$3, Supplier<cuq> $$4, cta.b $$5) {
      this.g = $$0;
      this.h = $$1;
      this.b = $$3;
      this.m = $$4;
      this.n = $$5;
      this.i = $$2;
   }

   public static akr a(String $$0) {
      return akr.b("textures/gui/container/creative_inventory/tab_" + $$0 + ".png");
   }

   public static cta.a a(cta.f $$0, int $$1) {
      return new cta.a($$0, $$1);
   }

   public wz a() {
      return this.b;
   }

   public cuq b() {
      if (this.j == null) {
         this.j = this.m.get();
      }

      return this.j;
   }

   public akr c() {
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

   public cta.f g() {
      return this.g;
   }

   public boolean h() {
      return !this.k.isEmpty();
   }

   public boolean i() {
      return this.i != cta.h.a || this.h();
   }

   public boolean j() {
      return this.f;
   }

   public cta.h k() {
      return this.i;
   }

   public void a(cta.d $$0) {
      cta.c $$1 = new cta.c(this, $$0.a);
      akq<cta> $$2 = lt.am.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.k = $$1.a;
      this.l = $$1.b;
   }

   public Collection<cuq> l() {
      return this.k;
   }

   public Collection<cuq> m() {
      return this.l;
   }

   public boolean a(cuq $$0) {
      return this.l.contains($$0);
   }

   public static class a {
      private static final cta.b a = ($$0, $$1) -> {
      };
      private final cta.f b;
      private final int c;
      private wz d = wz.i();
      private Supplier<cuq> e = () -> cuq.l;
      private cta.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cta.h j = cta.h.a;
      private akr k = cta.a;

      public a(cta.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cta.a a(wz $$0) {
         this.d = $$0;
         return this;
      }

      public cta.a a(Supplier<cuq> $$0) {
         this.e = $$0;
         return this;
      }

      public cta.a a(cta.b $$0) {
         this.f = $$0;
         return this;
      }

      public cta.a a() {
         this.i = true;
         return this;
      }

      public cta.a b() {
         this.h = false;
         return this;
      }

      public cta.a c() {
         this.g = false;
         return this;
      }

      protected cta.a a(cta.h $$0) {
         this.j = $$0;
         return this;
      }

      public cta.a a(akr $$0) {
         this.k = $$0;
         return this;
      }

      public cta d() {
         if ((this.j == cta.h.c || this.j == cta.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cta $$0 = new cta(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cta.d var1, cta.e var2);
   }

   static class c implements cta.e {
      public final Collection<cuq> a = cur.a();
      public final Set<cuq> b = cur.a();
      private final cta c;
      private final cpl d;

      public c(cta $$0, cpl $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cuq $$0, cta.g $$1) {
         if ($$0.H() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cta.g.c;
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

   public static record d(cpl a, boolean b, jo.a c) {

      public boolean a(cpl $$0, boolean $$1, jo.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cuq var1, cta.g var2);

      default void a(cuq $$0) {
         this.a($$0, cta.g.a);
      }

      default void a(dcv $$0, cta.g $$1) {
         this.a(new cuq($$0), $$1);
      }

      default void a(dcv $$0) {
         this.a(new cuq($$0), cta.g.a);
      }

      default void a(Collection<cuq> $$0, cta.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cuq> $$0) {
         this.a($$0, cta.g.a);
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
