import java.util.Optional;
import java.util.function.Function;

public class dso extends drl {
   private final iw a;
   private final dqs b;
   private final drc c;
   private final drf.o d;

   public dso(dqr $$0, iw $$1, cvp $$2, dqs $$3, drc $$4, drf.o $$5) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
      this.c = $$4;
      this.d = $$5;
   }

   @Deprecated
   public Optional<dlf> a(Function<hz, ij<cwm>> $$0, dnb $$1, hz $$2, boolean $$3) {
      return this.c.c().a(this.d, this, $$0, $$1, this.b, $$2, $$3);
   }

   @Deprecated
   public iw c() {
      return this.a;
   }

   public drc d() {
      return this.c;
   }
}
