import java.util.Optional;
import java.util.function.Function;

public class egm extends efi {
   private final kg a;
   private final eep b;
   private final eez c;
   private final efc.o d;

   public egm(eeo $$0, kg $$1, dhr $$2, eep $$3, eez $$4, efc.o $$5) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
      this.c = $$4;
      this.d = $$5;
   }

   @Deprecated
   public Optional<dym> a(Function<jj, js<dis>> $$0, eaj $$1, jj $$2, boolean $$3) {
      return this.c.c().a(this.d, this, $$0, $$1, this.b, $$2, $$3);
   }

   @Deprecated
   public kg c() {
      return this.a;
   }

   public eez d() {
      return this.c;
   }
}
