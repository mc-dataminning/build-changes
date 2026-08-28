import com.google.gson.JsonPrimitive;

public class fqv {
   public static final fqw<fqv.a> a = new fqw<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final fqw<fqv.a> b = new fqw<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final fqw<alg> c = new fqw<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final fqw<Boolean> d = new fqw<>("uvlock", JsonPrimitive::new);
   public static final fqw<Integer> e = new fqw<>("weight", JsonPrimitive::new);

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
