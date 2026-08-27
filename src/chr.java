import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class chr {
   private final tl a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final chr.f f;
   private final int g;
   private final chr.h h;
   @Nullable
   private cjl i;
   private Collection<cjl> j = cjm.a();
   private Set<cjl> k = cjm.a();
   @Nullable
   private Consumer<List<cjl>> l;
   private final Supplier<cjl> m;
   private final chr.b n;

   chr(chr.f $$0, int $$1, chr.h $$2, tl $$3, Supplier<cjl> $$4, chr.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static chr.a a(chr.f $$0, int $$1) {
      return new chr.a($$0, $$1);
   }

   public tl a() {
      return this.a;
   }

   public cjl b() {
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

   public chr.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != chr.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public chr.h k() {
      return this.h;
   }

   public void a(chr.d $$0) {
      chr.c $$1 = new chr.c(this, $$0.a);
      aey<chr> $$2 = jb.ap.c(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<cjl> l() {
      return this.j;
   }

   public Collection<cjl> m() {
      return this.k;
   }

   public boolean a(cjl $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<cjl>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final chr.b a = ($$0, $$1) -> {
      };
      private final chr.f b;
      private final int c;
      private tl d = tl.i();
      private Supplier<cjl> e = () -> cjl.b;
      private chr.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private chr.h j = chr.h.a;
      private String k = "items.png";

      public a(chr.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public chr.a a(tl $$0) {
         this.d = $$0;
         return this;
      }

      public chr.a a(Supplier<cjl> $$0) {
         this.e = $$0;
         return this;
      }

      public chr.a a(chr.b $$0) {
         this.f = $$0;
         return this;
      }

      public chr.a a() {
         this.i = true;
         return this;
      }

      public chr.a b() {
         this.h = false;
         return this;
      }

      public chr.a c() {
         this.g = false;
         return this;
      }

      protected chr.a a(chr.h $$0) {
         this.j = $$0;
         return this;
      }

      public chr.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public chr d() {
         if ((this.j == chr.h.c || this.j == chr.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            chr $$0 = new chr(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(chr.d var1, chr.e var2);
   }

   static class c implements chr.e {
      public final Collection<cjl> a = cjm.a();
      public final Set<cjl> b = cjm.a();
      private final chr c;
      private final cei d;

      public c(chr $$0, cei $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cjl $$0, chr.g $$1) {
         if ($$0.L() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != chr.g.c;
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

   public static record d(cei a, boolean b, hg.b c) {

      public boolean a(cei $$0, boolean $$1, hg.b $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cjl var1, chr.g var2);

      default void a(cjl $$0) {
         this.a($$0, chr.g.a);
      }

      default void a(cqa $$0, chr.g $$1) {
         this.a(new cjl($$0), $$1);
      }

      default void a(cqa $$0) {
         this.a(new cjl($$0), chr.g.a);
      }

      default void a(Collection<cjl> $$0, chr.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cjl> $$0) {
         this.a($$0, chr.g.a);
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
