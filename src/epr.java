import java.util.List;

public class epr {
   private final List<epq> a;

   public epr(List<epq> $$0) {
      this.a = $$0;
   }

   public List<epq> a() {
      return this.a;
   }

   @Override
   public String toString() {
      return "ProcessorList[" + this.a + "]";
   }
}
