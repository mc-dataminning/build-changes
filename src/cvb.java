import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cvb {
   static final alj a = a("items");
   private final xj b;
   alj c = a;
   boolean d = true;
   boolean e = true;
   boolean f = false;
   private final cvb.f g;
   private final int h;
   private final cvb.h i;
   @Nullable
   private cwm j;
   private Collection<cwm> k = cwn.a();
   private Set<cwm> l = cwn.a();
   private final Supplier<cwm> m;
   private final cvb.b n;

   cvb(cvb.f $$0, int $$1, cvb.h $$2, xj $$3, Supplier<cwm> $$4, cvb.b $$5) {
      this.g = $$0;
      this.h = $$1;
      this.b = $$3;
      this.m = $$4;
      this.n = $$5;
      this.i = $$2;
   }

   public static alj a(String $$0) {
      return alj.b("textures/gui/container/creative_inventory/tab_" + $$0 + ".png");
   }

   public static cvb.a a(cvb.f $$0, int $$1) {
      return new cvb.a($$0, $$1);
   }

   public xj a() {
      return this.b;
   }

   public cwm b() {
      if (this.j == null) {
         this.j = this.m.get();
      }

      return this.j;
   }

   public alj c() {
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

   public cvb.f g() {
      return this.g;
   }

   public boolean h() {
      return !this.k.isEmpty();
   }

   public boolean i() {
      return this.i != cvb.h.a || this.h();
   }

   public boolean j() {
      return this.f;
   }

   public cvb.h k() {
      return this.i;
   }

   public void a(cvb.d $$0) {
      cvb.c $$1 = new cvb.c(this, $$0.a);
      ali<cvb> $$2 = lz.al.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.k = $$1.a;
      this.l = $$1.b;
   }

   public Collection<cwm> l() {
      return this.k;
   }

   public Collection<cwm> m() {
      return this.l;
   }

   public boolean a(cwm $$0) {
      return this.l.contains($$0);
   }

   public static class a {
      private static final cvb.b a = ($$0, $$1) -> {
      };
      private final cvb.f b;
      private final int c;
      private xj d = xj.i();
      private Supplier<cwm> e = () -> cwm.k;
      private cvb.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cvb.h j = cvb.h.a;
      private alj k = cvb.a;

      public a(cvb.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cvb.a a(xj $$0) {
         this.d = $$0;
         return this;
      }

      public cvb.a a(Supplier<cwm> $$0) {
         this.e = $$0;
         return this;
      }

      public cvb.a a(cvb.b $$0) {
         this.f = $$0;
         return this;
      }

      public cvb.a a() {
         this.i = true;
         return this;
      }

      public cvb.a b() {
         this.h = false;
         return this;
      }

      public cvb.a c() {
         this.g = false;
         return this;
      }

      protected cvb.a a(cvb.h $$0) {
         this.j = $$0;
         return this;
      }

      public cvb.a a(alj $$0) {
         this.k = $$0;
         return this;
      }

      public cvb d() {
         if ((this.j == cvb.h.c || this.j == cvb.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cvb $$0 = new cvb(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cvb.d var1, cvb.e var2);
   }

   static class c implements cvb.e {
      public final Collection<cwm> a = cwn.a();
      public final Set<cwm> b = cwn.a();
      private final cvb c;
      private final crq d;

      public c(cvb $$0, crq $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cwm $$0, cvb.g $$1) {
         if ($$0.L() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cvb.g.c;
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

   public static record d(crq a, boolean b, js.a c) {

      public boolean a(crq $$0, boolean $$1, js.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cwm var1, cvb.g var2);

      default void a(cwm $$0) {
         this.a($$0, cvb.g.a);
      }

      default void a(dfl $$0, cvb.g $$1) {
         this.a(new cwm($$0), $$1);
      }

      default void a(dfl $$0) {
         this.a(new cwm($$0), cvb.g.a);
      }

      default void a(Collection<cwm> $$0, cvb.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cwm> $$0) {
         this.a($$0, cvb.g.a);
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
