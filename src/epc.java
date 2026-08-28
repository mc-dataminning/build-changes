import java.util.List;

public class epc {
   private final List<epb> a;

   public epc(List<epb> $$0) {
      this.a = $$0;
   }

   public List<epb> a() {
      return this.a;
   }

   @Override
   public String toString() {
      return "ProcessorList[" + this.a + "]";
   }
}
