import java.util.Optional;

public record act(int b, jm<brl> c, int d, int e, Optional<eww> f) implements zf<abt> {
   public static final yw<wj, act> a = zf.a(act::a, act::new);

   public act(bsq $$0, brj $$1) {
      this($$0.an(), $$1.k(), $$1.d() != null ? $$1.d().an() : -1, $$1.c() != null ? $$1.c().an() : -1, Optional.ofNullable($$1.i()));
   }

   private act(wj $$0) {
      this($$0.l(), brl.c.decode($$0), a((vv)$$0), a((vv)$$0), $$0.b($$0x -> new eww($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(vv $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(vv $$0) {
      return $$0.l() - 1;
   }

   private void a(wj $$0) {
      $$0.c(this.b);
      brl.c.encode($$0, this.c);
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
      return agf.z;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public brj a(dcu $$0) {
      if (this.f.isPresent()) {
         return new brj(this.c, this.f.get());
      } else {
         bsq $$1 = $$0.a(this.d);
         bsq $$2 = $$0.a(this.e);
         return new brj(this.c, $$2, $$1);
      }
   }

   public jm<brl> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<eww> h() {
      return this.f;
   }
}
