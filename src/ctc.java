import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ctc {
   private final xp a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final ctc.f f;
   private final int g;
   private final ctc.h h;
   @Nullable
   private cur i;
   private Collection<cur> j = cus.a();
   private Set<cur> k = cus.a();
   @Nullable
   private Consumer<List<cur>> l;
   private final Supplier<cur> m;
   private final ctc.b n;

   ctc(ctc.f $$0, int $$1, ctc.h $$2, xp $$3, Supplier<cur> $$4, ctc.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static ctc.a a(ctc.f $$0, int $$1) {
      return new ctc.a($$0, $$1);
   }

   public xp a() {
      return this.a;
   }

   public cur b() {
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

   public ctc.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != ctc.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public ctc.h k() {
      return this.h;
   }

   public void a(ctc.d $$0) {
      ctc.c $$1 = new ctc.c(this, $$0.a);
      ale<ctc> $$2 = lp.ao.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<cur> l() {
      return this.j;
   }

   public Collection<cur> m() {
      return this.k;
   }

   public boolean a(cur $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<cur>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final ctc.b a = ($$0, $$1) -> {
      };
      private final ctc.f b;
      private final int c;
      private xp d = xp.i();
      private Supplier<cur> e = () -> cur.l;
      private ctc.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private ctc.h j = ctc.h.a;
      private String k = "items.png";

      public a(ctc.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public ctc.a a(xp $$0) {
         this.d = $$0;
         return this;
      }

      public ctc.a a(Supplier<cur> $$0) {
         this.e = $$0;
         return this;
      }

      public ctc.a a(ctc.b $$0) {
         this.f = $$0;
         return this;
      }

      public ctc.a a() {
         this.i = true;
         return this;
      }

      public ctc.a b() {
         this.h = false;
         return this;
      }

      public ctc.a c() {
         this.g = false;
         return this;
      }

      protected ctc.a a(ctc.h $$0) {
         this.j = $$0;
         return this;
      }

      public ctc.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public ctc d() {
         if ((this.j == ctc.h.c || this.j == ctc.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            ctc $$0 = new ctc(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(ctc.d var1, ctc.e var2);
   }

   static class c implements ctc.e {
      public final Collection<cur> a = cus.a();
      public final Set<cur> b = cus.a();
      private final ctc c;
      private final cpn d;

      public c(ctc $$0, cpn $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cur $$0, ctc.g $$1) {
         if ($$0.I() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != ctc.g.c;
            if ($$2) {
               throw new IllegalStateException(
                  "Accidentally adding the same item stack twice " + $$0.G().getString() + " to a Creative Mode Tab: " + this.c.a().getString()
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

   public static record d(cpn a, boolean b, jk.a c) {

      public boolean a(cpn $$0, boolean $$1, jk.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cur var1, ctc.g var2);

      default void a(cur $$0) {
         this.a($$0, ctc.g.a);
      }

      default void a(dbz $$0, ctc.g $$1) {
         this.a(new cur($$0), $$1);
      }

      default void a(dbz $$0) {
         this.a(new cur($$0), ctc.g.a);
      }

      default void a(Collection<cur> $$0, ctc.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cur> $$0) {
         this.a($$0, ctc.g.a);
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
