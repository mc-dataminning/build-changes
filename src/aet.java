import javax.annotation.Nullable;

public record aet(String b, @Nullable String c) implements zq<acf> {
   public static final zh<wg, aet> a = zq.a(aet::a, aet::new);

   private aet(wg $$0) {
      this($$0.p(), $$0.c(wg::p));
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      $$0.a(this.c, wg::a);
   }

   @Override
   public zs<aet> a() {
      return agu.ch;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
