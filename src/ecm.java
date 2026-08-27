import java.util.List;

public class ecm {
   private final List<ecl> a;

   public ecm(List<ecl> $$0) {
      this.a = $$0;
   }

   public List<ecl> a() {
      return this.a;
   }

   @Override
   public String toString() {
      return "ProcessorList[" + this.a + "]";
   }
}
