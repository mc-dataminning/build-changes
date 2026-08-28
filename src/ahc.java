import java.time.Instant;

public record ahc(String b, Instant c, long d, ew e, xv.b f) implements zv<agv> {
   public static final zm<wl, ahc> a = zv.a(ahc::a, ahc::new);

   private ahc(wl $$0) {
      this($$0.p(), $$0.t(), $$0.readLong(), new ew($$0), new xv.b($$0));
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public zx<ahc> a() {
      return agt.bk;
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

   public ew g() {
      return this.e;
   }

   public xv.b h() {
      return this.f;
   }
}
