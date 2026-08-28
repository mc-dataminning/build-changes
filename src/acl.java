import java.util.Optional;

public record acl(int b, jr<btd> c, int d, int e, Optional<fba> f) implements yw<abl> {
   public static final yn<wa, acl> a = yw.a(acl::a, acl::new);

   public acl(bul $$0, btb $$1) {
      this($$0.ar(), $$1.l(), $$1.d() != null ? $$1.d().ar() : -1, $$1.c() != null ? $$1.c().ar() : -1, Optional.ofNullable($$1.j()));
   }

   private acl(wa $$0) {
      this($$0.l(), btd.c.decode($$0), a((vl)$$0), a((vl)$$0), $$0.b($$0x -> new fba($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(vl $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(vl $$0) {
      return $$0.l() - 1;
   }

   private void a(wa $$0) {
      $$0.c(this.b);
      btd.c.encode($$0, this.c);
      a($$0, this.d);
      a($$0, this.e);
      $$0.a(this.f, ($$0x, $$1) -> {
         $$0x.a($$1.a());
         $$0x.a($$1.b());
         $$0x.a($$1.c());
      });
   }

   @Override
   public yy<acl> a() {
      return age.z;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public btb a(dgi $$0) {
      if (this.f.isPresent()) {
         return new btb(this.c, this.f.get());
      } else {
         bul $$1 = $$0.a(this.d);
         bul $$2 = $$0.a(this.e);
         return new btb(this.c, $$2, $$1);
      }
   }

   public jr<btd> e() {
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
