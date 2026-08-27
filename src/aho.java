import java.util.UUID;

public record aho(String b, UUID c) implements yb<ahm> {
   public static final xs<uu, aho> a = yb.a(aho::a, aho::new);

   private aho(uu $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(uu $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public yd<aho> a() {
      return ahk.g;
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
