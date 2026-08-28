import javax.annotation.Nullable;

public record aer(String b, @Nullable String c) implements zo<acd> {
   public static final zf<we, aer> a = zo.a(aer::a, aer::new);

   private aer(we $$0) {
      this($$0.p(), $$0.c(we::p));
   }

   private void a(we $$0) {
      $$0.a(this.b);
      $$0.a(this.c, we::a);
   }

   @Override
   public zq<aer> a() {
      return ags.ch;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
