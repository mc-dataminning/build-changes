import java.time.Instant;

public record agk(String b, Instant c, long d, el e, xe.b f) implements ze<agd> {
   public static final yv<vx, agk> a = ze.a(agk::a, agk::new);

   private agk(vx $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), new el($$0), new xe.b($$0));
   }

   private void a(vx $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public zg<agk> a() {
      return agb.bj;
   }

   public void a(agd $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   public el g() {
      return this.e;
   }

   public xe.b h() {
      return this.f;
   }
}
