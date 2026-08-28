import javax.annotation.Nullable;

public record aec(String b, @Nullable String c) implements yw<abl> {
   public static final yn<vl, aec> a = yw.a(aec::a, aec::new);

   private aec(vl $$0) {
      this($$0.p(), $$0.c(vl::p));
   }

   private void a(vl $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vl::a);
   }

   @Override
   public yy<aec> a() {
      return agd.cm;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
