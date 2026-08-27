import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cnf {
   private final vq a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final cnf.f f;
   private final int g;
   private final cnf.h h;
   @Nullable
   private coz i;
   private Collection<coz> j = cpa.a();
   private Set<coz> k = cpa.a();
   @Nullable
   private Consumer<List<coz>> l;
   private final Supplier<coz> m;
   private final cnf.b n;

   cnf(cnf.f $$0, int $$1, cnf.h $$2, vq $$3, Supplier<coz> $$4, cnf.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static cnf.a a(cnf.f $$0, int $$1) {
      return new cnf.a($$0, $$1);
   }

   public vq a() {
      return this.a;
   }

   public coz b() {
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

   public cnf.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != cnf.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public cnf.h k() {
      return this.h;
   }

   public void a(cnf.d $$0) {
      cnf.c $$1 = new cnf.c(this, $$0.a);
      aix<cnf> $$2 = kf.ap.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<coz> l() {
      return this.j;
   }

   public Collection<coz> m() {
      return this.k;
   }

   public boolean a(coz $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<coz>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final cnf.b a = ($$0, $$1) -> {
      };
      private final cnf.f b;
      private final int c;
      private vq d = vq.i();
      private Supplier<coz> e = () -> coz.h;
      private cnf.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cnf.h j = cnf.h.a;
      private String k = "items.png";

      public a(cnf.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cnf.a a(vq $$0) {
         this.d = $$0;
         return this;
      }

      public cnf.a a(Supplier<coz> $$0) {
         this.e = $$0;
         return this;
      }

      public cnf.a a(cnf.b $$0) {
         this.f = $$0;
         return this;
      }

      public cnf.a a() {
         this.i = true;
         return this;
      }

      public cnf.a b() {
         this.h = false;
         return this;
      }

      public cnf.a c() {
         this.g = false;
         return this;
      }

      protected cnf.a a(cnf.h $$0) {
         this.j = $$0;
         return this;
      }

      public cnf.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public cnf d() {
         if ((this.j == cnf.h.c || this.j == cnf.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cnf $$0 = new cnf(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cnf.d var1, cnf.e var2);
   }

   static class c implements cnf.e {
      public final Collection<coz> a = cpa.a();
      public final Set<coz> b = cpa.a();
      private final cnf c;
      private final cjs d;

      public c(cnf $$0, cjs $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(coz $$0, cnf.g $$1) {
         if ($$0.M() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cnf.g.c;
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

   public static record d(cjs a, boolean b, il.b c) {

      public boolean a(cjs $$0, boolean $$1, il.b $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(coz var1, cnf.g var2);

      default void a(coz $$0) {
         this.a($$0, cnf.g.a);
      }

      default void a(cvm $$0, cnf.g $$1) {
         this.a(new coz($$0), $$1);
      }

      default void a(cvm $$0) {
         this.a(new coz($$0), cnf.g.a);
      }

      default void a(Collection<coz> $$0, cnf.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<coz> $$0) {
         this.a($$0, cnf.g.a);
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
