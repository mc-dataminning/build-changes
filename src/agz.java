import java.time.Instant;
import javax.annotation.Nullable;

public record agz(String b, Instant c, long d, @Nullable xm e, xh.b f) implements zh<agr> {
   public static final yy<vw, agz> a = zh.a(agz::a, agz::new);

   private agz(vw $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), $$0.c(xm::a), new xh.b($$0));
   }

   private void a(vw $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      $$0.a(this.e, xm::a);
      this.f.a($$0);
   }

   @Override
   public zj<agz> a() {
      return agp.br;
   }

   public void a(agr $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   @Nullable
   public xm g() {
      return this.e;
   }

   public xh.b h() {
      return this.f;
   }
}
