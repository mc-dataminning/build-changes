import java.time.Instant;

public record agw(String b, Instant c, long d, eq e, xf.b f) implements zf<agp> {
   public static final yw<vu, agw> a = zf.a(agw::a, agw::new);

   private agw(vu $$0) {
      this($$0.p(), $$0.t(), $$0.readLong(), new eq($$0), new xf.b($$0));
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public zh<agw> a() {
      return agn.bq;
   }

   public void a(agp $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   public eq g() {
      return this.e;
   }

   public xf.b h() {
      return this.f;
   }
}
