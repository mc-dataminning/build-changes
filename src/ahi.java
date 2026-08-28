import java.time.Instant;
import javax.annotation.Nullable;

public record ahi(String b, Instant c, long d, @Nullable xs e, xn.b f) implements zo<aha> {
   public static final ze<vy, ahi> a = zo.a(ahi::a, ahi::new);

   private ahi(vy $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), $$0.c(xs::a), new xn.b($$0));
   }

   private void a(vy $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      $$0.a(this.e, xs::a);
      this.f.a($$0);
   }

   @Override
   public zq<ahi> a() {
      return agy.br;
   }

   public void a(aha $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   @Nullable
   public xs g() {
      return this.e;
   }

   public xn.b h() {
      return this.f;
   }
}
