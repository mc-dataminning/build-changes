import java.time.Instant;

public record agr(String b, Instant c, long d, eo e, xl.b f) implements zl<agl> {
   public static final zc<we, agr> a = zl.a(agr::a, agr::new);

   private agr(we $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), new eo($$0), new xl.b($$0));
   }

   private void a(we $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public zn<agr> a() {
      return agj.bk;
   }

   public void a(agl $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   public eo g() {
      return this.e;
   }

   public xl.b h() {
      return this.f;
   }
}
