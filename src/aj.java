import java.util.List;

public record aj(alg c, ai d) {
   public static final yw<wj, aj> a = yw.a(alg.b, aj::a, ai.b, aj::b, aj::new);
   public static final yw<wj, List<aj>> b = a.a(yu.a());

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof aj $$1 && this.c.equals($$1.c)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   @Override
   public String toString() {
      return this.c.toString();
   }

   public alg a() {
      return this.c;
   }

   public ai b() {
      return this.d;
   }
}
