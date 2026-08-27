import java.util.Optional;

public record aaa(int a, int b, int c, int d, Optional<emc> e) implements xg<zb> {
   public aaa(blw $$0, bkv $$1) {
      this($$0.aj(), $$0.dL().I_().d(ke.r).a($$1.j()), $$1.d() != null ? $$1.d().aj() : -1, $$1.c() != null ? $$1.c().aj() : -1, Optional.ofNullable($$1.i()));
   }

   public aaa(uj $$0) {
      this($$0.n(), $$0.n(), b($$0), b($$0), $$0.b((uj.a<emc>)($$0x -> new emc($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble()))));
   }

   private static void a(uj $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int b(uj $$0) {
      return $$0.n() - 1;
   }

   @Override
   public void a(uj $$0) {
      $$0.c(this.a);
      $$0.c(this.b);
      a($$0, this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$0x, $$1) -> {
         $$0x.a($$1.a());
         $$0x.a($$1.b());
         $$0x.a($$1.c());
      });
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public bkv a(ctx $$0) {
      ih<bkx> $$1 = $$0.I_().d(ke.r).c(this.b).get();
      if (this.e.isPresent()) {
         return new bkv($$1, this.e.get());
      } else {
         blw $$2 = $$0.a(this.c);
         blw $$3 = $$0.a(this.d);
         return new bkv($$1, $$3, $$2);
      }
   }

   public int d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public Optional<emc> g() {
      return this.e;
   }
}
