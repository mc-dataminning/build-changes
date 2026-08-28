import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class csy {
   private final xo a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final csy.f f;
   private final int g;
   private final csy.h h;
   @Nullable
   private cun i;
   private Collection<cun> j = cuo.a();
   private Set<cun> k = cuo.a();
   @Nullable
   private Consumer<List<cun>> l;
   private final Supplier<cun> m;
   private final csy.b n;

   csy(csy.f $$0, int $$1, csy.h $$2, xo $$3, Supplier<cun> $$4, csy.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static csy.a a(csy.f $$0, int $$1) {
      return new csy.a($$0, $$1);
   }

   public xo a() {
      return this.a;
   }

   public cun b() {
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

   public csy.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != csy.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public csy.h k() {
      return this.h;
   }

   public void a(csy.d $$0) {
      csy.c $$1 = new csy.c(this, $$0.a);
      ald<csy> $$2 = lp.ao.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<cun> l() {
      return this.j;
   }

   public Collection<cun> m() {
      return this.k;
   }

   public boolean a(cun $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<cun>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final csy.b a = ($$0, $$1) -> {
      };
      private final csy.f b;
      private final int c;
      private xo d = xo.i();
      private Supplier<cun> e = () -> cun.l;
      private csy.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private csy.h j = csy.h.a;
      private String k = "items.png";

      public a(csy.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public csy.a a(xo $$0) {
         this.d = $$0;
         return this;
      }

      public csy.a a(Supplier<cun> $$0) {
         this.e = $$0;
         return this;
      }

      public csy.a a(csy.b $$0) {
         this.f = $$0;
         return this;
      }

      public csy.a a() {
         this.i = true;
         return this;
      }

      public csy.a b() {
         this.h = false;
         return this;
      }

      public csy.a c() {
         this.g = false;
         return this;
      }

      protected csy.a a(csy.h $$0) {
         this.j = $$0;
         return this;
      }

      public csy.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public csy d() {
         if ((this.j == csy.h.c || this.j == csy.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            csy $$0 = new csy(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(csy.d var1, csy.e var2);
   }

   static class c implements csy.e {
      public final Collection<cun> a = cuo.a();
      public final Set<cun> b = cuo.a();
      private final csy c;
      private final cpj d;

      public c(csy $$0, cpj $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cun $$0, csy.g $$1) {
         if ($$0.I() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != csy.g.c;
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

   public static record d(cpj a, boolean b, jk.a c) {

      public boolean a(cpj $$0, boolean $$1, jk.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cun var1, csy.g var2);

      default void a(cun $$0) {
         this.a($$0, csy.g.a);
      }

      default void a(dbv $$0, csy.g $$1) {
         this.a(new cun($$0), $$1);
      }

      default void a(dbv $$0) {
         this.a(new cun($$0), csy.g.a);
      }

      default void a(Collection<cun> $$0, csy.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cun> $$0) {
         this.a($$0, csy.g.a);
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
