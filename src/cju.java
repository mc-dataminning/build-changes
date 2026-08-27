import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cju {
   private final uv a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final cju.f f;
   private final int g;
   private final cju.h h;
   @Nullable
   private clo i;
   private Collection<clo> j = clp.a();
   private Set<clo> k = clp.a();
   @Nullable
   private Consumer<List<clo>> l;
   private final Supplier<clo> m;
   private final cju.b n;

   cju(cju.f $$0, int $$1, cju.h $$2, uv $$3, Supplier<clo> $$4, cju.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static cju.a a(cju.f $$0, int $$1) {
      return new cju.a($$0, $$1);
   }

   public uv a() {
      return this.a;
   }

   public clo b() {
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

   public cju.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != cju.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public cju.h k() {
      return this.h;
   }

   public void a(cju.d $$0) {
      cju.c $$1 = new cju.c(this, $$0.a);
      agl<cju> $$2 = kc.aq.c(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<clo> l() {
      return this.j;
   }

   public Collection<clo> m() {
      return this.k;
   }

   public boolean a(clo $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<clo>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final cju.b a = ($$0, $$1) -> {
      };
      private final cju.f b;
      private final int c;
      private uv d = uv.i();
      private Supplier<clo> e = () -> clo.b;
      private cju.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cju.h j = cju.h.a;
      private String k = "items.png";

      public a(cju.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cju.a a(uv $$0) {
         this.d = $$0;
         return this;
      }

      public cju.a a(Supplier<clo> $$0) {
         this.e = $$0;
         return this;
      }

      public cju.a a(cju.b $$0) {
         this.f = $$0;
         return this;
      }

      public cju.a a() {
         this.i = true;
         return this;
      }

      public cju.a b() {
         this.h = false;
         return this;
      }

      public cju.a c() {
         this.g = false;
         return this;
      }

      protected cju.a a(cju.h $$0) {
         this.j = $$0;
         return this;
      }

      public cju.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public cju d() {
         if ((this.j == cju.h.c || this.j == cju.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cju $$0 = new cju(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cju.d var1, cju.e var2);
   }

   static class c implements cju.e {
      public final Collection<clo> a = clp.a();
      public final Set<clo> b = clp.a();
      private final cju c;
      private final cgi d;

      public c(cju $$0, cgi $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(clo $$0, cju.g $$1) {
         if ($$0.L() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cju.g.c;
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

   public static record d(cgi a, boolean b, ii.b c) {

      public boolean a(cgi $$0, boolean $$1, ii.b $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(clo var1, cju.g var2);

      default void a(clo $$0) {
         this.a($$0, cju.g.a);
      }

      default void a(cse $$0, cju.g $$1) {
         this.a(new clo($$0), $$1);
      }

      default void a(cse $$0) {
         this.a(new clo($$0), cju.g.a);
      }

      default void a(Collection<clo> $$0, cju.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<clo> $$0) {
         this.a($$0, cju.g.a);
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
