import java.util.concurrent.TimeUnit;
import java.util.function.LongSupplier;

@FunctionalInterface
public interface avi {
   long get(TimeUnit var1);

   public interface a extends avi, LongSupplier {
      @Override
      default long get(TimeUnit $$0) {
         return $$0.convert(this.getAsLong(), TimeUnit.NANOSECONDS);
      }
   }
}
