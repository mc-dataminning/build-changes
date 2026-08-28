import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class csv {
   private final xl a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final csv.f f;
   private final int g;
   private final csv.h h;
   @Nullable
   private cuk i;
   private Collection<cuk> j = cul.a();
   private Set<cuk> k = cul.a();
   @Nullable
   private Consumer<List<cuk>> l;
   private final Supplier<cuk> m;
   private final csv.b n;

   csv(csv.f $$0, int $$1, csv.h $$2, xl $$3, Supplier<cuk> $$4, csv.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static csv.a a(csv.f $$0, int $$1) {
      return new csv.a($$0, $$1);
   }

   public xl a() {
      return this.a;
   }

   public cuk b() {
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

   public csv.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != csv.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public csv.h k() {
      return this.h;
   }

   public void a(csv.d $$0) {
      csv.c $$1 = new csv.c(this, $$0.a);
      ala<csv> $$2 = lp.ao.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<cuk> l() {
      return this.j;
   }

   public Collection<cuk> m() {
      return this.k;
   }

   public boolean a(cuk $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<cuk>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final csv.b a = ($$0, $$1) -> {
      };
      private final csv.f b;
      private final int c;
      private xl d = xl.i();
      private Supplier<cuk> e = () -> cuk.l;
      private csv.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private csv.h j = csv.h.a;
      private String k = "items.png";

      public a(csv.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public csv.a a(xl $$0) {
         this.d = $$0;
         return this;
      }

      public csv.a a(Supplier<cuk> $$0) {
         this.e = $$0;
         return this;
      }

      public csv.a a(csv.b $$0) {
         this.f = $$0;
         return this;
      }

      public csv.a a() {
         this.i = true;
         return this;
      }

      public csv.a b() {
         this.h = false;
         return this;
      }

      public csv.a c() {
         this.g = false;
         return this;
      }

      protected csv.a a(csv.h $$0) {
         this.j = $$0;
         return this;
      }

      public csv.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public csv d() {
         if ((this.j == csv.h.c || this.j == csv.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            csv $$0 = new csv(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(csv.d var1, csv.e var2);
   }

   static class c implements csv.e {
      public final Collection<cuk> a = cul.a();
      public final Set<cuk> b = cul.a();
      private final csv c;
      private final cpg d;

      public c(csv $$0, cpg $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cuk $$0, csv.g $$1) {
         if ($$0.I() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != csv.g.c;
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

   public static record d(cpg a, boolean b, jk.a c) {

      public boolean a(cpg $$0, boolean $$1, jk.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cuk var1, csv.g var2);

      default void a(cuk $$0) {
         this.a($$0, csv.g.a);
      }

      default void a(dbs $$0, csv.g $$1) {
         this.a(new cuk($$0), $$1);
      }

      default void a(dbs $$0) {
         this.a(new cuk($$0), csv.g.a);
      }

      default void a(Collection<cuk> $$0, csv.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cuk> $$0) {
         this.a($$0, csv.g.a);
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
