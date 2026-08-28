import javax.annotation.Nullable;

public record aec(String b, @Nullable String c) implements yv<abk> {
   public static final ym<vl, aec> a = yv.a(aec::a, aec::new);

   private aec(vl $$0) {
      this($$0.p(), $$0.c(vl::p));
   }

   private void a(vl $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vl::a);
   }

   @Override
   public yx<aec> a() {
      return agd.cn;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
