import java.util.List;

public record ai(alg c, ah d) {
   public static final yw<wj, ai> a = yw.a(alg.b, ai::a, ah.b, ai::b, ai::new);
   public static final yw<wj, List<ai>> b = a.a(yu.a());

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof ai $$1 && this.c.equals($$1.c)) {
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

   public ah b() {
      return this.d;
   }
}
