import java.time.Instant;
import javax.annotation.Nullable;

public record agm(String b, Instant c, long d, @Nullable xj e, xe.b f) implements ze<age> {
   public static final yv<vx, agm> a = ze.a(agm::a, agm::new);

   private agm(vx $$0) {
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
   public zg<agm> a() {
      return agc.bl;
   }

   public void a(age $$0) {
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
