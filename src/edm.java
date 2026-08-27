import java.util.List;

public class edm {
   private final List<edl> a;

   public edm(List<edl> $$0) {
      this.a = $$0;
   }

   public List<edl> a() {
      return this.a;
   }

   @Override
   public String toString() {
      return "ProcessorList[" + this.a + "]";
   }
}
