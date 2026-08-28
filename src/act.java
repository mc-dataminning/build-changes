import java.util.Optional;

public record act(int b, je<buu> c, int d, int e, Optional<fei> f) implements zf<abu> {
   public static final yw<wj, act> a = zf.a(act::a, act::new);

   public act(bwd $$0, bus $$1) {
      this($$0.ar(), $$1.l(), $$1.d() != null ? $$1.d().ar() : -1, $$1.c() != null ? $$1.c().ar() : -1, Optional.ofNullable($$1.j()));
   }

   private act(wj $$0) {
      this($$0.l(), buu.c.decode($$0), a((vu)$$0), a((vu)$$0), $$0.b($$0x -> new fei($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(vu $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(vu $$0) {
      return $$0.l() - 1;
   }

   private void a(wj $$0) {
      $$0.c(this.b);
      buu.c.encode($$0, this.c);
      a($$0, this.d);
      a($$0, this.e);
      $$0.a(this.f, ($$0x, $$1) -> {
         $$0x.a($$1.a());
         $$0x.a($$1.b());
         $$0x.a($$1.c());
      });
   }

   @Override
   public zh<act> a() {
      return agn.y;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public bus a(div $$0) {
      if (this.f.isPresent()) {
         return new bus(this.c, this.f.get());
      } else {
         bwd $$1 = $$0.a(this.d);
         bwd $$2 = $$0.a(this.e);
         return new bus(this.c, $$2, $$1);
      }
   }

   public je<buu> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<fei> h() {
      return this.f;
   }
}
