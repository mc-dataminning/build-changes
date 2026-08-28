import java.time.Instant;

public record ahc(String b, Instant c, long d, fd e, xp.b f) implements zp<agv> {
   public static final zg<wf, ahc> a = zp.a(ahc::a, ahc::new);

   private ahc(wf $$0) {
      this($$0.p(), $$0.t(), $$0.readLong(), new fd($$0), new xp.b($$0));
   }

   private void a(wf $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public zr<ahc> a() {
      return agt.bm;
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   public fd g() {
      return this.e;
   }

   public xp.b h() {
      return this.f;
   }
}
