import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cvc {
   static final aku a = a("items");
   private final wo b;
   aku c = a;
   boolean d = true;
   boolean e = true;
   boolean f = false;
   private final cvc.f g;
   private final int h;
   private final cvc.h i;
   @Nullable
   private cwn j;
   private Collection<cwn> k = cwo.a();
   private Set<cwn> l = cwo.a();
   private final Supplier<cwn> m;
   private final cvc.b n;

   cvc(cvc.f $$0, int $$1, cvc.h $$2, wo $$3, Supplier<cwn> $$4, cvc.b $$5) {
      this.g = $$0;
      this.h = $$1;
      this.b = $$3;
      this.m = $$4;
      this.n = $$5;
      this.i = $$2;
   }

   public static aku a(String $$0) {
      return aku.b("textures/gui/container/creative_inventory/tab_" + $$0 + ".png");
   }

   public static cvc.a a(cvc.f $$0, int $$1) {
      return new cvc.a($$0, $$1);
   }

   public wo a() {
      return this.b;
   }

   public cwn b() {
      if (this.j == null) {
         this.j = this.m.get();
      }

      return this.j;
   }

   public aku c() {
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

   public cvc.f g() {
      return this.g;
   }

   public boolean h() {
      return !this.k.isEmpty();
   }

   public boolean i() {
      return this.i != cvc.h.a || this.h();
   }

   public boolean j() {
      return this.f;
   }

   public cvc.h k() {
      return this.i;
   }

   public void a(cvc.d $$0) {
      cvc.c $$1 = new cvc.c(this, $$0.a);
      akt<cvc> $$2 = mb.al.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.k = $$1.a;
      this.l = $$1.b;
   }

   public Collection<cwn> l() {
      return this.k;
   }

   public Collection<cwn> m() {
      return this.l;
   }

   public boolean a(cwn $$0) {
      return this.l.contains($$0);
   }

   public static class a {
      private static final cvc.b a = ($$0, $$1) -> {
      };
      private final cvc.f b;
      private final int c;
      private wo d = wo.i();
      private Supplier<cwn> e = () -> cwn.j;
      private cvc.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cvc.h j = cvc.h.a;
      private aku k = cvc.a;

      public a(cvc.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cvc.a a(wo $$0) {
         this.d = $$0;
         return this;
      }

      public cvc.a a(Supplier<cwn> $$0) {
         this.e = $$0;
         return this;
      }

      public cvc.a a(cvc.b $$0) {
         this.f = $$0;
         return this;
      }

      public cvc.a a() {
         this.i = true;
         return this;
      }

      public cvc.a b() {
         this.h = false;
         return this;
      }

      public cvc.a c() {
         this.g = false;
         return this;
      }

      protected cvc.a a(cvc.h $$0) {
         this.j = $$0;
         return this;
      }

      public cvc.a a(aku $$0) {
         this.k = $$0;
         return this;
      }

      public cvc d() {
         if ((this.j == cvc.h.c || this.j == cvc.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cvc $$0 = new cvc(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cvc.d var1, cvc.e var2);
   }

   static class c implements cvc.e {
      public final Collection<cwn> a = cwo.a();
      public final Set<cwn> b = cwo.a();
      private final cvc c;
      private final crr d;

      public c(cvc $$0, crr $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cwn $$0, cvc.g $$1) {
         if ($$0.M() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cvc.g.c;
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

   public static record d(crr a, boolean b, jt.a c) {

      public boolean a(crr $$0, boolean $$1, jt.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cwn var1, cvc.g var2);

      default void a(cwn $$0) {
         this.a($$0, cvc.g.a);
      }

      default void a(dgf $$0, cvc.g $$1) {
         this.a(new cwn($$0), $$1);
      }

      default void a(dgf $$0) {
         this.a(new cwn($$0), cvc.g.a);
      }

      default void a(Collection<cwn> $$0, cvc.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cwn> $$0) {
         this.a($$0, cvc.g.a);
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
