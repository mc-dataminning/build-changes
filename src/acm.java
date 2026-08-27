import javax.annotation.Nullable;

public record acm(String a, String b, int c, @Nullable vg d, @Nullable ww e) implements xg<zb> {
   public acm(uj $$0) {
      this($$0.s(), $$0.s(), $$0.n(), $$0.c(uj::m), $$0.c(wy::a));
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d, uj::a);
      $$0.a(this.e, wy::a);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public String d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   @Nullable
   public vg f() {
      return this.d;
   }

   @Nullable
   public ww g() {
      return this.e;
   }
}
