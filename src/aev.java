import javax.annotation.Nullable;

public record aev(String b, @Nullable String c) implements zs<ach> {
   public static final zj<wi, aev> a = zs.a(aev::a, aev::new);

   private aev(wi $$0) {
      this($$0.p(), $$0.c(wi::p));
   }

   private void a(wi $$0) {
      $$0.a(this.b);
      $$0.a(this.c, wi::a);
   }

   @Override
   public zu<aev> a() {
      return agw.ch;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
