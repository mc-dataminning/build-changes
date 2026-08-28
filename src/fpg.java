import com.google.gson.JsonPrimitive;

public class fpg {
   public static final fph<fpg.a> a = new fph<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final fph<fpg.a> b = new fph<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final fph<ald> c = new fph<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final fph<Boolean> d = new fph<>("uvlock", JsonPrimitive::new);
   public static final fph<Integer> e = new fph<>("weight", JsonPrimitive::new);

   public static enum a {
      a(0),
      b(90),
      c(180),
      d(270);

      final int e;

      private a(final int $$0) {
         this.e = $$0;
      }
   }
}
