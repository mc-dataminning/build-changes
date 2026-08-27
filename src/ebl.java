import java.util.Optional;

public class ebl extends dsn {
   private final cwz a;
   private final dob b;
   private final Optional<ebk> c;

   public ebl(cwz $$0, dob $$1, Optional<ebk> $$2) {
      super($$1, $$0);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public int a(drq.a $$0, int $$1, int $$2) {
      return this.a.a($$0, $$1, $$2);
   }

   public dnz a(cvl $$0, drm.a $$1) {
      return ((dov)this.a.a($$0.e, $$0.f)).b($$1);
   }

   public dme a(ib $$0) {
      return this.a.a_($$0);
   }

   public int c() {
      return this.a.J_();
   }

   public cwz d() {
      return this.a;
   }

   public Optional<ebk> e() {
      return this.c;
   }

   public dob f() {
      return this.b;
   }
}
