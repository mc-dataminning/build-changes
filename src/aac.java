import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aac(aac.a c) implements aag {
   public static final yu<vs, aac> a = aag.a(aac::a, aac::new);
   public static final aag.b<aac> b = aag.a("debug/bee");

   private aac(vs $$0) {
      this(new aac.a($$0));
   }

   private void a(vs $$0) {
      this.c.a($$0);
   }

   @Override
   public aag.b<aac> a() {
      return b;
   }

   public aac.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, fdw c, @Nullable ewj d, @Nullable iu e, @Nullable iu f, int g, Set<String> h, List<iu> i) {
      public a(vs $$0) {
         this($$0.n(), $$0.readInt(), $$0.k(), $$0.c(ewj::b), $$0.c(iu.b), $$0.c(iu.b), $$0.readInt(), $$0.a(HashSet::new, vs::p), $$0.a(iu.b));
      }

      public void a(vs $$0) {
         $$0.a(this.a);
         $$0.q(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, iu.b);
         $$0.a(this.f, iu.b);
         $$0.q(this.g);
         $$0.a(this.h, vs::a);
         $$0.a(this.i, iu.b);
      }

      public boolean a(iu $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return agj.a(this.a);
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

      public fdw d() {
         return this.c;
      }

      @Nullable
      public ewj e() {
         return this.d;
      }

      @Nullable
      public iu f() {
         return this.e;
      }

      @Nullable
      public iu g() {
         return this.f;
      }

      public int h() {
         return this.g;
      }

      public Set<String> i() {
         return this.h;
      }

      public List<iu> j() {
         return this.i;
      }
   }
}
