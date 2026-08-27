import javax.annotation.Nullable;

public record adm(String b, @Nullable String c) implements yp<aba> {
   public static final yg<vi, adm> a = yp.a(adm::a, adm::new);

   private adm(vi $$0) {
      this($$0.p(), $$0.c(vi::p));
   }

   private void a(vi $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vi::a);
   }

   @Override
   public yr<adm> a() {
      return afl.cc;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
