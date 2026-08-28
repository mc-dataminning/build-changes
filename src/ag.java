import java.util.List;

public record ag(akq c, af d) {
   public static final yw<wj, ag> a = yw.a(akq.b, ag::a, af.b, ag::b, ag::new);
   public static final yw<wj, List<ag>> b = a.a(yu.a());

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof ag $$1 && this.c.equals($$1.c)) {
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

   public akq a() {
      return this.c;
   }

   public af b() {
      return this.d;
   }
}
