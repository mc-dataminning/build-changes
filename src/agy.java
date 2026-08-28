import java.time.Instant;

public record agy(String b, Instant c, long d, eq e, xh.b f) implements zh<agr> {
   public static final yy<vw, agy> a = zh.a(agy::a, agy::new);

   private agy(vw $$0) {
      this($$0.p(), $$0.t(), $$0.readLong(), new eq($$0), new xh.b($$0));
   }

   private void a(vw $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public zj<agy> a() {
      return agp.bq;
   }

   public void a(agr $$0) {
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

   public xh.b h() {
      return this.f;
   }
}
