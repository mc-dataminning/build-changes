import java.time.Instant;

public record abd(String a, Instant b, long c, dw d, tl.b e) implements ux<aaw> {
   public abd(si $$0) {
      this($$0.d(256), $$0.v(), $$0.readLong(), new dw($$0), new tl.b($$0));
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a, 256);
      $$0.a(this.b);
      $$0.b(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   public void a(aaw $$0) {
      $$0.a(this);
   }

   public Instant d() {
      return this.b;
   }

   public long e() {
      return this.c;
   }

   public dw f() {
      return this.d;
   }

   public tl.b g() {
      return this.e;
   }
}
