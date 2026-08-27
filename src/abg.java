import java.util.Optional;

public record abg(int b, ij<bmr> c, int d, int e, Optional<enz> f) implements xx<aag> {
   public static final xo<vb, abg> a = xx.a(abg::a, abg::new);
   private static final xo<vb, ij<bmr>> g = xm.b(kg.r);

   public abg(bnq $$0, bmp $$1) {
      this($$0.aj(), $$1.k(), $$1.d() != null ? $$1.d().aj() : -1, $$1.c() != null ? $$1.c().aj() : -1, Optional.ofNullable($$1.i()));
   }

   private abg(vb $$0) {
      this($$0.n(), g.decode($$0), a((uq)$$0), a((uq)$$0), $$0.b($$0x -> new enz($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(uq $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(uq $$0) {
      return $$0.n() - 1;
   }

   private void a(vb $$0) {
      $$0.c(this.b);
      g.encode($$0, this.c);
      a($$0, this.d);
      a($$0, this.e);
      $$0.a(this.f, ($$0x, $$1) -> {
         $$0x.a($$1.a());
         $$0x.a($$1.b());
         $$0x.a($$1.c());
      });
   }

   @Override
   public xz<abg> a() {
      return aeq.z;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public bmp a(cvr $$0) {
      if (this.f.isPresent()) {
         return new bmp(this.c, this.f.get());
      } else {
         bnq $$1 = $$0.a(this.d);
         bnq $$2 = $$0.a(this.e);
         return new bmp(this.c, $$2, $$1);
      }
   }

   public ij<bmr> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<enz> h() {
      return this.f;
   }
}
