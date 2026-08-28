import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aar(aar.a c) implements aav {
   public static final zj<wi, aar> a = aav.a(aar::a, aar::new);
   public static final aav.b<aar> b = aav.a("debug/bee");

   private aar(wi $$0) {
      this(new aar.a($$0));
   }

   private void a(wi $$0) {
      this.c.a($$0);
   }

   @Override
   public aav.b<aar> a() {
      return b;
   }

   public aar.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, ezr c, @Nullable esc d, @Nullable jh e, @Nullable jh f, int g, Set<String> h, List<jh> i) {
      public a(wi $$0) {
         this($$0.n(), $$0.readInt(), $$0.k(), $$0.c(esc::b), $$0.c(jh.b), $$0.c(jh.b), $$0.readInt(), $$0.a(HashSet::new, wi::p), $$0.a(jh.b));
      }

      public void a(wi $$0) {
         $$0.a(this.a);
         $$0.q(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, jh.b);
         $$0.a(this.f, jh.b);
         $$0.q(this.g);
         $$0.a(this.h, wi::a);
         $$0.a(this.i, jh.b);
      }

      public boolean a(jh $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return agu.a(this.a);
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

      public ezr d() {
         return this.c;
      }

      @Nullable
      public esc e() {
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
