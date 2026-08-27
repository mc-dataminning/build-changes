import java.util.List;

public class dvr {
   private final List<dvq> a;

   public dvr(List<dvq> $$0) {
      this.a = $$0;
   }

   public List<dvq> a() {
      return this.a;
   }

   @Override
   public String toString() {
      return "ProcessorList[" + this.a + "]";
   }
}
