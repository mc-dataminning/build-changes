import java.time.Instant;

public record agy(String b, Instant c, long d, fb e, xl.b f) implements zl<agr> {
   public static final zc<wb, agy> a = zl.a(agy::a, agy::new);

   private agy(wb $$0) {
      this($$0.p(), $$0.t(), $$0.readLong(), new fb($$0), new xl.b($$0));
   }

   private void a(wb $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public zn<agy> a() {
      return agp.bm;
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

   public fb g() {
      return this.e;
   }

   public xl.b h() {
      return this.f;
   }
}
