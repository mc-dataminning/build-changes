import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record abb(abb.a c) implements abf {
   public static final zt<ws, abb> a = abf.a(abb::a, abb::new);
   public static final abf.b<abb> b = abf.a("debug/bee");

   private abb(ws $$0) {
      this(new abb.a($$0));
   }

   private void a(ws $$0) {
      this.c.a($$0);
   }

   @Override
   public abf.b<abb> a() {
      return b;
   }

   public abb.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, fbs c, @Nullable eud d, @Nullable jh e, @Nullable jh f, int g, Set<String> h, List<jh> i) {
      public a(ws $$0) {
         this($$0.n(), $$0.readInt(), $$0.k(), $$0.c(eud::b), $$0.c(jh.b), $$0.c(jh.b), $$0.readInt(), $$0.a(HashSet::new, ws::p), $$0.a(jh.b));
      }

      public void a(ws $$0) {
         $$0.a(this.a);
         $$0.q(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, jh.b);
         $$0.a(this.f, jh.b);
         $$0.q(this.g);
         $$0.a(this.h, ws::a);
         $$0.a(this.i, jh.b);
      }

      public boolean a(jh $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return ahi.a(this.a);
      }

      @Override
      public String toString() {
         return this.a();
      }

      public UUID b() {
         return this.a;
      }

      public int c() {
         return this.b;
      }

      public fbs d() {
         return this.c;
      }

      @Nullable
      public eud e() {
         return this.d;
      }

      @Nullable
      public jh f() {
         return this.e;
      }

      @Nullable
      public jh g() {
         return this.f;
      }

      public int h() {
         return this.g;
      }

      public Set<String> i() {
         return this.h;
      }

      public List<jh> j() {
         return this.i;
      }
   }
}
