import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class che {
   private final tf a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final che.f f;
   private final int g;
   private final che.h h;
   @Nullable
   private ciy i;
   private Collection<ciy> j = ciz.a();
   private Set<ciy> k = ciz.a();
   @Nullable
   private Consumer<List<ciy>> l;
   private final Supplier<ciy> m;
   private final che.b n;

   che(che.f $$0, int $$1, che.h $$2, tf $$3, Supplier<ciy> $$4, che.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static che.a a(che.f $$0, int $$1) {
      return new che.a($$0, $$1);
   }

   public tf a() {
      return this.a;
   }

   public ciy b() {
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

   public che.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != che.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public che.h k() {
      return this.h;
   }

   public void a(che.d $$0) {
      che.c $$1 = new che.c(this, $$0.a);
      aeq<che> $$2 = jb.ao.c(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<ciy> l() {
      return this.j;
   }

   public Collection<ciy> m() {
      return this.k;
   }

   public boolean a(ciy $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<ciy>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final che.b a = ($$0, $$1) -> {
      };
      private final che.f b;
      private final int c;
      private tf d = tf.h();
      private Supplier<ciy> e = () -> ciy.b;
      private che.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private che.h j = che.h.a;
      private String k = "items.png";

      public a(che.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public che.a a(tf $$0) {
         this.d = $$0;
         return this;
      }

      public che.a a(Supplier<ciy> $$0) {
         this.e = $$0;
         return this;
      }

      public che.a a(che.b $$0) {
         this.f = $$0;
         return this;
      }

      public che.a a() {
         this.i = true;
         return this;
      }

      public che.a b() {
         this.h = false;
         return this;
      }

      public che.a c() {
         this.g = false;
         return this;
      }

      protected che.a a(che.h $$0) {
         this.j = $$0;
         return this;
      }

      public che.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public che d() {
         if ((this.j == che.h.c || this.j == che.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            che $$0 = new che(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(che.d var1, che.e var2);
   }

   static class c implements che.e {
      public final Collection<ciy> a = ciz.a();
      public final Set<ciy> b = ciz.a();
      private final che c;
      private final cdv d;

      public c(che $$0, cdv $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(ciy $$0, che.g $$1) {
         if ($$0.L() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != che.g.c;
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

   public static record d(cdv a, boolean b, hg.b c) {

      public boolean a(cdv $$0, boolean $$1, hg.b $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(ciy var1, che.g var2);

      default void a(ciy $$0) {
         this.a($$0, che.g.a);
      }

      default void a(cpl $$0, che.g $$1) {
         this.a(new ciy($$0), $$1);
      }

      default void a(cpl $$0) {
         this.a(new ciy($$0), che.g.a);
      }

      default void a(Collection<ciy> $$0, che.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<ciy> $$0) {
         this.a($$0, che.g.a);
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
