import com.google.common.collect.Sets;
import java.util.Set;

public class frw implements frj.a {
   private static final int a = 60;
   private final Set<hw> b = Sets.newHashSet();

   frw() {
   }

   @Override
   public void a() {
      this.b.clear();
   }

   public void a(hw $$0) {
      this.b.add($$0);
   }

   public void b(hw $$0) {
      this.b.remove($$0);
   }

   @Override
   public void a(elj $$0, foa $$1, double $$2, double $$3, double $$4) {
      gw $$5 = gw.a($$2, $$3, $$4);
      this.b.forEach($$3x -> {
         if ($$5.a($$3x.q(), 60.0)) {
            a($$0, $$1, $$3x);
         }
      });
   }

   private static void a(elj $$0, foa $$1, hw $$2) {
      int $$3 = 1;
      gw $$4 = $$2.q();
      gw $$5 = $$4.b(-1, -1, -1);
      gw $$6 = $$4.b(1, 1, 1);
      frj.a($$0, $$1, $$5, $$6, 0.2F, 1.0F, 0.2F, 0.15F);
   }
}
