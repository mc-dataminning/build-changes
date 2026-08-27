import java.util.Optional;

public record acx(int b, ja<bqv> c, int d, int e, Optional<ewu> f) implements zl<abw> {
   public static final zc<wp, acx> a = zl.a(acx::a, acx::new);
   private static final zc<wp, ja<bqv>> g = za.b(li.s);

   public acx(brv $$0, bqt $$1) {
      this($$0.al(), $$1.k(), $$1.d() != null ? $$1.d().al() : -1, $$1.c() != null ? $$1.c().al() : -1, Optional.ofNullable($$1.i()));
   }

   private acx(wp $$0) {
      this($$0.l(), g.decode($$0), a((we)$$0), a((we)$$0), $$0.b($$0x -> new ewu($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(we $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(we $$0) {
      return $$0.l() - 1;
   }

   private void a(wp $$0) {
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
   public zn<acx> a() {
      return agj.A;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public bqt a(dca $$0) {
      if (this.f.isPresent()) {
         return new bqt(this.c, this.f.get());
      } else {
         brv $$1 = $$0.a(this.d);
         brv $$2 = $$0.a(this.e);
         return new bqt(this.c, $$2, $$1);
      }
   }

   public ja<bqv> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<ewu> h() {
      return this.f;
   }
}
