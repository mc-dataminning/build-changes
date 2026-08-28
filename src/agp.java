import java.time.Instant;

public record agp(String b, Instant c, long d, fa e, xg.b f) implements zg<agi> {
   public static final yx<vw, agp> a = zg.a(agp::a, agp::new);

   private agp(vw $$0) {
      this($$0.p(), $$0.t(), $$0.readLong(), new fa($$0), new xg.b($$0));
   }

   private void a(vw $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public zi<agp> a() {
      return agg.bk;
   }

   public void a(agi $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   public fa g() {
      return this.e;
   }

   public xg.b h() {
      return this.f;
   }
}
