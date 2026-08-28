import java.util.Optional;

public record adf(int b, jq<btd> c, int d, int e, Optional<ezy> f) implements zq<acf> {
   public static final zh<wu, adf> a = zq.a(adf::a, adf::new);

   public adf(bul $$0, btb $$1) {
      this($$0.ar(), $$1.l(), $$1.d() != null ? $$1.d().ar() : -1, $$1.c() != null ? $$1.c().ar() : -1, Optional.ofNullable($$1.j()));
   }

   private adf(wu $$0) {
      this($$0.l(), btd.c.decode($$0), a((wg)$$0), a((wg)$$0), $$0.b($$0x -> new ezy($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(wg $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(wg $$0) {
      return $$0.l() - 1;
   }

   private void a(wu $$0) {
      $$0.c(this.b);
      btd.c.encode($$0, this.c);
      a($$0, this.d);
      a($$0, this.e);
      $$0.a(this.f, ($$0x, $$1) -> {
         $$0x.a($$1.a());
         $$0x.a($$1.b());
         $$0x.a($$1.c());
      });
   }

   @Override
   public zs<adf> a() {
      return agu.z;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public btb a(dfm $$0) {
      if (this.f.isPresent()) {
         return new btb(this.c, this.f.get());
      } else {
         bul $$1 = $$0.a(this.d);
         bul $$2 = $$0.a(this.e);
         return new btb(this.c, $$2, $$1);
      }
   }

   public jq<btd> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<ezy> h() {
      return this.f;
   }
}
