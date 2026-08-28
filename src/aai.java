import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aai(aai.a c) implements aam {
   public static final za<vy, aai> a = aam.a(aai::a, aai::new);
   public static final aam.b<aai> b = aam.a("debug/bee");

   private aai(vy $$0) {
      this(new aai.a($$0));
   }

   private void a(vy $$0) {
      this.c.a($$0);
   }

   @Override
   public aam.b<aai> a() {
      return b;
   }

   public aai.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, ffs c, @Nullable eye d, @Nullable iw e, @Nullable iw f, int g, Set<String> h, List<iw> i) {
      public a(vy $$0) {
         this($$0.n(), $$0.readInt(), $$0.k(), $$0.c(eye::b), $$0.c(iw.b), $$0.c(iw.b), $$0.readInt(), $$0.a(HashSet::new, vy::p), $$0.a(iw.b));
      }

      public void a(vy $$0) {
         $$0.a(this.a);
         $$0.q(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, iw.b);
         $$0.a(this.f, iw.b);
         $$0.q(this.g);
         $$0.a(this.h, vy::a);
         $$0.a(this.i, iw.b);
      }

      public boolean a(iw $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return agp.a(this.a);
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

      public ffs d() {
         return this.c;
      }

      @Nullable
      public eye e() {
         return this.d;
      }

      @Nullable
      public iw f() {
         return this.e;
      }

      @Nullable
      public iw g() {
         return this.f;
      }

      public int h() {
         return this.g;
      }

      public Set<String> i() {
         return this.h;
      }

      public List<iw> j() {
         return this.i;
      }
   }
}
