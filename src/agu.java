import java.time.Instant;
import javax.annotation.Nullable;

public record agu(String b, Instant c, long d, @Nullable xh e, xc.b f) implements zc<agm> {
   public static final yt<vr, agu> a = zc.a(agu::a, agu::new);

   private agu(vr $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), $$0.c(xh::a), new xc.b($$0));
   }

   private void a(vr $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      $$0.a(this.e, xh::a);
      this.f.a($$0);
   }

   @Override
   public ze<agu> a() {
      return agk.br;
   }

   public void a(agm $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   @Nullable
   public xh g() {
      return this.e;
   }

   public xc.b h() {
      return this.f;
   }
}
