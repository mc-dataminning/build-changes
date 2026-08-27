import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cot {
   private final vu a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final cot.f f;
   private final int g;
   private final cot.h h;
   @Nullable
   private cqk i;
   private Collection<cqk> j = cql.a();
   private Set<cqk> k = cql.a();
   @Nullable
   private Consumer<List<cqk>> l;
   private final Supplier<cqk> m;
   private final cot.b n;

   cot(cot.f $$0, int $$1, cot.h $$2, vu $$3, Supplier<cqk> $$4, cot.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static cot.a a(cot.f $$0, int $$1) {
      return new cot.a($$0, $$1);
   }

   public vu a() {
      return this.a;
   }

   public cqk b() {
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

   public cot.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != cot.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public cot.h k() {
      return this.h;
   }

   public void a(cot.d $$0) {
      cot.c $$1 = new cot.c(this, $$0.a);
      ajg<cot> $$2 = ki.ap.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<cqk> l() {
      return this.j;
   }

   public Collection<cqk> m() {
      return this.k;
   }

   public boolean a(cqk $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<cqk>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final cot.b a = ($$0, $$1) -> {
      };
      private final cot.f b;
      private final int c;
      private vu d = vu.i();
      private Supplier<cqk> e = () -> cqk.h;
      private cot.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cot.h j = cot.h.a;
      private String k = "items.png";

      public a(cot.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cot.a a(vu $$0) {
         this.d = $$0;
         return this;
      }

      public cot.a a(Supplier<cqk> $$0) {
         this.e = $$0;
         return this;
      }

      public cot.a a(cot.b $$0) {
         this.f = $$0;
         return this;
      }

      public cot.a a() {
         this.i = true;
         return this;
      }

      public cot.a b() {
         this.h = false;
         return this;
      }

      public cot.a c() {
         this.g = false;
         return this;
      }

      protected cot.a a(cot.h $$0) {
         this.j = $$0;
         return this;
      }

      public cot.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public cot d() {
         if ((this.j == cot.h.c || this.j == cot.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cot $$0 = new cot(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cot.d var1, cot.e var2);
   }

   static class c implements cot.e {
      public final Collection<cqk> a = cql.a();
      public final Set<cqk> b = cql.a();
      private final cot c;
      private final clf d;

      public c(cot $$0, clf $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cqk $$0, cot.g $$1) {
         if ($$0.M() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cot.g.c;
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

   public static record d(clf a, boolean b, in.a c) {

      public boolean a(clf $$0, boolean $$1, in.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cqk var1, cot.g var2);

      default void a(cqk $$0) {
         this.a($$0, cot.g.a);
      }

      default void a(cwy $$0, cot.g $$1) {
         this.a(new cqk($$0), $$1);
      }

      default void a(cwy $$0) {
         this.a(new cqk($$0), cot.g.a);
      }

      default void a(Collection<cqk> $$0, cot.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cqk> $$0) {
         this.a($$0, cot.g.a);
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
