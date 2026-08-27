import java.time.Instant;

public record aft(String b, Instant c, long d, ec e, wp.b f) implements yp<afn> {
   public static final yg<vi, aft> a = yp.a(aft::a, aft::new);

   private aft(vi $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), new ec($$0), new wp.b($$0));
   }

   private void a(vi $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public yr<aft> a() {
      return afl.bi;
   }

   public void a(afn $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   public ec g() {
      return this.e;
   }

   public wp.b h() {
      return this.f;
   }
}
