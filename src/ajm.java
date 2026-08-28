import java.util.UUID;

public record ajm(String b, UUID c) implements zo<ajk> {
   public static final zf<we, ajm> a = zo.a(ajm::a, ajm::new);

   private ajm(we $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(we $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public zq<ajm> a() {
      return aji.g;
   }

   public void a(ajk $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
