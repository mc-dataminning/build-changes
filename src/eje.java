import java.util.Optional;
import java.util.function.Function;

public class eje extends eia {
   private final jt a;
   private final ehh b;
   private final ehr c;
   private final ehu.o d;

   public eje(ehg $$0, jt $$1, djz $$2, ehh $$3, ehr $$4, ehu.o $$5) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
      this.c = $$4;
      this.d = $$5;
   }

   @Deprecated
   public Optional<ebe> a(Function<iv, jf<dla>> $$0, edb $$1, iv $$2, boolean $$3) {
      return this.c.c().a(this.d, this, $$0, $$1, this.b, $$2, $$3);
   }

   @Deprecated
   public jt c() {
      return this.a;
   }

   public ehr d() {
      return this.c;
   }
}
