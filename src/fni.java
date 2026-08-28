import com.google.gson.JsonPrimitive;

public class fni {
   public static final fnj<fni.a> a = new fnj<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final fnj<fni.a> b = new fnj<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final fnj<aku> c = new fnj<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final fnj<Boolean> d = new fnj<>("uvlock", JsonPrimitive::new);
   public static final fnj<Integer> e = new fnj<>("weight", JsonPrimitive::new);

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
