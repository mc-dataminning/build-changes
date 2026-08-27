import java.time.Instant;

public record abl(String a, Instant b, long c, dy d, tt.b e) implements vf<abe> {
   public abl(sq $$0) {
      this($$0.d(256), $$0.v(), $$0.readLong(), new dy($$0), new tt.b($$0));
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.a, 256);
      $$0.a(this.b);
      $$0.b(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   public void a(abe $$0) {
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

   public tt.b g() {
      return this.e;
   }
}
