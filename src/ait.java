import java.util.UUID;

public record ait(String b, UUID c) implements ze<air> {
   public static final yv<vx, ait> a = ze.a(ait::a, ait::new);

   private ait(vx $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(vx $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public zg<ait> a() {
      return aip.g;
   }

   public void a(air $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
