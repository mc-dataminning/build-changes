import java.util.UUID;

public record ajq(String b, UUID c) implements zs<ajo> {
   public static final zj<wi, ajq> a = zs.a(ajq::a, ajq::new);

   private ajq(wi $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(wi $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public zu<ajq> a() {
      return ajm.g;
   }

   public void a(ajo $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
