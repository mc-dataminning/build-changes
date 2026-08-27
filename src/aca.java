import java.util.Optional;

public record aca(int b, in<bpa> c, int d, int e, Optional<esj> f) implements yp<aba> {
   public static final yg<vt, aca> a = yp.a(aca::a, aca::new);
   private static final yg<vt, in<bpa>> g = ye.b(ku.s);

   public aca(bqa $$0, boy $$1) {
      this($$0.aj(), $$1.k(), $$1.d() != null ? $$1.d().aj() : -1, $$1.c() != null ? $$1.c().aj() : -1, Optional.ofNullable($$1.i()));
   }

   private aca(vt $$0) {
      this($$0.l(), g.decode($$0), a((vi)$$0), a((vi)$$0), $$0.b($$0x -> new esj($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(vi $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(vi $$0) {
      return $$0.l() - 1;
   }

   private void a(vt $$0) {
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
   public yr<aca> a() {
      return afl.z;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public boy a(czg $$0) {
      if (this.f.isPresent()) {
         return new boy(this.c, this.f.get());
      } else {
         bqa $$1 = $$0.a(this.d);
         bqa $$2 = $$0.a(this.e);
         return new boy(this.c, $$2, $$1);
      }
   }

   public in<bpa> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<esj> h() {
      return this.f;
   }
}
