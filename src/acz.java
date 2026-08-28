import java.util.Optional;

public record acz(int b, jn<bsd> c, int d, int e, Optional<eye> f) implements zk<abz> {
   public static final zb<wo, acz> a = zk.a(acz::a, acz::new);

   public acz(btj $$0, bsb $$1) {
      this($$0.ap(), $$1.l(), $$1.d() != null ? $$1.d().ap() : -1, $$1.c() != null ? $$1.c().ap() : -1, Optional.ofNullable($$1.j()));
   }

   private acz(wo $$0) {
      this($$0.l(), bsd.c.decode($$0), a((wa)$$0), a((wa)$$0), $$0.b($$0x -> new eye($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(wa $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(wa $$0) {
      return $$0.l() - 1;
   }

   private void a(wo $$0) {
      $$0.c(this.b);
      bsd.c.encode($$0, this.c);
      a($$0, this.d);
      a($$0, this.e);
      $$0.a(this.f, ($$0x, $$1) -> {
         $$0x.a($$1.a());
         $$0x.a($$1.b());
         $$0x.a($$1.c());
      });
   }

   @Override
   public zm<acz> a() {
      return ago.z;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public bsb a(dds $$0) {
      if (this.f.isPresent()) {
         return new bsb(this.c, this.f.get());
      } else {
         btj $$1 = $$0.a(this.d);
         btj $$2 = $$0.a(this.e);
         return new bsb(this.c, $$2, $$1);
      }
   }

   public jn<bsd> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<eye> h() {
      return this.f;
   }
}
