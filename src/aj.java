import java.util.List;

public record aj(ali c, ai d) {
   public static final yy<wl, aj> a = yy.a(ali.b, aj::a, ai.b, aj::b, aj::new);
   public static final yy<wl, List<aj>> b = a.a(yw.a());

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

   public ali a() {
      return this.c;
   }

   public ai b() {
      return this.d;
   }
}
