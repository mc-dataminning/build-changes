import java.util.UUID;

public record aja(String b, UUID c) implements zl<aiy> {
   public static final zc<we, aja> a = zl.a(aja::a, aja::new);

   private aja(we $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(we $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public zn<aja> a() {
      return aiw.g;
   }

   public void a(aiy $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
