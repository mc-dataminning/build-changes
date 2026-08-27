import java.time.Instant;
import javax.annotation.Nullable;

public record afc(String b, Instant c, long d, @Nullable we e, vz.b f) implements xz<aev> {
   public static final xq<us, afc> a = xz.a(afc::a, afc::new);

   private afc(us $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), $$0.c(we::a), new vz.b($$0));
   }

   private void a(us $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      $$0.a(this.e, we::a);
      this.f.a($$0);
   }

   @Override
   public yb<afc> a() {
      return aet.bj;
   }

   public void a(aev $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   @Nullable
   public we g() {
      return this.e;
   }

   public vz.b h() {
      return this.f;
   }
}
