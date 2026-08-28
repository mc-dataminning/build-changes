import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cwo {
   static final ald a = a("items");
   private final wv b;
   ald c = a;
   boolean d = true;
   boolean e = true;
   boolean f = false;
   private final cwo.f g;
   private final int h;
   private final cwo.h i;
   @Nullable
   private cxy j;
   private Collection<cxy> k = cxz.a();
   private Set<cxy> l = cxz.a();
   private final Supplier<cxy> m;
   private final cwo.b n;

   cwo(cwo.f $$0, int $$1, cwo.h $$2, wv $$3, Supplier<cxy> $$4, cwo.b $$5) {
      this.g = $$0;
      this.h = $$1;
      this.b = $$3;
      this.m = $$4;
      this.n = $$5;
      this.i = $$2;
   }

   public static ald a(String $$0) {
      return ald.b("textures/gui/container/creative_inventory/tab_" + $$0 + ".png");
   }

   public static cwo.a a(cwo.f $$0, int $$1) {
      return new cwo.a($$0, $$1);
   }

   public wv a() {
      return this.b;
   }

   public cxy b() {
      if (this.j == null) {
         this.j = this.m.get();
      }

      return this.j;
   }

   public ald c() {
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

   public cwo.f g() {
      return this.g;
   }

   public boolean h() {
      return !this.k.isEmpty();
   }

   public boolean i() {
      return this.i != cwo.h.a || this.h();
   }

   public boolean j() {
      return this.f;
   }

   public cwo.h k() {
      return this.i;
   }

   public void a(cwo.d $$0) {
      cwo.c $$1 = new cwo.c(this, $$0.a);
      alc<cwo> $$2 = md.al.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.k = $$1.a;
      this.l = $$1.b;
   }

   public Collection<cxy> l() {
      return this.k;
   }

   public Collection<cxy> m() {
      return this.l;
   }

   public boolean a(cxy $$0) {
      return this.l.contains($$0);
   }

   public static class a {
      private static final cwo.b a = ($$0, $$1) -> {
      };
      private final cwo.f b;
      private final int c;
      private wv d = wv.i();
      private Supplier<cxy> e = () -> cxy.k;
      private cwo.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cwo.h j = cwo.h.a;
      private ald k = cwo.a;

      public a(cwo.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cwo.a a(wv $$0) {
         this.d = $$0;
         return this;
      }

      public cwo.a a(Supplier<cxy> $$0) {
         this.e = $$0;
         return this;
      }

      public cwo.a a(cwo.b $$0) {
         this.f = $$0;
         return this;
      }

      public cwo.a a() {
         this.i = true;
         return this;
      }

      public cwo.a b() {
         this.h = false;
         return this;
      }

      public cwo.a c() {
         this.g = false;
         return this;
      }

      protected cwo.a a(cwo.h $$0) {
         this.j = $$0;
         return this;
      }

      public cwo.a a(ald $$0) {
         this.k = $$0;
         return this;
      }

      public cwo d() {
         if ((this.j == cwo.h.c || this.j == cwo.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cwo $$0 = new cwo(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cwo.d var1, cwo.e var2);
   }

   static class c implements cwo.e {
      public final Collection<cxy> a = cxz.a();
      public final Set<cxy> b = cxz.a();
      private final cwo c;
      private final cte d;

      public c(cwo $$0, cte $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cxy $$0, cwo.g $$1) {
         if ($$0.M() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cwo.g.c;
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

   public static record d(cte a, boolean b, ju.a c) {

      public boolean a(cte $$0, boolean $$1, ju.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cxy var1, cwo.g var2);

      default void a(cxy $$0) {
         this.a($$0, cwo.g.a);
      }

      default void a(dho $$0, cwo.g $$1) {
         this.a(new cxy($$0), $$1);
      }

      default void a(dho $$0) {
         this.a(new cxy($$0), cwo.g.a);
      }

      default void a(Collection<cxy> $$0, cwo.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cxy> $$0) {
         this.a($$0, cwo.g.a);
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
