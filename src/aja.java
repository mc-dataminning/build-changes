import java.util.UUID;

public record aja(String b, UUID c) implements yw<aiy> {
   public static final yn<vl, aja> a = yw.a(aja::a, aja::new);

   private aja(vl $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(vl $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public yy<aja> a() {
      return aiw.g;
   }

   public void a(aiy $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
