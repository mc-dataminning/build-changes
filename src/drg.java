import java.util.stream.Stream;

public abstract class drg extends drh {
   @Override
   public final Stream<gu> a_(drf $$0, apf $$1, gu $$2) {
      return this.a($$0, $$1, $$2) ? Stream.of($$2) : Stream.of();
   }

   protected abstract boolean a(drf var1, apf var2, gu var3);
}
