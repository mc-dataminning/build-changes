import java.util.Optional;

public record ack(int b, jr<btr> c, int d, int e, Optional<fbx> f) implements yw<abl> {
   public static final yn<wa, ack> a = yw.a(ack::a, ack::new);

   public ack(bva $$0, btp $$1) {
      this($$0.ar(), $$1.l(), $$1.d() != null ? $$1.d().ar() : -1, $$1.c() != null ? $$1.c().ar() : -1, Optional.ofNullable($$1.j()));
   }

   private ack(wa $$0) {
      this($$0.l(), btr.c.decode($$0), a((vl)$$0), a((vl)$$0), $$0.b($$0x -> new fbx($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(vl $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(vl $$0) {
      return $$0.l() - 1;
   }

   private void a(wa $$0) {
      $$0.c(this.b);
      btr.c.encode($$0, this.c);
      a($$0, this.d);
      a($$0, this.e);
      $$0.a(this.f, ($$0x, $$1) -> {
         $$0x.a($$1.a());
         $$0x.a($$1.b());
         $$0x.a($$1.c());
      });
   }

   @Override
   public yy<ack> a() {
      return agd.y;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public btp a(dgz $$0) {
      if (this.f.isPresent()) {
         return new btp(this.c, this.f.get());
      } else {
         bva $$1 = $$0.a(this.d);
         bva $$2 = $$0.a(this.e);
         return new btp(this.c, $$2, $$1);
      }
   }

   public jr<btr> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<fbx> h() {
      return this.f;
   }
}
