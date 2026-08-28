import java.util.List;

public record ag(ale c, af d) {
   public static final zc<wp, ag> a = zc.a(ale.b, ag::a, af.b, ag::b, ag::new);
   public static final zc<wp, List<ag>> b = a.a(za.a());

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

   public ale a() {
      return this.c;
   }

   public af b() {
      return this.d;
   }
}
