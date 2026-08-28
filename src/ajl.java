import java.util.UUID;

public record ajl(String b, UUID c) implements zf<ajj> {
   public static final yw<vu, ajl> a = zf.a(ajl::a, ajl::new);

   private ajl(vu $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(vu $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public zh<ajl> a() {
      return ajh.g;
   }

   public void a(ajj $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
