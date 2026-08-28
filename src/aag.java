import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aag(aag.a c) implements aak {
   public static final yy<vw, aag> a = aak.a(aag::a, aag::new);
   public static final aak.b<aag> b = aak.a("debug/bee");

   private aag(vw $$0) {
      this(new aag.a($$0));
   }

   private void a(vw $$0) {
      this.c.a($$0);
   }

   @Override
   public aak.b<aag> a() {
      return b;
   }

   public aag.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, ffq c, @Nullable eyc d, @Nullable iv e, @Nullable iv f, int g, Set<String> h, List<iv> i) {
      public a(vw $$0) {
         this($$0.n(), $$0.readInt(), $$0.k(), $$0.c(eyc::b), $$0.c(iv.b), $$0.c(iv.b), $$0.readInt(), $$0.a(HashSet::new, vw::p), $$0.a(iv.b));
      }

      public void a(vw $$0) {
         $$0.a(this.a);
         $$0.q(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, iv.b);
         $$0.a(this.f, iv.b);
         $$0.q(this.g);
         $$0.a(this.h, vw::a);
         $$0.a(this.i, iv.b);
      }

      public boolean a(iv $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return agn.a(this.a);
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

      public ffq d() {
         return this.c;
      }

      @Nullable
      public eyc e() {
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
