import java.util.Optional;

public record adr(int b, jq<buc> c, int d, int e, Optional<fby> f) implements aac<acr> {
   public static final zt<xg, adr> a = aac.a(adr::a, adr::new);

   public adr(bvk $$0, bua $$1) {
      this($$0.ar(), $$1.l(), $$1.d() != null ? $$1.d().ar() : -1, $$1.c() != null ? $$1.c().ar() : -1, Optional.ofNullable($$1.j()));
   }

   private adr(xg $$0) {
      this($$0.l(), buc.c.decode($$0), a((ws)$$0), a((ws)$$0), $$0.b($$0x -> new fby($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(ws $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(ws $$0) {
      return $$0.l() - 1;
   }

   private void a(xg $$0) {
      $$0.c(this.b);
      buc.c.encode($$0, this.c);
      a($$0, this.d);
      a($$0, this.e);
      $$0.a(this.f, ($$0x, $$1) -> {
         $$0x.a($$1.a());
         $$0x.a($$1.b());
         $$0x.a($$1.c());
      });
   }

   @Override
   public aae<adr> a() {
      return ahk.z;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public bua a(dhi $$0) {
      if (this.f.isPresent()) {
         return new bua(this.c, this.f.get());
      } else {
         bvk $$1 = $$0.a(this.d);
         bvk $$2 = $$0.a(this.e);
         return new bua(this.c, $$2, $$1);
      }
   }

   public jq<buc> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<fby> h() {
      return this.f;
   }
}
