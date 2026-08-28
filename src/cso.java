import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cso {
   private final wu a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final cso.f f;
   private final int g;
   private final cso.h h;
   @Nullable
   private cud i;
   private Collection<cud> j = cue.a();
   private Set<cud> k = cue.a();
   private final Supplier<cud> l;
   private final cso.b m;

   cso(cso.f $$0, int $$1, cso.h $$2, wu $$3, Supplier<cud> $$4, cso.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.l = $$4;
      this.m = $$5;
      this.h = $$2;
   }

   public static cso.a a(cso.f $$0, int $$1) {
      return new cso.a($$0, $$1);
   }

   public wu a() {
      return this.a;
   }

   public cud b() {
      if (this.i == null) {
         this.i = this.l.get();
      }

      return this.i;
   }

   public String c() {
      return this.b;
   }

   public boolean d() {
      return this.d;
   }

   public boolean e() {
      return this.c;
   }

   public int f() {
      return this.g;
   }

   public cso.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != cso.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public cso.h k() {
      return this.h;
   }

   public void a(cso.d $$0) {
      cso.c $$1 = new cso.c(this, $$0.a);
      akj<cso> $$2 = lq.am.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.m.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
   }

   public Collection<cud> l() {
      return this.j;
   }

   public Collection<cud> m() {
      return this.k;
   }

   public boolean a(cud $$0) {
      return this.k.contains($$0);
   }

   public static class a {
      private static final cso.b a = ($$0, $$1) -> {
      };
      private final cso.f b;
      private final int c;
      private wu d = wu.i();
      private Supplier<cud> e = () -> cud.l;
      private cso.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cso.h j = cso.h.a;
      private String k = "items.png";

      public a(cso.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cso.a a(wu $$0) {
         this.d = $$0;
         return this;
      }

      public cso.a a(Supplier<cud> $$0) {
         this.e = $$0;
         return this;
      }

      public cso.a a(cso.b $$0) {
         this.f = $$0;
         return this;
      }

      public cso.a a() {
         this.i = true;
         return this;
      }

      public cso.a b() {
         this.h = false;
         return this;
      }

      public cso.a c() {
         this.g = false;
         return this;
      }

      protected cso.a a(cso.h $$0) {
         this.j = $$0;
         return this;
      }

      public cso.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public cso d() {
         if ((this.j == cso.h.c || this.j == cso.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cso $$0 = new cso(this.b, this.c, this.j, this.d, this.e, this.f);
            $$0.e = this.i;
            $$0.d = this.h;
            $$0.c = this.g;
            $$0.b = this.k;
            return $$0;
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(cso.d var1, cso.e var2);
   }

   static class c implements cso.e {
      public final Collection<cud> a = cue.a();
      public final Set<cud> b = cue.a();
      private final cso c;
      private final coz d;

      public c(cso $$0, coz $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cud $$0, cso.g $$1) {
         if ($$0.H() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cso.g.c;
            if ($$2) {
               throw new IllegalStateException(
                  "Accidentally adding the same item stack twice " + $$0.F().getString() + " to a Creative Mode Tab: " + this.c.a().getString()
               );
            } else {
               if ($$0.g().a(this.d)) {
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

   public static record d(coz a, boolean b, jl.a c) {

      public boolean a(coz $$0, boolean $$1, jl.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cud var1, cso.g var2);

      default void a(cud $$0) {
         this.a($$0, cso.g.a);
      }

      default void a(dcf $$0, cso.g $$1) {
         this.a(new cud($$0), $$1);
      }

      default void a(dcf $$0) {
         this.a(new cud($$0), cso.g.a);
      }

      default void a(Collection<cud> $$0, cso.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cud> $$0) {
         this.a($$0, cso.g.a);
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
