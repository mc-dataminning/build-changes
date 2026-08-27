import java.time.Instant;
import javax.annotation.Nullable;

public record afu(String b, Instant c, long d, @Nullable wu e, wp.b f) implements yp<afn> {
   public static final yg<vi, afu> a = yp.a(afu::a, afu::new);

   private afu(vi $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), $$0.c(wu::a), new wp.b($$0));
   }

   private void a(vi $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      $$0.a(this.e, wu::a);
      this.f.a($$0);
   }

   @Override
   public yr<afu> a() {
      return afl.bj;
   }

   public void a(afn $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   @Nullable
   public wu g() {
      return this.e;
   }

   public wp.b h() {
      return this.f;
   }
}
