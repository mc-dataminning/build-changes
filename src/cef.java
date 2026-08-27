import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cef {
   private final sw a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final cef.f f;
   private final int g;
   private final cef.h h;
   @Nullable
   private cfz i;
   private Collection<cfz> j = cga.a();
   private Set<cfz> k = cga.a();
   @Nullable
   private Consumer<List<cfz>> l;
   private final Supplier<cfz> m;
   private final cef.b n;

   cef(cef.f $$0, int $$1, cef.h $$2, sw $$3, Supplier<cfz> $$4, cef.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static cef.a a(cef.f $$0, int $$1) {
      return new cef.a($$0, $$1);
   }

   public sw a() {
      return this.a;
   }

   public cfz b() {
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

   public cef.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != cef.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public cef.h k() {
      return this.h;
   }

   public void a(cef.d $$0) {
      cef.c $$1 = new cef.c(this, $$0.a);
      acp<cef> $$2 = jb.ao.c(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<cfz> l() {
      return this.j;
   }

   public Collection<cfz> m() {
      return this.k;
   }

   public boolean a(cfz $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<cfz>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final cef.b a = ($$0, $$1) -> {
      };
      private final cef.f b;
      private final int c;
      private sw d = sw.h();
      private Supplier<cfz> e = () -> cfz.b;
      private cef.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cef.h j = cef.h.a;
      private String k = "items.png";

      public a(cef.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cef.a a(sw $$0) {
         this.d = $$0;
         return this;
      }

      public cef.a a(Supplier<cfz> $$0) {
         this.e = $$0;
         return this;
      }

      public cef.a a(cef.b $$0) {
         this.f = $$0;
         return this;
      }

      public cef.a a() {
         this.i = true;
         return this;
      }

      public cef.a b() {
         this.h = false;
         return this;
      }

      public cef.a c() {
         this.g = false;
         return this;
      }

      protected cef.a a(cef.h $$0) {
         this.j = $$0;
         return this;
      }

      public cef.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public cef d() {
         if ((this.j == cef.h.c || this.j == cef.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cef $$0 = new cef(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cef.d var1, cef.e var2);
   }

   static class c implements cef.e {
      public final Collection<cfz> a = cga.a();
      public final Set<cfz> b = cga.a();
      private final cef c;
      private final caw d;

      public c(cef $$0, caw $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cfz $$0, cef.g $$1) {
         if ($$0.L() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cef.g.c;
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

   public static record d(caw a, boolean b, hg.b c) {

      public boolean a(caw $$0, boolean $$1, hg.b $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cfz var1, cef.g var2);

      default void a(cfz $$0) {
         this.a($$0, cef.g.a);
      }

      default void a(cml $$0, cef.g $$1) {
         this.a(new cfz($$0), $$1);
      }

      default void a(cml $$0) {
         this.a(new cfz($$0), cef.g.a);
      }

      default void a(Collection<cfz> $$0, cef.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cfz> $$0) {
         this.a($$0, cef.g.a);
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
