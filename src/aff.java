import java.time.Instant;

public record aff(String b, Instant c, long d, eb e, wb.b f) implements yb<aez> {
   public static final xs<uu, aff> a = yb.a(aff::a, aff::new);

   private aff(uu $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), new eb($$0), new wb.b($$0));
   }

   private void a(uu $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public yd<aff> a() {
      return aex.bi;
   }

   public void a(aez $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   public eb g() {
      return this.e;
   }

   public wb.b h() {
      return this.f;
   }
}
