import java.util.Optional;

public record acq(int b, ix<bqr> c, int d, int e, Optional<eum> f) implements ze<abq> {
   public static final yv<wi, acq> a = ze.a(acq::a, acq::new);
   private static final yv<wi, ix<bqr>> g = yt.b(lf.s);

   public acq(brw $$0, bqp $$1) {
      this($$0.al(), $$1.k(), $$1.d() != null ? $$1.d().al() : -1, $$1.c() != null ? $$1.c().al() : -1, Optional.ofNullable($$1.i()));
   }

   private acq(wi $$0) {
      this($$0.l(), g.decode($$0), a((vx)$$0), a((vx)$$0), $$0.b($$0x -> new eum($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(vx $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(vx $$0) {
      return $$0.l() - 1;
   }

   private void a(wi $$0) {
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
   public zg<acq> a() {
      return agc.z;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public bqp a(daz $$0) {
      if (this.f.isPresent()) {
         return new bqp(this.c, this.f.get());
      } else {
         brw $$1 = $$0.a(this.d);
         brw $$2 = $$0.a(this.e);
         return new bqp(this.c, $$2, $$1);
      }
   }

   public ix<bqr> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<eum> h() {
      return this.f;
   }
}
