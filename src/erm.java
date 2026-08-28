import java.util.List;

public class erm {
   private final List<erl> a;

   public erm(List<erl> $$0) {
      this.a = $$0;
   }

   public List<erl> a() {
      return this.a;
   }

   @Override
   public String toString() {
      return "ProcessorList[" + this.a + "]";
   }
}
