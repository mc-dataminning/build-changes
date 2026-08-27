import java.util.Optional;

public class ads implements xz<aai> {
   public static final xq<vd, ads> a = xz.a(ads::a, ads::new);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   private final String e;
   private final vs f;
   private final eqc.a g;
   private final Optional<xi> h;
   private final int i;

   public ads(epr $$0, int $$1) {
      this.e = $$0.b();
      this.f = $$0.d();
      this.g = $$0.h();
      this.h = Optional.ofNullable($$0.f());
      this.i = $$1;
   }

   private ads(vd $$0) {
      this.e = $$0.p();
      this.i = $$0.readByte();
      if (this.i != 0 && this.i != 2) {
         this.f = vr.a;
         this.g = eqc.a.a;
         this.h = Optional.empty();
      } else {
         this.f = vu.b.decode($$0);
         this.g = $$0.b(eqc.a.class);
         this.h = xk.d.decode($$0);
      }
   }

   private void a(vd $$0) {
      $$0.a(this.e);
      $$0.k(this.i);
      if (this.i == 0 || this.i == 2) {
         vu.b.encode($$0, this.f);
         $$0.a(this.g);
         xk.d.encode($$0, this.h);
      }
   }

   @Override
   public yb<ads> a() {
      return aet.aI;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.e;
   }

   public vs e() {
      return this.f;
   }

   public int f() {
      return this.i;
   }

   public eqc.a g() {
      return this.g;
   }

   public Optional<xi> h() {
      return this.h;
   }
}
