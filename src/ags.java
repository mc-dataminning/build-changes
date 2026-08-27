import java.time.Instant;
import javax.annotation.Nullable;

public record ags(String b, Instant c, long d, @Nullable xq e, xl.b f) implements zl<agl> {
   public static final zc<we, ags> a = zl.a(ags::a, ags::new);

   private ags(we $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), $$0.c(xq::a), new xl.b($$0));
   }

   private void a(we $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      $$0.a(this.e, xq::a);
      this.f.a($$0);
   }

   @Override
   public zn<ags> a() {
      return agj.bl;
   }

   public void a(agl $$0) {
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
