import java.util.List;

public class epg {
   private final List<epf> a;

   public epg(List<epf> $$0) {
      this.a = $$0;
   }

   public List<epf> a() {
      return this.a;
   }

   @Override
   public String toString() {
      return "ProcessorList[" + this.a + "]";
   }
}
