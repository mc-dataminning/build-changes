import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class chl {
   private final tl a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final chl.f f;
   private final int g;
   private final chl.h h;
   @Nullable
   private cjf i;
   private Collection<cjf> j = cjg.a();
   private Set<cjf> k = cjg.a();
   @Nullable
   private Consumer<List<cjf>> l;
   private final Supplier<cjf> m;
   private final chl.b n;

   chl(chl.f $$0, int $$1, chl.h $$2, tl $$3, Supplier<cjf> $$4, chl.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static chl.a a(chl.f $$0, int $$1) {
      return new chl.a($$0, $$1);
   }

   public tl a() {
      return this.a;
   }

   public cjf b() {
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

   public chl.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != chl.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public chl.h k() {
      return this.h;
   }

   public void a(chl.d $$0) {
      chl.c $$1 = new chl.c(this, $$0.a);
      aev<chl> $$2 = jb.ao.c(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<cjf> l() {
      return this.j;
   }

   public Collection<cjf> m() {
      return this.k;
   }

   public boolean a(cjf $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<cjf>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final chl.b a = ($$0, $$1) -> {
      };
      private final chl.f b;
      private final int c;
      private tl d = tl.h();
      private Supplier<cjf> e = () -> cjf.b;
      private chl.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private chl.h j = chl.h.a;
      private String k = "items.png";

      public a(chl.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public chl.a a(tl $$0) {
         this.d = $$0;
         return this;
      }

      public chl.a a(Supplier<cjf> $$0) {
         this.e = $$0;
         return this;
      }

      public chl.a a(chl.b $$0) {
         this.f = $$0;
         return this;
      }

      public chl.a a() {
         this.i = true;
         return this;
      }

      public chl.a b() {
         this.h = false;
         return this;
      }

      public chl.a c() {
         this.g = false;
         return this;
      }

      protected chl.a a(chl.h $$0) {
         this.j = $$0;
         return this;
      }

      public chl.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public chl d() {
         if ((this.j == chl.h.c || this.j == chl.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            chl $$0 = new chl(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(chl.d var1, chl.e var2);
   }

   static class c implements chl.e {
      public final Collection<cjf> a = cjg.a();
      public final Set<cjf> b = cjg.a();
      private final chl c;
      private final cec d;

      public c(chl $$0, cec $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cjf $$0, chl.g $$1) {
         if ($$0.L() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != chl.g.c;
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

   public static record d(cec a, boolean b, hg.b c) {

      public boolean a(cec $$0, boolean $$1, hg.b $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cjf var1, chl.g var2);

      default void a(cjf $$0) {
         this.a($$0, chl.g.a);
      }

      default void a(cpu $$0, chl.g $$1) {
         this.a(new cjf($$0), $$1);
      }

      default void a(cpu $$0) {
         this.a(new cjf($$0), chl.g.a);
      }

      default void a(Collection<cjf> $$0, chl.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cjf> $$0) {
         this.a($$0, chl.g.a);
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
