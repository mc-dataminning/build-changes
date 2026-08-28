import java.util.Optional;

public record adi(int b, ji<brq> c, int d, int e, Optional<evs> f) implements zw<aci> {
   public static final zn<xa, adi> a = zw.a(adi::a, adi::new);
   private static final zn<xa, ji<brq>> g = zl.b(lq.s);

   public adi(bsv $$0, bro $$1) {
      this($$0.al(), $$1.k(), $$1.d() != null ? $$1.d().al() : -1, $$1.c() != null ? $$1.c().al() : -1, Optional.ofNullable($$1.i()));
   }

   private adi(xa $$0) {
      this($$0.l(), g.decode($$0), a((wm)$$0), a((wm)$$0), $$0.b($$0x -> new evs($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(wm $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(wm $$0) {
      return $$0.l() - 1;
   }

   private void a(xa $$0) {
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
   public zy<adi> a() {
      return agu.z;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public bro a(dbz $$0) {
      if (this.f.isPresent()) {
         return new bro(this.c, this.f.get());
      } else {
         bsv $$1 = $$0.a(this.d);
         bsv $$2 = $$0.a(this.e);
         return new bro(this.c, $$2, $$1);
      }
   }

   public ji<brq> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<evs> h() {
      return this.f;
   }
}
