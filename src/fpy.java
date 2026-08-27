import com.google.common.collect.ForwardingList;
import java.util.List;

public class fpy extends ForwardingList<clj> {
   private final il<clj> a = il.a(cdt.g(), clj.b);

   protected List<clj> delegate() {
      return this.a;
   }

   public sf a() {
      sf $$0 = new sf();

      for (clj $$1 : this.delegate()) {
         $$0.add($$1.b(new rz()));
      }

      return $$0;
   }

   public void a(sf $$0) {
      List<clj> $$1 = this.delegate();

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         $$1.set($$2, clj.a($$0.a($$2)));
      }
   }

   public boolean isEmpty() {
      for (clj $$0 : this.delegate()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }
}
