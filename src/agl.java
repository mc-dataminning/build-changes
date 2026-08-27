import java.time.Instant;
import javax.annotation.Nullable;

public record agl(String b, Instant c, long d, @Nullable xj e, xe.b f) implements ze<agd> {
   public static final yv<vx, agl> a = ze.a(agl::a, agl::new);

   private agl(vx $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), $$0.c(xj::a), new xe.b($$0));
   }

   private void a(vx $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      $$0.a(this.e, xj::a);
      this.f.a($$0);
   }

   @Override
   public zg<agl> a() {
      return agb.bk;
   }

   public void a(agd $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   @Nullable
   public xj g() {
      return this.e;
   }

   public xe.b h() {
      return this.f;
   }
}
