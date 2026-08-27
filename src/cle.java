import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cle {
   private final vf a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final cle.f f;
   private final int g;
   private final cle.h h;
   @Nullable
   private cmy i;
   private Collection<cmy> j = cmz.a();
   private Set<cmy> k = cmz.a();
   @Nullable
   private Consumer<List<cmy>> l;
   private final Supplier<cmy> m;
   private final cle.b n;

   cle(cle.f $$0, int $$1, cle.h $$2, vf $$3, Supplier<cmy> $$4, cle.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static cle.a a(cle.f $$0, int $$1) {
      return new cle.a($$0, $$1);
   }

   public vf a() {
      return this.a;
   }

   public cmy b() {
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

   public cle.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != cle.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public cle.h k() {
      return this.h;
   }

   public void a(cle.d $$0) {
      cle.c $$1 = new cle.c(this, $$0.a);
      ahf<cle> $$2 = kd.ap.c(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<cmy> l() {
      return this.j;
   }

   public Collection<cmy> m() {
      return this.k;
   }

   public boolean a(cmy $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<cmy>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final cle.b a = ($$0, $$1) -> {
      };
      private final cle.f b;
      private final int c;
      private vf d = vf.i();
      private Supplier<cmy> e = () -> cmy.f;
      private cle.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cle.h j = cle.h.a;
      private String k = "items.png";

      public a(cle.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cle.a a(vf $$0) {
         this.d = $$0;
         return this;
      }

      public cle.a a(Supplier<cmy> $$0) {
         this.e = $$0;
         return this;
      }

      public cle.a a(cle.b $$0) {
         this.f = $$0;
         return this;
      }

      public cle.a a() {
         this.i = true;
         return this;
      }

      public cle.a b() {
         this.h = false;
         return this;
      }

      public cle.a c() {
         this.g = false;
         return this;
      }

      protected cle.a a(cle.h $$0) {
         this.j = $$0;
         return this;
      }

      public cle.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public cle d() {
         if ((this.j == cle.h.c || this.j == cle.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cle $$0 = new cle(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cle.d var1, cle.e var2);
   }

   static class c implements cle.e {
      public final Collection<cmy> a = cmz.a();
      public final Set<cmy> b = cmz.a();
      private final cle c;
      private final chs d;

      public c(cle $$0, chs $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cmy $$0, cle.g $$1) {
         if ($$0.L() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cle.g.c;
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

   public static record d(chs a, boolean b, ij.b c) {

      public boolean a(chs $$0, boolean $$1, ij.b $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cmy var1, cle.g var2);

      default void a(cmy $$0) {
         this.a($$0, cle.g.a);
      }

      default void a(cto $$0, cle.g $$1) {
         this.a(new cmy($$0), $$1);
      }

      default void a(cto $$0) {
         this.a(new cmy($$0), cle.g.a);
      }

      default void a(Collection<cmy> $$0, cle.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cmy> $$0) {
         this.a($$0, cle.g.a);
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
