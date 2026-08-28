import java.util.Optional;

public record ada(int b, jo<bsl> c, int d, int e, Optional<eyw> f) implements zl<aca> {
   public static final zc<wp, ada> a = zl.a(ada::a, ada::new);

   public ada(btr $$0, bsj $$1) {
      this($$0.ap(), $$1.l(), $$1.d() != null ? $$1.d().ap() : -1, $$1.c() != null ? $$1.c().ap() : -1, Optional.ofNullable($$1.j()));
   }

   private ada(wp $$0) {
      this($$0.l(), bsl.c.decode($$0), a((wb)$$0), a((wb)$$0), $$0.b($$0x -> new eyw($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(wb $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(wb $$0) {
      return $$0.l() - 1;
   }

   private void a(wp $$0) {
      $$0.c(this.b);
      bsl.c.encode($$0, this.c);
      a($$0, this.d);
      a($$0, this.e);
      $$0.a(this.f, ($$0x, $$1) -> {
         $$0x.a($$1.a());
         $$0x.a($$1.b());
         $$0x.a($$1.c());
      });
   }

   @Override
   public zn<ada> a() {
      return agp.z;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public bsj a(dej $$0) {
      if (this.f.isPresent()) {
         return new bsj(this.c, this.f.get());
      } else {
         btr $$1 = $$0.a(this.d);
         btr $$2 = $$0.a(this.e);
         return new bsj(this.c, $$2, $$1);
      }
   }

   public jo<bsl> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<eyw> h() {
      return this.f;
   }
}
