import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.function.Function;

public interface bab<C> {
   bab<Float> a = a($$0 -> $$0);

   float a(C var1);

   float b();

   float c();

   static bab<Float> a(final Float2FloatFunction $$0) {
      return new bab<Float>() {
         public float a(Float $$0x) {
            return (Float)$$0.apply($$0);
         }

         @Override
         public float b() {
            return Float.NEGATIVE_INFINITY;
         }

         @Override
         public float c() {
            return Float.POSITIVE_INFINITY;
         }
      };
   }

   default <C2> bab<C2> a(final Function<C2, C> $$0) {
      final bab<C> $$1 = this;
      return new bab<C2>() {
         @Override
         public float a(C2 $$0x) {
            return $$1.a($$0.apply($$0));
         }

         @Override
         public float b() {
            return $$1.b();
         }

         @Override
         public float c() {
            return $$1.c();
         }
      };
   }
}
