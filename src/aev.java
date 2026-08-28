import javax.annotation.Nullable;

public record aev(String b, @Nullable String c) implements zw<aci> {
   public static final zn<wm, aev> a = zw.a(aev::a, aev::new);

   private aev(wm $$0) {
      this($$0.p(), $$0.c(wm::p));
   }

   private void a(wm $$0) {
      $$0.a(this.b);
      $$0.a(this.c, wm::a);
   }

   @Override
   public zy<aev> a() {
      return agu.ce;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
