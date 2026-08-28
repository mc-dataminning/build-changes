import java.time.Instant;

public record agx(String b, Instant c, long d, fa e, xk.b f) implements zk<agq> {
   public static final zb<wa, agx> a = zk.a(agx::a, agx::new);

   private agx(wa $$0) {
      this($$0.p(), $$0.t(), $$0.readLong(), new fa($$0), new xk.b($$0));
   }

   private void a(wa $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public zm<agx> a() {
      return ago.bm;
   }

   public void a(agq $$0) {
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

   public xk.b h() {
      return this.f;
   }
}
