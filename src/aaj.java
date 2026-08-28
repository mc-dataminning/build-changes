import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aaj(aaj.a c) implements aan {
   public static final zb<wa, aaj> a = aan.a(aaj::a, aaj::new);
   public static final aan.b<aaj> b = aan.a("debug/bee");

   private aaj(wa $$0) {
      this(new aaj.a($$0));
   }

   private void a(wa $$0) {
      this.c.a($$0);
   }

   @Override
   public aan.b<aaj> a() {
      return b;
   }

   public aaj.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, eys c, @Nullable erd d, @Nullable je e, @Nullable je f, int g, Set<String> h, List<je> i) {
      public a(wa $$0) {
         this($$0.n(), $$0.readInt(), $$0.k(), $$0.c(erd::b), $$0.c(je.b), $$0.c(je.b), $$0.readInt(), $$0.a(HashSet::new, wa::p), $$0.a(je.b));
      }

      public void a(wa $$0) {
         $$0.a(this.a);
         $$0.q(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, je.b);
         $$0.a(this.f, je.b);
         $$0.q(this.g);
         $$0.a(this.h, wa::a);
         $$0.a(this.i, je.b);
      }

      public boolean a(je $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return agm.a(this.a);
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

      public eys d() {
         return this.c;
      }

      @Nullable
      public erd e() {
         return this.d;
      }

      @Nullable
      public je f() {
         return this.e;
      }

      @Nullable
      public je g() {
         return this.f;
      }

      public int h() {
         return this.g;
      }

      public Set<String> i() {
         return this.h;
      }

      public List<je> j() {
         return this.i;
      }
   }
}
