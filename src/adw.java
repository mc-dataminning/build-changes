import javax.annotation.Nullable;

public record adw(String b, @Nullable String c) implements yz<abk> {
   public static final yq<vs, adw> a = yz.a(adw::a, adw::new);

   private adw(vs $$0) {
      this($$0.p(), $$0.c(vs::p));
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vs::a);
   }

   @Override
   public zb<adw> a() {
      return afv.cc;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
