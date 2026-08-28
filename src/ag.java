import java.util.List;

public record ag(alh c, af d) {
   public static final zf<ws, ag> a = zf.a(alh.b, ag::a, af.b, ag::b, ag::new);
   public static final zf<ws, List<ag>> b = a.a(zd.a());

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

   public alh a() {
      return this.c;
   }

   public af b() {
      return this.d;
   }
}
