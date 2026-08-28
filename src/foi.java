import com.google.gson.JsonPrimitive;

public class foi {
   public static final foj<foi.a> a = new foj<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final foj<foi.a> b = new foj<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final foj<aku> c = new foj<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final foj<Boolean> d = new foj<>("uvlock", JsonPrimitive::new);
   public static final foj<Integer> e = new foj<>("weight", JsonPrimitive::new);

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
