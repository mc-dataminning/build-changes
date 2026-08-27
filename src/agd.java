import java.time.Instant;

public record agd(String b, Instant c, long d, ej e, wz.b f) implements yz<afx> {
   public static final yq<vs, agd> a = yz.a(agd::a, agd::new);

   private agd(vs $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), new ej($$0), new wz.b($$0));
   }

   private void a(vs $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public zb<agd> a() {
      return afv.bi;
   }

   public void a(afx $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   public ej g() {
      return this.e;
   }

   public wz.b h() {
      return this.f;
   }
}
