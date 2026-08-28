import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aae(aae.a c) implements aai {
   public static final yw<vu, aae> a = aai.a(aae::a, aae::new);
   public static final aai.b<aae> b = aai.a("debug/bee");

   private aae(vu $$0) {
      this(new aae.a($$0));
   }

   private void a(vu $$0) {
      this.c.a($$0);
   }

   @Override
   public aai.b<aae> a() {
      return b;
   }

   public aae.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, fex c, @Nullable exj d, @Nullable iv e, @Nullable iv f, int g, Set<String> h, List<iv> i) {
      public a(vu $$0) {
         this($$0.n(), $$0.readInt(), $$0.k(), $$0.c(exj::b), $$0.c(iv.b), $$0.c(iv.b), $$0.readInt(), $$0.a(HashSet::new, vu::p), $$0.a(iv.b));
      }

      public void a(vu $$0) {
         $$0.a(this.a);
         $$0.q(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, iv.b);
         $$0.a(this.f, iv.b);
         $$0.q(this.g);
         $$0.a(this.h, vu::a);
         $$0.a(this.i, iv.b);
      }

      public boolean a(iv $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return agl.a(this.a);
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

      public fex d() {
         return this.c;
      }

      @Nullable
      public exj e() {
         return this.d;
      }

      @Nullable
      public iv f() {
         return this.e;
      }

      @Nullable
      public iv g() {
         return this.f;
      }

      public int h() {
         return this.g;
      }

      public Set<String> i() {
         return this.h;
      }

      public List<iv> j() {
         return this.i;
      }
   }
}
