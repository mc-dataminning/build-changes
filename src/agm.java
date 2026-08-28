import java.time.Instant;

public record agm(String b, Instant c, long d, fe e, wv.b f) implements yv<agf> {
   public static final ym<vl, agm> a = yv.a(agm::a, agm::new);

   private agm(vl $$0) {
      this($$0.p(), $$0.t(), $$0.readLong(), new fe($$0), new wv.b($$0));
   }

   private void a(vl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public yx<agm> a() {
      return agd.bq;
   }

   public void a(agf $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   public fe g() {
      return this.e;
   }

   public wv.b h() {
      return this.f;
   }
}
