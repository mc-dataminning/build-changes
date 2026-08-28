import com.google.gson.JsonPrimitive;

public class fnk {
   public static final fnl<fnk.a> a = new fnl<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final fnl<fnk.a> b = new fnl<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final fnl<akv> c = new fnl<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final fnl<Boolean> d = new fnl<>("uvlock", JsonPrimitive::new);
   public static final fnl<Integer> e = new fnl<>("weight", JsonPrimitive::new);

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
