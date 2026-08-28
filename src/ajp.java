import java.util.UUID;

public record ajp(String b, UUID c) implements zj<ajn> {
   public static final za<vy, ajp> a = zj.a(ajp::a, ajp::new);

   private ajp(vy $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(vy $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public zl<ajp> a() {
      return ajl.g;
   }

   public void a(ajn $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
