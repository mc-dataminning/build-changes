import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class csq {
   private final xe a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final csq.f f;
   private final int g;
   private final csq.h h;
   @Nullable
   private cuh i;
   private Collection<cuh> j = cui.a();
   private Set<cuh> k = cui.a();
   @Nullable
   private Consumer<List<cuh>> l;
   private final Supplier<cuh> m;
   private final csq.b n;

   csq(csq.f $$0, int $$1, csq.h $$2, xe $$3, Supplier<cuh> $$4, csq.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static csq.a a(csq.f $$0, int $$1) {
      return new csq.a($$0, $$1);
   }

   public xe a() {
      return this.a;
   }

   public cuh b() {
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

   public csq.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != csq.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public csq.h k() {
      return this.h;
   }

   public void a(csq.d $$0) {
      csq.c $$1 = new csq.c(this, $$0.a);
      aks<csq> $$2 = lh.ao.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<cuh> l() {
      return this.j;
   }

   public Collection<cuh> m() {
      return this.k;
   }

   public boolean a(cuh $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<cuh>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final csq.b a = ($$0, $$1) -> {
      };
      private final csq.f b;
      private final int c;
      private xe d = xe.i();
      private Supplier<cuh> e = () -> cuh.i;
      private csq.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private csq.h j = csq.h.a;
      private String k = "items.png";

      public a(csq.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public csq.a a(xe $$0) {
         this.d = $$0;
         return this;
      }

      public csq.a a(Supplier<cuh> $$0) {
         this.e = $$0;
         return this;
      }

      public csq.a a(csq.b $$0) {
         this.f = $$0;
         return this;
      }

      public csq.a a() {
         this.i = true;
         return this;
      }

      public csq.a b() {
         this.h = false;
         return this;
      }

      public csq.a c() {
         this.g = false;
         return this;
      }

      protected csq.a a(csq.h $$0) {
         this.j = $$0;
         return this;
      }

      public csq.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public csq d() {
         if ((this.j == csq.h.c || this.j == csq.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            csq $$0 = new csq(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(csq.d var1, csq.e var2);
   }

   static class c implements csq.e {
      public final Collection<cuh> a = cui.a();
      public final Set<cuh> b = cui.a();
      private final csq c;
      private final cop d;

      public c(csq $$0, cop $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cuh $$0, csq.g $$1) {
         if ($$0.G() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != csq.g.c;
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

   public static record d(cop a, boolean b, jc.a c) {

      public boolean a(cop $$0, boolean $$1, jc.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cuh var1, csq.g var2);

      default void a(cuh $$0) {
         this.a($$0, csq.g.a);
      }

      default void a(dbz $$0, csq.g $$1) {
         this.a(new cuh($$0), $$1);
      }

      default void a(dbz $$0) {
         this.a(new cuh($$0), csq.g.a);
      }

      default void a(Collection<cuh> $$0, csq.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cuh> $$0) {
         this.a($$0, csq.g.a);
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
