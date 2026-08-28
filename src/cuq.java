import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cuq {
   static final ali a = a("items");
   private final xi b;
   ali c = a;
   boolean d = true;
   boolean e = true;
   boolean f = false;
   private final cuq.f g;
   private final int h;
   private final cuq.h i;
   @Nullable
   private cwb j;
   private Collection<cwb> k = cwc.a();
   private Set<cwb> l = cwc.a();
   private final Supplier<cwb> m;
   private final cuq.b n;

   cuq(cuq.f $$0, int $$1, cuq.h $$2, xi $$3, Supplier<cwb> $$4, cuq.b $$5) {
      this.g = $$0;
      this.h = $$1;
      this.b = $$3;
      this.m = $$4;
      this.n = $$5;
      this.i = $$2;
   }

   public static ali a(String $$0) {
      return ali.b("textures/gui/container/creative_inventory/tab_" + $$0 + ".png");
   }

   public static cuq.a a(cuq.f $$0, int $$1) {
      return new cuq.a($$0, $$1);
   }

   public xi a() {
      return this.b;
   }

   public cwb b() {
      if (this.j == null) {
         this.j = this.m.get();
      }

      return this.j;
   }

   public ali c() {
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

   public cuq.f g() {
      return this.g;
   }

   public boolean h() {
      return !this.k.isEmpty();
   }

   public boolean i() {
      return this.i != cuq.h.a || this.h();
   }

   public boolean j() {
      return this.f;
   }

   public cuq.h k() {
      return this.i;
   }

   public void a(cuq.d $$0) {
      cuq.c $$1 = new cuq.c(this, $$0.a);
      alh<cuq> $$2 = ly.al.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.k = $$1.a;
      this.l = $$1.b;
   }

   public Collection<cwb> l() {
      return this.k;
   }

   public Collection<cwb> m() {
      return this.l;
   }

   public boolean a(cwb $$0) {
      return this.l.contains($$0);
   }

   public static class a {
      private static final cuq.b a = ($$0, $$1) -> {
      };
      private final cuq.f b;
      private final int c;
      private xi d = xi.i();
      private Supplier<cwb> e = () -> cwb.k;
      private cuq.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cuq.h j = cuq.h.a;
      private ali k = cuq.a;

      public a(cuq.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cuq.a a(xi $$0) {
         this.d = $$0;
         return this;
      }

      public cuq.a a(Supplier<cwb> $$0) {
         this.e = $$0;
         return this;
      }

      public cuq.a a(cuq.b $$0) {
         this.f = $$0;
         return this;
      }

      public cuq.a a() {
         this.i = true;
         return this;
      }

      public cuq.a b() {
         this.h = false;
         return this;
      }

      public cuq.a c() {
         this.g = false;
         return this;
      }

      protected cuq.a a(cuq.h $$0) {
         this.j = $$0;
         return this;
      }

      public cuq.a a(ali $$0) {
         this.k = $$0;
         return this;
      }

      public cuq d() {
         if ((this.j == cuq.h.c || this.j == cuq.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cuq $$0 = new cuq(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cuq.d var1, cuq.e var2);
   }

   static class c implements cuq.e {
      public final Collection<cwb> a = cwc.a();
      public final Set<cwb> b = cwc.a();
      private final cuq c;
      private final crf d;

      public c(cuq $$0, crf $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cwb $$0, cuq.g $$1) {
         if ($$0.L() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cuq.g.c;
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

   public static record d(crf a, boolean b, js.a c) {

      public boolean a(crf $$0, boolean $$1, js.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cwb var1, cuq.g var2);

      default void a(cwb $$0) {
         this.a($$0, cuq.g.a);
      }

      default void a(dfa $$0, cuq.g $$1) {
         this.a(new cwb($$0), $$1);
      }

      default void a(dfa $$0) {
         this.a(new cwb($$0), cuq.g.a);
      }

      default void a(Collection<cwb> $$0, cuq.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cwb> $$0) {
         this.a($$0, cuq.g.a);
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
