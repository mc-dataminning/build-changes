import java.time.Instant;

public record ahi(String b, Instant c, long d, fd e, xr.b f) implements zr<ahb> {
   public static final zi<wh, ahi> a = zr.a(ahi::a, ahi::new);

   private ahi(wh $$0) {
      this($$0.p(), $$0.t(), $$0.readLong(), new fd($$0), new xr.b($$0));
   }

   private void a(wh $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public zt<ahi> a() {
      return agz.bq;
   }

   public void a(ahb $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   public fd g() {
      return this.e;
   }

   public xr.b h() {
      return this.f;
   }
}
