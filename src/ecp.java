import java.util.Optional;
import java.util.function.Function;

public class ecp extends ebl {
   private final kc a;
   private final eas b;
   private final ebc c;
   private final ebf.o d;

   public ecp(ear $$0, kc $$1, del $$2, eas $$3, ebc $$4, ebf.o $$5) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
      this.c = $$4;
      this.d = $$5;
   }

   @Deprecated
   public Optional<dus> a(Function<jf, jo<dfk>> $$0, dwo $$1, jf $$2, boolean $$3) {
      return this.c.c().a(this.d, this, $$0, $$1, this.b, $$2, $$3);
   }

   @Deprecated
   public kc c() {
      return this.a;
   }

   public ebc d() {
      return this.c;
   }
}
