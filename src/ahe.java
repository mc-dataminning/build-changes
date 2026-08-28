import java.time.Instant;
import javax.annotation.Nullable;

public record ahe(String b, Instant c, long d, @Nullable yb e, xw.b f) implements zw<agw> {
   public static final zn<wm, ahe> a = zw.a(ahe::a, ahe::new);

   private ahe(wm $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), $$0.c(yb::a), new xw.b($$0));
   }

   private void a(wm $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      $$0.a(this.e, yb::a);
      this.f.a($$0);
   }

   @Override
   public zy<ahe> a() {
      return agu.bl;
   }

   public void a(agw $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   @Nullable
   public yb g() {
      return this.e;
   }

   public xw.b h() {
      return this.f;
   }
}
