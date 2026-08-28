import java.util.Optional;

public record ade(int b, jg<bvv> c, int d, int e, Optional<fgc> f) implements zo<acf> {
   public static final ze<wp, ade> a = zo.a(ade::a, ade::new);

   public ade(bxe $$0, bvt $$1) {
      this($$0.ao(), $$1.l(), $$1.d() != null ? $$1.d().ao() : -1, $$1.c() != null ? $$1.c().ao() : -1, Optional.ofNullable($$1.j()));
   }

   private ade(wp $$0) {
      this($$0.l(), bvv.c.decode($$0), a((vy)$$0), a((vy)$$0), $$0.b($$0x -> new fgc($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(vy $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(vy $$0) {
      return $$0.l() - 1;
   }

   private void a(wp $$0) {
      $$0.c(this.b);
      bvv.c.encode($$0, this.c);
      a($$0, this.d);
      a($$0, this.e);
      $$0.a(this.f, ($$0x, $$1) -> {
         $$0x.a($$1.a());
         $$0x.a($$1.b());
         $$0x.a($$1.c());
      });
   }

   @Override
   public zq<ade> a() {
      return agy.y;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public bvt a(dkj $$0) {
      if (this.f.isPresent()) {
         return new bvt(this.c, this.f.get());
      } else {
         bxe $$1 = $$0.a(this.d);
         bxe $$2 = $$0.a(this.e);
         return new bvt(this.c, $$2, $$1);
      }
   }

   public jg<bvv> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<fgc> h() {
      return this.f;
   }
}
