import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cwe {
   static final alz a = a("items");
   private final xv b;
   alz c = a;
   boolean d = true;
   boolean e = true;
   boolean f = false;
   private final cwe.f g;
   private final int h;
   private final cwe.h i;
   @Nullable
   private cxp j;
   private Collection<cxp> k = cxq.a();
   private Set<cxp> l = cxq.a();
   private final Supplier<cxp> m;
   private final cwe.b n;

   cwe(cwe.f $$0, int $$1, cwe.h $$2, xv $$3, Supplier<cxp> $$4, cwe.b $$5) {
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

   public static cwe.a a(cwe.f $$0, int $$1) {
      return new cwe.a($$0, $$1);
   }

   public xv a() {
      return this.b;
   }

   public cxp b() {
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

   public cwe.f g() {
      return this.g;
   }

   public boolean h() {
      return !this.k.isEmpty();
   }

   public boolean i() {
      return this.i != cwe.h.a || this.h();
   }

   public boolean j() {
      return this.f;
   }

   public cwe.h k() {
      return this.i;
   }

   public void a(cwe.d $$0) {
      cwe.c $$1 = new cwe.c(this, $$0.a);
      aly<cwe> $$2 = ma.al.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.k = $$1.a;
      this.l = $$1.b;
   }

   public Collection<cxp> l() {
      return this.k;
   }

   public Collection<cxp> m() {
      return this.l;
   }

   public boolean a(cxp $$0) {
      return this.l.contains($$0);
   }

   public static class a {
      private static final cwe.b a = ($$0, $$1) -> {
      };
      private final cwe.f b;
      private final int c;
      private xv d = xv.i();
      private Supplier<cxp> e = () -> cxp.j;
      private cwe.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cwe.h j = cwe.h.a;
      private alz k = cwe.a;

      public a(cwe.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cwe.a a(xv $$0) {
         this.d = $$0;
         return this;
      }

      public cwe.a a(Supplier<cxp> $$0) {
         this.e = $$0;
         return this;
      }

      public cwe.a a(cwe.b $$0) {
         this.f = $$0;
         return this;
      }

      public cwe.a a() {
         this.i = true;
         return this;
      }

      public cwe.a b() {
         this.h = false;
         return this;
      }

      public cwe.a c() {
         this.g = false;
         return this;
      }

      protected cwe.a a(cwe.h $$0) {
         this.j = $$0;
         return this;
      }

      public cwe.a a(alz $$0) {
         this.k = $$0;
         return this;
      }

      public cwe d() {
         if ((this.j == cwe.h.c || this.j == cwe.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cwe $$0 = new cwe(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cwe.d var1, cwe.e var2);
   }

   static class c implements cwe.e {
      public final Collection<cxp> a = cxq.a();
      public final Set<cxp> b = cxq.a();
      private final cwe c;
      private final cst d;

      public c(cwe $$0, cst $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cxp $$0, cwe.g $$1) {
         if ($$0.L() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cwe.g.c;
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

   public static record d(cst a, boolean b, js.a c) {

      public boolean a(cst $$0, boolean $$1, js.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cxp var1, cwe.g var2);

      default void a(cxp $$0) {
         this.a($$0, cwe.g.a);
      }

      default void a(dhh $$0, cwe.g $$1) {
         this.a(new cxp($$0), $$1);
      }

      default void a(dhh $$0) {
         this.a(new cxp($$0), cwe.g.a);
      }

      default void a(Collection<cxp> $$0, cwe.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cxp> $$0) {
         this.a($$0, cwe.g.a);
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
