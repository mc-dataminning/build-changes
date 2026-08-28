import java.util.Optional;

public record adh(int b, ji<bro> c, int d, int e, Optional<evq> f) implements zv<ach> {
   public static final zm<wz, adh> a = zv.a(adh::a, adh::new);
   private static final zm<wz, ji<bro>> g = zk.b(lq.s);

   public adh(bst $$0, brm $$1) {
      this($$0.al(), $$1.k(), $$1.d() != null ? $$1.d().al() : -1, $$1.c() != null ? $$1.c().al() : -1, Optional.ofNullable($$1.i()));
   }

   private adh(wz $$0) {
      this($$0.l(), g.decode($$0), a((wl)$$0), a((wl)$$0), $$0.b($$0x -> new evq($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(wl $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(wl $$0) {
      return $$0.l() - 1;
   }

   private void a(wz $$0) {
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
   public zx<adh> a() {
      return agt.z;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public brm a(dbx $$0) {
      if (this.f.isPresent()) {
         return new brm(this.c, this.f.get());
      } else {
         bst $$1 = $$0.a(this.d);
         bst $$2 = $$0.a(this.e);
         return new brm(this.c, $$2, $$1);
      }
   }

   public ji<bro> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<evq> h() {
      return this.f;
   }
}
