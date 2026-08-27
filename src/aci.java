import java.time.Instant;
import javax.annotation.Nullable;

public record aci(String a, Instant b, long c, @Nullable uu d, up.b e) implements wb<aca> {
   public aci(tl $$0) {
      this($$0.d(256), $$0.w(), $$0.readLong(), $$0.c(uu::a), new up.b($$0));
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.a, 256);
      $$0.a(this.b);
      $$0.b(this.c);
      $$0.a(this.d, uu::a);
      this.e.a($$0);
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public Instant d() {
      return this.b;
   }

   public long e() {
      return this.c;
   }

   @Nullable
   public uu f() {
      return this.d;
   }

   public up.b g() {
      return this.e;
   }
}
