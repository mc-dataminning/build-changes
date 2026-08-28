import java.util.Optional;

public class ekl extends ebl {
   private final dfg a;
   private final dwp b;
   private final Optional<ekk> c;

   public ekl(dfg $$0, dwp $$1, Optional<ekk> $$2) {
      super($$1, $$0);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public int a(eao.a $$0, int $$1, int $$2) {
      return this.a.a($$0, $$1, $$2);
   }

   public dwn a(ddp $$0) {
      return ((dxi)this.a.a($$0.e, $$0.f)).C();
   }

   public dus a(jf $$0) {
      return this.a.a_($$0);
   }

   public int c() {
      return this.a.H_();
   }

   public dfg d() {
      return this.a;
   }

   public Optional<ekk> e() {
      return this.c;
   }

   public dwp f() {
      return this.b;
   }
}
