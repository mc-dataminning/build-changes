import java.util.UUID;

public record aim(String b, UUID c) implements yz<aik> {
   public static final yq<vs, aim> a = yz.a(aim::a, aim::new);

   private aim(vs $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(vs $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public zb<aim> a() {
      return aii.g;
   }

   public void a(aik $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
