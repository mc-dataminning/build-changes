import java.time.Instant;
import javax.annotation.Nullable;

public record agq(String b, Instant c, long d, @Nullable xl e, xg.b f) implements zg<agi> {
   public static final yx<vw, agq> a = zg.a(agq::a, agq::new);

   private agq(vw $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), $$0.c(xl::a), new xg.b($$0));
   }

   private void a(vw $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      $$0.a(this.e, xl::a);
      this.f.a($$0);
   }

   @Override
   public zi<agq> a() {
      return agg.bl;
   }

   public void a(agi $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   @Nullable
   public xl g() {
      return this.e;
   }

   public xg.b h() {
      return this.f;
   }
}
