import javax.annotation.Nullable;

public record aed(String b, @Nullable String c) implements yw<abl> {
   public static final yn<vl, aed> a = yw.a(aed::a, aed::new);

   private aed(vl $$0) {
      this($$0.p(), $$0.c(vl::p));
   }

   private void a(vl $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vl::a);
   }

   @Override
   public yy<aed> a() {
      return age.cn;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
