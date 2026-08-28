import java.util.Optional;
import java.util.function.Function;

public class eer extends edn {
   private final kf a;
   private final ecu b;
   private final ede c;
   private final edh.o d;

   public eer(ect $$0, kf $$1, dgi $$2, ecu $$3, ede $$4, edh.o $$5) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
      this.c = $$4;
      this.d = $$5;
   }

   @Deprecated
   public Optional<dwv> a(Function<ji, jr<dhi>> $$0, dyq $$1, ji $$2, boolean $$3) {
      return this.c.c().a(this.d, this, $$0, $$1, this.b, $$2, $$3);
   }

   @Deprecated
   public kf c() {
      return this.a;
   }

   public ede d() {
      return this.c;
   }
}
