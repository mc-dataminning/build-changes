import java.util.Optional;

public record ack(int b, iv<bpl> c, int d, int e, Optional<etf> f) implements yz<abk> {
   public static final yq<wd, ack> a = yz.a(ack::a, ack::new);
   private static final yq<wd, iv<bpl>> g = yo.b(ld.s);

   public ack(bql $$0, bpj $$1) {
      this($$0.aj(), $$1.k(), $$1.d() != null ? $$1.d().aj() : -1, $$1.c() != null ? $$1.c().aj() : -1, Optional.ofNullable($$1.i()));
   }

   private ack(wd $$0) {
      this($$0.l(), g.decode($$0), a((vs)$$0), a((vs)$$0), $$0.b($$0x -> new etf($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(vs $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(vs $$0) {
      return $$0.l() - 1;
   }

   private void a(wd $$0) {
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
   public zb<ack> a() {
      return afv.z;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public bpj a(czu $$0) {
      if (this.f.isPresent()) {
         return new bpj(this.c, this.f.get());
      } else {
         bql $$1 = $$0.a(this.d);
         bql $$2 = $$0.a(this.e);
         return new bpj(this.c, $$2, $$1);
      }
   }

   public iv<bpl> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<etf> h() {
      return this.f;
   }
}
