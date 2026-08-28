import java.time.Instant;

public record ahd(String b, Instant c, long d, ew e, xw.b f) implements zw<agw> {
   public static final zn<wm, ahd> a = zw.a(ahd::a, ahd::new);

   private ahd(wm $$0) {
      this($$0.p(), $$0.t(), $$0.readLong(), new ew($$0), new xw.b($$0));
   }

   private void a(wm $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public zy<ahd> a() {
      return agu.bk;
   }

   public void a(agw $$0) {
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

   public xw.b h() {
      return this.f;
   }
}
