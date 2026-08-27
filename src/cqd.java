import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cqd {
   private final wi a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final cqd.f f;
   private final int g;
   private final cqd.h h;
   @Nullable
   private crs i;
   private Collection<crs> j = crt.a();
   private Set<crs> k = crt.a();
   @Nullable
   private Consumer<List<crs>> l;
   private final Supplier<crs> m;
   private final cqd.b n;

   cqd(cqd.f $$0, int $$1, cqd.h $$2, wi $$3, Supplier<crs> $$4, cqd.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static cqd.a a(cqd.f $$0, int $$1) {
      return new cqd.a($$0, $$1);
   }

   public wi a() {
      return this.a;
   }

   public crs b() {
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

   public cqd.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != cqd.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public cqd.h k() {
      return this.h;
   }

   public void a(cqd.d $$0) {
      cqd.c $$1 = new cqd.c(this, $$0.a);
      aju<cqd> $$2 = kt.ao.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<crs> l() {
      return this.j;
   }

   public Collection<crs> m() {
      return this.k;
   }

   public boolean a(crs $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<crs>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final cqd.b a = ($$0, $$1) -> {
      };
      private final cqd.f b;
      private final int c;
      private wi d = wi.i();
      private Supplier<crs> e = () -> crs.i;
      private cqd.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cqd.h j = cqd.h.a;
      private String k = "items.png";

      public a(cqd.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cqd.a a(wi $$0) {
         this.d = $$0;
         return this;
      }

      public cqd.a a(Supplier<crs> $$0) {
         this.e = $$0;
         return this;
      }

      public cqd.a a(cqd.b $$0) {
         this.f = $$0;
         return this;
      }

      public cqd.a a() {
         this.i = true;
         return this;
      }

      public cqd.a b() {
         this.h = false;
         return this;
      }

      public cqd.a c() {
         this.g = false;
         return this;
      }

      protected cqd.a a(cqd.h $$0) {
         this.j = $$0;
         return this;
      }

      public cqd.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public cqd d() {
         if ((this.j == cqd.h.c || this.j == cqd.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cqd $$0 = new cqd(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cqd.d var1, cqd.e var2);
   }

   static class c implements cqd.e {
      public final Collection<crs> a = crt.a();
      public final Set<crs> b = crt.a();
      private final cqd c;
      private final cmn d;

      public c(cqd $$0, cmn $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(crs $$0, cqd.g $$1) {
         if ($$0.G() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cqd.g.c;
            if ($$2) {
               throw new IllegalStateException(
                  "Accidentally adding the same item stack twice " + $$0.E().getString() + " to a Creative Mode Tab: " + this.c.a().getString()
               );
            } else {
               if ($$0.f().a(this.d)) {
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

   public static record d(cmn a, boolean b, ip.a c) {

      public boolean a(cmn $$0, boolean $$1, ip.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(crs var1, cqd.g var2);

      default void a(crs $$0) {
         this.a($$0, cqd.g.a);
      }

      default void a(czf $$0, cqd.g $$1) {
         this.a(new crs($$0), $$1);
      }

      default void a(czf $$0) {
         this.a(new crs($$0), cqd.g.a);
      }

      default void a(Collection<crs> $$0, cqd.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<crs> $$0) {
         this.a($$0, cqd.g.a);
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
