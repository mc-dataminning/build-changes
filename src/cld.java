import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cld {
   private final vf a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final cld.f f;
   private final int g;
   private final cld.h h;
   @Nullable
   private cmx i;
   private Collection<cmx> j = cmy.a();
   private Set<cmx> k = cmy.a();
   @Nullable
   private Consumer<List<cmx>> l;
   private final Supplier<cmx> m;
   private final cld.b n;

   cld(cld.f $$0, int $$1, cld.h $$2, vf $$3, Supplier<cmx> $$4, cld.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static cld.a a(cld.f $$0, int $$1) {
      return new cld.a($$0, $$1);
   }

   public vf a() {
      return this.a;
   }

   public cmx b() {
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

   public cld.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != cld.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public cld.h k() {
      return this.h;
   }

   public void a(cld.d $$0) {
      cld.c $$1 = new cld.c(this, $$0.a);
      ahf<cld> $$2 = kd.ap.c(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<cmx> l() {
      return this.j;
   }

   public Collection<cmx> m() {
      return this.k;
   }

   public boolean a(cmx $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<cmx>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final cld.b a = ($$0, $$1) -> {
      };
      private final cld.f b;
      private final int c;
      private vf d = vf.i();
      private Supplier<cmx> e = () -> cmx.f;
      private cld.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cld.h j = cld.h.a;
      private String k = "items.png";

      public a(cld.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cld.a a(vf $$0) {
         this.d = $$0;
         return this;
      }

      public cld.a a(Supplier<cmx> $$0) {
         this.e = $$0;
         return this;
      }

      public cld.a a(cld.b $$0) {
         this.f = $$0;
         return this;
      }

      public cld.a a() {
         this.i = true;
         return this;
      }

      public cld.a b() {
         this.h = false;
         return this;
      }

      public cld.a c() {
         this.g = false;
         return this;
      }

      protected cld.a a(cld.h $$0) {
         this.j = $$0;
         return this;
      }

      public cld.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public cld d() {
         if ((this.j == cld.h.c || this.j == cld.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cld $$0 = new cld(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cld.d var1, cld.e var2);
   }

   static class c implements cld.e {
      public final Collection<cmx> a = cmy.a();
      public final Set<cmx> b = cmy.a();
      private final cld c;
      private final chr d;

      public c(cld $$0, chr $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cmx $$0, cld.g $$1) {
         if ($$0.L() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cld.g.c;
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

   public static record d(chr a, boolean b, ij.b c) {

      public boolean a(chr $$0, boolean $$1, ij.b $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cmx var1, cld.g var2);

      default void a(cmx $$0) {
         this.a($$0, cld.g.a);
      }

      default void a(ctn $$0, cld.g $$1) {
         this.a(new cmx($$0), $$1);
      }

      default void a(ctn $$0) {
         this.a(new cmx($$0), cld.g.a);
      }

      default void a(Collection<cmx> $$0, cld.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cmx> $$0) {
         this.a($$0, cld.g.a);
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
