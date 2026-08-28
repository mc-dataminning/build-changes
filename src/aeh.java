import javax.annotation.Nullable;

public record aeh(String b, @Nullable String c) implements zg<abu> {
   public static final yx<vw, aeh> a = zg.a(aeh::a, aeh::new);

   private aeh(vw $$0) {
      this($$0.p(), $$0.c(vw::p));
   }

   private void a(vw $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vw::a);
   }

   @Override
   public zi<aeh> a() {
      return agg.ce;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
