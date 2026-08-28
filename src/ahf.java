import java.time.Instant;

public record ahf(String b, Instant c, long d, fd e, xs.b f) implements zs<agy> {
   public static final zj<wi, ahf> a = zs.a(ahf::a, ahf::new);

   private ahf(wi $$0) {
      this($$0.p(), $$0.t(), $$0.readLong(), new fd($$0), new xs.b($$0));
   }

   private void a(wi $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public zu<ahf> a() {
      return agw.bm;
   }

   public void a(agy $$0) {
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

   public xs.b h() {
      return this.f;
   }
}
