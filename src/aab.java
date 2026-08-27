import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aab(aab.a c) implements aaf {
   public static final yv<vx, aab> a = aaf.a(aab::a, aab::new);
   public static final aaf.b<aab> b = aaf.a("debug/bee");

   private aab(vx $$0) {
      this(new aab.a($$0));
   }

   private void a(vx $$0) {
      this.c.a($$0);
   }

   @Override
   public aaf.b<aab> a() {
      return b;
   }

   public aab.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, euk c, @Nullable eni d, @Nullable io e, @Nullable io f, int g, Set<String> h, List<io> i) {
      public a(vx $$0) {
         this($$0.n(), $$0.readInt(), $$0.k(), $$0.c(eni::b), $$0.c(io.b), $$0.c(io.b), $$0.readInt(), $$0.a(HashSet::new, vx::p), $$0.a(io.b));
      }

      public void a(vx $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, io.b);
         $$0.a(this.f, io.b);
         $$0.p(this.g);
         $$0.a(this.h, vx::a);
         $$0.a(this.i, io.b);
      }

      public boolean a(io $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return afz.a(this.a);
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

      public euk d() {
         return this.c;
      }

      @Nullable
      public eni e() {
         return this.d;
      }

      @Nullable
      public io f() {
         return this.e;
      }

      @Nullable
      public io g() {
         return this.f;
      }

      public int h() {
         return this.g;
      }

      public Set<String> i() {
         return this.h;
      }

      public List<io> j() {
         return this.i;
      }
   }
}
