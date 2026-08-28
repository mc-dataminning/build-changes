import java.time.Instant;

public record ahh(String b, Instant c, long d, er e, xn.b f) implements zo<aha> {
   public static final ze<vy, ahh> a = zo.a(ahh::a, ahh::new);

   private ahh(vy $$0) {
      this($$0.p(), $$0.t(), $$0.readLong(), new er($$0), new xn.b($$0));
   }

   private void a(vy $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public zq<ahh> a() {
      return agy.bq;
   }

   public void a(aha $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   public er g() {
      return this.e;
   }

   public xn.b h() {
      return this.f;
   }
}
