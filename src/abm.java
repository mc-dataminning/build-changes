import java.util.Optional;

public record abm(int b, il<bny> c, int d, int e, Optional<ept> f) implements yb<aam> {
   public static final xs<vf, abm> a = yb.a(abm::a, abm::new);
   private static final xs<vf, il<bny>> g = xq.b(kj.r);

   public abm(box $$0, bnw $$1) {
      this($$0.aj(), $$1.k(), $$1.d() != null ? $$1.d().aj() : -1, $$1.c() != null ? $$1.c().aj() : -1, Optional.ofNullable($$1.i()));
   }

   private abm(vf $$0) {
      this($$0.l(), g.decode($$0), a((uu)$$0), a((uu)$$0), $$0.b($$0x -> new ept($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(uu $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(uu $$0) {
      return $$0.l() - 1;
   }

   private void a(vf $$0) {
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
   public yd<abm> a() {
      return aex.z;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public bnw a(cxb $$0) {
      if (this.f.isPresent()) {
         return new bnw(this.c, this.f.get());
      } else {
         box $$1 = $$0.a(this.d);
         box $$2 = $$0.a(this.e);
         return new bnw(this.c, $$2, $$1);
      }
   }

   public il<bny> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<ept> h() {
      return this.f;
   }
}
