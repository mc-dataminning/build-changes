import java.util.Optional;

public record acr(int b, je<bur> c, int d, int e, Optional<fdw> f) implements zd<abs> {
   public static final yu<wh, acr> a = zd.a(acr::a, acr::new);

   public acr(bwa $$0, bup $$1) {
      this($$0.ar(), $$1.l(), $$1.d() != null ? $$1.d().ar() : -1, $$1.c() != null ? $$1.c().ar() : -1, Optional.ofNullable($$1.j()));
   }

   private acr(wh $$0) {
      this($$0.l(), bur.c.decode($$0), a((vs)$$0), a((vs)$$0), $$0.b($$0x -> new fdw($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(vs $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(vs $$0) {
      return $$0.l() - 1;
   }

   private void a(wh $$0) {
      $$0.c(this.b);
      bur.c.encode($$0, this.c);
      a($$0, this.d);
      a($$0, this.e);
      $$0.a(this.f, ($$0x, $$1) -> {
         $$0x.a($$1.a());
         $$0x.a($$1.b());
         $$0x.a($$1.c());
      });
   }

   @Override
   public zf<acr> a() {
      return agl.y;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public bup a(dip $$0) {
      if (this.f.isPresent()) {
         return new bup(this.c, this.f.get());
      } else {
         bwa $$1 = $$0.a(this.d);
         bwa $$2 = $$0.a(this.e);
         return new bup(this.c, $$2, $$1);
      }
   }

   public je<bur> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<fdw> h() {
      return this.f;
   }
}
