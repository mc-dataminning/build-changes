import java.time.Instant;

public record acq(String a, Instant b, long c, ea d, uy.b e) implements wk<acj> {
   public acq(tu $$0) {
      this($$0.d(256), $$0.w(), $$0.readLong(), new ea($$0), new uy.b($$0));
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a, 256);
      $$0.a(this.b);
      $$0.b(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   public void a(acj $$0) {
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

   public uy.b g() {
      return this.e;
   }
}
