import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aap(aap.a c) implements aat {
   public static final zj<wl, aap> a = aat.a(aap::a, aap::new);
   public static final aat.b<aap> b = aat.a("debug/bee");

   private aap(wl $$0) {
      this(new aap.a($$0));
   }

   private void a(wl $$0) {
      this.c.a($$0);
   }

   @Override
   public aat.b<aap> a() {
      return b;
   }

   public aap.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, evm c, @Nullable eoe d, @Nullable iz e, @Nullable iz f, int g, Set<String> h, List<iz> i) {
      public a(wl $$0) {
         this($$0.n(), $$0.readInt(), $$0.k(), $$0.c(eoe::b), $$0.c(iz.b), $$0.c(iz.b), $$0.readInt(), $$0.a(HashSet::new, wl::p), $$0.a(iz.b));
      }

      public void a(wl $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, iz.b);
         $$0.a(this.f, iz.b);
         $$0.p(this.g);
         $$0.a(this.h, wl::a);
         $$0.a(this.i, iz.b);
      }

      public boolean a(iz $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return ago.a(this.a);
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

      public evm d() {
         return this.c;
      }

      @Nullable
      public eoe e() {
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
