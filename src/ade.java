import java.util.Optional;

public record ade(int b, ji<brk> c, int d, int e, Optional<evm> f) implements zs<ace> {
   public static final zj<ww, ade> a = zs.a(ade::a, ade::new);
   private static final zj<ww, ji<brk>> g = zh.b(lq.s);

   public ade(bsp $$0, bri $$1) {
      this($$0.al(), $$1.k(), $$1.d() != null ? $$1.d().al() : -1, $$1.c() != null ? $$1.c().al() : -1, Optional.ofNullable($$1.i()));
   }

   private ade(ww $$0) {
      this($$0.l(), g.decode($$0), a((wl)$$0), a((wl)$$0), $$0.b($$0x -> new evm($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(wl $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(wl $$0) {
      return $$0.l() - 1;
   }

   private void a(ww $$0) {
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
   public zu<ade> a() {
      return agq.z;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public bri a(dbt $$0) {
      if (this.f.isPresent()) {
         return new bri(this.c, this.f.get());
      } else {
         bsp $$1 = $$0.a(this.d);
         bsp $$2 = $$0.a(this.e);
         return new bri(this.c, $$2, $$1);
      }
   }

   public ji<brk> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<evm> h() {
      return this.f;
   }
}
