import java.util.Optional;

public record ade(int b, jq<bsw> c, int d, int e, Optional<ezn> f) implements zp<ace> {
   public static final zg<wt, ade> a = zp.a(ade::a, ade::new);

   public ade(bue $$0, bsu $$1) {
      this($$0.as(), $$1.l(), $$1.d() != null ? $$1.d().as() : -1, $$1.c() != null ? $$1.c().as() : -1, Optional.ofNullable($$1.j()));
   }

   private ade(wt $$0) {
      this($$0.l(), bsw.c.decode($$0), a((wf)$$0), a((wf)$$0), $$0.b($$0x -> new ezn($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(wf $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(wf $$0) {
      return $$0.l() - 1;
   }

   private void a(wt $$0) {
      $$0.c(this.b);
      bsw.c.encode($$0, this.c);
      a($$0, this.d);
      a($$0, this.e);
      $$0.a(this.f, ($$0x, $$1) -> {
         $$0x.a($$1.a());
         $$0x.a($$1.b());
         $$0x.a($$1.c());
      });
   }

   @Override
   public zr<ade> a() {
      return agt.z;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public bsu a(dfb $$0) {
      if (this.f.isPresent()) {
         return new bsu(this.c, this.f.get());
      } else {
         bue $$1 = $$0.a(this.d);
         bue $$2 = $$0.a(this.e);
         return new bsu(this.c, $$2, $$1);
      }
   }

   public jq<bsw> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<ezn> h() {
      return this.f;
   }
}
