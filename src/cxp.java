import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cxp {
   static final alg a = a("items");
   private final wy b;
   alg c = a;
   boolean d = true;
   boolean e = true;
   boolean f = false;
   private final cxp.f g;
   private final int h;
   private final cxp.h i;
   @Nullable
   private cyy j;
   private Collection<cyy> k = cyz.a();
   private Set<cyy> l = cyz.a();
   private final Supplier<cyy> m;
   private final cxp.b n;

   cxp(cxp.f $$0, int $$1, cxp.h $$2, wy $$3, Supplier<cyy> $$4, cxp.b $$5) {
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

   public static cxp.a a(cxp.f $$0, int $$1) {
      return new cxp.a($$0, $$1);
   }

   public wy a() {
      return this.b;
   }

   public cyy b() {
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

   public cxp.f g() {
      return this.g;
   }

   public boolean h() {
      return !this.k.isEmpty();
   }

   public boolean i() {
      return this.i != cxp.h.a || this.h();
   }

   public boolean j() {
      return this.f;
   }

   public cxp.h k() {
      return this.i;
   }

   public void a(cxp.d $$0) {
      cxp.c $$1 = new cxp.c(this, $$0.a);
      alf<cxp> $$2 = mf.aj.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.k = $$1.a;
      this.l = $$1.b;
   }

   public Collection<cyy> l() {
      return this.k;
   }

   public Collection<cyy> m() {
      return this.l;
   }

   public boolean a(cyy $$0) {
      return this.l.contains($$0);
   }

   public static class a {
      private static final cxp.b a = ($$0, $$1) -> {
      };
      private final cxp.f b;
      private final int c;
      private wy d = wy.i();
      private Supplier<cyy> e = () -> cyy.k;
      private cxp.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cxp.h j = cxp.h.a;
      private alg k = cxp.a;

      public a(cxp.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cxp.a a(wy $$0) {
         this.d = $$0;
         return this;
      }

      public cxp.a a(Supplier<cyy> $$0) {
         this.e = $$0;
         return this;
      }

      public cxp.a a(cxp.b $$0) {
         this.f = $$0;
         return this;
      }

      public cxp.a a() {
         this.i = true;
         return this;
      }

      public cxp.a b() {
         this.h = false;
         return this;
      }

      public cxp.a c() {
         this.g = false;
         return this;
      }

      protected cxp.a a(cxp.h $$0) {
         this.j = $$0;
         return this;
      }

      public cxp.a a(alg $$0) {
         this.k = $$0;
         return this;
      }

      public cxp d() {
         if ((this.j == cxp.h.c || this.j == cxp.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cxp $$0 = new cxp(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cxp.d var1, cxp.e var2);
   }

   static class c implements cxp.e {
      public final Collection<cyy> a = cyz.a();
      public final Set<cyy> b = cyz.a();
      private final cxp c;
      private final cuh d;

      public c(cxp $$0, cuh $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cyy $$0, cxp.g $$1) {
         if ($$0.M() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cxp.g.c;
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

   public static record d(cuh a, boolean b, jg.a c) {

      public boolean a(cuh $$0, boolean $$1, jg.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cyy var1, cxp.g var2);

      default void a(cyy $$0) {
         this.a($$0, cxp.g.a);
      }

      default void a(diu $$0, cxp.g $$1) {
         this.a(new cyy($$0), $$1);
      }

      default void a(diu $$0) {
         this.a(new cyy($$0), cxp.g.a);
      }

      default void a(Collection<cyy> $$0, cxp.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cyy> $$0) {
         this.a($$0, cxp.g.a);
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
