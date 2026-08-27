import javax.annotation.Nullable;

public record acu(String b, @Nullable String c) implements xz<aai> {
   public static final xq<us, acu> a = xz.a(acu::a, acu::new);

   private acu(us $$0) {
      this($$0.p(), $$0.c(us::p));
   }

   private void a(us $$0) {
      $$0.a(this.b);
      $$0.a(this.c, us::a);
   }

   @Override
   public yb<acu> a() {
      return aet.cc;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
