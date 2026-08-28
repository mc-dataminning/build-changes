import java.util.Optional;

public class eic extends dzd {
   private final ddc a;
   private final dui b;
   private final Optional<eib> c;

   public eic(ddc $$0, dui $$1, Optional<eib> $$2) {
      super($$1, $$0);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public int a(dyg.a $$0, int $$1, int $$2) {
      return this.a.a($$0, $$1, $$2);
   }

   public dug a(dbn $$0, dyc.a $$1) {
      return ((dvb)this.a.a($$0.e, $$0.f)).b($$1);
   }

   public dsl a(ja $$0) {
      return this.a.a_($$0);
   }

   public int c() {
      return this.a.I_();
   }

   public ddc d() {
      return this.a;
   }

   public Optional<eib> e() {
      return this.c;
   }

   public dui f() {
      return this.b;
   }
}
