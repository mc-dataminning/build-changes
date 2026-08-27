import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cln {
   private final vg a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final cln.f f;
   private final int g;
   private final cln.h h;
   @Nullable
   private cng i;
   private Collection<cng> j = cnh.a();
   private Set<cng> k = cnh.a();
   @Nullable
   private Consumer<List<cng>> l;
   private final Supplier<cng> m;
   private final cln.b n;

   cln(cln.f $$0, int $$1, cln.h $$2, vg $$3, Supplier<cng> $$4, cln.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static cln.a a(cln.f $$0, int $$1) {
      return new cln.a($$0, $$1);
   }

   public vg a() {
      return this.a;
   }

   public cng b() {
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

   public cln.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != cln.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public cln.h k() {
      return this.h;
   }

   public void a(cln.d $$0) {
      cln.c $$1 = new cln.c(this, $$0.a);
      ahg<cln> $$2 = kd.ap.c(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<cng> l() {
      return this.j;
   }

   public Collection<cng> m() {
      return this.k;
   }

   public boolean a(cng $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<cng>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final cln.b a = ($$0, $$1) -> {
      };
      private final cln.f b;
      private final int c;
      private vg d = vg.i();
      private Supplier<cng> e = () -> cng.f;
      private cln.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cln.h j = cln.h.a;
      private String k = "items.png";

      public a(cln.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cln.a a(vg $$0) {
         this.d = $$0;
         return this;
      }

      public cln.a a(Supplier<cng> $$0) {
         this.e = $$0;
         return this;
      }

      public cln.a a(cln.b $$0) {
         this.f = $$0;
         return this;
      }

      public cln.a a() {
         this.i = true;
         return this;
      }

      public cln.a b() {
         this.h = false;
         return this;
      }

      public cln.a c() {
         this.g = false;
         return this;
      }

      protected cln.a a(cln.h $$0) {
         this.j = $$0;
         return this;
      }

      public cln.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public cln d() {
         if ((this.j == cln.h.c || this.j == cln.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cln $$0 = new cln(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cln.d var1, cln.e var2);
   }

   static class c implements cln.e {
      public final Collection<cng> a = cnh.a();
      public final Set<cng> b = cnh.a();
      private final cln c;
      private final cia d;

      public c(cln $$0, cia $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cng $$0, cln.g $$1) {
         if ($$0.L() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cln.g.c;
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

   public static record d(cia a, boolean b, ij.b c) {

      public boolean a(cia $$0, boolean $$1, ij.b $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cng var1, cln.g var2);

      default void a(cng $$0) {
         this.a($$0, cln.g.a);
      }

      default void a(ctw $$0, cln.g $$1) {
         this.a(new cng($$0), $$1);
      }

      default void a(ctw $$0) {
         this.a(new cng($$0), cln.g.a);
      }

      default void a(Collection<cng> $$0, cln.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cng> $$0) {
         this.a($$0, cln.g.a);
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
