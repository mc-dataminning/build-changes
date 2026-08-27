import java.util.Optional;

public class adp implements xx<aag> {
   public static final xo<vb, adp> a = xx.a(adp::a, adp::new);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   private final String e;
   private final vq f;
   private final eoz.a g;
   private final Optional<xg> h;
   private final int i;

   public adp(eoo $$0, int $$1) {
      this.e = $$0.b();
      this.f = $$0.d();
      this.g = $$0.h();
      this.h = Optional.ofNullable($$0.f());
      this.i = $$1;
   }

   private adp(vb $$0) {
      this.e = $$0.r();
      this.i = $$0.readByte();
      if (this.i != 0 && this.i != 2) {
         this.f = vp.a;
         this.g = eoz.a.a;
         this.h = Optional.empty();
      } else {
         this.f = $$0.m();
         this.g = $$0.b(eoz.a.class);
         this.h = xi.d.decode($$0);
      }
   }

   private void a(vb $$0) {
      $$0.a(this.e);
      $$0.k(this.i);
      if (this.i == 0 || this.i == 2) {
         $$0.a(this.f);
         $$0.a(this.g);
         xi.d.encode($$0, this.h);
      }
   }

   @Override
   public xz<adp> a() {
      return aeq.aH;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.e;
   }

   public vq e() {
      return this.f;
   }

   public int f() {
      return this.i;
   }

   public eoz.a g() {
      return this.g;
   }

   public Optional<xg> h() {
      return this.h;
   }
}
