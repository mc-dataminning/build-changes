import javax.annotation.Nullable;

public record czk(cuc a, @Nullable bsn b, @Nullable btb c, Runnable d) {
   public czk(cuc $$0, bsn $$1, btb $$2) {
      this($$0, $$1, $$2, () -> $$2.e($$1));
   }
}
