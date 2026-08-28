import com.google.gson.JsonPrimitive;

public class fqj {
   public static final fqk<fqj.a> a = new fqk<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final fqk<fqj.a> b = new fqk<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final fqk<ale> c = new fqk<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final fqk<Boolean> d = new fqk<>("uvlock", JsonPrimitive::new);
   public static final fqk<Integer> e = new fqk<>("weight", JsonPrimitive::new);

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
