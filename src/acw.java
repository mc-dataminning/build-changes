import java.time.Instant;

public record acw(String a, Instant b, long c, ea d, vc.b e) implements wo<acp> {
   public acw(ty $$0) {
      this($$0.d(256), $$0.w(), $$0.readLong(), new ea($$0), new vc.b($$0));
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.a, 256);
      $$0.a(this.b);
      $$0.b(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   public void a(acp $$0) {
      $$0.a(this);
   }

   public Instant d() {
      return this.b;
   }

   public long e() {
      return this.c;
   }

   public ea f() {
      return this.d;
   }

   public vc.b g() {
      return this.e;
   }
}
