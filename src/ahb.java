import java.time.Instant;
import javax.annotation.Nullable;

public record ahb(String b, Instant c, long d, @Nullable xo e, xj.b f) implements zj<agt> {
   public static final za<vy, ahb> a = zj.a(ahb::a, ahb::new);

   private ahb(vy $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), $$0.c(xo::a), new xj.b($$0));
   }

   private void a(vy $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      $$0.a(this.e, xo::a);
      this.f.a($$0);
   }

   @Override
   public zl<ahb> a() {
      return agr.br;
   }

   public void a(agt $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   @Nullable
   public xo g() {
      return this.e;
   }

   public xj.b h() {
      return this.f;
   }
}
