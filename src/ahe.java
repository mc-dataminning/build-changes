import java.time.Instant;
import javax.annotation.Nullable;

public record ahe(String b, Instant c, long d, @Nullable xv e, xq.b f) implements zq<agw> {
   public static final zh<wg, ahe> a = zq.a(ahe::a, ahe::new);

   private ahe(wg $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), $$0.c(xv::a), new xq.b($$0));
   }

   private void a(wg $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      $$0.a(this.e, xv::a);
      this.f.a($$0);
   }

   @Override
   public zs<ahe> a() {
      return agu.bn;
   }

   public void a(agw $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   @Nullable
   public xv g() {
      return this.e;
   }

   public xq.b h() {
      return this.f;
   }
}
