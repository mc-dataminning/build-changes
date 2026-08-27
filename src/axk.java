import java.util.concurrent.TimeUnit;
import java.util.function.LongSupplier;

@FunctionalInterface
public interface axk {
   long get(TimeUnit var1);

   public interface a extends axk, LongSupplier {
      @Override
      default long get(TimeUnit $$0) {
         return $$0.convert(this.getAsLong(), TimeUnit.NANOSECONDS);
      }
   }
}
