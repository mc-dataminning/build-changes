import javax.annotation.Nullable;

public record aeg(String b, @Nullable String c) implements zf<abt> {
   public static final yw<vv, aeg> a = zf.a(aeg::a, aeg::new);

   private aeg(vv $$0) {
      this($$0.p(), $$0.c(vv::p));
   }

   private void a(vv $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vv::a);
   }

   @Override
   public zh<aeg> a() {
      return agf.ce;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
