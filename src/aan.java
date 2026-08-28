import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aan(aan.a c) implements aar {
   public static final zf<we, aan> a = aar.a(aan::a, aan::new);
   public static final aar.b<aan> b = aar.a("debug/bee");

   private aan(we $$0) {
      this(new aan.a($$0));
   }

   private void a(we $$0) {
      this.c.a($$0);
   }

   @Override
   public aar.b<aan> a() {
      return b;
   }

   public aan.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, ezh c, @Nullable ers d, @Nullable jg e, @Nullable jg f, int g, Set<String> h, List<jg> i) {
      public a(we $$0) {
         this($$0.n(), $$0.readInt(), $$0.k(), $$0.c(ers::b), $$0.c(jg.b), $$0.c(jg.b), $$0.readInt(), $$0.a(HashSet::new, we::p), $$0.a(jg.b));
      }

      public void a(we $$0) {
         $$0.a(this.a);
         $$0.q(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, jg.b);
         $$0.a(this.f, jg.b);
         $$0.q(this.g);
         $$0.a(this.h, we::a);
         $$0.a(this.i, jg.b);
      }

      public boolean a(jg $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return agq.a(this.a);
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

      public ezh d() {
         return this.c;
      }

      @Nullable
      public ers e() {
         return this.d;
      }

      @Nullable
      public jg f() {
         return this.e;
      }

      @Nullable
      public jg g() {
         return this.f;
      }

      public int h() {
         return this.g;
      }

      public Set<String> i() {
         return this.h;
      }

      public List<jg> j() {
         return this.i;
      }
   }
}
