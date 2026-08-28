import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ctw {
   static final alb a = a("items");
   private final xd b;
   alb c = a;
   boolean d = true;
   boolean e = true;
   boolean f = false;
   private final ctw.f g;
   private final int h;
   private final ctw.h i;
   @Nullable
   private cvl j;
   private Collection<cvl> k = cvm.a();
   private Set<cvl> l = cvm.a();
   private final Supplier<cvl> m;
   private final ctw.b n;

   ctw(ctw.f $$0, int $$1, ctw.h $$2, xd $$3, Supplier<cvl> $$4, ctw.b $$5) {
      this.g = $$0;
      this.h = $$1;
      this.b = $$3;
      this.m = $$4;
      this.n = $$5;
      this.i = $$2;
   }

   public static alb a(String $$0) {
      return alb.b("textures/gui/container/creative_inventory/tab_" + $$0 + ".png");
   }

   public static ctw.a a(ctw.f $$0, int $$1) {
      return new ctw.a($$0, $$1);
   }

   public xd a() {
      return this.b;
   }

   public cvl b() {
      if (this.j == null) {
         this.j = this.m.get();
      }

      return this.j;
   }

   public alb c() {
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

   public ctw.f g() {
      return this.g;
   }

   public boolean h() {
      return !this.k.isEmpty();
   }

   public boolean i() {
      return this.i != ctw.h.a || this.h();
   }

   public boolean j() {
      return this.f;
   }

   public ctw.h k() {
      return this.i;
   }

   public void a(ctw.d $$0) {
      ctw.c $$1 = new ctw.c(this, $$0.a);
      ala<ctw> $$2 = lu.al.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.k = $$1.a;
      this.l = $$1.b;
   }

   public Collection<cvl> l() {
      return this.k;
   }

   public Collection<cvl> m() {
      return this.l;
   }

   public boolean a(cvl $$0) {
      return this.l.contains($$0);
   }

   public static class a {
      private static final ctw.b a = ($$0, $$1) -> {
      };
      private final ctw.f b;
      private final int c;
      private xd d = xd.i();
      private Supplier<cvl> e = () -> cvl.k;
      private ctw.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private ctw.h j = ctw.h.a;
      private alb k = ctw.a;

      public a(ctw.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public ctw.a a(xd $$0) {
         this.d = $$0;
         return this;
      }

      public ctw.a a(Supplier<cvl> $$0) {
         this.e = $$0;
         return this;
      }

      public ctw.a a(ctw.b $$0) {
         this.f = $$0;
         return this;
      }

      public ctw.a a() {
         this.i = true;
         return this;
      }

      public ctw.a b() {
         this.h = false;
         return this;
      }

      public ctw.a c() {
         this.g = false;
         return this;
      }

      protected ctw.a a(ctw.h $$0) {
         this.j = $$0;
         return this;
      }

      public ctw.a a(alb $$0) {
         this.k = $$0;
         return this;
      }

      public ctw d() {
         if ((this.j == ctw.h.c || this.j == ctw.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            ctw $$0 = new ctw(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(ctw.d var1, ctw.e var2);
   }

   static class c implements ctw.e {
      public final Collection<cvl> a = cvm.a();
      public final Set<cvl> b = cvm.a();
      private final ctw c;
      private final cqh d;

      public c(ctw $$0, cqh $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cvl $$0, ctw.g $$1) {
         if ($$0.J() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != ctw.g.c;
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

   public static record d(cqh a, boolean b, jp.a c) {

      public boolean a(cqh $$0, boolean $$1, jp.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cvl var1, ctw.g var2);

      default void a(cvl $$0) {
         this.a($$0, ctw.g.a);
      }

      default void a(ddr $$0, ctw.g $$1) {
         this.a(new cvl($$0), $$1);
      }

      default void a(ddr $$0) {
         this.a(new cvl($$0), ctw.g.a);
      }

      default void a(Collection<cvl> $$0, ctw.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cvl> $$0) {
         this.a($$0, ctw.g.a);
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
