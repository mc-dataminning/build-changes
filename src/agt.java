import java.time.Instant;

public record agt(String b, Instant c, long d, fe e, xc.b f) implements zc<agm> {
   public static final yt<vr, agt> a = zc.a(agt::a, agt::new);

   private agt(vr $$0) {
      this($$0.p(), $$0.t(), $$0.readLong(), new fe($$0), new xc.b($$0));
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public ze<agt> a() {
      return agk.bq;
   }

   public void a(agm $$0) {
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

   public xc.b h() {
      return this.f;
   }
}
