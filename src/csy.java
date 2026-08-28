import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class csy {
   static final akq a = a("items");
   private final wy b;
   akq c = a;
   boolean d = true;
   boolean e = true;
   boolean f = false;
   private final csy.f g;
   private final int h;
   private final csy.h i;
   @Nullable
   private cuo j;
   private Collection<cuo> k = cup.a();
   private Set<cuo> l = cup.a();
   private final Supplier<cuo> m;
   private final csy.b n;

   csy(csy.f $$0, int $$1, csy.h $$2, wy $$3, Supplier<cuo> $$4, csy.b $$5) {
      this.g = $$0;
      this.h = $$1;
      this.b = $$3;
      this.m = $$4;
      this.n = $$5;
      this.i = $$2;
   }

   public static akq a(String $$0) {
      return akq.b("textures/gui/container/creative_inventory/tab_" + $$0 + ".png");
   }

   public static csy.a a(csy.f $$0, int $$1) {
      return new csy.a($$0, $$1);
   }

   public wy a() {
      return this.b;
   }

   public cuo b() {
      if (this.j == null) {
         this.j = this.m.get();
      }

      return this.j;
   }

   public akq c() {
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

   public csy.f g() {
      return this.g;
   }

   public boolean h() {
      return !this.k.isEmpty();
   }

   public boolean i() {
      return this.i != csy.h.a || this.h();
   }

   public boolean j() {
      return this.f;
   }

   public csy.h k() {
      return this.i;
   }

   public void a(csy.d $$0) {
      csy.c $$1 = new csy.c(this, $$0.a);
      akp<csy> $$2 = lt.am.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.k = $$1.a;
      this.l = $$1.b;
   }

   public Collection<cuo> l() {
      return this.k;
   }

   public Collection<cuo> m() {
      return this.l;
   }

   public boolean a(cuo $$0) {
      return this.l.contains($$0);
   }

   public static class a {
      private static final csy.b a = ($$0, $$1) -> {
      };
      private final csy.f b;
      private final int c;
      private wy d = wy.i();
      private Supplier<cuo> e = () -> cuo.l;
      private csy.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private csy.h j = csy.h.a;
      private akq k = csy.a;

      public a(csy.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public csy.a a(wy $$0) {
         this.d = $$0;
         return this;
      }

      public csy.a a(Supplier<cuo> $$0) {
         this.e = $$0;
         return this;
      }

      public csy.a a(csy.b $$0) {
         this.f = $$0;
         return this;
      }

      public csy.a a() {
         this.i = true;
         return this;
      }

      public csy.a b() {
         this.h = false;
         return this;
      }

      public csy.a c() {
         this.g = false;
         return this;
      }

      protected csy.a a(csy.h $$0) {
         this.j = $$0;
         return this;
      }

      public csy.a a(akq $$0) {
         this.k = $$0;
         return this;
      }

      public csy d() {
         if ((this.j == csy.h.c || this.j == csy.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            csy $$0 = new csy(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(csy.d var1, csy.e var2);
   }

   static class c implements csy.e {
      public final Collection<cuo> a = cup.a();
      public final Set<cuo> b = cup.a();
      private final csy c;
      private final cpj d;

      public c(csy $$0, cpj $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cuo $$0, csy.g $$1) {
         if ($$0.H() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != csy.g.c;
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

   public static record d(cpj a, boolean b, jo.a c) {

      public boolean a(cpj $$0, boolean $$1, jo.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cuo var1, csy.g var2);

      default void a(cuo $$0) {
         this.a($$0, csy.g.a);
      }

      default void a(dct $$0, csy.g $$1) {
         this.a(new cuo($$0), $$1);
      }

      default void a(dct $$0) {
         this.a(new cuo($$0), csy.g.a);
      }

      default void a(Collection<cuo> $$0, csy.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cuo> $$0) {
         this.a($$0, csy.g.a);
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
