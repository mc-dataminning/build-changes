import java.util.concurrent.TimeUnit;
import java.util.function.LongSupplier;

@FunctionalInterface
public interface azg {
   long get(TimeUnit var1);

   public interface a extends azg, LongSupplier {
      @Override
      default long get(TimeUnit $$0) {
         return $$0.convert(this.getAsLong(), TimeUnit.NANOSECONDS);
      }
   }
}
