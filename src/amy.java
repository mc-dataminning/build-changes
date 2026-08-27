import java.util.function.UnaryOperator;

public interface amy {
   UnaryOperator<tf> a = UnaryOperator.identity();
   amy b = a(a, true);
   amy c = a(a("pack.source.builtin"), true);
   amy d = a(a("pack.source.feature"), false);
   amy e = a(a("pack.source.world"), true);
   amy f = a(a("pack.source.server"), true);

   tf a(tf var1);

   boolean a();

   static amy a(final UnaryOperator<tf> $$0, final boolean $$1) {
      return new amy() {
         @Override
         public tf a(tf $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<tf> a(String $$0) {
      tf $$1 = tf.c($$0);
      return $$1x -> tf.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
