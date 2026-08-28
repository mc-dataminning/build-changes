import java.util.Optional;

public record add(int b, jp<bsr> c, int d, int e, Optional<ezh> f) implements zo<acd> {
   public static final zf<ws, add> a = zo.a(add::a, add::new);

   public add(btz $$0, bsp $$1) {
      this($$0.ar(), $$1.l(), $$1.d() != null ? $$1.d().ar() : -1, $$1.c() != null ? $$1.c().ar() : -1, Optional.ofNullable($$1.j()));
   }

   private add(ws $$0) {
      this($$0.l(), bsr.c.decode($$0), a((we)$$0), a((we)$$0), $$0.b($$0x -> new ezh($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(we $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(we $$0) {
      return $$0.l() - 1;
   }

   private void a(ws $$0) {
      $$0.c(this.b);
      bsr.c.encode($$0, this.c);
      a($$0, this.d);
      a($$0, this.e);
      $$0.a(this.f, ($$0x, $$1) -> {
         $$0x.a($$1.a());
         $$0x.a($$1.b());
         $$0x.a($$1.c());
      });
   }

   @Override
   public zq<add> a() {
      return ags.z;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public bsp a(dev $$0) {
      if (this.f.isPresent()) {
         return new bsp(this.c, this.f.get());
      } else {
         btz $$1 = $$0.a(this.d);
         btz $$2 = $$0.a(this.e);
         return new bsp(this.c, $$2, $$1);
      }
   }

   public jp<bsr> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<ezh> h() {
      return this.f;
   }
}
