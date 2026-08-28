import java.time.Instant;

public record agu(String b, Instant c, long d, ep e, xd.b f) implements zd<agn> {
   public static final yu<vs, agu> a = zd.a(agu::a, agu::new);

   private agu(vs $$0) {
      this($$0.p(), $$0.t(), $$0.readLong(), new ep($$0), new xd.b($$0));
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public zf<agu> a() {
      return agl.bq;
   }

   public void a(agn $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   public ep g() {
      return this.e;
   }

   public xd.b h() {
      return this.f;
   }
}
