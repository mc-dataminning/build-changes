import com.google.common.collect.ForwardingList;
import java.util.List;

public class foe extends ForwardingList<ckj> {
   private final il<ckj> a = il.a(ccw.g(), ckj.b);

   protected List<ckj> delegate() {
      return this.a;
   }

   public rz a() {
      rz $$0 = new rz();

      for (ckj $$1 : this.delegate()) {
         $$0.add($$1.b(new rt()));
      }

      return $$0;
   }

   public void a(rz $$0) {
      List<ckj> $$1 = this.delegate();

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         $$1.set($$2, ckj.a($$0.a($$2)));
      }
   }

   public boolean isEmpty() {
      for (ckj $$0 : this.delegate()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }
}
