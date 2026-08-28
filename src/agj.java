import java.time.Instant;
import javax.annotation.Nullable;

public record agj(String b, Instant c, long d, @Nullable xg e, xb.b f) implements zb<agb> {
   public static final ys<vr, agj> a = zb.a(agj::a, agj::new);

   private agj(vr $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), $$0.c(xg::a), new xb.b($$0));
   }

   private void a(vr $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      $$0.a(this.e, xg::a);
      this.f.a($$0);
   }

   @Override
   public zd<agj> a() {
      return afz.bl;
   }

   public void a(agb $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   @Nullable
   public xg g() {
      return this.e;
   }

   public xb.b h() {
      return this.f;
   }
}
