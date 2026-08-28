import com.google.gson.JsonPrimitive;

public class fnm {
   public static final fnn<fnm.a> a = new fnn<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final fnn<fnm.a> b = new fnn<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final fnn<akv> c = new fnn<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final fnn<Boolean> d = new fnn<>("uvlock", JsonPrimitive::new);
   public static final fnn<Integer> e = new fnn<>("weight", JsonPrimitive::new);

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
