import java.util.ArrayList;
import java.util.List;

public class aro {
   private final List<arp> a = new ArrayList<>();

   public static aro a() {
      return new aro();
   }

   public List<arp> b() {
      return List.copyOf(this.a);
   }

   public aro a(arp $$0) {
      this.a.add($$0);
      return this;
   }

   public aro a(agg $$0) {
      return this.a(arp.a($$0));
   }

   public aro b(agg $$0) {
      return this.a(arp.b($$0));
   }

   public aro c(agg $$0) {
      return this.a(arp.c($$0));
   }

   public aro d(agg $$0) {
      return this.a(arp.d($$0));
   }
}
