import java.util.Optional;

public record adg(int b, jq<btt> c, int d, int e, Optional<fbr> f) implements zr<acg> {
   public static final zi<wv, adg> a = zr.a(adg::a, adg::new);

   public adg(bvb $$0, btr $$1) {
      this($$0.ar(), $$1.l(), $$1.d() != null ? $$1.d().ar() : -1, $$1.c() != null ? $$1.c().ar() : -1, Optional.ofNullable($$1.j()));
   }

   private adg(wv $$0) {
      this($$0.l(), btt.c.decode($$0), a((wh)$$0), a((wh)$$0), $$0.b($$0x -> new fbr($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(wh $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(wh $$0) {
      return $$0.l() - 1;
   }

   private void a(wv $$0) {
      $$0.c(this.b);
      btt.c.encode($$0, this.c);
      a($$0, this.d);
      a($$0, this.e);
      $$0.a(this.f, ($$0x, $$1) -> {
         $$0x.a($$1.a());
         $$0x.a($$1.b());
         $$0x.a($$1.c());
      });
   }

   @Override
   public zt<adg> a() {
      return agz.z;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public btr a(dgz $$0) {
      if (this.f.isPresent()) {
         return new btr(this.c, this.f.get());
      } else {
         bvb $$1 = $$0.a(this.d);
         bvb $$2 = $$0.a(this.e);
         return new btr(this.c, $$2, $$1);
      }
   }

   public jq<btt> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<fbr> h() {
      return this.f;
   }
}
