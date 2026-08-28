import java.util.UUID;
import javax.annotation.Nullable;

public record ado(UUID b, int c, @Nullable xb d, xi.a e, @Nullable wp f, wt g, wl.a h) implements yw<abl> {
   public static final yn<wa, ado> a = yw.a(ado::a, ado::new);

   private ado(wa $$0) {
      this($$0.n(), $$0.l(), $$0.c(xb::a), new xi.a($$0), vl.a($$0, wr.d), wt.a($$0), wl.a.a.decode($$0));
   }

   private void a(wa $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d, xb::a);
      this.e.a($$0);
      vl.a($$0, this.f, wr.d);
      wt.a($$0, this.g);
      wl.a.a.encode($$0, this.h);
   }

   @Override
   public yy<ado> a() {
      return age.ab;
   }

   public void a(abl $$0) {
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
   public xb f() {
      return this.d;
   }

   public xi.a g() {
      return this.e;
   }

   @Nullable
   public wp h() {
      return this.f;
   }

   public wt i() {
      return this.g;
   }

   public wl.a j() {
      return this.h;
   }
}
