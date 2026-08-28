import java.time.Instant;
import javax.annotation.Nullable;

public record ahj(String b, Instant c, long d, @Nullable xw e, xr.b f) implements zr<ahb> {
   public static final zi<wh, ahj> a = zr.a(ahj::a, ahj::new);

   private ahj(wh $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), $$0.c(xw::a), new xr.b($$0));
   }

   private void a(wh $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      $$0.a(this.e, xw::a);
      this.f.a($$0);
   }

   @Override
   public zt<ahj> a() {
      return agz.br;
   }

   public void a(ahb $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   @Nullable
   public xw g() {
      return this.e;
   }

   public xr.b h() {
      return this.f;
   }
}
