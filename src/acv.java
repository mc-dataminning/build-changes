import java.util.Optional;

public record acv(int b, jf<bvk> c, int d, int e, Optional<ffq> f) implements zh<abw> {
   public static final yy<wl, acv> a = zh.a(acv::a, acv::new);

   public acv(bwt $$0, bvi $$1) {
      this($$0.ao(), $$1.l(), $$1.d() != null ? $$1.d().ao() : -1, $$1.c() != null ? $$1.c().ao() : -1, Optional.ofNullable($$1.j()));
   }

   private acv(wl $$0) {
      this($$0.l(), bvk.c.decode($$0), a((vw)$$0), a((vw)$$0), $$0.b($$0x -> new ffq($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(vw $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(vw $$0) {
      return $$0.l() - 1;
   }

   private void a(wl $$0) {
      $$0.c(this.b);
      bvk.c.encode($$0, this.c);
      a($$0, this.d);
      a($$0, this.e);
      $$0.a(this.f, ($$0x, $$1) -> {
         $$0x.a($$1.a());
         $$0x.a($$1.b());
         $$0x.a($$1.c());
      });
   }

   @Override
   public zj<acv> a() {
      return agp.y;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public bvi a(djx $$0) {
      if (this.f.isPresent()) {
         return new bvi(this.c, this.f.get());
      } else {
         bwt $$1 = $$0.a(this.d);
         bwt $$2 = $$0.a(this.e);
         return new bvi(this.c, $$2, $$1);
      }
   }

   public jf<bvk> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<ffq> h() {
      return this.f;
   }
}
