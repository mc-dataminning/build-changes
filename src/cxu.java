import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cxu {
   static final alg a = a("items");
   private final wy b;
   alg c = a;
   boolean d = true;
   boolean e = true;
   boolean f = false;
   private final cxu.f g;
   private final int h;
   private final cxu.h i;
   @Nullable
   private czd j;
   private Collection<czd> k = cze.a();
   private Set<czd> l = cze.a();
   private final Supplier<czd> m;
   private final cxu.b n;

   cxu(cxu.f $$0, int $$1, cxu.h $$2, wy $$3, Supplier<czd> $$4, cxu.b $$5) {
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

   public static cxu.a a(cxu.f $$0, int $$1) {
      return new cxu.a($$0, $$1);
   }

   public wy a() {
      return this.b;
   }

   public czd b() {
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

   public cxu.f g() {
      return this.g;
   }

   public boolean h() {
      return !this.k.isEmpty();
   }

   public boolean i() {
      return this.i != cxu.h.a || this.h();
   }

   public boolean j() {
      return this.f;
   }

   public cxu.h k() {
      return this.i;
   }

   public void a(cxu.d $$0) {
      cxu.c $$1 = new cxu.c(this, $$0.a);
      alf<cxu> $$2 = mf.aj.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.k = $$1.a;
      this.l = $$1.b;
   }

   public Collection<czd> l() {
      return this.k;
   }

   public Collection<czd> m() {
      return this.l;
   }

   public boolean a(czd $$0) {
      return this.l.contains($$0);
   }

   public static class a {
      private static final cxu.b a = ($$0, $$1) -> {
      };
      private final cxu.f b;
      private final int c;
      private wy d = wy.i();
      private Supplier<czd> e = () -> czd.k;
      private cxu.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cxu.h j = cxu.h.a;
      private alg k = cxu.a;

      public a(cxu.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cxu.a a(wy $$0) {
         this.d = $$0;
         return this;
      }

      public cxu.a a(Supplier<czd> $$0) {
         this.e = $$0;
         return this;
      }

      public cxu.a a(cxu.b $$0) {
         this.f = $$0;
         return this;
      }

      public cxu.a a() {
         this.i = true;
         return this;
      }

      public cxu.a b() {
         this.h = false;
         return this;
      }

      public cxu.a c() {
         this.g = false;
         return this;
      }

      protected cxu.a a(cxu.h $$0) {
         this.j = $$0;
         return this;
      }

      public cxu.a a(alg $$0) {
         this.k = $$0;
         return this;
      }

      public cxu d() {
         if ((this.j == cxu.h.c || this.j == cxu.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cxu $$0 = new cxu(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cxu.d var1, cxu.e var2);
   }

   static class c implements cxu.e {
      public final Collection<czd> a = cze.a();
      public final Set<czd> b = cze.a();
      private final cxu c;
      private final cum d;

      public c(cxu $$0, cum $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(czd $$0, cxu.g $$1) {
         if ($$0.M() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cxu.g.c;
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

   public static record d(cum a, boolean b, jg.a c) {

      public boolean a(cum $$0, boolean $$1, jg.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(czd var1, cxu.g var2);

      default void a(czd $$0) {
         this.a($$0, cxu.g.a);
      }

      default void a(diz $$0, cxu.g $$1) {
         this.a(new czd($$0), $$1);
      }

      default void a(diz $$0) {
         this.a(new czd($$0), cxu.g.a);
      }

      default void a(Collection<czd> $$0, cxu.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<czd> $$0) {
         this.a($$0, cxu.g.a);
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
