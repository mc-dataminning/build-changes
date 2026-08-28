import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class csz {
   private final xo a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final csz.f f;
   private final int g;
   private final csz.h h;
   @Nullable
   private cuo i;
   private Collection<cuo> j = cup.a();
   private Set<cuo> k = cup.a();
   @Nullable
   private Consumer<List<cuo>> l;
   private final Supplier<cuo> m;
   private final csz.b n;

   csz(csz.f $$0, int $$1, csz.h $$2, xo $$3, Supplier<cuo> $$4, csz.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static csz.a a(csz.f $$0, int $$1) {
      return new csz.a($$0, $$1);
   }

   public xo a() {
      return this.a;
   }

   public cuo b() {
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

   public csz.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != csz.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public csz.h k() {
      return this.h;
   }

   public void a(csz.d $$0) {
      csz.c $$1 = new csz.c(this, $$0.a);
      ald<csz> $$2 = lp.ao.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<cuo> l() {
      return this.j;
   }

   public Collection<cuo> m() {
      return this.k;
   }

   public boolean a(cuo $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<cuo>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final csz.b a = ($$0, $$1) -> {
      };
      private final csz.f b;
      private final int c;
      private xo d = xo.i();
      private Supplier<cuo> e = () -> cuo.l;
      private csz.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private csz.h j = csz.h.a;
      private String k = "items.png";

      public a(csz.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public csz.a a(xo $$0) {
         this.d = $$0;
         return this;
      }

      public csz.a a(Supplier<cuo> $$0) {
         this.e = $$0;
         return this;
      }

      public csz.a a(csz.b $$0) {
         this.f = $$0;
         return this;
      }

      public csz.a a() {
         this.i = true;
         return this;
      }

      public csz.a b() {
         this.h = false;
         return this;
      }

      public csz.a c() {
         this.g = false;
         return this;
      }

      protected csz.a a(csz.h $$0) {
         this.j = $$0;
         return this;
      }

      public csz.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public csz d() {
         if ((this.j == csz.h.c || this.j == csz.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            csz $$0 = new csz(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(csz.d var1, csz.e var2);
   }

   static class c implements csz.e {
      public final Collection<cuo> a = cup.a();
      public final Set<cuo> b = cup.a();
      private final csz c;
      private final cpk d;

      public c(csz $$0, cpk $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cuo $$0, csz.g $$1) {
         if ($$0.I() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != csz.g.c;
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

   public static record d(cpk a, boolean b, jk.a c) {

      public boolean a(cpk $$0, boolean $$1, jk.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cuo var1, csz.g var2);

      default void a(cuo $$0) {
         this.a($$0, csz.g.a);
      }

      default void a(dbw $$0, csz.g $$1) {
         this.a(new cuo($$0), $$1);
      }

      default void a(dbw $$0) {
         this.a(new cuo($$0), csz.g.a);
      }

      default void a(Collection<cuo> $$0, csz.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cuo> $$0) {
         this.a($$0, csz.g.a);
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
