import java.time.Instant;
import javax.annotation.Nullable;

public record agz(String b, Instant c, long d, @Nullable xq e, xl.b f) implements zl<agr> {
   public static final zc<wb, agz> a = zl.a(agz::a, agz::new);

   private agz(wb $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), $$0.c(xq::a), new xl.b($$0));
   }

   private void a(wb $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      $$0.a(this.e, xq::a);
      this.f.a($$0);
   }

   @Override
   public zn<agz> a() {
      return agp.bn;
   }

   public void a(agr $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   @Nullable
   public xq g() {
      return this.e;
   }

   public xl.b h() {
      return this.f;
   }
}
