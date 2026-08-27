import java.time.Instant;

public record add(String a, Instant b, long c, dy d, vi.b e) implements wu<acw> {
   public add(ue $$0) {
      this($$0.d(256), $$0.w(), $$0.readLong(), new dy($$0), new vi.b($$0));
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a, 256);
      $$0.a(this.b);
      $$0.b(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   public void a(acw $$0) {
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

   public vi.b g() {
      return this.e;
   }
}
