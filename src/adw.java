import java.util.Optional;

public class adw implements yb<aam> {
   public static final xs<vf, adw> a = yb.a(adw::a, adw::new);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   private final String e;
   private final vu f;
   private final era.a g;
   private final Optional<xk> h;
   private final int i;

   public adw(eqp $$0, int $$1) {
      this.e = $$0.b();
      this.f = $$0.d();
      this.g = $$0.h();
      this.h = Optional.ofNullable($$0.f());
      this.i = $$1;
   }

   private adw(vf $$0) {
      this.e = $$0.p();
      this.i = $$0.readByte();
      if (this.i != 0 && this.i != 2) {
         this.f = vt.a;
         this.g = era.a.a;
         this.h = Optional.empty();
      } else {
         this.f = vw.b.decode($$0);
         this.g = $$0.b(era.a.class);
         this.h = xm.d.decode($$0);
      }
   }

   private void a(vf $$0) {
      $$0.a(this.e);
      $$0.k(this.i);
      if (this.i == 0 || this.i == 2) {
         vw.b.encode($$0, this.f);
         $$0.a(this.g);
         xm.d.encode($$0, this.h);
      }
   }

   @Override
   public yd<adw> a() {
      return aex.aI;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.e;
   }

   public vu e() {
      return this.f;
   }

   public int f() {
      return this.i;
   }

   public era.a g() {
      return this.g;
   }

   public Optional<xk> h() {
      return this.h;
   }
}
