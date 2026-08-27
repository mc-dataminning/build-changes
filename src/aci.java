import javax.annotation.Nullable;

public record aci(String a, String b, int c, @Nullable vd d, @Nullable wt e) implements xd<yx> {
   public aci(ug $$0) {
      this($$0.s(), $$0.s(), $$0.n(), $$0.c(ug::m), $$0.c(wv::a));
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d, ug::a);
      $$0.a(this.e, wv::a);
   }

   public void a(yx $$0) {
      $$0.a(this);
   }

   public String d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   @Nullable
   public vd f() {
      return this.d;
   }

   @Nullable
   public wt g() {
      return this.e;
   }
}
