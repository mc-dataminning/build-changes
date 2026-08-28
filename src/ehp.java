import java.util.Optional;

public class ehp extends dyr {
   private final dct a;
   private final dtz b;
   private final Optional<eho> c;

   public ehp(dct $$0, dtz $$1, Optional<eho> $$2) {
      super($$1, $$0);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public int a(dxu.a $$0, int $$1, int $$2) {
      return this.a.a($$0, $$1, $$2);
   }

   public dtx a(dbf $$0, dxq.a $$1) {
      return ((dus)this.a.a($$0.e, $$0.f)).b($$1);
   }

   public dsc a(iz $$0) {
      return this.a.a_($$0);
   }

   public int c() {
      return this.a.I_();
   }

   public dct d() {
      return this.a;
   }

   public Optional<eho> e() {
      return this.c;
   }

   public dtz f() {
      return this.b;
   }
}
