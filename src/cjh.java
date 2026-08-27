import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cjh {
   private final ur a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final cjh.f f;
   private final int g;
   private final cjh.h h;
   @Nullable
   private clb i;
   private Collection<clb> j = clc.a();
   private Set<clb> k = clc.a();
   @Nullable
   private Consumer<List<clb>> l;
   private final Supplier<clb> m;
   private final cjh.b n;

   cjh(cjh.f $$0, int $$1, cjh.h $$2, ur $$3, Supplier<clb> $$4, cjh.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static cjh.a a(cjh.f $$0, int $$1) {
      return new cjh.a($$0, $$1);
   }

   public ur a() {
      return this.a;
   }

   public clb b() {
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

   public cjh.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != cjh.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public cjh.h k() {
      return this.h;
   }

   public void a(cjh.d $$0) {
      cjh.c $$1 = new cjh.c(this, $$0.a);
      agf<cjh> $$2 = jy.aq.c(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<clb> l() {
      return this.j;
   }

   public Collection<clb> m() {
      return this.k;
   }

   public boolean a(clb $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<clb>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final cjh.b a = ($$0, $$1) -> {
      };
      private final cjh.f b;
      private final int c;
      private ur d = ur.i();
      private Supplier<clb> e = () -> clb.b;
      private cjh.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cjh.h j = cjh.h.a;
      private String k = "items.png";

      public a(cjh.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cjh.a a(ur $$0) {
         this.d = $$0;
         return this;
      }

      public cjh.a a(Supplier<clb> $$0) {
         this.e = $$0;
         return this;
      }

      public cjh.a a(cjh.b $$0) {
         this.f = $$0;
         return this;
      }

      public cjh.a a() {
         this.i = true;
         return this;
      }

      public cjh.a b() {
         this.h = false;
         return this;
      }

      public cjh.a c() {
         this.g = false;
         return this;
      }

      protected cjh.a a(cjh.h $$0) {
         this.j = $$0;
         return this;
      }

      public cjh.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public cjh d() {
         if ((this.j == cjh.h.c || this.j == cjh.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cjh $$0 = new cjh(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cjh.d var1, cjh.e var2);
   }

   static class c implements cjh.e {
      public final Collection<clb> a = clc.a();
      public final Set<clb> b = clc.a();
      private final cjh c;
      private final cfv d;

      public c(cjh $$0, cfv $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(clb $$0, cjh.g $$1) {
         if ($$0.L() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cjh.g.c;
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

   public static record d(cfv a, boolean b, id.b c) {

      public boolean a(cfv $$0, boolean $$1, id.b $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(clb var1, cjh.g var2);

      default void a(clb $$0) {
         this.a($$0, cjh.g.a);
      }

      default void a(crr $$0, cjh.g $$1) {
         this.a(new clb($$0), $$1);
      }

      default void a(crr $$0) {
         this.a(new clb($$0), cjh.g.a);
      }

      default void a(Collection<clb> $$0, cjh.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<clb> $$0) {
         this.a($$0, cjh.g.a);
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
