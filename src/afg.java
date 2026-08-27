import java.time.Instant;
import javax.annotation.Nullable;

public record afg(String b, Instant c, long d, @Nullable wg e, wb.b f) implements yb<aez> {
   public static final xs<uu, afg> a = yb.a(afg::a, afg::new);

   private afg(uu $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), $$0.c(wg::a), new wb.b($$0));
   }

   private void a(uu $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      $$0.a(this.e, wg::a);
      this.f.a($$0);
   }

   @Override
   public yd<afg> a() {
      return aex.bj;
   }

   public void a(aez $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   @Nullable
   public wg g() {
      return this.e;
   }

   public wb.b h() {
      return this.f;
   }
}
