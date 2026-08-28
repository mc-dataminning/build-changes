import java.util.Optional;

public record ack(int b, jr<btc> c, int d, int e, Optional<fba> f) implements yv<abk> {
   public static final ym<vz, ack> a = yv.a(ack::a, ack::new);

   public ack(buk $$0, bta $$1) {
      this($$0.ar(), $$1.l(), $$1.d() != null ? $$1.d().ar() : -1, $$1.c() != null ? $$1.c().ar() : -1, Optional.ofNullable($$1.j()));
   }

   private ack(vz $$0) {
      this($$0.l(), btc.c.decode($$0), a((vl)$$0), a((vl)$$0), $$0.b($$0x -> new fba($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(vl $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(vl $$0) {
      return $$0.l() - 1;
   }

   private void a(vz $$0) {
      $$0.c(this.b);
      btc.c.encode($$0, this.c);
      a($$0, this.d);
      a($$0, this.e);
      $$0.a(this.f, ($$0x, $$1) -> {
         $$0x.a($$1.a());
         $$0x.a($$1.b());
         $$0x.a($$1.c());
      });
   }

   @Override
   public yx<ack> a() {
      return agd.z;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public bta a(dgi $$0) {
      if (this.f.isPresent()) {
         return new bta(this.c, this.f.get());
      } else {
         buk $$1 = $$0.a(this.d);
         buk $$2 = $$0.a(this.e);
         return new bta(this.c, $$2, $$1);
      }
   }

   public jr<btc> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<fba> h() {
      return this.f;
   }
}
