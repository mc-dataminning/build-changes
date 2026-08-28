import java.util.Optional;

public record acq(int b, js<buj> c, int d, int e, Optional<fcu> f) implements zc<abr> {
   public static final yt<wg, acq> a = zc.a(acq::a, acq::new);

   public acq(bvs $$0, buh $$1) {
      this($$0.ar(), $$1.l(), $$1.d() != null ? $$1.d().ar() : -1, $$1.c() != null ? $$1.c().ar() : -1, Optional.ofNullable($$1.j()));
   }

   private acq(wg $$0) {
      this($$0.l(), buj.c.decode($$0), a((vr)$$0), a((vr)$$0), $$0.b($$0x -> new fcu($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(vr $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(vr $$0) {
      return $$0.l() - 1;
   }

   private void a(wg $$0) {
      $$0.c(this.b);
      buj.c.encode($$0, this.c);
      a($$0, this.d);
      a($$0, this.e);
      $$0.a(this.f, ($$0x, $$1) -> {
         $$0x.a($$1.a());
         $$0x.a($$1.b());
         $$0x.a($$1.c());
      });
   }

   @Override
   public ze<acq> a() {
      return agk.y;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   public buh a(dhp $$0) {
      if (this.f.isPresent()) {
         return new buh(this.c, this.f.get());
      } else {
         bvs $$1 = $$0.a(this.d);
         bvs $$2 = $$0.a(this.e);
         return new buh(this.c, $$2, $$1);
      }
   }

   public js<buj> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<fcu> h() {
      return this.f;
   }
}
