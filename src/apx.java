import java.util.ArrayList;
import java.util.List;

public class apx {
   private final List<apy> a = new ArrayList<>();

   public static apx a() {
      return new apx();
   }

   public List<apy> b() {
      return List.copyOf(this.a);
   }

   public apx a(apy $$0) {
      this.a.add($$0);
      return this;
   }

   public apx a(aer $$0) {
      return this.a(apy.a($$0));
   }

   public apx b(aer $$0) {
      return this.a(apy.b($$0));
   }

   public apx c(aer $$0) {
      return this.a(apy.c($$0));
   }

   public apx d(aer $$0) {
      return this.a(apy.d($$0));
   }
}
