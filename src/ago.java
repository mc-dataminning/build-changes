import java.time.Instant;

public record ago(String b, Instant c, long d, fa e, xf.b f) implements zf<agh> {
   public static final yw<vv, ago> a = zf.a(ago::a, ago::new);

   private ago(vv $$0) {
      this($$0.p(), $$0.t(), $$0.readLong(), new fa($$0), new xf.b($$0));
   }

   private void a(vv $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public zh<ago> a() {
      return agf.bk;
   }

   public void a(agh $$0) {
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

   public xf.b h() {
      return this.f;
   }
}
