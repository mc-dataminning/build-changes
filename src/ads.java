import java.time.Instant;
import javax.annotation.Nullable;

public record ads(String a, Instant b, long c, @Nullable vs d, vn.b e) implements xg<adk> {
   public ads(uj $$0) {
      this($$0.d(256), $$0.w(), $$0.readLong(), $$0.c(vs::a), new vn.b($$0));
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a, 256);
      $$0.a(this.b);
      $$0.b(this.c);
      $$0.a(this.d, vs::a);
      this.e.a($$0);
   }

   public void a(adk $$0) {
      $$0.a(this);
   }

   public Instant d() {
      return this.b;
   }

   public long e() {
      return this.c;
   }

   @Nullable
   public vs f() {
      return this.d;
   }

   public vn.b g() {
      return this.e;
   }
}
