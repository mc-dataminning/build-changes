import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cov {
   private final vu a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final cov.f f;
   private final int g;
   private final cov.h h;
   @Nullable
   private cqm i;
   private Collection<cqm> j = cqn.a();
   private Set<cqm> k = cqn.a();
   @Nullable
   private Consumer<List<cqm>> l;
   private final Supplier<cqm> m;
   private final cov.b n;

   cov(cov.f $$0, int $$1, cov.h $$2, vu $$3, Supplier<cqm> $$4, cov.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static cov.a a(cov.f $$0, int $$1) {
      return new cov.a($$0, $$1);
   }

   public vu a() {
      return this.a;
   }

   public cqm b() {
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

   public cov.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != cov.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public cov.h k() {
      return this.h;
   }

   public void a(cov.d $$0) {
      cov.c $$1 = new cov.c(this, $$0.a);
      ajg<cov> $$2 = ki.ap.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<cqm> l() {
      return this.j;
   }

   public Collection<cqm> m() {
      return this.k;
   }

   public boolean a(cqm $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<cqm>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final cov.b a = ($$0, $$1) -> {
      };
      private final cov.f b;
      private final int c;
      private vu d = vu.i();
      private Supplier<cqm> e = () -> cqm.h;
      private cov.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cov.h j = cov.h.a;
      private String k = "items.png";

      public a(cov.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cov.a a(vu $$0) {
         this.d = $$0;
         return this;
      }

      public cov.a a(Supplier<cqm> $$0) {
         this.e = $$0;
         return this;
      }

      public cov.a a(cov.b $$0) {
         this.f = $$0;
         return this;
      }

      public cov.a a() {
         this.i = true;
         return this;
      }

      public cov.a b() {
         this.h = false;
         return this;
      }

      public cov.a c() {
         this.g = false;
         return this;
      }

      protected cov.a a(cov.h $$0) {
         this.j = $$0;
         return this;
      }

      public cov.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public cov d() {
         if ((this.j == cov.h.c || this.j == cov.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cov $$0 = new cov(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cov.d var1, cov.e var2);
   }

   static class c implements cov.e {
      public final Collection<cqm> a = cqn.a();
      public final Set<cqm> b = cqn.a();
      private final cov c;
      private final clh d;

      public c(cov $$0, clh $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cqm $$0, cov.g $$1) {
         if ($$0.M() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cov.g.c;
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

   public static record d(clh a, boolean b, in.a c) {

      public boolean a(clh $$0, boolean $$1, in.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cqm var1, cov.g var2);

      default void a(cqm $$0) {
         this.a($$0, cov.g.a);
      }

      default void a(cxa $$0, cov.g $$1) {
         this.a(new cqm($$0), $$1);
      }

      default void a(cxa $$0) {
         this.a(new cqm($$0), cov.g.a);
      }

      default void a(Collection<cqm> $$0, cov.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cqm> $$0) {
         this.a($$0, cov.g.a);
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
