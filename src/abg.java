import java.time.Instant;

public record abg(String a, Instant b, long c, dy d, to.b e) implements va<aaz> {
   public abg(sl $$0) {
      this($$0.d(256), $$0.v(), $$0.readLong(), new dy($$0), new to.b($$0));
   }

   @Override
   public void a(sl $$0) {
      $$0.a(this.a, 256);
      $$0.a(this.b);
      $$0.b(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   public void a(aaz $$0) {
      $$0.a(this);
   }

   public Instant d() {
      return this.b;
   }

   public long e() {
      return this.c;
   }

   public dy f() {
      return this.d;
   }

   public to.b g() {
      return this.e;
   }
}
