import java.time.Instant;

public record afr(String b, Instant c, long d, eb e, wn.b f) implements yn<afl> {
   public static final ye<vg, afr> a = yn.a(afr::a, afr::new);

   private afr(vg $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), new eb($$0), new wn.b($$0));
   }

   private void a(vg $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public yp<afr> a() {
      return afj.bi;
   }

   public void a(afl $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   public eb g() {
      return this.e;
   }

   public wn.b h() {
      return this.f;
   }
}
