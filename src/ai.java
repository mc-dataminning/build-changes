import java.util.List;

public record ai(aku c, ah d) {
   public static final yn<wa, ai> a = yn.a(aku.b, ai::a, ah.b, ai::b, ai::new);
   public static final yn<wa, List<ai>> b = a.a(yl.a());

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

   public aku a() {
      return this.c;
   }

   public ah b() {
      return this.d;
   }
}
