import java.time.Instant;
import javax.annotation.Nullable;

public record ahg(String b, Instant c, long d, @Nullable xx e, xs.b f) implements zs<agy> {
   public static final zj<wi, ahg> a = zs.a(ahg::a, ahg::new);

   private ahg(wi $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), $$0.c(xx::a), new xs.b($$0));
   }

   private void a(wi $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      $$0.a(this.e, xx::a);
      this.f.a($$0);
   }

   @Override
   public zu<ahg> a() {
      return agw.bn;
   }

   public void a(agy $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   @Nullable
   public xx g() {
      return this.e;
   }

   public xs.b h() {
      return this.f;
   }
}
