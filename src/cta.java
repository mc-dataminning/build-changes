import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cta {
   private final xp a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final cta.f f;
   private final int g;
   private final cta.h h;
   @Nullable
   private cup i;
   private Collection<cup> j = cuq.a();
   private Set<cup> k = cuq.a();
   @Nullable
   private Consumer<List<cup>> l;
   private final Supplier<cup> m;
   private final cta.b n;

   cta(cta.f $$0, int $$1, cta.h $$2, xp $$3, Supplier<cup> $$4, cta.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static cta.a a(cta.f $$0, int $$1) {
      return new cta.a($$0, $$1);
   }

   public xp a() {
      return this.a;
   }

   public cup b() {
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

   public cta.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != cta.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public cta.h k() {
      return this.h;
   }

   public void a(cta.d $$0) {
      cta.c $$1 = new cta.c(this, $$0.a);
      ale<cta> $$2 = lp.ao.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<cup> l() {
      return this.j;
   }

   public Collection<cup> m() {
      return this.k;
   }

   public boolean a(cup $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<cup>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final cta.b a = ($$0, $$1) -> {
      };
      private final cta.f b;
      private final int c;
      private xp d = xp.i();
      private Supplier<cup> e = () -> cup.l;
      private cta.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cta.h j = cta.h.a;
      private String k = "items.png";

      public a(cta.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cta.a a(xp $$0) {
         this.d = $$0;
         return this;
      }

      public cta.a a(Supplier<cup> $$0) {
         this.e = $$0;
         return this;
      }

      public cta.a a(cta.b $$0) {
         this.f = $$0;
         return this;
      }

      public cta.a a() {
         this.i = true;
         return this;
      }

      public cta.a b() {
         this.h = false;
         return this;
      }

      public cta.a c() {
         this.g = false;
         return this;
      }

      protected cta.a a(cta.h $$0) {
         this.j = $$0;
         return this;
      }

      public cta.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public cta d() {
         if ((this.j == cta.h.c || this.j == cta.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cta $$0 = new cta(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cta.d var1, cta.e var2);
   }

   static class c implements cta.e {
      public final Collection<cup> a = cuq.a();
      public final Set<cup> b = cuq.a();
      private final cta c;
      private final cpl d;

      public c(cta $$0, cpl $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cup $$0, cta.g $$1) {
         if ($$0.I() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cta.g.c;
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

   public static record d(cpl a, boolean b, jk.a c) {

      public boolean a(cpl $$0, boolean $$1, jk.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cup var1, cta.g var2);

      default void a(cup $$0) {
         this.a($$0, cta.g.a);
      }

      default void a(dbx $$0, cta.g $$1) {
         this.a(new cup($$0), $$1);
      }

      default void a(dbx $$0) {
         this.a(new cup($$0), cta.g.a);
      }

      default void a(Collection<cup> $$0, cta.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cup> $$0) {
         this.a($$0, cta.g.a);
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
