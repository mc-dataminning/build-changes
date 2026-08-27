import java.util.UUID;

public record aiu(String b, UUID c) implements ze<ais> {
   public static final yv<vx, aiu> a = ze.a(aiu::a, aiu::new);

   private aiu(vx $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(vx $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public zg<aiu> a() {
      return aiq.g;
   }

   public void a(ais $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
