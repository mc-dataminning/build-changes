import java.util.List;

public record ai(ald c, ah d) {
   public static final yt<wg, ai> a = yt.a(ald.b, ai::a, ah.b, ai::b, ai::new);
   public static final yt<wg, List<ai>> b = a.a(yr.a());

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

   public ald a() {
      return this.c;
   }

   public ah b() {
      return this.d;
   }
}
