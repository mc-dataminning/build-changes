import java.time.Instant;
import javax.annotation.Nullable;

public record ade(String a, Instant b, long c, @Nullable vn d, vi.b e) implements wu<acw> {
   public ade(ue $$0) {
      this($$0.d(256), $$0.w(), $$0.readLong(), $$0.c(vn::a), new vi.b($$0));
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a, 256);
      $$0.a(this.b);
      $$0.b(this.c);
      $$0.a(this.d, vn::a);
      this.e.a($$0);
   }

   public void a(acw $$0) {
      $$0.a(this);
   }

   public Instant d() {
      return this.b;
   }

   public long e() {
      return this.c;
   }

   @Nullable
   public vn f() {
      return this.d;
   }

   public vi.b g() {
      return this.e;
   }
}
