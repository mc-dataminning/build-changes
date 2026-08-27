import java.time.Instant;

public record abb(String a, Instant b, long c, dx d, tk.b e) implements uw<aav> {
   public abb(sh $$0) {
      this($$0.d(256), $$0.v(), $$0.readLong(), new dx($$0), new tk.b($$0));
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.a, 256);
      $$0.a(this.b);
      $$0.b(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   public void a(aav $$0) {
      $$0.a(this);
   }

   public Instant d() {
      return this.b;
   }

   public long e() {
      return this.c;
   }

   public dx f() {
      return this.d;
   }

   public tk.b g() {
      return this.e;
   }
}
