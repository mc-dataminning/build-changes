import java.time.Instant;

public record agi(String b, Instant c, long d, ex e, xb.b f) implements zb<agb> {
   public static final ys<vr, agi> a = zb.a(agi::a, agi::new);

   private agi(vr $$0) {
      this($$0.p(), $$0.t(), $$0.readLong(), new ex($$0), new xb.b($$0));
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public zd<agi> a() {
      return afz.bk;
   }

   public void a(agb $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   public ex g() {
      return this.e;
   }

   public xb.b h() {
      return this.f;
   }
}
