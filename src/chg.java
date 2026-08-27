import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class chg {
   private final ti a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final chg.f f;
   private final int g;
   private final chg.h h;
   @Nullable
   private cja i;
   private Collection<cja> j = cjb.a();
   private Set<cja> k = cjb.a();
   @Nullable
   private Consumer<List<cja>> l;
   private final Supplier<cja> m;
   private final chg.b n;

   chg(chg.f $$0, int $$1, chg.h $$2, ti $$3, Supplier<cja> $$4, chg.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static chg.a a(chg.f $$0, int $$1) {
      return new chg.a($$0, $$1);
   }

   public ti a() {
      return this.a;
   }

   public cja b() {
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

   public chg.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != chg.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public chg.h k() {
      return this.h;
   }

   public void a(chg.d $$0) {
      chg.c $$1 = new chg.c(this, $$0.a);
      aet<chg> $$2 = jd.ao.c(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<cja> l() {
      return this.j;
   }

   public Collection<cja> m() {
      return this.k;
   }

   public boolean a(cja $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<cja>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final chg.b a = ($$0, $$1) -> {
      };
      private final chg.f b;
      private final int c;
      private ti d = ti.h();
      private Supplier<cja> e = () -> cja.b;
      private chg.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private chg.h j = chg.h.a;
      private String k = "items.png";

      public a(chg.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public chg.a a(ti $$0) {
         this.d = $$0;
         return this;
      }

      public chg.a a(Supplier<cja> $$0) {
         this.e = $$0;
         return this;
      }

      public chg.a a(chg.b $$0) {
         this.f = $$0;
         return this;
      }

      public chg.a a() {
         this.i = true;
         return this;
      }

      public chg.a b() {
         this.h = false;
         return this;
      }

      public chg.a c() {
         this.g = false;
         return this;
      }

      protected chg.a a(chg.h $$0) {
         this.j = $$0;
         return this;
      }

      public chg.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public chg d() {
         if ((this.j == chg.h.c || this.j == chg.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            chg $$0 = new chg(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(chg.d var1, chg.e var2);
   }

   static class c implements chg.e {
      public final Collection<cja> a = cjb.a();
      public final Set<cja> b = cjb.a();
      private final chg c;
      private final cdx d;

      public c(chg $$0, cdx $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cja $$0, chg.g $$1) {
         if ($$0.L() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != chg.g.c;
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

   public static record d(cdx a, boolean b, hi.b c) {

      public boolean a(cdx $$0, boolean $$1, hi.b $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cja var1, chg.g var2);

      default void a(cja $$0) {
         this.a($$0, chg.g.a);
      }

      default void a(cpp $$0, chg.g $$1) {
         this.a(new cja($$0), $$1);
      }

      default void a(cpp $$0) {
         this.a(new cja($$0), chg.g.a);
      }

      default void a(Collection<cja> $$0, chg.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cja> $$0) {
         this.a($$0, chg.g.a);
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
