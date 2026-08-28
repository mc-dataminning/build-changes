import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cwd {
   static final alz a = a("items");
   private final xv b;
   alz c = a;
   boolean d = true;
   boolean e = true;
   boolean f = false;
   private final cwd.f g;
   private final int h;
   private final cwd.h i;
   @Nullable
   private cxo j;
   private Collection<cxo> k = cxp.a();
   private Set<cxo> l = cxp.a();
   private final Supplier<cxo> m;
   private final cwd.b n;

   cwd(cwd.f $$0, int $$1, cwd.h $$2, xv $$3, Supplier<cxo> $$4, cwd.b $$5) {
      this.g = $$0;
      this.h = $$1;
      this.b = $$3;
      this.m = $$4;
      this.n = $$5;
      this.i = $$2;
   }

   public static alz a(String $$0) {
      return alz.b("textures/gui/container/creative_inventory/tab_" + $$0 + ".png");
   }

   public static cwd.a a(cwd.f $$0, int $$1) {
      return new cwd.a($$0, $$1);
   }

   public xv a() {
      return this.b;
   }

   public cxo b() {
      if (this.j == null) {
         this.j = this.m.get();
      }

      return this.j;
   }

   public alz c() {
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

   public cwd.f g() {
      return this.g;
   }

   public boolean h() {
      return !this.k.isEmpty();
   }

   public boolean i() {
      return this.i != cwd.h.a || this.h();
   }

   public boolean j() {
      return this.f;
   }

   public cwd.h k() {
      return this.i;
   }

   public void a(cwd.d $$0) {
      cwd.c $$1 = new cwd.c(this, $$0.a);
      aly<cwd> $$2 = ma.al.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.k = $$1.a;
      this.l = $$1.b;
   }

   public Collection<cxo> l() {
      return this.k;
   }

   public Collection<cxo> m() {
      return this.l;
   }

   public boolean a(cxo $$0) {
      return this.l.contains($$0);
   }

   public static class a {
      private static final cwd.b a = ($$0, $$1) -> {
      };
      private final cwd.f b;
      private final int c;
      private xv d = xv.i();
      private Supplier<cxo> e = () -> cxo.j;
      private cwd.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cwd.h j = cwd.h.a;
      private alz k = cwd.a;

      public a(cwd.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cwd.a a(xv $$0) {
         this.d = $$0;
         return this;
      }

      public cwd.a a(Supplier<cxo> $$0) {
         this.e = $$0;
         return this;
      }

      public cwd.a a(cwd.b $$0) {
         this.f = $$0;
         return this;
      }

      public cwd.a a() {
         this.i = true;
         return this;
      }

      public cwd.a b() {
         this.h = false;
         return this;
      }

      public cwd.a c() {
         this.g = false;
         return this;
      }

      protected cwd.a a(cwd.h $$0) {
         this.j = $$0;
         return this;
      }

      public cwd.a a(alz $$0) {
         this.k = $$0;
         return this;
      }

      public cwd d() {
         if ((this.j == cwd.h.c || this.j == cwd.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cwd $$0 = new cwd(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cwd.d var1, cwd.e var2);
   }

   static class c implements cwd.e {
      public final Collection<cxo> a = cxp.a();
      public final Set<cxo> b = cxp.a();
      private final cwd c;
      private final css d;

      public c(cwd $$0, css $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cxo $$0, cwd.g $$1) {
         if ($$0.L() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cwd.g.c;
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

   public static record d(css a, boolean b, js.a c) {

      public boolean a(css $$0, boolean $$1, js.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cxo var1, cwd.g var2);

      default void a(cxo $$0) {
         this.a($$0, cwd.g.a);
      }

      default void a(dhg $$0, cwd.g $$1) {
         this.a(new cxo($$0), $$1);
      }

      default void a(dhg $$0) {
         this.a(new cxo($$0), cwd.g.a);
      }

      default void a(Collection<cxo> $$0, cwd.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cxo> $$0) {
         this.a($$0, cwd.g.a);
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
