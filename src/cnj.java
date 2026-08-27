import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cnj {
   private final vq a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final cnj.f f;
   private final int g;
   private final cnj.h h;
   @Nullable
   private cpd i;
   private Collection<cpd> j = cpe.a();
   private Set<cpd> k = cpe.a();
   @Nullable
   private Consumer<List<cpd>> l;
   private final Supplier<cpd> m;
   private final cnj.b n;

   cnj(cnj.f $$0, int $$1, cnj.h $$2, vq $$3, Supplier<cpd> $$4, cnj.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static cnj.a a(cnj.f $$0, int $$1) {
      return new cnj.a($$0, $$1);
   }

   public vq a() {
      return this.a;
   }

   public cpd b() {
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

   public cnj.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != cnj.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public cnj.h k() {
      return this.h;
   }

   public void a(cnj.d $$0) {
      cnj.c $$1 = new cnj.c(this, $$0.a);
      aix<cnj> $$2 = kf.ap.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<cpd> l() {
      return this.j;
   }

   public Collection<cpd> m() {
      return this.k;
   }

   public boolean a(cpd $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<cpd>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final cnj.b a = ($$0, $$1) -> {
      };
      private final cnj.f b;
      private final int c;
      private vq d = vq.i();
      private Supplier<cpd> e = () -> cpd.h;
      private cnj.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cnj.h j = cnj.h.a;
      private String k = "items.png";

      public a(cnj.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cnj.a a(vq $$0) {
         this.d = $$0;
         return this;
      }

      public cnj.a a(Supplier<cpd> $$0) {
         this.e = $$0;
         return this;
      }

      public cnj.a a(cnj.b $$0) {
         this.f = $$0;
         return this;
      }

      public cnj.a a() {
         this.i = true;
         return this;
      }

      public cnj.a b() {
         this.h = false;
         return this;
      }

      public cnj.a c() {
         this.g = false;
         return this;
      }

      protected cnj.a a(cnj.h $$0) {
         this.j = $$0;
         return this;
      }

      public cnj.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public cnj d() {
         if ((this.j == cnj.h.c || this.j == cnj.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cnj $$0 = new cnj(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cnj.d var1, cnj.e var2);
   }

   static class c implements cnj.e {
      public final Collection<cpd> a = cpe.a();
      public final Set<cpd> b = cpe.a();
      private final cnj c;
      private final cjw d;

      public c(cnj $$0, cjw $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cpd $$0, cnj.g $$1) {
         if ($$0.M() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cnj.g.c;
            if ($$2) {
               throw new IllegalStateException(
                  "Accidentally adding the same item stack twice " + $$0.K().getString() + " to a Creative Mode Tab: " + this.c.a().getString()
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

   public static record d(cjw a, boolean b, il.b c) {

      public boolean a(cjw $$0, boolean $$1, il.b $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cpd var1, cnj.g var2);

      default void a(cpd $$0) {
         this.a($$0, cnj.g.a);
      }

      default void a(cvq $$0, cnj.g $$1) {
         this.a(new cpd($$0), $$1);
      }

      default void a(cvq $$0) {
         this.a(new cpd($$0), cnj.g.a);
      }

      default void a(Collection<cpd> $$0, cnj.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cpd> $$0) {
         this.a($$0, cnj.g.a);
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
