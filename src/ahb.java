import java.time.Instant;

public record ahb(String b, Instant c, long d, fc e, xo.b f) implements zo<agu> {
   public static final zf<we, ahb> a = zo.a(ahb::a, ahb::new);

   private ahb(we $$0) {
      this($$0.p(), $$0.t(), $$0.readLong(), new fc($$0), new xo.b($$0));
   }

   private void a(we $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public zq<ahb> a() {
      return ags.bm;
   }

   public void a(agu $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   public fc g() {
      return this.e;
   }

   public xo.b h() {
      return this.f;
   }
}
