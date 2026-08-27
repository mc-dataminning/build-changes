import java.util.Optional;
import javax.annotation.Nullable;

public record ads(String b, String c, int d, @Nullable vq e, Optional<xg> f) implements xx<aag> {
   public static final xo<vb, ads> a = xx.a(ads::a, ads::new);

   private ads(vb $$0) {
      this($$0.r(), $$0.r(), $$0.n(), $$0.c(uq::m), xi.d.decode($$0));
   }

   private void a(vb $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.c(this.d);
      $$0.a(this.e, uq::a);
      xi.d.encode($$0, this.f);
   }

   @Override
   public xz<ads> a() {
      return aeq.aK;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public String e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   @Nullable
   public vq g() {
      return this.e;
   }

   public Optional<xg> h() {
      return this.f;
   }
}
