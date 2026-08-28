import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aat(aat.a c) implements aax {
   public static final zn<wm, aat> a = aax.a(aat::a, aat::new);
   public static final aax.b<aat> b = aax.a("debug/bee");

   private aat(wm $$0) {
      this(new aat.a($$0));
   }

   private void a(wm $$0) {
      this.c.a($$0);
   }

   @Override
   public aax.b<aat> a() {
      return b;
   }

   public aat.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, evr c, @Nullable eoj d, @Nullable iz e, @Nullable iz f, int g, Set<String> h, List<iz> i) {
      public a(wm $$0) {
         this($$0.n(), $$0.readInt(), $$0.k(), $$0.c(eoj::b), $$0.c(iz.b), $$0.c(iz.b), $$0.readInt(), $$0.a(HashSet::new, wm::p), $$0.a(iz.b));
      }

      public void a(wm $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, iz.b);
         $$0.a(this.f, iz.b);
         $$0.p(this.g);
         $$0.a(this.h, wm::a);
         $$0.a(this.i, iz.b);
      }

      public boolean a(iz $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return ags.a(this.a);
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

      public evr d() {
         return this.c;
      }

      @Nullable
      public eoj e() {
         return this.d;
      }

      @Nullable
      public iz f() {
         return this.e;
      }

      @Nullable
      public iz g() {
         return this.f;
      }

      public int h() {
         return this.g;
      }

      public Set<String> i() {
         return this.h;
      }

      public List<iz> j() {
         return this.i;
      }
   }
}
