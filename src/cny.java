import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cny {
   private final vs a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final cny.f f;
   private final int g;
   private final cny.h h;
   @Nullable
   private cpq i;
   private Collection<cpq> j = cpr.a();
   private Set<cpq> k = cpr.a();
   @Nullable
   private Consumer<List<cpq>> l;
   private final Supplier<cpq> m;
   private final cny.b n;

   cny(cny.f $$0, int $$1, cny.h $$2, vs $$3, Supplier<cpq> $$4, cny.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static cny.a a(cny.f $$0, int $$1) {
      return new cny.a($$0, $$1);
   }

   public vs a() {
      return this.a;
   }

   public cpq b() {
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

   public cny.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != cny.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public cny.h k() {
      return this.h;
   }

   public void a(cny.d $$0) {
      cny.c $$1 = new cny.c(this, $$0.a);
      ajb<cny> $$2 = kh.ap.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<cpq> l() {
      return this.j;
   }

   public Collection<cpq> m() {
      return this.k;
   }

   public boolean a(cpq $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<cpq>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final cny.b a = ($$0, $$1) -> {
      };
      private final cny.f b;
      private final int c;
      private vs d = vs.i();
      private Supplier<cpq> e = () -> cpq.h;
      private cny.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cny.h j = cny.h.a;
      private String k = "items.png";

      public a(cny.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cny.a a(vs $$0) {
         this.d = $$0;
         return this;
      }

      public cny.a a(Supplier<cpq> $$0) {
         this.e = $$0;
         return this;
      }

      public cny.a a(cny.b $$0) {
         this.f = $$0;
         return this;
      }

      public cny.a a() {
         this.i = true;
         return this;
      }

      public cny.a b() {
         this.h = false;
         return this;
      }

      public cny.a c() {
         this.g = false;
         return this;
      }

      protected cny.a a(cny.h $$0) {
         this.j = $$0;
         return this;
      }

      public cny.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public cny d() {
         if ((this.j == cny.h.c || this.j == cny.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cny $$0 = new cny(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cny.d var1, cny.e var2);
   }

   static class c implements cny.e {
      public final Collection<cpq> a = cpr.a();
      public final Set<cpq> b = cpr.a();
      private final cny c;
      private final ckl d;

      public c(cny $$0, ckl $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cpq $$0, cny.g $$1) {
         if ($$0.M() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cny.g.c;
            if ($$2) {
               throw new IllegalStateException(
                  "Accidentally adding the same item stack twice " + $$0.K().getString() + " to a Creative Mode Tab: " + this.c.a().getString()
               );
            } else {
               if ($$0.d().a(this.d)) {
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

   public static record d(ckl a, boolean b, in.a c) {

      public boolean a(ckl $$0, boolean $$1, in.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cpq var1, cny.g var2);

      default void a(cpq $$0) {
         this.a($$0, cny.g.a);
      }

      default void a(cwd $$0, cny.g $$1) {
         this.a(new cpq($$0), $$1);
      }

      default void a(cwd $$0) {
         this.a(new cpq($$0), cny.g.a);
      }

      default void a(Collection<cpq> $$0, cny.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cpq> $$0) {
         this.a($$0, cny.g.a);
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
