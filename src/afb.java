import java.time.Instant;

public record afb(String b, Instant c, long d, eb e, vz.b f) implements xz<aev> {
   public static final xq<us, afb> a = xz.a(afb::a, afb::new);

   private afb(us $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), new eb($$0), new vz.b($$0));
   }

   private void a(us $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public yb<afb> a() {
      return aet.bi;
   }

   public void a(aev $$0) {
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

   public vz.b h() {
      return this.f;
   }
}
