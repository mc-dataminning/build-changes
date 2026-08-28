import java.time.Instant;
import javax.annotation.Nullable;

public record agp(String b, Instant c, long d, @Nullable xk e, xf.b f) implements zf<agh> {
   public static final yw<vv, agp> a = zf.a(agp::a, agp::new);

   private agp(vv $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), $$0.c(xk::a), new xf.b($$0));
   }

   private void a(vv $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      $$0.a(this.e, xk::a);
      this.f.a($$0);
   }

   @Override
   public zh<agp> a() {
      return agf.bl;
   }

   public void a(agh $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   @Nullable
   public xk g() {
      return this.e;
   }

   public xf.b h() {
      return this.f;
   }
}
