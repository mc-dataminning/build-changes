import java.util.Optional;

public record abg(int b, int c, int d, int e, Optional<ens> f) implements xx<aag> {
   public static final xo<uq, abg> a = xx.a(abg::b, abg::new);

   public abg(bno $$0, bmn $$1) {
      this($$0.aj(), $$0.dM().I_().d(kg.r).a($$1.j()), $$1.d() != null ? $$1.d().aj() : -1, $$1.c() != null ? $$1.c().aj() : -1, Optional.ofNullable($$1.i()));
   }

   private abg(uq $$0) {
      this($$0.n(), $$0.n(), a($$0), a($$0), $$0.b((xp<? super uq, ens>)($$0x -> new ens($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble()))));
   }

   private static void a(uq $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(uq $$0) {
      return $$0.n() - 1;
   }

   private void b(uq $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      a($$0, this.d);
      a($$0, this.e);
      $$0.a(this.f, ($$0x, $$1) -> {
         $$0x.a($$1.a());
         $$0x.a($$1.b());
         $$0x.a($$1.c());
      });
   }

   @Override
   public xz<abg> a() {
      return aeq.z;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public bmn a(cvn $$0) {
      ij<bmp> $$1 = $$0.I_().d(kg.r).c(this.c).get();
      if (this.f.isPresent()) {
         return new bmn($$1, this.f.get());
      } else {
         bno $$2 = $$0.a(this.d);
         bno $$3 = $$0.a(this.e);
         return new bmn($$1, $$3, $$2);
      }
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<ens> h() {
      return this.f;
   }
}
