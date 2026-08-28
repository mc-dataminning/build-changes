import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cuu {
   static final all a = a("items");
   private final xl b;
   all c = a;
   boolean d = true;
   boolean e = true;
   boolean f = false;
   private final cuu.f g;
   private final int h;
   private final cuu.h i;
   @Nullable
   private cwf j;
   private Collection<cwf> k = cwg.a();
   private Set<cwf> l = cwg.a();
   private final Supplier<cwf> m;
   private final cuu.b n;

   cuu(cuu.f $$0, int $$1, cuu.h $$2, xl $$3, Supplier<cwf> $$4, cuu.b $$5) {
      this.g = $$0;
      this.h = $$1;
      this.b = $$3;
      this.m = $$4;
      this.n = $$5;
      this.i = $$2;
   }

   public static all a(String $$0) {
      return all.b("textures/gui/container/creative_inventory/tab_" + $$0 + ".png");
   }

   public static cuu.a a(cuu.f $$0, int $$1) {
      return new cuu.a($$0, $$1);
   }

   public xl a() {
      return this.b;
   }

   public cwf b() {
      if (this.j == null) {
         this.j = this.m.get();
      }

      return this.j;
   }

   public all c() {
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

   public cuu.f g() {
      return this.g;
   }

   public boolean h() {
      return !this.k.isEmpty();
   }

   public boolean i() {
      return this.i != cuu.h.a || this.h();
   }

   public boolean j() {
      return this.f;
   }

   public cuu.h k() {
      return this.i;
   }

   public void a(cuu.d $$0) {
      cuu.c $$1 = new cuu.c(this, $$0.a);
      alk<cuu> $$2 = lz.al.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.k = $$1.a;
      this.l = $$1.b;
   }

   public Collection<cwf> l() {
      return this.k;
   }

   public Collection<cwf> m() {
      return this.l;
   }

   public boolean a(cwf $$0) {
      return this.l.contains($$0);
   }

   public static class a {
      private static final cuu.b a = ($$0, $$1) -> {
      };
      private final cuu.f b;
      private final int c;
      private xl d = xl.i();
      private Supplier<cwf> e = () -> cwf.k;
      private cuu.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cuu.h j = cuu.h.a;
      private all k = cuu.a;

      public a(cuu.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cuu.a a(xl $$0) {
         this.d = $$0;
         return this;
      }

      public cuu.a a(Supplier<cwf> $$0) {
         this.e = $$0;
         return this;
      }

      public cuu.a a(cuu.b $$0) {
         this.f = $$0;
         return this;
      }

      public cuu.a a() {
         this.i = true;
         return this;
      }

      public cuu.a b() {
         this.h = false;
         return this;
      }

      public cuu.a c() {
         this.g = false;
         return this;
      }

      protected cuu.a a(cuu.h $$0) {
         this.j = $$0;
         return this;
      }

      public cuu.a a(all $$0) {
         this.k = $$0;
         return this;
      }

      public cuu d() {
         if ((this.j == cuu.h.c || this.j == cuu.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cuu $$0 = new cuu(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cuu.d var1, cuu.e var2);
   }

   static class c implements cuu.e {
      public final Collection<cwf> a = cwg.a();
      public final Set<cwf> b = cwg.a();
      private final cuu c;
      private final crj d;

      public c(cuu $$0, crj $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cwf $$0, cuu.g $$1) {
         if ($$0.L() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cuu.g.c;
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

   public static record d(crj a, boolean b, js.a c) {

      public boolean a(crj $$0, boolean $$1, js.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cwf var1, cuu.g var2);

      default void a(cwf $$0) {
         this.a($$0, cuu.g.a);
      }

      default void a(dfe $$0, cuu.g $$1) {
         this.a(new cwf($$0), $$1);
      }

      default void a(dfe $$0) {
         this.a(new cwf($$0), cuu.g.a);
      }

      default void a(Collection<cwf> $$0, cuu.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cwf> $$0) {
         this.a($$0, cuu.g.a);
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
