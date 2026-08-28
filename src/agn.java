import java.time.Instant;
import javax.annotation.Nullable;

public record agn(String b, Instant c, long d, @Nullable xb e, ww.b f) implements yw<agf> {
   public static final yn<vl, agn> a = yw.a(agn::a, agn::new);

   private agn(vl $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), $$0.c(xb::a), new ww.b($$0));
   }

   private void a(vl $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      $$0.a(this.e, xb::a);
      this.f.a($$0);
   }

   @Override
   public yy<agn> a() {
      return agd.bq;
   }

   public void a(agf $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   @Nullable
   public xb g() {
      return this.e;
   }

   public ww.b h() {
      return this.f;
   }
}
