import javax.annotation.Nullable;

public record abk(int a, ih<blh> b) implements xg<zb> {
   public abk(uj $$0) {
      this($$0.n(), $$0.a(kd.d.t()));
   }

   @Override
   public void a(uj $$0) {
      $$0.c(this.a);
      $$0.a(kd.d.t(), this.b);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   @Nullable
   public blw a(ctx $$0) {
      return $$0.a(this.a);
   }

   public ih<blh> d() {
      return this.b;
   }
}
