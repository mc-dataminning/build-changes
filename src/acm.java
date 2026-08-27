import java.util.Optional;

public record acm(int b, iw<bqh> c, int d, int e, Optional<etp> f) implements zb<abm> {
   public static final ys<wf, acm> a = zb.a(acm::a, acm::new);
   private static final ys<wf, iw<bqh>> g = yq.b(le.s);

   public acm(brh $$0, bqf $$1) {
      this($$0.aj(), $$1.k(), $$1.d() != null ? $$1.d().aj() : -1, $$1.c() != null ? $$1.c().aj() : -1, Optional.ofNullable($$1.i()));
   }

   private acm(wf $$0) {
      this($$0.l(), g.decode($$0), a((vu)$$0), a((vu)$$0), $$0.b($$0x -> new etp($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(vu $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(vu $$0) {
      return $$0.l() - 1;
   }

   private void a(wf $$0) {
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
   public zd<acm> a() {
      return afx.z;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public bqf a(dad $$0) {
      if (this.f.isPresent()) {
         return new bqf(this.c, this.f.get());
      } else {
         brh $$1 = $$0.a(this.d);
         brh $$2 = $$0.a(this.e);
         return new bqf(this.c, $$2, $$1);
      }
   }

   public iw<bqh> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<etp> h() {
      return this.f;
   }
}
