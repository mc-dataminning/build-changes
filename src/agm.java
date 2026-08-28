import java.time.Instant;

public record agm(String b, Instant c, long d, fe e, ww.b f) implements yw<agf> {
   public static final yn<vl, agm> a = yw.a(agm::a, agm::new);

   private agm(vl $$0) {
      this($$0.p(), $$0.t(), $$0.readLong(), new fe($$0), new ww.b($$0));
   }

   private void a(vl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public yy<agm> a() {
      return agd.bp;
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

   public ww.b h() {
      return this.f;
   }
}
