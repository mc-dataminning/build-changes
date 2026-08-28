import java.util.Optional;

public record acu(int b, jm<brm> c, int d, int e, Optional<exc> f) implements zg<abu> {
   public static final yx<wk, acu> a = zg.a(acu::a, acu::new);

   public acu(bsr $$0, brk $$1) {
      this($$0.an(), $$1.l(), $$1.d() != null ? $$1.d().an() : -1, $$1.c() != null ? $$1.c().an() : -1, Optional.ofNullable($$1.j()));
   }

   private acu(wk $$0) {
      this($$0.l(), brm.c.decode($$0), a((vw)$$0), a((vw)$$0), $$0.b($$0x -> new exc($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(vw $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(vw $$0) {
      return $$0.l() - 1;
   }

   private void a(wk $$0) {
      $$0.c(this.b);
      brm.c.encode($$0, this.c);
      a($$0, this.d);
      a($$0, this.e);
      $$0.a(this.f, ($$0x, $$1) -> {
         $$0x.a($$1.a());
         $$0x.a($$1.b());
         $$0x.a($$1.c());
      });
   }

   @Override
   public zi<acu> a() {
      return agg.z;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public brk a(dcw $$0) {
      if (this.f.isPresent()) {
         return new brk(this.c, this.f.get());
      } else {
         bsr $$1 = $$0.a(this.d);
         bsr $$2 = $$0.a(this.e);
         return new brk(this.c, $$2, $$1);
      }
   }

   public jm<brm> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<exc> h() {
      return this.f;
   }
}
