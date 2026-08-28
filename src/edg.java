import java.util.Optional;
import java.util.function.Function;

public class edg extends ecc {
   private final ke a;
   private final ebj b;
   private final ebt c;
   private final ebw.o d;

   public edg(ebi $$0, ke $$1, dfd $$2, ebj $$3, ebt $$4, ebw.o $$5) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
      this.c = $$4;
      this.d = $$5;
   }

   @Deprecated
   public Optional<dvj> a(Function<jh, jq<dgc>> $$0, dxf $$1, jh $$2, boolean $$3) {
      return this.c.c().a(this.d, this, $$0, $$1, this.b, $$2, $$3);
   }

   @Deprecated
   public ke c() {
      return this.a;
   }

   public ebt d() {
      return this.c;
   }
}
