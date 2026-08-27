import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aai(aai.a c) implements aam {
   public static final zc<we, aai> a = aam.a(aai::a, aai::new);
   public static final aam.b<aai> b = aam.a("debug/bee");

   private aai(we $$0) {
      this(new aai.a($$0));
   }

   private void a(we $$0) {
      this.c.a($$0);
   }

   @Override
   public aam.b<aai> a() {
      return b;
   }

   public aai.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, ewu c, @Nullable eps d, @Nullable ir e, @Nullable ir f, int g, Set<String> h, List<ir> i) {
      public a(we $$0) {
         this($$0.n(), $$0.readInt(), $$0.k(), $$0.c(eps::b), $$0.c(ir.b), $$0.c(ir.b), $$0.readInt(), $$0.a(HashSet::new, we::p), $$0.a(ir.b));
      }

      public void a(we $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, ir.b);
         $$0.a(this.f, ir.b);
         $$0.p(this.g);
         $$0.a(this.h, we::a);
         $$0.a(this.i, ir.b);
      }

      public boolean a(ir $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return agh.a(this.a);
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

      public ewu d() {
         return this.c;
      }

      @Nullable
      public eps e() {
         return this.d;
      }

      @Nullable
      public ir f() {
         return this.e;
      }

      @Nullable
      public ir g() {
         return this.f;
      }

      public int h() {
         return this.g;
      }

      public Set<String> i() {
         return this.h;
      }

      public List<ir> j() {
         return this.i;
      }
   }
}
