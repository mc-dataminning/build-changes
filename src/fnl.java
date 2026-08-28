import com.google.gson.JsonPrimitive;

public class fnl {
   public static final fnm<fnl.a> a = new fnm<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final fnm<fnl.a> b = new fnm<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final fnm<akv> c = new fnm<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final fnm<Boolean> d = new fnm<>("uvlock", JsonPrimitive::new);
   public static final fnm<Integer> e = new fnm<>("weight", JsonPrimitive::new);

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
