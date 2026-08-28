import java.util.UUID;

public record ajo(String b, UUID c) implements zq<ajm> {
   public static final zh<wg, ajo> a = zq.a(ajo::a, ajo::new);

   private ajo(wg $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(wg $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public zs<ajo> a() {
      return ajk.g;
   }

   public void a(ajm $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
