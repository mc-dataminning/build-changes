import java.util.UUID;

public record ajw(String b, UUID c) implements zo<aju> {
   public static final ze<vy, ajw> a = zo.a(ajw::a, ajw::new);

   private ajw(vy $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(vy $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public zq<ajw> a() {
      return ajs.g;
   }

   public void a(aju $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
