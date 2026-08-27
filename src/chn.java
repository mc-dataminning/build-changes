import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class chn {
   private final tn a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final chn.f f;
   private final int g;
   private final chn.h h;
   @Nullable
   private cjh i;
   private Collection<cjh> j = cji.a();
   private Set<cjh> k = cji.a();
   @Nullable
   private Consumer<List<cjh>> l;
   private final Supplier<cjh> m;
   private final chn.b n;

   chn(chn.f $$0, int $$1, chn.h $$2, tn $$3, Supplier<cjh> $$4, chn.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static chn.a a(chn.f $$0, int $$1) {
      return new chn.a($$0, $$1);
   }

   public tn a() {
      return this.a;
   }

   public cjh b() {
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

   public chn.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != chn.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public chn.h k() {
      return this.h;
   }

   public void a(chn.d $$0) {
      chn.c $$1 = new chn.c(this, $$0.a);
      aex<chn> $$2 = jd.ao.c(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<cjh> l() {
      return this.j;
   }

   public Collection<cjh> m() {
      return this.k;
   }

   public boolean a(cjh $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<cjh>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final chn.b a = ($$0, $$1) -> {
      };
      private final chn.f b;
      private final int c;
      private tn d = tn.h();
      private Supplier<cjh> e = () -> cjh.b;
      private chn.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private chn.h j = chn.h.a;
      private String k = "items.png";

      public a(chn.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public chn.a a(tn $$0) {
         this.d = $$0;
         return this;
      }

      public chn.a a(Supplier<cjh> $$0) {
         this.e = $$0;
         return this;
      }

      public chn.a a(chn.b $$0) {
         this.f = $$0;
         return this;
      }

      public chn.a a() {
         this.i = true;
         return this;
      }

      public chn.a b() {
         this.h = false;
         return this;
      }

      public chn.a c() {
         this.g = false;
         return this;
      }

      protected chn.a a(chn.h $$0) {
         this.j = $$0;
         return this;
      }

      public chn.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public chn d() {
         if ((this.j == chn.h.c || this.j == chn.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            chn $$0 = new chn(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(chn.d var1, chn.e var2);
   }

   static class c implements chn.e {
      public final Collection<cjh> a = cji.a();
      public final Set<cjh> b = cji.a();
      private final chn c;
      private final cee d;

      public c(chn $$0, cee $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cjh $$0, chn.g $$1) {
         if ($$0.L() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != chn.g.c;
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

   public static record d(cee a, boolean b, hi.b c) {

      public boolean a(cee $$0, boolean $$1, hi.b $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cjh var1, chn.g var2);

      default void a(cjh $$0) {
         this.a($$0, chn.g.a);
      }

      default void a(cpw $$0, chn.g $$1) {
         this.a(new cjh($$0), $$1);
      }

      default void a(cpw $$0) {
         this.a(new cjh($$0), chn.g.a);
      }

      default void a(Collection<cjh> $$0, chn.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cjh> $$0) {
         this.a($$0, chn.g.a);
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
