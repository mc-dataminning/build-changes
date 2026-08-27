import java.util.ArrayList;
import java.util.List;

public class asd {
   private final List<ase> a = new ArrayList<>();

   public static asd a() {
      return new asd();
   }

   public List<ase> b() {
      return List.copyOf(this.a);
   }

   public asd a(ase $$0) {
      this.a.add($$0);
      return this;
   }

   public asd a(agt $$0) {
      return this.a(ase.a($$0));
   }

   public asd b(agt $$0) {
      return this.a(ase.b($$0));
   }

   public asd c(agt $$0) {
      return this.a(ase.c($$0));
   }

   public asd d(agt $$0) {
      return this.a(ase.d($$0));
   }
}
