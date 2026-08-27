import java.time.Instant;

public record adn(String a, Instant b, long c, dz d, vk.b e) implements xd<adg> {
   public adn(ug $$0) {
      this($$0.d(256), $$0.w(), $$0.readLong(), new dz($$0), new vk.b($$0));
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.a, 256);
      $$0.a(this.b);
      $$0.b(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   public void a(adg $$0) {
      $$0.a(this);
   }

   public Instant d() {
      return this.b;
   }

   public long e() {
      return this.c;
   }

   public dz f() {
      return this.d;
   }

   public vk.b g() {
      return this.e;
   }
}
