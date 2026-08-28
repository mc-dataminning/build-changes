import java.time.Instant;
import javax.annotation.Nullable;

public record ago(String b, Instant c, long d, @Nullable xb e, ww.b f) implements yw<agg> {
   public static final yn<vl, ago> a = yw.a(ago::a, ago::new);

   private ago(vl $$0) {
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
   public yy<ago> a() {
      return age.br;
   }

   public void a(agg $$0) {
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
