import javax.annotation.Nullable;

public record acy(String b, @Nullable String c) implements yb<aam> {
   public static final xs<uu, acy> a = yb.a(acy::a, acy::new);

   private acy(uu $$0) {
      this($$0.p(), $$0.c(uu::p));
   }

   private void a(uu $$0) {
      $$0.a(this.b);
      $$0.a(this.c, uu::a);
   }

   @Override
   public yd<acy> a() {
      return aex.cc;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
