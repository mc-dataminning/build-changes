import java.util.Optional;

public record act(int b, je<buw> c, int d, int e, Optional<feq> f) implements zf<abu> {
   public static final yw<wj, act> a = zf.a(act::a, act::new);

   public act(bwf $$0, buu $$1) {
      this($$0.ar(), $$1.l(), $$1.d() != null ? $$1.d().ar() : -1, $$1.c() != null ? $$1.c().ar() : -1, Optional.ofNullable($$1.j()));
   }

   private act(wj $$0) {
      this($$0.l(), buw.c.decode($$0), a((vu)$$0), a((vu)$$0), $$0.b($$0x -> new feq($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(vu $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(vu $$0) {
      return $$0.l() - 1;
   }

   private void a(wj $$0) {
      $$0.c(this.b);
      buw.c.encode($$0, this.c);
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

   public buu a(dja $$0) {
      if (this.f.isPresent()) {
         return new buu(this.c, this.f.get());
      } else {
         bwf $$1 = $$0.a(this.d);
         bwf $$2 = $$0.a(this.e);
         return new buu(this.c, $$2, $$1);
      }
   }

   public je<buw> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<feq> h() {
      return this.f;
   }
}
