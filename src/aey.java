import java.time.Instant;

public record aey(String b, Instant c, long d, eb e, vx.b f) implements xx<aes> {
   public static final xo<uq, aey> a = xx.a(aey::a, aey::new);

   private aey(uq $$0) {
      this($$0.d(256), $$0.v(), $$0.readLong(), new eb($$0), new vx.b($$0));
   }

   private void a(uq $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public xz<aey> a() {
      return aeq.bh;
   }

   public void a(aes $$0) {
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

   public vx.b h() {
      return this.f;
   }
}
