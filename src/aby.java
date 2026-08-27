import java.util.Optional;

public record aby(int b, il<bov> c, int d, int e, Optional<esa> f) implements yn<aay> {
   public static final ye<vr, aby> a = yn.a(aby::a, aby::new);
   private static final ye<vr, il<bov>> g = yc.b(ks.r);

   public aby(bpv $$0, bot $$1) {
      this($$0.aj(), $$1.k(), $$1.d() != null ? $$1.d().aj() : -1, $$1.c() != null ? $$1.c().aj() : -1, Optional.ofNullable($$1.i()));
   }

   private aby(vr $$0) {
      this($$0.l(), g.decode($$0), a((vg)$$0), a((vg)$$0), $$0.b($$0x -> new esa($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(vg $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(vg $$0) {
      return $$0.l() - 1;
   }

   private void a(vr $$0) {
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
   public yp<aby> a() {
      return afj.z;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public bot a(cyx $$0) {
      if (this.f.isPresent()) {
         return new bot(this.c, this.f.get());
      } else {
         bpv $$1 = $$0.a(this.d);
         bpv $$2 = $$0.a(this.e);
         return new bot(this.c, $$2, $$1);
      }
   }

   public il<bov> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<esa> h() {
      return this.f;
   }
}
