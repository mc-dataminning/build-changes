import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class chc {
   private final te a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final chc.f f;
   private final int g;
   private final chc.h h;
   @Nullable
   private ciw i;
   private Collection<ciw> j = cix.a();
   private Set<ciw> k = cix.a();
   @Nullable
   private Consumer<List<ciw>> l;
   private final Supplier<ciw> m;
   private final chc.b n;

   chc(chc.f $$0, int $$1, chc.h $$2, te $$3, Supplier<ciw> $$4, chc.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static chc.a a(chc.f $$0, int $$1) {
      return new chc.a($$0, $$1);
   }

   public te a() {
      return this.a;
   }

   public ciw b() {
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

   public chc.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != chc.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public chc.h k() {
      return this.h;
   }

   public void a(chc.d $$0) {
      chc.c $$1 = new chc.c(this, $$0.a);
      aeo<chc> $$2 = jc.ao.c(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<ciw> l() {
      return this.j;
   }

   public Collection<ciw> m() {
      return this.k;
   }

   public boolean a(ciw $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<ciw>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final chc.b a = ($$0, $$1) -> {
      };
      private final chc.f b;
      private final int c;
      private te d = te.h();
      private Supplier<ciw> e = () -> ciw.b;
      private chc.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private chc.h j = chc.h.a;
      private String k = "items.png";

      public a(chc.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public chc.a a(te $$0) {
         this.d = $$0;
         return this;
      }

      public chc.a a(Supplier<ciw> $$0) {
         this.e = $$0;
         return this;
      }

      public chc.a a(chc.b $$0) {
         this.f = $$0;
         return this;
      }

      public chc.a a() {
         this.i = true;
         return this;
      }

      public chc.a b() {
         this.h = false;
         return this;
      }

      public chc.a c() {
         this.g = false;
         return this;
      }

      protected chc.a a(chc.h $$0) {
         this.j = $$0;
         return this;
      }

      public chc.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public chc d() {
         if ((this.j == chc.h.c || this.j == chc.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            chc $$0 = new chc(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(chc.d var1, chc.e var2);
   }

   static class c implements chc.e {
      public final Collection<ciw> a = cix.a();
      public final Set<ciw> b = cix.a();
      private final chc c;
      private final cdt d;

      public c(chc $$0, cdt $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(ciw $$0, chc.g $$1) {
         if ($$0.L() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != chc.g.c;
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

   public static record d(cdt a, boolean b, hh.b c) {

      public boolean a(cdt $$0, boolean $$1, hh.b $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(ciw var1, chc.g var2);

      default void a(ciw $$0) {
         this.a($$0, chc.g.a);
      }

      default void a(cpj $$0, chc.g $$1) {
         this.a(new ciw($$0), $$1);
      }

      default void a(cpj $$0) {
         this.a(new ciw($$0), chc.g.a);
      }

      default void a(Collection<ciw> $$0, chc.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<ciw> $$0) {
         this.a($$0, chc.g.a);
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
