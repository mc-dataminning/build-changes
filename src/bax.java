import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.function.Function;

public interface bax<C> {
   bax<Float> a = a($$0 -> $$0);

   float a(C var1);

   float b();

   float c();

   static bax<Float> a(final Float2FloatFunction $$0) {
      return new bax<Float>() {
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

   default <C2> bax<C2> a(final Function<C2, C> $$0) {
      final bax<C> $$1 = this;
      return new bax<C2>() {
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
