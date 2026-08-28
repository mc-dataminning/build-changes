import java.time.Instant;

public record aht(String b, Instant c, long d, fd e, yc.b f) implements aac<ahm> {
   public static final zt<ws, aht> a = aac.a(aht::a, aht::new);

   private aht(ws $$0) {
      this($$0.p(), $$0.t(), $$0.readLong(), new fd($$0), new yc.b($$0));
   }

   private void a(ws $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public aae<aht> a() {
      return ahk.bq;
   }

   public void a(ahm $$0) {
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

   public yc.b h() {
      return this.f;
   }
}
