import javax.annotation.Nullable;

public record aer(String b, @Nullable String c) implements zs<ace> {
   public static final zj<wl, aer> a = zs.a(aer::a, aer::new);

   private aer(wl $$0) {
      this($$0.p(), $$0.c(wl::p));
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.a(this.c, wl::a);
   }

   @Override
   public zu<aer> a() {
      return agq.ce;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
