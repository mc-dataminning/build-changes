import java.time.Instant;
import javax.annotation.Nullable;

public record ahc(String b, Instant c, long d, @Nullable xt e, xo.b f) implements zo<agu> {
   public static final zf<we, ahc> a = zo.a(ahc::a, ahc::new);

   private ahc(we $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), $$0.c(xt::a), new xo.b($$0));
   }

   private void a(we $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      $$0.a(this.e, xt::a);
      this.f.a($$0);
   }

   @Override
   public zq<ahc> a() {
      return ags.bn;
   }

   public void a(agu $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   @Nullable
   public xt g() {
      return this.e;
   }

   public xo.b h() {
      return this.f;
   }
}
