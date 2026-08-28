import java.util.UUID;

public record ake(String b, UUID c) implements aac<akc> {
   public static final zt<ws, ake> a = aac.a(ake::a, ake::new);

   private ake(ws $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(ws $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public aae<ake> a() {
      return aka.g;
   }

   public void a(akc $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
