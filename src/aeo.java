import javax.annotation.Nullable;

public record aeo(String b, @Nullable String c) implements zl<aca> {
   public static final zc<wb, aeo> a = zl.a(aeo::a, aeo::new);

   private aeo(wb $$0) {
      this($$0.p(), $$0.c(wb::p));
   }

   private void a(wb $$0) {
      $$0.a(this.b);
      $$0.a(this.c, wb::a);
   }

   @Override
   public zn<aeo> a() {
      return agp.ch;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
