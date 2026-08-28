import java.util.Optional;

public record adr(int b, jq<btx> c, int d, int e, Optional<fbs> f) implements aac<acr> {
   public static final zt<xg, adr> a = aac.a(adr::a, adr::new);

   public adr(bvf $$0, btv $$1) {
      this($$0.ar(), $$1.l(), $$1.d() != null ? $$1.d().ar() : -1, $$1.c() != null ? $$1.c().ar() : -1, Optional.ofNullable($$1.j()));
   }

   private adr(xg $$0) {
      this($$0.l(), btx.c.decode($$0), a((ws)$$0), a((ws)$$0), $$0.b($$0x -> new fbs($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(ws $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(ws $$0) {
      return $$0.l() - 1;
   }

   private void a(xg $$0) {
      $$0.c(this.b);
      btx.c.encode($$0, this.c);
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

   public btv a(dha $$0) {
      if (this.f.isPresent()) {
         return new btv(this.c, this.f.get());
      } else {
         bvf $$1 = $$0.a(this.d);
         bvf $$2 = $$0.a(this.e);
         return new btv(this.c, $$2, $$1);
      }
   }

   public jq<btx> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<fbs> h() {
      return this.f;
   }
}
