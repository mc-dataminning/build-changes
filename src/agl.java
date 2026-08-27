import java.time.Instant;

public record agl(String b, Instant c, long d, el e, xe.b f) implements ze<age> {
   public static final yv<vx, agl> a = ze.a(agl::a, agl::new);

   private agl(vx $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), new el($$0), new xe.b($$0));
   }

   private void a(vx $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public zg<agl> a() {
      return agc.bk;
   }

   public void a(age $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   public el g() {
      return this.e;
   }

   public xe.b h() {
      return this.f;
   }
}
