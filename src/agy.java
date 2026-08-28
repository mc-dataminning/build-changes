import java.time.Instant;
import javax.annotation.Nullable;

public record agy(String b, Instant c, long d, @Nullable xp e, xk.b f) implements zk<agq> {
   public static final zb<wa, agy> a = zk.a(agy::a, agy::new);

   private agy(wa $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), $$0.c(xp::a), new xk.b($$0));
   }

   private void a(wa $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      $$0.a(this.e, xp::a);
      this.f.a($$0);
   }

   @Override
   public zm<agy> a() {
      return ago.bn;
   }

   public void a(agq $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   @Nullable
   public xp g() {
      return this.e;
   }

   public xk.b h() {
      return this.f;
   }
}
