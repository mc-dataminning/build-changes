import java.util.List;

public record ai(ale c, ah d) {
   public static final yu<wh, ai> a = yu.a(ale.b, ai::a, ah.b, ai::b, ai::new);
   public static final yu<wh, List<ai>> b = a.a(ys.a());

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

   public ale a() {
      return this.c;
   }

   public ah b() {
      return this.d;
   }
}
