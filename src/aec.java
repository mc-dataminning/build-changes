import java.util.UUID;
import javax.annotation.Nullable;

public record aec(UUID b, int c, @Nullable xq d, xx.a e, @Nullable xe f, xi g, xa.a h) implements zl<aca> {
   public static final zc<wp, aec> a = zl.a(aec::a, aec::new);

   private aec(wp $$0) {
      this($$0.n(), $$0.l(), $$0.c(xq::a), new xx.a($$0), wb.a($$0, xg.d), xi.a($$0), xa.a.a.decode($$0));
   }

   private void a(wp $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d, xq::a);
      this.e.a($$0);
      wb.a($$0, this.f, xg.d);
      xi.a($$0, this.g);
      xa.a.a.encode($$0, this.h);
   }

   @Override
   public zn<aec> a() {
      return agp.ab;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   @Override
   public boolean c() {
      return true;
   }

   public int e() {
      return this.c;
   }

   @Nullable
   public xq f() {
      return this.d;
   }

   public xx.a g() {
      return this.e;
   }

   @Nullable
   public xe h() {
      return this.f;
   }

   public xi i() {
      return this.g;
   }

   public xa.a j() {
      return this.h;
   }
}
