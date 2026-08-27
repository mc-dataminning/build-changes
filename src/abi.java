import java.util.Optional;

public record abi(int b, il<bng> c, int d, int e, Optional<eov> f) implements xz<aai> {
   public static final xq<vd, abi> a = xz.a(abi::a, abi::new);
   private static final xq<vd, il<bng>> g = xo.b(ki.r);

   public abi(bof $$0, bne $$1) {
      this($$0.aj(), $$1.k(), $$1.d() != null ? $$1.d().aj() : -1, $$1.c() != null ? $$1.c().aj() : -1, Optional.ofNullable($$1.i()));
   }

   private abi(vd $$0) {
      this($$0.l(), g.decode($$0), a((us)$$0), a((us)$$0), $$0.b($$0x -> new eov($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(us $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(us $$0) {
      return $$0.l() - 1;
   }

   private void a(vd $$0) {
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
   public yb<abi> a() {
      return aet.z;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public bne a(cwe $$0) {
      if (this.f.isPresent()) {
         return new bne(this.c, this.f.get());
      } else {
         bof $$1 = $$0.a(this.d);
         bof $$2 = $$0.a(this.e);
         return new bne(this.c, $$2, $$1);
      }
   }

   public il<bng> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<eov> h() {
      return this.f;
   }
}
