import java.util.Optional;

public record adi(int b, ji<brr> c, int d, int e, Optional<evt> f) implements zw<aci> {
   public static final zn<xa, adi> a = zw.a(adi::a, adi::new);
   private static final zn<xa, ji<brr>> g = zl.b(lq.s);

   public adi(bsw $$0, brp $$1) {
      this($$0.al(), $$1.k(), $$1.d() != null ? $$1.d().al() : -1, $$1.c() != null ? $$1.c().al() : -1, Optional.ofNullable($$1.i()));
   }

   private adi(xa $$0) {
      this($$0.l(), g.decode($$0), a((wm)$$0), a((wm)$$0), $$0.b($$0x -> new evt($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(wm $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(wm $$0) {
      return $$0.l() - 1;
   }

   private void a(xa $$0) {
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
   public zy<adi> a() {
      return agu.z;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public brp a(dca $$0) {
      if (this.f.isPresent()) {
         return new brp(this.c, this.f.get());
      } else {
         bsw $$1 = $$0.a(this.d);
         bsw $$2 = $$0.a(this.e);
         return new brp(this.c, $$2, $$1);
      }
   }

   public ji<brr> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<evt> h() {
      return this.f;
   }
}
