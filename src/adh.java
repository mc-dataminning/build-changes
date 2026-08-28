import java.util.Optional;

public record adh(int b, jq<bta> c, int d, int e, Optional<ezr> f) implements zs<ach> {
   public static final zj<ww, adh> a = zs.a(adh::a, adh::new);

   public adh(bui $$0, bsy $$1) {
      this($$0.as(), $$1.l(), $$1.d() != null ? $$1.d().as() : -1, $$1.c() != null ? $$1.c().as() : -1, Optional.ofNullable($$1.j()));
   }

   private adh(ww $$0) {
      this($$0.l(), bta.c.decode($$0), a((wi)$$0), a((wi)$$0), $$0.b($$0x -> new ezr($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(wi $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(wi $$0) {
      return $$0.l() - 1;
   }

   private void a(ww $$0) {
      $$0.c(this.b);
      bta.c.encode($$0, this.c);
      a($$0, this.d);
      a($$0, this.e);
      $$0.a(this.f, ($$0x, $$1) -> {
         $$0x.a($$1.a());
         $$0x.a($$1.b());
         $$0x.a($$1.c());
      });
   }

   @Override
   public zu<adh> a() {
      return agw.z;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public bsy a(dff $$0) {
      if (this.f.isPresent()) {
         return new bsy(this.c, this.f.get());
      } else {
         bui $$1 = $$0.a(this.d);
         bui $$2 = $$0.a(this.e);
         return new bsy(this.c, $$2, $$1);
      }
   }

   public jq<bta> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<ezr> h() {
      return this.f;
   }
}
