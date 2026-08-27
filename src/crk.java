import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class crk {
   private final wu a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final crk.f f;
   private final int g;
   private final crk.h h;
   @Nullable
   private csz i;
   private Collection<csz> j = cta.a();
   private Set<csz> k = cta.a();
   @Nullable
   private Consumer<List<csz>> l;
   private final Supplier<csz> m;
   private final crk.b n;

   crk(crk.f $$0, int $$1, crk.h $$2, wu $$3, Supplier<csz> $$4, crk.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static crk.a a(crk.f $$0, int $$1) {
      return new crk.a($$0, $$1);
   }

   public wu a() {
      return this.a;
   }

   public csz b() {
      if (this.i == null) {
         this.i = this.m.get();
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

   public crk.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != crk.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public crk.h k() {
      return this.h;
   }

   public void a(crk.d $$0) {
      crk.c $$1 = new crk.c(this, $$0.a);
      akg<crk> $$2 = ld.ao.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<csz> l() {
      return this.j;
   }

   public Collection<csz> m() {
      return this.k;
   }

   public boolean a(csz $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<csz>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final crk.b a = ($$0, $$1) -> {
      };
      private final crk.f b;
      private final int c;
      private wu d = wu.i();
      private Supplier<csz> e = () -> csz.i;
      private crk.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private crk.h j = crk.h.a;
      private String k = "items.png";

      public a(crk.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public crk.a a(wu $$0) {
         this.d = $$0;
         return this;
      }

      public crk.a a(Supplier<csz> $$0) {
         this.e = $$0;
         return this;
      }

      public crk.a a(crk.b $$0) {
         this.f = $$0;
         return this;
      }

      public crk.a a() {
         this.i = true;
         return this;
      }

      public crk.a b() {
         this.h = false;
         return this;
      }

      public crk.a c() {
         this.g = false;
         return this;
      }

      protected crk.a a(crk.h $$0) {
         this.j = $$0;
         return this;
      }

      public crk.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public crk d() {
         if ((this.j == crk.h.c || this.j == crk.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            crk $$0 = new crk(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(crk.d var1, crk.e var2);
   }

   static class c implements crk.e {
      public final Collection<csz> a = cta.a();
      public final Set<csz> b = cta.a();
      private final crk c;
      private final cnu d;

      public c(crk $$0, cnu $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(csz $$0, crk.g $$1) {
         if ($$0.G() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != crk.g.c;
            if ($$2) {
               throw new IllegalStateException(
                  "Accidentally adding the same item stack twice " + $$0.E().getString() + " to a Creative Mode Tab: " + this.c.a().getString()
               );
            } else {
               if ($$0.f().a(this.d)) {
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

   public static record d(cnu a, boolean b, iy.a c) {

      public boolean a(cnu $$0, boolean $$1, iy.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(csz var1, crk.g var2);

      default void a(csz $$0) {
         this.a($$0, crk.g.a);
      }

      default void a(dac $$0, crk.g $$1) {
         this.a(new csz($$0), $$1);
      }

      default void a(dac $$0) {
         this.a(new csz($$0), crk.g.a);
      }

      default void a(Collection<csz> $$0, crk.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<csz> $$0) {
         this.a($$0, crk.g.a);
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
