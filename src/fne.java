import com.google.common.collect.ForwardingList;
import java.util.List;

public class fne extends ForwardingList<cjl> {
   private final hn<cjl> a = hn.a(cbz.g(), cjl.b);

   protected List<cjl> delegate() {
      return this.a;
   }

   public rc a() {
      rc $$0 = new rc();

      for (cjl $$1 : this.delegate()) {
         $$0.add($$1.b(new qw()));
      }

      return $$0;
   }

   public void a(rc $$0) {
      List<cjl> $$1 = this.delegate();

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         $$1.set($$2, cjl.a($$0.a($$2)));
      }
   }

   public boolean isEmpty() {
      for (cjl $$0 : this.delegate()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }
}
