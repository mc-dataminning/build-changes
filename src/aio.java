import java.util.UUID;

public record aio(String b, UUID c) implements zb<aim> {
   public static final ys<vu, aio> a = zb.a(aio::a, aio::new);

   private aio(vu $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(vu $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public zd<aio> a() {
      return aik.g;
   }

   public void a(aim $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
