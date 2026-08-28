import java.time.Instant;

public record aha(String b, Instant c, long d, er e, xj.b f) implements zj<agt> {
   public static final za<vy, aha> a = zj.a(aha::a, aha::new);

   private aha(vy $$0) {
      this($$0.p(), $$0.t(), $$0.readLong(), new er($$0), new xj.b($$0));
   }

   private void a(vy $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public zl<aha> a() {
      return agr.bq;
   }

   public void a(agt $$0) {
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

   public xj.b h() {
      return this.f;
   }
}
