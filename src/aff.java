import java.util.Optional;

public class aff implements zg<abu> {
   public static final yx<wk, aff> a = zg.a(aff::a, aff::new);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   private final String e;
   private final wz f;
   private final eyj.a g;
   private final Optional<yp> h;
   private final int i;

   public aff(exy $$0, int $$1) {
      this.e = $$0.b();
      this.f = $$0.d();
      this.g = $$0.h();
      this.h = Optional.ofNullable($$0.f());
      this.i = $$1;
   }

   private aff(wk $$0) {
      this.e = $$0.p();
      this.i = $$0.readByte();
      if (this.i != 0 && this.i != 2) {
         this.f = wy.a;
         this.g = eyj.a.a;
         this.h = Optional.empty();
      } else {
         this.f = xb.d.decode($$0);
         this.g = $$0.b(eyj.a.class);
         this.h = yr.d.decode($$0);
      }
   }

   private void a(wk $$0) {
      $$0.a(this.e);
      $$0.k(this.i);
      if (this.i == 0 || this.i == 2) {
         xb.d.encode($$0, this.f);
         $$0.a(this.g);
         yr.d.encode($$0, this.h);
      }
   }

   @Override
   public zi<aff> a() {
      return agg.aI;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.e;
   }

   public wz e() {
      return this.f;
   }

   public int f() {
      return this.i;
   }

   public eyj.a g() {
      return this.g;
   }

   public Optional<yp> h() {
      return this.h;
   }
}
