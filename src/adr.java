import java.time.Instant;

public record adr(String a, Instant b, long c, dz d, vn.b e) implements xg<adk> {
   public adr(uj $$0) {
      this($$0.d(256), $$0.w(), $$0.readLong(), new dz($$0), new vn.b($$0));
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a, 256);
      $$0.a(this.b);
      $$0.b(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   public void a(adk $$0) {
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

   public vn.b g() {
      return this.e;
   }
}
