import com.google.gson.JsonPrimitive;

public class frc {
   public static final frd<frc.a> a = new frd<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final frd<frc.a> b = new frd<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final frd<alg> c = new frd<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final frd<Boolean> d = new frd<>("uvlock", JsonPrimitive::new);
   public static final frd<Integer> e = new frd<>("weight", JsonPrimitive::new);

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
