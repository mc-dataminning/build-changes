import java.util.Optional;

public record acn(int b, jj<brc> c, int d, int e, Optional<ewh> f) implements zb<abn> {
   public static final ys<wf, acn> a = zb.a(acn::a, acn::new);

   public acn(bsh $$0, bra $$1) {
      this($$0.an(), $$1.k(), $$1.d() != null ? $$1.d().an() : -1, $$1.c() != null ? $$1.c().an() : -1, Optional.ofNullable($$1.i()));
   }

   private acn(wf $$0) {
      this($$0.l(), brc.c.decode($$0), a((vr)$$0), a((vr)$$0), $$0.b($$0x -> new ewh($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(vr $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(vr $$0) {
      return $$0.l() - 1;
   }

   private void a(wf $$0) {
      $$0.c(this.b);
      brc.c.encode($$0, this.c);
      a($$0, this.d);
      a($$0, this.e);
      $$0.a(this.f, ($$0x, $$1) -> {
         $$0x.a($$1.a());
         $$0x.a($$1.b());
         $$0x.a($$1.c());
      });
   }

   @Override
   public zd<acn> a() {
      return afz.z;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public bra a(dcg $$0) {
      if (this.f.isPresent()) {
         return new bra(this.c, this.f.get());
      } else {
         bsh $$1 = $$0.a(this.d);
         bsh $$2 = $$0.a(this.e);
         return new bra(this.c, $$2, $$1);
      }
   }

   public jj<brc> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<ewh> h() {
      return this.f;
   }
}
