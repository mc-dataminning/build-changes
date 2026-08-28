import java.util.Optional;

public record acx(int b, jg<bvm> c, int d, int e, Optional<ffs> f) implements zj<aby> {
   public static final za<wn, acx> a = zj.a(acx::a, acx::new);

   public acx(bwv $$0, bvk $$1) {
      this($$0.ao(), $$1.l(), $$1.d() != null ? $$1.d().ao() : -1, $$1.c() != null ? $$1.c().ao() : -1, Optional.ofNullable($$1.j()));
   }

   private acx(wn $$0) {
      this($$0.l(), bvm.c.decode($$0), a((vy)$$0), a((vy)$$0), $$0.b($$0x -> new ffs($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(vy $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(vy $$0) {
      return $$0.l() - 1;
   }

   private void a(wn $$0) {
      $$0.c(this.b);
      bvm.c.encode($$0, this.c);
      a($$0, this.d);
      a($$0, this.e);
      $$0.a(this.f, ($$0x, $$1) -> {
         $$0x.a($$1.a());
         $$0x.a($$1.b());
         $$0x.a($$1.c());
      });
   }

   @Override
   public zl<acx> a() {
      return agr.y;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public bvk a(djz $$0) {
      if (this.f.isPresent()) {
         return new bvk(this.c, this.f.get());
      } else {
         bwv $$1 = $$0.a(this.d);
         bwv $$2 = $$0.a(this.e);
         return new bvk(this.c, $$2, $$1);
      }
   }

   public jg<bvm> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<ffs> h() {
      return this.f;
   }
}
