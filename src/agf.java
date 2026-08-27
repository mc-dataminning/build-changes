import java.time.Instant;

public record agf(String b, Instant c, long d, ek e, xb.b f) implements zb<afz> {
   public static final ys<vu, agf> a = zb.a(agf::a, agf::new);

   private agf(vu $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), new ek($$0), new xb.b($$0));
   }

   private void a(vu $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public zd<agf> a() {
      return afx.bi;
   }

   public void a(afz $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   public ek g() {
      return this.e;
   }

   public xb.b h() {
      return this.f;
   }
}
