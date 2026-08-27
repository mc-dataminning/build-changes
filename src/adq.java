import java.time.Instant;

public record adq(String a, Instant b, long c, dz d, vm.b e) implements xf<adj> {
   public adq(ui $$0) {
      this($$0.d(256), $$0.w(), $$0.readLong(), new dz($$0), new vm.b($$0));
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a, 256);
      $$0.a(this.b);
      $$0.b(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   public void a(adj $$0) {
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

   public vm.b g() {
      return this.e;
   }
}
