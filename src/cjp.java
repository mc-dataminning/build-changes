import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cjp {
   private final ur a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final cjp.f f;
   private final int g;
   private final cjp.h h;
   @Nullable
   private clj i;
   private Collection<clj> j = clk.a();
   private Set<clj> k = clk.a();
   @Nullable
   private Consumer<List<clj>> l;
   private final Supplier<clj> m;
   private final cjp.b n;

   cjp(cjp.f $$0, int $$1, cjp.h $$2, ur $$3, Supplier<clj> $$4, cjp.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static cjp.a a(cjp.f $$0, int $$1) {
      return new cjp.a($$0, $$1);
   }

   public ur a() {
      return this.a;
   }

   public clj b() {
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

   public cjp.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != cjp.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public cjp.h k() {
      return this.h;
   }

   public void a(cjp.d $$0) {
      cjp.c $$1 = new cjp.c(this, $$0.a);
      agh<cjp> $$2 = jy.aq.c(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<clj> l() {
      return this.j;
   }

   public Collection<clj> m() {
      return this.k;
   }

   public boolean a(clj $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<clj>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final cjp.b a = ($$0, $$1) -> {
      };
      private final cjp.f b;
      private final int c;
      private ur d = ur.i();
      private Supplier<clj> e = () -> clj.b;
      private cjp.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cjp.h j = cjp.h.a;
      private String k = "items.png";

      public a(cjp.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cjp.a a(ur $$0) {
         this.d = $$0;
         return this;
      }

      public cjp.a a(Supplier<clj> $$0) {
         this.e = $$0;
         return this;
      }

      public cjp.a a(cjp.b $$0) {
         this.f = $$0;
         return this;
      }

      public cjp.a a() {
         this.i = true;
         return this;
      }

      public cjp.a b() {
         this.h = false;
         return this;
      }

      public cjp.a c() {
         this.g = false;
         return this;
      }

      protected cjp.a a(cjp.h $$0) {
         this.j = $$0;
         return this;
      }

      public cjp.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public cjp d() {
         if ((this.j == cjp.h.c || this.j == cjp.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cjp $$0 = new cjp(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cjp.d var1, cjp.e var2);
   }

   static class c implements cjp.e {
      public final Collection<clj> a = clk.a();
      public final Set<clj> b = clk.a();
      private final cjp c;
      private final cgd d;

      public c(cjp $$0, cgd $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(clj $$0, cjp.g $$1) {
         if ($$0.L() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cjp.g.c;
            if ($$2) {
               throw new IllegalStateException(
                  "Accidentally adding the same item stack twice " + $$0.J().getString() + " to a Creative Mode Tab: " + this.c.a().getString()
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

   public static record d(cgd a, boolean b, id.b c) {

      public boolean a(cgd $$0, boolean $$1, id.b $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(clj var1, cjp.g var2);

      default void a(clj $$0) {
         this.a($$0, cjp.g.a);
      }

      default void a(crz $$0, cjp.g $$1) {
         this.a(new clj($$0), $$1);
      }

      default void a(crz $$0) {
         this.a(new clj($$0), cjp.g.a);
      }

      default void a(Collection<clj> $$0, cjp.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<clj> $$0) {
         this.a($$0, cjp.g.a);
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
