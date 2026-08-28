import java.time.Instant;

public record ahd(String b, Instant c, long d, fd e, xq.b f) implements zq<agw> {
   public static final zh<wg, ahd> a = zq.a(ahd::a, ahd::new);

   private ahd(wg $$0) {
      this($$0.p(), $$0.t(), $$0.readLong(), new fd($$0), new xq.b($$0));
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public zs<ahd> a() {
      return agu.bm;
   }

   public void a(agw $$0) {
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

   public xq.b h() {
      return this.f;
   }
}
