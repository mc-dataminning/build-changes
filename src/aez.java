import java.time.Instant;
import javax.annotation.Nullable;

public record aez(String b, Instant c, long d, @Nullable wc e, vx.b f) implements xx<aes> {
   public static final xo<uq, aez> a = xx.a(aez::a, aez::new);

   private aez(uq $$0) {
      this($$0.d(256), $$0.v(), $$0.readLong(), $$0.c(wc::a), new vx.b($$0));
   }

   private void a(uq $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      $$0.a(this.e, wc::a);
      this.f.a($$0);
   }

   @Override
   public xz<aez> a() {
      return aeq.bi;
   }

   public void a(aes $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   @Nullable
   public wc g() {
      return this.e;
   }

   public vx.b h() {
      return this.f;
   }
}
