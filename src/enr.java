import java.util.List;

public class enr {
   private final List<enq> a;

   public enr(List<enq> $$0) {
      this.a = $$0;
   }

   public List<enq> a() {
      return this.a;
   }

   @Override
   public String toString() {
      return "ProcessorList[" + this.a + "]";
   }
}
