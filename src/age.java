import java.time.Instant;
import javax.annotation.Nullable;

public record age(String b, Instant c, long d, @Nullable xe e, wz.b f) implements yz<afx> {
   public static final yq<vs, age> a = yz.a(age::a, age::new);

   private age(vs $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), $$0.c(xe::a), new wz.b($$0));
   }

   private void a(vs $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      $$0.a(this.e, xe::a);
      this.f.a($$0);
   }

   @Override
   public zb<age> a() {
      return afv.bj;
   }

   public void a(afx $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   @Nullable
   public xe g() {
      return this.e;
   }

   public wz.b h() {
      return this.f;
   }
}
